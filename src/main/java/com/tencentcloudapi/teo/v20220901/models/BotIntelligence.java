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

public class BotIntelligence extends AbstractModel {

    /**
    * 基于客户端和请求特征，将请求来源分为人类来源请求、合法 Bot 请求、疑似 Bot 请求和高风险 Bot 请求，并提供请求处置选项。
    */
    @SerializedName("BotRatings")
    @Expose
    private BotRatings BotRatings;

    /**
    * Bot 智能分析的具体配置开关。取值有：

on：开启；
off：关闭。
    */
    @SerializedName("Enabled")
    @Expose
    private String Enabled;

    /**
     * Get 基于客户端和请求特征，将请求来源分为人类来源请求、合法 Bot 请求、疑似 Bot 请求和高风险 Bot 请求，并提供请求处置选项。 
     * @return BotRatings 基于客户端和请求特征，将请求来源分为人类来源请求、合法 Bot 请求、疑似 Bot 请求和高风险 Bot 请求，并提供请求处置选项。
     */
    public BotRatings getBotRatings() {
        return this.BotRatings;
    }

    /**
     * Set 基于客户端和请求特征，将请求来源分为人类来源请求、合法 Bot 请求、疑似 Bot 请求和高风险 Bot 请求，并提供请求处置选项。
     * @param BotRatings 基于客户端和请求特征，将请求来源分为人类来源请求、合法 Bot 请求、疑似 Bot 请求和高风险 Bot 请求，并提供请求处置选项。
     */
    public void setBotRatings(BotRatings BotRatings) {
        this.BotRatings = BotRatings;
    }

    /**
     * Get Bot 智能分析的具体配置开关。取值有：

on：开启；
off：关闭。 
     * @return Enabled Bot 智能分析的具体配置开关。取值有：

on：开启；
off：关闭。
     */
    public String getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Bot 智能分析的具体配置开关。取值有：

on：开启；
off：关闭。
     * @param Enabled Bot 智能分析的具体配置开关。取值有：

on：开启；
off：关闭。
     */
    public void setEnabled(String Enabled) {
        this.Enabled = Enabled;
    }

    public BotIntelligence() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BotIntelligence(BotIntelligence source) {
        if (source.BotRatings != null) {
            this.BotRatings = new BotRatings(source.BotRatings);
        }
        if (source.Enabled != null) {
            this.Enabled = new String(source.Enabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "BotRatings.", this.BotRatings);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);

    }
}

