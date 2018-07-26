package com.tencentcloudapi.scf.v20180416.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class GetFunctionRequest  extends AbstractModel{


    /**
    * 需要获取详情的函数名称
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * 函数的版本号
    */
    @SerializedName("Qualifier")
    @Expose
    private String Qualifier;

    /**
    * 是否显示代码, TRUE表示显示代码，FALSE表示不显示代码,大于1M的入口文件不会显示
    */
    @SerializedName("ShowCode")
    @Expose
    private String ShowCode;

    /**
     * 获取需要获取详情的函数名称
     * @return FunctionName 需要获取详情的函数名称
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * 设置需要获取详情的函数名称
     * @param FunctionName 需要获取详情的函数名称
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * 获取函数的版本号
     * @return Qualifier 函数的版本号
     */
    public String getQualifier() {
        return this.Qualifier;
    }

    /**
     * 设置函数的版本号
     * @param Qualifier 函数的版本号
     */
    public void setQualifier(String Qualifier) {
        this.Qualifier = Qualifier;
    }

    /**
     * 获取是否显示代码, TRUE表示显示代码，FALSE表示不显示代码,大于1M的入口文件不会显示
     * @return ShowCode 是否显示代码, TRUE表示显示代码，FALSE表示不显示代码,大于1M的入口文件不会显示
     */
    public String getShowCode() {
        return this.ShowCode;
    }

    /**
     * 设置是否显示代码, TRUE表示显示代码，FALSE表示不显示代码,大于1M的入口文件不会显示
     * @param ShowCode 是否显示代码, TRUE表示显示代码，FALSE表示不显示代码,大于1M的入口文件不会显示
     */
    public void setShowCode(String ShowCode) {
        this.ShowCode = ShowCode;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "Qualifier", this.Qualifier);
        this.setParamSimple(map, prefix + "ShowCode", this.ShowCode);

    }
}

