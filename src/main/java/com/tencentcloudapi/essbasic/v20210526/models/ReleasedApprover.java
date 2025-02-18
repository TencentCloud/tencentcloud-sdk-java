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

public class ReleasedApprover extends AbstractModel {

    /**
    * 签署人在原合同签署人列表中的顺序序号(从0开始，按顺序依次递增)。
可以通过<a href="https://qian.tencent.com/developers/partnerApis/flows/DescribeFlowDetailInfo" target="_blank">DescribeFlowDetailInfo</a>接口查看原流程中的签署人列表。
    */
    @SerializedName("ApproverNumber")
    @Expose
    private Long ApproverNumber;

    /**
    * 指定签署人类型，目前支持
<ul><li> **ORGANIZATION**：企业(默认值)</li>
<li> **ENTERPRISESERVER**：企业静默签</li></ul>
    */
    @SerializedName("ApproverType")
    @Expose
    private String ApproverType;

    /**
    * 签署人在原合同中的RecipientId，可以通过<a href="https://qian.tencent.com/developers/partnerApis/flows/DescribeFlowDetailInfo" target="_blank">DescribeFlowDetailInfo</a>接口查看原流程中的签署人信息，可参考返回结构体<a href="https://qian.tencent.com/developers/partnerApis/dataTypes/#flowapproverdetail" target="_blank">FlowApproverDetail</a>中的RecipientId。
**注意**：当指定了此参数后，ApproverNumber即失效，会以本参数作为原合同参与人的选取。与ApproverNumber二选一。
    */
    @SerializedName("ReleasedApproverRecipientId")
    @Expose
    private String ReleasedApproverRecipientId;

    /**
    * 签署人姓名，最大长度50个字。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 签署方经办人的证件类型，支持以下类型
<ul><li>ID_CARD : 中国大陆居民身份证(默认值)</li>
<li>HONGKONG_AND_MACAO : 中国港澳居民来往内地通行证</li>
<li>HONGKONG_MACAO_AND_TAIWAN : 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul>
    */
    @SerializedName("IdCardType")
    @Expose
    private String IdCardType;

    /**
    * 证件号码，应符合以下规则
<ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成(如存在X，请大写)。</li>
<li>中国港澳居民来往内地通行证号码共11位。第1位为字母，“H”字头签发给中国香港居民，“M”字头签发给中国澳门居民；第2位至第11位为数字。
</li>
<li>中国港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul>
    */
    @SerializedName("IdCardNumber")
    @Expose
    private String IdCardNumber;

    /**
    * 签署人手机号。
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * 组织机构名称。
请确认该名称与企业营业执照中注册的名称一致。
如果名称中包含英文括号()，请使用中文括号（）代替。
如果签署方是企业签署方(approverType = 0 或者 approverType = 3)， 则企业名称必填。
    */
    @SerializedName("OrganizationName")
    @Expose
    private String OrganizationName;

    /**
    * 第三方平台子客企业的唯一标识，定义Agent中的ProxyOrganizationOpenId一样, 可以参考<a href="https://qian.tencent.com/developers/partnerApis/dataTypes/#agent" target="_blank">Agent结构体</a>。
<font color="red">当为子客企业指定经办人时，此OrganizationOpenId必传。</font>
    */
    @SerializedName("OrganizationOpenId")
    @Expose
    private String OrganizationOpenId;

    /**
    * 第三方平台子客企业员工的唯一标识，长度不能超过64，只能由字母和数字组成。
<font color="red">当签署方为同一第三方平台下的员工时，此OpenId必传。</font>
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * 签署控件类型，支持自定义企业签署方的签署控件类型
<ul><li> **SIGN_SEAL**：默认为印章控件类型(默认值)</li>
<li> **SIGN_SIGNATURE**：手写签名控件类型</li></ul>
    */
    @SerializedName("ApproverSignComponentType")
    @Expose
    private String ApproverSignComponentType;

