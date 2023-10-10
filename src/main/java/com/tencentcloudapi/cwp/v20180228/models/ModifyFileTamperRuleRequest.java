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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyFileTamperRuleRequest extends AbstractModel{

    /**
    * 规则名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 规则内容
    */
    @SerializedName("Rules")
    @Expose
    private FileTamperRule [] Rules;

    /**
    * 是否全局规则(默认否) 0：否 ，1：是，全局是Uuids 可为空
    */
    @SerializedName("IsGlobal")
    @Expose
    private Long IsGlobal;

    /**
    * 启用状态 0: 启用 1: 已关闭
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 规则id  不填或者0表示新增
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 影响的主机uuid集合
    */
    @SerializedName("Uuids")
    @Expose
    private String [] Uuids;

    /**
    * 风险等级 0：无， 1: 高危， 2:中危， 3: 低危
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 加白处理类型
<li>cur 仅对当前加白</li>
<li>all 所有符合条件加白</li>
    */
    @SerializedName("AddWhiteType")
    @Expose
    private String AddWhiteType;

    /**
     * Get 规则名称 
     * @return Name 规则名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 规则名称
     * @param Name 规则名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 规则内容 
     * @return Rules 规则内容
     */
    public FileTamperRule [] getRules() {
        return this.Rules;
    }

    /**
     * Set 规则内容
     * @param Rules 规则内容
     */
    public void setRules(FileTamperRule [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Get 是否全局规则(默认否) 0：否 ，1：是，全局是Uuids 可为空 
     * @return IsGlobal 是否全局规则(默认否) 0：否 ，1：是，全局是Uuids 可为空
     */
    public Long getIsGlobal() {
        return this.IsGlobal;
    }

    /**
     * Set 是否全局规则(默认否) 0：否 ，1：是，全局是Uuids 可为空
     * @param IsGlobal 是否全局规则(默认否) 0：否 ，1：是，全局是Uuids 可为空
     */
    public void setIsGlobal(Long IsGlobal) {
        this.IsGlobal = IsGlobal;
    }

    /**
     * Get 启用状态 0: 启用 1: 已关闭 
     * @return Status 启用状态 0: 启用 1: 已关闭
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 启用状态 0: 启用 1: 已关闭
     * @param Status 启用状态 0: 启用 1: 已关闭
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 规则id  不填或者0表示新增 
     * @return Id 规则id  不填或者0表示新增
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 规则id  不填或者0表示新增
     * @param Id 规则id  不填或者0表示新增
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 影响的主机uuid集合 
     * @return Uuids 影响的主机uuid集合
     */
    public String [] getUuids() {
        return this.Uuids;
    }

    /**
     * Set 影响的主机uuid集合
     * @param Uuids 影响的主机uuid集合
     */
    public void setUuids(String [] Uuids) {
        this.Uuids = Uuids;
    }

    /**
     * Get 风险等级 0：无， 1: 高危， 2:中危， 3: 低危 
     * @return Level 风险等级 0：无， 1: 高危， 2:中危， 3: 低危
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 风险等级 0：无， 1: 高危， 2:中危， 3: 低危
     * @param Level 风险等级 0：无， 1: 高危， 2:中危， 3: 低危
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 加白处理类型
<li>cur 仅对当前加白</li>
<li>all 所有符合条件加白</li> 
     * @return AddWhiteType 加白处理类型
<li>cur 仅对当前加白</li>
<li>all 所有符合条件加白</li>
     */
    public String getAddWhiteType() {
        return this.AddWhiteType;
    }

    /**
     * Set 加白处理类型
<li>cur 仅对当前加白</li>
<li>all 所有符合条件加白</li>
     * @param AddWhiteType 加白处理类型
<li>cur 仅对当前加白</li>
<li>all 所有符合条件加白</li>
     */
    public void setAddWhiteType(String AddWhiteType) {
        this.AddWhiteType = AddWhiteType;
    }

    public ModifyFileTamperRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyFileTamperRuleRequest(ModifyFileTamperRuleRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Rules != null) {
            this.Rules = new FileTamperRule[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new FileTamperRule(source.Rules[i]);
            }
        }
        if (source.IsGlobal != null) {
            this.IsGlobal = new Long(source.IsGlobal);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Uuids != null) {
            this.Uuids = new String[source.Uuids.length];
            for (int i = 0; i < source.Uuids.length; i++) {
                this.Uuids[i] = new String(source.Uuids[i]);
            }
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.AddWhiteType != null) {
            this.AddWhiteType = new String(source.AddWhiteType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);
        this.setParamSimple(map, prefix + "IsGlobal", this.IsGlobal);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArraySimple(map, prefix + "Uuids.", this.Uuids);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "AddWhiteType", this.AddWhiteType);

    }
}

