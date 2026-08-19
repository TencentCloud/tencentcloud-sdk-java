/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaselineMainTask extends AbstractModel {

    /**
    * <p>主任务对应的全局任务 ID。</p>
    */
    @SerializedName("JobID")
    @Expose
    private String JobID;

    /**
    * <p>主任务 ID。</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>主任务状态。取值：</p><ul><li>INIT：初始化</li><li>SUBTASK_CREATING：子任务创建中</li><li>SCANNING：扫描中</li><li>TIMEOUT：超时</li><li>USER_CANCELED：用户取消</li><li>ALL_FAILED：全部失败</li><li>SUCCESS：成功</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>主任务所属租户 Appid。</p>
    */
    @SerializedName("Appid")
    @Expose
    private Long Appid;

    /**
    * <p>主任务类型。取值：</p><ul><li>ONE_SHOT：一键策略扫描（手动触发）</li><li>PERIODIC：周期扫描（按 CycleScanConf 自动触发）</li><li>OTHER：其他分散扫描（资产维度等触发）</li></ul>
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * <p>主任务开始执行时间。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>主任务结束时间，未结束时为空。</p>
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * <p>检测资产大类，区分主机基线与容器集群基线。取值：</p><ul><li>HOST：主机</li><li>CLUSTER：容器集群</li></ul>
    */
    @SerializedName("CheckAssetType")
    @Expose
    private String CheckAssetType;

    /**
    * <p>失败错误码，成功时为空。</p>
    */
    @SerializedName("ErrCode")
    @Expose
    private String ErrCode;

    /**
    * <p>失败原因，成功时为空。</p>
    */
    @SerializedName("ErrMessage")
    @Expose
    private String ErrMessage;

    /**
    * <p>解决方案（根据 ErrCode 映射，成功时为空）</p>
    */
    @SerializedName("Solution")
    @Expose
    private String Solution;

    /**
    * <p>扫描成功的资产数量。</p>
    */
    @SerializedName("ScanSuccessCount")
    @Expose
    private Long ScanSuccessCount;

    /**
    * <p>扫描失败的资产数量。</p>
    */
    @SerializedName("ScanFailedCount")
    @Expose
    private Long ScanFailedCount;

    /**
    * <p>子任务总数</p>
    */
    @SerializedName("ScanTotalCount")
    @Expose
    private Long ScanTotalCount;

    /**
     * Get <p>主任务对应的全局任务 ID。</p> 
     * @return JobID <p>主任务对应的全局任务 ID。</p>
     */
    public String getJobID() {
        return this.JobID;
    }

    /**
     * Set <p>主任务对应的全局任务 ID。</p>
     * @param JobID <p>主任务对应的全局任务 ID。</p>
     */
    public void setJobID(String JobID) {
        this.JobID = JobID;
    }

    /**
     * Get <p>主任务 ID。</p> 
     * @return ID <p>主任务 ID。</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>主任务 ID。</p>
     * @param ID <p>主任务 ID。</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>主任务状态。取值：</p><ul><li>INIT：初始化</li><li>SUBTASK_CREATING：子任务创建中</li><li>SCANNING：扫描中</li><li>TIMEOUT：超时</li><li>USER_CANCELED：用户取消</li><li>ALL_FAILED：全部失败</li><li>SUCCESS：成功</li></ul> 
     * @return Status <p>主任务状态。取值：</p><ul><li>INIT：初始化</li><li>SUBTASK_CREATING：子任务创建中</li><li>SCANNING：扫描中</li><li>TIMEOUT：超时</li><li>USER_CANCELED：用户取消</li><li>ALL_FAILED：全部失败</li><li>SUCCESS：成功</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>主任务状态。取值：</p><ul><li>INIT：初始化</li><li>SUBTASK_CREATING：子任务创建中</li><li>SCANNING：扫描中</li><li>TIMEOUT：超时</li><li>USER_CANCELED：用户取消</li><li>ALL_FAILED：全部失败</li><li>SUCCESS：成功</li></ul>
     * @param Status <p>主任务状态。取值：</p><ul><li>INIT：初始化</li><li>SUBTASK_CREATING：子任务创建中</li><li>SCANNING：扫描中</li><li>TIMEOUT：超时</li><li>USER_CANCELED：用户取消</li><li>ALL_FAILED：全部失败</li><li>SUCCESS：成功</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>主任务所属租户 Appid。</p> 
     * @return Appid <p>主任务所属租户 Appid。</p>
     */
    public Long getAppid() {
        return this.Appid;
    }

    /**
     * Set <p>主任务所属租户 Appid。</p>
     * @param Appid <p>主任务所属租户 Appid。</p>
     */
    public void setAppid(Long Appid) {
        this.Appid = Appid;
    }

    /**
     * Get <p>主任务类型。取值：</p><ul><li>ONE_SHOT：一键策略扫描（手动触发）</li><li>PERIODIC：周期扫描（按 CycleScanConf 自动触发）</li><li>OTHER：其他分散扫描（资产维度等触发）</li></ul> 
     * @return TaskType <p>主任务类型。取值：</p><ul><li>ONE_SHOT：一键策略扫描（手动触发）</li><li>PERIODIC：周期扫描（按 CycleScanConf 自动触发）</li><li>OTHER：其他分散扫描（资产维度等触发）</li></ul>
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>主任务类型。取值：</p><ul><li>ONE_SHOT：一键策略扫描（手动触发）</li><li>PERIODIC：周期扫描（按 CycleScanConf 自动触发）</li><li>OTHER：其他分散扫描（资产维度等触发）</li></ul>
     * @param TaskType <p>主任务类型。取值：</p><ul><li>ONE_SHOT：一键策略扫描（手动触发）</li><li>PERIODIC：周期扫描（按 CycleScanConf 自动触发）</li><li>OTHER：其他分散扫描（资产维度等触发）</li></ul>
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get <p>主任务开始执行时间。</p> 
     * @return StartTime <p>主任务开始执行时间。</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>主任务开始执行时间。</p>
     * @param StartTime <p>主任务开始执行时间。</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>主任务结束时间，未结束时为空。</p> 
     * @return FinishTime <p>主任务结束时间，未结束时为空。</p>
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set <p>主任务结束时间，未结束时为空。</p>
     * @param FinishTime <p>主任务结束时间，未结束时为空。</p>
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get <p>检测资产大类，区分主机基线与容器集群基线。取值：</p><ul><li>HOST：主机</li><li>CLUSTER：容器集群</li></ul> 
     * @return CheckAssetType <p>检测资产大类，区分主机基线与容器集群基线。取值：</p><ul><li>HOST：主机</li><li>CLUSTER：容器集群</li></ul>
     */
    public String getCheckAssetType() {
        return this.CheckAssetType;
    }

    /**
     * Set <p>检测资产大类，区分主机基线与容器集群基线。取值：</p><ul><li>HOST：主机</li><li>CLUSTER：容器集群</li></ul>
     * @param CheckAssetType <p>检测资产大类，区分主机基线与容器集群基线。取值：</p><ul><li>HOST：主机</li><li>CLUSTER：容器集群</li></ul>
     */
    public void setCheckAssetType(String CheckAssetType) {
        this.CheckAssetType = CheckAssetType;
    }

    /**
     * Get <p>失败错误码，成功时为空。</p> 
     * @return ErrCode <p>失败错误码，成功时为空。</p>
     */
    public String getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set <p>失败错误码，成功时为空。</p>
     * @param ErrCode <p>失败错误码，成功时为空。</p>
     */
    public void setErrCode(String ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get <p>失败原因，成功时为空。</p> 
     * @return ErrMessage <p>失败原因，成功时为空。</p>
     */
    public String getErrMessage() {
        return this.ErrMessage;
    }

    /**
     * Set <p>失败原因，成功时为空。</p>
     * @param ErrMessage <p>失败原因，成功时为空。</p>
     */
    public void setErrMessage(String ErrMessage) {
        this.ErrMessage = ErrMessage;
    }

    /**
     * Get <p>解决方案（根据 ErrCode 映射，成功时为空）</p> 
     * @return Solution <p>解决方案（根据 ErrCode 映射，成功时为空）</p>
     */
    public String getSolution() {
        return this.Solution;
    }

    /**
     * Set <p>解决方案（根据 ErrCode 映射，成功时为空）</p>
     * @param Solution <p>解决方案（根据 ErrCode 映射，成功时为空）</p>
     */
    public void setSolution(String Solution) {
        this.Solution = Solution;
    }

    /**
     * Get <p>扫描成功的资产数量。</p> 
     * @return ScanSuccessCount <p>扫描成功的资产数量。</p>
     */
    public Long getScanSuccessCount() {
        return this.ScanSuccessCount;
    }

    /**
     * Set <p>扫描成功的资产数量。</p>
     * @param ScanSuccessCount <p>扫描成功的资产数量。</p>
     */
    public void setScanSuccessCount(Long ScanSuccessCount) {
        this.ScanSuccessCount = ScanSuccessCount;
    }

    /**
     * Get <p>扫描失败的资产数量。</p> 
     * @return ScanFailedCount <p>扫描失败的资产数量。</p>
     */
    public Long getScanFailedCount() {
        return this.ScanFailedCount;
    }

    /**
     * Set <p>扫描失败的资产数量。</p>
     * @param ScanFailedCount <p>扫描失败的资产数量。</p>
     */
    public void setScanFailedCount(Long ScanFailedCount) {
        this.ScanFailedCount = ScanFailedCount;
    }

    /**
     * Get <p>子任务总数</p> 
     * @return ScanTotalCount <p>子任务总数</p>
     */
    public Long getScanTotalCount() {
        return this.ScanTotalCount;
    }

    /**
     * Set <p>子任务总数</p>
     * @param ScanTotalCount <p>子任务总数</p>
     */
    public void setScanTotalCount(Long ScanTotalCount) {
        this.ScanTotalCount = ScanTotalCount;
    }

    public BaselineMainTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineMainTask(BaselineMainTask source) {
        if (source.JobID != null) {
            this.JobID = new String(source.JobID);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Appid != null) {
            this.Appid = new Long(source.Appid);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new String(source.FinishTime);
        }
        if (source.CheckAssetType != null) {
            this.CheckAssetType = new String(source.CheckAssetType);
        }
        if (source.ErrCode != null) {
            this.ErrCode = new String(source.ErrCode);
        }
        if (source.ErrMessage != null) {
            this.ErrMessage = new String(source.ErrMessage);
        }
        if (source.Solution != null) {
            this.Solution = new String(source.Solution);
        }
        if (source.ScanSuccessCount != null) {
            this.ScanSuccessCount = new Long(source.ScanSuccessCount);
        }
        if (source.ScanFailedCount != null) {
            this.ScanFailedCount = new Long(source.ScanFailedCount);
        }
        if (source.ScanTotalCount != null) {
            this.ScanTotalCount = new Long(source.ScanTotalCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobID", this.JobID);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Appid", this.Appid);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);
        this.setParamSimple(map, prefix + "CheckAssetType", this.CheckAssetType);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "ErrMessage", this.ErrMessage);
        this.setParamSimple(map, prefix + "Solution", this.Solution);
        this.setParamSimple(map, prefix + "ScanSuccessCount", this.ScanSuccessCount);
        this.setParamSimple(map, prefix + "ScanFailedCount", this.ScanFailedCount);
        this.setParamSimple(map, prefix + "ScanTotalCount", this.ScanTotalCount);

    }
}

