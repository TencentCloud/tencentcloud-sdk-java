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

public class DescribeHealthScoreRequest extends AbstractModel {

    /**
    * <p>需要获取健康得分的实例ID。可通过 <a href="https://cloud.tencent.com/document/api/1130/57798">DescribeDiagDBInstances</a> 接口获取。如果是dcdb(TDSQL MySQL)，请使用 <code>{ClusterId}&amp;{InstanceId}</code> 拼接结果代替入参</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>获取健康得分的时间，时间格式如：2019-09-10 12:13:14。</p>
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * <p>服务产品类型，支持值包括： &quot;mysql&quot; - 云数据库 MySQL， &quot;cynosdb&quot; - 云数据库 TDSQL-C for MySQL，&quot;redis&quot; - 云数据库 Redis，默认为&quot;mysql&quot;。</p>
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
     * Get <p>需要获取健康得分的实例ID。可通过 <a href="https://cloud.tencent.com/document/api/1130/57798">DescribeDiagDBInstances</a> 接口获取。如果是dcdb(TDSQL MySQL)，请使用 <code>{ClusterId}&amp;{InstanceId}</code> 拼接结果代替入参</p> 
     * @return InstanceId <p>需要获取健康得分的实例ID。可通过 <a href="https://cloud.tencent.com/document/api/1130/57798">DescribeDiagDBInstances</a> 接口获取。如果是dcdb(TDSQL MySQL)，请使用 <code>{ClusterId}&amp;{InstanceId}</code> 拼接结果代替入参</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>需要获取健康得分的实例ID。可通过 <a href="https://cloud.tencent.com/document/api/1130/57798">DescribeDiagDBInstances</a> 接口获取。如果是dcdb(TDSQL MySQL)，请使用 <code>{ClusterId}&amp;{InstanceId}</code> 拼接结果代替入参</p>
     * @param InstanceId <p>需要获取健康得分的实例ID。可通过 <a href="https://cloud.tencent.com/document/api/1130/57798">DescribeDiagDBInstances</a> 接口获取。如果是dcdb(TDSQL MySQL)，请使用 <code>{ClusterId}&amp;{InstanceId}</code> 拼接结果代替入参</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>获取健康得分的时间，时间格式如：2019-09-10 12:13:14。</p> 
     * @return Time <p>获取健康得分的时间，时间格式如：2019-09-10 12:13:14。</p>
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set <p>获取健康得分的时间，时间格式如：2019-09-10 12:13:14。</p>
     * @param Time <p>获取健康得分的时间，时间格式如：2019-09-10 12:13:14。</p>
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get <p>服务产品类型，支持值包括： &quot;mysql&quot; - 云数据库 MySQL， &quot;cynosdb&quot; - 云数据库 TDSQL-C for MySQL，&quot;redis&quot; - 云数据库 Redis，默认为&quot;mysql&quot;。</p> 
     * @return Product <p>服务产品类型，支持值包括： &quot;mysql&quot; - 云数据库 MySQL， &quot;cynosdb&quot; - 云数据库 TDSQL-C for MySQL，&quot;redis&quot; - 云数据库 Redis，默认为&quot;mysql&quot;。</p>
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set <p>服务产品类型，支持值包括： &quot;mysql&quot; - 云数据库 MySQL， &quot;cynosdb&quot; - 云数据库 TDSQL-C for MySQL，&quot;redis&quot; - 云数据库 Redis，默认为&quot;mysql&quot;。</p>
     * @param Product <p>服务产品类型，支持值包括： &quot;mysql&quot; - 云数据库 MySQL， &quot;cynosdb&quot; - 云数据库 TDSQL-C for MySQL，&quot;redis&quot; - 云数据库 Redis，默认为&quot;mysql&quot;。</p>
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    public DescribeHealthScoreRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHealthScoreRequest(DescribeHealthScoreRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Product", this.Product);

    }
}

