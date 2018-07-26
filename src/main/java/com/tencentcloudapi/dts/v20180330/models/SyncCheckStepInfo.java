package com.tencentcloudapi.dts.v20180330.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class SyncCheckStepInfo  extends AbstractModel{


    /**
    * 步骤序列
    */
    @SerializedName("StepNo")
    @Expose
    private Integer StepNo;

    /**
    * 步骤展现名称
    */
    @SerializedName("StepName")
    @Expose
    private String StepName;

    /**
    * 步骤执行结果代码
    */
    @SerializedName("StepCode")
    @Expose
    private Integer StepCode;

    /**
    * 步骤执行结果提示
    */
    @SerializedName("StepMessage")
    @Expose
    private String StepMessage;

    /**
     * 获取步骤序列
     * @return StepNo 步骤序列
     */
    public Integer getStepNo() {
        return this.StepNo;
    }

    /**
     * 设置步骤序列
     * @param StepNo 步骤序列
     */
    public void setStepNo(Integer StepNo) {
        this.StepNo = StepNo;
    }

    /**
     * 获取步骤展现名称
     * @return StepName 步骤展现名称
     */
    public String getStepName() {
        return this.StepName;
    }

    /**
     * 设置步骤展现名称
     * @param StepName 步骤展现名称
     */
    public void setStepName(String StepName) {
        this.StepName = StepName;
    }

    /**
     * 获取步骤执行结果代码
     * @return StepCode 步骤执行结果代码
     */
    public Integer getStepCode() {
        return this.StepCode;
    }

    /**
     * 设置步骤执行结果代码
     * @param StepCode 步骤执行结果代码
     */
    public void setStepCode(Integer StepCode) {
        this.StepCode = StepCode;
    }

    /**
     * 获取步骤执行结果提示
     * @return StepMessage 步骤执行结果提示
     */
    public String getStepMessage() {
        return this.StepMessage;
    }

    /**
     * 设置步骤执行结果提示
     * @param StepMessage 步骤执行结果提示
     */
    public void setStepMessage(String StepMessage) {
        this.StepMessage = StepMessage;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StepNo", this.StepNo);
        this.setParamSimple(map, prefix + "StepName", this.StepName);
        this.setParamSimple(map, prefix + "StepCode", this.StepCode);
        this.setParamSimple(map, prefix + "StepMessage", this.StepMessage);

    }
}

