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

public class BotRatings extends AbstractModel {

    /**
    * 恶意 Bot 请求的执行动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截；</li><li>Monitor：观察；</li><li>Allow：放行；</li><li>Challenge：挑战，其中 ChallengeActionParameters 中的 ChallengeOption 支持 JSChallenge 和 ManagedChallenge。</li>
    */
    @SerializedName("HighRiskBotRequestsAction")
    @Expose
    private SecurityAction HighRiskBotRequestsAction;

    /**
    * 疑似 Bot 请求的执行动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截；</li><li>Monitor：观察；</li><li>Allow：放行；</li><li>Challenge：挑战，其中 ChallengeActionParameters 中的 ChallengeOption 支持 JSChallenge 和 ManagedChallenge。</li>
    */
    @SerializedName("LikelyBotRequestsAction")
    @Expose
    private SecurityAction LikelyBotRequestsAction;

    /**
    * 友好 Bot 请求的执行动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截；</li><li>Monitor：观察；</li><li>Allow：放行；</li><li>Challenge：挑战，其中 ChallengeActionParameters 中的 ChallengeOption 支持 JSChallenge 和 ManagedChallenge。</li>
    */
    @SerializedName("VerifiedBotRequestsAction")
    @Expose
    private SecurityAction VerifiedBotRequestsAction;

    /**
    * 正常 Bot 请求的执行动作。 SecurityAction 的 Name 取值支持：<li>Allow：放行。</li>
    */
    @SerializedName("HumanRequestsAction")
    @Expose
    private SecurityAction HumanRequestsAction;

    /**
     * Get 恶意 Bot 请求的执行动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截；</li><li>Monitor：观察；</li><li>Allow：放行；</li><li>Challenge：挑战，其中 ChallengeActionParameters 中的 ChallengeOption 支持 JSChallenge 和 ManagedChallenge。</li> 
     * @return HighRiskBotRequestsAction 恶意 Bot 请求的执行动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截；</li><li>Monitor：观察；</li><li>Allow：放行；</li><li>Challenge：挑战，其中 ChallengeActionParameters 中的 ChallengeOption 支持 JSChallenge 和 ManagedChallenge。</li>
     */
    public SecurityAction getHighRiskBotRequestsAction() {
        return this.HighRiskBotRequestsAction;
    }

    /**
     * Set 恶意 Bot 请求的执行动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截；</li><li>Monitor：观察；</li><li>Allow：放行；</li><li>Challenge：挑战，其中 ChallengeActionParameters 中的 ChallengeOption 支持 JSChallenge 和 ManagedChallenge。</li>
     * @param HighRiskBotRequestsAction 恶意 Bot 请求的执行动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截；</li><li>Monitor：观察；</li><li>Allow：放行；</li><li>Challenge：挑战，其中 ChallengeActionParameters 中的 ChallengeOption 支持 JSChallenge 和 ManagedChallenge。</li>
     */
    public void setHighRiskBotRequestsAction(SecurityAction HighRiskBotRequestsAction) {
        this.HighRiskBotRequestsAction = HighRiskBotRequestsAction;
    }

    /**
     * Get 疑似 Bot 请求的执行动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截；</li><li>Monitor：观察；</li><li>Allow：放行；</li><li>Challenge：挑战，其中 ChallengeActionParameters 中的 ChallengeOption 支持 JSChallenge 和 ManagedChallenge。</li> 
     * @return LikelyBotRequestsAction 疑似 Bot 请求的执行动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截；</li><li>Monitor：观察；</li><li>Allow：放行；</li><li>Challenge：挑战，其中 ChallengeActionParameters 中的 ChallengeOption 支持 JSChallenge 和 ManagedChallenge。</li>
     */
    public SecurityAction getLikelyBotRequestsAction() {
        return this.LikelyBotRequestsAction;
    }

