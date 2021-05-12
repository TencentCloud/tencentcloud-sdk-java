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

public class DescribeSmsCampaignStatisticsRequest extends AbstractModel{

    /**
    * 活动id
    */
    @SerializedName("CampaignId")
    @Expose
    private Long CampaignId;

    /**
    * 商户证书
    */
    @SerializedName("License")
    @Expose
    private String License;

    /**
     * Get 活动id 
     * @return CampaignId 活动id
     */
    public Long getCampaignId() {
        return this.CampaignId;
    }

    /**
     * Set 活动id
     * @param CampaignId 活动id
     */
    public void setCampaignId(Long CampaignId) {
        this.CampaignId = CampaignId;
    }

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

    public DescribeSmsCampaignStatisticsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSmsCampaignStatisticsRequest(DescribeSmsCampaignStatisticsRequest source) {
        if (source.CampaignId != null) {
            this.CampaignId = new Long(source.CampaignId);
        }
        if (source.License != null) {
            this.License = new String(source.License);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CampaignId", this.CampaignId);
        this.setParamSimple(map, prefix + "License", this.License);

    }
}

