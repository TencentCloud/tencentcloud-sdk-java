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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IncidentVertexInfo extends AbstractModel{

    /**
    * 事件id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IncidentId")
    @Expose
    private String IncidentId;

    /**
    * 事件所在表名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 节点信息列表，数组项中包含节点详细信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Vertex")
    @Expose
    private VertexInfo [] Vertex;

    /**
    * 节点总个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VertexCount")
    @Expose
    private Long VertexCount;

    /**
     * Get 事件id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IncidentId 事件id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIncidentId() {
        return this.IncidentId;
    }

    /**
     * Set 事件id
注意：此字段可能返回 null，表示取不到有效值。
     * @param IncidentId 事件id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIncidentId(String IncidentId) {
        this.IncidentId = IncidentId;
    }

    /**
     * Get 事件所在表名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableName 事件所在表名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 事件所在表名
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableName 事件所在表名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 节点信息列表，数组项中包含节点详细信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Vertex 节点信息列表，数组项中包含节点详细信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VertexInfo [] getVertex() {
        return this.Vertex;
    }

    /**
     * Set 节点信息列表，数组项中包含节点详细信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Vertex 节点信息列表，数组项中包含节点详细信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVertex(VertexInfo [] Vertex) {
        this.Vertex = Vertex;
    }

    /**
     * Get 节点总个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VertexCount 节点总个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVertexCount() {
        return this.VertexCount;
    }

    /**
     * Set 节点总个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param VertexCount 节点总个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVertexCount(Long VertexCount) {
        this.VertexCount = VertexCount;
    }

    public IncidentVertexInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IncidentVertexInfo(IncidentVertexInfo source) {
        if (source.IncidentId != null) {
            this.IncidentId = new String(source.IncidentId);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.Vertex != null) {
            this.Vertex = new VertexInfo[source.Vertex.length];
            for (int i = 0; i < source.Vertex.length; i++) {
                this.Vertex[i] = new VertexInfo(source.Vertex[i]);
            }
        }
        if (source.VertexCount != null) {
            this.VertexCount = new Long(source.VertexCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IncidentId", this.IncidentId);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamArrayObj(map, prefix + "Vertex.", this.Vertex);
        this.setParamSimple(map, prefix + "VertexCount", this.VertexCount);

    }
}

