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

public class CreateAppRequest extends AbstractModel {

    /**
    * 应用名称
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 腾讯云项目ID，默认为0，表示默认项目
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 需要支持的引擎列表，默认全选。
取值：android/ios/unity/cocos/unreal/windows
    */
    @SerializedName("EngineList")
    @Expose
    private String [] EngineList;

    /**
    * 服务区域列表，默认全选。
取值：mainland-大陆地区，hmt-港澳台，sea-东南亚，na-北美，eu-欧洲，jpkr-日韩亚太，sa-南美，oc-澳洲，me-中东
    */
    @SerializedName("RegionList")
    @Expose
    private String [] RegionList;

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
    * 语音转文本配置数据
    */
    @SerializedName("AsrConf")
    @Expose
    private AsrConf AsrConf;

    /**
    * 需要添加的标签列表
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get 应用名称 
     * @return AppName 应用名称
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 应用名称
     * @param AppName 应用名称
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get 腾讯云项目ID，默认为0，表示默认项目 
     * @return ProjectId 腾讯云项目ID，默认为0，表示默认项目
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 腾讯云项目ID，默认为0，表示默认项目
     * @param ProjectId 腾讯云项目ID，默认为0，表示默认项目
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 需要支持的引擎列表，默认全选。
取值：android/ios/unity/cocos/unreal/windows 
     * @return EngineList 需要支持的引擎列表，默认全选。
取值：android/ios/unity/cocos/unreal/windows
     */
    public String [] getEngineList() {
        return this.EngineList;
    }

    /**
     * Set 需要支持的引擎列表，默认全选。
取值：android/ios/unity/cocos/unreal/windows
     * @param EngineList 需要支持的引擎列表，默认全选。
取值：android/ios/unity/cocos/unreal/windows
     */
    public void setEngineList(String [] EngineList) {
        this.EngineList = EngineList;
    }

    /**
     * Get 服务区域列表，默认全选。
取值：mainland-大陆地区，hmt-港澳台，sea-东南亚，na-北美，eu-欧洲，jpkr-日韩亚太，sa-南美，oc-澳洲，me-中东 
     * @return RegionList 服务区域列表，默认全选。
取值：mainland-大陆地区，hmt-港澳台，sea-东南亚，na-北美，eu-欧洲，jpkr-日韩亚太，sa-南美，oc-澳洲，me-中东
     */
    public String [] getRegionList() {
        return this.RegionList;
    }

    /**
     * Set 服务区域列表，默认全选。
取值：mainland-大陆地区，hmt-港澳台，sea-东南亚，na-北美，eu-欧洲，jpkr-日韩亚太，sa-南美，oc-澳洲，me-中东
     * @param RegionList 服务区域列表，默认全选。
取值：mainland-大陆地区，hmt-港澳台，sea-东南亚，na-北美，eu-欧洲，jpkr-日韩亚太，sa-南美，oc-澳洲，me-中东
     */
    public void setRegionList(String [] RegionList) {
        this.RegionList = RegionList;
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
     * Get 语音转文本配置数据 
     * @return AsrConf 语音转文本配置数据
     */
    public AsrConf getAsrConf() {
        return this.AsrConf;
    }

    /**
     * Set 语音转文本配置数据
     * @param AsrConf 语音转文本配置数据
     */
    public void setAsrConf(AsrConf AsrConf) {
        this.AsrConf = AsrConf;
    }

    /**
     * Get 需要添加的标签列表 
     * @return Tags 需要添加的标签列表
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 需要添加的标签列表
     * @param Tags 需要添加的标签列表
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public CreateAppRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAppRequest(CreateAppRequest source) {
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.EngineList != null) {
            this.EngineList = new String[source.EngineList.length];
            for (int i = 0; i < source.EngineList.length; i++) {
                this.EngineList[i] = new String(source.EngineList[i]);
            }
        }
        if (source.RegionList != null) {
            this.RegionList = new String[source.RegionList.length];
            for (int i = 0; i < source.RegionList.length; i++) {
                this.RegionList[i] = new String(source.RegionList[i]);
            }
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
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "EngineList.", this.EngineList);
        this.setParamArraySimple(map, prefix + "RegionList.", this.RegionList);
        this.setParamObj(map, prefix + "RealtimeSpeechConf.", this.RealtimeSpeechConf);
        this.setParamObj(map, prefix + "VoiceMessageConf.", this.VoiceMessageConf);
        this.setParamObj(map, prefix + "VoiceFilterConf.", this.VoiceFilterConf);
        this.setParamObj(map, prefix + "AsrConf.", this.AsrConf);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

