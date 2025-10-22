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

public class ClientBehaviorDetection extends AbstractModel {

    /**
    * 工作量证明校验强度。取值有：<li>low：低；</li><li>medium：中；</li><li>high：高。</li>
    */
    @SerializedName("CryptoChallengeIntensity")
    @Expose
    private String CryptoChallengeIntensity;

    /**
    * 客户端行为校验的执行方式。取值有：<li>0ms：立即执行；</li><li>100ms：延迟 100ms 执行；</li><li>200ms：延迟 200ms 执行；</li><li>300ms：延迟 300ms 执行；</li><li>400ms：延迟 400ms 执行；</li><li>500ms：延迟 500ms 执行；</li><li>600ms：延迟 600ms 执行；</li><li>700ms：延迟 700ms 执行；</li><li>800ms：延迟 800ms 执行；</li><li>900ms：延迟 900ms 执行；</li><li>1000ms：延迟 1000ms 执行。</li> 
    */
    @SerializedName("CryptoChallengeDelayBefore")
    @Expose
    private String CryptoChallengeDelayBefore;

    /**
    * 触发阈值统计的时间窗口，取值有：<li>5s：5 秒内；</li><li>10s：10 秒内；</li><li>15s：15 秒内；</li><li>30s：30 秒内；</li><li>60s：60 秒内；</li><li>5m：5 分钟内；</li><li>10m：10 分钟内；</li><li>30m：30 分钟内；</li><li>60m：60 分钟内。</li> 
    */
    @SerializedName("MaxChallengeCountInterval")
    @Expose
    private String MaxChallengeCountInterval;

    /**
    * 触发阈值统计的累计次数，取值范围 1 ~ 100000000。
    */
    @SerializedName("MaxChallengeCountThreshold")
    @Expose
    private Long MaxChallengeCountThreshold;

    /**
    * 客户端未启用 JS（未完成检测）时的执行动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截，其中 DenyActionParameters 中支持 Stall 配置；</li><li>Monitor：观察；</li><li>Allow：等待后响应，其中 AllowActionParameters 需要 MinDelayTime 和 MaxDelayTime 配置。</li>
    */
    @SerializedName("ChallengeNotFinishedAction")
    @Expose
    private SecurityAction ChallengeNotFinishedAction;

    /**
    * 客户端检测超时的执行动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截，其中 DenyActionParameters 中支持 Stall 配置；</li><li>Monitor：观察；</li><li>Allow：等待后响应，其中 AllowActionParameters 需要 MinDelayTime 和 MaxDelayTime 配置。</li>
    */
    @SerializedName("ChallengeTimeoutAction")
    @Expose
    private SecurityAction ChallengeTimeoutAction;

    /**
    * Bot 客户端的执行动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截，其中 DenyActionParameters 中支持 Stall 配置；</li><li>Monitor：观察；</li><li>Allow：等待后响应，其中 AllowActionParameters 需要 MinDelayTime 和 MaxDelayTime 配置。</li>
    */
    @SerializedName("BotClientAction")
    @Expose
    private SecurityAction BotClientAction;

    /**
     * Get 工作量证明校验强度。取值有：<li>low：低；</li><li>medium：中；</li><li>high：高。</li> 
     * @return CryptoChallengeIntensity 工作量证明校验强度。取值有：<li>low：低；</li><li>medium：中；</li><li>high：高。</li>
     */
    public String getCryptoChallengeIntensity() {
        return this.CryptoChallengeIntensity;
    }

    /**
     * Set 工作量证明校验强度。取值有：<li>low：低；</li><li>medium：中；</li><li>high：高。</li>
     * @param CryptoChallengeIntensity 工作量证明校验强度。取值有：<li>low：低；</li><li>medium：中；</li><li>high：高。</li>
     */
    public void setCryptoChallengeIntensity(String CryptoChallengeIntensity) {
        this.CryptoChallengeIntensity = CryptoChallengeIntensity;
    }

