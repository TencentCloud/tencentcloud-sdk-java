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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTemplateListRequest extends AbstractModel{

    /**
    * 分页Limit, 最大值100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页Offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 演练名称
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 标签键
    */
    @SerializedName("Tag")
    @Expose
    private String [] Tag;

    /**
    * 状态，1---使用中， 2---停用
    */
    @SerializedName("IsUsed")
    @Expose
    private Long IsUsed;

    /**
    * 标签对
    */
    @SerializedName("Tags")
    @Expose
    private TagWithDescribe [] Tags;

    /**
     * Get 分页Limit, 最大值100 
     * @return Limit 分页Limit, 最大值100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页Limit, 最大值100
     * @param Limit 分页Limit, 最大值100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页Offset 
     * @return Offset 分页Offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页Offset
     * @param Offset 分页Offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 演练名称 
     * @return Title 演练名称
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 演练名称
     * @param Title 演练名称
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 标签键 
     * @return Tag 标签键
     */
    public String [] getTag() {
        return this.Tag;
    }

    /**
     * Set 标签键
     * @param Tag 标签键
     */
    public void setTag(String [] Tag) {
        this.Tag = Tag;
    }

    /**
     * Get 状态，1---使用中， 2---停用 
     * @return IsUsed 状态，1---使用中， 2---停用
     */
    public Long getIsUsed() {
        return this.IsUsed;
    }

    /**
     * Set 状态，1---使用中， 2---停用
     * @param IsUsed 状态，1---使用中， 2---停用
     */
    public void setIsUsed(Long IsUsed) {
        this.IsUsed = IsUsed;
    }

    /**
     * Get 标签对 
     * @return Tags 标签对
     */
    public TagWithDescribe [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签对
     * @param Tags 标签对
     */
    public void setTags(TagWithDescribe [] Tags) {
        this.Tags = Tags;
    }

    public DescribeTemplateListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTemplateListRequest(DescribeTemplateListRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Tag != null) {
            this.Tag = new String[source.Tag.length];
            for (int i = 0; i < source.Tag.length; i++) {
                this.Tag[i] = new String(source.Tag[i]);
            }
        }
        if (source.IsUsed != null) {
            this.IsUsed = new Long(source.IsUsed);
        }
        if (source.Tags != null) {
            this.Tags = new TagWithDescribe[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagWithDescribe(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamArraySimple(map, prefix + "Tag.", this.Tag);
        this.setParamSimple(map, prefix + "IsUsed", this.IsUsed);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

