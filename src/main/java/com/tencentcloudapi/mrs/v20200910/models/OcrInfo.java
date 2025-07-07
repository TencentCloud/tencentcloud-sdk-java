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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OcrInfo extends AbstractModel {

    /**
    * 图片进行OCR之后得到的所有包含字块的OCR信息
    */
    @SerializedName("Items")
    @Expose
    private OcrItem [] Items;

    /**
    * 图片进行OCR之后得到的所有字符
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
     * Get 图片进行OCR之后得到的所有包含字块的OCR信息 
     * @return Items 图片进行OCR之后得到的所有包含字块的OCR信息
     */
    public OcrItem [] getItems() {
        return this.Items;
    }

    /**
     * Set 图片进行OCR之后得到的所有包含字块的OCR信息
     * @param Items 图片进行OCR之后得到的所有包含字块的OCR信息
     */
    public void setItems(OcrItem [] Items) {
        this.Items = Items;
    }

    /**
     * Get 图片进行OCR之后得到的所有字符 
     * @return Text 图片进行OCR之后得到的所有字符
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 图片进行OCR之后得到的所有字符
     * @param Text 图片进行OCR之后得到的所有字符
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    public OcrInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OcrInfo(OcrInfo source) {
        if (source.Items != null) {
            this.Items = new OcrItem[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new OcrItem(source.Items[i]);
            }
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "Text", this.Text);

    }
}

