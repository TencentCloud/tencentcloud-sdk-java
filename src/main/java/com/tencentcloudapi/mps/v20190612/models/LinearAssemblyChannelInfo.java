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

public class LinearAssemblyChannelInfo extends AbstractModel {

    /**
    * <p>线性组装频道名称。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>定义channel的特性，Standard支持直播和点播源，Basic只支持点播源编排。</p>
    */
    @SerializedName("Tier")
    @Expose
    private String Tier;

    /**
    * <p>频道中的source切换的模式，分Linear线性和Loop循环，直播只支持Linear。</p>
    */
    @SerializedName("PlaybackMode")
    @Expose
    private String PlaybackMode;

    /**
    * <p>时移配置，vod有效。</p>
    */
    @SerializedName("TimeShiftConf")
    @Expose
    private TimeShiftInfo TimeShiftConf;

    /**
    * <p>垫片配置。</p>
    */
    @SerializedName("SlateConf")
    @Expose
    private SlateInfo SlateConf;

    /**
    * <p>output信息。</p>
    */
    @SerializedName("Outputs")
    @Expose
    private OutputInfo [] Outputs;

    /**
    * <p>该channel绑定的program列表。</p>
    */
    @SerializedName("AttachedPrograms")
    @Expose
    private String [] AttachedPrograms;

    /**
    * <p>program信息。</p>
    */
    @SerializedName("ProgramSchedules")
    @Expose
    private ProgramScheduleInfo [] ProgramSchedules;

    /**
    * <p>Id。</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>Region。</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>State。</p>
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * <p>时移开启开关。</p>
    */
    @SerializedName("TimeShiftEnable")
    @Expose
    private Boolean TimeShiftEnable;

    /**
    * <p>channel创建时间，unix秒时间戳。</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
     * Get <p>线性组装频道名称。</p> 
     * @return Name <p>线性组装频道名称。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>线性组装频道名称。</p>
     * @param Name <p>线性组装频道名称。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>定义channel的特性，Standard支持直播和点播源，Basic只支持点播源编排。</p> 
     * @return Tier <p>定义channel的特性，Standard支持直播和点播源，Basic只支持点播源编排。</p>
     */
    public String getTier() {
        return this.Tier;
    }

    /**
     * Set <p>定义channel的特性，Standard支持直播和点播源，Basic只支持点播源编排。</p>
     * @param Tier <p>定义channel的特性，Standard支持直播和点播源，Basic只支持点播源编排。</p>
     */
    public void setTier(String Tier) {
        this.Tier = Tier;
    }

    /**
     * Get <p>频道中的source切换的模式，分Linear线性和Loop循环，直播只支持Linear。</p> 
     * @return PlaybackMode <p>频道中的source切换的模式，分Linear线性和Loop循环，直播只支持Linear。</p>
     */
    public String getPlaybackMode() {
        return this.PlaybackMode;
    }

    /**
     * Set <p>频道中的source切换的模式，分Linear线性和Loop循环，直播只支持Linear。</p>
     * @param PlaybackMode <p>频道中的source切换的模式，分Linear线性和Loop循环，直播只支持Linear。</p>
     */
    public void setPlaybackMode(String PlaybackMode) {
        this.PlaybackMode = PlaybackMode;
    }

    /**
     * Get <p>时移配置，vod有效。</p> 
     * @return TimeShiftConf <p>时移配置，vod有效。</p>
     */
    public TimeShiftInfo getTimeShiftConf() {
        return this.TimeShiftConf;
    }

    /**
     * Set <p>时移配置，vod有效。</p>
     * @param TimeShiftConf <p>时移配置，vod有效。</p>
     */
    public void setTimeShiftConf(TimeShiftInfo TimeShiftConf) {
        this.TimeShiftConf = TimeShiftConf;
    }

    /**
     * Get <p>垫片配置。</p> 
     * @return SlateConf <p>垫片配置。</p>
     */
    public SlateInfo getSlateConf() {
        return this.SlateConf;
    }

    /**
     * Set <p>垫片配置。</p>
     * @param SlateConf <p>垫片配置。</p>
     */
    public void setSlateConf(SlateInfo SlateConf) {
        this.SlateConf = SlateConf;
    }

