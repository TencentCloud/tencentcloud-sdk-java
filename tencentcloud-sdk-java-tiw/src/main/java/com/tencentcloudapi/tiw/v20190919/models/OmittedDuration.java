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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OmittedDuration extends AbstractModel{

    /**
    * 录制暂停时间戳对应的视频播放时间(单位: 毫秒)
    */
    @SerializedName("VideoTime")
    @Expose
    private Long VideoTime;

    /**
    * 录制暂停时间戳(单位: 毫秒)
    */
    @SerializedName("PauseTime")
    @Expose
    private Long PauseTime;

    /**
    * 录制恢复时间戳(单位: 毫秒)
    */
    @SerializedName("ResumeTime")
    @Expose
    private Long ResumeTime;

    /**
     * Get 录制暂停时间戳对应的视频播放时间(单位: 毫秒) 
     * @return VideoTime 录制暂停时间戳对应的视频播放时间(单位: 毫秒)
     */
    public Long getVideoTime() {
        return this.VideoTime;
    }

    /**
     * Set 录制暂停时间戳对应的视频播放时间(单位: 毫秒)
     * @param VideoTime 录制暂停时间戳对应的视频播放时间(单位: 毫秒)
     */
    public void setVideoTime(Long VideoTime) {
        this.VideoTime = VideoTime;
    }

    /**
     * Get 录制暂停时间戳(单位: 毫秒) 
     * @return PauseTime 录制暂停时间戳(单位: 毫秒)
     */
    public Long getPauseTime() {
        return this.PauseTime;
    }

    /**
     * Set 录制暂停时间戳(单位: 毫秒)
     * @param PauseTime 录制暂停时间戳(单位: 毫秒)
     */
    public void setPauseTime(Long PauseTime) {
        this.PauseTime = PauseTime;
    }

    /**
     * Get 录制恢复时间戳(单位: 毫秒) 
     * @return ResumeTime 录制恢复时间戳(单位: 毫秒)
     */
    public Long getResumeTime() {
        return this.ResumeTime;
    }

    /**
     * Set 录制恢复时间戳(单位: 毫秒)
     * @param ResumeTime 录制恢复时间戳(单位: 毫秒)
     */
    public void setResumeTime(Long ResumeTime) {
        this.ResumeTime = ResumeTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VideoTime", this.VideoTime);
        this.setParamSimple(map, prefix + "PauseTime", this.PauseTime);
        this.setParamSimple(map, prefix + "ResumeTime", this.ResumeTime);

    }
}

