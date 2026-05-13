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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CommonFlowApprover extends AbstractModel {

    /**
    * <p>指定签署人非第三方平台子客企业下员工还是SaaS平台企业，在ApproverType为ORGANIZATION时指定。</p><ul><li>false: 默认值，第三方平台子客企业下员工</li><li>true: SaaS平台企业下的员工</li></ul>
    */
    @SerializedName("NotChannelOrganization")
    @Expose
    private Boolean NotChannelOrganization;

    /**
    * <p>在指定签署方时，可选择企业B端或个人C端等不同的参与者类型，可选类型如下:</p><p> <strong>0</strong> :企业/企业员工（企业签署方或模板发起时的企业静默签）<br> <strong>1</strong> :个人/自然人<br><strong>3</strong> :企业/企业员工自动签（他方企业自动签署或文件发起时的本方企业自动签）</p><p>注：类型为3（企业/企业员工自动签）时，此接口会默认完成该签署方的签署。静默签署仅进行盖章操作，不能自动签名。<br>使用自动签时，请确保企业已经开通自动签功能，开通方式：控制台 -&gt; 企业设置 -&gt; 扩展服务 -&gt; 企业自动签。<br>使用文件发起自动签时使用前请联系对接的客户经理沟通。</p>
    */
    @SerializedName("ApproverType")
    @Expose
    private Long ApproverType;

    /**
    * <p>电子签平台给企业生成的企业id</p>
    */
    @SerializedName("OrganizationId")
    @Expose
    private String OrganizationId;

    /**
    * <p>企业OpenId，第三方应用集成非静默签子客企业签署人发起合同必传</p>
    */
    @SerializedName("OrganizationOpenId")
    @Expose
    private String OrganizationOpenId;

    /**
    * <p>企业名称，第三方应用集成非静默签子客企业签署人必传，saas企业签署人必传</p>
    */
    @SerializedName("OrganizationName")
    @Expose
    private String OrganizationName;

    /**
    * <p>电子签平台给企业员工或者自热人生成的用户id</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * <p>第三方平台子客企业员工的唯一标识</p>
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * <p>签署方经办人的姓名。<br>经办人的姓名将用于身份认证和电子签名，请确保填写的姓名为签署方的真实姓名，而非昵称等代名。</p>
    */
    @SerializedName("ApproverName")
    @Expose
    private String ApproverName;

    /**
    * <p>签署人手机号，saas企业签署人，个人签署人必传</p>
    */
    @SerializedName("ApproverMobile")
    @Expose
    private String ApproverMobile;

    /**
    * <p>签署方经办人的证件类型，支持以下类型</p><ul><li>ID_CARD : 中国大陆居民身份证  (默认值)</li><li>HONGKONG_AND_MACAO : 中国港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN : 中国港澳台居民居住证(格式同中国大陆居民身份证)</li><li>OTHER_CARD_TYPE : 其他证件</li></ul><p>注: <code>其他证件类型为白名单功能，使用前请联系对接的客户经理沟通。</code></p>
    */
    @SerializedName("ApproverIdCardType")
    @Expose
    private String ApproverIdCardType;

    /**
    * <p>签署方经办人的证件号码，应符合以下规则</p><ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成（如存在X，请大写）。</li><li>中国港澳居民来往内地通行证号码共11位。第1位为字母，“H”字头签发给中国香港居民，“M”字头签发给中国澳门居民；第2位至第11位为数字。</li><li>中国港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul>
    */
    @SerializedName("ApproverIdCardNumber")
    @Expose
    private String ApproverIdCardNumber;

    /**
    * <p>签署人Id，使用模板发起是，对应模板配置中的签署人RecipientId<br>注意：模板发起时该字段必填</p>
    */
    @SerializedName("RecipientId")
    @Expose
    private String RecipientId;

    /**
    * <p>签署前置条件：阅读时长限制，不传默认10s,最大300s，最小3s</p>
    */
    @SerializedName("PreReadTime")
    @Expose
    private Long PreReadTime;

    /**
    * <p>签署前置条件：阅读全文限制</p>
    */
    @SerializedName("IsFullText")
    @Expose
    private Boolean IsFullText;

    /**
    * <p>通知签署方经办人的方式, 有以下途径:</p><ul><li> **SMS** :(默认)短信</li><li> **NONE** : 不通知</li></ul><p>注: <code>签署方为第三方子客企业时会被置为NONE,   不会发短信通知</code></p>
    */
    @SerializedName("NotifyType")
    @Expose
    private String NotifyType;

    /**
    * <p>签署人配置，用于控制签署人相关属性</p>
    */
    @SerializedName("ApproverOption")
    @Expose
    private CommonApproverOption ApproverOption;

    /**
    * <p>使用PDF文件直接发起合同时，签署人指定的签署控件；<br>使用模板发起合同时，指定本企业印章签署控件的印章ID: <br>通过ComponentId或ComponenetName指定签署控件，ComponentValue为印章ID。</p>
    */
    @SerializedName("SignComponents")
    @Expose
    private Component [] SignComponents;

    /**
    * <p>指定个人签署方查看合同的校验方式,可以传值如下:</p><ul><li>  **1**   : （默认）人脸识别,人脸识别后才能合同内容</li><li>  **2**  : 手机号验证, 用户手机号和参与方手机号(ApproverMobile)相同即可查看合同内容（当手写签名方式为OCR_ESIGN时，该校验方式无效，因为这种签名方式依赖实名认证）</li></ul>注: <ul><li>如果合同流程设置ApproverVerifyType查看合同的校验方式,    则忽略此签署人的查看合同的校验方式</li><li>此字段可传多个校验方式</li></ul>
    */
    @SerializedName("ApproverVerifyTypes")
    @Expose
    private Long [] ApproverVerifyTypes;

    /**
    * <p>签署人签署合同时的认证方式</p><ul><li> **1** :人脸认证</li><li> **2** :签署密码</li><li> **3** :运营商三要素</li><li> **5** :设备指纹识别</li><li> **6** :设备面容识别</li></ul><p>默认为1(人脸认证 ),2(签署密码),3(运营商三要素),5(设备指纹识别),6(设备面容识别)</p><p>注: </p><ol><li>用<font color="red">模板创建合同场景</font>, 签署人的认证方式需要在配置模板的时候指定, <font color="red">在创建合同重新指定无效</font></li><li>运营商三要素认证方式对手机号运营商及前缀有限制,可以参考<a href="https://qian.tencent.com/developers/partner/mobile_support">运营商支持列表类</a>得到具体的支持说明</li><li>校验方式不允许只包含<font color="red">设备指纹识别</font>和<font color="red">设备面容识别</font>，至少需要再增加一种其他校验方式。</li><li><font color="red">设备指纹识别</font>和<font color="red">设备面容识别</font>只支持小程序使用，其他端暂不支持。</li></ol>
    */
    @SerializedName("ApproverSignTypes")
    @Expose
    private Long [] ApproverSignTypes;

    /**
    * <p>签署方经办人控件类型是个人印章签署控件（SIGN_SIGNATURE） 时，可选的签名方式。</p><p>枚举值：</p><ul><li>HANDWRITE： 手写签名</li><li>ESIGN： 个人印章类型</li><li>OCR_ESIGN： AI智能识别手写签名</li><li>SYSTEM_ESIGN： 系统签名</li></ul>
    */
    @SerializedName("ComponentLimitType")
    @Expose
    private String [] ComponentLimitType;

    /**
     * Get <p>指定签署人非第三方平台子客企业下员工还是SaaS平台企业，在ApproverType为ORGANIZATION时指定。</p><ul><li>false: 默认值，第三方平台子客企业下员工</li><li>true: SaaS平台企业下的员工</li></ul> 
     * @return NotChannelOrganization <p>指定签署人非第三方平台子客企业下员工还是SaaS平台企业，在ApproverType为ORGANIZATION时指定。</p><ul><li>false: 默认值，第三方平台子客企业下员工</li><li>true: SaaS平台企业下的员工</li></ul>
     */
    public Boolean getNotChannelOrganization() {
        return this.NotChannelOrganization;
    }

    /**
     * Set <p>指定签署人非第三方平台子客企业下员工还是SaaS平台企业，在ApproverType为ORGANIZATION时指定。</p><ul><li>false: 默认值，第三方平台子客企业下员工</li><li>true: SaaS平台企业下的员工</li></ul>
     * @param NotChannelOrganization <p>指定签署人非第三方平台子客企业下员工还是SaaS平台企业，在ApproverType为ORGANIZATION时指定。</p><ul><li>false: 默认值，第三方平台子客企业下员工</li><li>true: SaaS平台企业下的员工</li></ul>
     */
    public void setNotChannelOrganization(Boolean NotChannelOrganization) {
        this.NotChannelOrganization = NotChannelOrganization;
    }

    /**
     * Get <p>在指定签署方时，可选择企业B端或个人C端等不同的参与者类型，可选类型如下:</p><p> <strong>0</strong> :企业/企业员工（企业签署方或模板发起时的企业静默签）<br> <strong>1</strong> :个人/自然人<br><strong>3</strong> :企业/企业员工自动签（他方企业自动签署或文件发起时的本方企业自动签）</p><p>注：类型为3（企业/企业员工自动签）时，此接口会默认完成该签署方的签署。静默签署仅进行盖章操作，不能自动签名。<br>使用自动签时，请确保企业已经开通自动签功能，开通方式：控制台 -&gt; 企业设置 -&gt; 扩展服务 -&gt; 企业自动签。<br>使用文件发起自动签时使用前请联系对接的客户经理沟通。</p> 
     * @return ApproverType <p>在指定签署方时，可选择企业B端或个人C端等不同的参与者类型，可选类型如下:</p><p> <strong>0</strong> :企业/企业员工（企业签署方或模板发起时的企业静默签）<br> <strong>1</strong> :个人/自然人<br><strong>3</strong> :企业/企业员工自动签（他方企业自动签署或文件发起时的本方企业自动签）</p><p>注：类型为3（企业/企业员工自动签）时，此接口会默认完成该签署方的签署。静默签署仅进行盖章操作，不能自动签名。<br>使用自动签时，请确保企业已经开通自动签功能，开通方式：控制台 -&gt; 企业设置 -&gt; 扩展服务 -&gt; 企业自动签。<br>使用文件发起自动签时使用前请联系对接的客户经理沟通。</p>
     */
    public Long getApproverType() {
        return this.ApproverType;
    }

    /**
     * Set <p>在指定签署方时，可选择企业B端或个人C端等不同的参与者类型，可选类型如下:</p><p> <strong>0</strong> :企业/企业员工（企业签署方或模板发起时的企业静默签）<br> <strong>1</strong> :个人/自然人<br><strong>3</strong> :企业/企业员工自动签（他方企业自动签署或文件发起时的本方企业自动签）</p><p>注：类型为3（企业/企业员工自动签）时，此接口会默认完成该签署方的签署。静默签署仅进行盖章操作，不能自动签名。<br>使用自动签时，请确保企业已经开通自动签功能，开通方式：控制台 -&gt; 企业设置 -&gt; 扩展服务 -&gt; 企业自动签。<br>使用文件发起自动签时使用前请联系对接的客户经理沟通。</p>
     * @param ApproverType <p>在指定签署方时，可选择企业B端或个人C端等不同的参与者类型，可选类型如下:</p><p> <strong>0</strong> :企业/企业员工（企业签署方或模板发起时的企业静默签）<br> <strong>1</strong> :个人/自然人<br><strong>3</strong> :企业/企业员工自动签（他方企业自动签署或文件发起时的本方企业自动签）</p><p>注：类型为3（企业/企业员工自动签）时，此接口会默认完成该签署方的签署。静默签署仅进行盖章操作，不能自动签名。<br>使用自动签时，请确保企业已经开通自动签功能，开通方式：控制台 -&gt; 企业设置 -&gt; 扩展服务 -&gt; 企业自动签。<br>使用文件发起自动签时使用前请联系对接的客户经理沟通。</p>
     */
    public void setApproverType(Long ApproverType) {
        this.ApproverType = ApproverType;
    }

    /**
     * Get <p>电子签平台给企业生成的企业id</p> 
     * @return OrganizationId <p>电子签平台给企业生成的企业id</p>
     */
    public String getOrganizationId() {
        return this.OrganizationId;
    }

    /**
     * Set <p>电子签平台给企业生成的企业id</p>
     * @param OrganizationId <p>电子签平台给企业生成的企业id</p>
     */
    public void setOrganizationId(String OrganizationId) {
        this.OrganizationId = OrganizationId;
    }

    /**
     * Get <p>企业OpenId，第三方应用集成非静默签子客企业签署人发起合同必传</p> 
     * @return OrganizationOpenId <p>企业OpenId，第三方应用集成非静默签子客企业签署人发起合同必传</p>
     */
    public String getOrganizationOpenId() {
        return this.OrganizationOpenId;
    }

    /**
     * Set <p>企业OpenId，第三方应用集成非静默签子客企业签署人发起合同必传</p>
     * @param OrganizationOpenId <p>企业OpenId，第三方应用集成非静默签子客企业签署人发起合同必传</p>
     */
    public void setOrganizationOpenId(String OrganizationOpenId) {
        this.OrganizationOpenId = OrganizationOpenId;
    }

    /**
     * Get <p>企业名称，第三方应用集成非静默签子客企业签署人必传，saas企业签署人必传</p> 
     * @return OrganizationName <p>企业名称，第三方应用集成非静默签子客企业签署人必传，saas企业签署人必传</p>
     */
    public String getOrganizationName() {
        return this.OrganizationName;
    }

    /**
     * Set <p>企业名称，第三方应用集成非静默签子客企业签署人必传，saas企业签署人必传</p>
     * @param OrganizationName <p>企业名称，第三方应用集成非静默签子客企业签署人必传，saas企业签署人必传</p>
     */
    public void setOrganizationName(String OrganizationName) {
        this.OrganizationName = OrganizationName;
    }

    /**
     * Get <p>电子签平台给企业员工或者自热人生成的用户id</p> 
     * @return UserId <p>电子签平台给企业员工或者自热人生成的用户id</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>电子签平台给企业员工或者自热人生成的用户id</p>
     * @param UserId <p>电子签平台给企业员工或者自热人生成的用户id</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get <p>第三方平台子客企业员工的唯一标识</p> 
     * @return OpenId <p>第三方平台子客企业员工的唯一标识</p>
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set <p>第三方平台子客企业员工的唯一标识</p>
     * @param OpenId <p>第三方平台子客企业员工的唯一标识</p>
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * Get <p>签署方经办人的姓名。<br>经办人的姓名将用于身份认证和电子签名，请确保填写的姓名为签署方的真实姓名，而非昵称等代名。</p> 
     * @return ApproverName <p>签署方经办人的姓名。<br>经办人的姓名将用于身份认证和电子签名，请确保填写的姓名为签署方的真实姓名，而非昵称等代名。</p>
     */
    public String getApproverName() {
        return this.ApproverName;
    }

    /**
     * Set <p>签署方经办人的姓名。<br>经办人的姓名将用于身份认证和电子签名，请确保填写的姓名为签署方的真实姓名，而非昵称等代名。</p>
     * @param ApproverName <p>签署方经办人的姓名。<br>经办人的姓名将用于身份认证和电子签名，请确保填写的姓名为签署方的真实姓名，而非昵称等代名。</p>
     */
    public void setApproverName(String ApproverName) {
        this.ApproverName = ApproverName;
    }

    /**
     * Get <p>签署人手机号，saas企业签署人，个人签署人必传</p> 
     * @return ApproverMobile <p>签署人手机号，saas企业签署人，个人签署人必传</p>
     */
    public String getApproverMobile() {
        return this.ApproverMobile;
    }

    /**
     * Set <p>签署人手机号，saas企业签署人，个人签署人必传</p>
     * @param ApproverMobile <p>签署人手机号，saas企业签署人，个人签署人必传</p>
     */
    public void setApproverMobile(String ApproverMobile) {
        this.ApproverMobile = ApproverMobile;
    }

    /**
     * Get <p>签署方经办人的证件类型，支持以下类型</p><ul><li>ID_CARD : 中国大陆居民身份证  (默认值)</li><li>HONGKONG_AND_MACAO : 中国港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN : 中国港澳台居民居住证(格式同中国大陆居民身份证)</li><li>OTHER_CARD_TYPE : 其他证件</li></ul><p>注: <code>其他证件类型为白名单功能，使用前请联系对接的客户经理沟通。</code></p> 
     * @return ApproverIdCardType <p>签署方经办人的证件类型，支持以下类型</p><ul><li>ID_CARD : 中国大陆居民身份证  (默认值)</li><li>HONGKONG_AND_MACAO : 中国港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN : 中国港澳台居民居住证(格式同中国大陆居民身份证)</li><li>OTHER_CARD_TYPE : 其他证件</li></ul><p>注: <code>其他证件类型为白名单功能，使用前请联系对接的客户经理沟通。</code></p>
     */
    public String getApproverIdCardType() {
        return this.ApproverIdCardType;
    }

    /**
     * Set <p>签署方经办人的证件类型，支持以下类型</p><ul><li>ID_CARD : 中国大陆居民身份证  (默认值)</li><li>HONGKONG_AND_MACAO : 中国港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN : 中国港澳台居民居住证(格式同中国大陆居民身份证)</li><li>OTHER_CARD_TYPE : 其他证件</li></ul><p>注: <code>其他证件类型为白名单功能，使用前请联系对接的客户经理沟通。</code></p>
     * @param ApproverIdCardType <p>签署方经办人的证件类型，支持以下类型</p><ul><li>ID_CARD : 中国大陆居民身份证  (默认值)</li><li>HONGKONG_AND_MACAO : 中国港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN : 中国港澳台居民居住证(格式同中国大陆居民身份证)</li><li>OTHER_CARD_TYPE : 其他证件</li></ul><p>注: <code>其他证件类型为白名单功能，使用前请联系对接的客户经理沟通。</code></p>
     */
    public void setApproverIdCardType(String ApproverIdCardType) {
        this.ApproverIdCardType = ApproverIdCardType;
    }

    /**
     * Get <p>签署方经办人的证件号码，应符合以下规则</p><ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成（如存在X，请大写）。</li><li>中国港澳居民来往内地通行证号码共11位。第1位为字母，“H”字头签发给中国香港居民，“M”字头签发给中国澳门居民；第2位至第11位为数字。</li><li>中国港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul> 
     * @return ApproverIdCardNumber <p>签署方经办人的证件号码，应符合以下规则</p><ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成（如存在X，请大写）。</li><li>中国港澳居民来往内地通行证号码共11位。第1位为字母，“H”字头签发给中国香港居民，“M”字头签发给中国澳门居民；第2位至第11位为数字。</li><li>中国港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul>
     */
    public String getApproverIdCardNumber() {
        return this.ApproverIdCardNumber;
    }

    /**
     * Set <p>签署方经办人的证件号码，应符合以下规则</p><ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成（如存在X，请大写）。</li><li>中国港澳居民来往内地通行证号码共11位。第1位为字母，“H”字头签发给中国香港居民，“M”字头签发给中国澳门居民；第2位至第11位为数字。</li><li>中国港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul>
     * @param ApproverIdCardNumber <p>签署方经办人的证件号码，应符合以下规则</p><ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成（如存在X，请大写）。</li><li>中国港澳居民来往内地通行证号码共11位。第1位为字母，“H”字头签发给中国香港居民，“M”字头签发给中国澳门居民；第2位至第11位为数字。</li><li>中国港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul>
     */
    public void setApproverIdCardNumber(String ApproverIdCardNumber) {
        this.ApproverIdCardNumber = ApproverIdCardNumber;
    }

    /**
     * Get <p>签署人Id，使用模板发起是，对应模板配置中的签署人RecipientId<br>注意：模板发起时该字段必填</p> 
     * @return RecipientId <p>签署人Id，使用模板发起是，对应模板配置中的签署人RecipientId<br>注意：模板发起时该字段必填</p>
     */
    public String getRecipientId() {
        return this.RecipientId;
    }

    /**
     * Set <p>签署人Id，使用模板发起是，对应模板配置中的签署人RecipientId<br>注意：模板发起时该字段必填</p>
     * @param RecipientId <p>签署人Id，使用模板发起是，对应模板配置中的签署人RecipientId<br>注意：模板发起时该字段必填</p>
     */
    public void setRecipientId(String RecipientId) {
        this.RecipientId = RecipientId;
    }

    /**
     * Get <p>签署前置条件：阅读时长限制，不传默认10s,最大300s，最小3s</p> 
     * @return PreReadTime <p>签署前置条件：阅读时长限制，不传默认10s,最大300s，最小3s</p>
     */
    public Long getPreReadTime() {
        return this.PreReadTime;
    }

    /**
     * Set <p>签署前置条件：阅读时长限制，不传默认10s,最大300s，最小3s</p>
     * @param PreReadTime <p>签署前置条件：阅读时长限制，不传默认10s,最大300s，最小3s</p>
     */
    public void setPreReadTime(Long PreReadTime) {
        this.PreReadTime = PreReadTime;
    }

    /**
     * Get <p>签署前置条件：阅读全文限制</p> 
     * @return IsFullText <p>签署前置条件：阅读全文限制</p>
     */
    public Boolean getIsFullText() {
        return this.IsFullText;
    }

    /**
     * Set <p>签署前置条件：阅读全文限制</p>
     * @param IsFullText <p>签署前置条件：阅读全文限制</p>
     */
    public void setIsFullText(Boolean IsFullText) {
        this.IsFullText = IsFullText;
    }

    /**
     * Get <p>通知签署方经办人的方式, 有以下途径:</p><ul><li> **SMS** :(默认)短信</li><li> **NONE** : 不通知</li></ul><p>注: <code>签署方为第三方子客企业时会被置为NONE,   不会发短信通知</code></p> 
     * @return NotifyType <p>通知签署方经办人的方式, 有以下途径:</p><ul><li> **SMS** :(默认)短信</li><li> **NONE** : 不通知</li></ul><p>注: <code>签署方为第三方子客企业时会被置为NONE,   不会发短信通知</code></p>
     */
    public String getNotifyType() {
        return this.NotifyType;
    }

    /**
     * Set <p>通知签署方经办人的方式, 有以下途径:</p><ul><li> **SMS** :(默认)短信</li><li> **NONE** : 不通知</li></ul><p>注: <code>签署方为第三方子客企业时会被置为NONE,   不会发短信通知</code></p>
     * @param NotifyType <p>通知签署方经办人的方式, 有以下途径:</p><ul><li> **SMS** :(默认)短信</li><li> **NONE** : 不通知</li></ul><p>注: <code>签署方为第三方子客企业时会被置为NONE,   不会发短信通知</code></p>
     */
    public void setNotifyType(String NotifyType) {
        this.NotifyType = NotifyType;
    }

    /**
     * Get <p>签署人配置，用于控制签署人相关属性</p> 
     * @return ApproverOption <p>签署人配置，用于控制签署人相关属性</p>
     */
    public CommonApproverOption getApproverOption() {
        return this.ApproverOption;
    }

    /**
     * Set <p>签署人配置，用于控制签署人相关属性</p>
     * @param ApproverOption <p>签署人配置，用于控制签署人相关属性</p>
     */
    public void setApproverOption(CommonApproverOption ApproverOption) {
        this.ApproverOption = ApproverOption;
    }

    /**
     * Get <p>使用PDF文件直接发起合同时，签署人指定的签署控件；<br>使用模板发起合同时，指定本企业印章签署控件的印章ID: <br>通过ComponentId或ComponenetName指定签署控件，ComponentValue为印章ID。</p> 
     * @return SignComponents <p>使用PDF文件直接发起合同时，签署人指定的签署控件；<br>使用模板发起合同时，指定本企业印章签署控件的印章ID: <br>通过ComponentId或ComponenetName指定签署控件，ComponentValue为印章ID。</p>
     */
    public Component [] getSignComponents() {
        return this.SignComponents;
    }

    /**
     * Set <p>使用PDF文件直接发起合同时，签署人指定的签署控件；<br>使用模板发起合同时，指定本企业印章签署控件的印章ID: <br>通过ComponentId或ComponenetName指定签署控件，ComponentValue为印章ID。</p>
     * @param SignComponents <p>使用PDF文件直接发起合同时，签署人指定的签署控件；<br>使用模板发起合同时，指定本企业印章签署控件的印章ID: <br>通过ComponentId或ComponenetName指定签署控件，ComponentValue为印章ID。</p>
     */
    public void setSignComponents(Component [] SignComponents) {
        this.SignComponents = SignComponents;
    }

    /**
     * Get <p>指定个人签署方查看合同的校验方式,可以传值如下:</p><ul><li>  **1**   : （默认）人脸识别,人脸识别后才能合同内容</li><li>  **2**  : 手机号验证, 用户手机号和参与方手机号(ApproverMobile)相同即可查看合同内容（当手写签名方式为OCR_ESIGN时，该校验方式无效，因为这种签名方式依赖实名认证）</li></ul>注: <ul><li>如果合同流程设置ApproverVerifyType查看合同的校验方式,    则忽略此签署人的查看合同的校验方式</li><li>此字段可传多个校验方式</li></ul> 
     * @return ApproverVerifyTypes <p>指定个人签署方查看合同的校验方式,可以传值如下:</p><ul><li>  **1**   : （默认）人脸识别,人脸识别后才能合同内容</li><li>  **2**  : 手机号验证, 用户手机号和参与方手机号(ApproverMobile)相同即可查看合同内容（当手写签名方式为OCR_ESIGN时，该校验方式无效，因为这种签名方式依赖实名认证）</li></ul>注: <ul><li>如果合同流程设置ApproverVerifyType查看合同的校验方式,    则忽略此签署人的查看合同的校验方式</li><li>此字段可传多个校验方式</li></ul>
     */
    public Long [] getApproverVerifyTypes() {
        return this.ApproverVerifyTypes;
    }

    /**
     * Set <p>指定个人签署方查看合同的校验方式,可以传值如下:</p><ul><li>  **1**   : （默认）人脸识别,人脸识别后才能合同内容</li><li>  **2**  : 手机号验证, 用户手机号和参与方手机号(ApproverMobile)相同即可查看合同内容（当手写签名方式为OCR_ESIGN时，该校验方式无效，因为这种签名方式依赖实名认证）</li></ul>注: <ul><li>如果合同流程设置ApproverVerifyType查看合同的校验方式,    则忽略此签署人的查看合同的校验方式</li><li>此字段可传多个校验方式</li></ul>
     * @param ApproverVerifyTypes <p>指定个人签署方查看合同的校验方式,可以传值如下:</p><ul><li>  **1**   : （默认）人脸识别,人脸识别后才能合同内容</li><li>  **2**  : 手机号验证, 用户手机号和参与方手机号(ApproverMobile)相同即可查看合同内容（当手写签名方式为OCR_ESIGN时，该校验方式无效，因为这种签名方式依赖实名认证）</li></ul>注: <ul><li>如果合同流程设置ApproverVerifyType查看合同的校验方式,    则忽略此签署人的查看合同的校验方式</li><li>此字段可传多个校验方式</li></ul>
     */
    public void setApproverVerifyTypes(Long [] ApproverVerifyTypes) {
        this.ApproverVerifyTypes = ApproverVerifyTypes;
    }

    /**
     * Get <p>签署人签署合同时的认证方式</p><ul><li> **1** :人脸认证</li><li> **2** :签署密码</li><li> **3** :运营商三要素</li><li> **5** :设备指纹识别</li><li> **6** :设备面容识别</li></ul><p>默认为1(人脸认证 ),2(签署密码),3(运营商三要素),5(设备指纹识别),6(设备面容识别)</p><p>注: </p><ol><li>用<font color="red">模板创建合同场景</font>, 签署人的认证方式需要在配置模板的时候指定, <font color="red">在创建合同重新指定无效</font></li><li>运营商三要素认证方式对手机号运营商及前缀有限制,可以参考<a href="https://qian.tencent.com/developers/partner/mobile_support">运营商支持列表类</a>得到具体的支持说明</li><li>校验方式不允许只包含<font color="red">设备指纹识别</font>和<font color="red">设备面容识别</font>，至少需要再增加一种其他校验方式。</li><li><font color="red">设备指纹识别</font>和<font color="red">设备面容识别</font>只支持小程序使用，其他端暂不支持。</li></ol> 
     * @return ApproverSignTypes <p>签署人签署合同时的认证方式</p><ul><li> **1** :人脸认证</li><li> **2** :签署密码</li><li> **3** :运营商三要素</li><li> **5** :设备指纹识别</li><li> **6** :设备面容识别</li></ul><p>默认为1(人脸认证 ),2(签署密码),3(运营商三要素),5(设备指纹识别),6(设备面容识别)</p><p>注: </p><ol><li>用<font color="red">模板创建合同场景</font>, 签署人的认证方式需要在配置模板的时候指定, <font color="red">在创建合同重新指定无效</font></li><li>运营商三要素认证方式对手机号运营商及前缀有限制,可以参考<a href="https://qian.tencent.com/developers/partner/mobile_support">运营商支持列表类</a>得到具体的支持说明</li><li>校验方式不允许只包含<font color="red">设备指纹识别</font>和<font color="red">设备面容识别</font>，至少需要再增加一种其他校验方式。</li><li><font color="red">设备指纹识别</font>和<font color="red">设备面容识别</font>只支持小程序使用，其他端暂不支持。</li></ol>
     */
    public Long [] getApproverSignTypes() {
        return this.ApproverSignTypes;
    }

    /**
     * Set <p>签署人签署合同时的认证方式</p><ul><li> **1** :人脸认证</li><li> **2** :签署密码</li><li> **3** :运营商三要素</li><li> **5** :设备指纹识别</li><li> **6** :设备面容识别</li></ul><p>默认为1(人脸认证 ),2(签署密码),3(运营商三要素),5(设备指纹识别),6(设备面容识别)</p><p>注: </p><ol><li>用<font color="red">模板创建合同场景</font>, 签署人的认证方式需要在配置模板的时候指定, <font color="red">在创建合同重新指定无效</font></li><li>运营商三要素认证方式对手机号运营商及前缀有限制,可以参考<a href="https://qian.tencent.com/developers/partner/mobile_support">运营商支持列表类</a>得到具体的支持说明</li><li>校验方式不允许只包含<font color="red">设备指纹识别</font>和<font color="red">设备面容识别</font>，至少需要再增加一种其他校验方式。</li><li><font color="red">设备指纹识别</font>和<font color="red">设备面容识别</font>只支持小程序使用，其他端暂不支持。</li></ol>
     * @param ApproverSignTypes <p>签署人签署合同时的认证方式</p><ul><li> **1** :人脸认证</li><li> **2** :签署密码</li><li> **3** :运营商三要素</li><li> **5** :设备指纹识别</li><li> **6** :设备面容识别</li></ul><p>默认为1(人脸认证 ),2(签署密码),3(运营商三要素),5(设备指纹识别),6(设备面容识别)</p><p>注: </p><ol><li>用<font color="red">模板创建合同场景</font>, 签署人的认证方式需要在配置模板的时候指定, <font color="red">在创建合同重新指定无效</font></li><li>运营商三要素认证方式对手机号运营商及前缀有限制,可以参考<a href="https://qian.tencent.com/developers/partner/mobile_support">运营商支持列表类</a>得到具体的支持说明</li><li>校验方式不允许只包含<font color="red">设备指纹识别</font>和<font color="red">设备面容识别</font>，至少需要再增加一种其他校验方式。</li><li><font color="red">设备指纹识别</font>和<font color="red">设备面容识别</font>只支持小程序使用，其他端暂不支持。</li></ol>
     */
    public void setApproverSignTypes(Long [] ApproverSignTypes) {
        this.ApproverSignTypes = ApproverSignTypes;
    }

    /**
     * Get <p>签署方经办人控件类型是个人印章签署控件（SIGN_SIGNATURE） 时，可选的签名方式。</p><p>枚举值：</p><ul><li>HANDWRITE： 手写签名</li><li>ESIGN： 个人印章类型</li><li>OCR_ESIGN： AI智能识别手写签名</li><li>SYSTEM_ESIGN： 系统签名</li></ul> 
     * @return ComponentLimitType <p>签署方经办人控件类型是个人印章签署控件（SIGN_SIGNATURE） 时，可选的签名方式。</p><p>枚举值：</p><ul><li>HANDWRITE： 手写签名</li><li>ESIGN： 个人印章类型</li><li>OCR_ESIGN： AI智能识别手写签名</li><li>SYSTEM_ESIGN： 系统签名</li></ul>
     */
    public String [] getComponentLimitType() {
        return this.ComponentLimitType;
    }

    /**
     * Set <p>签署方经办人控件类型是个人印章签署控件（SIGN_SIGNATURE） 时，可选的签名方式。</p><p>枚举值：</p><ul><li>HANDWRITE： 手写签名</li><li>ESIGN： 个人印章类型</li><li>OCR_ESIGN： AI智能识别手写签名</li><li>SYSTEM_ESIGN： 系统签名</li></ul>
     * @param ComponentLimitType <p>签署方经办人控件类型是个人印章签署控件（SIGN_SIGNATURE） 时，可选的签名方式。</p><p>枚举值：</p><ul><li>HANDWRITE： 手写签名</li><li>ESIGN： 个人印章类型</li><li>OCR_ESIGN： AI智能识别手写签名</li><li>SYSTEM_ESIGN： 系统签名</li></ul>
     */
    public void setComponentLimitType(String [] ComponentLimitType) {
        this.ComponentLimitType = ComponentLimitType;
    }

    public CommonFlowApprover() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CommonFlowApprover(CommonFlowApprover source) {
        if (source.NotChannelOrganization != null) {
            this.NotChannelOrganization = new Boolean(source.NotChannelOrganization);
        }
        if (source.ApproverType != null) {
            this.ApproverType = new Long(source.ApproverType);
        }
        if (source.OrganizationId != null) {
            this.OrganizationId = new String(source.OrganizationId);
        }
        if (source.OrganizationOpenId != null) {
            this.OrganizationOpenId = new String(source.OrganizationOpenId);
        }
        if (source.OrganizationName != null) {
            this.OrganizationName = new String(source.OrganizationName);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
        }
        if (source.ApproverName != null) {
            this.ApproverName = new String(source.ApproverName);
        }
        if (source.ApproverMobile != null) {
            this.ApproverMobile = new String(source.ApproverMobile);
        }
        if (source.ApproverIdCardType != null) {
            this.ApproverIdCardType = new String(source.ApproverIdCardType);
        }
        if (source.ApproverIdCardNumber != null) {
            this.ApproverIdCardNumber = new String(source.ApproverIdCardNumber);
        }
        if (source.RecipientId != null) {
            this.RecipientId = new String(source.RecipientId);
        }
        if (source.PreReadTime != null) {
            this.PreReadTime = new Long(source.PreReadTime);
        }
        if (source.IsFullText != null) {
            this.IsFullText = new Boolean(source.IsFullText);
        }
        if (source.NotifyType != null) {
            this.NotifyType = new String(source.NotifyType);
        }
        if (source.ApproverOption != null) {
            this.ApproverOption = new CommonApproverOption(source.ApproverOption);
        }
        if (source.SignComponents != null) {
            this.SignComponents = new Component[source.SignComponents.length];
            for (int i = 0; i < source.SignComponents.length; i++) {
                this.SignComponents[i] = new Component(source.SignComponents[i]);
            }
        }
        if (source.ApproverVerifyTypes != null) {
            this.ApproverVerifyTypes = new Long[source.ApproverVerifyTypes.length];
            for (int i = 0; i < source.ApproverVerifyTypes.length; i++) {
                this.ApproverVerifyTypes[i] = new Long(source.ApproverVerifyTypes[i]);
            }
        }
        if (source.ApproverSignTypes != null) {
            this.ApproverSignTypes = new Long[source.ApproverSignTypes.length];
            for (int i = 0; i < source.ApproverSignTypes.length; i++) {
                this.ApproverSignTypes[i] = new Long(source.ApproverSignTypes[i]);
            }
        }
        if (source.ComponentLimitType != null) {
            this.ComponentLimitType = new String[source.ComponentLimitType.length];
            for (int i = 0; i < source.ComponentLimitType.length; i++) {
                this.ComponentLimitType[i] = new String(source.ComponentLimitType[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NotChannelOrganization", this.NotChannelOrganization);
        this.setParamSimple(map, prefix + "ApproverType", this.ApproverType);
        this.setParamSimple(map, prefix + "OrganizationId", this.OrganizationId);
        this.setParamSimple(map, prefix + "OrganizationOpenId", this.OrganizationOpenId);
        this.setParamSimple(map, prefix + "OrganizationName", this.OrganizationName);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);
        this.setParamSimple(map, prefix + "ApproverName", this.ApproverName);
        this.setParamSimple(map, prefix + "ApproverMobile", this.ApproverMobile);
        this.setParamSimple(map, prefix + "ApproverIdCardType", this.ApproverIdCardType);
        this.setParamSimple(map, prefix + "ApproverIdCardNumber", this.ApproverIdCardNumber);
        this.setParamSimple(map, prefix + "RecipientId", this.RecipientId);
        this.setParamSimple(map, prefix + "PreReadTime", this.PreReadTime);
        this.setParamSimple(map, prefix + "IsFullText", this.IsFullText);
        this.setParamSimple(map, prefix + "NotifyType", this.NotifyType);
        this.setParamObj(map, prefix + "ApproverOption.", this.ApproverOption);
        this.setParamArrayObj(map, prefix + "SignComponents.", this.SignComponents);
        this.setParamArraySimple(map, prefix + "ApproverVerifyTypes.", this.ApproverVerifyTypes);
        this.setParamArraySimple(map, prefix + "ApproverSignTypes.", this.ApproverSignTypes);
        this.setParamArraySimple(map, prefix + "ComponentLimitType.", this.ComponentLimitType);

    }
}

