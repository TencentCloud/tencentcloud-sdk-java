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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DspaDataCategoryDistributed extends AbstractModel {

    /**
    * 数据分类ID
    */
    @SerializedName("CategoryId")
    @Expose
    private Long CategoryId;

    /**
    * 数据分类名称
    */
    @SerializedName("CategoryName")
    @Expose
    private String CategoryName;

    /**
    * 数据分类统计个数
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 分类路径
    */
    @SerializedName("CategoryFullPath")
    @Expose
    private String CategoryFullPath;

    /**
     * Get 数据分类ID 
     * @return CategoryId 数据分类ID
     */
    public Long getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set 数据分类ID
     * @param CategoryId 数据分类ID
     */
    public void setCategoryId(Long CategoryId) {
        this.CategoryId = CategoryId;
    }

    /**
     * Get 数据分类名称 
     * @return CategoryName 数据分类名称
     */
    public String getCategoryName() {
        return this.CategoryName;
    }

    /**
     * Set 数据分类名称
     * @param CategoryName 数据分类名称
     */
    public void setCategoryName(String CategoryName) {
        this.CategoryName = CategoryName;
    }

    /**
     * Get 数据分类统计个数 
     * @return Count 数据分类统计个数
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 数据分类统计个数
     * @param Count 数据分类统计个数
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 分类路径 
     * @return CategoryFullPath 分类路径
     */
    public String getCategoryFullPath() {
        return this.CategoryFullPath;
    }

    /**
     * Set 分类路径
     * @param CategoryFullPath 分类路径
     */
    public void setCategoryFullPath(String CategoryFullPath) {
        this.CategoryFullPath = CategoryFullPath;
    }

    public DspaDataCategoryDistributed() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspaDataCategoryDistributed(DspaDataCategoryDistributed source) {
        if (source.CategoryId != null) {
            this.CategoryId = new Long(source.CategoryId);
        }
        if (source.CategoryName != null) {
            this.CategoryName = new String(source.CategoryName);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.CategoryFullPath != null) {
            this.CategoryFullPath = new String(source.CategoryFullPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);
        this.setParamSimple(map, prefix + "CategoryName", this.CategoryName);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "CategoryFullPath", this.CategoryFullPath);

    }
}