    /**
    * 参与方在合同中的角色是按照创建合同的时候来排序的，解除协议默认会将第一个参与人叫`甲方`,第二个叫`乙方`,  第三个叫`丙方`，以此类推。
如果需改动此参与人的角色名字，可用此字段指定，由汉字,英文字符,数字组成，最大20个字。

![image](https://qcloudimg.tencent-cloud.cn/raw/973a820ab66d1ce57082c160c2b2d44a.png)
    */
    @SerializedName("ApproverSignRole")
    @Expose
    private String ApproverSignRole;

    /**
    * 印章Id，签署控件类型为印章时，用于指定本企业签署方在解除协议中使用那个印章进行签署
    */
    @SerializedName("ApproverSignSealId")
    @Expose
    private String ApproverSignSealId;

    /**
     * Get 签署人在原合同签署人列表中的顺序序号(从0开始，按顺序依次递增)。
可以通过<a href="https://qian.tencent.com/developers/partnerApis/flows/DescribeFlowDetailInfo" target="_blank">DescribeFlowDetailInfo</a>接口查看原流程中的签署人列表。 
     * @return ApproverNumber 签署人在原合同签署人列表中的顺序序号(从0开始，按顺序依次递增)。
可以通过<a href="https://qian.tencent.com/developers/partnerApis/flows/DescribeFlowDetailInfo" target="_blank">DescribeFlowDetailInfo</a>接口查看原流程中的签署人列表。
     */
    public Long getApproverNumber() {
        return this.ApproverNumber;
    }

    /**
     * Set 签署人在原合同签署人列表中的顺序序号(从0开始，按顺序依次递增)。
可以通过<a href="https://qian.tencent.com/developers/partnerApis/flows/DescribeFlowDetailInfo" target="_blank">DescribeFlowDetailInfo</a>接口查看原流程中的签署人列表。
     * @param ApproverNumber 签署人在原合同签署人列表中的顺序序号(从0开始，按顺序依次递增)。
可以通过<a href="https://qian.tencent.com/developers/partnerApis/flows/DescribeFlowDetailInfo" target="_blank">DescribeFlowDetailInfo</a>接口查看原流程中的签署人列表。
     */
    public void setApproverNumber(Long ApproverNumber) {
        this.ApproverNumber = ApproverNumber;
    }

    /**
     * Get 指定签署人类型，目前支持
<ul><li> **ORGANIZATION**：企业(默认值)</li>
<li> **ENTERPRISESERVER**：企业静默签</li></ul> 
     * @return ApproverType 指定签署人类型，目前支持
<ul><li> **ORGANIZATION**：企业(默认值)</li>
<li> **ENTERPRISESERVER**：企业静默签</li></ul>
     */
    public String getApproverType() {
        return this.ApproverType;
    }

    /**
     * Set 指定签署人类型，目前支持
<ul><li> **ORGANIZATION**：企业(默认值)</li>
<li> **ENTERPRISESERVER**：企业静默签</li></ul>
     * @param ApproverType 指定签署人类型，目前支持
<ul><li> **ORGANIZATION**：企业(默认值)</li>
<li> **ENTERPRISESERVER**：企业静默签</li></ul>
     */
    public void setApproverType(String ApproverType) {
        this.ApproverType = ApproverType;
    }

