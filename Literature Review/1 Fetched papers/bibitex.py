'''
Get the list of Citation IDs of final list of papers.
'''

from pybtex.database.input import bibtex

#open a bibtex file
parser = bibtex.Parser()
bibdata = parser.parse_file("2 Final List of Publications.bib")

#loop through the individual references
for bib_id in bibdata.entries:
    print(bib_id)
    