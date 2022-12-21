package exceptions.SchoolPro;

import java.util.ArrayList;

public class SchoolPojo {
    /*
    2- fieldları okulAd, maxOgrenciSayisi,
        ArrayList cinsinden Öğrencileri olan bir Okul pojo class create ediniz,
     */
    private String schoolName;
    private int maxOgrenciSayisi;
    private ArrayList<OgrenciPojo>ogrenciler;

    public SchoolPojo() {
    }

    public SchoolPojo(String schoolName, int maxOgrenciSayisi, ArrayList<OgrenciPojo> ogrenciler) {
        this.schoolName = schoolName;
        this.maxOgrenciSayisi = maxOgrenciSayisi;
        this.ogrenciler = ogrenciler;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getMaxOgrenciSayisi() {
        return maxOgrenciSayisi;
    }

    public void setMaxOgrenciSayisi(int maxOgrenciSayisi) {
        this.maxOgrenciSayisi = maxOgrenciSayisi;
    }

    public ArrayList<OgrenciPojo> getOgrenciler() {
        return ogrenciler;
    }

    public void setOgrenciler(ArrayList<OgrenciPojo> ogrenciler) {
        this.ogrenciler = ogrenciler;
    }

    @Override
    public String toString() {
        return "SchoolPojo{" +
                "schoolName='" + schoolName + '\'' +
                ", maxOgrenciSayisi=" + maxOgrenciSayisi +
                ", ogrenciler=" + ogrenciler +
                '}';
    }
}
