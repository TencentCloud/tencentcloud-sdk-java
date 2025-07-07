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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpstreamRequestQueryString extends AbstractModel {

    /**
    * 回源请求参数查询字符串配置开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 查询字符串模式。当 Switch 为 on 时，该参数必填。取值有：
<li>full：全部保留；</li>
<li>ignore：全部忽略；</li>
<li>includeCustom：保留部分参数；</li>
<li>excludeCustom：忽略部分参数。</li>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 指定参数值。仅当查询字符串模式 Action 为 includeCustom 或者 excludeCustom 时该参数生效，用于指定需要保留或者忽略的参数。最大支持 10 个参数。
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
     * Get 回源请求参数查询字符串配置开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li> 
     * @return Switch 回源请求参数查询字符串配置开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 回源请求参数查询字符串配置开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
     * @param Switch 回源请求参数查询字符串配置开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 查询字符串模式。当 Switch 为 on 时，该参数必填。取值有：
<li>full：全部保留；</li>
<li>ignore：全部忽略；</li>
<li>includeCustom：保留部分参数；</li>
<li>excludeCustom：忽略部分参数。</li> 
     * @return Action 查询字符串模式。当 Switch 为 on 时，该参数必填。取值有：
<li>full：全部保留；</li>
<li>ignore：全部忽略；</li>
<li>includeCustom：保留部分参数；</li>
<li>excludeCustom：忽略部分参数。</li>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 查询字符串模式。当 Switch 为 on 时，该参数必填。取值有：
<li>full：全部保留；</li>
<li>ignore：全部忽略；</li>
<li>includeCustom：保留部分参数；</li>
<li>excludeCustom：忽略部分参数。</li>
     * @param Action 查询字符串模式。当 Switch 为 on 时，该参数必填。取值有：
<li>full：全部保留；</li>
<li>ignore：全部忽略；</li>
<li>includeCustom：保留部分参数；</li>
<li>excludeCustom：忽略部分参数。</li>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 指定参数值。仅当查询字符串模式 Action 为 includeCustom 或者 excludeCustom 时该参数生效，用于指定需要保留或者忽略的参数。最大支持 10 个参数。 
     * @return Values 指定参数值。仅当查询字符串模式 Action 为 includeCustom 或者 excludeCustom 时该参数生效，用于指定需要保留或者忽略的参数。最大支持 10 个参数。
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set 指定参数值。仅当查询字符串模式 Action 为 includeCustom 或者 excludeCustom 时该参数生效，用于指定需要保留或者忽略的参数。最大支持 10 个参数。
     * @param Values 指定参数值。仅当查询字符串模式 Action 为 includeCustom 或者 excludeCustom 时该参数生效，用于指定需要保留或者忽略的参数。最大支持 10 个参数。
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    public UpstreamRequestQueryString() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpstreamRequestQueryString(UpstreamRequestQueryString source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);

    }
}

