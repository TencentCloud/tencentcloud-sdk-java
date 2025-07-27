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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDataBackupOverviewRequest extends AbstractModel {

    /**
    * 需要查询数据备份概览的云数据库产品类型。可取值为：mysql 指双节点/三节点的高可用实例，mysql-basic 指单节点云盘版实例，mysql-cluster 指云盘版（原集群版）实例。
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
     * Get 需要查询数据备份概览的云数据库产品类型。可取值为：mysql 指双节点/三节点的高可用实例，mysql-basic 指单节点云盘版实例，mysql-cluster 指云盘版（原集群版）实例。 
     * @return Product 需要查询数据备份概览的云数据库产品类型。可取值为：mysql 指双节点/三节点的高可用实例，mysql-basic 指单节点云盘版实例，mysql-cluster 指云盘版（原集群版）实例。
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 需要查询数据备份概览的云数据库产品类型。可取值为：mysql 指双节点/三节点的高可用实例，mysql-basic 指单节点云盘版实例，mysql-cluster 指云盘版（原集群版）实例。
     * @param Product 需要查询数据备份概览的云数据库产品类型。可取值为：mysql 指双节点/三节点的高可用实例，mysql-basic 指单节点云盘版实例，mysql-cluster 指云盘版（原集群版）实例。
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    public DescribeDataBackupOverviewRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDataBackupOverviewRequest(DescribeDataBackupOverviewRequest source) {
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Product", this.Product);

    }
}

