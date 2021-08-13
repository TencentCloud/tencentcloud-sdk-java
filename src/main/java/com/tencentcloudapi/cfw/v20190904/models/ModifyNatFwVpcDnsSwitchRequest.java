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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyNatFwVpcDnsSwitchRequest extends AbstractModel{

    /**
    * nat 防火墙 id
    */
    @SerializedName("NatFwInsId")
    @Expose
    private String NatFwInsId;

    /**
    * DNS 开关切换列表
    */
    @SerializedName("DnsVpcSwitchLst")
    @Expose
    private DnsVpcSwitch [] DnsVpcSwitchLst;

    /**
     * Get nat 防火墙 id 
     * @return NatFwInsId nat 防火墙 id
     */
    public String getNatFwInsId() {
        return this.NatFwInsId;
    }

    /**
     * Set nat 防火墙 id
     * @param NatFwInsId nat 防火墙 id
     */
    public void setNatFwInsId(String NatFwInsId) {
        this.NatFwInsId = NatFwInsId;
    }

    /**
     * Get DNS 开关切换列表 
     * @return DnsVpcSwitchLst DNS 开关切换列表
     */
    public DnsVpcSwitch [] getDnsVpcSwitchLst() {
        return this.DnsVpcSwitchLst;
    }

    /**
     * Set DNS 开关切换列表
     * @param DnsVpcSwitchLst DNS 开关切换列表
     */
    public void setDnsVpcSwitchLst(DnsVpcSwitch [] DnsVpcSwitchLst) {
        this.DnsVpcSwitchLst = DnsVpcSwitchLst;
    }

    public ModifyNatFwVpcDnsSwitchRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNatFwVpcDnsSwitchRequest(ModifyNatFwVpcDnsSwitchRequest source) {
        if (source.NatFwInsId != null) {
            this.NatFwInsId = new String(source.NatFwInsId);
        }
        if (source.DnsVpcSwitchLst != null) {
            this.DnsVpcSwitchLst = new DnsVpcSwitch[source.DnsVpcSwitchLst.length];
            for (int i = 0; i < source.DnsVpcSwitchLst.length; i++) {
                this.DnsVpcSwitchLst[i] = new DnsVpcSwitch(source.DnsVpcSwitchLst[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NatFwInsId", this.NatFwInsId);
        this.setParamArrayObj(map, prefix + "DnsVpcSwitchLst.", this.DnsVpcSwitchLst);

    }
}

