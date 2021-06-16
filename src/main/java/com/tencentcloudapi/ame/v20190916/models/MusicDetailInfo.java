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
package com.tencentcloudapi.ame.v20190916.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MusicDetailInfo extends AbstractModel{

    /**
    * 资源方音乐Id
    */
    @SerializedName("MusicId")
    @Expose
    private String MusicId;

    /**
    * 资源方识别信息
    */
    @SerializedName("AmeId")
    @Expose
    private String AmeId;

    /**
    * 分类标签
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * 关键词
    */
    @SerializedName("HitWords")
    @Expose
    private String [] HitWords;

    /**
    * 节奏信息
    */
    @SerializedName("Bpm")
    @Expose
    private Long Bpm;

    /**
    * 商业化权益
    */
    @SerializedName("Score")
    @Expose
    private Float Score;

    /**
    * 应用歌曲信息,1.图文/短视频,2.网络直播,3.网络电台FM,4.免费游戏,5.商业游戏,6.网店网站设计,7.广告营销,8.网络长视频
    */
    @SerializedName("Scene")
    @Expose
    private String [] Scene;

    /**
    * 应用地域,1. 中国大陆,2. 中国含港澳台,3. 全球
    */
    @SerializedName("Region")
    @Expose
    private String [] Region;

    /**
    * 授权时间,1. 1年, 5. 随片永久
    */
    @SerializedName("AuthPeriod")
    @Expose
    private String AuthPeriod;

    /**
    * 商业化授权，1. 支持商业化 ,2. 不支持商业化
    */
    @SerializedName("Commercialization")
    @Expose
    private String Commercialization;

    /**
    * 跨平台传播，1. 支持跨平台传播 ,2. 不支持跨平台传播
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * 传播渠道
    */
    @SerializedName("Channel")
    @Expose
    private String Channel;

    /**
     * Get 资源方音乐Id 
     * @return MusicId 资源方音乐Id
     */
    public String getMusicId() {
        return this.MusicId;
    }

    /**
     * Set 资源方音乐Id
     * @param MusicId 资源方音乐Id
     */
    public void setMusicId(String MusicId) {
        this.MusicId = MusicId;
    }

    /**
     * Get 资源方识别信息 
     * @return AmeId 资源方识别信息
     */
    public String getAmeId() {
        return this.AmeId;
    }

    /**
     * Set 资源方识别信息
     * @param AmeId 资源方识别信息
     */
    public void setAmeId(String AmeId) {
        this.AmeId = AmeId;
    }

    /**
     * Get 分类标签 
     * @return Tags 分类标签
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set 分类标签
     * @param Tags 分类标签
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 关键词 
     * @return HitWords 关键词
     */
    public String [] getHitWords() {
        return this.HitWords;
    }

    /**
     * Set 关键词
     * @param HitWords 关键词
     */
    public void setHitWords(String [] HitWords) {
        this.HitWords = HitWords;
    }

    /**
     * Get 节奏信息 
     * @return Bpm 节奏信息
     */
    public Long getBpm() {
        return this.Bpm;
    }

    /**
     * Set 节奏信息
     * @param Bpm 节奏信息
     */
    public void setBpm(Long Bpm) {
        this.Bpm = Bpm;
    }

    /**
     * Get 商业化权益 
     * @return Score 商业化权益
     */
    public Float getScore() {
        return this.Score;
    }

    /**
     * Set 商业化权益
     * @param Score 商业化权益
     */
    public void setScore(Float Score) {
        this.Score = Score;
    }

    /**
     * Get 应用歌曲信息,1.图文/短视频,2.网络直播,3.网络电台FM,4.免费游戏,5.商业游戏,6.网店网站设计,7.广告营销,8.网络长视频 
     * @return Scene 应用歌曲信息,1.图文/短视频,2.网络直播,3.网络电台FM,4.免费游戏,5.商业游戏,6.网店网站设计,7.广告营销,8.网络长视频
     */
    public String [] getScene() {
        return this.Scene;
    }

    /**
     * Set 应用歌曲信息,1.图文/短视频,2.网络直播,3.网络电台FM,4.免费游戏,5.商业游戏,6.网店网站设计,7.广告营销,8.网络长视频
     * @param Scene 应用歌曲信息,1.图文/短视频,2.网络直播,3.网络电台FM,4.免费游戏,5.商业游戏,6.网店网站设计,7.广告营销,8.网络长视频
     */
    public void setScene(String [] Scene) {
        this.Scene = Scene;
    }

    /**
     * Get 应用地域,1. 中国大陆,2. 中国含港澳台,3. 全球 
     * @return Region 应用地域,1. 中国大陆,2. 中国含港澳台,3. 全球
     */
    public String [] getRegion() {
        return this.Region;
    }

    /**
     * Set 应用地域,1. 中国大陆,2. 中国含港澳台,3. 全球
     * @param Region 应用地域,1. 中国大陆,2. 中国含港澳台,3. 全球
     */
    public void setRegion(String [] Region) {
        this.Region = Region;
    }

    /**
     * Get 授权时间,1. 1年, 5. 随片永久 
     * @return AuthPeriod 授权时间,1. 1年, 5. 随片永久
     */
    public String getAuthPeriod() {
        return this.AuthPeriod;
    }

    /**
     * Set 授权时间,1. 1年, 5. 随片永久
     * @param AuthPeriod 授权时间,1. 1年, 5. 随片永久
     */
    public void setAuthPeriod(String AuthPeriod) {
        this.AuthPeriod = AuthPeriod;
    }

    /**
     * Get 商业化授权，1. 支持商业化 ,2. 不支持商业化 
     * @return Commercialization 商业化授权，1. 支持商业化 ,2. 不支持商业化
     */
    public String getCommercialization() {
        return this.Commercialization;
    }

    /**
     * Set 商业化授权，1. 支持商业化 ,2. 不支持商业化
     * @param Commercialization 商业化授权，1. 支持商业化 ,2. 不支持商业化
     */
    public void setCommercialization(String Commercialization) {
        this.Commercialization = Commercialization;
    }

    /**
     * Get 跨平台传播，1. 支持跨平台传播 ,2. 不支持跨平台传播 
     * @return Platform 跨平台传播，1. 支持跨平台传播 ,2. 不支持跨平台传播
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set 跨平台传播，1. 支持跨平台传播 ,2. 不支持跨平台传播
     * @param Platform 跨平台传播，1. 支持跨平台传播 ,2. 不支持跨平台传播
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get 传播渠道 
     * @return Channel 传播渠道
     */
    public String getChannel() {
        return this.Channel;
    }

    /**
     * Set 传播渠道
     * @param Channel 传播渠道
     */
    public void setChannel(String Channel) {
        this.Channel = Channel;
    }

    public MusicDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MusicDetailInfo(MusicDetailInfo source) {
        if (source.MusicId != null) {
            this.MusicId = new String(source.MusicId);
        }
        if (source.AmeId != null) {
            this.AmeId = new String(source.AmeId);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.HitWords != null) {
            this.HitWords = new String[source.HitWords.length];
            for (int i = 0; i < source.HitWords.length; i++) {
                this.HitWords[i] = new String(source.HitWords[i]);
            }
        }
        if (source.Bpm != null) {
            this.Bpm = new Long(source.Bpm);
        }
        if (source.Score != null) {
            this.Score = new Float(source.Score);
        }
        if (source.Scene != null) {
            this.Scene = new String[source.Scene.length];
            for (int i = 0; i < source.Scene.length; i++) {
                this.Scene[i] = new String(source.Scene[i]);
            }
        }
        if (source.Region != null) {
            this.Region = new String[source.Region.length];
            for (int i = 0; i < source.Region.length; i++) {
                this.Region[i] = new String(source.Region[i]);
            }
        }
        if (source.AuthPeriod != null) {
            this.AuthPeriod = new String(source.AuthPeriod);
        }
        if (source.Commercialization != null) {
            this.Commercialization = new String(source.Commercialization);
        }
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.Channel != null) {
            this.Channel = new String(source.Channel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MusicId", this.MusicId);
        this.setParamSimple(map, prefix + "AmeId", this.AmeId);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamArraySimple(map, prefix + "HitWords.", this.HitWords);
        this.setParamSimple(map, prefix + "Bpm", this.Bpm);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamArraySimple(map, prefix + "Scene.", this.Scene);
        this.setParamArraySimple(map, prefix + "Region.", this.Region);
        this.setParamSimple(map, prefix + "AuthPeriod", this.AuthPeriod);
        this.setParamSimple(map, prefix + "Commercialization", this.Commercialization);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "Channel", this.Channel);

    }
}

