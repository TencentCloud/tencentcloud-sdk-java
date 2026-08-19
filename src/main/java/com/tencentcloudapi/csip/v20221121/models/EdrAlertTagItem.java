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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EdrAlertTagItem extends AbstractModel {

    /**
    * <p>告警ID</p>
    */
    @SerializedName("AlertId")
    @Expose
    private String AlertId;

    /**
    * <p>腾讯云标签</p>
    */
    @SerializedName("CloudTags")
    @Expose
    private TagItem [] CloudTags;

    /**
    * <p>安全中心标签</p>
    */
    @SerializedName("CSIPTags")
    @Expose
    private CSIPTag [] CSIPTags;

    /**
    * <p>情报标签</p>
    */
    @SerializedName("ThreatTags")
    @Expose
    private String [] ThreatTags;

    /**
    * <p>IP情报信息</p>
    */
    @SerializedName("IPIntel")
    @Expose
    private IPIntelInfo IPIntel;

    /**
     * Get <p>告警ID</p> 
     * @return AlertId <p>告警ID</p>
     */
    public String getAlertId() {
        return this.AlertId;
    }

    /**
     * Set <p>告警ID</p>
     * @param AlertId <p>告警ID</p>
     */
    public void setAlertId(String AlertId) {
        this.AlertId = AlertId;
    }

    /**
     * Get <p>腾讯云标签</p> 
     * @return CloudTags <p>腾讯云标签</p>
     */
    public TagItem [] getCloudTags() {
        return this.CloudTags;
    }

    /**
     * Set <p>腾讯云标签</p>
     * @param CloudTags <p>腾讯云标签</p>
     */
    public void setCloudTags(TagItem [] CloudTags) {
        this.CloudTags = CloudTags;
    }

    /**
     * Get <p>安全中心标签</p> 
     * @return CSIPTags <p>安全中心标签</p>
     */
    public CSIPTag [] getCSIPTags() {
        return this.CSIPTags;
    }

    /**
     * Set <p>安全中心标签</p>
     * @param CSIPTags <p>安全中心标签</p>
     */
    public void setCSIPTags(CSIPTag [] CSIPTags) {
        this.CSIPTags = CSIPTags;
    }

    /**
     * Get <p>情报标签</p> 
     * @return ThreatTags <p>情报标签</p>
     */
    public String [] getThreatTags() {
        return this.ThreatTags;
    }

    /**
     * Set <p>情报标签</p>
     * @param ThreatTags <p>情报标签</p>
     */
    public void setThreatTags(String [] ThreatTags) {
        this.ThreatTags = ThreatTags;
    }

    /**
     * Get <p>IP情报信息</p> 
     * @return IPIntel <p>IP情报信息</p>
     */
    public IPIntelInfo getIPIntel() {
        return this.IPIntel;
    }

    /**
     * Set <p>IP情报信息</p>
     * @param IPIntel <p>IP情报信息</p>
     */
    public void setIPIntel(IPIntelInfo IPIntel) {
        this.IPIntel = IPIntel;
    }

    public EdrAlertTagItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EdrAlertTagItem(EdrAlertTagItem source) {
        if (source.AlertId != null) {
            this.AlertId = new String(source.AlertId);
        }
        if (source.CloudTags != null) {
            this.CloudTags = new TagItem[source.CloudTags.length];
            for (int i = 0; i < source.CloudTags.length; i++) {
                this.CloudTags[i] = new TagItem(source.CloudTags[i]);
            }
        }
        if (source.CSIPTags != null) {
            this.CSIPTags = new CSIPTag[source.CSIPTags.length];
            for (int i = 0; i < source.CSIPTags.length; i++) {
                this.CSIPTags[i] = new CSIPTag(source.CSIPTags[i]);
            }
        }
        if (source.ThreatTags != null) {
            this.ThreatTags = new String[source.ThreatTags.length];
            for (int i = 0; i < source.ThreatTags.length; i++) {
                this.ThreatTags[i] = new String(source.ThreatTags[i]);
            }
        }
        if (source.IPIntel != null) {
            this.IPIntel = new IPIntelInfo(source.IPIntel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AlertId", this.AlertId);
        this.setParamArrayObj(map, prefix + "CloudTags.", this.CloudTags);
        this.setParamArrayObj(map, prefix + "CSIPTags.", this.CSIPTags);
        this.setParamArraySimple(map, prefix + "ThreatTags.", this.ThreatTags);
        this.setParamObj(map, prefix + "IPIntel.", this.IPIntel);

    }
}

