package com.tencentcloudapi.dcdb.v20180411.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class SpecConfig  extends AbstractModel{


    /**
    * 规格机型
    */
    @SerializedName("Machine")
    @Expose
    private String Machine;

    /**
    * 规格列表
    */
    @SerializedName("SpecConfigInfos")
    @Expose
    private SpecConfigInfo [] SpecConfigInfos;

    /**
     * 获取规格机型
     * @return Machine 规格机型
     */
    public String getMachine() {
        return this.Machine;
    }

    /**
     * 设置规格机型
     * @param Machine 规格机型
     */
    public void setMachine(String Machine) {
        this.Machine = Machine;
    }

    /**
     * 获取规格列表
     * @return SpecConfigInfos 规格列表
     */
    public SpecConfigInfo [] getSpecConfigInfos() {
        return this.SpecConfigInfos;
    }

    /**
     * 设置规格列表
     * @param SpecConfigInfos 规格列表
     */
    public void setSpecConfigInfos(SpecConfigInfo [] SpecConfigInfos) {
        this.SpecConfigInfos = SpecConfigInfos;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Machine", this.Machine);
        this.setParamArrayObj(map, prefix + "SpecConfigInfos.", this.SpecConfigInfos);

    }
}

