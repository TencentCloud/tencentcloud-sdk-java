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

public class ModifyLLMContentRuleRequest extends AbstractModel {

    /**
    * <p>名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>优先级</p>
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * <p>规则开关</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>检测范围，1：入向，2：出向，3：入向和出向</p>
    */
    @SerializedName("CheckType")
    @Expose
    private Long CheckType;

    /**
    * <p>检测内容匹配</p>
    */
    @SerializedName("RuleItem")
    @Expose
    private RuleItem [] RuleItem;

    /**
    * <p>匹配条件</p>
    */
    @SerializedName("Options")
    @Expose
    private LLMOptionsItem [] Options;

    /**
    * <p>域名</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>动作，观察monitor，拦截intercept</p>
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
    * <p>响应提示内容</p>
    */
    @SerializedName("ResponseText")
    @Expose
    private String ResponseText;

    /**
    * <p>规则需要启用的SessionID</p>
    */
    @SerializedName("SessionApplied")
    @Expose
    private String [] SessionApplied;

    /**
    * <p>规则ID，新增时填0</p>
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * <p>拦截页面id</p>
    */
    @SerializedName("PageId")
    @Expose
    private Long PageId;

    /**
    * <p>检测内容and or表达式,默认为and</p>
    */
    @SerializedName("ContentLogicalOp")
    @Expose
    private String ContentLogicalOp;

    /**
    * <p>实例id，必填项</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>代答类型：1-内置可信模型安全代答，2-自定义代答（ActionType=reply时生效</p><p>枚举值：</p><ul><li>1： 内置可信模型安全代答</li><li>2： 自定义代答ActionType=reply时生效</li></ul>
    */
    @SerializedName("ReplyType")
    @Expose
    private Long ReplyType;

    /**
    * <p>自定义回答模板</p>
    */
    @SerializedName("CustomReplyRuleId")
    @Expose
    private String CustomReplyRuleId;

    /**
    * <p>模态类型：0-文本（默认），1-图片</p><p>枚举值：</p><ul><li>0： 文本</li><li>1： 图片</li></ul>
    */
    @SerializedName("ModalType")
    @Expose
    private Long ModalType;

    /**
    * <p>规则类别：black-普通规则(默认)，white-白名单规则；空值按black处理。white时ActionType仅允许pass(放行)，RuleItem支持白名单匹配字段(Key: ip/geo/type/content/chat_id/user_id/tool_name/tool_args/keyword_whitelist；Op: belong/not_belong/equal/not_equal/contain/not_contain/prefix/suffix/wildcard)</p>
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * <p>白名单规则生效范围：多个serviceId/domain列表（Category=white时使用），表示该白名单规则同时生效于哪些域名/serviceId。黑名单规则不使用此字段。</p>
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * <p>加白生效模块type列表（Category=white时使用），表示该白名单规则命中后对哪些防护模块生效(放行)。取值：2-算力消耗规则，3-自定义防护规则，4-ToolCall防护，5-提示词攻击防护，6-内容合规检测，7-敏感数据检测。</p>
    */
    @SerializedName("AppliedModules")
    @Expose
    private Long [] AppliedModules;

    /**
     * Get <p>名称</p> 
     * @return Name <p>名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>名称</p>
     * @param Name <p>名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>优先级</p> 
     * @return Priority <p>优先级</p>
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set <p>优先级</p>
     * @param Priority <p>优先级</p>
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get <p>规则开关</p> 
     * @return Status <p>规则开关</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>规则开关</p>
     * @param Status <p>规则开关</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>检测范围，1：入向，2：出向，3：入向和出向</p> 
     * @return CheckType <p>检测范围，1：入向，2：出向，3：入向和出向</p>
     */
    public Long getCheckType() {
        return this.CheckType;
    }

    /**
     * Set <p>检测范围，1：入向，2：出向，3：入向和出向</p>
     * @param CheckType <p>检测范围，1：入向，2：出向，3：入向和出向</p>
     */
    public void setCheckType(Long CheckType) {
        this.CheckType = CheckType;
    }