    /**
     * Get 客户端行为校验的执行方式。取值有：<li>0ms：立即执行；</li><li>100ms：延迟 100ms 执行；</li><li>200ms：延迟 200ms 执行；</li><li>300ms：延迟 300ms 执行；</li><li>400ms：延迟 400ms 执行；</li><li>500ms：延迟 500ms 执行；</li><li>600ms：延迟 600ms 执行；</li><li>700ms：延迟 700ms 执行；</li><li>800ms：延迟 800ms 执行；</li><li>900ms：延迟 900ms 执行；</li><li>1000ms：延迟 1000ms 执行。</li>  
     * @return CryptoChallengeDelayBefore 客户端行为校验的执行方式。取值有：<li>0ms：立即执行；</li><li>100ms：延迟 100ms 执行；</li><li>200ms：延迟 200ms 执行；</li><li>300ms：延迟 300ms 执行；</li><li>400ms：延迟 400ms 执行；</li><li>500ms：延迟 500ms 执行；</li><li>600ms：延迟 600ms 执行；</li><li>700ms：延迟 700ms 执行；</li><li>800ms：延迟 800ms 执行；</li><li>900ms：延迟 900ms 执行；</li><li>1000ms：延迟 1000ms 执行。</li> 
     */
    public String getCryptoChallengeDelayBefore() {
        return this.CryptoChallengeDelayBefore;
    }

    /**
     * Set 客户端行为校验的执行方式。取值有：<li>0ms：立即执行；</li><li>100ms：延迟 100ms 执行；</li><li>200ms：延迟 200ms 执行；</li><li>300ms：延迟 300ms 执行；</li><li>400ms：延迟 400ms 执行；</li><li>500ms：延迟 500ms 执行；</li><li>600ms：延迟 600ms 执行；</li><li>700ms：延迟 700ms 执行；</li><li>800ms：延迟 800ms 执行；</li><li>900ms：延迟 900ms 执行；</li><li>1000ms：延迟 1000ms 执行。</li> 
     * @param CryptoChallengeDelayBefore 客户端行为校验的执行方式。取值有：<li>0ms：立即执行；</li><li>100ms：延迟 100ms 执行；</li><li>200ms：延迟 200ms 执行；</li><li>300ms：延迟 300ms 执行；</li><li>400ms：延迟 400ms 执行；</li><li>500ms：延迟 500ms 执行；</li><li>600ms：延迟 600ms 执行；</li><li>700ms：延迟 700ms 执行；</li><li>800ms：延迟 800ms 执行；</li><li>900ms：延迟 900ms 执行；</li><li>1000ms：延迟 1000ms 执行。</li> 
     */
    public void setCryptoChallengeDelayBefore(String CryptoChallengeDelayBefore) {
        this.CryptoChallengeDelayBefore = CryptoChallengeDelayBefore;
    }

    /**
     * Get 触发阈值统计的时间窗口，取值有：<li>5s：5 秒内；</li><li>10s：10 秒内；</li><li>15s：15 秒内；</li><li>30s：30 秒内；</li><li>60s：60 秒内；</li><li>5m：5 分钟内；</li><li>10m：10 分钟内；</li><li>30m：30 分钟内；</li><li>60m：60 分钟内。</li>  
     * @return MaxChallengeCountInterval 触发阈值统计的时间窗口，取值有：<li>5s：5 秒内；</li><li>10s：10 秒内；</li><li>15s：15 秒内；</li><li>30s：30 秒内；</li><li>60s：60 秒内；</li><li>5m：5 分钟内；</li><li>10m：10 分钟内；</li><li>30m：30 分钟内；</li><li>60m：60 分钟内。</li> 
     */
    public String getMaxChallengeCountInterval() {
        return this.MaxChallengeCountInterval;
    }

