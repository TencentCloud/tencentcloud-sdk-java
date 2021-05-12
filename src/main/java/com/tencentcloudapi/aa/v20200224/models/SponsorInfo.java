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

public class SponsorInfo extends AbstractModel{

    /**
    * 助力场景建议填写：活动发起人微信OpenID。
    */
    @SerializedName("SponsorOpenId")
    @Expose
    private String SponsorOpenId;

    /**
    * 助力场景建议填写：发起人设备号。
    */
    @SerializedName("SponsorDeviceId")
    @Expose
    private String SponsorDeviceId;

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
     * @return SponsorDeviceId 助力场景建议填写：发起人设备号。
     */
    public String getSponsorDeviceId() {
        return this.SponsorDeviceId;
    }

    /**
     * Set 助力场景建议填写：发起人设备号。
     * @param SponsorDeviceId 助力场景建议填写：发起人设备号。
     */
    public void setSponsorDeviceId(String SponsorDeviceId) {
        this.SponsorDeviceId = SponsorDeviceId;
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

    public SponsorInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SponsorInfo(SponsorInfo source) {
        if (source.SponsorOpenId != null) {
            this.SponsorOpenId = new String(source.SponsorOpenId);
        }
        if (source.SponsorDeviceId != null) {
            this.SponsorDeviceId = new String(source.SponsorDeviceId);
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
        this.setParamSimple(map, prefix + "SponsorDeviceId", this.SponsorDeviceId);
        this.setParamSimple(map, prefix + "SponsorPhone", this.SponsorPhone);
        this.setParamSimple(map, prefix + "SponsorIp", this.SponsorIp);
        this.setParamSimple(map, prefix + "CampaignUrl", this.CampaignUrl);

    }
}

