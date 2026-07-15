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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DspmIdentifyRuleItem extends AbstractModel {

    /**
    * <p>数据项id</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>数据项名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>数据项描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>数据项是否启用</p><p>枚举值：</p><ul><li>0： 否</li><li>1： 是</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>数据项类型</p><p>枚举值：</p><ul><li>0： 内置</li><li>1： 自定义</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>更新时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>结构化规则配置状态</p>
    */
    @SerializedName("StructuredStatus")
    @Expose
    private Boolean StructuredStatus;

    /**
    * <p>非结构化规则配置状态</p>
    */
    @SerializedName("UnStructuredStatus")
    @Expose
    private Boolean UnStructuredStatus;

    /**
    * <p>关联的识别模板信息</p>
    */
    @SerializedName("ComplianceRelations")
    @Expose
    private DspmIdentifyRefComplianceInfo [] ComplianceRelations;

    /**
     * Get <p>数据项id</p> 
     * @return Id <p>数据项id</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>数据项id</p>
     * @param Id <p>数据项id</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>数据项名称</p> 
     * @return Name <p>数据项名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>数据项名称</p>
     * @param Name <p>数据项名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>数据项描述</p> 
     * @return Description <p>数据项描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>数据项描述</p>
     * @param Description <p>数据项描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>数据项是否启用</p><p>枚举值：</p><ul><li>0： 否</li><li>1： 是</li></ul> 
     * @return Status <p>数据项是否启用</p><p>枚举值：</p><ul><li>0： 否</li><li>1： 是</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>数据项是否启用</p><p>枚举值：</p><ul><li>0： 否</li><li>1： 是</li></ul>
     * @param Status <p>数据项是否启用</p><p>枚举值：</p><ul><li>0： 否</li><li>1： 是</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>数据项类型</p><p>枚举值：</p><ul><li>0： 内置</li><li>1： 自定义</li></ul> 
     * @return Type <p>数据项类型</p><p>枚举值：</p><ul><li>0： 内置</li><li>1： 自定义</li></ul>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>数据项类型</p><p>枚举值：</p><ul><li>0： 内置</li><li>1： 自定义</li></ul>
     * @param Type <p>数据项类型</p><p>枚举值：</p><ul><li>0： 内置</li><li>1： 自定义</li></ul>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>更新时间</p> 
     * @return UpdateTime <p>更新时间</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p>
     * @param UpdateTime <p>更新时间</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>结构化规则配置状态</p> 
     * @return StructuredStatus <p>结构化规则配置状态</p>
     */
    public Boolean getStructuredStatus() {
        return this.StructuredStatus;
    }

    /**
     * Set <p>结构化规则配置状态</p>
     * @param StructuredStatus <p>结构化规则配置状态</p>
     */
    public void setStructuredStatus(Boolean StructuredStatus) {
        this.StructuredStatus = StructuredStatus;
    }

    /**
     * Get <p>非结构化规则配置状态</p> 
     * @return UnStructuredStatus <p>非结构化规则配置状态</p>
     */
    public Boolean getUnStructuredStatus() {
        return this.UnStructuredStatus;
    }

    /**
     * Set <p>非结构化规则配置状态</p>
     * @param UnStructuredStatus <p>非结构化规则配置状态</p>
     */
    public void setUnStructuredStatus(Boolean UnStructuredStatus) {
        this.UnStructuredStatus = UnStructuredStatus;
    }

    /**
     * Get <p>关联的识别模板信息</p> 
     * @return ComplianceRelations <p>关联的识别模板信息</p>
     */
    public DspmIdentifyRefComplianceInfo [] getComplianceRelations() {
        return this.ComplianceRelations;
    }

    /**
     * Set <p>关联的识别模板信息</p>
     * @param ComplianceRelations <p>关联的识别模板信息</p>
     */
    public void setComplianceRelations(DspmIdentifyRefComplianceInfo [] ComplianceRelations) {
        this.ComplianceRelations = ComplianceRelations;
    }

    public DspmIdentifyRuleItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmIdentifyRuleItem(DspmIdentifyRuleItem source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.StructuredStatus != null) {
            this.StructuredStatus = new Boolean(source.StructuredStatus);
        }
        if (source.UnStructuredStatus != null) {
            this.UnStructuredStatus = new Boolean(source.UnStructuredStatus);
        }
        if (source.ComplianceRelations != null) {
            this.ComplianceRelations = new DspmIdentifyRefComplianceInfo[source.ComplianceRelations.length];
            for (int i = 0; i < source.ComplianceRelations.length; i++) {
                this.ComplianceRelations[i] = new DspmIdentifyRefComplianceInfo(source.ComplianceRelations[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "StructuredStatus", this.StructuredStatus);
        this.setParamSimple(map, prefix + "UnStructuredStatus", this.UnStructuredStatus);
        this.setParamArrayObj(map, prefix + "ComplianceRelations.", this.ComplianceRelations);

    }
}

