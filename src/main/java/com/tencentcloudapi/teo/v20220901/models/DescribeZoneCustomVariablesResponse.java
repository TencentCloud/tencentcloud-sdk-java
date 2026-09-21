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

public class DescribeZoneCustomVariablesResponse extends AbstractModel {

    /**
    * <p>站点级自定义变量列表。</p>
    */
    @SerializedName("CustomVariables")
    @Expose
    private CustomVariable [] CustomVariables;

    /**
    * <p>站点级自定义变量运算规则。</p>
    */
    @SerializedName("CustomVariableOperations")
    @Expose
    private CustomVariableOperation [] CustomVariableOperations;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>站点级自定义变量列表。</p> 
     * @return CustomVariables <p>站点级自定义变量列表。</p>
     */
    public CustomVariable [] getCustomVariables() {
        return this.CustomVariables;
    }

    /**
     * Set <p>站点级自定义变量列表。</p>
     * @param CustomVariables <p>站点级自定义变量列表。</p>
     */
    public void setCustomVariables(CustomVariable [] CustomVariables) {
        this.CustomVariables = CustomVariables;
    }

    /**
     * Get <p>站点级自定义变量运算规则。</p> 
     * @return CustomVariableOperations <p>站点级自定义变量运算规则。</p>
     */
    public CustomVariableOperation [] getCustomVariableOperations() {
        return this.CustomVariableOperations;
    }

    /**
     * Set <p>站点级自定义变量运算规则。</p>
     * @param CustomVariableOperations <p>站点级自定义变量运算规则。</p>
     */
    public void setCustomVariableOperations(CustomVariableOperation [] CustomVariableOperations) {
        this.CustomVariableOperations = CustomVariableOperations;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeZoneCustomVariablesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeZoneCustomVariablesResponse(DescribeZoneCustomVariablesResponse source) {
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
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "CustomVariables.", this.CustomVariables);
        this.setParamArrayObj(map, prefix + "CustomVariableOperations.", this.CustomVariableOperations);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

