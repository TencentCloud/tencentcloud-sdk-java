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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProxyDetailInfo extends AbstractModel{

    /**
    * proxy的唯一id
    */
    @SerializedName("ProxyUid")
    @Expose
    private String ProxyUid;

    /**
    * 机器类型
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * 请求包速度
    */
    @SerializedName("ProcessSpeed")
    @Expose
    private Long ProcessSpeed;

    /**
    * 请求包时延
    */
    @SerializedName("AverageProcessDelay")
    @Expose
    private Long AverageProcessDelay;

    /**
    * 慢处理包速度
    */
    @SerializedName("SlowProcessSpeed")
    @Expose
    private Long SlowProcessSpeed;

    /**
     * Get proxy的唯一id 
     * @return ProxyUid proxy的唯一id
     */
    public String getProxyUid() {
        return this.ProxyUid;
    }

    /**
     * Set proxy的唯一id
     * @param ProxyUid proxy的唯一id
     */
    public void setProxyUid(String ProxyUid) {
        this.ProxyUid = ProxyUid;
    }

    /**
     * Get 机器类型 
     * @return MachineType 机器类型
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set 机器类型
     * @param MachineType 机器类型
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get 请求包速度 
     * @return ProcessSpeed 请求包速度
     */
    public Long getProcessSpeed() {
        return this.ProcessSpeed;
    }

    /**
     * Set 请求包速度
     * @param ProcessSpeed 请求包速度
     */
    public void setProcessSpeed(Long ProcessSpeed) {
        this.ProcessSpeed = ProcessSpeed;
    }

    /**
     * Get 请求包时延 
     * @return AverageProcessDelay 请求包时延
     */
    public Long getAverageProcessDelay() {
        return this.AverageProcessDelay;
    }

    /**
     * Set 请求包时延
     * @param AverageProcessDelay 请求包时延
     */
    public void setAverageProcessDelay(Long AverageProcessDelay) {
        this.AverageProcessDelay = AverageProcessDelay;
    }

    /**
     * Get 慢处理包速度 
     * @return SlowProcessSpeed 慢处理包速度
     */
    public Long getSlowProcessSpeed() {
        return this.SlowProcessSpeed;
    }

    /**
     * Set 慢处理包速度
     * @param SlowProcessSpeed 慢处理包速度
     */
    public void setSlowProcessSpeed(Long SlowProcessSpeed) {
        this.SlowProcessSpeed = SlowProcessSpeed;
    }

    public ProxyDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProxyDetailInfo(ProxyDetailInfo source) {
        if (source.ProxyUid != null) {
            this.ProxyUid = new String(source.ProxyUid);
        }
        if (source.MachineType != null) {
            this.MachineType = new String(source.MachineType);
        }
        if (source.ProcessSpeed != null) {
            this.ProcessSpeed = new Long(source.ProcessSpeed);
        }
        if (source.AverageProcessDelay != null) {
            this.AverageProcessDelay = new Long(source.AverageProcessDelay);
        }
        if (source.SlowProcessSpeed != null) {
            this.SlowProcessSpeed = new Long(source.SlowProcessSpeed);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProxyUid", this.ProxyUid);
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "ProcessSpeed", this.ProcessSpeed);
        this.setParamSimple(map, prefix + "AverageProcessDelay", this.AverageProcessDelay);
        this.setParamSimple(map, prefix + "SlowProcessSpeed", this.SlowProcessSpeed);

    }
}

