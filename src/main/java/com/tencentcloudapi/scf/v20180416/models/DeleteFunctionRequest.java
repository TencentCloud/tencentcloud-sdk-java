package com.tencentcloudapi.scf.v20180416.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DeleteFunctionRequest  extends AbstractModel{


    /**
    * 要删除的函数名称
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
     * 获取要删除的函数名称
     * @return FunctionName 要删除的函数名称
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * 设置要删除的函数名称
     * @param FunctionName 要删除的函数名称
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);

    }
}

