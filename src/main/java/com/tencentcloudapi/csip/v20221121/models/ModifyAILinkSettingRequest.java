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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAILinkSettingRequest extends AbstractModel {

    /**
    * <p>0 关闭AI-Link智链引擎，1 开启AI-Link智链引擎</p>
    */
    @SerializedName("AILinkEnable")
    @Expose
    private Long AILinkEnable;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>深度模式 0-关闭 1-开启</p>
    */
    @SerializedName("RuleScopeDeep")
    @Expose
    private Long RuleScopeDeep;

    /**
    * <p>均衡模式 0-关闭 1-开启</p>
    */
    @SerializedName("RuleScopeBalanced")
    @Expose
    private Long RuleScopeBalanced;

    /**
    * <p>精准模式 0-关闭 1-开启</p>
    */
    @SerializedName("RuleScopePrecise")
    @Expose
    private Long RuleScopePrecise;

    /**
    * <p>1 全部专业/旗舰版主机，0 自选主机列表</p>
    */
    @SerializedName("Scope")
    @Expose
    private Long Scope;

    /**
    * <p>自选主机Quuid列表（Scope=0时必填）</p>
    */
    @SerializedName("Quuids")
    @Expose
    private String [] Quuids;

    /**
    * <p>排除主机Quuid列表（Scope=1时生效）</p>
    */
    @SerializedName("ExcludeQuuids")
    @Expose
    private String [] ExcludeQuuids;

    /**
    * <p>新增资产自动包含 0 不包含 1包含</p>
    */
    @SerializedName("AutoInclude")
    @Expose
    private Long AutoInclude;

    /**
     * Get <p>0 关闭AI-Link智链引擎，1 开启AI-Link智链引擎</p> 
     * @return AILinkEnable <p>0 关闭AI-Link智链引擎，1 开启AI-Link智链引擎</p>
     */
    public Long getAILinkEnable() {
        return this.AILinkEnable;
    }

    /**
     * Set <p>0 关闭AI-Link智链引擎，1 开启AI-Link智链引擎</p>
     * @param AILinkEnable <p>0 关闭AI-Link智链引擎，1 开启AI-Link智链引擎</p>
     */
    public void setAILinkEnable(Long AILinkEnable) {
        this.AILinkEnable = AILinkEnable;
    }

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>深度模式 0-关闭 1-开启</p> 
     * @return RuleScopeDeep <p>深度模式 0-关闭 1-开启</p>
     */
    public Long getRuleScopeDeep() {
        return this.RuleScopeDeep;
    }

    /**
     * Set <p>深度模式 0-关闭 1-开启</p>
     * @param RuleScopeDeep <p>深度模式 0-关闭 1-开启</p>
     */
    public void setRuleScopeDeep(Long RuleScopeDeep) {
        this.RuleScopeDeep = RuleScopeDeep;
    }

    /**
     * Get <p>均衡模式 0-关闭 1-开启</p> 
     * @return RuleScopeBalanced <p>均衡模式 0-关闭 1-开启</p>
     */
    public Long getRuleScopeBalanced() {
        return this.RuleScopeBalanced;
    }

    /**
     * Set <p>均衡模式 0-关闭 1-开启</p>
     * @param RuleScopeBalanced <p>均衡模式 0-关闭 1-开启</p>
     */
    public void setRuleScopeBalanced(Long RuleScopeBalanced) {
        this.RuleScopeBalanced = RuleScopeBalanced;
    }

    /**
     * Get <p>精准模式 0-关闭 1-开启</p> 
     * @return RuleScopePrecise <p>精准模式 0-关闭 1-开启</p>
     */
    public Long getRuleScopePrecise() {
        return this.RuleScopePrecise;
    }

    /**
     * Set <p>精准模式 0-关闭 1-开启</p>
     * @param RuleScopePrecise <p>精准模式 0-关闭 1-开启</p>
     */
    public void setRuleScopePrecise(Long RuleScopePrecise) {
        this.RuleScopePrecise = RuleScopePrecise;
    }

    /**
     * Get <p>1 全部专业/旗舰版主机，0 自选主机列表</p> 
     * @return Scope <p>1 全部专业/旗舰版主机，0 自选主机列表</p>
     */
    public Long getScope() {
        return this.Scope;
    }

    /**
     * Set <p>1 全部专业/旗舰版主机，0 自选主机列表</p>
     * @param Scope <p>1 全部专业/旗舰版主机，0 自选主机列表</p>
     */
    public void setScope(Long Scope) {
        this.Scope = Scope;
    }

    /**
     * Get <p>自选主机Quuid列表（Scope=0时必填）</p> 
     * @return Quuids <p>自选主机Quuid列表（Scope=0时必填）</p>
     */
    public String [] getQuuids() {
        return this.Quuids;
    }

    /**
     * Set <p>自选主机Quuid列表（Scope=0时必填）</p>
     * @param Quuids <p>自选主机Quuid列表（Scope=0时必填）</p>
     */
    public void setQuuids(String [] Quuids) {
        this.Quuids = Quuids;
    }

    /**
     * Get <p>排除主机Quuid列表（Scope=1时生效）</p> 
     * @return ExcludeQuuids <p>排除主机Quuid列表（Scope=1时生效）</p>
     */
    public String [] getExcludeQuuids() {
        return this.ExcludeQuuids;
    }

    /**
     * Set <p>排除主机Quuid列表（Scope=1时生效）</p>
     * @param ExcludeQuuids <p>排除主机Quuid列表（Scope=1时生效）</p>
     */
    public void setExcludeQuuids(String [] ExcludeQuuids) {
        this.ExcludeQuuids = ExcludeQuuids;
    }

    /**
     * Get <p>新增资产自动包含 0 不包含 1包含</p> 
     * @return AutoInclude <p>新增资产自动包含 0 不包含 1包含</p>
     */
    public Long getAutoInclude() {
        return this.AutoInclude;
    }

    /**
     * Set <p>新增资产自动包含 0 不包含 1包含</p>
     * @param AutoInclude <p>新增资产自动包含 0 不包含 1包含</p>
     */
    public void setAutoInclude(Long AutoInclude) {
        this.AutoInclude = AutoInclude;
    }

    public ModifyAILinkSettingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAILinkSettingRequest(ModifyAILinkSettingRequest source) {
        if (source.AILinkEnable != null) {
            this.AILinkEnable = new Long(source.AILinkEnable);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.RuleScopeDeep != null) {
            this.RuleScopeDeep = new Long(source.RuleScopeDeep);
        }
        if (source.RuleScopeBalanced != null) {
            this.RuleScopeBalanced = new Long(source.RuleScopeBalanced);
        }
        if (source.RuleScopePrecise != null) {
            this.RuleScopePrecise = new Long(source.RuleScopePrecise);
        }
        if (source.Scope != null) {
            this.Scope = new Long(source.Scope);
        }
        if (source.Quuids != null) {
            this.Quuids = new String[source.Quuids.length];
            for (int i = 0; i < source.Quuids.length; i++) {
                this.Quuids[i] = new String(source.Quuids[i]);
            }
        }
        if (source.ExcludeQuuids != null) {
            this.ExcludeQuuids = new String[source.ExcludeQuuids.length];
            for (int i = 0; i < source.ExcludeQuuids.length; i++) {
                this.ExcludeQuuids[i] = new String(source.ExcludeQuuids[i]);
            }
        }
        if (source.AutoInclude != null) {
            this.AutoInclude = new Long(source.AutoInclude);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AILinkEnable", this.AILinkEnable);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "RuleScopeDeep", this.RuleScopeDeep);
        this.setParamSimple(map, prefix + "RuleScopeBalanced", this.RuleScopeBalanced);
        this.setParamSimple(map, prefix + "RuleScopePrecise", this.RuleScopePrecise);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamArraySimple(map, prefix + "Quuids.", this.Quuids);
        this.setParamArraySimple(map, prefix + "ExcludeQuuids.", this.ExcludeQuuids);
        this.setParamSimple(map, prefix + "AutoInclude", this.AutoInclude);

    }
}

