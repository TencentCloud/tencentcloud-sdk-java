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

public class OrganizationalFunction extends AbstractModel{

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 展示名称
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * 层级路径
    */
    @SerializedName("LayerPath")
    @Expose
    private String LayerPath;

    /**
    * 上级层级路径
    */
    @SerializedName("ParentLayerPath")
    @Expose
    private String ParentLayerPath;

    /**
    * 函数类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 函数分类：窗口函数、聚合函数、日期函数......
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

    /**
    * 函数种类：系统函数、自定义函数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * 函数状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 函数说明
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 函数用法
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Usage")
    @Expose
    private String Usage;

    /**
    * 函数参数说明
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParamDesc")
    @Expose
    private String ParamDesc;

    /**
    * 函数返回值说明
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReturnDesc")
    @Expose
    private String ReturnDesc;

    /**
    * 函数示例
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Example")
    @Expose
    private String Example;

    /**
    * 集群实例引擎 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterIdentifier")
    @Expose
    private String ClusterIdentifier;

    /**
    * 函数 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FuncId")
    @Expose
    private String FuncId;

    /**
    * 函数类名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClassName")
    @Expose
    private String ClassName;

    /**
    * 函数资源列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceList")
    @Expose
    private FunctionVersion [] ResourceList;

    /**
    * 操作人 ID 列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperatorUserIds")
    @Expose
    private Long [] OperatorUserIds;

    /**
    * 公有云 Owner ID 列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerUserIds")
    @Expose
    private Long [] OwnerUserIds;

    /**
    * 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * 提交失败错误信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubmitErrorMsg")
    @Expose
    private String SubmitErrorMsg;

    /**
     * Get 名称 
     * @return Name 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
     * @param Name 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 展示名称 
     * @return DisplayName 展示名称
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set 展示名称
     * @param DisplayName 展示名称
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get 层级路径 
     * @return LayerPath 层级路径
     */
    public String getLayerPath() {
        return this.LayerPath;
    }

    /**
     * Set 层级路径
     * @param LayerPath 层级路径
     */
    public void setLayerPath(String LayerPath) {
        this.LayerPath = LayerPath;
    }

    /**
     * Get 上级层级路径 
     * @return ParentLayerPath 上级层级路径
     */
    public String getParentLayerPath() {
        return this.ParentLayerPath;
    }

    /**
     * Set 上级层级路径
     * @param ParentLayerPath 上级层级路径
     */
    public void setParentLayerPath(String ParentLayerPath) {
        this.ParentLayerPath = ParentLayerPath;
    }

