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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IntegrationNodeMapping extends AbstractModel{

    /**
    * 源节点id
    */
    @SerializedName("SourceId")
    @Expose
    private String SourceId;

    /**
    * 目标节点id
    */
    @SerializedName("SinkId")
    @Expose
    private String SinkId;

    /**
    * 源节点schema
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceSchema")
    @Expose
    private IntegrationNodeSchema [] SourceSchema;

    /**
    * 节点schema映射
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SchemaMappings")
    @Expose
    private IntegrationNodeSchemaMapping [] SchemaMappings;

    /**
    * 节点映射扩展信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtConfig")
    @Expose
    private RecordField [] ExtConfig;

    /**
     * Get 源节点id 
     * @return SourceId 源节点id
     */
    public String getSourceId() {
        return this.SourceId;
    }

    /**
     * Set 源节点id
     * @param SourceId 源节点id
     */
    public void setSourceId(String SourceId) {
        this.SourceId = SourceId;
    }

    /**
     * Get 目标节点id 
     * @return SinkId 目标节点id
     */
    public String getSinkId() {
        return this.SinkId;
    }

    /**
     * Set 目标节点id
     * @param SinkId 目标节点id
     */
    public void setSinkId(String SinkId) {
        this.SinkId = SinkId;
    }

    /**
     * Get 源节点schema
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceSchema 源节点schema
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IntegrationNodeSchema [] getSourceSchema() {
        return this.SourceSchema;
    }

    /**
     * Set 源节点schema
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceSchema 源节点schema
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceSchema(IntegrationNodeSchema [] SourceSchema) {
        this.SourceSchema = SourceSchema;
    }

    /**
     * Get 节点schema映射
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SchemaMappings 节点schema映射
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IntegrationNodeSchemaMapping [] getSchemaMappings() {
        return this.SchemaMappings;
    }

    /**
     * Set 节点schema映射
注意：此字段可能返回 null，表示取不到有效值。
     * @param SchemaMappings 节点schema映射
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSchemaMappings(IntegrationNodeSchemaMapping [] SchemaMappings) {
        this.SchemaMappings = SchemaMappings;
    }

    /**
     * Get 节点映射扩展信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtConfig 节点映射扩展信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RecordField [] getExtConfig() {
        return this.ExtConfig;
    }

    /**
     * Set 节点映射扩展信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtConfig 节点映射扩展信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtConfig(RecordField [] ExtConfig) {
        this.ExtConfig = ExtConfig;
    }

    public IntegrationNodeMapping() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IntegrationNodeMapping(IntegrationNodeMapping source) {
        if (source.SourceId != null) {
            this.SourceId = new String(source.SourceId);
        }
        if (source.SinkId != null) {
            this.SinkId = new String(source.SinkId);
        }
        if (source.SourceSchema != null) {
            this.SourceSchema = new IntegrationNodeSchema[source.SourceSchema.length];
            for (int i = 0; i < source.SourceSchema.length; i++) {
                this.SourceSchema[i] = new IntegrationNodeSchema(source.SourceSchema[i]);
            }
        }
        if (source.SchemaMappings != null) {
            this.SchemaMappings = new IntegrationNodeSchemaMapping[source.SchemaMappings.length];
            for (int i = 0; i < source.SchemaMappings.length; i++) {
                this.SchemaMappings[i] = new IntegrationNodeSchemaMapping(source.SchemaMappings[i]);
            }
        }
        if (source.ExtConfig != null) {
            this.ExtConfig = new RecordField[source.ExtConfig.length];
            for (int i = 0; i < source.ExtConfig.length; i++) {
                this.ExtConfig[i] = new RecordField(source.ExtConfig[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceId", this.SourceId);
        this.setParamSimple(map, prefix + "SinkId", this.SinkId);
        this.setParamArrayObj(map, prefix + "SourceSchema.", this.SourceSchema);
        this.setParamArrayObj(map, prefix + "SchemaMappings.", this.SchemaMappings);
        this.setParamArrayObj(map, prefix + "ExtConfig.", this.ExtConfig);

    }
}

