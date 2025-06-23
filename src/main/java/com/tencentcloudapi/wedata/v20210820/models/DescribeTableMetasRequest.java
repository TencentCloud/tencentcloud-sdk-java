/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTableMetasRequest extends AbstractModel {

    /**
    * 分页页码
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 分页大小
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 过滤字段:
dbName-数据库名称
bizCatalogIds-资产目录ID
DataLayerUuid-数仓分层ID
ownerAccount-负责人ID
assetStatus-资产状态：1-已上架 0-未上架
assetLevel-资产等级：40-核心30-重要 20-一般 10-临时 
msTypes-数据源类型：例如TENCENT_MYSQL-腾讯云MySQL，数据源类型ID可参考
[
  {
    "DisplayName": "TCHouse-P",
    "Id": "TCHOUSE_P"
  },
  {
    "DisplayName": "Iceberg",
    "Id": "ICEBERG"
  },
  {
    "DisplayName": "Hive",
    "Id": "HIVE"
  },
  {
    "DisplayName": "HBase",
    "Id": "HBASE"
  },
  {
    "DisplayName": "DLC",
    "Id": "DLC"
  },
  {
    "DisplayName": "腾讯云MySQL",
    "Id": "TENCENT_MYSQL"
  },
  {
    "DisplayName": "TCHouse-D",
    "Id": "TCHOUSE_D"
  },
  {
    "DisplayName": "TCHouse-C",
    "Id": "TCHOUSE_C"
  },
  {
    "DisplayName": "EMR StarRocks",
    "Id": "EMR_STARROCKS"
  },
  {
    "DisplayName": "Doris",
    "Id": "DORIS"
  },
  {
    "DisplayName": "MySQL",
    "Id": "MYSQL"
  },
  {
    "DisplayName": "Oracle",
    "Id": "ORACLE"
  },
  {
    "DisplayName": "PostgreSQL",
    "Id": "POSTGRE"
  },
  {
    "DisplayName": "SQL Server",
    "Id": "SQLSERVER"
  },
  {
    "DisplayName": "TDSQL PostgreSQL",
    "Id": "TDSQL_POSTGRE"
  },
  {
    "DisplayName": "Greenplum",
    "Id": "GREENPLUM"
  },
  {
    "DisplayName": "StarRocks",
    "Id": "STARROCKS"
  },
  {
    "DisplayName": "ClickHouse",
    "Id": "CLICKHOUSE"
  },
  {
    "DisplayName": "INFLUXDB",
    "Id": "INFLUXDB"
  },
  {
    "DisplayName": "达梦DM",
    "Id": "DM"
  },
  {
    "DisplayName": "OceanBase",
    "Id": "OCEANBASE"
  },
  {
    "DisplayName": "TDSQL MySQL",
    "Id": "TDSQL_MYSQL"
  },
  {
    "DisplayName": "GaussDB",
    "Id": "GAUSSDB"
  }
]
projectIds-归属项目ID
keyword-关键字，支持表名/表中文名/数据库名
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 排序字段
    */
    @SerializedName("OrderFields")
    @Expose
    private OrderField [] OrderFields;

    /**
     * Get 分页页码 
     * @return PageNumber 分页页码
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 分页页码
     * @param PageNumber 分页页码
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 分页大小 
     * @return PageSize 分页大小
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页大小
     * @param PageSize 分页大小
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 过滤字段:
dbName-数据库名称
bizCatalogIds-资产目录ID
DataLayerUuid-数仓分层ID
ownerAccount-负责人ID
assetStatus-资产状态：1-已上架 0-未上架
assetLevel-资产等级：40-核心30-重要 20-一般 10-临时 
msTypes-数据源类型：例如TENCENT_MYSQL-腾讯云MySQL，数据源类型ID可参考
[
  {
    "DisplayName": "TCHouse-P",
    "Id": "TCHOUSE_P"
  },
  {
    "DisplayName": "Iceberg",
    "Id": "ICEBERG"
  },
  {
    "DisplayName": "Hive",
    "Id": "HIVE"
  },
  {
    "DisplayName": "HBase",
    "Id": "HBASE"
  },
  {
    "DisplayName": "DLC",
    "Id": "DLC"
  },
  {
    "DisplayName": "腾讯云MySQL",
    "Id": "TENCENT_MYSQL"
  },
  {
    "DisplayName": "TCHouse-D",
    "Id": "TCHOUSE_D"
  },
  {
    "DisplayName": "TCHouse-C",
    "Id": "TCHOUSE_C"
  },
  {
    "DisplayName": "EMR StarRocks",
    "Id": "EMR_STARROCKS"
  },
  {
    "DisplayName": "Doris",
    "Id": "DORIS"
  },
  {
    "DisplayName": "MySQL",
    "Id": "MYSQL"
  },
  {
    "DisplayName": "Oracle",
    "Id": "ORACLE"
  },
  {
    "DisplayName": "PostgreSQL",
    "Id": "POSTGRE"
  },
  {
    "DisplayName": "SQL Server",
    "Id": "SQLSERVER"
  },
  {
    "DisplayName": "TDSQL PostgreSQL",
    "Id": "TDSQL_POSTGRE"
  },
  {
    "DisplayName": "Greenplum",
    "Id": "GREENPLUM"
  },
  {
    "DisplayName": "StarRocks",
    "Id": "STARROCKS"
  },
  {
    "DisplayName": "ClickHouse",
    "Id": "CLICKHOUSE"
  },
  {
    "DisplayName": "INFLUXDB",
    "Id": "INFLUXDB"
  },
  {
    "DisplayName": "达梦DM",
    "Id": "DM"
  },
  {
    "DisplayName": "OceanBase",
    "Id": "OCEANBASE"
  },
  {
    "DisplayName": "TDSQL MySQL",
    "Id": "TDSQL_MYSQL"
  },
  {
    "DisplayName": "GaussDB",
    "Id": "GAUSSDB"
  }
]
projectIds-归属项目ID
keyword-关键字，支持表名/表中文名/数据库名 
     * @return Filters 过滤字段:
dbName-数据库名称
bizCatalogIds-资产目录ID
DataLayerUuid-数仓分层ID
ownerAccount-负责人ID
assetStatus-资产状态：1-已上架 0-未上架
assetLevel-资产等级：40-核心30-重要 20-一般 10-临时 
msTypes-数据源类型：例如TENCENT_MYSQL-腾讯云MySQL，数据源类型ID可参考
[
  {
    "DisplayName": "TCHouse-P",
    "Id": "TCHOUSE_P"
  },
  {
    "DisplayName": "Iceberg",
    "Id": "ICEBERG"
  },
  {
    "DisplayName": "Hive",
    "Id": "HIVE"
  },
  {
    "DisplayName": "HBase",
    "Id": "HBASE"
  },
  {
    "DisplayName": "DLC",
    "Id": "DLC"
  },
  {
    "DisplayName": "腾讯云MySQL",
    "Id": "TENCENT_MYSQL"
  },
  {
    "DisplayName": "TCHouse-D",
    "Id": "TCHOUSE_D"
  },
  {
    "DisplayName": "TCHouse-C",
    "Id": "TCHOUSE_C"
  },
  {
    "DisplayName": "EMR StarRocks",
    "Id": "EMR_STARROCKS"
  },
  {
    "DisplayName": "Doris",
    "Id": "DORIS"
  },
  {
    "DisplayName": "MySQL",
    "Id": "MYSQL"
  },
  {
    "DisplayName": "Oracle",
    "Id": "ORACLE"
  },
  {
    "DisplayName": "PostgreSQL",
    "Id": "POSTGRE"
  },
  {
    "DisplayName": "SQL Server",
    "Id": "SQLSERVER"
  },
  {
    "DisplayName": "TDSQL PostgreSQL",
    "Id": "TDSQL_POSTGRE"
  },
  {
    "DisplayName": "Greenplum",
    "Id": "GREENPLUM"
  },
  {
    "DisplayName": "StarRocks",
    "Id": "STARROCKS"
  },
  {
    "DisplayName": "ClickHouse",
    "Id": "CLICKHOUSE"
  },
  {
    "DisplayName": "INFLUXDB",
    "Id": "INFLUXDB"
  },
  {
    "DisplayName": "达梦DM",
    "Id": "DM"
  },
  {
    "DisplayName": "OceanBase",
    "Id": "OCEANBASE"
  },
  {
    "DisplayName": "TDSQL MySQL",
    "Id": "TDSQL_MYSQL"
  },
  {
    "DisplayName": "GaussDB",
    "Id": "GAUSSDB"
  }
]
projectIds-归属项目ID
keyword-关键字，支持表名/表中文名/数据库名
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤字段:
dbName-数据库名称
bizCatalogIds-资产目录ID
DataLayerUuid-数仓分层ID
ownerAccount-负责人ID
assetStatus-资产状态：1-已上架 0-未上架
assetLevel-资产等级：40-核心30-重要 20-一般 10-临时 
msTypes-数据源类型：例如TENCENT_MYSQL-腾讯云MySQL，数据源类型ID可参考
[
  {
    "DisplayName": "TCHouse-P",
    "Id": "TCHOUSE_P"
  },
  {
    "DisplayName": "Iceberg",
    "Id": "ICEBERG"
  },
  {
    "DisplayName": "Hive",
    "Id": "HIVE"
  },
  {
    "DisplayName": "HBase",
    "Id": "HBASE"
  },
  {
    "DisplayName": "DLC",
    "Id": "DLC"
  },
  {
    "DisplayName": "腾讯云MySQL",
    "Id": "TENCENT_MYSQL"
  },
  {
    "DisplayName": "TCHouse-D",
    "Id": "TCHOUSE_D"
  },
  {
    "DisplayName": "TCHouse-C",
    "Id": "TCHOUSE_C"
  },
  {
    "DisplayName": "EMR StarRocks",
    "Id": "EMR_STARROCKS"
  },
  {
    "DisplayName": "Doris",
    "Id": "DORIS"
  },
  {
    "DisplayName": "MySQL",
    "Id": "MYSQL"
  },
  {
    "DisplayName": "Oracle",
    "Id": "ORACLE"
  },
  {
    "DisplayName": "PostgreSQL",
    "Id": "POSTGRE"
  },
  {
    "DisplayName": "SQL Server",
    "Id": "SQLSERVER"
  },
  {
    "DisplayName": "TDSQL PostgreSQL",
    "Id": "TDSQL_POSTGRE"
  },
  {
    "DisplayName": "Greenplum",
    "Id": "GREENPLUM"
  },
  {
    "DisplayName": "StarRocks",
    "Id": "STARROCKS"
  },
  {
    "DisplayName": "ClickHouse",
    "Id": "CLICKHOUSE"
  },
  {
    "DisplayName": "INFLUXDB",
    "Id": "INFLUXDB"
  },
  {
    "DisplayName": "达梦DM",
    "Id": "DM"
  },
  {
    "DisplayName": "OceanBase",
    "Id": "OCEANBASE"
  },
  {
    "DisplayName": "TDSQL MySQL",
    "Id": "TDSQL_MYSQL"
  },
  {
    "DisplayName": "GaussDB",
    "Id": "GAUSSDB"
  }
]
projectIds-归属项目ID
keyword-关键字，支持表名/表中文名/数据库名
     * @param Filters 过滤字段:
dbName-数据库名称
bizCatalogIds-资产目录ID
DataLayerUuid-数仓分层ID
ownerAccount-负责人ID
assetStatus-资产状态：1-已上架 0-未上架
assetLevel-资产等级：40-核心30-重要 20-一般 10-临时 
msTypes-数据源类型：例如TENCENT_MYSQL-腾讯云MySQL，数据源类型ID可参考
[
  {
    "DisplayName": "TCHouse-P",
    "Id": "TCHOUSE_P"
  },
  {
    "DisplayName": "Iceberg",
    "Id": "ICEBERG"
  },
  {
    "DisplayName": "Hive",
    "Id": "HIVE"
  },
  {
    "DisplayName": "HBase",
    "Id": "HBASE"
  },
  {
    "DisplayName": "DLC",
    "Id": "DLC"
  },
  {
    "DisplayName": "腾讯云MySQL",
    "Id": "TENCENT_MYSQL"
  },
  {
    "DisplayName": "TCHouse-D",
    "Id": "TCHOUSE_D"
  },
  {
    "DisplayName": "TCHouse-C",
    "Id": "TCHOUSE_C"
  },
  {
    "DisplayName": "EMR StarRocks",
    "Id": "EMR_STARROCKS"
  },
  {
    "DisplayName": "Doris",
    "Id": "DORIS"
  },
  {
    "DisplayName": "MySQL",
    "Id": "MYSQL"
  },
  {
    "DisplayName": "Oracle",
    "Id": "ORACLE"
  },
  {
    "DisplayName": "PostgreSQL",
    "Id": "POSTGRE"
  },
  {
    "DisplayName": "SQL Server",
    "Id": "SQLSERVER"
  },
  {
    "DisplayName": "TDSQL PostgreSQL",
    "Id": "TDSQL_POSTGRE"
  },
  {
    "DisplayName": "Greenplum",
    "Id": "GREENPLUM"
  },
  {
    "DisplayName": "StarRocks",
    "Id": "STARROCKS"
  },
  {
    "DisplayName": "ClickHouse",
    "Id": "CLICKHOUSE"
  },
  {
    "DisplayName": "INFLUXDB",
    "Id": "INFLUXDB"
  },
  {
    "DisplayName": "达梦DM",
    "Id": "DM"
  },
  {
    "DisplayName": "OceanBase",
    "Id": "OCEANBASE"
  },
  {
    "DisplayName": "TDSQL MySQL",
    "Id": "TDSQL_MYSQL"
  },
  {
    "DisplayName": "GaussDB",
    "Id": "GAUSSDB"
  }
]
projectIds-归属项目ID
keyword-关键字，支持表名/表中文名/数据库名
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 排序字段 
     * @return OrderFields 排序字段
     */
    public OrderField [] getOrderFields() {
        return this.OrderFields;
    }

    /**
     * Set 排序字段
     * @param OrderFields 排序字段
     */
    public void setOrderFields(OrderField [] OrderFields) {
        this.OrderFields = OrderFields;
    }

    public DescribeTableMetasRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTableMetasRequest(DescribeTableMetasRequest source) {
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.OrderFields != null) {
            this.OrderFields = new OrderField[source.OrderFields.length];
            for (int i = 0; i < source.OrderFields.length; i++) {
                this.OrderFields[i] = new OrderField(source.OrderFields[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArrayObj(map, prefix + "OrderFields.", this.OrderFields);

    }
}

