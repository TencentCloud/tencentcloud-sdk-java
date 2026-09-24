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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ZoneCustomVariables extends AbstractModel {

    /**
    * <p>站点级自定义变量列表。CustomVariable.Name 需要使用 user.zone. 作为前缀。变量按照数组顺序依次初始化，InitialValue 仅支持引用位于当前变量之前的变量，不支持引用当前变量自身或位于当前变量之后的变量。</p>
    */
    @SerializedName("CustomVariables")
    @Expose
    private CustomVariable [] CustomVariables;

    /**
    * <p>站点级自定义变量运算规则。运算中支持引用已定义的站点级自定义变量。此列表当前只支持填写一项规则，多填无效。</p>
    */
    @SerializedName("CustomVariableOperations")
    @Expose
    private CustomVariableOperation [] CustomVariableOperations;

    /**
     * Get <p>站点级自定义变量列表。CustomVariable.Name 需要使用 user.zone. 作为前缀。变量按照数组顺序依次初始化，InitialValue 仅支持引用位于当前变量之前的变量，不支持引用当前变量自身或位于当前变量之后的变量。</p> 
     * @return CustomVariables <p>站点级自定义变量列表。CustomVariable.Name 需要使用 user.zone. 作为前缀。变量按照数组顺序依次初始化，InitialValue 仅支持引用位于当前变量之前的变量，不支持引用当前变量自身或位于当前变量之后的变量。</p>
     */
    public CustomVariable [] getCustomVariables() {
        return this.CustomVariables;
    }

    /**
     * Set <p>站点级自定义变量列表。CustomVariable.Name 需要使用 user.zone. 作为前缀。变量按照数组顺序依次初始化，InitialValue 仅支持引用位于当前变量之前的变量，不支持引用当前变量自身或位于当前变量之后的变量。</p>
     * @param CustomVariables <p>站点级自定义变量列表。CustomVariable.Name 需要使用 user.zone. 作为前缀。变量按照数组顺序依次初始化，InitialValue 仅支持引用位于当前变量之前的变量，不支持引用当前变量自身或位于当前变量之后的变量。</p>
     */
    public void setCustomVariables(CustomVariable [] CustomVariables) {
        this.CustomVariables = CustomVariables;
    }

    /**
     * Get <p>站点级自定义变量运算规则。运算中支持引用已定义的站点级自定义变量。此列表当前只支持填写一项规则，多填无效。</p> 
     * @return CustomVariableOperations <p>站点级自定义变量运算规则。运算中支持引用已定义的站点级自定义变量。此列表当前只支持填写一项规则，多填无效。</p>
     */
    public CustomVariableOperation [] getCustomVariableOperations() {
        return this.CustomVariableOperations;
    }

    /**
     * Set <p>站点级自定义变量运算规则。运算中支持引用已定义的站点级自定义变量。此列表当前只支持填写一项规则，多填无效。</p>
     * @param CustomVariableOperations <p>站点级自定义变量运算规则。运算中支持引用已定义的站点级自定义变量。此列表当前只支持填写一项规则，多填无效。</p>
     */
    public void setCustomVariableOperations(CustomVariableOperation [] CustomVariableOperations) {
        this.CustomVariableOperations = CustomVariableOperations;
    }

    public ZoneCustomVariables() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ZoneCustomVariables(ZoneCustomVariables source) {
        if (source.CustomVariables != null) {
            this.CustomVariables = new CustomVariable[source.CustomVariables.length];
            for (int i = 0; i < source.CustomVariables.length; i++) {
                this.CustomVariables[i] = new CustomVariable(source.CustomVariables[i]);
            }
        }
        if (source.CustomVariableOperations != null) {
            this.CustomVariableOperations = new CustomVariableOperation[source.CustomVariableOperations.length];
            for (int i = 0; i < source.CustomVariableOperations.length; i++) {
                this.CustomVariableOperations[i] = new CustomVariableOperation(source.CustomVariableOperations[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "CustomVariables.", this.CustomVariables);
        this.setParamArrayObj(map, prefix + "CustomVariableOperations.", this.CustomVariableOperations);

    }
}

