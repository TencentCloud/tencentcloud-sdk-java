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

public class BaselinePolicyBrief extends AbstractModel {

    /**
    * <p>基线策略 ID。</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>基线策略名称。</p>
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * <p>是否为系统内置策略。true 是，false 否（用户自定义策略）。</p>
    */
    @SerializedName("IsSystem")
    @Expose
    private Boolean IsSystem;

    /**
     * Get <p>基线策略 ID。</p> 
     * @return ID <p>基线策略 ID。</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>基线策略 ID。</p>
     * @param ID <p>基线策略 ID。</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>基线策略名称。</p> 
     * @return PolicyName <p>基线策略名称。</p>
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set <p>基线策略名称。</p>
     * @param PolicyName <p>基线策略名称。</p>
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get <p>是否为系统内置策略。true 是，false 否（用户自定义策略）。</p> 
     * @return IsSystem <p>是否为系统内置策略。true 是，false 否（用户自定义策略）。</p>
     */
    public Boolean getIsSystem() {
        return this.IsSystem;
    }

    /**
     * Set <p>是否为系统内置策略。true 是，false 否（用户自定义策略）。</p>
     * @param IsSystem <p>是否为系统内置策略。true 是，false 否（用户自定义策略）。</p>
     */
    public void setIsSystem(Boolean IsSystem) {
        this.IsSystem = IsSystem;
    }

    public BaselinePolicyBrief() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselinePolicyBrief(BaselinePolicyBrief source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.IsSystem != null) {
            this.IsSystem = new Boolean(source.IsSystem);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "IsSystem", this.IsSystem);

    }
}

