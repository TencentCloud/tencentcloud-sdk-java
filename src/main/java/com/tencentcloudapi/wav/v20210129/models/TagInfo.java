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
package com.tencentcloudapi.wav.v20210129.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TagInfo extends AbstractModel{

    /**
    * 标签名称, 最大长度限制15个字符
    */
    @SerializedName("TagName")
    @Expose
    private String TagName;

    /**
    * 标签组排序,值越大,排序越靠前
    */
    @SerializedName("Sort")
    @Expose
    private Long Sort;

    /**
     * Get 标签名称, 最大长度限制15个字符 
     * @return TagName 标签名称, 最大长度限制15个字符
     */
    public String getTagName() {
        return this.TagName;
    }

    /**
     * Set 标签名称, 最大长度限制15个字符
     * @param TagName 标签名称, 最大长度限制15个字符
     */
    public void setTagName(String TagName) {
        this.TagName = TagName;
    }

    /**
     * Get 标签组排序,值越大,排序越靠前 
     * @return Sort 标签组排序,值越大,排序越靠前
     */
    public Long getSort() {
        return this.Sort;
    }

    /**
     * Set 标签组排序,值越大,排序越靠前
     * @param Sort 标签组排序,值越大,排序越靠前
     */
    public void setSort(Long Sort) {
        this.Sort = Sort;
    }

    public TagInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TagInfo(TagInfo source) {
        if (source.TagName != null) {
            this.TagName = new String(source.TagName);
        }
        if (source.Sort != null) {
            this.Sort = new Long(source.Sort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TagName", this.TagName);
        this.setParamSimple(map, prefix + "Sort", this.Sort);

    }
}

