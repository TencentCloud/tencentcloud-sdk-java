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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WafSubRuleStatus extends AbstractModel {

    /**
    * Waf子规则开关状态配置开关，取值有：
on：开启
off：关闭
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 规则id列表
    */
    @SerializedName("SubIds")
    @Expose
    private Long [] SubIds;

    /**
     * Get Waf子规则开关状态配置开关，取值有：
on：开启
off：关闭 
     * @return Switch Waf子规则开关状态配置开关，取值有：
on：开启
off：关闭
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Waf子规则开关状态配置开关，取值有：
on：开启
off：关闭
     * @param Switch Waf子规则开关状态配置开关，取值有：
on：开启
off：关闭
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 规则id列表 
     * @return SubIds 规则id列表
     */
    public Long [] getSubIds() {
        return this.SubIds;
    }

    /**
     * Set 规则id列表
     * @param SubIds 规则id列表
     */
    public void setSubIds(Long [] SubIds) {
        this.SubIds = SubIds;
    }

    public WafSubRuleStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WafSubRuleStatus(WafSubRuleStatus source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.SubIds != null) {
            this.SubIds = new Long[source.SubIds.length];
            for (int i = 0; i < source.SubIds.length; i++) {
                this.SubIds[i] = new Long(source.SubIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArraySimple(map, prefix + "SubIds.", this.SubIds);

    }
}

