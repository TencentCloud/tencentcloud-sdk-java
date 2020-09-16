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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VatInvoiceOCRResponse extends AbstractModel{

    /**
    * 检测到的文本信息，具体内容请点击左侧链接。
    */
    @SerializedName("VatInvoiceInfos")
    @Expose
    private TextVatInvoice [] VatInvoiceInfos;

    /**
    * 明细条目。VatInvoiceInfos中关于明细项的具体条目。
    */
    @SerializedName("Items")
    @Expose
    private VatInvoiceItem [] Items;

    /**
    * 图片为PDF时，返回PDF的总页数，默认为0
    */
    @SerializedName("PdfPageSize")
    @Expose
    private Long PdfPageSize;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 检测到的文本信息，具体内容请点击左侧链接。 
     * @return VatInvoiceInfos 检测到的文本信息，具体内容请点击左侧链接。
     */
    public TextVatInvoice [] getVatInvoiceInfos() {
        return this.VatInvoiceInfos;
    }

    /**
     * Set 检测到的文本信息，具体内容请点击左侧链接。
     * @param VatInvoiceInfos 检测到的文本信息，具体内容请点击左侧链接。
     */
    public void setVatInvoiceInfos(TextVatInvoice [] VatInvoiceInfos) {
        this.VatInvoiceInfos = VatInvoiceInfos;
    }

    /**
     * Get 明细条目。VatInvoiceInfos中关于明细项的具体条目。 
     * @return Items 明细条目。VatInvoiceInfos中关于明细项的具体条目。
     */
    public VatInvoiceItem [] getItems() {
        return this.Items;
    }

    /**
     * Set 明细条目。VatInvoiceInfos中关于明细项的具体条目。
     * @param Items 明细条目。VatInvoiceInfos中关于明细项的具体条目。
     */
    public void setItems(VatInvoiceItem [] Items) {
        this.Items = Items;
    }

    /**
     * Get 图片为PDF时，返回PDF的总页数，默认为0 
     * @return PdfPageSize 图片为PDF时，返回PDF的总页数，默认为0
     */
    public Long getPdfPageSize() {
        return this.PdfPageSize;
    }

    /**
     * Set 图片为PDF时，返回PDF的总页数，默认为0
     * @param PdfPageSize 图片为PDF时，返回PDF的总页数，默认为0
     */
    public void setPdfPageSize(Long PdfPageSize) {
        this.PdfPageSize = PdfPageSize;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "VatInvoiceInfos.", this.VatInvoiceInfos);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "PdfPageSize", this.PdfPageSize);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

