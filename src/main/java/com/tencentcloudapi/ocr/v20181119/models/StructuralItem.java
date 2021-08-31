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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StructuralItem extends AbstractModel{

    /**
    * 识别出的字段名称(关键字)。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 识别出的字段名称对应的值。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 置信度 0 ~100。
    */
    @SerializedName("Confidence")
    @Expose
    private Long Confidence;

    /**
    * 文本行在旋转纠正之后的图像中的像素
坐标。
    */
    @SerializedName("ItemCoord")
    @Expose
    private ItemCoord ItemCoord;

    /**
     * Get 识别出的字段名称(关键字)。 
     * @return Name 识别出的字段名称(关键字)。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 识别出的字段名称(关键字)。
     * @param Name 识别出的字段名称(关键字)。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 识别出的字段名称对应的值。 
     * @return Value 识别出的字段名称对应的值。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 识别出的字段名称对应的值。
     * @param Value 识别出的字段名称对应的值。
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 置信度 0 ~100。 
     * @return Confidence 置信度 0 ~100。
     */
    public Long getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 置信度 0 ~100。
     * @param Confidence 置信度 0 ~100。
     */
    public void setConfidence(Long Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get 文本行在旋转纠正之后的图像中的像素
坐标。 
     * @return ItemCoord 文本行在旋转纠正之后的图像中的像素
坐标。
     */
    public ItemCoord getItemCoord() {
        return this.ItemCoord;
    }

    /**
     * Set 文本行在旋转纠正之后的图像中的像素
坐标。
     * @param ItemCoord 文本行在旋转纠正之后的图像中的像素
坐标。
     */
    public void setItemCoord(ItemCoord ItemCoord) {
        this.ItemCoord = ItemCoord;
    }

    public StructuralItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StructuralItem(StructuralItem source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Confidence != null) {
            this.Confidence = new Long(source.Confidence);
        }
        if (source.ItemCoord != null) {
            this.ItemCoord = new ItemCoord(source.ItemCoord);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamObj(map, prefix + "ItemCoord.", this.ItemCoord);

    }
}

