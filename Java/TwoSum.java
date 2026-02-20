package Demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;

import Sample.Employee;

class ListNode {
	int val;
	ListNode next;

	ListNode(int val) {
		this.val = val;
	}
}

public class TwoSum {

	public static void main(String[] args) {
		int[] number = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		String[] words = { "apple", "banana", "orange", "kiwi", "grape" };

		List<Employee> employees = Arrays.asList(new Employee(101, "Alice", "HR", 50000, 30),
				new Employee(102, "Bob", "IT", 60000, 25), new Employee(103, "Charlie", "Finance", 55000, 35),
				new Employee(104, "David", "IT", 65000, 28), new Employee(105, "Eve", "HR", 52000, 32));

		OptionalDouble ll = employees.stream().mapToDouble(Employee::getSalary).average();

		employees.stream().sorted((a, b) -> Double.compare(b.getSalary(), a.getSalary())).collect(Collectors.toList());

		employees.stream().filter(f -> f.getSalary() > 50000).findFirst();

		int dd = Arrays.stream(number).boxed().min(Integer::compareTo).get();
		String jl = Arrays.asList(words).stream().max(Comparator.comparingInt(String::length)).get();
		Arrays.stream(number).boxed().sorted(Collections.reverseOrder()).collect(Collectors.toList());

		employees.stream().collect(
				Collectors.groupingBy(f -> f.getDepartment(), Collectors.averagingDouble(Employee::getSalary)));

		Arrays.asList(words).stream().map(String::length).collect(Collectors.toList());

		Arrays.asList(words).stream().filter(f -> f.matches("^[aeiou].*")).count();

		employees.stream().max(Comparator.comparingDouble(Employee::getSalary)).get();

		employees.stream().collect(Collectors.toMap(Employee::getId, Employee::getName));
		employees.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		employees.stream().max(Comparator.comparingDouble(Employee::getSalary));
		employees.stream().sorted((a, b) -> Double.compare(b.getSalary(), a.getSalary())).findFirst();
		String name = "yesuraja";
		name.chars().mapToObj(f -> (char) f).collect(Collectors.groupingBy(f -> f, Collectors.counting()));

		Arrays.stream(number).boxed().sorted(Collections.reverseOrder()).skip(1).findFirst();

		int second = 0;
		int max = 0;

		for (int n : number) {

			if (n > max) {
				second = max;
				max = n;
			} else if (n > second && n != max) {
				second = n;
			}
		}
		Set<Character> k = name.chars().mapToObj(f -> (char) f)
				.collect(Collectors.groupingBy(f -> f, Collectors.counting())).entrySet().stream()
				.filter(f -> f.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toSet());

		Set<Character> set = new HashSet<>();
//		 
//		 for(char c:name.toCharArray()) {
//			 
//			 if(set.contains(c)) {
//				 System.out.println(c);
//				
//			 }
//			 set.add(c);
//		 }
		for (int i = 5; i >=0; i--) {

			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		List<String> list = Arrays.asList("abc", "1234", "dkbl", "998");

		list.stream().filter(f -> f.matches("^[0-9].*")).collect(Collectors.toList());

		String s = "aabbcc";

		StringBuilder sb = new StringBuilder();
		int count = 1;
		for (int i = 0; i < s.length(); i++) {

			if (s.length() > i + 1 && s.charAt(i) == s.charAt(i + 1)) {
				count++;
			} else {
				sb.append(count).append(s.charAt(i));
				count = 1;
			}
		}

	}

	public static boolean isPrime(int n) {

		if (n <= 1) {
			return false;
		}

		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void twoSum(int[] arr, int target) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {

			if (map.containsKey(target - arr[i])) {

				System.out.println(i + " " + map.get(target - arr[i]));
			} else {
				map.put(arr[i], i);
			}
		}
	}

	public void longestSubstring(String s) {

		// s = "abcabcbb"

		int left = 0;
		int maxLen = 0;
		Set<Character> set = new HashSet<>();
		for (int right = 0; right < s.length(); right++) {

			while (!set.contains(s.charAt(right))) {

				set.remove(s.charAt(left));
				left++;

			}

			set.add(s.charAt(right));
			maxLen = Math.max(maxLen, right - left - 1);

		}
	}

	public void roateArray(int[] arr, int k) {

		int n = arr.length;

		k = k % n;

		rotate(arr, 0, n - 1);

		rotate(arr, 0, k - 1);
		rotate(arr, k, n - 1);

	}

	public void rotate(int[] arr, int right, int left) {

		while (left < right) {

			int temp = arr[right];

			arr[right] = arr[left];
			arr[left] = temp;
			right--;
			left++;
		}

	}

	public void mergeInterval(int[][] intervals) {

		Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

		int[] current = intervals[0];

		List<int[]> result = new ArrayList<>();

		for (int i = 1; i < intervals.length; i++) {

			if (intervals[i][1] <= current[1]) {

				current[1] = Math.max(current[1], intervals[i][1]);
			} else {
				current = intervals[i];
				result.add(current);
			}

		}
	}

	public static void merge(int[] arr1, int[] arr2) {

		int n1 = arr1.length;
		int n2 = arr2.length;

		int i = 0, k = 0, j = 0;
		int[] merged = new int[n1 + n2];
		while (i < n1 && j < n2) {

			if (arr1[i] <= arr2[j]) {
				merged[k++] = arr1[i++];
			} else {
				merged[k++] = arr2[j++];
			}

		}

		while (i < n1) {
			merged[k++] = arr1[i++];
		}

		while (j < n2) {
			merged[k++] = arr2[j++];
		}

	}

	public static void maxSubArray(int[] nums) {

		int currentSum = nums[0];

		int maxSum = nums[0];

		for (int i = 0; i < nums.length; i++) {

			currentSum = Math.max(nums[i], currentSum + nums[i]);
			maxSum = Math.max(currentSum, maxSum);
		}
	}

	public static void reverseList(ListNode head) {

		ListNode prev = null;

		ListNode curr = head;

		while (curr != null) {

			ListNode nextNode = curr.next;
			curr.next = prev;
			prev = curr;

			curr = nextNode;
		}

	}

	public static boolean detectCycle(ListNode head) {

		if (head == null) {
			return false;
		}

		ListNode slow = head;
		ListNode fast = head;

		while (fast != null && fast.next != null) {

			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {

				/*
				 * ListNode start=head;
				 * 
				 * while(start !=slow){
				 * 
				 * start=start.next; slow=slow.next; }
				 * 
				 */
				return true;
			}
		}

		return false;

	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		ListNode dummy = new ListNode(0);

		ListNode tail = dummy;

		while (l1.next != null && l2.next != null) {

			if (l1.val < l2.val) {
				tail.next = l1;
				l1 = l1.next;
			} else {
				tail.next = l2;
				l2 = l2.next;
			}

			tail = tail.next;

		}

		if (l1 != null) {
			tail.next = l1;
		}

		return tail;

	}

	public static int[] nextGreaterElement(int[] nums) {

		Stack<Integer> stack = new Stack();

		int n = nums.length;

		int[] result = new int[n];

		for (int i = 0; i < nums.length; i++) {

			while (!stack.isEmpty() && nums[i] > nums[stack.peek()]) {

				int index = stack.pop();

				result[index] = nums[i];
			}
			stack.add(i);
		}

		while (!stack.isEmpty()) {

			result[stack.pop()] = -1;
		}

		return result;

	}

	public static List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		backtrack(nums, 0, new ArrayList<>(), result);
		return result;
	}

