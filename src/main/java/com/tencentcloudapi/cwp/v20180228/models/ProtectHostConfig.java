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

public class ProtectHostConfig extends AbstractModel{

    /**
    * 机器唯一ID
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 防护开关 0  关闭 1开启
    */
    @SerializedName("ProtectSwitch")
    @Expose
    private Long ProtectSwitch;

    /**
    * 自动恢复开关 0 关闭 1开启
    */
    @SerializedName("AutoRecovery")
    @Expose
    private Long AutoRecovery;

    /**
     * Get 机器唯一ID 
     * @return Quuid 机器唯一ID
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 机器唯一ID
     * @param Quuid 机器唯一ID
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get 防护开关 0  关闭 1开启 
     * @return ProtectSwitch 防护开关 0  关闭 1开启
     */
    public Long getProtectSwitch() {
        return this.ProtectSwitch;
    }

    /**
     * Set 防护开关 0  关闭 1开启
     * @param ProtectSwitch 防护开关 0  关闭 1开启
     */
    public void setProtectSwitch(Long ProtectSwitch) {
        this.ProtectSwitch = ProtectSwitch;
    }

    /**
     * Get 自动恢复开关 0 关闭 1开启 
     * @return AutoRecovery 自动恢复开关 0 关闭 1开启
     */
    public Long getAutoRecovery() {
        return this.AutoRecovery;
    }

    /**
     * Set 自动恢复开关 0 关闭 1开启
     * @param AutoRecovery 自动恢复开关 0 关闭 1开启
     */
    public void setAutoRecovery(Long AutoRecovery) {
        this.AutoRecovery = AutoRecovery;
    }

    public ProtectHostConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProtectHostConfig(ProtectHostConfig source) {
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.ProtectSwitch != null) {
            this.ProtectSwitch = new Long(source.ProtectSwitch);
        }
        if (source.AutoRecovery != null) {
            this.AutoRecovery = new Long(source.AutoRecovery);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "ProtectSwitch", this.ProtectSwitch);
        this.setParamSimple(map, prefix + "AutoRecovery", this.AutoRecovery);

    }
}

