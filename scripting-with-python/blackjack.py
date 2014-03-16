import sys
import random


def hand_value(hand):
    """Returns the value of a hand

    ['AH'] => 11
    ['KH', 'QH', 'JH', 'TH'] => 40
    ['2H'] => 2
    ['9H'] => 9
    ['AH', 'AS', 'AC', 'AD'] => 14
    """
    raise NotImplementedError


def add_n_cards(hand, deck, n):
    """Adds n cards from the deck to the hand and returns (hand, deck)
    """
    raise NotImplementedError


def players_action(name, deck):
    """Returns (hand, deck) with hand being the players final hand
    """
    raise NotImplementedError


def house_action(deck):
    """Returns (hand, deck)

    House should twist until their hand value is more than 17 or they are bust
    """
    raise NotImplementedError


def show_hand(hand):
    """Return a string representation of the hand
    """
    raise NotImplementedError


def check_bust(hand):
    """Return True if the hand value is greater than 21 else return False
    """
    raise NotImplementedError


def winning_players(players, house):
    """Return a list of players and thier hands beating the house
    
    The house should win all ties
    The house should win if everyone is bust, even if the house is bust
    """
    raise NotImplementedError

# The following code must not be altered in any way.
def get_deck():
    """Returns a new deck of 52 unique cards

    Deck: an iterator over a list of strings which represent cards
        eg 'AS' => Ace of Spades
    """
    deck = [rank + suit for rank in '23456789TJQKA' for suit in 'SHDC']
    random.shuffle(deck)

    return iter(deck) 


def deal(deck):
    """Returns (hand, deck)

    Hand: new list containing top two cards from deck
    """
    return add_n_cards([], deck, 2)


def twist(hand, deck):
    """Returns (hand, deck)

    Hand: list consisting of the hand list plus the top card from the deck
    """
    return add_n_cards(hand, deck, 1) 


def main(player_names):                                                         
    deck = get_deck()                                                           
    results = []                          
    for name in player_names:                                                   
        hand, deck = players_action(name, deck)                                 
        results.append((name, hand))
    house, deck = house_action(deck)                                            
    wp = winning_players(results, house)
    print "House scored: %s" % show_hand(house)
    if len(wp) == 0:
        print "House wins!"
    else:                                                                       
        for name, hand in wp:
            print name, "wins with", show_hand(hand)


if __name__ == '__main__':
    names = sys.argv[1:]
    if len(names) < 1:
        print """Usage: blackjack.py <name-of-player-one> [<name-of-player-n>]
        sys.exit(1)
    main(names)
