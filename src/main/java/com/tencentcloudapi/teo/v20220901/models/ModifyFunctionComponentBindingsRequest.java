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

public class ModifyFunctionComponentBindingsRequest extends AbstractModel {

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
<li>bind：绑定组件；</li>
<li>bind-override：绑定组件。若绑定已存在则为重绑定行为，否则为绑定行为；</li>
<li>unbind：解绑组件；</li>
<li>rebind：重置绑定关系。清空所有现有绑定，并设置为传入的绑定列表。若传入空列表，则清空所有绑定。</li>

    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 操作的函数组件绑定列表。当 Operation 为 rebind 且传入空列表时，表示清空所有绑定。
    */
    @SerializedName("FunctionComponentBindings")
    @Expose
    private FunctionComponentBinding [] FunctionComponentBindings;

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
<li>bind：绑定组件；</li>
<li>bind-override：绑定组件。若绑定已存在则为重绑定行为，否则为绑定行为；</li>
<li>unbind：解绑组件；</li>
<li>rebind：重置绑定关系。清空所有现有绑定，并设置为传入的绑定列表。若传入空列表，则清空所有绑定。</li>
 
     * @return Operation 操作类型，取值有：
<li>bind：绑定组件；</li>
<li>bind-override：绑定组件。若绑定已存在则为重绑定行为，否则为绑定行为；</li>
<li>unbind：解绑组件；</li>
<li>rebind：重置绑定关系。清空所有现有绑定，并设置为传入的绑定列表。若传入空列表，则清空所有绑定。</li>

     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 操作类型，取值有：
<li>bind：绑定组件；</li>
<li>bind-override：绑定组件。若绑定已存在则为重绑定行为，否则为绑定行为；</li>
<li>unbind：解绑组件；</li>
<li>rebind：重置绑定关系。清空所有现有绑定，并设置为传入的绑定列表。若传入空列表，则清空所有绑定。</li>

     * @param Operation 操作类型，取值有：
<li>bind：绑定组件；</li>
<li>bind-override：绑定组件。若绑定已存在则为重绑定行为，否则为绑定行为；</li>
<li>unbind：解绑组件；</li>
<li>rebind：重置绑定关系。清空所有现有绑定，并设置为传入的绑定列表。若传入空列表，则清空所有绑定。</li>

     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 操作的函数组件绑定列表。当 Operation 为 rebind 且传入空列表时，表示清空所有绑定。 
     * @return FunctionComponentBindings 操作的函数组件绑定列表。当 Operation 为 rebind 且传入空列表时，表示清空所有绑定。
     */
    public FunctionComponentBinding [] getFunctionComponentBindings() {
        return this.FunctionComponentBindings;
    }

    /**
     * Set 操作的函数组件绑定列表。当 Operation 为 rebind 且传入空列表时，表示清空所有绑定。
     * @param FunctionComponentBindings 操作的函数组件绑定列表。当 Operation 为 rebind 且传入空列表时，表示清空所有绑定。
     */
    public void setFunctionComponentBindings(FunctionComponentBinding [] FunctionComponentBindings) {
        this.FunctionComponentBindings = FunctionComponentBindings;
    }

    public ModifyFunctionComponentBindingsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyFunctionComponentBindingsRequest(ModifyFunctionComponentBindingsRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.FunctionId != null) {
            this.FunctionId = new String(source.FunctionId);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.FunctionComponentBindings != null) {
            this.FunctionComponentBindings = new FunctionComponentBinding[source.FunctionComponentBindings.length];
            for (int i = 0; i < source.FunctionComponentBindings.length; i++) {
                this.FunctionComponentBindings[i] = new FunctionComponentBinding(source.FunctionComponentBindings[i]);
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
        this.setParamArrayObj(map, prefix + "FunctionComponentBindings.", this.FunctionComponentBindings);

    }
}

