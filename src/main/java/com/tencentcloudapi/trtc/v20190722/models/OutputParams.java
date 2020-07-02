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
    * 直播流 ID，由用户自定义设置，该流 ID 不能与用户旁路的流 ID 相同。
    */
    @SerializedName("StreamId")
    @Expose
    private String StreamId;

    /**
    * 取值范围[0,1]， 填0：直播流为音视频(默认); 填1：直播流为纯音频
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
    * 取值范围[0,1]，填0无实际含义; 填1：指定录制文件格式为mp3
    */
    @SerializedName("RecordAudioOnly")
    @Expose
    private Long RecordAudioOnly;

    /**
     * Get 直播流 ID，由用户自定义设置，该流 ID 不能与用户旁路的流 ID 相同。 
     * @return StreamId 直播流 ID，由用户自定义设置，该流 ID 不能与用户旁路的流 ID 相同。
     */
    public String getStreamId() {
        return this.StreamId;
    }

    /**
     * Set 直播流 ID，由用户自定义设置，该流 ID 不能与用户旁路的流 ID 相同。
     * @param StreamId 直播流 ID，由用户自定义设置，该流 ID 不能与用户旁路的流 ID 相同。
     */
    public void setStreamId(String StreamId) {
        this.StreamId = StreamId;
    }

    /**
     * Get 取值范围[0,1]， 填0：直播流为音视频(默认); 填1：直播流为纯音频 
     * @return PureAudioStream 取值范围[0,1]， 填0：直播流为音视频(默认); 填1：直播流为纯音频
     */
    public Long getPureAudioStream() {
        return this.PureAudioStream;
    }

    /**
     * Set 取值范围[0,1]， 填0：直播流为音视频(默认); 填1：直播流为纯音频
     * @param PureAudioStream 取值范围[0,1]， 填0：直播流为音视频(默认); 填1：直播流为纯音频
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
     * Get 取值范围[0,1]，填0无实际含义; 填1：指定录制文件格式为mp3 
     * @return RecordAudioOnly 取值范围[0,1]，填0无实际含义; 填1：指定录制文件格式为mp3
     */
    public Long getRecordAudioOnly() {
        return this.RecordAudioOnly;
    }

    /**
     * Set 取值范围[0,1]，填0无实际含义; 填1：指定录制文件格式为mp3
     * @param RecordAudioOnly 取值范围[0,1]，填0无实际含义; 填1：指定录制文件格式为mp3
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

