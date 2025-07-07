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

public class TextTypeListBlock extends AbstractModel {

    /**
    * 文本类型列表
    */
    @SerializedName("TextTypeList")
    @Expose
    private TextType [] TextTypeList;

    /**
    * 数据在原PDF文件中的第几页
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
     * Get 文本类型列表 
     * @return TextTypeList 文本类型列表
     */
    public TextType [] getTextTypeList() {
        return this.TextTypeList;
    }

    /**
     * Set 文本类型列表
     * @param TextTypeList 文本类型列表
     */
    public void setTextTypeList(TextType [] TextTypeList) {
        this.TextTypeList = TextTypeList;
    }

    /**
     * Get 数据在原PDF文件中的第几页 
     * @return Page 数据在原PDF文件中的第几页
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 数据在原PDF文件中的第几页
     * @param Page 数据在原PDF文件中的第几页
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    public TextTypeListBlock() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TextTypeListBlock(TextTypeListBlock source) {
        if (source.TextTypeList != null) {
            this.TextTypeList = new TextType[source.TextTypeList.length];
            for (int i = 0; i < source.TextTypeList.length; i++) {
                this.TextTypeList[i] = new TextType(source.TextTypeList[i]);
            }
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TextTypeList.", this.TextTypeList);
        this.setParamSimple(map, prefix + "Page", this.Page);

    }
}

