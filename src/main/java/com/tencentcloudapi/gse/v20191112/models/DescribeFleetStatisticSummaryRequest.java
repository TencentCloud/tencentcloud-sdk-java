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

public class DescribeFleetStatisticSummaryRequest extends AbstractModel{

    /**
    * 服务器舰队ID
    */
    @SerializedName("FleetId")
    @Expose
    private String FleetId;

    /**
    * 查询开始时间，时间格式: YYYY-MM-DD hh:mm:ss
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * 查询结束时间，时间格式: YYYY-MM-DD hh:mm:ss
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 服务器舰队ID 
     * @return FleetId 服务器舰队ID
     */
    public String getFleetId() {
        return this.FleetId;
    }

    /**
     * Set 服务器舰队ID
     * @param FleetId 服务器舰队ID
     */
    public void setFleetId(String FleetId) {
        this.FleetId = FleetId;
    }

    /**
     * Get 查询开始时间，时间格式: YYYY-MM-DD hh:mm:ss 
     * @return BeginTime 查询开始时间，时间格式: YYYY-MM-DD hh:mm:ss
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 查询开始时间，时间格式: YYYY-MM-DD hh:mm:ss
     * @param BeginTime 查询开始时间，时间格式: YYYY-MM-DD hh:mm:ss
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 查询结束时间，时间格式: YYYY-MM-DD hh:mm:ss 
     * @return EndTime 查询结束时间，时间格式: YYYY-MM-DD hh:mm:ss
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询结束时间，时间格式: YYYY-MM-DD hh:mm:ss
     * @param EndTime 查询结束时间，时间格式: YYYY-MM-DD hh:mm:ss
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public DescribeFleetStatisticSummaryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFleetStatisticSummaryRequest(DescribeFleetStatisticSummaryRequest source) {
        if (source.FleetId != null) {
            this.FleetId = new String(source.FleetId);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FleetId", this.FleetId);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

