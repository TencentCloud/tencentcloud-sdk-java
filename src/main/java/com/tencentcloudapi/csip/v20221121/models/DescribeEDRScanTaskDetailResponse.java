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

public class DescribeEDRScanTaskDetailResponse extends AbstractModel {

    /**
    * <p>任务ID</p>
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * <p>任务名称</p>
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * <p>整体状态：WAIT/SCANNING/FINISHED/FAILED/CANCELED/TERMINATED/TIMEOUT</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>任务类型：HOST/CONTAINER</p>
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * <p>触发方式：MANUAL/CYCLE</p>
    */
    @SerializedName("TriggerType")
    @Expose
    private String TriggerType;

    /**
    * <p>任务开始时间</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>任务结束时间</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>检测模式：full/quick/include/exclude</p>
    */
    @SerializedName("ScanType")
    @Expose
    private String ScanType;

    /**
    * <p>自选路径列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomPaths")
    @Expose
    private String [] CustomPaths;

    /**
    * <p>超时时间（秒）</p>
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * <p>是否开启深度检测：0-否/1-是</p>
    */
    @SerializedName("EnableMemShellScan")
    @Expose
    private Long EnableMemShellScan;

    /**
    * <p>创建者账号AppId</p>
    */
    @SerializedName("CreateAppID")
    @Expose
    private Long CreateAppID;

    /**
    * <p>任务创建者账号名称（后端富化）</p>
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * <p>创建者云类型</p>
    */
    @SerializedName("CloudType")
    @Expose
    private Long CloudType;

    /**
    * <p>任务总资产数</p>
    */
    @SerializedName("TotalAssetCount")
    @Expose
    private Long TotalAssetCount;

    /**
    * <p>已完成资产数</p>
    */
    @SerializedName("FinishedAssetCount")
    @Expose
    private Long FinishedAssetCount;

    /**
    * <p>风险资产数</p>
    */
    @SerializedName("RiskAssetCount")
    @Expose
    private Long RiskAssetCount;

