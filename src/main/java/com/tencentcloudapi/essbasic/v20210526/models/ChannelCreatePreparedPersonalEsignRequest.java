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

public class ChannelCreatePreparedPersonalEsignRequest extends AbstractModel {

    /**
    * <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p>
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * <p>个人用户姓名</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>证件号码, 应符合以下规则</p><ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成（如存在X，请大写）。</li><li>中国港澳居民来往内地通行证号码共11位。第1位为字母，“H”字头签发给中国香港居民，“M”字头签发给中国澳门居民；第2位至第11位为数字。</li><li>中国港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul>
    */
    @SerializedName("IdCardNumber")
    @Expose
    private String IdCardNumber;

    /**
    * <p>电子印章名字，1-50个中文字符<br>注:<code>同一企业下电子印章名字不能相同</code></p>
    */
    @SerializedName("SealName")
    @Expose
    private String SealName;

    /**
    * <p>电子印章图片base64编码，大小不超过10M（原始图片不超过5M），只支持PNG或JPG图片格式。</p>
    */
    @SerializedName("SealImage")
    @Expose
    private String SealImage;

    /**
    * <p>执行本接口操作的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * <p>证件类型，支持以下类型</p><ul><li>ID_CARD : 中国大陆居民身份证 (默认值)</li><li>HONGKONG_AND_MACAO : 中国港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN : 中国港澳台居民居住证(格式同中国大陆居民身份证)</li><li>OTHER_CARD_TYPE : 其他</li></ul><p>注: <code>其他证件类型为白名单功能，使用前请联系对接的客户经理沟通。</code></p>
    */
    @SerializedName("IdCardType")
    @Expose
    private String IdCardType;

    /**
    * <p>是否开启印章图片压缩处理，默认不开启，如需开启请设置为 true。当印章超过 2M 时建议开启，开启后图片的 hash 将发生变化。</p>
    */
    @SerializedName("SealImageCompress")
    @Expose
    private Boolean SealImageCompress;

    /**
    * <p>手机号码；当需要开通自动签时，该参数必传</p>
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * <p>该字段已不再使用</p>
    */
    @SerializedName("EnableAutoSign")
    @Expose
    private Boolean EnableAutoSign;

    /**
    * <p>设置用户开通自动签时是否绑定个人自动签账号许可。一旦绑定后，将扣减购买的个人自动签账号许可一次（1年有效期），不可解绑释放。不传默认为绑定自动签账号许可。 0-绑定个人自动签账号许可，开通后将扣减购买的个人自动签账号许可一次 1-不绑定，发起合同时将按标准合同套餐进行扣减</p>
    */
    @SerializedName("LicenseType")
    @Expose
    private Long LicenseType;

    /**
    * <ul><li> **E_PRESCRIPTION_AUTO_SIGN** :  电子处方场景</li><li> **OTHER** :  通用场景</li></ul>
    */
    @SerializedName("SceneKey")
    @Expose
    private String SceneKey;

    /**
    * <p>印章图片文件 id取值：填写的FileId通过UploadFiles接口上传文件获取。</p>
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
     * Get <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p> 
     * @return Agent <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p>
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p>
     * @param Agent <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p>
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get <p>个人用户姓名</p> 
     * @return UserName <p>个人用户姓名</p>
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>个人用户姓名</p>
     * @param UserName <p>个人用户姓名</p>
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get <p>证件号码, 应符合以下规则</p><ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成（如存在X，请大写）。</li><li>中国港澳居民来往内地通行证号码共11位。第1位为字母，“H”字头签发给中国香港居民，“M”字头签发给中国澳门居民；第2位至第11位为数字。</li><li>中国港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul> 
     * @return IdCardNumber <p>证件号码, 应符合以下规则</p><ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成（如存在X，请大写）。</li><li>中国港澳居民来往内地通行证号码共11位。第1位为字母，“H”字头签发给中国香港居民，“M”字头签发给中国澳门居民；第2位至第11位为数字。</li><li>中国港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul>
     */
    public String getIdCardNumber() {
        return this.IdCardNumber;
    }

    /**
     * Set <p>证件号码, 应符合以下规则</p><ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成（如存在X，请大写）。</li><li>中国港澳居民来往内地通行证号码共11位。第1位为字母，“H”字头签发给中国香港居民，“M”字头签发给中国澳门居民；第2位至第11位为数字。</li><li>中国港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul>
     * @param IdCardNumber <p>证件号码, 应符合以下规则</p><ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成（如存在X，请大写）。</li><li>中国港澳居民来往内地通行证号码共11位。第1位为字母，“H”字头签发给中国香港居民，“M”字头签发给中国澳门居民；第2位至第11位为数字。</li><li>中国港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul>
     */
    public void setIdCardNumber(String IdCardNumber) {
        this.IdCardNumber = IdCardNumber;
    }

    /**
     * Get <p>电子印章名字，1-50个中文字符<br>注:<code>同一企业下电子印章名字不能相同</code></p> 
     * @return SealName <p>电子印章名字，1-50个中文字符<br>注:<code>同一企业下电子印章名字不能相同</code></p>
     */
    public String getSealName() {
        return this.SealName;
    }

