/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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

public class BotSceneInfo extends AbstractModel {

    /**
    * 场景ID
    */
    @SerializedName("SceneId")
    @Expose
    private String SceneId;

    /**
    * 场景类型，default:默认场景,custom:非默认场景
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 场景名
    */
    @SerializedName("SceneName")
    @Expose
    private String SceneName;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * 场景模板类型，登录: login  秒杀:seckill  爬内容：crawl 自定义: custom
    */
    @SerializedName("BusinessType")
    @Expose
    private String [] BusinessType;

    /**
    * 客户端类型，浏览器/H5 : browser  小程序: miniApp  App:
    */
    @SerializedName("ClientType")
    @Expose
    private String [] ClientType;

    /**
    * 优先级
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * 匹配范围
    */
    @SerializedName("MatchCondition")
    @Expose
    private BotSceneMatchCondition [] MatchCondition;

    /**
    * 场景开关
    */
    @SerializedName("SceneStatus")
    @Expose
    private Boolean SceneStatus;

    /**
    * 前端对抗开关
    */
    @SerializedName("JsInjectStatus")
    @Expose
    private Boolean JsInjectStatus;

    /**
    * AI开关
    */
    @SerializedName("AIStatus")
    @Expose
    private Boolean AIStatus;

    /**
    * TI开关
    */
    @SerializedName("TIStatus")
    @Expose
    private Boolean TIStatus;

    /**
    * 智能统计开关
    */
    @SerializedName("StatisticStatus")
    @Expose
    private Boolean StatisticStatus;

    /**
    * 动作策略数量
    */
    @SerializedName("ActionRuleCount")
    @Expose
    private Long ActionRuleCount;

    /**
    * 自定义规则数量
    */
    @SerializedName("UCBCount")
    @Expose
    private Long UCBCount;

    /**
    * 场景的匹配范围，global-全部匹配 custom-自定义匹配范围
    */
    @SerializedName("MatchType")
    @Expose
    private String MatchType;

    /**
    * 匹配条件间的与或关系
    */
    @SerializedName("ActionMatchType")
    @Expose
    private String ActionMatchType;

    /**
    * UA模块开关
    */
    @SerializedName("UAStatus")
    @Expose
    private Boolean UAStatus;

    /**
    * 简易模式场景：前端对抗对应mysql的记录id
    */
    @SerializedName("JsInjectRuleId")
    @Expose
    private Long JsInjectRuleId;

    /**
    * 简易模式场景：前端对抗配置动作
    */
    @SerializedName("JsInjectAction")
    @Expose
    private Long JsInjectAction;

    /**
    * 简易模式场景：前端对抗重定向路径
    */
    @SerializedName("JsInjectRedirect")
    @Expose
    private String JsInjectRedirect;

    /**
    * 简易模式场景：动作策略信息  PS:简易模式只有一个动作策略
    */
    @SerializedName("ActionRuleList")
    @Expose
    private BotSceneActionRule [] ActionRuleList;

    /**
    * 简易模式场景：monitor-观察 intercept-拦截 custom-自定义
    */
    @SerializedName("BotIdPattern")
    @Expose
    private String BotIdPattern;

    /**
    * 简易模式场景：bot_id规则总数
    */
    @SerializedName("BotIdCount")
    @Expose
    private Long BotIdCount;

    /**
    * 简易模式场景：观察动作的规则总数
    */
    @SerializedName("BotIdMonitorCount")
    @Expose
    private Long BotIdMonitorCount;

    /**
    * 简易模式场景：拦截动作的规则总数
    */
    @SerializedName("BotIdInterceptCount")
    @Expose
    private Long BotIdInterceptCount;

    /**
    * 创建场景时选择的规则集
    */
    @SerializedName("RuleSetSelection")
    @Expose
    private String [] RuleSetSelection;

    /**
    * 改场景的bot token列表
    */
    @SerializedName("TokenList")
    @Expose
    private BotToken [] TokenList;

    /**
    * 简易模式场景：重定向动作的规则总数
    */
    @SerializedName("BotIdRedirectCount")
    @Expose
    private Long BotIdRedirectCount;

    /**
    * 简易模式场景：人机识别动作的规则总数
    */
    @SerializedName("BotIdCaptchaCount")
    @Expose
    private Long BotIdCaptchaCount;

    /**
    * 简易模式场景：防护等级
    */
    @SerializedName("BotIdProtectLevel")
    @Expose
    private String BotIdProtectLevel;

