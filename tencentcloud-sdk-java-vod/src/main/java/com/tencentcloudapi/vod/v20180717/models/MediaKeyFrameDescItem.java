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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaKeyFrameDescItem extends AbstractModel{

    /**
    * 打点的视频偏移时间，单位：秒。
    */
    @SerializedName("TimeOffset")
    @Expose
    private Float TimeOffset;

    /**
    * 打点的内容字符串，限制 1-128 个字符。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get 打点的视频偏移时间，单位：秒。 
     * @return TimeOffset 打点的视频偏移时间，单位：秒。
     */
    public Float getTimeOffset() {
        return this.TimeOffset;
    }

    /**
     * Set 打点的视频偏移时间，单位：秒。
     * @param TimeOffset 打点的视频偏移时间，单位：秒。
     */
    public void setTimeOffset(Float TimeOffset) {
        this.TimeOffset = TimeOffset;
    }

    /**
     * Get 打点的内容字符串，限制 1-128 个字符。 
     * @return Content 打点的内容字符串，限制 1-128 个字符。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 打点的内容字符串，限制 1-128 个字符。
     * @param Content 打点的内容字符串，限制 1-128 个字符。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeOffset", this.TimeOffset);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