    /**
     * Get <p>output信息。</p> 
     * @return Outputs <p>output信息。</p>
     */
    public OutputInfo [] getOutputs() {
        return this.Outputs;
    }

    /**
     * Set <p>output信息。</p>
     * @param Outputs <p>output信息。</p>
     */
    public void setOutputs(OutputInfo [] Outputs) {
        this.Outputs = Outputs;
    }

    /**
     * Get <p>该channel绑定的program列表。</p> 
     * @return AttachedPrograms <p>该channel绑定的program列表。</p>
     */
    public String [] getAttachedPrograms() {
        return this.AttachedPrograms;
    }

    /**
     * Set <p>该channel绑定的program列表。</p>
     * @param AttachedPrograms <p>该channel绑定的program列表。</p>
     */
    public void setAttachedPrograms(String [] AttachedPrograms) {
        this.AttachedPrograms = AttachedPrograms;
    }

    /**
     * Get <p>program信息。</p> 
     * @return ProgramSchedules <p>program信息。</p>
     */
    public ProgramScheduleInfo [] getProgramSchedules() {
        return this.ProgramSchedules;
    }

    /**
     * Set <p>program信息。</p>
     * @param ProgramSchedules <p>program信息。</p>
     */
    public void setProgramSchedules(ProgramScheduleInfo [] ProgramSchedules) {
        this.ProgramSchedules = ProgramSchedules;
    }

    /**
     * Get <p>Id。</p> 
     * @return Id <p>Id。</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>Id。</p>
     * @param Id <p>Id。</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>Region。</p> 
     * @return Region <p>Region。</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>Region。</p>
     * @param Region <p>Region。</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>State。</p> 
     * @return State <p>State。</p>
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set <p>State。</p>
     * @param State <p>State。</p>
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get <p>时移开启开关。</p> 
     * @return TimeShiftEnable <p>时移开启开关。</p>
     */
    public Boolean getTimeShiftEnable() {
        return this.TimeShiftEnable;
    }

    /**
     * Set <p>时移开启开关。</p>
     * @param TimeShiftEnable <p>时移开启开关。</p>
     */
    public void setTimeShiftEnable(Boolean TimeShiftEnable) {
        this.TimeShiftEnable = TimeShiftEnable;
    }

    /**
     * Get <p>channel创建时间，unix秒时间戳。</p> 
     * @return CreateTime <p>channel创建时间，unix秒时间戳。</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>channel创建时间，unix秒时间戳。</p>
     * @param CreateTime <p>channel创建时间，unix秒时间戳。</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    public LinearAssemblyChannelInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LinearAssemblyChannelInfo(LinearAssemblyChannelInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Tier != null) {
            this.Tier = new String(source.Tier);
        }
        if (source.PlaybackMode != null) {
            this.PlaybackMode = new String(source.PlaybackMode);
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
        if (source.AttachedPrograms != null) {
            this.AttachedPrograms = new String[source.AttachedPrograms.length];
            for (int i = 0; i < source.AttachedPrograms.length; i++) {
                this.AttachedPrograms[i] = new String(source.AttachedPrograms[i]);
            }
        }
        if (source.ProgramSchedules != null) {
            this.ProgramSchedules = new ProgramScheduleInfo[source.ProgramSchedules.length];
            for (int i = 0; i < source.ProgramSchedules.length; i++) {
                this.ProgramSchedules[i] = new ProgramScheduleInfo(source.ProgramSchedules[i]);
            }
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.TimeShiftEnable != null) {
            this.TimeShiftEnable = new Boolean(source.TimeShiftEnable);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Tier", this.Tier);
        this.setParamSimple(map, prefix + "PlaybackMode", this.PlaybackMode);
        this.setParamObj(map, prefix + "TimeShiftConf.", this.TimeShiftConf);
        this.setParamObj(map, prefix + "SlateConf.", this.SlateConf);
        this.setParamArrayObj(map, prefix + "Outputs.", this.Outputs);
        this.setParamArraySimple(map, prefix + "AttachedPrograms.", this.AttachedPrograms);
        this.setParamArrayObj(map, prefix + "ProgramSchedules.", this.ProgramSchedules);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "TimeShiftEnable", this.TimeShiftEnable);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

