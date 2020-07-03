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
package com.tencentcloudapi.iotvideo.v20191126.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDevicesRequest extends AbstractModel{

    /**
    * 产品ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 创建设备的数量，数量范围1-100
    */
    @SerializedName("Number")
    @Expose
    private Long Number;

    /**
    * 设备名称前缀，支持英文、数字，不超过10字符
    */
    @SerializedName("NamePrefix")
    @Expose
    private String NamePrefix;

    /**
    * 操作人
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

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
     * Get 创建设备的数量，数量范围1-100 
     * @return Number 创建设备的数量，数量范围1-100
     */
    public Long getNumber() {
        return this.Number;
    }

    /**
     * Set 创建设备的数量，数量范围1-100
     * @param Number 创建设备的数量，数量范围1-100
     */
    public void setNumber(Long Number) {
        this.Number = Number;
    }

    /**
     * Get 设备名称前缀，支持英文、数字，不超过10字符 
     * @return NamePrefix 设备名称前缀，支持英文、数字，不超过10字符
     */
    public String getNamePrefix() {
        return this.NamePrefix;
    }

    /**
     * Set 设备名称前缀，支持英文、数字，不超过10字符
     * @param NamePrefix 设备名称前缀，支持英文、数字，不超过10字符
     */
    public void setNamePrefix(String NamePrefix) {
        this.NamePrefix = NamePrefix;
    }

    /**
     * Get 操作人 
     * @return Operator 操作人
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作人
     * @param Operator 操作人
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamSimple(map, prefix + "NamePrefix", this.NamePrefix);
        this.setParamSimple(map, prefix + "Operator", this.Operator);

    }
}

