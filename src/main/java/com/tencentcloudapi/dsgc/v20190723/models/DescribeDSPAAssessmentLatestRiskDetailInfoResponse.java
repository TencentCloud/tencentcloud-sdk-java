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

public class DescribeDSPAAssessmentLatestRiskDetailInfoResponse extends AbstractModel {

    /**
    * 数据源id
    */
    @SerializedName("DataSourceId")
    @Expose
    private String DataSourceId;

    /**
    * 数据源name
    */
    @SerializedName("DataSourceName")
    @Expose
    private String DataSourceName;

    /**
    * 资产对象名称
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

    /**
    * 风险评估模板id
    */
    @SerializedName("AssessmentTemplateId")
    @Expose
    private Long AssessmentTemplateId;

    /**
    * 分类分级的模板id
    */
    @SerializedName("IdentifyTemplateId")
    @Expose
    private Long IdentifyTemplateId;

    /**
    * 风险类型
    */
    @SerializedName("RiskType")
    @Expose
    private String RiskType;

    /**
    * 风险项
    */
    @SerializedName("RiskName")
    @Expose
    private String RiskName;

    /**
    * 风险的描述
    */
    @SerializedName("RiskDescription")
    @Expose
    private String RiskDescription;

    /**
    * 风险的级别
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * 处置的建议
    */
    @SerializedName("SuggestAction")
    @Expose
    private String SuggestAction;

    /**
    * 处置状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 安全产品
    */
    @SerializedName("SecurityProduct")
    @Expose
    private SecurityProduct [] SecurityProduct;

    /**
    * 风险归属
    */
    @SerializedName("RiskDimension")
    @Expose
    private String RiskDimension;

    /**
    * 关联数据库（如果风险归属是instance）
    */
    @SerializedName("RelationAsset")
    @Expose
    private String [] RelationAsset;

    /**
    * 风险账号详情
    */
    @SerializedName("AccountRiskDetail")
    @Expose
    private AccountRisk [] AccountRiskDetail;

    /**
    * 权限风险详情
    */
    @SerializedName("PrivilegeRiskDetail")
    @Expose
    private PrivilegeRisk [] PrivilegeRiskDetail;

    /**
    * 策略风险的cos风险文件列表
    */
    @SerializedName("PolicyRiskCosFileList")
    @Expose
    private String [] PolicyRiskCosFileList;

    /**
    * AKSK泄漏列表
    */
    @SerializedName("AKSKLeak")
    @Expose
    private AKSKLeak [] AKSKLeak;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 数据源id 
     * @return DataSourceId 数据源id
     */
    public String getDataSourceId() {
        return this.DataSourceId;
    }

    /**
     * Set 数据源id
     * @param DataSourceId 数据源id
     */
    public void setDataSourceId(String DataSourceId) {
        this.DataSourceId = DataSourceId;
    }

    /**
     * Get 数据源name 
     * @return DataSourceName 数据源name
     */
    public String getDataSourceName() {
        return this.DataSourceName;
    }

    /**
     * Set 数据源name
     * @param DataSourceName 数据源name
     */
    public void setDataSourceName(String DataSourceName) {
        this.DataSourceName = DataSourceName;
    }

    /**
     * Get 资产对象名称 
     * @return AssetName 资产对象名称
     */
    public String getAssetName() {
        return this.AssetName;
    }

    /**
     * Set 资产对象名称
     * @param AssetName 资产对象名称
     */
    public void setAssetName(String AssetName) {
        this.AssetName = AssetName;
    }

    /**
     * Get 风险评估模板id 
     * @return AssessmentTemplateId 风险评估模板id
     */
    public Long getAssessmentTemplateId() {
        return this.AssessmentTemplateId;
    }

    /**
     * Set 风险评估模板id
     * @param AssessmentTemplateId 风险评估模板id
     */
    public void setAssessmentTemplateId(Long AssessmentTemplateId) {
        this.AssessmentTemplateId = AssessmentTemplateId;
    }

    /**
     * Get 分类分级的模板id 
     * @return IdentifyTemplateId 分类分级的模板id
     */
    public Long getIdentifyTemplateId() {
        return this.IdentifyTemplateId;
    }

