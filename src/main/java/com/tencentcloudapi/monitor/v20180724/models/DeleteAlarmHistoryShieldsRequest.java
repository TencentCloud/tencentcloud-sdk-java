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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteAlarmHistoryShieldsRequest extends AbstractModel {

    /**
    * 模块名，这里填“monitor”
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 屏蔽策略Id列表
    */
    @SerializedName("Shields")
    @Expose
    private String [] Shields;

    /**
    * 监控类型
    */
    @SerializedName("MonitorType")
    @Expose
    private String MonitorType;

    /**
     * Get 模块名，这里填“monitor” 
     * @return Module 模块名，这里填“monitor”
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 模块名，这里填“monitor”
     * @param Module 模块名，这里填“monitor”
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 屏蔽策略Id列表 
     * @return Shields 屏蔽策略Id列表
     */
    public String [] getShields() {
        return this.Shields;
    }

    /**
     * Set 屏蔽策略Id列表
     * @param Shields 屏蔽策略Id列表
     */
    public void setShields(String [] Shields) {
        this.Shields = Shields;
    }

    /**
     * Get 监控类型 
     * @return MonitorType 监控类型
     */
    public String getMonitorType() {
        return this.MonitorType;
    }

    /**
     * Set 监控类型
     * @param MonitorType 监控类型
     */
    public void setMonitorType(String MonitorType) {
        this.MonitorType = MonitorType;
    }

    public DeleteAlarmHistoryShieldsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteAlarmHistoryShieldsRequest(DeleteAlarmHistoryShieldsRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.Shields != null) {
            this.Shields = new String[source.Shields.length];
            for (int i = 0; i < source.Shields.length; i++) {
                this.Shields[i] = new String(source.Shields[i]);
            }
        }
        if (source.MonitorType != null) {
            this.MonitorType = new String(source.MonitorType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamArraySimple(map, prefix + "Shields.", this.Shields);
        this.setParamSimple(map, prefix + "MonitorType", this.MonitorType);

    }
}

