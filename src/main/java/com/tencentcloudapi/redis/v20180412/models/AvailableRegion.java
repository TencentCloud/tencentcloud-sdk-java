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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AvailableRegion extends AbstractModel {

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 可用区信息
    */
    @SerializedName("AvailableZones")
    @Expose
    private String [] AvailableZones;

    /**
     * Get 地域 
     * @return Region 地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
     * @param Region 地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 可用区信息 
     * @return AvailableZones 可用区信息
     */
    public String [] getAvailableZones() {
        return this.AvailableZones;
    }

    /**
     * Set 可用区信息
     * @param AvailableZones 可用区信息
     */
    public void setAvailableZones(String [] AvailableZones) {
        this.AvailableZones = AvailableZones;
    }

    public AvailableRegion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AvailableRegion(AvailableRegion source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.AvailableZones != null) {
            this.AvailableZones = new String[source.AvailableZones.length];
            for (int i = 0; i < source.AvailableZones.length; i++) {
                this.AvailableZones[i] = new String(source.AvailableZones[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamArraySimple(map, prefix + "AvailableZones.", this.AvailableZones);

    }
}

