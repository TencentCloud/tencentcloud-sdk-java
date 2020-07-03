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

public class TextEduPaper extends AbstractModel{

    /**
    * 识别出的字段名称（关键字）
    */
    @SerializedName("Item")
    @Expose
    private String Item;

    /**
    * 识别出的字段名称对应的值，也就是字段Item对应的字符串结果
    */
    @SerializedName("DetectedText")
    @Expose
    private String DetectedText;

    /**
    * 文本行在旋转纠正之后的图像中的像素坐标，表示为（左上角x, 左上角y，宽width，高height）
    */
    @SerializedName("Itemcoord")
    @Expose
    private ItemCoord Itemcoord;

    /**
     * Get 识别出的字段名称（关键字） 
     * @return Item 识别出的字段名称（关键字）
     */
    public String getItem() {
        return this.Item;
    }

    /**
     * Set 识别出的字段名称（关键字）
     * @param Item 识别出的字段名称（关键字）
     */
    public void setItem(String Item) {
        this.Item = Item;
    }

    /**
     * Get 识别出的字段名称对应的值，也就是字段Item对应的字符串结果 
     * @return DetectedText 识别出的字段名称对应的值，也就是字段Item对应的字符串结果
     */
    public String getDetectedText() {
        return this.DetectedText;
    }

    /**
     * Set 识别出的字段名称对应的值，也就是字段Item对应的字符串结果
     * @param DetectedText 识别出的字段名称对应的值，也就是字段Item对应的字符串结果
     */
    public void setDetectedText(String DetectedText) {
        this.DetectedText = DetectedText;
    }

    /**
     * Get 文本行在旋转纠正之后的图像中的像素坐标，表示为（左上角x, 左上角y，宽width，高height） 
     * @return Itemcoord 文本行在旋转纠正之后的图像中的像素坐标，表示为（左上角x, 左上角y，宽width，高height）
     */
    public ItemCoord getItemcoord() {
        return this.Itemcoord;
    }

    /**
     * Set 文本行在旋转纠正之后的图像中的像素坐标，表示为（左上角x, 左上角y，宽width，高height）
     * @param Itemcoord 文本行在旋转纠正之后的图像中的像素坐标，表示为（左上角x, 左上角y，宽width，高height）
     */
    public void setItemcoord(ItemCoord Itemcoord) {
        this.Itemcoord = Itemcoord;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Item", this.Item);
        this.setParamSimple(map, prefix + "DetectedText", this.DetectedText);
        this.setParamObj(map, prefix + "Itemcoord.", this.Itemcoord);

    }
}

