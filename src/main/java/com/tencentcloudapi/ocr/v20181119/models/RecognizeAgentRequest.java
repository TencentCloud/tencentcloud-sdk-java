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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecognizeAgentRequest extends AbstractModel {

    /**
    * <p>图片/PDF的 Url 地址。要求图片经Base64编码后不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP格式。图片下载时间不超过 3 秒。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。</p>
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * <p>图片/PDF的 Base64 值。要求图片经Base64编码后不超过 10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。</p>
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * <p>需识别的PDF页码。仅支持PDF单页识别，当上传文件为PDF时有效。</p><p>默认值：1</p>
    */
    @SerializedName("PdfPageNumber")
    @Expose
    private Long PdfPageNumber;

    /**
    * <p>模型选择。</p><p>枚举值：</p><ul><li>0： 推理模型。</li><li>1： 识别、推理模型。</li></ul><p>默认值：0</p>
    */
    @SerializedName("SelectModel")
    @Expose
    private Long SelectModel;

    /**
    * <p>任务类型。</p><p>枚举值：</p><ul><li><p>0： 全文识别。识别且输出全文内容。</p></li><li><p>1： 判断。判断输入图的内容是否为Query中的内容，返回结果为是或否。如Query:&quot;增值税发票&quot;，该任务类型下，将判断输入图是否为增值税发票，返回&quot;是&quot;或&quot;否&quot;。</p></li><li><p>2： 分类。判断输入图属于Query中具体哪个分类项。如Query:[&quot;营业执照&quot;,&quot;合同&quot;,&quot;票据&quot;]，在该任务类型下，将判断输入图是否属于&quot;营业执照&quot;、&quot;合同&quot;、&quot;票据&quot;，返回&quot;营业执照&quot;/&quot;合同&quot;/&quot;票据&quot;或&quot;均不符合&quot;。</p></li><li><p>3： 总结提炼。总结输入图与Query相关的内容。如Query:&quot;工作经历&quot;，在该任务类型下，将输出输入图中和&quot;工作经历&quot;相关的内容，或&quot;无相关内容&quot;。</p></li><li><p>4： 信息提取。按照自定义字段提取Key-Value，且支持多层级提取，详见入参SchemaItems说明。入参可参考下面的接口示例QueryType=4场景</p></li></ul><p>默认值：0</p>
    */
    @SerializedName("QueryType")
    @Expose
    private Long QueryType;

    /**
    * <p>自定义提取字段的结构，详见SchemaList结构。仅当QueryType=4时生效。</p><p>注：.N表示数组型参数。</p>
    */
    @SerializedName("SchemaItems")
    @Expose
    private SchemaList [] SchemaItems;

    /**
    * <p>推理任务的提示词。与QueryType搭配使用，具体说明见QueryType描述。1）仅当QueryType=1/2/3时生效，且QueryType=1/3时，长度必须为1；2）QueryType=2，Query长度必须符合2≤x≤5。</p><p>注：.N表示数组型参数。</p>
    */
    @SerializedName("Query")
    @Expose
    private String [] Query;

    /**
    * <p>是否需要返回坐标。</p><p>默认值：false</p><p>注：仅对QueryType=4时生效，且坐标位置为 Response.ExtractFields.Polygon。</p>
    */
    @SerializedName("EnableCoord")
    @Expose
    private Boolean EnableCoord;

    /**
     * Get <p>图片/PDF的 Url 地址。要求图片经Base64编码后不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP格式。图片下载时间不超过 3 秒。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。</p> 
     * @return ImageUrl <p>图片/PDF的 Url 地址。要求图片经Base64编码后不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP格式。图片下载时间不超过 3 秒。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。</p>
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set <p>图片/PDF的 Url 地址。要求图片经Base64编码后不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP格式。图片下载时间不超过 3 秒。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。</p>
     * @param ImageUrl <p>图片/PDF的 Url 地址。要求图片经Base64编码后不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP格式。图片下载时间不超过 3 秒。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。</p>
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get <p>图片/PDF的 Base64 值。要求图片经Base64编码后不超过 10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。</p> 
     * @return ImageBase64 <p>图片/PDF的 Base64 值。要求图片经Base64编码后不超过 10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。</p>
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set <p>图片/PDF的 Base64 值。要求图片经Base64编码后不超过 10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。</p>
     * @param ImageBase64 <p>图片/PDF的 Base64 值。要求图片经Base64编码后不超过 10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。</p>
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get <p>需识别的PDF页码。仅支持PDF单页识别，当上传文件为PDF时有效。</p><p>默认值：1</p> 
     * @return PdfPageNumber <p>需识别的PDF页码。仅支持PDF单页识别，当上传文件为PDF时有效。</p><p>默认值：1</p>
     */
    public Long getPdfPageNumber() {
        return this.PdfPageNumber;
    }

    /**
     * Set <p>需识别的PDF页码。仅支持PDF单页识别，当上传文件为PDF时有效。</p><p>默认值：1</p>
     * @param PdfPageNumber <p>需识别的PDF页码。仅支持PDF单页识别，当上传文件为PDF时有效。</p><p>默认值：1</p>
     */
    public void setPdfPageNumber(Long PdfPageNumber) {
        this.PdfPageNumber = PdfPageNumber;
    }

    /**
     * Get <p>模型选择。</p><p>枚举值：</p><ul><li>0： 推理模型。</li><li>1： 识别、推理模型。</li></ul><p>默认值：0</p> 
     * @return SelectModel <p>模型选择。</p><p>枚举值：</p><ul><li>0： 推理模型。</li><li>1： 识别、推理模型。</li></ul><p>默认值：0</p>
     */
    public Long getSelectModel() {
        return this.SelectModel;
    }

    /**
     * Set <p>模型选择。</p><p>枚举值：</p><ul><li>0： 推理模型。</li><li>1： 识别、推理模型。</li></ul><p>默认值：0</p>
     * @param SelectModel <p>模型选择。</p><p>枚举值：</p><ul><li>0： 推理模型。</li><li>1： 识别、推理模型。</li></ul><p>默认值：0</p>
     */
    public void setSelectModel(Long SelectModel) {
        this.SelectModel = SelectModel;
    }

    /**
     * Get <p>任务类型。</p><p>枚举值：</p><ul><li><p>0： 全文识别。识别且输出全文内容。</p></li><li><p>1： 判断。判断输入图的内容是否为Query中的内容，返回结果为是或否。如Query:&quot;增值税发票&quot;，该任务类型下，将判断输入图是否为增值税发票，返回&quot;是&quot;或&quot;否&quot;。</p></li><li><p>2： 分类。判断输入图属于Query中具体哪个分类项。如Query:[&quot;营业执照&quot;,&quot;合同&quot;,&quot;票据&quot;]，在该任务类型下，将判断输入图是否属于&quot;营业执照&quot;、&quot;合同&quot;、&quot;票据&quot;，返回&quot;营业执照&quot;/&quot;合同&quot;/&quot;票据&quot;或&quot;均不符合&quot;。</p></li><li><p>3： 总结提炼。总结输入图与Query相关的内容。如Query:&quot;工作经历&quot;，在该任务类型下，将输出输入图中和&quot;工作经历&quot;相关的内容，或&quot;无相关内容&quot;。</p></li><li><p>4： 信息提取。按照自定义字段提取Key-Value，且支持多层级提取，详见入参SchemaItems说明。入参可参考下面的接口示例QueryType=4场景</p></li></ul><p>默认值：0</p> 
     * @return QueryType <p>任务类型。</p><p>枚举值：</p><ul><li><p>0： 全文识别。识别且输出全文内容。</p></li><li><p>1： 判断。判断输入图的内容是否为Query中的内容，返回结果为是或否。如Query:&quot;增值税发票&quot;，该任务类型下，将判断输入图是否为增值税发票，返回&quot;是&quot;或&quot;否&quot;。</p></li><li><p>2： 分类。判断输入图属于Query中具体哪个分类项。如Query:[&quot;营业执照&quot;,&quot;合同&quot;,&quot;票据&quot;]，在该任务类型下，将判断输入图是否属于&quot;营业执照&quot;、&quot;合同&quot;、&quot;票据&quot;，返回&quot;营业执照&quot;/&quot;合同&quot;/&quot;票据&quot;或&quot;均不符合&quot;。</p></li><li><p>3： 总结提炼。总结输入图与Query相关的内容。如Query:&quot;工作经历&quot;，在该任务类型下，将输出输入图中和&quot;工作经历&quot;相关的内容，或&quot;无相关内容&quot;。</p></li><li><p>4： 信息提取。按照自定义字段提取Key-Value，且支持多层级提取，详见入参SchemaItems说明。入参可参考下面的接口示例QueryType=4场景</p></li></ul><p>默认值：0</p>
     */
    public Long getQueryType() {
        return this.QueryType;
    }

    /**
     * Set <p>任务类型。</p><p>枚举值：</p><ul><li><p>0： 全文识别。识别且输出全文内容。</p></li><li><p>1： 判断。判断输入图的内容是否为Query中的内容，返回结果为是或否。如Query:&quot;增值税发票&quot;，该任务类型下，将判断输入图是否为增值税发票，返回&quot;是&quot;或&quot;否&quot;。</p></li><li><p>2： 分类。判断输入图属于Query中具体哪个分类项。如Query:[&quot;营业执照&quot;,&quot;合同&quot;,&quot;票据&quot;]，在该任务类型下，将判断输入图是否属于&quot;营业执照&quot;、&quot;合同&quot;、&quot;票据&quot;，返回&quot;营业执照&quot;/&quot;合同&quot;/&quot;票据&quot;或&quot;均不符合&quot;。</p></li><li><p>3： 总结提炼。总结输入图与Query相关的内容。如Query:&quot;工作经历&quot;，在该任务类型下，将输出输入图中和&quot;工作经历&quot;相关的内容，或&quot;无相关内容&quot;。</p></li><li><p>4： 信息提取。按照自定义字段提取Key-Value，且支持多层级提取，详见入参SchemaItems说明。入参可参考下面的接口示例QueryType=4场景</p></li></ul><p>默认值：0</p>
     * @param QueryType <p>任务类型。</p><p>枚举值：</p><ul><li><p>0： 全文识别。识别且输出全文内容。</p></li><li><p>1： 判断。判断输入图的内容是否为Query中的内容，返回结果为是或否。如Query:&quot;增值税发票&quot;，该任务类型下，将判断输入图是否为增值税发票，返回&quot;是&quot;或&quot;否&quot;。</p></li><li><p>2： 分类。判断输入图属于Query中具体哪个分类项。如Query:[&quot;营业执照&quot;,&quot;合同&quot;,&quot;票据&quot;]，在该任务类型下，将判断输入图是否属于&quot;营业执照&quot;、&quot;合同&quot;、&quot;票据&quot;，返回&quot;营业执照&quot;/&quot;合同&quot;/&quot;票据&quot;或&quot;均不符合&quot;。</p></li><li><p>3： 总结提炼。总结输入图与Query相关的内容。如Query:&quot;工作经历&quot;，在该任务类型下，将输出输入图中和&quot;工作经历&quot;相关的内容，或&quot;无相关内容&quot;。</p></li><li><p>4： 信息提取。按照自定义字段提取Key-Value，且支持多层级提取，详见入参SchemaItems说明。入参可参考下面的接口示例QueryType=4场景</p></li></ul><p>默认值：0</p>
     */
    public void setQueryType(Long QueryType) {
        this.QueryType = QueryType;
    }

    /**
     * Get <p>自定义提取字段的结构，详见SchemaList结构。仅当QueryType=4时生效。</p><p>注：.N表示数组型参数。</p> 
     * @return SchemaItems <p>自定义提取字段的结构，详见SchemaList结构。仅当QueryType=4时生效。</p><p>注：.N表示数组型参数。</p>
     */
    public SchemaList [] getSchemaItems() {
        return this.SchemaItems;
    }

    /**
     * Set <p>自定义提取字段的结构，详见SchemaList结构。仅当QueryType=4时生效。</p><p>注：.N表示数组型参数。</p>
     * @param SchemaItems <p>自定义提取字段的结构，详见SchemaList结构。仅当QueryType=4时生效。</p><p>注：.N表示数组型参数。</p>
     */
    public void setSchemaItems(SchemaList [] SchemaItems) {
        this.SchemaItems = SchemaItems;
    }

    /**
     * Get <p>推理任务的提示词。与QueryType搭配使用，具体说明见QueryType描述。1）仅当QueryType=1/2/3时生效，且QueryType=1/3时，长度必须为1；2）QueryType=2，Query长度必须符合2≤x≤5。</p><p>注：.N表示数组型参数。</p> 
     * @return Query <p>推理任务的提示词。与QueryType搭配使用，具体说明见QueryType描述。1）仅当QueryType=1/2/3时生效，且QueryType=1/3时，长度必须为1；2）QueryType=2，Query长度必须符合2≤x≤5。</p><p>注：.N表示数组型参数。</p>
     */
    public String [] getQuery() {
        return this.Query;
    }

    /**
     * Set <p>推理任务的提示词。与QueryType搭配使用，具体说明见QueryType描述。1）仅当QueryType=1/2/3时生效，且QueryType=1/3时，长度必须为1；2）QueryType=2，Query长度必须符合2≤x≤5。</p><p>注：.N表示数组型参数。</p>
     * @param Query <p>推理任务的提示词。与QueryType搭配使用，具体说明见QueryType描述。1）仅当QueryType=1/2/3时生效，且QueryType=1/3时，长度必须为1；2）QueryType=2，Query长度必须符合2≤x≤5。</p><p>注：.N表示数组型参数。</p>
     */
    public void setQuery(String [] Query) {
        this.Query = Query;
    }

    /**
     * Get <p>是否需要返回坐标。</p><p>默认值：false</p><p>注：仅对QueryType=4时生效，且坐标位置为 Response.ExtractFields.Polygon。</p> 
     * @return EnableCoord <p>是否需要返回坐标。</p><p>默认值：false</p><p>注：仅对QueryType=4时生效，且坐标位置为 Response.ExtractFields.Polygon。</p>
     */
    public Boolean getEnableCoord() {
        return this.EnableCoord;
    }

    /**
     * Set <p>是否需要返回坐标。</p><p>默认值：false</p><p>注：仅对QueryType=4时生效，且坐标位置为 Response.ExtractFields.Polygon。</p>
     * @param EnableCoord <p>是否需要返回坐标。</p><p>默认值：false</p><p>注：仅对QueryType=4时生效，且坐标位置为 Response.ExtractFields.Polygon。</p>
     */
    public void setEnableCoord(Boolean EnableCoord) {
        this.EnableCoord = EnableCoord;
    }

    public RecognizeAgentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecognizeAgentRequest(RecognizeAgentRequest source) {
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
        if (source.PdfPageNumber != null) {
            this.PdfPageNumber = new Long(source.PdfPageNumber);
        }
        if (source.SelectModel != null) {
            this.SelectModel = new Long(source.SelectModel);
        }
        if (source.QueryType != null) {
            this.QueryType = new Long(source.QueryType);
        }
        if (source.SchemaItems != null) {
            this.SchemaItems = new SchemaList[source.SchemaItems.length];
            for (int i = 0; i < source.SchemaItems.length; i++) {
                this.SchemaItems[i] = new SchemaList(source.SchemaItems[i]);
            }
        }
        if (source.Query != null) {
            this.Query = new String[source.Query.length];
            for (int i = 0; i < source.Query.length; i++) {
                this.Query[i] = new String(source.Query[i]);
            }
        }
        if (source.EnableCoord != null) {
            this.EnableCoord = new Boolean(source.EnableCoord);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "PdfPageNumber", this.PdfPageNumber);
        this.setParamSimple(map, prefix + "SelectModel", this.SelectModel);
        this.setParamSimple(map, prefix + "QueryType", this.QueryType);
        this.setParamArrayObj(map, prefix + "SchemaItems.", this.SchemaItems);
        this.setParamArraySimple(map, prefix + "Query.", this.Query);
        this.setParamSimple(map, prefix + "EnableCoord", this.EnableCoord);

    }
}

