package com.tencentcloudapi.mariadb.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class InstanceSpec  extends AbstractModel{


    /**
    * 设备型号
    */
    @SerializedName("Machine")
    @Expose
    private String Machine;
    

    /**
    * 该机型对应的可售卖规格列表
    */
    @SerializedName("SpecInfos")
    @Expose
    private SpecConfigInfo [] SpecInfos;
    

    /**
     * 获取设备型号
     * @return Machine 设备型号
     */
    public String getMachine() {
        return this.Machine;
    }

    /**
     * 设置设备型号
     * @param Machine 设备型号
     */
    public void setMachine(String Machine) {
        this.Machine = Machine;
    }

    /**
     * 获取该机型对应的可售卖规格列表
     * @return SpecInfos 该机型对应的可售卖规格列表
     */
    public SpecConfigInfo [] getSpecInfos() {
        return this.SpecInfos;
    }

    /**
     * 设置该机型对应的可售卖规格列表
     * @param SpecInfos 该机型对应的可售卖规格列表
     */
    public void setSpecInfos(SpecConfigInfo [] SpecInfos) {
        this.SpecInfos = SpecInfos;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Machine", this.Machine);
        this.setParamArrayObj(map, prefix + "SpecInfos.", this.SpecInfos);

    }
}

