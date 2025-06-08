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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIndexRecommendAggregationSlowLogsRequest extends AbstractModel {

    /**
    * 服务产品类型，支持值包括："mongodb" - 云数据库 。
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * 实例ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 数据库名称。
    */
    @SerializedName("Db")
    @Expose
    private String Db;

    /**
    * 表名。
    */
    @SerializedName("Collection")
    @Expose
    private String Collection;

    /**
    * 签名。这个值是DescribelndexRecommendInfo接口返回
    */
    @SerializedName("Signs")
    @Expose
    private String [] Signs;

    /**
     * Get 服务产品类型，支持值包括："mongodb" - 云数据库 。 
     * @return Product 服务产品类型，支持值包括："mongodb" - 云数据库 。
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 服务产品类型，支持值包括："mongodb" - 云数据库 。
     * @param Product 服务产品类型，支持值包括："mongodb" - 云数据库 。
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get 实例ID。 
     * @return InstanceId 实例ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID。
     * @param InstanceId 实例ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 数据库名称。 
     * @return Db 数据库名称。
     */
    public String getDb() {
        return this.Db;
    }

    /**
     * Set 数据库名称。
     * @param Db 数据库名称。
     */
    public void setDb(String Db) {
        this.Db = Db;
    }

    /**
     * Get 表名。 
     * @return Collection 表名。
     */
    public String getCollection() {
        return this.Collection;
    }

    /**
     * Set 表名。
     * @param Collection 表名。
     */
    public void setCollection(String Collection) {
        this.Collection = Collection;
    }

    /**
     * Get 签名。这个值是DescribelndexRecommendInfo接口返回 
     * @return Signs 签名。这个值是DescribelndexRecommendInfo接口返回
     */
    public String [] getSigns() {
        return this.Signs;
    }

    /**
     * Set 签名。这个值是DescribelndexRecommendInfo接口返回
     * @param Signs 签名。这个值是DescribelndexRecommendInfo接口返回
     */
    public void setSigns(String [] Signs) {
        this.Signs = Signs;
    }

    public DescribeIndexRecommendAggregationSlowLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIndexRecommendAggregationSlowLogsRequest(DescribeIndexRecommendAggregationSlowLogsRequest source) {
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Db != null) {
            this.Db = new String(source.Db);
        }
        if (source.Collection != null) {
            this.Collection = new String(source.Collection);
        }
        if (source.Signs != null) {
            this.Signs = new String[source.Signs.length];
            for (int i = 0; i < source.Signs.length; i++) {
                this.Signs[i] = new String(source.Signs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Db", this.Db);
        this.setParamSimple(map, prefix + "Collection", this.Collection);
        this.setParamArraySimple(map, prefix + "Signs.", this.Signs);

    }
}

