package com.tencentcloudapi.cvm.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class CreateDisasterRecoverGroupRequest  extends AbstractModel{


    /**
    * 分散置放群组名称，长度1-60个字符，支持中、英文。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 分散置放群组类型，取值范围：<br><li>HOST：物理机<br><li>SW：交换机<br><li>RACK：机架
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * 获取分散置放群组名称，长度1-60个字符，支持中、英文。
     * @return Name 分散置放群组名称，长度1-60个字符，支持中、英文。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置分散置放群组名称，长度1-60个字符，支持中、英文。
     * @param Name 分散置放群组名称，长度1-60个字符，支持中、英文。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取分散置放群组类型，取值范围：<br><li>HOST：物理机<br><li>SW：交换机<br><li>RACK：机架
     * @return Type 分散置放群组类型，取值范围：<br><li>HOST：物理机<br><li>SW：交换机<br><li>RACK：机架
     */
    public String getType() {
        return this.Type;
    }

    /**
     * 设置分散置放群组类型，取值范围：<br><li>HOST：物理机<br><li>SW：交换机<br><li>RACK：机架
     * @param Type 分散置放群组类型，取值范围：<br><li>HOST：物理机<br><li>SW：交换机<br><li>RACK：机架
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

