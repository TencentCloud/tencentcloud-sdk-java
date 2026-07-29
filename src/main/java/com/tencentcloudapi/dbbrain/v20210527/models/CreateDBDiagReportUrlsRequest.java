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

public class CreateDBDiagReportUrlsRequest extends AbstractModel {

    /**
    * <p>服务产品类型，支持值包括：&quot;mysql&quot; - 云数据库 MySQL，&quot;redis&quot; - 云数据库 Redis，&quot;cynosdb&quot; - 云数据库 TDSQL-C for MySQL，&quot;mongodb&quot; - 云数据库 MongoDB，&quot;postgres&quot; - 云数据库 PostgreSQL。</p>
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * <p>异步任务ID列表。</p>
    */
    @SerializedName("AsyncRequestIds")
    @Expose
    private Long [] AsyncRequestIds;

    /**
     * Get <p>服务产品类型，支持值包括：&quot;mysql&quot; - 云数据库 MySQL，&quot;redis&quot; - 云数据库 Redis，&quot;cynosdb&quot; - 云数据库 TDSQL-C for MySQL，&quot;mongodb&quot; - 云数据库 MongoDB，&quot;postgres&quot; - 云数据库 PostgreSQL。</p> 
     * @return Product <p>服务产品类型，支持值包括：&quot;mysql&quot; - 云数据库 MySQL，&quot;redis&quot; - 云数据库 Redis，&quot;cynosdb&quot; - 云数据库 TDSQL-C for MySQL，&quot;mongodb&quot; - 云数据库 MongoDB，&quot;postgres&quot; - 云数据库 PostgreSQL。</p>
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set <p>服务产品类型，支持值包括：&quot;mysql&quot; - 云数据库 MySQL，&quot;redis&quot; - 云数据库 Redis，&quot;cynosdb&quot; - 云数据库 TDSQL-C for MySQL，&quot;mongodb&quot; - 云数据库 MongoDB，&quot;postgres&quot; - 云数据库 PostgreSQL。</p>
     * @param Product <p>服务产品类型，支持值包括：&quot;mysql&quot; - 云数据库 MySQL，&quot;redis&quot; - 云数据库 Redis，&quot;cynosdb&quot; - 云数据库 TDSQL-C for MySQL，&quot;mongodb&quot; - 云数据库 MongoDB，&quot;postgres&quot; - 云数据库 PostgreSQL。</p>
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get <p>异步任务ID列表。</p> 
     * @return AsyncRequestIds <p>异步任务ID列表。</p>
     */
    public Long [] getAsyncRequestIds() {
        return this.AsyncRequestIds;
    }

    /**
     * Set <p>异步任务ID列表。</p>
     * @param AsyncRequestIds <p>异步任务ID列表。</p>
     */
    public void setAsyncRequestIds(Long [] AsyncRequestIds) {
        this.AsyncRequestIds = AsyncRequestIds;
    }

    public CreateDBDiagReportUrlsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDBDiagReportUrlsRequest(CreateDBDiagReportUrlsRequest source) {
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.AsyncRequestIds != null) {
            this.AsyncRequestIds = new Long[source.AsyncRequestIds.length];
            for (int i = 0; i < source.AsyncRequestIds.length; i++) {
                this.AsyncRequestIds[i] = new Long(source.AsyncRequestIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamArraySimple(map, prefix + "AsyncRequestIds.", this.AsyncRequestIds);

    }
}

