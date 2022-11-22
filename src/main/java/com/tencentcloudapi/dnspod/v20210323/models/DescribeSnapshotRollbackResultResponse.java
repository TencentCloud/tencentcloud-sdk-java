/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSnapshotRollbackResultResponse extends AbstractModel{

    /**
    * 快照所属域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 回滚剩余时间（分钟）
    */
    @SerializedName("LeftMinutes")
    @Expose
    private Long LeftMinutes;

    /**
    * 回滚进度百分比
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * 快照 ID
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
    * 回滚状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 快照回滚任务 ID
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 成功数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Success")
    @Expose
    private Long Success;

    /**
    * 失败数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Failed")
    @Expose
    private Long Failed;

    /**
    * 总数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 失败详细信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailedRecordList")
    @Expose
    private SnapshotRecord [] FailedRecordList;

    /**
    * 快照的下载地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CosUrl")
    @Expose
    private String CosUrl;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 快照所属域名 
     * @return Domain 快照所属域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 快照所属域名
     * @param Domain 快照所属域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 回滚剩余时间（分钟） 
     * @return LeftMinutes 回滚剩余时间（分钟）
     */
    public Long getLeftMinutes() {
        return this.LeftMinutes;
    }

    /**
     * Set 回滚剩余时间（分钟）
     * @param LeftMinutes 回滚剩余时间（分钟）
     */
    public void setLeftMinutes(Long LeftMinutes) {
        this.LeftMinutes = LeftMinutes;
    }

    /**
     * Get 回滚进度百分比 
     * @return Progress 回滚进度百分比
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set 回滚进度百分比
     * @param Progress 回滚进度百分比
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 快照 ID 
     * @return SnapshotId 快照 ID
     */
    public String getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set 快照 ID
     * @param SnapshotId 快照 ID
     */
    public void setSnapshotId(String SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * Get 回滚状态 
     * @return Status 回滚状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 回滚状态
     * @param Status 回滚状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 快照回滚任务 ID 
     * @return TaskId 快照回滚任务 ID
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 快照回滚任务 ID
     * @param TaskId 快照回滚任务 ID
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 成功数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Success 成功数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSuccess() {
        return this.Success;
    }

    /**
     * Set 成功数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param Success 成功数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuccess(Long Success) {
        this.Success = Success;
    }

    /**
     * Get 失败数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Failed 失败数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFailed() {
        return this.Failed;
    }

    /**
     * Set 失败数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param Failed 失败数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailed(Long Failed) {
        this.Failed = Failed;
    }

    /**
     * Get 总数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Total 总数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 总数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param Total 总数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 失败详细信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailedRecordList 失败详细信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SnapshotRecord [] getFailedRecordList() {
        return this.FailedRecordList;
    }

    /**
     * Set 失败详细信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailedRecordList 失败详细信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailedRecordList(SnapshotRecord [] FailedRecordList) {
        this.FailedRecordList = FailedRecordList;
    }

    /**
     * Get 快照的下载地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CosUrl 快照的下载地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCosUrl() {
        return this.CosUrl;
    }

    /**
     * Set 快照的下载地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param CosUrl 快照的下载地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCosUrl(String CosUrl) {
        this.CosUrl = CosUrl;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeSnapshotRollbackResultResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSnapshotRollbackResultResponse(DescribeSnapshotRollbackResultResponse source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.LeftMinutes != null) {
            this.LeftMinutes = new Long(source.LeftMinutes);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.SnapshotId != null) {
            this.SnapshotId = new String(source.SnapshotId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.Success != null) {
            this.Success = new Long(source.Success);
        }
        if (source.Failed != null) {
            this.Failed = new Long(source.Failed);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.FailedRecordList != null) {
            this.FailedRecordList = new SnapshotRecord[source.FailedRecordList.length];
            for (int i = 0; i < source.FailedRecordList.length; i++) {
                this.FailedRecordList[i] = new SnapshotRecord(source.FailedRecordList[i]);
            }
        }
        if (source.CosUrl != null) {
            this.CosUrl = new String(source.CosUrl);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "LeftMinutes", this.LeftMinutes);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "SnapshotId", this.SnapshotId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Success", this.Success);
        this.setParamSimple(map, prefix + "Failed", this.Failed);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "FailedRecordList.", this.FailedRecordList);
        this.setParamSimple(map, prefix + "CosUrl", this.CosUrl);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

