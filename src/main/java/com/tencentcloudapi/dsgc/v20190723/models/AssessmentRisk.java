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

public class AssessmentRisk extends AbstractModel {

    /**
    * 风险项Id
    */
    @SerializedName("RiskId")
    @Expose
    private String RiskId;

    /**
    * 风险项描述
    */
    @SerializedName("RiskDescription")
    @Expose
    private String RiskDescription;

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
    * 评估项Id
    */
    @SerializedName("ControlItemId")
    @Expose
    private String ControlItemId;

    /**
    * 评估项名称
    */
    @SerializedName("ControlItemName")
    @Expose
    private String ControlItemName;

    /**
    * 评估描述
    */
    @SerializedName("ControlItemDesc")
    @Expose
    private String ControlItemDesc;

    /**
    * 风险等级，取值（high，medium，low）
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * 风险缓解措施
    */
    @SerializedName("RiskMitigation")
    @Expose
    private String RiskMitigation;

    /**
    * 风险处理状态。(waiting待处理, processing处理中, finished已处理)
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 风险生成时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 风险负责人
    */
    @SerializedName("RiskOwner")
    @Expose
    private String RiskOwner;

    /**
    * 风险涉及资产
    */
    @SerializedName("RelatedAsset")
    @Expose
    private String RelatedAsset;

    /**
    * 风险涉及资产id
    */
    @SerializedName("DataSourceId")
    @Expose
    private String DataSourceId;

    /**
    * 风险涉及资产名称
    */
    @SerializedName("DataSourceName")
    @Expose
    private String DataSourceName;

    /**
    * 资产名称
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

    /**
    * 建议使用安全产品
    */
    @SerializedName("SecurityProduct")
    @Expose
    private SecurityProduct [] SecurityProduct;

    /**
    * 风险类型
    */
    @SerializedName("RiskType")
    @Expose
    private String RiskType;

    /**
    * 风险面
    */
    @SerializedName("RiskSide")
    @Expose
    private String RiskSide;

    /**
    * 数据源类型
    */
    @SerializedName("DataSourceType")
    @Expose
    private String DataSourceType;

    /**
     * Get 风险项Id 
     * @return RiskId 风险项Id
     */
    public String getRiskId() {
        return this.RiskId;
    }

    /**
     * Set 风险项Id
     * @param RiskId 风险项Id
     */
    public void setRiskId(String RiskId) {
        this.RiskId = RiskId;
    }

    /**
     * Get 风险项描述 
     * @return RiskDescription 风险项描述
     */
    public String getRiskDescription() {
        return this.RiskDescription;
    }

