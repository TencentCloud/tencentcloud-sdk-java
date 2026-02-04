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

public class DescribeBotSceneUCBRuleRequest extends AbstractModel {

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 翻页组件的起始页
    */
    @SerializedName("Skip")
    @Expose
    private Long Skip;

    /**
    * 翻页组件的页数据条数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 排序参数
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * 1.BOT全局白名单处调用时，传"global";2.BOT场景配置处调用时，传具体的场景ID
    */
    @SerializedName("SceneId")
    @Expose
    private String SceneId;

    /**
    * 需要过滤的动作
    */
    @SerializedName("Operate")
    @Expose
    private String Operate;

    /**
    * 需要过滤的规则名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 兼容老数据和新旧版前端
    */
    @SerializedName("VersionFlag")
    @Expose
    private String VersionFlag;

    /**
    * 生效方式：0-全部 1-永久生效 2-定时生效 3-周粒度生效 4-月粒度生效
    */
    @SerializedName("TimerType")
    @Expose
    private Long TimerType;

    /**
    * 0-全部 1-生效中 2-已过期
    */
    @SerializedName("ValidStatus")
    @Expose
    private Long ValidStatus;

    /**
    * 规则id
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * batch表示批量规则、scene表示场景规则，不传表示全部
    */
    @SerializedName("Source")
    @Expose
    private String Source;

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
     * Get 翻页组件的起始页 
     * @return Skip 翻页组件的起始页
     */
    public Long getSkip() {
        return this.Skip;
    }

    /**
     * Set 翻页组件的起始页
     * @param Skip 翻页组件的起始页
     */
    public void setSkip(Long Skip) {
        this.Skip = Skip;
    }

    /**
     * Get 翻页组件的页数据条数 
     * @return Limit 翻页组件的页数据条数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 翻页组件的页数据条数
     * @param Limit 翻页组件的页数据条数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 排序参数 
     * @return Sort 排序参数
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set 排序参数
     * @param Sort 排序参数
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    /**
     * Get 1.BOT全局白名单处调用时，传"global";2.BOT场景配置处调用时，传具体的场景ID 
     * @return SceneId 1.BOT全局白名单处调用时，传"global";2.BOT场景配置处调用时，传具体的场景ID
     */
    public String getSceneId() {
        return this.SceneId;
    }

    /**
     * Set 1.BOT全局白名单处调用时，传"global";2.BOT场景配置处调用时，传具体的场景ID
     * @param SceneId 1.BOT全局白名单处调用时，传"global";2.BOT场景配置处调用时，传具体的场景ID
     */
    public void setSceneId(String SceneId) {
        this.SceneId = SceneId;
    }

    /**
     * Get 需要过滤的动作 
     * @return Operate 需要过滤的动作
     */
    public String getOperate() {
        return this.Operate;
    }

    /**
     * Set 需要过滤的动作
     * @param Operate 需要过滤的动作
     */
    public void setOperate(String Operate) {
        this.Operate = Operate;
    }

    /**
     * Get 需要过滤的规则名称 
     * @return Name 需要过滤的规则名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 需要过滤的规则名称
     * @param Name 需要过滤的规则名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 兼容老数据和新旧版前端 
     * @return VersionFlag 兼容老数据和新旧版前端
     */
    public String getVersionFlag() {
        return this.VersionFlag;
    }

    /**
     * Set 兼容老数据和新旧版前端
     * @param VersionFlag 兼容老数据和新旧版前端
     */
    public void setVersionFlag(String VersionFlag) {
        this.VersionFlag = VersionFlag;
    }

    /**
     * Get 生效方式：0-全部 1-永久生效 2-定时生效 3-周粒度生效 4-月粒度生效 
     * @return TimerType 生效方式：0-全部 1-永久生效 2-定时生效 3-周粒度生效 4-月粒度生效
     */
    public Long getTimerType() {
        return this.TimerType;
    }

    /**
     * Set 生效方式：0-全部 1-永久生效 2-定时生效 3-周粒度生效 4-月粒度生效
     * @param TimerType 生效方式：0-全部 1-永久生效 2-定时生效 3-周粒度生效 4-月粒度生效
     */
    public void setTimerType(Long TimerType) {
        this.TimerType = TimerType;
    }

    /**
     * Get 0-全部 1-生效中 2-已过期 
     * @return ValidStatus 0-全部 1-生效中 2-已过期
     */
    public Long getValidStatus() {
        return this.ValidStatus;
    }

    /**
     * Set 0-全部 1-生效中 2-已过期
     * @param ValidStatus 0-全部 1-生效中 2-已过期
     */
    public void setValidStatus(Long ValidStatus) {
        this.ValidStatus = ValidStatus;
    }

    /**
     * Get 规则id 
     * @return RuleId 规则id
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则id
     * @param RuleId 规则id
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get batch表示批量规则、scene表示场景规则，不传表示全部 
     * @return Source batch表示批量规则、scene表示场景规则，不传表示全部
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set batch表示批量规则、scene表示场景规则，不传表示全部
     * @param Source batch表示批量规则、scene表示场景规则，不传表示全部
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    public DescribeBotSceneUCBRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBotSceneUCBRuleRequest(DescribeBotSceneUCBRuleRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Skip != null) {
            this.Skip = new Long(source.Skip);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
        if (source.SceneId != null) {
            this.SceneId = new String(source.SceneId);
        }
        if (source.Operate != null) {
            this.Operate = new String(source.Operate);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.VersionFlag != null) {
            this.VersionFlag = new String(source.VersionFlag);
        }
        if (source.TimerType != null) {
            this.TimerType = new Long(source.TimerType);
        }
        if (source.ValidStatus != null) {
            this.ValidStatus = new Long(source.ValidStatus);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Skip", this.Skip);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "SceneId", this.SceneId);
        this.setParamSimple(map, prefix + "Operate", this.Operate);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "VersionFlag", this.VersionFlag);
        this.setParamSimple(map, prefix + "TimerType", this.TimerType);
        this.setParamSimple(map, prefix + "ValidStatus", this.ValidStatus);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Source", this.Source);

    }
}

