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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BotStats extends AbstractModel{

    /**
    * 指标名称
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * 指标详细数据
    */
    @SerializedName("DetailData")
    @Expose
    private BotStatsDetailData [] DetailData;

    /**
     * Get 指标名称 
     * @return Metric 指标名称
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set 指标名称
     * @param Metric 指标名称
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get 指标详细数据 
     * @return DetailData 指标详细数据
     */
    public BotStatsDetailData [] getDetailData() {
        return this.DetailData;
    }

    /**
     * Set 指标详细数据
     * @param DetailData 指标详细数据
     */
    public void setDetailData(BotStatsDetailData [] DetailData) {
        this.DetailData = DetailData;
    }

    public BotStats() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BotStats(BotStats source) {
        if (source.Metric != null) {
            this.Metric = new String(source.Metric);
        }
        if (source.DetailData != null) {
            this.DetailData = new BotStatsDetailData[source.DetailData.length];
            for (int i = 0; i < source.DetailData.length; i++) {
                this.DetailData[i] = new BotStatsDetailData(source.DetailData[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamArrayObj(map, prefix + "DetailData.", this.DetailData);

    }
}