    /**
    * 简易模式场景：全局重定向路径
    */
    @SerializedName("BotIdGlobalRedirect")
    @Expose
    private String BotIdGlobalRedirect;

    /**
    * 简易模式场景：JS校验动作的规则总数
    */
    @SerializedName("BotIdJsChallengeCount")
    @Expose
    private Long BotIdJsChallengeCount;

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
     * Get 场景类型，default:默认场景,custom:非默认场景 
     * @return Type 场景类型，default:默认场景,custom:非默认场景
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 场景类型，default:默认场景,custom:非默认场景
     * @param Type 场景类型，default:默认场景,custom:非默认场景
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 场景名 
     * @return SceneName 场景名
     */
    public String getSceneName() {
        return this.SceneName;
    }

    /**
     * Set 场景名
     * @param SceneName 场景名
     */
    public void setSceneName(String SceneName) {
        this.SceneName = SceneName;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 场景模板类型，登录: login  秒杀:seckill  爬内容：crawl 自定义: custom 
     * @return BusinessType 场景模板类型，登录: login  秒杀:seckill  爬内容：crawl 自定义: custom
     */
    public String [] getBusinessType() {
        return this.BusinessType;
    }

    /**
     * Set 场景模板类型，登录: login  秒杀:seckill  爬内容：crawl 自定义: custom
     * @param BusinessType 场景模板类型，登录: login  秒杀:seckill  爬内容：crawl 自定义: custom
     */
    public void setBusinessType(String [] BusinessType) {
        this.BusinessType = BusinessType;
    }

    /**
     * Get 客户端类型，浏览器/H5 : browser  小程序: miniApp  App: 
     * @return ClientType 客户端类型，浏览器/H5 : browser  小程序: miniApp  App:
     */
    public String [] getClientType() {
        return this.ClientType;
    }

    /**
     * Set 客户端类型，浏览器/H5 : browser  小程序: miniApp  App:
     * @param ClientType 客户端类型，浏览器/H5 : browser  小程序: miniApp  App:
     */
    public void setClientType(String [] ClientType) {
        this.ClientType = ClientType;
    }

    /**
     * Get 优先级 
     * @return Priority 优先级
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set 优先级
     * @param Priority 优先级
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get 匹配范围 
     * @return MatchCondition 匹配范围
     */
    public BotSceneMatchCondition [] getMatchCondition() {
        return this.MatchCondition;
    }

    /**
     * Set 匹配范围
     * @param MatchCondition 匹配范围
     */
    public void setMatchCondition(BotSceneMatchCondition [] MatchCondition) {
        this.MatchCondition = MatchCondition;
    }

    /**
     * Get 场景开关 
     * @return SceneStatus 场景开关
     */
    public Boolean getSceneStatus() {
        return this.SceneStatus;
    }

    /**
     * Set 场景开关
     * @param SceneStatus 场景开关
     */
    public void setSceneStatus(Boolean SceneStatus) {
        this.SceneStatus = SceneStatus;
    }

    /**
     * Get 前端对抗开关 
     * @return JsInjectStatus 前端对抗开关
     */
    public Boolean getJsInjectStatus() {
        return this.JsInjectStatus;
    }

    /**
     * Set 前端对抗开关
     * @param JsInjectStatus 前端对抗开关
     */
    public void setJsInjectStatus(Boolean JsInjectStatus) {
        this.JsInjectStatus = JsInjectStatus;
    }

    /**
     * Get AI开关 
     * @return AIStatus AI开关
     */
    public Boolean getAIStatus() {
        return this.AIStatus;
    }

    /**
     * Set AI开关
     * @param AIStatus AI开关
     */
    public void setAIStatus(Boolean AIStatus) {
        this.AIStatus = AIStatus;
    }

    /**
     * Get TI开关 
     * @return TIStatus TI开关
     */
    public Boolean getTIStatus() {
        return this.TIStatus;
    }

    /**
     * Set TI开关
     * @param TIStatus TI开关
     */
    public void setTIStatus(Boolean TIStatus) {
        this.TIStatus = TIStatus;
    }

    /**
     * Get 智能统计开关 
     * @return StatisticStatus 智能统计开关
     */
    public Boolean getStatisticStatus() {
        return this.StatisticStatus;
    }

    /**
     * Set 智能统计开关
     * @param StatisticStatus 智能统计开关
     */
    public void setStatisticStatus(Boolean StatisticStatus) {
        this.StatisticStatus = StatisticStatus;
    }

    /**
     * Get 动作策略数量 
     * @return ActionRuleCount 动作策略数量
     */
    public Long getActionRuleCount() {
        return this.ActionRuleCount;
    }

    /**
     * Set 动作策略数量
     * @param ActionRuleCount 动作策略数量
     */
    public void setActionRuleCount(Long ActionRuleCount) {
        this.ActionRuleCount = ActionRuleCount;
    }

    /**
     * Get 自定义规则数量 
     * @return UCBCount 自定义规则数量
     */
    public Long getUCBCount() {
        return this.UCBCount;
    }

    /**
     * Set 自定义规则数量
     * @param UCBCount 自定义规则数量
     */
    public void setUCBCount(Long UCBCount) {
        this.UCBCount = UCBCount;
    }

    /**
     * Get 场景的匹配范围，global-全部匹配 custom-自定义匹配范围 
     * @return MatchType 场景的匹配范围，global-全部匹配 custom-自定义匹配范围
     */
    public String getMatchType() {
        return this.MatchType;
    }

    /**
     * Set 场景的匹配范围，global-全部匹配 custom-自定义匹配范围
     * @param MatchType 场景的匹配范围，global-全部匹配 custom-自定义匹配范围
     */
    public void setMatchType(String MatchType) {
        this.MatchType = MatchType;
    }

    /**
     * Get 匹配条件间的与或关系 
     * @return ActionMatchType 匹配条件间的与或关系
     */
    public String getActionMatchType() {
        return this.ActionMatchType;
    }

    /**
     * Set 匹配条件间的与或关系
     * @param ActionMatchType 匹配条件间的与或关系
     */
    public void setActionMatchType(String ActionMatchType) {
        this.ActionMatchType = ActionMatchType;
    }

    /**
     * Get UA模块开关 
     * @return UAStatus UA模块开关
     */
    public Boolean getUAStatus() {
        return this.UAStatus;
    }

    /**
     * Set UA模块开关
     * @param UAStatus UA模块开关
     */
    public void setUAStatus(Boolean UAStatus) {
        this.UAStatus = UAStatus;
    }

    /**
     * Get 简易模式场景：前端对抗对应mysql的记录id 
     * @return JsInjectRuleId 简易模式场景：前端对抗对应mysql的记录id
     */
    public Long getJsInjectRuleId() {
        return this.JsInjectRuleId;
    }

    /**
     * Set 简易模式场景：前端对抗对应mysql的记录id
     * @param JsInjectRuleId 简易模式场景：前端对抗对应mysql的记录id
     */
    public void setJsInjectRuleId(Long JsInjectRuleId) {
        this.JsInjectRuleId = JsInjectRuleId;
    }

    /**
     * Get 简易模式场景：前端对抗配置动作 
     * @return JsInjectAction 简易模式场景：前端对抗配置动作
     */
    public Long getJsInjectAction() {
        return this.JsInjectAction;
    }

    /**
     * Set 简易模式场景：前端对抗配置动作
     * @param JsInjectAction 简易模式场景：前端对抗配置动作
     */
    public void setJsInjectAction(Long JsInjectAction) {
        this.JsInjectAction = JsInjectAction;
    }

    /**
     * Get 简易模式场景：前端对抗重定向路径 
     * @return JsInjectRedirect 简易模式场景：前端对抗重定向路径
     */
    public String getJsInjectRedirect() {
        return this.JsInjectRedirect;
    }

    /**
     * Set 简易模式场景：前端对抗重定向路径
     * @param JsInjectRedirect 简易模式场景：前端对抗重定向路径
     */
    public void setJsInjectRedirect(String JsInjectRedirect) {
        this.JsInjectRedirect = JsInjectRedirect;
    }

    /**
     * Get 简易模式场景：动作策略信息  PS:简易模式只有一个动作策略 
     * @return ActionRuleList 简易模式场景：动作策略信息  PS:简易模式只有一个动作策略
     */
    public BotSceneActionRule [] getActionRuleList() {
        return this.ActionRuleList;
    }

    /**
     * Set 简易模式场景：动作策略信息  PS:简易模式只有一个动作策略
     * @param ActionRuleList 简易模式场景：动作策略信息  PS:简易模式只有一个动作策略
     */
    public void setActionRuleList(BotSceneActionRule [] ActionRuleList) {
        this.ActionRuleList = ActionRuleList;
    }

    /**
     * Get 简易模式场景：monitor-观察 intercept-拦截 custom-自定义 
     * @return BotIdPattern 简易模式场景：monitor-观察 intercept-拦截 custom-自定义
     */
    public String getBotIdPattern() {
        return this.BotIdPattern;
    }

    /**
     * Set 简易模式场景：monitor-观察 intercept-拦截 custom-自定义
     * @param BotIdPattern 简易模式场景：monitor-观察 intercept-拦截 custom-自定义
     */
    public void setBotIdPattern(String BotIdPattern) {
        this.BotIdPattern = BotIdPattern;
    }

    /**
     * Get 简易模式场景：bot_id规则总数 
     * @return BotIdCount 简易模式场景：bot_id规则总数
     */
    public Long getBotIdCount() {
        return this.BotIdCount;
    }

    /**
     * Set 简易模式场景：bot_id规则总数
     * @param BotIdCount 简易模式场景：bot_id规则总数
     */
    public void setBotIdCount(Long BotIdCount) {
        this.BotIdCount = BotIdCount;
    }

    /**
     * Get 简易模式场景：观察动作的规则总数 
     * @return BotIdMonitorCount 简易模式场景：观察动作的规则总数
     */
    public Long getBotIdMonitorCount() {
        return this.BotIdMonitorCount;
    }

    /**
     * Set 简易模式场景：观察动作的规则总数
     * @param BotIdMonitorCount 简易模式场景：观察动作的规则总数
     */
    public void setBotIdMonitorCount(Long BotIdMonitorCount) {
        this.BotIdMonitorCount = BotIdMonitorCount;
    }

    /**
     * Get 简易模式场景：拦截动作的规则总数 
     * @return BotIdInterceptCount 简易模式场景：拦截动作的规则总数
     */
    public Long getBotIdInterceptCount() {
        return this.BotIdInterceptCount;
    }

    /**
     * Set 简易模式场景：拦截动作的规则总数
     * @param BotIdInterceptCount 简易模式场景：拦截动作的规则总数
     */
    public void setBotIdInterceptCount(Long BotIdInterceptCount) {
        this.BotIdInterceptCount = BotIdInterceptCount;
    }

    /**
     * Get 创建场景时选择的规则集 
     * @return RuleSetSelection 创建场景时选择的规则集
     */
    public String [] getRuleSetSelection() {
        return this.RuleSetSelection;
    }

    /**
     * Set 创建场景时选择的规则集
     * @param RuleSetSelection 创建场景时选择的规则集
     */
    public void setRuleSetSelection(String [] RuleSetSelection) {
        this.RuleSetSelection = RuleSetSelection;
    }

    /**
     * Get 改场景的bot token列表 
     * @return TokenList 改场景的bot token列表
     */
    public BotToken [] getTokenList() {
        return this.TokenList;
    }

    /**
     * Set 改场景的bot token列表
     * @param TokenList 改场景的bot token列表
     */
    public void setTokenList(BotToken [] TokenList) {
        this.TokenList = TokenList;
    }

    /**
     * Get 简易模式场景：重定向动作的规则总数 
     * @return BotIdRedirectCount 简易模式场景：重定向动作的规则总数
     */
    public Long getBotIdRedirectCount() {
        return this.BotIdRedirectCount;
    }

    /**
     * Set 简易模式场景：重定向动作的规则总数
     * @param BotIdRedirectCount 简易模式场景：重定向动作的规则总数
     */
    public void setBotIdRedirectCount(Long BotIdRedirectCount) {
        this.BotIdRedirectCount = BotIdRedirectCount;
    }

    /**
     * Get 简易模式场景：人机识别动作的规则总数 
     * @return BotIdCaptchaCount 简易模式场景：人机识别动作的规则总数
     */
    public Long getBotIdCaptchaCount() {
        return this.BotIdCaptchaCount;
    }

    /**
     * Set 简易模式场景：人机识别动作的规则总数
     * @param BotIdCaptchaCount 简易模式场景：人机识别动作的规则总数
     */
    public void setBotIdCaptchaCount(Long BotIdCaptchaCount) {
        this.BotIdCaptchaCount = BotIdCaptchaCount;
    }

    /**
     * Get 简易模式场景：防护等级 
     * @return BotIdProtectLevel 简易模式场景：防护等级
     */
    public String getBotIdProtectLevel() {
        return this.BotIdProtectLevel;
    }

    /**
     * Set 简易模式场景：防护等级
     * @param BotIdProtectLevel 简易模式场景：防护等级
     */
    public void setBotIdProtectLevel(String BotIdProtectLevel) {
        this.BotIdProtectLevel = BotIdProtectLevel;
    }

    /**
     * Get 简易模式场景：全局重定向路径 
     * @return BotIdGlobalRedirect 简易模式场景：全局重定向路径
     */
    public String getBotIdGlobalRedirect() {
        return this.BotIdGlobalRedirect;
    }

    /**
     * Set 简易模式场景：全局重定向路径
     * @param BotIdGlobalRedirect 简易模式场景：全局重定向路径
     */
    public void setBotIdGlobalRedirect(String BotIdGlobalRedirect) {
        this.BotIdGlobalRedirect = BotIdGlobalRedirect;
    }

    /**
     * Get 简易模式场景：JS校验动作的规则总数 
     * @return BotIdJsChallengeCount 简易模式场景：JS校验动作的规则总数
     */
    public Long getBotIdJsChallengeCount() {
        return this.BotIdJsChallengeCount;
    }

    /**
     * Set 简易模式场景：JS校验动作的规则总数
     * @param BotIdJsChallengeCount 简易模式场景：JS校验动作的规则总数
     */
    public void setBotIdJsChallengeCount(Long BotIdJsChallengeCount) {
        this.BotIdJsChallengeCount = BotIdJsChallengeCount;
    }

    public BotSceneInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BotSceneInfo(BotSceneInfo source) {
        if (source.SceneId != null) {
            this.SceneId = new String(source.SceneId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.SceneName != null) {
            this.SceneName = new String(source.SceneName);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.BusinessType != null) {
            this.BusinessType = new String[source.BusinessType.length];
            for (int i = 0; i < source.BusinessType.length; i++) {
                this.BusinessType[i] = new String(source.BusinessType[i]);
            }
        }
        if (source.ClientType != null) {
            this.ClientType = new String[source.ClientType.length];
            for (int i = 0; i < source.ClientType.length; i++) {
                this.ClientType[i] = new String(source.ClientType[i]);
            }
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.MatchCondition != null) {
            this.MatchCondition = new BotSceneMatchCondition[source.MatchCondition.length];
            for (int i = 0; i < source.MatchCondition.length; i++) {
                this.MatchCondition[i] = new BotSceneMatchCondition(source.MatchCondition[i]);
            }
        }
        if (source.SceneStatus != null) {
            this.SceneStatus = new Boolean(source.SceneStatus);
        }
        if (source.JsInjectStatus != null) {
            this.JsInjectStatus = new Boolean(source.JsInjectStatus);
        }
        if (source.AIStatus != null) {
            this.AIStatus = new Boolean(source.AIStatus);
        }
        if (source.TIStatus != null) {
            this.TIStatus = new Boolean(source.TIStatus);
        }
        if (source.StatisticStatus != null) {
            this.StatisticStatus = new Boolean(source.StatisticStatus);
        }
        if (source.ActionRuleCount != null) {
            this.ActionRuleCount = new Long(source.ActionRuleCount);
        }
        if (source.UCBCount != null) {
            this.UCBCount = new Long(source.UCBCount);
        }
        if (source.MatchType != null) {
            this.MatchType = new String(source.MatchType);
        }
        if (source.ActionMatchType != null) {
            this.ActionMatchType = new String(source.ActionMatchType);
        }
        if (source.UAStatus != null) {
            this.UAStatus = new Boolean(source.UAStatus);
        }
        if (source.JsInjectRuleId != null) {
            this.JsInjectRuleId = new Long(source.JsInjectRuleId);
        }
        if (source.JsInjectAction != null) {
            this.JsInjectAction = new Long(source.JsInjectAction);
        }
        if (source.JsInjectRedirect != null) {
            this.JsInjectRedirect = new String(source.JsInjectRedirect);
        }
        if (source.ActionRuleList != null) {
            this.ActionRuleList = new BotSceneActionRule[source.ActionRuleList.length];
            for (int i = 0; i < source.ActionRuleList.length; i++) {
                this.ActionRuleList[i] = new BotSceneActionRule(source.ActionRuleList[i]);
            }
        }
        if (source.BotIdPattern != null) {
            this.BotIdPattern = new String(source.BotIdPattern);
        }
        if (source.BotIdCount != null) {
            this.BotIdCount = new Long(source.BotIdCount);
        }
        if (source.BotIdMonitorCount != null) {
            this.BotIdMonitorCount = new Long(source.BotIdMonitorCount);
        }
        if (source.BotIdInterceptCount != null) {
            this.BotIdInterceptCount = new Long(source.BotIdInterceptCount);
        }
        if (source.RuleSetSelection != null) {
            this.RuleSetSelection = new String[source.RuleSetSelection.length];
            for (int i = 0; i < source.RuleSetSelection.length; i++) {
                this.RuleSetSelection[i] = new String(source.RuleSetSelection[i]);
            }
        }
        if (source.TokenList != null) {
            this.TokenList = new BotToken[source.TokenList.length];
            for (int i = 0; i < source.TokenList.length; i++) {
                this.TokenList[i] = new BotToken(source.TokenList[i]);
            }
        }
        if (source.BotIdRedirectCount != null) {
            this.BotIdRedirectCount = new Long(source.BotIdRedirectCount);
        }
        if (source.BotIdCaptchaCount != null) {
            this.BotIdCaptchaCount = new Long(source.BotIdCaptchaCount);
        }
        if (source.BotIdProtectLevel != null) {
            this.BotIdProtectLevel = new String(source.BotIdProtectLevel);
        }
        if (source.BotIdGlobalRedirect != null) {
            this.BotIdGlobalRedirect = new String(source.BotIdGlobalRedirect);
        }
        if (source.BotIdJsChallengeCount != null) {
            this.BotIdJsChallengeCount = new Long(source.BotIdJsChallengeCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SceneId", this.SceneId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "SceneName", this.SceneName);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamArraySimple(map, prefix + "BusinessType.", this.BusinessType);
        this.setParamArraySimple(map, prefix + "ClientType.", this.ClientType);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamArrayObj(map, prefix + "MatchCondition.", this.MatchCondition);
        this.setParamSimple(map, prefix + "SceneStatus", this.SceneStatus);
        this.setParamSimple(map, prefix + "JsInjectStatus", this.JsInjectStatus);
        this.setParamSimple(map, prefix + "AIStatus", this.AIStatus);
        this.setParamSimple(map, prefix + "TIStatus", this.TIStatus);
        this.setParamSimple(map, prefix + "StatisticStatus", this.StatisticStatus);
        this.setParamSimple(map, prefix + "ActionRuleCount", this.ActionRuleCount);
        this.setParamSimple(map, prefix + "UCBCount", this.UCBCount);
        this.setParamSimple(map, prefix + "MatchType", this.MatchType);
        this.setParamSimple(map, prefix + "ActionMatchType", this.ActionMatchType);
        this.setParamSimple(map, prefix + "UAStatus", this.UAStatus);
        this.setParamSimple(map, prefix + "JsInjectRuleId", this.JsInjectRuleId);
        this.setParamSimple(map, prefix + "JsInjectAction", this.JsInjectAction);
        this.setParamSimple(map, prefix + "JsInjectRedirect", this.JsInjectRedirect);
        this.setParamArrayObj(map, prefix + "ActionRuleList.", this.ActionRuleList);
        this.setParamSimple(map, prefix + "BotIdPattern", this.BotIdPattern);
        this.setParamSimple(map, prefix + "BotIdCount", this.BotIdCount);
        this.setParamSimple(map, prefix + "BotIdMonitorCount", this.BotIdMonitorCount);
        this.setParamSimple(map, prefix + "BotIdInterceptCount", this.BotIdInterceptCount);
        this.setParamArraySimple(map, prefix + "RuleSetSelection.", this.RuleSetSelection);
        this.setParamArrayObj(map, prefix + "TokenList.", this.TokenList);
        this.setParamSimple(map, prefix + "BotIdRedirectCount", this.BotIdRedirectCount);
        this.setParamSimple(map, prefix + "BotIdCaptchaCount", this.BotIdCaptchaCount);
        this.setParamSimple(map, prefix + "BotIdProtectLevel", this.BotIdProtectLevel);
        this.setParamSimple(map, prefix + "BotIdGlobalRedirect", this.BotIdGlobalRedirect);
        this.setParamSimple(map, prefix + "BotIdJsChallengeCount", this.BotIdJsChallengeCount);

    }
}

