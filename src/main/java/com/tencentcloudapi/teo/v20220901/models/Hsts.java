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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Hsts extends AbstractModel {

    /**
    * 是否开启，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * MaxAge 数值。单位为秒，最大值为1天。
    */
    @SerializedName("MaxAge")
    @Expose
    private Long MaxAge;

    /**
    * 是否包含子域名，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
    */
    @SerializedName("IncludeSubDomains")
    @Expose
    private String IncludeSubDomains;

    /**
    * 是否开启预加载，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
    */
    @SerializedName("Preload")
    @Expose
    private String Preload;

    /**
     * Get 是否开启，取值有：
<li>on：开启；</li>
<li>off：关闭。</li> 
     * @return Switch 是否开启，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 是否开启，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
     * @param Switch 是否开启，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get MaxAge 数值。单位为秒，最大值为1天。 
     * @return MaxAge MaxAge 数值。单位为秒，最大值为1天。
     */
    public Long getMaxAge() {
        return this.MaxAge;
    }

    /**
     * Set MaxAge 数值。单位为秒，最大值为1天。
     * @param MaxAge MaxAge 数值。单位为秒，最大值为1天。
     */
    public void setMaxAge(Long MaxAge) {
        this.MaxAge = MaxAge;
    }

    /**
     * Get 是否包含子域名，取值有：
<li>on：开启；</li>
<li>off：关闭。</li> 
     * @return IncludeSubDomains 是否包含子域名，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
     */
    public String getIncludeSubDomains() {
        return this.IncludeSubDomains;
    }

    /**
     * Set 是否包含子域名，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
     * @param IncludeSubDomains 是否包含子域名，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
     */
    public void setIncludeSubDomains(String IncludeSubDomains) {
        this.IncludeSubDomains = IncludeSubDomains;
    }

    /**
     * Get 是否开启预加载，取值有：
<li>on：开启；</li>
<li>off：关闭。</li> 
     * @return Preload 是否开启预加载，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
     */
    public String getPreload() {
        return this.Preload;
    }

    /**
     * Set 是否开启预加载，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
     * @param Preload 是否开启预加载，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
     */
    public void setPreload(String Preload) {
        this.Preload = Preload;
    }

    public Hsts() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Hsts(Hsts source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.MaxAge != null) {
            this.MaxAge = new Long(source.MaxAge);
        }
        if (source.IncludeSubDomains != null) {
            this.IncludeSubDomains = new String(source.IncludeSubDomains);
        }
        if (source.Preload != null) {
            this.Preload = new String(source.Preload);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "MaxAge", this.MaxAge);
        this.setParamSimple(map, prefix + "IncludeSubDomains", this.IncludeSubDomains);
        this.setParamSimple(map, prefix + "Preload", this.Preload);

    }
}

