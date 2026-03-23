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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquiryPriceCreateDBInstancesRequest extends AbstractModel {

    /**
    * <p>可用区名称。该参数可以通过调用<a href="https://cloud.tencent.com/document/product/409/16769"> DescribeZones</a> 接口的返回值中的Zone字段来获取。</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>规格ID。该参数可以通过调用<a href="https://cloud.tencent.com/document/product/409/89019">DescribeClasses</a>接口的返回值中的SpecCode字段来获取。</p>
    */
    @SerializedName("SpecCode")
    @Expose
    private String SpecCode;

    /**
    * <p>存储容量大小，单位：GB。该参数的设置步长为10。</p>
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * <p>实例数量。目前最大数量不超过100，如需一次性创建更多实例，请联系客服支持。</p>
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * <p>购买时长，单位：月。目前只支持1,2,3,4,5,6,7,8,9,10,11,12,24,36这些值。</p>
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * <p>【弃字段，不再生效】，计费ID。该参数可以通过调用DescribeProductConfig接口的返回值中的Pid字段来获取。</p>
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
    * <p>实例计费类型。目前支持：PREPAID（预付费，即包年包月）和 POSTPAID（按量计费）。<br>默认值：PREPAID</p>
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * <p>实例类型，默认primary，支持如下：<br>primary（双机高可用（一主一从））<br>readonly（只读实例）</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>DB引擎，默认postgresql，支持如下：<br>postgresql（云数据库PostgreSQL）<br>mssql_compatible（MSSQL兼容-云数据库PostgreSQL）</p>
    */
    @SerializedName("DBEngine")
    @Expose
    private String DBEngine;

    /**
    * <p>实例存储类型，可选值：PHYSICAL_LOCAL_SSD：物理机本地ssd硬盘 CLOUD_PREMIUM：高性能云硬盘 CLOUD_SSD：ssd云硬盘 CLOUD_HSSD：增强型ssd云硬盘</p>
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
     * Get <p>可用区名称。该参数可以通过调用<a href="https://cloud.tencent.com/document/product/409/16769"> DescribeZones</a> 接口的返回值中的Zone字段来获取。</p> 
     * @return Zone <p>可用区名称。该参数可以通过调用<a href="https://cloud.tencent.com/document/product/409/16769"> DescribeZones</a> 接口的返回值中的Zone字段来获取。</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>可用区名称。该参数可以通过调用<a href="https://cloud.tencent.com/document/product/409/16769"> DescribeZones</a> 接口的返回值中的Zone字段来获取。</p>
     * @param Zone <p>可用区名称。该参数可以通过调用<a href="https://cloud.tencent.com/document/product/409/16769"> DescribeZones</a> 接口的返回值中的Zone字段来获取。</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>规格ID。该参数可以通过调用<a href="https://cloud.tencent.com/document/product/409/89019">DescribeClasses</a>接口的返回值中的SpecCode字段来获取。</p> 
     * @return SpecCode <p>规格ID。该参数可以通过调用<a href="https://cloud.tencent.com/document/product/409/89019">DescribeClasses</a>接口的返回值中的SpecCode字段来获取。</p>
     */
    public String getSpecCode() {
        return this.SpecCode;
    }

    /**
     * Set <p>规格ID。该参数可以通过调用<a href="https://cloud.tencent.com/document/product/409/89019">DescribeClasses</a>接口的返回值中的SpecCode字段来获取。</p>
     * @param SpecCode <p>规格ID。该参数可以通过调用<a href="https://cloud.tencent.com/document/product/409/89019">DescribeClasses</a>接口的返回值中的SpecCode字段来获取。</p>
     */
    public void setSpecCode(String SpecCode) {
        this.SpecCode = SpecCode;
    }

    /**
     * Get <p>存储容量大小，单位：GB。该参数的设置步长为10。</p> 
     * @return Storage <p>存储容量大小，单位：GB。该参数的设置步长为10。</p>
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set <p>存储容量大小，单位：GB。该参数的设置步长为10。</p>
     * @param Storage <p>存储容量大小，单位：GB。该参数的设置步长为10。</p>
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get <p>实例数量。目前最大数量不超过100，如需一次性创建更多实例，请联系客服支持。</p> 
     * @return InstanceCount <p>实例数量。目前最大数量不超过100，如需一次性创建更多实例，请联系客服支持。</p>
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set <p>实例数量。目前最大数量不超过100，如需一次性创建更多实例，请联系客服支持。</p>
     * @param InstanceCount <p>实例数量。目前最大数量不超过100，如需一次性创建更多实例，请联系客服支持。</p>
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get <p>购买时长，单位：月。目前只支持1,2,3,4,5,6,7,8,9,10,11,12,24,36这些值。</p> 
     * @return Period <p>购买时长，单位：月。目前只支持1,2,3,4,5,6,7,8,9,10,11,12,24,36这些值。</p>
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>购买时长，单位：月。目前只支持1,2,3,4,5,6,7,8,9,10,11,12,24,36这些值。</p>
     * @param Period <p>购买时长，单位：月。目前只支持1,2,3,4,5,6,7,8,9,10,11,12,24,36这些值。</p>
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get <p>【弃字段，不再生效】，计费ID。该参数可以通过调用DescribeProductConfig接口的返回值中的Pid字段来获取。</p> 
     * @return Pid <p>【弃字段，不再生效】，计费ID。该参数可以通过调用DescribeProductConfig接口的返回值中的Pid字段来获取。</p>
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set <p>【弃字段，不再生效】，计费ID。该参数可以通过调用DescribeProductConfig接口的返回值中的Pid字段来获取。</p>
     * @param Pid <p>【弃字段，不再生效】，计费ID。该参数可以通过调用DescribeProductConfig接口的返回值中的Pid字段来获取。</p>
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    /**
     * Get <p>实例计费类型。目前支持：PREPAID（预付费，即包年包月）和 POSTPAID（按量计费）。<br>默认值：PREPAID</p> 
     * @return InstanceChargeType <p>实例计费类型。目前支持：PREPAID（预付费，即包年包月）和 POSTPAID（按量计费）。<br>默认值：PREPAID</p>
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set <p>实例计费类型。目前支持：PREPAID（预付费，即包年包月）和 POSTPAID（按量计费）。<br>默认值：PREPAID</p>
     * @param InstanceChargeType <p>实例计费类型。目前支持：PREPAID（预付费，即包年包月）和 POSTPAID（按量计费）。<br>默认值：PREPAID</p>
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get <p>实例类型，默认primary，支持如下：<br>primary（双机高可用（一主一从））<br>readonly（只读实例）</p> 
     * @return InstanceType <p>实例类型，默认primary，支持如下：<br>primary（双机高可用（一主一从））<br>readonly（只读实例）</p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>实例类型，默认primary，支持如下：<br>primary（双机高可用（一主一从））<br>readonly（只读实例）</p>
     * @param InstanceType <p>实例类型，默认primary，支持如下：<br>primary（双机高可用（一主一从））<br>readonly（只读实例）</p>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>DB引擎，默认postgresql，支持如下：<br>postgresql（云数据库PostgreSQL）<br>mssql_compatible（MSSQL兼容-云数据库PostgreSQL）</p> 
     * @return DBEngine <p>DB引擎，默认postgresql，支持如下：<br>postgresql（云数据库PostgreSQL）<br>mssql_compatible（MSSQL兼容-云数据库PostgreSQL）</p>
     */
    public String getDBEngine() {
        return this.DBEngine;
    }

    /**
     * Set <p>DB引擎，默认postgresql，支持如下：<br>postgresql（云数据库PostgreSQL）<br>mssql_compatible（MSSQL兼容-云数据库PostgreSQL）</p>
     * @param DBEngine <p>DB引擎，默认postgresql，支持如下：<br>postgresql（云数据库PostgreSQL）<br>mssql_compatible（MSSQL兼容-云数据库PostgreSQL）</p>
     */
    public void setDBEngine(String DBEngine) {
        this.DBEngine = DBEngine;
    }

    /**
     * Get <p>实例存储类型，可选值：PHYSICAL_LOCAL_SSD：物理机本地ssd硬盘 CLOUD_PREMIUM：高性能云硬盘 CLOUD_SSD：ssd云硬盘 CLOUD_HSSD：增强型ssd云硬盘</p> 
     * @return StorageType <p>实例存储类型，可选值：PHYSICAL_LOCAL_SSD：物理机本地ssd硬盘 CLOUD_PREMIUM：高性能云硬盘 CLOUD_SSD：ssd云硬盘 CLOUD_HSSD：增强型ssd云硬盘</p>
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set <p>实例存储类型，可选值：PHYSICAL_LOCAL_SSD：物理机本地ssd硬盘 CLOUD_PREMIUM：高性能云硬盘 CLOUD_SSD：ssd云硬盘 CLOUD_HSSD：增强型ssd云硬盘</p>
     * @param StorageType <p>实例存储类型，可选值：PHYSICAL_LOCAL_SSD：物理机本地ssd硬盘 CLOUD_PREMIUM：高性能云硬盘 CLOUD_SSD：ssd云硬盘 CLOUD_HSSD：增强型ssd云硬盘</p>
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    public InquiryPriceCreateDBInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquiryPriceCreateDBInstancesRequest(InquiryPriceCreateDBInstancesRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.SpecCode != null) {
            this.SpecCode = new String(source.SpecCode);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.Pid != null) {
            this.Pid = new Long(source.Pid);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.DBEngine != null) {
            this.DBEngine = new String(source.DBEngine);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "SpecCode", this.SpecCode);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "DBEngine", this.DBEngine);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);

    }
}

