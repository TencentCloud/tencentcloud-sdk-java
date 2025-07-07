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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AllocationRuleOverview extends AbstractModel {

    /**
    * 公摊规则ID
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 公摊规则名称
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 公摊策略类型
枚举值：
1 - 自定义分摊占比 
2 - 等比分摊 
3 - 按占比分摊
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 公摊规则最后更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 分账单元概览
    */
    @SerializedName("AllocationNode")
    @Expose
    private AllocationUnit [] AllocationNode;

    /**
     * Get 公摊规则ID 
     * @return RuleId 公摊规则ID
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 公摊规则ID
     * @param RuleId 公摊规则ID
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 公摊规则名称 
     * @return RuleName 公摊规则名称
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 公摊规则名称
     * @param RuleName 公摊规则名称
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 公摊策略类型
枚举值：
1 - 自定义分摊占比 
2 - 等比分摊 
3 - 按占比分摊 
     * @return Type 公摊策略类型
枚举值：
1 - 自定义分摊占比 
2 - 等比分摊 
3 - 按占比分摊
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 公摊策略类型
枚举值：
1 - 自定义分摊占比 
2 - 等比分摊 
3 - 按占比分摊
     * @param Type 公摊策略类型
枚举值：
1 - 自定义分摊占比 
2 - 等比分摊 
3 - 按占比分摊
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 公摊规则最后更新时间 
     * @return UpdateTime 公摊规则最后更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 公摊规则最后更新时间
     * @param UpdateTime 公摊规则最后更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 分账单元概览 
     * @return AllocationNode 分账单元概览
     */
    public AllocationUnit [] getAllocationNode() {
        return this.AllocationNode;
    }

    /**
     * Set 分账单元概览
     * @param AllocationNode 分账单元概览
     */
    public void setAllocationNode(AllocationUnit [] AllocationNode) {
        this.AllocationNode = AllocationNode;
    }

    public AllocationRuleOverview() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AllocationRuleOverview(AllocationRuleOverview source) {
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.AllocationNode != null) {
            this.AllocationNode = new AllocationUnit[source.AllocationNode.length];
            for (int i = 0; i < source.AllocationNode.length; i++) {
                this.AllocationNode[i] = new AllocationUnit(source.AllocationNode[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamArrayObj(map, prefix + "AllocationNode.", this.AllocationNode);

    }
}

