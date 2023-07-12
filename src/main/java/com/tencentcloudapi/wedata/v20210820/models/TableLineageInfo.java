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

public class TableLineageInfo extends AbstractModel{

    /**
    * 元数据类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetastoreType")
    @Expose
    private String MetastoreType;

    /**
    * 由中心节点到该节点的路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrefixPath")
    @Expose
    private String PrefixPath;

    /**
    * 空间id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 数据源id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceId")
    @Expose
    private String DatasourceId;

    /**
    * 表id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableId")
    @Expose
    private String TableId;

    /**
    * 表血缘参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Params")
    @Expose
    private LineageParamRecord [] Params;

    /**
    * 父节点列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParentSet")
    @Expose
    private String ParentSet;

    /**
    * 子节点列表
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
    private RecordField [] ExtParams;

    /**
    * 血缘id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

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
    * 表全称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QualifiedName")
    @Expose
    private String QualifiedName;

    /**
    * 血缘下游节点数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DownStreamCount")
    @Expose
    private Long DownStreamCount;

    /**
    * 血缘上游节点数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpStreamCount")
    @Expose
    private Long UpStreamCount;

    /**
    * 血缘描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 血缘创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 血缘更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 修改血缘的任务id列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tasks")
    @Expose
    private String [] Tasks;

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
     * Get 由中心节点到该节点的路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrefixPath 由中心节点到该节点的路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPrefixPath() {
        return this.PrefixPath;
    }

    /**
     * Set 由中心节点到该节点的路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrefixPath 由中心节点到该节点的路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrefixPath(String PrefixPath) {
        this.PrefixPath = PrefixPath;
    }

    /**
     * Get 空间id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId 空间id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 空间id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId 空间id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
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
     * Get 表id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableId 表id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableId() {
        return this.TableId;
    }

    /**
     * Set 表id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableId 表id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableId(String TableId) {
        this.TableId = TableId;
    }

    /**
     * Get 表血缘参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Params 表血缘参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LineageParamRecord [] getParams() {
        return this.Params;
    }

    /**
     * Set 表血缘参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Params 表血缘参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParams(LineageParamRecord [] Params) {
        this.Params = Params;
    }

    /**
     * Get 父节点列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParentSet 父节点列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParentSet() {
        return this.ParentSet;
    }

    /**
     * Set 父节点列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParentSet 父节点列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParentSet(String ParentSet) {
        this.ParentSet = ParentSet;
    }

    /**
     * Get 子节点列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChildSet 子节点列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChildSet() {
        return this.ChildSet;
    }

    /**
     * Set 子节点列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChildSet 子节点列表
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
    public RecordField [] getExtParams() {
        return this.ExtParams;
    }

    /**
     * Set 额外参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtParams 额外参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtParams(RecordField [] ExtParams) {
        this.ExtParams = ExtParams;
    }

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
     * Get 表全称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QualifiedName 表全称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQualifiedName() {
        return this.QualifiedName;
    }

    /**
     * Set 表全称
注意：此字段可能返回 null，表示取不到有效值。
     * @param QualifiedName 表全称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQualifiedName(String QualifiedName) {
        this.QualifiedName = QualifiedName;
    }

    /**
     * Get 血缘下游节点数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DownStreamCount 血缘下游节点数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDownStreamCount() {
        return this.DownStreamCount;
    }

    /**
     * Set 血缘下游节点数
注意：此字段可能返回 null，表示取不到有效值。
     * @param DownStreamCount 血缘下游节点数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDownStreamCount(Long DownStreamCount) {
        this.DownStreamCount = DownStreamCount;
    }

    /**
     * Get 血缘上游节点数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpStreamCount 血缘上游节点数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUpStreamCount() {
        return this.UpStreamCount;
    }

    /**
     * Set 血缘上游节点数
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpStreamCount 血缘上游节点数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpStreamCount(Long UpStreamCount) {
        this.UpStreamCount = UpStreamCount;
    }

    /**
     * Get 血缘描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 血缘描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 血缘描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 血缘描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 血缘创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 血缘创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 血缘创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 血缘创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 血缘更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifyTime 血缘更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 血缘更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifyTime 血缘更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 修改血缘的任务id列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tasks 修改血缘的任务id列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set 修改血缘的任务id列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tasks 修改血缘的任务id列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTasks(String [] Tasks) {
        this.Tasks = Tasks;
    }

    public TableLineageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TableLineageInfo(TableLineageInfo source) {
        if (source.MetastoreType != null) {
            this.MetastoreType = new String(source.MetastoreType);
        }
        if (source.PrefixPath != null) {
            this.PrefixPath = new String(source.PrefixPath);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new String(source.DatasourceId);
        }
        if (source.TableId != null) {
            this.TableId = new String(source.TableId);
        }
        if (source.Params != null) {
            this.Params = new LineageParamRecord[source.Params.length];
            for (int i = 0; i < source.Params.length; i++) {
                this.Params[i] = new LineageParamRecord(source.Params[i]);
            }
        }
        if (source.ParentSet != null) {
            this.ParentSet = new String(source.ParentSet);
        }
        if (source.ChildSet != null) {
            this.ChildSet = new String(source.ChildSet);
        }
        if (source.ExtParams != null) {
            this.ExtParams = new RecordField[source.ExtParams.length];
            for (int i = 0; i < source.ExtParams.length; i++) {
                this.ExtParams[i] = new RecordField(source.ExtParams[i]);
            }
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MetastoreType", this.MetastoreType);
        this.setParamSimple(map, prefix + "PrefixPath", this.PrefixPath);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamArrayObj(map, prefix + "Params.", this.Params);
        this.setParamSimple(map, prefix + "ParentSet", this.ParentSet);
        this.setParamSimple(map, prefix + "ChildSet", this.ChildSet);
        this.setParamArrayObj(map, prefix + "ExtParams.", this.ExtParams);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "MetastoreTypeName", this.MetastoreTypeName);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "QualifiedName", this.QualifiedName);
        this.setParamSimple(map, prefix + "DownStreamCount", this.DownStreamCount);
        this.setParamSimple(map, prefix + "UpStreamCount", this.UpStreamCount);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamArraySimple(map, prefix + "Tasks.", this.Tasks);

    }
}

