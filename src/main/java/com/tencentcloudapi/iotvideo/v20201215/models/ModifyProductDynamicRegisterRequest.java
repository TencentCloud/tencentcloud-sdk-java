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

public class ModifyProductDynamicRegisterRequest extends AbstractModel{

    /**
    * 产品ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 动态注册类型，0-关闭 1-预创建设备 2-自动创建设备
    */
    @SerializedName("RegisterType")
    @Expose
    private Long RegisterType;

    /**
    * 动态注册设备上限
    */
    @SerializedName("RegisterLimit")
    @Expose
    private Long RegisterLimit;

    /**
     * Get 产品ID 
     * @return ProductId 产品ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品ID
     * @param ProductId 产品ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

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

    public ModifyProductDynamicRegisterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyProductDynamicRegisterRequest(ModifyProductDynamicRegisterRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.RegisterType != null) {
            this.RegisterType = new Long(source.RegisterType);
        }
        if (source.RegisterLimit != null) {
            this.RegisterLimit = new Long(source.RegisterLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "RegisterType", this.RegisterType);
        this.setParamSimple(map, prefix + "RegisterLimit", this.RegisterLimit);

    }
}

