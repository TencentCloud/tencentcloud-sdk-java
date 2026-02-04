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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBotIdRuleRequest extends AbstractModel {

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 场景ID
    */
    @SerializedName("SceneId")
    @Expose
    private String SceneId;

    /**
    * 规则ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 规则名称
    */
    @SerializedName("BotId")
    @Expose
    private String BotId;

    /**
    * 风险等级筛选
    */
    @SerializedName("Level")
    @Expose
    private Long [] Level;

    /**
    * 规则类型筛选"cbe-01": "爬虫型BOT", 	"cbe-02": "刷量型BOT", 	"cbe-03": "账号穷举型BOT", 	"cbe-04": "恶意扫描型BOT", 	"cbe-05": "DDoS型BOT", 	"cbe-06": "垃圾邮件发送型BOT", 	"cbe-07": "社交媒体自动化型BOT", 	"cbe-08": "竞争对手数据收集型BOT", 	"cbe-09": "恶意软件传播型BOT"
    */
    @SerializedName("BotIdType")
    @Expose
    private String [] BotIdType;

    /**
    * 规则开关-用于筛选: 0-全部 1-关闭 2-开启
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 动作类型-用于筛选
    */
    @SerializedName("RuleAction")
    @Expose
    private String [] RuleAction;

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 场景ID 
     * @return SceneId 场景ID
     */
    public String getSceneId() {
        return this.SceneId;
    }

    /**
     * Set 场景ID
     * @param SceneId 场景ID
     */
    public void setSceneId(String SceneId) {
        this.SceneId = SceneId;
    }

    /**
     * Get 规则ID 
     * @return RuleId 规则ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则ID
     * @param RuleId 规则ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 规则名称 
     * @return BotId 规则名称
     */
    public String getBotId() {
        return this.BotId;
    }

    /**
     * Set 规则名称
     * @param BotId 规则名称
     */
    public void setBotId(String BotId) {
        this.BotId = BotId;
    }

    /**
     * Get 风险等级筛选 
     * @return Level 风险等级筛选
     */
    public Long [] getLevel() {
        return this.Level;
    }

    /**
     * Set 风险等级筛选
     * @param Level 风险等级筛选
     */
    public void setLevel(Long [] Level) {
        this.Level = Level;
    }

    /**
     * Get 规则类型筛选"cbe-01": "爬虫型BOT", 	"cbe-02": "刷量型BOT", 	"cbe-03": "账号穷举型BOT", 	"cbe-04": "恶意扫描型BOT", 	"cbe-05": "DDoS型BOT", 	"cbe-06": "垃圾邮件发送型BOT", 	"cbe-07": "社交媒体自动化型BOT", 	"cbe-08": "竞争对手数据收集型BOT", 	"cbe-09": "恶意软件传播型BOT" 
     * @return BotIdType 规则类型筛选"cbe-01": "爬虫型BOT", 	"cbe-02": "刷量型BOT", 	"cbe-03": "账号穷举型BOT", 	"cbe-04": "恶意扫描型BOT", 	"cbe-05": "DDoS型BOT", 	"cbe-06": "垃圾邮件发送型BOT", 	"cbe-07": "社交媒体自动化型BOT", 	"cbe-08": "竞争对手数据收集型BOT", 	"cbe-09": "恶意软件传播型BOT"
     */
    public String [] getBotIdType() {
        return this.BotIdType;
    }

    /**
     * Set 规则类型筛选"cbe-01": "爬虫型BOT", 	"cbe-02": "刷量型BOT", 	"cbe-03": "账号穷举型BOT", 	"cbe-04": "恶意扫描型BOT", 	"cbe-05": "DDoS型BOT", 	"cbe-06": "垃圾邮件发送型BOT", 	"cbe-07": "社交媒体自动化型BOT", 	"cbe-08": "竞争对手数据收集型BOT", 	"cbe-09": "恶意软件传播型BOT"
     * @param BotIdType 规则类型筛选"cbe-01": "爬虫型BOT", 	"cbe-02": "刷量型BOT", 	"cbe-03": "账号穷举型BOT", 	"cbe-04": "恶意扫描型BOT", 	"cbe-05": "DDoS型BOT", 	"cbe-06": "垃圾邮件发送型BOT", 	"cbe-07": "社交媒体自动化型BOT", 	"cbe-08": "竞争对手数据收集型BOT", 	"cbe-09": "恶意软件传播型BOT"
     */
    public void setBotIdType(String [] BotIdType) {
        this.BotIdType = BotIdType;
    }

    /**
     * Get 规则开关-用于筛选: 0-全部 1-关闭 2-开启 
     * @return Status 规则开关-用于筛选: 0-全部 1-关闭 2-开启
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 规则开关-用于筛选: 0-全部 1-关闭 2-开启
     * @param Status 规则开关-用于筛选: 0-全部 1-关闭 2-开启
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 动作类型-用于筛选 
     * @return RuleAction 动作类型-用于筛选
     */
    public String [] getRuleAction() {
        return this.RuleAction;
    }

    /**
     * Set 动作类型-用于筛选
     * @param RuleAction 动作类型-用于筛选
     */
    public void setRuleAction(String [] RuleAction) {
        this.RuleAction = RuleAction;
    }

    public DescribeBotIdRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBotIdRuleRequest(DescribeBotIdRuleRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.SceneId != null) {
            this.SceneId = new String(source.SceneId);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.BotId != null) {
            this.BotId = new String(source.BotId);
        }
        if (source.Level != null) {
            this.Level = new Long[source.Level.length];
            for (int i = 0; i < source.Level.length; i++) {
                this.Level[i] = new Long(source.Level[i]);
            }
        }
        if (source.BotIdType != null) {
            this.BotIdType = new String[source.BotIdType.length];
            for (int i = 0; i < source.BotIdType.length; i++) {
                this.BotIdType[i] = new String(source.BotIdType[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.RuleAction != null) {
            this.RuleAction = new String[source.RuleAction.length];
            for (int i = 0; i < source.RuleAction.length; i++) {
                this.RuleAction[i] = new String(source.RuleAction[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "SceneId", this.SceneId);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "BotId", this.BotId);
        this.setParamArraySimple(map, prefix + "Level.", this.Level);
        this.setParamArraySimple(map, prefix + "BotIdType.", this.BotIdType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "RuleAction.", this.RuleAction);

    }
}

