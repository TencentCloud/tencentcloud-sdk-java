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
    */
    @SerializedName("ApplicantType")
    @Expose
    private Long ApplicantType;

    /**
    * 企业名称
    */
    @SerializedName("CompanyName")
    @Expose
    private String CompanyName;

    /**
    * 统一社会信用代码
    */
    @SerializedName("BusinessId")
    @Expose
    private String BusinessId;

    /**
    * 营业执照扫描件(加盖公章)。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
    */
    @SerializedName("BusinessIdPicUrl")
    @Expose
    private String BusinessIdPicUrl;

    /**
    * 法定代表人名称
    */
    @SerializedName("CorporationName")
    @Expose
    private String CorporationName;

    /**
    * 法定代表人身份证号码
    */
    @SerializedName("CorporationId")
    @Expose
    private String CorporationId;

    /**
    * 法定代表人身份证正反面扫描件。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
    */
    @SerializedName("CorporationIdPicUrl")
    @Expose
    private String CorporationIdPicUrl;

    /**
    * 安全合规使用承诺书。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
    */
    @SerializedName("NetworkCommitmentPicUrl")
    @Expose
    private String NetworkCommitmentPicUrl;

    /**
    * 是否与腾讯云账号的资质一致,0-不一致,1-一致
    */
    @SerializedName("IsEqualTencentCloud")
    @Expose
    private Long IsEqualTencentCloud;

    /**
    * 法定代表人手机号
    */
    @SerializedName("CorporationMobile")
    @Expose
    private String CorporationMobile;

    /**
    * 法定代表人手机号码实名认证。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
    */
    @SerializedName("CorporationMobilePicUrl")
    @Expose
    private String CorporationMobilePicUrl;

    /**
    * 通话话术。(支持doc、docx格式的文档不超过50MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
    */
    @SerializedName("UseDescribeFileUrl")
    @Expose
    private String UseDescribeFileUrl;

    /**
    * 公司授权函。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
    */
    @SerializedName("CompanyAuthLetterPicUrl")
    @Expose
    private String CompanyAuthLetterPicUrl;

    /**
    * 电话受理单。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
    */
    @SerializedName("AcceptPicUrl")
    @Expose
    private String AcceptPicUrl;

    /**
    * 法定代表人手持身份证照，申请人类型为法定代表人时必填。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
    */
    @SerializedName("CorporationHoldingOnIdPicUrl")
    @Expose
    private String CorporationHoldingOnIdPicUrl;

    /**
    * 经办人名称，申请人类型为经办人时必填。
    */
    @SerializedName("OperatorName")
    @Expose
    private String OperatorName;

    /**
    * 经办人证件号码，申请人类型为经办人时必填。
    */
    @SerializedName("OperatorId")
    @Expose
    private String OperatorId;

    /**
    * 经办人身份证正反面扫描件，申请人类型为经办人时必填。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
    */
    @SerializedName("OperatorIdPicUrl")
    @Expose
    private String OperatorIdPicUrl;

    /**
    * 经办人手持身份证照，申请人类型为经办人时必填。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
    */
    @SerializedName("OperatorHoldingOnIdPicUrl")
    @Expose
    private String OperatorHoldingOnIdPicUrl;

    /**
    * 委托授权书，申请人类型为经办人时必填。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
    */
    @SerializedName("CommissionPicUrl")
    @Expose
    private String CommissionPicUrl;

    /**
    * 经办人手机号，申请人类型为经办人时必填。
    */
    @SerializedName("OperatorMobile")
    @Expose
    private String OperatorMobile;

    /**
    * 经办人邮箱，申请人类型为经办人时必填。
    */
    @SerializedName("OperatorEmail")
    @Expose
    private String OperatorEmail;

    /**
    * 经办人手机号码实名认证，申请人类型为经办人时必填。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
    */
    @SerializedName("OperatorMobilePicUrl")
    @Expose
    private String OperatorMobilePicUrl;

    /**
     * Get 申请人身份，0-公司法定代表人，1-经办人（受法定代表人委托） 
     * @return ApplicantType 申请人身份，0-公司法定代表人，1-经办人（受法定代表人委托）
     */
    public Long getApplicantType() {
        return this.ApplicantType;
    }

    /**
     * Set 申请人身份，0-公司法定代表人，1-经办人（受法定代表人委托）
     * @param ApplicantType 申请人身份，0-公司法定代表人，1-经办人（受法定代表人委托）
     */
    public void setApplicantType(Long ApplicantType) {
        this.ApplicantType = ApplicantType;
    }

    /**
     * Get 企业名称 
     * @return CompanyName 企业名称
     */
    public String getCompanyName() {
        return this.CompanyName;
    }

    /**
     * Set 企业名称
     * @param CompanyName 企业名称
     */
    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }

    /**
     * Get 统一社会信用代码 
     * @return BusinessId 统一社会信用代码
     */
    public String getBusinessId() {
        return this.BusinessId;
    }

    /**
     * Set 统一社会信用代码
     * @param BusinessId 统一社会信用代码
     */
    public void setBusinessId(String BusinessId) {
        this.BusinessId = BusinessId;
    }

    /**
     * Get 营业执照扫描件(加盖公章)。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update) 
     * @return BusinessIdPicUrl 营业执照扫描件(加盖公章)。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
     */
    public String getBusinessIdPicUrl() {
        return this.BusinessIdPicUrl;
    }

    /**
     * Set 营业执照扫描件(加盖公章)。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
     * @param BusinessIdPicUrl 营业执照扫描件(加盖公章)。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
     */
    public void setBusinessIdPicUrl(String BusinessIdPicUrl) {
        this.BusinessIdPicUrl = BusinessIdPicUrl;
    }

    /**
     * Get 法定代表人名称 
     * @return CorporationName 法定代表人名称
     */
    public String getCorporationName() {
        return this.CorporationName;
    }

    /**
     * Set 法定代表人名称
     * @param CorporationName 法定代表人名称
     */
    public void setCorporationName(String CorporationName) {
        this.CorporationName = CorporationName;
    }

    /**
     * Get 法定代表人身份证号码 
     * @return CorporationId 法定代表人身份证号码
     */
    public String getCorporationId() {
        return this.CorporationId;
    }

    /**
     * Set 法定代表人身份证号码
     * @param CorporationId 法定代表人身份证号码
     */
    public void setCorporationId(String CorporationId) {
        this.CorporationId = CorporationId;
    }

    /**
     * Get 法定代表人身份证正反面扫描件。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update) 
     * @return CorporationIdPicUrl 法定代表人身份证正反面扫描件。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
     */
    public String getCorporationIdPicUrl() {
        return this.CorporationIdPicUrl;
    }

    /**
     * Set 法定代表人身份证正反面扫描件。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
     * @param CorporationIdPicUrl 法定代表人身份证正反面扫描件。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
     */
    public void setCorporationIdPicUrl(String CorporationIdPicUrl) {
        this.CorporationIdPicUrl = CorporationIdPicUrl;
    }

    /**
     * Get 安全合规使用承诺书。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update) 
     * @return NetworkCommitmentPicUrl 安全合规使用承诺书。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
     */
    public String getNetworkCommitmentPicUrl() {
        return this.NetworkCommitmentPicUrl;
    }

    /**
     * Set 安全合规使用承诺书。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
     * @param NetworkCommitmentPicUrl 安全合规使用承诺书。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
     */
    public void setNetworkCommitmentPicUrl(String NetworkCommitmentPicUrl) {
        this.NetworkCommitmentPicUrl = NetworkCommitmentPicUrl;
    }

    /**
     * Get 是否与腾讯云账号的资质一致,0-不一致,1-一致 
     * @return IsEqualTencentCloud 是否与腾讯云账号的资质一致,0-不一致,1-一致
     */
    public Long getIsEqualTencentCloud() {
        return this.IsEqualTencentCloud;
    }

    /**
     * Set 是否与腾讯云账号的资质一致,0-不一致,1-一致
     * @param IsEqualTencentCloud 是否与腾讯云账号的资质一致,0-不一致,1-一致
     */
    public void setIsEqualTencentCloud(Long IsEqualTencentCloud) {
        this.IsEqualTencentCloud = IsEqualTencentCloud;
    }

    /**
     * Get 法定代表人手机号 
     * @return CorporationMobile 法定代表人手机号
     */
    public String getCorporationMobile() {
        return this.CorporationMobile;
    }

    /**
     * Set 法定代表人手机号
     * @param CorporationMobile 法定代表人手机号
     */
    public void setCorporationMobile(String CorporationMobile) {
        this.CorporationMobile = CorporationMobile;
    }

    /**
     * Get 法定代表人手机号码实名认证。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update) 
     * @return CorporationMobilePicUrl 法定代表人手机号码实名认证。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
     */
    public String getCorporationMobilePicUrl() {
        return this.CorporationMobilePicUrl;
    }

    /**
     * Set 法定代表人手机号码实名认证。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
     * @param CorporationMobilePicUrl 法定代表人手机号码实名认证。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
     */
    public void setCorporationMobilePicUrl(String CorporationMobilePicUrl) {
        this.CorporationMobilePicUrl = CorporationMobilePicUrl;
    }

    /**
     * Get 通话话术。(支持doc、docx格式的文档不超过50MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update) 
     * @return UseDescribeFileUrl 通话话术。(支持doc、docx格式的文档不超过50MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
     */
    public String getUseDescribeFileUrl() {
        return this.UseDescribeFileUrl;
    }

    /**
     * Set 通话话术。(支持doc、docx格式的文档不超过50MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
     * @param UseDescribeFileUrl 通话话术。(支持doc、docx格式的文档不超过50MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
     */
    public void setUseDescribeFileUrl(String UseDescribeFileUrl) {
        this.UseDescribeFileUrl = UseDescribeFileUrl;
    }

    /**
     * Get 公司授权函。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update) 
     * @return CompanyAuthLetterPicUrl 公司授权函。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
     */
    public String getCompanyAuthLetterPicUrl() {
        return this.CompanyAuthLetterPicUrl;
    }

    /**
     * Set 公司授权函。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
     * @param CompanyAuthLetterPicUrl 公司授权函。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
     */
    public void setCompanyAuthLetterPicUrl(String CompanyAuthLetterPicUrl) {
        this.CompanyAuthLetterPicUrl = CompanyAuthLetterPicUrl;
    }

    /**
     * Get 电话受理单。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update) 
     * @return AcceptPicUrl 电话受理单。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
     */
    public String getAcceptPicUrl() {
        return this.AcceptPicUrl;
    }

    /**
     * Set 电话受理单。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
     * @param AcceptPicUrl 电话受理单。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
     */
    public void setAcceptPicUrl(String AcceptPicUrl) {
        this.AcceptPicUrl = AcceptPicUrl;
    }

    /**
     * Get 法定代表人手持身份证照，申请人类型为法定代表人时必填。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update) 
     * @return CorporationHoldingOnIdPicUrl 法定代表人手持身份证照，申请人类型为法定代表人时必填。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
     */
    public String getCorporationHoldingOnIdPicUrl() {
        return this.CorporationHoldingOnIdPicUrl;
    }

    /**
     * Set 法定代表人手持身份证照，申请人类型为法定代表人时必填。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
     * @param CorporationHoldingOnIdPicUrl 法定代表人手持身份证照，申请人类型为法定代表人时必填。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
     */
    public void setCorporationHoldingOnIdPicUrl(String CorporationHoldingOnIdPicUrl) {
        this.CorporationHoldingOnIdPicUrl = CorporationHoldingOnIdPicUrl;
    }

    /**
     * Get 经办人名称，申请人类型为经办人时必填。 
     * @return OperatorName 经办人名称，申请人类型为经办人时必填。
     */
    public String getOperatorName() {
        return this.OperatorName;
    }

    /**
     * Set 经办人名称，申请人类型为经办人时必填。
     * @param OperatorName 经办人名称，申请人类型为经办人时必填。
     */
    public void setOperatorName(String OperatorName) {
        this.OperatorName = OperatorName;
    }

    /**
     * Get 经办人证件号码，申请人类型为经办人时必填。 
     * @return OperatorId 经办人证件号码，申请人类型为经办人时必填。
     */
    public String getOperatorId() {
        return this.OperatorId;
    }

    /**
     * Set 经办人证件号码，申请人类型为经办人时必填。
     * @param OperatorId 经办人证件号码，申请人类型为经办人时必填。
     */
    public void setOperatorId(String OperatorId) {
        this.OperatorId = OperatorId;
    }

    /**
     * Get 经办人身份证正反面扫描件，申请人类型为经办人时必填。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update) 
     * @return OperatorIdPicUrl 经办人身份证正反面扫描件，申请人类型为经办人时必填。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
     */
    public String getOperatorIdPicUrl() {
        return this.OperatorIdPicUrl;
    }

    /**
     * Set 经办人身份证正反面扫描件，申请人类型为经办人时必填。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
     * @param OperatorIdPicUrl 经办人身份证正反面扫描件，申请人类型为经办人时必填。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
     */
    public void setOperatorIdPicUrl(String OperatorIdPicUrl) {
        this.OperatorIdPicUrl = OperatorIdPicUrl;
    }

    /**
     * Get 经办人手持身份证照，申请人类型为经办人时必填。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update) 
     * @return OperatorHoldingOnIdPicUrl 经办人手持身份证照，申请人类型为经办人时必填。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
     */
    public String getOperatorHoldingOnIdPicUrl() {
        return this.OperatorHoldingOnIdPicUrl;
    }

    /**
     * Set 经办人手持身份证照，申请人类型为经办人时必填。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
     * @param OperatorHoldingOnIdPicUrl 经办人手持身份证照，申请人类型为经办人时必填。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
     */
    public void setOperatorHoldingOnIdPicUrl(String OperatorHoldingOnIdPicUrl) {
        this.OperatorHoldingOnIdPicUrl = OperatorHoldingOnIdPicUrl;
    }

    /**
     * Get 委托授权书，申请人类型为经办人时必填。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update) 
     * @return CommissionPicUrl 委托授权书，申请人类型为经办人时必填。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
     */
    public String getCommissionPicUrl() {
        return this.CommissionPicUrl;
    }

    /**
     * Set 委托授权书，申请人类型为经办人时必填。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
     * @param CommissionPicUrl 委托授权书，申请人类型为经办人时必填。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
     */
    public void setCommissionPicUrl(String CommissionPicUrl) {
        this.CommissionPicUrl = CommissionPicUrl;
    }

    /**
     * Get 经办人手机号，申请人类型为经办人时必填。 
     * @return OperatorMobile 经办人手机号，申请人类型为经办人时必填。
     */
    public String getOperatorMobile() {
        return this.OperatorMobile;
    }

    /**
     * Set 经办人手机号，申请人类型为经办人时必填。
     * @param OperatorMobile 经办人手机号，申请人类型为经办人时必填。
     */
    public void setOperatorMobile(String OperatorMobile) {
        this.OperatorMobile = OperatorMobile;
    }

    /**
     * Get 经办人邮箱，申请人类型为经办人时必填。 
     * @return OperatorEmail 经办人邮箱，申请人类型为经办人时必填。
     */
    public String getOperatorEmail() {
        return this.OperatorEmail;
    }

    /**
     * Set 经办人邮箱，申请人类型为经办人时必填。
     * @param OperatorEmail 经办人邮箱，申请人类型为经办人时必填。
     */
    public void setOperatorEmail(String OperatorEmail) {
        this.OperatorEmail = OperatorEmail;
    }

    /**
     * Get 经办人手机号码实名认证，申请人类型为经办人时必填。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update) 
     * @return OperatorMobilePicUrl 经办人手机号码实名认证，申请人类型为经办人时必填。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
     */
    public String getOperatorMobilePicUrl() {
        return this.OperatorMobilePicUrl;
    }

    /**
     * Set 经办人手机号码实名认证，申请人类型为经办人时必填。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
     * @param OperatorMobilePicUrl 经办人手机号码实名认证，申请人类型为经办人时必填。(支持jpg、png、gif、jpeg格式的图片，每张图片应大于50K，不超过5MB，模板参见控制台:https://console.cloud.tencent.com/ccc/enterprise/update)
     */
    public void setOperatorMobilePicUrl(String OperatorMobilePicUrl) {
        this.OperatorMobilePicUrl = OperatorMobilePicUrl;
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
        if (source.NetworkCommitmentPicUrl != null) {
            this.NetworkCommitmentPicUrl = new String(source.NetworkCommitmentPicUrl);
        }
        if (source.IsEqualTencentCloud != null) {
            this.IsEqualTencentCloud = new Long(source.IsEqualTencentCloud);
        }
        if (source.CorporationMobile != null) {
            this.CorporationMobile = new String(source.CorporationMobile);
        }
        if (source.CorporationMobilePicUrl != null) {
            this.CorporationMobilePicUrl = new String(source.CorporationMobilePicUrl);
        }
        if (source.UseDescribeFileUrl != null) {
            this.UseDescribeFileUrl = new String(source.UseDescribeFileUrl);
        }
        if (source.CompanyAuthLetterPicUrl != null) {
            this.CompanyAuthLetterPicUrl = new String(source.CompanyAuthLetterPicUrl);
        }
        if (source.AcceptPicUrl != null) {
            this.AcceptPicUrl = new String(source.AcceptPicUrl);
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
        if (source.OperatorMobile != null) {
            this.OperatorMobile = new String(source.OperatorMobile);
        }
        if (source.OperatorEmail != null) {
            this.OperatorEmail = new String(source.OperatorEmail);
        }
        if (source.OperatorMobilePicUrl != null) {
            this.OperatorMobilePicUrl = new String(source.OperatorMobilePicUrl);
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
        this.setParamSimple(map, prefix + "NetworkCommitmentPicUrl", this.NetworkCommitmentPicUrl);
        this.setParamSimple(map, prefix + "IsEqualTencentCloud", this.IsEqualTencentCloud);
        this.setParamSimple(map, prefix + "CorporationMobile", this.CorporationMobile);
        this.setParamSimple(map, prefix + "CorporationMobilePicUrl", this.CorporationMobilePicUrl);
        this.setParamSimple(map, prefix + "UseDescribeFileUrl", this.UseDescribeFileUrl);
        this.setParamSimple(map, prefix + "CompanyAuthLetterPicUrl", this.CompanyAuthLetterPicUrl);
        this.setParamSimple(map, prefix + "AcceptPicUrl", this.AcceptPicUrl);
        this.setParamSimple(map, prefix + "CorporationHoldingOnIdPicUrl", this.CorporationHoldingOnIdPicUrl);
        this.setParamSimple(map, prefix + "OperatorName", this.OperatorName);
        this.setParamSimple(map, prefix + "OperatorId", this.OperatorId);
        this.setParamSimple(map, prefix + "OperatorIdPicUrl", this.OperatorIdPicUrl);
        this.setParamSimple(map, prefix + "OperatorHoldingOnIdPicUrl", this.OperatorHoldingOnIdPicUrl);
        this.setParamSimple(map, prefix + "CommissionPicUrl", this.CommissionPicUrl);
        this.setParamSimple(map, prefix + "OperatorMobile", this.OperatorMobile);
        this.setParamSimple(map, prefix + "OperatorEmail", this.OperatorEmail);
        this.setParamSimple(map, prefix + "OperatorMobilePicUrl", this.OperatorMobilePicUrl);

    }
}

