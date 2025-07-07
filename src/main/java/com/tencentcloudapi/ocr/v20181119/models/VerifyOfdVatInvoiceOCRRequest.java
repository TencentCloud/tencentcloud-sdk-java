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

public class VerifyOfdVatInvoiceOCRRequest extends AbstractModel {

    /**
    * OFD文件的 Url 地址。
    */
    @SerializedName("OfdFileUrl")
    @Expose
    private String OfdFileUrl;

    /**
    * OFD文件的 Base64 值。OfdFileUrl 和 OfdFileBase64 必传其一，若两者都传，只使用OfdFileUrl。
    */
    @SerializedName("OfdFileBase64")
    @Expose
    private String OfdFileBase64;

    /**
    * 需要识别的OFD发票页面的对应页码，默认值为1。 示例值：1
    */
    @SerializedName("OfdPageNumber")
    @Expose
    private Long OfdPageNumber;

    /**
     * Get OFD文件的 Url 地址。 
     * @return OfdFileUrl OFD文件的 Url 地址。
     */
    public String getOfdFileUrl() {
        return this.OfdFileUrl;
    }

    /**
     * Set OFD文件的 Url 地址。
     * @param OfdFileUrl OFD文件的 Url 地址。
     */
    public void setOfdFileUrl(String OfdFileUrl) {
        this.OfdFileUrl = OfdFileUrl;
    }

    /**
     * Get OFD文件的 Base64 值。OfdFileUrl 和 OfdFileBase64 必传其一，若两者都传，只使用OfdFileUrl。 
     * @return OfdFileBase64 OFD文件的 Base64 值。OfdFileUrl 和 OfdFileBase64 必传其一，若两者都传，只使用OfdFileUrl。
     */
    public String getOfdFileBase64() {
        return this.OfdFileBase64;
    }

    /**
     * Set OFD文件的 Base64 值。OfdFileUrl 和 OfdFileBase64 必传其一，若两者都传，只使用OfdFileUrl。
     * @param OfdFileBase64 OFD文件的 Base64 值。OfdFileUrl 和 OfdFileBase64 必传其一，若两者都传，只使用OfdFileUrl。
     */
    public void setOfdFileBase64(String OfdFileBase64) {
        this.OfdFileBase64 = OfdFileBase64;
    }

    /**
     * Get 需要识别的OFD发票页面的对应页码，默认值为1。 示例值：1 
     * @return OfdPageNumber 需要识别的OFD发票页面的对应页码，默认值为1。 示例值：1
     */
    public Long getOfdPageNumber() {
        return this.OfdPageNumber;
    }

    /**
     * Set 需要识别的OFD发票页面的对应页码，默认值为1。 示例值：1
     * @param OfdPageNumber 需要识别的OFD发票页面的对应页码，默认值为1。 示例值：1
     */
    public void setOfdPageNumber(Long OfdPageNumber) {
        this.OfdPageNumber = OfdPageNumber;
    }

    public VerifyOfdVatInvoiceOCRRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VerifyOfdVatInvoiceOCRRequest(VerifyOfdVatInvoiceOCRRequest source) {
        if (source.OfdFileUrl != null) {
            this.OfdFileUrl = new String(source.OfdFileUrl);
        }
        if (source.OfdFileBase64 != null) {
            this.OfdFileBase64 = new String(source.OfdFileBase64);
        }
        if (source.OfdPageNumber != null) {
            this.OfdPageNumber = new Long(source.OfdPageNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OfdFileUrl", this.OfdFileUrl);
        this.setParamSimple(map, prefix + "OfdFileBase64", this.OfdFileBase64);
        this.setParamSimple(map, prefix + "OfdPageNumber", this.OfdPageNumber);

    }
}