    /**
     * Get 函数类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 函数类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 函数类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 函数类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 函数分类：窗口函数、聚合函数、日期函数......
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Kind 函数分类：窗口函数、聚合函数、日期函数......
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKind() {
        return this.Kind;
    }

    /**
     * Set 函数分类：窗口函数、聚合函数、日期函数......
注意：此字段可能返回 null，表示取不到有效值。
     * @param Kind 函数分类：窗口函数、聚合函数、日期函数......
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKind(String Kind) {
        this.Kind = Kind;
    }

    /**
     * Get 函数种类：系统函数、自定义函数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Category 函数种类：系统函数、自定义函数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set 函数种类：系统函数、自定义函数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Category 函数种类：系统函数、自定义函数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get 函数状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 函数状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 函数状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 函数状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 函数说明
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 函数说明
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 函数说明
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 函数说明
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 函数用法
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Usage 函数用法
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUsage() {
        return this.Usage;
    }

    /**
     * Set 函数用法
注意：此字段可能返回 null，表示取不到有效值。
     * @param Usage 函数用法
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsage(String Usage) {
        this.Usage = Usage;
    }

    /**
     * Get 函数参数说明
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParamDesc 函数参数说明
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParamDesc() {
        return this.ParamDesc;
    }

    /**
     * Set 函数参数说明
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParamDesc 函数参数说明
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParamDesc(String ParamDesc) {
        this.ParamDesc = ParamDesc;
    }

    /**
     * Get 函数返回值说明
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReturnDesc 函数返回值说明
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReturnDesc() {
        return this.ReturnDesc;
    }

    /**
     * Set 函数返回值说明
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReturnDesc 函数返回值说明
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReturnDesc(String ReturnDesc) {
        this.ReturnDesc = ReturnDesc;
    }

    /**
     * Get 函数示例
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Example 函数示例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExample() {
        return this.Example;
    }

    /**
     * Set 函数示例
注意：此字段可能返回 null，表示取不到有效值。
     * @param Example 函数示例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExample(String Example) {
        this.Example = Example;
    }

    /**
     * Get 集群实例引擎 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterIdentifier 集群实例引擎 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterIdentifier() {
        return this.ClusterIdentifier;
    }

    /**
     * Set 集群实例引擎 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterIdentifier 集群实例引擎 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterIdentifier(String ClusterIdentifier) {
        this.ClusterIdentifier = ClusterIdentifier;
    }

    /**
     * Get 函数 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FuncId 函数 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFuncId() {
        return this.FuncId;
    }

    /**
     * Set 函数 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param FuncId 函数 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFuncId(String FuncId) {
        this.FuncId = FuncId;
    }

    /**
     * Get 函数类名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClassName 函数类名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClassName() {
        return this.ClassName;
    }

    /**
     * Set 函数类名
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClassName 函数类名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClassName(String ClassName) {
        this.ClassName = ClassName;
    }

    /**
     * Get 函数资源列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceList 函数资源列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FunctionVersion [] getResourceList() {
        return this.ResourceList;
    }

    /**
     * Set 函数资源列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceList 函数资源列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceList(FunctionVersion [] ResourceList) {
        this.ResourceList = ResourceList;
    }

    /**
     * Get 操作人 ID 列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperatorUserIds 操作人 ID 列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getOperatorUserIds() {
        return this.OperatorUserIds;
    }

    /**
     * Set 操作人 ID 列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperatorUserIds 操作人 ID 列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperatorUserIds(Long [] OperatorUserIds) {
        this.OperatorUserIds = OperatorUserIds;
    }

    /**
     * Get 公有云 Owner ID 列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerUserIds 公有云 Owner ID 列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getOwnerUserIds() {
        return this.OwnerUserIds;
    }

    /**
     * Set 公有云 Owner ID 列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerUserIds 公有云 Owner ID 列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerUserIds(Long [] OwnerUserIds) {
        this.OwnerUserIds = OwnerUserIds;
    }

    /**
     * Get 数据库名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DbName 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DbName 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get 提交失败错误信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubmitErrorMsg 提交失败错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubmitErrorMsg() {
        return this.SubmitErrorMsg;
    }

    /**
     * Set 提交失败错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubmitErrorMsg 提交失败错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubmitErrorMsg(String SubmitErrorMsg) {
        this.SubmitErrorMsg = SubmitErrorMsg;
    }

    public OrganizationalFunction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OrganizationalFunction(OrganizationalFunction source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.LayerPath != null) {
            this.LayerPath = new String(source.LayerPath);
        }
        if (source.ParentLayerPath != null) {
            this.ParentLayerPath = new String(source.ParentLayerPath);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Kind != null) {
            this.Kind = new String(source.Kind);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Usage != null) {
            this.Usage = new String(source.Usage);
        }
        if (source.ParamDesc != null) {
            this.ParamDesc = new String(source.ParamDesc);
        }
        if (source.ReturnDesc != null) {
            this.ReturnDesc = new String(source.ReturnDesc);
        }
        if (source.Example != null) {
            this.Example = new String(source.Example);
        }
        if (source.ClusterIdentifier != null) {
            this.ClusterIdentifier = new String(source.ClusterIdentifier);
        }
        if (source.FuncId != null) {
            this.FuncId = new String(source.FuncId);
        }
        if (source.ClassName != null) {
            this.ClassName = new String(source.ClassName);
        }
        if (source.ResourceList != null) {
            this.ResourceList = new FunctionVersion[source.ResourceList.length];
            for (int i = 0; i < source.ResourceList.length; i++) {
                this.ResourceList[i] = new FunctionVersion(source.ResourceList[i]);
            }
        }
        if (source.OperatorUserIds != null) {
            this.OperatorUserIds = new Long[source.OperatorUserIds.length];
            for (int i = 0; i < source.OperatorUserIds.length; i++) {
                this.OperatorUserIds[i] = new Long(source.OperatorUserIds[i]);
            }
        }
        if (source.OwnerUserIds != null) {
            this.OwnerUserIds = new Long[source.OwnerUserIds.length];
            for (int i = 0; i < source.OwnerUserIds.length; i++) {
                this.OwnerUserIds[i] = new Long(source.OwnerUserIds[i]);
            }
        }
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.SubmitErrorMsg != null) {
            this.SubmitErrorMsg = new String(source.SubmitErrorMsg);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "LayerPath", this.LayerPath);
        this.setParamSimple(map, prefix + "ParentLayerPath", this.ParentLayerPath);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Usage", this.Usage);
        this.setParamSimple(map, prefix + "ParamDesc", this.ParamDesc);
        this.setParamSimple(map, prefix + "ReturnDesc", this.ReturnDesc);
        this.setParamSimple(map, prefix + "Example", this.Example);
        this.setParamSimple(map, prefix + "ClusterIdentifier", this.ClusterIdentifier);
        this.setParamSimple(map, prefix + "FuncId", this.FuncId);
        this.setParamSimple(map, prefix + "ClassName", this.ClassName);
        this.setParamArrayObj(map, prefix + "ResourceList.", this.ResourceList);
        this.setParamArraySimple(map, prefix + "OperatorUserIds.", this.OperatorUserIds);
        this.setParamArraySimple(map, prefix + "OwnerUserIds.", this.OwnerUserIds);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "SubmitErrorMsg", this.SubmitErrorMsg);

    }
}

