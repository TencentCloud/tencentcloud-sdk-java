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

public class BotManagementActionOverrides extends AbstractModel {

    /**
    * Bot 规则组下的具体项，用于改写此单条规则项配置的内容，Ids 所对应的具体信息请参考 DescribeBotManagedRules 接口返回的信息。
    */
    @SerializedName("Ids")
    @Expose
    private String [] Ids;

    /**
    * Ids 中指定 Bot 规则项的处置动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截；</li><li>Monitor：观察；</li><li>Disabled：未启用，不启用指定规则；</li><li>Challenge：挑战，其中 ChallengeActionParameters 中的 ChallengeOption 支持 JSChallenge 和 ManagedChallenge；</li><li>Allow：放行（仅限Bot基础特征管理）。</li>

    */
    @SerializedName("Action")
    @Expose
    private SecurityAction Action;

    /**
     * Get Bot 规则组下的具体项，用于改写此单条规则项配置的内容，Ids 所对应的具体信息请参考 DescribeBotManagedRules 接口返回的信息。 
     * @return Ids Bot 规则组下的具体项，用于改写此单条规则项配置的内容，Ids 所对应的具体信息请参考 DescribeBotManagedRules 接口返回的信息。
     */
    public String [] getIds() {
        return this.Ids;
    }

    /**
     * Set Bot 规则组下的具体项，用于改写此单条规则项配置的内容，Ids 所对应的具体信息请参考 DescribeBotManagedRules 接口返回的信息。
     * @param Ids Bot 规则组下的具体项，用于改写此单条规则项配置的内容，Ids 所对应的具体信息请参考 DescribeBotManagedRules 接口返回的信息。
     */
    public void setIds(String [] Ids) {
        this.Ids = Ids;
    }

    /**
     * Get Ids 中指定 Bot 规则项的处置动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截；</li><li>Monitor：观察；</li><li>Disabled：未启用，不启用指定规则；</li><li>Challenge：挑战，其中 ChallengeActionParameters 中的 ChallengeOption 支持 JSChallenge 和 ManagedChallenge；</li><li>Allow：放行（仅限Bot基础特征管理）。</li>
 
     * @return Action Ids 中指定 Bot 规则项的处置动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截；</li><li>Monitor：观察；</li><li>Disabled：未启用，不启用指定规则；</li><li>Challenge：挑战，其中 ChallengeActionParameters 中的 ChallengeOption 支持 JSChallenge 和 ManagedChallenge；</li><li>Allow：放行（仅限Bot基础特征管理）。</li>

     */
    public SecurityAction getAction() {
        return this.Action;
    }

    /**
     * Set Ids 中指定 Bot 规则项的处置动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截；</li><li>Monitor：观察；</li><li>Disabled：未启用，不启用指定规则；</li><li>Challenge：挑战，其中 ChallengeActionParameters 中的 ChallengeOption 支持 JSChallenge 和 ManagedChallenge；</li><li>Allow：放行（仅限Bot基础特征管理）。</li>

     * @param Action Ids 中指定 Bot 规则项的处置动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截；</li><li>Monitor：观察；</li><li>Disabled：未启用，不启用指定规则；</li><li>Challenge：挑战，其中 ChallengeActionParameters 中的 ChallengeOption 支持 JSChallenge 和 ManagedChallenge；</li><li>Allow：放行（仅限Bot基础特征管理）。</li>

     */
    public void setAction(SecurityAction Action) {
        this.Action = Action;
    }

    public BotManagementActionOverrides() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BotManagementActionOverrides(BotManagementActionOverrides source) {
        if (source.Ids != null) {
            this.Ids = new String[source.Ids.length];
            for (int i = 0; i < source.Ids.length; i++) {
                this.Ids[i] = new String(source.Ids[i]);
            }
        }
        if (source.Action != null) {
            this.Action = new SecurityAction(source.Action);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Ids.", this.Ids);
        this.setParamObj(map, prefix + "Action.", this.Action);

    }
}

