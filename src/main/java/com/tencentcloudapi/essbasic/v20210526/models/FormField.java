/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FormField extends AbstractModel{

    /**
    * 表单域或控件的Value
    */
    @SerializedName("ComponentValue")
    @Expose
    private String ComponentValue;

    /**
    * 表单域或控件的ID，跟ComponentName二选一，不能全为空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ComponentId")
    @Expose
    private String ComponentId;

    /**
    * 控件的名字，跟ComponentId二选一，不能全为空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ComponentName")
    @Expose
    private String ComponentName;

    /**
     * Get 表单域或控件的Value 
     * @return ComponentValue 表单域或控件的Value
     */
    public String getComponentValue() {
        return this.ComponentValue;
    }

    /**
     * Set 表单域或控件的Value
     * @param ComponentValue 表单域或控件的Value
     */
    public void setComponentValue(String ComponentValue) {
        this.ComponentValue = ComponentValue;
    }

    /**
     * Get 表单域或控件的ID，跟ComponentName二选一，不能全为空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ComponentId 表单域或控件的ID，跟ComponentName二选一，不能全为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComponentId() {
        return this.ComponentId;
    }

    /**
     * Set 表单域或控件的ID，跟ComponentName二选一，不能全为空
注意：此字段可能返回 null，表示取不到有效值。
     * @param ComponentId 表单域或控件的ID，跟ComponentName二选一，不能全为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComponentId(String ComponentId) {
        this.ComponentId = ComponentId;
    }

    /**
     * Get 控件的名字，跟ComponentId二选一，不能全为空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ComponentName 控件的名字，跟ComponentId二选一，不能全为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComponentName() {
        return this.ComponentName;
    }

    /**
     * Set 控件的名字，跟ComponentId二选一，不能全为空
注意：此字段可能返回 null，表示取不到有效值。
     * @param ComponentName 控件的名字，跟ComponentId二选一，不能全为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComponentName(String ComponentName) {
        this.ComponentName = ComponentName;
    }

    public FormField() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FormField(FormField source) {
        if (source.ComponentValue != null) {
            this.ComponentValue = new String(source.ComponentValue);
        }
        if (source.ComponentId != null) {
            this.ComponentId = new String(source.ComponentId);
        }
        if (source.ComponentName != null) {
            this.ComponentName = new String(source.ComponentName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ComponentValue", this.ComponentValue);
        this.setParamSimple(map, prefix + "ComponentId", this.ComponentId);
        this.setParamSimple(map, prefix + "ComponentName", this.ComponentName);

    }
}

