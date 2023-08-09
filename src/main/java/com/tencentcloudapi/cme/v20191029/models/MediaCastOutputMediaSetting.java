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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaCastOutputMediaSetting extends AbstractModel{

    /**
    * 视频配置。
    */
    @SerializedName("VideoSetting")
    @Expose
    private MediaCastVideoSetting VideoSetting;

    /**
    * 视频配置是否和第一个输入源的视频配置相同，默认值：false。如果 FollowSourceInfo 的值为 true，忽略 VideoSetting 参数。
    */
    @SerializedName("FollowSourceInfo")
    @Expose
    private Boolean FollowSourceInfo;

    /**
     * Get 视频配置。 
     * @return VideoSetting 视频配置。
     */
    public MediaCastVideoSetting getVideoSetting() {
        return this.VideoSetting;
    }

    /**
     * Set 视频配置。
     * @param VideoSetting 视频配置。
     */
    public void setVideoSetting(MediaCastVideoSetting VideoSetting) {
        this.VideoSetting = VideoSetting;
    }

    /**
     * Get 视频配置是否和第一个输入源的视频配置相同，默认值：false。如果 FollowSourceInfo 的值为 true，忽略 VideoSetting 参数。 
     * @return FollowSourceInfo 视频配置是否和第一个输入源的视频配置相同，默认值：false。如果 FollowSourceInfo 的值为 true，忽略 VideoSetting 参数。
     */
    public Boolean getFollowSourceInfo() {
        return this.FollowSourceInfo;
    }

    /**
     * Set 视频配置是否和第一个输入源的视频配置相同，默认值：false。如果 FollowSourceInfo 的值为 true，忽略 VideoSetting 参数。
     * @param FollowSourceInfo 视频配置是否和第一个输入源的视频配置相同，默认值：false。如果 FollowSourceInfo 的值为 true，忽略 VideoSetting 参数。
     */
    public void setFollowSourceInfo(Boolean FollowSourceInfo) {
        this.FollowSourceInfo = FollowSourceInfo;
    }

    public MediaCastOutputMediaSetting() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaCastOutputMediaSetting(MediaCastOutputMediaSetting source) {
        if (source.VideoSetting != null) {
            this.VideoSetting = new MediaCastVideoSetting(source.VideoSetting);
        }
        if (source.FollowSourceInfo != null) {
            this.FollowSourceInfo = new Boolean(source.FollowSourceInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "VideoSetting.", this.VideoSetting);
        this.setParamSimple(map, prefix + "FollowSourceInfo", this.FollowSourceInfo);

    }
}

