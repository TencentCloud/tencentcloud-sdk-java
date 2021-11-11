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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchProductionInfo extends AbstractModel{

    /**
    * 量产ID
    */
    @SerializedName("BatchProductionId")
    @Expose
    private String BatchProductionId;

    /**
    * 产品ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 烧录方式
    */
    @SerializedName("BurnMethod")
    @Expose
    private Long BurnMethod;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 产品名称
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
     * Get 量产ID 
     * @return BatchProductionId 量产ID
     */
    public String getBatchProductionId() {
        return this.BatchProductionId;
    }

    /**
     * Set 量产ID
     * @param BatchProductionId 量产ID
     */
    public void setBatchProductionId(String BatchProductionId) {
        this.BatchProductionId = BatchProductionId;
    }

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
     * Get 烧录方式 
     * @return BurnMethod 烧录方式
     */
    public Long getBurnMethod() {
        return this.BurnMethod;
    }

    /**
     * Set 烧录方式
     * @param BurnMethod 烧录方式
     */
    public void setBurnMethod(Long BurnMethod) {
        this.BurnMethod = BurnMethod;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
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

    public BatchProductionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchProductionInfo(BatchProductionInfo source) {
        if (source.BatchProductionId != null) {
            this.BatchProductionId = new String(source.BatchProductionId);
        }
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.BurnMethod != null) {
            this.BurnMethod = new Long(source.BurnMethod);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BatchProductionId", this.BatchProductionId);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "BurnMethod", this.BurnMethod);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);

    }
}

