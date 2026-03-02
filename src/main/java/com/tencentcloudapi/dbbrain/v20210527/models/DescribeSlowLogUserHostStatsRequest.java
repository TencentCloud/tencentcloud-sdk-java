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

public class DescribeSlowLogUserHostStatsRequest extends AbstractModel {

    /**
    * 实例 ID。可通过 [DescribeDiagDBInstances](https://cloud.tencent.com/document/api/1130/57798) 接口获取。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 查询范围的开始时间，格式: "yyyy-MM-dd'T'HH:mm:ssXXX"。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 查询范围的结束时间，格式: "yyyy-MM-dd'T'HH:mm:ssXXX"。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 服务产品类型，支持值："mysql" - 云数据库 MySQL；"cynosdb" - 云数据库 TDSQL-C for MySQL，默认为"mysql"。
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * SQL模板的MD5值
    */
    @SerializedName("Md5")
    @Expose
    private String Md5;

    /**
    * 仅Redis产品使用；实例Proxy ID。
    */
    @SerializedName("InstanceProxyId")
    @Expose
    private String InstanceProxyId;

    /**
    * 仅Redis产品使用；命令。
    */
    @SerializedName("Cmd")
    @Expose
    private String Cmd;

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
     * Get 查询范围的开始时间，格式: "yyyy-MM-dd'T'HH:mm:ssXXX"。 
     * @return StartTime 查询范围的开始时间，格式: "yyyy-MM-dd'T'HH:mm:ssXXX"。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询范围的开始时间，格式: "yyyy-MM-dd'T'HH:mm:ssXXX"。
     * @param StartTime 查询范围的开始时间，格式: "yyyy-MM-dd'T'HH:mm:ssXXX"。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查询范围的结束时间，格式: "yyyy-MM-dd'T'HH:mm:ssXXX"。 
     * @return EndTime 查询范围的结束时间，格式: "yyyy-MM-dd'T'HH:mm:ssXXX"。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询范围的结束时间，格式: "yyyy-MM-dd'T'HH:mm:ssXXX"。
     * @param EndTime 查询范围的结束时间，格式: "yyyy-MM-dd'T'HH:mm:ssXXX"。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 服务产品类型，支持值："mysql" - 云数据库 MySQL；"cynosdb" - 云数据库 TDSQL-C for MySQL，默认为"mysql"。 
     * @return Product 服务产品类型，支持值："mysql" - 云数据库 MySQL；"cynosdb" - 云数据库 TDSQL-C for MySQL，默认为"mysql"。
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 服务产品类型，支持值："mysql" - 云数据库 MySQL；"cynosdb" - 云数据库 TDSQL-C for MySQL，默认为"mysql"。
     * @param Product 服务产品类型，支持值："mysql" - 云数据库 MySQL；"cynosdb" - 云数据库 TDSQL-C for MySQL，默认为"mysql"。
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get SQL模板的MD5值 
     * @return Md5 SQL模板的MD5值
     */
    public String getMd5() {
        return this.Md5;
    }

    /**
     * Set SQL模板的MD5值
     * @param Md5 SQL模板的MD5值
     */
    public void setMd5(String Md5) {
        this.Md5 = Md5;
    }

    /**
     * Get 仅Redis产品使用；实例Proxy ID。 
     * @return InstanceProxyId 仅Redis产品使用；实例Proxy ID。
     */
    public String getInstanceProxyId() {
        return this.InstanceProxyId;
    }

    /**
     * Set 仅Redis产品使用；实例Proxy ID。
     * @param InstanceProxyId 仅Redis产品使用；实例Proxy ID。
     */
    public void setInstanceProxyId(String InstanceProxyId) {
        this.InstanceProxyId = InstanceProxyId;
    }

    /**
     * Get 仅Redis产品使用；命令。 
     * @return Cmd 仅Redis产品使用；命令。
     */
    public String getCmd() {
        return this.Cmd;
    }

    /**
     * Set 仅Redis产品使用；命令。
     * @param Cmd 仅Redis产品使用；命令。
     */
    public void setCmd(String Cmd) {
        this.Cmd = Cmd;
    }

    public DescribeSlowLogUserHostStatsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSlowLogUserHostStatsRequest(DescribeSlowLogUserHostStatsRequest source) {
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
        if (source.Md5 != null) {
            this.Md5 = new String(source.Md5);
        }
        if (source.InstanceProxyId != null) {
            this.InstanceProxyId = new String(source.InstanceProxyId);
        }
        if (source.Cmd != null) {
            this.Cmd = new String(source.Cmd);
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
        this.setParamSimple(map, prefix + "Md5", this.Md5);
        this.setParamSimple(map, prefix + "InstanceProxyId", this.InstanceProxyId);
        this.setParamSimple(map, prefix + "Cmd", this.Cmd);

    }
}

