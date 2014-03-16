#!/usr/bin/env python

"""
1. We shall contemplate truth by testing reality, via equality

>>> ___ == True
True

2. We can determine difference as well as equality

>>> ___ != True and type(___) is bool
True

3. We can test the equality of nothing

>>> ___ == None
True

4. To understand reality, we must compare our expectations against reality

>>> ___ == (1 + 1)
True

5. You can test equality of many things

>>> (3 + 4) == ___ == (2 + 5)
True

6. Similar things can be very different

>>> 'True' != ___
True

7. Different things can be very similar

>>> 0 == False and 1 == ___
True

8. We can think of lists of things as equal when their contents are equal

>>> [1, 2, 3] == range(1, 4)
___

"""


if __name__ == '__main__':
    import doctest
    class ___(object): pass
    doctest.testmod(optionflags=doctest.REPORT_ONLY_FIRST_FAILURE)
