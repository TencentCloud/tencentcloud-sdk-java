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

public class VerifyOfdVatInvoiceOCRRequest extends AbstractModel{

    /**
    * OFD文件的 Url 地址。
    */
    @SerializedName("OfdFileUrl")
    @Expose
    private String OfdFileUrl;

    /**
    * OFD文件的 Base64 值。
OfdFileUrl 和 OfdFileBase64 必传其一，若两者都传，只解析OfdFileBase64。
    */
    @SerializedName("OfdFileBase64")
    @Expose
    private String OfdFileBase64;

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
     * Get OFD文件的 Base64 值。
OfdFileUrl 和 OfdFileBase64 必传其一，若两者都传，只解析OfdFileBase64。 
     * @return OfdFileBase64 OFD文件的 Base64 值。
OfdFileUrl 和 OfdFileBase64 必传其一，若两者都传，只解析OfdFileBase64。
     */
    public String getOfdFileBase64() {
        return this.OfdFileBase64;
    }

    /**
     * Set OFD文件的 Base64 值。
OfdFileUrl 和 OfdFileBase64 必传其一，若两者都传，只解析OfdFileBase64。
     * @param OfdFileBase64 OFD文件的 Base64 值。
OfdFileUrl 和 OfdFileBase64 必传其一，若两者都传，只解析OfdFileBase64。
     */
    public void setOfdFileBase64(String OfdFileBase64) {
        this.OfdFileBase64 = OfdFileBase64;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OfdFileUrl", this.OfdFileUrl);
        this.setParamSimple(map, prefix + "OfdFileBase64", this.OfdFileBase64);

    }
}

