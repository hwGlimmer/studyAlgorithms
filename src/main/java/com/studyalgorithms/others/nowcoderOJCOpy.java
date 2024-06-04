package com.studyalgorithms.others;

import cn.hutool.core.lang.hash.Hash;

import java.util.*;


/**
 * @Author: weihu01
 * @Desctription: 牛客网OJ
 * @Date: Created in 2024/6/1 18:26
 * @Version: 1.0
 */
public class nowcoderOJCOpy {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1.
//        countValidParentheses(scanner.nextLine());

//
//        int len = scanner.nextInt();
//        Integer[] numberInput = new Integer[len];
//        for (int i=0; i<len; i++){
//            numberInput[i] = scanner.nextInt();
//        }
        // 2.
//        findOddTimes(numberInput);

//        // 3.
//        divideGold(numberInput);

        // 4.
//        sortData(numberInput);

        // 5.
//        int n = scanner.nextInt();
//        int root1 = scanner.nextInt();
//
//        Map<Integer, TreeNode> map1 = getIntegerTreeNodeMap(n, scanner);
//        TreeNode t1 = map1.get(root1);
//
//        int m = scanner.nextInt();
//        int root2 = scanner.nextInt();
//        Map<Integer, TreeNode> map2 = getIntegerTreeNodeMap(m, scanner);
//        TreeNode t2 = map2.get(root2);
//        System.out.println(isSubtree(t1, t2));

        // 6.
//        int len = scanner.nextInt();
//        int k = scanner.nextInt();
//        Integer[] numberInput = new Integer[len];
//        for (int i=0; i<len; i++){
//            numberInput[i] = scanner.nextInt();
//        }
//        findElementsTimes(numberInput,k);

        // 7.
//        maxScoreCardGame(numberInput);

        // 8.
//        foldPaper(scanner.nextInt());

        // 9.
//        int n = scanner.nextInt();
//        int target = scanner.nextInt();
//        int[] numberInput = new int[n];
//        for (int i = 0; i < n; i++) {
//            numberInput[i] = scanner.nextInt();
//        }
//        binarySearch(target, numberInput);

        // 10.
        judgeParenthesValid(scanner.nextLine());

        // 11.
//        getLCM(scanner.nextInt(), scanner.nextInt());


//        String[] strArray = scanner.nextLine().split(" ");
//        int[] datas = new int[strArray.length];
//        for (int i = 0; i < strArray.length; i++) {
//            datas[i] = Integer.parseInt(strArray[i]);
//        }

        // 12.
//        findErrorNodeElement(datas);

        // 13.
//        findElementsTimesTwice(datas);

        // 14.
//        printRecipient(scanner);

        // 15.
//          shorestPalindrome(scanner.nextLine());

        // 16.
//           linkNoedPartion(scanner);

        // 17.
//        findFirstStr(scanner.nextLine());

        // 18.
//          findCountCharByParam(scanner);

        // 19.
//        findSumIsTarget(scanner);

        // 20.
//           sortCharacter(scanner);

        // 21.

        // 23.
//        findUpperCharacter(scanner.nextLine());

        // 24.
//        while (scanner.hasNext()){
//            if (invalidPassword(scanner.nextLine())){
//                System.out.println("OK");
//            }else {
//                System.out.println("NG");
//            }
//        }

        // 28.
//          rabbitCount(scanner);

