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

public class DescribeDBDiagHistoryRequest extends AbstractModel {

    /**
    * 实例 ID。可通过 [DescribeDiagDBInstances](https://cloud.tencent.com/document/api/1130/57798) 接口获取。

查询TDSQL MySQL分布式实例:Instanceld：填写集群ID&Shard实例ID，如：dcdbt-157xxxk&shard-qxxxx
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 开始时间，如“2019-09-10 12:13:14”。结束时间与开始时间的间隔最大可为2天。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间，如“2019-09-11 12:13:14”，结束时间与开始时间的间隔最大可为2天。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 服务产品类型，支持值："mysql" - 云数据库 MySQL；"mariadb"-mariadb;"cynosdb"-TDSQL-C for MySQL ;"dcdb"-TDSQL MySQL ;"redis" - 云数据库 Redis，默认为"mysql"。
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
     * Get 实例 ID。可通过 [DescribeDiagDBInstances](https://cloud.tencent.com/document/api/1130/57798) 接口获取。

查询TDSQL MySQL分布式实例:Instanceld：填写集群ID&Shard实例ID，如：dcdbt-157xxxk&shard-qxxxx 
     * @return InstanceId 实例 ID。可通过 [DescribeDiagDBInstances](https://cloud.tencent.com/document/api/1130/57798) 接口获取。

查询TDSQL MySQL分布式实例:Instanceld：填写集群ID&Shard实例ID，如：dcdbt-157xxxk&shard-qxxxx
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID。可通过 [DescribeDiagDBInstances](https://cloud.tencent.com/document/api/1130/57798) 接口获取。

查询TDSQL MySQL分布式实例:Instanceld：填写集群ID&Shard实例ID，如：dcdbt-157xxxk&shard-qxxxx
     * @param InstanceId 实例 ID。可通过 [DescribeDiagDBInstances](https://cloud.tencent.com/document/api/1130/57798) 接口获取。

查询TDSQL MySQL分布式实例:Instanceld：填写集群ID&Shard实例ID，如：dcdbt-157xxxk&shard-qxxxx
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 开始时间，如“2019-09-10 12:13:14”。结束时间与开始时间的间隔最大可为2天。 
     * @return StartTime 开始时间，如“2019-09-10 12:13:14”。结束时间与开始时间的间隔最大可为2天。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间，如“2019-09-10 12:13:14”。结束时间与开始时间的间隔最大可为2天。
     * @param StartTime 开始时间，如“2019-09-10 12:13:14”。结束时间与开始时间的间隔最大可为2天。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间，如“2019-09-11 12:13:14”，结束时间与开始时间的间隔最大可为2天。 
     * @return EndTime 结束时间，如“2019-09-11 12:13:14”，结束时间与开始时间的间隔最大可为2天。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间，如“2019-09-11 12:13:14”，结束时间与开始时间的间隔最大可为2天。
     * @param EndTime 结束时间，如“2019-09-11 12:13:14”，结束时间与开始时间的间隔最大可为2天。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 服务产品类型，支持值："mysql" - 云数据库 MySQL；"mariadb"-mariadb;"cynosdb"-TDSQL-C for MySQL ;"dcdb"-TDSQL MySQL ;"redis" - 云数据库 Redis，默认为"mysql"。 
     * @return Product 服务产品类型，支持值："mysql" - 云数据库 MySQL；"mariadb"-mariadb;"cynosdb"-TDSQL-C for MySQL ;"dcdb"-TDSQL MySQL ;"redis" - 云数据库 Redis，默认为"mysql"。
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 服务产品类型，支持值："mysql" - 云数据库 MySQL；"mariadb"-mariadb;"cynosdb"-TDSQL-C for MySQL ;"dcdb"-TDSQL MySQL ;"redis" - 云数据库 Redis，默认为"mysql"。
     * @param Product 服务产品类型，支持值："mysql" - 云数据库 MySQL；"mariadb"-mariadb;"cynosdb"-TDSQL-C for MySQL ;"dcdb"-TDSQL MySQL ;"redis" - 云数据库 Redis，默认为"mysql"。
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    public DescribeDBDiagHistoryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBDiagHistoryRequest(DescribeDBDiagHistoryRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
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
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Product", this.Product);

    }
}

