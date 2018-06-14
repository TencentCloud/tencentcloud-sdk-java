package com.tencentcloudapi.batch.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class TaskMetrics  extends AbstractModel{


    /**
    * Submitted个数
    */
    @SerializedName("SubmittedCount")
    @Expose
    private Integer SubmittedCount;

    /**
    * Pending个数
    */
    @SerializedName("PendingCount")
    @Expose
    private Integer PendingCount;

    /**
    * Runnable个数
    */
    @SerializedName("RunnableCount")
    @Expose
    private Integer RunnableCount;

    /**
    * Starting个数
    */
    @SerializedName("StartingCount")
    @Expose
    private Integer StartingCount;

    /**
    * Running个数
    */
    @SerializedName("RunningCount")
    @Expose
    private Integer RunningCount;

    /**
    * Succeed个数
    */
    @SerializedName("SucceedCount")
    @Expose
    private Integer SucceedCount;

    /**
    * FailedInterrupted个数
    */
    @SerializedName("FailedInterruptedCount")
    @Expose
    private Integer FailedInterruptedCount;

    /**
    * Failed个数
    */
    @SerializedName("FailedCount")
    @Expose
    private Integer FailedCount;

    /**
     * 获取Submitted个数
     * @return SubmittedCount Submitted个数
     */
    public Integer getSubmittedCount() {
        return this.SubmittedCount;
    }

    /**
     * 设置Submitted个数
     * @param SubmittedCount Submitted个数
     */
    public void setSubmittedCount(Integer SubmittedCount) {
        this.SubmittedCount = SubmittedCount;
    }

    /**
     * 获取Pending个数
     * @return PendingCount Pending个数
     */
    public Integer getPendingCount() {
        return this.PendingCount;
    }

    /**
     * 设置Pending个数
     * @param PendingCount Pending个数
     */
    public void setPendingCount(Integer PendingCount) {
        this.PendingCount = PendingCount;
    }

    /**
     * 获取Runnable个数
     * @return RunnableCount Runnable个数
     */
    public Integer getRunnableCount() {
        return this.RunnableCount;
    }

    /**
     * 设置Runnable个数
     * @param RunnableCount Runnable个数
     */
    public void setRunnableCount(Integer RunnableCount) {
        this.RunnableCount = RunnableCount;
    }

    /**
     * 获取Starting个数
     * @return StartingCount Starting个数
     */
    public Integer getStartingCount() {
        return this.StartingCount;
    }

    /**
     * 设置Starting个数
     * @param StartingCount Starting个数
     */
    public void setStartingCount(Integer StartingCount) {
        this.StartingCount = StartingCount;
    }

    /**
     * 获取Running个数
     * @return RunningCount Running个数
     */
    public Integer getRunningCount() {
        return this.RunningCount;
    }

    /**
     * 设置Running个数
     * @param RunningCount Running个数
     */
    public void setRunningCount(Integer RunningCount) {
        this.RunningCount = RunningCount;
    }

    /**
     * 获取Succeed个数
     * @return SucceedCount Succeed个数
     */
    public Integer getSucceedCount() {
        return this.SucceedCount;
    }

    /**
     * 设置Succeed个数
     * @param SucceedCount Succeed个数
     */
    public void setSucceedCount(Integer SucceedCount) {
        this.SucceedCount = SucceedCount;
    }

    /**
     * 获取FailedInterrupted个数
     * @return FailedInterruptedCount FailedInterrupted个数
     */
    public Integer getFailedInterruptedCount() {
        return this.FailedInterruptedCount;
    }

    /**
     * 设置FailedInterrupted个数
     * @param FailedInterruptedCount FailedInterrupted个数
     */
    public void setFailedInterruptedCount(Integer FailedInterruptedCount) {
        this.FailedInterruptedCount = FailedInterruptedCount;
    }

    /**
     * 获取Failed个数
     * @return FailedCount Failed个数
     */
    public Integer getFailedCount() {
        return this.FailedCount;
    }

    /**
     * 设置Failed个数
     * @param FailedCount Failed个数
     */
    public void setFailedCount(Integer FailedCount) {
        this.FailedCount = FailedCount;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubmittedCount", this.SubmittedCount);
        this.setParamSimple(map, prefix + "PendingCount", this.PendingCount);
        this.setParamSimple(map, prefix + "RunnableCount", this.RunnableCount);
        this.setParamSimple(map, prefix + "StartingCount", this.StartingCount);
        this.setParamSimple(map, prefix + "RunningCount", this.RunningCount);
        this.setParamSimple(map, prefix + "SucceedCount", this.SucceedCount);
        this.setParamSimple(map, prefix + "FailedInterruptedCount", this.FailedInterruptedCount);
        this.setParamSimple(map, prefix + "FailedCount", this.FailedCount);

    }
}

