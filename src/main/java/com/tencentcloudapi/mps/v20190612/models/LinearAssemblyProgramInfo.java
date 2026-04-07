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

public class LinearAssemblyProgramInfo extends AbstractModel {

    /**
    * program名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 编排的目标source的类型，分直播和点播。
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * 关联的source location id。
    */
    @SerializedName("SourceLocationId")
    @Expose
    private String SourceLocationId;

    /**
    * SourceId，唯一标识一个source。
    */
    @SerializedName("SourceId")
    @Expose
    private String SourceId;

    /**
    * 关联的直播or点播，source名称，location下全局唯一。
    */
    @SerializedName("SourceName")
    @Expose
    private String SourceName;

    /**
    * 绑定的channel。
    */
    @SerializedName("AttachedChannel")
    @Expose
    private String AttachedChannel;

    /**
    * 播放配置。
    */
    @SerializedName("PlaybackConf")
    @Expose
    private PlaybackInfo PlaybackConf;

    /**
    * AdBreaks。
    */
    @SerializedName("AdBreaks")
    @Expose
    private AdBreakInfo [] AdBreaks;

    /**
    * Id。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Region。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * SourceLocation名称。
    */
    @SerializedName("SourceLocationName")
    @Expose
    private String SourceLocationName;

    /**
     * Get program名称。 
     * @return Name program名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set program名称。
     * @param Name program名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 编排的目标source的类型，分直播和点播。 
     * @return SourceType 编排的目标source的类型，分直播和点播。
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 编排的目标source的类型，分直播和点播。
     * @param SourceType 编排的目标source的类型，分直播和点播。
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get 关联的source location id。 
     * @return SourceLocationId 关联的source location id。
     */
    public String getSourceLocationId() {
        return this.SourceLocationId;
    }

    /**
     * Set 关联的source location id。
     * @param SourceLocationId 关联的source location id。
     */
    public void setSourceLocationId(String SourceLocationId) {
        this.SourceLocationId = SourceLocationId;
    }

    /**
     * Get SourceId，唯一标识一个source。 
     * @return SourceId SourceId，唯一标识一个source。
     */
    public String getSourceId() {
        return this.SourceId;
    }

    /**
     * Set SourceId，唯一标识一个source。
     * @param SourceId SourceId，唯一标识一个source。
     */
    public void setSourceId(String SourceId) {
        this.SourceId = SourceId;
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
     * Get 播放配置。 
     * @return PlaybackConf 播放配置。
     */
    public PlaybackInfo getPlaybackConf() {
        return this.PlaybackConf;
    }

    /**
     * Set 播放配置。
     * @param PlaybackConf 播放配置。
     */
    public void setPlaybackConf(PlaybackInfo PlaybackConf) {
        this.PlaybackConf = PlaybackConf;
    }

    /**
     * Get AdBreaks。 
     * @return AdBreaks AdBreaks。
     */
    public AdBreakInfo [] getAdBreaks() {
        return this.AdBreaks;
    }

    /**
     * Set AdBreaks。
     * @param AdBreaks AdBreaks。
     */
    public void setAdBreaks(AdBreakInfo [] AdBreaks) {
        this.AdBreaks = AdBreaks;
    }

    /**
     * Get Id。 
     * @return Id Id。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Id。
     * @param Id Id。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Region。 
     * @return Region Region。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region。
     * @param Region Region。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get SourceLocation名称。 
     * @return SourceLocationName SourceLocation名称。
     */
    public String getSourceLocationName() {
        return this.SourceLocationName;
    }

    /**
     * Set SourceLocation名称。
     * @param SourceLocationName SourceLocation名称。
     */
    public void setSourceLocationName(String SourceLocationName) {
        this.SourceLocationName = SourceLocationName;
    }

    public LinearAssemblyProgramInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LinearAssemblyProgramInfo(LinearAssemblyProgramInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.SourceLocationId != null) {
            this.SourceLocationId = new String(source.SourceLocationId);
        }
        if (source.SourceId != null) {
            this.SourceId = new String(source.SourceId);
        }
        if (source.SourceName != null) {
            this.SourceName = new String(source.SourceName);
        }
        if (source.AttachedChannel != null) {
            this.AttachedChannel = new String(source.AttachedChannel);
        }
        if (source.PlaybackConf != null) {
            this.PlaybackConf = new PlaybackInfo(source.PlaybackConf);
        }
        if (source.AdBreaks != null) {
            this.AdBreaks = new AdBreakInfo[source.AdBreaks.length];
            for (int i = 0; i < source.AdBreaks.length; i++) {
                this.AdBreaks[i] = new AdBreakInfo(source.AdBreaks[i]);
            }
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.SourceLocationName != null) {
            this.SourceLocationName = new String(source.SourceLocationName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "SourceLocationId", this.SourceLocationId);
        this.setParamSimple(map, prefix + "SourceId", this.SourceId);
        this.setParamSimple(map, prefix + "SourceName", this.SourceName);
        this.setParamSimple(map, prefix + "AttachedChannel", this.AttachedChannel);
        this.setParamObj(map, prefix + "PlaybackConf.", this.PlaybackConf);
        this.setParamArrayObj(map, prefix + "AdBreaks.", this.AdBreaks);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "SourceLocationName", this.SourceLocationName);

    }
}

