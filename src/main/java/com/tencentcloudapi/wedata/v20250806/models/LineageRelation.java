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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LineageRelation extends AbstractModel {

    /**
    * 关联ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RelationId")
    @Expose
    private String RelationId;

    /**
    * 源端唯一血缘ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceUniqueId")
    @Expose
    private String SourceUniqueId;

    /**
    * 目标端唯一血缘ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetUniqueId")
    @Expose
    private String TargetUniqueId;

    /**
    * 血缘加工过程
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Processes")
    @Expose
    private LineageProcess [] Processes;

    /**
     * Get 关联ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RelationId 关联ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRelationId() {
        return this.RelationId;
    }

    /**
     * Set 关联ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param RelationId 关联ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRelationId(String RelationId) {
        this.RelationId = RelationId;
    }

    /**
     * Get 源端唯一血缘ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceUniqueId 源端唯一血缘ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceUniqueId() {
        return this.SourceUniqueId;
    }

    /**
     * Set 源端唯一血缘ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceUniqueId 源端唯一血缘ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceUniqueId(String SourceUniqueId) {
        this.SourceUniqueId = SourceUniqueId;
    }

    /**
     * Get 目标端唯一血缘ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetUniqueId 目标端唯一血缘ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetUniqueId() {
        return this.TargetUniqueId;
    }

    /**
     * Set 目标端唯一血缘ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetUniqueId 目标端唯一血缘ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetUniqueId(String TargetUniqueId) {
        this.TargetUniqueId = TargetUniqueId;
    }

    /**
     * Get 血缘加工过程
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Processes 血缘加工过程
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LineageProcess [] getProcesses() {
        return this.Processes;
    }

    /**
     * Set 血缘加工过程
注意：此字段可能返回 null，表示取不到有效值。
     * @param Processes 血缘加工过程
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcesses(LineageProcess [] Processes) {
        this.Processes = Processes;
    }

    public LineageRelation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LineageRelation(LineageRelation source) {
        if (source.RelationId != null) {
            this.RelationId = new String(source.RelationId);
        }
        if (source.SourceUniqueId != null) {
            this.SourceUniqueId = new String(source.SourceUniqueId);
        }
        if (source.TargetUniqueId != null) {
            this.TargetUniqueId = new String(source.TargetUniqueId);
        }
        if (source.Processes != null) {
            this.Processes = new LineageProcess[source.Processes.length];
            for (int i = 0; i < source.Processes.length; i++) {
                this.Processes[i] = new LineageProcess(source.Processes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RelationId", this.RelationId);
        this.setParamSimple(map, prefix + "SourceUniqueId", this.SourceUniqueId);
        this.setParamSimple(map, prefix + "TargetUniqueId", this.TargetUniqueId);
        this.setParamArrayObj(map, prefix + "Processes.", this.Processes);

    }
}

