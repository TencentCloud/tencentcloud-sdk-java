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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Failures extends AbstractModel {

    /**
    * 备份失败的索引名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Index")
    @Expose
    private String Index;

    /**
    * 快照失败的分片号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShardId")
    @Expose
    private Long ShardId;

    /**
    * 快照失败的原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * 快照失败的状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 备份失败的索引名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Index 备份失败的索引名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIndex() {
        return this.Index;
    }

    /**
     * Set 备份失败的索引名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Index 备份失败的索引名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndex(String Index) {
        this.Index = Index;
    }

    /**
     * Get 快照失败的分片号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShardId 快照失败的分片号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getShardId() {
        return this.ShardId;
    }

    /**
     * Set 快照失败的分片号
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShardId 快照失败的分片号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShardId(Long ShardId) {
        this.ShardId = ShardId;
    }

    /**
     * Get 快照失败的原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Reason 快照失败的原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 快照失败的原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param Reason 快照失败的原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get 快照失败的状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 快照失败的状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 快照失败的状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 快照失败的状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public Failures() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Failures(Failures source) {
        if (source.Index != null) {
            this.Index = new String(source.Index);
        }
        if (source.ShardId != null) {
            this.ShardId = new Long(source.ShardId);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "ShardId", this.ShardId);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