    /**
     * Set 触发阈值统计的时间窗口，取值有：<li>5s：5 秒内；</li><li>10s：10 秒内；</li><li>15s：15 秒内；</li><li>30s：30 秒内；</li><li>60s：60 秒内；</li><li>5m：5 分钟内；</li><li>10m：10 分钟内；</li><li>30m：30 分钟内；</li><li>60m：60 分钟内。</li> 
     * @param MaxChallengeCountInterval 触发阈值统计的时间窗口，取值有：<li>5s：5 秒内；</li><li>10s：10 秒内；</li><li>15s：15 秒内；</li><li>30s：30 秒内；</li><li>60s：60 秒内；</li><li>5m：5 分钟内；</li><li>10m：10 分钟内；</li><li>30m：30 分钟内；</li><li>60m：60 分钟内。</li> 
     */
    public void setMaxChallengeCountInterval(String MaxChallengeCountInterval) {
        this.MaxChallengeCountInterval = MaxChallengeCountInterval;
    }

    /**
     * Get 触发阈值统计的累计次数，取值范围 1 ~ 100000000。 
     * @return MaxChallengeCountThreshold 触发阈值统计的累计次数，取值范围 1 ~ 100000000。
     */
    public Long getMaxChallengeCountThreshold() {
        return this.MaxChallengeCountThreshold;
    }

    /**
     * Set 触发阈值统计的累计次数，取值范围 1 ~ 100000000。
     * @param MaxChallengeCountThreshold 触发阈值统计的累计次数，取值范围 1 ~ 100000000。
     */
    public void setMaxChallengeCountThreshold(Long MaxChallengeCountThreshold) {
        this.MaxChallengeCountThreshold = MaxChallengeCountThreshold;
    }

    /**
     * Get 客户端未启用 JS（未完成检测）时的执行动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截，其中 DenyActionParameters 中支持 Stall 配置；</li><li>Monitor：观察；</li><li>Allow：等待后响应，其中 AllowActionParameters 需要 MinDelayTime 和 MaxDelayTime 配置。</li> 
     * @return ChallengeNotFinishedAction 客户端未启用 JS（未完成检测）时的执行动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截，其中 DenyActionParameters 中支持 Stall 配置；</li><li>Monitor：观察；</li><li>Allow：等待后响应，其中 AllowActionParameters 需要 MinDelayTime 和 MaxDelayTime 配置。</li>
     */
    public SecurityAction getChallengeNotFinishedAction() {
        return this.ChallengeNotFinishedAction;
    }

    /**
     * Set 客户端未启用 JS（未完成检测）时的执行动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截，其中 DenyActionParameters 中支持 Stall 配置；</li><li>Monitor：观察；</li><li>Allow：等待后响应，其中 AllowActionParameters 需要 MinDelayTime 和 MaxDelayTime 配置。</li>
     * @param ChallengeNotFinishedAction 客户端未启用 JS（未完成检测）时的执行动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截，其中 DenyActionParameters 中支持 Stall 配置；</li><li>Monitor：观察；</li><li>Allow：等待后响应，其中 AllowActionParameters 需要 MinDelayTime 和 MaxDelayTime 配置。</li>
     */
    public void setChallengeNotFinishedAction(SecurityAction ChallengeNotFinishedAction) {
        this.ChallengeNotFinishedAction = ChallengeNotFinishedAction;
    }

    /**
     * Get 客户端检测超时的执行动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截，其中 DenyActionParameters 中支持 Stall 配置；</li><li>Monitor：观察；</li><li>Allow：等待后响应，其中 AllowActionParameters 需要 MinDelayTime 和 MaxDelayTime 配置。</li> 
     * @return ChallengeTimeoutAction 客户端检测超时的执行动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截，其中 DenyActionParameters 中支持 Stall 配置；</li><li>Monitor：观察；</li><li>Allow：等待后响应，其中 AllowActionParameters 需要 MinDelayTime 和 MaxDelayTime 配置。</li>
     */
    public SecurityAction getChallengeTimeoutAction() {
        return this.ChallengeTimeoutAction;
    }

