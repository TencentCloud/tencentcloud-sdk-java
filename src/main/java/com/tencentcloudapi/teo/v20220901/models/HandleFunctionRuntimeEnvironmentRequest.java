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

public class HandleFunctionRuntimeEnvironmentRequest extends AbstractModel {

    /**
    * 站点 ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 函数 ID。
    */
    @SerializedName("FunctionId")
    @Expose
    private String FunctionId;

    /**
    * 操作类型，取值有：
<li>setEnvironmentVariable：设置环境变量，当环境变量存在时为修改行为，否则为添加行为；</li>
<li>deleteEnvironmentVariable：删除环境变量变量；</li>
<li>clearEnvironmentVariable：清空环境变量变量；</li>
<li>resetEnvironmentVariable：重置环境变量变量。</li>
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 环境变量列表，函数运行环境最多支持 64 个变量。当 Operation 取值为 setEnvironmentVariable、deleteEnvironmentVariable、resetEnvironmentVariable 时必填。
    */
    @SerializedName("EnvironmentVariables")
    @Expose
    private FunctionEnvironmentVariable [] EnvironmentVariables;

    /**
     * Get 站点 ID。 
     * @return ZoneId 站点 ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点 ID。
     * @param ZoneId 站点 ID。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 函数 ID。 
     * @return FunctionId 函数 ID。
     */
    public String getFunctionId() {
        return this.FunctionId;
    }

    /**
     * Set 函数 ID。
     * @param FunctionId 函数 ID。
     */
    public void setFunctionId(String FunctionId) {
        this.FunctionId = FunctionId;
    }

    /**
     * Get 操作类型，取值有：
<li>setEnvironmentVariable：设置环境变量，当环境变量存在时为修改行为，否则为添加行为；</li>
<li>deleteEnvironmentVariable：删除环境变量变量；</li>
<li>clearEnvironmentVariable：清空环境变量变量；</li>
<li>resetEnvironmentVariable：重置环境变量变量。</li> 
     * @return Operation 操作类型，取值有：
<li>setEnvironmentVariable：设置环境变量，当环境变量存在时为修改行为，否则为添加行为；</li>
<li>deleteEnvironmentVariable：删除环境变量变量；</li>
<li>clearEnvironmentVariable：清空环境变量变量；</li>
<li>resetEnvironmentVariable：重置环境变量变量。</li>
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 操作类型，取值有：
<li>setEnvironmentVariable：设置环境变量，当环境变量存在时为修改行为，否则为添加行为；</li>
<li>deleteEnvironmentVariable：删除环境变量变量；</li>
<li>clearEnvironmentVariable：清空环境变量变量；</li>
<li>resetEnvironmentVariable：重置环境变量变量。</li>
     * @param Operation 操作类型，取值有：
<li>setEnvironmentVariable：设置环境变量，当环境变量存在时为修改行为，否则为添加行为；</li>
<li>deleteEnvironmentVariable：删除环境变量变量；</li>
<li>clearEnvironmentVariable：清空环境变量变量；</li>
<li>resetEnvironmentVariable：重置环境变量变量。</li>
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 环境变量列表，函数运行环境最多支持 64 个变量。当 Operation 取值为 setEnvironmentVariable、deleteEnvironmentVariable、resetEnvironmentVariable 时必填。 
     * @return EnvironmentVariables 环境变量列表，函数运行环境最多支持 64 个变量。当 Operation 取值为 setEnvironmentVariable、deleteEnvironmentVariable、resetEnvironmentVariable 时必填。
     */
    public FunctionEnvironmentVariable [] getEnvironmentVariables() {
        return this.EnvironmentVariables;
    }

    /**
     * Set 环境变量列表，函数运行环境最多支持 64 个变量。当 Operation 取值为 setEnvironmentVariable、deleteEnvironmentVariable、resetEnvironmentVariable 时必填。
     * @param EnvironmentVariables 环境变量列表，函数运行环境最多支持 64 个变量。当 Operation 取值为 setEnvironmentVariable、deleteEnvironmentVariable、resetEnvironmentVariable 时必填。
     */
    public void setEnvironmentVariables(FunctionEnvironmentVariable [] EnvironmentVariables) {
        this.EnvironmentVariables = EnvironmentVariables;
    }

    public HandleFunctionRuntimeEnvironmentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HandleFunctionRuntimeEnvironmentRequest(HandleFunctionRuntimeEnvironmentRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.FunctionId != null) {
            this.FunctionId = new String(source.FunctionId);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.EnvironmentVariables != null) {
            this.EnvironmentVariables = new FunctionEnvironmentVariable[source.EnvironmentVariables.length];
            for (int i = 0; i < source.EnvironmentVariables.length; i++) {
                this.EnvironmentVariables[i] = new FunctionEnvironmentVariable(source.EnvironmentVariables[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "FunctionId", this.FunctionId);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamArrayObj(map, prefix + "EnvironmentVariables.", this.EnvironmentVariables);

    }
}

