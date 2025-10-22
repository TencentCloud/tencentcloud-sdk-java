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

public class BasicBotSettings extends AbstractModel {

    /**
    * 客户端 IP 的来源 IDC 配置，用于处置来自 IDC（数据中心） 的客户端 IP 的访问请求。此类来源请求不是由移动端或浏览器端直接访问。
    */
    @SerializedName("SourceIDC")
    @Expose
    private SourceIDC SourceIDC;

    /**
    * 搜索引擎爬虫配置，用于处置来自搜索引擎爬虫的请求。此类请求的 IP、User-Agent 或 rDNS 结果匹配已知搜索引擎爬虫。
    */
    @SerializedName("SearchEngineBots")
    @Expose
    private SearchEngineBots SearchEngineBots;

    /**
    * 商业或开源工具 UA 特征配置（原 UA 特征规则），用于处置来自已知商业工具或开源工具的访问请求。此类请求的 User-Agent 头部符合已知商业或开源工具特征。
    */
    @SerializedName("KnownBotCategories")
    @Expose
    private KnownBotCategories KnownBotCategories;

    /**
    * IP 威胁情报库（原客户端画像分析）配置，用于处置近期访问行为具有特定风险特征的客户端 IP。
    */
    @SerializedName("IPReputation")
    @Expose
    private IPReputation IPReputation;

    /**
    * Bot 智能分析的具体配置。
    */
    @SerializedName("BotIntelligence")
    @Expose
    private BotIntelligence BotIntelligence;

    /**
     * Get 客户端 IP 的来源 IDC 配置，用于处置来自 IDC（数据中心） 的客户端 IP 的访问请求。此类来源请求不是由移动端或浏览器端直接访问。 
     * @return SourceIDC 客户端 IP 的来源 IDC 配置，用于处置来自 IDC（数据中心） 的客户端 IP 的访问请求。此类来源请求不是由移动端或浏览器端直接访问。
     */
    public SourceIDC getSourceIDC() {
        return this.SourceIDC;
    }

    /**
     * Set 客户端 IP 的来源 IDC 配置，用于处置来自 IDC（数据中心） 的客户端 IP 的访问请求。此类来源请求不是由移动端或浏览器端直接访问。
     * @param SourceIDC 客户端 IP 的来源 IDC 配置，用于处置来自 IDC（数据中心） 的客户端 IP 的访问请求。此类来源请求不是由移动端或浏览器端直接访问。
     */
    public void setSourceIDC(SourceIDC SourceIDC) {
        this.SourceIDC = SourceIDC;
    }

    /**
     * Get 搜索引擎爬虫配置，用于处置来自搜索引擎爬虫的请求。此类请求的 IP、User-Agent 或 rDNS 结果匹配已知搜索引擎爬虫。 
     * @return SearchEngineBots 搜索引擎爬虫配置，用于处置来自搜索引擎爬虫的请求。此类请求的 IP、User-Agent 或 rDNS 结果匹配已知搜索引擎爬虫。
     */
    public SearchEngineBots getSearchEngineBots() {
        return this.SearchEngineBots;
    }

    /**
     * Set 搜索引擎爬虫配置，用于处置来自搜索引擎爬虫的请求。此类请求的 IP、User-Agent 或 rDNS 结果匹配已知搜索引擎爬虫。
     * @param SearchEngineBots 搜索引擎爬虫配置，用于处置来自搜索引擎爬虫的请求。此类请求的 IP、User-Agent 或 rDNS 结果匹配已知搜索引擎爬虫。
     */
    public void setSearchEngineBots(SearchEngineBots SearchEngineBots) {
        this.SearchEngineBots = SearchEngineBots;
    }

    /**
     * Get 商业或开源工具 UA 特征配置（原 UA 特征规则），用于处置来自已知商业工具或开源工具的访问请求。此类请求的 User-Agent 头部符合已知商业或开源工具特征。 
     * @return KnownBotCategories 商业或开源工具 UA 特征配置（原 UA 特征规则），用于处置来自已知商业工具或开源工具的访问请求。此类请求的 User-Agent 头部符合已知商业或开源工具特征。
     */
    public KnownBotCategories getKnownBotCategories() {
        return this.KnownBotCategories;
    }

    /**
     * Set 商业或开源工具 UA 特征配置（原 UA 特征规则），用于处置来自已知商业工具或开源工具的访问请求。此类请求的 User-Agent 头部符合已知商业或开源工具特征。
     * @param KnownBotCategories 商业或开源工具 UA 特征配置（原 UA 特征规则），用于处置来自已知商业工具或开源工具的访问请求。此类请求的 User-Agent 头部符合已知商业或开源工具特征。
     */
    public void setKnownBotCategories(KnownBotCategories KnownBotCategories) {
        this.KnownBotCategories = KnownBotCategories;
    }

    /**
     * Get IP 威胁情报库（原客户端画像分析）配置，用于处置近期访问行为具有特定风险特征的客户端 IP。 
     * @return IPReputation IP 威胁情报库（原客户端画像分析）配置，用于处置近期访问行为具有特定风险特征的客户端 IP。
     */
    public IPReputation getIPReputation() {
        return this.IPReputation;
    }

    /**
     * Set IP 威胁情报库（原客户端画像分析）配置，用于处置近期访问行为具有特定风险特征的客户端 IP。
     * @param IPReputation IP 威胁情报库（原客户端画像分析）配置，用于处置近期访问行为具有特定风险特征的客户端 IP。
     */
    public void setIPReputation(IPReputation IPReputation) {
        this.IPReputation = IPReputation;
    }

    /**
     * Get Bot 智能分析的具体配置。 
     * @return BotIntelligence Bot 智能分析的具体配置。
     */
    public BotIntelligence getBotIntelligence() {
        return this.BotIntelligence;
    }

    /**
     * Set Bot 智能分析的具体配置。
     * @param BotIntelligence Bot 智能分析的具体配置。
     */
    public void setBotIntelligence(BotIntelligence BotIntelligence) {
        this.BotIntelligence = BotIntelligence;
    }

    public BasicBotSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BasicBotSettings(BasicBotSettings source) {
        if (source.SourceIDC != null) {
            this.SourceIDC = new SourceIDC(source.SourceIDC);
        }
        if (source.SearchEngineBots != null) {
            this.SearchEngineBots = new SearchEngineBots(source.SearchEngineBots);
        }
        if (source.KnownBotCategories != null) {
            this.KnownBotCategories = new KnownBotCategories(source.KnownBotCategories);
        }
        if (source.IPReputation != null) {
            this.IPReputation = new IPReputation(source.IPReputation);
        }
        if (source.BotIntelligence != null) {
            this.BotIntelligence = new BotIntelligence(source.BotIntelligence);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "SourceIDC.", this.SourceIDC);
        this.setParamObj(map, prefix + "SearchEngineBots.", this.SearchEngineBots);
        this.setParamObj(map, prefix + "KnownBotCategories.", this.KnownBotCategories);
        this.setParamObj(map, prefix + "IPReputation.", this.IPReputation);
        this.setParamObj(map, prefix + "BotIntelligence.", this.BotIntelligence);

    }
}