    /**
     * Set 客户端检测超时的执行动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截，其中 DenyActionParameters 中支持 Stall 配置；</li><li>Monitor：观察；</li><li>Allow：等待后响应，其中 AllowActionParameters 需要 MinDelayTime 和 MaxDelayTime 配置。</li>
     * @param ChallengeTimeoutAction 客户端检测超时的执行动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截，其中 DenyActionParameters 中支持 Stall 配置；</li><li>Monitor：观察；</li><li>Allow：等待后响应，其中 AllowActionParameters 需要 MinDelayTime 和 MaxDelayTime 配置。</li>
     */
    public void setChallengeTimeoutAction(SecurityAction ChallengeTimeoutAction) {
        this.ChallengeTimeoutAction = ChallengeTimeoutAction;
    }

    /**
     * Get Bot 客户端的执行动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截，其中 DenyActionParameters 中支持 Stall 配置；</li><li>Monitor：观察；</li><li>Allow：等待后响应，其中 AllowActionParameters 需要 MinDelayTime 和 MaxDelayTime 配置。</li> 
     * @return BotClientAction Bot 客户端的执行动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截，其中 DenyActionParameters 中支持 Stall 配置；</li><li>Monitor：观察；</li><li>Allow：等待后响应，其中 AllowActionParameters 需要 MinDelayTime 和 MaxDelayTime 配置。</li>
     */
    public SecurityAction getBotClientAction() {
        return this.BotClientAction;
    }

    /**
     * Set Bot 客户端的执行动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截，其中 DenyActionParameters 中支持 Stall 配置；</li><li>Monitor：观察；</li><li>Allow：等待后响应，其中 AllowActionParameters 需要 MinDelayTime 和 MaxDelayTime 配置。</li>
     * @param BotClientAction Bot 客户端的执行动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截，其中 DenyActionParameters 中支持 Stall 配置；</li><li>Monitor：观察；</li><li>Allow：等待后响应，其中 AllowActionParameters 需要 MinDelayTime 和 MaxDelayTime 配置。</li>
     */
    public void setBotClientAction(SecurityAction BotClientAction) {
        this.BotClientAction = BotClientAction;
    }

    public ClientBehaviorDetection() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClientBehaviorDetection(ClientBehaviorDetection source) {
        if (source.CryptoChallengeIntensity != null) {
            this.CryptoChallengeIntensity = new String(source.CryptoChallengeIntensity);
        }
        if (source.CryptoChallengeDelayBefore != null) {
            this.CryptoChallengeDelayBefore = new String(source.CryptoChallengeDelayBefore);
        }
        if (source.MaxChallengeCountInterval != null) {
            this.MaxChallengeCountInterval = new String(source.MaxChallengeCountInterval);
        }
        if (source.MaxChallengeCountThreshold != null) {
            this.MaxChallengeCountThreshold = new Long(source.MaxChallengeCountThreshold);
        }
        if (source.ChallengeNotFinishedAction != null) {
            this.ChallengeNotFinishedAction = new SecurityAction(source.ChallengeNotFinishedAction);
        }
        if (source.ChallengeTimeoutAction != null) {
            this.ChallengeTimeoutAction = new SecurityAction(source.ChallengeTimeoutAction);
        }
        if (source.BotClientAction != null) {
            this.BotClientAction = new SecurityAction(source.BotClientAction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CryptoChallengeIntensity", this.CryptoChallengeIntensity);
        this.setParamSimple(map, prefix + "CryptoChallengeDelayBefore", this.CryptoChallengeDelayBefore);
        this.setParamSimple(map, prefix + "MaxChallengeCountInterval", this.MaxChallengeCountInterval);
        this.setParamSimple(map, prefix + "MaxChallengeCountThreshold", this.MaxChallengeCountThreshold);
        this.setParamObj(map, prefix + "ChallengeNotFinishedAction.", this.ChallengeNotFinishedAction);
        this.setParamObj(map, prefix + "ChallengeTimeoutAction.", this.ChallengeTimeoutAction);
        this.setParamObj(map, prefix + "BotClientAction.", this.BotClientAction);

    }
}

