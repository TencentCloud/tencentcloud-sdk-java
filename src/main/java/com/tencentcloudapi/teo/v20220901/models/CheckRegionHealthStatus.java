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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckRegionHealthStatus extends AbstractModel {

    /**
    * 健康检查区域，ISO-3166-1 两位字母代码。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 单健康检查区域下探测源站的健康状态，取值有：
<li>Healthy：健康；</li>
<li>Unhealthy：不健康；</li>
<li> Undetected：未探测到数据。</li>说明：单健康检查区域下所有源站为健康，则状态为健康，否则为不健康。
    */
    @SerializedName("Healthy")
    @Expose
    private String Healthy;

    /**
    * 源站健康状态。
    */
    @SerializedName("OriginHealthStatus")
    @Expose
    private OriginHealthStatus [] OriginHealthStatus;

    /**
     * Get 健康检查区域，ISO-3166-1 两位字母代码。 
     * @return Region 健康检查区域，ISO-3166-1 两位字母代码。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 健康检查区域，ISO-3166-1 两位字母代码。
     * @param Region 健康检查区域，ISO-3166-1 两位字母代码。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 单健康检查区域下探测源站的健康状态，取值有：
<li>Healthy：健康；</li>
<li>Unhealthy：不健康；</li>
<li> Undetected：未探测到数据。</li>说明：单健康检查区域下所有源站为健康，则状态为健康，否则为不健康。 
     * @return Healthy 单健康检查区域下探测源站的健康状态，取值有：
<li>Healthy：健康；</li>
<li>Unhealthy：不健康；</li>
<li> Undetected：未探测到数据。</li>说明：单健康检查区域下所有源站为健康，则状态为健康，否则为不健康。
     */
    public String getHealthy() {
        return this.Healthy;
    }

    /**
     * Set 单健康检查区域下探测源站的健康状态，取值有：
<li>Healthy：健康；</li>
<li>Unhealthy：不健康；</li>
<li> Undetected：未探测到数据。</li>说明：单健康检查区域下所有源站为健康，则状态为健康，否则为不健康。
     * @param Healthy 单健康检查区域下探测源站的健康状态，取值有：
<li>Healthy：健康；</li>
<li>Unhealthy：不健康；</li>
<li> Undetected：未探测到数据。</li>说明：单健康检查区域下所有源站为健康，则状态为健康，否则为不健康。
     */
    public void setHealthy(String Healthy) {
        this.Healthy = Healthy;
    }

    /**
     * Get 源站健康状态。 
     * @return OriginHealthStatus 源站健康状态。
     */
    public OriginHealthStatus [] getOriginHealthStatus() {
        return this.OriginHealthStatus;
    }

    /**
     * Set 源站健康状态。
     * @param OriginHealthStatus 源站健康状态。
     */
    public void setOriginHealthStatus(OriginHealthStatus [] OriginHealthStatus) {
        this.OriginHealthStatus = OriginHealthStatus;
    }

    public CheckRegionHealthStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckRegionHealthStatus(CheckRegionHealthStatus source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Healthy != null) {
            this.Healthy = new String(source.Healthy);
        }
        if (source.OriginHealthStatus != null) {
            this.OriginHealthStatus = new OriginHealthStatus[source.OriginHealthStatus.length];
            for (int i = 0; i < source.OriginHealthStatus.length; i++) {
                this.OriginHealthStatus[i] = new OriginHealthStatus(source.OriginHealthStatus[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Healthy", this.Healthy);
        this.setParamArrayObj(map, prefix + "OriginHealthStatus.", this.OriginHealthStatus);

    }
}