    /**
     * Set 疑似 Bot 请求的执行动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截；</li><li>Monitor：观察；</li><li>Allow：放行；</li><li>Challenge：挑战，其中 ChallengeActionParameters 中的 ChallengeOption 支持 JSChallenge 和 ManagedChallenge。</li>
     * @param LikelyBotRequestsAction 疑似 Bot 请求的执行动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截；</li><li>Monitor：观察；</li><li>Allow：放行；</li><li>Challenge：挑战，其中 ChallengeActionParameters 中的 ChallengeOption 支持 JSChallenge 和 ManagedChallenge。</li>
     */
    public void setLikelyBotRequestsAction(SecurityAction LikelyBotRequestsAction) {
        this.LikelyBotRequestsAction = LikelyBotRequestsAction;
    }

    /**
     * Get 友好 Bot 请求的执行动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截；</li><li>Monitor：观察；</li><li>Allow：放行；</li><li>Challenge：挑战，其中 ChallengeActionParameters 中的 ChallengeOption 支持 JSChallenge 和 ManagedChallenge。</li> 
     * @return VerifiedBotRequestsAction 友好 Bot 请求的执行动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截；</li><li>Monitor：观察；</li><li>Allow：放行；</li><li>Challenge：挑战，其中 ChallengeActionParameters 中的 ChallengeOption 支持 JSChallenge 和 ManagedChallenge。</li>
     */
    public SecurityAction getVerifiedBotRequestsAction() {
        return this.VerifiedBotRequestsAction;
    }

    /**
     * Set 友好 Bot 请求的执行动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截；</li><li>Monitor：观察；</li><li>Allow：放行；</li><li>Challenge：挑战，其中 ChallengeActionParameters 中的 ChallengeOption 支持 JSChallenge 和 ManagedChallenge。</li>
     * @param VerifiedBotRequestsAction 友好 Bot 请求的执行动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截；</li><li>Monitor：观察；</li><li>Allow：放行；</li><li>Challenge：挑战，其中 ChallengeActionParameters 中的 ChallengeOption 支持 JSChallenge 和 ManagedChallenge。</li>
     */
    public void setVerifiedBotRequestsAction(SecurityAction VerifiedBotRequestsAction) {
        this.VerifiedBotRequestsAction = VerifiedBotRequestsAction;
    }

    /**
     * Get 正常 Bot 请求的执行动作。 SecurityAction 的 Name 取值支持：<li>Allow：放行。</li> 
     * @return HumanRequestsAction 正常 Bot 请求的执行动作。 SecurityAction 的 Name 取值支持：<li>Allow：放行。</li>
     */
    public SecurityAction getHumanRequestsAction() {
        return this.HumanRequestsAction;
    }

    /**
     * Set 正常 Bot 请求的执行动作。 SecurityAction 的 Name 取值支持：<li>Allow：放行。</li>
     * @param HumanRequestsAction 正常 Bot 请求的执行动作。 SecurityAction 的 Name 取值支持：<li>Allow：放行。</li>
     */
    public void setHumanRequestsAction(SecurityAction HumanRequestsAction) {
        this.HumanRequestsAction = HumanRequestsAction;
    }

    public BotRatings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BotRatings(BotRatings source) {
        if (source.HighRiskBotRequestsAction != null) {
            this.HighRiskBotRequestsAction = new SecurityAction(source.HighRiskBotRequestsAction);
        }
        if (source.LikelyBotRequestsAction != null) {
            this.LikelyBotRequestsAction = new SecurityAction(source.LikelyBotRequestsAction);
        }
        if (source.VerifiedBotRequestsAction != null) {
            this.VerifiedBotRequestsAction = new SecurityAction(source.VerifiedBotRequestsAction);
        }
        if (source.HumanRequestsAction != null) {
            this.HumanRequestsAction = new SecurityAction(source.HumanRequestsAction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "HighRiskBotRequestsAction.", this.HighRiskBotRequestsAction);
        this.setParamObj(map, prefix + "LikelyBotRequestsAction.", this.LikelyBotRequestsAction);
        this.setParamObj(map, prefix + "VerifiedBotRequestsAction.", this.VerifiedBotRequestsAction);
        this.setParamObj(map, prefix + "HumanRequestsAction.", this.HumanRequestsAction);

    }
}

