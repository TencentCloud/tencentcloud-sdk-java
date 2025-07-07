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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ForwardingConfig extends AbstractModel {

    /**
    * 是否启用
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * 1 无条件呼转 2 有条件呼转
    */
    @SerializedName("Condition")
    @Expose
    private Long Condition;

    /**
    * 呼转目标
    */
    @SerializedName("Target")
    @Expose
    private ForwardingTarget Target;

    /**
     * Get 是否启用 
     * @return Enabled 是否启用
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 是否启用
     * @param Enabled 是否启用
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 1 无条件呼转 2 有条件呼转 
     * @return Condition 1 无条件呼转 2 有条件呼转
     */
    public Long getCondition() {
        return this.Condition;
    }

    /**
     * Set 1 无条件呼转 2 有条件呼转
     * @param Condition 1 无条件呼转 2 有条件呼转
     */
    public void setCondition(Long Condition) {
        this.Condition = Condition;
    }

    /**
     * Get 呼转目标 
     * @return Target 呼转目标
     */
    public ForwardingTarget getTarget() {
        return this.Target;
    }

    /**
     * Set 呼转目标
     * @param Target 呼转目标
     */
    public void setTarget(ForwardingTarget Target) {
        this.Target = Target;
    }

    public ForwardingConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ForwardingConfig(ForwardingConfig source) {
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.Condition != null) {
            this.Condition = new Long(source.Condition);
        }
        if (source.Target != null) {
            this.Target = new ForwardingTarget(source.Target);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "Condition", this.Condition);
        this.setParamObj(map, prefix + "Target.", this.Target);

    }
}

