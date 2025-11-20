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

public class DescribeMongoDBProcessListRequest extends AbstractModel {

    /**
    * 实例 ID。可通过 [DescribeDiagDBInstances](https://cloud.tencent.com/document/api/1130/57798) 接口获取。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 服务产品类型，支持值：mongodb
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * 线程的ID，用于筛选线程列表。
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 线程的操作主机地址，用于筛选线程列表。
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 线程的操作数据库，用于筛选线程列表,如果是多个 使用 ','  分割
    */
    @SerializedName("DB")
    @Expose
    private String DB;

    /**
    * 命令类型 ,如果是多个 使用 ','  分割
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 线程的操作时长最小值，单位秒，用于筛选操作时长大于该值的线程列表。
    */
    @SerializedName("Time")
    @Expose
    private Long Time;

    /**
    * 返回数量，默认20。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 实例 ID。可通过 [DescribeDiagDBInstances](https://cloud.tencent.com/document/api/1130/57798) 接口获取。 
     * @return InstanceId 实例 ID。可通过 [DescribeDiagDBInstances](https://cloud.tencent.com/document/api/1130/57798) 接口获取。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID。可通过 [DescribeDiagDBInstances](https://cloud.tencent.com/document/api/1130/57798) 接口获取。
     * @param InstanceId 实例 ID。可通过 [DescribeDiagDBInstances](https://cloud.tencent.com/document/api/1130/57798) 接口获取。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 服务产品类型，支持值：mongodb 
     * @return Product 服务产品类型，支持值：mongodb
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 服务产品类型，支持值：mongodb
     * @param Product 服务产品类型，支持值：mongodb
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get 线程的ID，用于筛选线程列表。 
     * @return ID 线程的ID，用于筛选线程列表。
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 线程的ID，用于筛选线程列表。
     * @param ID 线程的ID，用于筛选线程列表。
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get 线程的操作主机地址，用于筛选线程列表。 
     * @return Host 线程的操作主机地址，用于筛选线程列表。
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 线程的操作主机地址，用于筛选线程列表。
     * @param Host 线程的操作主机地址，用于筛选线程列表。
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get 线程的操作数据库，用于筛选线程列表,如果是多个 使用 ','  分割 
     * @return DB 线程的操作数据库，用于筛选线程列表,如果是多个 使用 ','  分割
     */
    public String getDB() {
        return this.DB;
    }

    /**
     * Set 线程的操作数据库，用于筛选线程列表,如果是多个 使用 ','  分割
     * @param DB 线程的操作数据库，用于筛选线程列表,如果是多个 使用 ','  分割
     */
    public void setDB(String DB) {
        this.DB = DB;
    }

    /**
     * Get 命令类型 ,如果是多个 使用 ','  分割 
     * @return Type 命令类型 ,如果是多个 使用 ','  分割
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 命令类型 ,如果是多个 使用 ','  分割
     * @param Type 命令类型 ,如果是多个 使用 ','  分割
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 线程的操作时长最小值，单位秒，用于筛选操作时长大于该值的线程列表。 
     * @return Time 线程的操作时长最小值，单位秒，用于筛选操作时长大于该值的线程列表。
     */
    public Long getTime() {
        return this.Time;
    }

    /**
     * Set 线程的操作时长最小值，单位秒，用于筛选操作时长大于该值的线程列表。
     * @param Time 线程的操作时长最小值，单位秒，用于筛选操作时长大于该值的线程列表。
     */
    public void setTime(Long Time) {
        this.Time = Time;
    }

    /**
     * Get 返回数量，默认20。 
     * @return Limit 返回数量，默认20。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认20。
     * @param Limit 返回数量，默认20。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeMongoDBProcessListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMongoDBProcessListRequest(DescribeMongoDBProcessListRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.DB != null) {
            this.DB = new String(source.DB);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Time != null) {
            this.Time = new Long(source.Time);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "DB", this.DB);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

