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

public class FunctionComponentBinding extends AbstractModel {

    /**
    * 绑定的组件类型。取值有：
<li>kv_namespace：KV 命名空间。</li>

    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 用于绑定的变量名。限制 1-50 个字符，允许的字符为字母、数字和下划线，其中数字不能在开头。在边缘函数代码中通过该变量名访问绑定的组件。根据 Type 的取值不同，使用方式如下：
<li>当 Type 为 kv_namespace 时：在代码中可通过该变量名访问 KV 命名空间，例如设置为 "MY_KV" 时，可通过 MY_KV.get("key") 进行读写操作。</li>

    */
    @SerializedName("VariableName")
    @Expose
    private String VariableName;

    /**
    * KV 命名空间配置参数。用于指定绑定的 KV 命名空间详情。当 Type 为 kv_namespace 时，此字段必填。


注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KVNamespaceParameters")
    @Expose
    private KVNamespaceParameters KVNamespaceParameters;

    /**
     * Get 绑定的组件类型。取值有：
<li>kv_namespace：KV 命名空间。</li>
 
     * @return Type 绑定的组件类型。取值有：
<li>kv_namespace：KV 命名空间。</li>

     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 绑定的组件类型。取值有：
<li>kv_namespace：KV 命名空间。</li>

     * @param Type 绑定的组件类型。取值有：
<li>kv_namespace：KV 命名空间。</li>

     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 用于绑定的变量名。限制 1-50 个字符，允许的字符为字母、数字和下划线，其中数字不能在开头。在边缘函数代码中通过该变量名访问绑定的组件。根据 Type 的取值不同，使用方式如下：
<li>当 Type 为 kv_namespace 时：在代码中可通过该变量名访问 KV 命名空间，例如设置为 "MY_KV" 时，可通过 MY_KV.get("key") 进行读写操作。</li>
 
     * @return VariableName 用于绑定的变量名。限制 1-50 个字符，允许的字符为字母、数字和下划线，其中数字不能在开头。在边缘函数代码中通过该变量名访问绑定的组件。根据 Type 的取值不同，使用方式如下：
<li>当 Type 为 kv_namespace 时：在代码中可通过该变量名访问 KV 命名空间，例如设置为 "MY_KV" 时，可通过 MY_KV.get("key") 进行读写操作。</li>

     */
    public String getVariableName() {
        return this.VariableName;
    }

    /**
     * Set 用于绑定的变量名。限制 1-50 个字符，允许的字符为字母、数字和下划线，其中数字不能在开头。在边缘函数代码中通过该变量名访问绑定的组件。根据 Type 的取值不同，使用方式如下：
<li>当 Type 为 kv_namespace 时：在代码中可通过该变量名访问 KV 命名空间，例如设置为 "MY_KV" 时，可通过 MY_KV.get("key") 进行读写操作。</li>

     * @param VariableName 用于绑定的变量名。限制 1-50 个字符，允许的字符为字母、数字和下划线，其中数字不能在开头。在边缘函数代码中通过该变量名访问绑定的组件。根据 Type 的取值不同，使用方式如下：
<li>当 Type 为 kv_namespace 时：在代码中可通过该变量名访问 KV 命名空间，例如设置为 "MY_KV" 时，可通过 MY_KV.get("key") 进行读写操作。</li>

     */
    public void setVariableName(String VariableName) {
        this.VariableName = VariableName;
    }

    /**
     * Get KV 命名空间配置参数。用于指定绑定的 KV 命名空间详情。当 Type 为 kv_namespace 时，此字段必填。


注意：此字段可能返回 null，表示取不到有效值。 
     * @return KVNamespaceParameters KV 命名空间配置参数。用于指定绑定的 KV 命名空间详情。当 Type 为 kv_namespace 时，此字段必填。


注意：此字段可能返回 null，表示取不到有效值。
     */
    public KVNamespaceParameters getKVNamespaceParameters() {
        return this.KVNamespaceParameters;
    }

    /**
     * Set KV 命名空间配置参数。用于指定绑定的 KV 命名空间详情。当 Type 为 kv_namespace 时，此字段必填。


注意：此字段可能返回 null，表示取不到有效值。
     * @param KVNamespaceParameters KV 命名空间配置参数。用于指定绑定的 KV 命名空间详情。当 Type 为 kv_namespace 时，此字段必填。


注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKVNamespaceParameters(KVNamespaceParameters KVNamespaceParameters) {
        this.KVNamespaceParameters = KVNamespaceParameters;
    }

    public FunctionComponentBinding() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FunctionComponentBinding(FunctionComponentBinding source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.VariableName != null) {
            this.VariableName = new String(source.VariableName);
        }
        if (source.KVNamespaceParameters != null) {
            this.KVNamespaceParameters = new KVNamespaceParameters(source.KVNamespaceParameters);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "VariableName", this.VariableName);
        this.setParamObj(map, prefix + "KVNamespaceParameters.", this.KVNamespaceParameters);

    }
}

