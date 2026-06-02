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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDatabaseAutonomyStatusRequest extends AbstractModel {

    /**
    * <p>实例 ID。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>服务产品类型。取值：mongodb（云数据库 MongoDB）。</p>
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * <p>自治功能类型。取值：AutoIndexAdvice（索引推荐）。</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get <p>实例 ID。</p> 
     * @return InstanceId <p>实例 ID。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID。</p>
     * @param InstanceId <p>实例 ID。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>服务产品类型。取值：mongodb（云数据库 MongoDB）。</p> 
     * @return Product <p>服务产品类型。取值：mongodb（云数据库 MongoDB）。</p>
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set <p>服务产品类型。取值：mongodb（云数据库 MongoDB）。</p>
     * @param Product <p>服务产品类型。取值：mongodb（云数据库 MongoDB）。</p>
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get <p>自治功能类型。取值：AutoIndexAdvice（索引推荐）。</p> 
     * @return Type <p>自治功能类型。取值：AutoIndexAdvice（索引推荐）。</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>自治功能类型。取值：AutoIndexAdvice（索引推荐）。</p>
     * @param Type <p>自治功能类型。取值：AutoIndexAdvice（索引推荐）。</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public DescribeDatabaseAutonomyStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDatabaseAutonomyStatusRequest(DescribeDatabaseAutonomyStatusRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

