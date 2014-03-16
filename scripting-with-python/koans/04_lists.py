#!/usr/bin/env python

"""
1. We can assign a new list

>>> the_list ___ [1,2,3,4]
>>> print the_list
[1, 2, 3, 4]

2. We can add to a list 

>>> the_list.append(___)
>>> print the_list
[1, 2, 3, 4, 5]

3. We make a new list from the items in a list that have been altered

>>> print map(lambda n : ___, the_list)
[1, 4, 9, 16, 25]

4. We can make a value from the items in a list

>>> print reduce(lambda n, m: n * m, the_list)
___

5. We can comprehend lists as well as map and reduce them

>>> print [n for n in the_list if n % ___ == 0]
[2, 4]

6. We can make a list from just some of a list based on some criteria

>>> print filter(lambda n : ___, the_list)
[1, 2]

7. We can get the highest and lowest values in a list

>>> print min(the_list), max(the_list)
___

8. We can resort a list

>>> print sorted(["one", "two", "three", "four", "five"], key=lambda s : len(s))
___

"""


if __name__ == '__main__':
    import doctest
    class ___(object): pass
    doctest.testmod(optionflags=doctest.REPORT_ONLY_FIRST_FAILURE)
