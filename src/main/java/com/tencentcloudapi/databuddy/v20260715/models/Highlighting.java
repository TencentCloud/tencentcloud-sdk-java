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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Highlighting extends AbstractModel {

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 描述
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 片段
    */
    @SerializedName("TextFragments")
    @Expose
    private Fragment [] TextFragments;

    /**
     * Get 名称 
     * @return Name 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
     * @param Name 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 描述 
     * @return Comment 描述
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 描述
     * @param Comment 描述
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 片段 
     * @return TextFragments 片段
     */
    public Fragment [] getTextFragments() {
        return this.TextFragments;
    }

    /**
     * Set 片段
     * @param TextFragments 片段
     */
    public void setTextFragments(Fragment [] TextFragments) {
        this.TextFragments = TextFragments;
    }

    public Highlighting() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Highlighting(Highlighting source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.TextFragments != null) {
            this.TextFragments = new Fragment[source.TextFragments.length];
            for (int i = 0; i < source.TextFragments.length; i++) {
                this.TextFragments[i] = new Fragment(source.TextFragments[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamArrayObj(map, prefix + "TextFragments.", this.TextFragments);

    }
}

