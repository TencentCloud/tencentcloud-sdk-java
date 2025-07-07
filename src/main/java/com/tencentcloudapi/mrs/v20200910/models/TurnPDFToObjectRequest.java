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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TurnPDFToObjectRequest extends AbstractModel {

    /**
    * 体检报告PDF文件信息, 目前只支持传PDF文件的Base64编码字符(PDF文件不能超过10MB，如果超过建议先压缩PDF，再转成base64)
    */
    @SerializedName("PdfInfo")
    @Expose
    private PdfInfo PdfInfo;

    /**
    * PDF文件中的文字是否为文本内容.
如果该字段为true,那么就会自动判断是电子版还是图片，自动选择直接读取文字还是 OCR 方式.
如果该字段为false, 那么始终采用 OCR 方式
    */
    @SerializedName("TextBasedPdfFlag")
    @Expose
    private Boolean TextBasedPdfFlag;

    /**
     * Get 体检报告PDF文件信息, 目前只支持传PDF文件的Base64编码字符(PDF文件不能超过10MB，如果超过建议先压缩PDF，再转成base64) 
     * @return PdfInfo 体检报告PDF文件信息, 目前只支持传PDF文件的Base64编码字符(PDF文件不能超过10MB，如果超过建议先压缩PDF，再转成base64)
     */
    public PdfInfo getPdfInfo() {
        return this.PdfInfo;
    }

    /**
     * Set 体检报告PDF文件信息, 目前只支持传PDF文件的Base64编码字符(PDF文件不能超过10MB，如果超过建议先压缩PDF，再转成base64)
     * @param PdfInfo 体检报告PDF文件信息, 目前只支持传PDF文件的Base64编码字符(PDF文件不能超过10MB，如果超过建议先压缩PDF，再转成base64)
     */
    public void setPdfInfo(PdfInfo PdfInfo) {
        this.PdfInfo = PdfInfo;
    }

    /**
     * Get PDF文件中的文字是否为文本内容.
如果该字段为true,那么就会自动判断是电子版还是图片，自动选择直接读取文字还是 OCR 方式.
如果该字段为false, 那么始终采用 OCR 方式 
     * @return TextBasedPdfFlag PDF文件中的文字是否为文本内容.
如果该字段为true,那么就会自动判断是电子版还是图片，自动选择直接读取文字还是 OCR 方式.
如果该字段为false, 那么始终采用 OCR 方式
     */
    public Boolean getTextBasedPdfFlag() {
        return this.TextBasedPdfFlag;
    }

    /**
     * Set PDF文件中的文字是否为文本内容.
如果该字段为true,那么就会自动判断是电子版还是图片，自动选择直接读取文字还是 OCR 方式.
如果该字段为false, 那么始终采用 OCR 方式
     * @param TextBasedPdfFlag PDF文件中的文字是否为文本内容.
如果该字段为true,那么就会自动判断是电子版还是图片，自动选择直接读取文字还是 OCR 方式.
如果该字段为false, 那么始终采用 OCR 方式
     */
    public void setTextBasedPdfFlag(Boolean TextBasedPdfFlag) {
        this.TextBasedPdfFlag = TextBasedPdfFlag;
    }

    public TurnPDFToObjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TurnPDFToObjectRequest(TurnPDFToObjectRequest source) {
        if (source.PdfInfo != null) {
            this.PdfInfo = new PdfInfo(source.PdfInfo);
        }
        if (source.TextBasedPdfFlag != null) {
            this.TextBasedPdfFlag = new Boolean(source.TextBasedPdfFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "PdfInfo.", this.PdfInfo);
        this.setParamSimple(map, prefix + "TextBasedPdfFlag", this.TextBasedPdfFlag);

    }
}

