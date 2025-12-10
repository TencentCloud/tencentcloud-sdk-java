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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchMediaBySemanticsRequest extends AbstractModel {

    /**
    * <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 需要进行搜索的内容
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 返回的记录条数，默认值：20。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 文件类型。匹配集合中的任意元素： <li>Video: 视频文件</li> <li>Audio: 音频文件</li> <li>Image: 图片文件</li>
    */
    @SerializedName("Categories")
    @Expose
    private String [] Categories;

    /**
    * 标签集合，匹配集合中任意元素。 <li>单个标签长度限制：32个字符。</li> <li>数组长度限制：16。</li>
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * 搜索的任务类型，可选值有： 
- AiAnalysis.DescriptionTask 
- SmartSubtitle.AsrFullTextTask
    */
    @SerializedName("TaskTypes")
    @Expose
    private String [] TaskTypes;

    /**
     * Get <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b> 
     * @return SubAppId <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>
     * @param SubAppId <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get 需要进行搜索的内容 
     * @return Text 需要进行搜索的内容
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 需要进行搜索的内容
     * @param Text 需要进行搜索的内容
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 返回的记录条数，默认值：20。 
     * @return Limit 返回的记录条数，默认值：20。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回的记录条数，默认值：20。
     * @param Limit 返回的记录条数，默认值：20。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 文件类型。匹配集合中的任意元素： <li>Video: 视频文件</li> <li>Audio: 音频文件</li> <li>Image: 图片文件</li> 
     * @return Categories 文件类型。匹配集合中的任意元素： <li>Video: 视频文件</li> <li>Audio: 音频文件</li> <li>Image: 图片文件</li>
     */
    public String [] getCategories() {
        return this.Categories;
    }

    /**
     * Set 文件类型。匹配集合中的任意元素： <li>Video: 视频文件</li> <li>Audio: 音频文件</li> <li>Image: 图片文件</li>
     * @param Categories 文件类型。匹配集合中的任意元素： <li>Video: 视频文件</li> <li>Audio: 音频文件</li> <li>Image: 图片文件</li>
     */
    public void setCategories(String [] Categories) {
        this.Categories = Categories;
    }

    /**
     * Get 标签集合，匹配集合中任意元素。 <li>单个标签长度限制：32个字符。</li> <li>数组长度限制：16。</li> 
     * @return Tags 标签集合，匹配集合中任意元素。 <li>单个标签长度限制：32个字符。</li> <li>数组长度限制：16。</li>
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签集合，匹配集合中任意元素。 <li>单个标签长度限制：32个字符。</li> <li>数组长度限制：16。</li>
     * @param Tags 标签集合，匹配集合中任意元素。 <li>单个标签长度限制：32个字符。</li> <li>数组长度限制：16。</li>
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 搜索的任务类型，可选值有： 
- AiAnalysis.DescriptionTask 
- SmartSubtitle.AsrFullTextTask 
     * @return TaskTypes 搜索的任务类型，可选值有： 
- AiAnalysis.DescriptionTask 
- SmartSubtitle.AsrFullTextTask
     */
    public String [] getTaskTypes() {
        return this.TaskTypes;
    }

    /**
     * Set 搜索的任务类型，可选值有： 
- AiAnalysis.DescriptionTask 
- SmartSubtitle.AsrFullTextTask
     * @param TaskTypes 搜索的任务类型，可选值有： 
- AiAnalysis.DescriptionTask 
- SmartSubtitle.AsrFullTextTask
     */
    public void setTaskTypes(String [] TaskTypes) {
        this.TaskTypes = TaskTypes;
    }

    public SearchMediaBySemanticsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchMediaBySemanticsRequest(SearchMediaBySemanticsRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Categories != null) {
            this.Categories = new String[source.Categories.length];
            for (int i = 0; i < source.Categories.length; i++) {
                this.Categories[i] = new String(source.Categories[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.TaskTypes != null) {
            this.TaskTypes = new String[source.TaskTypes.length];
            for (int i = 0; i < source.TaskTypes.length; i++) {
                this.TaskTypes[i] = new String(source.TaskTypes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "Categories.", this.Categories);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamArraySimple(map, prefix + "TaskTypes.", this.TaskTypes);

    }
}

