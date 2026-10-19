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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BashPolicy extends AbstractModel {

    /**
    * <p>策略名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>1:有效 0:无效</p>
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * <p>0:黑名单 1:白名单</p>
    */
    @SerializedName("White")
    @Expose
    private Long White;

    /**
    * <p>0:告警 1:白名单 2:拦截</p>
    */
    @SerializedName("BashAction")
    @Expose
    private Long BashAction;

    /**
    * <p>正则表达式 base64 加密,该字段废弃,如果写入则自动替换为Rules.Process.CmdLine</p>
    */
    @SerializedName("Rule")
    @Expose
    private String Rule;

    /**
    * <p>危险等级(0:无，1: 高危 2:中危 3: 低危)</p>
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * <p>生效范围（0:一组quuid 1:所有专业版(包含旗舰版) 2:所有旗舰版 3:所有主机）</p>
    */
    @SerializedName("Scope")
    @Expose
    private Long Scope;

    /**
    * <p>策略ID</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>策略描述</p>
    */
    @SerializedName("Descript")
    @Expose
    private String Descript;

    /**
    * <p>事件列表点击“加入白名单”时,需要传EventId 事件的id</p>
    */
    @SerializedName("EventId")
    @Expose
    private Long EventId;

    /**
    * <p>是否处理旧事件为白名单 0=不处理 1=处理</p>
    */
    @SerializedName("DealOldEvents")
    @Expose
    private Long DealOldEvents;

    /**
    * <p>生效主机的QUUID集合</p>
    */
    @SerializedName("Quuids")
    @Expose
    private String [] Quuids;

    /**
    * <p>策略类型，0:系统  1:用户</p>
    */
    @SerializedName("Category")
    @Expose
    private Long Category;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>修改时间</p>
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * <p>老版本兼容可能会用到</p>
    */
    @SerializedName("Uuids")
    @Expose
    private String [] Uuids;

    /**
    * <p>规则表达式</p>
    */
    @SerializedName("Rules")
    @Expose
    private PolicyRules Rules;

    /**
    * <p>匹配类型：0-命令行（默认） 1-文件操作</p>
    */
    @SerializedName("MatchType")
    @Expose
    private Long MatchType;

    /**
     * Get <p>策略名称</p> 
     * @return Name <p>策略名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>策略名称</p>
     * @param Name <p>策略名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>1:有效 0:无效</p> 
     * @return Enable <p>1:有效 0:无效</p>
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>1:有效 0:无效</p>
     * @param Enable <p>1:有效 0:无效</p>
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get <p>0:黑名单 1:白名单</p> 
     * @return White <p>0:黑名单 1:白名单</p>
     */
    public Long getWhite() {
        return this.White;
    }

    /**
     * Set <p>0:黑名单 1:白名单</p>
     * @param White <p>0:黑名单 1:白名单</p>
     */
    public void setWhite(Long White) {
        this.White = White;
    }

    /**
     * Get <p>0:告警 1:白名单 2:拦截</p> 
     * @return BashAction <p>0:告警 1:白名单 2:拦截</p>
     */
    public Long getBashAction() {
        return this.BashAction;
    }

    /**
     * Set <p>0:告警 1:白名单 2:拦截</p>
     * @param BashAction <p>0:告警 1:白名单 2:拦截</p>
     */
    public void setBashAction(Long BashAction) {
        this.BashAction = BashAction;
    }

    /**
     * Get <p>正则表达式 base64 加密,该字段废弃,如果写入则自动替换为Rules.Process.CmdLine</p> 
     * @return Rule <p>正则表达式 base64 加密,该字段废弃,如果写入则自动替换为Rules.Process.CmdLine</p>
     */
    public String getRule() {
        return this.Rule;
    }

    /**
     * Set <p>正则表达式 base64 加密,该字段废弃,如果写入则自动替换为Rules.Process.CmdLine</p>
     * @param Rule <p>正则表达式 base64 加密,该字段废弃,如果写入则自动替换为Rules.Process.CmdLine</p>
     */
    public void setRule(String Rule) {
        this.Rule = Rule;
    }

    /**
     * Get <p>危险等级(0:无，1: 高危 2:中危 3: 低危)</p> 
     * @return Level <p>危险等级(0:无，1: 高危 2:中危 3: 低危)</p>
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set <p>危险等级(0:无，1: 高危 2:中危 3: 低危)</p>
     * @param Level <p>危险等级(0:无，1: 高危 2:中危 3: 低危)</p>
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get <p>生效范围（0:一组quuid 1:所有专业版(包含旗舰版) 2:所有旗舰版 3:所有主机）</p> 
     * @return Scope <p>生效范围（0:一组quuid 1:所有专业版(包含旗舰版) 2:所有旗舰版 3:所有主机）</p>
     */
    public Long getScope() {
        return this.Scope;
    }

    /**
     * Set <p>生效范围（0:一组quuid 1:所有专业版(包含旗舰版) 2:所有旗舰版 3:所有主机）</p>
     * @param Scope <p>生效范围（0:一组quuid 1:所有专业版(包含旗舰版) 2:所有旗舰版 3:所有主机）</p>
     */
    public void setScope(Long Scope) {
        this.Scope = Scope;
    }

    /**
     * Get <p>策略ID</p> 
     * @return Id <p>策略ID</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>策略ID</p>
     * @param Id <p>策略ID</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>策略描述</p> 
     * @return Descript <p>策略描述</p>
     */
    public String getDescript() {
        return this.Descript;
    }

    /**
     * Set <p>策略描述</p>
     * @param Descript <p>策略描述</p>
     */
    public void setDescript(String Descript) {
        this.Descript = Descript;
    }

    /**
     * Get <p>事件列表点击“加入白名单”时,需要传EventId 事件的id</p> 
     * @return EventId <p>事件列表点击“加入白名单”时,需要传EventId 事件的id</p>
     */
    public Long getEventId() {
        return this.EventId;
    }

    /**
     * Set <p>事件列表点击“加入白名单”时,需要传EventId 事件的id</p>
     * @param EventId <p>事件列表点击“加入白名单”时,需要传EventId 事件的id</p>
     */
    public void setEventId(Long EventId) {
        this.EventId = EventId;
    }

    /**
     * Get <p>是否处理旧事件为白名单 0=不处理 1=处理</p> 
     * @return DealOldEvents <p>是否处理旧事件为白名单 0=不处理 1=处理</p>
     */
    public Long getDealOldEvents() {
        return this.DealOldEvents;
    }

    /**
     * Set <p>是否处理旧事件为白名单 0=不处理 1=处理</p>
     * @param DealOldEvents <p>是否处理旧事件为白名单 0=不处理 1=处理</p>
     */
    public void setDealOldEvents(Long DealOldEvents) {
        this.DealOldEvents = DealOldEvents;
    }

    /**
     * Get <p>生效主机的QUUID集合</p> 
     * @return Quuids <p>生效主机的QUUID集合</p>
     */
    public String [] getQuuids() {
        return this.Quuids;
    }

    /**
     * Set <p>生效主机的QUUID集合</p>
     * @param Quuids <p>生效主机的QUUID集合</p>
     */
    public void setQuuids(String [] Quuids) {
        this.Quuids = Quuids;
    }

    /**
     * Get <p>策略类型，0:系统  1:用户</p> 
     * @return Category <p>策略类型，0:系统  1:用户</p>
     */
    public Long getCategory() {
        return this.Category;
    }

    /**
     * Set <p>策略类型，0:系统  1:用户</p>
     * @param Category <p>策略类型，0:系统  1:用户</p>
     */
    public void setCategory(Long Category) {
        this.Category = Category;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>修改时间</p> 
     * @return ModifyTime <p>修改时间</p>
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set <p>修改时间</p>
     * @param ModifyTime <p>修改时间</p>
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get <p>老版本兼容可能会用到</p> 
     * @return Uuids <p>老版本兼容可能会用到</p>
     */
    public String [] getUuids() {
        return this.Uuids;
    }

    /**
     * Set <p>老版本兼容可能会用到</p>
     * @param Uuids <p>老版本兼容可能会用到</p>
     */
    public void setUuids(String [] Uuids) {
        this.Uuids = Uuids;
    }

    /**
     * Get <p>规则表达式</p> 
     * @return Rules <p>规则表达式</p>
     */
    public PolicyRules getRules() {
        return this.Rules;
    }

    /**
     * Set <p>规则表达式</p>
     * @param Rules <p>规则表达式</p>
     */
    public void setRules(PolicyRules Rules) {
        this.Rules = Rules;
    }

    /**
     * Get <p>匹配类型：0-命令行（默认） 1-文件操作</p> 
     * @return MatchType <p>匹配类型：0-命令行（默认） 1-文件操作</p>
     */
    public Long getMatchType() {
        return this.MatchType;
    }

    /**
     * Set <p>匹配类型：0-命令行（默认） 1-文件操作</p>
     * @param MatchType <p>匹配类型：0-命令行（默认） 1-文件操作</p>
     */
    public void setMatchType(Long MatchType) {
        this.MatchType = MatchType;
    }

    public BashPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BashPolicy(BashPolicy source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.White != null) {
            this.White = new Long(source.White);
        }
        if (source.BashAction != null) {
            this.BashAction = new Long(source.BashAction);
        }
        if (source.Rule != null) {
            this.Rule = new String(source.Rule);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.Scope != null) {
            this.Scope = new Long(source.Scope);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Descript != null) {
            this.Descript = new String(source.Descript);
        }
        if (source.EventId != null) {
            this.EventId = new Long(source.EventId);
        }
        if (source.DealOldEvents != null) {
            this.DealOldEvents = new Long(source.DealOldEvents);
        }
        if (source.Quuids != null) {
            this.Quuids = new String[source.Quuids.length];
            for (int i = 0; i < source.Quuids.length; i++) {
                this.Quuids[i] = new String(source.Quuids[i]);
            }
        }
        if (source.Category != null) {
            this.Category = new Long(source.Category);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.Uuids != null) {
            this.Uuids = new String[source.Uuids.length];
            for (int i = 0; i < source.Uuids.length; i++) {
                this.Uuids[i] = new String(source.Uuids[i]);
            }
        }
        if (source.Rules != null) {
            this.Rules = new PolicyRules(source.Rules);
        }
        if (source.MatchType != null) {
            this.MatchType = new Long(source.MatchType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "White", this.White);
        this.setParamSimple(map, prefix + "BashAction", this.BashAction);
        this.setParamSimple(map, prefix + "Rule", this.Rule);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Descript", this.Descript);
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "DealOldEvents", this.DealOldEvents);
        this.setParamArraySimple(map, prefix + "Quuids.", this.Quuids);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamArraySimple(map, prefix + "Uuids.", this.Uuids);
        this.setParamObj(map, prefix + "Rules.", this.Rules);
        this.setParamSimple(map, prefix + "MatchType", this.MatchType);

    }
}

