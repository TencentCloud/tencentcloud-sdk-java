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

public class ColumnLineageInfo extends AbstractModel{

    /**
    * 血缘id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 由中心节点出发的路径信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrefixPath")
    @Expose
    private String PrefixPath;

    /**
    * 数据源ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceId")
    @Expose
    private String DatasourceId;

    /**
    * 表ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableId")
    @Expose
    private String TableId;

    /**
    * 字段名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColumnName")
    @Expose
    private String ColumnName;

    /**
    * 字段中文名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColumnNameCn")
    @Expose
    private String ColumnNameCn;

    /**
    * 字段类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColumnType")
    @Expose
    private String ColumnType;

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
    * 父id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParentId")
    @Expose
    private String ParentId;

    /**
    * 元数据类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetastoreType")
    @Expose
    private String MetastoreType;

    /**
    * 元数据类型名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetastoreTypeName")
    @Expose
    private String MetastoreTypeName;

    /**
    * 表名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 字段全名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QualifiedName")
    @Expose
    private String QualifiedName;

    /**
    * 下游节点数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DownStreamCount")
    @Expose
    private Long DownStreamCount;

    /**
    * 上游节点数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpStreamCount")
    @Expose
    private Long UpStreamCount;

    /**
    * 描述信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 任务id列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tasks")
    @Expose
    private String [] Tasks;

    /**
    * 父节点列表字符串
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParentSet")
    @Expose
    private String ParentSet;

    /**
    * 子节点列表字符串
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChildSet")
    @Expose
    private String ChildSet;

    /**
    * 额外参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtParams")
    @Expose
    private LineageParamRecord [] ExtParams;

    /**
     * Get 血缘id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 血缘id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 血缘id
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 血缘id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 由中心节点出发的路径信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrefixPath 由中心节点出发的路径信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPrefixPath() {
        return this.PrefixPath;
    }

    /**
     * Set 由中心节点出发的路径信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrefixPath 由中心节点出发的路径信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrefixPath(String PrefixPath) {
        this.PrefixPath = PrefixPath;
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
     * Get 表ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableId 表ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableId() {
        return this.TableId;
    }

    /**
     * Set 表ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableId 表ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableId(String TableId) {
        this.TableId = TableId;
    }

    /**
     * Get 字段名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColumnName 字段名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getColumnName() {
        return this.ColumnName;
    }

    /**
     * Set 字段名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColumnName 字段名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColumnName(String ColumnName) {
        this.ColumnName = ColumnName;
    }

    /**
     * Get 字段中文名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColumnNameCn 字段中文名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getColumnNameCn() {
        return this.ColumnNameCn;
    }

    /**
     * Set 字段中文名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColumnNameCn 字段中文名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColumnNameCn(String ColumnNameCn) {
        this.ColumnNameCn = ColumnNameCn;
    }

    /**
     * Get 字段类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColumnType 字段类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getColumnType() {
        return this.ColumnType;
    }

    /**
     * Set 字段类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColumnType 字段类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColumnType(String ColumnType) {
        this.ColumnType = ColumnType;
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
     * Get 父id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParentId 父id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParentId() {
        return this.ParentId;
    }

    /**
     * Set 父id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParentId 父id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParentId(String ParentId) {
        this.ParentId = ParentId;
    }

    /**
     * Get 元数据类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetastoreType 元数据类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMetastoreType() {
        return this.MetastoreType;
    }

    /**
     * Set 元数据类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetastoreType 元数据类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetastoreType(String MetastoreType) {
        this.MetastoreType = MetastoreType;
    }

    /**
     * Get 元数据类型名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetastoreTypeName 元数据类型名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMetastoreTypeName() {
        return this.MetastoreTypeName;
    }

    /**
     * Set 元数据类型名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetastoreTypeName 元数据类型名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetastoreTypeName(String MetastoreTypeName) {
        this.MetastoreTypeName = MetastoreTypeName;
    }

    /**
     * Get 表名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableName 表名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 表名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableName 表名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 字段全名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QualifiedName 字段全名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQualifiedName() {
        return this.QualifiedName;
    }

    /**
     * Set 字段全名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param QualifiedName 字段全名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQualifiedName(String QualifiedName) {
        this.QualifiedName = QualifiedName;
    }

    /**
     * Get 下游节点数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DownStreamCount 下游节点数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDownStreamCount() {
        return this.DownStreamCount;
    }

    /**
     * Set 下游节点数
注意：此字段可能返回 null，表示取不到有效值。
     * @param DownStreamCount 下游节点数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDownStreamCount(Long DownStreamCount) {
        this.DownStreamCount = DownStreamCount;
    }

    /**
     * Get 上游节点数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpStreamCount 上游节点数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUpStreamCount() {
        return this.UpStreamCount;
    }

    /**
     * Set 上游节点数
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpStreamCount 上游节点数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpStreamCount(Long UpStreamCount) {
        this.UpStreamCount = UpStreamCount;
    }

    /**
     * Get 描述信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
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
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifyTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifyTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 任务id列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tasks 任务id列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set 任务id列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tasks 任务id列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTasks(String [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get 父节点列表字符串
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParentSet 父节点列表字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParentSet() {
        return this.ParentSet;
    }

    /**
     * Set 父节点列表字符串
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParentSet 父节点列表字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParentSet(String ParentSet) {
        this.ParentSet = ParentSet;
    }

    /**
     * Get 子节点列表字符串
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChildSet 子节点列表字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChildSet() {
        return this.ChildSet;
    }

    /**
     * Set 子节点列表字符串
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChildSet 子节点列表字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChildSet(String ChildSet) {
        this.ChildSet = ChildSet;
    }

    /**
     * Get 额外参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtParams 额外参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LineageParamRecord [] getExtParams() {
        return this.ExtParams;
    }

    /**
     * Set 额外参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtParams 额外参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtParams(LineageParamRecord [] ExtParams) {
        this.ExtParams = ExtParams;
    }

    public ColumnLineageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ColumnLineageInfo(ColumnLineageInfo source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.PrefixPath != null) {
            this.PrefixPath = new String(source.PrefixPath);
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new String(source.DatasourceId);
        }
        if (source.TableId != null) {
            this.TableId = new String(source.TableId);
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
        if (source.RelationParams != null) {
            this.RelationParams = new String(source.RelationParams);
        }
        if (source.Params != null) {
            this.Params = new String(source.Params);
        }
        if (source.ParentId != null) {
            this.ParentId = new String(source.ParentId);
        }
        if (source.MetastoreType != null) {
            this.MetastoreType = new String(source.MetastoreType);
        }
        if (source.MetastoreTypeName != null) {
            this.MetastoreTypeName = new String(source.MetastoreTypeName);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.QualifiedName != null) {
            this.QualifiedName = new String(source.QualifiedName);
        }
        if (source.DownStreamCount != null) {
            this.DownStreamCount = new Long(source.DownStreamCount);
        }
        if (source.UpStreamCount != null) {
            this.UpStreamCount = new Long(source.UpStreamCount);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.Tasks != null) {
            this.Tasks = new String[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new String(source.Tasks[i]);
            }
        }
        if (source.ParentSet != null) {
            this.ParentSet = new String(source.ParentSet);
        }
        if (source.ChildSet != null) {
            this.ChildSet = new String(source.ChildSet);
        }
        if (source.ExtParams != null) {
            this.ExtParams = new LineageParamRecord[source.ExtParams.length];
            for (int i = 0; i < source.ExtParams.length; i++) {
                this.ExtParams[i] = new LineageParamRecord(source.ExtParams[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "PrefixPath", this.PrefixPath);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamSimple(map, prefix + "ColumnName", this.ColumnName);
        this.setParamSimple(map, prefix + "ColumnNameCn", this.ColumnNameCn);
        this.setParamSimple(map, prefix + "ColumnType", this.ColumnType);
        this.setParamSimple(map, prefix + "RelationParams", this.RelationParams);
        this.setParamSimple(map, prefix + "Params", this.Params);
        this.setParamSimple(map, prefix + "ParentId", this.ParentId);
        this.setParamSimple(map, prefix + "MetastoreType", this.MetastoreType);
        this.setParamSimple(map, prefix + "MetastoreTypeName", this.MetastoreTypeName);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "QualifiedName", this.QualifiedName);
        this.setParamSimple(map, prefix + "DownStreamCount", this.DownStreamCount);
        this.setParamSimple(map, prefix + "UpStreamCount", this.UpStreamCount);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamArraySimple(map, prefix + "Tasks.", this.Tasks);
        this.setParamSimple(map, prefix + "ParentSet", this.ParentSet);
        this.setParamSimple(map, prefix + "ChildSet", this.ChildSet);
        this.setParamArrayObj(map, prefix + "ExtParams.", this.ExtParams);

    }
}

