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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Selectors extends AbstractModel {

    /**
    * 组件勾选情况
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Component")
    @Expose
    private String [] Component;

    /**
     * Get 组件勾选情况
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Component 组件勾选情况
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getComponent() {
        return this.Component;
    }

    /**
     * Set 组件勾选情况
注意：此字段可能返回 null，表示取不到有效值。
     * @param Component 组件勾选情况
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComponent(String [] Component) {
        this.Component = Component;
    }

    public Selectors() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Selectors(Selectors source) {
        if (source.Component != null) {
            this.Component = new String[source.Component.length];
            for (int i = 0; i < source.Component.length; i++) {
                this.Component[i] = new String(source.Component[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Component.", this.Component);

    }
}

