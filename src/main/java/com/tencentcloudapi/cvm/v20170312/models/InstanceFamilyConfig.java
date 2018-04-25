package com.tencentcloudapi.cvm.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class InstanceFamilyConfig  extends AbstractModel{


    /**
    * 机型族名称的中文全称。
    */
    @SerializedName("InstanceFamilyName")
    @Expose
    private String InstanceFamilyName;
    

    /**
    * 机型族名称的英文简称。
    */
    @SerializedName("InstanceFamily")
    @Expose
    private String InstanceFamily;
    

    /**
     * 获取机型族名称的中文全称。
     * @return InstanceFamilyName 机型族名称的中文全称。
     */
    public String getInstanceFamilyName() {
        return this.InstanceFamilyName;
    }

    /**
     * 设置机型族名称的中文全称。
     * @param InstanceFamilyName 机型族名称的中文全称。
     */
    public void setInstanceFamilyName(String InstanceFamilyName) {
        this.InstanceFamilyName = InstanceFamilyName;
    }

    /**
     * 获取机型族名称的英文简称。
     * @return InstanceFamily 机型族名称的英文简称。
     */
    public String getInstanceFamily() {
        return this.InstanceFamily;
    }

    /**
     * 设置机型族名称的英文简称。
     * @param InstanceFamily 机型族名称的英文简称。
     */
    public void setInstanceFamily(String InstanceFamily) {
        this.InstanceFamily = InstanceFamily;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceFamilyName", this.InstanceFamilyName);
        this.setParamSimple(map, prefix + "InstanceFamily", this.InstanceFamily);

    }
}

