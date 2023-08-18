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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApproverInfo extends AbstractModel{

    /**
    * 在指定签署方时，可选择企业B端或个人C端等不同的参与者类型，可选类型如下:
**0**：企业
**1**：个人
**3**：企业静默签署
注：`类型为3（企业静默签署）时，此接口会默认完成该签署方的签署。静默签署仅进行盖章操作，不能自动签名。`
**7**: 个人自动签署，适用于个人自动签场景。
注: `个人自动签场景为白名单功能，使用前请联系对接的客户经理沟通。`
    */
    @SerializedName("ApproverType")
    @Expose
    private Long ApproverType;

    /**
    * 签署方经办人的姓名。
经办人的姓名将用于身份认证和电子签名，请确保填写的姓名为签署方的真实姓名，而非昵称等代名。
    */
    @SerializedName("ApproverName")
    @Expose
    private String ApproverName;

    /**
    * 本企业的签署方经办人的员工UserId
可登录腾讯电子签控制台，在 "更多能力"->"组织管理" 中查看某位员工的UserId(在页面中展示为用户ID)。

注: `若传该字段，则签署方经办人的其他信息（如签署方经办人的姓名、证件号码、手机号码等）将被忽略。`
    */
    @SerializedName("ApproverMobile")
    @Expose
    private String ApproverMobile;

    /**
    * 组织机构名称。
如果签署方是企业签署方(approverType = 1 或者 approverType = 3)， 则企业名称必填。

注: `请确认该名称与企业营业执照中注册的名称一致 ; 如果名称中包含英文括号()，请使用中文括号（）代替。`
    */
    @SerializedName("OrganizationName")
    @Expose
    private String OrganizationName;

    /**
    * 合同中的签署控件列表，列表中可支持下列多种签署控件,控件的详细定义参考开发者中心的Component结构体
<ul><li> 个人签名/印章</li>
<li> 企业印章</li>
<li> 骑缝章等签署控件</li><ul>
    */
    @SerializedName("SignComponents")
    @Expose
    private Component [] SignComponents;

    /**
    * 签署方经办人的证件类型，支持以下类型
<ul><li>ID_CARD 居民身份证  (默认值)</li>
<li>HONGKONG_AND_MACAO 港澳居民来往内地通行证</li>
<li>HONGKONG_MACAO_AND_TAIWAN 港澳台居民居住证(格式同居民身份证)</li>
<li>OTHER_CARD_TYPE 其他证件</li></ul>

注: `其他证件类型为白名单功能，使用前请联系对接的客户经理沟通。`
    */
    @SerializedName("ApproverIdCardType")
    @Expose
    private String ApproverIdCardType;

    /**
    * 签署方经办人的证件号码，应符合以下规则
<ul><li>居民身份证号码应为18位字符串，由数字和大写字母X组成（如存在X，请大写）。</li>
<li>港澳居民来往内地通行证号码应为9位字符串，第1位为“C”，第2位为英文字母（但“I”、“O”除外），后7位为阿拉伯数字。</li>
<li>港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul>
    */
    @SerializedName("ApproverIdCardNumber")
    @Expose
    private String ApproverIdCardNumber;

    /**
    * 通知签署方经办人的方式,  有以下途径:
<ul><li>  **sms**  :  (默认)短信</li>
<li>   **none**   : 不通知</li></ul>
    */
    @SerializedName("NotifyType")
    @Expose
    private String NotifyType;

    /**
    * 收据场景设置签署人角色类型, 可以设置如下****类型****:
<ul><li> **1**  :收款人</li>
<li>   **2**   :开具人</li>
<li>   **3** :见证人</li></ul>
注: `收据场景为白名单功能，使用前请联系对接的客户经理沟通。`
    */
    @SerializedName("ApproverRole")
    @Expose
    private Long ApproverRole;

    /**
    * 签署意愿确认渠道，默认为WEIXINAPP:人脸识别

注: 将要废弃, 用ApproverSignTypes签署人签署合同时的认证方式代替, 新客户可请用ApproverSignTypes来设置
    */
    @SerializedName("VerifyChannel")
    @Expose
    private String [] VerifyChannel;

    /**
    * 签署方在签署合同之前，需要强制阅读合同的时长，可指定为3秒至300秒之间的任意值。

若未指定阅读时间，则会按照合同页数大小计算阅读时间，计算规则如下：
<ul><li>合同页数少于等于2页，阅读时间为3秒；</li>
<li>合同页数为3到5页，阅读时间为5秒；</li>
<li>合同页数大于等于6页，阅读时间为10秒。</li></ul>
    */
    @SerializedName("PreReadTime")
    @Expose
    private Long PreReadTime;

    /**
    * 签署人userId，仅支持本企业的员工userid， 可在控制台组织管理处获得

注: `若传此字段 则以userid的信息为主，会覆盖传递过来的签署人基本信息， 包括姓名，手机号，证件类型等信息`
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 在企微场景下使用，需设置参数为**WEWORKAPP**，以表明合同来源于企微。
    */
    @SerializedName("ApproverSource")
    @Expose
    private String ApproverSource;

    /**
    * 在企业微信场景下，表明该合同流程为或签，其最大长度为64位字符串。
所有参与或签的人员均需具备该标识。
注意，在合同中，不同的或签参与人必须保证其CustomApproverTag唯一。
如果或签签署人为本方企业微信参与人，则需要指定ApproverSource参数为WEWORKAPP。
    */
    @SerializedName("CustomApproverTag")
    @Expose
    private String CustomApproverTag;

    /**
    * 可以控制签署方在签署合同时能否进行某些操作，例如拒签、转交他人等。
详细操作可以参考开发者中心的ApproverOption结构体。
    */
    @SerializedName("ApproverOption")
    @Expose
    private ApproverOption ApproverOption;

    /**
    * 指定个人签署方查看合同的校验方式,可以传值如下:
<ul><li>  **1**   : （默认）人脸识别,人脸识别后才能合同内容</li>
<li>  **2**  : 手机号验证, 用户手机号和参与方手机号(ApproverMobile)相同即可查看合同内容</li></ul>
注: 
<ul><li>如果合同流程设置ApproverVerifyType查看合同的校验方式,    则忽略此签署人的查看合同的校验方式</li>
<li>此字段不可传多个校验方式</li></ul>
    */
    @SerializedName("ApproverVerifyTypes")
    @Expose
    private Long [] ApproverVerifyTypes;

    /**
    * 您可以指定签署方签署合同的认证校验方式，可传递以下值：
<ul><li>**1**：人脸认证，需进行人脸识别成功后才能签署合同；</li>
<li>**2**：签署密码，需输入与用户在腾讯电子签设置的密码一致才能校验成功进行合同签署；</li>
<li>**3**：运营商三要素，需到运营商处比对手机号实名信息（名字、手机号、证件号）校验一致才能成功进行合同签署。</li></ul>
注：
<ul><li>默认情况下，认证校验方式为人脸认证和签署密码两种形式；</li>
<li>您可以传递多种值，表示可用多种认证校验方式。</li></ul>
    */
    @SerializedName("ApproverSignTypes")
    @Expose
    private Long [] ApproverSignTypes;

    /**
    * 发起方企业的签署人进行签署操作前，是否需要企业内部走审批流程，取值如下：
<ul><li>**false**：（默认）不需要审批，直接签署。</li>
<li>**true**：需要走审批流程。当到对应参与人签署时，会阻塞其签署操作，等待企业内部审批完成。</li></ul>
企业可以通过CreateFlowSignReview审批接口通知腾讯电子签平台企业内部审批结果
<ul><li>如果企业通知腾讯电子签平台审核通过，签署方可继续签署动作。</li>
<li>如果企业通知腾讯电子签平台审核未通过，平台将继续阻塞签署方的签署动作，直到企业通知平台审核通过。</li></ul>

注：`此功能可用于与企业内部的审批流程进行关联，支持手动、静默签署合同`
    */
    @SerializedName("ApproverNeedSignReview")
    @Expose
    private Boolean ApproverNeedSignReview;

    /**
     * Get 在指定签署方时，可选择企业B端或个人C端等不同的参与者类型，可选类型如下:
**0**：企业
**1**：个人
**3**：企业静默签署
注：`类型为3（企业静默签署）时，此接口会默认完成该签署方的签署。静默签署仅进行盖章操作，不能自动签名。`
**7**: 个人自动签署，适用于个人自动签场景。
注: `个人自动签场景为白名单功能，使用前请联系对接的客户经理沟通。` 
     * @return ApproverType 在指定签署方时，可选择企业B端或个人C端等不同的参与者类型，可选类型如下:
**0**：企业
**1**：个人
**3**：企业静默签署
注：`类型为3（企业静默签署）时，此接口会默认完成该签署方的签署。静默签署仅进行盖章操作，不能自动签名。`
**7**: 个人自动签署，适用于个人自动签场景。
注: `个人自动签场景为白名单功能，使用前请联系对接的客户经理沟通。`
     */
    public Long getApproverType() {
        return this.ApproverType;
    }

    /**
     * Set 在指定签署方时，可选择企业B端或个人C端等不同的参与者类型，可选类型如下:
**0**：企业
**1**：个人
**3**：企业静默签署
注：`类型为3（企业静默签署）时，此接口会默认完成该签署方的签署。静默签署仅进行盖章操作，不能自动签名。`
**7**: 个人自动签署，适用于个人自动签场景。
注: `个人自动签场景为白名单功能，使用前请联系对接的客户经理沟通。`
     * @param ApproverType 在指定签署方时，可选择企业B端或个人C端等不同的参与者类型，可选类型如下:
**0**：企业
**1**：个人
**3**：企业静默签署
注：`类型为3（企业静默签署）时，此接口会默认完成该签署方的签署。静默签署仅进行盖章操作，不能自动签名。`
**7**: 个人自动签署，适用于个人自动签场景。
注: `个人自动签场景为白名单功能，使用前请联系对接的客户经理沟通。`
     */
    public void setApproverType(Long ApproverType) {
        this.ApproverType = ApproverType;
    }

    /**
     * Get 签署方经办人的姓名。
经办人的姓名将用于身份认证和电子签名，请确保填写的姓名为签署方的真实姓名，而非昵称等代名。 
     * @return ApproverName 签署方经办人的姓名。
经办人的姓名将用于身份认证和电子签名，请确保填写的姓名为签署方的真实姓名，而非昵称等代名。
     */
    public String getApproverName() {
        return this.ApproverName;
    }

    /**
     * Set 签署方经办人的姓名。
经办人的姓名将用于身份认证和电子签名，请确保填写的姓名为签署方的真实姓名，而非昵称等代名。
     * @param ApproverName 签署方经办人的姓名。
经办人的姓名将用于身份认证和电子签名，请确保填写的姓名为签署方的真实姓名，而非昵称等代名。
     */
    public void setApproverName(String ApproverName) {
        this.ApproverName = ApproverName;
    }

    /**
     * Get 本企业的签署方经办人的员工UserId
可登录腾讯电子签控制台，在 "更多能力"->"组织管理" 中查看某位员工的UserId(在页面中展示为用户ID)。

注: `若传该字段，则签署方经办人的其他信息（如签署方经办人的姓名、证件号码、手机号码等）将被忽略。` 
     * @return ApproverMobile 本企业的签署方经办人的员工UserId
可登录腾讯电子签控制台，在 "更多能力"->"组织管理" 中查看某位员工的UserId(在页面中展示为用户ID)。

注: `若传该字段，则签署方经办人的其他信息（如签署方经办人的姓名、证件号码、手机号码等）将被忽略。`
     */
    public String getApproverMobile() {
        return this.ApproverMobile;
    }

    /**
     * Set 本企业的签署方经办人的员工UserId
可登录腾讯电子签控制台，在 "更多能力"->"组织管理" 中查看某位员工的UserId(在页面中展示为用户ID)。

注: `若传该字段，则签署方经办人的其他信息（如签署方经办人的姓名、证件号码、手机号码等）将被忽略。`
     * @param ApproverMobile 本企业的签署方经办人的员工UserId
可登录腾讯电子签控制台，在 "更多能力"->"组织管理" 中查看某位员工的UserId(在页面中展示为用户ID)。

注: `若传该字段，则签署方经办人的其他信息（如签署方经办人的姓名、证件号码、手机号码等）将被忽略。`
     */
    public void setApproverMobile(String ApproverMobile) {
        this.ApproverMobile = ApproverMobile;
    }

    /**
     * Get 组织机构名称。
如果签署方是企业签署方(approverType = 1 或者 approverType = 3)， 则企业名称必填。

注: `请确认该名称与企业营业执照中注册的名称一致 ; 如果名称中包含英文括号()，请使用中文括号（）代替。` 
     * @return OrganizationName 组织机构名称。
如果签署方是企业签署方(approverType = 1 或者 approverType = 3)， 则企业名称必填。

注: `请确认该名称与企业营业执照中注册的名称一致 ; 如果名称中包含英文括号()，请使用中文括号（）代替。`
     */
    public String getOrganizationName() {
        return this.OrganizationName;
    }

    /**
     * Set 组织机构名称。
如果签署方是企业签署方(approverType = 1 或者 approverType = 3)， 则企业名称必填。

注: `请确认该名称与企业营业执照中注册的名称一致 ; 如果名称中包含英文括号()，请使用中文括号（）代替。`
     * @param OrganizationName 组织机构名称。
如果签署方是企业签署方(approverType = 1 或者 approverType = 3)， 则企业名称必填。

注: `请确认该名称与企业营业执照中注册的名称一致 ; 如果名称中包含英文括号()，请使用中文括号（）代替。`
     */
    public void setOrganizationName(String OrganizationName) {
        this.OrganizationName = OrganizationName;
    }

    /**
     * Get 合同中的签署控件列表，列表中可支持下列多种签署控件,控件的详细定义参考开发者中心的Component结构体
<ul><li> 个人签名/印章</li>
<li> 企业印章</li>
<li> 骑缝章等签署控件</li><ul> 
     * @return SignComponents 合同中的签署控件列表，列表中可支持下列多种签署控件,控件的详细定义参考开发者中心的Component结构体
<ul><li> 个人签名/印章</li>
<li> 企业印章</li>
<li> 骑缝章等签署控件</li><ul>
     */
    public Component [] getSignComponents() {
        return this.SignComponents;
    }

    /**
     * Set 合同中的签署控件列表，列表中可支持下列多种签署控件,控件的详细定义参考开发者中心的Component结构体
<ul><li> 个人签名/印章</li>
<li> 企业印章</li>
<li> 骑缝章等签署控件</li><ul>
     * @param SignComponents 合同中的签署控件列表，列表中可支持下列多种签署控件,控件的详细定义参考开发者中心的Component结构体
<ul><li> 个人签名/印章</li>
<li> 企业印章</li>
<li> 骑缝章等签署控件</li><ul>
     */
    public void setSignComponents(Component [] SignComponents) {
        this.SignComponents = SignComponents;
    }

    /**
     * Get 签署方经办人的证件类型，支持以下类型
<ul><li>ID_CARD 居民身份证  (默认值)</li>
<li>HONGKONG_AND_MACAO 港澳居民来往内地通行证</li>
<li>HONGKONG_MACAO_AND_TAIWAN 港澳台居民居住证(格式同居民身份证)</li>
<li>OTHER_CARD_TYPE 其他证件</li></ul>

注: `其他证件类型为白名单功能，使用前请联系对接的客户经理沟通。` 
     * @return ApproverIdCardType 签署方经办人的证件类型，支持以下类型
<ul><li>ID_CARD 居民身份证  (默认值)</li>
<li>HONGKONG_AND_MACAO 港澳居民来往内地通行证</li>
<li>HONGKONG_MACAO_AND_TAIWAN 港澳台居民居住证(格式同居民身份证)</li>
<li>OTHER_CARD_TYPE 其他证件</li></ul>

注: `其他证件类型为白名单功能，使用前请联系对接的客户经理沟通。`
     */
    public String getApproverIdCardType() {
        return this.ApproverIdCardType;
    }

    /**
     * Set 签署方经办人的证件类型，支持以下类型
<ul><li>ID_CARD 居民身份证  (默认值)</li>
<li>HONGKONG_AND_MACAO 港澳居民来往内地通行证</li>
<li>HONGKONG_MACAO_AND_TAIWAN 港澳台居民居住证(格式同居民身份证)</li>
<li>OTHER_CARD_TYPE 其他证件</li></ul>

注: `其他证件类型为白名单功能，使用前请联系对接的客户经理沟通。`
     * @param ApproverIdCardType 签署方经办人的证件类型，支持以下类型
<ul><li>ID_CARD 居民身份证  (默认值)</li>
<li>HONGKONG_AND_MACAO 港澳居民来往内地通行证</li>
<li>HONGKONG_MACAO_AND_TAIWAN 港澳台居民居住证(格式同居民身份证)</li>
<li>OTHER_CARD_TYPE 其他证件</li></ul>

注: `其他证件类型为白名单功能，使用前请联系对接的客户经理沟通。`
     */
    public void setApproverIdCardType(String ApproverIdCardType) {
        this.ApproverIdCardType = ApproverIdCardType;
    }

    /**
     * Get 签署方经办人的证件号码，应符合以下规则
<ul><li>居民身份证号码应为18位字符串，由数字和大写字母X组成（如存在X，请大写）。</li>
<li>港澳居民来往内地通行证号码应为9位字符串，第1位为“C”，第2位为英文字母（但“I”、“O”除外），后7位为阿拉伯数字。</li>
<li>港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul> 
     * @return ApproverIdCardNumber 签署方经办人的证件号码，应符合以下规则
<ul><li>居民身份证号码应为18位字符串，由数字和大写字母X组成（如存在X，请大写）。</li>
<li>港澳居民来往内地通行证号码应为9位字符串，第1位为“C”，第2位为英文字母（但“I”、“O”除外），后7位为阿拉伯数字。</li>
<li>港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul>
     */
    public String getApproverIdCardNumber() {
        return this.ApproverIdCardNumber;
    }

    /**
     * Set 签署方经办人的证件号码，应符合以下规则
<ul><li>居民身份证号码应为18位字符串，由数字和大写字母X组成（如存在X，请大写）。</li>
<li>港澳居民来往内地通行证号码应为9位字符串，第1位为“C”，第2位为英文字母（但“I”、“O”除外），后7位为阿拉伯数字。</li>
<li>港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul>
     * @param ApproverIdCardNumber 签署方经办人的证件号码，应符合以下规则
<ul><li>居民身份证号码应为18位字符串，由数字和大写字母X组成（如存在X，请大写）。</li>
<li>港澳居民来往内地通行证号码应为9位字符串，第1位为“C”，第2位为英文字母（但“I”、“O”除外），后7位为阿拉伯数字。</li>
<li>港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul>
     */
    public void setApproverIdCardNumber(String ApproverIdCardNumber) {
        this.ApproverIdCardNumber = ApproverIdCardNumber;
    }

    /**
     * Get 通知签署方经办人的方式,  有以下途径:
<ul><li>  **sms**  :  (默认)短信</li>
<li>   **none**   : 不通知</li></ul> 
     * @return NotifyType 通知签署方经办人的方式,  有以下途径:
<ul><li>  **sms**  :  (默认)短信</li>
<li>   **none**   : 不通知</li></ul>
     */
    public String getNotifyType() {
        return this.NotifyType;
    }

    /**
     * Set 通知签署方经办人的方式,  有以下途径:
<ul><li>  **sms**  :  (默认)短信</li>
<li>   **none**   : 不通知</li></ul>
     * @param NotifyType 通知签署方经办人的方式,  有以下途径:
<ul><li>  **sms**  :  (默认)短信</li>
<li>   **none**   : 不通知</li></ul>
     */
    public void setNotifyType(String NotifyType) {
        this.NotifyType = NotifyType;
    }

    /**
     * Get 收据场景设置签署人角色类型, 可以设置如下****类型****:
<ul><li> **1**  :收款人</li>
<li>   **2**   :开具人</li>
<li>   **3** :见证人</li></ul>
注: `收据场景为白名单功能，使用前请联系对接的客户经理沟通。` 
     * @return ApproverRole 收据场景设置签署人角色类型, 可以设置如下****类型****:
<ul><li> **1**  :收款人</li>
<li>   **2**   :开具人</li>
<li>   **3** :见证人</li></ul>
注: `收据场景为白名单功能，使用前请联系对接的客户经理沟通。`
     */
    public Long getApproverRole() {
        return this.ApproverRole;
    }

    /**
     * Set 收据场景设置签署人角色类型, 可以设置如下****类型****:
<ul><li> **1**  :收款人</li>
<li>   **2**   :开具人</li>
<li>   **3** :见证人</li></ul>
注: `收据场景为白名单功能，使用前请联系对接的客户经理沟通。`
     * @param ApproverRole 收据场景设置签署人角色类型, 可以设置如下****类型****:
<ul><li> **1**  :收款人</li>
<li>   **2**   :开具人</li>
<li>   **3** :见证人</li></ul>
注: `收据场景为白名单功能，使用前请联系对接的客户经理沟通。`
     */
    public void setApproverRole(Long ApproverRole) {
        this.ApproverRole = ApproverRole;
    }

    /**
     * Get 签署意愿确认渠道，默认为WEIXINAPP:人脸识别

注: 将要废弃, 用ApproverSignTypes签署人签署合同时的认证方式代替, 新客户可请用ApproverSignTypes来设置 
     * @return VerifyChannel 签署意愿确认渠道，默认为WEIXINAPP:人脸识别

注: 将要废弃, 用ApproverSignTypes签署人签署合同时的认证方式代替, 新客户可请用ApproverSignTypes来设置
     */
    public String [] getVerifyChannel() {
        return this.VerifyChannel;
    }

    /**
     * Set 签署意愿确认渠道，默认为WEIXINAPP:人脸识别

注: 将要废弃, 用ApproverSignTypes签署人签署合同时的认证方式代替, 新客户可请用ApproverSignTypes来设置
     * @param VerifyChannel 签署意愿确认渠道，默认为WEIXINAPP:人脸识别

注: 将要废弃, 用ApproverSignTypes签署人签署合同时的认证方式代替, 新客户可请用ApproverSignTypes来设置
     */
    public void setVerifyChannel(String [] VerifyChannel) {
        this.VerifyChannel = VerifyChannel;
    }

    /**
     * Get 签署方在签署合同之前，需要强制阅读合同的时长，可指定为3秒至300秒之间的任意值。

若未指定阅读时间，则会按照合同页数大小计算阅读时间，计算规则如下：
<ul><li>合同页数少于等于2页，阅读时间为3秒；</li>
<li>合同页数为3到5页，阅读时间为5秒；</li>
<li>合同页数大于等于6页，阅读时间为10秒。</li></ul> 
     * @return PreReadTime 签署方在签署合同之前，需要强制阅读合同的时长，可指定为3秒至300秒之间的任意值。

若未指定阅读时间，则会按照合同页数大小计算阅读时间，计算规则如下：
<ul><li>合同页数少于等于2页，阅读时间为3秒；</li>
<li>合同页数为3到5页，阅读时间为5秒；</li>
<li>合同页数大于等于6页，阅读时间为10秒。</li></ul>
     */
    public Long getPreReadTime() {
        return this.PreReadTime;
    }

    /**
     * Set 签署方在签署合同之前，需要强制阅读合同的时长，可指定为3秒至300秒之间的任意值。

若未指定阅读时间，则会按照合同页数大小计算阅读时间，计算规则如下：
<ul><li>合同页数少于等于2页，阅读时间为3秒；</li>
<li>合同页数为3到5页，阅读时间为5秒；</li>
<li>合同页数大于等于6页，阅读时间为10秒。</li></ul>
     * @param PreReadTime 签署方在签署合同之前，需要强制阅读合同的时长，可指定为3秒至300秒之间的任意值。

若未指定阅读时间，则会按照合同页数大小计算阅读时间，计算规则如下：
<ul><li>合同页数少于等于2页，阅读时间为3秒；</li>
<li>合同页数为3到5页，阅读时间为5秒；</li>
<li>合同页数大于等于6页，阅读时间为10秒。</li></ul>
     */
    public void setPreReadTime(Long PreReadTime) {
        this.PreReadTime = PreReadTime;
    }

    /**
     * Get 签署人userId，仅支持本企业的员工userid， 可在控制台组织管理处获得

注: `若传此字段 则以userid的信息为主，会覆盖传递过来的签署人基本信息， 包括姓名，手机号，证件类型等信息` 
     * @return UserId 签署人userId，仅支持本企业的员工userid， 可在控制台组织管理处获得

注: `若传此字段 则以userid的信息为主，会覆盖传递过来的签署人基本信息， 包括姓名，手机号，证件类型等信息`
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 签署人userId，仅支持本企业的员工userid， 可在控制台组织管理处获得

注: `若传此字段 则以userid的信息为主，会覆盖传递过来的签署人基本信息， 包括姓名，手机号，证件类型等信息`
     * @param UserId 签署人userId，仅支持本企业的员工userid， 可在控制台组织管理处获得

注: `若传此字段 则以userid的信息为主，会覆盖传递过来的签署人基本信息， 包括姓名，手机号，证件类型等信息`
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 在企微场景下使用，需设置参数为**WEWORKAPP**，以表明合同来源于企微。 
     * @return ApproverSource 在企微场景下使用，需设置参数为**WEWORKAPP**，以表明合同来源于企微。
     */
    public String getApproverSource() {
        return this.ApproverSource;
    }

    /**
     * Set 在企微场景下使用，需设置参数为**WEWORKAPP**，以表明合同来源于企微。
     * @param ApproverSource 在企微场景下使用，需设置参数为**WEWORKAPP**，以表明合同来源于企微。
     */
    public void setApproverSource(String ApproverSource) {
        this.ApproverSource = ApproverSource;
    }

    /**
     * Get 在企业微信场景下，表明该合同流程为或签，其最大长度为64位字符串。
所有参与或签的人员均需具备该标识。
注意，在合同中，不同的或签参与人必须保证其CustomApproverTag唯一。
如果或签签署人为本方企业微信参与人，则需要指定ApproverSource参数为WEWORKAPP。 
     * @return CustomApproverTag 在企业微信场景下，表明该合同流程为或签，其最大长度为64位字符串。
所有参与或签的人员均需具备该标识。
注意，在合同中，不同的或签参与人必须保证其CustomApproverTag唯一。
如果或签签署人为本方企业微信参与人，则需要指定ApproverSource参数为WEWORKAPP。
     */
    public String getCustomApproverTag() {
        return this.CustomApproverTag;
    }

    /**
     * Set 在企业微信场景下，表明该合同流程为或签，其最大长度为64位字符串。
所有参与或签的人员均需具备该标识。
注意，在合同中，不同的或签参与人必须保证其CustomApproverTag唯一。
如果或签签署人为本方企业微信参与人，则需要指定ApproverSource参数为WEWORKAPP。
     * @param CustomApproverTag 在企业微信场景下，表明该合同流程为或签，其最大长度为64位字符串。
所有参与或签的人员均需具备该标识。
注意，在合同中，不同的或签参与人必须保证其CustomApproverTag唯一。
如果或签签署人为本方企业微信参与人，则需要指定ApproverSource参数为WEWORKAPP。
     */
    public void setCustomApproverTag(String CustomApproverTag) {
        this.CustomApproverTag = CustomApproverTag;
    }

    /**
     * Get 可以控制签署方在签署合同时能否进行某些操作，例如拒签、转交他人等。
详细操作可以参考开发者中心的ApproverOption结构体。 
     * @return ApproverOption 可以控制签署方在签署合同时能否进行某些操作，例如拒签、转交他人等。
详细操作可以参考开发者中心的ApproverOption结构体。
     */
    public ApproverOption getApproverOption() {
        return this.ApproverOption;
    }

    /**
     * Set 可以控制签署方在签署合同时能否进行某些操作，例如拒签、转交他人等。
详细操作可以参考开发者中心的ApproverOption结构体。
     * @param ApproverOption 可以控制签署方在签署合同时能否进行某些操作，例如拒签、转交他人等。
详细操作可以参考开发者中心的ApproverOption结构体。
     */
    public void setApproverOption(ApproverOption ApproverOption) {
        this.ApproverOption = ApproverOption;
    }

    /**
     * Get 指定个人签署方查看合同的校验方式,可以传值如下:
<ul><li>  **1**   : （默认）人脸识别,人脸识别后才能合同内容</li>
<li>  **2**  : 手机号验证, 用户手机号和参与方手机号(ApproverMobile)相同即可查看合同内容</li></ul>
注: 
<ul><li>如果合同流程设置ApproverVerifyType查看合同的校验方式,    则忽略此签署人的查看合同的校验方式</li>
<li>此字段不可传多个校验方式</li></ul> 
     * @return ApproverVerifyTypes 指定个人签署方查看合同的校验方式,可以传值如下:
<ul><li>  **1**   : （默认）人脸识别,人脸识别后才能合同内容</li>
<li>  **2**  : 手机号验证, 用户手机号和参与方手机号(ApproverMobile)相同即可查看合同内容</li></ul>
注: 
<ul><li>如果合同流程设置ApproverVerifyType查看合同的校验方式,    则忽略此签署人的查看合同的校验方式</li>
<li>此字段不可传多个校验方式</li></ul>
     */
    public Long [] getApproverVerifyTypes() {
        return this.ApproverVerifyTypes;
    }

    /**
     * Set 指定个人签署方查看合同的校验方式,可以传值如下:
<ul><li>  **1**   : （默认）人脸识别,人脸识别后才能合同内容</li>
<li>  **2**  : 手机号验证, 用户手机号和参与方手机号(ApproverMobile)相同即可查看合同内容</li></ul>
注: 
<ul><li>如果合同流程设置ApproverVerifyType查看合同的校验方式,    则忽略此签署人的查看合同的校验方式</li>
<li>此字段不可传多个校验方式</li></ul>
     * @param ApproverVerifyTypes 指定个人签署方查看合同的校验方式,可以传值如下:
<ul><li>  **1**   : （默认）人脸识别,人脸识别后才能合同内容</li>
<li>  **2**  : 手机号验证, 用户手机号和参与方手机号(ApproverMobile)相同即可查看合同内容</li></ul>
注: 
<ul><li>如果合同流程设置ApproverVerifyType查看合同的校验方式,    则忽略此签署人的查看合同的校验方式</li>
<li>此字段不可传多个校验方式</li></ul>
     */
    public void setApproverVerifyTypes(Long [] ApproverVerifyTypes) {
        this.ApproverVerifyTypes = ApproverVerifyTypes;
    }

    /**
     * Get 您可以指定签署方签署合同的认证校验方式，可传递以下值：
<ul><li>**1**：人脸认证，需进行人脸识别成功后才能签署合同；</li>
<li>**2**：签署密码，需输入与用户在腾讯电子签设置的密码一致才能校验成功进行合同签署；</li>
<li>**3**：运营商三要素，需到运营商处比对手机号实名信息（名字、手机号、证件号）校验一致才能成功进行合同签署。</li></ul>
注：
<ul><li>默认情况下，认证校验方式为人脸认证和签署密码两种形式；</li>
<li>您可以传递多种值，表示可用多种认证校验方式。</li></ul> 
     * @return ApproverSignTypes 您可以指定签署方签署合同的认证校验方式，可传递以下值：
<ul><li>**1**：人脸认证，需进行人脸识别成功后才能签署合同；</li>
<li>**2**：签署密码，需输入与用户在腾讯电子签设置的密码一致才能校验成功进行合同签署；</li>
<li>**3**：运营商三要素，需到运营商处比对手机号实名信息（名字、手机号、证件号）校验一致才能成功进行合同签署。</li></ul>
注：
<ul><li>默认情况下，认证校验方式为人脸认证和签署密码两种形式；</li>
<li>您可以传递多种值，表示可用多种认证校验方式。</li></ul>
     */
    public Long [] getApproverSignTypes() {
        return this.ApproverSignTypes;
    }

    /**
     * Set 您可以指定签署方签署合同的认证校验方式，可传递以下值：
<ul><li>**1**：人脸认证，需进行人脸识别成功后才能签署合同；</li>
<li>**2**：签署密码，需输入与用户在腾讯电子签设置的密码一致才能校验成功进行合同签署；</li>
<li>**3**：运营商三要素，需到运营商处比对手机号实名信息（名字、手机号、证件号）校验一致才能成功进行合同签署。</li></ul>
注：
<ul><li>默认情况下，认证校验方式为人脸认证和签署密码两种形式；</li>
<li>您可以传递多种值，表示可用多种认证校验方式。</li></ul>
     * @param ApproverSignTypes 您可以指定签署方签署合同的认证校验方式，可传递以下值：
<ul><li>**1**：人脸认证，需进行人脸识别成功后才能签署合同；</li>
<li>**2**：签署密码，需输入与用户在腾讯电子签设置的密码一致才能校验成功进行合同签署；</li>
<li>**3**：运营商三要素，需到运营商处比对手机号实名信息（名字、手机号、证件号）校验一致才能成功进行合同签署。</li></ul>
注：
<ul><li>默认情况下，认证校验方式为人脸认证和签署密码两种形式；</li>
<li>您可以传递多种值，表示可用多种认证校验方式。</li></ul>
     */
    public void setApproverSignTypes(Long [] ApproverSignTypes) {
        this.ApproverSignTypes = ApproverSignTypes;
    }

    /**
     * Get 发起方企业的签署人进行签署操作前，是否需要企业内部走审批流程，取值如下：
<ul><li>**false**：（默认）不需要审批，直接签署。</li>
<li>**true**：需要走审批流程。当到对应参与人签署时，会阻塞其签署操作，等待企业内部审批完成。</li></ul>
企业可以通过CreateFlowSignReview审批接口通知腾讯电子签平台企业内部审批结果
<ul><li>如果企业通知腾讯电子签平台审核通过，签署方可继续签署动作。</li>
<li>如果企业通知腾讯电子签平台审核未通过，平台将继续阻塞签署方的签署动作，直到企业通知平台审核通过。</li></ul>

注：`此功能可用于与企业内部的审批流程进行关联，支持手动、静默签署合同` 
     * @return ApproverNeedSignReview 发起方企业的签署人进行签署操作前，是否需要企业内部走审批流程，取值如下：
<ul><li>**false**：（默认）不需要审批，直接签署。</li>
<li>**true**：需要走审批流程。当到对应参与人签署时，会阻塞其签署操作，等待企业内部审批完成。</li></ul>
企业可以通过CreateFlowSignReview审批接口通知腾讯电子签平台企业内部审批结果
<ul><li>如果企业通知腾讯电子签平台审核通过，签署方可继续签署动作。</li>
<li>如果企业通知腾讯电子签平台审核未通过，平台将继续阻塞签署方的签署动作，直到企业通知平台审核通过。</li></ul>

注：`此功能可用于与企业内部的审批流程进行关联，支持手动、静默签署合同`
     */
    public Boolean getApproverNeedSignReview() {
        return this.ApproverNeedSignReview;
    }

    /**
     * Set 发起方企业的签署人进行签署操作前，是否需要企业内部走审批流程，取值如下：
<ul><li>**false**：（默认）不需要审批，直接签署。</li>
<li>**true**：需要走审批流程。当到对应参与人签署时，会阻塞其签署操作，等待企业内部审批完成。</li></ul>
企业可以通过CreateFlowSignReview审批接口通知腾讯电子签平台企业内部审批结果
<ul><li>如果企业通知腾讯电子签平台审核通过，签署方可继续签署动作。</li>
<li>如果企业通知腾讯电子签平台审核未通过，平台将继续阻塞签署方的签署动作，直到企业通知平台审核通过。</li></ul>

注：`此功能可用于与企业内部的审批流程进行关联，支持手动、静默签署合同`
     * @param ApproverNeedSignReview 发起方企业的签署人进行签署操作前，是否需要企业内部走审批流程，取值如下：
<ul><li>**false**：（默认）不需要审批，直接签署。</li>
<li>**true**：需要走审批流程。当到对应参与人签署时，会阻塞其签署操作，等待企业内部审批完成。</li></ul>
企业可以通过CreateFlowSignReview审批接口通知腾讯电子签平台企业内部审批结果
<ul><li>如果企业通知腾讯电子签平台审核通过，签署方可继续签署动作。</li>
<li>如果企业通知腾讯电子签平台审核未通过，平台将继续阻塞签署方的签署动作，直到企业通知平台审核通过。</li></ul>

注：`此功能可用于与企业内部的审批流程进行关联，支持手动、静默签署合同`
     */
    public void setApproverNeedSignReview(Boolean ApproverNeedSignReview) {
        this.ApproverNeedSignReview = ApproverNeedSignReview;
    }

    public ApproverInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApproverInfo(ApproverInfo source) {
        if (source.ApproverType != null) {
            this.ApproverType = new Long(source.ApproverType);
        }
        if (source.ApproverName != null) {
            this.ApproverName = new String(source.ApproverName);
        }
        if (source.ApproverMobile != null) {
            this.ApproverMobile = new String(source.ApproverMobile);
        }
        if (source.OrganizationName != null) {
            this.OrganizationName = new String(source.OrganizationName);
        }
        if (source.SignComponents != null) {
            this.SignComponents = new Component[source.SignComponents.length];
            for (int i = 0; i < source.SignComponents.length; i++) {
                this.SignComponents[i] = new Component(source.SignComponents[i]);
            }
        }
        if (source.ApproverIdCardType != null) {
            this.ApproverIdCardType = new String(source.ApproverIdCardType);
        }
        if (source.ApproverIdCardNumber != null) {
            this.ApproverIdCardNumber = new String(source.ApproverIdCardNumber);
        }
        if (source.NotifyType != null) {
            this.NotifyType = new String(source.NotifyType);
        }
        if (source.ApproverRole != null) {
            this.ApproverRole = new Long(source.ApproverRole);
        }
        if (source.VerifyChannel != null) {
            this.VerifyChannel = new String[source.VerifyChannel.length];
            for (int i = 0; i < source.VerifyChannel.length; i++) {
                this.VerifyChannel[i] = new String(source.VerifyChannel[i]);
            }
        }
        if (source.PreReadTime != null) {
            this.PreReadTime = new Long(source.PreReadTime);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.ApproverSource != null) {
            this.ApproverSource = new String(source.ApproverSource);
        }
        if (source.CustomApproverTag != null) {
            this.CustomApproverTag = new String(source.CustomApproverTag);
        }
        if (source.ApproverOption != null) {
            this.ApproverOption = new ApproverOption(source.ApproverOption);
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
        if (source.ApproverNeedSignReview != null) {
            this.ApproverNeedSignReview = new Boolean(source.ApproverNeedSignReview);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApproverType", this.ApproverType);
        this.setParamSimple(map, prefix + "ApproverName", this.ApproverName);
        this.setParamSimple(map, prefix + "ApproverMobile", this.ApproverMobile);
        this.setParamSimple(map, prefix + "OrganizationName", this.OrganizationName);
        this.setParamArrayObj(map, prefix + "SignComponents.", this.SignComponents);
        this.setParamSimple(map, prefix + "ApproverIdCardType", this.ApproverIdCardType);
        this.setParamSimple(map, prefix + "ApproverIdCardNumber", this.ApproverIdCardNumber);
        this.setParamSimple(map, prefix + "NotifyType", this.NotifyType);
        this.setParamSimple(map, prefix + "ApproverRole", this.ApproverRole);
        this.setParamArraySimple(map, prefix + "VerifyChannel.", this.VerifyChannel);
        this.setParamSimple(map, prefix + "PreReadTime", this.PreReadTime);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "ApproverSource", this.ApproverSource);
        this.setParamSimple(map, prefix + "CustomApproverTag", this.CustomApproverTag);
        this.setParamObj(map, prefix + "ApproverOption.", this.ApproverOption);
        this.setParamArraySimple(map, prefix + "ApproverVerifyTypes.", this.ApproverVerifyTypes);
        this.setParamArraySimple(map, prefix + "ApproverSignTypes.", this.ApproverSignTypes);
        this.setParamSimple(map, prefix + "ApproverNeedSignReview", this.ApproverNeedSignReview);

    }
}

