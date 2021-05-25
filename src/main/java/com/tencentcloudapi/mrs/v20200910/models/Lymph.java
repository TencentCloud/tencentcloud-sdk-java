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

public class Lymph extends AbstractModel{

    /**
    * 原文
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Src")
    @Expose
    private String Src;

    /**
    * 原文位置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Index")
    @Expose
    private Long [] Index;

    /**
    * 部位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Part")
    @Expose
    private Part Part;

    /**
    * 总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 转移数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TransferNum")
    @Expose
    private Long TransferNum;

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
     * Get 总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Total 总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Total 总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 转移数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TransferNum 转移数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTransferNum() {
        return this.TransferNum;
    }

    /**
     * Set 转移数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TransferNum 转移数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTransferNum(Long TransferNum) {
        this.TransferNum = TransferNum;
    }

    public Lymph() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Lymph(Lymph source) {
        if (source.Src != null) {
            this.Src = new String(source.Src);
        }
        if (source.Index != null) {
            this.Index = new Long[source.Index.length];
            for (int i = 0; i < source.Index.length; i++) {
                this.Index[i] = new Long(source.Index[i]);
            }
        }
        if (source.Part != null) {
            this.Part = new Part(source.Part);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.TransferNum != null) {
            this.TransferNum = new Long(source.TransferNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Src", this.Src);
        this.setParamArraySimple(map, prefix + "Index.", this.Index);
        this.setParamObj(map, prefix + "Part.", this.Part);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "TransferNum", this.TransferNum);

    }
}

