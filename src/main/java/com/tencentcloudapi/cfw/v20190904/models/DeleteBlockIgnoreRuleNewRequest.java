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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteBlockIgnoreRuleNewRequest extends AbstractModel {

    /**
    * 是否删除全部
    */
    @SerializedName("DeleteAll")
    @Expose
    private Long DeleteAll;

    /**
    * 规则列表
    */
    @SerializedName("Rules")
    @Expose
    private BanAndAllowRuleDel [] Rules;

    /**
    * 封禁：1，放通：100，
主要用于全部删除时区分列表类型
    */
    @SerializedName("RuleType")
    @Expose
    private Long RuleType;

    /**
    * blocklist 封禁列表 whitelist 白名单列表
    */
    @SerializedName("ShowType")
    @Expose
    private String ShowType;

    /**
     * Get 是否删除全部 
     * @return DeleteAll 是否删除全部
     */
    public Long getDeleteAll() {
        return this.DeleteAll;
    }

    /**
     * Set 是否删除全部
     * @param DeleteAll 是否删除全部
     */
    public void setDeleteAll(Long DeleteAll) {
        this.DeleteAll = DeleteAll;
    }

    /**
     * Get 规则列表 
     * @return Rules 规则列表
     */
    public BanAndAllowRuleDel [] getRules() {
        return this.Rules;
    }

    /**
     * Set 规则列表
     * @param Rules 规则列表
     */
    public void setRules(BanAndAllowRuleDel [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Get 封禁：1，放通：100，
主要用于全部删除时区分列表类型 
     * @return RuleType 封禁：1，放通：100，
主要用于全部删除时区分列表类型
     */
    public Long getRuleType() {
        return this.RuleType;
    }

    /**
     * Set 封禁：1，放通：100，
主要用于全部删除时区分列表类型
     * @param RuleType 封禁：1，放通：100，
主要用于全部删除时区分列表类型
     */
    public void setRuleType(Long RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get blocklist 封禁列表 whitelist 白名单列表 
     * @return ShowType blocklist 封禁列表 whitelist 白名单列表
     */
    public String getShowType() {
        return this.ShowType;
    }

    /**
     * Set blocklist 封禁列表 whitelist 白名单列表
     * @param ShowType blocklist 封禁列表 whitelist 白名单列表
     */
    public void setShowType(String ShowType) {
        this.ShowType = ShowType;
    }

    public DeleteBlockIgnoreRuleNewRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteBlockIgnoreRuleNewRequest(DeleteBlockIgnoreRuleNewRequest source) {
        if (source.DeleteAll != null) {
            this.DeleteAll = new Long(source.DeleteAll);
        }
        if (source.Rules != null) {
            this.Rules = new BanAndAllowRuleDel[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new BanAndAllowRuleDel(source.Rules[i]);
            }
        }
        if (source.RuleType != null) {
            this.RuleType = new Long(source.RuleType);
        }
        if (source.ShowType != null) {
            this.ShowType = new String(source.ShowType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeleteAll", this.DeleteAll);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "ShowType", this.ShowType);

    }
}

