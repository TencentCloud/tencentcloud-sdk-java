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
    * <p>实例 ID。可通过 <a href="https://cloud.tencent.com/document/api/1130/57798">DescribeDiagDBInstances</a> 接口获取。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>查询范围的开始时间，格式: &quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssXXX&quot;。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>查询范围的结束时间，格式: &quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssXXX&quot;。</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>服务产品类型，支持值：&quot;mysql&quot; - 云数据库 MySQL；&quot;cynosdb&quot; - 云数据库 TDSQL-C for MySQL，&quot;sqlserver&quot; - 云数据库 SQL Server，默认为&quot;mysql&quot;。</p>
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * <p>SQL模板的MD5值</p>
    */
    @SerializedName("Md5")
    @Expose
    private String Md5;

    /**
    * <p>仅Redis产品使用；实例Proxy ID。</p>
    */
    @SerializedName("InstanceProxyId")
    @Expose
    private String InstanceProxyId;

    /**
    * <p>仅Redis产品使用；命令。</p>
    */
    @SerializedName("Cmd")
    @Expose
    private String Cmd;

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
     * Get <p>查询范围的开始时间，格式: &quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssXXX&quot;。</p> 
     * @return StartTime <p>查询范围的开始时间，格式: &quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssXXX&quot;。</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>查询范围的开始时间，格式: &quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssXXX&quot;。</p>
     * @param StartTime <p>查询范围的开始时间，格式: &quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssXXX&quot;。</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>查询范围的结束时间，格式: &quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssXXX&quot;。</p> 
     * @return EndTime <p>查询范围的结束时间，格式: &quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssXXX&quot;。</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>查询范围的结束时间，格式: &quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssXXX&quot;。</p>
     * @param EndTime <p>查询范围的结束时间，格式: &quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssXXX&quot;。</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>服务产品类型，支持值：&quot;mysql&quot; - 云数据库 MySQL；&quot;cynosdb&quot; - 云数据库 TDSQL-C for MySQL，&quot;sqlserver&quot; - 云数据库 SQL Server，默认为&quot;mysql&quot;。</p> 
     * @return Product <p>服务产品类型，支持值：&quot;mysql&quot; - 云数据库 MySQL；&quot;cynosdb&quot; - 云数据库 TDSQL-C for MySQL，&quot;sqlserver&quot; - 云数据库 SQL Server，默认为&quot;mysql&quot;。</p>
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set <p>服务产品类型，支持值：&quot;mysql&quot; - 云数据库 MySQL；&quot;cynosdb&quot; - 云数据库 TDSQL-C for MySQL，&quot;sqlserver&quot; - 云数据库 SQL Server，默认为&quot;mysql&quot;。</p>
     * @param Product <p>服务产品类型，支持值：&quot;mysql&quot; - 云数据库 MySQL；&quot;cynosdb&quot; - 云数据库 TDSQL-C for MySQL，&quot;sqlserver&quot; - 云数据库 SQL Server，默认为&quot;mysql&quot;。</p>
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get <p>SQL模板的MD5值</p> 
     * @return Md5 <p>SQL模板的MD5值</p>
     */
    public String getMd5() {
        return this.Md5;
    }

    /**
     * Set <p>SQL模板的MD5值</p>
     * @param Md5 <p>SQL模板的MD5值</p>
     */
    public void setMd5(String Md5) {
        this.Md5 = Md5;
    }

    /**
     * Get <p>仅Redis产品使用；实例Proxy ID。</p> 
     * @return InstanceProxyId <p>仅Redis产品使用；实例Proxy ID。</p>
     */
    public String getInstanceProxyId() {
        return this.InstanceProxyId;
    }

    /**
     * Set <p>仅Redis产品使用；实例Proxy ID。</p>
     * @param InstanceProxyId <p>仅Redis产品使用；实例Proxy ID。</p>
     */
    public void setInstanceProxyId(String InstanceProxyId) {
        this.InstanceProxyId = InstanceProxyId;
    }

    /**
     * Get <p>仅Redis产品使用；命令。</p> 
     * @return Cmd <p>仅Redis产品使用；命令。</p>
     */
    public String getCmd() {
        return this.Cmd;
    }

    /**
     * Set <p>仅Redis产品使用；命令。</p>
     * @param Cmd <p>仅Redis产品使用；命令。</p>
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

