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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIGWAuthModelScopeItem extends AbstractModel {

    /**
    * <p>授权主体 ID，如消费者组、消费者</p>
    */
    @SerializedName("PrincipalId")
    @Expose
    private String PrincipalId;

    /**
    * <p>授权主体名称，如消费者组、消费者</p>
    */
    @SerializedName("PrincipalName")
    @Expose
    private String PrincipalName;

    /**
    * <p>模型范围原始配置</p>
    */
    @SerializedName("ModelScope")
    @Expose
    private AIGWModelScope ModelScope;

    /**
    * <p>MAG 已展开、保序去重后的可用模型名称列表</p>
    */
    @SerializedName("EffectiveModelNames")
    @Expose
    private String [] EffectiveModelNames;

    /**
     * Get <p>授权主体 ID，如消费者组、消费者</p> 
     * @return PrincipalId <p>授权主体 ID，如消费者组、消费者</p>
     */
    public String getPrincipalId() {
        return this.PrincipalId;
    }

    /**
     * Set <p>授权主体 ID，如消费者组、消费者</p>
     * @param PrincipalId <p>授权主体 ID，如消费者组、消费者</p>
     */
    public void setPrincipalId(String PrincipalId) {
        this.PrincipalId = PrincipalId;
    }

    /**
     * Get <p>授权主体名称，如消费者组、消费者</p> 
     * @return PrincipalName <p>授权主体名称，如消费者组、消费者</p>
     */
    public String getPrincipalName() {
        return this.PrincipalName;
    }

    /**
     * Set <p>授权主体名称，如消费者组、消费者</p>
     * @param PrincipalName <p>授权主体名称，如消费者组、消费者</p>
     */
    public void setPrincipalName(String PrincipalName) {
        this.PrincipalName = PrincipalName;
    }

    /**
     * Get <p>模型范围原始配置</p> 
     * @return ModelScope <p>模型范围原始配置</p>
     */
    public AIGWModelScope getModelScope() {
        return this.ModelScope;
    }

    /**
     * Set <p>模型范围原始配置</p>
     * @param ModelScope <p>模型范围原始配置</p>
     */
    public void setModelScope(AIGWModelScope ModelScope) {
        this.ModelScope = ModelScope;
    }

    /**
     * Get <p>MAG 已展开、保序去重后的可用模型名称列表</p> 
     * @return EffectiveModelNames <p>MAG 已展开、保序去重后的可用模型名称列表</p>
     */
    public String [] getEffectiveModelNames() {
        return this.EffectiveModelNames;
    }

    /**
     * Set <p>MAG 已展开、保序去重后的可用模型名称列表</p>
     * @param EffectiveModelNames <p>MAG 已展开、保序去重后的可用模型名称列表</p>
     */
    public void setEffectiveModelNames(String [] EffectiveModelNames) {
        this.EffectiveModelNames = EffectiveModelNames;
    }

    public AIGWAuthModelScopeItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWAuthModelScopeItem(AIGWAuthModelScopeItem source) {
        if (source.PrincipalId != null) {
            this.PrincipalId = new String(source.PrincipalId);
        }
        if (source.PrincipalName != null) {
            this.PrincipalName = new String(source.PrincipalName);
        }
        if (source.ModelScope != null) {
            this.ModelScope = new AIGWModelScope(source.ModelScope);
        }
        if (source.EffectiveModelNames != null) {
            this.EffectiveModelNames = new String[source.EffectiveModelNames.length];
            for (int i = 0; i < source.EffectiveModelNames.length; i++) {
                this.EffectiveModelNames[i] = new String(source.EffectiveModelNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PrincipalId", this.PrincipalId);
        this.setParamSimple(map, prefix + "PrincipalName", this.PrincipalName);
        this.setParamObj(map, prefix + "ModelScope.", this.ModelScope);
        this.setParamArraySimple(map, prefix + "EffectiveModelNames.", this.EffectiveModelNames);

    }
}

