package com.tencentcloudapi.scf.v20180416.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class Environment  extends AbstractModel{


    /**
    * 环境变量数组
    */
    @SerializedName("Variables")
    @Expose
    private Variable [] Variables;

    /**
     * 获取环境变量数组
     * @return Variables 环境变量数组
     */
    public Variable [] getVariables() {
        return this.Variables;
    }

    /**
     * 设置环境变量数组
     * @param Variables 环境变量数组
     */
    public void setVariables(Variable [] Variables) {
        this.Variables = Variables;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Variables.", this.Variables);

    }
}

