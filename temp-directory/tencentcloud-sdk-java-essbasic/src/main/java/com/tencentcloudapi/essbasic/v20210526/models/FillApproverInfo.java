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

public class FillApproverInfo extends AbstractModel {

    /**
    * 签署方经办人在模板中配置的参与方ID，与控件绑定，是控件的归属方，ID为32位字符串。

    */
    @SerializedName("RecipientId")
    @Expose
    private String RecipientId;

    /**
    * 指定企业经办签署人OpenId
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * 签署人姓名
    */
    @SerializedName("ApproverName")
    @Expose
    private String ApproverName;

    /**
    * 签署人手机号码
    */
    @SerializedName("ApproverMobile")
    @Expose
    private String ApproverMobile;

    /**
    * 企业名称
    */
    @SerializedName("OrganizationName")
    @Expose
    private String OrganizationName;

    /**
    * 企业OpenId
    */
    @SerializedName("OrganizationOpenId")
    @Expose
    private String OrganizationOpenId;

    /**
    * 签署企业非渠道子客，默认为false，即表示同一渠道下的企业；如果为true，则目前表示接收方企业为SaaS企业, 为渠道子客时，organization_open_id+open_id 必传
    */
    @SerializedName("NotChannelOrganization")
    @Expose
    private String NotChannelOrganization;

    /**
     * Get 签署方经办人在模板中配置的参与方ID，与控件绑定，是控件的归属方，ID为32位字符串。
 
     * @return RecipientId 签署方经办人在模板中配置的参与方ID，与控件绑定，是控件的归属方，ID为32位字符串。

     */
    public String getRecipientId() {
        return this.RecipientId;
    }

    /**
     * Set 签署方经办人在模板中配置的参与方ID，与控件绑定，是控件的归属方，ID为32位字符串。

     * @param RecipientId 签署方经办人在模板中配置的参与方ID，与控件绑定，是控件的归属方，ID为32位字符串。

     */
    public void setRecipientId(String RecipientId) {
        this.RecipientId = RecipientId;
    }

    /**
     * Get 指定企业经办签署人OpenId 
     * @return OpenId 指定企业经办签署人OpenId
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set 指定企业经办签署人OpenId
     * @param OpenId 指定企业经办签署人OpenId
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * Get 签署人姓名 
     * @return ApproverName 签署人姓名
     */
    public String getApproverName() {
        return this.ApproverName;
    }

    /**
     * Set 签署人姓名
     * @param ApproverName 签署人姓名
     */
    public void setApproverName(String ApproverName) {
        this.ApproverName = ApproverName;
    }

    /**
     * Get 签署人手机号码 
     * @return ApproverMobile 签署人手机号码
     */
    public String getApproverMobile() {
        return this.ApproverMobile;
    }

    /**
     * Set 签署人手机号码
     * @param ApproverMobile 签署人手机号码
     */
    public void setApproverMobile(String ApproverMobile) {
        this.ApproverMobile = ApproverMobile;
    }

    /**
     * Get 企业名称 
     * @return OrganizationName 企业名称
     */
    public String getOrganizationName() {
        return this.OrganizationName;
    }

    /**
     * Set 企业名称
     * @param OrganizationName 企业名称
     */
    public void setOrganizationName(String OrganizationName) {
        this.OrganizationName = OrganizationName;
    }

    /**
     * Get 企业OpenId 
     * @return OrganizationOpenId 企业OpenId
     */
    public String getOrganizationOpenId() {
        return this.OrganizationOpenId;
    }

    /**
     * Set 企业OpenId
     * @param OrganizationOpenId 企业OpenId
     */
    public void setOrganizationOpenId(String OrganizationOpenId) {
        this.OrganizationOpenId = OrganizationOpenId;
    }

    /**
     * Get 签署企业非渠道子客，默认为false，即表示同一渠道下的企业；如果为true，则目前表示接收方企业为SaaS企业, 为渠道子客时，organization_open_id+open_id 必传 
     * @return NotChannelOrganization 签署企业非渠道子客，默认为false，即表示同一渠道下的企业；如果为true，则目前表示接收方企业为SaaS企业, 为渠道子客时，organization_open_id+open_id 必传
     */
    public String getNotChannelOrganization() {
        return this.NotChannelOrganization;
    }

    /**
     * Set 签署企业非渠道子客，默认为false，即表示同一渠道下的企业；如果为true，则目前表示接收方企业为SaaS企业, 为渠道子客时，organization_open_id+open_id 必传
     * @param NotChannelOrganization 签署企业非渠道子客，默认为false，即表示同一渠道下的企业；如果为true，则目前表示接收方企业为SaaS企业, 为渠道子客时，organization_open_id+open_id 必传
     */
    public void setNotChannelOrganization(String NotChannelOrganization) {
        this.NotChannelOrganization = NotChannelOrganization;
    }

    public FillApproverInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FillApproverInfo(FillApproverInfo source) {
        if (source.RecipientId != null) {
            this.RecipientId = new String(source.RecipientId);
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
        if (source.OrganizationName != null) {
            this.OrganizationName = new String(source.OrganizationName);
        }
        if (source.OrganizationOpenId != null) {
            this.OrganizationOpenId = new String(source.OrganizationOpenId);
        }
        if (source.NotChannelOrganization != null) {
            this.NotChannelOrganization = new String(source.NotChannelOrganization);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RecipientId", this.RecipientId);
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);
        this.setParamSimple(map, prefix + "ApproverName", this.ApproverName);
        this.setParamSimple(map, prefix + "ApproverMobile", this.ApproverMobile);
        this.setParamSimple(map, prefix + "OrganizationName", this.OrganizationName);
        this.setParamSimple(map, prefix + "OrganizationOpenId", this.OrganizationOpenId);
        this.setParamSimple(map, prefix + "NotChannelOrganization", this.NotChannelOrganization);

    }
}

