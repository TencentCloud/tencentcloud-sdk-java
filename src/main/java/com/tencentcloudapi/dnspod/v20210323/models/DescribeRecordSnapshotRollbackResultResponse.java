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

public class DescribeRecordSnapshotRollbackResultResponse extends AbstractModel{

    /**
    * 回滚任务 ID
    */
    @SerializedName("JobId")
    @Expose
    private Long JobId;

    /**
    * 回滚状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 失败的记录信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailedRecordList")
    @Expose
    private SnapshotRecord [] FailedRecordList;

    /**
    * 所属域名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 回滚进度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * 回滚剩余时间（单位：分钟）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LeftMinutes")
    @Expose
    private Long LeftMinutes;

    /**
    * 总记录数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 失败记录数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Failed")
    @Expose
    private Long Failed;

    /**
    * 成功记录数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Success")
    @Expose
    private Long Success;

    /**
    * 快照下载地址
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
     * Get 回滚任务 ID 
     * @return JobId 回滚任务 ID
     */
    public Long getJobId() {
        return this.JobId;
    }

    /**
     * Set 回滚任务 ID
     * @param JobId 回滚任务 ID
     */
    public void setJobId(Long JobId) {
        this.JobId = JobId;
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
     * Get 失败的记录信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailedRecordList 失败的记录信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SnapshotRecord [] getFailedRecordList() {
        return this.FailedRecordList;
    }

    /**
     * Set 失败的记录信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailedRecordList 失败的记录信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailedRecordList(SnapshotRecord [] FailedRecordList) {
        this.FailedRecordList = FailedRecordList;
    }

    /**
     * Get 所属域名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Domain 所属域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 所属域名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Domain 所属域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 回滚进度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Progress 回滚进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set 回滚进度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Progress 回滚进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 回滚剩余时间（单位：分钟）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LeftMinutes 回滚剩余时间（单位：分钟）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLeftMinutes() {
        return this.LeftMinutes;
    }

    /**
     * Set 回滚剩余时间（单位：分钟）
注意：此字段可能返回 null，表示取不到有效值。
     * @param LeftMinutes 回滚剩余时间（单位：分钟）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLeftMinutes(Long LeftMinutes) {
        this.LeftMinutes = LeftMinutes;
    }

    /**
     * Get 总记录数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Total 总记录数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 总记录数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Total 总记录数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 失败记录数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Failed 失败记录数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFailed() {
        return this.Failed;
    }

    /**
     * Set 失败记录数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Failed 失败记录数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailed(Long Failed) {
        this.Failed = Failed;
    }

    /**
     * Get 成功记录数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Success 成功记录数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSuccess() {
        return this.Success;
    }

    /**
     * Set 成功记录数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Success 成功记录数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuccess(Long Success) {
        this.Success = Success;
    }

    /**
     * Get 快照下载地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CosUrl 快照下载地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCosUrl() {
        return this.CosUrl;
    }

    /**
     * Set 快照下载地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param CosUrl 快照下载地址
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

    public DescribeRecordSnapshotRollbackResultResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRecordSnapshotRollbackResultResponse(DescribeRecordSnapshotRollbackResultResponse source) {
        if (source.JobId != null) {
            this.JobId = new Long(source.JobId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.FailedRecordList != null) {
            this.FailedRecordList = new SnapshotRecord[source.FailedRecordList.length];
            for (int i = 0; i < source.FailedRecordList.length; i++) {
                this.FailedRecordList[i] = new SnapshotRecord(source.FailedRecordList[i]);
            }
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.LeftMinutes != null) {
            this.LeftMinutes = new Long(source.LeftMinutes);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Failed != null) {
            this.Failed = new Long(source.Failed);
        }
        if (source.Success != null) {
            this.Success = new Long(source.Success);
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
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "FailedRecordList.", this.FailedRecordList);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "LeftMinutes", this.LeftMinutes);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Failed", this.Failed);
        this.setParamSimple(map, prefix + "Success", this.Success);
        this.setParamSimple(map, prefix + "CosUrl", this.CosUrl);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

