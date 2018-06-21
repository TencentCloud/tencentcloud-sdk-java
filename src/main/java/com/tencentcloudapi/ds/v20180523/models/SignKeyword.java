package com.tencentcloudapi.ds.v20180523.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class SignKeyword  extends AbstractModel{


    /**
    * 关键字
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * X轴偏移坐标
    */
    @SerializedName("OffsetCoordX")
    @Expose
    private String OffsetCoordX;

    /**
    * Y轴偏移坐标
    */
    @SerializedName("OffsetCoordY")
    @Expose
    private String OffsetCoordY;

    /**
    * 签章突破宽度
    */
    @SerializedName("ImageWidth")
    @Expose
    private String ImageWidth;

    /**
    * 签章图片高度
    */
    @SerializedName("ImageHeight")
    @Expose
    private String ImageHeight;

    /**
     * 获取关键字
     * @return Keyword 关键字
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * 设置关键字
     * @param Keyword 关键字
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * 获取X轴偏移坐标
     * @return OffsetCoordX X轴偏移坐标
     */
    public String getOffsetCoordX() {
        return this.OffsetCoordX;
    }

    /**
     * 设置X轴偏移坐标
     * @param OffsetCoordX X轴偏移坐标
     */
    public void setOffsetCoordX(String OffsetCoordX) {
        this.OffsetCoordX = OffsetCoordX;
    }

    /**
     * 获取Y轴偏移坐标
     * @return OffsetCoordY Y轴偏移坐标
     */
    public String getOffsetCoordY() {
        return this.OffsetCoordY;
    }

    /**
     * 设置Y轴偏移坐标
     * @param OffsetCoordY Y轴偏移坐标
     */
    public void setOffsetCoordY(String OffsetCoordY) {
        this.OffsetCoordY = OffsetCoordY;
    }

    /**
     * 获取签章突破宽度
     * @return ImageWidth 签章突破宽度
     */
    public String getImageWidth() {
        return this.ImageWidth;
    }

    /**
     * 设置签章突破宽度
     * @param ImageWidth 签章突破宽度
     */
    public void setImageWidth(String ImageWidth) {
        this.ImageWidth = ImageWidth;
    }

    /**
     * 获取签章图片高度
     * @return ImageHeight 签章图片高度
     */
    public String getImageHeight() {
        return this.ImageHeight;
    }

    /**
     * 设置签章图片高度
     * @param ImageHeight 签章图片高度
     */
    public void setImageHeight(String ImageHeight) {
        this.ImageHeight = ImageHeight;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "OffsetCoordX", this.OffsetCoordX);
        this.setParamSimple(map, prefix + "OffsetCoordY", this.OffsetCoordY);
        this.setParamSimple(map, prefix + "ImageWidth", this.ImageWidth);
        this.setParamSimple(map, prefix + "ImageHeight", this.ImageHeight);

    }
}

