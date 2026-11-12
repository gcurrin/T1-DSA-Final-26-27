import path_through_city as p
def test_fastest_time():
    city = [
        [1, 2, 3],
        [4, 1, 2],
        [1, 1, 3]
    ]

    assert p.PathThroughCity().fastest_time(city) == 7

    city2 = [
        [1, 2, 3, 1],
        [4, 1, 2, 4],
        [1, 1, 3, 5]
    ]

    assert p.PathThroughCity().fastest_time(city2) == 12

    city3 = [
        [1, 2, 3, 1, 1],
        [4, 1, 2, 4, 3],
        [1, 1, 3, 5, 2],
        [1, 1, 3, 1, 2]
    ]

    assert p.PathThroughCity().fastest_time(city3) == 11