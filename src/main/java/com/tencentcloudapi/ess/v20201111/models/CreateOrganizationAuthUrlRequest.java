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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateOrganizationAuthUrlRequest extends AbstractModel {

    /**
    * <p>操作人信息</p>
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * <p>指定授权方式 支持多选:</p><ul><li><strong>2</strong>: 法人授权方式</li><li><strong>5</strong>: 授权书+对公打款方式</li></ul>
    */
    @SerializedName("AuthorizationTypes")
    @Expose
    private Long [] AuthorizationTypes;

    /**
    * <p>认证企业名称，请确认该名称与企业营业执照中注册的名称一致。</p><p>注：</p><ol><li><p><code>如果名称中包含英文括号()，请使用中文括号（）代替。</code></p></li><li><p><code>EndPointType=“H5”或者&quot;SHORT_H5&quot;时，该参数必填</code></p></li></ol>
    */
    @SerializedName("OrganizationName")
    @Expose
    private String OrganizationName;

    /**
    * <p>企业统一社会信用代码</p>
    */
    @SerializedName("UniformSocialCreditCode")
    @Expose
    private String UniformSocialCreditCode;

    /**
    * <p>企业法人的姓名</p>
    */
    @SerializedName("LegalName")
    @Expose
    private String LegalName;

    /**
    * <p><font color="red">即将废弃</font>，入参请使用JumpEvents。<br>认证完成跳回的链接，最长500个字符。</p>
    */
    @SerializedName("AutoJumpUrl")
    @Expose
    private String AutoJumpUrl;

    /**
    * <p>营业执照企业地址</p>
    */
    @SerializedName("OrganizationAddress")
    @Expose
    private String OrganizationAddress;

    /**
    * <p>认证人姓名</p>
    */
    @SerializedName("AdminName")
    @Expose
    private String AdminName;

    /**
    * <p>认证人手机号</p>
    */
    @SerializedName("AdminMobile")
    @Expose
    private String AdminMobile;

    /**
    * <p>认证人身份证号</p>
    */
    @SerializedName("AdminIdCardNumber")
    @Expose
    private String AdminIdCardNumber;

    /**
    * <p>认证人证件类型， 支持以下类型</p><ul><li><b>ID_CARD</b> : 中国大陆居民身份证  (默认值)</li><li><b>HONGKONG_AND_MACAO</b>  : 中国港澳居民来往内地通行证</li><li><b>HONGKONG_MACAO_AND_TAIWAN</b>  : 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul>
    */
    @SerializedName("AdminIdCardType")
    @Expose
    private String AdminIdCardType;

    /**
    * <p>对方打开链接认证时，对方填写的营业执照的社会信用代码是否与接口上传上来的要保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul></p>
    */
    @SerializedName("UniformSocialCreditCodeSame")
    @Expose
    private Boolean UniformSocialCreditCodeSame;

    /**
    * <p>对方打开链接认证时，法人姓名是否要与接口传递上来的保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul></p><p>p.s. 仅在法人姓名不为空时有效</p>
    */
    @SerializedName("LegalNameSame")
    @Expose
    private Boolean LegalNameSame;

    /**
    * <p>对方打开链接认证时，认证人姓名是否要与接口传递上来的保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul></p><p>p.s. 仅在认证人姓名不为空时有效</p>
    */
    @SerializedName("AdminNameSame")
    @Expose
    private Boolean AdminNameSame;

    /**
    * <p>对方打开链接认证时，认证人居民身份证件号是否要与接口传递上来的保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul></p><p>p.s. 仅在认证人身份证号不为空时有效</p>
    */
    @SerializedName("AdminIdCardNumberSame")
    @Expose
    private Boolean AdminIdCardNumberSame;

    /**
    * <p>对方打开链接认证时，认证人手机号是否要与接口传递上来的保持一致。<ul></p><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul><p>p.s. 仅在认证人手机号不为空时有效</p>
    */
    @SerializedName("AdminMobileSame")
    @Expose
    private Boolean AdminMobileSame;

    /**
    * <p>对方打开链接认证时，企业名称是否要与接口传递上来的保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul></p><p>p.s. 仅在企业名称不为空时有效</p>
    */
    @SerializedName("OrganizationNameSame")
    @Expose
    private Boolean OrganizationNameSame;

    /**
    * <p>营业执照正面照（支持PNG或JPG格式）需以base64格式提供，且文件大小不得超过5MB。</p>
    */
    @SerializedName("BusinessLicense")
    @Expose
    private String BusinessLicense;

    /**
    * <p>跳转链接类型：</p><ul><li><b>PC</b>：适用于PC端的认证链接</li><li><b>APP</b>：用于全屏或半屏跳转的小程序链接</li><li><b>SHORT_URL</b>：跳转小程序的链接的短链形式</li><li><b>H5</b>：适用于H5页面的认证链接</li><li><b>SHORT_H5</b>：H5认证链接的短链形式</li></ul>
    */
    @SerializedName("Endpoint")
    @Expose
    private String Endpoint;

    /**
    * <p>指定企业初始化引导，现在可以配置如下的选项：</p><p><b>1</b>: 启用此选项后，在企业认证的最终步骤将添加创建印章的引导。如下图的位置<br><img src="https://qcloudimg.tencent-cloud.cn/raw/88e0b45095a5c589de8995462ad755dc.jpg" alt="image"><br><b>2</b>:开通企业授权API签署协议，目前仅支持PC网页端，即Endpoint=PC（该功能需联系电子签客服开通）<br><img src="https://qcloudimg.tencent-cloud.cn/raw/4d40b098acf7c04afd1c451a4f98fc90.png" alt="image"></p><p>枚举值：</p><ul><li>1： 创建印章</li><li>2： 开通企业授权API签署协议</li></ul>
    */
    @SerializedName("Initialization")
    @Expose
    private Long [] Initialization;

    /**
    * <p>授权书(PNG或JPG或PDF) base64格式, 大小不超过8M 。<br>授权书可以通过接口<a href="https://qian.tencent.com/developers/companyApis/organizations/CreateOrganizationAuthFile">生成企业授权书</a> 来获得。<br>p.s. 如果上传授权书 ，需遵循以下条件 </p><ol><li>超管的信息（超管姓名，超管手机号）必须为必填参数。</li><li>认证方式AuthorizationTypes必须只能是上传授权书方式</li></ol>
    */
    @SerializedName("PowerOfAttorneys")
    @Expose
    private String [] PowerOfAttorneys;

    /**
    * <p>调用方自定义的个性化字段(可自定义此名称)，并以base64方式编码，支持的最大数据大小为 4096长度。</p><p>在. 企业引导企业实名认证后回调中，该字段的信息将原封不动地透传给贵方。回调的相关说明可参考开发者中心的<a href="https://qian.tencent.com/developers/company/callback_types_staffs" target="_blank">回调通知</a>模块。</p>
    */
    @SerializedName("UserData")
    @Expose
    private String UserData;

    /**
    * <p>组织机构对公打款账号，账户名跟企业名称一致。</p><p>p.s.<br>只有认证方式是授权书+对公打款时才生效。</p>
    */
    @SerializedName("BankAccountNumber")
    @Expose
    private String BankAccountNumber;

    /**
    * <p>对方打开链接认证时，对公打款账号是否要与接口传递上来的保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul></p><p>p.s. 仅在对公打款不为空时有效</p>
    */
    @SerializedName("BankAccountNumberSame")
    @Expose
    private Boolean BankAccountNumberSame;

    /**
    * <p>跳转事件，其中包括认证期间收录，授权书审核，企业认证的回跳事件。<br>p.s.<br>Endpoint如果是APP 类型，请传递JumpUrl为<font color="red">&quot;true&quot; </font><br>如果 Endpoint 是 H5 类型，请参考文档跳转电子签H5 </p><p>p.s. 如果Endpoint是 APP，传递的跳转地址无效，不会进行跳转，仅会进行回跳。</p>
    */
    @SerializedName("JumpEvents")
    @Expose
    private JumpEvent [] JumpEvents;

    /**
    * <p>企业证照类型：<ul><li> <strong>USCC</strong> :(默认)工商组织营业执照</li><li> <strong>PRACTICELICENSEOFMEDICALINSTITUTION</strong> :医疗机构执业许可证</li><li> <strong>CLINICFILLINGCERTIFICATE</strong> :诊所备案证</li></ul></p><p>注意 ：<br>如果企业证照类型是医疗机构执业许可证或者诊所备案证，则参数设置企业授权方式(AuthorizationTypes)和企业认证方式(AuthorizationMethods)都无效.<br>医疗机构执业许可证和诊所备案证的企业授权方式  仅有授权书的方式。企业认证仅有上传营业执照的方式。</p>
    */
    @SerializedName("OrganizationIdCardType")
    @Expose
    private String OrganizationIdCardType;

    /**
    * <p>是否允许编辑企业注册时的证照类型</p><p>true:不允许编辑。</p><p>false:允许编辑（默认值）。</p><p>注意：<br>入参中的OrganizationIdCardType值不为空的时候，才可设置为不可编辑。</p>
    */
    @SerializedName("OrganizationIdCardTypeSame")
    @Expose
    private Boolean OrganizationIdCardTypeSame;

    /**
    * <p>指定企业认证的授权方式 支持多选:</p><ul><li><strong>1</strong>: 上传营业执照</li><li><strong>2</strong>: 腾讯云快速认证</li><li><strong>3</strong>: 腾讯商户号授权<font color="red">（仅支持小程序端）</font></li></ul><p>注意：<br>1.如果没有指定，则默认是1,仅有上传营业执照。<br>2.H5 仅支持上传营业执照。</p>
    */
    @SerializedName("AuthorizationMethod")
    @Expose
    private Long [] AuthorizationMethod;

    /**
     * Get <p>操作人信息</p> 
     * @return Operator <p>操作人信息</p>
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>操作人信息</p>
     * @param Operator <p>操作人信息</p>
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get <p>指定授权方式 支持多选:</p><ul><li><strong>2</strong>: 法人授权方式</li><li><strong>5</strong>: 授权书+对公打款方式</li></ul> 
     * @return AuthorizationTypes <p>指定授权方式 支持多选:</p><ul><li><strong>2</strong>: 法人授权方式</li><li><strong>5</strong>: 授权书+对公打款方式</li></ul>
     */
    public Long [] getAuthorizationTypes() {
        return this.AuthorizationTypes;
    }

    /**
     * Set <p>指定授权方式 支持多选:</p><ul><li><strong>2</strong>: 法人授权方式</li><li><strong>5</strong>: 授权书+对公打款方式</li></ul>
     * @param AuthorizationTypes <p>指定授权方式 支持多选:</p><ul><li><strong>2</strong>: 法人授权方式</li><li><strong>5</strong>: 授权书+对公打款方式</li></ul>
     */
    public void setAuthorizationTypes(Long [] AuthorizationTypes) {
        this.AuthorizationTypes = AuthorizationTypes;
    }

    /**
     * Get <p>认证企业名称，请确认该名称与企业营业执照中注册的名称一致。</p><p>注：</p><ol><li><p><code>如果名称中包含英文括号()，请使用中文括号（）代替。</code></p></li><li><p><code>EndPointType=“H5”或者&quot;SHORT_H5&quot;时，该参数必填</code></p></li></ol> 
     * @return OrganizationName <p>认证企业名称，请确认该名称与企业营业执照中注册的名称一致。</p><p>注：</p><ol><li><p><code>如果名称中包含英文括号()，请使用中文括号（）代替。</code></p></li><li><p><code>EndPointType=“H5”或者&quot;SHORT_H5&quot;时，该参数必填</code></p></li></ol>
     */
    public String getOrganizationName() {
        return this.OrganizationName;
    }

    /**
     * Set <p>认证企业名称，请确认该名称与企业营业执照中注册的名称一致。</p><p>注：</p><ol><li><p><code>如果名称中包含英文括号()，请使用中文括号（）代替。</code></p></li><li><p><code>EndPointType=“H5”或者&quot;SHORT_H5&quot;时，该参数必填</code></p></li></ol>
     * @param OrganizationName <p>认证企业名称，请确认该名称与企业营业执照中注册的名称一致。</p><p>注：</p><ol><li><p><code>如果名称中包含英文括号()，请使用中文括号（）代替。</code></p></li><li><p><code>EndPointType=“H5”或者&quot;SHORT_H5&quot;时，该参数必填</code></p></li></ol>
     */
    public void setOrganizationName(String OrganizationName) {
        this.OrganizationName = OrganizationName;
    }

    /**
     * Get <p>企业统一社会信用代码</p> 
     * @return UniformSocialCreditCode <p>企业统一社会信用代码</p>
     */
    public String getUniformSocialCreditCode() {
        return this.UniformSocialCreditCode;
    }

    /**
     * Set <p>企业统一社会信用代码</p>
     * @param UniformSocialCreditCode <p>企业统一社会信用代码</p>
     */
    public void setUniformSocialCreditCode(String UniformSocialCreditCode) {
        this.UniformSocialCreditCode = UniformSocialCreditCode;
    }

    /**
     * Get <p>企业法人的姓名</p> 
     * @return LegalName <p>企业法人的姓名</p>
     */
    public String getLegalName() {
        return this.LegalName;
    }

    /**
     * Set <p>企业法人的姓名</p>
     * @param LegalName <p>企业法人的姓名</p>
     */
    public void setLegalName(String LegalName) {
        this.LegalName = LegalName;
    }

    /**
     * Get <p><font color="red">即将废弃</font>，入参请使用JumpEvents。<br>认证完成跳回的链接，最长500个字符。</p> 
     * @return AutoJumpUrl <p><font color="red">即将废弃</font>，入参请使用JumpEvents。<br>认证完成跳回的链接，最长500个字符。</p>
     */
    public String getAutoJumpUrl() {
        return this.AutoJumpUrl;
    }

    /**
     * Set <p><font color="red">即将废弃</font>，入参请使用JumpEvents。<br>认证完成跳回的链接，最长500个字符。</p>
     * @param AutoJumpUrl <p><font color="red">即将废弃</font>，入参请使用JumpEvents。<br>认证完成跳回的链接，最长500个字符。</p>
     */
    public void setAutoJumpUrl(String AutoJumpUrl) {
        this.AutoJumpUrl = AutoJumpUrl;
    }

    /**
     * Get <p>营业执照企业地址</p> 
     * @return OrganizationAddress <p>营业执照企业地址</p>
     */
    public String getOrganizationAddress() {
        return this.OrganizationAddress;
    }

    /**
     * Set <p>营业执照企业地址</p>
     * @param OrganizationAddress <p>营业执照企业地址</p>
     */
    public void setOrganizationAddress(String OrganizationAddress) {
        this.OrganizationAddress = OrganizationAddress;
    }

    /**
     * Get <p>认证人姓名</p> 
     * @return AdminName <p>认证人姓名</p>
     */
    public String getAdminName() {
        return this.AdminName;
    }

    /**
     * Set <p>认证人姓名</p>
     * @param AdminName <p>认证人姓名</p>
     */
    public void setAdminName(String AdminName) {
        this.AdminName = AdminName;
    }

    /**
     * Get <p>认证人手机号</p> 
     * @return AdminMobile <p>认证人手机号</p>
     */
    public String getAdminMobile() {
        return this.AdminMobile;
    }

    /**
     * Set <p>认证人手机号</p>
     * @param AdminMobile <p>认证人手机号</p>
     */
    public void setAdminMobile(String AdminMobile) {
        this.AdminMobile = AdminMobile;
    }

    /**
     * Get <p>认证人身份证号</p> 
     * @return AdminIdCardNumber <p>认证人身份证号</p>
     */
    public String getAdminIdCardNumber() {
        return this.AdminIdCardNumber;
    }

    /**
     * Set <p>认证人身份证号</p>
     * @param AdminIdCardNumber <p>认证人身份证号</p>
     */
    public void setAdminIdCardNumber(String AdminIdCardNumber) {
        this.AdminIdCardNumber = AdminIdCardNumber;
    }

    /**
     * Get <p>认证人证件类型， 支持以下类型</p><ul><li><b>ID_CARD</b> : 中国大陆居民身份证  (默认值)</li><li><b>HONGKONG_AND_MACAO</b>  : 中国港澳居民来往内地通行证</li><li><b>HONGKONG_MACAO_AND_TAIWAN</b>  : 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul> 
     * @return AdminIdCardType <p>认证人证件类型， 支持以下类型</p><ul><li><b>ID_CARD</b> : 中国大陆居民身份证  (默认值)</li><li><b>HONGKONG_AND_MACAO</b>  : 中国港澳居民来往内地通行证</li><li><b>HONGKONG_MACAO_AND_TAIWAN</b>  : 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul>
     */
    public String getAdminIdCardType() {
        return this.AdminIdCardType;
    }

    /**
     * Set <p>认证人证件类型， 支持以下类型</p><ul><li><b>ID_CARD</b> : 中国大陆居民身份证  (默认值)</li><li><b>HONGKONG_AND_MACAO</b>  : 中国港澳居民来往内地通行证</li><li><b>HONGKONG_MACAO_AND_TAIWAN</b>  : 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul>
     * @param AdminIdCardType <p>认证人证件类型， 支持以下类型</p><ul><li><b>ID_CARD</b> : 中国大陆居民身份证  (默认值)</li><li><b>HONGKONG_AND_MACAO</b>  : 中国港澳居民来往内地通行证</li><li><b>HONGKONG_MACAO_AND_TAIWAN</b>  : 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul>
     */
    public void setAdminIdCardType(String AdminIdCardType) {
        this.AdminIdCardType = AdminIdCardType;
    }

    /**
     * Get <p>对方打开链接认证时，对方填写的营业执照的社会信用代码是否与接口上传上来的要保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul></p> 
     * @return UniformSocialCreditCodeSame <p>对方打开链接认证时，对方填写的营业执照的社会信用代码是否与接口上传上来的要保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul></p>
     */
    public Boolean getUniformSocialCreditCodeSame() {
        return this.UniformSocialCreditCodeSame;
    }

    /**
     * Set <p>对方打开链接认证时，对方填写的营业执照的社会信用代码是否与接口上传上来的要保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul></p>
     * @param UniformSocialCreditCodeSame <p>对方打开链接认证时，对方填写的营业执照的社会信用代码是否与接口上传上来的要保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul></p>
     */
    public void setUniformSocialCreditCodeSame(Boolean UniformSocialCreditCodeSame) {
        this.UniformSocialCreditCodeSame = UniformSocialCreditCodeSame;
    }

    /**
     * Get <p>对方打开链接认证时，法人姓名是否要与接口传递上来的保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul></p><p>p.s. 仅在法人姓名不为空时有效</p> 
     * @return LegalNameSame <p>对方打开链接认证时，法人姓名是否要与接口传递上来的保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul></p><p>p.s. 仅在法人姓名不为空时有效</p>
     */
    public Boolean getLegalNameSame() {
        return this.LegalNameSame;
    }

    /**
     * Set <p>对方打开链接认证时，法人姓名是否要与接口传递上来的保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul></p><p>p.s. 仅在法人姓名不为空时有效</p>
     * @param LegalNameSame <p>对方打开链接认证时，法人姓名是否要与接口传递上来的保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul></p><p>p.s. 仅在法人姓名不为空时有效</p>
     */
    public void setLegalNameSame(Boolean LegalNameSame) {
        this.LegalNameSame = LegalNameSame;
    }

    /**
     * Get <p>对方打开链接认证时，认证人姓名是否要与接口传递上来的保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul></p><p>p.s. 仅在认证人姓名不为空时有效</p> 
     * @return AdminNameSame <p>对方打开链接认证时，认证人姓名是否要与接口传递上来的保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul></p><p>p.s. 仅在认证人姓名不为空时有效</p>
     */
    public Boolean getAdminNameSame() {
        return this.AdminNameSame;
    }

    /**
     * Set <p>对方打开链接认证时，认证人姓名是否要与接口传递上来的保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul></p><p>p.s. 仅在认证人姓名不为空时有效</p>
     * @param AdminNameSame <p>对方打开链接认证时，认证人姓名是否要与接口传递上来的保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul></p><p>p.s. 仅在认证人姓名不为空时有效</p>
     */
    public void setAdminNameSame(Boolean AdminNameSame) {
        this.AdminNameSame = AdminNameSame;
    }

    /**
     * Get <p>对方打开链接认证时，认证人居民身份证件号是否要与接口传递上来的保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul></p><p>p.s. 仅在认证人身份证号不为空时有效</p> 
     * @return AdminIdCardNumberSame <p>对方打开链接认证时，认证人居民身份证件号是否要与接口传递上来的保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul></p><p>p.s. 仅在认证人身份证号不为空时有效</p>
     */
    public Boolean getAdminIdCardNumberSame() {
        return this.AdminIdCardNumberSame;
    }

    /**
     * Set <p>对方打开链接认证时，认证人居民身份证件号是否要与接口传递上来的保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul></p><p>p.s. 仅在认证人身份证号不为空时有效</p>
     * @param AdminIdCardNumberSame <p>对方打开链接认证时，认证人居民身份证件号是否要与接口传递上来的保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul></p><p>p.s. 仅在认证人身份证号不为空时有效</p>
     */
    public void setAdminIdCardNumberSame(Boolean AdminIdCardNumberSame) {
        this.AdminIdCardNumberSame = AdminIdCardNumberSame;
    }

    /**
     * Get <p>对方打开链接认证时，认证人手机号是否要与接口传递上来的保持一致。<ul></p><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul><p>p.s. 仅在认证人手机号不为空时有效</p> 
     * @return AdminMobileSame <p>对方打开链接认证时，认证人手机号是否要与接口传递上来的保持一致。<ul></p><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul><p>p.s. 仅在认证人手机号不为空时有效</p>
     */
    public Boolean getAdminMobileSame() {
        return this.AdminMobileSame;
    }

    /**
     * Set <p>对方打开链接认证时，认证人手机号是否要与接口传递上来的保持一致。<ul></p><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul><p>p.s. 仅在认证人手机号不为空时有效</p>
     * @param AdminMobileSame <p>对方打开链接认证时，认证人手机号是否要与接口传递上来的保持一致。<ul></p><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul><p>p.s. 仅在认证人手机号不为空时有效</p>
     */
    public void setAdminMobileSame(Boolean AdminMobileSame) {
        this.AdminMobileSame = AdminMobileSame;
    }

    /**
     * Get <p>对方打开链接认证时，企业名称是否要与接口传递上来的保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul></p><p>p.s. 仅在企业名称不为空时有效</p> 
     * @return OrganizationNameSame <p>对方打开链接认证时，企业名称是否要与接口传递上来的保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul></p><p>p.s. 仅在企业名称不为空时有效</p>
     */
    public Boolean getOrganizationNameSame() {
        return this.OrganizationNameSame;
    }

    /**
     * Set <p>对方打开链接认证时，企业名称是否要与接口传递上来的保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul></p><p>p.s. 仅在企业名称不为空时有效</p>
     * @param OrganizationNameSame <p>对方打开链接认证时，企业名称是否要与接口传递上来的保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul></p><p>p.s. 仅在企业名称不为空时有效</p>
     */
    public void setOrganizationNameSame(Boolean OrganizationNameSame) {
        this.OrganizationNameSame = OrganizationNameSame;
    }

    /**
     * Get <p>营业执照正面照（支持PNG或JPG格式）需以base64格式提供，且文件大小不得超过5MB。</p> 
     * @return BusinessLicense <p>营业执照正面照（支持PNG或JPG格式）需以base64格式提供，且文件大小不得超过5MB。</p>
     */
    public String getBusinessLicense() {
        return this.BusinessLicense;
    }

    /**
     * Set <p>营业执照正面照（支持PNG或JPG格式）需以base64格式提供，且文件大小不得超过5MB。</p>
     * @param BusinessLicense <p>营业执照正面照（支持PNG或JPG格式）需以base64格式提供，且文件大小不得超过5MB。</p>
     */
    public void setBusinessLicense(String BusinessLicense) {
        this.BusinessLicense = BusinessLicense;
    }

    /**
     * Get <p>跳转链接类型：</p><ul><li><b>PC</b>：适用于PC端的认证链接</li><li><b>APP</b>：用于全屏或半屏跳转的小程序链接</li><li><b>SHORT_URL</b>：跳转小程序的链接的短链形式</li><li><b>H5</b>：适用于H5页面的认证链接</li><li><b>SHORT_H5</b>：H5认证链接的短链形式</li></ul> 
     * @return Endpoint <p>跳转链接类型：</p><ul><li><b>PC</b>：适用于PC端的认证链接</li><li><b>APP</b>：用于全屏或半屏跳转的小程序链接</li><li><b>SHORT_URL</b>：跳转小程序的链接的短链形式</li><li><b>H5</b>：适用于H5页面的认证链接</li><li><b>SHORT_H5</b>：H5认证链接的短链形式</li></ul>
     */
    public String getEndpoint() {
        return this.Endpoint;
    }

    /**
     * Set <p>跳转链接类型：</p><ul><li><b>PC</b>：适用于PC端的认证链接</li><li><b>APP</b>：用于全屏或半屏跳转的小程序链接</li><li><b>SHORT_URL</b>：跳转小程序的链接的短链形式</li><li><b>H5</b>：适用于H5页面的认证链接</li><li><b>SHORT_H5</b>：H5认证链接的短链形式</li></ul>
     * @param Endpoint <p>跳转链接类型：</p><ul><li><b>PC</b>：适用于PC端的认证链接</li><li><b>APP</b>：用于全屏或半屏跳转的小程序链接</li><li><b>SHORT_URL</b>：跳转小程序的链接的短链形式</li><li><b>H5</b>：适用于H5页面的认证链接</li><li><b>SHORT_H5</b>：H5认证链接的短链形式</li></ul>
     */
    public void setEndpoint(String Endpoint) {
        this.Endpoint = Endpoint;
    }

    /**
     * Get <p>指定企业初始化引导，现在可以配置如下的选项：</p><p><b>1</b>: 启用此选项后，在企业认证的最终步骤将添加创建印章的引导。如下图的位置<br><img src="https://qcloudimg.tencent-cloud.cn/raw/88e0b45095a5c589de8995462ad755dc.jpg" alt="image"><br><b>2</b>:开通企业授权API签署协议，目前仅支持PC网页端，即Endpoint=PC（该功能需联系电子签客服开通）<br><img src="https://qcloudimg.tencent-cloud.cn/raw/4d40b098acf7c04afd1c451a4f98fc90.png" alt="image"></p><p>枚举值：</p><ul><li>1： 创建印章</li><li>2： 开通企业授权API签署协议</li></ul> 
     * @return Initialization <p>指定企业初始化引导，现在可以配置如下的选项：</p><p><b>1</b>: 启用此选项后，在企业认证的最终步骤将添加创建印章的引导。如下图的位置<br><img src="https://qcloudimg.tencent-cloud.cn/raw/88e0b45095a5c589de8995462ad755dc.jpg" alt="image"><br><b>2</b>:开通企业授权API签署协议，目前仅支持PC网页端，即Endpoint=PC（该功能需联系电子签客服开通）<br><img src="https://qcloudimg.tencent-cloud.cn/raw/4d40b098acf7c04afd1c451a4f98fc90.png" alt="image"></p><p>枚举值：</p><ul><li>1： 创建印章</li><li>2： 开通企业授权API签署协议</li></ul>
     */
    public Long [] getInitialization() {
        return this.Initialization;
    }

    /**
     * Set <p>指定企业初始化引导，现在可以配置如下的选项：</p><p><b>1</b>: 启用此选项后，在企业认证的最终步骤将添加创建印章的引导。如下图的位置<br><img src="https://qcloudimg.tencent-cloud.cn/raw/88e0b45095a5c589de8995462ad755dc.jpg" alt="image"><br><b>2</b>:开通企业授权API签署协议，目前仅支持PC网页端，即Endpoint=PC（该功能需联系电子签客服开通）<br><img src="https://qcloudimg.tencent-cloud.cn/raw/4d40b098acf7c04afd1c451a4f98fc90.png" alt="image"></p><p>枚举值：</p><ul><li>1： 创建印章</li><li>2： 开通企业授权API签署协议</li></ul>
     * @param Initialization <p>指定企业初始化引导，现在可以配置如下的选项：</p><p><b>1</b>: 启用此选项后，在企业认证的最终步骤将添加创建印章的引导。如下图的位置<br><img src="https://qcloudimg.tencent-cloud.cn/raw/88e0b45095a5c589de8995462ad755dc.jpg" alt="image"><br><b>2</b>:开通企业授权API签署协议，目前仅支持PC网页端，即Endpoint=PC（该功能需联系电子签客服开通）<br><img src="https://qcloudimg.tencent-cloud.cn/raw/4d40b098acf7c04afd1c451a4f98fc90.png" alt="image"></p><p>枚举值：</p><ul><li>1： 创建印章</li><li>2： 开通企业授权API签署协议</li></ul>
     */
    public void setInitialization(Long [] Initialization) {
        this.Initialization = Initialization;
    }

    /**
     * Get <p>授权书(PNG或JPG或PDF) base64格式, 大小不超过8M 。<br>授权书可以通过接口<a href="https://qian.tencent.com/developers/companyApis/organizations/CreateOrganizationAuthFile">生成企业授权书</a> 来获得。<br>p.s. 如果上传授权书 ，需遵循以下条件 </p><ol><li>超管的信息（超管姓名，超管手机号）必须为必填参数。</li><li>认证方式AuthorizationTypes必须只能是上传授权书方式</li></ol> 
     * @return PowerOfAttorneys <p>授权书(PNG或JPG或PDF) base64格式, 大小不超过8M 。<br>授权书可以通过接口<a href="https://qian.tencent.com/developers/companyApis/organizations/CreateOrganizationAuthFile">生成企业授权书</a> 来获得。<br>p.s. 如果上传授权书 ，需遵循以下条件 </p><ol><li>超管的信息（超管姓名，超管手机号）必须为必填参数。</li><li>认证方式AuthorizationTypes必须只能是上传授权书方式</li></ol>
     */
    public String [] getPowerOfAttorneys() {
        return this.PowerOfAttorneys;
    }

    /**
     * Set <p>授权书(PNG或JPG或PDF) base64格式, 大小不超过8M 。<br>授权书可以通过接口<a href="https://qian.tencent.com/developers/companyApis/organizations/CreateOrganizationAuthFile">生成企业授权书</a> 来获得。<br>p.s. 如果上传授权书 ，需遵循以下条件 </p><ol><li>超管的信息（超管姓名，超管手机号）必须为必填参数。</li><li>认证方式AuthorizationTypes必须只能是上传授权书方式</li></ol>
     * @param PowerOfAttorneys <p>授权书(PNG或JPG或PDF) base64格式, 大小不超过8M 。<br>授权书可以通过接口<a href="https://qian.tencent.com/developers/companyApis/organizations/CreateOrganizationAuthFile">生成企业授权书</a> 来获得。<br>p.s. 如果上传授权书 ，需遵循以下条件 </p><ol><li>超管的信息（超管姓名，超管手机号）必须为必填参数。</li><li>认证方式AuthorizationTypes必须只能是上传授权书方式</li></ol>
     */
    public void setPowerOfAttorneys(String [] PowerOfAttorneys) {
        this.PowerOfAttorneys = PowerOfAttorneys;
    }

    /**
     * Get <p>调用方自定义的个性化字段(可自定义此名称)，并以base64方式编码，支持的最大数据大小为 4096长度。</p><p>在. 企业引导企业实名认证后回调中，该字段的信息将原封不动地透传给贵方。回调的相关说明可参考开发者中心的<a href="https://qian.tencent.com/developers/company/callback_types_staffs" target="_blank">回调通知</a>模块。</p> 
     * @return UserData <p>调用方自定义的个性化字段(可自定义此名称)，并以base64方式编码，支持的最大数据大小为 4096长度。</p><p>在. 企业引导企业实名认证后回调中，该字段的信息将原封不动地透传给贵方。回调的相关说明可参考开发者中心的<a href="https://qian.tencent.com/developers/company/callback_types_staffs" target="_blank">回调通知</a>模块。</p>
     */
    public String getUserData() {
        return this.UserData;
    }

    /**
     * Set <p>调用方自定义的个性化字段(可自定义此名称)，并以base64方式编码，支持的最大数据大小为 4096长度。</p><p>在. 企业引导企业实名认证后回调中，该字段的信息将原封不动地透传给贵方。回调的相关说明可参考开发者中心的<a href="https://qian.tencent.com/developers/company/callback_types_staffs" target="_blank">回调通知</a>模块。</p>
     * @param UserData <p>调用方自定义的个性化字段(可自定义此名称)，并以base64方式编码，支持的最大数据大小为 4096长度。</p><p>在. 企业引导企业实名认证后回调中，该字段的信息将原封不动地透传给贵方。回调的相关说明可参考开发者中心的<a href="https://qian.tencent.com/developers/company/callback_types_staffs" target="_blank">回调通知</a>模块。</p>
     */
    public void setUserData(String UserData) {
        this.UserData = UserData;
    }

    /**
     * Get <p>组织机构对公打款账号，账户名跟企业名称一致。</p><p>p.s.<br>只有认证方式是授权书+对公打款时才生效。</p> 
     * @return BankAccountNumber <p>组织机构对公打款账号，账户名跟企业名称一致。</p><p>p.s.<br>只有认证方式是授权书+对公打款时才生效。</p>
     */
    public String getBankAccountNumber() {
        return this.BankAccountNumber;
    }

    /**
     * Set <p>组织机构对公打款账号，账户名跟企业名称一致。</p><p>p.s.<br>只有认证方式是授权书+对公打款时才生效。</p>
     * @param BankAccountNumber <p>组织机构对公打款账号，账户名跟企业名称一致。</p><p>p.s.<br>只有认证方式是授权书+对公打款时才生效。</p>
     */
    public void setBankAccountNumber(String BankAccountNumber) {
        this.BankAccountNumber = BankAccountNumber;
    }

    /**
     * Get <p>对方打开链接认证时，对公打款账号是否要与接口传递上来的保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul></p><p>p.s. 仅在对公打款不为空时有效</p> 
     * @return BankAccountNumberSame <p>对方打开链接认证时，对公打款账号是否要与接口传递上来的保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul></p><p>p.s. 仅在对公打款不为空时有效</p>
     */
    public Boolean getBankAccountNumberSame() {
        return this.BankAccountNumberSame;
    }

    /**
     * Set <p>对方打开链接认证时，对公打款账号是否要与接口传递上来的保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul></p><p>p.s. 仅在对公打款不为空时有效</p>
     * @param BankAccountNumberSame <p>对方打开链接认证时，对公打款账号是否要与接口传递上来的保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul></p><p>p.s. 仅在对公打款不为空时有效</p>
     */
    public void setBankAccountNumberSame(Boolean BankAccountNumberSame) {
        this.BankAccountNumberSame = BankAccountNumberSame;
    }

    /**
     * Get <p>跳转事件，其中包括认证期间收录，授权书审核，企业认证的回跳事件。<br>p.s.<br>Endpoint如果是APP 类型，请传递JumpUrl为<font color="red">&quot;true&quot; </font><br>如果 Endpoint 是 H5 类型，请参考文档跳转电子签H5 </p><p>p.s. 如果Endpoint是 APP，传递的跳转地址无效，不会进行跳转，仅会进行回跳。</p> 
     * @return JumpEvents <p>跳转事件，其中包括认证期间收录，授权书审核，企业认证的回跳事件。<br>p.s.<br>Endpoint如果是APP 类型，请传递JumpUrl为<font color="red">&quot;true&quot; </font><br>如果 Endpoint 是 H5 类型，请参考文档跳转电子签H5 </p><p>p.s. 如果Endpoint是 APP，传递的跳转地址无效，不会进行跳转，仅会进行回跳。</p>
     */
    public JumpEvent [] getJumpEvents() {
        return this.JumpEvents;
    }

    /**
     * Set <p>跳转事件，其中包括认证期间收录，授权书审核，企业认证的回跳事件。<br>p.s.<br>Endpoint如果是APP 类型，请传递JumpUrl为<font color="red">&quot;true&quot; </font><br>如果 Endpoint 是 H5 类型，请参考文档跳转电子签H5 </p><p>p.s. 如果Endpoint是 APP，传递的跳转地址无效，不会进行跳转，仅会进行回跳。</p>
     * @param JumpEvents <p>跳转事件，其中包括认证期间收录，授权书审核，企业认证的回跳事件。<br>p.s.<br>Endpoint如果是APP 类型，请传递JumpUrl为<font color="red">&quot;true&quot; </font><br>如果 Endpoint 是 H5 类型，请参考文档跳转电子签H5 </p><p>p.s. 如果Endpoint是 APP，传递的跳转地址无效，不会进行跳转，仅会进行回跳。</p>
     */
    public void setJumpEvents(JumpEvent [] JumpEvents) {
        this.JumpEvents = JumpEvents;
    }

    /**
     * Get <p>企业证照类型：<ul><li> <strong>USCC</strong> :(默认)工商组织营业执照</li><li> <strong>PRACTICELICENSEOFMEDICALINSTITUTION</strong> :医疗机构执业许可证</li><li> <strong>CLINICFILLINGCERTIFICATE</strong> :诊所备案证</li></ul></p><p>注意 ：<br>如果企业证照类型是医疗机构执业许可证或者诊所备案证，则参数设置企业授权方式(AuthorizationTypes)和企业认证方式(AuthorizationMethods)都无效.<br>医疗机构执业许可证和诊所备案证的企业授权方式  仅有授权书的方式。企业认证仅有上传营业执照的方式。</p> 
     * @return OrganizationIdCardType <p>企业证照类型：<ul><li> <strong>USCC</strong> :(默认)工商组织营业执照</li><li> <strong>PRACTICELICENSEOFMEDICALINSTITUTION</strong> :医疗机构执业许可证</li><li> <strong>CLINICFILLINGCERTIFICATE</strong> :诊所备案证</li></ul></p><p>注意 ：<br>如果企业证照类型是医疗机构执业许可证或者诊所备案证，则参数设置企业授权方式(AuthorizationTypes)和企业认证方式(AuthorizationMethods)都无效.<br>医疗机构执业许可证和诊所备案证的企业授权方式  仅有授权书的方式。企业认证仅有上传营业执照的方式。</p>
     */
    public String getOrganizationIdCardType() {
        return this.OrganizationIdCardType;
    }

    /**
     * Set <p>企业证照类型：<ul><li> <strong>USCC</strong> :(默认)工商组织营业执照</li><li> <strong>PRACTICELICENSEOFMEDICALINSTITUTION</strong> :医疗机构执业许可证</li><li> <strong>CLINICFILLINGCERTIFICATE</strong> :诊所备案证</li></ul></p><p>注意 ：<br>如果企业证照类型是医疗机构执业许可证或者诊所备案证，则参数设置企业授权方式(AuthorizationTypes)和企业认证方式(AuthorizationMethods)都无效.<br>医疗机构执业许可证和诊所备案证的企业授权方式  仅有授权书的方式。企业认证仅有上传营业执照的方式。</p>
     * @param OrganizationIdCardType <p>企业证照类型：<ul><li> <strong>USCC</strong> :(默认)工商组织营业执照</li><li> <strong>PRACTICELICENSEOFMEDICALINSTITUTION</strong> :医疗机构执业许可证</li><li> <strong>CLINICFILLINGCERTIFICATE</strong> :诊所备案证</li></ul></p><p>注意 ：<br>如果企业证照类型是医疗机构执业许可证或者诊所备案证，则参数设置企业授权方式(AuthorizationTypes)和企业认证方式(AuthorizationMethods)都无效.<br>医疗机构执业许可证和诊所备案证的企业授权方式  仅有授权书的方式。企业认证仅有上传营业执照的方式。</p>
     */
    public void setOrganizationIdCardType(String OrganizationIdCardType) {
        this.OrganizationIdCardType = OrganizationIdCardType;
    }

    /**
     * Get <p>是否允许编辑企业注册时的证照类型</p><p>true:不允许编辑。</p><p>false:允许编辑（默认值）。</p><p>注意：<br>入参中的OrganizationIdCardType值不为空的时候，才可设置为不可编辑。</p> 
     * @return OrganizationIdCardTypeSame <p>是否允许编辑企业注册时的证照类型</p><p>true:不允许编辑。</p><p>false:允许编辑（默认值）。</p><p>注意：<br>入参中的OrganizationIdCardType值不为空的时候，才可设置为不可编辑。</p>
     */
    public Boolean getOrganizationIdCardTypeSame() {
        return this.OrganizationIdCardTypeSame;
    }

    /**
     * Set <p>是否允许编辑企业注册时的证照类型</p><p>true:不允许编辑。</p><p>false:允许编辑（默认值）。</p><p>注意：<br>入参中的OrganizationIdCardType值不为空的时候，才可设置为不可编辑。</p>
     * @param OrganizationIdCardTypeSame <p>是否允许编辑企业注册时的证照类型</p><p>true:不允许编辑。</p><p>false:允许编辑（默认值）。</p><p>注意：<br>入参中的OrganizationIdCardType值不为空的时候，才可设置为不可编辑。</p>
     */
    public void setOrganizationIdCardTypeSame(Boolean OrganizationIdCardTypeSame) {
        this.OrganizationIdCardTypeSame = OrganizationIdCardTypeSame;
    }

    /**
     * Get <p>指定企业认证的授权方式 支持多选:</p><ul><li><strong>1</strong>: 上传营业执照</li><li><strong>2</strong>: 腾讯云快速认证</li><li><strong>3</strong>: 腾讯商户号授权<font color="red">（仅支持小程序端）</font></li></ul><p>注意：<br>1.如果没有指定，则默认是1,仅有上传营业执照。<br>2.H5 仅支持上传营业执照。</p> 
     * @return AuthorizationMethod <p>指定企业认证的授权方式 支持多选:</p><ul><li><strong>1</strong>: 上传营业执照</li><li><strong>2</strong>: 腾讯云快速认证</li><li><strong>3</strong>: 腾讯商户号授权<font color="red">（仅支持小程序端）</font></li></ul><p>注意：<br>1.如果没有指定，则默认是1,仅有上传营业执照。<br>2.H5 仅支持上传营业执照。</p>
     */
    public Long [] getAuthorizationMethod() {
        return this.AuthorizationMethod;
    }

    /**
     * Set <p>指定企业认证的授权方式 支持多选:</p><ul><li><strong>1</strong>: 上传营业执照</li><li><strong>2</strong>: 腾讯云快速认证</li><li><strong>3</strong>: 腾讯商户号授权<font color="red">（仅支持小程序端）</font></li></ul><p>注意：<br>1.如果没有指定，则默认是1,仅有上传营业执照。<br>2.H5 仅支持上传营业执照。</p>
     * @param AuthorizationMethod <p>指定企业认证的授权方式 支持多选:</p><ul><li><strong>1</strong>: 上传营业执照</li><li><strong>2</strong>: 腾讯云快速认证</li><li><strong>3</strong>: 腾讯商户号授权<font color="red">（仅支持小程序端）</font></li></ul><p>注意：<br>1.如果没有指定，则默认是1,仅有上传营业执照。<br>2.H5 仅支持上传营业执照。</p>
     */
    public void setAuthorizationMethod(Long [] AuthorizationMethod) {
        this.AuthorizationMethod = AuthorizationMethod;
    }

    public CreateOrganizationAuthUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOrganizationAuthUrlRequest(CreateOrganizationAuthUrlRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.AuthorizationTypes != null) {
            this.AuthorizationTypes = new Long[source.AuthorizationTypes.length];
            for (int i = 0; i < source.AuthorizationTypes.length; i++) {
                this.AuthorizationTypes[i] = new Long(source.AuthorizationTypes[i]);
            }
        }
        if (source.OrganizationName != null) {
            this.OrganizationName = new String(source.OrganizationName);
        }
        if (source.UniformSocialCreditCode != null) {
            this.UniformSocialCreditCode = new String(source.UniformSocialCreditCode);
        }
        if (source.LegalName != null) {
            this.LegalName = new String(source.LegalName);
        }
        if (source.AutoJumpUrl != null) {
            this.AutoJumpUrl = new String(source.AutoJumpUrl);
        }
        if (source.OrganizationAddress != null) {
            this.OrganizationAddress = new String(source.OrganizationAddress);
        }
        if (source.AdminName != null) {
            this.AdminName = new String(source.AdminName);
        }
        if (source.AdminMobile != null) {
            this.AdminMobile = new String(source.AdminMobile);
        }
        if (source.AdminIdCardNumber != null) {
            this.AdminIdCardNumber = new String(source.AdminIdCardNumber);
        }
        if (source.AdminIdCardType != null) {
            this.AdminIdCardType = new String(source.AdminIdCardType);
        }
        if (source.UniformSocialCreditCodeSame != null) {
            this.UniformSocialCreditCodeSame = new Boolean(source.UniformSocialCreditCodeSame);
        }
        if (source.LegalNameSame != null) {
            this.LegalNameSame = new Boolean(source.LegalNameSame);
        }
        if (source.AdminNameSame != null) {
            this.AdminNameSame = new Boolean(source.AdminNameSame);
        }
        if (source.AdminIdCardNumberSame != null) {
            this.AdminIdCardNumberSame = new Boolean(source.AdminIdCardNumberSame);
        }
        if (source.AdminMobileSame != null) {
            this.AdminMobileSame = new Boolean(source.AdminMobileSame);
        }
        if (source.OrganizationNameSame != null) {
            this.OrganizationNameSame = new Boolean(source.OrganizationNameSame);
        }
        if (source.BusinessLicense != null) {
            this.BusinessLicense = new String(source.BusinessLicense);
        }
        if (source.Endpoint != null) {
            this.Endpoint = new String(source.Endpoint);
        }
        if (source.Initialization != null) {
            this.Initialization = new Long[source.Initialization.length];
            for (int i = 0; i < source.Initialization.length; i++) {
                this.Initialization[i] = new Long(source.Initialization[i]);
            }
        }
        if (source.PowerOfAttorneys != null) {
            this.PowerOfAttorneys = new String[source.PowerOfAttorneys.length];
            for (int i = 0; i < source.PowerOfAttorneys.length; i++) {
                this.PowerOfAttorneys[i] = new String(source.PowerOfAttorneys[i]);
            }
        }
        if (source.UserData != null) {
            this.UserData = new String(source.UserData);
        }
        if (source.BankAccountNumber != null) {
            this.BankAccountNumber = new String(source.BankAccountNumber);
        }
        if (source.BankAccountNumberSame != null) {
            this.BankAccountNumberSame = new Boolean(source.BankAccountNumberSame);
        }
        if (source.JumpEvents != null) {
            this.JumpEvents = new JumpEvent[source.JumpEvents.length];
            for (int i = 0; i < source.JumpEvents.length; i++) {
                this.JumpEvents[i] = new JumpEvent(source.JumpEvents[i]);
            }
        }
        if (source.OrganizationIdCardType != null) {
            this.OrganizationIdCardType = new String(source.OrganizationIdCardType);
        }
        if (source.OrganizationIdCardTypeSame != null) {
            this.OrganizationIdCardTypeSame = new Boolean(source.OrganizationIdCardTypeSame);
        }
        if (source.AuthorizationMethod != null) {
            this.AuthorizationMethod = new Long[source.AuthorizationMethod.length];
            for (int i = 0; i < source.AuthorizationMethod.length; i++) {
                this.AuthorizationMethod[i] = new Long(source.AuthorizationMethod[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamArraySimple(map, prefix + "AuthorizationTypes.", this.AuthorizationTypes);
        this.setParamSimple(map, prefix + "OrganizationName", this.OrganizationName);
        this.setParamSimple(map, prefix + "UniformSocialCreditCode", this.UniformSocialCreditCode);
        this.setParamSimple(map, prefix + "LegalName", this.LegalName);
        this.setParamSimple(map, prefix + "AutoJumpUrl", this.AutoJumpUrl);
        this.setParamSimple(map, prefix + "OrganizationAddress", this.OrganizationAddress);
        this.setParamSimple(map, prefix + "AdminName", this.AdminName);
        this.setParamSimple(map, prefix + "AdminMobile", this.AdminMobile);
        this.setParamSimple(map, prefix + "AdminIdCardNumber", this.AdminIdCardNumber);
        this.setParamSimple(map, prefix + "AdminIdCardType", this.AdminIdCardType);
        this.setParamSimple(map, prefix + "UniformSocialCreditCodeSame", this.UniformSocialCreditCodeSame);
        this.setParamSimple(map, prefix + "LegalNameSame", this.LegalNameSame);
        this.setParamSimple(map, prefix + "AdminNameSame", this.AdminNameSame);
        this.setParamSimple(map, prefix + "AdminIdCardNumberSame", this.AdminIdCardNumberSame);
        this.setParamSimple(map, prefix + "AdminMobileSame", this.AdminMobileSame);
        this.setParamSimple(map, prefix + "OrganizationNameSame", this.OrganizationNameSame);
        this.setParamSimple(map, prefix + "BusinessLicense", this.BusinessLicense);
        this.setParamSimple(map, prefix + "Endpoint", this.Endpoint);
        this.setParamArraySimple(map, prefix + "Initialization.", this.Initialization);
        this.setParamArraySimple(map, prefix + "PowerOfAttorneys.", this.PowerOfAttorneys);
        this.setParamSimple(map, prefix + "UserData", this.UserData);
        this.setParamSimple(map, prefix + "BankAccountNumber", this.BankAccountNumber);
        this.setParamSimple(map, prefix + "BankAccountNumberSame", this.BankAccountNumberSame);
        this.setParamArrayObj(map, prefix + "JumpEvents.", this.JumpEvents);
        this.setParamSimple(map, prefix + "OrganizationIdCardType", this.OrganizationIdCardType);
        this.setParamSimple(map, prefix + "OrganizationIdCardTypeSame", this.OrganizationIdCardTypeSame);
        this.setParamArraySimple(map, prefix + "AuthorizationMethod.", this.AuthorizationMethod);

    }
}

