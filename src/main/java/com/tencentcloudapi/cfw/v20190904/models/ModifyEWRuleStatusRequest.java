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

public class ModifyEWRuleStatusRequest extends AbstractModel {

    /**
    * vpc规则必填，边id
    */
    @SerializedName("EdgeId")
    @Expose
    private String EdgeId;

    /**
    * 是否开关开启，0：未开启，1：开启
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 规则方向，0：出站，1：入站，默认1
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
    * 更改的规则当前执行顺序
    */
    @SerializedName("RuleSequence")
    @Expose
    private Long RuleSequence;

    /**
    * 规则类型，vpc：VPC间规则、nat：Nat边界规则
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
     * Get vpc规则必填，边id 
     * @return EdgeId vpc规则必填，边id
     */
    public String getEdgeId() {
        return this.EdgeId;
    }

    /**
     * Set vpc规则必填，边id
     * @param EdgeId vpc规则必填，边id
     */
    public void setEdgeId(String EdgeId) {
        this.EdgeId = EdgeId;
    }

    /**
     * Get 是否开关开启，0：未开启，1：开启 
     * @return Status 是否开关开启，0：未开启，1：开启
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 是否开关开启，0：未开启，1：开启
     * @param Status 是否开关开启，0：未开启，1：开启
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 规则方向，0：出站，1：入站，默认1 
     * @return Direction 规则方向，0：出站，1：入站，默认1
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set 规则方向，0：出站，1：入站，默认1
     * @param Direction 规则方向，0：出站，1：入站，默认1
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
    }

    /**
     * Get 更改的规则当前执行顺序 
     * @return RuleSequence 更改的规则当前执行顺序
     */
    public Long getRuleSequence() {
        return this.RuleSequence;
    }

    /**
     * Set 更改的规则当前执行顺序
     * @param RuleSequence 更改的规则当前执行顺序
     */
    public void setRuleSequence(Long RuleSequence) {
        this.RuleSequence = RuleSequence;
    }

    /**
     * Get 规则类型，vpc：VPC间规则、nat：Nat边界规则 
     * @return RuleType 规则类型，vpc：VPC间规则、nat：Nat边界规则
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set 规则类型，vpc：VPC间规则、nat：Nat边界规则
     * @param RuleType 规则类型，vpc：VPC间规则、nat：Nat边界规则
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    public ModifyEWRuleStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyEWRuleStatusRequest(ModifyEWRuleStatusRequest source) {
        if (source.EdgeId != null) {
            this.EdgeId = new String(source.EdgeId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Direction != null) {
            this.Direction = new Long(source.Direction);
        }
        if (source.RuleSequence != null) {
            this.RuleSequence = new Long(source.RuleSequence);
        }
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EdgeId", this.EdgeId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "RuleSequence", this.RuleSequence);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);

    }
}

