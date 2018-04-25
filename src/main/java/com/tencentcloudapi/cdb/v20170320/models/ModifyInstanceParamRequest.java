package com.tencentcloudapi.cdb.v20170320.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class ModifyInstanceParamRequest  extends AbstractModel{


    /**
    * 实例短Id列表。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;
    

    /**
    * 要修改的参数列表。每一个元素是name和currentValue的组合。name是参数名，currentValue是要修改成的值。
    */
    @SerializedName("ParamList")
    @Expose
    private Parameter [] ParamList;
    

    /**
     * 获取实例短Id列表。
     * @return InstanceIds 实例短Id列表。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * 设置实例短Id列表。
     * @param InstanceIds 实例短Id列表。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * 获取要修改的参数列表。每一个元素是name和currentValue的组合。name是参数名，currentValue是要修改成的值。
     * @return ParamList 要修改的参数列表。每一个元素是name和currentValue的组合。name是参数名，currentValue是要修改成的值。
     */
    public Parameter [] getParamList() {
        return this.ParamList;
    }

    /**
     * 设置要修改的参数列表。每一个元素是name和currentValue的组合。name是参数名，currentValue是要修改成的值。
     * @param ParamList 要修改的参数列表。每一个元素是name和currentValue的组合。name是参数名，currentValue是要修改成的值。
     */
    public void setParamList(Parameter [] ParamList) {
        this.ParamList = ParamList;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArrayObj(map, prefix + "ParamList.", this.ParamList);

    }
}

