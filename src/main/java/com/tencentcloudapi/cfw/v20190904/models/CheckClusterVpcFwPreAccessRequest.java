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

public class CheckClusterVpcFwPreAccessRequest extends AbstractModel {

    /**
    * <p>CCN 开关配置，长度为 1 的数组 JSON 字符串，结构与 ModifyClusterVpcFwSwitch 的 CcnSwitch 完全一致。SwitchMode 必须为 1（自动接入），RoutingMode 必须为 1（策略路由）。</p>
    */
    @SerializedName("CcnSwitch")
    @Expose
    private CcnSwitchInfo [] CcnSwitch;

    /**
    * <p>预接入检查模式</p><p>枚举值：</p><ul><li>open： 开启开关时预接入检查</li><li>modify： 编辑变更开关时预接入检查</li></ul>
    */
    @SerializedName("CheckMode")
    @Expose
    private String CheckMode;

    /**
     * Get <p>CCN 开关配置，长度为 1 的数组 JSON 字符串，结构与 ModifyClusterVpcFwSwitch 的 CcnSwitch 完全一致。SwitchMode 必须为 1（自动接入），RoutingMode 必须为 1（策略路由）。</p> 
     * @return CcnSwitch <p>CCN 开关配置，长度为 1 的数组 JSON 字符串，结构与 ModifyClusterVpcFwSwitch 的 CcnSwitch 完全一致。SwitchMode 必须为 1（自动接入），RoutingMode 必须为 1（策略路由）。</p>
     */
    public CcnSwitchInfo [] getCcnSwitch() {
        return this.CcnSwitch;
    }

    /**
     * Set <p>CCN 开关配置，长度为 1 的数组 JSON 字符串，结构与 ModifyClusterVpcFwSwitch 的 CcnSwitch 完全一致。SwitchMode 必须为 1（自动接入），RoutingMode 必须为 1（策略路由）。</p>
     * @param CcnSwitch <p>CCN 开关配置，长度为 1 的数组 JSON 字符串，结构与 ModifyClusterVpcFwSwitch 的 CcnSwitch 完全一致。SwitchMode 必须为 1（自动接入），RoutingMode 必须为 1（策略路由）。</p>
     */
    public void setCcnSwitch(CcnSwitchInfo [] CcnSwitch) {
        this.CcnSwitch = CcnSwitch;
    }

    /**
     * Get <p>预接入检查模式</p><p>枚举值：</p><ul><li>open： 开启开关时预接入检查</li><li>modify： 编辑变更开关时预接入检查</li></ul> 
     * @return CheckMode <p>预接入检查模式</p><p>枚举值：</p><ul><li>open： 开启开关时预接入检查</li><li>modify： 编辑变更开关时预接入检查</li></ul>
     */
    public String getCheckMode() {
        return this.CheckMode;
    }

    /**
     * Set <p>预接入检查模式</p><p>枚举值：</p><ul><li>open： 开启开关时预接入检查</li><li>modify： 编辑变更开关时预接入检查</li></ul>
     * @param CheckMode <p>预接入检查模式</p><p>枚举值：</p><ul><li>open： 开启开关时预接入检查</li><li>modify： 编辑变更开关时预接入检查</li></ul>
     */
    public void setCheckMode(String CheckMode) {
        this.CheckMode = CheckMode;
    }

    public CheckClusterVpcFwPreAccessRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckClusterVpcFwPreAccessRequest(CheckClusterVpcFwPreAccessRequest source) {
        if (source.CcnSwitch != null) {
            this.CcnSwitch = new CcnSwitchInfo[source.CcnSwitch.length];
            for (int i = 0; i < source.CcnSwitch.length; i++) {
                this.CcnSwitch[i] = new CcnSwitchInfo(source.CcnSwitch[i]);
            }
        }
        if (source.CheckMode != null) {
            this.CheckMode = new String(source.CheckMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "CcnSwitch.", this.CcnSwitch);
        this.setParamSimple(map, prefix + "CheckMode", this.CheckMode);

    }
}

