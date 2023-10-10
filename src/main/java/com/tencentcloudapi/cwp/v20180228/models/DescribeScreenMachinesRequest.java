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

public class DescribeScreenMachinesRequest extends AbstractModel{

    /**
    * 主机区域
    */
    @SerializedName("MachineRegion")
    @Expose
    private String MachineRegion;

    /**
    * IP 支持内网IP,主机别名
    */
    @SerializedName("MachineIpOrAlias")
    @Expose
    private String MachineIpOrAlias;

    /**
    * 风险状态类型：0：全部类型，1：风险主机，2：潜在风险主机 ， 3：已关机/离线主机，4：无风险主机
    */
    @SerializedName("SecurityStatus")
    @Expose
    private Long SecurityStatus;

    /**
     * Get 主机区域 
     * @return MachineRegion 主机区域
     */
    public String getMachineRegion() {
        return this.MachineRegion;
    }

    /**
     * Set 主机区域
     * @param MachineRegion 主机区域
     */
    public void setMachineRegion(String MachineRegion) {
        this.MachineRegion = MachineRegion;
    }

    /**
     * Get IP 支持内网IP,主机别名 
     * @return MachineIpOrAlias IP 支持内网IP,主机别名
     */
    public String getMachineIpOrAlias() {
        return this.MachineIpOrAlias;
    }

    /**
     * Set IP 支持内网IP,主机别名
     * @param MachineIpOrAlias IP 支持内网IP,主机别名
     */
    public void setMachineIpOrAlias(String MachineIpOrAlias) {
        this.MachineIpOrAlias = MachineIpOrAlias;
    }

    /**
     * Get 风险状态类型：0：全部类型，1：风险主机，2：潜在风险主机 ， 3：已关机/离线主机，4：无风险主机 
     * @return SecurityStatus 风险状态类型：0：全部类型，1：风险主机，2：潜在风险主机 ， 3：已关机/离线主机，4：无风险主机
     */
    public Long getSecurityStatus() {
        return this.SecurityStatus;
    }

    /**
     * Set 风险状态类型：0：全部类型，1：风险主机，2：潜在风险主机 ， 3：已关机/离线主机，4：无风险主机
     * @param SecurityStatus 风险状态类型：0：全部类型，1：风险主机，2：潜在风险主机 ， 3：已关机/离线主机，4：无风险主机
     */
    public void setSecurityStatus(Long SecurityStatus) {
        this.SecurityStatus = SecurityStatus;
    }

    public DescribeScreenMachinesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeScreenMachinesRequest(DescribeScreenMachinesRequest source) {
        if (source.MachineRegion != null) {
            this.MachineRegion = new String(source.MachineRegion);
        }
        if (source.MachineIpOrAlias != null) {
            this.MachineIpOrAlias = new String(source.MachineIpOrAlias);
        }
        if (source.SecurityStatus != null) {
            this.SecurityStatus = new Long(source.SecurityStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MachineRegion", this.MachineRegion);
        this.setParamSimple(map, prefix + "MachineIpOrAlias", this.MachineIpOrAlias);
        this.setParamSimple(map, prefix + "SecurityStatus", this.SecurityStatus);

    }
}

