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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateStreamPackageLinearAssemblyProgramRequest extends AbstractModel {

    /**
    * Program名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 绑定的channel。
    */
    @SerializedName("AttachedChannel")
    @Expose
    private String AttachedChannel;

    /**
    * 编排的目标source的类型，分直播Live和点播VOD。Tier为Basic时只支持VOD，Tier为Standard时支持Live和VOD
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * 关联的source location。
    */
    @SerializedName("SourceLocationId")
    @Expose
    private String SourceLocationId;

    /**
    * 关联的直播or点播，source名称，location下全局唯一。
    */
    @SerializedName("SourceName")
    @Expose
    private String SourceName;

    /**
    * PlaybackConf。
    */
    @SerializedName("PlaybackConf")
    @Expose
    private PlaybackInfoReq PlaybackConf;

    /**
    * AdBreaks，只有source类型为Vod时有效。
    */
    @SerializedName("AdBreaks")
    @Expose
    private AdBreakInfo [] AdBreaks;

    /**
     * Get Program名称。 
     * @return Name Program名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Program名称。
     * @param Name Program名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 绑定的channel。 
     * @return AttachedChannel 绑定的channel。
     */
    public String getAttachedChannel() {
        return this.AttachedChannel;
    }

    /**
     * Set 绑定的channel。
     * @param AttachedChannel 绑定的channel。
     */
    public void setAttachedChannel(String AttachedChannel) {
        this.AttachedChannel = AttachedChannel;
    }

    /**
     * Get 编排的目标source的类型，分直播Live和点播VOD。Tier为Basic时只支持VOD，Tier为Standard时支持Live和VOD 
     * @return SourceType 编排的目标source的类型，分直播Live和点播VOD。Tier为Basic时只支持VOD，Tier为Standard时支持Live和VOD
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 编排的目标source的类型，分直播Live和点播VOD。Tier为Basic时只支持VOD，Tier为Standard时支持Live和VOD
     * @param SourceType 编排的目标source的类型，分直播Live和点播VOD。Tier为Basic时只支持VOD，Tier为Standard时支持Live和VOD
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get 关联的source location。 
     * @return SourceLocationId 关联的source location。
     */
    public String getSourceLocationId() {
        return this.SourceLocationId;
    }

    /**
     * Set 关联的source location。
     * @param SourceLocationId 关联的source location。
     */
    public void setSourceLocationId(String SourceLocationId) {
        this.SourceLocationId = SourceLocationId;
    }

    /**
     * Get 关联的直播or点播，source名称，location下全局唯一。 
     * @return SourceName 关联的直播or点播，source名称，location下全局唯一。
     */
    public String getSourceName() {
        return this.SourceName;
    }

    /**
     * Set 关联的直播or点播，source名称，location下全局唯一。
     * @param SourceName 关联的直播or点播，source名称，location下全局唯一。
     */
    public void setSourceName(String SourceName) {
        this.SourceName = SourceName;
    }

    /**
     * Get PlaybackConf。 
     * @return PlaybackConf PlaybackConf。
     */
    public PlaybackInfoReq getPlaybackConf() {
        return this.PlaybackConf;
    }

    /**
     * Set PlaybackConf。
     * @param PlaybackConf PlaybackConf。
     */
    public void setPlaybackConf(PlaybackInfoReq PlaybackConf) {
        this.PlaybackConf = PlaybackConf;
    }

    /**
     * Get AdBreaks，只有source类型为Vod时有效。 
     * @return AdBreaks AdBreaks，只有source类型为Vod时有效。
     */
    public AdBreakInfo [] getAdBreaks() {
        return this.AdBreaks;
    }

    /**
     * Set AdBreaks，只有source类型为Vod时有效。
     * @param AdBreaks AdBreaks，只有source类型为Vod时有效。
     */
    public void setAdBreaks(AdBreakInfo [] AdBreaks) {
        this.AdBreaks = AdBreaks;
    }

    public CreateStreamPackageLinearAssemblyProgramRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateStreamPackageLinearAssemblyProgramRequest(CreateStreamPackageLinearAssemblyProgramRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.AttachedChannel != null) {
            this.AttachedChannel = new String(source.AttachedChannel);
        }
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.SourceLocationId != null) {
            this.SourceLocationId = new String(source.SourceLocationId);
        }
        if (source.SourceName != null) {
            this.SourceName = new String(source.SourceName);
        }
        if (source.PlaybackConf != null) {
            this.PlaybackConf = new PlaybackInfoReq(source.PlaybackConf);
        }
        if (source.AdBreaks != null) {
            this.AdBreaks = new AdBreakInfo[source.AdBreaks.length];
            for (int i = 0; i < source.AdBreaks.length; i++) {
                this.AdBreaks[i] = new AdBreakInfo(source.AdBreaks[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "AttachedChannel", this.AttachedChannel);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "SourceLocationId", this.SourceLocationId);
        this.setParamSimple(map, prefix + "SourceName", this.SourceName);
        this.setParamObj(map, prefix + "PlaybackConf.", this.PlaybackConf);
        this.setParamArrayObj(map, prefix + "AdBreaks.", this.AdBreaks);

    }
}

