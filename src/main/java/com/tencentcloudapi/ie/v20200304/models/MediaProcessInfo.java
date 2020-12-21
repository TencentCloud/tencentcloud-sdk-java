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
package com.tencentcloudapi.ie.v20200304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaProcessInfo extends AbstractModel{

    /**
    * 编辑处理任务类型，可选值：
MediaEditing：媒体编辑（待上线）；
MediaCutting：媒体剪切；
MediaJoining：媒体拼接。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 视频剪切任务参数，Type=MediaCutting时必选。
    */
    @SerializedName("MediaCuttingInfo")
    @Expose
    private MediaCuttingInfo MediaCuttingInfo;

    /**
    * 视频拼接任务参数，Type=MediaJoining时必选。
    */
    @SerializedName("MediaJoiningInfo")
    @Expose
    private MediaJoiningInfo MediaJoiningInfo;

    /**
     * Get 编辑处理任务类型，可选值：
MediaEditing：媒体编辑（待上线）；
MediaCutting：媒体剪切；
MediaJoining：媒体拼接。 
     * @return Type 编辑处理任务类型，可选值：
MediaEditing：媒体编辑（待上线）；
MediaCutting：媒体剪切；
MediaJoining：媒体拼接。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 编辑处理任务类型，可选值：
MediaEditing：媒体编辑（待上线）；
MediaCutting：媒体剪切；
MediaJoining：媒体拼接。
     * @param Type 编辑处理任务类型，可选值：
MediaEditing：媒体编辑（待上线）；
MediaCutting：媒体剪切；
MediaJoining：媒体拼接。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 视频剪切任务参数，Type=MediaCutting时必选。 
     * @return MediaCuttingInfo 视频剪切任务参数，Type=MediaCutting时必选。
     */
    public MediaCuttingInfo getMediaCuttingInfo() {
        return this.MediaCuttingInfo;
    }

    /**
     * Set 视频剪切任务参数，Type=MediaCutting时必选。
     * @param MediaCuttingInfo 视频剪切任务参数，Type=MediaCutting时必选。
     */
    public void setMediaCuttingInfo(MediaCuttingInfo MediaCuttingInfo) {
        this.MediaCuttingInfo = MediaCuttingInfo;
    }

    /**
     * Get 视频拼接任务参数，Type=MediaJoining时必选。 
     * @return MediaJoiningInfo 视频拼接任务参数，Type=MediaJoining时必选。
     */
    public MediaJoiningInfo getMediaJoiningInfo() {
        return this.MediaJoiningInfo;
    }

    /**
     * Set 视频拼接任务参数，Type=MediaJoining时必选。
     * @param MediaJoiningInfo 视频拼接任务参数，Type=MediaJoining时必选。
     */
    public void setMediaJoiningInfo(MediaJoiningInfo MediaJoiningInfo) {
        this.MediaJoiningInfo = MediaJoiningInfo;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "MediaCuttingInfo.", this.MediaCuttingInfo);
        this.setParamObj(map, prefix + "MediaJoiningInfo.", this.MediaJoiningInfo);

    }
}

