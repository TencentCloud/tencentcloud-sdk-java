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

public class DescribeSlowLogQueryTimeStatsRequest extends AbstractModel {

    /**
    * <p>实例 ID。可通过 <a href="https://cloud.tencent.com/document/api/1130/57798">DescribeDiagDBInstances</a> 接口获取。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>开始时间，如“2019-09-10 12:13:14”，截止时间与开始时间的间隔小于7天。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>截止时间，如“2019-09-11 10:13:14”，截止时间与开始时间的间隔小于7天。</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>&quot;mysql&quot; - 云数据库 MySQL， &quot;cynosdb&quot; - 云数据库 TDSQL-C for MySQL，&quot;redis&quot; - 云数据库 Redis，&quot;mongodb&quot; - 云数据库 MongoDB，&quot;sqlserver&quot; - 云数据库 SQL Server，默认为&quot;mysql&quot;。</p>
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * <p>Proxy节点ID。</p>
    */
    @SerializedName("InstanceProxyId")
    @Expose
    private String InstanceProxyId;

    /**
    * <p>实例节点ID。</p>
    */
    @SerializedName("InstanceNodeId")
    @Expose
    private String InstanceNodeId;

    /**
    * <p>查询类型，目前支持值：mongod，mongos。<br>其中：<br>mongod - MongoDB的数据存储节点<br>mongos - MongoDB的路由节点</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

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
     * Get <p>开始时间，如“2019-09-10 12:13:14”，截止时间与开始时间的间隔小于7天。</p> 
     * @return StartTime <p>开始时间，如“2019-09-10 12:13:14”，截止时间与开始时间的间隔小于7天。</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间，如“2019-09-10 12:13:14”，截止时间与开始时间的间隔小于7天。</p>
     * @param StartTime <p>开始时间，如“2019-09-10 12:13:14”，截止时间与开始时间的间隔小于7天。</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>截止时间，如“2019-09-11 10:13:14”，截止时间与开始时间的间隔小于7天。</p> 
     * @return EndTime <p>截止时间，如“2019-09-11 10:13:14”，截止时间与开始时间的间隔小于7天。</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>截止时间，如“2019-09-11 10:13:14”，截止时间与开始时间的间隔小于7天。</p>
     * @param EndTime <p>截止时间，如“2019-09-11 10:13:14”，截止时间与开始时间的间隔小于7天。</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>&quot;mysql&quot; - 云数据库 MySQL， &quot;cynosdb&quot; - 云数据库 TDSQL-C for MySQL，&quot;redis&quot; - 云数据库 Redis，&quot;mongodb&quot; - 云数据库 MongoDB，&quot;sqlserver&quot; - 云数据库 SQL Server，默认为&quot;mysql&quot;。</p> 
     * @return Product <p>&quot;mysql&quot; - 云数据库 MySQL， &quot;cynosdb&quot; - 云数据库 TDSQL-C for MySQL，&quot;redis&quot; - 云数据库 Redis，&quot;mongodb&quot; - 云数据库 MongoDB，&quot;sqlserver&quot; - 云数据库 SQL Server，默认为&quot;mysql&quot;。</p>
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set <p>&quot;mysql&quot; - 云数据库 MySQL， &quot;cynosdb&quot; - 云数据库 TDSQL-C for MySQL，&quot;redis&quot; - 云数据库 Redis，&quot;mongodb&quot; - 云数据库 MongoDB，&quot;sqlserver&quot; - 云数据库 SQL Server，默认为&quot;mysql&quot;。</p>
     * @param Product <p>&quot;mysql&quot; - 云数据库 MySQL， &quot;cynosdb&quot; - 云数据库 TDSQL-C for MySQL，&quot;redis&quot; - 云数据库 Redis，&quot;mongodb&quot; - 云数据库 MongoDB，&quot;sqlserver&quot; - 云数据库 SQL Server，默认为&quot;mysql&quot;。</p>
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get <p>Proxy节点ID。</p> 
     * @return InstanceProxyId <p>Proxy节点ID。</p>
     */
    public String getInstanceProxyId() {
        return this.InstanceProxyId;
    }

    /**
     * Set <p>Proxy节点ID。</p>
     * @param InstanceProxyId <p>Proxy节点ID。</p>
     */
    public void setInstanceProxyId(String InstanceProxyId) {
        this.InstanceProxyId = InstanceProxyId;
    }

    /**
     * Get <p>实例节点ID。</p> 
     * @return InstanceNodeId <p>实例节点ID。</p>
     */
    public String getInstanceNodeId() {
        return this.InstanceNodeId;
    }

    /**
     * Set <p>实例节点ID。</p>
     * @param InstanceNodeId <p>实例节点ID。</p>
     */
    public void setInstanceNodeId(String InstanceNodeId) {
        this.InstanceNodeId = InstanceNodeId;
    }

    /**
     * Get <p>查询类型，目前支持值：mongod，mongos。<br>其中：<br>mongod - MongoDB的数据存储节点<br>mongos - MongoDB的路由节点</p> 
     * @return Type <p>查询类型，目前支持值：mongod，mongos。<br>其中：<br>mongod - MongoDB的数据存储节点<br>mongos - MongoDB的路由节点</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>查询类型，目前支持值：mongod，mongos。<br>其中：<br>mongod - MongoDB的数据存储节点<br>mongos - MongoDB的路由节点</p>
     * @param Type <p>查询类型，目前支持值：mongod，mongos。<br>其中：<br>mongod - MongoDB的数据存储节点<br>mongos - MongoDB的路由节点</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public DescribeSlowLogQueryTimeStatsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSlowLogQueryTimeStatsRequest(DescribeSlowLogQueryTimeStatsRequest source) {
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
        if (source.InstanceProxyId != null) {
            this.InstanceProxyId = new String(source.InstanceProxyId);
        }
        if (source.InstanceNodeId != null) {
            this.InstanceNodeId = new String(source.InstanceNodeId);
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
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "InstanceProxyId", this.InstanceProxyId);
        this.setParamSimple(map, prefix + "InstanceNodeId", this.InstanceNodeId);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

