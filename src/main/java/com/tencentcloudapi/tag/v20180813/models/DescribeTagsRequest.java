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
package com.tencentcloudapi.tag.v20180813.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTagsRequest extends AbstractModel {

    /**
    * <p>标签键,与标签值同时存在或同时不存在，不存在时表示查询该用户所有标签</p>
    */
    @SerializedName("TagKey")
    @Expose
    private String TagKey;

    /**
    * <p>标签值,与标签键同时存在或同时不存在，不存在时表示查询该用户所有标签</p>
    */
    @SerializedName("TagValue")
    @Expose
    private String TagValue;

    /**
    * <p>数据偏移量，默认为 0, 必须为Limit参数的整数倍</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>每页大小，默认为 15，最大1000</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>创建者用户 Uin，不传或为空只将 Uin 作为条件查询</p>
    */
    @SerializedName("CreateUin")
    @Expose
    private Long CreateUin;

    /**
    * <p>标签键数组,与标签值同时存在或同时不存在，不存在时表示查询该用户所有标签,当与TagKey同时传递时只取本值</p>
    */
    @SerializedName("TagKeys")
    @Expose
    private String [] TagKeys;

    /**
    * <p>是否展现项目标签。1:展示  0:不展示</p>
    */
    @SerializedName("ShowProject")
    @Expose
    private Long ShowProject;

    /**
     * Get <p>标签键,与标签值同时存在或同时不存在，不存在时表示查询该用户所有标签</p> 
     * @return TagKey <p>标签键,与标签值同时存在或同时不存在，不存在时表示查询该用户所有标签</p>
     */
    public String getTagKey() {
        return this.TagKey;
    }

    /**
     * Set <p>标签键,与标签值同时存在或同时不存在，不存在时表示查询该用户所有标签</p>
     * @param TagKey <p>标签键,与标签值同时存在或同时不存在，不存在时表示查询该用户所有标签</p>
     */
    public void setTagKey(String TagKey) {
        this.TagKey = TagKey;
    }

    /**
     * Get <p>标签值,与标签键同时存在或同时不存在，不存在时表示查询该用户所有标签</p> 
     * @return TagValue <p>标签值,与标签键同时存在或同时不存在，不存在时表示查询该用户所有标签</p>
     */
    public String getTagValue() {
        return this.TagValue;
    }

    /**
     * Set <p>标签值,与标签键同时存在或同时不存在，不存在时表示查询该用户所有标签</p>
     * @param TagValue <p>标签值,与标签键同时存在或同时不存在，不存在时表示查询该用户所有标签</p>
     */
    public void setTagValue(String TagValue) {
        this.TagValue = TagValue;
    }

    /**
     * Get <p>数据偏移量，默认为 0, 必须为Limit参数的整数倍</p> 
     * @return Offset <p>数据偏移量，默认为 0, 必须为Limit参数的整数倍</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>数据偏移量，默认为 0, 必须为Limit参数的整数倍</p>
     * @param Offset <p>数据偏移量，默认为 0, 必须为Limit参数的整数倍</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>每页大小，默认为 15，最大1000</p> 
     * @return Limit <p>每页大小，默认为 15，最大1000</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>每页大小，默认为 15，最大1000</p>
     * @param Limit <p>每页大小，默认为 15，最大1000</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>创建者用户 Uin，不传或为空只将 Uin 作为条件查询</p> 
     * @return CreateUin <p>创建者用户 Uin，不传或为空只将 Uin 作为条件查询</p>
     */
    public Long getCreateUin() {
        return this.CreateUin;
    }

    /**
     * Set <p>创建者用户 Uin，不传或为空只将 Uin 作为条件查询</p>
     * @param CreateUin <p>创建者用户 Uin，不传或为空只将 Uin 作为条件查询</p>
     */
    public void setCreateUin(Long CreateUin) {
        this.CreateUin = CreateUin;
    }

    /**
     * Get <p>标签键数组,与标签值同时存在或同时不存在，不存在时表示查询该用户所有标签,当与TagKey同时传递时只取本值</p> 
     * @return TagKeys <p>标签键数组,与标签值同时存在或同时不存在，不存在时表示查询该用户所有标签,当与TagKey同时传递时只取本值</p>
     */
    public String [] getTagKeys() {
        return this.TagKeys;
    }

    /**
     * Set <p>标签键数组,与标签值同时存在或同时不存在，不存在时表示查询该用户所有标签,当与TagKey同时传递时只取本值</p>
     * @param TagKeys <p>标签键数组,与标签值同时存在或同时不存在，不存在时表示查询该用户所有标签,当与TagKey同时传递时只取本值</p>
     */
    public void setTagKeys(String [] TagKeys) {
        this.TagKeys = TagKeys;
    }

    /**
     * Get <p>是否展现项目标签。1:展示  0:不展示</p> 
     * @return ShowProject <p>是否展现项目标签。1:展示  0:不展示</p>
     */
    public Long getShowProject() {
        return this.ShowProject;
    }

    /**
     * Set <p>是否展现项目标签。1:展示  0:不展示</p>
     * @param ShowProject <p>是否展现项目标签。1:展示  0:不展示</p>
     */
    public void setShowProject(Long ShowProject) {
        this.ShowProject = ShowProject;
    }

    public DescribeTagsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTagsRequest(DescribeTagsRequest source) {
        if (source.TagKey != null) {
            this.TagKey = new String(source.TagKey);
        }
        if (source.TagValue != null) {
            this.TagValue = new String(source.TagValue);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.CreateUin != null) {
            this.CreateUin = new Long(source.CreateUin);
        }
        if (source.TagKeys != null) {
            this.TagKeys = new String[source.TagKeys.length];
            for (int i = 0; i < source.TagKeys.length; i++) {
                this.TagKeys[i] = new String(source.TagKeys[i]);
            }
        }
        if (source.ShowProject != null) {
            this.ShowProject = new Long(source.ShowProject);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TagKey", this.TagKey);
        this.setParamSimple(map, prefix + "TagValue", this.TagValue);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "CreateUin", this.CreateUin);
        this.setParamArraySimple(map, prefix + "TagKeys.", this.TagKeys);
        this.setParamSimple(map, prefix + "ShowProject", this.ShowProject);

    }
}

