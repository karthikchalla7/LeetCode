class Solution:
    MOD = 10**9+7
    @cache
    def dfs(self, position, steps_left, arrLen):
      
        if position < 0 or position >= arrLen or position > steps_left:
            return 0
        if steps_left == 0:
            return 1 if position == 0 else 0

     
        left = self.dfs(position-1, steps_left-1, arrLen)
        right = self.dfs(position+1, steps_left-1, arrLen)
        stay = self.dfs(position, steps_left-1, arrLen)
        
        return (left + right + stay) % self.MOD

    def numWays(self, steps: int, arrLen: int) -> int:
        self.dfs.cache_clear()
        return self.dfs(0, steps, arrLen)
