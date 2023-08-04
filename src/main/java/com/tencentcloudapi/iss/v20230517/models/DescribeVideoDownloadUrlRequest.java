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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVideoDownloadUrlRequest extends AbstractModel{

    /**
    * 通道 ID
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * 下载的开始时间，UTC 秒数，开始和结束时间段最长为30分钟，且不能跨天
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * 下载的结束时间，UTC 秒数，开始和结束时间段最长为30分钟，且不能跨天
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 文件格式，"mp4"：mp4格式，"ts"：ts文件格式
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * 响应data中是否携带实际下载录像的开始时间与结束时间
    */
    @SerializedName("IsRespActualTime")
    @Expose
    private Boolean IsRespActualTime;

    /**
     * Get 通道 ID 
     * @return ChannelId 通道 ID
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set 通道 ID
     * @param ChannelId 通道 ID
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get 下载的开始时间，UTC 秒数，开始和结束时间段最长为30分钟，且不能跨天 
     * @return BeginTime 下载的开始时间，UTC 秒数，开始和结束时间段最长为30分钟，且不能跨天
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 下载的开始时间，UTC 秒数，开始和结束时间段最长为30分钟，且不能跨天
     * @param BeginTime 下载的开始时间，UTC 秒数，开始和结束时间段最长为30分钟，且不能跨天
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 下载的结束时间，UTC 秒数，开始和结束时间段最长为30分钟，且不能跨天 
     * @return EndTime 下载的结束时间，UTC 秒数，开始和结束时间段最长为30分钟，且不能跨天
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 下载的结束时间，UTC 秒数，开始和结束时间段最长为30分钟，且不能跨天
     * @param EndTime 下载的结束时间，UTC 秒数，开始和结束时间段最长为30分钟，且不能跨天
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 文件格式，"mp4"：mp4格式，"ts"：ts文件格式 
     * @return FileType 文件格式，"mp4"：mp4格式，"ts"：ts文件格式
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 文件格式，"mp4"：mp4格式，"ts"：ts文件格式
     * @param FileType 文件格式，"mp4"：mp4格式，"ts"：ts文件格式
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get 响应data中是否携带实际下载录像的开始时间与结束时间 
     * @return IsRespActualTime 响应data中是否携带实际下载录像的开始时间与结束时间
     */
    public Boolean getIsRespActualTime() {
        return this.IsRespActualTime;
    }

    /**
     * Set 响应data中是否携带实际下载录像的开始时间与结束时间
     * @param IsRespActualTime 响应data中是否携带实际下载录像的开始时间与结束时间
     */
    public void setIsRespActualTime(Boolean IsRespActualTime) {
        this.IsRespActualTime = IsRespActualTime;
    }

    public DescribeVideoDownloadUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVideoDownloadUrlRequest(DescribeVideoDownloadUrlRequest source) {
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.IsRespActualTime != null) {
            this.IsRespActualTime = new Boolean(source.IsRespActualTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "IsRespActualTime", this.IsRespActualTime);

    }
}

