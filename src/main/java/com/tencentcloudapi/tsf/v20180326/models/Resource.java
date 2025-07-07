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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Resource extends AbstractModel {

    /**
    * 资源ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 资源编码
    */
    @SerializedName("ResourceCode")
    @Expose
    private String ResourceCode;

    /**
    * 资源名称
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * 资源所属产品编码
    */
    @SerializedName("ServiceCode")
    @Expose
    private String ServiceCode;

    /**
    * 选取资源使用的Action
    */
    @SerializedName("ResourceAction")
    @Expose
    private String ResourceAction;

    /**
    * 资源数据查询的ID字段名
    */
    @SerializedName("IdField")
    @Expose
    private String IdField;

    /**
    * 资源数据查询的名称字段名
    */
    @SerializedName("NameField")
    @Expose
    private String NameField;

    /**
    * 资源数据查询的ID过滤字段名
    */
    @SerializedName("SelectIdsField")
    @Expose
    private String SelectIdsField;

    /**
    * 创建时间
    */
    @SerializedName("CreationTime")
    @Expose
    private Long CreationTime;

    /**
    * 最后更新时间
    */
    @SerializedName("LastUpdateTime")
    @Expose
    private Long LastUpdateTime;

    /**
    * 删除标识
    */
    @SerializedName("DeleteFlag")
    @Expose
    private Boolean DeleteFlag;

    /**
    * 资源描述
    */
    @SerializedName("ResourceDesc")
    @Expose
    private String ResourceDesc;

    /**
    * 是否可以选择全部
    */
    @SerializedName("CanSelectAll")
    @Expose
    private Boolean CanSelectAll;

    /**
    * 资源数据查询的模糊查询字段名
    */
    @SerializedName("SearchWordField")
    @Expose
    private String SearchWordField;

    /**
    * 排序
    */
    @SerializedName("Index")
    @Expose
    private Long Index;

    /**
     * Get 资源ID 
     * @return ResourceId 资源ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源ID
     * @param ResourceId 资源ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 资源编码 
     * @return ResourceCode 资源编码
     */
    public String getResourceCode() {
        return this.ResourceCode;
    }

    /**
     * Set 资源编码
     * @param ResourceCode 资源编码
     */
    public void setResourceCode(String ResourceCode) {
        this.ResourceCode = ResourceCode;
    }

    /**
     * Get 资源名称 
     * @return ResourceName 资源名称
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set 资源名称
     * @param ResourceName 资源名称
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get 资源所属产品编码 
     * @return ServiceCode 资源所属产品编码
     */
    public String getServiceCode() {
        return this.ServiceCode;
    }

    /**
     * Set 资源所属产品编码
     * @param ServiceCode 资源所属产品编码
     */
    public void setServiceCode(String ServiceCode) {
        this.ServiceCode = ServiceCode;
    }

    /**
     * Get 选取资源使用的Action 
     * @return ResourceAction 选取资源使用的Action
     */
    public String getResourceAction() {
        return this.ResourceAction;
    }

    /**
     * Set 选取资源使用的Action
     * @param ResourceAction 选取资源使用的Action
     */
    public void setResourceAction(String ResourceAction) {
        this.ResourceAction = ResourceAction;
    }

    /**
     * Get 资源数据查询的ID字段名 
     * @return IdField 资源数据查询的ID字段名
     */
    public String getIdField() {
        return this.IdField;
    }

    /**
     * Set 资源数据查询的ID字段名
     * @param IdField 资源数据查询的ID字段名
     */
    public void setIdField(String IdField) {
        this.IdField = IdField;
    }

    /**
     * Get 资源数据查询的名称字段名 
     * @return NameField 资源数据查询的名称字段名
     */
    public String getNameField() {
        return this.NameField;
    }

    /**
     * Set 资源数据查询的名称字段名
     * @param NameField 资源数据查询的名称字段名
     */
    public void setNameField(String NameField) {
        this.NameField = NameField;
    }

    /**
     * Get 资源数据查询的ID过滤字段名 
     * @return SelectIdsField 资源数据查询的ID过滤字段名
     */
    public String getSelectIdsField() {
        return this.SelectIdsField;
    }

    /**
     * Set 资源数据查询的ID过滤字段名
     * @param SelectIdsField 资源数据查询的ID过滤字段名
     */
    public void setSelectIdsField(String SelectIdsField) {
        this.SelectIdsField = SelectIdsField;
    }

    /**
     * Get 创建时间 
     * @return CreationTime 创建时间
     */
    public Long getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set 创建时间
     * @param CreationTime 创建时间
     */
    public void setCreationTime(Long CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get 最后更新时间 
     * @return LastUpdateTime 最后更新时间
     */
    public Long getLastUpdateTime() {
        return this.LastUpdateTime;
    }

    /**
     * Set 最后更新时间
     * @param LastUpdateTime 最后更新时间
     */
    public void setLastUpdateTime(Long LastUpdateTime) {
        this.LastUpdateTime = LastUpdateTime;
    }

    /**
     * Get 删除标识 
     * @return DeleteFlag 删除标识
     */
    public Boolean getDeleteFlag() {
        return this.DeleteFlag;
    }

    /**
     * Set 删除标识
     * @param DeleteFlag 删除标识
     */
    public void setDeleteFlag(Boolean DeleteFlag) {
        this.DeleteFlag = DeleteFlag;
    }

    /**
     * Get 资源描述 
     * @return ResourceDesc 资源描述
     */
    public String getResourceDesc() {
        return this.ResourceDesc;
    }

    /**
     * Set 资源描述
     * @param ResourceDesc 资源描述
     */
    public void setResourceDesc(String ResourceDesc) {
        this.ResourceDesc = ResourceDesc;
    }

    /**
     * Get 是否可以选择全部 
     * @return CanSelectAll 是否可以选择全部
     */
    public Boolean getCanSelectAll() {
        return this.CanSelectAll;
    }

    /**
     * Set 是否可以选择全部
     * @param CanSelectAll 是否可以选择全部
     */
    public void setCanSelectAll(Boolean CanSelectAll) {
        this.CanSelectAll = CanSelectAll;
    }

    /**
     * Get 资源数据查询的模糊查询字段名 
     * @return SearchWordField 资源数据查询的模糊查询字段名
     */
    public String getSearchWordField() {
        return this.SearchWordField;
    }

    /**
     * Set 资源数据查询的模糊查询字段名
     * @param SearchWordField 资源数据查询的模糊查询字段名
     */
    public void setSearchWordField(String SearchWordField) {
        this.SearchWordField = SearchWordField;
    }

    /**
     * Get 排序 
     * @return Index 排序
     */
    public Long getIndex() {
        return this.Index;
    }

    /**
     * Set 排序
     * @param Index 排序
     */
    public void setIndex(Long Index) {
        this.Index = Index;
    }

    public Resource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Resource(Resource source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ResourceCode != null) {
            this.ResourceCode = new String(source.ResourceCode);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.ServiceCode != null) {
            this.ServiceCode = new String(source.ServiceCode);
        }
        if (source.ResourceAction != null) {
            this.ResourceAction = new String(source.ResourceAction);
        }
        if (source.IdField != null) {
            this.IdField = new String(source.IdField);
        }
        if (source.NameField != null) {
            this.NameField = new String(source.NameField);
        }
        if (source.SelectIdsField != null) {
            this.SelectIdsField = new String(source.SelectIdsField);
        }
        if (source.CreationTime != null) {
            this.CreationTime = new Long(source.CreationTime);
        }
        if (source.LastUpdateTime != null) {
            this.LastUpdateTime = new Long(source.LastUpdateTime);
        }
        if (source.DeleteFlag != null) {
            this.DeleteFlag = new Boolean(source.DeleteFlag);
        }
        if (source.ResourceDesc != null) {
            this.ResourceDesc = new String(source.ResourceDesc);
        }
        if (source.CanSelectAll != null) {
            this.CanSelectAll = new Boolean(source.CanSelectAll);
        }
        if (source.SearchWordField != null) {
            this.SearchWordField = new String(source.SearchWordField);
        }
        if (source.Index != null) {
            this.Index = new Long(source.Index);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ResourceCode", this.ResourceCode);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "ServiceCode", this.ServiceCode);
        this.setParamSimple(map, prefix + "ResourceAction", this.ResourceAction);
        this.setParamSimple(map, prefix + "IdField", this.IdField);
        this.setParamSimple(map, prefix + "NameField", this.NameField);
        this.setParamSimple(map, prefix + "SelectIdsField", this.SelectIdsField);
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);
        this.setParamSimple(map, prefix + "LastUpdateTime", this.LastUpdateTime);
        this.setParamSimple(map, prefix + "DeleteFlag", this.DeleteFlag);
        this.setParamSimple(map, prefix + "ResourceDesc", this.ResourceDesc);
        this.setParamSimple(map, prefix + "CanSelectAll", this.CanSelectAll);
        this.setParamSimple(map, prefix + "SearchWordField", this.SearchWordField);
        this.setParamSimple(map, prefix + "Index", this.Index);

    }
}

