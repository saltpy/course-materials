#!/usr/bin/env python

"""
1. print will show a string

>>> ___ "a string"
a string

2. A string is a sequence of quoted words

>>> print "Hello", 'hello', '''HELLO'''
___

3. One string can contain another

>>> print "Hello ___James___"
Hello 'James'

4. We can use just part of a string

>>> print ___[1:6]
12345

5. We can make a collection of words from a string

>>> print ___.split()
['Bacon', 'Sausage', 'Egg']

6. We don't have to split on space

>>> print "Bacon, Sausage & Egg, Egg, Sausage".split(___)
['Bacon', 'Sausage & Egg', 'Egg', 'Sausage']

7. We can join collections into a string

>>> print  ___.join(['Now', 'is', 'the', 'time'])
Now is the time

8. We can recase our strings easily

>>> print 'guido'.capitalize(), 'guido'.upper(), 'guido'.lower(), 'guido van rossum'.title(), 'gUIDO VAN rOSSUM'.swapcase()
___

"""


if __name__ == '__main__':
    import doctest
    class ___(object): pass
    doctest.testmod(optionflags=doctest.REPORT_ONLY_FIRST_FAILURE)
