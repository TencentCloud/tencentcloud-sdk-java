package com.tencentcloudapi.tbm.v20180129.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class GenderPortrait  extends AbstractModel{


    /**
    * 性别
    */
    @SerializedName("Gender")
    @Expose
    private String Gender;

    /**
    * 百分比
    */
    @SerializedName("Percent")
    @Expose
    private Integer Percent;

    /**
     * 获取性别
     * @return Gender 性别
     */
    public String getGender() {
        return this.Gender;
    }

    /**
     * 设置性别
     * @param Gender 性别
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    /**
     * 获取百分比
     * @return Percent 百分比
     */
    public Integer getPercent() {
        return this.Percent;
    }

    /**
     * 设置百分比
     * @param Percent 百分比
     */
    public void setPercent(Integer Percent) {
        this.Percent = Percent;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Gender", this.Gender);
        this.setParamSimple(map, prefix + "Percent", this.Percent);

    }
}

