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

public class CustomVariableOperationRuleAction extends AbstractModel {

    /**
    * <p>操作名称。名称需要与参数结构体对应，例如 Name=Set，则 SetParameters 必填。当前仅支持填写 Set。</p><li>Set：自定义变量设置；</li>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>自定义变量设置参数。此参数中若存在多条运算，按照数组的顺序依次执行。当 Name 取值为 Set 时，该参数必填。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SetParameters")
    @Expose
    private SetParameters SetParameters;

    /**
     * Get <p>操作名称。名称需要与参数结构体对应，例如 Name=Set，则 SetParameters 必填。当前仅支持填写 Set。</p><li>Set：自定义变量设置；</li> 
     * @return Name <p>操作名称。名称需要与参数结构体对应，例如 Name=Set，则 SetParameters 必填。当前仅支持填写 Set。</p><li>Set：自定义变量设置；</li>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>操作名称。名称需要与参数结构体对应，例如 Name=Set，则 SetParameters 必填。当前仅支持填写 Set。</p><li>Set：自定义变量设置；</li>
     * @param Name <p>操作名称。名称需要与参数结构体对应，例如 Name=Set，则 SetParameters 必填。当前仅支持填写 Set。</p><li>Set：自定义变量设置；</li>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>自定义变量设置参数。此参数中若存在多条运算，按照数组的顺序依次执行。当 Name 取值为 Set 时，该参数必填。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SetParameters <p>自定义变量设置参数。此参数中若存在多条运算，按照数组的顺序依次执行。当 Name 取值为 Set 时，该参数必填。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SetParameters getSetParameters() {
        return this.SetParameters;
    }

    /**
     * Set <p>自定义变量设置参数。此参数中若存在多条运算，按照数组的顺序依次执行。当 Name 取值为 Set 时，该参数必填。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SetParameters <p>自定义变量设置参数。此参数中若存在多条运算，按照数组的顺序依次执行。当 Name 取值为 Set 时，该参数必填。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSetParameters(SetParameters SetParameters) {
        this.SetParameters = SetParameters;
    }

    public CustomVariableOperationRuleAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomVariableOperationRuleAction(CustomVariableOperationRuleAction source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SetParameters != null) {
            this.SetParameters = new SetParameters(source.SetParameters);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "SetParameters.", this.SetParameters);

    }
}

