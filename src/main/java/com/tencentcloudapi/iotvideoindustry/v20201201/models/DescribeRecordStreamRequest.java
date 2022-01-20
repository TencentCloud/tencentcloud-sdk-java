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

public class DescribeRecordStreamRequest extends AbstractModel{

    /**
    * 设备Id
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * 流失效时间，UNIX时间戳，30天内
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * 录像文件ID
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * 录像流开始时间，当录像文件ID为空时有效，UNIX时间戳
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 录像流结束时间，当录像文件iD为空时有效，UNIX时间戳
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 通道唯一标识（此接口升级为必填字段）
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

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
     * Get 流失效时间，UNIX时间戳，30天内 
     * @return ExpireTime 流失效时间，UNIX时间戳，30天内
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 流失效时间，UNIX时间戳，30天内
     * @param ExpireTime 流失效时间，UNIX时间戳，30天内
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 录像文件ID 
     * @return RecordId 录像文件ID
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set 录像文件ID
     * @param RecordId 录像文件ID
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get 录像流开始时间，当录像文件ID为空时有效，UNIX时间戳 
     * @return StartTime 录像流开始时间，当录像文件ID为空时有效，UNIX时间戳
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 录像流开始时间，当录像文件ID为空时有效，UNIX时间戳
     * @param StartTime 录像流开始时间，当录像文件ID为空时有效，UNIX时间戳
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 录像流结束时间，当录像文件iD为空时有效，UNIX时间戳 
     * @return EndTime 录像流结束时间，当录像文件iD为空时有效，UNIX时间戳
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 录像流结束时间，当录像文件iD为空时有效，UNIX时间戳
     * @param EndTime 录像流结束时间，当录像文件iD为空时有效，UNIX时间戳
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 通道唯一标识（此接口升级为必填字段） 
     * @return ChannelId 通道唯一标识（此接口升级为必填字段）
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set 通道唯一标识（此接口升级为必填字段）
     * @param ChannelId 通道唯一标识（此接口升级为必填字段）
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    public DescribeRecordStreamRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRecordStreamRequest(DescribeRecordStreamRequest source) {
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);

    }
}

