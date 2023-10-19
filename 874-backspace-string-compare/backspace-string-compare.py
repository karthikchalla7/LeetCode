class Solution:
    def backspaceCompare(self, s: str, t: str) -> bool:
        def popele(dup):
            stack = []
            for c in dup:
                if c=="#":
                    if len(stack)>0:
                        stack.pop()
                else:
                    stack.append(c)
            return stack
        return popele(s)==popele(t)