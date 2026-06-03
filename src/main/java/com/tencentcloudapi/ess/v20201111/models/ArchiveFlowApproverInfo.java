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

public class ArchiveFlowApproverInfo extends AbstractModel {

    /**
    * <p>个人签署人姓名，如果传入，必须是证件上的真实中文名；中文名最长 25 个字符；</p>
    */
    @SerializedName("ApproverName")
    @Expose
    private String ApproverName;

    /**
    * <p>参与者类型，用于区分个人或企业，可选类型如下:<br><strong>0</strong>：企业<br><strong>1</strong>：个人</p>
    */
    @SerializedName("ApproverType")
    @Expose
    private Long ApproverType;

    /**
    * <p>企业签署方名称。长度不超过 200 个字符。<br>如果名称中包含英文括号()，请使用中文括号（）代替。<br>如果签署方是企业签署方(approverType = 0 )， 则企业名称必填。</p>
    */
    @SerializedName("OrganizationName")
    @Expose
    private String OrganizationName;

    /**
    * <p>签署人手机号，必须是合法手机号。</p>
    */
    @SerializedName("ApproverMobile")
    @Expose
    private String ApproverMobile;

    /**
    * <p>签署人邮箱， 必须是合法邮箱格式。</p>
    */
    @SerializedName("ApproverEmail")
    @Expose
    private String ApproverEmail;

    /**
    * <p>签署方经办人的证件类型，支持以下类型，样式可以参考<a href="https://qian.tencent.com/developers/partner/id_card_support/" target="_blank">常见个人证件类型介绍</a></p><ul><li>ID_CARD 中国大陆居民身份证  (默认值)</li><li>HONGKONG_AND_MACAO 港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN 港澳台居民居住证(格式同居民身份证)</li><li>OTHER_CARD_TYPE 其他证件</li></ul>
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
    * <p>当前参与者的签署时间，Unix 秒级时间戳。</p>
    */
    @SerializedName("ApproveTime")
    @Expose
    private Long ApproveTime;

    /**
     * Get <p>个人签署人姓名，如果传入，必须是证件上的真实中文名；中文名最长 25 个字符；</p> 
     * @return ApproverName <p>个人签署人姓名，如果传入，必须是证件上的真实中文名；中文名最长 25 个字符；</p>
     */
    public String getApproverName() {
        return this.ApproverName;
    }

    /**
     * Set <p>个人签署人姓名，如果传入，必须是证件上的真实中文名；中文名最长 25 个字符；</p>
     * @param ApproverName <p>个人签署人姓名，如果传入，必须是证件上的真实中文名；中文名最长 25 个字符；</p>
     */
    public void setApproverName(String ApproverName) {
        this.ApproverName = ApproverName;
    }

    /**
     * Get <p>参与者类型，用于区分个人或企业，可选类型如下:<br><strong>0</strong>：企业<br><strong>1</strong>：个人</p> 
     * @return ApproverType <p>参与者类型，用于区分个人或企业，可选类型如下:<br><strong>0</strong>：企业<br><strong>1</strong>：个人</p>
     */
    public Long getApproverType() {
        return this.ApproverType;
    }

    /**
     * Set <p>参与者类型，用于区分个人或企业，可选类型如下:<br><strong>0</strong>：企业<br><strong>1</strong>：个人</p>
     * @param ApproverType <p>参与者类型，用于区分个人或企业，可选类型如下:<br><strong>0</strong>：企业<br><strong>1</strong>：个人</p>
     */
    public void setApproverType(Long ApproverType) {
        this.ApproverType = ApproverType;
    }

    /**
     * Get <p>企业签署方名称。长度不超过 200 个字符。<br>如果名称中包含英文括号()，请使用中文括号（）代替。<br>如果签署方是企业签署方(approverType = 0 )， 则企业名称必填。</p> 
     * @return OrganizationName <p>企业签署方名称。长度不超过 200 个字符。<br>如果名称中包含英文括号()，请使用中文括号（）代替。<br>如果签署方是企业签署方(approverType = 0 )， 则企业名称必填。</p>
     */
    public String getOrganizationName() {
        return this.OrganizationName;
    }

    /**
     * Set <p>企业签署方名称。长度不超过 200 个字符。<br>如果名称中包含英文括号()，请使用中文括号（）代替。<br>如果签署方是企业签署方(approverType = 0 )， 则企业名称必填。</p>
     * @param OrganizationName <p>企业签署方名称。长度不超过 200 个字符。<br>如果名称中包含英文括号()，请使用中文括号（）代替。<br>如果签署方是企业签署方(approverType = 0 )， 则企业名称必填。</p>
     */
    public void setOrganizationName(String OrganizationName) {
        this.OrganizationName = OrganizationName;
    }

    /**
     * Get <p>签署人手机号，必须是合法手机号。</p> 
     * @return ApproverMobile <p>签署人手机号，必须是合法手机号。</p>
     */
    public String getApproverMobile() {
        return this.ApproverMobile;
    }

