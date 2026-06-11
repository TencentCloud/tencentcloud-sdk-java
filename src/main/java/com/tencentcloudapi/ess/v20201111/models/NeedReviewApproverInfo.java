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

public class NeedReviewApproverInfo extends AbstractModel {

    /**
    * <p>签署方经办人的类型，支持以下类型</p><ul><li> ORGANIZATION 企业（含企业自动签）</li><li>PERSON 个人（含个人自动签）</li></ul>
    */
    @SerializedName("ApproverType")
    @Expose
    private String ApproverType;

    /**
    * <p>签署方经办人的姓名。 经办人的姓名将用于身份认证和电子签名，请确保填写的姓名为签署方的真实姓名，而非昵称等代名。</p>
    */
    @SerializedName("ApproverName")
    @Expose
    private String ApproverName;

    /**
    * <p>签署方经办人手机号码， 支持中国大陆手机号11位数字(无需加+86前缀或其他字符)。 请确认手机号所有方为此合同签署方。</p>
    */
    @SerializedName("ApproverMobile")
    @Expose
    private String ApproverMobile;

    /**
    * <p>签署方经办人的证件类型，支持以下类型</p><ul><li>ID_CARD 中国大陆居民身份证  (默认值)</li><li>HONGKONG_AND_MACAO 中国港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN 中国港澳台居民居住证(格式同居民身份证)</li></ul>
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
    * <p>组织机构名称。<br>请确认该名称与企业营业执照中注册的名称一致。<br>如果名称中包含英文括号()，请使用中文括号（）代替。<br>如果签署方是企业签署方(approverType = 0 或者 approverType = 3)， 则企业名称必填。</p>
    */
    @SerializedName("OrganizationName")
    @Expose
    private String OrganizationName;

    /**
     * Get <p>签署方经办人的类型，支持以下类型</p><ul><li> ORGANIZATION 企业（含企业自动签）</li><li>PERSON 个人（含个人自动签）</li></ul> 
     * @return ApproverType <p>签署方经办人的类型，支持以下类型</p><ul><li> ORGANIZATION 企业（含企业自动签）</li><li>PERSON 个人（含个人自动签）</li></ul>
     */
    public String getApproverType() {
        return this.ApproverType;
    }

    /**
     * Set <p>签署方经办人的类型，支持以下类型</p><ul><li> ORGANIZATION 企业（含企业自动签）</li><li>PERSON 个人（含个人自动签）</li></ul>
     * @param ApproverType <p>签署方经办人的类型，支持以下类型</p><ul><li> ORGANIZATION 企业（含企业自动签）</li><li>PERSON 个人（含个人自动签）</li></ul>
     */
    public void setApproverType(String ApproverType) {
        this.ApproverType = ApproverType;
    }

    /**
     * Get <p>签署方经办人的姓名。 经办人的姓名将用于身份认证和电子签名，请确保填写的姓名为签署方的真实姓名，而非昵称等代名。</p> 
     * @return ApproverName <p>签署方经办人的姓名。 经办人的姓名将用于身份认证和电子签名，请确保填写的姓名为签署方的真实姓名，而非昵称等代名。</p>
     */
    public String getApproverName() {
        return this.ApproverName;
    }

    /**
     * Set <p>签署方经办人的姓名。 经办人的姓名将用于身份认证和电子签名，请确保填写的姓名为签署方的真实姓名，而非昵称等代名。</p>
     * @param ApproverName <p>签署方经办人的姓名。 经办人的姓名将用于身份认证和电子签名，请确保填写的姓名为签署方的真实姓名，而非昵称等代名。</p>
     */
    public void setApproverName(String ApproverName) {
        this.ApproverName = ApproverName;
    }

    /**
     * Get <p>签署方经办人手机号码， 支持中国大陆手机号11位数字(无需加+86前缀或其他字符)。 请确认手机号所有方为此合同签署方。</p> 
     * @return ApproverMobile <p>签署方经办人手机号码， 支持中国大陆手机号11位数字(无需加+86前缀或其他字符)。 请确认手机号所有方为此合同签署方。</p>
     */
    public String getApproverMobile() {
        return this.ApproverMobile;
    }

    /**
     * Set <p>签署方经办人手机号码， 支持中国大陆手机号11位数字(无需加+86前缀或其他字符)。 请确认手机号所有方为此合同签署方。</p>
     * @param ApproverMobile <p>签署方经办人手机号码， 支持中国大陆手机号11位数字(无需加+86前缀或其他字符)。 请确认手机号所有方为此合同签署方。</p>
     */
    public void setApproverMobile(String ApproverMobile) {
        this.ApproverMobile = ApproverMobile;
    }

    /**
     * Get <p>签署方经办人的证件类型，支持以下类型</p><ul><li>ID_CARD 中国大陆居民身份证  (默认值)</li><li>HONGKONG_AND_MACAO 中国港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN 中国港澳台居民居住证(格式同居民身份证)</li></ul> 
     * @return ApproverIdCardType <p>签署方经办人的证件类型，支持以下类型</p><ul><li>ID_CARD 中国大陆居民身份证  (默认值)</li><li>HONGKONG_AND_MACAO 中国港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN 中国港澳台居民居住证(格式同居民身份证)</li></ul>
     */
    public String getApproverIdCardType() {
        return this.ApproverIdCardType;
    }

    /**
     * Set <p>签署方经办人的证件类型，支持以下类型</p><ul><li>ID_CARD 中国大陆居民身份证  (默认值)</li><li>HONGKONG_AND_MACAO 中国港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN 中国港澳台居民居住证(格式同居民身份证)</li></ul>
     * @param ApproverIdCardType <p>签署方经办人的证件类型，支持以下类型</p><ul><li>ID_CARD 中国大陆居民身份证  (默认值)</li><li>HONGKONG_AND_MACAO 中国港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN 中国港澳台居民居住证(格式同居民身份证)</li></ul>
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

    public NeedReviewApproverInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NeedReviewApproverInfo(NeedReviewApproverInfo source) {
        if (source.ApproverType != null) {
            this.ApproverType = new String(source.ApproverType);
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
        if (source.OrganizationName != null) {
            this.OrganizationName = new String(source.OrganizationName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApproverType", this.ApproverType);
        this.setParamSimple(map, prefix + "ApproverName", this.ApproverName);
        this.setParamSimple(map, prefix + "ApproverMobile", this.ApproverMobile);
        this.setParamSimple(map, prefix + "ApproverIdCardType", this.ApproverIdCardType);
        this.setParamSimple(map, prefix + "ApproverIdCardNumber", this.ApproverIdCardNumber);
        this.setParamSimple(map, prefix + "OrganizationName", this.OrganizationName);

    }
}

