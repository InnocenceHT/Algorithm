package algorithm.test;

import algorithm.linear.Stack;

public class ReversePolishNotationTest {

    public static void main(String[] args) {
        //中缀表达式 3 *（17-15）+ 18/6的逆波兰表达式如下
        String[] notation = {"3", "17", "15", "-", "*", "18", "6", "/", "+"};
        int result = calculate(notation);
        System.out.println("逆波兰表达式的结果为：" + result);
    }

    /*
        notation：逆波兰表达式的数组表示方式
        return：逆波兰表达式的结算结果
     */
    public static int calculate(String[] notation) {
        //1.定义栈，用来存储操作数
        Stack<Integer> operates = new Stack<>();

        //2.从左往右遍历逆波兰表达式，得到每一个元素
        for (int i = 0; i < notation.length; i++) {
            String curr = notation[i];

            //3.判断当前元素是运算符还是操作数
            Integer o1;
            Integer o2;
            Integer result;
            switch (curr) {
                case "+" :
                    //4.运算符，从栈中演出两个操作数，完成运算，运算完的结果再押入栈中
                    o1 = operates.pop();
                    o2 = operates.pop();
                    result = o2 + o1;
                    operates.push(result);
                    break;
                case "-" :
                    //4.运算符，从栈中演出两个操作数，完成运算，运算完的结果再押入栈中
                    o1 = operates.pop();
                    o2 = operates.pop();
                    result = o2 - o1;
                    operates.push(result);
                    break;
                case "*" :
                    //4.运算符，从栈中演出两个操作数，完成运算，运算完的结果再押入栈中
                    o1 = operates.pop();
                    o2 = operates.pop();
                    result = o2 * o1;
                    operates.push(result);
                    break;
                case "/" :
                    //4.运算符，从栈中演出两个操作数，完成运算，运算完的结果再押入栈中
                    o1 = operates.pop();
                    o2 = operates.pop();
                    result = o2 / o1;
                    operates.push(result);
                    break;
                default:
                    //5.操作数，把该操作数放到栈中
                    operates.push(Integer.parseInt(curr));
                    break;
            }

        }

        //6.得到栈中最后一个元素，就是逆波兰表达式的结果
        int result = operates.pop();
        return result;
    }
}
