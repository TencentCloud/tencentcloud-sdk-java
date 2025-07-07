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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataCategory extends AbstractModel {

    /**
    * 分类ID
    */
    @SerializedName("CategoryId")
    @Expose
    private Long CategoryId;

    /**
    * 敏感数据分类名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 敏感数据分类来源，取值：0 内置, 1 自定义
    */
    @SerializedName("Source")
    @Expose
    private Long Source;

    /**
    * 关联模板数量
    */
    @SerializedName("RelateComplianceCount")
    @Expose
    private Long RelateComplianceCount;

    /**
     * Get 分类ID 
     * @return CategoryId 分类ID
     */
    public Long getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set 分类ID
     * @param CategoryId 分类ID
     */
    public void setCategoryId(Long CategoryId) {
        this.CategoryId = CategoryId;
    }

    /**
     * Get 敏感数据分类名称 
     * @return Name 敏感数据分类名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 敏感数据分类名称
     * @param Name 敏感数据分类名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 敏感数据分类来源，取值：0 内置, 1 自定义 
     * @return Source 敏感数据分类来源，取值：0 内置, 1 自定义
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set 敏感数据分类来源，取值：0 内置, 1 自定义
     * @param Source 敏感数据分类来源，取值：0 内置, 1 自定义
     */
    public void setSource(Long Source) {
        this.Source = Source;
    }

    /**
     * Get 关联模板数量 
     * @return RelateComplianceCount 关联模板数量
     */
    public Long getRelateComplianceCount() {
        return this.RelateComplianceCount;
    }

    /**
     * Set 关联模板数量
     * @param RelateComplianceCount 关联模板数量
     */
    public void setRelateComplianceCount(Long RelateComplianceCount) {
        this.RelateComplianceCount = RelateComplianceCount;
    }

    public DataCategory() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataCategory(DataCategory source) {
        if (source.CategoryId != null) {
            this.CategoryId = new Long(source.CategoryId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Source != null) {
            this.Source = new Long(source.Source);
        }
        if (source.RelateComplianceCount != null) {
            this.RelateComplianceCount = new Long(source.RelateComplianceCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "RelateComplianceCount", this.RelateComplianceCount);

    }
}

