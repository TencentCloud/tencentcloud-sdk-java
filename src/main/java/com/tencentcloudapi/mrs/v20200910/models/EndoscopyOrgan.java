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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EndoscopyOrgan extends AbstractModel{

    /**
    * 部位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Part")
    @Expose
    private Part Part;

    /**
    * 原文位置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Index")
    @Expose
    private Long [] Index;

    /**
    * 原文
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Src")
    @Expose
    private String Src;

    /**
    * 部位别名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PartAlias")
    @Expose
    private String PartAlias;

    /**
    * 症状描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SymDescList")
    @Expose
    private BlockInfo [] SymDescList;

    /**
     * Get 部位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Part 部位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Part getPart() {
        return this.Part;
    }

    /**
     * Set 部位
注意：此字段可能返回 null，表示取不到有效值。
     * @param Part 部位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPart(Part Part) {
        this.Part = Part;
    }

    /**
     * Get 原文位置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Index 原文位置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getIndex() {
        return this.Index;
    }

    /**
     * Set 原文位置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Index 原文位置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndex(Long [] Index) {
        this.Index = Index;
    }

    /**
     * Get 原文
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Src 原文
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSrc() {
        return this.Src;
    }

    /**
     * Set 原文
注意：此字段可能返回 null，表示取不到有效值。
     * @param Src 原文
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSrc(String Src) {
        this.Src = Src;
    }

    /**
     * Get 部位别名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PartAlias 部位别名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPartAlias() {
        return this.PartAlias;
    }

    /**
     * Set 部位别名
注意：此字段可能返回 null，表示取不到有效值。
     * @param PartAlias 部位别名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPartAlias(String PartAlias) {
        this.PartAlias = PartAlias;
    }

    /**
     * Get 症状描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SymDescList 症状描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo [] getSymDescList() {
        return this.SymDescList;
    }

    /**
     * Set 症状描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param SymDescList 症状描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSymDescList(BlockInfo [] SymDescList) {
        this.SymDescList = SymDescList;
    }

    public EndoscopyOrgan() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EndoscopyOrgan(EndoscopyOrgan source) {
        if (source.Part != null) {
            this.Part = new Part(source.Part);
        }
        if (source.Index != null) {
            this.Index = new Long[source.Index.length];
            for (int i = 0; i < source.Index.length; i++) {
                this.Index[i] = new Long(source.Index[i]);
            }
        }
        if (source.Src != null) {
            this.Src = new String(source.Src);
        }
        if (source.PartAlias != null) {
            this.PartAlias = new String(source.PartAlias);
        }
        if (source.SymDescList != null) {
            this.SymDescList = new BlockInfo[source.SymDescList.length];
            for (int i = 0; i < source.SymDescList.length; i++) {
                this.SymDescList[i] = new BlockInfo(source.SymDescList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Part.", this.Part);
        this.setParamArraySimple(map, prefix + "Index.", this.Index);
        this.setParamSimple(map, prefix + "Src", this.Src);
        this.setParamSimple(map, prefix + "PartAlias", this.PartAlias);
        this.setParamArrayObj(map, prefix + "SymDescList.", this.SymDescList);

    }
}

