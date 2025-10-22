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

public class BotSessionValidation extends AbstractModel {

    /**
    * 是否更新 Cookie 并校验。取值有：<li>on：更新 Cookie 并校验；</li><li>off：仅校验。</li>
    */
    @SerializedName("IssueNewBotSessionCookie")
    @Expose
    private String IssueNewBotSessionCookie;

    /**
    * 更新 Cookie 并校验时的触发阈值，仅当 IssueNewBotSessionCookie 为 on 时有效。
    */
    @SerializedName("MaxNewSessionTriggerConfig")
    @Expose
    private MaxNewSessionTriggerConfig MaxNewSessionTriggerConfig;

    /**
    * 未携带 Cookie 或 Cookie 已过期的执行动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截，其中 DenyActionParameters 中支持 Stall 配置；</li><li>Monitor：观察；</li><li>Allow：等待后响应，其中 AllowActionParameters 需要 MinDelayTime 和 MaxDelayTime 配置。</li>
    */
    @SerializedName("SessionExpiredAction")
    @Expose
    private SecurityAction SessionExpiredAction;

    /**
    * 不合法 Cookie 的执行动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截，其中 DenyActionParameters 中支持 Stall 配置；</li><li>Monitor：观察；</li><li>Allow：等待后响应，其中 AllowActionParameters 需要 MinDelayTime 和 MaxDelayTime 配置。</li>
    */
    @SerializedName("SessionInvalidAction")
    @Expose
    private SecurityAction SessionInvalidAction;

    /**
    * 会话速率和周期特征校验的具体配置。
    */
    @SerializedName("SessionRateControl")
    @Expose
    private SessionRateControl SessionRateControl;

    /**
     * Get 是否更新 Cookie 并校验。取值有：<li>on：更新 Cookie 并校验；</li><li>off：仅校验。</li> 
     * @return IssueNewBotSessionCookie 是否更新 Cookie 并校验。取值有：<li>on：更新 Cookie 并校验；</li><li>off：仅校验。</li>
     */
    public String getIssueNewBotSessionCookie() {
        return this.IssueNewBotSessionCookie;
    }

    /**
     * Set 是否更新 Cookie 并校验。取值有：<li>on：更新 Cookie 并校验；</li><li>off：仅校验。</li>
     * @param IssueNewBotSessionCookie 是否更新 Cookie 并校验。取值有：<li>on：更新 Cookie 并校验；</li><li>off：仅校验。</li>
     */
    public void setIssueNewBotSessionCookie(String IssueNewBotSessionCookie) {
        this.IssueNewBotSessionCookie = IssueNewBotSessionCookie;
    }

    /**
     * Get 更新 Cookie 并校验时的触发阈值，仅当 IssueNewBotSessionCookie 为 on 时有效。 
     * @return MaxNewSessionTriggerConfig 更新 Cookie 并校验时的触发阈值，仅当 IssueNewBotSessionCookie 为 on 时有效。
     */
    public MaxNewSessionTriggerConfig getMaxNewSessionTriggerConfig() {
        return this.MaxNewSessionTriggerConfig;
    }

    /**
     * Set 更新 Cookie 并校验时的触发阈值，仅当 IssueNewBotSessionCookie 为 on 时有效。
     * @param MaxNewSessionTriggerConfig 更新 Cookie 并校验时的触发阈值，仅当 IssueNewBotSessionCookie 为 on 时有效。
     */
    public void setMaxNewSessionTriggerConfig(MaxNewSessionTriggerConfig MaxNewSessionTriggerConfig) {
        this.MaxNewSessionTriggerConfig = MaxNewSessionTriggerConfig;
    }

    /**
     * Get 未携带 Cookie 或 Cookie 已过期的执行动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截，其中 DenyActionParameters 中支持 Stall 配置；</li><li>Monitor：观察；</li><li>Allow：等待后响应，其中 AllowActionParameters 需要 MinDelayTime 和 MaxDelayTime 配置。</li> 
     * @return SessionExpiredAction 未携带 Cookie 或 Cookie 已过期的执行动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截，其中 DenyActionParameters 中支持 Stall 配置；</li><li>Monitor：观察；</li><li>Allow：等待后响应，其中 AllowActionParameters 需要 MinDelayTime 和 MaxDelayTime 配置。</li>
     */
    public SecurityAction getSessionExpiredAction() {
        return this.SessionExpiredAction;
    }

