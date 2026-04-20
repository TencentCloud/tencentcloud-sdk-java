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

public class ModifyStreamPackageLinearAssemblyProgramRequest extends AbstractModel {

    /**
    * <p>Program Id。</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>修改后的名称。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>编排的目标source的类型，分直播和点播。Tier为Basic时只支持VOD，Tier为Standard时支持Live和VOD</p>
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * <p>关联的source location。</p>
    */
    @SerializedName("SourceLocationId")
    @Expose
    private String SourceLocationId;

    /**
    * <p>关联的直播or点播，source名称，location下全局唯一。</p>
    */
    @SerializedName("SourceName")
    @Expose
    private String SourceName;

    /**
    * <p>PlaybackConf。</p>
    */
    @SerializedName("PlaybackConf")
    @Expose
    private PlaybackInfoReq PlaybackConf;

    /**
    * <p>AdBreaks。</p>
    */
    @SerializedName("AdBreaks")
    @Expose
    private AdBreakInfo [] AdBreaks;

    /**
    * <p>VOD获取方式，支持PreCaching和DynamicUpdating，默认PreCaching，仅Linear频道支持</p>
    */
    @SerializedName("VodAcquisitionMethod")
    @Expose
    private String VodAcquisitionMethod;

    /**
     * Get <p>Program Id。</p> 
     * @return Id <p>Program Id。</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>Program Id。</p>
     * @param Id <p>Program Id。</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>修改后的名称。</p> 
     * @return Name <p>修改后的名称。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>修改后的名称。</p>
     * @param Name <p>修改后的名称。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>编排的目标source的类型，分直播和点播。Tier为Basic时只支持VOD，Tier为Standard时支持Live和VOD</p> 
     * @return SourceType <p>编排的目标source的类型，分直播和点播。Tier为Basic时只支持VOD，Tier为Standard时支持Live和VOD</p>
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set <p>编排的目标source的类型，分直播和点播。Tier为Basic时只支持VOD，Tier为Standard时支持Live和VOD</p>
     * @param SourceType <p>编排的目标source的类型，分直播和点播。Tier为Basic时只支持VOD，Tier为Standard时支持Live和VOD</p>
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get <p>关联的source location。</p> 
     * @return SourceLocationId <p>关联的source location。</p>
     */
    public String getSourceLocationId() {
        return this.SourceLocationId;
    }

    /**
     * Set <p>关联的source location。</p>
     * @param SourceLocationId <p>关联的source location。</p>
     */
    public void setSourceLocationId(String SourceLocationId) {
        this.SourceLocationId = SourceLocationId;
    }

    /**
     * Get <p>关联的直播or点播，source名称，location下全局唯一。</p> 
     * @return SourceName <p>关联的直播or点播，source名称，location下全局唯一。</p>
     */
    public String getSourceName() {
        return this.SourceName;
    }

    /**
     * Set <p>关联的直播or点播，source名称，location下全局唯一。</p>
     * @param SourceName <p>关联的直播or点播，source名称，location下全局唯一。</p>
     */
    public void setSourceName(String SourceName) {
        this.SourceName = SourceName;
    }

    /**
     * Get <p>PlaybackConf。</p> 
     * @return PlaybackConf <p>PlaybackConf。</p>
     */
    public PlaybackInfoReq getPlaybackConf() {
        return this.PlaybackConf;
    }

    /**
     * Set <p>PlaybackConf。</p>
     * @param PlaybackConf <p>PlaybackConf。</p>
     */
    public void setPlaybackConf(PlaybackInfoReq PlaybackConf) {
        this.PlaybackConf = PlaybackConf;
    }

    /**
     * Get <p>AdBreaks。</p> 
     * @return AdBreaks <p>AdBreaks。</p>
     */
    public AdBreakInfo [] getAdBreaks() {
        return this.AdBreaks;
    }

    /**
     * Set <p>AdBreaks。</p>
     * @param AdBreaks <p>AdBreaks。</p>
     */
    public void setAdBreaks(AdBreakInfo [] AdBreaks) {
        this.AdBreaks = AdBreaks;
    }

    /**
     * Get <p>VOD获取方式，支持PreCaching和DynamicUpdating，默认PreCaching，仅Linear频道支持</p> 
     * @return VodAcquisitionMethod <p>VOD获取方式，支持PreCaching和DynamicUpdating，默认PreCaching，仅Linear频道支持</p>
     */
    public String getVodAcquisitionMethod() {
        return this.VodAcquisitionMethod;
    }

    /**
     * Set <p>VOD获取方式，支持PreCaching和DynamicUpdating，默认PreCaching，仅Linear频道支持</p>
     * @param VodAcquisitionMethod <p>VOD获取方式，支持PreCaching和DynamicUpdating，默认PreCaching，仅Linear频道支持</p>
     */
    public void setVodAcquisitionMethod(String VodAcquisitionMethod) {
        this.VodAcquisitionMethod = VodAcquisitionMethod;
    }

    public ModifyStreamPackageLinearAssemblyProgramRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyStreamPackageLinearAssemblyProgramRequest(ModifyStreamPackageLinearAssemblyProgramRequest source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
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
        if (source.VodAcquisitionMethod != null) {
            this.VodAcquisitionMethod = new String(source.VodAcquisitionMethod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "SourceLocationId", this.SourceLocationId);
        this.setParamSimple(map, prefix + "SourceName", this.SourceName);
        this.setParamObj(map, prefix + "PlaybackConf.", this.PlaybackConf);
        this.setParamArrayObj(map, prefix + "AdBreaks.", this.AdBreaks);
        this.setParamSimple(map, prefix + "VodAcquisitionMethod", this.VodAcquisitionMethod);

    }
}

