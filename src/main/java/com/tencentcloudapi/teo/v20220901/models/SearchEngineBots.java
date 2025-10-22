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

public class SearchEngineBots extends AbstractModel {

    /**
    * 来自搜索引擎爬虫的请求的执行动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截；</li><li>Monitor：观察；</li><li>Disabled：未启用，不启用指定规则；</li><li>Challenge：挑战，其中 ChallengeActionParameters 中的 ChallengeOption 支持 JSChallenge 和 ManagedChallenge；</li><li>Allow：放行（待废弃）。</li> 
    */
    @SerializedName("BaseAction")
    @Expose
    private SecurityAction BaseAction;

    /**
    * 指定搜索引擎爬虫请求的处置方式。
    */
    @SerializedName("BotManagementActionOverrides")
    @Expose
    private BotManagementActionOverrides [] BotManagementActionOverrides;

    /**
     * Get 来自搜索引擎爬虫的请求的执行动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截；</li><li>Monitor：观察；</li><li>Disabled：未启用，不启用指定规则；</li><li>Challenge：挑战，其中 ChallengeActionParameters 中的 ChallengeOption 支持 JSChallenge 和 ManagedChallenge；</li><li>Allow：放行（待废弃）。</li>  
     * @return BaseAction 来自搜索引擎爬虫的请求的执行动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截；</li><li>Monitor：观察；</li><li>Disabled：未启用，不启用指定规则；</li><li>Challenge：挑战，其中 ChallengeActionParameters 中的 ChallengeOption 支持 JSChallenge 和 ManagedChallenge；</li><li>Allow：放行（待废弃）。</li> 
     */
    public SecurityAction getBaseAction() {
        return this.BaseAction;
    }

    /**
     * Set 来自搜索引擎爬虫的请求的执行动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截；</li><li>Monitor：观察；</li><li>Disabled：未启用，不启用指定规则；</li><li>Challenge：挑战，其中 ChallengeActionParameters 中的 ChallengeOption 支持 JSChallenge 和 ManagedChallenge；</li><li>Allow：放行（待废弃）。</li> 
     * @param BaseAction 来自搜索引擎爬虫的请求的执行动作。 SecurityAction 的 Name 取值支持：<li>Deny：拦截；</li><li>Monitor：观察；</li><li>Disabled：未启用，不启用指定规则；</li><li>Challenge：挑战，其中 ChallengeActionParameters 中的 ChallengeOption 支持 JSChallenge 和 ManagedChallenge；</li><li>Allow：放行（待废弃）。</li> 
     */
    public void setBaseAction(SecurityAction BaseAction) {
        this.BaseAction = BaseAction;
    }

    /**
     * Get 指定搜索引擎爬虫请求的处置方式。 
     * @return BotManagementActionOverrides 指定搜索引擎爬虫请求的处置方式。
     */
    public BotManagementActionOverrides [] getBotManagementActionOverrides() {
        return this.BotManagementActionOverrides;
    }

    /**
     * Set 指定搜索引擎爬虫请求的处置方式。
     * @param BotManagementActionOverrides 指定搜索引擎爬虫请求的处置方式。
     */
    public void setBotManagementActionOverrides(BotManagementActionOverrides [] BotManagementActionOverrides) {
        this.BotManagementActionOverrides = BotManagementActionOverrides;
    }

    public SearchEngineBots() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchEngineBots(SearchEngineBots source) {
        if (source.BaseAction != null) {
            this.BaseAction = new SecurityAction(source.BaseAction);
        }
        if (source.BotManagementActionOverrides != null) {
            this.BotManagementActionOverrides = new BotManagementActionOverrides[source.BotManagementActionOverrides.length];
            for (int i = 0; i < source.BotManagementActionOverrides.length; i++) {
                this.BotManagementActionOverrides[i] = new BotManagementActionOverrides(source.BotManagementActionOverrides[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "BaseAction.", this.BaseAction);
        this.setParamArrayObj(map, prefix + "BotManagementActionOverrides.", this.BotManagementActionOverrides);

    }
}

