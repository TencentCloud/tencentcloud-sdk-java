/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ControlDeviceSnapshotRequest extends AbstractModel {

    /**
    * 通道ID
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * 连拍张数，可选值范围1～10
    */
    @SerializedName("SnapNum")
    @Expose
    private Long SnapNum;

    /**
    * 抓拍间隔时间，可选值范围1～1800
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * 图片存储时间，默认 7 天，仅支持（7, 15, 30, 60, 90, 180, 365）天
    */
    @SerializedName("Expire")
    @Expose
    private Long Expire;

    /**
     * Get 通道ID 
     * @return ChannelId 通道ID
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set 通道ID
     * @param ChannelId 通道ID
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get 连拍张数，可选值范围1～10 
     * @return SnapNum 连拍张数，可选值范围1～10
     */
    public Long getSnapNum() {
        return this.SnapNum;
    }

    /**
     * Set 连拍张数，可选值范围1～10
     * @param SnapNum 连拍张数，可选值范围1～10
     */
    public void setSnapNum(Long SnapNum) {
        this.SnapNum = SnapNum;
    }

    /**
     * Get 抓拍间隔时间，可选值范围1～1800 
     * @return Interval 抓拍间隔时间，可选值范围1～1800
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set 抓拍间隔时间，可选值范围1～1800
     * @param Interval 抓拍间隔时间，可选值范围1～1800
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get 图片存储时间，默认 7 天，仅支持（7, 15, 30, 60, 90, 180, 365）天 
     * @return Expire 图片存储时间，默认 7 天，仅支持（7, 15, 30, 60, 90, 180, 365）天
     */
    public Long getExpire() {
        return this.Expire;
    }

    /**
     * Set 图片存储时间，默认 7 天，仅支持（7, 15, 30, 60, 90, 180, 365）天
     * @param Expire 图片存储时间，默认 7 天，仅支持（7, 15, 30, 60, 90, 180, 365）天
     */
    public void setExpire(Long Expire) {
        this.Expire = Expire;
    }

    public ControlDeviceSnapshotRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ControlDeviceSnapshotRequest(ControlDeviceSnapshotRequest source) {
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.SnapNum != null) {
            this.SnapNum = new Long(source.SnapNum);
        }
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
        if (source.Expire != null) {
            this.Expire = new Long(source.Expire);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "SnapNum", this.SnapNum);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "Expire", this.Expire);

    }
}

