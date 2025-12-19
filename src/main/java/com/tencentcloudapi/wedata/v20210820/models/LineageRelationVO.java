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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LineageRelationVO extends AbstractModel {

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
    @SerializedName("SourceQualifiedId")
    @Expose
    private String SourceQualifiedId;

    /**
    * 目标端唯一血缘ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetQualifiedId")
    @Expose
    private String TargetQualifiedId;

    /**
    * 血缘加工过程
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Processes")
    @Expose
    private LineageProcessVO [] Processes;

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
     * @return SourceQualifiedId 源端唯一血缘ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceQualifiedId() {
        return this.SourceQualifiedId;
    }

    /**
     * Set 源端唯一血缘ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceQualifiedId 源端唯一血缘ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceQualifiedId(String SourceQualifiedId) {
        this.SourceQualifiedId = SourceQualifiedId;
    }

    /**
     * Get 目标端唯一血缘ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetQualifiedId 目标端唯一血缘ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetQualifiedId() {
        return this.TargetQualifiedId;
    }

    /**
     * Set 目标端唯一血缘ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetQualifiedId 目标端唯一血缘ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetQualifiedId(String TargetQualifiedId) {
        this.TargetQualifiedId = TargetQualifiedId;
    }

    /**
     * Get 血缘加工过程
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Processes 血缘加工过程
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LineageProcessVO [] getProcesses() {
        return this.Processes;
    }

    /**
     * Set 血缘加工过程
注意：此字段可能返回 null，表示取不到有效值。
     * @param Processes 血缘加工过程
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcesses(LineageProcessVO [] Processes) {
        this.Processes = Processes;
    }

    public LineageRelationVO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LineageRelationVO(LineageRelationVO source) {
        if (source.RelationId != null) {
            this.RelationId = new String(source.RelationId);
        }
        if (source.SourceQualifiedId != null) {
            this.SourceQualifiedId = new String(source.SourceQualifiedId);
        }
        if (source.TargetQualifiedId != null) {
            this.TargetQualifiedId = new String(source.TargetQualifiedId);
        }
        if (source.Processes != null) {
            this.Processes = new LineageProcessVO[source.Processes.length];
            for (int i = 0; i < source.Processes.length; i++) {
                this.Processes[i] = new LineageProcessVO(source.Processes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RelationId", this.RelationId);
        this.setParamSimple(map, prefix + "SourceQualifiedId", this.SourceQualifiedId);
        this.setParamSimple(map, prefix + "TargetQualifiedId", this.TargetQualifiedId);
        this.setParamArrayObj(map, prefix + "Processes.", this.Processes);

    }
}

