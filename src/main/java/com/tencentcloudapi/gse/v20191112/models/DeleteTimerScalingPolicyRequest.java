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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteTimerScalingPolicyRequest extends AbstractModel{

    /**
    * 定时器ID, 进行encode
    */
    @SerializedName("TimerId")
    @Expose
    private String TimerId;

    /**
    * 扩缩容配置服务器舰队ID
    */
    @SerializedName("FleetId")
    @Expose
    private String FleetId;

    /**
    * 定时器名称
    */
    @SerializedName("TimerName")
    @Expose
    private String TimerName;

    /**
     * Get 定时器ID, 进行encode 
     * @return TimerId 定时器ID, 进行encode
     */
    public String getTimerId() {
        return this.TimerId;
    }

    /**
     * Set 定时器ID, 进行encode
     * @param TimerId 定时器ID, 进行encode
     */
    public void setTimerId(String TimerId) {
        this.TimerId = TimerId;
    }

    /**
     * Get 扩缩容配置服务器舰队ID 
     * @return FleetId 扩缩容配置服务器舰队ID
     */
    public String getFleetId() {
        return this.FleetId;
    }

    /**
     * Set 扩缩容配置服务器舰队ID
     * @param FleetId 扩缩容配置服务器舰队ID
     */
    public void setFleetId(String FleetId) {
        this.FleetId = FleetId;
    }

    /**
     * Get 定时器名称 
     * @return TimerName 定时器名称
     */
    public String getTimerName() {
        return this.TimerName;
    }

    /**
     * Set 定时器名称
     * @param TimerName 定时器名称
     */
    public void setTimerName(String TimerName) {
        this.TimerName = TimerName;
    }

    public DeleteTimerScalingPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteTimerScalingPolicyRequest(DeleteTimerScalingPolicyRequest source) {
        if (source.TimerId != null) {
            this.TimerId = new String(source.TimerId);
        }
        if (source.FleetId != null) {
            this.FleetId = new String(source.FleetId);
        }
        if (source.TimerName != null) {
            this.TimerName = new String(source.TimerName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimerId", this.TimerId);
        this.setParamSimple(map, prefix + "FleetId", this.FleetId);
        this.setParamSimple(map, prefix + "TimerName", this.TimerName);

    }
}

