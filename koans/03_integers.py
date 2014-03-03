#!/usr/bin/env python

"""
1. A number can be simple

>>> ___ + 2
3

2. A number can float

>>> 1 + ___
3.5

3. A number can be operated on

>>> ((1 ___ 2) ___ (5 ___ 3)) ___ 1
6

4. Sometimes you won't get the result you expect

>>> 2 / 3
___

5. But you can fix that

>>> ___ / 3
0.6666666666666666

6. We can't put a number in a string but we can make a number a string

>>> print "Apples: " + str(___) 
Apples: 2

7. We can get the number from a string as well

>>> print ___("4") * 2
8

8. We can get the remainder as well

>>> print 7 % 3
___

"""


if __name__ == '__main__':
    import doctest
    class ___(object): pass
    doctest.testmod(optionflags=doctest.REPORT_ONLY_FIRST_FAILURE)
