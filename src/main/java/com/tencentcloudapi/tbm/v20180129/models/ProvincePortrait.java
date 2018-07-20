package com.tencentcloudapi.tbm.v20180129.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class ProvincePortrait  extends AbstractModel{


    /**
    * 省份名称
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
    * 百分比
    */
    @SerializedName("Percent")
    @Expose
    private Float Percent;

    /**
     * 获取省份名称
     * @return Province 省份名称
     */
    public String getProvince() {
        return this.Province;
    }

    /**
     * 设置省份名称
     * @param Province 省份名称
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    /**
     * 获取百分比
     * @return Percent 百分比
     */
    public Float getPercent() {
        return this.Percent;
    }

    /**
     * 设置百分比
     * @param Percent 百分比
     */
    public void setPercent(Float Percent) {
        this.Percent = Percent;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "Percent", this.Percent);

    }
}

