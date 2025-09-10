/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VoicePrintInfo extends AbstractModel {

    /**
    * 声纹ID
    */
    @SerializedName("VoicePrintId")
    @Expose
    private String VoicePrintId;

    /**
    * 应用id
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 和声纹绑定的MetaInfo
    */
    @SerializedName("VoicePrintMetaInfo")
    @Expose
    private String VoicePrintMetaInfo;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 音频格式,当前只有0(代表wav)
    */
    @SerializedName("AudioFormat")
    @Expose
    private Long AudioFormat;

    /**
    * 音频名称
    */
    @SerializedName("AudioName")
    @Expose
    private String AudioName;

    /**
    * 请求毫秒时间戳
    */
    @SerializedName("ReqTimestamp")
    @Expose
    private Long ReqTimestamp;

    /**
     * Get 声纹ID 
     * @return VoicePrintId 声纹ID
     */
    public String getVoicePrintId() {
        return this.VoicePrintId;
    }

    /**
     * Set 声纹ID
     * @param VoicePrintId 声纹ID
     */
    public void setVoicePrintId(String VoicePrintId) {
        this.VoicePrintId = VoicePrintId;
    }

    /**
     * Get 应用id 
     * @return AppId 应用id
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 应用id
     * @param AppId 应用id
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 和声纹绑定的MetaInfo 
     * @return VoicePrintMetaInfo 和声纹绑定的MetaInfo
     */
    public String getVoicePrintMetaInfo() {
        return this.VoicePrintMetaInfo;
    }

    /**
     * Set 和声纹绑定的MetaInfo
     * @param VoicePrintMetaInfo 和声纹绑定的MetaInfo
     */
    public void setVoicePrintMetaInfo(String VoicePrintMetaInfo) {
        this.VoicePrintMetaInfo = VoicePrintMetaInfo;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 音频格式,当前只有0(代表wav) 
     * @return AudioFormat 音频格式,当前只有0(代表wav)
     */
    public Long getAudioFormat() {
        return this.AudioFormat;
    }

    /**
     * Set 音频格式,当前只有0(代表wav)
     * @param AudioFormat 音频格式,当前只有0(代表wav)
     */
    public void setAudioFormat(Long AudioFormat) {
        this.AudioFormat = AudioFormat;
    }

    /**
     * Get 音频名称 
     * @return AudioName 音频名称
     */
    public String getAudioName() {
        return this.AudioName;
    }

    /**
     * Set 音频名称
     * @param AudioName 音频名称
     */
    public void setAudioName(String AudioName) {
        this.AudioName = AudioName;
    }

    /**
     * Get 请求毫秒时间戳 
     * @return ReqTimestamp 请求毫秒时间戳
     */
    public Long getReqTimestamp() {
        return this.ReqTimestamp;
    }

    /**
     * Set 请求毫秒时间戳
     * @param ReqTimestamp 请求毫秒时间戳
     */
    public void setReqTimestamp(Long ReqTimestamp) {
        this.ReqTimestamp = ReqTimestamp;
    }

    public VoicePrintInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VoicePrintInfo(VoicePrintInfo source) {
        if (source.VoicePrintId != null) {
            this.VoicePrintId = new String(source.VoicePrintId);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.VoicePrintMetaInfo != null) {
            this.VoicePrintMetaInfo = new String(source.VoicePrintMetaInfo);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.AudioFormat != null) {
            this.AudioFormat = new Long(source.AudioFormat);
        }
        if (source.AudioName != null) {
            this.AudioName = new String(source.AudioName);
        }
        if (source.ReqTimestamp != null) {
            this.ReqTimestamp = new Long(source.ReqTimestamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VoicePrintId", this.VoicePrintId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "VoicePrintMetaInfo", this.VoicePrintMetaInfo);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "AudioFormat", this.AudioFormat);
        this.setParamSimple(map, prefix + "AudioName", this.AudioName);
        this.setParamSimple(map, prefix + "ReqTimestamp", this.ReqTimestamp);

    }
}

