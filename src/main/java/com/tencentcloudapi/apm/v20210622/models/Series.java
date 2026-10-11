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

public class Series extends AbstractModel {

    /**
    * 耗时列表信息
    */
    @SerializedName("Data")
    @Expose
    private Long [] Data;

    /**
    * 描述
    */
    @SerializedName("Stack")
    @Expose
    private String Stack;

    /**
    * 字段名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 耗时列表信息 
     * @return Data 耗时列表信息
     */
    public Long [] getData() {
        return this.Data;
    }

    /**
     * Set 耗时列表信息
     * @param Data 耗时列表信息
     */
    public void setData(Long [] Data) {
        this.Data = Data;
    }

    /**
     * Get 描述 
     * @return Stack 描述
     */
    public String getStack() {
        return this.Stack;
    }

    /**
     * Set 描述
     * @param Stack 描述
     */
    public void setStack(String Stack) {
        this.Stack = Stack;
    }

    /**
     * Get 字段名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 字段名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 字段名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 字段名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public Series() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Series(Series source) {
        if (source.Data != null) {
            this.Data = new Long[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new Long(source.Data[i]);
            }
        }
        if (source.Stack != null) {
            this.Stack = new String(source.Stack);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "Stack", this.Stack);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