    /**
     * Get <p>检测内容匹配</p> 
     * @return RuleItem <p>检测内容匹配</p>
     */
    public RuleItem [] getRuleItem() {
        return this.RuleItem;
    }

    /**
     * Set <p>检测内容匹配</p>
     * @param RuleItem <p>检测内容匹配</p>
     */
    public void setRuleItem(RuleItem [] RuleItem) {
        this.RuleItem = RuleItem;
    }

    /**
     * Get <p>匹配条件</p> 
     * @return Options <p>匹配条件</p>
     */
    public LLMOptionsItem [] getOptions() {
        return this.Options;
    }

    /**
     * Set <p>匹配条件</p>
     * @param Options <p>匹配条件</p>
     */
    public void setOptions(LLMOptionsItem [] Options) {
        this.Options = Options;
    }

    /**
     * Get <p>域名</p> 
     * @return Domain <p>域名</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>域名</p>
     * @param Domain <p>域名</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>动作，观察monitor，拦截intercept</p> 
     * @return ActionType <p>动作，观察monitor，拦截intercept</p>
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set <p>动作，观察monitor，拦截intercept</p>
     * @param ActionType <p>动作，观察monitor，拦截intercept</p>
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get <p>响应提示内容</p> 
     * @return ResponseText <p>响应提示内容</p>
     */
    public String getResponseText() {
        return this.ResponseText;
    }

    /**
     * Set <p>响应提示内容</p>
     * @param ResponseText <p>响应提示内容</p>
     */
    public void setResponseText(String ResponseText) {
        this.ResponseText = ResponseText;
    }

    /**
     * Get <p>规则需要启用的SessionID</p> 
     * @return SessionApplied <p>规则需要启用的SessionID</p>
     */
    public String [] getSessionApplied() {
        return this.SessionApplied;
    }

    /**
     * Set <p>规则需要启用的SessionID</p>
     * @param SessionApplied <p>规则需要启用的SessionID</p>
     */
    public void setSessionApplied(String [] SessionApplied) {
        this.SessionApplied = SessionApplied;
    }

    /**
     * Get <p>规则ID，新增时填0</p> 
     * @return RuleId <p>规则ID，新增时填0</p>
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set <p>规则ID，新增时填0</p>
     * @param RuleId <p>规则ID，新增时填0</p>
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get <p>拦截页面id</p> 
     * @return PageId <p>拦截页面id</p>
     */
    public Long getPageId() {
        return this.PageId;
    }

    /**
     * Set <p>拦截页面id</p>
     * @param PageId <p>拦截页面id</p>
     */
    public void setPageId(Long PageId) {
        this.PageId = PageId;
    }

    /**
     * Get <p>检测内容and or表达式,默认为and</p> 
     * @return ContentLogicalOp <p>检测内容and or表达式,默认为and</p>
     */
    public String getContentLogicalOp() {
        return this.ContentLogicalOp;
    }

    /**
     * Set <p>检测内容and or表达式,默认为and</p>
     * @param ContentLogicalOp <p>检测内容and or表达式,默认为and</p>
     */
    public void setContentLogicalOp(String ContentLogicalOp) {
        this.ContentLogicalOp = ContentLogicalOp;
    }

    /**
     * Get <p>实例id，必填项</p> 
     * @return InstanceId <p>实例id，必填项</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例id，必填项</p>
     * @param InstanceId <p>实例id，必填项</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>代答类型：1-内置可信模型安全代答，2-自定义代答（ActionType=reply时生效</p><p>枚举值：</p><ul><li>1： 内置可信模型安全代答</li><li>2： 自定义代答ActionType=reply时生效</li></ul> 
     * @return ReplyType <p>代答类型：1-内置可信模型安全代答，2-自定义代答（ActionType=reply时生效</p><p>枚举值：</p><ul><li>1： 内置可信模型安全代答</li><li>2： 自定义代答ActionType=reply时生效</li></ul>
     */
    public Long getReplyType() {
        return this.ReplyType;
    }

