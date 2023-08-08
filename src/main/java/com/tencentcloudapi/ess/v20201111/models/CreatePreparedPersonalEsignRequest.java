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

public class CreatePreparedPersonalEsignRequest extends AbstractModel{

    /**
    * 个人用户姓名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 身份证件号码
    */
    @SerializedName("IdCardNumber")
    @Expose
    private String IdCardNumber;

    /**
    * 印章名称
    */
    @SerializedName("SealName")
    @Expose
    private String SealName;

    /**
    * 调用方用户信息，userId 必填。支持填入集团子公司经办人 userId代发合同。
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 身份证件类型:
ID_CARD 身份证
PASSPORT 护照
HONGKONG_AND_MACAO 中国香港
FOREIGN_ID_CARD 境外身份
HONGKONG_MACAO_AND_TAIWAN 中国台湾
    */
    @SerializedName("IdCardType")
    @Expose
    private String IdCardType;

    /**
    * 印章图片的base64
注：已废弃
请先通过UploadFiles接口上传文件，获取 FileId
    */
    @SerializedName("SealImage")
    @Expose
    private String SealImage;

    /**
    * 是否开启印章图片压缩处理，默认不开启，如需开启请设置为 true。当印章超过 2M 时建议开启，开启后图片的 hash 将发生变化。
    */
    @SerializedName("SealImageCompress")
    @Expose
    private Boolean SealImageCompress;

    /**
    * 手机号码；当需要开通自动签时，该参数必传
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * 是否开通自动签，该功能需联系运营工作人员开通后使用
    */
    @SerializedName("EnableAutoSign")
    @Expose
    private Boolean EnableAutoSign;

    /**
    * 印章颜色（参数ProcessSeal=true时生效）
默认值：BLACK黑色
取值: 
BLACK 黑色,
RED 红色,
BLUE 蓝色。
    */
    @SerializedName("SealColor")
    @Expose
    private String SealColor;

    /**
    * 是否处理印章
默认不做印章处理。
取值：false：不做任何处理；
true：做透明化处理和颜色增强。
    */
    @SerializedName("ProcessSeal")
    @Expose
    private Boolean ProcessSeal;

    /**
    * 印章图片文件 id
取值：
填写的FileId通过UploadFiles接口上传文件获取。
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 代理相关应用信息，如集团主企业代子企业操作的场景中ProxyOrganizationId必填
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
     * Get 个人用户姓名 
     * @return UserName 个人用户姓名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 个人用户姓名
     * @param UserName 个人用户姓名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 身份证件号码 
     * @return IdCardNumber 身份证件号码
     */
    public String getIdCardNumber() {
        return this.IdCardNumber;
    }

    /**
     * Set 身份证件号码
     * @param IdCardNumber 身份证件号码
     */
    public void setIdCardNumber(String IdCardNumber) {
        this.IdCardNumber = IdCardNumber;
    }

    /**
     * Get 印章名称 
     * @return SealName 印章名称
     */
    public String getSealName() {
        return this.SealName;
    }

    /**
     * Set 印章名称
     * @param SealName 印章名称
     */
    public void setSealName(String SealName) {
        this.SealName = SealName;
    }

    /**
     * Get 调用方用户信息，userId 必填。支持填入集团子公司经办人 userId代发合同。 
     * @return Operator 调用方用户信息，userId 必填。支持填入集团子公司经办人 userId代发合同。
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 调用方用户信息，userId 必填。支持填入集团子公司经办人 userId代发合同。
     * @param Operator 调用方用户信息，userId 必填。支持填入集团子公司经办人 userId代发合同。
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 身份证件类型:
ID_CARD 身份证
PASSPORT 护照
HONGKONG_AND_MACAO 中国香港
FOREIGN_ID_CARD 境外身份
HONGKONG_MACAO_AND_TAIWAN 中国台湾 
     * @return IdCardType 身份证件类型:
ID_CARD 身份证
PASSPORT 护照
HONGKONG_AND_MACAO 中国香港
FOREIGN_ID_CARD 境外身份
HONGKONG_MACAO_AND_TAIWAN 中国台湾
     */
    public String getIdCardType() {
        return this.IdCardType;
    }

    /**
     * Set 身份证件类型:
ID_CARD 身份证
PASSPORT 护照
HONGKONG_AND_MACAO 中国香港
FOREIGN_ID_CARD 境外身份
HONGKONG_MACAO_AND_TAIWAN 中国台湾
     * @param IdCardType 身份证件类型:
ID_CARD 身份证
PASSPORT 护照
HONGKONG_AND_MACAO 中国香港
FOREIGN_ID_CARD 境外身份
HONGKONG_MACAO_AND_TAIWAN 中国台湾
     */
    public void setIdCardType(String IdCardType) {
        this.IdCardType = IdCardType;
    }

    /**
     * Get 印章图片的base64
注：已废弃
请先通过UploadFiles接口上传文件，获取 FileId 
     * @return SealImage 印章图片的base64
注：已废弃
请先通过UploadFiles接口上传文件，获取 FileId
     * @deprecated
     */
    @Deprecated
    public String getSealImage() {
        return this.SealImage;
    }

    /**
     * Set 印章图片的base64
注：已废弃
请先通过UploadFiles接口上传文件，获取 FileId
     * @param SealImage 印章图片的base64
注：已废弃
请先通过UploadFiles接口上传文件，获取 FileId
     * @deprecated
     */
    @Deprecated
    public void setSealImage(String SealImage) {
        this.SealImage = SealImage;
    }

