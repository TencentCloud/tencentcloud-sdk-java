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

public class GenerateSignedVideoURLRequest extends AbstractModel{

    /**
    * 视频播放原始URL地址
    */
    @SerializedName("VideoURL")
    @Expose
    private String VideoURL;

    /**
    * 播放链接过期时间
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
     * Get 视频播放原始URL地址 
     * @return VideoURL 视频播放原始URL地址
     */
    public String getVideoURL() {
        return this.VideoURL;
    }

    /**
     * Set 视频播放原始URL地址
     * @param VideoURL 视频播放原始URL地址
     */
    public void setVideoURL(String VideoURL) {
        this.VideoURL = VideoURL;
    }

    /**
     * Get 播放链接过期时间 
     * @return ExpireTime 播放链接过期时间
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 播放链接过期时间
     * @param ExpireTime 播放链接过期时间
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    public GenerateSignedVideoURLRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GenerateSignedVideoURLRequest(GenerateSignedVideoURLRequest source) {
        if (source.VideoURL != null) {
            this.VideoURL = new String(source.VideoURL);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VideoURL", this.VideoURL);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);

    }
}

