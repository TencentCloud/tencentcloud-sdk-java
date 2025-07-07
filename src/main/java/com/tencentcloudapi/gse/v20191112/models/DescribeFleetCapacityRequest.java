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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFleetCapacityRequest extends AbstractModel {

    /**
    * 服务器舰队ID列表
    */
    @SerializedName("FleetIds")
    @Expose
    private String [] FleetIds;

    /**
    * 结果返回最大数量，最大值 100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 返回结果偏移，最小值 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 服务器舰队ID列表 
     * @return FleetIds 服务器舰队ID列表
     */
    public String [] getFleetIds() {
        return this.FleetIds;
    }

    /**
     * Set 服务器舰队ID列表
     * @param FleetIds 服务器舰队ID列表
     */
    public void setFleetIds(String [] FleetIds) {
        this.FleetIds = FleetIds;
    }

    /**
     * Get 结果返回最大数量，最大值 100 
     * @return Limit 结果返回最大数量，最大值 100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 结果返回最大数量，最大值 100
     * @param Limit 结果返回最大数量，最大值 100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 返回结果偏移，最小值 0 
     * @return Offset 返回结果偏移，最小值 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 返回结果偏移，最小值 0
     * @param Offset 返回结果偏移，最小值 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeFleetCapacityRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFleetCapacityRequest(DescribeFleetCapacityRequest source) {
        if (source.FleetIds != null) {
            this.FleetIds = new String[source.FleetIds.length];
            for (int i = 0; i < source.FleetIds.length; i++) {
                this.FleetIds[i] = new String(source.FleetIds[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "FleetIds.", this.FleetIds);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

