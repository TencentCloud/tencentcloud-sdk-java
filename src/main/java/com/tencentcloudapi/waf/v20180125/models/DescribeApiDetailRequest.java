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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApiDetailRequest extends AbstractModel {

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Api名称
    */
    @SerializedName("ApiName")
    @Expose
    private String ApiName;

    /**
    * 请求方法
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * 是否仅查询敏感的，1表示查询，0表示不查询
    */
    @SerializedName("IsSensitive")
    @Expose
    private Long IsSensitive;

    /**
    * 是否仅查询泛化的，1表示查询，0表示不查询
    */
    @SerializedName("IsPan")
    @Expose
    private Long IsPan;

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Api名称 
     * @return ApiName Api名称
     */
    public String getApiName() {
        return this.ApiName;
    }

    /**
     * Set Api名称
     * @param ApiName Api名称
     */
    public void setApiName(String ApiName) {
        this.ApiName = ApiName;
    }

    /**
     * Get 请求方法 
     * @return Method 请求方法
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set 请求方法
     * @param Method 请求方法
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get 是否仅查询敏感的，1表示查询，0表示不查询 
     * @return IsSensitive 是否仅查询敏感的，1表示查询，0表示不查询
     */
    public Long getIsSensitive() {
        return this.IsSensitive;
    }

    /**
     * Set 是否仅查询敏感的，1表示查询，0表示不查询
     * @param IsSensitive 是否仅查询敏感的，1表示查询，0表示不查询
     */
    public void setIsSensitive(Long IsSensitive) {
        this.IsSensitive = IsSensitive;
    }

    /**
     * Get 是否仅查询泛化的，1表示查询，0表示不查询 
     * @return IsPan 是否仅查询泛化的，1表示查询，0表示不查询
     */
    public Long getIsPan() {
        return this.IsPan;
    }

    /**
     * Set 是否仅查询泛化的，1表示查询，0表示不查询
     * @param IsPan 是否仅查询泛化的，1表示查询，0表示不查询
     */
    public void setIsPan(Long IsPan) {
        this.IsPan = IsPan;
    }

    public DescribeApiDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApiDetailRequest(DescribeApiDetailRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.ApiName != null) {
            this.ApiName = new String(source.ApiName);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.IsSensitive != null) {
            this.IsSensitive = new Long(source.IsSensitive);
        }
        if (source.IsPan != null) {
            this.IsPan = new Long(source.IsPan);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "ApiName", this.ApiName);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "IsSensitive", this.IsSensitive);
        this.setParamSimple(map, prefix + "IsPan", this.IsPan);

    }
}