    /**
    * <p>主机资产列表（TaskType=HOST时有值）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostList")
    @Expose
    private EDRScanTaskHostItem [] HostList;

    /**
    * <p>容器资产列表（TaskType=CONTAINER时有值）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContainerList")
    @Expose
    private EDRScanTaskContainerItem [] ContainerList;

    /**
    * <p>当前筛选条件下资产列表总条数</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>任务ID</p> 
     * @return TaskId <p>任务ID</p>
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务ID</p>
     * @param TaskId <p>任务ID</p>
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>任务名称</p> 
     * @return TaskName <p>任务名称</p>
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set <p>任务名称</p>
     * @param TaskName <p>任务名称</p>
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get <p>整体状态：WAIT/SCANNING/FINISHED/FAILED/CANCELED/TERMINATED/TIMEOUT</p> 
     * @return Status <p>整体状态：WAIT/SCANNING/FINISHED/FAILED/CANCELED/TERMINATED/TIMEOUT</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>整体状态：WAIT/SCANNING/FINISHED/FAILED/CANCELED/TERMINATED/TIMEOUT</p>
     * @param Status <p>整体状态：WAIT/SCANNING/FINISHED/FAILED/CANCELED/TERMINATED/TIMEOUT</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>任务类型：HOST/CONTAINER</p> 
     * @return TaskType <p>任务类型：HOST/CONTAINER</p>
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>任务类型：HOST/CONTAINER</p>
     * @param TaskType <p>任务类型：HOST/CONTAINER</p>
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get <p>触发方式：MANUAL/CYCLE</p> 
     * @return TriggerType <p>触发方式：MANUAL/CYCLE</p>
     */
    public String getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set <p>触发方式：MANUAL/CYCLE</p>
     * @param TriggerType <p>触发方式：MANUAL/CYCLE</p>
     */
    public void setTriggerType(String TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get <p>任务开始时间</p> 
     * @return StartTime <p>任务开始时间</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>任务开始时间</p>
     * @param StartTime <p>任务开始时间</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>任务结束时间</p> 
     * @return EndTime <p>任务结束时间</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>任务结束时间</p>
     * @param EndTime <p>任务结束时间</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>检测模式：full/quick/include/exclude</p> 
     * @return ScanType <p>检测模式：full/quick/include/exclude</p>
     */
    public String getScanType() {
        return this.ScanType;
    }

    /**
     * Set <p>检测模式：full/quick/include/exclude</p>
     * @param ScanType <p>检测模式：full/quick/include/exclude</p>
     */
    public void setScanType(String ScanType) {
        this.ScanType = ScanType;
    }

    /**
     * Get <p>自选路径列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomPaths <p>自选路径列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getCustomPaths() {
        return this.CustomPaths;
    }

    /**
     * Set <p>自选路径列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomPaths <p>自选路径列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomPaths(String [] CustomPaths) {
        this.CustomPaths = CustomPaths;
    }

    /**
     * Get <p>超时时间（秒）</p> 
     * @return Timeout <p>超时时间（秒）</p>
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set <p>超时时间（秒）</p>
     * @param Timeout <p>超时时间（秒）</p>
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get <p>是否开启深度检测：0-否/1-是</p> 
     * @return EnableMemShellScan <p>是否开启深度检测：0-否/1-是</p>
     */
    public Long getEnableMemShellScan() {
        return this.EnableMemShellScan;
    }

    /**
     * Set <p>是否开启深度检测：0-否/1-是</p>
     * @param EnableMemShellScan <p>是否开启深度检测：0-否/1-是</p>
     */
    public void setEnableMemShellScan(Long EnableMemShellScan) {
        this.EnableMemShellScan = EnableMemShellScan;
    }

    /**
     * Get <p>创建者账号AppId</p> 
     * @return CreateAppID <p>创建者账号AppId</p>
     */
    public Long getCreateAppID() {
        return this.CreateAppID;
    }

    /**
     * Set <p>创建者账号AppId</p>
     * @param CreateAppID <p>创建者账号AppId</p>
     */
    public void setCreateAppID(Long CreateAppID) {
        this.CreateAppID = CreateAppID;
    }

    /**
     * Get <p>任务创建者账号名称（后端富化）</p> 
     * @return AccountName <p>任务创建者账号名称（后端富化）</p>
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set <p>任务创建者账号名称（后端富化）</p>
     * @param AccountName <p>任务创建者账号名称（后端富化）</p>
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get <p>创建者云类型</p> 
     * @return CloudType <p>创建者云类型</p>
     */
    public Long getCloudType() {
        return this.CloudType;
    }

    /**
     * Set <p>创建者云类型</p>
     * @param CloudType <p>创建者云类型</p>
     */
    public void setCloudType(Long CloudType) {
        this.CloudType = CloudType;
    }

    /**
     * Get <p>任务总资产数</p> 
     * @return TotalAssetCount <p>任务总资产数</p>
     */
    public Long getTotalAssetCount() {
        return this.TotalAssetCount;
    }

    /**
     * Set <p>任务总资产数</p>
     * @param TotalAssetCount <p>任务总资产数</p>
     */
    public void setTotalAssetCount(Long TotalAssetCount) {
        this.TotalAssetCount = TotalAssetCount;
    }

    /**
     * Get <p>已完成资产数</p> 
     * @return FinishedAssetCount <p>已完成资产数</p>
     */
    public Long getFinishedAssetCount() {
        return this.FinishedAssetCount;
    }

    /**
     * Set <p>已完成资产数</p>
     * @param FinishedAssetCount <p>已完成资产数</p>
     */
    public void setFinishedAssetCount(Long FinishedAssetCount) {
        this.FinishedAssetCount = FinishedAssetCount;
    }

    /**
     * Get <p>风险资产数</p> 
     * @return RiskAssetCount <p>风险资产数</p>
     */
    public Long getRiskAssetCount() {
        return this.RiskAssetCount;
    }

    /**
     * Set <p>风险资产数</p>
     * @param RiskAssetCount <p>风险资产数</p>
     */
    public void setRiskAssetCount(Long RiskAssetCount) {
        this.RiskAssetCount = RiskAssetCount;
    }

    /**
     * Get <p>主机资产列表（TaskType=HOST时有值）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostList <p>主机资产列表（TaskType=HOST时有值）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EDRScanTaskHostItem [] getHostList() {
        return this.HostList;
    }

    /**
     * Set <p>主机资产列表（TaskType=HOST时有值）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostList <p>主机资产列表（TaskType=HOST时有值）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostList(EDRScanTaskHostItem [] HostList) {
        this.HostList = HostList;
    }

    /**
     * Get <p>容器资产列表（TaskType=CONTAINER时有值）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContainerList <p>容器资产列表（TaskType=CONTAINER时有值）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EDRScanTaskContainerItem [] getContainerList() {
        return this.ContainerList;
    }

    /**
     * Set <p>容器资产列表（TaskType=CONTAINER时有值）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContainerList <p>容器资产列表（TaskType=CONTAINER时有值）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContainerList(EDRScanTaskContainerItem [] ContainerList) {
        this.ContainerList = ContainerList;
    }

    /**
     * Get <p>当前筛选条件下资产列表总条数</p> 
     * @return TotalCount <p>当前筛选条件下资产列表总条数</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>当前筛选条件下资产列表总条数</p>
     * @param TotalCount <p>当前筛选条件下资产列表总条数</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeEDRScanTaskDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEDRScanTaskDetailResponse(DescribeEDRScanTaskDetailResponse source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.TriggerType != null) {
            this.TriggerType = new String(source.TriggerType);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.ScanType != null) {
            this.ScanType = new String(source.ScanType);
        }
        if (source.CustomPaths != null) {
            this.CustomPaths = new String[source.CustomPaths.length];
            for (int i = 0; i < source.CustomPaths.length; i++) {
                this.CustomPaths[i] = new String(source.CustomPaths[i]);
            }
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.EnableMemShellScan != null) {
            this.EnableMemShellScan = new Long(source.EnableMemShellScan);
        }
        if (source.CreateAppID != null) {
            this.CreateAppID = new Long(source.CreateAppID);
        }
        if (source.AccountName != null) {
            this.AccountName = new String(source.AccountName);
        }
        if (source.CloudType != null) {
            this.CloudType = new Long(source.CloudType);
        }
        if (source.TotalAssetCount != null) {
            this.TotalAssetCount = new Long(source.TotalAssetCount);
        }
        if (source.FinishedAssetCount != null) {
            this.FinishedAssetCount = new Long(source.FinishedAssetCount);
        }
        if (source.RiskAssetCount != null) {
            this.RiskAssetCount = new Long(source.RiskAssetCount);
        }
        if (source.HostList != null) {
            this.HostList = new EDRScanTaskHostItem[source.HostList.length];
            for (int i = 0; i < source.HostList.length; i++) {
                this.HostList[i] = new EDRScanTaskHostItem(source.HostList[i]);
            }
        }
        if (source.ContainerList != null) {
            this.ContainerList = new EDRScanTaskContainerItem[source.ContainerList.length];
            for (int i = 0; i < source.ContainerList.length; i++) {
                this.ContainerList[i] = new EDRScanTaskContainerItem(source.ContainerList[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ScanType", this.ScanType);
        this.setParamArraySimple(map, prefix + "CustomPaths.", this.CustomPaths);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "EnableMemShellScan", this.EnableMemShellScan);
        this.setParamSimple(map, prefix + "CreateAppID", this.CreateAppID);
        this.setParamSimple(map, prefix + "AccountName", this.AccountName);
        this.setParamSimple(map, prefix + "CloudType", this.CloudType);
        this.setParamSimple(map, prefix + "TotalAssetCount", this.TotalAssetCount);
        this.setParamSimple(map, prefix + "FinishedAssetCount", this.FinishedAssetCount);
        this.setParamSimple(map, prefix + "RiskAssetCount", this.RiskAssetCount);
        this.setParamArrayObj(map, prefix + "HostList.", this.HostList);
        this.setParamArrayObj(map, prefix + "ContainerList.", this.ContainerList);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