	private static void backtrack(int[] nums, int index, ArrayList path, List<List<Integer>> result) {

		result.add(path);

		for (int i = index; i < nums.length; i++) {

			path.add(nums[i]);

			backtrack(nums, index + 1, path, result);
			path.remove(path.size() - 1);
		}

	}

	public List<List<Integer>> permutation(int[] num) {

		List<List<Integer>> result = new ArrayList();

		backtrackPer(num, new ArrayList<>(), result, new boolean[num.length]);
		return result;
	}

	private void backtrackPer(int[] num, ArrayList path, List<List<Integer>> result, boolean[] bs) {

		if (num.length == path.size()) {
			result.add(new ArrayList<>(path));
			return;
		}

		for (int i = 0; i < num.length; i++) {

			if (bs[i])
				continue;

			bs[i] = true;

			path.add(num[i]);

			backtrackPer(num, path, result, bs);
			path.remove(path.size() - 1);
			bs[i] = false;
		}

	}

	public static int firstOccurrence(int[] arr, int target) {

		// = {1, 2, 2, 2, 3, 4, 5};

		int left = 0;
		int right = arr.length;
		int result = 0;

		while (left < right) {

			int mid = left - (right - left) / 2;

			if (arr[mid] == target) {
				result = mid;
				left = mid + 1;

			} else if (arr[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return result;
	}

	public static int search(int[] arr, int target) {

		int left = 0;
		int right = arr.length;

		while (left < right) {

			int mid = left + (right - left) / 2;

			if (arr[mid] == target) {
				return mid;
			}

			// 67812345 --3

			if (arr[left] <= arr[mid]) {

				if (target >= arr[left] && target < arr[mid]) {
					right = mid - 1;
				} else {
					left = mid + 1;
				}

			} else {

				if (arr[mid] < target && arr[right] > target) {
					left = mid + 1;
				} else {
					right = mid - 1;
				}

			}
		}
		return -1;

	}

	public int infiniteArray(int[] arr, int target) {

		int start = 0;
		int end = 0;

		while (arr.length > end && target > arr[end]) {
			int temp = end + 1;

			end = end + (end - start + 1) * 2;
			start = temp;
			if (end >= arr.length) {
				end = arr.length - 1;
			}
		}

		return binaryInfinite(arr, start, end, target);
	}

	private int binaryInfinite(int[] arr, int start, int end, int target) {

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}

		}
		return -1;
	}

}
