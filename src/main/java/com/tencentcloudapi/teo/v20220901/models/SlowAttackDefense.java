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

public class SlowAttackDefense extends AbstractModel {

    /**
    * 慢速攻击防护是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li>
    */
    @SerializedName("Enabled")
    @Expose
    private String Enabled;

    /**
    * 慢速攻击防护的处置方式，当 Enabled 为 on 时，此字段必填。SecurityAction 的 Name 取值支持：<li>Monitor：观察；</li><li>Deny：拦截；</li>
    */
    @SerializedName("Action")
    @Expose
    private SecurityAction Action;

    /**
    * 正文传输最小速率阈值的具体配置，当 Enabled 为 on 时，此字段必填。
    */
    @SerializedName("MinimalRequestBodyTransferRate")
    @Expose
    private MinimalRequestBodyTransferRate MinimalRequestBodyTransferRate;

    /**
    * 正文传输超时时长的具体配置，当 Enabled 为 on 时，此字段必填。
    */
    @SerializedName("RequestBodyTransferTimeout")
    @Expose
    private RequestBodyTransferTimeout RequestBodyTransferTimeout;

    /**
     * Get 慢速攻击防护是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li> 
     * @return Enabled 慢速攻击防护是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li>
     */
    public String getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 慢速攻击防护是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li>
     * @param Enabled 慢速攻击防护是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li>
     */
    public void setEnabled(String Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 慢速攻击防护的处置方式，当 Enabled 为 on 时，此字段必填。SecurityAction 的 Name 取值支持：<li>Monitor：观察；</li><li>Deny：拦截；</li> 
     * @return Action 慢速攻击防护的处置方式，当 Enabled 为 on 时，此字段必填。SecurityAction 的 Name 取值支持：<li>Monitor：观察；</li><li>Deny：拦截；</li>
     */
    public SecurityAction getAction() {
        return this.Action;
    }

    /**
     * Set 慢速攻击防护的处置方式，当 Enabled 为 on 时，此字段必填。SecurityAction 的 Name 取值支持：<li>Monitor：观察；</li><li>Deny：拦截；</li>
     * @param Action 慢速攻击防护的处置方式，当 Enabled 为 on 时，此字段必填。SecurityAction 的 Name 取值支持：<li>Monitor：观察；</li><li>Deny：拦截；</li>
     */
    public void setAction(SecurityAction Action) {
        this.Action = Action;
    }

    /**
     * Get 正文传输最小速率阈值的具体配置，当 Enabled 为 on 时，此字段必填。 
     * @return MinimalRequestBodyTransferRate 正文传输最小速率阈值的具体配置，当 Enabled 为 on 时，此字段必填。
     */
    public MinimalRequestBodyTransferRate getMinimalRequestBodyTransferRate() {
        return this.MinimalRequestBodyTransferRate;
    }

    /**
     * Set 正文传输最小速率阈值的具体配置，当 Enabled 为 on 时，此字段必填。
     * @param MinimalRequestBodyTransferRate 正文传输最小速率阈值的具体配置，当 Enabled 为 on 时，此字段必填。
     */
    public void setMinimalRequestBodyTransferRate(MinimalRequestBodyTransferRate MinimalRequestBodyTransferRate) {
        this.MinimalRequestBodyTransferRate = MinimalRequestBodyTransferRate;
    }

    /**
     * Get 正文传输超时时长的具体配置，当 Enabled 为 on 时，此字段必填。 
     * @return RequestBodyTransferTimeout 正文传输超时时长的具体配置，当 Enabled 为 on 时，此字段必填。
     */
    public RequestBodyTransferTimeout getRequestBodyTransferTimeout() {
        return this.RequestBodyTransferTimeout;
    }

    /**
     * Set 正文传输超时时长的具体配置，当 Enabled 为 on 时，此字段必填。
     * @param RequestBodyTransferTimeout 正文传输超时时长的具体配置，当 Enabled 为 on 时，此字段必填。
     */
    public void setRequestBodyTransferTimeout(RequestBodyTransferTimeout RequestBodyTransferTimeout) {
        this.RequestBodyTransferTimeout = RequestBodyTransferTimeout;
    }

    public SlowAttackDefense() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SlowAttackDefense(SlowAttackDefense source) {
        if (source.Enabled != null) {
            this.Enabled = new String(source.Enabled);
        }
        if (source.Action != null) {
            this.Action = new SecurityAction(source.Action);
        }
        if (source.MinimalRequestBodyTransferRate != null) {
            this.MinimalRequestBodyTransferRate = new MinimalRequestBodyTransferRate(source.MinimalRequestBodyTransferRate);
        }
        if (source.RequestBodyTransferTimeout != null) {
            this.RequestBodyTransferTimeout = new RequestBodyTransferTimeout(source.RequestBodyTransferTimeout);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamObj(map, prefix + "Action.", this.Action);
        this.setParamObj(map, prefix + "MinimalRequestBodyTransferRate.", this.MinimalRequestBodyTransferRate);
        this.setParamObj(map, prefix + "RequestBodyTransferTimeout.", this.RequestBodyTransferTimeout);

    }
}

