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

public class AICrawlerDetection extends AbstractModel {

    /**
    * AI 爬虫检测是否开启。取值有：
<li>on：开启；</li>
<li>off：关闭。</li>

    */
    @SerializedName("Enabled")
    @Expose
    private String Enabled;

    /**
    * AI 爬虫检测的执行动作，当 Enabled 为 on 时，此字段必填。SecurityAction 的 Name 取值仅支持：
<li>Deny：拦截；</li>
<li>Monitor：观察；</li>
<li>Allow：放行；</li>
<li>Challenge：挑战，其中 ChallengeActionParameters 中的 ChallengeOption 仅支持 JSChallenge 和 ManagedChallenge。</li>
    */
    @SerializedName("Action")
    @Expose
    private SecurityAction Action;

    /**
     * Get AI 爬虫检测是否开启。取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
 
     * @return Enabled AI 爬虫检测是否开启。取值有：
<li>on：开启；</li>
<li>off：关闭。</li>

     */
    public String getEnabled() {
        return this.Enabled;
    }

    /**
     * Set AI 爬虫检测是否开启。取值有：
<li>on：开启；</li>
<li>off：关闭。</li>

     * @param Enabled AI 爬虫检测是否开启。取值有：
<li>on：开启；</li>
<li>off：关闭。</li>

     */
    public void setEnabled(String Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get AI 爬虫检测的执行动作，当 Enabled 为 on 时，此字段必填。SecurityAction 的 Name 取值仅支持：
<li>Deny：拦截；</li>
<li>Monitor：观察；</li>
<li>Allow：放行；</li>
<li>Challenge：挑战，其中 ChallengeActionParameters 中的 ChallengeOption 仅支持 JSChallenge 和 ManagedChallenge。</li> 
     * @return Action AI 爬虫检测的执行动作，当 Enabled 为 on 时，此字段必填。SecurityAction 的 Name 取值仅支持：
<li>Deny：拦截；</li>
<li>Monitor：观察；</li>
<li>Allow：放行；</li>
<li>Challenge：挑战，其中 ChallengeActionParameters 中的 ChallengeOption 仅支持 JSChallenge 和 ManagedChallenge。</li>
     */
    public SecurityAction getAction() {
        return this.Action;
    }

    /**
     * Set AI 爬虫检测的执行动作，当 Enabled 为 on 时，此字段必填。SecurityAction 的 Name 取值仅支持：
<li>Deny：拦截；</li>
<li>Monitor：观察；</li>
<li>Allow：放行；</li>
<li>Challenge：挑战，其中 ChallengeActionParameters 中的 ChallengeOption 仅支持 JSChallenge 和 ManagedChallenge。</li>
     * @param Action AI 爬虫检测的执行动作，当 Enabled 为 on 时，此字段必填。SecurityAction 的 Name 取值仅支持：
<li>Deny：拦截；</li>
<li>Monitor：观察；</li>
<li>Allow：放行；</li>
<li>Challenge：挑战，其中 ChallengeActionParameters 中的 ChallengeOption 仅支持 JSChallenge 和 ManagedChallenge。</li>
     */
    public void setAction(SecurityAction Action) {
        this.Action = Action;
    }

    public AICrawlerDetection() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AICrawlerDetection(AICrawlerDetection source) {
        if (source.Enabled != null) {
            this.Enabled = new String(source.Enabled);
        }
        if (source.Action != null) {
            this.Action = new SecurityAction(source.Action);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamObj(map, prefix + "Action.", this.Action);

    }
}

