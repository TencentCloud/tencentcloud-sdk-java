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
package com.tencentcloudapi.iotcloud.v20210408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePrivateCABindedProductsRequest extends AbstractModel{

    /**
    * 证书名称
    */
    @SerializedName("CertName")
    @Expose
    private String CertName;

    /**
    * 查询偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 查询的数据量，默认为20， 最大为200
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 证书名称 
     * @return CertName 证书名称
     */
    public String getCertName() {
        return this.CertName;
    }

    /**
     * Set 证书名称
     * @param CertName 证书名称
     */
    public void setCertName(String CertName) {
        this.CertName = CertName;
    }

    /**
     * Get 查询偏移量 
     * @return Offset 查询偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 查询偏移量
     * @param Offset 查询偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 查询的数据量，默认为20， 最大为200 
     * @return Limit 查询的数据量，默认为20， 最大为200
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 查询的数据量，默认为20， 最大为200
     * @param Limit 查询的数据量，默认为20， 最大为200
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