    /**
     * Set <p>代答类型：1-内置可信模型安全代答，2-自定义代答（ActionType=reply时生效</p><p>枚举值：</p><ul><li>1： 内置可信模型安全代答</li><li>2： 自定义代答ActionType=reply时生效</li></ul>
     * @param ReplyType <p>代答类型：1-内置可信模型安全代答，2-自定义代答（ActionType=reply时生效</p><p>枚举值：</p><ul><li>1： 内置可信模型安全代答</li><li>2： 自定义代答ActionType=reply时生效</li></ul>
     */
    public void setReplyType(Long ReplyType) {
        this.ReplyType = ReplyType;
    }

    /**
     * Get <p>自定义回答模板</p> 
     * @return CustomReplyRuleId <p>自定义回答模板</p>
     */
    public String getCustomReplyRuleId() {
        return this.CustomReplyRuleId;
    }

    /**
     * Set <p>自定义回答模板</p>
     * @param CustomReplyRuleId <p>自定义回答模板</p>
     */
    public void setCustomReplyRuleId(String CustomReplyRuleId) {
        this.CustomReplyRuleId = CustomReplyRuleId;
    }

    /**
     * Get <p>模态类型：0-文本（默认），1-图片</p><p>枚举值：</p><ul><li>0： 文本</li><li>1： 图片</li></ul> 
     * @return ModalType <p>模态类型：0-文本（默认），1-图片</p><p>枚举值：</p><ul><li>0： 文本</li><li>1： 图片</li></ul>
     */
    public Long getModalType() {
        return this.ModalType;
    }

    /**
     * Set <p>模态类型：0-文本（默认），1-图片</p><p>枚举值：</p><ul><li>0： 文本</li><li>1： 图片</li></ul>
     * @param ModalType <p>模态类型：0-文本（默认），1-图片</p><p>枚举值：</p><ul><li>0： 文本</li><li>1： 图片</li></ul>
     */
    public void setModalType(Long ModalType) {
        this.ModalType = ModalType;
    }

    /**
     * Get <p>规则类别：black-普通规则(默认)，white-白名单规则；空值按black处理。white时ActionType仅允许pass(放行)，RuleItem支持白名单匹配字段(Key: ip/geo/type/content/chat_id/user_id/tool_name/tool_args/keyword_whitelist；Op: belong/not_belong/equal/not_equal/contain/not_contain/prefix/suffix/wildcard)</p> 
     * @return Category <p>规则类别：black-普通规则(默认)，white-白名单规则；空值按black处理。white时ActionType仅允许pass(放行)，RuleItem支持白名单匹配字段(Key: ip/geo/type/content/chat_id/user_id/tool_name/tool_args/keyword_whitelist；Op: belong/not_belong/equal/not_equal/contain/not_contain/prefix/suffix/wildcard)</p>
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set <p>规则类别：black-普通规则(默认)，white-白名单规则；空值按black处理。white时ActionType仅允许pass(放行)，RuleItem支持白名单匹配字段(Key: ip/geo/type/content/chat_id/user_id/tool_name/tool_args/keyword_whitelist；Op: belong/not_belong/equal/not_equal/contain/not_contain/prefix/suffix/wildcard)</p>
     * @param Category <p>规则类别：black-普通规则(默认)，white-白名单规则；空值按black处理。white时ActionType仅允许pass(放行)，RuleItem支持白名单匹配字段(Key: ip/geo/type/content/chat_id/user_id/tool_name/tool_args/keyword_whitelist；Op: belong/not_belong/equal/not_equal/contain/not_contain/prefix/suffix/wildcard)</p>
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get <p>白名单规则生效范围：多个serviceId/domain列表（Category=white时使用），表示该白名单规则同时生效于哪些域名/serviceId。黑名单规则不使用此字段。</p> 
     * @return Domains <p>白名单规则生效范围：多个serviceId/domain列表（Category=white时使用），表示该白名单规则同时生效于哪些域名/serviceId。黑名单规则不使用此字段。</p>
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set <p>白名单规则生效范围：多个serviceId/domain列表（Category=white时使用），表示该白名单规则同时生效于哪些域名/serviceId。黑名单规则不使用此字段。</p>
     * @param Domains <p>白名单规则生效范围：多个serviceId/domain列表（Category=white时使用），表示该白名单规则同时生效于哪些域名/serviceId。黑名单规则不使用此字段。</p>
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get <p>加白生效模块type列表（Category=white时使用），表示该白名单规则命中后对哪些防护模块生效(放行)。取值：2-算力消耗规则，3-自定义防护规则，4-ToolCall防护，5-提示词攻击防护，6-内容合规检测，7-敏感数据检测。</p> 
     * @return AppliedModules <p>加白生效模块type列表（Category=white时使用），表示该白名单规则命中后对哪些防护模块生效(放行)。取值：2-算力消耗规则，3-自定义防护规则，4-ToolCall防护，5-提示词攻击防护，6-内容合规检测，7-敏感数据检测。</p>
     */
    public Long [] getAppliedModules() {
        return this.AppliedModules;
    }

