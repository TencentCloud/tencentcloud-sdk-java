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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceConfig extends AbstractModel{

    /**
    * 后端类型。启用vpc时生效，目前支持的类型为clb和vpc通道
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * vpc 的唯一ID。
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * API 的后端服务url。如果ServiceType是HTTP，则此参数必传。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * API 的后端服务路径，如 /path。如果 ServiceType 是 HTTP，则此参数必传。前后端路径可不同。
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * API的后端服务请求方法，如 GET。如果 ServiceType 是 HTTP，则此参数必传。前后端方法可不同。
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
     * Get 后端类型。启用vpc时生效，目前支持的类型为clb和vpc通道 
     * @return Product 后端类型。启用vpc时生效，目前支持的类型为clb和vpc通道
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 后端类型。启用vpc时生效，目前支持的类型为clb和vpc通道
     * @param Product 后端类型。启用vpc时生效，目前支持的类型为clb和vpc通道
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get vpc 的唯一ID。 
     * @return UniqVpcId vpc 的唯一ID。
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set vpc 的唯一ID。
     * @param UniqVpcId vpc 的唯一ID。
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get API 的后端服务url。如果ServiceType是HTTP，则此参数必传。 
     * @return Url API 的后端服务url。如果ServiceType是HTTP，则此参数必传。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set API 的后端服务url。如果ServiceType是HTTP，则此参数必传。
     * @param Url API 的后端服务url。如果ServiceType是HTTP，则此参数必传。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get API 的后端服务路径，如 /path。如果 ServiceType 是 HTTP，则此参数必传。前后端路径可不同。 
     * @return Path API 的后端服务路径，如 /path。如果 ServiceType 是 HTTP，则此参数必传。前后端路径可不同。
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set API 的后端服务路径，如 /path。如果 ServiceType 是 HTTP，则此参数必传。前后端路径可不同。
     * @param Path API 的后端服务路径，如 /path。如果 ServiceType 是 HTTP，则此参数必传。前后端路径可不同。
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get API的后端服务请求方法，如 GET。如果 ServiceType 是 HTTP，则此参数必传。前后端方法可不同。 
     * @return Method API的后端服务请求方法，如 GET。如果 ServiceType 是 HTTP，则此参数必传。前后端方法可不同。
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set API的后端服务请求方法，如 GET。如果 ServiceType 是 HTTP，则此参数必传。前后端方法可不同。
     * @param Method API的后端服务请求方法，如 GET。如果 ServiceType 是 HTTP，则此参数必传。前后端方法可不同。
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    public ServiceConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceConfig(ServiceConfig source) {
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Method", this.Method);

    }
}

