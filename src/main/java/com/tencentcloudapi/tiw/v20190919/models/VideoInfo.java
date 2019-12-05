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

public class VideoInfo  extends AbstractModel{

    /**
    * 视频开始播放的时间（单位：毫秒）
    */
    @SerializedName("VideoPlayTime")
    @Expose
    private Long VideoPlayTime;

    /**
    * 视频大小（字节）
    */
    @SerializedName("VideoSize")
    @Expose
    private Long VideoSize;

    /**
    * 视频格式
    */
    @SerializedName("VideoFormat")
    @Expose
    private String VideoFormat;

    /**
    * 视频播放时长（单位：毫秒）
    */
    @SerializedName("VideoDuration")
    @Expose
    private Long VideoDuration;

    /**
    * 视频文件URL
    */
    @SerializedName("VideoUrl")
    @Expose
    private String VideoUrl;

    /**
    * 视频文件Id
    */
    @SerializedName("VideoId")
    @Expose
    private String VideoId;

    /**
    * 视频流类型 
- 0：摄像头视频 
- 1：屏幕分享视频（仅课后录制支持）
- 2：白板视频 
- 3：混流视频
- 4：纯音频（mp3)
    */
    @SerializedName("VideoType")
    @Expose
    private Long VideoType;

    /**
    * 摄像头/屏幕分享视频所属用户的 Id（白板视频为空、混流视频tic_mixstream_房间号_混流布局类型）
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
     * 获取视频开始播放的时间（单位：毫秒）
     * @return VideoPlayTime 视频开始播放的时间（单位：毫秒）
     */
    public Long getVideoPlayTime() {
        return this.VideoPlayTime;
    }

    /**
     * 设置视频开始播放的时间（单位：毫秒）
     * @param VideoPlayTime 视频开始播放的时间（单位：毫秒）
     */
    public void setVideoPlayTime(Long VideoPlayTime) {
        this.VideoPlayTime = VideoPlayTime;
    }

    /**
     * 获取视频大小（字节）
     * @return VideoSize 视频大小（字节）
     */
    public Long getVideoSize() {
        return this.VideoSize;
    }

    /**
     * 设置视频大小（字节）
     * @param VideoSize 视频大小（字节）
     */
    public void setVideoSize(Long VideoSize) {
        this.VideoSize = VideoSize;
    }

    /**
     * 获取视频格式
     * @return VideoFormat 视频格式
     */
    public String getVideoFormat() {
        return this.VideoFormat;
    }

    /**
     * 设置视频格式
     * @param VideoFormat 视频格式
     */
    public void setVideoFormat(String VideoFormat) {
        this.VideoFormat = VideoFormat;
    }

    /**
     * 获取视频播放时长（单位：毫秒）
     * @return VideoDuration 视频播放时长（单位：毫秒）
     */
    public Long getVideoDuration() {
        return this.VideoDuration;
    }

    /**
     * 设置视频播放时长（单位：毫秒）
     * @param VideoDuration 视频播放时长（单位：毫秒）
     */
    public void setVideoDuration(Long VideoDuration) {
        this.VideoDuration = VideoDuration;
    }

    /**
     * 获取视频文件URL
     * @return VideoUrl 视频文件URL
     */
    public String getVideoUrl() {
        return this.VideoUrl;
    }

    /**
     * 设置视频文件URL
     * @param VideoUrl 视频文件URL
     */
    public void setVideoUrl(String VideoUrl) {
        this.VideoUrl = VideoUrl;
    }

    /**
     * 获取视频文件Id
     * @return VideoId 视频文件Id
     */
    public String getVideoId() {
        return this.VideoId;
    }

    /**
     * 设置视频文件Id
     * @param VideoId 视频文件Id
     */
    public void setVideoId(String VideoId) {
        this.VideoId = VideoId;
    }

    /**
     * 获取视频流类型 
- 0：摄像头视频 
- 1：屏幕分享视频（仅课后录制支持）
- 2：白板视频 
- 3：混流视频
- 4：纯音频（mp3)
     * @return VideoType 视频流类型 
- 0：摄像头视频 
- 1：屏幕分享视频（仅课后录制支持）
- 2：白板视频 
- 3：混流视频
- 4：纯音频（mp3)
     */
    public Long getVideoType() {
        return this.VideoType;
    }

    /**
     * 设置视频流类型 
- 0：摄像头视频 
- 1：屏幕分享视频（仅课后录制支持）
- 2：白板视频 
- 3：混流视频
- 4：纯音频（mp3)
     * @param VideoType 视频流类型 
- 0：摄像头视频 
- 1：屏幕分享视频（仅课后录制支持）
- 2：白板视频 
- 3：混流视频
- 4：纯音频（mp3)
     */
    public void setVideoType(Long VideoType) {
        this.VideoType = VideoType;
    }

    /**
     * 获取摄像头/屏幕分享视频所属用户的 Id（白板视频为空、混流视频tic_mixstream_房间号_混流布局类型）
     * @return UserId 摄像头/屏幕分享视频所属用户的 Id（白板视频为空、混流视频tic_mixstream_房间号_混流布局类型）
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * 设置摄像头/屏幕分享视频所属用户的 Id（白板视频为空、混流视频tic_mixstream_房间号_混流布局类型）
     * @param UserId 摄像头/屏幕分享视频所属用户的 Id（白板视频为空、混流视频tic_mixstream_房间号_混流布局类型）
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VideoPlayTime", this.VideoPlayTime);
        this.setParamSimple(map, prefix + "VideoSize", this.VideoSize);
        this.setParamSimple(map, prefix + "VideoFormat", this.VideoFormat);
        this.setParamSimple(map, prefix + "VideoDuration", this.VideoDuration);
        this.setParamSimple(map, prefix + "VideoUrl", this.VideoUrl);
        this.setParamSimple(map, prefix + "VideoId", this.VideoId);
        this.setParamSimple(map, prefix + "VideoType", this.VideoType);
        this.setParamSimple(map, prefix + "UserId", this.UserId);

    }
}

