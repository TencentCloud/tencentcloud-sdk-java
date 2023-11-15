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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ElementProfilePageRes extends AbstractModel {

    /**
    * 构件总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 构件列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("List")
    @Expose
    private ElementProfile [] List;

    /**
     * Get 构件总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount 构件总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 构件总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount 构件总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 构件列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return List 构件列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ElementProfile [] getList() {
        return this.List;
    }

    /**
     * Set 构件列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param List 构件列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setList(ElementProfile [] List) {
        this.List = List;
    }

    public ElementProfilePageRes() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ElementProfilePageRes(ElementProfilePageRes source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.List != null) {
            this.List = new ElementProfile[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new ElementProfile(source.List[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "List.", this.List);

    }
}