    /**
     * Get 签署人在原合同中的RecipientId，可以通过<a href="https://qian.tencent.com/developers/partnerApis/flows/DescribeFlowDetailInfo" target="_blank">DescribeFlowDetailInfo</a>接口查看原流程中的签署人信息，可参考返回结构体<a href="https://qian.tencent.com/developers/partnerApis/dataTypes/#flowapproverdetail" target="_blank">FlowApproverDetail</a>中的RecipientId。
**注意**：当指定了此参数后，ApproverNumber即失效，会以本参数作为原合同参与人的选取。与ApproverNumber二选一。 
     * @return ReleasedApproverRecipientId 签署人在原合同中的RecipientId，可以通过<a href="https://qian.tencent.com/developers/partnerApis/flows/DescribeFlowDetailInfo" target="_blank">DescribeFlowDetailInfo</a>接口查看原流程中的签署人信息，可参考返回结构体<a href="https://qian.tencent.com/developers/partnerApis/dataTypes/#flowapproverdetail" target="_blank">FlowApproverDetail</a>中的RecipientId。
**注意**：当指定了此参数后，ApproverNumber即失效，会以本参数作为原合同参与人的选取。与ApproverNumber二选一。
     */
    public String getReleasedApproverRecipientId() {
        return this.ReleasedApproverRecipientId;
    }

    /**
     * Set 签署人在原合同中的RecipientId，可以通过<a href="https://qian.tencent.com/developers/partnerApis/flows/DescribeFlowDetailInfo" target="_blank">DescribeFlowDetailInfo</a>接口查看原流程中的签署人信息，可参考返回结构体<a href="https://qian.tencent.com/developers/partnerApis/dataTypes/#flowapproverdetail" target="_blank">FlowApproverDetail</a>中的RecipientId。
**注意**：当指定了此参数后，ApproverNumber即失效，会以本参数作为原合同参与人的选取。与ApproverNumber二选一。
     * @param ReleasedApproverRecipientId 签署人在原合同中的RecipientId，可以通过<a href="https://qian.tencent.com/developers/partnerApis/flows/DescribeFlowDetailInfo" target="_blank">DescribeFlowDetailInfo</a>接口查看原流程中的签署人信息，可参考返回结构体<a href="https://qian.tencent.com/developers/partnerApis/dataTypes/#flowapproverdetail" target="_blank">FlowApproverDetail</a>中的RecipientId。
**注意**：当指定了此参数后，ApproverNumber即失效，会以本参数作为原合同参与人的选取。与ApproverNumber二选一。
     */
    public void setReleasedApproverRecipientId(String ReleasedApproverRecipientId) {
        this.ReleasedApproverRecipientId = ReleasedApproverRecipientId;
    }

    /**
     * Get 签署人姓名，最大长度50个字。 
     * @return Name 签署人姓名，最大长度50个字。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 签署人姓名，最大长度50个字。
     * @param Name 签署人姓名，最大长度50个字。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 签署方经办人的证件类型，支持以下类型
<ul><li>ID_CARD : 中国大陆居民身份证(默认值)</li>
<li>HONGKONG_AND_MACAO : 中国港澳居民来往内地通行证</li>
<li>HONGKONG_MACAO_AND_TAIWAN : 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul> 
     * @return IdCardType 签署方经办人的证件类型，支持以下类型
<ul><li>ID_CARD : 中国大陆居民身份证(默认值)</li>
<li>HONGKONG_AND_MACAO : 中国港澳居民来往内地通行证</li>
<li>HONGKONG_MACAO_AND_TAIWAN : 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul>
     */
    public String getIdCardType() {
        return this.IdCardType;
    }

    /**
     * Set 签署方经办人的证件类型，支持以下类型
<ul><li>ID_CARD : 中国大陆居民身份证(默认值)</li>
<li>HONGKONG_AND_MACAO : 中国港澳居民来往内地通行证</li>
<li>HONGKONG_MACAO_AND_TAIWAN : 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul>
     * @param IdCardType 签署方经办人的证件类型，支持以下类型
<ul><li>ID_CARD : 中国大陆居民身份证(默认值)</li>
<li>HONGKONG_AND_MACAO : 中国港澳居民来往内地通行证</li>
<li>HONGKONG_MACAO_AND_TAIWAN : 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul>
     */
    public void setIdCardType(String IdCardType) {
        this.IdCardType = IdCardType;
    }

