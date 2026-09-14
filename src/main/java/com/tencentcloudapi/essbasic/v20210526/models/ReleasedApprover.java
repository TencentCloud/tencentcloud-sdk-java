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

public class ReleasedApprover extends AbstractModel {

    /**
    * <p>签署人在原合同签署人列表中的顺序序号(从0开始，按顺序依次递增)。<br>可以通过<a href="https://qian.tencent.com/developers/partnerApis/flows/DescribeFlowDetailInfo" target="_blank">DescribeFlowDetailInfo</a>接口查看原流程中的签署人列表。</p>
    */
    @SerializedName("ApproverNumber")
    @Expose
    private Long ApproverNumber;

    /**
    * <p>指定签署人类型，目前支持<ul><li> <strong>ORGANIZATION</strong>：企业(默认值)</li><li> <strong>ENTERPRISESERVER</strong>：企业“授权签”</li></ul></p>
    */
    @SerializedName("ApproverType")
    @Expose
    private String ApproverType;

    /**
    * <p><font color="red">【已废弃】</font>请用ApproverNumber来指定替换的参与方的位置</p>
    */
    @SerializedName("ReleasedApproverRecipientId")
    @Expose
    private String ReleasedApproverRecipientId;

    /**
    * <p>签署人姓名，最大长度50个字。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>签署方经办人的证件类型，支持以下类型</p><ul><li>ID_CARD : 中国大陆居民身份证(默认值)</li><li>HONGKONG_AND_MACAO : 中国港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN : 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul>
    */
    @SerializedName("IdCardType")
    @Expose
    private String IdCardType;

    /**
    * <p>证件号码，应符合以下规则</p><ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成(如存在X，请大写)。</li><li>中国港澳居民来往内地通行证号码共11位。第1位为字母，“H”字头签发给中国香港居民，“M”字头签发给中国澳门居民；第2位至第11位为数字。</li><li>中国港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul>
    */
    @SerializedName("IdCardNumber")
    @Expose
    private String IdCardNumber;

    /**
    * <p>签署人手机号。</p>
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * <p>组织机构名称。<br>请确认该名称与企业营业执照中注册的名称一致。<br>如果名称中包含英文括号()，请使用中文括号（）代替。<br>如果签署方是企业签署方(approverType = 0 或者 approverType = 3)， 则企业名称必填。</p>
    */
    @SerializedName("OrganizationName")
    @Expose
    private String OrganizationName;

    /**
    * <p>第三方平台子客企业的唯一标识，定义Agent中的ProxyOrganizationOpenId一样, 可以参考<a href="https://qian.tencent.com/developers/partnerApis/dataTypes/#agent" target="_blank">Agent结构体</a>。<br><font color="red">当为子客企业指定经办人时，此OrganizationOpenId必传。</font></p>
    */
    @SerializedName("OrganizationOpenId")
    @Expose
    private String OrganizationOpenId;

    /**
    * <p>第三方平台子客企业员工的唯一标识，长度不能超过64，只能由字母和数字组成。<br><font color="red">当签署方为同一第三方平台下的员工时，此OpenId必传。</font></p>
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * <p>签署控件类型，支持自定义企业签署方的签署控件类型</p><ul><li> **SIGN_SEAL**：默认为印章控件类型(默认值)</li><li> **SIGN_SIGNATURE**：手写签名控件类型</li></ul>
    */
    @SerializedName("ApproverSignComponentType")
    @Expose
    private String ApproverSignComponentType;

    /**
    * <p>参与方在合同中的角色是按照创建合同的时候来排序的，解除协议默认会将第一个参与人叫<code>甲方</code>,第二个叫<code>乙方</code>,  第三个叫<code>丙方</code>，以此类推。<br>如果需改动此参与人的角色名字，可用此字段指定，由汉字,英文字符,数字组成，最大20个字。</p><p><img src="https://qcloudimg.tencent-cloud.cn/raw/973a820ab66d1ce57082c160c2b2d44a.png" alt="image"></p>
    */
    @SerializedName("ApproverSignRole")
    @Expose
    private String ApproverSignRole;

    /**
    * <p>印章Id，签署控件类型为印章时，用于指定本企业签署方在解除协议中使用那个印章进行签署</p>
    */
    @SerializedName("ApproverSignSealId")
    @Expose
    private String ApproverSignSealId;

    /**
     * Get <p>签署人在原合同签署人列表中的顺序序号(从0开始，按顺序依次递增)。<br>可以通过<a href="https://qian.tencent.com/developers/partnerApis/flows/DescribeFlowDetailInfo" target="_blank">DescribeFlowDetailInfo</a>接口查看原流程中的签署人列表。</p> 
     * @return ApproverNumber <p>签署人在原合同签署人列表中的顺序序号(从0开始，按顺序依次递增)。<br>可以通过<a href="https://qian.tencent.com/developers/partnerApis/flows/DescribeFlowDetailInfo" target="_blank">DescribeFlowDetailInfo</a>接口查看原流程中的签署人列表。</p>
     */
    public Long getApproverNumber() {
        return this.ApproverNumber;
    }

