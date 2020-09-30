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

public class DescribeFleetStatisticFlowsRequest extends AbstractModel{

    /**
    * 服务部署ID
    */
    @SerializedName("FleetId")
    @Expose
    private String FleetId;

    /**
    * 查询开始时间
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * 查询结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 结果返回最大数量，最小值0，最大值100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 返回结果偏移，最小值0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

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
     * Get 查询开始时间 
     * @return BeginTime 查询开始时间
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 查询开始时间
     * @param BeginTime 查询开始时间
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 查询结束时间 
     * @return EndTime 查询结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询结束时间
     * @param EndTime 查询结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 结果返回最大数量，最小值0，最大值100 
     * @return Limit 结果返回最大数量，最小值0，最大值100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 结果返回最大数量，最小值0，最大值100
     * @param Limit 结果返回最大数量，最小值0，最大值100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 返回结果偏移，最小值0 
     * @return Offset 返回结果偏移，最小值0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 返回结果偏移，最小值0
     * @param Offset 返回结果偏移，最小值0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FleetId", this.FleetId);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

