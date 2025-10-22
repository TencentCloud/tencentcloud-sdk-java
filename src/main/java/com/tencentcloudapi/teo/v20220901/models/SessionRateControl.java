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

public class SessionRateControl extends AbstractModel {

    /**
    * 会话速率和周期特征校验配置是否开启。取值有：<li>on：启用</li><li>off：关闭</li>
    */
    @SerializedName("Enabled")
    @Expose
    private String Enabled;

    /**
    * 会话速率和周期特征校验高风险的执行动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截，其中 DenyActionParameters 中支持 Stall 配置；</li><li>Monitor：观察；</li><li>Allow：等待后响应，其中 AllowActionParameters 需要 MinDelayTime 和 MaxDelayTime 配置。</li>
    */
    @SerializedName("HighRateSessionAction")
    @Expose
    private SecurityAction HighRateSessionAction;

    /**
    * 会话速率和周期特征校验中风险的执行动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截，其中 DenyActionParameters 中支持 Stall 配置；</li><li>Monitor：观察；</li><li>Allow：等待后响应，其中 AllowActionParameters 需要 MinDelayTime 和 MaxDelayTime 配置。</li>
    */
    @SerializedName("MidRateSessionAction")
    @Expose
    private SecurityAction MidRateSessionAction;

    /**
    * 会话速率和周期特征校验低风险的执行动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截，其中 DenyActionParameters 中支持 Stall 配置；</li><li>Monitor：观察；</li><li>Allow：等待后响应，其中 AllowActionParameters 需要 MinDelayTime 和 MaxDelayTime 配置。</li>
    */
    @SerializedName("LowRateSessionAction")
    @Expose
    private SecurityAction LowRateSessionAction;

    /**
     * Get 会话速率和周期特征校验配置是否开启。取值有：<li>on：启用</li><li>off：关闭</li> 
     * @return Enabled 会话速率和周期特征校验配置是否开启。取值有：<li>on：启用</li><li>off：关闭</li>
     */
    public String getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 会话速率和周期特征校验配置是否开启。取值有：<li>on：启用</li><li>off：关闭</li>
     * @param Enabled 会话速率和周期特征校验配置是否开启。取值有：<li>on：启用</li><li>off：关闭</li>
     */
    public void setEnabled(String Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 会话速率和周期特征校验高风险的执行动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截，其中 DenyActionParameters 中支持 Stall 配置；</li><li>Monitor：观察；</li><li>Allow：等待后响应，其中 AllowActionParameters 需要 MinDelayTime 和 MaxDelayTime 配置。</li> 
     * @return HighRateSessionAction 会话速率和周期特征校验高风险的执行动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截，其中 DenyActionParameters 中支持 Stall 配置；</li><li>Monitor：观察；</li><li>Allow：等待后响应，其中 AllowActionParameters 需要 MinDelayTime 和 MaxDelayTime 配置。</li>
     */
    public SecurityAction getHighRateSessionAction() {
        return this.HighRateSessionAction;
    }

    /**
     * Set 会话速率和周期特征校验高风险的执行动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截，其中 DenyActionParameters 中支持 Stall 配置；</li><li>Monitor：观察；</li><li>Allow：等待后响应，其中 AllowActionParameters 需要 MinDelayTime 和 MaxDelayTime 配置。</li>
     * @param HighRateSessionAction 会话速率和周期特征校验高风险的执行动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截，其中 DenyActionParameters 中支持 Stall 配置；</li><li>Monitor：观察；</li><li>Allow：等待后响应，其中 AllowActionParameters 需要 MinDelayTime 和 MaxDelayTime 配置。</li>
     */
    public void setHighRateSessionAction(SecurityAction HighRateSessionAction) {
        this.HighRateSessionAction = HighRateSessionAction;
    }

    /**
     * Get 会话速率和周期特征校验中风险的执行动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截，其中 DenyActionParameters 中支持 Stall 配置；</li><li>Monitor：观察；</li><li>Allow：等待后响应，其中 AllowActionParameters 需要 MinDelayTime 和 MaxDelayTime 配置。</li> 
     * @return MidRateSessionAction 会话速率和周期特征校验中风险的执行动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截，其中 DenyActionParameters 中支持 Stall 配置；</li><li>Monitor：观察；</li><li>Allow：等待后响应，其中 AllowActionParameters 需要 MinDelayTime 和 MaxDelayTime 配置。</li>
     */
    public SecurityAction getMidRateSessionAction() {
        return this.MidRateSessionAction;
    }

    /**
     * Set 会话速率和周期特征校验中风险的执行动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截，其中 DenyActionParameters 中支持 Stall 配置；</li><li>Monitor：观察；</li><li>Allow：等待后响应，其中 AllowActionParameters 需要 MinDelayTime 和 MaxDelayTime 配置。</li>
     * @param MidRateSessionAction 会话速率和周期特征校验中风险的执行动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截，其中 DenyActionParameters 中支持 Stall 配置；</li><li>Monitor：观察；</li><li>Allow：等待后响应，其中 AllowActionParameters 需要 MinDelayTime 和 MaxDelayTime 配置。</li>
     */
    public void setMidRateSessionAction(SecurityAction MidRateSessionAction) {
        this.MidRateSessionAction = MidRateSessionAction;
    }

    /**
     * Get 会话速率和周期特征校验低风险的执行动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截，其中 DenyActionParameters 中支持 Stall 配置；</li><li>Monitor：观察；</li><li>Allow：等待后响应，其中 AllowActionParameters 需要 MinDelayTime 和 MaxDelayTime 配置。</li> 
     * @return LowRateSessionAction 会话速率和周期特征校验低风险的执行动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截，其中 DenyActionParameters 中支持 Stall 配置；</li><li>Monitor：观察；</li><li>Allow：等待后响应，其中 AllowActionParameters 需要 MinDelayTime 和 MaxDelayTime 配置。</li>
     */
    public SecurityAction getLowRateSessionAction() {
        return this.LowRateSessionAction;
    }

    /**
     * Set 会话速率和周期特征校验低风险的执行动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截，其中 DenyActionParameters 中支持 Stall 配置；</li><li>Monitor：观察；</li><li>Allow：等待后响应，其中 AllowActionParameters 需要 MinDelayTime 和 MaxDelayTime 配置。</li>
     * @param LowRateSessionAction 会话速率和周期特征校验低风险的执行动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截，其中 DenyActionParameters 中支持 Stall 配置；</li><li>Monitor：观察；</li><li>Allow：等待后响应，其中 AllowActionParameters 需要 MinDelayTime 和 MaxDelayTime 配置。</li>
     */
    public void setLowRateSessionAction(SecurityAction LowRateSessionAction) {
        this.LowRateSessionAction = LowRateSessionAction;
    }

    public SessionRateControl() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SessionRateControl(SessionRateControl source) {
        if (source.Enabled != null) {
            this.Enabled = new String(source.Enabled);
        }
        if (source.HighRateSessionAction != null) {
            this.HighRateSessionAction = new SecurityAction(source.HighRateSessionAction);
        }
        if (source.MidRateSessionAction != null) {
            this.MidRateSessionAction = new SecurityAction(source.MidRateSessionAction);
        }
        if (source.LowRateSessionAction != null) {
            this.LowRateSessionAction = new SecurityAction(source.LowRateSessionAction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamObj(map, prefix + "HighRateSessionAction.", this.HighRateSessionAction);
        this.setParamObj(map, prefix + "MidRateSessionAction.", this.MidRateSessionAction);
        this.setParamObj(map, prefix + "LowRateSessionAction.", this.LowRateSessionAction);

    }
}

