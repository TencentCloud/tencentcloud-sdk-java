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

public class DescribeClassesRequest extends AbstractModel {

    /**
    * <p>可用区名称。可以通过接口<a href="https://cloud.tencent.com/document/product/409/16769">DescribeZones</a>获取。</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>数据库引擎，支持：<br>1、postgresql（云数据库PostgreSQL）；<br>2、mssql_compatible（MSSQL兼容-云数据库PostgreSQL）；</p>
    */
    @SerializedName("DBEngine")
    @Expose
    private String DBEngine;

    /**
    * <p>数据库主版本号。例如12，13，可以通过接口<a href="https://cloud.tencent.com/document/product/409/89018">DescribeDBVersions</a>获取。</p>
    */
    @SerializedName("DBMajorVersion")
    @Expose
    private String DBMajorVersion;

    /**
    * <p>实例存储类型，根据存储类型返回支持的规格。</p><p>枚举值：</p><ul><li>PHYSICAL_LOCAL_SSD： 物理机本地ssd硬盘</li><li>CLOUD_PREMIUM： 高性能云硬盘</li><li>CLOUD_SSD： ssd云硬盘</li><li>CLOUD_HSSD： 增强型ssd云硬盘</li></ul><p>默认值：PHYSICAL_LOCAL_SSD</p>
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
     * Get <p>可用区名称。可以通过接口<a href="https://cloud.tencent.com/document/product/409/16769">DescribeZones</a>获取。</p> 
     * @return Zone <p>可用区名称。可以通过接口<a href="https://cloud.tencent.com/document/product/409/16769">DescribeZones</a>获取。</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>可用区名称。可以通过接口<a href="https://cloud.tencent.com/document/product/409/16769">DescribeZones</a>获取。</p>
     * @param Zone <p>可用区名称。可以通过接口<a href="https://cloud.tencent.com/document/product/409/16769">DescribeZones</a>获取。</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>数据库引擎，支持：<br>1、postgresql（云数据库PostgreSQL）；<br>2、mssql_compatible（MSSQL兼容-云数据库PostgreSQL）；</p> 
     * @return DBEngine <p>数据库引擎，支持：<br>1、postgresql（云数据库PostgreSQL）；<br>2、mssql_compatible（MSSQL兼容-云数据库PostgreSQL）；</p>
     */
    public String getDBEngine() {
        return this.DBEngine;
    }

    /**
     * Set <p>数据库引擎，支持：<br>1、postgresql（云数据库PostgreSQL）；<br>2、mssql_compatible（MSSQL兼容-云数据库PostgreSQL）；</p>
     * @param DBEngine <p>数据库引擎，支持：<br>1、postgresql（云数据库PostgreSQL）；<br>2、mssql_compatible（MSSQL兼容-云数据库PostgreSQL）；</p>
     */
    public void setDBEngine(String DBEngine) {
        this.DBEngine = DBEngine;
    }

    /**
     * Get <p>数据库主版本号。例如12，13，可以通过接口<a href="https://cloud.tencent.com/document/product/409/89018">DescribeDBVersions</a>获取。</p> 
     * @return DBMajorVersion <p>数据库主版本号。例如12，13，可以通过接口<a href="https://cloud.tencent.com/document/product/409/89018">DescribeDBVersions</a>获取。</p>
     */
    public String getDBMajorVersion() {
        return this.DBMajorVersion;
    }

    /**
     * Set <p>数据库主版本号。例如12，13，可以通过接口<a href="https://cloud.tencent.com/document/product/409/89018">DescribeDBVersions</a>获取。</p>
     * @param DBMajorVersion <p>数据库主版本号。例如12，13，可以通过接口<a href="https://cloud.tencent.com/document/product/409/89018">DescribeDBVersions</a>获取。</p>
     */
    public void setDBMajorVersion(String DBMajorVersion) {
        this.DBMajorVersion = DBMajorVersion;
    }

    /**
     * Get <p>实例存储类型，根据存储类型返回支持的规格。</p><p>枚举值：</p><ul><li>PHYSICAL_LOCAL_SSD： 物理机本地ssd硬盘</li><li>CLOUD_PREMIUM： 高性能云硬盘</li><li>CLOUD_SSD： ssd云硬盘</li><li>CLOUD_HSSD： 增强型ssd云硬盘</li></ul><p>默认值：PHYSICAL_LOCAL_SSD</p> 
     * @return StorageType <p>实例存储类型，根据存储类型返回支持的规格。</p><p>枚举值：</p><ul><li>PHYSICAL_LOCAL_SSD： 物理机本地ssd硬盘</li><li>CLOUD_PREMIUM： 高性能云硬盘</li><li>CLOUD_SSD： ssd云硬盘</li><li>CLOUD_HSSD： 增强型ssd云硬盘</li></ul><p>默认值：PHYSICAL_LOCAL_SSD</p>
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set <p>实例存储类型，根据存储类型返回支持的规格。</p><p>枚举值：</p><ul><li>PHYSICAL_LOCAL_SSD： 物理机本地ssd硬盘</li><li>CLOUD_PREMIUM： 高性能云硬盘</li><li>CLOUD_SSD： ssd云硬盘</li><li>CLOUD_HSSD： 增强型ssd云硬盘</li></ul><p>默认值：PHYSICAL_LOCAL_SSD</p>
     * @param StorageType <p>实例存储类型，根据存储类型返回支持的规格。</p><p>枚举值：</p><ul><li>PHYSICAL_LOCAL_SSD： 物理机本地ssd硬盘</li><li>CLOUD_PREMIUM： 高性能云硬盘</li><li>CLOUD_SSD： ssd云硬盘</li><li>CLOUD_HSSD： 增强型ssd云硬盘</li></ul><p>默认值：PHYSICAL_LOCAL_SSD</p>
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    public DescribeClassesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClassesRequest(DescribeClassesRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.DBEngine != null) {
            this.DBEngine = new String(source.DBEngine);
        }
        if (source.DBMajorVersion != null) {
            this.DBMajorVersion = new String(source.DBMajorVersion);
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
        this.setParamSimple(map, prefix + "DBEngine", this.DBEngine);
        this.setParamSimple(map, prefix + "DBMajorVersion", this.DBMajorVersion);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);

    }
}

