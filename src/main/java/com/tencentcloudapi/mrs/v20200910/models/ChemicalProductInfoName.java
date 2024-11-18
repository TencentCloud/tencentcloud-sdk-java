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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChemicalProductInfoName extends AbstractModel {

    /**
    * 文本内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 通用名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GenericName")
    @Expose
    private String GenericName;

    /**
    * 品牌名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BarndName")
    @Expose
    private String BarndName;

    /**
    * 英文名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnName")
    @Expose
    private String EnName;

    /**
    * 拼音
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Pinyin")
    @Expose
    private String Pinyin;

    /**
    * 品牌名
    */
    @SerializedName("BrandName")
    @Expose
    private String BrandName;

    /**
     * Get 文本内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Text 文本内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 文本内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param Text 文本内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 通用名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GenericName 通用名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGenericName() {
        return this.GenericName;
    }

    /**
     * Set 通用名
注意：此字段可能返回 null，表示取不到有效值。
     * @param GenericName 通用名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGenericName(String GenericName) {
        this.GenericName = GenericName;
    }

    /**
     * Get 品牌名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BarndName 品牌名
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public String getBarndName() {
        return this.BarndName;
    }

    /**
     * Set 品牌名
注意：此字段可能返回 null，表示取不到有效值。
     * @param BarndName 品牌名
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setBarndName(String BarndName) {
        this.BarndName = BarndName;
    }

    /**
     * Get 英文名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnName 英文名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEnName() {
        return this.EnName;
    }

    /**
     * Set 英文名
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnName 英文名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnName(String EnName) {
        this.EnName = EnName;
    }

    /**
     * Get 拼音
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Pinyin 拼音
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPinyin() {
        return this.Pinyin;
    }

    /**
     * Set 拼音
注意：此字段可能返回 null，表示取不到有效值。
     * @param Pinyin 拼音
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPinyin(String Pinyin) {
        this.Pinyin = Pinyin;
    }

    /**
     * Get 品牌名 
     * @return BrandName 品牌名
     */
    public String getBrandName() {
        return this.BrandName;
    }

    /**
     * Set 品牌名
     * @param BrandName 品牌名
     */
    public void setBrandName(String BrandName) {
        this.BrandName = BrandName;
    }

    public ChemicalProductInfoName() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChemicalProductInfoName(ChemicalProductInfoName source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.GenericName != null) {
            this.GenericName = new String(source.GenericName);
        }
        if (source.BarndName != null) {
            this.BarndName = new String(source.BarndName);
        }
        if (source.EnName != null) {
            this.EnName = new String(source.EnName);
        }
        if (source.Pinyin != null) {
            this.Pinyin = new String(source.Pinyin);
        }
        if (source.BrandName != null) {
            this.BrandName = new String(source.BrandName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "GenericName", this.GenericName);
        this.setParamSimple(map, prefix + "BarndName", this.BarndName);
        this.setParamSimple(map, prefix + "EnName", this.EnName);
        this.setParamSimple(map, prefix + "Pinyin", this.Pinyin);
        this.setParamSimple(map, prefix + "BrandName", this.BrandName);

    }
}

