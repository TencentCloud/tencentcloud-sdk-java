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
package com.tencentcloudapi.zj.v20190121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCampaignRequest extends AbstractModel{

    /**
    * 商户证书
    */
    @SerializedName("License")
    @Expose
    private String License;

    /**
    * 短信活动发送时间
    */
    @SerializedName("SendTime")
    @Expose
    private Long SendTime;

    /**
    * 短信活动名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 发送策略
    */
    @SerializedName("Strategies")
    @Expose
    private PaasStrategy [] Strategies;

    /**
    * 废弃
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * 废弃
    */
    @SerializedName("CrowdID")
    @Expose
    private Long CrowdID;

    /**
    * 活动类型(0-短信,1-超短,不填默认为超短)
    */
    @SerializedName("SmsType")
    @Expose
    private Long SmsType;

    /**
     * Get 商户证书 
     * @return License 商户证书
     */
    public String getLicense() {
        return this.License;
    }

    /**
     * Set 商户证书
     * @param License 商户证书
     */
    public void setLicense(String License) {
        this.License = License;
    }

    /**
     * Get 短信活动发送时间 
     * @return SendTime 短信活动发送时间
     */
    public Long getSendTime() {
        return this.SendTime;
    }

    /**
     * Set 短信活动发送时间
     * @param SendTime 短信活动发送时间
     */
    public void setSendTime(Long SendTime) {
        this.SendTime = SendTime;
    }

    /**
     * Get 短信活动名称 
     * @return Name 短信活动名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 短信活动名称
     * @param Name 短信活动名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 发送策略 
     * @return Strategies 发送策略
     */
    public PaasStrategy [] getStrategies() {
        return this.Strategies;
    }

    /**
     * Set 发送策略
     * @param Strategies 发送策略
     */
    public void setStrategies(PaasStrategy [] Strategies) {
        this.Strategies = Strategies;
    }

    /**
     * Get 废弃 
     * @return TemplateId 废弃
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 废弃
     * @param TemplateId 废弃
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 废弃 
     * @return CrowdID 废弃
     */
    public Long getCrowdID() {
        return this.CrowdID;
    }

    /**
     * Set 废弃
     * @param CrowdID 废弃
     */
    public void setCrowdID(Long CrowdID) {
        this.CrowdID = CrowdID;
    }

    /**
     * Get 活动类型(0-短信,1-超短,不填默认为超短) 
     * @return SmsType 活动类型(0-短信,1-超短,不填默认为超短)
     */
    public Long getSmsType() {
        return this.SmsType;
    }

    /**
     * Set 活动类型(0-短信,1-超短,不填默认为超短)
     * @param SmsType 活动类型(0-短信,1-超短,不填默认为超短)
     */
    public void setSmsType(Long SmsType) {
        this.SmsType = SmsType;
    }

    public CreateCampaignRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCampaignRequest(CreateCampaignRequest source) {
        if (source.License != null) {
            this.License = new String(source.License);
        }
        if (source.SendTime != null) {
            this.SendTime = new Long(source.SendTime);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Strategies != null) {
            this.Strategies = new PaasStrategy[source.Strategies.length];
            for (int i = 0; i < source.Strategies.length; i++) {
                this.Strategies[i] = new PaasStrategy(source.Strategies[i]);
            }
        }
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
        }
        if (source.CrowdID != null) {
            this.CrowdID = new Long(source.CrowdID);
        }
        if (source.SmsType != null) {
            this.SmsType = new Long(source.SmsType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "License", this.License);
        this.setParamSimple(map, prefix + "SendTime", this.SendTime);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "Strategies.", this.Strategies);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "CrowdID", this.CrowdID);
        this.setParamSimple(map, prefix + "SmsType", this.SmsType);

    }
}

