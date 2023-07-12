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

public class SimpleColumnInfo extends AbstractModel{

    /**
    * 列ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 限定名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QualifiedName")
    @Expose
    private String QualifiedName;

    /**
    * 列名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColumnName")
    @Expose
    private String ColumnName;

    /**
    * 列中文名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColumnNameCn")
    @Expose
    private String ColumnNameCn;

    /**
    * 列类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColumnType")
    @Expose
    private String ColumnType;

    /**
    * 列描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 前缀路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrefixPath")
    @Expose
    private String PrefixPath;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 修改时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 数据源ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceId")
    @Expose
    private String DatasourceId;

    /**
    * 下游数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DownStreamCount")
    @Expose
    private Long DownStreamCount;

    /**
    * 上游数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpStreamCount")
    @Expose
    private Long UpStreamCount;

    /**
    * 关系参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RelationParams")
    @Expose
    private String RelationParams;

    /**
    * 参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Params")
    @Expose
    private String Params;

    /**
    * 任务集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tasks")
    @Expose
    private String [] Tasks;

    /**
     * Get 列ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 列ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 列ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 列ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 限定名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QualifiedName 限定名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQualifiedName() {
        return this.QualifiedName;
    }

    /**
     * Set 限定名
注意：此字段可能返回 null，表示取不到有效值。
     * @param QualifiedName 限定名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQualifiedName(String QualifiedName) {
        this.QualifiedName = QualifiedName;
    }

    /**
     * Get 列名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColumnName 列名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getColumnName() {
        return this.ColumnName;
    }

    /**
     * Set 列名
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColumnName 列名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColumnName(String ColumnName) {
        this.ColumnName = ColumnName;
    }

    /**
     * Get 列中文名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColumnNameCn 列中文名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getColumnNameCn() {
        return this.ColumnNameCn;
    }

    /**
     * Set 列中文名
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColumnNameCn 列中文名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColumnNameCn(String ColumnNameCn) {
        this.ColumnNameCn = ColumnNameCn;
    }

    /**
     * Get 列类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColumnType 列类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getColumnType() {
        return this.ColumnType;
    }

    /**
     * Set 列类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColumnType 列类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColumnType(String ColumnType) {
        this.ColumnType = ColumnType;
    }

    /**
     * Get 列描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 列描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 列描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 列描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 前缀路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrefixPath 前缀路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPrefixPath() {
        return this.PrefixPath;
    }

    /**
     * Set 前缀路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrefixPath 前缀路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrefixPath(String PrefixPath) {
        this.PrefixPath = PrefixPath;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 修改时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifyTime 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifyTime 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 数据源ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasourceId 数据源ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set 数据源ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasourceId 数据源ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasourceId(String DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get 下游数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DownStreamCount 下游数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDownStreamCount() {
        return this.DownStreamCount;
    }

    /**
     * Set 下游数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param DownStreamCount 下游数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDownStreamCount(Long DownStreamCount) {
        this.DownStreamCount = DownStreamCount;
    }

    /**
     * Get 上游数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpStreamCount 上游数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUpStreamCount() {
        return this.UpStreamCount;
    }

    /**
     * Set 上游数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpStreamCount 上游数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpStreamCount(Long UpStreamCount) {
        this.UpStreamCount = UpStreamCount;
    }

    /**
     * Get 关系参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RelationParams 关系参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRelationParams() {
        return this.RelationParams;
    }

    /**
     * Set 关系参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param RelationParams 关系参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRelationParams(String RelationParams) {
        this.RelationParams = RelationParams;
    }

    /**
     * Get 参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Params 参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParams() {
        return this.Params;
    }

    /**
     * Set 参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Params 参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParams(String Params) {
        this.Params = Params;
    }

    /**
     * Get 任务集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tasks 任务集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set 任务集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tasks 任务集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTasks(String [] Tasks) {
        this.Tasks = Tasks;
    }

    public SimpleColumnInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SimpleColumnInfo(SimpleColumnInfo source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.QualifiedName != null) {
            this.QualifiedName = new String(source.QualifiedName);
        }
        if (source.ColumnName != null) {
            this.ColumnName = new String(source.ColumnName);
        }
        if (source.ColumnNameCn != null) {
            this.ColumnNameCn = new String(source.ColumnNameCn);
        }
        if (source.ColumnType != null) {
            this.ColumnType = new String(source.ColumnType);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.PrefixPath != null) {
            this.PrefixPath = new String(source.PrefixPath);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new String(source.DatasourceId);
        }
        if (source.DownStreamCount != null) {
            this.DownStreamCount = new Long(source.DownStreamCount);
        }
        if (source.UpStreamCount != null) {
            this.UpStreamCount = new Long(source.UpStreamCount);
        }
        if (source.RelationParams != null) {
            this.RelationParams = new String(source.RelationParams);
        }
        if (source.Params != null) {
            this.Params = new String(source.Params);
        }
        if (source.Tasks != null) {
            this.Tasks = new String[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new String(source.Tasks[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "QualifiedName", this.QualifiedName);
        this.setParamSimple(map, prefix + "ColumnName", this.ColumnName);
        this.setParamSimple(map, prefix + "ColumnNameCn", this.ColumnNameCn);
        this.setParamSimple(map, prefix + "ColumnType", this.ColumnType);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "PrefixPath", this.PrefixPath);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "DownStreamCount", this.DownStreamCount);
        this.setParamSimple(map, prefix + "UpStreamCount", this.UpStreamCount);
        this.setParamSimple(map, prefix + "RelationParams", this.RelationParams);
        this.setParamSimple(map, prefix + "Params", this.Params);
        this.setParamArraySimple(map, prefix + "Tasks.", this.Tasks);

    }
}

