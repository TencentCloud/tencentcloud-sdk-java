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
package com.tencentcloudapi.iotvideo.v20201215.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProductDynamicRegisterResponse extends AbstractModel{

    /**
    * 动态注册类型，0-关闭 1-预创建设备 2-自动创建设备
    */
    @SerializedName("RegisterType")
    @Expose
    private Long RegisterType;

    /**
    * 动态注册产品密钥
    */
    @SerializedName("ProductSecret")
    @Expose
    private String ProductSecret;

    /**
    * 动态注册设备上限
    */
    @SerializedName("RegisterLimit")
    @Expose
    private Long RegisterLimit;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 动态注册类型，0-关闭 1-预创建设备 2-自动创建设备 
     * @return RegisterType 动态注册类型，0-关闭 1-预创建设备 2-自动创建设备
     */
    public Long getRegisterType() {
        return this.RegisterType;
    }

    /**
     * Set 动态注册类型，0-关闭 1-预创建设备 2-自动创建设备
     * @param RegisterType 动态注册类型，0-关闭 1-预创建设备 2-自动创建设备
     */
    public void setRegisterType(Long RegisterType) {
        this.RegisterType = RegisterType;
    }

    /**
     * Get 动态注册产品密钥 
     * @return ProductSecret 动态注册产品密钥
     */
    public String getProductSecret() {
        return this.ProductSecret;
    }

    /**
     * Set 动态注册产品密钥
     * @param ProductSecret 动态注册产品密钥
     */
    public void setProductSecret(String ProductSecret) {
        this.ProductSecret = ProductSecret;
    }

    /**
     * Get 动态注册设备上限 
     * @return RegisterLimit 动态注册设备上限
     */
    public Long getRegisterLimit() {
        return this.RegisterLimit;
    }

    /**
     * Set 动态注册设备上限
     * @param RegisterLimit 动态注册设备上限
     */
    public void setRegisterLimit(Long RegisterLimit) {
        this.RegisterLimit = RegisterLimit;
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

    public DescribeProductDynamicRegisterResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProductDynamicRegisterResponse(DescribeProductDynamicRegisterResponse source) {
        if (source.RegisterType != null) {
            this.RegisterType = new Long(source.RegisterType);
        }
        if (source.ProductSecret != null) {
            this.ProductSecret = new String(source.ProductSecret);
        }
        if (source.RegisterLimit != null) {
            this.RegisterLimit = new Long(source.RegisterLimit);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegisterType", this.RegisterType);
        this.setParamSimple(map, prefix + "ProductSecret", this.ProductSecret);
        this.setParamSimple(map, prefix + "RegisterLimit", this.RegisterLimit);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

