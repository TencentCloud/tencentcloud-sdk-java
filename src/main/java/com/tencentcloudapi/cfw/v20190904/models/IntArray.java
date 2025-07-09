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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IntArray extends AbstractModel {

    /**
    * 数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("List")
    @Expose
    private Long [] List;

    /**
     * Get 数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return List 数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getList() {
        return this.List;
    }

    /**
     * Set 数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param List 数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setList(Long [] List) {
        this.List = List;
    }

    public IntArray() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IntArray(IntArray source) {
        if (source.List != null) {
            this.List = new Long[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new Long(source.List[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "List.", this.List);

    }
}

