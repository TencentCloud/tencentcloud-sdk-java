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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegisterVoicePrintRequest extends AbstractModel {

    /**
    * 整个wav音频文件的base64字符串,其中wav文件限定为16k或8k采样率, 16bit位深, 单声道, 8到18秒有效音频时长,编码数据大小不超过2M
    */
    @SerializedName("Audio")
    @Expose
    private String Audio;

    /**
    * 毫秒时间戳
    */
    @SerializedName("ReqTimestamp")
    @Expose
    private Long ReqTimestamp;

    /**
    * 音频格式,目前只支持0,代表wav
    */
    @SerializedName("AudioFormat")
    @Expose
    private Long AudioFormat;

    /**
    * 音频名称,长度不要超过32
    */
    @SerializedName("AudioName")
    @Expose
    private String AudioName;

    /**
    * 和声纹绑定的MetaInfo，长度最大不超过512
    */
    @SerializedName("AudioMetaInfo")
    @Expose
    private String AudioMetaInfo;

    /**
     * Get 整个wav音频文件的base64字符串,其中wav文件限定为16k或8k采样率, 16bit位深, 单声道, 8到18秒有效音频时长,编码数据大小不超过2M 
     * @return Audio 整个wav音频文件的base64字符串,其中wav文件限定为16k或8k采样率, 16bit位深, 单声道, 8到18秒有效音频时长,编码数据大小不超过2M
     */
    public String getAudio() {
        return this.Audio;
    }

    /**
     * Set 整个wav音频文件的base64字符串,其中wav文件限定为16k或8k采样率, 16bit位深, 单声道, 8到18秒有效音频时长,编码数据大小不超过2M
     * @param Audio 整个wav音频文件的base64字符串,其中wav文件限定为16k或8k采样率, 16bit位深, 单声道, 8到18秒有效音频时长,编码数据大小不超过2M
     */
    public void setAudio(String Audio) {
        this.Audio = Audio;
    }

    /**
     * Get 毫秒时间戳 
     * @return ReqTimestamp 毫秒时间戳
     */
    public Long getReqTimestamp() {
        return this.ReqTimestamp;
    }

    /**
     * Set 毫秒时间戳
     * @param ReqTimestamp 毫秒时间戳
     */
    public void setReqTimestamp(Long ReqTimestamp) {
        this.ReqTimestamp = ReqTimestamp;
    }

    /**
     * Get 音频格式,目前只支持0,代表wav 
     * @return AudioFormat 音频格式,目前只支持0,代表wav
     */
    public Long getAudioFormat() {
        return this.AudioFormat;
    }

    /**
     * Set 音频格式,目前只支持0,代表wav
     * @param AudioFormat 音频格式,目前只支持0,代表wav
     */
    public void setAudioFormat(Long AudioFormat) {
        this.AudioFormat = AudioFormat;
    }

    /**
     * Get 音频名称,长度不要超过32 
     * @return AudioName 音频名称,长度不要超过32
     */
    public String getAudioName() {
        return this.AudioName;
    }

    /**
     * Set 音频名称,长度不要超过32
     * @param AudioName 音频名称,长度不要超过32
     */
    public void setAudioName(String AudioName) {
        this.AudioName = AudioName;
    }

    /**
     * Get 和声纹绑定的MetaInfo，长度最大不超过512 
     * @return AudioMetaInfo 和声纹绑定的MetaInfo，长度最大不超过512
     */
    public String getAudioMetaInfo() {
        return this.AudioMetaInfo;
    }

    /**
     * Set 和声纹绑定的MetaInfo，长度最大不超过512
     * @param AudioMetaInfo 和声纹绑定的MetaInfo，长度最大不超过512
     */
    public void setAudioMetaInfo(String AudioMetaInfo) {
        this.AudioMetaInfo = AudioMetaInfo;
    }

    public RegisterVoicePrintRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegisterVoicePrintRequest(RegisterVoicePrintRequest source) {
        if (source.Audio != null) {
            this.Audio = new String(source.Audio);
        }
        if (source.ReqTimestamp != null) {
            this.ReqTimestamp = new Long(source.ReqTimestamp);
        }
        if (source.AudioFormat != null) {
            this.AudioFormat = new Long(source.AudioFormat);
        }
        if (source.AudioName != null) {
            this.AudioName = new String(source.AudioName);
        }
        if (source.AudioMetaInfo != null) {
            this.AudioMetaInfo = new String(source.AudioMetaInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Audio", this.Audio);
        this.setParamSimple(map, prefix + "ReqTimestamp", this.ReqTimestamp);
        this.setParamSimple(map, prefix + "AudioFormat", this.AudioFormat);
        this.setParamSimple(map, prefix + "AudioName", this.AudioName);
        this.setParamSimple(map, prefix + "AudioMetaInfo", this.AudioMetaInfo);

    }
}

