package BaiTapChuong4.ArrayList.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapKey {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("HN", " Ha Noi");
        hashMap.put("TpHCM", " Thanh Pho Ho Chi Minh");
        hashMap.put("HP", " Hai Phong");
        hashMap.put("NB", " Ninh Binh");
        hashMap.put("AG", " An Giang");
        System.out.println("Danh sach cac thanh pho trong hashMapcity : ");
        Set<Map.Entry<String, String >> setCity = hashMap.entrySet();
        System.out.println(setCity);
        System.out.println("HN: "+hashMap.get("HN"));
        System.out.println("HP: "+hashMap.get("HP"));
        if(hashMap.containsValue("Ninh Binh")){
            System.out.println("Co Ninh Binh trong hashMapcity");
        }

    }
}
