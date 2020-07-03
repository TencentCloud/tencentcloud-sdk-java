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
package com.tencentcloudapi.bm.v20180423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDevicePriceInfoRequest extends AbstractModel{

    /**
    * 需要查询的实例列表
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 购买时长单位，当前只支持取值为m
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * 购买时长
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
     * Get 需要查询的实例列表 
     * @return InstanceIds 需要查询的实例列表
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 需要查询的实例列表
     * @param InstanceIds 需要查询的实例列表
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 购买时长单位，当前只支持取值为m 
     * @return TimeUnit 购买时长单位，当前只支持取值为m
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set 购买时长单位，当前只支持取值为m
     * @param TimeUnit 购买时长单位，当前只支持取值为m
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get 购买时长 
     * @return TimeSpan 购买时长
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set 购买时长
     * @param TimeSpan 购买时长
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);

    }
}

