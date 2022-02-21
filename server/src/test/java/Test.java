public class Test {
    /**
     * 给定一个source字符串和一个target字符串，在source字符串中
     * 找出target字符串出现的第一个位置（从0开始），如果不存在则
     * 返回-1
     * 例如：source="hello" target="ll" 返回2
     * source="aaaaa" target="bbb" 返回-1
     * @param args
     */
    public static void main(String[] args) {
    String source="hello";
    String target = "llk";
    System.out.println(strStr(source,target));
    }
    public static int strStr(String source,String target){
//        char [] c1 = source.toCharArray();
//        char [] c2 = target.toCharArray();
//        for (int i = 0;i<c2.length;i++){
//            for (int j = 0;j<c1.length;j++){
//                if (c2[i] == c1[j]){
//
//                }
//            }
//        }
        return source.indexOf(target);
//        return -1;
    }
}
