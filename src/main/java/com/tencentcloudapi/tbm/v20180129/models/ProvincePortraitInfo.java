package com.tencentcloudapi.tbm.v20180129.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class ProvincePortraitInfo  extends AbstractModel{


    /**
    * 用户省份画像数组
    */
    @SerializedName("PortraitSet")
    @Expose
    private ProvincePortrait [] PortraitSet;

    /**
     * 获取用户省份画像数组
     * @return PortraitSet 用户省份画像数组
     */
    public ProvincePortrait [] getPortraitSet() {
        return this.PortraitSet;
    }

    /**
     * 设置用户省份画像数组
     * @param PortraitSet 用户省份画像数组
     */
    public void setPortraitSet(ProvincePortrait [] PortraitSet) {
        this.PortraitSet = PortraitSet;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "PortraitSet.", this.PortraitSet);

    }
}

