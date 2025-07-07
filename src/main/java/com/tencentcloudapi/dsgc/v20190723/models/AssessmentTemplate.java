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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssessmentTemplate extends AbstractModel {

    /**
    * id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 评估模板Id
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 评估模板名称
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * 描述信息
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 模板来源，内置/用户自定，取值（system，user）
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 模板类型，自动化/半自动化/问卷，取值（auto，semi-auto，law）等
    */
    @SerializedName("UseType")
    @Expose
    private String UseType;

    /**
    * 评估模板创建时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 模板关联的评估项数量
    */
    @SerializedName("ControlItemCount")
    @Expose
    private Long ControlItemCount;

    /**
    * 模板已启用的评估项数量
    */
    @SerializedName("AppliedItemCount")
    @Expose
    private Long AppliedItemCount;

    /**
    * 模板启用状态，草稿/已启用，取值draft / launched
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 支持的数据源类型
    */
    @SerializedName("SupportDataSource")
    @Expose
    private String [] SupportDataSource;

    /**
    * 是否包含攻击面风险
    */
    @SerializedName("IsASMTemplate")
    @Expose
    private Boolean IsASMTemplate;

    /**
    * 合规组id
    */
    @SerializedName("IdentifyComplianceId")
    @Expose
    private Long IdentifyComplianceId;

    /**
     * Get id 
     * @return Id id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set id
     * @param Id id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 评估模板Id 
     * @return TemplateId 评估模板Id
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 评估模板Id
     * @param TemplateId 评估模板Id
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 评估模板名称 
     * @return TemplateName 评估模板名称
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set 评估模板名称
     * @param TemplateName 评估模板名称
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get 描述信息 
     * @return Description 描述信息
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述信息
     * @param Description 描述信息
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 模板来源，内置/用户自定，取值（system，user） 
     * @return Source 模板来源，内置/用户自定，取值（system，user）
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 模板来源，内置/用户自定，取值（system，user）
     * @param Source 模板来源，内置/用户自定，取值（system，user）
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 模板类型，自动化/半自动化/问卷，取值（auto，semi-auto，law）等 
     * @return UseType 模板类型，自动化/半自动化/问卷，取值（auto，semi-auto，law）等
     */
    public String getUseType() {
        return this.UseType;
    }

    /**
     * Set 模板类型，自动化/半自动化/问卷，取值（auto，semi-auto，law）等
     * @param UseType 模板类型，自动化/半自动化/问卷，取值（auto，semi-auto，law）等
     */
    public void setUseType(String UseType) {
        this.UseType = UseType;
    }

    /**
     * Get 评估模板创建时间 
     * @return CreatedTime 评估模板创建时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 评估模板创建时间
     * @param CreatedTime 评估模板创建时间
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 模板关联的评估项数量 
     * @return ControlItemCount 模板关联的评估项数量
     */
    public Long getControlItemCount() {
        return this.ControlItemCount;
    }

    /**
     * Set 模板关联的评估项数量
     * @param ControlItemCount 模板关联的评估项数量
     */
    public void setControlItemCount(Long ControlItemCount) {
        this.ControlItemCount = ControlItemCount;
    }

    /**
     * Get 模板已启用的评估项数量 
     * @return AppliedItemCount 模板已启用的评估项数量
     */
    public Long getAppliedItemCount() {
        return this.AppliedItemCount;
    }

    /**
     * Set 模板已启用的评估项数量
     * @param AppliedItemCount 模板已启用的评估项数量
     */
    public void setAppliedItemCount(Long AppliedItemCount) {
        this.AppliedItemCount = AppliedItemCount;
    }

    /**
     * Get 模板启用状态，草稿/已启用，取值draft / launched 
     * @return Status 模板启用状态，草稿/已启用，取值draft / launched
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 模板启用状态，草稿/已启用，取值draft / launched
     * @param Status 模板启用状态，草稿/已启用，取值draft / launched
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 支持的数据源类型 
     * @return SupportDataSource 支持的数据源类型
     */
    public String [] getSupportDataSource() {
        return this.SupportDataSource;
    }

    /**
     * Set 支持的数据源类型
     * @param SupportDataSource 支持的数据源类型
     */
    public void setSupportDataSource(String [] SupportDataSource) {
        this.SupportDataSource = SupportDataSource;
    }

    /**
     * Get 是否包含攻击面风险 
     * @return IsASMTemplate 是否包含攻击面风险
     */
    public Boolean getIsASMTemplate() {
        return this.IsASMTemplate;
    }

    /**
     * Set 是否包含攻击面风险
     * @param IsASMTemplate 是否包含攻击面风险
     */
    public void setIsASMTemplate(Boolean IsASMTemplate) {
        this.IsASMTemplate = IsASMTemplate;
    }

    /**
     * Get 合规组id 
     * @return IdentifyComplianceId 合规组id
     */
    public Long getIdentifyComplianceId() {
        return this.IdentifyComplianceId;
    }

    /**
     * Set 合规组id
     * @param IdentifyComplianceId 合规组id
     */
    public void setIdentifyComplianceId(Long IdentifyComplianceId) {
        this.IdentifyComplianceId = IdentifyComplianceId;
    }

    public AssessmentTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssessmentTemplate(AssessmentTemplate source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.UseType != null) {
            this.UseType = new String(source.UseType);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.ControlItemCount != null) {
            this.ControlItemCount = new Long(source.ControlItemCount);
        }
        if (source.AppliedItemCount != null) {
            this.AppliedItemCount = new Long(source.AppliedItemCount);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.SupportDataSource != null) {
            this.SupportDataSource = new String[source.SupportDataSource.length];
            for (int i = 0; i < source.SupportDataSource.length; i++) {
                this.SupportDataSource[i] = new String(source.SupportDataSource[i]);
            }
        }
        if (source.IsASMTemplate != null) {
            this.IsASMTemplate = new Boolean(source.IsASMTemplate);
        }
        if (source.IdentifyComplianceId != null) {
            this.IdentifyComplianceId = new Long(source.IdentifyComplianceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "UseType", this.UseType);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ControlItemCount", this.ControlItemCount);
        this.setParamSimple(map, prefix + "AppliedItemCount", this.AppliedItemCount);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "SupportDataSource.", this.SupportDataSource);
        this.setParamSimple(map, prefix + "IsASMTemplate", this.IsASMTemplate);
        this.setParamSimple(map, prefix + "IdentifyComplianceId", this.IdentifyComplianceId);

    }
}

