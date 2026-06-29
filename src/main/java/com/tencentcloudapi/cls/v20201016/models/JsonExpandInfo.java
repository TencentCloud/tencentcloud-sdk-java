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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class JsonExpandInfo extends AbstractModel {

    /**
    * <p>是否开启JSON嵌套展开功能。开启后将对指定JSON字段进行扁平化展开处理</p><p>默认值：无（必选参数）</p>
    */
    @SerializedName("Switch")
    @Expose
    private Boolean Switch;

    /**
    * <p>待展开的JSON字段名列表，支持1~3个字段，字段名不可为空串且不可重复 </p><p>入参限制：1. 字段数量：1~3个2. 每个字段名长度不超过128个字符3. 字段名不可为空字符串4. 字段名之间不可重复</p><p>默认值：无（必选参数）</p><p>取值参考：取值：message；描述：示例字段名</p><p>示例：[&quot;message&quot;, &quot;data&quot;, &quot;content&quot;]</p>
    */
    @SerializedName("Fields")
    @Expose
    private String [] Fields;

    /**
    * <p>展开后是否丢弃原始的嵌套字段。true: 丢弃原始字段只保留展开后的平铺字段; false: 保留原始字段同时增加展开后的平铺字段</p><p>枚举值：</p><ul><li>true / false： 丢弃原字段 / 保留原字段</li></ul><p>默认值：true</p><p>非必选，不传时默认为true</p>
    */
    @SerializedName("DropOriginal")
    @Expose
    private Boolean DropOriginal;

    /**
    * <p>展开后的字段与已有字段发生冲突时的处理策略</p><p>枚举值：</p><ul><li>keep_outer / keep_inner： 保留外层(已存在)字段 / 保留内层(新展开)字段</li></ul><p>默认值：keep_outer</p><p>非必选，不传时默认为keep_outer</p>
    */
    @SerializedName("ConflictPolicy")
    @Expose
    private String ConflictPolicy;

    /**
     * Get <p>是否开启JSON嵌套展开功能。开启后将对指定JSON字段进行扁平化展开处理</p><p>默认值：无（必选参数）</p> 
     * @return Switch <p>是否开启JSON嵌套展开功能。开启后将对指定JSON字段进行扁平化展开处理</p><p>默认值：无（必选参数）</p>
     */
    public Boolean getSwitch() {
        return this.Switch;
    }

    /**
     * Set <p>是否开启JSON嵌套展开功能。开启后将对指定JSON字段进行扁平化展开处理</p><p>默认值：无（必选参数）</p>
     * @param Switch <p>是否开启JSON嵌套展开功能。开启后将对指定JSON字段进行扁平化展开处理</p><p>默认值：无（必选参数）</p>
     */
    public void setSwitch(Boolean Switch) {
        this.Switch = Switch;
    }

    /**
     * Get <p>待展开的JSON字段名列表，支持1~3个字段，字段名不可为空串且不可重复 </p><p>入参限制：1. 字段数量：1~3个2. 每个字段名长度不超过128个字符3. 字段名不可为空字符串4. 字段名之间不可重复</p><p>默认值：无（必选参数）</p><p>取值参考：取值：message；描述：示例字段名</p><p>示例：[&quot;message&quot;, &quot;data&quot;, &quot;content&quot;]</p> 
     * @return Fields <p>待展开的JSON字段名列表，支持1~3个字段，字段名不可为空串且不可重复 </p><p>入参限制：1. 字段数量：1~3个2. 每个字段名长度不超过128个字符3. 字段名不可为空字符串4. 字段名之间不可重复</p><p>默认值：无（必选参数）</p><p>取值参考：取值：message；描述：示例字段名</p><p>示例：[&quot;message&quot;, &quot;data&quot;, &quot;content&quot;]</p>
     */
    public String [] getFields() {
        return this.Fields;
    }

    /**
     * Set <p>待展开的JSON字段名列表，支持1~3个字段，字段名不可为空串且不可重复 </p><p>入参限制：1. 字段数量：1~3个2. 每个字段名长度不超过128个字符3. 字段名不可为空字符串4. 字段名之间不可重复</p><p>默认值：无（必选参数）</p><p>取值参考：取值：message；描述：示例字段名</p><p>示例：[&quot;message&quot;, &quot;data&quot;, &quot;content&quot;]</p>
     * @param Fields <p>待展开的JSON字段名列表，支持1~3个字段，字段名不可为空串且不可重复 </p><p>入参限制：1. 字段数量：1~3个2. 每个字段名长度不超过128个字符3. 字段名不可为空字符串4. 字段名之间不可重复</p><p>默认值：无（必选参数）</p><p>取值参考：取值：message；描述：示例字段名</p><p>示例：[&quot;message&quot;, &quot;data&quot;, &quot;content&quot;]</p>
     */
    public void setFields(String [] Fields) {
        this.Fields = Fields;
    }

    /**
     * Get <p>展开后是否丢弃原始的嵌套字段。true: 丢弃原始字段只保留展开后的平铺字段; false: 保留原始字段同时增加展开后的平铺字段</p><p>枚举值：</p><ul><li>true / false： 丢弃原字段 / 保留原字段</li></ul><p>默认值：true</p><p>非必选，不传时默认为true</p> 
     * @return DropOriginal <p>展开后是否丢弃原始的嵌套字段。true: 丢弃原始字段只保留展开后的平铺字段; false: 保留原始字段同时增加展开后的平铺字段</p><p>枚举值：</p><ul><li>true / false： 丢弃原字段 / 保留原字段</li></ul><p>默认值：true</p><p>非必选，不传时默认为true</p>
     */
    public Boolean getDropOriginal() {
        return this.DropOriginal;
    }

    /**
     * Set <p>展开后是否丢弃原始的嵌套字段。true: 丢弃原始字段只保留展开后的平铺字段; false: 保留原始字段同时增加展开后的平铺字段</p><p>枚举值：</p><ul><li>true / false： 丢弃原字段 / 保留原字段</li></ul><p>默认值：true</p><p>非必选，不传时默认为true</p>
     * @param DropOriginal <p>展开后是否丢弃原始的嵌套字段。true: 丢弃原始字段只保留展开后的平铺字段; false: 保留原始字段同时增加展开后的平铺字段</p><p>枚举值：</p><ul><li>true / false： 丢弃原字段 / 保留原字段</li></ul><p>默认值：true</p><p>非必选，不传时默认为true</p>
     */
    public void setDropOriginal(Boolean DropOriginal) {
        this.DropOriginal = DropOriginal;
    }

    /**
     * Get <p>展开后的字段与已有字段发生冲突时的处理策略</p><p>枚举值：</p><ul><li>keep_outer / keep_inner： 保留外层(已存在)字段 / 保留内层(新展开)字段</li></ul><p>默认值：keep_outer</p><p>非必选，不传时默认为keep_outer</p> 
     * @return ConflictPolicy <p>展开后的字段与已有字段发生冲突时的处理策略</p><p>枚举值：</p><ul><li>keep_outer / keep_inner： 保留外层(已存在)字段 / 保留内层(新展开)字段</li></ul><p>默认值：keep_outer</p><p>非必选，不传时默认为keep_outer</p>
     */
    public String getConflictPolicy() {
        return this.ConflictPolicy;
    }

    /**
     * Set <p>展开后的字段与已有字段发生冲突时的处理策略</p><p>枚举值：</p><ul><li>keep_outer / keep_inner： 保留外层(已存在)字段 / 保留内层(新展开)字段</li></ul><p>默认值：keep_outer</p><p>非必选，不传时默认为keep_outer</p>
     * @param ConflictPolicy <p>展开后的字段与已有字段发生冲突时的处理策略</p><p>枚举值：</p><ul><li>keep_outer / keep_inner： 保留外层(已存在)字段 / 保留内层(新展开)字段</li></ul><p>默认值：keep_outer</p><p>非必选，不传时默认为keep_outer</p>
     */
    public void setConflictPolicy(String ConflictPolicy) {
        this.ConflictPolicy = ConflictPolicy;
    }

    public JsonExpandInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JsonExpandInfo(JsonExpandInfo source) {
        if (source.Switch != null) {
            this.Switch = new Boolean(source.Switch);
        }
        if (source.Fields != null) {
            this.Fields = new String[source.Fields.length];
            for (int i = 0; i < source.Fields.length; i++) {
                this.Fields[i] = new String(source.Fields[i]);
            }
        }
        if (source.DropOriginal != null) {
            this.DropOriginal = new Boolean(source.DropOriginal);
        }
        if (source.ConflictPolicy != null) {
            this.ConflictPolicy = new String(source.ConflictPolicy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArraySimple(map, prefix + "Fields.", this.Fields);
        this.setParamSimple(map, prefix + "DropOriginal", this.DropOriginal);
        this.setParamSimple(map, prefix + "ConflictPolicy", this.ConflictPolicy);

    }
}

