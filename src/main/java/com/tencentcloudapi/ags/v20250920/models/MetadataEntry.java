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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MetadataEntry extends AbstractModel {

    /**
    * <p>元数据名称。</p><p>参数格式：非空小写字符串，同一 Metadata 数组内唯一，不自动转换大小写。重复名称返回 InvalidParameter，即使 Value 相同也拒绝。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>元数据的字符串值。</p><p>参数格式：允许空字符串，保留大小写，不支持嵌套对象、数组、数字、布尔值或 null。publisher 的 Value 为发布者展示名称。</p>
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get <p>元数据名称。</p><p>参数格式：非空小写字符串，同一 Metadata 数组内唯一，不自动转换大小写。重复名称返回 InvalidParameter，即使 Value 相同也拒绝。</p> 
     * @return Name <p>元数据名称。</p><p>参数格式：非空小写字符串，同一 Metadata 数组内唯一，不自动转换大小写。重复名称返回 InvalidParameter，即使 Value 相同也拒绝。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>元数据名称。</p><p>参数格式：非空小写字符串，同一 Metadata 数组内唯一，不自动转换大小写。重复名称返回 InvalidParameter，即使 Value 相同也拒绝。</p>
     * @param Name <p>元数据名称。</p><p>参数格式：非空小写字符串，同一 Metadata 数组内唯一，不自动转换大小写。重复名称返回 InvalidParameter，即使 Value 相同也拒绝。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>元数据的字符串值。</p><p>参数格式：允许空字符串，保留大小写，不支持嵌套对象、数组、数字、布尔值或 null。publisher 的 Value 为发布者展示名称。</p> 
     * @return Value <p>元数据的字符串值。</p><p>参数格式：允许空字符串，保留大小写，不支持嵌套对象、数组、数字、布尔值或 null。publisher 的 Value 为发布者展示名称。</p>
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set <p>元数据的字符串值。</p><p>参数格式：允许空字符串，保留大小写，不支持嵌套对象、数组、数字、布尔值或 null。publisher 的 Value 为发布者展示名称。</p>
     * @param Value <p>元数据的字符串值。</p><p>参数格式：允许空字符串，保留大小写，不支持嵌套对象、数组、数字、布尔值或 null。publisher 的 Value 为发布者展示名称。</p>
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public MetadataEntry() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MetadataEntry(MetadataEntry source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

