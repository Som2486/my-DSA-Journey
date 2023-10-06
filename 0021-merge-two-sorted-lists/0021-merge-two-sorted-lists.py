# Runtime: 44 ms, faster than 59.02% of Python3 online submissions for Merge Two Sorted Lists.
# Memory Usage: 14 MB, less than 81.73% of Python3 online submissions for Merge Two Sorted Lists.
class Solution:
    def mergeTwoLists(self, list1, list2):
        if list1 != None and list2 == None:
            return list1
        elif list1 == None and list2 != None:
            return list2
        elif list1 == None and list2 == None:
            return None
        elif list1.val <= list2.val:
            return ListNode(list1.val, self.mergeTwoLists(list1.next, list2))
        else:
            return ListNode(list2.val, self.mergeTwoLists(list1, list2.next))