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

public class CloudStorageTimeData extends AbstractModel{

    /**
    * 云存时间轴信息列表
    */
    @SerializedName("TimeList")
    @Expose
    private CloudStorageTimeInfo [] TimeList;

    /**
    * 播放地址
    */
    @SerializedName("VideoURL")
    @Expose
    private String VideoURL;

    /**
     * Get 云存时间轴信息列表 
     * @return TimeList 云存时间轴信息列表
     */
    public CloudStorageTimeInfo [] getTimeList() {
        return this.TimeList;
    }

    /**
     * Set 云存时间轴信息列表
     * @param TimeList 云存时间轴信息列表
     */
    public void setTimeList(CloudStorageTimeInfo [] TimeList) {
        this.TimeList = TimeList;
    }

    /**
     * Get 播放地址 
     * @return VideoURL 播放地址
     */
    public String getVideoURL() {
        return this.VideoURL;
    }

    /**
     * Set 播放地址
     * @param VideoURL 播放地址
     */
    public void setVideoURL(String VideoURL) {
        this.VideoURL = VideoURL;
    }

    public CloudStorageTimeData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudStorageTimeData(CloudStorageTimeData source) {
        if (source.TimeList != null) {
            this.TimeList = new CloudStorageTimeInfo[source.TimeList.length];
            for (int i = 0; i < source.TimeList.length; i++) {
                this.TimeList[i] = new CloudStorageTimeInfo(source.TimeList[i]);
            }
        }
        if (source.VideoURL != null) {
            this.VideoURL = new String(source.VideoURL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TimeList.", this.TimeList);
        this.setParamSimple(map, prefix + "VideoURL", this.VideoURL);

    }
}

