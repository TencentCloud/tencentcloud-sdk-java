package com.tencentcloudapi.bm.v20180423.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class TaskOperationLog  extends AbstractModel{


    /**
    * 操作步骤
    */
    @SerializedName("TaskStep")
    @Expose
    private String TaskStep;

    /**
    * 操作人
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 操作描述
    */
    @SerializedName("OperationDetail")
    @Expose
    private String OperationDetail;

    /**
    * 操作时间
    */
    @SerializedName("OperationTime")
    @Expose
    private String OperationTime;

    /**
     * 获取操作步骤
     * @return TaskStep 操作步骤
     */
    public String getTaskStep() {
        return this.TaskStep;
    }

    /**
     * 设置操作步骤
     * @param TaskStep 操作步骤
     */
    public void setTaskStep(String TaskStep) {
        this.TaskStep = TaskStep;
    }

    /**
     * 获取操作人
     * @return Operator 操作人
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * 设置操作人
     * @param Operator 操作人
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * 获取操作描述
     * @return OperationDetail 操作描述
     */
    public String getOperationDetail() {
        return this.OperationDetail;
    }

    /**
     * 设置操作描述
     * @param OperationDetail 操作描述
     */
    public void setOperationDetail(String OperationDetail) {
        this.OperationDetail = OperationDetail;
    }

    /**
     * 获取操作时间
     * @return OperationTime 操作时间
     */
    public String getOperationTime() {
        return this.OperationTime;
    }

    /**
     * 设置操作时间
     * @param OperationTime 操作时间
     */
    public void setOperationTime(String OperationTime) {
        this.OperationTime = OperationTime;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskStep", this.TaskStep);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "OperationDetail", this.OperationDetail);
        this.setParamSimple(map, prefix + "OperationTime", this.OperationTime);

    }
}

