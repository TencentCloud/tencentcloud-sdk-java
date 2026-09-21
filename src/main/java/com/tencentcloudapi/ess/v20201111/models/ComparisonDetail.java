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
    * <p>合同对比差异点唯一ID。</p>
    */
    @SerializedName("ComparisonPointId")
    @Expose
    private String ComparisonPointId;

    /**
    * <p>对比前后差异类型，具体如下：</p><ul><li> **add**：新增</li><li> **change**：变更</li><li> **delete**：删除</li></ul>
    */
    @SerializedName("ComparisonType")
    @Expose
    private String ComparisonType;

    /**
    * <p>对比内容类型，具体如下：</p><ul><li> **text**：文本</li><li> **table**：表格</li><li> **picture**：图片</li></ul>
    */
    @SerializedName("ContentType")
    @Expose
    private String ContentType;

    /**
    * <p>原文文本。</p>
    */
    @SerializedName("OriginText")
    @Expose
    private String OriginText;

    /**
    * <p>对比文本。</p>
    */
    @SerializedName("DiffText")
    @Expose
    private String DiffText;

    /**
    * <p>合同文本的格式类型。<br>类型如下：</p><ul><li> **0**：段落（正文）</li><li> **1**：标点符号</li><li> **2**：页眉页脚</li><li> **3**：目录</li><li> **4**：印章</li><li> **5**：序号</li><li> **6**：水印</li><li> **7**：下划线内容（填写区）</li></ul>
    */
    @SerializedName("FormatType")
    @Expose
    private Long FormatType;

    /**
    * <p>页码：对比点所在页码。</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
     * Get <p>合同对比差异点唯一ID。</p> 
     * @return ComparisonPointId <p>合同对比差异点唯一ID。</p>
     */
    public String getComparisonPointId() {
        return this.ComparisonPointId;
    }

    /**
     * Set <p>合同对比差异点唯一ID。</p>
     * @param ComparisonPointId <p>合同对比差异点唯一ID。</p>
     */
    public void setComparisonPointId(String ComparisonPointId) {
        this.ComparisonPointId = ComparisonPointId;
    }

    /**
     * Get <p>对比前后差异类型，具体如下：</p><ul><li> **add**：新增</li><li> **change**：变更</li><li> **delete**：删除</li></ul> 
     * @return ComparisonType <p>对比前后差异类型，具体如下：</p><ul><li> **add**：新增</li><li> **change**：变更</li><li> **delete**：删除</li></ul>
     */
    public String getComparisonType() {
        return this.ComparisonType;
    }

    /**
     * Set <p>对比前后差异类型，具体如下：</p><ul><li> **add**：新增</li><li> **change**：变更</li><li> **delete**：删除</li></ul>
     * @param ComparisonType <p>对比前后差异类型，具体如下：</p><ul><li> **add**：新增</li><li> **change**：变更</li><li> **delete**：删除</li></ul>
     */
    public void setComparisonType(String ComparisonType) {
        this.ComparisonType = ComparisonType;
    }

    /**
     * Get <p>对比内容类型，具体如下：</p><ul><li> **text**：文本</li><li> **table**：表格</li><li> **picture**：图片</li></ul> 
     * @return ContentType <p>对比内容类型，具体如下：</p><ul><li> **text**：文本</li><li> **table**：表格</li><li> **picture**：图片</li></ul>
     */
    public String getContentType() {
        return this.ContentType;
    }

    /**
     * Set <p>对比内容类型，具体如下：</p><ul><li> **text**：文本</li><li> **table**：表格</li><li> **picture**：图片</li></ul>
     * @param ContentType <p>对比内容类型，具体如下：</p><ul><li> **text**：文本</li><li> **table**：表格</li><li> **picture**：图片</li></ul>
     */
    public void setContentType(String ContentType) {
        this.ContentType = ContentType;
    }

    /**
     * Get <p>原文文本。</p> 
     * @return OriginText <p>原文文本。</p>
     */
    public String getOriginText() {
        return this.OriginText;
    }

    /**
     * Set <p>原文文本。</p>
     * @param OriginText <p>原文文本。</p>
     */
    public void setOriginText(String OriginText) {
        this.OriginText = OriginText;
    }

    /**
     * Get <p>对比文本。</p> 
     * @return DiffText <p>对比文本。</p>
     */
    public String getDiffText() {
        return this.DiffText;
    }

    /**
     * Set <p>对比文本。</p>
     * @param DiffText <p>对比文本。</p>
     */
    public void setDiffText(String DiffText) {
        this.DiffText = DiffText;
    }

    /**
     * Get <p>合同文本的格式类型。<br>类型如下：</p><ul><li> **0**：段落（正文）</li><li> **1**：标点符号</li><li> **2**：页眉页脚</li><li> **3**：目录</li><li> **4**：印章</li><li> **5**：序号</li><li> **6**：水印</li><li> **7**：下划线内容（填写区）</li></ul> 
     * @return FormatType <p>合同文本的格式类型。<br>类型如下：</p><ul><li> **0**：段落（正文）</li><li> **1**：标点符号</li><li> **2**：页眉页脚</li><li> **3**：目录</li><li> **4**：印章</li><li> **5**：序号</li><li> **6**：水印</li><li> **7**：下划线内容（填写区）</li></ul>
     */
    public Long getFormatType() {
        return this.FormatType;
    }

    /**
     * Set <p>合同文本的格式类型。<br>类型如下：</p><ul><li> **0**：段落（正文）</li><li> **1**：标点符号</li><li> **2**：页眉页脚</li><li> **3**：目录</li><li> **4**：印章</li><li> **5**：序号</li><li> **6**：水印</li><li> **7**：下划线内容（填写区）</li></ul>
     * @param FormatType <p>合同文本的格式类型。<br>类型如下：</p><ul><li> **0**：段落（正文）</li><li> **1**：标点符号</li><li> **2**：页眉页脚</li><li> **3**：目录</li><li> **4**：印章</li><li> **5**：序号</li><li> **6**：水印</li><li> **7**：下划线内容（填写区）</li></ul>
     */
    public void setFormatType(Long FormatType) {
        this.FormatType = FormatType;
    }

    /**
     * Get <p>页码：对比点所在页码。</p> 
     * @return PageNumber <p>页码：对比点所在页码。</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>页码：对比点所在页码。</p>
     * @param PageNumber <p>页码：对比点所在页码。</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
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
        if (source.FormatType != null) {
            this.FormatType = new Long(source.FormatType);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
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
        this.setParamSimple(map, prefix + "FormatType", this.FormatType);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);

    }
}

