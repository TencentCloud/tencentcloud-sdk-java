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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRealServerStatisticsResponse extends AbstractModel{

    /**
    * 指定监听器的源站状态统计数据
    */
    @SerializedName("StatisticsData")
    @Expose
    private StatisticsDataInfo [] StatisticsData;

    /**
    * 多个源站状态统计数据
    */
    @SerializedName("RsStatisticsData")
    @Expose
    private MetricStatisticsInfo [] RsStatisticsData;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 指定监听器的源站状态统计数据 
     * @return StatisticsData 指定监听器的源站状态统计数据
     */
    public StatisticsDataInfo [] getStatisticsData() {
        return this.StatisticsData;
    }

    /**
     * Set 指定监听器的源站状态统计数据
     * @param StatisticsData 指定监听器的源站状态统计数据
     */
    public void setStatisticsData(StatisticsDataInfo [] StatisticsData) {
        this.StatisticsData = StatisticsData;
    }

    /**
     * Get 多个源站状态统计数据 
     * @return RsStatisticsData 多个源站状态统计数据
     */
    public MetricStatisticsInfo [] getRsStatisticsData() {
        return this.RsStatisticsData;
    }

    /**
     * Set 多个源站状态统计数据
     * @param RsStatisticsData 多个源站状态统计数据
     */
    public void setRsStatisticsData(MetricStatisticsInfo [] RsStatisticsData) {
        this.RsStatisticsData = RsStatisticsData;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeRealServerStatisticsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRealServerStatisticsResponse(DescribeRealServerStatisticsResponse source) {
        if (source.StatisticsData != null) {
            this.StatisticsData = new StatisticsDataInfo[source.StatisticsData.length];
            for (int i = 0; i < source.StatisticsData.length; i++) {
                this.StatisticsData[i] = new StatisticsDataInfo(source.StatisticsData[i]);
            }
        }
        if (source.RsStatisticsData != null) {
            this.RsStatisticsData = new MetricStatisticsInfo[source.RsStatisticsData.length];
            for (int i = 0; i < source.RsStatisticsData.length; i++) {
                this.RsStatisticsData[i] = new MetricStatisticsInfo(source.RsStatisticsData[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "StatisticsData.", this.StatisticsData);
        this.setParamArrayObj(map, prefix + "RsStatisticsData.", this.RsStatisticsData);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

