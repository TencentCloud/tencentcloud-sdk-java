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

public class WebHookRuleDetail extends AbstractModel {

    /**
    * 规则名称
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 机器人地址
    */
    @SerializedName("HookAddr")
    @Expose
    private String HookAddr;

    /**
    * 事件类型
    */
    @SerializedName("RuleItems")
    @Expose
    private WebHookEventKv [] RuleItems;

    /**
    * 规则Id
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 备注信息
    */
    @SerializedName("RuleRemark")
    @Expose
    private String RuleRemark;

    /**
    * 主机范围
    */
    @SerializedName("HostLabels")
    @Expose
    private WebHookHostLabel [] HostLabels;

    /**
    * 主机Id列表
    */
    @SerializedName("HostIds")
    @Expose
    private String [] HostIds;

    /**
    * 是否启用[1:禁用|0:启用]
    */
    @SerializedName("IsDisabled")
    @Expose
    private Long IsDisabled;

    /**
     * Get 规则名称 
     * @return RuleName 规则名称
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 规则名称
     * @param RuleName 规则名称
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 机器人地址 
     * @return HookAddr 机器人地址
     */
    public String getHookAddr() {
        return this.HookAddr;
    }

    /**
     * Set 机器人地址
     * @param HookAddr 机器人地址
     */
    public void setHookAddr(String HookAddr) {
        this.HookAddr = HookAddr;
    }

    /**
     * Get 事件类型 
     * @return RuleItems 事件类型
     */
    public WebHookEventKv [] getRuleItems() {
        return this.RuleItems;
    }

    /**
     * Set 事件类型
     * @param RuleItems 事件类型
     */
    public void setRuleItems(WebHookEventKv [] RuleItems) {
        this.RuleItems = RuleItems;
    }

    /**
     * Get 规则Id 
     * @return RuleId 规则Id
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则Id
     * @param RuleId 规则Id
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 备注信息 
     * @return RuleRemark 备注信息
     */
    public String getRuleRemark() {
        return this.RuleRemark;
    }

    /**
     * Set 备注信息
     * @param RuleRemark 备注信息
     */
    public void setRuleRemark(String RuleRemark) {
        this.RuleRemark = RuleRemark;
    }

    /**
     * Get 主机范围 
     * @return HostLabels 主机范围
     */
    public WebHookHostLabel [] getHostLabels() {
        return this.HostLabels;
    }

    /**
     * Set 主机范围
     * @param HostLabels 主机范围
     */
    public void setHostLabels(WebHookHostLabel [] HostLabels) {
        this.HostLabels = HostLabels;
    }

    /**
     * Get 主机Id列表 
     * @return HostIds 主机Id列表
     */
    public String [] getHostIds() {
        return this.HostIds;
    }

    /**
     * Set 主机Id列表
     * @param HostIds 主机Id列表
     */
    public void setHostIds(String [] HostIds) {
        this.HostIds = HostIds;
    }

    /**
     * Get 是否启用[1:禁用|0:启用] 
     * @return IsDisabled 是否启用[1:禁用|0:启用]
     */
    public Long getIsDisabled() {
        return this.IsDisabled;
    }

    /**
     * Set 是否启用[1:禁用|0:启用]
     * @param IsDisabled 是否启用[1:禁用|0:启用]
     */
    public void setIsDisabled(Long IsDisabled) {
        this.IsDisabled = IsDisabled;
    }

    public WebHookRuleDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WebHookRuleDetail(WebHookRuleDetail source) {
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.HookAddr != null) {
            this.HookAddr = new String(source.HookAddr);
        }
        if (source.RuleItems != null) {
            this.RuleItems = new WebHookEventKv[source.RuleItems.length];
            for (int i = 0; i < source.RuleItems.length; i++) {
                this.RuleItems[i] = new WebHookEventKv(source.RuleItems[i]);
            }
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.RuleRemark != null) {
            this.RuleRemark = new String(source.RuleRemark);
        }
        if (source.HostLabels != null) {
            this.HostLabels = new WebHookHostLabel[source.HostLabels.length];
            for (int i = 0; i < source.HostLabels.length; i++) {
                this.HostLabels[i] = new WebHookHostLabel(source.HostLabels[i]);
            }
        }
        if (source.HostIds != null) {
            this.HostIds = new String[source.HostIds.length];
            for (int i = 0; i < source.HostIds.length; i++) {
                this.HostIds[i] = new String(source.HostIds[i]);
            }
        }
        if (source.IsDisabled != null) {
            this.IsDisabled = new Long(source.IsDisabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "HookAddr", this.HookAddr);
        this.setParamArrayObj(map, prefix + "RuleItems.", this.RuleItems);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleRemark", this.RuleRemark);
        this.setParamArrayObj(map, prefix + "HostLabels.", this.HostLabels);
        this.setParamArraySimple(map, prefix + "HostIds.", this.HostIds);
        this.setParamSimple(map, prefix + "IsDisabled", this.IsDisabled);

    }
}

