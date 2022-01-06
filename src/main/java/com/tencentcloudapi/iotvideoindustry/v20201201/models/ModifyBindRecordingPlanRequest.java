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
package com.tencentcloudapi.iotvideoindustry.v20201201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyBindRecordingPlanRequest extends AbstractModel{

    /**
    * 操作类型： 1-绑定设备 ；2-解绑设备
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 录制计划ID
    */
    @SerializedName("PlanId")
    @Expose
    private String PlanId;

    /**
    * 录制通道列表
    */
    @SerializedName("Channels")
    @Expose
    private ChannelItem [] Channels;

    /**
     * Get 操作类型： 1-绑定设备 ；2-解绑设备 
     * @return Type 操作类型： 1-绑定设备 ；2-解绑设备
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 操作类型： 1-绑定设备 ；2-解绑设备
     * @param Type 操作类型： 1-绑定设备 ；2-解绑设备
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 录制计划ID 
     * @return PlanId 录制计划ID
     */
    public String getPlanId() {
        return this.PlanId;
    }

    /**
     * Set 录制计划ID
     * @param PlanId 录制计划ID
     */
    public void setPlanId(String PlanId) {
        this.PlanId = PlanId;
    }

    /**
     * Get 录制通道列表 
     * @return Channels 录制通道列表
     */
    public ChannelItem [] getChannels() {
        return this.Channels;
    }

    /**
     * Set 录制通道列表
     * @param Channels 录制通道列表
     */
    public void setChannels(ChannelItem [] Channels) {
        this.Channels = Channels;
    }

    public ModifyBindRecordingPlanRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBindRecordingPlanRequest(ModifyBindRecordingPlanRequest source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.PlanId != null) {
            this.PlanId = new String(source.PlanId);
        }
        if (source.Channels != null) {
            this.Channels = new ChannelItem[source.Channels.length];
            for (int i = 0; i < source.Channels.length; i++) {
                this.Channels[i] = new ChannelItem(source.Channels[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "PlanId", this.PlanId);
        this.setParamArrayObj(map, prefix + "Channels.", this.Channels);

    }
}