    /**
     * Get 证件号码，应符合以下规则
<ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成(如存在X，请大写)。</li>
<li>中国港澳居民来往内地通行证号码共11位。第1位为字母，“H”字头签发给中国香港居民，“M”字头签发给中国澳门居民；第2位至第11位为数字。
</li>
<li>中国港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul> 
     * @return IdCardNumber 证件号码，应符合以下规则
<ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成(如存在X，请大写)。</li>
<li>中国港澳居民来往内地通行证号码共11位。第1位为字母，“H”字头签发给中国香港居民，“M”字头签发给中国澳门居民；第2位至第11位为数字。
</li>
<li>中国港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul>
     */
    public String getIdCardNumber() {
        return this.IdCardNumber;
    }

    /**
     * Set 证件号码，应符合以下规则
<ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成(如存在X，请大写)。</li>
<li>中国港澳居民来往内地通行证号码共11位。第1位为字母，“H”字头签发给中国香港居民，“M”字头签发给中国澳门居民；第2位至第11位为数字。
</li>
<li>中国港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul>
     * @param IdCardNumber 证件号码，应符合以下规则
<ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成(如存在X，请大写)。</li>
<li>中国港澳居民来往内地通行证号码共11位。第1位为字母，“H”字头签发给中国香港居民，“M”字头签发给中国澳门居民；第2位至第11位为数字。
</li>
<li>中国港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul>
     */
    public void setIdCardNumber(String IdCardNumber) {
        this.IdCardNumber = IdCardNumber;
    }

    /**
     * Get 签署人手机号。 
     * @return Mobile 签署人手机号。
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set 签署人手机号。
     * @param Mobile 签署人手机号。
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get 组织机构名称。
请确认该名称与企业营业执照中注册的名称一致。
如果名称中包含英文括号()，请使用中文括号（）代替。
如果签署方是企业签署方(approverType = 0 或者 approverType = 3)， 则企业名称必填。 
     * @return OrganizationName 组织机构名称。
请确认该名称与企业营业执照中注册的名称一致。
如果名称中包含英文括号()，请使用中文括号（）代替。
如果签署方是企业签署方(approverType = 0 或者 approverType = 3)， 则企业名称必填。
     */
    public String getOrganizationName() {
        return this.OrganizationName;
    }

    /**
     * Set 组织机构名称。
请确认该名称与企业营业执照中注册的名称一致。
如果名称中包含英文括号()，请使用中文括号（）代替。
如果签署方是企业签署方(approverType = 0 或者 approverType = 3)， 则企业名称必填。
     * @param OrganizationName 组织机构名称。
请确认该名称与企业营业执照中注册的名称一致。
如果名称中包含英文括号()，请使用中文括号（）代替。
如果签署方是企业签署方(approverType = 0 或者 approverType = 3)， 则企业名称必填。
     */
    public void setOrganizationName(String OrganizationName) {
        this.OrganizationName = OrganizationName;
    }

    /**
     * Get 第三方平台子客企业的唯一标识，定义Agent中的ProxyOrganizationOpenId一样, 可以参考<a href="https://qian.tencent.com/developers/partnerApis/dataTypes/#agent" target="_blank">Agent结构体</a>。
<font color="red">当为子客企业指定经办人时，此OrganizationOpenId必传。</font> 
     * @return OrganizationOpenId 第三方平台子客企业的唯一标识，定义Agent中的ProxyOrganizationOpenId一样, 可以参考<a href="https://qian.tencent.com/developers/partnerApis/dataTypes/#agent" target="_blank">Agent结构体</a>。
<font color="red">当为子客企业指定经办人时，此OrganizationOpenId必传。</font>
     */
    public String getOrganizationOpenId() {
        return this.OrganizationOpenId;
    }

