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

public class RecognizeTableMultiOCRRequest extends AbstractModel {

    /**
    * 图片/PDF的 Base64 值。 要求图片/PDF经Base64编码后不超过 10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。 图片支持的像素范围：需介于20-10000px之间。 图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。 
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * 图片/PDF的 Url 地址。 要求图片/PDF经Base64编码后不超过 10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。 图片支持的像素范围：需介于20-10000px之间。 图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。 
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * 文档的起始页码。  当传入文件是PDF型时，用来指定识别的起始页码，识别的页码包含当前值。
    */
    @SerializedName("PdfStartPageNumber")
    @Expose
    private Long PdfStartPageNumber;

    /**
    * 文档的结束页码。 当传入文件是PDF类型时，用来指定识别的结束页码，识别的页码包含当前值。单次调用最多支持识别3页内容，即PdfEndPageNumber-PdfStartPageNumber需要不大于3。
    */
    @SerializedName("PdfEndPageNumber")
    @Expose
    private Long PdfEndPageNumber;

    /**
    * 配置选项，支持配置输出数据格式。

* **Mdbase64** 返回 base64 编码的 markdown 格式文本。
* **Excelbase64** 返回 base64 编码的 excel 文件。
    */
    @SerializedName("DataFormat")
    @Expose
    private String DataFormat;

    /**
     * Get 图片/PDF的 Base64 值。 要求图片/PDF经Base64编码后不超过 10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。 图片支持的像素范围：需介于20-10000px之间。 图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。  
     * @return ImageBase64 图片/PDF的 Base64 值。 要求图片/PDF经Base64编码后不超过 10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。 图片支持的像素范围：需介于20-10000px之间。 图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。 
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set 图片/PDF的 Base64 值。 要求图片/PDF经Base64编码后不超过 10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。 图片支持的像素范围：需介于20-10000px之间。 图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。 
     * @param ImageBase64 图片/PDF的 Base64 值。 要求图片/PDF经Base64编码后不超过 10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。 图片支持的像素范围：需介于20-10000px之间。 图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。 
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get 图片/PDF的 Url 地址。 要求图片/PDF经Base64编码后不超过 10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。 图片支持的像素范围：需介于20-10000px之间。 图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。  
     * @return ImageUrl 图片/PDF的 Url 地址。 要求图片/PDF经Base64编码后不超过 10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。 图片支持的像素范围：需介于20-10000px之间。 图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。 
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set 图片/PDF的 Url 地址。 要求图片/PDF经Base64编码后不超过 10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。 图片支持的像素范围：需介于20-10000px之间。 图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。 
     * @param ImageUrl 图片/PDF的 Url 地址。 要求图片/PDF经Base64编码后不超过 10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。 图片支持的像素范围：需介于20-10000px之间。 图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。 
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get 文档的起始页码。  当传入文件是PDF型时，用来指定识别的起始页码，识别的页码包含当前值。 
     * @return PdfStartPageNumber 文档的起始页码。  当传入文件是PDF型时，用来指定识别的起始页码，识别的页码包含当前值。
     */
    public Long getPdfStartPageNumber() {
        return this.PdfStartPageNumber;
    }

    /**
     * Set 文档的起始页码。  当传入文件是PDF型时，用来指定识别的起始页码，识别的页码包含当前值。
     * @param PdfStartPageNumber 文档的起始页码。  当传入文件是PDF型时，用来指定识别的起始页码，识别的页码包含当前值。
     */
    public void setPdfStartPageNumber(Long PdfStartPageNumber) {
        this.PdfStartPageNumber = PdfStartPageNumber;
    }

    /**
     * Get 文档的结束页码。 当传入文件是PDF类型时，用来指定识别的结束页码，识别的页码包含当前值。单次调用最多支持识别3页内容，即PdfEndPageNumber-PdfStartPageNumber需要不大于3。 
     * @return PdfEndPageNumber 文档的结束页码。 当传入文件是PDF类型时，用来指定识别的结束页码，识别的页码包含当前值。单次调用最多支持识别3页内容，即PdfEndPageNumber-PdfStartPageNumber需要不大于3。
     */
    public Long getPdfEndPageNumber() {
        return this.PdfEndPageNumber;
    }

    /**
     * Set 文档的结束页码。 当传入文件是PDF类型时，用来指定识别的结束页码，识别的页码包含当前值。单次调用最多支持识别3页内容，即PdfEndPageNumber-PdfStartPageNumber需要不大于3。
     * @param PdfEndPageNumber 文档的结束页码。 当传入文件是PDF类型时，用来指定识别的结束页码，识别的页码包含当前值。单次调用最多支持识别3页内容，即PdfEndPageNumber-PdfStartPageNumber需要不大于3。
     */
    public void setPdfEndPageNumber(Long PdfEndPageNumber) {
        this.PdfEndPageNumber = PdfEndPageNumber;
    }

    /**
     * Get 配置选项，支持配置输出数据格式。

* **Mdbase64** 返回 base64 编码的 markdown 格式文本。
* **Excelbase64** 返回 base64 编码的 excel 文件。 
     * @return DataFormat 配置选项，支持配置输出数据格式。

* **Mdbase64** 返回 base64 编码的 markdown 格式文本。
* **Excelbase64** 返回 base64 编码的 excel 文件。
     */
    public String getDataFormat() {
        return this.DataFormat;
    }

    /**
     * Set 配置选项，支持配置输出数据格式。

* **Mdbase64** 返回 base64 编码的 markdown 格式文本。
* **Excelbase64** 返回 base64 编码的 excel 文件。
     * @param DataFormat 配置选项，支持配置输出数据格式。

* **Mdbase64** 返回 base64 编码的 markdown 格式文本。
* **Excelbase64** 返回 base64 编码的 excel 文件。
     */
    public void setDataFormat(String DataFormat) {
        this.DataFormat = DataFormat;
    }

    public RecognizeTableMultiOCRRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecognizeTableMultiOCRRequest(RecognizeTableMultiOCRRequest source) {
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.PdfStartPageNumber != null) {
            this.PdfStartPageNumber = new Long(source.PdfStartPageNumber);
        }
        if (source.PdfEndPageNumber != null) {
            this.PdfEndPageNumber = new Long(source.PdfEndPageNumber);
        }
        if (source.DataFormat != null) {
            this.DataFormat = new String(source.DataFormat);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "PdfStartPageNumber", this.PdfStartPageNumber);
        this.setParamSimple(map, prefix + "PdfEndPageNumber", this.PdfEndPageNumber);
        this.setParamSimple(map, prefix + "DataFormat", this.DataFormat);

    }
}

