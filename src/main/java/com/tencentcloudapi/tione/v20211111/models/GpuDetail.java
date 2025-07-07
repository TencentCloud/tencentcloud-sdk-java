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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GpuDetail extends AbstractModel {

    /**
    * GPU 显卡类型；枚举值: V100 A100 T4
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * GPU 显卡数；单位为1/100卡，比如100代表1卡
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Value")
    @Expose
    private Long Value;

    /**
     * Get GPU 显卡类型；枚举值: V100 A100 T4
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name GPU 显卡类型；枚举值: V100 A100 T4
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set GPU 显卡类型；枚举值: V100 A100 T4
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name GPU 显卡类型；枚举值: V100 A100 T4
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get GPU 显卡数；单位为1/100卡，比如100代表1卡
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Value GPU 显卡数；单位为1/100卡，比如100代表1卡
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getValue() {
        return this.Value;
    }

    /**
     * Set GPU 显卡数；单位为1/100卡，比如100代表1卡
注意：此字段可能返回 null，表示取不到有效值。
     * @param Value GPU 显卡数；单位为1/100卡，比如100代表1卡
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValue(Long Value) {
        this.Value = Value;
    }

    public GpuDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GpuDetail(GpuDetail source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Value != null) {
            this.Value = new Long(source.Value);
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

