package com.tencentcloudapi.ds.v20180523.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class SignLocation  extends AbstractModel{


    /**
    * 签名域页数
    */
    @SerializedName("SignOnPage")
    @Expose
    private String SignOnPage;
    

    /**
    * 签名域左下角X轴坐标轴
    */
    @SerializedName("SignLocationLBX")
    @Expose
    private String SignLocationLBX;
    

    /**
    * 签名域左下角Y轴坐标轴
    */
    @SerializedName("SignLocationLBY")
    @Expose
    private String SignLocationLBY;
    

    /**
    * 签名域右上角X轴坐标轴
    */
    @SerializedName("SignLocationRUX")
    @Expose
    private String SignLocationRUX;
    

    /**
    * 签名域右上角Y轴坐标轴
    */
    @SerializedName("SignLocationRUY")
    @Expose
    private String SignLocationRUY;
    

    /**
     * 获取签名域页数
     * @return SignOnPage 签名域页数
     */
    public String getSignOnPage() {
        return this.SignOnPage;
    }

    /**
     * 设置签名域页数
     * @param SignOnPage 签名域页数
     */
    public void setSignOnPage(String SignOnPage) {
        this.SignOnPage = SignOnPage;
    }

    /**
     * 获取签名域左下角X轴坐标轴
     * @return SignLocationLBX 签名域左下角X轴坐标轴
     */
    public String getSignLocationLBX() {
        return this.SignLocationLBX;
    }

    /**
     * 设置签名域左下角X轴坐标轴
     * @param SignLocationLBX 签名域左下角X轴坐标轴
     */
    public void setSignLocationLBX(String SignLocationLBX) {
        this.SignLocationLBX = SignLocationLBX;
    }

    /**
     * 获取签名域左下角Y轴坐标轴
     * @return SignLocationLBY 签名域左下角Y轴坐标轴
     */
    public String getSignLocationLBY() {
        return this.SignLocationLBY;
    }

    /**
     * 设置签名域左下角Y轴坐标轴
     * @param SignLocationLBY 签名域左下角Y轴坐标轴
     */
    public void setSignLocationLBY(String SignLocationLBY) {
        this.SignLocationLBY = SignLocationLBY;
    }

    /**
     * 获取签名域右上角X轴坐标轴
     * @return SignLocationRUX 签名域右上角X轴坐标轴
     */
    public String getSignLocationRUX() {
        return this.SignLocationRUX;
    }

    /**
     * 设置签名域右上角X轴坐标轴
     * @param SignLocationRUX 签名域右上角X轴坐标轴
     */
    public void setSignLocationRUX(String SignLocationRUX) {
        this.SignLocationRUX = SignLocationRUX;
    }

    /**
     * 获取签名域右上角Y轴坐标轴
     * @return SignLocationRUY 签名域右上角Y轴坐标轴
     */
    public String getSignLocationRUY() {
        return this.SignLocationRUY;
    }

    /**
     * 设置签名域右上角Y轴坐标轴
     * @param SignLocationRUY 签名域右上角Y轴坐标轴
     */
    public void setSignLocationRUY(String SignLocationRUY) {
        this.SignLocationRUY = SignLocationRUY;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SignOnPage", this.SignOnPage);
        this.setParamSimple(map, prefix + "SignLocationLBX", this.SignLocationLBX);
        this.setParamSimple(map, prefix + "SignLocationLBY", this.SignLocationLBY);
        this.setParamSimple(map, prefix + "SignLocationRUX", this.SignLocationRUX);
        this.setParamSimple(map, prefix + "SignLocationRUY", this.SignLocationRUY);

    }
}

