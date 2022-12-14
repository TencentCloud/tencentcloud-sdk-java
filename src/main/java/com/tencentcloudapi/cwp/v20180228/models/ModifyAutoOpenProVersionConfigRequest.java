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

public class ModifyAutoOpenProVersionConfigRequest extends AbstractModel{

    /**
    * 设置自动开通状态。
<li>CLOSE：关闭</li>
<li>OPEN：打开</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 自动加购/扩容授权开关,默认 1, 0关闭, 1开启
    */
    @SerializedName("AutoRepurchaseSwitch")
    @Expose
    private Long AutoRepurchaseSwitch;

    /**
    * 自动加购的订单是否自动续费,默认0 ,0关闭, 1开启
    */
    @SerializedName("AutoRepurchaseRenewSwitch")
    @Expose
    private Long AutoRepurchaseRenewSwitch;

    /**
     * Get 设置自动开通状态。
<li>CLOSE：关闭</li>
<li>OPEN：打开</li> 
     * @return Status 设置自动开通状态。
<li>CLOSE：关闭</li>
<li>OPEN：打开</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 设置自动开通状态。
<li>CLOSE：关闭</li>
<li>OPEN：打开</li>
     * @param Status 设置自动开通状态。
<li>CLOSE：关闭</li>
<li>OPEN：打开</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 自动加购/扩容授权开关,默认 1, 0关闭, 1开启 
     * @return AutoRepurchaseSwitch 自动加购/扩容授权开关,默认 1, 0关闭, 1开启
     */
    public Long getAutoRepurchaseSwitch() {
        return this.AutoRepurchaseSwitch;
    }

    /**
     * Set 自动加购/扩容授权开关,默认 1, 0关闭, 1开启
     * @param AutoRepurchaseSwitch 自动加购/扩容授权开关,默认 1, 0关闭, 1开启
     */
    public void setAutoRepurchaseSwitch(Long AutoRepurchaseSwitch) {
        this.AutoRepurchaseSwitch = AutoRepurchaseSwitch;
    }

    /**
     * Get 自动加购的订单是否自动续费,默认0 ,0关闭, 1开启 
     * @return AutoRepurchaseRenewSwitch 自动加购的订单是否自动续费,默认0 ,0关闭, 1开启
     */
    public Long getAutoRepurchaseRenewSwitch() {
        return this.AutoRepurchaseRenewSwitch;
    }

    /**
     * Set 自动加购的订单是否自动续费,默认0 ,0关闭, 1开启
     * @param AutoRepurchaseRenewSwitch 自动加购的订单是否自动续费,默认0 ,0关闭, 1开启
     */
    public void setAutoRepurchaseRenewSwitch(Long AutoRepurchaseRenewSwitch) {
        this.AutoRepurchaseRenewSwitch = AutoRepurchaseRenewSwitch;
    }

    public ModifyAutoOpenProVersionConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAutoOpenProVersionConfigRequest(ModifyAutoOpenProVersionConfigRequest source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.AutoRepurchaseSwitch != null) {
            this.AutoRepurchaseSwitch = new Long(source.AutoRepurchaseSwitch);
        }
        if (source.AutoRepurchaseRenewSwitch != null) {
            this.AutoRepurchaseRenewSwitch = new Long(source.AutoRepurchaseRenewSwitch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "AutoRepurchaseSwitch", this.AutoRepurchaseSwitch);
        this.setParamSimple(map, prefix + "AutoRepurchaseRenewSwitch", this.AutoRepurchaseRenewSwitch);

    }
}

