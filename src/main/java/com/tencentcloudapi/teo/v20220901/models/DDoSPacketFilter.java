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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DDoSPacketFilter extends AbstractModel{

    /**
    * 特征过滤规则数组。
    */
    @SerializedName("DDoSFeaturesFilters")
    @Expose
    private DDoSFeaturesFilter [] DDoSFeaturesFilters;

    /**
    * 特征过滤清空标识，取值有：
<li>off ：清空特征过滤规则，无需填写 DDoSFeaturesFilters 参数 ；</li>
<li>on ：配置特征过滤规则，需填写 DDoSFeaturesFilters 参数。</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
     * Get 特征过滤规则数组。 
     * @return DDoSFeaturesFilters 特征过滤规则数组。
     */
    public DDoSFeaturesFilter [] getDDoSFeaturesFilters() {
        return this.DDoSFeaturesFilters;
    }

    /**
     * Set 特征过滤规则数组。
     * @param DDoSFeaturesFilters 特征过滤规则数组。
     */
    public void setDDoSFeaturesFilters(DDoSFeaturesFilter [] DDoSFeaturesFilters) {
        this.DDoSFeaturesFilters = DDoSFeaturesFilters;
    }

    /**
     * Get 特征过滤清空标识，取值有：
<li>off ：清空特征过滤规则，无需填写 DDoSFeaturesFilters 参数 ；</li>
<li>on ：配置特征过滤规则，需填写 DDoSFeaturesFilters 参数。</li> 
     * @return Switch 特征过滤清空标识，取值有：
<li>off ：清空特征过滤规则，无需填写 DDoSFeaturesFilters 参数 ；</li>
<li>on ：配置特征过滤规则，需填写 DDoSFeaturesFilters 参数。</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 特征过滤清空标识，取值有：
<li>off ：清空特征过滤规则，无需填写 DDoSFeaturesFilters 参数 ；</li>
<li>on ：配置特征过滤规则，需填写 DDoSFeaturesFilters 参数。</li>
     * @param Switch 特征过滤清空标识，取值有：
<li>off ：清空特征过滤规则，无需填写 DDoSFeaturesFilters 参数 ；</li>
<li>on ：配置特征过滤规则，需填写 DDoSFeaturesFilters 参数。</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    public DDoSPacketFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DDoSPacketFilter(DDoSPacketFilter source) {
        if (source.DDoSFeaturesFilters != null) {
            this.DDoSFeaturesFilters = new DDoSFeaturesFilter[source.DDoSFeaturesFilters.length];
            for (int i = 0; i < source.DDoSFeaturesFilters.length; i++) {
                this.DDoSFeaturesFilters[i] = new DDoSFeaturesFilter(source.DDoSFeaturesFilters[i]);
            }
        }
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DDoSFeaturesFilters.", this.DDoSFeaturesFilters);
        this.setParamSimple(map, prefix + "Switch", this.Switch);

    }
}

