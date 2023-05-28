import java.util.Arrays;

public class GenerateCopilotTest {

    private static String price;

    public static void main(String[] args){
        //写一个快排,生成一个数组  1 2 3 4 5
        int[] nums = {2, 4, 1, 3, 5};
        quickSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
        //输出分割线
        System.out.println("----------");
        int m = calculateDaysBetweenDates(2023, 1, 3, 2019, 1, 20);
        System.out.println(m);
    }


    //写一个方法，爬取京东网页关于小米13的价格信息
    static void getJDPrice(){
        //访问京东
        //指定数据来源
        //选择需要的数据
        //指定保存目标
        String url = "https://item.jd.com/100049486743.html";
        String html = getHtml(url);
        String price = getPrice(html);
        savePrice(price);
    }

    private static String getPrice(String html) {
        //遍历网页内容，获取价格   <span class="price J-p-100049486743" data-price="1999.00">￥1999.00</span>
        //正则表达式
        //返回价格
        return price;
    }

    private static void savePrice(String price) {
        //打印到控制台
        price = "￥" + "4999";
        System.out.println(price);
    }

    private static String getHtml(String url) {
        //获取网址html
        //返回html
        return null;
    }


    static int calculateDaysBetweenDates(int year1, int month1, int day1, int year2, int month2, int day2) {
        int[] monthDays = {31,28,31,30,31,30,31,31,30,31,30,31};
        int days = 0;
        for(int i = year1; i < year2; i++){
            if(isLeapYear(i)){
                days += 366;
            }else{
                days += 365;
            }
        }
        for(int i = 0; i < month1 - 1; i++){
            days -= monthDays[i];
        }
        for(int i = 0; i < month2 - 1; i++){
            days += monthDays[i];
        }
        days += day2 - day1;
        return days;
    }

    static boolean isLeapYear(int year) {
        if(year % 100 == 0){
            return year % 400 == 0;
        }else{
            return year % 4 == 0;
        }
    }

    static void quickSort(int[] nums, int start, int end){
        if(start >= end){
            return;
        }
        int pivot = nums[start];
        int left = start;
        int right = end;
        while(left < right){
            while(left < right && nums[right] >= pivot){
                right--;
            }
            nums[left] = nums[right];
            while(left < right && nums[left] <= pivot){
                left++;
            }
            nums[right] = nums[left];
        }
        nums[left] = pivot;
        quickSort(nums, start, left - 1);
        quickSort(nums, left + 1, end);
    }


}
