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

public class SmsCampaignStatisticsData extends AbstractModel{

    /**
    * 活动Id
    */
    @SerializedName("CampaignId")
    @Expose
    private Long CampaignId;

    /**
    * 统计数据
    */
    @SerializedName("Statistics")
    @Expose
    private SmsCampaignStatisticsCrowdData [] Statistics;

    /**
     * Get 活动Id 
     * @return CampaignId 活动Id
     */
    public Long getCampaignId() {
        return this.CampaignId;
    }

    /**
     * Set 活动Id
     * @param CampaignId 活动Id
     */
    public void setCampaignId(Long CampaignId) {
        this.CampaignId = CampaignId;
    }

    /**
     * Get 统计数据 
     * @return Statistics 统计数据
     */
    public SmsCampaignStatisticsCrowdData [] getStatistics() {
        return this.Statistics;
    }

    /**
     * Set 统计数据
     * @param Statistics 统计数据
     */
    public void setStatistics(SmsCampaignStatisticsCrowdData [] Statistics) {
        this.Statistics = Statistics;
    }

    public SmsCampaignStatisticsData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmsCampaignStatisticsData(SmsCampaignStatisticsData source) {
        if (source.CampaignId != null) {
            this.CampaignId = new Long(source.CampaignId);
        }
        if (source.Statistics != null) {
            this.Statistics = new SmsCampaignStatisticsCrowdData[source.Statistics.length];
            for (int i = 0; i < source.Statistics.length; i++) {
                this.Statistics[i] = new SmsCampaignStatisticsCrowdData(source.Statistics[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CampaignId", this.CampaignId);
        this.setParamArrayObj(map, prefix + "Statistics.", this.Statistics);

    }
}