    /**
     * Set 分类分级的模板id
     * @param IdentifyTemplateId 分类分级的模板id
     */
    public void setIdentifyTemplateId(Long IdentifyTemplateId) {
        this.IdentifyTemplateId = IdentifyTemplateId;
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
     * Get 风险项 
     * @return RiskName 风险项
     */
    public String getRiskName() {
        return this.RiskName;
    }

    /**
     * Set 风险项
     * @param RiskName 风险项
     */
    public void setRiskName(String RiskName) {
        this.RiskName = RiskName;
    }

    /**
     * Get 风险的描述 
     * @return RiskDescription 风险的描述
     */
    public String getRiskDescription() {
        return this.RiskDescription;
    }

    /**
     * Set 风险的描述
     * @param RiskDescription 风险的描述
     */
    public void setRiskDescription(String RiskDescription) {
        this.RiskDescription = RiskDescription;
    }

    /**
     * Get 风险的级别 
     * @return RiskLevel 风险的级别
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set 风险的级别
     * @param RiskLevel 风险的级别
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get 处置的建议 
     * @return SuggestAction 处置的建议
     */
    public String getSuggestAction() {
        return this.SuggestAction;
    }

    /**
     * Set 处置的建议
     * @param SuggestAction 处置的建议
     */
    public void setSuggestAction(String SuggestAction) {
        this.SuggestAction = SuggestAction;
    }

    /**
     * Get 处置状态 
     * @return Status 处置状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 处置状态
     * @param Status 处置状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 安全产品 
     * @return SecurityProduct 安全产品
     */
    public SecurityProduct [] getSecurityProduct() {
        return this.SecurityProduct;
    }

    /**
     * Set 安全产品
     * @param SecurityProduct 安全产品
     */
    public void setSecurityProduct(SecurityProduct [] SecurityProduct) {
        this.SecurityProduct = SecurityProduct;
    }

    /**
     * Get 风险归属 
     * @return RiskDimension 风险归属
     */
    public String getRiskDimension() {
        return this.RiskDimension;
    }

    /**
     * Set 风险归属
     * @param RiskDimension 风险归属
     */
    public void setRiskDimension(String RiskDimension) {
        this.RiskDimension = RiskDimension;
    }

    /**
     * Get 关联数据库（如果风险归属是instance） 
     * @return RelationAsset 关联数据库（如果风险归属是instance）
     */
    public String [] getRelationAsset() {
        return this.RelationAsset;
    }

    /**
     * Set 关联数据库（如果风险归属是instance）
     * @param RelationAsset 关联数据库（如果风险归属是instance）
     */
    public void setRelationAsset(String [] RelationAsset) {
        this.RelationAsset = RelationAsset;
    }

    /**
     * Get 风险账号详情 
     * @return AccountRiskDetail 风险账号详情
     */
    public AccountRisk [] getAccountRiskDetail() {
        return this.AccountRiskDetail;
    }

    /**
     * Set 风险账号详情
     * @param AccountRiskDetail 风险账号详情
     */
    public void setAccountRiskDetail(AccountRisk [] AccountRiskDetail) {
        this.AccountRiskDetail = AccountRiskDetail;
    }

    /**
     * Get 权限风险详情 
     * @return PrivilegeRiskDetail 权限风险详情
     */
    public PrivilegeRisk [] getPrivilegeRiskDetail() {
        return this.PrivilegeRiskDetail;
    }

    /**
     * Set 权限风险详情
     * @param PrivilegeRiskDetail 权限风险详情
     */
    public void setPrivilegeRiskDetail(PrivilegeRisk [] PrivilegeRiskDetail) {
        this.PrivilegeRiskDetail = PrivilegeRiskDetail;
    }

    /**
     * Get 策略风险的cos风险文件列表 
     * @return PolicyRiskCosFileList 策略风险的cos风险文件列表
     */
    public String [] getPolicyRiskCosFileList() {
        return this.PolicyRiskCosFileList;
    }

    /**
     * Set 策略风险的cos风险文件列表
     * @param PolicyRiskCosFileList 策略风险的cos风险文件列表
     */
    public void setPolicyRiskCosFileList(String [] PolicyRiskCosFileList) {
        this.PolicyRiskCosFileList = PolicyRiskCosFileList;
    }

    /**
     * Get AKSK泄漏列表 
     * @return AKSKLeak AKSK泄漏列表
     */
    public AKSKLeak [] getAKSKLeak() {
        return this.AKSKLeak;
    }

    /**
     * Set AKSK泄漏列表
     * @param AKSKLeak AKSK泄漏列表
     */
    public void setAKSKLeak(AKSKLeak [] AKSKLeak) {
        this.AKSKLeak = AKSKLeak;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeDSPAAssessmentLatestRiskDetailInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDSPAAssessmentLatestRiskDetailInfoResponse(DescribeDSPAAssessmentLatestRiskDetailInfoResponse source) {
        if (source.DataSourceId != null) {
            this.DataSourceId = new String(source.DataSourceId);
        }
        if (source.DataSourceName != null) {
            this.DataSourceName = new String(source.DataSourceName);
        }
        if (source.AssetName != null) {
            this.AssetName = new String(source.AssetName);
        }
        if (source.AssessmentTemplateId != null) {
            this.AssessmentTemplateId = new Long(source.AssessmentTemplateId);
        }
        if (source.IdentifyTemplateId != null) {
            this.IdentifyTemplateId = new Long(source.IdentifyTemplateId);
        }
        if (source.RiskType != null) {
            this.RiskType = new String(source.RiskType);
        }
        if (source.RiskName != null) {
            this.RiskName = new String(source.RiskName);
        }
        if (source.RiskDescription != null) {
            this.RiskDescription = new String(source.RiskDescription);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.SuggestAction != null) {
            this.SuggestAction = new String(source.SuggestAction);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.SecurityProduct != null) {
            this.SecurityProduct = new SecurityProduct[source.SecurityProduct.length];
            for (int i = 0; i < source.SecurityProduct.length; i++) {
                this.SecurityProduct[i] = new SecurityProduct(source.SecurityProduct[i]);
            }
        }
        if (source.RiskDimension != null) {
            this.RiskDimension = new String(source.RiskDimension);
        }
        if (source.RelationAsset != null) {
            this.RelationAsset = new String[source.RelationAsset.length];
            for (int i = 0; i < source.RelationAsset.length; i++) {
                this.RelationAsset[i] = new String(source.RelationAsset[i]);
            }
        }
        if (source.AccountRiskDetail != null) {
            this.AccountRiskDetail = new AccountRisk[source.AccountRiskDetail.length];
            for (int i = 0; i < source.AccountRiskDetail.length; i++) {
                this.AccountRiskDetail[i] = new AccountRisk(source.AccountRiskDetail[i]);
            }
        }
        if (source.PrivilegeRiskDetail != null) {
            this.PrivilegeRiskDetail = new PrivilegeRisk[source.PrivilegeRiskDetail.length];
            for (int i = 0; i < source.PrivilegeRiskDetail.length; i++) {
                this.PrivilegeRiskDetail[i] = new PrivilegeRisk(source.PrivilegeRiskDetail[i]);
            }
        }
        if (source.PolicyRiskCosFileList != null) {
            this.PolicyRiskCosFileList = new String[source.PolicyRiskCosFileList.length];
            for (int i = 0; i < source.PolicyRiskCosFileList.length; i++) {
                this.PolicyRiskCosFileList[i] = new String(source.PolicyRiskCosFileList[i]);
            }
        }
        if (source.AKSKLeak != null) {
            this.AKSKLeak = new AKSKLeak[source.AKSKLeak.length];
            for (int i = 0; i < source.AKSKLeak.length; i++) {
                this.AKSKLeak[i] = new AKSKLeak(source.AKSKLeak[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataSourceId", this.DataSourceId);
        this.setParamSimple(map, prefix + "DataSourceName", this.DataSourceName);
        this.setParamSimple(map, prefix + "AssetName", this.AssetName);
        this.setParamSimple(map, prefix + "AssessmentTemplateId", this.AssessmentTemplateId);
        this.setParamSimple(map, prefix + "IdentifyTemplateId", this.IdentifyTemplateId);
        this.setParamSimple(map, prefix + "RiskType", this.RiskType);
        this.setParamSimple(map, prefix + "RiskName", this.RiskName);
        this.setParamSimple(map, prefix + "RiskDescription", this.RiskDescription);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "SuggestAction", this.SuggestAction);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamArrayObj(map, prefix + "SecurityProduct.", this.SecurityProduct);
        this.setParamSimple(map, prefix + "RiskDimension", this.RiskDimension);
        this.setParamArraySimple(map, prefix + "RelationAsset.", this.RelationAsset);
        this.setParamArrayObj(map, prefix + "AccountRiskDetail.", this.AccountRiskDetail);
        this.setParamArrayObj(map, prefix + "PrivilegeRiskDetail.", this.PrivilegeRiskDetail);
        this.setParamArraySimple(map, prefix + "PolicyRiskCosFileList.", this.PolicyRiskCosFileList);
        this.setParamArrayObj(map, prefix + "AKSKLeak.", this.AKSKLeak);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

