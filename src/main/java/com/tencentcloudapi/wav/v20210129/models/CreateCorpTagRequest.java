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

public class CreateCorpTagRequest extends AbstractModel{

    /**
    * 标签组名称，最长为15个字符
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 标签信息数组
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * 标签组次序值。sort值大的排序靠前。有效的值范围是[0, 2^32)
    */
    @SerializedName("Sort")
    @Expose
    private Long Sort;

    /**
     * Get 标签组名称，最长为15个字符 
     * @return GroupName 标签组名称，最长为15个字符
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 标签组名称，最长为15个字符
     * @param GroupName 标签组名称，最长为15个字符
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 标签信息数组 
     * @return Tags 标签信息数组
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签信息数组
     * @param Tags 标签信息数组
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 标签组次序值。sort值大的排序靠前。有效的值范围是[0, 2^32) 
     * @return Sort 标签组次序值。sort值大的排序靠前。有效的值范围是[0, 2^32)
     */
    public Long getSort() {
        return this.Sort;
    }

    /**
     * Set 标签组次序值。sort值大的排序靠前。有效的值范围是[0, 2^32)
     * @param Sort 标签组次序值。sort值大的排序靠前。有效的值范围是[0, 2^32)
     */
    public void setSort(Long Sort) {
        this.Sort = Sort;
    }

    public CreateCorpTagRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCorpTagRequest(CreateCorpTagRequest source) {
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
        if (source.Sort != null) {
            this.Sort = new Long(source.Sort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Sort", this.Sort);

    }
}

