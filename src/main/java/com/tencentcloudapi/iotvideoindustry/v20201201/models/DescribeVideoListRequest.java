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
package com.tencentcloudapi.iotvideoindustry.v20201201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVideoListRequest extends AbstractModel{

    /**
    * 开始时间戳，秒级
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 结束时间戳，秒级
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 偏移
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 限制
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 设备Id
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
     * Get 开始时间戳，秒级 
     * @return StartTime 开始时间戳，秒级
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间戳，秒级
     * @param StartTime 开始时间戳，秒级
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间戳，秒级 
     * @return EndTime 结束时间戳，秒级
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间戳，秒级
     * @param EndTime 结束时间戳，秒级
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 偏移 
     * @return Offset 偏移
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移
     * @param Offset 偏移
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 限制 
     * @return Limit 限制
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限制
     * @param Limit 限制
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 设备Id 
     * @return DeviceId 设备Id
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 设备Id
     * @param DeviceId 设备Id
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);

    }
}

