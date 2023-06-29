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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CommonFlowApprover extends AbstractModel{

    /**
    * 指定当前签署人为第三方应用集成子客，默认false：当前签署人为第三方应用集成子客，true：当前签署人为saas企业用户
    */
    @SerializedName("NotChannelOrganization")
    @Expose
    private Boolean NotChannelOrganization;

    /**
    * 签署人类型,目前支持：0-企业签署人，1-个人签署人，3-企业静默签署人
    */
    @SerializedName("ApproverType")
    @Expose
    private Long ApproverType;

    /**
    * 企业id
    */
    @SerializedName("OrganizationId")
    @Expose
    private String OrganizationId;

    /**
    * 企业OpenId，第三方应用集成非静默签子客企业签署人发起合同必传
    */
    @SerializedName("OrganizationOpenId")
    @Expose
    private String OrganizationOpenId;

    /**
    * 企业名称，第三方应用集成非静默签子客企业签署人必传，saas企业签署人必传
    */
    @SerializedName("OrganizationName")
    @Expose
    private String OrganizationName;

    /**
    * 用户id
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 用户openId，第三方应用集成非静默签子客企业签署人必传
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * 签署人名称，saas企业签署人，个人签署人必传
    */
    @SerializedName("ApproverName")
    @Expose
    private String ApproverName;

    /**
    * 签署人手机号，saas企业签署人，个人签署人必传
    */
    @SerializedName("ApproverMobile")
    @Expose
    private String ApproverMobile;

    /**
    * 签署人Id，使用模板发起是，对应模板配置中的签署人RecipientId
注意：模板发起时该字段必填
    */
    @SerializedName("RecipientId")
    @Expose
    private String RecipientId;

    /**
    * 签署前置条件：阅读时长限制，不传默认10s,最大300s，最小3s
    */
    @SerializedName("PreReadTime")
    @Expose
    private Long PreReadTime;

    /**
    * 签署前置条件：阅读全文限制
    */
    @SerializedName("IsFullText")
    @Expose
    private Boolean IsFullText;

    /**
    * 通知类型：SMS（短信） NONE（不做通知）, 不传 默认SMS
    */
    @SerializedName("NotifyType")
    @Expose
    private String NotifyType;

    /**
    * 签署人配置
    */
    @SerializedName("ApproverOption")
    @Expose
    private CommonApproverOption ApproverOption;

    /**
     * Get 指定当前签署人为第三方应用集成子客，默认false：当前签署人为第三方应用集成子客，true：当前签署人为saas企业用户 
     * @return NotChannelOrganization 指定当前签署人为第三方应用集成子客，默认false：当前签署人为第三方应用集成子客，true：当前签署人为saas企业用户
     */
    public Boolean getNotChannelOrganization() {
        return this.NotChannelOrganization;
    }

    /**
     * Set 指定当前签署人为第三方应用集成子客，默认false：当前签署人为第三方应用集成子客，true：当前签署人为saas企业用户
     * @param NotChannelOrganization 指定当前签署人为第三方应用集成子客，默认false：当前签署人为第三方应用集成子客，true：当前签署人为saas企业用户
     */
    public void setNotChannelOrganization(Boolean NotChannelOrganization) {
        this.NotChannelOrganization = NotChannelOrganization;
    }

    /**
     * Get 签署人类型,目前支持：0-企业签署人，1-个人签署人，3-企业静默签署人 
     * @return ApproverType 签署人类型,目前支持：0-企业签署人，1-个人签署人，3-企业静默签署人
     */
    public Long getApproverType() {
        return this.ApproverType;
    }

    /**
     * Set 签署人类型,目前支持：0-企业签署人，1-个人签署人，3-企业静默签署人
     * @param ApproverType 签署人类型,目前支持：0-企业签署人，1-个人签署人，3-企业静默签署人
     */
    public void setApproverType(Long ApproverType) {
        this.ApproverType = ApproverType;
    }

    /**
     * Get 企业id 
     * @return OrganizationId 企业id
     */
    public String getOrganizationId() {
        return this.OrganizationId;
    }

    /**
     * Set 企业id
     * @param OrganizationId 企业id
     */
    public void setOrganizationId(String OrganizationId) {
        this.OrganizationId = OrganizationId;
    }

    /**
     * Get 企业OpenId，第三方应用集成非静默签子客企业签署人发起合同必传 
     * @return OrganizationOpenId 企业OpenId，第三方应用集成非静默签子客企业签署人发起合同必传
     */
    public String getOrganizationOpenId() {
        return this.OrganizationOpenId;
    }

    /**
     * Set 企业OpenId，第三方应用集成非静默签子客企业签署人发起合同必传
     * @param OrganizationOpenId 企业OpenId，第三方应用集成非静默签子客企业签署人发起合同必传
     */
    public void setOrganizationOpenId(String OrganizationOpenId) {
        this.OrganizationOpenId = OrganizationOpenId;
    }

    /**
     * Get 企业名称，第三方应用集成非静默签子客企业签署人必传，saas企业签署人必传 
     * @return OrganizationName 企业名称，第三方应用集成非静默签子客企业签署人必传，saas企业签署人必传
     */
    public String getOrganizationName() {
        return this.OrganizationName;
    }

    /**
     * Set 企业名称，第三方应用集成非静默签子客企业签署人必传，saas企业签署人必传
     * @param OrganizationName 企业名称，第三方应用集成非静默签子客企业签署人必传，saas企业签署人必传
     */
    public void setOrganizationName(String OrganizationName) {
        this.OrganizationName = OrganizationName;
    }

    /**
     * Get 用户id 
     * @return UserId 用户id
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户id
     * @param UserId 用户id
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 用户openId，第三方应用集成非静默签子客企业签署人必传 
     * @return OpenId 用户openId，第三方应用集成非静默签子客企业签署人必传
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set 用户openId，第三方应用集成非静默签子客企业签署人必传
     * @param OpenId 用户openId，第三方应用集成非静默签子客企业签署人必传
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * Get 签署人名称，saas企业签署人，个人签署人必传 
     * @return ApproverName 签署人名称，saas企业签署人，个人签署人必传
     */
    public String getApproverName() {
        return this.ApproverName;
    }

    /**
     * Set 签署人名称，saas企业签署人，个人签署人必传
     * @param ApproverName 签署人名称，saas企业签署人，个人签署人必传
     */
    public void setApproverName(String ApproverName) {
        this.ApproverName = ApproverName;
    }

    /**
     * Get 签署人手机号，saas企业签署人，个人签署人必传 
     * @return ApproverMobile 签署人手机号，saas企业签署人，个人签署人必传
     */
    public String getApproverMobile() {
        return this.ApproverMobile;
    }

    /**
     * Set 签署人手机号，saas企业签署人，个人签署人必传
     * @param ApproverMobile 签署人手机号，saas企业签署人，个人签署人必传
     */
    public void setApproverMobile(String ApproverMobile) {
        this.ApproverMobile = ApproverMobile;
    }

    /**
     * Get 签署人Id，使用模板发起是，对应模板配置中的签署人RecipientId
注意：模板发起时该字段必填 
     * @return RecipientId 签署人Id，使用模板发起是，对应模板配置中的签署人RecipientId
注意：模板发起时该字段必填
     */
    public String getRecipientId() {
        return this.RecipientId;
    }

    /**
     * Set 签署人Id，使用模板发起是，对应模板配置中的签署人RecipientId
注意：模板发起时该字段必填
     * @param RecipientId 签署人Id，使用模板发起是，对应模板配置中的签署人RecipientId
注意：模板发起时该字段必填
     */
    public void setRecipientId(String RecipientId) {
        this.RecipientId = RecipientId;
    }

    /**
     * Get 签署前置条件：阅读时长限制，不传默认10s,最大300s，最小3s 
     * @return PreReadTime 签署前置条件：阅读时长限制，不传默认10s,最大300s，最小3s
     */
    public Long getPreReadTime() {
        return this.PreReadTime;
    }

    /**
     * Set 签署前置条件：阅读时长限制，不传默认10s,最大300s，最小3s
     * @param PreReadTime 签署前置条件：阅读时长限制，不传默认10s,最大300s，最小3s
     */
    public void setPreReadTime(Long PreReadTime) {
        this.PreReadTime = PreReadTime;
    }

    /**
     * Get 签署前置条件：阅读全文限制 
     * @return IsFullText 签署前置条件：阅读全文限制
     */
    public Boolean getIsFullText() {
        return this.IsFullText;
    }

    /**
     * Set 签署前置条件：阅读全文限制
     * @param IsFullText 签署前置条件：阅读全文限制
     */
    public void setIsFullText(Boolean IsFullText) {
        this.IsFullText = IsFullText;
    }

    /**
     * Get 通知类型：SMS（短信） NONE（不做通知）, 不传 默认SMS 
     * @return NotifyType 通知类型：SMS（短信） NONE（不做通知）, 不传 默认SMS
     * @deprecated
     */
    @Deprecated
    public String getNotifyType() {
        return this.NotifyType;
    }

    /**
     * Set 通知类型：SMS（短信） NONE（不做通知）, 不传 默认SMS
     * @param NotifyType 通知类型：SMS（短信） NONE（不做通知）, 不传 默认SMS
     * @deprecated
     */
    @Deprecated
    public void setNotifyType(String NotifyType) {
        this.NotifyType = NotifyType;
    }

    /**
     * Get 签署人配置 
     * @return ApproverOption 签署人配置
     */
    public CommonApproverOption getApproverOption() {
        return this.ApproverOption;
    }

    /**
     * Set 签署人配置
     * @param ApproverOption 签署人配置
     */
    public void setApproverOption(CommonApproverOption ApproverOption) {
        this.ApproverOption = ApproverOption;
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
        this.setParamSimple(map, prefix + "RecipientId", this.RecipientId);
        this.setParamSimple(map, prefix + "PreReadTime", this.PreReadTime);
        this.setParamSimple(map, prefix + "IsFullText", this.IsFullText);
        this.setParamSimple(map, prefix + "NotifyType", this.NotifyType);
        this.setParamObj(map, prefix + "ApproverOption.", this.ApproverOption);

    }
}

