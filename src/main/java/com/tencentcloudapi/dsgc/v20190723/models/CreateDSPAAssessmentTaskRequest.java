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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDSPAAssessmentTaskRequest extends AbstractModel {

    /**
    * DSPA实例Id，格式“dspa-xxxxxxxx”
    */
    @SerializedName("DspaId")
    @Expose
    private String DspaId;

    /**
    * 评估任务名称。1-20个字符，仅允许输入中文、英文字母、数字、'_'、'-'，并且开头和结尾需为中文、英文字母或者数字
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 评估模板Id，格式“template-xxxxxxxx”
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 评估业务名称。1-60个字符，仅允许输入中文、英文字母、数字、'_'、'-'，并且开头和结尾需为中文、英文字母或者数字
    */
    @SerializedName("BusinessName")
    @Expose
    private String BusinessName;

    /**
    * 业务所属部门。1-60个字符，仅允许输入中文、英文字母、数字、'_'、'-'，并且开头和结尾需为中文、英文字母或者数字
    */
    @SerializedName("BusinessDept")
    @Expose
    private String BusinessDept;

    /**
    * 业务负责人。1-60个字符，仅允许输入中文、英文字母、数字、'_'、'-'，并且开头和结尾需为中文、英文字母或者数字
    */
    @SerializedName("BusinessOwner")
    @Expose
    private String BusinessOwner;

    /**
    * 分类分级模板Id
    */
    @SerializedName("ComplianceId")
    @Expose
    private Long ComplianceId;

    /**
    * 敏感数据扫描数据源条件。
    */
    @SerializedName("DiscoveryCondition")
    @Expose
    private DiscoveryCondition DiscoveryCondition;

    /**
    * 说明
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get DSPA实例Id，格式“dspa-xxxxxxxx” 
     * @return DspaId DSPA实例Id，格式“dspa-xxxxxxxx”
     */
    public String getDspaId() {
        return this.DspaId;
    }

    /**
     * Set DSPA实例Id，格式“dspa-xxxxxxxx”
     * @param DspaId DSPA实例Id，格式“dspa-xxxxxxxx”
     */
    public void setDspaId(String DspaId) {
        this.DspaId = DspaId;
    }

    /**
     * Get 评估任务名称。1-20个字符，仅允许输入中文、英文字母、数字、'_'、'-'，并且开头和结尾需为中文、英文字母或者数字 
     * @return Name 评估任务名称。1-20个字符，仅允许输入中文、英文字母、数字、'_'、'-'，并且开头和结尾需为中文、英文字母或者数字
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 评估任务名称。1-20个字符，仅允许输入中文、英文字母、数字、'_'、'-'，并且开头和结尾需为中文、英文字母或者数字
     * @param Name 评估任务名称。1-20个字符，仅允许输入中文、英文字母、数字、'_'、'-'，并且开头和结尾需为中文、英文字母或者数字
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 评估模板Id，格式“template-xxxxxxxx” 
     * @return TemplateId 评估模板Id，格式“template-xxxxxxxx”
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 评估模板Id，格式“template-xxxxxxxx”
     * @param TemplateId 评估模板Id，格式“template-xxxxxxxx”
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 评估业务名称。1-60个字符，仅允许输入中文、英文字母、数字、'_'、'-'，并且开头和结尾需为中文、英文字母或者数字 
     * @return BusinessName 评估业务名称。1-60个字符，仅允许输入中文、英文字母、数字、'_'、'-'，并且开头和结尾需为中文、英文字母或者数字
     * @deprecated
     */
    @Deprecated
    public String getBusinessName() {
        return this.BusinessName;
    }

    /**
     * Set 评估业务名称。1-60个字符，仅允许输入中文、英文字母、数字、'_'、'-'，并且开头和结尾需为中文、英文字母或者数字
     * @param BusinessName 评估业务名称。1-60个字符，仅允许输入中文、英文字母、数字、'_'、'-'，并且开头和结尾需为中文、英文字母或者数字
     * @deprecated
     */
    @Deprecated
    public void setBusinessName(String BusinessName) {
        this.BusinessName = BusinessName;
    }

    /**
     * Get 业务所属部门。1-60个字符，仅允许输入中文、英文字母、数字、'_'、'-'，并且开头和结尾需为中文、英文字母或者数字 
     * @return BusinessDept 业务所属部门。1-60个字符，仅允许输入中文、英文字母、数字、'_'、'-'，并且开头和结尾需为中文、英文字母或者数字
     * @deprecated
     */
    @Deprecated
    public String getBusinessDept() {
        return this.BusinessDept;
    }

    /**
     * Set 业务所属部门。1-60个字符，仅允许输入中文、英文字母、数字、'_'、'-'，并且开头和结尾需为中文、英文字母或者数字
     * @param BusinessDept 业务所属部门。1-60个字符，仅允许输入中文、英文字母、数字、'_'、'-'，并且开头和结尾需为中文、英文字母或者数字
     * @deprecated
     */
    @Deprecated
    public void setBusinessDept(String BusinessDept) {
        this.BusinessDept = BusinessDept;
    }

    /**
     * Get 业务负责人。1-60个字符，仅允许输入中文、英文字母、数字、'_'、'-'，并且开头和结尾需为中文、英文字母或者数字 
     * @return BusinessOwner 业务负责人。1-60个字符，仅允许输入中文、英文字母、数字、'_'、'-'，并且开头和结尾需为中文、英文字母或者数字
     * @deprecated
     */
    @Deprecated
    public String getBusinessOwner() {
        return this.BusinessOwner;
    }

    /**
     * Set 业务负责人。1-60个字符，仅允许输入中文、英文字母、数字、'_'、'-'，并且开头和结尾需为中文、英文字母或者数字
     * @param BusinessOwner 业务负责人。1-60个字符，仅允许输入中文、英文字母、数字、'_'、'-'，并且开头和结尾需为中文、英文字母或者数字
     * @deprecated
     */
    @Deprecated
    public void setBusinessOwner(String BusinessOwner) {
        this.BusinessOwner = BusinessOwner;
    }

    /**
     * Get 分类分级模板Id 
     * @return ComplianceId 分类分级模板Id
     */
    public Long getComplianceId() {
        return this.ComplianceId;
    }

    /**
     * Set 分类分级模板Id
     * @param ComplianceId 分类分级模板Id
     */
    public void setComplianceId(Long ComplianceId) {
        this.ComplianceId = ComplianceId;
    }

    /**
     * Get 敏感数据扫描数据源条件。 
     * @return DiscoveryCondition 敏感数据扫描数据源条件。
     */
    public DiscoveryCondition getDiscoveryCondition() {
        return this.DiscoveryCondition;
    }

    /**
     * Set 敏感数据扫描数据源条件。
     * @param DiscoveryCondition 敏感数据扫描数据源条件。
     */
    public void setDiscoveryCondition(DiscoveryCondition DiscoveryCondition) {
        this.DiscoveryCondition = DiscoveryCondition;
    }

    /**
     * Get 说明 
     * @return Description 说明
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 说明
     * @param Description 说明
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CreateDSPAAssessmentTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDSPAAssessmentTaskRequest(CreateDSPAAssessmentTaskRequest source) {
        if (source.DspaId != null) {
            this.DspaId = new String(source.DspaId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.BusinessName != null) {
            this.BusinessName = new String(source.BusinessName);
        }
        if (source.BusinessDept != null) {
            this.BusinessDept = new String(source.BusinessDept);
        }
        if (source.BusinessOwner != null) {
            this.BusinessOwner = new String(source.BusinessOwner);
        }
        if (source.ComplianceId != null) {
            this.ComplianceId = new Long(source.ComplianceId);
        }
        if (source.DiscoveryCondition != null) {
            this.DiscoveryCondition = new DiscoveryCondition(source.DiscoveryCondition);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DspaId", this.DspaId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "BusinessName", this.BusinessName);
        this.setParamSimple(map, prefix + "BusinessDept", this.BusinessDept);
        this.setParamSimple(map, prefix + "BusinessOwner", this.BusinessOwner);
        this.setParamSimple(map, prefix + "ComplianceId", this.ComplianceId);
        this.setParamObj(map, prefix + "DiscoveryCondition.", this.DiscoveryCondition);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

