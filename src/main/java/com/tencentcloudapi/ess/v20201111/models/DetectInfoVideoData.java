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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetectInfoVideoData extends AbstractModel {

    /**
    * 活体视频的base64编码，mp4格式

注:`需进行base64解码获取活体视频文件`
    */
    @SerializedName("LiveNessVideo")
    @Expose
    private String LiveNessVideo;

    /**
     * Get 活体视频的base64编码，mp4格式

注:`需进行base64解码获取活体视频文件` 
     * @return LiveNessVideo 活体视频的base64编码，mp4格式

注:`需进行base64解码获取活体视频文件`
     */
    public String getLiveNessVideo() {
        return this.LiveNessVideo;
    }

    /**
     * Set 活体视频的base64编码，mp4格式

注:`需进行base64解码获取活体视频文件`
     * @param LiveNessVideo 活体视频的base64编码，mp4格式

注:`需进行base64解码获取活体视频文件`
     */
    public void setLiveNessVideo(String LiveNessVideo) {
        this.LiveNessVideo = LiveNessVideo;
    }

    public DetectInfoVideoData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetectInfoVideoData(DetectInfoVideoData source) {
        if (source.LiveNessVideo != null) {
            this.LiveNessVideo = new String(source.LiveNessVideo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LiveNessVideo", this.LiveNessVideo);

    }
}

