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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSignUrlsRequest extends AbstractModel {

    /**
    * 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。

此接口下面信息必填。
<ul>
<li>渠道应用标识:  Agent.AppId</li>
<li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li>
<li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li>
</ul>
第三方平台子客企业和员工必须已经过实名认证
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 合同流程ID数组，最多支持100个。
注: `该参数和合同组编号必须二选一`
    */
    @SerializedName("FlowIds")
    @Expose
    private String [] FlowIds;

    /**
    * 合同组编号
注：`该参数和合同流程ID数组必须二选一`
    */
    @SerializedName("FlowGroupId")
    @Expose
    private String FlowGroupId;

    /**
    * 签署链接类型,可以设置的参数如下
<ul><li> **WEIXINAPP** :(默认)跳转电子签小程序的http_url, 短信通知或者H5跳转适合此类型 ，此时返回短链</li>
<li> **CHANNEL** :带有H5引导页的跳转电子签小程序的链接</li>
<li> **APP** :第三方App或小程序跳转电子签小程序的path, App或者小程序跳转适合此类型</li>
<li> **LONGURL2WEIXINAPP** :跳转电子签小程序的链接, H5跳转适合此类型，此时返回长链</li></ul>

详细使用场景可以参数接口说明中的 **主要使用场景可以更加EndPoint分类如下**
    */
    @SerializedName("Endpoint")
    @Expose
    private String Endpoint;

    /**
    * 签署链接生成类型，可以选择的类型如下

<ul><li>**ALL**：(默认)全部签署方签署链接，此时不会给自动签署(静默签署)的签署方创建签署链接</li>
<li>**CHANNEL**：第三方子企业员工签署方</li>
<li>**NOT_CHANNEL**：SaaS平台企业员工签署方</li>
<li>**PERSON**：个人/自然人签署方</li>
<li>**FOLLOWER**：关注方，目前是合同抄送方</li>
<li>**RECIPIENT**：获取RecipientId对应的签署链接，可用于生成动态签署人补充链接</li></ul>
    */
    @SerializedName("GenerateType")
    @Expose
    private String GenerateType;

    /**
    * SaaS平台企业员工签署方的企业名称
如果名称中包含英文括号()，请使用中文括号（）代替。

注: `GenerateType为"NOT_CHANNEL"时必填`
    */
    @SerializedName("OrganizationName")
    @Expose
    private String OrganizationName;

    /**
    * 合同流程里边参与方的姓名。
注: `GenerateType为"PERSON"(即个人签署方)时必填`
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 合同流程里边签署方经办人手机号码， 支持国内手机号11位数字(无需加+86前缀或其他字符)。
注:  `GenerateType为"PERSON"或"FOLLOWER"时必填`
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * 证件类型，支持以下类型
<ul><li>ID_CARD : 居民身份证(默认值)</li>
<li>HONGKONG_AND_MACAO : 港澳居民来往内地通行证</li>
<li>HONGKONG_MACAO_AND_TAIWAN : 港澳台居民居住证(格式同居民身份证)</li></ul>
    */
    @SerializedName("IdCardType")
    @Expose
    private String IdCardType;

    /**
    * 证件号码，应符合以下规则
<ul><li>居民身份证号码应为18位字符串，由数字和大写字母X组成(如存在X，请大写)。</li>
<li>港澳居民来往内地通行证号码应为9位字符串，第1位为“C”，第2位为英文字母(但“I”、“O”除外)，后7位为阿拉伯数字。</li>
<li>港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul>
    */
    @SerializedName("IdCardNumber")
    @Expose
    private String IdCardNumber;

    /**
    * 第三方平台子客企业的企业的标识, 即OrganizationOpenId
注: `GenerateType为"CHANNEL"时必填`
    */
    @SerializedName("OrganizationOpenId")
    @Expose
    private String OrganizationOpenId;

    /**
    * 第三方平台子客企业员工的标识OpenId，GenerateType为"CHANNEL"时可用，指定到具体参与人, 仅展示已经实名的经办人信息
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * Endpoint为"APP" 类型的签署链接，可以设置此值；支持调用方小程序打开签署链接，在电子签小程序完成签署后自动回跳至调用方小程序
    */
    @SerializedName("AutoJumpBack")
    @Expose
    private Boolean AutoJumpBack;

    /**
    * 签署完之后的H5页面的跳转链接，针对Endpoint为CHANNEL时有效，最大长度1000个字符。
    */
    @SerializedName("JumpUrl")
    @Expose
    private String JumpUrl;

    /**
    * 暂未开放
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 生成的签署链接在签署页面隐藏的按钮列表，可设置如下：

<ul><li> **0** :合同签署页面更多操作按钮</li>
<li> **1** :合同签署页面更多操作的拒绝签署按钮</li>
<li> **2** :合同签署页面更多操作的转他人处理按钮</li>
<li> **3** :签署成功页的查看详情按钮</li></ul>

注:  `字段为数组, 可以传值隐藏多个按钮`
    */
    @SerializedName("Hides")
    @Expose
    private Long [] Hides;

    /**
    * 参与方角色ID，用于生成动态签署人链接完成领取。

注：`使用此参数需要与flow_ids数量一致并且一一对应, 表示在对应同序号的流程中的参与角色ID`，
    */
    @SerializedName("RecipientIds")
    @Expose
    private String [] RecipientIds;

    /**
     * Get 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。

此接口下面信息必填。
<ul>
<li>渠道应用标识:  Agent.AppId</li>
<li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li>
<li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li>
</ul>
第三方平台子客企业和员工必须已经过实名认证 
     * @return Agent 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。

此接口下面信息必填。
<ul>
<li>渠道应用标识:  Agent.AppId</li>
<li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li>
<li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li>
</ul>
第三方平台子客企业和员工必须已经过实名认证
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。

此接口下面信息必填。
<ul>
<li>渠道应用标识:  Agent.AppId</li>
<li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li>
<li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li>
</ul>
第三方平台子客企业和员工必须已经过实名认证
     * @param Agent 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。

此接口下面信息必填。
<ul>
<li>渠道应用标识:  Agent.AppId</li>
<li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li>
<li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li>
</ul>
第三方平台子客企业和员工必须已经过实名认证
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 合同流程ID数组，最多支持100个。
注: `该参数和合同组编号必须二选一` 
     * @return FlowIds 合同流程ID数组，最多支持100个。
注: `该参数和合同组编号必须二选一`
     */
    public String [] getFlowIds() {
        return this.FlowIds;
    }

    /**
     * Set 合同流程ID数组，最多支持100个。
注: `该参数和合同组编号必须二选一`
     * @param FlowIds 合同流程ID数组，最多支持100个。
注: `该参数和合同组编号必须二选一`
     */
    public void setFlowIds(String [] FlowIds) {
        this.FlowIds = FlowIds;
    }

    /**
     * Get 合同组编号
注：`该参数和合同流程ID数组必须二选一` 
     * @return FlowGroupId 合同组编号
注：`该参数和合同流程ID数组必须二选一`
     */
    public String getFlowGroupId() {
        return this.FlowGroupId;
    }

    /**
     * Set 合同组编号
注：`该参数和合同流程ID数组必须二选一`
     * @param FlowGroupId 合同组编号
注：`该参数和合同流程ID数组必须二选一`
     */
    public void setFlowGroupId(String FlowGroupId) {
        this.FlowGroupId = FlowGroupId;
    }

    /**
     * Get 签署链接类型,可以设置的参数如下
<ul><li> **WEIXINAPP** :(默认)跳转电子签小程序的http_url, 短信通知或者H5跳转适合此类型 ，此时返回短链</li>
<li> **CHANNEL** :带有H5引导页的跳转电子签小程序的链接</li>
<li> **APP** :第三方App或小程序跳转电子签小程序的path, App或者小程序跳转适合此类型</li>
<li> **LONGURL2WEIXINAPP** :跳转电子签小程序的链接, H5跳转适合此类型，此时返回长链</li></ul>

详细使用场景可以参数接口说明中的 **主要使用场景可以更加EndPoint分类如下** 
     * @return Endpoint 签署链接类型,可以设置的参数如下
<ul><li> **WEIXINAPP** :(默认)跳转电子签小程序的http_url, 短信通知或者H5跳转适合此类型 ，此时返回短链</li>
<li> **CHANNEL** :带有H5引导页的跳转电子签小程序的链接</li>
<li> **APP** :第三方App或小程序跳转电子签小程序的path, App或者小程序跳转适合此类型</li>
<li> **LONGURL2WEIXINAPP** :跳转电子签小程序的链接, H5跳转适合此类型，此时返回长链</li></ul>

详细使用场景可以参数接口说明中的 **主要使用场景可以更加EndPoint分类如下**
     */
    public String getEndpoint() {
        return this.Endpoint;
    }

    /**
     * Set 签署链接类型,可以设置的参数如下
<ul><li> **WEIXINAPP** :(默认)跳转电子签小程序的http_url, 短信通知或者H5跳转适合此类型 ，此时返回短链</li>
<li> **CHANNEL** :带有H5引导页的跳转电子签小程序的链接</li>
<li> **APP** :第三方App或小程序跳转电子签小程序的path, App或者小程序跳转适合此类型</li>
<li> **LONGURL2WEIXINAPP** :跳转电子签小程序的链接, H5跳转适合此类型，此时返回长链</li></ul>

详细使用场景可以参数接口说明中的 **主要使用场景可以更加EndPoint分类如下**
     * @param Endpoint 签署链接类型,可以设置的参数如下
<ul><li> **WEIXINAPP** :(默认)跳转电子签小程序的http_url, 短信通知或者H5跳转适合此类型 ，此时返回短链</li>
<li> **CHANNEL** :带有H5引导页的跳转电子签小程序的链接</li>
<li> **APP** :第三方App或小程序跳转电子签小程序的path, App或者小程序跳转适合此类型</li>
<li> **LONGURL2WEIXINAPP** :跳转电子签小程序的链接, H5跳转适合此类型，此时返回长链</li></ul>

详细使用场景可以参数接口说明中的 **主要使用场景可以更加EndPoint分类如下**
     */
    public void setEndpoint(String Endpoint) {
        this.Endpoint = Endpoint;
    }

    /**
     * Get 签署链接生成类型，可以选择的类型如下

<ul><li>**ALL**：(默认)全部签署方签署链接，此时不会给自动签署(静默签署)的签署方创建签署链接</li>
<li>**CHANNEL**：第三方子企业员工签署方</li>
<li>**NOT_CHANNEL**：SaaS平台企业员工签署方</li>
<li>**PERSON**：个人/自然人签署方</li>
<li>**FOLLOWER**：关注方，目前是合同抄送方</li>
<li>**RECIPIENT**：获取RecipientId对应的签署链接，可用于生成动态签署人补充链接</li></ul> 
     * @return GenerateType 签署链接生成类型，可以选择的类型如下

<ul><li>**ALL**：(默认)全部签署方签署链接，此时不会给自动签署(静默签署)的签署方创建签署链接</li>
<li>**CHANNEL**：第三方子企业员工签署方</li>
<li>**NOT_CHANNEL**：SaaS平台企业员工签署方</li>
<li>**PERSON**：个人/自然人签署方</li>
<li>**FOLLOWER**：关注方，目前是合同抄送方</li>
<li>**RECIPIENT**：获取RecipientId对应的签署链接，可用于生成动态签署人补充链接</li></ul>
     */
    public String getGenerateType() {
        return this.GenerateType;
    }

    /**
     * Set 签署链接生成类型，可以选择的类型如下

<ul><li>**ALL**：(默认)全部签署方签署链接，此时不会给自动签署(静默签署)的签署方创建签署链接</li>
<li>**CHANNEL**：第三方子企业员工签署方</li>
<li>**NOT_CHANNEL**：SaaS平台企业员工签署方</li>
<li>**PERSON**：个人/自然人签署方</li>
<li>**FOLLOWER**：关注方，目前是合同抄送方</li>
<li>**RECIPIENT**：获取RecipientId对应的签署链接，可用于生成动态签署人补充链接</li></ul>
     * @param GenerateType 签署链接生成类型，可以选择的类型如下

<ul><li>**ALL**：(默认)全部签署方签署链接，此时不会给自动签署(静默签署)的签署方创建签署链接</li>
<li>**CHANNEL**：第三方子企业员工签署方</li>
<li>**NOT_CHANNEL**：SaaS平台企业员工签署方</li>
<li>**PERSON**：个人/自然人签署方</li>
<li>**FOLLOWER**：关注方，目前是合同抄送方</li>
<li>**RECIPIENT**：获取RecipientId对应的签署链接，可用于生成动态签署人补充链接</li></ul>
     */
    public void setGenerateType(String GenerateType) {
        this.GenerateType = GenerateType;
    }

    /**
     * Get SaaS平台企业员工签署方的企业名称
如果名称中包含英文括号()，请使用中文括号（）代替。

注: `GenerateType为"NOT_CHANNEL"时必填` 
     * @return OrganizationName SaaS平台企业员工签署方的企业名称
如果名称中包含英文括号()，请使用中文括号（）代替。

注: `GenerateType为"NOT_CHANNEL"时必填`
     */
    public String getOrganizationName() {
        return this.OrganizationName;
    }

    /**
     * Set SaaS平台企业员工签署方的企业名称
如果名称中包含英文括号()，请使用中文括号（）代替。

注: `GenerateType为"NOT_CHANNEL"时必填`
     * @param OrganizationName SaaS平台企业员工签署方的企业名称
如果名称中包含英文括号()，请使用中文括号（）代替。

注: `GenerateType为"NOT_CHANNEL"时必填`
     */
    public void setOrganizationName(String OrganizationName) {
        this.OrganizationName = OrganizationName;
    }

    /**
     * Get 合同流程里边参与方的姓名。
注: `GenerateType为"PERSON"(即个人签署方)时必填` 
     * @return Name 合同流程里边参与方的姓名。
注: `GenerateType为"PERSON"(即个人签署方)时必填`
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 合同流程里边参与方的姓名。
注: `GenerateType为"PERSON"(即个人签署方)时必填`
     * @param Name 合同流程里边参与方的姓名。
注: `GenerateType为"PERSON"(即个人签署方)时必填`
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 合同流程里边签署方经办人手机号码， 支持国内手机号11位数字(无需加+86前缀或其他字符)。
注:  `GenerateType为"PERSON"或"FOLLOWER"时必填` 
     * @return Mobile 合同流程里边签署方经办人手机号码， 支持国内手机号11位数字(无需加+86前缀或其他字符)。
注:  `GenerateType为"PERSON"或"FOLLOWER"时必填`
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set 合同流程里边签署方经办人手机号码， 支持国内手机号11位数字(无需加+86前缀或其他字符)。
注:  `GenerateType为"PERSON"或"FOLLOWER"时必填`
     * @param Mobile 合同流程里边签署方经办人手机号码， 支持国内手机号11位数字(无需加+86前缀或其他字符)。
注:  `GenerateType为"PERSON"或"FOLLOWER"时必填`
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get 证件类型，支持以下类型
<ul><li>ID_CARD : 居民身份证(默认值)</li>
<li>HONGKONG_AND_MACAO : 港澳居民来往内地通行证</li>
<li>HONGKONG_MACAO_AND_TAIWAN : 港澳台居民居住证(格式同居民身份证)</li></ul> 
     * @return IdCardType 证件类型，支持以下类型
<ul><li>ID_CARD : 居民身份证(默认值)</li>
<li>HONGKONG_AND_MACAO : 港澳居民来往内地通行证</li>
<li>HONGKONG_MACAO_AND_TAIWAN : 港澳台居民居住证(格式同居民身份证)</li></ul>
     */
    public String getIdCardType() {
        return this.IdCardType;
    }

    /**
     * Set 证件类型，支持以下类型
<ul><li>ID_CARD : 居民身份证(默认值)</li>
<li>HONGKONG_AND_MACAO : 港澳居民来往内地通行证</li>
<li>HONGKONG_MACAO_AND_TAIWAN : 港澳台居民居住证(格式同居民身份证)</li></ul>
     * @param IdCardType 证件类型，支持以下类型
<ul><li>ID_CARD : 居民身份证(默认值)</li>
<li>HONGKONG_AND_MACAO : 港澳居民来往内地通行证</li>
<li>HONGKONG_MACAO_AND_TAIWAN : 港澳台居民居住证(格式同居民身份证)</li></ul>
     */
    public void setIdCardType(String IdCardType) {
        this.IdCardType = IdCardType;
    }

    /**
     * Get 证件号码，应符合以下规则
<ul><li>居民身份证号码应为18位字符串，由数字和大写字母X组成(如存在X，请大写)。</li>
<li>港澳居民来往内地通行证号码应为9位字符串，第1位为“C”，第2位为英文字母(但“I”、“O”除外)，后7位为阿拉伯数字。</li>
<li>港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul> 
     * @return IdCardNumber 证件号码，应符合以下规则
<ul><li>居民身份证号码应为18位字符串，由数字和大写字母X组成(如存在X，请大写)。</li>
<li>港澳居民来往内地通行证号码应为9位字符串，第1位为“C”，第2位为英文字母(但“I”、“O”除外)，后7位为阿拉伯数字。</li>
<li>港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul>
     */
    public String getIdCardNumber() {
        return this.IdCardNumber;
    }

    /**
     * Set 证件号码，应符合以下规则
<ul><li>居民身份证号码应为18位字符串，由数字和大写字母X组成(如存在X，请大写)。</li>
<li>港澳居民来往内地通行证号码应为9位字符串，第1位为“C”，第2位为英文字母(但“I”、“O”除外)，后7位为阿拉伯数字。</li>
<li>港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul>
     * @param IdCardNumber 证件号码，应符合以下规则
<ul><li>居民身份证号码应为18位字符串，由数字和大写字母X组成(如存在X，请大写)。</li>
<li>港澳居民来往内地通行证号码应为9位字符串，第1位为“C”，第2位为英文字母(但“I”、“O”除外)，后7位为阿拉伯数字。</li>
<li>港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul>
     */
    public void setIdCardNumber(String IdCardNumber) {
        this.IdCardNumber = IdCardNumber;
    }

    /**
     * Get 第三方平台子客企业的企业的标识, 即OrganizationOpenId
注: `GenerateType为"CHANNEL"时必填` 
     * @return OrganizationOpenId 第三方平台子客企业的企业的标识, 即OrganizationOpenId
注: `GenerateType为"CHANNEL"时必填`
     */
    public String getOrganizationOpenId() {
        return this.OrganizationOpenId;
    }

    /**
     * Set 第三方平台子客企业的企业的标识, 即OrganizationOpenId
注: `GenerateType为"CHANNEL"时必填`
     * @param OrganizationOpenId 第三方平台子客企业的企业的标识, 即OrganizationOpenId
注: `GenerateType为"CHANNEL"时必填`
     */
    public void setOrganizationOpenId(String OrganizationOpenId) {
        this.OrganizationOpenId = OrganizationOpenId;
    }

    /**
     * Get 第三方平台子客企业员工的标识OpenId，GenerateType为"CHANNEL"时可用，指定到具体参与人, 仅展示已经实名的经办人信息 
     * @return OpenId 第三方平台子客企业员工的标识OpenId，GenerateType为"CHANNEL"时可用，指定到具体参与人, 仅展示已经实名的经办人信息
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set 第三方平台子客企业员工的标识OpenId，GenerateType为"CHANNEL"时可用，指定到具体参与人, 仅展示已经实名的经办人信息
     * @param OpenId 第三方平台子客企业员工的标识OpenId，GenerateType为"CHANNEL"时可用，指定到具体参与人, 仅展示已经实名的经办人信息
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * Get Endpoint为"APP" 类型的签署链接，可以设置此值；支持调用方小程序打开签署链接，在电子签小程序完成签署后自动回跳至调用方小程序 
     * @return AutoJumpBack Endpoint为"APP" 类型的签署链接，可以设置此值；支持调用方小程序打开签署链接，在电子签小程序完成签署后自动回跳至调用方小程序
     */
    public Boolean getAutoJumpBack() {
        return this.AutoJumpBack;
    }

    /**
     * Set Endpoint为"APP" 类型的签署链接，可以设置此值；支持调用方小程序打开签署链接，在电子签小程序完成签署后自动回跳至调用方小程序
     * @param AutoJumpBack Endpoint为"APP" 类型的签署链接，可以设置此值；支持调用方小程序打开签署链接，在电子签小程序完成签署后自动回跳至调用方小程序
     */
    public void setAutoJumpBack(Boolean AutoJumpBack) {
        this.AutoJumpBack = AutoJumpBack;
    }

    /**
     * Get 签署完之后的H5页面的跳转链接，针对Endpoint为CHANNEL时有效，最大长度1000个字符。 
     * @return JumpUrl 签署完之后的H5页面的跳转链接，针对Endpoint为CHANNEL时有效，最大长度1000个字符。
     */
    public String getJumpUrl() {
        return this.JumpUrl;
    }

    /**
     * Set 签署完之后的H5页面的跳转链接，针对Endpoint为CHANNEL时有效，最大长度1000个字符。
     * @param JumpUrl 签署完之后的H5页面的跳转链接，针对Endpoint为CHANNEL时有效，最大长度1000个字符。
     */
    public void setJumpUrl(String JumpUrl) {
        this.JumpUrl = JumpUrl;
    }

    /**
     * Get 暂未开放 
     * @return Operator 暂未开放
     * @deprecated
     */
    @Deprecated
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 暂未开放
     * @param Operator 暂未开放
     * @deprecated
     */
    @Deprecated
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 生成的签署链接在签署页面隐藏的按钮列表，可设置如下：

<ul><li> **0** :合同签署页面更多操作按钮</li>
<li> **1** :合同签署页面更多操作的拒绝签署按钮</li>
<li> **2** :合同签署页面更多操作的转他人处理按钮</li>
<li> **3** :签署成功页的查看详情按钮</li></ul>

注:  `字段为数组, 可以传值隐藏多个按钮` 
     * @return Hides 生成的签署链接在签署页面隐藏的按钮列表，可设置如下：

<ul><li> **0** :合同签署页面更多操作按钮</li>
<li> **1** :合同签署页面更多操作的拒绝签署按钮</li>
<li> **2** :合同签署页面更多操作的转他人处理按钮</li>
<li> **3** :签署成功页的查看详情按钮</li></ul>

注:  `字段为数组, 可以传值隐藏多个按钮`
     */
    public Long [] getHides() {
        return this.Hides;
    }

    /**
     * Set 生成的签署链接在签署页面隐藏的按钮列表，可设置如下：

<ul><li> **0** :合同签署页面更多操作按钮</li>
<li> **1** :合同签署页面更多操作的拒绝签署按钮</li>
<li> **2** :合同签署页面更多操作的转他人处理按钮</li>
<li> **3** :签署成功页的查看详情按钮</li></ul>

注:  `字段为数组, 可以传值隐藏多个按钮`
     * @param Hides 生成的签署链接在签署页面隐藏的按钮列表，可设置如下：

<ul><li> **0** :合同签署页面更多操作按钮</li>
<li> **1** :合同签署页面更多操作的拒绝签署按钮</li>
<li> **2** :合同签署页面更多操作的转他人处理按钮</li>
<li> **3** :签署成功页的查看详情按钮</li></ul>

注:  `字段为数组, 可以传值隐藏多个按钮`
     */
    public void setHides(Long [] Hides) {
        this.Hides = Hides;
    }

    /**
     * Get 参与方角色ID，用于生成动态签署人链接完成领取。

注：`使用此参数需要与flow_ids数量一致并且一一对应, 表示在对应同序号的流程中的参与角色ID`， 
     * @return RecipientIds 参与方角色ID，用于生成动态签署人链接完成领取。

注：`使用此参数需要与flow_ids数量一致并且一一对应, 表示在对应同序号的流程中的参与角色ID`，
     */
    public String [] getRecipientIds() {
        return this.RecipientIds;
    }

    /**
     * Set 参与方角色ID，用于生成动态签署人链接完成领取。

注：`使用此参数需要与flow_ids数量一致并且一一对应, 表示在对应同序号的流程中的参与角色ID`，
     * @param RecipientIds 参与方角色ID，用于生成动态签署人链接完成领取。

注：`使用此参数需要与flow_ids数量一致并且一一对应, 表示在对应同序号的流程中的参与角色ID`，
     */
    public void setRecipientIds(String [] RecipientIds) {
        this.RecipientIds = RecipientIds;
    }

    public CreateSignUrlsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSignUrlsRequest(CreateSignUrlsRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.FlowIds != null) {
            this.FlowIds = new String[source.FlowIds.length];
            for (int i = 0; i < source.FlowIds.length; i++) {
                this.FlowIds[i] = new String(source.FlowIds[i]);
            }
        }
        if (source.FlowGroupId != null) {
            this.FlowGroupId = new String(source.FlowGroupId);
        }
        if (source.Endpoint != null) {
            this.Endpoint = new String(source.Endpoint);
        }
        if (source.GenerateType != null) {
            this.GenerateType = new String(source.GenerateType);
        }
        if (source.OrganizationName != null) {
            this.OrganizationName = new String(source.OrganizationName);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Mobile != null) {
            this.Mobile = new String(source.Mobile);
        }
        if (source.IdCardType != null) {
            this.IdCardType = new String(source.IdCardType);
        }
        if (source.IdCardNumber != null) {
            this.IdCardNumber = new String(source.IdCardNumber);
        }
        if (source.OrganizationOpenId != null) {
            this.OrganizationOpenId = new String(source.OrganizationOpenId);
        }
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
        }
        if (source.AutoJumpBack != null) {
            this.AutoJumpBack = new Boolean(source.AutoJumpBack);
        }
        if (source.JumpUrl != null) {
            this.JumpUrl = new String(source.JumpUrl);
        }
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.Hides != null) {
            this.Hides = new Long[source.Hides.length];
            for (int i = 0; i < source.Hides.length; i++) {
                this.Hides[i] = new Long(source.Hides[i]);
            }
        }
        if (source.RecipientIds != null) {
            this.RecipientIds = new String[source.RecipientIds.length];
            for (int i = 0; i < source.RecipientIds.length; i++) {
                this.RecipientIds[i] = new String(source.RecipientIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamArraySimple(map, prefix + "FlowIds.", this.FlowIds);
        this.setParamSimple(map, prefix + "FlowGroupId", this.FlowGroupId);
        this.setParamSimple(map, prefix + "Endpoint", this.Endpoint);
        this.setParamSimple(map, prefix + "GenerateType", this.GenerateType);
        this.setParamSimple(map, prefix + "OrganizationName", this.OrganizationName);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamSimple(map, prefix + "IdCardType", this.IdCardType);
        this.setParamSimple(map, prefix + "IdCardNumber", this.IdCardNumber);
        this.setParamSimple(map, prefix + "OrganizationOpenId", this.OrganizationOpenId);
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);
        this.setParamSimple(map, prefix + "AutoJumpBack", this.AutoJumpBack);
        this.setParamSimple(map, prefix + "JumpUrl", this.JumpUrl);
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamArraySimple(map, prefix + "Hides.", this.Hides);
        this.setParamArraySimple(map, prefix + "RecipientIds.", this.RecipientIds);

    }
}

