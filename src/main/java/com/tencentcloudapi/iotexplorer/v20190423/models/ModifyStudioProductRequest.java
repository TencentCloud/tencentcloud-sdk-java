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

public class ModifyStudioProductRequest extends AbstractModel {

    /**
    * 产品ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 产品名称
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 产品描述
    */
    @SerializedName("ProductDesc")
    @Expose
    private String ProductDesc;

    /**
    * 模型ID
    */
    @SerializedName("ModuleId")
    @Expose
    private Long ModuleId;

    /**
    * 是否打开二进制转Json功能, 取值为字符串 true/false
    */
    @SerializedName("EnableProductScript")
    @Expose
    private String EnableProductScript;

    /**
    * 传1或者2；1代表强踢，2代表非强踢。传其它值不做任何处理
    */
    @SerializedName("BindStrategy")
    @Expose
    private Long BindStrategy;

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
     * Get 产品名称 
     * @return ProductName 产品名称
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set 产品名称
     * @param ProductName 产品名称
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get 产品描述 
     * @return ProductDesc 产品描述
     */
    public String getProductDesc() {
        return this.ProductDesc;
    }

    /**
     * Set 产品描述
     * @param ProductDesc 产品描述
     */
    public void setProductDesc(String ProductDesc) {
        this.ProductDesc = ProductDesc;
    }

    /**
     * Get 模型ID 
     * @return ModuleId 模型ID
     */
    public Long getModuleId() {
        return this.ModuleId;
    }

    /**
     * Set 模型ID
     * @param ModuleId 模型ID
     */
    public void setModuleId(Long ModuleId) {
        this.ModuleId = ModuleId;
    }

    /**
     * Get 是否打开二进制转Json功能, 取值为字符串 true/false 
     * @return EnableProductScript 是否打开二进制转Json功能, 取值为字符串 true/false
     */
    public String getEnableProductScript() {
        return this.EnableProductScript;
    }

    /**
     * Set 是否打开二进制转Json功能, 取值为字符串 true/false
     * @param EnableProductScript 是否打开二进制转Json功能, 取值为字符串 true/false
     */
    public void setEnableProductScript(String EnableProductScript) {
        this.EnableProductScript = EnableProductScript;
    }

    /**
     * Get 传1或者2；1代表强踢，2代表非强踢。传其它值不做任何处理 
     * @return BindStrategy 传1或者2；1代表强踢，2代表非强踢。传其它值不做任何处理
     */
    public Long getBindStrategy() {
        return this.BindStrategy;
    }

    /**
     * Set 传1或者2；1代表强踢，2代表非强踢。传其它值不做任何处理
     * @param BindStrategy 传1或者2；1代表强踢，2代表非强踢。传其它值不做任何处理
     */
    public void setBindStrategy(Long BindStrategy) {
        this.BindStrategy = BindStrategy;
    }

    public ModifyStudioProductRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyStudioProductRequest(ModifyStudioProductRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.ProductDesc != null) {
            this.ProductDesc = new String(source.ProductDesc);
        }
        if (source.ModuleId != null) {
            this.ModuleId = new Long(source.ModuleId);
        }
        if (source.EnableProductScript != null) {
            this.EnableProductScript = new String(source.EnableProductScript);
        }
        if (source.BindStrategy != null) {
            this.BindStrategy = new Long(source.BindStrategy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "ProductDesc", this.ProductDesc);
        this.setParamSimple(map, prefix + "ModuleId", this.ModuleId);
        this.setParamSimple(map, prefix + "EnableProductScript", this.EnableProductScript);
        this.setParamSimple(map, prefix + "BindStrategy", this.BindStrategy);

    }
}