    /**
     * Set 第三方平台子客企业的唯一标识，定义Agent中的ProxyOrganizationOpenId一样, 可以参考<a href="https://qian.tencent.com/developers/partnerApis/dataTypes/#agent" target="_blank">Agent结构体</a>。
<font color="red">当为子客企业指定经办人时，此OrganizationOpenId必传。</font>
     * @param OrganizationOpenId 第三方平台子客企业的唯一标识，定义Agent中的ProxyOrganizationOpenId一样, 可以参考<a href="https://qian.tencent.com/developers/partnerApis/dataTypes/#agent" target="_blank">Agent结构体</a>。
<font color="red">当为子客企业指定经办人时，此OrganizationOpenId必传。</font>
     */
    public void setOrganizationOpenId(String OrganizationOpenId) {
        this.OrganizationOpenId = OrganizationOpenId;
    }

    /**
     * Get 第三方平台子客企业员工的唯一标识，长度不能超过64，只能由字母和数字组成。
<font color="red">当签署方为同一第三方平台下的员工时，此OpenId必传。</font> 
     * @return OpenId 第三方平台子客企业员工的唯一标识，长度不能超过64，只能由字母和数字组成。
<font color="red">当签署方为同一第三方平台下的员工时，此OpenId必传。</font>
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set 第三方平台子客企业员工的唯一标识，长度不能超过64，只能由字母和数字组成。
<font color="red">当签署方为同一第三方平台下的员工时，此OpenId必传。</font>
     * @param OpenId 第三方平台子客企业员工的唯一标识，长度不能超过64，只能由字母和数字组成。
<font color="red">当签署方为同一第三方平台下的员工时，此OpenId必传。</font>
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * Get 签署控件类型，支持自定义企业签署方的签署控件类型
<ul><li> **SIGN_SEAL**：默认为印章控件类型(默认值)</li>
<li> **SIGN_SIGNATURE**：手写签名控件类型</li></ul> 
     * @return ApproverSignComponentType 签署控件类型，支持自定义企业签署方的签署控件类型
<ul><li> **SIGN_SEAL**：默认为印章控件类型(默认值)</li>
<li> **SIGN_SIGNATURE**：手写签名控件类型</li></ul>
     */
    public String getApproverSignComponentType() {
        return this.ApproverSignComponentType;
    }

    /**
     * Set 签署控件类型，支持自定义企业签署方的签署控件类型
<ul><li> **SIGN_SEAL**：默认为印章控件类型(默认值)</li>
<li> **SIGN_SIGNATURE**：手写签名控件类型</li></ul>
     * @param ApproverSignComponentType 签署控件类型，支持自定义企业签署方的签署控件类型
<ul><li> **SIGN_SEAL**：默认为印章控件类型(默认值)</li>
<li> **SIGN_SIGNATURE**：手写签名控件类型</li></ul>
     */
    public void setApproverSignComponentType(String ApproverSignComponentType) {
        this.ApproverSignComponentType = ApproverSignComponentType;
    }

    /**
     * Get 参与方在合同中的角色是按照创建合同的时候来排序的，解除协议默认会将第一个参与人叫`甲方`,第二个叫`乙方`,  第三个叫`丙方`，以此类推。
如果需改动此参与人的角色名字，可用此字段指定，由汉字,英文字符,数字组成，最大20个字。

![image](https://qcloudimg.tencent-cloud.cn/raw/973a820ab66d1ce57082c160c2b2d44a.png) 
     * @return ApproverSignRole 参与方在合同中的角色是按照创建合同的时候来排序的，解除协议默认会将第一个参与人叫`甲方`,第二个叫`乙方`,  第三个叫`丙方`，以此类推。
如果需改动此参与人的角色名字，可用此字段指定，由汉字,英文字符,数字组成，最大20个字。

![image](https://qcloudimg.tencent-cloud.cn/raw/973a820ab66d1ce57082c160c2b2d44a.png)
     */
    public String getApproverSignRole() {
        return this.ApproverSignRole;
    }

