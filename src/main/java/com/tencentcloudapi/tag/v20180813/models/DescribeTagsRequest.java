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
package com.tencentcloudapi.tag.v20180813.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTagsRequest extends AbstractModel{

    /**
    * 标签键,与标签值同时存在或同时不存在，不存在时表示查询该用户所有标签
    */
    @SerializedName("TagKey")
    @Expose
    private String TagKey;

    /**
    * 标签值,与标签键同时存在或同时不存在，不存在时表示查询该用户所有标签
    */
    @SerializedName("TagValue")
    @Expose
    private String TagValue;

    /**
    * 数据偏移量，默认为 0, 必须为Limit参数的整数倍
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页大小，默认为 15
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 创建者用户 Uin，不传或为空只将 Uin 作为条件查询
    */
    @SerializedName("CreateUin")
    @Expose
    private Long CreateUin;

    /**
    * 标签键数组,与标签值同时存在或同时不存在，不存在时表示查询该用户所有标签,当与TagKey同时传递时只取本值
    */
    @SerializedName("TagKeys")
    @Expose
    private String [] TagKeys;

    /**
    * 是否展现项目标签
    */
    @SerializedName("ShowProject")
    @Expose
    private Long ShowProject;

    /**
     * Get 标签键,与标签值同时存在或同时不存在，不存在时表示查询该用户所有标签 
     * @return TagKey 标签键,与标签值同时存在或同时不存在，不存在时表示查询该用户所有标签
     */
    public String getTagKey() {
        return this.TagKey;
    }

    /**
     * Set 标签键,与标签值同时存在或同时不存在，不存在时表示查询该用户所有标签
     * @param TagKey 标签键,与标签值同时存在或同时不存在，不存在时表示查询该用户所有标签
     */
    public void setTagKey(String TagKey) {
        this.TagKey = TagKey;
    }

    /**
     * Get 标签值,与标签键同时存在或同时不存在，不存在时表示查询该用户所有标签 
     * @return TagValue 标签值,与标签键同时存在或同时不存在，不存在时表示查询该用户所有标签
     */
    public String getTagValue() {
        return this.TagValue;
    }

    /**
     * Set 标签值,与标签键同时存在或同时不存在，不存在时表示查询该用户所有标签
     * @param TagValue 标签值,与标签键同时存在或同时不存在，不存在时表示查询该用户所有标签
     */
    public void setTagValue(String TagValue) {
        this.TagValue = TagValue;
    }

    /**
     * Get 数据偏移量，默认为 0, 必须为Limit参数的整数倍 
     * @return Offset 数据偏移量，默认为 0, 必须为Limit参数的整数倍
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 数据偏移量，默认为 0, 必须为Limit参数的整数倍
     * @param Offset 数据偏移量，默认为 0, 必须为Limit参数的整数倍
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页大小，默认为 15 
     * @return Limit 每页大小，默认为 15
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页大小，默认为 15
     * @param Limit 每页大小，默认为 15
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 创建者用户 Uin，不传或为空只将 Uin 作为条件查询 
     * @return CreateUin 创建者用户 Uin，不传或为空只将 Uin 作为条件查询
     */
    public Long getCreateUin() {
        return this.CreateUin;
    }

    /**
     * Set 创建者用户 Uin，不传或为空只将 Uin 作为条件查询
     * @param CreateUin 创建者用户 Uin，不传或为空只将 Uin 作为条件查询
     */
    public void setCreateUin(Long CreateUin) {
        this.CreateUin = CreateUin;
    }

    /**
     * Get 标签键数组,与标签值同时存在或同时不存在，不存在时表示查询该用户所有标签,当与TagKey同时传递时只取本值 
     * @return TagKeys 标签键数组,与标签值同时存在或同时不存在，不存在时表示查询该用户所有标签,当与TagKey同时传递时只取本值
     */
    public String [] getTagKeys() {
        return this.TagKeys;
    }

    /**
     * Set 标签键数组,与标签值同时存在或同时不存在，不存在时表示查询该用户所有标签,当与TagKey同时传递时只取本值
     * @param TagKeys 标签键数组,与标签值同时存在或同时不存在，不存在时表示查询该用户所有标签,当与TagKey同时传递时只取本值
     */
    public void setTagKeys(String [] TagKeys) {
        this.TagKeys = TagKeys;
    }

    /**
     * Get 是否展现项目标签 
     * @return ShowProject 是否展现项目标签
     */
    public Long getShowProject() {
        return this.ShowProject;
    }

    /**
     * Set 是否展现项目标签
     * @param ShowProject 是否展现项目标签
     */
    public void setShowProject(Long ShowProject) {
        this.ShowProject = ShowProject;
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

