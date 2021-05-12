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
package com.tencentcloudapi.aa.v20200224.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CrowdAntiRushInfo extends AbstractModel{

    /**
    * 助力场景建议填写：活动发起人微信OpenID。
    */
    @SerializedName("SponsorOpenId")
    @Expose
    private String SponsorOpenId;

    /**
    * 助力场景建议填写：发起人设备号。
    */
    @SerializedName("SponsorDeviceNumber")
    @Expose
    private String SponsorDeviceNumber;

    /**
    * 助力场景建议填写：发起人手机号。
    */
    @SerializedName("SponsorPhone")
    @Expose
    private String SponsorPhone;

    /**
    * 助力场景建议填写：发起人IP。
    */
    @SerializedName("SponsorIp")
    @Expose
    private String SponsorIp;

    /**
    * 助力场景建议填写：活动链接。
    */
    @SerializedName("CampaignUrl")
    @Expose
    private String CampaignUrl;

    /**
     * Get 助力场景建议填写：活动发起人微信OpenID。 
     * @return SponsorOpenId 助力场景建议填写：活动发起人微信OpenID。
     */
    public String getSponsorOpenId() {
        return this.SponsorOpenId;
    }

    /**
     * Set 助力场景建议填写：活动发起人微信OpenID。
     * @param SponsorOpenId 助力场景建议填写：活动发起人微信OpenID。
     */
    public void setSponsorOpenId(String SponsorOpenId) {
        this.SponsorOpenId = SponsorOpenId;
    }

    /**
     * Get 助力场景建议填写：发起人设备号。 
     * @return SponsorDeviceNumber 助力场景建议填写：发起人设备号。
     */
    public String getSponsorDeviceNumber() {
        return this.SponsorDeviceNumber;
    }

    /**
     * Set 助力场景建议填写：发起人设备号。
     * @param SponsorDeviceNumber 助力场景建议填写：发起人设备号。
     */
    public void setSponsorDeviceNumber(String SponsorDeviceNumber) {
        this.SponsorDeviceNumber = SponsorDeviceNumber;
    }

    /**
     * Get 助力场景建议填写：发起人手机号。 
     * @return SponsorPhone 助力场景建议填写：发起人手机号。
     */
    public String getSponsorPhone() {
        return this.SponsorPhone;
    }

    /**
     * Set 助力场景建议填写：发起人手机号。
     * @param SponsorPhone 助力场景建议填写：发起人手机号。
     */
    public void setSponsorPhone(String SponsorPhone) {
        this.SponsorPhone = SponsorPhone;
    }

    /**
     * Get 助力场景建议填写：发起人IP。 
     * @return SponsorIp 助力场景建议填写：发起人IP。
     */
    public String getSponsorIp() {
        return this.SponsorIp;
    }

    /**
     * Set 助力场景建议填写：发起人IP。
     * @param SponsorIp 助力场景建议填写：发起人IP。
     */
    public void setSponsorIp(String SponsorIp) {
        this.SponsorIp = SponsorIp;
    }

    /**
     * Get 助力场景建议填写：活动链接。 
     * @return CampaignUrl 助力场景建议填写：活动链接。
     */
    public String getCampaignUrl() {
        return this.CampaignUrl;
    }

    /**
     * Set 助力场景建议填写：活动链接。
     * @param CampaignUrl 助力场景建议填写：活动链接。
     */
    public void setCampaignUrl(String CampaignUrl) {
        this.CampaignUrl = CampaignUrl;
    }

    public CrowdAntiRushInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CrowdAntiRushInfo(CrowdAntiRushInfo source) {
        if (source.SponsorOpenId != null) {
            this.SponsorOpenId = new String(source.SponsorOpenId);
        }
        if (source.SponsorDeviceNumber != null) {
            this.SponsorDeviceNumber = new String(source.SponsorDeviceNumber);
        }
        if (source.SponsorPhone != null) {
            this.SponsorPhone = new String(source.SponsorPhone);
        }
        if (source.SponsorIp != null) {
            this.SponsorIp = new String(source.SponsorIp);
        }
        if (source.CampaignUrl != null) {
            this.CampaignUrl = new String(source.CampaignUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SponsorOpenId", this.SponsorOpenId);
        this.setParamSimple(map, prefix + "SponsorDeviceNumber", this.SponsorDeviceNumber);
        this.setParamSimple(map, prefix + "SponsorPhone", this.SponsorPhone);
        this.setParamSimple(map, prefix + "SponsorIp", this.SponsorIp);
        this.setParamSimple(map, prefix + "CampaignUrl", this.CampaignUrl);

    }
}

