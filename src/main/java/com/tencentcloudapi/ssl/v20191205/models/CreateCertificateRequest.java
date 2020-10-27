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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCertificateRequest extends AbstractModel{

    /**
    * 证书商品ID
    */
    @SerializedName("ProductId")
    @Expose
    private Long ProductId;

    /**
    * 证书包含的域名数量
    */
    @SerializedName("DomainNum")
    @Expose
    private Long DomainNum;

    /**
    * 证书年限，当前只支持 1 年证书的购买
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
     * Get 证书商品ID 
     * @return ProductId 证书商品ID
     */
    public Long getProductId() {
        return this.ProductId;
    }

    /**
     * Set 证书商品ID
     * @param ProductId 证书商品ID
     */
    public void setProductId(Long ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 证书包含的域名数量 
     * @return DomainNum 证书包含的域名数量
     */
    public Long getDomainNum() {
        return this.DomainNum;
    }

    /**
     * Set 证书包含的域名数量
     * @param DomainNum 证书包含的域名数量
     */
    public void setDomainNum(Long DomainNum) {
        this.DomainNum = DomainNum;
    }

    /**
     * Get 证书年限，当前只支持 1 年证书的购买 
     * @return TimeSpan 证书年限，当前只支持 1 年证书的购买
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set 证书年限，当前只支持 1 年证书的购买
     * @param TimeSpan 证书年限，当前只支持 1 年证书的购买
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DomainNum", this.DomainNum);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);

    }
}

