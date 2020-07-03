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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeScalingPoliciesRequest extends AbstractModel{

    /**
    * 服务部署ID
    */
    @SerializedName("FleetId")
    @Expose
    private String FleetId;

    /**
    * 状态过滤条件
    */
    @SerializedName("StatusFilter")
    @Expose
    private String StatusFilter;

    /**
    * 结果返回最大数量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回结果偏移
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 服务部署ID 
     * @return FleetId 服务部署ID
     */
    public String getFleetId() {
        return this.FleetId;
    }

    /**
     * Set 服务部署ID
     * @param FleetId 服务部署ID
     */
    public void setFleetId(String FleetId) {
        this.FleetId = FleetId;
    }

    /**
     * Get 状态过滤条件 
     * @return StatusFilter 状态过滤条件
     */
    public String getStatusFilter() {
        return this.StatusFilter;
    }

    /**
     * Set 状态过滤条件
     * @param StatusFilter 状态过滤条件
     */
    public void setStatusFilter(String StatusFilter) {
        this.StatusFilter = StatusFilter;
    }

    /**
     * Get 结果返回最大数量 
     * @return Offset 结果返回最大数量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 结果返回最大数量
     * @param Offset 结果返回最大数量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回结果偏移 
     * @return Limit 返回结果偏移
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回结果偏移
     * @param Limit 返回结果偏移
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FleetId", this.FleetId);
        this.setParamSimple(map, prefix + "StatusFilter", this.StatusFilter);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

