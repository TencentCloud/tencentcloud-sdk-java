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

public class DescribeDeviceOperationLogRequest extends AbstractModel{

    /**
    * 设备实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 查询开始日期
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 查询结束日期
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 设备实例ID 
     * @return InstanceId 设备实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 设备实例ID
     * @param InstanceId 设备实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 查询开始日期 
     * @return StartTime 查询开始日期
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询开始日期
     * @param StartTime 查询开始日期
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查询结束日期 
     * @return EndTime 查询结束日期
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询结束日期
     * @param EndTime 查询结束日期
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量 
     * @return Limit 返回数量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量
     * @param Limit 返回数量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

