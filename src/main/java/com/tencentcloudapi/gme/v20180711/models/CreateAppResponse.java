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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAppResponse  extends AbstractModel{

    /**
    * 应用id，由后台自动生成。
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
    * 项目id，透传输入的ProjectId
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
    * 语音消息及转文本服务配置数据
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
     * 获取应用id，由后台自动生成。
     * @return BizId 应用id，由后台自动生成。
     */
    public Long getBizId() {
        return this.BizId;
    }

    /**
     * 设置应用id，由后台自动生成。
     * @param BizId 应用id，由后台自动生成。
     */
    public void setBizId(Long BizId) {
        this.BizId = BizId;
    }

    /**
     * 获取应用名称，透传输入参数的AppName
     * @return AppName 应用名称，透传输入参数的AppName
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * 设置应用名称，透传输入参数的AppName
     * @param AppName 应用名称，透传输入参数的AppName
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * 获取项目id，透传输入的ProjectId
     * @return ProjectId 项目id，透传输入的ProjectId
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * 设置项目id，透传输入的ProjectId
     * @param ProjectId 项目id，透传输入的ProjectId
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * 获取应用密钥，GME SDK初始化时使用
     * @return SecretKey 应用密钥，GME SDK初始化时使用
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * 设置应用密钥，GME SDK初始化时使用
     * @param SecretKey 应用密钥，GME SDK初始化时使用
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * 获取服务创建时间戳
     * @return CreateTime 服务创建时间戳
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置服务创建时间戳
     * @param CreateTime 服务创建时间戳
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取实时语音服务配置数据
     * @return RealtimeSpeechConf 实时语音服务配置数据
     */
    public RealtimeSpeechConf getRealtimeSpeechConf() {
        return this.RealtimeSpeechConf;
    }

    /**
     * 设置实时语音服务配置数据
     * @param RealtimeSpeechConf 实时语音服务配置数据
     */
    public void setRealtimeSpeechConf(RealtimeSpeechConf RealtimeSpeechConf) {
        this.RealtimeSpeechConf = RealtimeSpeechConf;
    }

    /**
     * 获取语音消息及转文本服务配置数据
     * @return VoiceMessageConf 语音消息及转文本服务配置数据
     */
    public VoiceMessageConf getVoiceMessageConf() {
        return this.VoiceMessageConf;
    }

    /**
     * 设置语音消息及转文本服务配置数据
     * @param VoiceMessageConf 语音消息及转文本服务配置数据
     */
    public void setVoiceMessageConf(VoiceMessageConf VoiceMessageConf) {
        this.VoiceMessageConf = VoiceMessageConf;
    }

    /**
     * 获取语音分析服务配置数据
     * @return VoiceFilterConf 语音分析服务配置数据
     */
    public VoiceFilterConf getVoiceFilterConf() {
        return this.VoiceFilterConf;
    }

    /**
     * 设置语音分析服务配置数据
     * @param VoiceFilterConf 语音分析服务配置数据
     */
    public void setVoiceFilterConf(VoiceFilterConf VoiceFilterConf) {
        this.VoiceFilterConf = VoiceFilterConf;
    }

    /**
     * 内部实现，用户禁止调用
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

    }
}

