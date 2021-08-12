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
package com.tencentcloudapi.ssa.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SocProductionItem extends AbstractModel{

    /**
    * 名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Index")
    @Expose
    private Long Index;

    /**
    * 状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Index 标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIndex() {
        return this.Index;
    }

    /**
     * Set 标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param Index 标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndex(Long Index) {
        this.Index = Index;
    }

    /**
     * Get 状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public SocProductionItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SocProductionItem(SocProductionItem source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Index != null) {
            this.Index = new Long(source.Index);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