    /**
     * Set 未携带 Cookie 或 Cookie 已过期的执行动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截，其中 DenyActionParameters 中支持 Stall 配置；</li><li>Monitor：观察；</li><li>Allow：等待后响应，其中 AllowActionParameters 需要 MinDelayTime 和 MaxDelayTime 配置。</li>
     * @param SessionExpiredAction 未携带 Cookie 或 Cookie 已过期的执行动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截，其中 DenyActionParameters 中支持 Stall 配置；</li><li>Monitor：观察；</li><li>Allow：等待后响应，其中 AllowActionParameters 需要 MinDelayTime 和 MaxDelayTime 配置。</li>
     */
    public void setSessionExpiredAction(SecurityAction SessionExpiredAction) {
        this.SessionExpiredAction = SessionExpiredAction;
    }

    /**
     * Get 不合法 Cookie 的执行动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截，其中 DenyActionParameters 中支持 Stall 配置；</li><li>Monitor：观察；</li><li>Allow：等待后响应，其中 AllowActionParameters 需要 MinDelayTime 和 MaxDelayTime 配置。</li> 
     * @return SessionInvalidAction 不合法 Cookie 的执行动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截，其中 DenyActionParameters 中支持 Stall 配置；</li><li>Monitor：观察；</li><li>Allow：等待后响应，其中 AllowActionParameters 需要 MinDelayTime 和 MaxDelayTime 配置。</li>
     */
    public SecurityAction getSessionInvalidAction() {
        return this.SessionInvalidAction;
    }

    /**
     * Set 不合法 Cookie 的执行动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截，其中 DenyActionParameters 中支持 Stall 配置；</li><li>Monitor：观察；</li><li>Allow：等待后响应，其中 AllowActionParameters 需要 MinDelayTime 和 MaxDelayTime 配置。</li>
     * @param SessionInvalidAction 不合法 Cookie 的执行动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截，其中 DenyActionParameters 中支持 Stall 配置；</li><li>Monitor：观察；</li><li>Allow：等待后响应，其中 AllowActionParameters 需要 MinDelayTime 和 MaxDelayTime 配置。</li>
     */
    public void setSessionInvalidAction(SecurityAction SessionInvalidAction) {
        this.SessionInvalidAction = SessionInvalidAction;
    }

    /**
     * Get 会话速率和周期特征校验的具体配置。 
     * @return SessionRateControl 会话速率和周期特征校验的具体配置。
     */
    public SessionRateControl getSessionRateControl() {
        return this.SessionRateControl;
    }

    /**
     * Set 会话速率和周期特征校验的具体配置。
     * @param SessionRateControl 会话速率和周期特征校验的具体配置。
     */
    public void setSessionRateControl(SessionRateControl SessionRateControl) {
        this.SessionRateControl = SessionRateControl;
    }

    public BotSessionValidation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BotSessionValidation(BotSessionValidation source) {
        if (source.IssueNewBotSessionCookie != null) {
            this.IssueNewBotSessionCookie = new String(source.IssueNewBotSessionCookie);
        }
        if (source.MaxNewSessionTriggerConfig != null) {
            this.MaxNewSessionTriggerConfig = new MaxNewSessionTriggerConfig(source.MaxNewSessionTriggerConfig);
        }
        if (source.SessionExpiredAction != null) {
            this.SessionExpiredAction = new SecurityAction(source.SessionExpiredAction);
        }
        if (source.SessionInvalidAction != null) {
            this.SessionInvalidAction = new SecurityAction(source.SessionInvalidAction);
        }
        if (source.SessionRateControl != null) {
            this.SessionRateControl = new SessionRateControl(source.SessionRateControl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IssueNewBotSessionCookie", this.IssueNewBotSessionCookie);
        this.setParamObj(map, prefix + "MaxNewSessionTriggerConfig.", this.MaxNewSessionTriggerConfig);
        this.setParamObj(map, prefix + "SessionExpiredAction.", this.SessionExpiredAction);
        this.setParamObj(map, prefix + "SessionInvalidAction.", this.SessionInvalidAction);
        this.setParamObj(map, prefix + "SessionRateControl.", this.SessionRateControl);

    }
}

