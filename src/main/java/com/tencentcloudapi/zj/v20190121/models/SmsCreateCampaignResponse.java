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

public class SmsCreateCampaignResponse extends AbstractModel{

    /**
    * 活动id
    */
    @SerializedName("CampaignId")
    @Expose
    private Long CampaignId;

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

    public SmsCreateCampaignResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmsCreateCampaignResponse(SmsCreateCampaignResponse source) {
        if (source.CampaignId != null) {
            this.CampaignId = new Long(source.CampaignId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CampaignId", this.CampaignId);

    }
}

