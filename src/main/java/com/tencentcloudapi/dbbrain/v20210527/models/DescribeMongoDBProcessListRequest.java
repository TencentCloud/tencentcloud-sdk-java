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
    * <p>实例 ID。可通过 <a href="https://cloud.tencent.com/document/api/1130/57798">DescribeDiagDBInstances</a> 接口获取。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>服务产品类型，支持值：mongodb</p>
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * <p>线程的ID，用于筛选线程列表。</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>线程的操作主机地址，用于筛选线程列表。</p>
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * <p>线程的操作数据库，用于筛选线程列表,如果是多个 使用 &#39;,&#39;  分割</p>
    */
    @SerializedName("DB")
    @Expose
    private String DB;

    /**
    * <p>命令类型 ,如果是多个 使用 &#39;,&#39;  分割</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>线程的操作时长最小值，单位秒，用于筛选操作时长大于该值的线程列表。</p>
    */
    @SerializedName("Time")
    @Expose
    private Long Time;

    /**
    * <p>返回数量，默认20。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <p>实例 ID。可通过 <a href="https://cloud.tencent.com/document/api/1130/57798">DescribeDiagDBInstances</a> 接口获取。</p> 
     * @return InstanceId <p>实例 ID。可通过 <a href="https://cloud.tencent.com/document/api/1130/57798">DescribeDiagDBInstances</a> 接口获取。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID。可通过 <a href="https://cloud.tencent.com/document/api/1130/57798">DescribeDiagDBInstances</a> 接口获取。</p>
     * @param InstanceId <p>实例 ID。可通过 <a href="https://cloud.tencent.com/document/api/1130/57798">DescribeDiagDBInstances</a> 接口获取。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>服务产品类型，支持值：mongodb</p> 
     * @return Product <p>服务产品类型，支持值：mongodb</p>
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set <p>服务产品类型，支持值：mongodb</p>
     * @param Product <p>服务产品类型，支持值：mongodb</p>
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get <p>线程的ID，用于筛选线程列表。</p> 
     * @return ID <p>线程的ID，用于筛选线程列表。</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>线程的ID，用于筛选线程列表。</p>
     * @param ID <p>线程的ID，用于筛选线程列表。</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>线程的操作主机地址，用于筛选线程列表。</p> 
     * @return Host <p>线程的操作主机地址，用于筛选线程列表。</p>
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set <p>线程的操作主机地址，用于筛选线程列表。</p>
     * @param Host <p>线程的操作主机地址，用于筛选线程列表。</p>
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get <p>线程的操作数据库，用于筛选线程列表,如果是多个 使用 &#39;,&#39;  分割</p> 
     * @return DB <p>线程的操作数据库，用于筛选线程列表,如果是多个 使用 &#39;,&#39;  分割</p>
     */
    public String getDB() {
        return this.DB;
    }

    /**
     * Set <p>线程的操作数据库，用于筛选线程列表,如果是多个 使用 &#39;,&#39;  分割</p>
     * @param DB <p>线程的操作数据库，用于筛选线程列表,如果是多个 使用 &#39;,&#39;  分割</p>
     */
    public void setDB(String DB) {
        this.DB = DB;
    }

    /**
     * Get <p>命令类型 ,如果是多个 使用 &#39;,&#39;  分割</p> 
     * @return Type <p>命令类型 ,如果是多个 使用 &#39;,&#39;  分割</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>命令类型 ,如果是多个 使用 &#39;,&#39;  分割</p>
     * @param Type <p>命令类型 ,如果是多个 使用 &#39;,&#39;  分割</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>线程的操作时长最小值，单位秒，用于筛选操作时长大于该值的线程列表。</p> 
     * @return Time <p>线程的操作时长最小值，单位秒，用于筛选操作时长大于该值的线程列表。</p>
     */
    public Long getTime() {
        return this.Time;
    }

    /**
     * Set <p>线程的操作时长最小值，单位秒，用于筛选操作时长大于该值的线程列表。</p>
     * @param Time <p>线程的操作时长最小值，单位秒，用于筛选操作时长大于该值的线程列表。</p>
     */
    public void setTime(Long Time) {
        this.Time = Time;
    }

    /**
     * Get <p>返回数量，默认20。</p> 
     * @return Limit <p>返回数量，默认20。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>返回数量，默认20。</p>
     * @param Limit <p>返回数量，默认20。</p>
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

