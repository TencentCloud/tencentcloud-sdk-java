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

public class ModifyStreamPackageLinearAssemblyChannelRequest extends AbstractModel {

    /**
    * Channel Id。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 修改后的名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 定义channel的特性，Standard支持直播和点播源，Basic只支持点播源编排。
    */
    @SerializedName("Tier")
    @Expose
    private String Tier;

    /**
    * 频道中的source切换的模式，分Linear线性和Loop循环，直播只支持Linear。
    */
    @SerializedName("PlaybackMode")
    @Expose
    private String PlaybackMode;

    /**
    * 时移开启开关。
    */
    @SerializedName("TimeShiftEnable")
    @Expose
    private Boolean TimeShiftEnable;

    /**
    * 时移配置。	
    */
    @SerializedName("TimeShiftConf")
    @Expose
    private TimeShiftInfo TimeShiftConf;

    /**
    * 垫片配置。	
    */
    @SerializedName("SlateConf")
    @Expose
    private SlateInfo SlateConf;

    /**
    * 输出配置。	
    */
    @SerializedName("Outputs")
    @Expose
    private OutputInfo [] Outputs;

    /**
     * Get Channel Id。 
     * @return Id Channel Id。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Channel Id。
     * @param Id Channel Id。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 修改后的名称。 
     * @return Name 修改后的名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 修改后的名称。
     * @param Name 修改后的名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 定义channel的特性，Standard支持直播和点播源，Basic只支持点播源编排。 
     * @return Tier 定义channel的特性，Standard支持直播和点播源，Basic只支持点播源编排。
     */
    public String getTier() {
        return this.Tier;
    }

    /**
     * Set 定义channel的特性，Standard支持直播和点播源，Basic只支持点播源编排。
     * @param Tier 定义channel的特性，Standard支持直播和点播源，Basic只支持点播源编排。
     */
    public void setTier(String Tier) {
        this.Tier = Tier;
    }

    /**
     * Get 频道中的source切换的模式，分Linear线性和Loop循环，直播只支持Linear。 
     * @return PlaybackMode 频道中的source切换的模式，分Linear线性和Loop循环，直播只支持Linear。
     */
    public String getPlaybackMode() {
        return this.PlaybackMode;
    }

    /**
     * Set 频道中的source切换的模式，分Linear线性和Loop循环，直播只支持Linear。
     * @param PlaybackMode 频道中的source切换的模式，分Linear线性和Loop循环，直播只支持Linear。
     */
    public void setPlaybackMode(String PlaybackMode) {
        this.PlaybackMode = PlaybackMode;
    }

    /**
     * Get 时移开启开关。 
     * @return TimeShiftEnable 时移开启开关。
     */
    public Boolean getTimeShiftEnable() {
        return this.TimeShiftEnable;
    }

    /**
     * Set 时移开启开关。
     * @param TimeShiftEnable 时移开启开关。
     */
    public void setTimeShiftEnable(Boolean TimeShiftEnable) {
        this.TimeShiftEnable = TimeShiftEnable;
    }

    /**
     * Get 时移配置。	 
     * @return TimeShiftConf 时移配置。	
     */
    public TimeShiftInfo getTimeShiftConf() {
        return this.TimeShiftConf;
    }

    /**
     * Set 时移配置。	
     * @param TimeShiftConf 时移配置。	
     */
    public void setTimeShiftConf(TimeShiftInfo TimeShiftConf) {
        this.TimeShiftConf = TimeShiftConf;
    }

    /**
     * Get 垫片配置。	 
     * @return SlateConf 垫片配置。	
     */
    public SlateInfo getSlateConf() {
        return this.SlateConf;
    }

    /**
     * Set 垫片配置。	
     * @param SlateConf 垫片配置。	
     */
    public void setSlateConf(SlateInfo SlateConf) {
        this.SlateConf = SlateConf;
    }

    /**
     * Get 输出配置。	 
     * @return Outputs 输出配置。	
     */
    public OutputInfo [] getOutputs() {
        return this.Outputs;
    }

    /**
     * Set 输出配置。	
     * @param Outputs 输出配置。	
     */
    public void setOutputs(OutputInfo [] Outputs) {
        this.Outputs = Outputs;
    }

    public ModifyStreamPackageLinearAssemblyChannelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyStreamPackageLinearAssemblyChannelRequest(ModifyStreamPackageLinearAssemblyChannelRequest source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Tier != null) {
            this.Tier = new String(source.Tier);
        }
        if (source.PlaybackMode != null) {
            this.PlaybackMode = new String(source.PlaybackMode);
        }
        if (source.TimeShiftEnable != null) {
            this.TimeShiftEnable = new Boolean(source.TimeShiftEnable);
        }
        if (source.TimeShiftConf != null) {
            this.TimeShiftConf = new TimeShiftInfo(source.TimeShiftConf);
        }
        if (source.SlateConf != null) {
            this.SlateConf = new SlateInfo(source.SlateConf);
        }
        if (source.Outputs != null) {
            this.Outputs = new OutputInfo[source.Outputs.length];
            for (int i = 0; i < source.Outputs.length; i++) {
                this.Outputs[i] = new OutputInfo(source.Outputs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Tier", this.Tier);
        this.setParamSimple(map, prefix + "PlaybackMode", this.PlaybackMode);
        this.setParamSimple(map, prefix + "TimeShiftEnable", this.TimeShiftEnable);
        this.setParamObj(map, prefix + "TimeShiftConf.", this.TimeShiftConf);
        this.setParamObj(map, prefix + "SlateConf.", this.SlateConf);
        this.setParamArrayObj(map, prefix + "Outputs.", this.Outputs);

    }
}

