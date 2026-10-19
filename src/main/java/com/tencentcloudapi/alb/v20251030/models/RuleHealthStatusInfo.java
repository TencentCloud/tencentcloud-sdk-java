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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleHealthStatusInfo extends AbstractModel {

    /**
    * <p>是否为默认转发规则。</p>
    */
    @SerializedName("IsDefaultRule")
    @Expose
    private String IsDefaultRule;

    /**
    * <p>转发规则 ID，格式为 rule- 后接 8 位字母数字。</p>
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * <p>目标组健康状态。</p>
    */
    @SerializedName("TargetGroupHealthInfos")
    @Expose
    private TargetGroupHealthInfo [] TargetGroupHealthInfos;

    /**
    * <p>优先级，值越小优先级越高，取值范围：1~10000。</p>
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
     * Get <p>是否为默认转发规则。</p> 
     * @return IsDefaultRule <p>是否为默认转发规则。</p>
     */
    public String getIsDefaultRule() {
        return this.IsDefaultRule;
    }

    /**
     * Set <p>是否为默认转发规则。</p>
     * @param IsDefaultRule <p>是否为默认转发规则。</p>
     */
    public void setIsDefaultRule(String IsDefaultRule) {
        this.IsDefaultRule = IsDefaultRule;
    }

    /**
     * Get <p>转发规则 ID，格式为 rule- 后接 8 位字母数字。</p> 
     * @return RuleId <p>转发规则 ID，格式为 rule- 后接 8 位字母数字。</p>
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set <p>转发规则 ID，格式为 rule- 后接 8 位字母数字。</p>
     * @param RuleId <p>转发规则 ID，格式为 rule- 后接 8 位字母数字。</p>
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get <p>目标组健康状态。</p> 
     * @return TargetGroupHealthInfos <p>目标组健康状态。</p>
     */
    public TargetGroupHealthInfo [] getTargetGroupHealthInfos() {
        return this.TargetGroupHealthInfos;
    }

    /**
     * Set <p>目标组健康状态。</p>
     * @param TargetGroupHealthInfos <p>目标组健康状态。</p>
     */
    public void setTargetGroupHealthInfos(TargetGroupHealthInfo [] TargetGroupHealthInfos) {
        this.TargetGroupHealthInfos = TargetGroupHealthInfos;
    }

    /**
     * Get <p>优先级，值越小优先级越高，取值范围：1~10000。</p> 
     * @return Priority <p>优先级，值越小优先级越高，取值范围：1~10000。</p>
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set <p>优先级，值越小优先级越高，取值范围：1~10000。</p>
     * @param Priority <p>优先级，值越小优先级越高，取值范围：1~10000。</p>
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    public RuleHealthStatusInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleHealthStatusInfo(RuleHealthStatusInfo source) {
        if (source.IsDefaultRule != null) {
            this.IsDefaultRule = new String(source.IsDefaultRule);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.TargetGroupHealthInfos != null) {
            this.TargetGroupHealthInfos = new TargetGroupHealthInfo[source.TargetGroupHealthInfos.length];
            for (int i = 0; i < source.TargetGroupHealthInfos.length; i++) {
                this.TargetGroupHealthInfos[i] = new TargetGroupHealthInfo(source.TargetGroupHealthInfos[i]);
            }
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsDefaultRule", this.IsDefaultRule);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamArrayObj(map, prefix + "TargetGroupHealthInfos.", this.TargetGroupHealthInfos);
        this.setParamSimple(map, prefix + "Priority", this.Priority);

    }
}

