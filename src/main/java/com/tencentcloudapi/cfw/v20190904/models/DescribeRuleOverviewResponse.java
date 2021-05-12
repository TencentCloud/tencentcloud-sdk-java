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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRuleOverviewResponse extends AbstractModel{

    /**
    * 规则总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AllTotal")
    @Expose
    private Long AllTotal;

    /**
    * 阻断策略规则数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StrategyNum")
    @Expose
    private Long StrategyNum;

    /**
    * 启用规则数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartRuleNum")
    @Expose
    private Long StartRuleNum;

    /**
    * 停用规则数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StopRuleNum")
    @Expose
    private Long StopRuleNum;

    /**
    * 剩余配额
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RemainingNum")
    @Expose
    private Long RemainingNum;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 规则总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AllTotal 规则总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAllTotal() {
        return this.AllTotal;
    }

    /**
     * Set 规则总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param AllTotal 规则总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAllTotal(Long AllTotal) {
        this.AllTotal = AllTotal;
    }

    /**
     * Get 阻断策略规则数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StrategyNum 阻断策略规则数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStrategyNum() {
        return this.StrategyNum;
    }

    /**
     * Set 阻断策略规则数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param StrategyNum 阻断策略规则数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStrategyNum(Long StrategyNum) {
        this.StrategyNum = StrategyNum;
    }

    /**
     * Get 启用规则数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartRuleNum 启用规则数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStartRuleNum() {
        return this.StartRuleNum;
    }

    /**
     * Set 启用规则数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartRuleNum 启用规则数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartRuleNum(Long StartRuleNum) {
        this.StartRuleNum = StartRuleNum;
    }

    /**
     * Get 停用规则数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StopRuleNum 停用规则数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStopRuleNum() {
        return this.StopRuleNum;
    }

    /**
     * Set 停用规则数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param StopRuleNum 停用规则数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStopRuleNum(Long StopRuleNum) {
        this.StopRuleNum = StopRuleNum;
    }

    /**
     * Get 剩余配额
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RemainingNum 剩余配额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRemainingNum() {
        return this.RemainingNum;
    }

    /**
     * Set 剩余配额
注意：此字段可能返回 null，表示取不到有效值。
     * @param RemainingNum 剩余配额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemainingNum(Long RemainingNum) {
        this.RemainingNum = RemainingNum;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeRuleOverviewResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRuleOverviewResponse(DescribeRuleOverviewResponse source) {
        if (source.AllTotal != null) {
            this.AllTotal = new Long(source.AllTotal);
        }
        if (source.StrategyNum != null) {
            this.StrategyNum = new Long(source.StrategyNum);
        }
        if (source.StartRuleNum != null) {
            this.StartRuleNum = new Long(source.StartRuleNum);
        }
        if (source.StopRuleNum != null) {
            this.StopRuleNum = new Long(source.StopRuleNum);
        }
        if (source.RemainingNum != null) {
            this.RemainingNum = new Long(source.RemainingNum);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AllTotal", this.AllTotal);
        this.setParamSimple(map, prefix + "StrategyNum", this.StrategyNum);
        this.setParamSimple(map, prefix + "StartRuleNum", this.StartRuleNum);
        this.setParamSimple(map, prefix + "StopRuleNum", this.StopRuleNum);
        this.setParamSimple(map, prefix + "RemainingNum", this.RemainingNum);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

