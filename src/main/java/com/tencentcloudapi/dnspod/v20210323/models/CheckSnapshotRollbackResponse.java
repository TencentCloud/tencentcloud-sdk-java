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

public class CheckSnapshotRollbackResponse extends AbstractModel{

    /**
    * 快照记录 ID
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
    * 回滚时长（分钟）
    */
    @SerializedName("CostMinutes")
    @Expose
    private Long CostMinutes;

    /**
    * 快照所属域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 解析记录总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 值为 1，表示超时
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * 检查失败数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Failed")
    @Expose
    private Long Failed;

    /**
    * 失败记录信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailedRecordList")
    @Expose
    private SnapshotRecord [] FailedRecordList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 快照记录 ID 
     * @return SnapshotId 快照记录 ID
     */
    public String getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set 快照记录 ID
     * @param SnapshotId 快照记录 ID
     */
    public void setSnapshotId(String SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * Get 回滚时长（分钟） 
     * @return CostMinutes 回滚时长（分钟）
     */
    public Long getCostMinutes() {
        return this.CostMinutes;
    }

    /**
     * Set 回滚时长（分钟）
     * @param CostMinutes 回滚时长（分钟）
     */
    public void setCostMinutes(Long CostMinutes) {
        this.CostMinutes = CostMinutes;
    }

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
     * Get 解析记录总数 
     * @return Total 解析记录总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 解析记录总数
     * @param Total 解析记录总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 值为 1，表示超时
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Timeout 值为 1，表示超时
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set 值为 1，表示超时
注意：此字段可能返回 null，表示取不到有效值。
     * @param Timeout 值为 1，表示超时
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get 检查失败数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Failed 检查失败数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFailed() {
        return this.Failed;
    }

    /**
     * Set 检查失败数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param Failed 检查失败数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailed(Long Failed) {
        this.Failed = Failed;
    }

    /**
     * Get 失败记录信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailedRecordList 失败记录信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SnapshotRecord [] getFailedRecordList() {
        return this.FailedRecordList;
    }

    /**
     * Set 失败记录信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailedRecordList 失败记录信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailedRecordList(SnapshotRecord [] FailedRecordList) {
        this.FailedRecordList = FailedRecordList;
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

    public CheckSnapshotRollbackResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckSnapshotRollbackResponse(CheckSnapshotRollbackResponse source) {
        if (source.SnapshotId != null) {
            this.SnapshotId = new String(source.SnapshotId);
        }
        if (source.CostMinutes != null) {
            this.CostMinutes = new Long(source.CostMinutes);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.Failed != null) {
            this.Failed = new Long(source.Failed);
        }
        if (source.FailedRecordList != null) {
            this.FailedRecordList = new SnapshotRecord[source.FailedRecordList.length];
            for (int i = 0; i < source.FailedRecordList.length; i++) {
                this.FailedRecordList[i] = new SnapshotRecord(source.FailedRecordList[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SnapshotId", this.SnapshotId);
        this.setParamSimple(map, prefix + "CostMinutes", this.CostMinutes);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "Failed", this.Failed);
        this.setParamArrayObj(map, prefix + "FailedRecordList.", this.FailedRecordList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

