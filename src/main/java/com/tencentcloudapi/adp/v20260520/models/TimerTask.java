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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TimerTask extends AbstractModel {

    /**
    * 任务配置
    */
    @SerializedName("Config")
    @Expose
    private TimerConfig Config;

    /**
    * staffBizId
    */
    @SerializedName("OwnerUserId")
    @Expose
    private String OwnerUserId;

    /**
    * 定时配置概要
    */
    @SerializedName("PolicySummary")
    @Expose
    private String PolicySummary;

    /**
    * 概要信息
    */
    @SerializedName("Profile")
    @Expose
    private TimerProfile Profile;

    /**
    * 空间ID
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * 任务状态
    */
    @SerializedName("Status")
    @Expose
    private TimerStatus Status;

    /**
    * 任务ID
    */
    @SerializedName("TimerId")
    @Expose
    private String TimerId;

    /**
     * Get 任务配置 
     * @return Config 任务配置
     */
    public TimerConfig getConfig() {
        return this.Config;
    }

    /**
     * Set 任务配置
     * @param Config 任务配置
     */
    public void setConfig(TimerConfig Config) {
        this.Config = Config;
    }

    /**
     * Get staffBizId 
     * @return OwnerUserId staffBizId
     */
    public String getOwnerUserId() {
        return this.OwnerUserId;
    }

    /**
     * Set staffBizId
     * @param OwnerUserId staffBizId
     */
    public void setOwnerUserId(String OwnerUserId) {
        this.OwnerUserId = OwnerUserId;
    }

    /**
     * Get 定时配置概要 
     * @return PolicySummary 定时配置概要
     */
    public String getPolicySummary() {
        return this.PolicySummary;
    }

    /**
     * Set 定时配置概要
     * @param PolicySummary 定时配置概要
     */
    public void setPolicySummary(String PolicySummary) {
        this.PolicySummary = PolicySummary;
    }

    /**
     * Get 概要信息 
     * @return Profile 概要信息
     */
    public TimerProfile getProfile() {
        return this.Profile;
    }

    /**
     * Set 概要信息
     * @param Profile 概要信息
     */
    public void setProfile(TimerProfile Profile) {
        this.Profile = Profile;
    }

    /**
     * Get 空间ID 
     * @return SpaceId 空间ID
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set 空间ID
     * @param SpaceId 空间ID
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    /**
     * Get 任务状态 
     * @return Status 任务状态
     */
    public TimerStatus getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态
     * @param Status 任务状态
     */
    public void setStatus(TimerStatus Status) {
        this.Status = Status;
    }

    /**
     * Get 任务ID 
     * @return TimerId 任务ID
     */
    public String getTimerId() {
        return this.TimerId;
    }

    /**
     * Set 任务ID
     * @param TimerId 任务ID
     */
    public void setTimerId(String TimerId) {
        this.TimerId = TimerId;
    }

    public TimerTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TimerTask(TimerTask source) {
        if (source.Config != null) {
            this.Config = new TimerConfig(source.Config);
        }
        if (source.OwnerUserId != null) {
            this.OwnerUserId = new String(source.OwnerUserId);
        }
        if (source.PolicySummary != null) {
            this.PolicySummary = new String(source.PolicySummary);
        }
        if (source.Profile != null) {
            this.Profile = new TimerProfile(source.Profile);
        }
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
        if (source.Status != null) {
            this.Status = new TimerStatus(source.Status);
        }
        if (source.TimerId != null) {
            this.TimerId = new String(source.TimerId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Config.", this.Config);
        this.setParamSimple(map, prefix + "OwnerUserId", this.OwnerUserId);
        this.setParamSimple(map, prefix + "PolicySummary", this.PolicySummary);
        this.setParamObj(map, prefix + "Profile.", this.Profile);
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamObj(map, prefix + "Status.", this.Status);
        this.setParamSimple(map, prefix + "TimerId", this.TimerId);

    }
}

