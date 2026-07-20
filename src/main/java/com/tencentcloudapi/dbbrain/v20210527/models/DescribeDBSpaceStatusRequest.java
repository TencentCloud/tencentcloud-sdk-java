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

public class DescribeDBSpaceStatusRequest extends AbstractModel {

    /**
    * <p>实例 ID。可通过 <a href="https://cloud.tencent.com/document/api/1130/57798">DescribeDiagDBInstances</a> 接口获取。(备注，dcdb的InstanceId 要求使用 <code>ClusterId&amp;InstanceId</code>代替)</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>时间段天数，截止日期为当日，默认为7天。</p>
    */
    @SerializedName("RangeDays")
    @Expose
    private Long RangeDays;

    /**
    * <p>服务产品类型，支持值包括： &quot;mysql&quot; - 云数据库 MySQL， &quot;cynosdb&quot; - 云数据库 CynosDB  for MySQL，&quot;mongodb&quot; - 云数据库 MongoDB，&quot;dcdb&quot; -（TDSQL MySQL 版）、&quot;mariadb&quot; -（TDSQL MariaDB 版）、&quot;tdstore&quot; - 云数据库TDSQL Boundless，默认为&quot;mysql&quot;。</p>
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
     * Get <p>实例 ID。可通过 <a href="https://cloud.tencent.com/document/api/1130/57798">DescribeDiagDBInstances</a> 接口获取。(备注，dcdb的InstanceId 要求使用 <code>ClusterId&amp;InstanceId</code>代替)</p> 
     * @return InstanceId <p>实例 ID。可通过 <a href="https://cloud.tencent.com/document/api/1130/57798">DescribeDiagDBInstances</a> 接口获取。(备注，dcdb的InstanceId 要求使用 <code>ClusterId&amp;InstanceId</code>代替)</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID。可通过 <a href="https://cloud.tencent.com/document/api/1130/57798">DescribeDiagDBInstances</a> 接口获取。(备注，dcdb的InstanceId 要求使用 <code>ClusterId&amp;InstanceId</code>代替)</p>
     * @param InstanceId <p>实例 ID。可通过 <a href="https://cloud.tencent.com/document/api/1130/57798">DescribeDiagDBInstances</a> 接口获取。(备注，dcdb的InstanceId 要求使用 <code>ClusterId&amp;InstanceId</code>代替)</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>时间段天数，截止日期为当日，默认为7天。</p> 
     * @return RangeDays <p>时间段天数，截止日期为当日，默认为7天。</p>
     */
    public Long getRangeDays() {
        return this.RangeDays;
    }

    /**
     * Set <p>时间段天数，截止日期为当日，默认为7天。</p>
     * @param RangeDays <p>时间段天数，截止日期为当日，默认为7天。</p>
     */
    public void setRangeDays(Long RangeDays) {
        this.RangeDays = RangeDays;
    }

    /**
     * Get <p>服务产品类型，支持值包括： &quot;mysql&quot; - 云数据库 MySQL， &quot;cynosdb&quot; - 云数据库 CynosDB  for MySQL，&quot;mongodb&quot; - 云数据库 MongoDB，&quot;dcdb&quot; -（TDSQL MySQL 版）、&quot;mariadb&quot; -（TDSQL MariaDB 版）、&quot;tdstore&quot; - 云数据库TDSQL Boundless，默认为&quot;mysql&quot;。</p> 
     * @return Product <p>服务产品类型，支持值包括： &quot;mysql&quot; - 云数据库 MySQL， &quot;cynosdb&quot; - 云数据库 CynosDB  for MySQL，&quot;mongodb&quot; - 云数据库 MongoDB，&quot;dcdb&quot; -（TDSQL MySQL 版）、&quot;mariadb&quot; -（TDSQL MariaDB 版）、&quot;tdstore&quot; - 云数据库TDSQL Boundless，默认为&quot;mysql&quot;。</p>
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set <p>服务产品类型，支持值包括： &quot;mysql&quot; - 云数据库 MySQL， &quot;cynosdb&quot; - 云数据库 CynosDB  for MySQL，&quot;mongodb&quot; - 云数据库 MongoDB，&quot;dcdb&quot; -（TDSQL MySQL 版）、&quot;mariadb&quot; -（TDSQL MariaDB 版）、&quot;tdstore&quot; - 云数据库TDSQL Boundless，默认为&quot;mysql&quot;。</p>
     * @param Product <p>服务产品类型，支持值包括： &quot;mysql&quot; - 云数据库 MySQL， &quot;cynosdb&quot; - 云数据库 CynosDB  for MySQL，&quot;mongodb&quot; - 云数据库 MongoDB，&quot;dcdb&quot; -（TDSQL MySQL 版）、&quot;mariadb&quot; -（TDSQL MariaDB 版）、&quot;tdstore&quot; - 云数据库TDSQL Boundless，默认为&quot;mysql&quot;。</p>
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    public DescribeDBSpaceStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBSpaceStatusRequest(DescribeDBSpaceStatusRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.RangeDays != null) {
            this.RangeDays = new Long(source.RangeDays);
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
        this.setParamSimple(map, prefix + "RangeDays", this.RangeDays);
        this.setParamSimple(map, prefix + "Product", this.Product);

    }
}

