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

public class DescribeDDoSDataResponse extends AbstractModel{

    /**
    * DDoS统计数据数组
    */
    @SerializedName("Data")
    @Expose
    private DDoSStatsData [] Data;

    /**
    * 时间粒度：
min：1 分钟粒度
5min：5 分钟粒度
hour：1 小时粒度
day：天粒度
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * DDoS统计攻击带宽峰值数组
    */
    @SerializedName("AttackBandwidthData")
    @Expose
    private DDoSAttackBandwidthData [] AttackBandwidthData;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get DDoS统计数据数组 
     * @return Data DDoS统计数据数组
     */
    public DDoSStatsData [] getData() {
        return this.Data;
    }

    /**
     * Set DDoS统计数据数组
     * @param Data DDoS统计数据数组
     */
    public void setData(DDoSStatsData [] Data) {
        this.Data = Data;
    }

    /**
     * Get 时间粒度：
min：1 分钟粒度
5min：5 分钟粒度
hour：1 小时粒度
day：天粒度 
     * @return Interval 时间粒度：
min：1 分钟粒度
5min：5 分钟粒度
hour：1 小时粒度
day：天粒度
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set 时间粒度：
min：1 分钟粒度
5min：5 分钟粒度
hour：1 小时粒度
day：天粒度
     * @param Interval 时间粒度：
min：1 分钟粒度
5min：5 分钟粒度
hour：1 小时粒度
day：天粒度
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get DDoS统计攻击带宽峰值数组 
     * @return AttackBandwidthData DDoS统计攻击带宽峰值数组
     */
    public DDoSAttackBandwidthData [] getAttackBandwidthData() {
        return this.AttackBandwidthData;
    }

    /**
     * Set DDoS统计攻击带宽峰值数组
     * @param AttackBandwidthData DDoS统计攻击带宽峰值数组
     */
    public void setAttackBandwidthData(DDoSAttackBandwidthData [] AttackBandwidthData) {
        this.AttackBandwidthData = AttackBandwidthData;
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

    public DescribeDDoSDataResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDDoSDataResponse(DescribeDDoSDataResponse source) {
        if (source.Data != null) {
            this.Data = new DDoSStatsData[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new DDoSStatsData(source.Data[i]);
            }
        }
        if (source.Interval != null) {
            this.Interval = new String(source.Interval);
        }
        if (source.AttackBandwidthData != null) {
            this.AttackBandwidthData = new DDoSAttackBandwidthData[source.AttackBandwidthData.length];
            for (int i = 0; i < source.AttackBandwidthData.length; i++) {
                this.AttackBandwidthData[i] = new DDoSAttackBandwidthData(source.AttackBandwidthData[i]);
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
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamArrayObj(map, prefix + "AttackBandwidthData.", this.AttackBandwidthData);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

