package com.tencentcloudapi.dts.v20180330.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class SyncStepDetailInfo  extends AbstractModel{


    /**
    * 步骤编号
    */
    @SerializedName("StepNo")
    @Expose
    private Integer StepNo;

    /**
    * 步骤名
    */
    @SerializedName("StepName")
    @Expose
    private String StepName;

    /**
    * 能否中止
    */
    @SerializedName("CanStop")
    @Expose
    private Integer CanStop;

    /**
    * 步骤号
    */
    @SerializedName("StepId")
    @Expose
    private Integer StepId;

    /**
     * 获取步骤编号
     * @return StepNo 步骤编号
     */
    public Integer getStepNo() {
        return this.StepNo;
    }

    /**
     * 设置步骤编号
     * @param StepNo 步骤编号
     */
    public void setStepNo(Integer StepNo) {
        this.StepNo = StepNo;
    }

    /**
     * 获取步骤名
     * @return StepName 步骤名
     */
    public String getStepName() {
        return this.StepName;
    }

    /**
     * 设置步骤名
     * @param StepName 步骤名
     */
    public void setStepName(String StepName) {
        this.StepName = StepName;
    }

    /**
     * 获取能否中止
     * @return CanStop 能否中止
     */
    public Integer getCanStop() {
        return this.CanStop;
    }

    /**
     * 设置能否中止
     * @param CanStop 能否中止
     */
    public void setCanStop(Integer CanStop) {
        this.CanStop = CanStop;
    }

    /**
     * 获取步骤号
     * @return StepId 步骤号
     */
    public Integer getStepId() {
        return this.StepId;
    }

    /**
     * 设置步骤号
     * @param StepId 步骤号
     */
    public void setStepId(Integer StepId) {
        this.StepId = StepId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StepNo", this.StepNo);
        this.setParamSimple(map, prefix + "StepName", this.StepName);
        this.setParamSimple(map, prefix + "CanStop", this.CanStop);
        this.setParamSimple(map, prefix + "StepId", this.StepId);

    }
}

