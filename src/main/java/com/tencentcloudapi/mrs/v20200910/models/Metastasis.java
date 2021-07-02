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

public class Metastasis extends AbstractModel{

    /**
    * 索引位置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Index")
    @Expose
    private Long Index;

    /**
    * 原文
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 部位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Part")
    @Expose
    private String Part;

    /**
    * 局部总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalNum")
    @Expose
    private String TotalNum;

    /**
    * 转移数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TransferNum")
    @Expose
    private String TransferNum;

    /**
     * Get 索引位置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Index 索引位置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIndex() {
        return this.Index;
    }

    /**
     * Set 索引位置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Index 索引位置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndex(Long Index) {
        this.Index = Index;
    }

    /**
     * Get 原文
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Text 原文
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 原文
注意：此字段可能返回 null，表示取不到有效值。
     * @param Text 原文
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 部位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Part 部位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPart() {
        return this.Part;
    }

    /**
     * Set 部位
注意：此字段可能返回 null，表示取不到有效值。
     * @param Part 部位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPart(String Part) {
        this.Part = Part;
    }

    /**
     * Get 局部总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalNum 局部总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTotalNum() {
        return this.TotalNum;
    }

    /**
     * Set 局部总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalNum 局部总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalNum(String TotalNum) {
        this.TotalNum = TotalNum;
    }

    /**
     * Get 转移数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TransferNum 转移数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTransferNum() {
        return this.TransferNum;
    }

    /**
     * Set 转移数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param TransferNum 转移数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTransferNum(String TransferNum) {
        this.TransferNum = TransferNum;
    }

    public Metastasis() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Metastasis(Metastasis source) {
        if (source.Index != null) {
            this.Index = new Long(source.Index);
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.Part != null) {
            this.Part = new String(source.Part);
        }
        if (source.TotalNum != null) {
            this.TotalNum = new String(source.TotalNum);
        }
        if (source.TransferNum != null) {
            this.TransferNum = new String(source.TransferNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "Part", this.Part);
        this.setParamSimple(map, prefix + "TotalNum", this.TotalNum);
        this.setParamSimple(map, prefix + "TransferNum", this.TransferNum);

    }
}