    /**
     * Set <p>签署人在原合同签署人列表中的顺序序号(从0开始，按顺序依次递增)。<br>可以通过<a href="https://qian.tencent.com/developers/partnerApis/flows/DescribeFlowDetailInfo" target="_blank">DescribeFlowDetailInfo</a>接口查看原流程中的签署人列表。</p>
     * @param ApproverNumber <p>签署人在原合同签署人列表中的顺序序号(从0开始，按顺序依次递增)。<br>可以通过<a href="https://qian.tencent.com/developers/partnerApis/flows/DescribeFlowDetailInfo" target="_blank">DescribeFlowDetailInfo</a>接口查看原流程中的签署人列表。</p>
     */
    public void setApproverNumber(Long ApproverNumber) {
        this.ApproverNumber = ApproverNumber;
    }

    /**
     * Get <p>指定签署人类型，目前支持<ul><li> <strong>ORGANIZATION</strong>：企业(默认值)</li><li> <strong>ENTERPRISESERVER</strong>：企业“授权签”</li></ul></p> 
     * @return ApproverType <p>指定签署人类型，目前支持<ul><li> <strong>ORGANIZATION</strong>：企业(默认值)</li><li> <strong>ENTERPRISESERVER</strong>：企业“授权签”</li></ul></p>
     */
    public String getApproverType() {
        return this.ApproverType;
    }

    /**
     * Set <p>指定签署人类型，目前支持<ul><li> <strong>ORGANIZATION</strong>：企业(默认值)</li><li> <strong>ENTERPRISESERVER</strong>：企业“授权签”</li></ul></p>
     * @param ApproverType <p>指定签署人类型，目前支持<ul><li> <strong>ORGANIZATION</strong>：企业(默认值)</li><li> <strong>ENTERPRISESERVER</strong>：企业“授权签”</li></ul></p>
     */
    public void setApproverType(String ApproverType) {
        this.ApproverType = ApproverType;
    }

    /**
     * Get <p><font color="red">【已废弃】</font>请用ApproverNumber来指定替换的参与方的位置</p> 
     * @return ReleasedApproverRecipientId <p><font color="red">【已废弃】</font>请用ApproverNumber来指定替换的参与方的位置</p>
     */
    public String getReleasedApproverRecipientId() {
        return this.ReleasedApproverRecipientId;
    }

    /**
     * Set <p><font color="red">【已废弃】</font>请用ApproverNumber来指定替换的参与方的位置</p>
     * @param ReleasedApproverRecipientId <p><font color="red">【已废弃】</font>请用ApproverNumber来指定替换的参与方的位置</p>
     */
    public void setReleasedApproverRecipientId(String ReleasedApproverRecipientId) {
        this.ReleasedApproverRecipientId = ReleasedApproverRecipientId;
    }

    /**
     * Get <p>签署人姓名，最大长度50个字。</p> 
     * @return Name <p>签署人姓名，最大长度50个字。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>签署人姓名，最大长度50个字。</p>
     * @param Name <p>签署人姓名，最大长度50个字。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>签署方经办人的证件类型，支持以下类型</p><ul><li>ID_CARD : 中国大陆居民身份证(默认值)</li><li>HONGKONG_AND_MACAO : 中国港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN : 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul> 
     * @return IdCardType <p>签署方经办人的证件类型，支持以下类型</p><ul><li>ID_CARD : 中国大陆居民身份证(默认值)</li><li>HONGKONG_AND_MACAO : 中国港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN : 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul>
     */
    public String getIdCardType() {
        return this.IdCardType;
    }

    /**
     * Set <p>签署方经办人的证件类型，支持以下类型</p><ul><li>ID_CARD : 中国大陆居民身份证(默认值)</li><li>HONGKONG_AND_MACAO : 中国港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN : 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul>
     * @param IdCardType <p>签署方经办人的证件类型，支持以下类型</p><ul><li>ID_CARD : 中国大陆居民身份证(默认值)</li><li>HONGKONG_AND_MACAO : 中国港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN : 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul>
     */
    public void setIdCardType(String IdCardType) {
        this.IdCardType = IdCardType;
    }

    /**
     * Get <p>证件号码，应符合以下规则</p><ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成(如存在X，请大写)。</li><li>中国港澳居民来往内地通行证号码共11位。第1位为字母，“H”字头签发给中国香港居民，“M”字头签发给中国澳门居民；第2位至第11位为数字。</li><li>中国港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul> 
     * @return IdCardNumber <p>证件号码，应符合以下规则</p><ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成(如存在X，请大写)。</li><li>中国港澳居民来往内地通行证号码共11位。第1位为字母，“H”字头签发给中国香港居民，“M”字头签发给中国澳门居民；第2位至第11位为数字。</li><li>中国港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul>
     */
    public String getIdCardNumber() {
        return this.IdCardNumber;
    }

