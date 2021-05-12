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

public class CreateBatchRequest extends AbstractModel{

    /**
    * 产品ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 批次创建的设备数量
    */
    @SerializedName("DevNum")
    @Expose
    private Long DevNum;

    /**
    * 批次创建的设备前缀。不超过24个字符
    */
    @SerializedName("DevPre")
    @Expose
    private String DevPre;

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
     * Get 批次创建的设备数量 
     * @return DevNum 批次创建的设备数量
     */
    public Long getDevNum() {
        return this.DevNum;
    }

    /**
     * Set 批次创建的设备数量
     * @param DevNum 批次创建的设备数量
     */
    public void setDevNum(Long DevNum) {
        this.DevNum = DevNum;
    }

    /**
     * Get 批次创建的设备前缀。不超过24个字符 
     * @return DevPre 批次创建的设备前缀。不超过24个字符
     */
    public String getDevPre() {
        return this.DevPre;
    }

    /**
     * Set 批次创建的设备前缀。不超过24个字符
     * @param DevPre 批次创建的设备前缀。不超过24个字符
     */
    public void setDevPre(String DevPre) {
        this.DevPre = DevPre;
    }

    public CreateBatchRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBatchRequest(CreateBatchRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DevNum != null) {
            this.DevNum = new Long(source.DevNum);
        }
        if (source.DevPre != null) {
            this.DevPre = new String(source.DevPre);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DevNum", this.DevNum);
        this.setParamSimple(map, prefix + "DevPre", this.DevPre);

    }
}

