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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogicalType extends AbstractModel {

    /**
    * 类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 是否允许为空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NullAble")
    @Expose
    private Boolean NullAble;

    /**
    * 长度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Length")
    @Expose
    private Long Length;

    /**
     * Get 类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 是否允许为空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NullAble 是否允许为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getNullAble() {
        return this.NullAble;
    }

    /**
     * Set 是否允许为空
注意：此字段可能返回 null，表示取不到有效值。
     * @param NullAble 是否允许为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNullAble(Boolean NullAble) {
        this.NullAble = NullAble;
    }

    /**
     * Get 长度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Length 长度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLength() {
        return this.Length;
    }

    /**
     * Set 长度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Length 长度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLength(Long Length) {
        this.Length = Length;
    }

    public LogicalType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogicalType(LogicalType source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.NullAble != null) {
            this.NullAble = new Boolean(source.NullAble);
        }
        if (source.Length != null) {
            this.Length = new Long(source.Length);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "NullAble", this.NullAble);
        this.setParamSimple(map, prefix + "Length", this.Length);

    }
}

