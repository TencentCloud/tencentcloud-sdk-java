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

public class GetVideoListByConRequest extends AbstractModel{

    /**
    * 设备唯一标识
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 限制量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 通道唯一标识，对于NVR设备，多通道IPC设备，设备编码与通道编码不一致的IPC设备，此字段为必填
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * 0：查询指定日期的录像；1：查询最近一天的录像；默认0
    */
    @SerializedName("LatestDay")
    @Expose
    private Long LatestDay;

    /**
    * 指定某天。取值【YYYY-MM-DD】
为空时默认查询最近一天的记录
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 1: 云端录制 2: 本地录制
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
     * Get 设备唯一标识 
     * @return DeviceId 设备唯一标识
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 设备唯一标识
     * @param DeviceId 设备唯一标识
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
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
     * Get 限制量 
     * @return Limit 限制量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限制量
     * @param Limit 限制量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 通道唯一标识，对于NVR设备，多通道IPC设备，设备编码与通道编码不一致的IPC设备，此字段为必填 
     * @return ChannelId 通道唯一标识，对于NVR设备，多通道IPC设备，设备编码与通道编码不一致的IPC设备，此字段为必填
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set 通道唯一标识，对于NVR设备，多通道IPC设备，设备编码与通道编码不一致的IPC设备，此字段为必填
     * @param ChannelId 通道唯一标识，对于NVR设备，多通道IPC设备，设备编码与通道编码不一致的IPC设备，此字段为必填
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get 0：查询指定日期的录像；1：查询最近一天的录像；默认0 
     * @return LatestDay 0：查询指定日期的录像；1：查询最近一天的录像；默认0
     */
    public Long getLatestDay() {
        return this.LatestDay;
    }

    /**
     * Set 0：查询指定日期的录像；1：查询最近一天的录像；默认0
     * @param LatestDay 0：查询指定日期的录像；1：查询最近一天的录像；默认0
     */
    public void setLatestDay(Long LatestDay) {
        this.LatestDay = LatestDay;
    }

    /**
     * Get 指定某天。取值【YYYY-MM-DD】
为空时默认查询最近一天的记录 
     * @return Date 指定某天。取值【YYYY-MM-DD】
为空时默认查询最近一天的记录
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 指定某天。取值【YYYY-MM-DD】
为空时默认查询最近一天的记录
     * @param Date 指定某天。取值【YYYY-MM-DD】
为空时默认查询最近一天的记录
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get 1: 云端录制 2: 本地录制 
     * @return Type 1: 云端录制 2: 本地录制
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 1: 云端录制 2: 本地录制
     * @param Type 1: 云端录制 2: 本地录制
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    public GetVideoListByConRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetVideoListByConRequest(GetVideoListByConRequest source) {
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.LatestDay != null) {
            this.LatestDay = new Long(source.LatestDay);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "LatestDay", this.LatestDay);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

