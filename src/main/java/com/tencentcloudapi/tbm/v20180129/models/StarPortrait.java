package com.tencentcloudapi.tbm.v20180129.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class StarPortrait  extends AbstractModel{


    /**
    * 喜欢的明星名字
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 百分比
    */
    @SerializedName("Percent")
    @Expose
    private Float Percent;

    /**
     * 获取喜欢的明星名字
     * @return Name 喜欢的明星名字
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置喜欢的明星名字
     * @param Name 喜欢的明星名字
     */
    public void setName(String Name) {
        this.Name = Name;
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
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Percent", this.Percent);

    }
}

