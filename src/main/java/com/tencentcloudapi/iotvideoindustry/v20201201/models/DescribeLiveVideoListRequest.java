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

public class DescribeLiveVideoListRequest extends AbstractModel{

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页的每页数量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 直播频道ID
    */
    @SerializedName("LiveChannelId")
    @Expose
    private String LiveChannelId;

    /**
    * 开始录制开始时间
    */
    @SerializedName("StartRecordTime")
    @Expose
    private Long StartRecordTime;

    /**
    * 开始录制结束时间
    */
    @SerializedName("EndRecordTime")
    @Expose
    private Long EndRecordTime;

    /**
    * 过期开始时间
    */
    @SerializedName("StartExpireTime")
    @Expose
    private Long StartExpireTime;

    /**
    * 过期结束时间
    */
    @SerializedName("EndExpireTime")
    @Expose
    private Long EndExpireTime;

    /**
    * 文件大小范围 Byte
    */
    @SerializedName("StartFileSize")
    @Expose
    private Long StartFileSize;

    /**
    * 文件大小范围 Byte
    */
    @SerializedName("EndFileSize")
    @Expose
    private Long EndFileSize;

    /**
    * 录制状态，5: 录制回写完
    */
    @SerializedName("IsRecording")
    @Expose
    private Long IsRecording;

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
     * Get 分页的每页数量 
     * @return Limit 分页的每页数量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页的每页数量
     * @param Limit 分页的每页数量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 直播频道ID 
     * @return LiveChannelId 直播频道ID
     */
    public String getLiveChannelId() {
        return this.LiveChannelId;
    }

    /**
     * Set 直播频道ID
     * @param LiveChannelId 直播频道ID
     */
    public void setLiveChannelId(String LiveChannelId) {
        this.LiveChannelId = LiveChannelId;
    }

    /**
     * Get 开始录制开始时间 
     * @return StartRecordTime 开始录制开始时间
     */
    public Long getStartRecordTime() {
        return this.StartRecordTime;
    }

    /**
     * Set 开始录制开始时间
     * @param StartRecordTime 开始录制开始时间
     */
    public void setStartRecordTime(Long StartRecordTime) {
        this.StartRecordTime = StartRecordTime;
    }

    /**
     * Get 开始录制结束时间 
     * @return EndRecordTime 开始录制结束时间
     */
    public Long getEndRecordTime() {
        return this.EndRecordTime;
    }

    /**
     * Set 开始录制结束时间
     * @param EndRecordTime 开始录制结束时间
     */
    public void setEndRecordTime(Long EndRecordTime) {
        this.EndRecordTime = EndRecordTime;
    }

    /**
     * Get 过期开始时间 
     * @return StartExpireTime 过期开始时间
     */
    public Long getStartExpireTime() {
        return this.StartExpireTime;
    }

    /**
     * Set 过期开始时间
     * @param StartExpireTime 过期开始时间
     */
    public void setStartExpireTime(Long StartExpireTime) {
        this.StartExpireTime = StartExpireTime;
    }

    /**
     * Get 过期结束时间 
     * @return EndExpireTime 过期结束时间
     */
    public Long getEndExpireTime() {
        return this.EndExpireTime;
    }

    /**
     * Set 过期结束时间
     * @param EndExpireTime 过期结束时间
     */
    public void setEndExpireTime(Long EndExpireTime) {
        this.EndExpireTime = EndExpireTime;
    }

    /**
     * Get 文件大小范围 Byte 
     * @return StartFileSize 文件大小范围 Byte
     */
    public Long getStartFileSize() {
        return this.StartFileSize;
    }

    /**
     * Set 文件大小范围 Byte
     * @param StartFileSize 文件大小范围 Byte
     */
    public void setStartFileSize(Long StartFileSize) {
        this.StartFileSize = StartFileSize;
    }

    /**
     * Get 文件大小范围 Byte 
     * @return EndFileSize 文件大小范围 Byte
     */
    public Long getEndFileSize() {
        return this.EndFileSize;
    }

    /**
     * Set 文件大小范围 Byte
     * @param EndFileSize 文件大小范围 Byte
     */
    public void setEndFileSize(Long EndFileSize) {
        this.EndFileSize = EndFileSize;
    }

    /**
     * Get 录制状态，5: 录制回写完 
     * @return IsRecording 录制状态，5: 录制回写完
     */
    public Long getIsRecording() {
        return this.IsRecording;
    }

    /**
     * Set 录制状态，5: 录制回写完
     * @param IsRecording 录制状态，5: 录制回写完
     */
    public void setIsRecording(Long IsRecording) {
        this.IsRecording = IsRecording;
    }

    public DescribeLiveVideoListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLiveVideoListRequest(DescribeLiveVideoListRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.LiveChannelId != null) {
            this.LiveChannelId = new String(source.LiveChannelId);
        }
        if (source.StartRecordTime != null) {
            this.StartRecordTime = new Long(source.StartRecordTime);
        }
        if (source.EndRecordTime != null) {
            this.EndRecordTime = new Long(source.EndRecordTime);
        }
        if (source.StartExpireTime != null) {
            this.StartExpireTime = new Long(source.StartExpireTime);
        }
        if (source.EndExpireTime != null) {
            this.EndExpireTime = new Long(source.EndExpireTime);
        }
        if (source.StartFileSize != null) {
            this.StartFileSize = new Long(source.StartFileSize);
        }
        if (source.EndFileSize != null) {
            this.EndFileSize = new Long(source.EndFileSize);
        }
        if (source.IsRecording != null) {
            this.IsRecording = new Long(source.IsRecording);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "LiveChannelId", this.LiveChannelId);
        this.setParamSimple(map, prefix + "StartRecordTime", this.StartRecordTime);
        this.setParamSimple(map, prefix + "EndRecordTime", this.EndRecordTime);
        this.setParamSimple(map, prefix + "StartExpireTime", this.StartExpireTime);
        this.setParamSimple(map, prefix + "EndExpireTime", this.EndExpireTime);
        this.setParamSimple(map, prefix + "StartFileSize", this.StartFileSize);
        this.setParamSimple(map, prefix + "EndFileSize", this.EndFileSize);
        this.setParamSimple(map, prefix + "IsRecording", this.IsRecording);

    }
}

