
file_best_policy = "C:/Users/grist/OneDrive/21.- PhD 2020/2021 Second Year Report/Python code/Read prism output/best-policy.txt"
file_states = "C:/Users/grist/OneDrive/21.- PhD 2020/2021 Second Year Report/Python code/Read prism output/states.txt"
file_out_info  = "C:/Users/grist/OneDrive/21.- PhD 2020/2021 Second Year Report/Python code/Read prism output/RelationsPrismPaths"

def prism_best_policy(file_best_policy,file_states,file_out_info):
	dic_i_lines, i_lines = read_best_policy_file(file_best_policy)
	read_states_file(file_states,i_lines)


def read_states_file(file,i_lines):
	f = open(file,"r")
	lines = f.readlines()
	f.close()
	print(lines[0])
	for i in i_lines:
		print(lines[int(i)+1])
	
	



def read_best_policy_file(file):
	f = open(file,"r")
	lines = f.readlines()
	f.close()

	dic = {} # dictionary with all i_lines in the best policy file

	for i in range (1,len(lines)): # lines[0] constains number of states, so start in 1

		i_line = lines[i].split(' ')

		init_state = str(i_line[0])
		info_state =  [i_line[1] , i_line[2], i_line[3].replace('\n','') ]

		dic[init_state] = info_state
		#print(dic["0"])
		

	#print("dic 0",dic.get("0"))
	
	
	list_i_lines = []
	state = 0 #start in state 0
	count = 0 # just to ensure it does not go forever
	check= True
	list_i_lines.append(state)
	f= open("_description-actions.txt","w+")
	while check==True or count>len(dic.keys()): #count added for security

		try:
			final = dic[str(state)][0]
			print("From state ",state," go to ",final, " do ",dic[str(state)][2])

			# add to file
			f.write(dic[str(state)][2] +"\n")

			state = final
			list_i_lines.append(state)


		except Exception as e:
			check = False
			#raise
		finally:
			count+=1
	f.close()
	
	f= open("_description-path.txt","w+")
	for i in list_i_lines:
		print(i, " dic",dic.get(str(i)))

		f.write(str(i) + " "+str(dic.get(str(i))) +"\n")

	return(dic, list_i_lines)


prism_best_policy(file_best_policy,file_states,file_out_info)

