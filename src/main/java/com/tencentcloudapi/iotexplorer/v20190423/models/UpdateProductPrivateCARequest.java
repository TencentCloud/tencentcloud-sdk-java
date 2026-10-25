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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateProductPrivateCARequest extends AbstractModel {

    /**
    * <p>产品ID。</p>
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * <p>证书名称，长度 1~32 个字符。</p>
    */
    @SerializedName("CertName")
    @Expose
    private String CertName;

    /**
     * Get <p>产品ID。</p> 
     * @return ProductId <p>产品ID。</p>
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set <p>产品ID。</p>
     * @param ProductId <p>产品ID。</p>
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get <p>证书名称，长度 1~32 个字符。</p> 
     * @return CertName <p>证书名称，长度 1~32 个字符。</p>
     */
    public String getCertName() {
        return this.CertName;
    }

    /**
     * Set <p>证书名称，长度 1~32 个字符。</p>
     * @param CertName <p>证书名称，长度 1~32 个字符。</p>
     */
    public void setCertName(String CertName) {
        this.CertName = CertName;
    }

    public UpdateProductPrivateCARequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateProductPrivateCARequest(UpdateProductPrivateCARequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.CertName != null) {
            this.CertName = new String(source.CertName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "CertName", this.CertName);

    }
}