    /**
     * Set 参与方在合同中的角色是按照创建合同的时候来排序的，解除协议默认会将第一个参与人叫`甲方`,第二个叫`乙方`,  第三个叫`丙方`，以此类推。
如果需改动此参与人的角色名字，可用此字段指定，由汉字,英文字符,数字组成，最大20个字。

![image](https://qcloudimg.tencent-cloud.cn/raw/973a820ab66d1ce57082c160c2b2d44a.png)
     * @param ApproverSignRole 参与方在合同中的角色是按照创建合同的时候来排序的，解除协议默认会将第一个参与人叫`甲方`,第二个叫`乙方`,  第三个叫`丙方`，以此类推。
如果需改动此参与人的角色名字，可用此字段指定，由汉字,英文字符,数字组成，最大20个字。

![image](https://qcloudimg.tencent-cloud.cn/raw/973a820ab66d1ce57082c160c2b2d44a.png)
     */
    public void setApproverSignRole(String ApproverSignRole) {
        this.ApproverSignRole = ApproverSignRole;
    }

    /**
     * Get 印章Id，签署控件类型为印章时，用于指定本企业签署方在解除协议中使用那个印章进行签署 
     * @return ApproverSignSealId 印章Id，签署控件类型为印章时，用于指定本企业签署方在解除协议中使用那个印章进行签署
     */
    public String getApproverSignSealId() {
        return this.ApproverSignSealId;
    }

    /**
     * Set 印章Id，签署控件类型为印章时，用于指定本企业签署方在解除协议中使用那个印章进行签署
     * @param ApproverSignSealId 印章Id，签署控件类型为印章时，用于指定本企业签署方在解除协议中使用那个印章进行签署
     */
    public void setApproverSignSealId(String ApproverSignSealId) {
        this.ApproverSignSealId = ApproverSignSealId;
    }

    public ReleasedApprover() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReleasedApprover(ReleasedApprover source) {
        if (source.ApproverNumber != null) {
            this.ApproverNumber = new Long(source.ApproverNumber);
        }
        if (source.ApproverType != null) {
            this.ApproverType = new String(source.ApproverType);
        }
        if (source.ReleasedApproverRecipientId != null) {
            this.ReleasedApproverRecipientId = new String(source.ReleasedApproverRecipientId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.IdCardType != null) {
            this.IdCardType = new String(source.IdCardType);
        }
        if (source.IdCardNumber != null) {
            this.IdCardNumber = new String(source.IdCardNumber);
        }
        if (source.Mobile != null) {
            this.Mobile = new String(source.Mobile);
        }
        if (source.OrganizationName != null) {
            this.OrganizationName = new String(source.OrganizationName);
        }
        if (source.OrganizationOpenId != null) {
            this.OrganizationOpenId = new String(source.OrganizationOpenId);
        }
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
        }
        if (source.ApproverSignComponentType != null) {
            this.ApproverSignComponentType = new String(source.ApproverSignComponentType);
        }
        if (source.ApproverSignRole != null) {
            this.ApproverSignRole = new String(source.ApproverSignRole);
        }
        if (source.ApproverSignSealId != null) {
            this.ApproverSignSealId = new String(source.ApproverSignSealId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApproverNumber", this.ApproverNumber);
        this.setParamSimple(map, prefix + "ApproverType", this.ApproverType);
        this.setParamSimple(map, prefix + "ReleasedApproverRecipientId", this.ReleasedApproverRecipientId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "IdCardType", this.IdCardType);
        this.setParamSimple(map, prefix + "IdCardNumber", this.IdCardNumber);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamSimple(map, prefix + "OrganizationName", this.OrganizationName);
        this.setParamSimple(map, prefix + "OrganizationOpenId", this.OrganizationOpenId);
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);
        this.setParamSimple(map, prefix + "ApproverSignComponentType", this.ApproverSignComponentType);
        this.setParamSimple(map, prefix + "ApproverSignRole", this.ApproverSignRole);
        this.setParamSimple(map, prefix + "ApproverSignSealId", this.ApproverSignSealId);

    }
}

