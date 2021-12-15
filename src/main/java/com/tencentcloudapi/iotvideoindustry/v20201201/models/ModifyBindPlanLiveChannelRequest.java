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

public class ModifyBindPlanLiveChannelRequest extends AbstractModel{

    /**
    * 直播录制计划ID
    */
    @SerializedName("PlanId")
    @Expose
    private String PlanId;

    /**
    * 1: 绑定 2: 解绑
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 直播频道ID列表
    */
    @SerializedName("LiveChannelIds")
    @Expose
    private String [] LiveChannelIds;

    /**
     * Get 直播录制计划ID 
     * @return PlanId 直播录制计划ID
     */
    public String getPlanId() {
        return this.PlanId;
    }

    /**
     * Set 直播录制计划ID
     * @param PlanId 直播录制计划ID
     */
    public void setPlanId(String PlanId) {
        this.PlanId = PlanId;
    }

    /**
     * Get 1: 绑定 2: 解绑 
     * @return Type 1: 绑定 2: 解绑
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 1: 绑定 2: 解绑
     * @param Type 1: 绑定 2: 解绑
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 直播频道ID列表 
     * @return LiveChannelIds 直播频道ID列表
     */
    public String [] getLiveChannelIds() {
        return this.LiveChannelIds;
    }

    /**
     * Set 直播频道ID列表
     * @param LiveChannelIds 直播频道ID列表
     */
    public void setLiveChannelIds(String [] LiveChannelIds) {
        this.LiveChannelIds = LiveChannelIds;
    }

    public ModifyBindPlanLiveChannelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBindPlanLiveChannelRequest(ModifyBindPlanLiveChannelRequest source) {
        if (source.PlanId != null) {
            this.PlanId = new String(source.PlanId);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.LiveChannelIds != null) {
            this.LiveChannelIds = new String[source.LiveChannelIds.length];
            for (int i = 0; i < source.LiveChannelIds.length; i++) {
                this.LiveChannelIds[i] = new String(source.LiveChannelIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlanId", this.PlanId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "LiveChannelIds.", this.LiveChannelIds);

    }
}

