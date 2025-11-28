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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComparisonDetail extends AbstractModel {

    /**
    * 合同对比差异点唯一ID。
    */
    @SerializedName("ComparisonPointId")
    @Expose
    private String ComparisonPointId;

    /**
    * 对比前后差异类型，具体如下：
<ul><li> **add**：新增</li>
<li> **change**：变更</li>
<li> **delete**：删除</li>
</ul>
    */
    @SerializedName("ComparisonType")
    @Expose
    private String ComparisonType;

    /**
    * 对比内容类型，具体如下：
<ul><li> **text**：文本</li>
<li> **table**：表格</li>
<li> **picture**：图片</li>
</ul>
    */
    @SerializedName("ContentType")
    @Expose
    private String ContentType;

    /**
    * 原文文本。
    */
    @SerializedName("OriginText")
    @Expose
    private String OriginText;

    /**
    * 对比文本。
    */
    @SerializedName("DiffText")
    @Expose
    private String DiffText;

    /**
     * Get 合同对比差异点唯一ID。 
     * @return ComparisonPointId 合同对比差异点唯一ID。
     */
    public String getComparisonPointId() {
        return this.ComparisonPointId;
    }

    /**
     * Set 合同对比差异点唯一ID。
     * @param ComparisonPointId 合同对比差异点唯一ID。
     */
    public void setComparisonPointId(String ComparisonPointId) {
        this.ComparisonPointId = ComparisonPointId;
    }

    /**
     * Get 对比前后差异类型，具体如下：
<ul><li> **add**：新增</li>
<li> **change**：变更</li>
<li> **delete**：删除</li>
</ul> 
     * @return ComparisonType 对比前后差异类型，具体如下：
<ul><li> **add**：新增</li>
<li> **change**：变更</li>
<li> **delete**：删除</li>
</ul>
     */
    public String getComparisonType() {
        return this.ComparisonType;
    }

    /**
     * Set 对比前后差异类型，具体如下：
<ul><li> **add**：新增</li>
<li> **change**：变更</li>
<li> **delete**：删除</li>
</ul>
     * @param ComparisonType 对比前后差异类型，具体如下：
<ul><li> **add**：新增</li>
<li> **change**：变更</li>
<li> **delete**：删除</li>
</ul>
     */
    public void setComparisonType(String ComparisonType) {
        this.ComparisonType = ComparisonType;
    }

    /**
     * Get 对比内容类型，具体如下：
<ul><li> **text**：文本</li>
<li> **table**：表格</li>
<li> **picture**：图片</li>
</ul> 
     * @return ContentType 对比内容类型，具体如下：
<ul><li> **text**：文本</li>
<li> **table**：表格</li>
<li> **picture**：图片</li>
</ul>
     */
    public String getContentType() {
        return this.ContentType;
    }

    /**
     * Set 对比内容类型，具体如下：
<ul><li> **text**：文本</li>
<li> **table**：表格</li>
<li> **picture**：图片</li>
</ul>
     * @param ContentType 对比内容类型，具体如下：
<ul><li> **text**：文本</li>
<li> **table**：表格</li>
<li> **picture**：图片</li>
</ul>
     */
    public void setContentType(String ContentType) {
        this.ContentType = ContentType;
    }

    /**
     * Get 原文文本。 
     * @return OriginText 原文文本。
     */
    public String getOriginText() {
        return this.OriginText;
    }

    /**
     * Set 原文文本。
     * @param OriginText 原文文本。
     */
    public void setOriginText(String OriginText) {
        this.OriginText = OriginText;
    }

    /**
     * Get 对比文本。 
     * @return DiffText 对比文本。
     */
    public String getDiffText() {
        return this.DiffText;
    }

    /**
     * Set 对比文本。
     * @param DiffText 对比文本。
     */
    public void setDiffText(String DiffText) {
        this.DiffText = DiffText;
    }

    public ComparisonDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComparisonDetail(ComparisonDetail source) {
        if (source.ComparisonPointId != null) {
            this.ComparisonPointId = new String(source.ComparisonPointId);
        }
        if (source.ComparisonType != null) {
            this.ComparisonType = new String(source.ComparisonType);
        }
        if (source.ContentType != null) {
            this.ContentType = new String(source.ContentType);
        }
        if (source.OriginText != null) {
            this.OriginText = new String(source.OriginText);
        }
        if (source.DiffText != null) {
            this.DiffText = new String(source.DiffText);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ComparisonPointId", this.ComparisonPointId);
        this.setParamSimple(map, prefix + "ComparisonType", this.ComparisonType);
        this.setParamSimple(map, prefix + "ContentType", this.ContentType);
        this.setParamSimple(map, prefix + "OriginText", this.OriginText);
        this.setParamSimple(map, prefix + "DiffText", this.DiffText);

    }
}

