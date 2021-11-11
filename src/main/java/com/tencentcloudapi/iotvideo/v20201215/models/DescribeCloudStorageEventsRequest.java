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
package com.tencentcloudapi.iotvideo.v20201215.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCloudStorageEventsRequest extends AbstractModel{

    /**
    * 产品ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 设备名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 起始时间（Unix 时间戳，秒级）, 为0 表示 当前时间 - 24h
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 结束时间（Unix 时间戳，秒级）, 为0 表示当前时间
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 请求上下文, 用作查询游标
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * 单次获取的历史数据项目的最大数量, 缺省10
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 事件标识符，可以用来指定查询特定的事件，如果不指定，则查询所有事件。
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
    * 用户ID
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 通道ID 非NVR设备则不填 NVR设备则必填 默认为无
    */
    @SerializedName("ChannelId")
    @Expose
    private Long ChannelId;

    /**
     * Get 产品ID 
     * @return ProductId 产品ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品ID
     * @param ProductId 产品ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 设备名称 
     * @return DeviceName 设备名称
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 设备名称
     * @param DeviceName 设备名称
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 起始时间（Unix 时间戳，秒级）, 为0 表示 当前时间 - 24h 
     * @return StartTime 起始时间（Unix 时间戳，秒级）, 为0 表示 当前时间 - 24h
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始时间（Unix 时间戳，秒级）, 为0 表示 当前时间 - 24h
     * @param StartTime 起始时间（Unix 时间戳，秒级）, 为0 表示 当前时间 - 24h
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间（Unix 时间戳，秒级）, 为0 表示当前时间 
     * @return EndTime 结束时间（Unix 时间戳，秒级）, 为0 表示当前时间
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间（Unix 时间戳，秒级）, 为0 表示当前时间
     * @param EndTime 结束时间（Unix 时间戳，秒级）, 为0 表示当前时间
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 请求上下文, 用作查询游标 
     * @return Context 请求上下文, 用作查询游标
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set 请求上下文, 用作查询游标
     * @param Context 请求上下文, 用作查询游标
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get 单次获取的历史数据项目的最大数量, 缺省10 
     * @return Size 单次获取的历史数据项目的最大数量, 缺省10
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 单次获取的历史数据项目的最大数量, 缺省10
     * @param Size 单次获取的历史数据项目的最大数量, 缺省10
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 事件标识符，可以用来指定查询特定的事件，如果不指定，则查询所有事件。 
     * @return EventId 事件标识符，可以用来指定查询特定的事件，如果不指定，则查询所有事件。
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set 事件标识符，可以用来指定查询特定的事件，如果不指定，则查询所有事件。
     * @param EventId 事件标识符，可以用来指定查询特定的事件，如果不指定，则查询所有事件。
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    /**
     * Get 用户ID 
     * @return UserId 用户ID
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户ID
     * @param UserId 用户ID
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 通道ID 非NVR设备则不填 NVR设备则必填 默认为无 
     * @return ChannelId 通道ID 非NVR设备则不填 NVR设备则必填 默认为无
     */
    public Long getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set 通道ID 非NVR设备则不填 NVR设备则必填 默认为无
     * @param ChannelId 通道ID 非NVR设备则不填 NVR设备则必填 默认为无
     */
    public void setChannelId(Long ChannelId) {
        this.ChannelId = ChannelId;
    }

    public DescribeCloudStorageEventsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudStorageEventsRequest(DescribeCloudStorageEventsRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.EventId != null) {
            this.EventId = new String(source.EventId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new Long(source.ChannelId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Context", this.Context);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);

    }
}