    /**
     * Set <p>证件号码，应符合以下规则</p><ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成(如存在X，请大写)。</li><li>中国港澳居民来往内地通行证号码共11位。第1位为字母，“H”字头签发给中国香港居民，“M”字头签发给中国澳门居民；第2位至第11位为数字。</li><li>中国港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul>
     * @param IdCardNumber <p>证件号码，应符合以下规则</p><ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成(如存在X，请大写)。</li><li>中国港澳居民来往内地通行证号码共11位。第1位为字母，“H”字头签发给中国香港居民，“M”字头签发给中国澳门居民；第2位至第11位为数字。</li><li>中国港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul>
     */
    public void setIdCardNumber(String IdCardNumber) {
        this.IdCardNumber = IdCardNumber;
    }

    /**
     * Get <p>签署人手机号。</p> 
     * @return Mobile <p>签署人手机号。</p>
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set <p>签署人手机号。</p>
     * @param Mobile <p>签署人手机号。</p>
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get <p>组织机构名称。<br>请确认该名称与企业营业执照中注册的名称一致。<br>如果名称中包含英文括号()，请使用中文括号（）代替。<br>如果签署方是企业签署方(approverType = 0 或者 approverType = 3)， 则企业名称必填。</p> 
     * @return OrganizationName <p>组织机构名称。<br>请确认该名称与企业营业执照中注册的名称一致。<br>如果名称中包含英文括号()，请使用中文括号（）代替。<br>如果签署方是企业签署方(approverType = 0 或者 approverType = 3)， 则企业名称必填。</p>
     */
    public String getOrganizationName() {
        return this.OrganizationName;
    }

    /**
     * Set <p>组织机构名称。<br>请确认该名称与企业营业执照中注册的名称一致。<br>如果名称中包含英文括号()，请使用中文括号（）代替。<br>如果签署方是企业签署方(approverType = 0 或者 approverType = 3)， 则企业名称必填。</p>
     * @param OrganizationName <p>组织机构名称。<br>请确认该名称与企业营业执照中注册的名称一致。<br>如果名称中包含英文括号()，请使用中文括号（）代替。<br>如果签署方是企业签署方(approverType = 0 或者 approverType = 3)， 则企业名称必填。</p>
     */
    public void setOrganizationName(String OrganizationName) {
        this.OrganizationName = OrganizationName;
    }

    /**
     * Get <p>第三方平台子客企业的唯一标识，定义Agent中的ProxyOrganizationOpenId一样, 可以参考<a href="https://qian.tencent.com/developers/partnerApis/dataTypes/#agent" target="_blank">Agent结构体</a>。<br><font color="red">当为子客企业指定经办人时，此OrganizationOpenId必传。</font></p> 
     * @return OrganizationOpenId <p>第三方平台子客企业的唯一标识，定义Agent中的ProxyOrganizationOpenId一样, 可以参考<a href="https://qian.tencent.com/developers/partnerApis/dataTypes/#agent" target="_blank">Agent结构体</a>。<br><font color="red">当为子客企业指定经办人时，此OrganizationOpenId必传。</font></p>
     */
    public String getOrganizationOpenId() {
        return this.OrganizationOpenId;
    }

    /**
     * Set <p>第三方平台子客企业的唯一标识，定义Agent中的ProxyOrganizationOpenId一样, 可以参考<a href="https://qian.tencent.com/developers/partnerApis/dataTypes/#agent" target="_blank">Agent结构体</a>。<br><font color="red">当为子客企业指定经办人时，此OrganizationOpenId必传。</font></p>
     * @param OrganizationOpenId <p>第三方平台子客企业的唯一标识，定义Agent中的ProxyOrganizationOpenId一样, 可以参考<a href="https://qian.tencent.com/developers/partnerApis/dataTypes/#agent" target="_blank">Agent结构体</a>。<br><font color="red">当为子客企业指定经办人时，此OrganizationOpenId必传。</font></p>
     */
    public void setOrganizationOpenId(String OrganizationOpenId) {
        this.OrganizationOpenId = OrganizationOpenId;
    }

