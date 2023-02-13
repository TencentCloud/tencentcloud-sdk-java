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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePrometheusZonesRequest extends AbstractModel{

    /**
    * 地域 ID（RegionId 和 RegionName 只需要填一个）
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 地域名（RegionId 和 RegionName 只需要填一个）
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
     * Get 地域 ID（RegionId 和 RegionName 只需要填一个） 
     * @return RegionId 地域 ID（RegionId 和 RegionName 只需要填一个）
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 地域 ID（RegionId 和 RegionName 只需要填一个）
     * @param RegionId 地域 ID（RegionId 和 RegionName 只需要填一个）
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 地域名（RegionId 和 RegionName 只需要填一个） 
     * @return RegionName 地域名（RegionId 和 RegionName 只需要填一个）
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set 地域名（RegionId 和 RegionName 只需要填一个）
     * @param RegionName 地域名（RegionId 和 RegionName 只需要填一个）
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    public DescribePrometheusZonesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePrometheusZonesRequest(DescribePrometheusZonesRequest source) {
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);

    }
}

