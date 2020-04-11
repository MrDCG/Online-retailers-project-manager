/** 
* @author MrDCG 
* @version 创建时间：2020年4月10日 上午9:57:11 
*
*/
public class splitTest {
	public static void main(String[] args) {
		String s = "http://192.168.110.128/group1/M00/00/02/wKhugF6PztCAY8HbAADZPPsL7Sc602.jpghttp://192.168.110.128/group1/M00/00/02/wKhugF6PztCANDRPAAC7FsCIEoM392.jpghttp://192.168.110.128/group1/M00/00/02/wKhugF6PztGAe36RAAD7oU5_ZTA001.jpghttp://192.168.110.128/group1/M00/00/02/wKhugF6PztGAK3DOAAMe0Cho7M8828.jpg";
		String[] s1 = s.split("http:");
		for (String string : s1) {
			System.out.println(string);
			
		}
	}
}
