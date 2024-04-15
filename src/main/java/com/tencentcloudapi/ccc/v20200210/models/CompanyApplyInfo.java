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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CompanyApplyInfo extends AbstractModel {

    /**
    * 申请人身份，0-公司法定代表人，1-经办人（受法定代表人委托）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicantType")
    @Expose
    private Long ApplicantType;

    /**
    * 企业名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CompanyName")
    @Expose
    private String CompanyName;

    /**
    * 统一社会信用代码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BusinessId")
    @Expose
    private String BusinessId;

    /**
    * 营业执照扫描件(加盖公章)。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BusinessIdPicUrl")
    @Expose
    private String BusinessIdPicUrl;

    /**
    * 法定代表人名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CorporationName")
    @Expose
    private String CorporationName;

    /**
    * 法定代表人身份证号码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CorporationId")
    @Expose
    private String CorporationId;

    /**
    * 法定代表人身份证正反面扫描件。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CorporationIdPicUrl")
    @Expose
    private String CorporationIdPicUrl;

    /**
    * 业务经营范围
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BusinessScope")
    @Expose
    private String BusinessScope;

    /**
    * 电话受理单。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AcceptPicUrl")
    @Expose
    private String AcceptPicUrl;

    /**
    * 电信入网承诺书。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NetworkCommitmentPicUrl")
    @Expose
    private String NetworkCommitmentPicUrl;

    /**
    * 法定代表人手持身份证照，申请人类型为法定代表人时必填。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CorporationHoldingOnIdPicUrl")
    @Expose
    private String CorporationHoldingOnIdPicUrl;

    /**
    * 经办人名称，申请人类型为经办人时必填。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperatorName")
    @Expose
    private String OperatorName;

    /**
    * 经办人证件号码，申请人类型为经办人时必填。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperatorId")
    @Expose
    private String OperatorId;

    /**
    * 经办人身份证正反面扫描件，申请人类型为经办人时必填。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperatorIdPicUrl")
    @Expose
    private String OperatorIdPicUrl;

    /**
    * 经办人手持身份证照，申请人类型为经办人时必填。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperatorHoldingOnIdPicUrl")
    @Expose
    private String OperatorHoldingOnIdPicUrl;

    /**
    * 委托授权书，申请人类型为经办人时必填。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CommissionPicUrl")
    @Expose
    private String CommissionPicUrl;

    /**
     * Get 申请人身份，0-公司法定代表人，1-经办人（受法定代表人委托）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicantType 申请人身份，0-公司法定代表人，1-经办人（受法定代表人委托）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getApplicantType() {
        return this.ApplicantType;
    }

    /**
     * Set 申请人身份，0-公司法定代表人，1-经办人（受法定代表人委托）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicantType 申请人身份，0-公司法定代表人，1-经办人（受法定代表人委托）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicantType(Long ApplicantType) {
        this.ApplicantType = ApplicantType;
    }

    /**
     * Get 企业名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompanyName 企业名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCompanyName() {
        return this.CompanyName;
    }

    /**
     * Set 企业名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompanyName 企业名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }

    /**
     * Get 统一社会信用代码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BusinessId 统一社会信用代码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBusinessId() {
        return this.BusinessId;
    }

    /**
     * Set 统一社会信用代码
注意：此字段可能返回 null，表示取不到有效值。
     * @param BusinessId 统一社会信用代码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBusinessId(String BusinessId) {
        this.BusinessId = BusinessId;
    }

    /**
     * Get 营业执照扫描件(加盖公章)。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BusinessIdPicUrl 营业执照扫描件(加盖公章)。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBusinessIdPicUrl() {
        return this.BusinessIdPicUrl;
    }

    /**
     * Set 营业执照扫描件(加盖公章)。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
注意：此字段可能返回 null，表示取不到有效值。
     * @param BusinessIdPicUrl 营业执照扫描件(加盖公章)。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBusinessIdPicUrl(String BusinessIdPicUrl) {
        this.BusinessIdPicUrl = BusinessIdPicUrl;
    }

    /**
     * Get 法定代表人名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CorporationName 法定代表人名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCorporationName() {
        return this.CorporationName;
    }

    /**
     * Set 法定代表人名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param CorporationName 法定代表人名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCorporationName(String CorporationName) {
        this.CorporationName = CorporationName;
    }

    /**
     * Get 法定代表人身份证号码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CorporationId 法定代表人身份证号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCorporationId() {
        return this.CorporationId;
    }

    /**
     * Set 法定代表人身份证号码
注意：此字段可能返回 null，表示取不到有效值。
     * @param CorporationId 法定代表人身份证号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCorporationId(String CorporationId) {
        this.CorporationId = CorporationId;
    }

    /**
     * Get 法定代表人身份证正反面扫描件。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CorporationIdPicUrl 法定代表人身份证正反面扫描件。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCorporationIdPicUrl() {
        return this.CorporationIdPicUrl;
    }

    /**
     * Set 法定代表人身份证正反面扫描件。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
注意：此字段可能返回 null，表示取不到有效值。
     * @param CorporationIdPicUrl 法定代表人身份证正反面扫描件。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCorporationIdPicUrl(String CorporationIdPicUrl) {
        this.CorporationIdPicUrl = CorporationIdPicUrl;
    }

    /**
     * Get 业务经营范围
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BusinessScope 业务经营范围
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBusinessScope() {
        return this.BusinessScope;
    }

    /**
     * Set 业务经营范围
注意：此字段可能返回 null，表示取不到有效值。
     * @param BusinessScope 业务经营范围
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBusinessScope(String BusinessScope) {
        this.BusinessScope = BusinessScope;
    }

    /**
     * Get 电话受理单。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AcceptPicUrl 电话受理单。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAcceptPicUrl() {
        return this.AcceptPicUrl;
    }

    /**
     * Set 电话受理单。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
注意：此字段可能返回 null，表示取不到有效值。
     * @param AcceptPicUrl 电话受理单。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAcceptPicUrl(String AcceptPicUrl) {
        this.AcceptPicUrl = AcceptPicUrl;
    }

    /**
     * Get 电信入网承诺书。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NetworkCommitmentPicUrl 电信入网承诺书。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNetworkCommitmentPicUrl() {
        return this.NetworkCommitmentPicUrl;
    }

    /**
     * Set 电信入网承诺书。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
注意：此字段可能返回 null，表示取不到有效值。
     * @param NetworkCommitmentPicUrl 电信入网承诺书。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetworkCommitmentPicUrl(String NetworkCommitmentPicUrl) {
        this.NetworkCommitmentPicUrl = NetworkCommitmentPicUrl;
    }

    /**
     * Get 法定代表人手持身份证照，申请人类型为法定代表人时必填。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CorporationHoldingOnIdPicUrl 法定代表人手持身份证照，申请人类型为法定代表人时必填。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCorporationHoldingOnIdPicUrl() {
        return this.CorporationHoldingOnIdPicUrl;
    }

    /**
     * Set 法定代表人手持身份证照，申请人类型为法定代表人时必填。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
注意：此字段可能返回 null，表示取不到有效值。
     * @param CorporationHoldingOnIdPicUrl 法定代表人手持身份证照，申请人类型为法定代表人时必填。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCorporationHoldingOnIdPicUrl(String CorporationHoldingOnIdPicUrl) {
        this.CorporationHoldingOnIdPicUrl = CorporationHoldingOnIdPicUrl;
    }

    /**
     * Get 经办人名称，申请人类型为经办人时必填。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperatorName 经办人名称，申请人类型为经办人时必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperatorName() {
        return this.OperatorName;
    }

    /**
     * Set 经办人名称，申请人类型为经办人时必填。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperatorName 经办人名称，申请人类型为经办人时必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperatorName(String OperatorName) {
        this.OperatorName = OperatorName;
    }

    /**
     * Get 经办人证件号码，申请人类型为经办人时必填。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperatorId 经办人证件号码，申请人类型为经办人时必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperatorId() {
        return this.OperatorId;
    }

    /**
     * Set 经办人证件号码，申请人类型为经办人时必填。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperatorId 经办人证件号码，申请人类型为经办人时必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperatorId(String OperatorId) {
        this.OperatorId = OperatorId;
    }

    /**
     * Get 经办人身份证正反面扫描件，申请人类型为经办人时必填。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperatorIdPicUrl 经办人身份证正反面扫描件，申请人类型为经办人时必填。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperatorIdPicUrl() {
        return this.OperatorIdPicUrl;
    }

    /**
     * Set 经办人身份证正反面扫描件，申请人类型为经办人时必填。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperatorIdPicUrl 经办人身份证正反面扫描件，申请人类型为经办人时必填。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperatorIdPicUrl(String OperatorIdPicUrl) {
        this.OperatorIdPicUrl = OperatorIdPicUrl;
    }

    /**
     * Get 经办人手持身份证照，申请人类型为经办人时必填。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperatorHoldingOnIdPicUrl 经办人手持身份证照，申请人类型为经办人时必填。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperatorHoldingOnIdPicUrl() {
        return this.OperatorHoldingOnIdPicUrl;
    }

    /**
     * Set 经办人手持身份证照，申请人类型为经办人时必填。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperatorHoldingOnIdPicUrl 经办人手持身份证照，申请人类型为经办人时必填。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperatorHoldingOnIdPicUrl(String OperatorHoldingOnIdPicUrl) {
        this.OperatorHoldingOnIdPicUrl = OperatorHoldingOnIdPicUrl;
    }

    /**
     * Get 委托授权书，申请人类型为经办人时必填。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CommissionPicUrl 委托授权书，申请人类型为经办人时必填。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCommissionPicUrl() {
        return this.CommissionPicUrl;
    }

    /**
     * Set 委托授权书，申请人类型为经办人时必填。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
注意：此字段可能返回 null，表示取不到有效值。
     * @param CommissionPicUrl 委托授权书，申请人类型为经办人时必填。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCommissionPicUrl(String CommissionPicUrl) {
        this.CommissionPicUrl = CommissionPicUrl;
    }

    public CompanyApplyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CompanyApplyInfo(CompanyApplyInfo source) {
        if (source.ApplicantType != null) {
            this.ApplicantType = new Long(source.ApplicantType);
        }
        if (source.CompanyName != null) {
            this.CompanyName = new String(source.CompanyName);
        }
        if (source.BusinessId != null) {
            this.BusinessId = new String(source.BusinessId);
        }
        if (source.BusinessIdPicUrl != null) {
            this.BusinessIdPicUrl = new String(source.BusinessIdPicUrl);
        }
        if (source.CorporationName != null) {
            this.CorporationName = new String(source.CorporationName);
        }
        if (source.CorporationId != null) {
            this.CorporationId = new String(source.CorporationId);
        }
        if (source.CorporationIdPicUrl != null) {
            this.CorporationIdPicUrl = new String(source.CorporationIdPicUrl);
        }
        if (source.BusinessScope != null) {
            this.BusinessScope = new String(source.BusinessScope);
        }
        if (source.AcceptPicUrl != null) {
            this.AcceptPicUrl = new String(source.AcceptPicUrl);
        }
        if (source.NetworkCommitmentPicUrl != null) {
            this.NetworkCommitmentPicUrl = new String(source.NetworkCommitmentPicUrl);
        }
        if (source.CorporationHoldingOnIdPicUrl != null) {
            this.CorporationHoldingOnIdPicUrl = new String(source.CorporationHoldingOnIdPicUrl);
        }
        if (source.OperatorName != null) {
            this.OperatorName = new String(source.OperatorName);
        }
        if (source.OperatorId != null) {
            this.OperatorId = new String(source.OperatorId);
        }
        if (source.OperatorIdPicUrl != null) {
            this.OperatorIdPicUrl = new String(source.OperatorIdPicUrl);
        }
        if (source.OperatorHoldingOnIdPicUrl != null) {
            this.OperatorHoldingOnIdPicUrl = new String(source.OperatorHoldingOnIdPicUrl);
        }
        if (source.CommissionPicUrl != null) {
            this.CommissionPicUrl = new String(source.CommissionPicUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicantType", this.ApplicantType);
        this.setParamSimple(map, prefix + "CompanyName", this.CompanyName);
        this.setParamSimple(map, prefix + "BusinessId", this.BusinessId);
        this.setParamSimple(map, prefix + "BusinessIdPicUrl", this.BusinessIdPicUrl);
        this.setParamSimple(map, prefix + "CorporationName", this.CorporationName);
        this.setParamSimple(map, prefix + "CorporationId", this.CorporationId);
        this.setParamSimple(map, prefix + "CorporationIdPicUrl", this.CorporationIdPicUrl);
        this.setParamSimple(map, prefix + "BusinessScope", this.BusinessScope);
        this.setParamSimple(map, prefix + "AcceptPicUrl", this.AcceptPicUrl);
        this.setParamSimple(map, prefix + "NetworkCommitmentPicUrl", this.NetworkCommitmentPicUrl);
        this.setParamSimple(map, prefix + "CorporationHoldingOnIdPicUrl", this.CorporationHoldingOnIdPicUrl);
        this.setParamSimple(map, prefix + "OperatorName", this.OperatorName);
        this.setParamSimple(map, prefix + "OperatorId", this.OperatorId);
        this.setParamSimple(map, prefix + "OperatorIdPicUrl", this.OperatorIdPicUrl);
        this.setParamSimple(map, prefix + "OperatorHoldingOnIdPicUrl", this.OperatorHoldingOnIdPicUrl);
        this.setParamSimple(map, prefix + "CommissionPicUrl", this.CommissionPicUrl);

    }
}

