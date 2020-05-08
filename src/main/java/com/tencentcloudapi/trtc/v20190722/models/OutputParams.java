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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OutputParams extends AbstractModel{

    /**
    * 直播流ID
    */
    @SerializedName("StreamId")
    @Expose
    private String StreamId;

    /**
    * 填0：直播流为音视频(默认); 填1：直播流为纯音频
    */
    @SerializedName("PureAudioStream")
    @Expose
    private Long PureAudioStream;

    /**
    * 自定义录制文件名
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * 填1：纯音频录制为mp3
    */
    @SerializedName("RecordAudioOnly")
    @Expose
    private Long RecordAudioOnly;

    /**
     * Get 直播流ID 
     * @return StreamId 直播流ID
     */
    public String getStreamId() {
        return this.StreamId;
    }

    /**
     * Set 直播流ID
     * @param StreamId 直播流ID
     */
    public void setStreamId(String StreamId) {
        this.StreamId = StreamId;
    }

    /**
     * Get 填0：直播流为音视频(默认); 填1：直播流为纯音频 
     * @return PureAudioStream 填0：直播流为音视频(默认); 填1：直播流为纯音频
     */
    public Long getPureAudioStream() {
        return this.PureAudioStream;
    }

    /**
     * Set 填0：直播流为音视频(默认); 填1：直播流为纯音频
     * @param PureAudioStream 填0：直播流为音视频(默认); 填1：直播流为纯音频
     */
    public void setPureAudioStream(Long PureAudioStream) {
        this.PureAudioStream = PureAudioStream;
    }

    /**
     * Get 自定义录制文件名 
     * @return RecordId 自定义录制文件名
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set 自定义录制文件名
     * @param RecordId 自定义录制文件名
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get 填1：纯音频录制为mp3 
     * @return RecordAudioOnly 填1：纯音频录制为mp3
     */
    public Long getRecordAudioOnly() {
        return this.RecordAudioOnly;
    }

    /**
     * Set 填1：纯音频录制为mp3
     * @param RecordAudioOnly 填1：纯音频录制为mp3
     */
    public void setRecordAudioOnly(Long RecordAudioOnly) {
        this.RecordAudioOnly = RecordAudioOnly;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StreamId", this.StreamId);
        this.setParamSimple(map, prefix + "PureAudioStream", this.PureAudioStream);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "RecordAudioOnly", this.RecordAudioOnly);

    }
}

