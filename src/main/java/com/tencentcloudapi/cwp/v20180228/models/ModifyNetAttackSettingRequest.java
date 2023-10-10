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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyNetAttackSettingRequest extends AbstractModel{

    /**
    * 0 关闭网络攻击检测，1开启网络攻击检测
    */
    @SerializedName("NetAttackEnable")
    @Expose
    private Long NetAttackEnable;

    /**
    * 0 新增告警事件默认待处理，1新增告警事件默认已处理，3新增告警事件默认忽略
    */
    @SerializedName("NetAttackAlarmStatus")
    @Expose
    private Long NetAttackAlarmStatus;

    /**
     * Get 0 关闭网络攻击检测，1开启网络攻击检测 
     * @return NetAttackEnable 0 关闭网络攻击检测，1开启网络攻击检测
     */
    public Long getNetAttackEnable() {
        return this.NetAttackEnable;
    }

    /**
     * Set 0 关闭网络攻击检测，1开启网络攻击检测
     * @param NetAttackEnable 0 关闭网络攻击检测，1开启网络攻击检测
     */
    public void setNetAttackEnable(Long NetAttackEnable) {
        this.NetAttackEnable = NetAttackEnable;
    }

    /**
     * Get 0 新增告警事件默认待处理，1新增告警事件默认已处理，3新增告警事件默认忽略 
     * @return NetAttackAlarmStatus 0 新增告警事件默认待处理，1新增告警事件默认已处理，3新增告警事件默认忽略
     */
    public Long getNetAttackAlarmStatus() {
        return this.NetAttackAlarmStatus;
    }

    /**
     * Set 0 新增告警事件默认待处理，1新增告警事件默认已处理，3新增告警事件默认忽略
     * @param NetAttackAlarmStatus 0 新增告警事件默认待处理，1新增告警事件默认已处理，3新增告警事件默认忽略
     */
    public void setNetAttackAlarmStatus(Long NetAttackAlarmStatus) {
        this.NetAttackAlarmStatus = NetAttackAlarmStatus;
    }

    public ModifyNetAttackSettingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNetAttackSettingRequest(ModifyNetAttackSettingRequest source) {
        if (source.NetAttackEnable != null) {
            this.NetAttackEnable = new Long(source.NetAttackEnable);
        }
        if (source.NetAttackAlarmStatus != null) {
            this.NetAttackAlarmStatus = new Long(source.NetAttackAlarmStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NetAttackEnable", this.NetAttackEnable);
        this.setParamSimple(map, prefix + "NetAttackAlarmStatus", this.NetAttackAlarmStatus);

    }
}

