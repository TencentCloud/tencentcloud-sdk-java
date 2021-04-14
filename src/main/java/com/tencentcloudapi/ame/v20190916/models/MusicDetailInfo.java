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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MusicId", this.MusicId);
        this.setParamSimple(map, prefix + "AmeId", this.AmeId);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamArraySimple(map, prefix + "HitWords.", this.HitWords);
        this.setParamSimple(map, prefix + "Bpm", this.Bpm);
        this.setParamSimple(map, prefix + "Score", this.Score);

    }
}

