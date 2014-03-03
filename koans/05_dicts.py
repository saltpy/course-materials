#!/usr/bin/env python

"""
1. We can see how many entries our dictionary has

>>> the_dict = {'key': 'value'}
>>> print len(the_dict)
___

2. We can add to our dictionary

>>> the_dict['two'] = ___
>>> print the_dict['two']
2

3. We can access dictionary keys to get the value associated

>>> print the_dict[___]
value

4. We can see if our dictionary has a key

>>> 'not_there' in the_dict
___

5. We can add a dictionary into another dictionary

>>> the_dict.update({___: ___})
>>> print the_dict
{'other_key': 'other_value', 'two': 2, 'key': 'value'}

6. We can list the keys and values

>>> print the_dict.keys(), the_dict.values()
___ ___

7. We can list the pairs

>>> print ___.items()
[('other_key', 'other_value'), ('two', 2), ('key', 'value')]

8. We can comprehend dictionarys much like we did lists 

>>> print dict((item, len(item)) for item in ['one', 'two', 'three', 'four', 'five'])
___

"""

the_map = {}


if __name__ == '__main__':
    import doctest
    class ___(object): pass
    doctest.testmod(optionflags=doctest.REPORT_ONLY_FIRST_FAILURE)
