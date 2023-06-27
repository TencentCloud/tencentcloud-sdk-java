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
package com.tencentcloudapi.nlp.v20190408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClassifyContentRequest extends AbstractModel{

    /**
    * 待分类的文章的标题（仅支持UTF-8格式，不超过100字符）。
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 待分类文章的内容, 每个元素对应一个段落。（仅支持UTF-8格式，文章内容长度总和不超过2000字符）
    */
    @SerializedName("Content")
    @Expose
    private String [] Content;

    /**
     * Get 待分类的文章的标题（仅支持UTF-8格式，不超过100字符）。 
     * @return Title 待分类的文章的标题（仅支持UTF-8格式，不超过100字符）。
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 待分类的文章的标题（仅支持UTF-8格式，不超过100字符）。
     * @param Title 待分类的文章的标题（仅支持UTF-8格式，不超过100字符）。
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 待分类文章的内容, 每个元素对应一个段落。（仅支持UTF-8格式，文章内容长度总和不超过2000字符） 
     * @return Content 待分类文章的内容, 每个元素对应一个段落。（仅支持UTF-8格式，文章内容长度总和不超过2000字符）
     */
    public String [] getContent() {
        return this.Content;
    }

    /**
     * Set 待分类文章的内容, 每个元素对应一个段落。（仅支持UTF-8格式，文章内容长度总和不超过2000字符）
     * @param Content 待分类文章的内容, 每个元素对应一个段落。（仅支持UTF-8格式，文章内容长度总和不超过2000字符）
     */
    public void setContent(String [] Content) {
        this.Content = Content;
    }

    public ClassifyContentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClassifyContentRequest(ClassifyContentRequest source) {
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Content != null) {
            this.Content = new String[source.Content.length];
            for (int i = 0; i < source.Content.length; i++) {
                this.Content[i] = new String(source.Content[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamArraySimple(map, prefix + "Content.", this.Content);

    }
}

