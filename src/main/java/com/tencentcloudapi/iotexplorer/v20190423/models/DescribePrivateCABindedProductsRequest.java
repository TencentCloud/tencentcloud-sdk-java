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

public class DescribePrivateCABindedProductsRequest extends AbstractModel {

    /**
    * <p>证书名称，长度 1~32 个字符。</p>
    */
    @SerializedName("CertName")
    @Expose
    private String CertName;

    /**
    * <p>分页偏移量。</p><p>取值范围：[0, 5000000]</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>单次返回的数量。</p><p>取值范围：[1, 200]</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

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

    /**
     * Get <p>分页偏移量。</p><p>取值范围：[0, 5000000]</p> 
     * @return Offset <p>分页偏移量。</p><p>取值范围：[0, 5000000]</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页偏移量。</p><p>取值范围：[0, 5000000]</p>
     * @param Offset <p>分页偏移量。</p><p>取值范围：[0, 5000000]</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>单次返回的数量。</p><p>取值范围：[1, 200]</p> 
     * @return Limit <p>单次返回的数量。</p><p>取值范围：[1, 200]</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>单次返回的数量。</p><p>取值范围：[1, 200]</p>
     * @param Limit <p>单次返回的数量。</p><p>取值范围：[1, 200]</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribePrivateCABindedProductsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePrivateCABindedProductsRequest(DescribePrivateCABindedProductsRequest source) {
        if (source.CertName != null) {
            this.CertName = new String(source.CertName);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertName", this.CertName);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

