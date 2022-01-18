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

public class DescribeChannelLocalRecordURLRequest extends AbstractModel{

    /**
    * 设备唯一标识
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * 通道唯一标识
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * 录像文件Id，通过获取本地录像返回
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * UNIX 时间戳，30天内，URL失效时间，如180s无人观看此流则URL提前失效
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * 录像文件推送的开始时间，需要在RecordId参数起始时间内，可以通过此参数控制回放流起始点
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 录像文件推送的结束时间，需要在RecordId参数起始时间内，可以通过此参数控制回放流起始点
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

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
     * Get 通道唯一标识 
     * @return ChannelId 通道唯一标识
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set 通道唯一标识
     * @param ChannelId 通道唯一标识
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get 录像文件Id，通过获取本地录像返回 
     * @return RecordId 录像文件Id，通过获取本地录像返回
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set 录像文件Id，通过获取本地录像返回
     * @param RecordId 录像文件Id，通过获取本地录像返回
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get UNIX 时间戳，30天内，URL失效时间，如180s无人观看此流则URL提前失效 
     * @return ExpireTime UNIX 时间戳，30天内，URL失效时间，如180s无人观看此流则URL提前失效
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set UNIX 时间戳，30天内，URL失效时间，如180s无人观看此流则URL提前失效
     * @param ExpireTime UNIX 时间戳，30天内，URL失效时间，如180s无人观看此流则URL提前失效
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 录像文件推送的开始时间，需要在RecordId参数起始时间内，可以通过此参数控制回放流起始点 
     * @return StartTime 录像文件推送的开始时间，需要在RecordId参数起始时间内，可以通过此参数控制回放流起始点
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 录像文件推送的开始时间，需要在RecordId参数起始时间内，可以通过此参数控制回放流起始点
     * @param StartTime 录像文件推送的开始时间，需要在RecordId参数起始时间内，可以通过此参数控制回放流起始点
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 录像文件推送的结束时间，需要在RecordId参数起始时间内，可以通过此参数控制回放流起始点 
     * @return EndTime 录像文件推送的结束时间，需要在RecordId参数起始时间内，可以通过此参数控制回放流起始点
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 录像文件推送的结束时间，需要在RecordId参数起始时间内，可以通过此参数控制回放流起始点
     * @param EndTime 录像文件推送的结束时间，需要在RecordId参数起始时间内，可以通过此参数控制回放流起始点
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    public DescribeChannelLocalRecordURLRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeChannelLocalRecordURLRequest(DescribeChannelLocalRecordURLRequest source) {
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