    /**
     * Set <p>加白生效模块type列表（Category=white时使用），表示该白名单规则命中后对哪些防护模块生效(放行)。取值：2-算力消耗规则，3-自定义防护规则，4-ToolCall防护，5-提示词攻击防护，6-内容合规检测，7-敏感数据检测。</p>
     * @param AppliedModules <p>加白生效模块type列表（Category=white时使用），表示该白名单规则命中后对哪些防护模块生效(放行)。取值：2-算力消耗规则，3-自定义防护规则，4-ToolCall防护，5-提示词攻击防护，6-内容合规检测，7-敏感数据检测。</p>
     */
    public void setAppliedModules(Long [] AppliedModules) {
        this.AppliedModules = AppliedModules;
    }

    public ModifyLLMContentRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLLMContentRuleRequest(ModifyLLMContentRuleRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CheckType != null) {
            this.CheckType = new Long(source.CheckType);
        }
        if (source.RuleItem != null) {
            this.RuleItem = new RuleItem[source.RuleItem.length];
            for (int i = 0; i < source.RuleItem.length; i++) {
                this.RuleItem[i] = new RuleItem(source.RuleItem[i]);
            }
        }
        if (source.Options != null) {
            this.Options = new LLMOptionsItem[source.Options.length];
            for (int i = 0; i < source.Options.length; i++) {
                this.Options[i] = new LLMOptionsItem(source.Options[i]);
            }
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.ActionType != null) {
            this.ActionType = new String(source.ActionType);
        }
        if (source.ResponseText != null) {
            this.ResponseText = new String(source.ResponseText);
        }
        if (source.SessionApplied != null) {
            this.SessionApplied = new String[source.SessionApplied.length];
            for (int i = 0; i < source.SessionApplied.length; i++) {
                this.SessionApplied[i] = new String(source.SessionApplied[i]);
            }
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.PageId != null) {
            this.PageId = new Long(source.PageId);
        }
        if (source.ContentLogicalOp != null) {
            this.ContentLogicalOp = new String(source.ContentLogicalOp);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ReplyType != null) {
            this.ReplyType = new Long(source.ReplyType);
        }
        if (source.CustomReplyRuleId != null) {
            this.CustomReplyRuleId = new String(source.CustomReplyRuleId);
        }
        if (source.ModalType != null) {
            this.ModalType = new Long(source.ModalType);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
        if (source.AppliedModules != null) {
            this.AppliedModules = new Long[source.AppliedModules.length];
            for (int i = 0; i < source.AppliedModules.length; i++) {
                this.AppliedModules[i] = new Long(source.AppliedModules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CheckType", this.CheckType);
        this.setParamArrayObj(map, prefix + "RuleItem.", this.RuleItem);
        this.setParamArrayObj(map, prefix + "Options.", this.Options);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "ResponseText", this.ResponseText);
        this.setParamArraySimple(map, prefix + "SessionApplied.", this.SessionApplied);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "PageId", this.PageId);
        this.setParamSimple(map, prefix + "ContentLogicalOp", this.ContentLogicalOp);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ReplyType", this.ReplyType);
        this.setParamSimple(map, prefix + "CustomReplyRuleId", this.CustomReplyRuleId);
        this.setParamSimple(map, prefix + "ModalType", this.ModalType);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamArraySimple(map, prefix + "AppliedModules.", this.AppliedModules);

    }
}