    /**
     * Get 是否开启印章图片压缩处理，默认不开启，如需开启请设置为 true。当印章超过 2M 时建议开启，开启后图片的 hash 将发生变化。 
     * @return SealImageCompress 是否开启印章图片压缩处理，默认不开启，如需开启请设置为 true。当印章超过 2M 时建议开启，开启后图片的 hash 将发生变化。
     */
    public Boolean getSealImageCompress() {
        return this.SealImageCompress;
    }

    /**
     * Set 是否开启印章图片压缩处理，默认不开启，如需开启请设置为 true。当印章超过 2M 时建议开启，开启后图片的 hash 将发生变化。
     * @param SealImageCompress 是否开启印章图片压缩处理，默认不开启，如需开启请设置为 true。当印章超过 2M 时建议开启，开启后图片的 hash 将发生变化。
     */
    public void setSealImageCompress(Boolean SealImageCompress) {
        this.SealImageCompress = SealImageCompress;
    }

    /**
     * Get 手机号码；当需要开通自动签时，该参数必传 
     * @return Mobile 手机号码；当需要开通自动签时，该参数必传
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set 手机号码；当需要开通自动签时，该参数必传
     * @param Mobile 手机号码；当需要开通自动签时，该参数必传
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get 是否开通自动签，该功能需联系运营工作人员开通后使用 
     * @return EnableAutoSign 是否开通自动签，该功能需联系运营工作人员开通后使用
     */
    public Boolean getEnableAutoSign() {
        return this.EnableAutoSign;
    }

    /**
     * Set 是否开通自动签，该功能需联系运营工作人员开通后使用
     * @param EnableAutoSign 是否开通自动签，该功能需联系运营工作人员开通后使用
     */
    public void setEnableAutoSign(Boolean EnableAutoSign) {
        this.EnableAutoSign = EnableAutoSign;
    }

    /**
     * Get 印章颜色（参数ProcessSeal=true时生效）
默认值：BLACK黑色
取值: 
BLACK 黑色,
RED 红色,
BLUE 蓝色。 
     * @return SealColor 印章颜色（参数ProcessSeal=true时生效）
默认值：BLACK黑色
取值: 
BLACK 黑色,
RED 红色,
BLUE 蓝色。
     */
    public String getSealColor() {
        return this.SealColor;
    }

    /**
     * Set 印章颜色（参数ProcessSeal=true时生效）
默认值：BLACK黑色
取值: 
BLACK 黑色,
RED 红色,
BLUE 蓝色。
     * @param SealColor 印章颜色（参数ProcessSeal=true时生效）
默认值：BLACK黑色
取值: 
BLACK 黑色,
RED 红色,
BLUE 蓝色。
     */
    public void setSealColor(String SealColor) {
        this.SealColor = SealColor;
    }

    /**
     * Get 是否处理印章
默认不做印章处理。
取值：false：不做任何处理；
true：做透明化处理和颜色增强。 
     * @return ProcessSeal 是否处理印章
默认不做印章处理。
取值：false：不做任何处理；
true：做透明化处理和颜色增强。
     */
    public Boolean getProcessSeal() {
        return this.ProcessSeal;
    }

    /**
     * Set 是否处理印章
默认不做印章处理。
取值：false：不做任何处理；
true：做透明化处理和颜色增强。
     * @param ProcessSeal 是否处理印章
默认不做印章处理。
取值：false：不做任何处理；
true：做透明化处理和颜色增强。
     */
    public void setProcessSeal(Boolean ProcessSeal) {
        this.ProcessSeal = ProcessSeal;
    }

    /**
     * Get 印章图片文件 id
取值：
填写的FileId通过UploadFiles接口上传文件获取。 
     * @return FileId 印章图片文件 id
取值：
填写的FileId通过UploadFiles接口上传文件获取。
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set 印章图片文件 id
取值：
填写的FileId通过UploadFiles接口上传文件获取。
     * @param FileId 印章图片文件 id
取值：
填写的FileId通过UploadFiles接口上传文件获取。
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get 代理相关应用信息，如集团主企业代子企业操作的场景中ProxyOrganizationId必填 
     * @return Agent 代理相关应用信息，如集团主企业代子企业操作的场景中ProxyOrganizationId必填
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 代理相关应用信息，如集团主企业代子企业操作的场景中ProxyOrganizationId必填
     * @param Agent 代理相关应用信息，如集团主企业代子企业操作的场景中ProxyOrganizationId必填
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    public CreatePreparedPersonalEsignRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePreparedPersonalEsignRequest(CreatePreparedPersonalEsignRequest source) {
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.IdCardNumber != null) {
            this.IdCardNumber = new String(source.IdCardNumber);
        }
        if (source.SealName != null) {
            this.SealName = new String(source.SealName);
        }
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.IdCardType != null) {
            this.IdCardType = new String(source.IdCardType);
        }
        if (source.SealImage != null) {
            this.SealImage = new String(source.SealImage);
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
        if (source.SealColor != null) {
            this.SealColor = new String(source.SealColor);
        }
        if (source.ProcessSeal != null) {
            this.ProcessSeal = new Boolean(source.ProcessSeal);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "IdCardNumber", this.IdCardNumber);
        this.setParamSimple(map, prefix + "SealName", this.SealName);
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "IdCardType", this.IdCardType);
        this.setParamSimple(map, prefix + "SealImage", this.SealImage);
        this.setParamSimple(map, prefix + "SealImageCompress", this.SealImageCompress);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamSimple(map, prefix + "EnableAutoSign", this.EnableAutoSign);
        this.setParamSimple(map, prefix + "SealColor", this.SealColor);
        this.setParamSimple(map, prefix + "ProcessSeal", this.ProcessSeal);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamObj(map, prefix + "Agent.", this.Agent);

    }
}

