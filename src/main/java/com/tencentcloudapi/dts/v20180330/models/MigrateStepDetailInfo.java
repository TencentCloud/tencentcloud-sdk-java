package com.tencentcloudapi.dts.v20180330.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class MigrateStepDetailInfo  extends AbstractModel{


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
    * 步骤英文标识
    */
    @SerializedName("StepId")
    @Expose
    private String StepId;

    /**
    * 步骤状态:0-默认值,1-成功,2-失败,3-执行中,4-未执行
    */
    @SerializedName("Status")
    @Expose
    private Integer Status;

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
     * 获取步骤英文标识
     * @return StepId 步骤英文标识
     */
    public String getStepId() {
        return this.StepId;
    }

    /**
     * 设置步骤英文标识
     * @param StepId 步骤英文标识
     */
    public void setStepId(String StepId) {
        this.StepId = StepId;
    }

    /**
     * 获取步骤状态:0-默认值,1-成功,2-失败,3-执行中,4-未执行
     * @return Status 步骤状态:0-默认值,1-成功,2-失败,3-执行中,4-未执行
     */
    public Integer getStatus() {
        return this.Status;
    }

    /**
     * 设置步骤状态:0-默认值,1-成功,2-失败,3-执行中,4-未执行
     * @param Status 步骤状态:0-默认值,1-成功,2-失败,3-执行中,4-未执行
     */
    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StepNo", this.StepNo);
        this.setParamSimple(map, prefix + "StepName", this.StepName);
        this.setParamSimple(map, prefix + "StepId", this.StepId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

