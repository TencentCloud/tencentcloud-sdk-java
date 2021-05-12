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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PenguinMediaPlatformPublishInfo extends AbstractModel{

    /**
    * 视频发布标题。
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 视频发布描述信息。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 视频标签。
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * 视频分类，详见[企鹅号官网](https://open.om.qq.com/resources/resourcesCenter)视频分类。
    */
    @SerializedName("Category")
    @Expose
    private Long Category;

    /**
     * Get 视频发布标题。 
     * @return Title 视频发布标题。
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 视频发布标题。
     * @param Title 视频发布标题。
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 视频发布描述信息。 
     * @return Description 视频发布描述信息。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 视频发布描述信息。
     * @param Description 视频发布描述信息。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 视频标签。 
     * @return Tags 视频标签。
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set 视频标签。
     * @param Tags 视频标签。
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 视频分类，详见[企鹅号官网](https://open.om.qq.com/resources/resourcesCenter)视频分类。 
     * @return Category 视频分类，详见[企鹅号官网](https://open.om.qq.com/resources/resourcesCenter)视频分类。
     */
    public Long getCategory() {
        return this.Category;
    }

    /**
     * Set 视频分类，详见[企鹅号官网](https://open.om.qq.com/resources/resourcesCenter)视频分类。
     * @param Category 视频分类，详见[企鹅号官网](https://open.om.qq.com/resources/resourcesCenter)视频分类。
     */
    public void setCategory(Long Category) {
        this.Category = Category;
    }

    public PenguinMediaPlatformPublishInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PenguinMediaPlatformPublishInfo(PenguinMediaPlatformPublishInfo source) {
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.Category != null) {
            this.Category = new Long(source.Category);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Category", this.Category);

    }
}

