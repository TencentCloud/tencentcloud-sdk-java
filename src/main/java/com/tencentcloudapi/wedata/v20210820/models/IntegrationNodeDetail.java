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

public class IntegrationNodeDetail extends AbstractModel{

    /**
    * 集成节点名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 集成节点类型
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * 节点数据源类型
    */
    @SerializedName("DataSourceType")
    @Expose
    private String DataSourceType;

    /**
    * 节点描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 数据源id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceId")
    @Expose
    private String DatasourceId;

    /**
    * 节点配置信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Config")
    @Expose
    private RecordField [] Config;

    /**
    * 节点扩展配置信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtConfig")
    @Expose
    private RecordField [] ExtConfig;

    /**
    * 节点schema
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Schema")
    @Expose
    private IntegrationNodeSchema [] Schema;

    /**
    * 节点映射
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeMapping")
    @Expose
    private IntegrationNodeMapping NodeMapping;

    /**
    * owner uin
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
     * Get 集成节点名称 
     * @return Name 集成节点名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 集成节点名称
     * @param Name 集成节点名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 集成节点类型 
     * @return NodeType 集成节点类型
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set 集成节点类型
     * @param NodeType 集成节点类型
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get 节点数据源类型 
     * @return DataSourceType 节点数据源类型
     */
    public String getDataSourceType() {
        return this.DataSourceType;
    }

    /**
     * Set 节点数据源类型
     * @param DataSourceType 节点数据源类型
     */
    public void setDataSourceType(String DataSourceType) {
        this.DataSourceType = DataSourceType;
    }

    /**
     * Get 节点描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 节点描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 节点描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 节点描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 数据源id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasourceId 数据源id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set 数据源id
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasourceId 数据源id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasourceId(String DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get 节点配置信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Config 节点配置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RecordField [] getConfig() {
        return this.Config;
    }

    /**
     * Set 节点配置信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Config 节点配置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfig(RecordField [] Config) {
        this.Config = Config;
    }

    /**
     * Get 节点扩展配置信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtConfig 节点扩展配置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RecordField [] getExtConfig() {
        return this.ExtConfig;
    }

    /**
     * Set 节点扩展配置信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtConfig 节点扩展配置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtConfig(RecordField [] ExtConfig) {
        this.ExtConfig = ExtConfig;
    }

    /**
     * Get 节点schema
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Schema 节点schema
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IntegrationNodeSchema [] getSchema() {
        return this.Schema;
    }

    /**
     * Set 节点schema
注意：此字段可能返回 null，表示取不到有效值。
     * @param Schema 节点schema
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSchema(IntegrationNodeSchema [] Schema) {
        this.Schema = Schema;
    }

    /**
     * Get 节点映射
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeMapping 节点映射
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IntegrationNodeMapping getNodeMapping() {
        return this.NodeMapping;
    }

    /**
     * Set 节点映射
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeMapping 节点映射
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeMapping(IntegrationNodeMapping NodeMapping) {
        this.NodeMapping = NodeMapping;
    }

    /**
     * Get owner uin 
     * @return OwnerUin owner uin
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set owner uin
     * @param OwnerUin owner uin
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    public IntegrationNodeDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IntegrationNodeDetail(IntegrationNodeDetail source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.DataSourceType != null) {
            this.DataSourceType = new String(source.DataSourceType);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new String(source.DatasourceId);
        }
        if (source.Config != null) {
            this.Config = new RecordField[source.Config.length];
            for (int i = 0; i < source.Config.length; i++) {
                this.Config[i] = new RecordField(source.Config[i]);
            }
        }
        if (source.ExtConfig != null) {
            this.ExtConfig = new RecordField[source.ExtConfig.length];
            for (int i = 0; i < source.ExtConfig.length; i++) {
                this.ExtConfig[i] = new RecordField(source.ExtConfig[i]);
            }
        }
        if (source.Schema != null) {
            this.Schema = new IntegrationNodeSchema[source.Schema.length];
            for (int i = 0; i < source.Schema.length; i++) {
                this.Schema[i] = new IntegrationNodeSchema(source.Schema[i]);
            }
        }
        if (source.NodeMapping != null) {
            this.NodeMapping = new IntegrationNodeMapping(source.NodeMapping);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "DataSourceType", this.DataSourceType);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamArrayObj(map, prefix + "Config.", this.Config);
        this.setParamArrayObj(map, prefix + "ExtConfig.", this.ExtConfig);
        this.setParamArrayObj(map, prefix + "Schema.", this.Schema);
        this.setParamObj(map, prefix + "NodeMapping.", this.NodeMapping);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);

    }
}

