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

public class Label extends AbstractModel {

    /**
    * 标签的键。有效标签键有两个部分：可选前缀和名称，以斜杠 (/) 分隔。名称部分是必需的，并且必须不超过 63 个字符，以字母数字字符 ([a-z0-9A-Z]) 开头和结尾，中间有破折号(-)、下划线(_)、点(.) 和字母数字。前缀是可选的。如果指定，前缀必须是 DNS 子域：一系列以点 (.) 分隔的 DNS 标签，总长度不超过 253 个字符，后跟斜杠 ( /)。

-  prefix 格式  `[a-z0-9]([-a-z0-9]*[a-z0-9])?(\.[a-z0-9]([-a-z0-9]*[a-z0-9])?)*`
-  name 格式 `([A-Za-z0-9][-A-Za-z0-9_.]*)?[A-Za-z0-9]`
- key不能重复
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 标签键值直接的比较关系。 不同业务场景支持的比较符不同，具体支持那些参考接口业务描述。
例如：`in`、`notin`
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Operate")
    @Expose
    private String Operate;

    /**
    * 标签的值.
- 最大支持63个字符。
- 格式：`([A-Za-z0-9][-A-Za-z0-9_.]*)?[A-Za-z0-9]`
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
     * Get 标签的键。有效标签键有两个部分：可选前缀和名称，以斜杠 (/) 分隔。名称部分是必需的，并且必须不超过 63 个字符，以字母数字字符 ([a-z0-9A-Z]) 开头和结尾，中间有破折号(-)、下划线(_)、点(.) 和字母数字。前缀是可选的。如果指定，前缀必须是 DNS 子域：一系列以点 (.) 分隔的 DNS 标签，总长度不超过 253 个字符，后跟斜杠 ( /)。

-  prefix 格式  `[a-z0-9]([-a-z0-9]*[a-z0-9])?(\.[a-z0-9]([-a-z0-9]*[a-z0-9])?)*`
-  name 格式 `([A-Za-z0-9][-A-Za-z0-9_.]*)?[A-Za-z0-9]`
- key不能重复
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Key 标签的键。有效标签键有两个部分：可选前缀和名称，以斜杠 (/) 分隔。名称部分是必需的，并且必须不超过 63 个字符，以字母数字字符 ([a-z0-9A-Z]) 开头和结尾，中间有破折号(-)、下划线(_)、点(.) 和字母数字。前缀是可选的。如果指定，前缀必须是 DNS 子域：一系列以点 (.) 分隔的 DNS 标签，总长度不超过 253 个字符，后跟斜杠 ( /)。

-  prefix 格式  `[a-z0-9]([-a-z0-9]*[a-z0-9])?(\.[a-z0-9]([-a-z0-9]*[a-z0-9])?)*`
-  name 格式 `([A-Za-z0-9][-A-Za-z0-9_.]*)?[A-Za-z0-9]`
- key不能重复
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 标签的键。有效标签键有两个部分：可选前缀和名称，以斜杠 (/) 分隔。名称部分是必需的，并且必须不超过 63 个字符，以字母数字字符 ([a-z0-9A-Z]) 开头和结尾，中间有破折号(-)、下划线(_)、点(.) 和字母数字。前缀是可选的。如果指定，前缀必须是 DNS 子域：一系列以点 (.) 分隔的 DNS 标签，总长度不超过 253 个字符，后跟斜杠 ( /)。

-  prefix 格式  `[a-z0-9]([-a-z0-9]*[a-z0-9])?(\.[a-z0-9]([-a-z0-9]*[a-z0-9])?)*`
-  name 格式 `([A-Za-z0-9][-A-Za-z0-9_.]*)?[A-Za-z0-9]`
- key不能重复
注意：此字段可能返回 null，表示取不到有效值。
     * @param Key 标签的键。有效标签键有两个部分：可选前缀和名称，以斜杠 (/) 分隔。名称部分是必需的，并且必须不超过 63 个字符，以字母数字字符 ([a-z0-9A-Z]) 开头和结尾，中间有破折号(-)、下划线(_)、点(.) 和字母数字。前缀是可选的。如果指定，前缀必须是 DNS 子域：一系列以点 (.) 分隔的 DNS 标签，总长度不超过 253 个字符，后跟斜杠 ( /)。

-  prefix 格式  `[a-z0-9]([-a-z0-9]*[a-z0-9])?(\.[a-z0-9]([-a-z0-9]*[a-z0-9])?)*`
-  name 格式 `([A-Za-z0-9][-A-Za-z0-9_.]*)?[A-Za-z0-9]`
- key不能重复
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 标签键值直接的比较关系。 不同业务场景支持的比较符不同，具体支持那些参考接口业务描述。
例如：`in`、`notin`
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Operate 标签键值直接的比较关系。 不同业务场景支持的比较符不同，具体支持那些参考接口业务描述。
例如：`in`、`notin`
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperate() {
        return this.Operate;
    }

    /**
     * Set 标签键值直接的比较关系。 不同业务场景支持的比较符不同，具体支持那些参考接口业务描述。
例如：`in`、`notin`
注意：此字段可能返回 null，表示取不到有效值。
     * @param Operate 标签键值直接的比较关系。 不同业务场景支持的比较符不同，具体支持那些参考接口业务描述。
例如：`in`、`notin`
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperate(String Operate) {
        this.Operate = Operate;
    }

    /**
     * Get 标签的值.
- 最大支持63个字符。
- 格式：`([A-Za-z0-9][-A-Za-z0-9_.]*)?[A-Za-z0-9]`
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Values 标签的值.
- 最大支持63个字符。
- 格式：`([A-Za-z0-9][-A-Za-z0-9_.]*)?[A-Za-z0-9]`
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set 标签的值.
- 最大支持63个字符。
- 格式：`([A-Za-z0-9][-A-Za-z0-9_.]*)?[A-Za-z0-9]`
注意：此字段可能返回 null，表示取不到有效值。
     * @param Values 标签的值.
- 最大支持63个字符。
- 格式：`([A-Za-z0-9][-A-Za-z0-9_.]*)?[A-Za-z0-9]`
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    public Label() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Label(Label source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Operate != null) {
            this.Operate = new String(source.Operate);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Operate", this.Operate);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);

    }
}

