
class PathThroughCity:
    def fastest_time(self, city):
        rows = len(city)
        cols = len(city[0])

        dp = [[0] * cols for _ in range(rows)]

        for i in range(rows):
            for j in range(cols):
                if i == 0 and j == 0:
                    dp[i][j] = 0
                elif i == 0:
                    dp[i][j] = dp[i][j - 1] + city[i][j]
                elif j == 0:
                    dp[i][j] = dp[i - 1][j] + city[i][j]
                else:
                    dp[i][j] = min(dp[i - 1][j], dp[i][j - 1]) + city[i][j]

        return dp[rows - 1][cols - 1]


if __name__ == "__main__":
    city = [
        [1, 2, 3],
        [4, 8, 2],
        [1, 5, 3]
    ]

    solution = PathThroughCity()
    print(solution.fastest_time(city))