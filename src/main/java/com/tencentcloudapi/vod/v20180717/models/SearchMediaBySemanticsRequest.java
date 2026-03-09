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
    * <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>需要进行搜索的内容</p>
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * <p>返回的记录条数，默认值：20。</p><p>取值范围：[1, 100]</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>文件类型。匹配集合中的任意元素： <li>Video: 视频文件</li> <li>Audio: 音频文件</li> <li>Image: 图片文件</li></p>
    */
    @SerializedName("Categories")
    @Expose
    private String [] Categories;

    /**
    * <p>标签集合，匹配集合中任意元素。</p><p>入参限制：单个标签长度限制：32个字符。数组长度限制：16。</p>
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * <p>人物集合，匹配出现了所有传入人物的片段</p><p>入参限制：数组长度限制：16</p>
    */
    @SerializedName("Persons")
    @Expose
    private String [] Persons;

    /**
    * <p>搜索的任务类型，可选值有： </p><ul><li>AiAnalysis.DescriptionTask </li><li>SmartSubtitle.AsrFullTextTask</li></ul>
    */
    @SerializedName("TaskTypes")
    @Expose
    private String [] TaskTypes;

    /**
     * Get <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p> 
     * @return SubAppId <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
     * @param SubAppId <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>需要进行搜索的内容</p> 
     * @return Text <p>需要进行搜索的内容</p>
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set <p>需要进行搜索的内容</p>
     * @param Text <p>需要进行搜索的内容</p>
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get <p>返回的记录条数，默认值：20。</p><p>取值范围：[1, 100]</p> 
     * @return Limit <p>返回的记录条数，默认值：20。</p><p>取值范围：[1, 100]</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>返回的记录条数，默认值：20。</p><p>取值范围：[1, 100]</p>
     * @param Limit <p>返回的记录条数，默认值：20。</p><p>取值范围：[1, 100]</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>文件类型。匹配集合中的任意元素： <li>Video: 视频文件</li> <li>Audio: 音频文件</li> <li>Image: 图片文件</li></p> 
     * @return Categories <p>文件类型。匹配集合中的任意元素： <li>Video: 视频文件</li> <li>Audio: 音频文件</li> <li>Image: 图片文件</li></p>
     */
    public String [] getCategories() {
        return this.Categories;
    }

    /**
     * Set <p>文件类型。匹配集合中的任意元素： <li>Video: 视频文件</li> <li>Audio: 音频文件</li> <li>Image: 图片文件</li></p>
     * @param Categories <p>文件类型。匹配集合中的任意元素： <li>Video: 视频文件</li> <li>Audio: 音频文件</li> <li>Image: 图片文件</li></p>
     */
    public void setCategories(String [] Categories) {
        this.Categories = Categories;
    }

    /**
     * Get <p>标签集合，匹配集合中任意元素。</p><p>入参限制：单个标签长度限制：32个字符。数组长度限制：16。</p> 
     * @return Tags <p>标签集合，匹配集合中任意元素。</p><p>入参限制：单个标签长度限制：32个字符。数组长度限制：16。</p>
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签集合，匹配集合中任意元素。</p><p>入参限制：单个标签长度限制：32个字符。数组长度限制：16。</p>
     * @param Tags <p>标签集合，匹配集合中任意元素。</p><p>入参限制：单个标签长度限制：32个字符。数组长度限制：16。</p>
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>人物集合，匹配出现了所有传入人物的片段</p><p>入参限制：数组长度限制：16</p> 
     * @return Persons <p>人物集合，匹配出现了所有传入人物的片段</p><p>入参限制：数组长度限制：16</p>
     */
    public String [] getPersons() {
        return this.Persons;
    }

    /**
     * Set <p>人物集合，匹配出现了所有传入人物的片段</p><p>入参限制：数组长度限制：16</p>
     * @param Persons <p>人物集合，匹配出现了所有传入人物的片段</p><p>入参限制：数组长度限制：16</p>
     */
    public void setPersons(String [] Persons) {
        this.Persons = Persons;
    }

    /**
     * Get <p>搜索的任务类型，可选值有： </p><ul><li>AiAnalysis.DescriptionTask </li><li>SmartSubtitle.AsrFullTextTask</li></ul> 
     * @return TaskTypes <p>搜索的任务类型，可选值有： </p><ul><li>AiAnalysis.DescriptionTask </li><li>SmartSubtitle.AsrFullTextTask</li></ul>
     */
    public String [] getTaskTypes() {
        return this.TaskTypes;
    }

    /**
     * Set <p>搜索的任务类型，可选值有： </p><ul><li>AiAnalysis.DescriptionTask </li><li>SmartSubtitle.AsrFullTextTask</li></ul>
     * @param TaskTypes <p>搜索的任务类型，可选值有： </p><ul><li>AiAnalysis.DescriptionTask </li><li>SmartSubtitle.AsrFullTextTask</li></ul>
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
        if (source.Persons != null) {
            this.Persons = new String[source.Persons.length];
            for (int i = 0; i < source.Persons.length; i++) {
                this.Persons[i] = new String(source.Persons[i]);
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
        this.setParamArraySimple(map, prefix + "Persons.", this.Persons);
        this.setParamArraySimple(map, prefix + "TaskTypes.", this.TaskTypes);

    }
}

