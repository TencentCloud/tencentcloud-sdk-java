package com.tencentcloudapi.tbm.v20180129.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class AgePortraitInfo  extends AbstractModel{


    /**
    * 用户年龄画像数组
    */
    @SerializedName("PortraitSet")
    @Expose
    private AgePortrait [] PortraitSet;

    /**
     * 获取用户年龄画像数组
     * @return PortraitSet 用户年龄画像数组
     */
    public AgePortrait [] getPortraitSet() {
        return this.PortraitSet;
    }

    /**
     * 设置用户年龄画像数组
     * @param PortraitSet 用户年龄画像数组
     */
    public void setPortraitSet(AgePortrait [] PortraitSet) {
        this.PortraitSet = PortraitSet;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "PortraitSet.", this.PortraitSet);

    }
}

