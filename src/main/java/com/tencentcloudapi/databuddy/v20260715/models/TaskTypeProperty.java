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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskTypeProperty extends AbstractModel {

    /**
    * 属性名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PropertyKey")
    @Expose
    private String PropertyKey;

    /**
    * 属性值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PropertyValue")
    @Expose
    private String PropertyValue;

    /**
     * Get 属性名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PropertyKey 属性名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPropertyKey() {
        return this.PropertyKey;
    }

    /**
     * Set 属性名
注意：此字段可能返回 null，表示取不到有效值。
     * @param PropertyKey 属性名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPropertyKey(String PropertyKey) {
        this.PropertyKey = PropertyKey;
    }

    /**
     * Get 属性值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PropertyValue 属性值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPropertyValue() {
        return this.PropertyValue;
    }

    /**
     * Set 属性值
注意：此字段可能返回 null，表示取不到有效值。
     * @param PropertyValue 属性值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPropertyValue(String PropertyValue) {
        this.PropertyValue = PropertyValue;
    }

    public TaskTypeProperty() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskTypeProperty(TaskTypeProperty source) {
        if (source.PropertyKey != null) {
            this.PropertyKey = new String(source.PropertyKey);
        }
        if (source.PropertyValue != null) {
            this.PropertyValue = new String(source.PropertyValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PropertyKey", this.PropertyKey);
        this.setParamSimple(map, prefix + "PropertyValue", this.PropertyValue);

    }
}

