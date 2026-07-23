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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckClusterNatFwPreAccessRequest extends AbstractModel {

    /**
    * <p>NAT CCN 开关配置 JSON 字符串，与 OpenClusterNatFwSwitch 的 NatCcnSwitch 完全一致。SwitchMode 必须为 1（自动接入），RoutingMode 必须为 1（策略路由）。</p>
    */
    @SerializedName("NatCcnSwitch")
    @Expose
    private NatCcnSwitchConfig NatCcnSwitch;

    /**
    * <p>预接入模式</p><p>枚举值：</p><ul><li>open： 开启防火墙前预接入检查</li><li>modify： 编辑修改防火墙开关时预接入检查</li></ul>
    */
    @SerializedName("CheckMode")
    @Expose
    private String CheckMode;

    /**
     * Get <p>NAT CCN 开关配置 JSON 字符串，与 OpenClusterNatFwSwitch 的 NatCcnSwitch 完全一致。SwitchMode 必须为 1（自动接入），RoutingMode 必须为 1（策略路由）。</p> 
     * @return NatCcnSwitch <p>NAT CCN 开关配置 JSON 字符串，与 OpenClusterNatFwSwitch 的 NatCcnSwitch 完全一致。SwitchMode 必须为 1（自动接入），RoutingMode 必须为 1（策略路由）。</p>
     */
    public NatCcnSwitchConfig getNatCcnSwitch() {
        return this.NatCcnSwitch;
    }

    /**
     * Set <p>NAT CCN 开关配置 JSON 字符串，与 OpenClusterNatFwSwitch 的 NatCcnSwitch 完全一致。SwitchMode 必须为 1（自动接入），RoutingMode 必须为 1（策略路由）。</p>
     * @param NatCcnSwitch <p>NAT CCN 开关配置 JSON 字符串，与 OpenClusterNatFwSwitch 的 NatCcnSwitch 完全一致。SwitchMode 必须为 1（自动接入），RoutingMode 必须为 1（策略路由）。</p>
     */
    public void setNatCcnSwitch(NatCcnSwitchConfig NatCcnSwitch) {
        this.NatCcnSwitch = NatCcnSwitch;
    }

    /**
     * Get <p>预接入模式</p><p>枚举值：</p><ul><li>open： 开启防火墙前预接入检查</li><li>modify： 编辑修改防火墙开关时预接入检查</li></ul> 
     * @return CheckMode <p>预接入模式</p><p>枚举值：</p><ul><li>open： 开启防火墙前预接入检查</li><li>modify： 编辑修改防火墙开关时预接入检查</li></ul>
     */
    public String getCheckMode() {
        return this.CheckMode;
    }

    /**
     * Set <p>预接入模式</p><p>枚举值：</p><ul><li>open： 开启防火墙前预接入检查</li><li>modify： 编辑修改防火墙开关时预接入检查</li></ul>
     * @param CheckMode <p>预接入模式</p><p>枚举值：</p><ul><li>open： 开启防火墙前预接入检查</li><li>modify： 编辑修改防火墙开关时预接入检查</li></ul>
     */
    public void setCheckMode(String CheckMode) {
        this.CheckMode = CheckMode;
    }

    public CheckClusterNatFwPreAccessRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckClusterNatFwPreAccessRequest(CheckClusterNatFwPreAccessRequest source) {
        if (source.NatCcnSwitch != null) {
            this.NatCcnSwitch = new NatCcnSwitchConfig(source.NatCcnSwitch);
        }
        if (source.CheckMode != null) {
            this.CheckMode = new String(source.CheckMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "NatCcnSwitch.", this.NatCcnSwitch);
        this.setParamSimple(map, prefix + "CheckMode", this.CheckMode);

    }
}