    /**
     * Set 风险项描述
     * @param RiskDescription 风险项描述
     */
    public void setRiskDescription(String RiskDescription) {
        this.RiskDescription = RiskDescription;
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
     * Get 评估项Id 
     * @return ControlItemId 评估项Id
     */
    public String getControlItemId() {
        return this.ControlItemId;
    }

    /**
     * Set 评估项Id
     * @param ControlItemId 评估项Id
     */
    public void setControlItemId(String ControlItemId) {
        this.ControlItemId = ControlItemId;
    }

    /**
     * Get 评估项名称 
     * @return ControlItemName 评估项名称
     */
    public String getControlItemName() {
        return this.ControlItemName;
    }

    /**
     * Set 评估项名称
     * @param ControlItemName 评估项名称
     */
    public void setControlItemName(String ControlItemName) {
        this.ControlItemName = ControlItemName;
    }

    /**
     * Get 评估描述 
     * @return ControlItemDesc 评估描述
     */
    public String getControlItemDesc() {
        return this.ControlItemDesc;
    }

    /**
     * Set 评估描述
     * @param ControlItemDesc 评估描述
     */
    public void setControlItemDesc(String ControlItemDesc) {
        this.ControlItemDesc = ControlItemDesc;
    }

    /**
     * Get 风险等级，取值（high，medium，low） 
     * @return RiskLevel 风险等级，取值（high，medium，low）
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set 风险等级，取值（high，medium，low）
     * @param RiskLevel 风险等级，取值（high，medium，low）
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get 风险缓解措施 
     * @return RiskMitigation 风险缓解措施
     */
    public String getRiskMitigation() {
        return this.RiskMitigation;
    }

    /**
     * Set 风险缓解措施
     * @param RiskMitigation 风险缓解措施
     */
    public void setRiskMitigation(String RiskMitigation) {
        this.RiskMitigation = RiskMitigation;
    }

    /**
     * Get 风险处理状态。(waiting待处理, processing处理中, finished已处理) 
     * @return Status 风险处理状态。(waiting待处理, processing处理中, finished已处理)
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 风险处理状态。(waiting待处理, processing处理中, finished已处理)
     * @param Status 风险处理状态。(waiting待处理, processing处理中, finished已处理)
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 风险生成时间 
     * @return CreatedTime 风险生成时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 风险生成时间
     * @param CreatedTime 风险生成时间
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 风险负责人 
     * @return RiskOwner 风险负责人
     */
    public String getRiskOwner() {
        return this.RiskOwner;
    }

    /**
     * Set 风险负责人
     * @param RiskOwner 风险负责人
     */
    public void setRiskOwner(String RiskOwner) {
        this.RiskOwner = RiskOwner;
    }

    /**
     * Get 风险涉及资产 
     * @return RelatedAsset 风险涉及资产
     */
    public String getRelatedAsset() {
        return this.RelatedAsset;
    }

    /**
     * Set 风险涉及资产
     * @param RelatedAsset 风险涉及资产
     */
    public void setRelatedAsset(String RelatedAsset) {
        this.RelatedAsset = RelatedAsset;
    }

    /**
     * Get 风险涉及资产id 
     * @return DataSourceId 风险涉及资产id
     */
    public String getDataSourceId() {
        return this.DataSourceId;
    }

    /**
     * Set 风险涉及资产id
     * @param DataSourceId 风险涉及资产id
     */
    public void setDataSourceId(String DataSourceId) {
        this.DataSourceId = DataSourceId;
    }

    /**
     * Get 风险涉及资产名称 
     * @return DataSourceName 风险涉及资产名称
     */
    public String getDataSourceName() {
        return this.DataSourceName;
    }

    /**
     * Set 风险涉及资产名称
     * @param DataSourceName 风险涉及资产名称
     */
    public void setDataSourceName(String DataSourceName) {
        this.DataSourceName = DataSourceName;
    }

    /**
     * Get 资产名称 
     * @return AssetName 资产名称
     */
    public String getAssetName() {
        return this.AssetName;
    }

    /**
     * Set 资产名称
     * @param AssetName 资产名称
     */
    public void setAssetName(String AssetName) {
        this.AssetName = AssetName;
    }

    /**
     * Get 建议使用安全产品 
     * @return SecurityProduct 建议使用安全产品
     */
    public SecurityProduct [] getSecurityProduct() {
        return this.SecurityProduct;
    }

    /**
     * Set 建议使用安全产品
     * @param SecurityProduct 建议使用安全产品
     */
    public void setSecurityProduct(SecurityProduct [] SecurityProduct) {
        this.SecurityProduct = SecurityProduct;
    }

    /**
     * Get 风险类型 
     * @return RiskType 风险类型
     */
    public String getRiskType() {
        return this.RiskType;
    }

    /**
     * Set 风险类型
     * @param RiskType 风险类型
     */
    public void setRiskType(String RiskType) {
        this.RiskType = RiskType;
    }

    /**
     * Get 风险面 
     * @return RiskSide 风险面
     */
    public String getRiskSide() {
        return this.RiskSide;
    }

    /**
     * Set 风险面
     * @param RiskSide 风险面
     */
    public void setRiskSide(String RiskSide) {
        this.RiskSide = RiskSide;
    }

    /**
     * Get 数据源类型 
     * @return DataSourceType 数据源类型
     */
    public String getDataSourceType() {
        return this.DataSourceType;
    }

    /**
     * Set 数据源类型
     * @param DataSourceType 数据源类型
     */
    public void setDataSourceType(String DataSourceType) {
        this.DataSourceType = DataSourceType;
    }

    public AssessmentRisk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssessmentRisk(AssessmentRisk source) {
        if (source.RiskId != null) {
            this.RiskId = new String(source.RiskId);
        }
        if (source.RiskDescription != null) {
            this.RiskDescription = new String(source.RiskDescription);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.ControlItemId != null) {
            this.ControlItemId = new String(source.ControlItemId);
        }
        if (source.ControlItemName != null) {
            this.ControlItemName = new String(source.ControlItemName);
        }
        if (source.ControlItemDesc != null) {
            this.ControlItemDesc = new String(source.ControlItemDesc);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.RiskMitigation != null) {
            this.RiskMitigation = new String(source.RiskMitigation);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.RiskOwner != null) {
            this.RiskOwner = new String(source.RiskOwner);
        }
        if (source.RelatedAsset != null) {
            this.RelatedAsset = new String(source.RelatedAsset);
        }
        if (source.DataSourceId != null) {
            this.DataSourceId = new String(source.DataSourceId);
        }
        if (source.DataSourceName != null) {
            this.DataSourceName = new String(source.DataSourceName);
        }
        if (source.AssetName != null) {
            this.AssetName = new String(source.AssetName);
        }
        if (source.SecurityProduct != null) {
            this.SecurityProduct = new SecurityProduct[source.SecurityProduct.length];
            for (int i = 0; i < source.SecurityProduct.length; i++) {
                this.SecurityProduct[i] = new SecurityProduct(source.SecurityProduct[i]);
            }
        }
        if (source.RiskType != null) {
            this.RiskType = new String(source.RiskType);
        }
        if (source.RiskSide != null) {
            this.RiskSide = new String(source.RiskSide);
        }
        if (source.DataSourceType != null) {
            this.DataSourceType = new String(source.DataSourceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RiskId", this.RiskId);
        this.setParamSimple(map, prefix + "RiskDescription", this.RiskDescription);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "ControlItemId", this.ControlItemId);
        this.setParamSimple(map, prefix + "ControlItemName", this.ControlItemName);
        this.setParamSimple(map, prefix + "ControlItemDesc", this.ControlItemDesc);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "RiskMitigation", this.RiskMitigation);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "RiskOwner", this.RiskOwner);
        this.setParamSimple(map, prefix + "RelatedAsset", this.RelatedAsset);
        this.setParamSimple(map, prefix + "DataSourceId", this.DataSourceId);
        this.setParamSimple(map, prefix + "DataSourceName", this.DataSourceName);
        this.setParamSimple(map, prefix + "AssetName", this.AssetName);
        this.setParamArrayObj(map, prefix + "SecurityProduct.", this.SecurityProduct);
        this.setParamSimple(map, prefix + "RiskType", this.RiskType);
        this.setParamSimple(map, prefix + "RiskSide", this.RiskSide);
        this.setParamSimple(map, prefix + "DataSourceType", this.DataSourceType);

    }
}

