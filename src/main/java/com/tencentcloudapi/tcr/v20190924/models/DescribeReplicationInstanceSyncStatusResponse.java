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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeReplicationInstanceSyncStatusResponse extends AbstractModel{

    /**
    * 同步状态
    */
    @SerializedName("ReplicationStatus")
    @Expose
    private String ReplicationStatus;

    /**
    * 同步完成时间
    */
    @SerializedName("ReplicationTime")
    @Expose
    private String ReplicationTime;

    /**
    * 同步日志
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReplicationLog")
    @Expose
    private ReplicationLog ReplicationLog;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 同步状态 
     * @return ReplicationStatus 同步状态
     */
    public String getReplicationStatus() {
        return this.ReplicationStatus;
    }

    /**
     * Set 同步状态
     * @param ReplicationStatus 同步状态
     */
    public void setReplicationStatus(String ReplicationStatus) {
        this.ReplicationStatus = ReplicationStatus;
    }

    /**
     * Get 同步完成时间 
     * @return ReplicationTime 同步完成时间
     */
    public String getReplicationTime() {
        return this.ReplicationTime;
    }

    /**
     * Set 同步完成时间
     * @param ReplicationTime 同步完成时间
     */
    public void setReplicationTime(String ReplicationTime) {
        this.ReplicationTime = ReplicationTime;
    }

    /**
     * Get 同步日志
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReplicationLog 同步日志
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ReplicationLog getReplicationLog() {
        return this.ReplicationLog;
    }

    /**
     * Set 同步日志
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReplicationLog 同步日志
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReplicationLog(ReplicationLog ReplicationLog) {
        this.ReplicationLog = ReplicationLog;
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

    public DescribeReplicationInstanceSyncStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeReplicationInstanceSyncStatusResponse(DescribeReplicationInstanceSyncStatusResponse source) {
        if (source.ReplicationStatus != null) {
            this.ReplicationStatus = new String(source.ReplicationStatus);
        }
        if (source.ReplicationTime != null) {
            this.ReplicationTime = new String(source.ReplicationTime);
        }
        if (source.ReplicationLog != null) {
            this.ReplicationLog = new ReplicationLog(source.ReplicationLog);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReplicationStatus", this.ReplicationStatus);
        this.setParamSimple(map, prefix + "ReplicationTime", this.ReplicationTime);
        this.setParamObj(map, prefix + "ReplicationLog.", this.ReplicationLog);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

