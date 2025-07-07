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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OriginHealthStatus extends AbstractModel {

    /**
    * 源站。
    */
    @SerializedName("Origin")
    @Expose
    private String Origin;

    /**
    * 源站健康状态，取值有：
<li>Healthy：健康；</li>
<li>Unhealthy：不健康；</li>
<li>Undetected：未探测到数据。</li>

    */
    @SerializedName("Healthy")
    @Expose
    private String Healthy;

    /**
     * Get 源站。 
     * @return Origin 源站。
     */
    public String getOrigin() {
        return this.Origin;
    }

    /**
     * Set 源站。
     * @param Origin 源站。
     */
    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }

    /**
     * Get 源站健康状态，取值有：
<li>Healthy：健康；</li>
<li>Unhealthy：不健康；</li>
<li>Undetected：未探测到数据。</li>
 
     * @return Healthy 源站健康状态，取值有：
<li>Healthy：健康；</li>
<li>Unhealthy：不健康；</li>
<li>Undetected：未探测到数据。</li>

     */
    public String getHealthy() {
        return this.Healthy;
    }

    /**
     * Set 源站健康状态，取值有：
<li>Healthy：健康；</li>
<li>Unhealthy：不健康；</li>
<li>Undetected：未探测到数据。</li>

     * @param Healthy 源站健康状态，取值有：
<li>Healthy：健康；</li>
<li>Unhealthy：不健康；</li>
<li>Undetected：未探测到数据。</li>

     */
    public void setHealthy(String Healthy) {
        this.Healthy = Healthy;
    }

    public OriginHealthStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OriginHealthStatus(OriginHealthStatus source) {
        if (source.Origin != null) {
            this.Origin = new String(source.Origin);
        }
        if (source.Healthy != null) {
            this.Healthy = new String(source.Healthy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Origin", this.Origin);
        this.setParamSimple(map, prefix + "Healthy", this.Healthy);

    }
}