    /**
     * Set <p>电子印章名字，1-50个中文字符<br>注:<code>同一企业下电子印章名字不能相同</code></p>
     * @param SealName <p>电子印章名字，1-50个中文字符<br>注:<code>同一企业下电子印章名字不能相同</code></p>
     */
    public void setSealName(String SealName) {
        this.SealName = SealName;
    }

    /**
     * Get <p>电子印章图片base64编码，大小不超过10M（原始图片不超过5M），只支持PNG或JPG图片格式。</p> 
     * @return SealImage <p>电子印章图片base64编码，大小不超过10M（原始图片不超过5M），只支持PNG或JPG图片格式。</p>
     */
    public String getSealImage() {
        return this.SealImage;
    }

    /**
     * Set <p>电子印章图片base64编码，大小不超过10M（原始图片不超过5M），只支持PNG或JPG图片格式。</p>
     * @param SealImage <p>电子印章图片base64编码，大小不超过10M（原始图片不超过5M），只支持PNG或JPG图片格式。</p>
     */
    public void setSealImage(String SealImage) {
        this.SealImage = SealImage;
    }

    /**
     * Get <p>执行本接口操作的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p> 
     * @return Operator <p>执行本接口操作的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>执行本接口操作的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
     * @param Operator <p>执行本接口操作的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get <p>证件类型，支持以下类型</p><ul><li>ID_CARD : 中国大陆居民身份证 (默认值)</li><li>HONGKONG_AND_MACAO : 中国港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN : 中国港澳台居民居住证(格式同中国大陆居民身份证)</li><li>OTHER_CARD_TYPE : 其他</li></ul><p>注: <code>其他证件类型为白名单功能，使用前请联系对接的客户经理沟通。</code></p> 
     * @return IdCardType <p>证件类型，支持以下类型</p><ul><li>ID_CARD : 中国大陆居民身份证 (默认值)</li><li>HONGKONG_AND_MACAO : 中国港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN : 中国港澳台居民居住证(格式同中国大陆居民身份证)</li><li>OTHER_CARD_TYPE : 其他</li></ul><p>注: <code>其他证件类型为白名单功能，使用前请联系对接的客户经理沟通。</code></p>
     */
    public String getIdCardType() {
        return this.IdCardType;
    }

    /**
     * Set <p>证件类型，支持以下类型</p><ul><li>ID_CARD : 中国大陆居民身份证 (默认值)</li><li>HONGKONG_AND_MACAO : 中国港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN : 中国港澳台居民居住证(格式同中国大陆居民身份证)</li><li>OTHER_CARD_TYPE : 其他</li></ul><p>注: <code>其他证件类型为白名单功能，使用前请联系对接的客户经理沟通。</code></p>
     * @param IdCardType <p>证件类型，支持以下类型</p><ul><li>ID_CARD : 中国大陆居民身份证 (默认值)</li><li>HONGKONG_AND_MACAO : 中国港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN : 中国港澳台居民居住证(格式同中国大陆居民身份证)</li><li>OTHER_CARD_TYPE : 其他</li></ul><p>注: <code>其他证件类型为白名单功能，使用前请联系对接的客户经理沟通。</code></p>
     */
    public void setIdCardType(String IdCardType) {
        this.IdCardType = IdCardType;
    }

    /**
     * Get <p>是否开启印章图片压缩处理，默认不开启，如需开启请设置为 true。当印章超过 2M 时建议开启，开启后图片的 hash 将发生变化。</p> 
     * @return SealImageCompress <p>是否开启印章图片压缩处理，默认不开启，如需开启请设置为 true。当印章超过 2M 时建议开启，开启后图片的 hash 将发生变化。</p>
     */
    public Boolean getSealImageCompress() {
        return this.SealImageCompress;
    }

    /**
     * Set <p>是否开启印章图片压缩处理，默认不开启，如需开启请设置为 true。当印章超过 2M 时建议开启，开启后图片的 hash 将发生变化。</p>
     * @param SealImageCompress <p>是否开启印章图片压缩处理，默认不开启，如需开启请设置为 true。当印章超过 2M 时建议开启，开启后图片的 hash 将发生变化。</p>
     */
    public void setSealImageCompress(Boolean SealImageCompress) {
        this.SealImageCompress = SealImageCompress;
    }

    /**
     * Get <p>手机号码；当需要开通自动签时，该参数必传</p> 
     * @return Mobile <p>手机号码；当需要开通自动签时，该参数必传</p>
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set <p>手机号码；当需要开通自动签时，该参数必传</p>
     * @param Mobile <p>手机号码；当需要开通自动签时，该参数必传</p>
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get <p>该字段已不再使用</p> 
     * @return EnableAutoSign <p>该字段已不再使用</p>
     * @deprecated
     */
    @Deprecated
    public Boolean getEnableAutoSign() {
        return this.EnableAutoSign;
    }