    /**
     * Get <p>第三方平台子客企业员工的唯一标识，长度不能超过64，只能由字母和数字组成。<br><font color="red">当签署方为同一第三方平台下的员工时，此OpenId必传。</font></p> 
     * @return OpenId <p>第三方平台子客企业员工的唯一标识，长度不能超过64，只能由字母和数字组成。<br><font color="red">当签署方为同一第三方平台下的员工时，此OpenId必传。</font></p>
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set <p>第三方平台子客企业员工的唯一标识，长度不能超过64，只能由字母和数字组成。<br><font color="red">当签署方为同一第三方平台下的员工时，此OpenId必传。</font></p>
     * @param OpenId <p>第三方平台子客企业员工的唯一标识，长度不能超过64，只能由字母和数字组成。<br><font color="red">当签署方为同一第三方平台下的员工时，此OpenId必传。</font></p>
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * Get <p>签署控件类型，支持自定义企业签署方的签署控件类型</p><ul><li> **SIGN_SEAL**：默认为印章控件类型(默认值)</li><li> **SIGN_SIGNATURE**：手写签名控件类型</li></ul> 
     * @return ApproverSignComponentType <p>签署控件类型，支持自定义企业签署方的签署控件类型</p><ul><li> **SIGN_SEAL**：默认为印章控件类型(默认值)</li><li> **SIGN_SIGNATURE**：手写签名控件类型</li></ul>
     */
    public String getApproverSignComponentType() {
        return this.ApproverSignComponentType;
    }

    /**
     * Set <p>签署控件类型，支持自定义企业签署方的签署控件类型</p><ul><li> **SIGN_SEAL**：默认为印章控件类型(默认值)</li><li> **SIGN_SIGNATURE**：手写签名控件类型</li></ul>
     * @param ApproverSignComponentType <p>签署控件类型，支持自定义企业签署方的签署控件类型</p><ul><li> **SIGN_SEAL**：默认为印章控件类型(默认值)</li><li> **SIGN_SIGNATURE**：手写签名控件类型</li></ul>
     */
    public void setApproverSignComponentType(String ApproverSignComponentType) {
        this.ApproverSignComponentType = ApproverSignComponentType;
    }

    /**
     * Get <p>参与方在合同中的角色是按照创建合同的时候来排序的，解除协议默认会将第一个参与人叫<code>甲方</code>,第二个叫<code>乙方</code>,  第三个叫<code>丙方</code>，以此类推。<br>如果需改动此参与人的角色名字，可用此字段指定，由汉字,英文字符,数字组成，最大20个字。</p><p><img src="https://qcloudimg.tencent-cloud.cn/raw/973a820ab66d1ce57082c160c2b2d44a.png" alt="image"></p> 
     * @return ApproverSignRole <p>参与方在合同中的角色是按照创建合同的时候来排序的，解除协议默认会将第一个参与人叫<code>甲方</code>,第二个叫<code>乙方</code>,  第三个叫<code>丙方</code>，以此类推。<br>如果需改动此参与人的角色名字，可用此字段指定，由汉字,英文字符,数字组成，最大20个字。</p><p><img src="https://qcloudimg.tencent-cloud.cn/raw/973a820ab66d1ce57082c160c2b2d44a.png" alt="image"></p>
     */
    public String getApproverSignRole() {
        return this.ApproverSignRole;
    }

    /**
     * Set <p>参与方在合同中的角色是按照创建合同的时候来排序的，解除协议默认会将第一个参与人叫<code>甲方</code>,第二个叫<code>乙方</code>,  第三个叫<code>丙方</code>，以此类推。<br>如果需改动此参与人的角色名字，可用此字段指定，由汉字,英文字符,数字组成，最大20个字。</p><p><img src="https://qcloudimg.tencent-cloud.cn/raw/973a820ab66d1ce57082c160c2b2d44a.png" alt="image"></p>
     * @param ApproverSignRole <p>参与方在合同中的角色是按照创建合同的时候来排序的，解除协议默认会将第一个参与人叫<code>甲方</code>,第二个叫<code>乙方</code>,  第三个叫<code>丙方</code>，以此类推。<br>如果需改动此参与人的角色名字，可用此字段指定，由汉字,英文字符,数字组成，最大20个字。</p><p><img src="https://qcloudimg.tencent-cloud.cn/raw/973a820ab66d1ce57082c160c2b2d44a.png" alt="image"></p>
     */
    public void setApproverSignRole(String ApproverSignRole) {
        this.ApproverSignRole = ApproverSignRole;
    }

    /**
     * Get <p>印章Id，签署控件类型为印章时，用于指定本企业签署方在解除协议中使用那个印章进行签署</p> 
     * @return ApproverSignSealId <p>印章Id，签署控件类型为印章时，用于指定本企业签署方在解除协议中使用那个印章进行签署</p>
     */
    public String getApproverSignSealId() {
        return this.ApproverSignSealId;
    }

    /**
     * Set <p>印章Id，签署控件类型为印章时，用于指定本企业签署方在解除协议中使用那个印章进行签署</p>
     * @param ApproverSignSealId <p>印章Id，签署控件类型为印章时，用于指定本企业签署方在解除协议中使用那个印章进行签署</p>
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

