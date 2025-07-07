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

public class CreateAppResp extends AbstractModel {

    /**
    * 应用ID，由后台自动生成。
    */
    @SerializedName("BizId")
    @Expose
    private Long BizId;

    /**
    * 应用名称，透传输入参数的AppName
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 项目ID，透传输入的ProjectId
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 应用密钥，GME SDK初始化时使用
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * 服务创建时间戳
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 实时语音服务配置数据
    */
    @SerializedName("RealtimeSpeechConf")
    @Expose
    private RealtimeSpeechConf RealtimeSpeechConf;

    /**
    * 语音消息服务配置数据
    */
    @SerializedName("VoiceMessageConf")
    @Expose
    private VoiceMessageConf VoiceMessageConf;

    /**
    * 语音分析服务配置数据
    */
    @SerializedName("VoiceFilterConf")
    @Expose
    private VoiceFilterConf VoiceFilterConf;

    /**
    * 语音转文本服务配置数据
    */
    @SerializedName("AsrConf")
    @Expose
    private AsrConf AsrConf;

    /**
     * Get 应用ID，由后台自动生成。 
     * @return BizId 应用ID，由后台自动生成。
     */
    public Long getBizId() {
        return this.BizId;
    }

    /**
     * Set 应用ID，由后台自动生成。
     * @param BizId 应用ID，由后台自动生成。
     */
    public void setBizId(Long BizId) {
        this.BizId = BizId;
    }

    /**
     * Get 应用名称，透传输入参数的AppName 
     * @return AppName 应用名称，透传输入参数的AppName
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 应用名称，透传输入参数的AppName
     * @param AppName 应用名称，透传输入参数的AppName
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get 项目ID，透传输入的ProjectId 
     * @return ProjectId 项目ID，透传输入的ProjectId
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID，透传输入的ProjectId
     * @param ProjectId 项目ID，透传输入的ProjectId
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 应用密钥，GME SDK初始化时使用 
     * @return SecretKey 应用密钥，GME SDK初始化时使用
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set 应用密钥，GME SDK初始化时使用
     * @param SecretKey 应用密钥，GME SDK初始化时使用
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Get 服务创建时间戳 
     * @return CreateTime 服务创建时间戳
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 服务创建时间戳
     * @param CreateTime 服务创建时间戳
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 实时语音服务配置数据 
     * @return RealtimeSpeechConf 实时语音服务配置数据
     */
    public RealtimeSpeechConf getRealtimeSpeechConf() {
        return this.RealtimeSpeechConf;
    }

    /**
     * Set 实时语音服务配置数据
     * @param RealtimeSpeechConf 实时语音服务配置数据
     */
    public void setRealtimeSpeechConf(RealtimeSpeechConf RealtimeSpeechConf) {
        this.RealtimeSpeechConf = RealtimeSpeechConf;
    }

    /**
     * Get 语音消息服务配置数据 
     * @return VoiceMessageConf 语音消息服务配置数据
     */
    public VoiceMessageConf getVoiceMessageConf() {
        return this.VoiceMessageConf;
    }

    /**
     * Set 语音消息服务配置数据
     * @param VoiceMessageConf 语音消息服务配置数据
     */
    public void setVoiceMessageConf(VoiceMessageConf VoiceMessageConf) {
        this.VoiceMessageConf = VoiceMessageConf;
    }

    /**
     * Get 语音分析服务配置数据 
     * @return VoiceFilterConf 语音分析服务配置数据
     */
    public VoiceFilterConf getVoiceFilterConf() {
        return this.VoiceFilterConf;
    }

    /**
     * Set 语音分析服务配置数据
     * @param VoiceFilterConf 语音分析服务配置数据
     */
    public void setVoiceFilterConf(VoiceFilterConf VoiceFilterConf) {
        this.VoiceFilterConf = VoiceFilterConf;
    }

    /**
     * Get 语音转文本服务配置数据 
     * @return AsrConf 语音转文本服务配置数据
     */
    public AsrConf getAsrConf() {
        return this.AsrConf;
    }

    /**
     * Set 语音转文本服务配置数据
     * @param AsrConf 语音转文本服务配置数据
     */
    public void setAsrConf(AsrConf AsrConf) {
        this.AsrConf = AsrConf;
    }

    public CreateAppResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAppResp(CreateAppResp source) {
        if (source.BizId != null) {
            this.BizId = new Long(source.BizId);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.SecretKey != null) {
            this.SecretKey = new String(source.SecretKey);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.RealtimeSpeechConf != null) {
            this.RealtimeSpeechConf = new RealtimeSpeechConf(source.RealtimeSpeechConf);
        }
        if (source.VoiceMessageConf != null) {
            this.VoiceMessageConf = new VoiceMessageConf(source.VoiceMessageConf);
        }
        if (source.VoiceFilterConf != null) {
            this.VoiceFilterConf = new VoiceFilterConf(source.VoiceFilterConf);
        }
        if (source.AsrConf != null) {
            this.AsrConf = new AsrConf(source.AsrConf);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BizId", this.BizId);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamObj(map, prefix + "RealtimeSpeechConf.", this.RealtimeSpeechConf);
        this.setParamObj(map, prefix + "VoiceMessageConf.", this.VoiceMessageConf);
        this.setParamObj(map, prefix + "VoiceFilterConf.", this.VoiceFilterConf);
        this.setParamObj(map, prefix + "AsrConf.", this.AsrConf);

    }
}

