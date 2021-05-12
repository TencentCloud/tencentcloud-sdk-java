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
package com.tencentcloudapi.cms.v20190321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OCRDetect extends AbstractModel{

    /**
    * 识别到的详细信息
    */
    @SerializedName("Item")
    @Expose
    private OCRItem [] Item;

    /**
    * 识别到的文本信息
    */
    @SerializedName("TextInfo")
    @Expose
    private String TextInfo;

    /**
     * Get 识别到的详细信息 
     * @return Item 识别到的详细信息
     */
    public OCRItem [] getItem() {
        return this.Item;
    }

    /**
     * Set 识别到的详细信息
     * @param Item 识别到的详细信息
     */
    public void setItem(OCRItem [] Item) {
        this.Item = Item;
    }

    /**
     * Get 识别到的文本信息 
     * @return TextInfo 识别到的文本信息
     */
    public String getTextInfo() {
        return this.TextInfo;
    }

    /**
     * Set 识别到的文本信息
     * @param TextInfo 识别到的文本信息
     */
    public void setTextInfo(String TextInfo) {
        this.TextInfo = TextInfo;
    }

    public OCRDetect() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OCRDetect(OCRDetect source) {
        if (source.Item != null) {
            this.Item = new OCRItem[source.Item.length];
            for (int i = 0; i < source.Item.length; i++) {
                this.Item[i] = new OCRItem(source.Item[i]);
            }
        }
        if (source.TextInfo != null) {
            this.TextInfo = new String(source.TextInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Item.", this.Item);
        this.setParamSimple(map, prefix + "TextInfo", this.TextInfo);

    }
}

