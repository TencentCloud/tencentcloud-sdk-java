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
    * 默认值为0。如果图片为PDF时，返回PDF的总页数。
    */
    @SerializedName("PdfPageSize")
    @Expose
    private Long PdfPageSize;

    /**
    * 图片旋转角度（角度制），文本的水平方向为0°；顺时针为正，逆时针为负。点击查看<a href="https://cloud.tencent.com/document/product/866/45139">如何纠正倾斜文本</a>
    */
    @SerializedName("Angle")
    @Expose
    private Float Angle;

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
     * Get 默认值为0。如果图片为PDF时，返回PDF的总页数。 
     * @return PdfPageSize 默认值为0。如果图片为PDF时，返回PDF的总页数。
     */
    public Long getPdfPageSize() {
        return this.PdfPageSize;
    }

    /**
     * Set 默认值为0。如果图片为PDF时，返回PDF的总页数。
     * @param PdfPageSize 默认值为0。如果图片为PDF时，返回PDF的总页数。
     */
    public void setPdfPageSize(Long PdfPageSize) {
        this.PdfPageSize = PdfPageSize;
    }

    /**
     * Get 图片旋转角度（角度制），文本的水平方向为0°；顺时针为正，逆时针为负。点击查看<a href="https://cloud.tencent.com/document/product/866/45139">如何纠正倾斜文本</a> 
     * @return Angle 图片旋转角度（角度制），文本的水平方向为0°；顺时针为正，逆时针为负。点击查看<a href="https://cloud.tencent.com/document/product/866/45139">如何纠正倾斜文本</a>
     */
    public Float getAngle() {
        return this.Angle;
    }

    /**
     * Set 图片旋转角度（角度制），文本的水平方向为0°；顺时针为正，逆时针为负。点击查看<a href="https://cloud.tencent.com/document/product/866/45139">如何纠正倾斜文本</a>
     * @param Angle 图片旋转角度（角度制），文本的水平方向为0°；顺时针为正，逆时针为负。点击查看<a href="https://cloud.tencent.com/document/product/866/45139">如何纠正倾斜文本</a>
     */
    public void setAngle(Float Angle) {
        this.Angle = Angle;
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

    public VatInvoiceOCRResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VatInvoiceOCRResponse(VatInvoiceOCRResponse source) {
        if (source.VatInvoiceInfos != null) {
            this.VatInvoiceInfos = new TextVatInvoice[source.VatInvoiceInfos.length];
            for (int i = 0; i < source.VatInvoiceInfos.length; i++) {
                this.VatInvoiceInfos[i] = new TextVatInvoice(source.VatInvoiceInfos[i]);
            }
        }
        if (source.Items != null) {
            this.Items = new VatInvoiceItem[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new VatInvoiceItem(source.Items[i]);
            }
        }
        if (source.PdfPageSize != null) {
            this.PdfPageSize = new Long(source.PdfPageSize);
        }
        if (source.Angle != null) {
            this.Angle = new Float(source.Angle);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "VatInvoiceInfos.", this.VatInvoiceInfos);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "PdfPageSize", this.PdfPageSize);
        this.setParamSimple(map, prefix + "Angle", this.Angle);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