        // 29.
//           getDistanceAndHight(scanner);

    }

    /**
     * 1. 标题：括号字符串的最长有效长度 | 时间限制：2秒 | 内存限制：262144K
     * 给定一个括号字符串str，返回最长的能够完全正确匹配括号字符字串的长度。
     * 输入描述:
     * 输出一行字符串，代表str 。
     * 输出描述:
     * 输出一个整数，代表括号字符串的最长有效长度。
     * 备注:
     * 时间复杂度 ，额外空间复杂度 。
     * 示例1  输入 (()()) 输出 6
     */
    public static Integer countValidParentheses(String str) {

       if (str.isEmpty()){
           return 0;
       }

        Stack<Character> stack = new Stack<>();
       int count = 0;

       for (Character c: str.toCharArray()){
           if (c == '('){
               stack.push(c);
           }

           if (c == ')'){
               if (!stack.isEmpty() && stack.pop() =='('){
                   count += 2;
               }
           }
       }

        System.out.println("完全正确匹配括号字符字串的长度: " + count);

        return count;
    }


    /**
     * 2.在其它数出现次数都为偶数的数组中找到出现次数为奇数次的数 | 时间限制：2秒 | 内存限制：262144K
     * 一个数组arr，其中只有一个数出现了奇数次，其它数出现了偶数次，打印这个数
     *
     * @param arr
     * @return
     */
    public static Integer findOddTimes(Integer[] arr) {

        Integer count = 0;

        for (Integer i: arr){
            count ^= i;
        }
        System.out.println("出现次数为奇数的数字为: " + count);

        return count;
    }


    /**
     * 3.分金条的最小花费 | 时间限制：2秒 | 内存限制：262144K
     * 给定一个正数数组arr，arr的累加和代表金条的总长度，arr的每个数代表金条要分成的长度。规定长度为k的金条分成两块，费用为k个铜板。
     * 返回把金条分出arr中的每个数字需要的最小代价。
     *
     * @param arr
     * @return
     */
    public static Integer divideGold(Integer[] arr) {

        Integer usedMoney = 0;

        PriorityQueue<Integer> miniumHeap = new PriorityQueue<>();

        for (Integer i: arr){
            miniumHeap.add(i);
        }
        while (miniumHeap.size() > 1){
           usedMoney += miniumHeap.poll() +  miniumHeap.poll();
           miniumHeap.add(usedMoney);
        }

        System.out.println("分金条最小代价:" + usedMoney);

        return usedMoney;
    }

    /**
     * 4. 数组的partition调整补充问题 | 时间限制：2秒 | 内存限制：262144K
     * 给定一个数组arr，其中只可能含有0、1、2三个值，请实现arr的排序
     *
     * @param arr
     * @return
     */
    public static Integer[] sortData(Integer[] arr) {

        int pl =0, index =0, pr=arr.length-1;

       while (index < pr){
            if (arr[index] == 0){
                swapData(arr, index++, pl);
            }
            if (arr[index] == 2){
                swapData(arr, index, pr--);
            }
            index ++;
        }

        for (Integer i: arr){
            System.out.print(i+"\t");
        }
        return arr;
    }

    /**
     * 4.1 交换数字
     *
     * @param arr
     * @param i
     * @param j
     */
    private static void swapData(Integer[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * 5.1 填充树结构
     * 第一行输入两个整数 n 和 root，n 表示二叉树 t1 的总节点个数，root 表示二叉树 t1 的根节点。
     * 以下 n 行每行三个整数 fa，lch，rch，表示 fa 的左儿子为 lch，右儿子为 rch。(如果 lch 为 0 则表示 fa 没有左儿子，rch同理)
     * 第 n+2 行输入两个整数 m 和 root，n 表示二叉树 t2 的总节点个数，root 表示二叉树 t2 的根节点。
     * 以下 m 行每行三个整数 fa，lch，rch，表示 fa 的左儿子为 lch，右儿子为 rch。(如果 lch 为 0 则表示 fa 没有左儿子，rch同理)
     *
     * @param n
     * @param scanner
     * @return
     */
    private static Map<Integer, TreeNode> getIntegerTreeNodeMap(int n, Scanner scanner) {

        Map<Integer, TreeNode> treeNodeMap = new HashMap<>();
        treeNodeMap.put(0,null);

        for (int i=0; i<n; i++){

            int fa = scanner.nextInt();
            int pl = scanner.nextInt();
            int pr = scanner.nextInt();

            if (!treeNodeMap.containsKey(fa)){
                treeNodeMap.put(fa, new TreeNode(fa));
            }
            if (!treeNodeMap.containsKey(pl)){
                treeNodeMap.put(pl, new TreeNode(pl));
            }
            if (!treeNodeMap.containsKey(pr)){
                treeNodeMap.put(pr, new TreeNode(pr));
            }

            TreeNode node = treeNodeMap.get(fa);
            if (pl != 0){
                node.left = treeNodeMap.get(pl);
            }
            if (pr != 0){
                node.right = treeNodeMap.get(pl);
            }


        }

        return treeNodeMap;
    }

    /**
     * 5.2 判断t1树中是否有与t2树拓扑结构完全相同的子树 | 时间限制：3秒 | 内存限制：262144K
     * 给定彼此独立的两棵二叉树，判断 t1 树是否有与 t2 树拓扑结构完全相同的子树。
     * 设 t1 树的边集为 E1，t2 树的边集为 E2，若 E2 等于 E1 ，则表示 t1 树和t2 树的拓扑结构完全相同。
     *
     * @param t1
     * @param t2
     * @return
     */
    private static boolean isSubtree(TreeNode t1, TreeNode t2) {

            if (t1 == null ){
                return false;
            }
            if (t2 == null ){
                return true;
            }

          return   isSameTree(t1,t2)  && isSameTree(t1.left, t2) && isSameTree(t1.right, t2);

    }

    /**
     * 5.3 判断树是否相等
     *
     * @param t1
     * @param t2
     * @return
     */
    private static boolean isSameTree(TreeNode t1, TreeNode t2) {

        if (t1 == null && t2 == null){
            return true;
        }

        if (t1 == null || t2 == null){
            return false;
        }

        return  (t1.val == t2.val) && isSubtree(t1.left, t2.left) && isSubtree(t1.right, t2.right);
    }

    /**
     * 6. 在数组中找到出现次数大于n/k的数 | 时间限制：2秒 | 内存限制：262144K
     * 给定一个整型数组arr，再给定一个整数k，打印所有出现次数大于n/k的数，如果没有这样的数,请打印”-1“。
     *
     * @param arr
     * @return
     */
    public static void findElementsTimes(Integer[] arr, Integer k) {

        boolean flag = false;

        Map<Integer, Integer> flagMap = new HashMap<>();

        for (Integer i : arr) {
            flagMap.put(i, flagMap.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> e : flagMap.entrySet()) {
            if (e.getValue() > arr.length / k) {
                System.out.print(e.getKey() + " ");
                flag = true;
            }
        }

        if (!flag) {
            System.out.println("-1");
        }

    }

    /**
     * 7.排成一条线的纸牌博弈问题 | 时间限制：2秒 | 内存限制：262144K
     * 给定一个整型数组arr，代表数值不同的纸牌排成一条线，玩家A和玩家B依次拿走每张纸牌，规定玩家A先拿，玩家B后拿，
     * 但是每个玩家每次只能拿走最左和最右的纸牌，玩家A和玩家B绝顶聪明。请返回最后的获胜者的分数
     * <p>
     * 生成两个大小为NxN的矩阵f和s，f[i][j]表示函数f(i,j)的返回值，s[i][j]表示函数s(i,j)的返回值。规定
     * 一下两个矩阵的计算方向即可
     *
     * @param arr
     */
    private static Integer maxScoreCardGame(Integer[] arr) {

        Integer result = 0;

        int[][] f = new int[arr.length][arr.length];
        int[][] s = new int[arr.length][arr.length];

        for (int j=0; j<arr.length; j++){
            f[j][j] = arr[j];

            for (int i=j-1; i>=0; i--){
                f[i][j] = Math.max(arr[i] + s[i+1][j], arr[j] + s[i][j-1]);
                s[i][j] = Math.min( f[i+1][j], f[i][j-1]);
            }
        }
        result = Math.max(f[0][arr.length], s[0][arr.length]);

        System.out.println(result);

        return result;
    }


    /**
     * 8.折纸问题 | 时间限制：2秒 | 内存限制：262144K
     * 请把一张纸条竖着放在桌子上，然后从纸条的下边向上方对折1次，压出折痕后展开。此时折痕是凹下去的，即折痕突起的方向指向纸条的背面。
     * 如果从纸条的下边向上方连续对折2次，压出折痕后展开，此时有三条折痕，
     * 从上到下依次是下折痕、下折痕和上折痕。给定一个输入参数N，代表纸条都从下边向上方连续对折N次，请从上到下打印所有折痕的方向。
     * <p>
     * 二叉树 中序遍历
     *
     * @param
     */
    public static void foldPaper(int n) {
        foldPapers(n, 1, true);
    }

    /**
     * 8.1递归打印 折痕
     *
     * @param n
     * @param curr
     * @param isDown
     */
    private static void foldPapers(int n, int curr, boolean isDown) {

        if (curr > n){
            return;
        }

        foldPapers(n, curr + 1, true);
        System.out.println(isDown ? "DOWN" : "UP");
        foldPapers(n, curr + 1, false);

    }

    /**
     * 9. 二分查找 | 时间限制：1秒 | 内存限制：65536K
     * 请实现有重复数字的升序数组的二分查找。
     * 输出在数组中第一个大于等于查找值的位置，如果数组中不存在这样的数(指不存在大于等于查找值的数)，则输出数组长度加一
     * 示例1
     * 输入
     * 5,4,[1,2,4,4,5]
     * 输出 3
     * 说明 输出位置从1开始计算
     *
     * @param target
     * @param numberInput
     */
    private static void binarySearch(int target, int[] numberInput) {

        int left = 0, right = numberInput.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (target > numberInput[mid]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        int result = (left < numberInput.length && numberInput[left] == target) ? left + 1 : numberInput.length + 1;

        System.out.println(result);

    }


    /**
     * 10.括号字符串的有效性 | 时间限制：2秒 | 内存限制：262144K
     * 给定一个字符串str，判断是不是整体有效的括号字符串(整体有效：即存在一种括号匹配方案，
     * 使每个括号字符均能找到对应的反向括号，且字符串中不包含非括号字符)
     * 示例2
     * 输入
     * ()a()
     * 输出
     * NO
     * 说明: ()a()中包含了 ‘a’，a不是括号字符
     *
     * @param str
     */
    private static boolean judgeParenthesValid(String str) {

        boolean result = true;

        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty() || stack.pop() != c) {
                    result = false;
                }
            } else {
                result = false;
            }
        }

        System.out.println(result ? "YES" : "NO");

        return result;
    }


    /**
     * 11. 求最小公倍数 | 时间限制：1秒 | 内存限制：32768K
     * 正整数A和正整数B 的最小公倍数是指 能被A和B整除的最小的正整数值，设计一个算法，求输入A和B的最小公倍数。
     * 数据范围：1<=a, b<=100000
     * <p>
     * 最大公倍数 GCD * 最小公倍数 = A * B
     *
     * @param a
     * @param b
     */
    private static void getLCM(int a, int b) {

        int result = (a * b) / getGCD(a, b);

        System.out.println(result);

    }

    /**
     * 11.1 辗转相除法求最大公约数
     *
     * @param a
     * @param b
     */
    private static int getGCD(int a, int b) {

        return a % b == 0 ? b : getGCD(b, a % b);

    }


    // 12. 填充错误节点的值
    private static int[] res = new int[2];
    // 12. 当地前值
    private static Integer cur = Integer.MIN_VALUE;

    /**
     * 12. 找到搜索二叉树中两个错误的节点 | 时间限制：2秒 | 内存限制：262144K
     * 一棵二叉树原本是搜索二叉树，但是其中有两个节点调换了位置，使得这棵二叉树不再是搜索二叉树，请按升序输出这两个错误节点的值。(每个节点的值各不相同)
     * 搜索二叉树：满足每个节点的左子节点小于当前节点，右子节点大于当前节点。
     * 示例1
     * 输入
     * {1,2,3}
     * 输出
     * [1,2]
     *
     * @param datas
     */
    private static void findErrorNodeElement(int[] datas) {

        Arrays.stream(datas).forEach(i -> System.out.print(i + "\t"));
        System.out.println();
        // 1. 将数组还原为树结构
        TreeNode tree = buildTree(datas, 0);

        fillErrorInfo(tree);

        Arrays.stream(res).forEach(i -> System.out.print(i + "\t"));
        System.out.println();
        System.out.println();
    }

    /**
     * 12.1 数组转树结构
     *
     * @param datas
     * @param cur   当前节点在数组的下标
     */
    private static TreeNode buildTree(int[] datas, int cur) {

        if (cur >= datas.length || cur == -1) {
            return null;
        }

        TreeNode node = new TreeNode(datas[cur]);
        node.left = buildTree(datas, 2 * cur + 1);
        node.right = buildTree(datas, 2 * cur + 2);

        return node;
    }


    /**
     * 12.2 填充错误节点
     * 预期是  node.val > l  &&  node.val < r  才是搜索树
     *
     * @param tree
     * @return
     */
    private static void fillErrorInfo(TreeNode tree) {

        if (tree == null) {
            return;
        }

        fillErrorInfo(tree.left);

        if (tree.val < cur) {
            res[0] = tree.val;
            res[1] = cur;
        } else {
            cur = tree.val;
        }
        fillErrorInfo(tree.right);
    }

    /**
     * 13. n个数里出现次数大于等于n/2的数 | 时间限制：1秒 | 内存限制：32768K
     * 输入n个整数，输出出现次数大于等于数组长度一半的数
     * 示例1
     * 输入
     * 3 9 3 2 5 6 7 3 2 3 3 3
     * 输出
     * 3
     *
     * @param datas
     */
    private static void findElementsTimesTwice(int[] datas) {

        int t = datas.length / 2;

        Map<Integer, Integer> dataMap = new HashMap<>();

        for (int i : datas) {

            dataMap.put(i, dataMap.getOrDefault(i, 0) + 1);

        }

        for (Map.Entry<Integer, Integer> e : dataMap.entrySet()) {

            if (e.getValue() >= t) {
                System.out.print(e.getKey() + "\t");
            }

        }

    }

    /**
     * 14. 收件人列表 | 时间限制：1秒 | 内存限制：32768K
     * NowCoder每天要给许多客户写电子邮件。正如你所知，如果一封邮件中包含多个收件人，
     * 收件人姓名之间会用一个逗号和空格隔开；如果收件人姓名也包含空格或逗号，则姓名需要用双引号包含。
     * 现在给你一组收件人姓名，请你帮他生成相应的收件人列表。
     * 示例1
     * 输入
     * 3
     * Joe
     * Quan, William
     * Letendre,Bruce
     * 2
     * Leon
     * Kewell
     * 输出
     * Joe, "Quan, William", "Letendre,Bruce"
     * Leon, Kewell
     *
     * @param scanner
     */
    private static void printRecipient(Scanner scanner) {

        while (scanner.hasNextInt()) {

            int n = scanner.nextInt();
            scanner.nextLine();
            StringBuffer sb = new StringBuffer();

            while (n != 0) {

                String inputStr = scanner.nextLine();
                if (inputStr.contains(",") || inputStr.contains(" ")) {
                    sb.append("\"").append(inputStr).append("\"");
                } else {
                    sb.append(inputStr);
                }

                if (n != 1) {
                    sb.append(", ");
                }

                n--;

            }

            System.out.println(sb);

        }
    }


    /**
     * 15.小红的ABC | 时间限制：1秒 | 内存限制：262144K
     * 小红拿到了一个只包含 'a' , 'b' , 'c' 三种字符的字符串。
     * 小红想知道，这个字符串最短的、长度超过 1 的回文子串的长度是多少？
     * 子串定义：字符串取一段连续的区间。例如"abcca"的子串有"ab"、"bcca"等，但"aca"则不是它的子串。
     * 回文的定义：一个字符串正着读和倒着读都是相同的，那么定义它的回文的。
     * <p>
     * 最短的回文其实要么 2 aa , 要么3 aba 两种类型
     *
     * @param s
     */
    private static void shorestPalindrome(String s) {
        int n = s.length();
        int result = -1;

        if (s.charAt(0) == s.charAt(1)) {
            result = 2;
        }

        for (int i = 2; i < n; i++) {

            if (s.charAt(i) == s.charAt(i - 1)) {
                result = 2;
            }

            if (s.charAt(i) == s.charAt(i - 2)) {
                result = 3;
            }
        }

        System.out.println(result);

    }


    /**
     * 16.将单向链表按某值划分为左边小，中间相等，右边大的形式 | 时间限制：2秒 | 内存限制：262144K
     * 给定一个链表，再给定一个整数 pivot，请将链表调整为左部分都是值小于 pivot 的节点，中间部分都是值等于 pivot 的节点， 右边部分都是大于 pivot 的节点。
     * 除此之外，对调整后的节点顺序没有更多要求。
     *
     * @param scanner
     */

    private static void linkNoedPartion(Scanner scanner) {

        int n = scanner.nextInt();
        int pivot = scanner.nextInt();

        ListNode head = null;
        ListNode tail = null;

        for (int i = 0; i < n; i++) {

            ListNode node = new ListNode(scanner.nextInt());

            if (head == null) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                tail = node;
            }


        }

        ListNode result = partition(head, pivot);

        while (result != null) {
            System.out.print(result.value + " ");
            result = result.next;
        }
    }

    /**
     * 16.1 分区
     *
     * @param head
     * @param pivot
     * @return
     */
    private static ListNode partition(ListNode head, int pivot) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode smallHead = new ListNode(0);
        ListNode middleHead = new ListNode(0);
        ListNode largeHead = new ListNode(0);

        ListNode small = smallHead;
        ListNode middle = middleHead;
        ListNode large = largeHead;

        while (head != null) {


            if (head.value < pivot) {
                small.next = head;
                small = small.next;
            } else if (head.value == pivot) {
                middle.next = head;
                middle = middle.next;
            } else {
                large.next = head;
                large = large.next;
            }

            head = head.next;
        }

        large.next = null;
        middle.next = largeHead.next;
        small.next = middleHead.next;

        return smallHead.next;

    }


    /**
     * 17.找出字符串中第一个只出现一次的字符 | 时间限制：1秒 | 内存限制：32768K
     * 输入描述:
     * 输入一个非空字符串
     * 输出描述:
     * 输出第一个只出现一次的字符，如果不存在输出-1
     * 数据范围：输入的字符串长度满足1<=n<=1000000
     *
     * @param s
     */
    private static void findFirstStr(String s) {

        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
                System.out.println(s.charAt(i));
                break;
            }
            if (i == s.length() - 1) {
                System.out.println(-1);
            }
        }
    }


    /**
     * 18. 计算某字符出现次数 | 时间限制：1秒 | 内存限制：32768K
     * 写出一个程序，接受一个由字母、数字和空格组成的字符串，和一个字符，然后输出输入字符串中该字符的出现次数。（不区分大小写字母）
     * 数据范围：输入的字符串长度满足1<=n<=1000
     * 输入描述:
     * 第一行输入一个由字母和数字以及空格组成的字符串，第二行输入一个字符。
     * 输出描述:
     * 输出输入字符串中含有该字符的个数。（不区分大小写字母）
     *
     * @param scanner
     */
    private static void findCountCharByParam(Scanner scanner) {

        String inputStr = scanner.nextLine().toLowerCase();
        String target = scanner.nextLine().toLowerCase();

        int remainLength = inputStr.replaceAll(target, "").length();

        System.out.println(inputStr.length() - remainLength);

    }


    /**
     * 19. 不重复打印排序数组中相加和为给定值的所有三元组 | 时间限制：2秒 | 内存限制：262144K
     * 给定排序数组arr和整数k，不重复打印arr中所有相加和为k的严格升序的三元组
     * 例如, arr = [-8, -4, -3, 0, 1, 1, 2, 4, 5, 8, 9], k = 10，打印结果为：
     * -4 5 9
     * -3 4 9
     * -3 5 8
     * 0 1 9
     * 0 2 8
     * 1 4 5
     * 其中三元组1 1 8不满足严格升序所以不打印
     *
     * @param scanner
     */
    private static void findSumIsTarget(Scanner scanner) {

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] datas = new int[n];

        for (int i = 0; i < n; i++) {
            datas[i] = scanner.nextInt();
        }

        List<List<Integer>> result = threeSum(datas, k);

        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }

    /**
     * 19.1 求和找值
     * @param arr
     * @param k
     * @return
     */
    public static List<List<Integer>> threeSum(int[] arr, int k) {
        List<List<Integer>> result = new ArrayList<>();
        if (arr == null || arr.length < 3) {
            return result;
        }
        Arrays.sort(arr); // 确保数组是排序的
        for (int i = 0; i < arr.length - 2; i++) {
            // 跳过重复的值
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            int target = k - arr[i];
            int left = i + 1;
            int right = arr.length - 1;
            while (left < right) {
                int sum = arr[left] + arr[right];
                if (sum == target) {
                    result.add(Arrays.asList(arr[i], arr[left], arr[right]));
                    // 跳过重复的值
                    while (left < right && arr[left] == arr[left + 1]) {
                        left++;
                    }
                    while (left < right && arr[right] == arr[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }


    /**
     * 20.字符串排序 | 时间限制：1秒 | 内存限制：32768K
     * 给定 n 个字符串，请对 n 个字符串按照字典序排列。
     * 数据范围：1<=n<=1000  字符串长度满足 1<=len<=100
     * <p>
     * 输入描述:
     * 输入第一行为一个正整数n(1≤n≤1000),下面n行为n个字符串(字符串长度≤100),字符串中只含有大小写字母。
     * <p>
     * 输出描述:
     * 数据输出n行，输出结果为按照字典序排列的字符串。
     *
     * @param scanner
     */
    private static void sortCharacter(Scanner scanner) {

        int n = scanner.nextInt();
        scanner.nextLine();

        String[] strs = new String[n];

        for (int i = 0; i < n; i++) {
            strs[i] = scanner.nextLine();
        }
        System.out.println("排序前");
        Arrays.stream(strs).forEach(i -> System.out.println(i));
        System.out.println();

        Arrays.sort(strs);
        System.out.println("排序后");
        Arrays.stream(strs).forEach(i -> System.out.print(i));

    }


    /**
     * 23.统计大写字母个数 | 时间限制：1秒 | 内存限制：32768K
     * 找出给定字符串中大写字符(即'A'-'Z')的个数。
     *
     * @param str
     * @return
     */
    public static Integer findUpperCharacter(String str) {

        Integer result = str.replaceAll("[^A-Z]", "").length();
        System.out.println("大写字母个数" + result);

        return result;
    }

    /**
     * 24.标题：密码验证合格程序 | 时间限制：1秒 | 内存限制：32768K
     * 密码要求:
     * 1.长度超过8位
     * 2.包括大小写字母.数字.其它符号,以上四种至少三种
     * 3.不能有长度大于2的不含公共元素的子串重复 （注：其他符号不含空格或换行）
     * 数据范围：输入的字符串长度满足1<=n<=100
     *
     * @param password
     * @return
     */
    public static boolean invalidPassword(String password) {

        if (password.length() < 8) {
            return false;
        }

        int count = 0;
        if (password.matches(".*[A-Z].*")) {
            count++;
        }
        if (password.matches(".*[a-z].*")) {
            count++;
        }
        if (password.matches(".*\\d.*")) {
            count++;
        }
        if (password.matches(".*[^A-Za-z0-9\\s].*")) {
            count++;
        }
        if (count < 3) {
            return false;
        }

        return !checkRepeat(password);
    }

    /**
     * 24-1 判断是否有公共元素的子串重复
     *
     * @param password
     * @return
     */
    public static boolean checkRepeat(String password) {

        boolean result = false;
        char[] chars = password.toCharArray();
        for (int i = 0; i < chars.length - 5; i++) {
            for (int j = i + 3; j < chars.length - 2; j++) {
                if (chars[i] == chars[j] && chars[i + 1] == chars[j + 1] && chars[i + 2] == chars[j + 2]) {
                    result = true;
                }
            }
        }

        return result;
    }


    /**
     * 28.统计每个月兔子的总数 | 时间限制：1秒 | 内存限制：32768K
     * 有一种兔子，从出生后第3个月起每个月都生一只兔子，小兔子长到第三个月后每个月又生一只兔子。
     * 例子：假设一只兔子第3个月出生，那么它第5个月开始会每个月生一只兔子。
     * 一月的时候有一只兔子，假如兔子都不死，问第n个月的兔子总数为多少？
     * 数据范围：输入满足1<=n<=31
     * @param scanner
     */
    private static void rabbitCount(Scanner scanner) {

        int n = scanner.nextInt();

        int count = rabbitCountDP(n);
        System.out.println(count);
    }

    /**
     * 28.1 动态规划兔子问题
     * @param n
     * @return
     */
    private static int rabbitCountDP(int n) {
        if (n==1 || n==2){
            return 1;
        }

       int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 1;

        for (int i=3; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    /**
     * 29. 求小球落地5次后所经历的路程和第5次反弹的高度 | 时间限制：1秒 | 内存限制：32768K
     *     假设一个球从任意高度自由落下，每次落地后反跳回原高度的一半; 再落下, 求它在第5次落地时，共经历多少米?第5次反弹多高？
     * @param scanner
     */
    private static void getDistanceAndHight(Scanner scanner) {

        double h = scanner.nextDouble();
        double h2 = h/2;

        for (int i=0; i<5; i++){
            h += 2*h2;
            h2 = h2/2;
        }

        System.out.println(h);
        System.out.println(h2);
    }

}
