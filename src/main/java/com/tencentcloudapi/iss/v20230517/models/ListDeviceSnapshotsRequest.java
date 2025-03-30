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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListDeviceSnapshotsRequest extends AbstractModel {

    /**
    * 通道ID
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * 设备ID（该字段暂不生效）
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * 查询开始时间，默认查询当天
    */
    @SerializedName("Start")
    @Expose
    private Long Start;

    /**
    * 查询结束时间，默认查询当天
    */
    @SerializedName("End")
    @Expose
    private Long End;

    /**
    * 分页页码，默认1
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 分页大小，默认200，最大2000
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

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
     * Get 设备ID（该字段暂不生效） 
     * @return DeviceId 设备ID（该字段暂不生效）
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 设备ID（该字段暂不生效）
     * @param DeviceId 设备ID（该字段暂不生效）
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get 查询开始时间，默认查询当天 
     * @return Start 查询开始时间，默认查询当天
     */
    public Long getStart() {
        return this.Start;
    }

    /**
     * Set 查询开始时间，默认查询当天
     * @param Start 查询开始时间，默认查询当天
     */
    public void setStart(Long Start) {
        this.Start = Start;
    }

    /**
     * Get 查询结束时间，默认查询当天 
     * @return End 查询结束时间，默认查询当天
     */
    public Long getEnd() {
        return this.End;
    }

    /**
     * Set 查询结束时间，默认查询当天
     * @param End 查询结束时间，默认查询当天
     */
    public void setEnd(Long End) {
        this.End = End;
    }

    /**
     * Get 分页页码，默认1 
     * @return PageNumber 分页页码，默认1
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 分页页码，默认1
     * @param PageNumber 分页页码，默认1
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 分页大小，默认200，最大2000 
     * @return PageSize 分页大小，默认200，最大2000
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页大小，默认200，最大2000
     * @param PageSize 分页大小，默认200，最大2000
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public ListDeviceSnapshotsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListDeviceSnapshotsRequest(ListDeviceSnapshotsRequest source) {
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.Start != null) {
            this.Start = new Long(source.Start);
        }
        if (source.End != null) {
            this.End = new Long(source.End);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "Start", this.Start);
        this.setParamSimple(map, prefix + "End", this.End);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

