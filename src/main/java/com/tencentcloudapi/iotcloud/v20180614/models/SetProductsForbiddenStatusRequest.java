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
package com.tencentcloudapi.iotcloud.v20180614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetProductsForbiddenStatusRequest extends AbstractModel{

    /**
    * 要设置禁用状态的产品列表
    */
    @SerializedName("ProductID")
    @Expose
    private String [] ProductID;

    /**
    * 0启用，1禁用
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 要设置禁用状态的产品列表 
     * @return ProductID 要设置禁用状态的产品列表
     */
    public String [] getProductID() {
        return this.ProductID;
    }

    /**
     * Set 要设置禁用状态的产品列表
     * @param ProductID 要设置禁用状态的产品列表
     */
    public void setProductID(String [] ProductID) {
        this.ProductID = ProductID;
    }

    /**
     * Get 0启用，1禁用 
     * @return Status 0启用，1禁用
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 0启用，1禁用
     * @param Status 0启用，1禁用
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public SetProductsForbiddenStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetProductsForbiddenStatusRequest(SetProductsForbiddenStatusRequest source) {
        if (source.ProductID != null) {
            this.ProductID = new String[source.ProductID.length];
            for (int i = 0; i < source.ProductID.length; i++) {
                this.ProductID[i] = new String(source.ProductID[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ProductID.", this.ProductID);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