    /**
     * Set <p>签署人手机号，必须是合法手机号。</p>
     * @param ApproverMobile <p>签署人手机号，必须是合法手机号。</p>
     */
    public void setApproverMobile(String ApproverMobile) {
        this.ApproverMobile = ApproverMobile;
    }

    /**
     * Get <p>签署人邮箱， 必须是合法邮箱格式。</p> 
     * @return ApproverEmail <p>签署人邮箱， 必须是合法邮箱格式。</p>
     */
    public String getApproverEmail() {
        return this.ApproverEmail;
    }

    /**
     * Set <p>签署人邮箱， 必须是合法邮箱格式。</p>
     * @param ApproverEmail <p>签署人邮箱， 必须是合法邮箱格式。</p>
     */
    public void setApproverEmail(String ApproverEmail) {
        this.ApproverEmail = ApproverEmail;
    }

    /**
     * Get <p>签署方经办人的证件类型，支持以下类型，样式可以参考<a href="https://qian.tencent.com/developers/partner/id_card_support/" target="_blank">常见个人证件类型介绍</a></p><ul><li>ID_CARD 中国大陆居民身份证  (默认值)</li><li>HONGKONG_AND_MACAO 港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN 港澳台居民居住证(格式同居民身份证)</li><li>OTHER_CARD_TYPE 其他证件</li></ul> 
     * @return ApproverIdCardType <p>签署方经办人的证件类型，支持以下类型，样式可以参考<a href="https://qian.tencent.com/developers/partner/id_card_support/" target="_blank">常见个人证件类型介绍</a></p><ul><li>ID_CARD 中国大陆居民身份证  (默认值)</li><li>HONGKONG_AND_MACAO 港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN 港澳台居民居住证(格式同居民身份证)</li><li>OTHER_CARD_TYPE 其他证件</li></ul>
     */
    public String getApproverIdCardType() {
        return this.ApproverIdCardType;
    }

    /**
     * Set <p>签署方经办人的证件类型，支持以下类型，样式可以参考<a href="https://qian.tencent.com/developers/partner/id_card_support/" target="_blank">常见个人证件类型介绍</a></p><ul><li>ID_CARD 中国大陆居民身份证  (默认值)</li><li>HONGKONG_AND_MACAO 港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN 港澳台居民居住证(格式同居民身份证)</li><li>OTHER_CARD_TYPE 其他证件</li></ul>
     * @param ApproverIdCardType <p>签署方经办人的证件类型，支持以下类型，样式可以参考<a href="https://qian.tencent.com/developers/partner/id_card_support/" target="_blank">常见个人证件类型介绍</a></p><ul><li>ID_CARD 中国大陆居民身份证  (默认值)</li><li>HONGKONG_AND_MACAO 港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN 港澳台居民居住证(格式同居民身份证)</li><li>OTHER_CARD_TYPE 其他证件</li></ul>
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
     * Get <p>当前参与者的签署时间，Unix 秒级时间戳。</p> 
     * @return ApproveTime <p>当前参与者的签署时间，Unix 秒级时间戳。</p>
     */
    public Long getApproveTime() {
        return this.ApproveTime;
    }

    /**
     * Set <p>当前参与者的签署时间，Unix 秒级时间戳。</p>
     * @param ApproveTime <p>当前参与者的签署时间，Unix 秒级时间戳。</p>
     */
    public void setApproveTime(Long ApproveTime) {
        this.ApproveTime = ApproveTime;
    }

    public ArchiveFlowApproverInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ArchiveFlowApproverInfo(ArchiveFlowApproverInfo source) {
        if (source.ApproverName != null) {
            this.ApproverName = new String(source.ApproverName);
        }
        if (source.ApproverType != null) {
            this.ApproverType = new Long(source.ApproverType);
        }
        if (source.OrganizationName != null) {
            this.OrganizationName = new String(source.OrganizationName);
        }
        if (source.ApproverMobile != null) {
            this.ApproverMobile = new String(source.ApproverMobile);
        }
        if (source.ApproverEmail != null) {
            this.ApproverEmail = new String(source.ApproverEmail);
        }
        if (source.ApproverIdCardType != null) {
            this.ApproverIdCardType = new String(source.ApproverIdCardType);
        }
        if (source.ApproverIdCardNumber != null) {
            this.ApproverIdCardNumber = new String(source.ApproverIdCardNumber);
        }
        if (source.ApproveTime != null) {
            this.ApproveTime = new Long(source.ApproveTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApproverName", this.ApproverName);
        this.setParamSimple(map, prefix + "ApproverType", this.ApproverType);
        this.setParamSimple(map, prefix + "OrganizationName", this.OrganizationName);
        this.setParamSimple(map, prefix + "ApproverMobile", this.ApproverMobile);
        this.setParamSimple(map, prefix + "ApproverEmail", this.ApproverEmail);
        this.setParamSimple(map, prefix + "ApproverIdCardType", this.ApproverIdCardType);
        this.setParamSimple(map, prefix + "ApproverIdCardNumber", this.ApproverIdCardNumber);
        this.setParamSimple(map, prefix + "ApproveTime", this.ApproveTime);

    }
}