    /**
     * Set <p>该字段已不再使用</p>
     * @param EnableAutoSign <p>该字段已不再使用</p>
     * @deprecated
     */
    @Deprecated
    public void setEnableAutoSign(Boolean EnableAutoSign) {
        this.EnableAutoSign = EnableAutoSign;
    }

    /**
     * Get <p>设置用户开通自动签时是否绑定个人自动签账号许可。一旦绑定后，将扣减购买的个人自动签账号许可一次（1年有效期），不可解绑释放。不传默认为绑定自动签账号许可。 0-绑定个人自动签账号许可，开通后将扣减购买的个人自动签账号许可一次 1-不绑定，发起合同时将按标准合同套餐进行扣减</p> 
     * @return LicenseType <p>设置用户开通自动签时是否绑定个人自动签账号许可。一旦绑定后，将扣减购买的个人自动签账号许可一次（1年有效期），不可解绑释放。不传默认为绑定自动签账号许可。 0-绑定个人自动签账号许可，开通后将扣减购买的个人自动签账号许可一次 1-不绑定，发起合同时将按标准合同套餐进行扣减</p>
     */
    public Long getLicenseType() {
        return this.LicenseType;
    }

    /**
     * Set <p>设置用户开通自动签时是否绑定个人自动签账号许可。一旦绑定后，将扣减购买的个人自动签账号许可一次（1年有效期），不可解绑释放。不传默认为绑定自动签账号许可。 0-绑定个人自动签账号许可，开通后将扣减购买的个人自动签账号许可一次 1-不绑定，发起合同时将按标准合同套餐进行扣减</p>
     * @param LicenseType <p>设置用户开通自动签时是否绑定个人自动签账号许可。一旦绑定后，将扣减购买的个人自动签账号许可一次（1年有效期），不可解绑释放。不传默认为绑定自动签账号许可。 0-绑定个人自动签账号许可，开通后将扣减购买的个人自动签账号许可一次 1-不绑定，发起合同时将按标准合同套餐进行扣减</p>
     */
    public void setLicenseType(Long LicenseType) {
        this.LicenseType = LicenseType;
    }

    /**
     * Get <ul><li> **E_PRESCRIPTION_AUTO_SIGN** :  电子处方场景</li><li> **OTHER** :  通用场景</li></ul> 
     * @return SceneKey <ul><li> **E_PRESCRIPTION_AUTO_SIGN** :  电子处方场景</li><li> **OTHER** :  通用场景</li></ul>
     */
    public String getSceneKey() {
        return this.SceneKey;
    }

    /**
     * Set <ul><li> **E_PRESCRIPTION_AUTO_SIGN** :  电子处方场景</li><li> **OTHER** :  通用场景</li></ul>
     * @param SceneKey <ul><li> **E_PRESCRIPTION_AUTO_SIGN** :  电子处方场景</li><li> **OTHER** :  通用场景</li></ul>
     */
    public void setSceneKey(String SceneKey) {
        this.SceneKey = SceneKey;
    }

    /**
     * Get <p>印章图片文件 id取值：填写的FileId通过UploadFiles接口上传文件获取。</p> 
     * @return FileId <p>印章图片文件 id取值：填写的FileId通过UploadFiles接口上传文件获取。</p>
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set <p>印章图片文件 id取值：填写的FileId通过UploadFiles接口上传文件获取。</p>
     * @param FileId <p>印章图片文件 id取值：填写的FileId通过UploadFiles接口上传文件获取。</p>
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    public ChannelCreatePreparedPersonalEsignRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelCreatePreparedPersonalEsignRequest(ChannelCreatePreparedPersonalEsignRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.IdCardNumber != null) {
            this.IdCardNumber = new String(source.IdCardNumber);
        }
        if (source.SealName != null) {
            this.SealName = new String(source.SealName);
        }
        if (source.SealImage != null) {
            this.SealImage = new String(source.SealImage);
        }
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.IdCardType != null) {
            this.IdCardType = new String(source.IdCardType);
        }
        if (source.SealImageCompress != null) {
            this.SealImageCompress = new Boolean(source.SealImageCompress);
        }
        if (source.Mobile != null) {
            this.Mobile = new String(source.Mobile);
        }
        if (source.EnableAutoSign != null) {
            this.EnableAutoSign = new Boolean(source.EnableAutoSign);
        }
        if (source.LicenseType != null) {
            this.LicenseType = new Long(source.LicenseType);
        }
        if (source.SceneKey != null) {
            this.SceneKey = new String(source.SceneKey);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "IdCardNumber", this.IdCardNumber);
        this.setParamSimple(map, prefix + "SealName", this.SealName);
        this.setParamSimple(map, prefix + "SealImage", this.SealImage);
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "IdCardType", this.IdCardType);
        this.setParamSimple(map, prefix + "SealImageCompress", this.SealImageCompress);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamSimple(map, prefix + "EnableAutoSign", this.EnableAutoSign);
        this.setParamSimple(map, prefix + "LicenseType", this.LicenseType);
        this.setParamSimple(map, prefix + "SceneKey", this.SceneKey);
        this.setParamSimple(map, prefix + "FileId", this.FileId);

    }
}

