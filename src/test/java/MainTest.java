import Util.HammingUtils;
import Util.SimHashUtils;
import Util.TxtIOUtil;
import Util.TxtIOUtil;
import org.junit.Test;

public class MainTest {

    @Test
    public void origAndAllTest(){
        String[] str = new String[6];
        str[0] = TxtIOUtil.readTxt("D:/Javacode/3122004880/orig.txt");
        str[1] = TxtIOUtil.readTxt("D:/Javacode/3122004880/orig_0.8_add.txt");
        str[2] = TxtIOUtil.readTxt("D:/Javacode/3122004880/orig_0.8_del.txt");
        str[3] = TxtIOUtil.readTxt("D:/Javacode/3122004880/orig_0.8_dis_1.txt");
        str[4] = TxtIOUtil.readTxt("D:/Javacode/3122004880/orig_0.8_dis_10.txt");
        str[5] = TxtIOUtil.readTxt("D:/Javacode/3122004880/orig_0.8_dis_15.txt");
        String ansFileName = "D:/Javacode/3122004880/ansAll.txt";
        for(int i = 0; i <= 5; i++){
            double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str[0]), SimHashUtils.getSimHash(str[i]));
            TxtIOUtil.writeTxt(ans, ansFileName);
        }
    }

    @Test
    public void origAndOrigTest(){
        String str0 = TxtIOUtil.readTxt("D:/Javacode/3122004880/orig.txt");
        String str1 = TxtIOUtil.readTxt("D:/Javacode/3122004880/orig.txt");
        String ansFileName = "D:/Javacode/3122004880/ansOrigAndOrigTest.txt";
        double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str0), SimHashUtils.getSimHash(str1));
        TxtIOUtil.writeTxt(ans, ansFileName);
    }

    @Test
    public void origAndAddTest(){
        String str0 = TxtIOUtil.readTxt("D:/Javacode/3122004880/orig.txt");
        String str1 = TxtIOUtil.readTxt("D:/Javacode/3122004880/orig_0.8_add.txt");
        String ansFileName = "D:/Javacode/3122004880/ansOrigAndAddTest.txt";
        double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str0), SimHashUtils.getSimHash(str1));
        TxtIOUtil.writeTxt(ans, ansFileName);
    }

    @Test
    public void origAndDelTest(){
        String str0 = TxtIOUtil.readTxt("D:/Javacode/3122004880/orig.txt");
        String str1 = TxtIOUtil.readTxt("D:/Javacode/3122004880/orig_0.8_del.txt");
        String ansFileName = "D:/Javacode/3122004880/ansOrigAndDelTest.txt";
        double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str0), SimHashUtils.getSimHash(str1));
        TxtIOUtil.writeTxt(ans, ansFileName);
    }

    @Test
    public void origAndDis1Test(){
        String str0 = TxtIOUtil.readTxt("D:/Javacode/3122004880/orig.txt");
        String str1 = TxtIOUtil.readTxt("D:/Javacode/3122004880/orig_0.8_dis_1.txt");
        String ansFileName = "D:/Javacode/3122004880/ansOrigAndDis1Test.txt";
        double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str0), SimHashUtils.getSimHash(str1));
        TxtIOUtil.writeTxt(ans, ansFileName);
    }

    @Test
    public void origAndDis10Test(){
        String str0 = TxtIOUtil.readTxt("D:/Javacode/3122004880/orig.txt");
        String str1 = TxtIOUtil.readTxt("D:/Javacode/3122004880/orig_0.8_dis_10.txt");
        String ansFileName = "D:/Javacode/3122004880/ansOrigAndDis10Test.txt";
        double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str0), SimHashUtils.getSimHash(str1));
        TxtIOUtil.writeTxt(ans, ansFileName);
    }

    @Test
    public void origAndDis15Test(){
        String str0 = TxtIOUtil.readTxt("D:/Javacode/3122004880/orig.txt");
        String str1 = TxtIOUtil.readTxt("D:/Javacode/3122004880/orig_0.8_dis_15.txt");
        String ansFileName = "D:/Javacode/3122004880/ansOrigAndDis15Test.txt";
        double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str0), SimHashUtils.getSimHash(str1));
        TxtIOUtil.writeTxt(ans,ansFileName);
    }

}
//测试
