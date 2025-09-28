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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteCloudProductLogCollectionRequest extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 云产品标识，支持枚举：CDS、CWP、CDB、TDSQL-C、MongoDB、TDStore、DCDB、MariaDB、PostgreSQL、BH、APIS
    */
    @SerializedName("AssumerName")
    @Expose
    private String AssumerName;

    /**
    * 日志类型，支持枚举：CDS-AUDIT、CDS-RISK、CDB-AUDIT、TDSQL-C-AUDIT、MongoDB-AUDIT、MongoDB-SlowLog、MongoDB-ErrorLog、TDMYSQL-SLOW、DCDB-AUDIT、DCDB-SLOW、DCDB-ERROR、MariaDB-AUDIT、MariaDB-SLOW、MariaDB-ERROR、PostgreSQL-SLOW、PostgreSQL-ERROR、PostgreSQL-AUDIT、BH-FILELOG、BH-COMMANDLOG、APIS-ACCESS
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * 云产品地域。 不同日志类型(LogType)地域入参格式存在差异， 请参考如下示例：
- CDS所有日志类型：ap-guangzhou
- CDB-AUDIT: gz
- TDSQL-C-AUDIT: gz
- MongoDB-AUDIT: gz
- MongoDB-SlowLog：ap-guangzhou
- MongoDB-ErrorLog：ap-guangzhou
- TDMYSQL-SLOW：gz
- DCDB所有日志类型：gz
- MariaDB所有日志类型：gz
- PostgreSQL所有日志类型：gz
- BH所有日志类型：overseas-polaris(中国香港地区和其他)/fsi-polaris(金融区)/general-polaris(普通区)/intl-sg-prod(国际站)
- APIS所有日志类型：gz
    */
    @SerializedName("CloudProductRegion")
    @Expose
    private String CloudProductRegion;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 云产品标识，支持枚举：CDS、CWP、CDB、TDSQL-C、MongoDB、TDStore、DCDB、MariaDB、PostgreSQL、BH、APIS 
     * @return AssumerName 云产品标识，支持枚举：CDS、CWP、CDB、TDSQL-C、MongoDB、TDStore、DCDB、MariaDB、PostgreSQL、BH、APIS
     */
    public String getAssumerName() {
        return this.AssumerName;
    }

    /**
     * Set 云产品标识，支持枚举：CDS、CWP、CDB、TDSQL-C、MongoDB、TDStore、DCDB、MariaDB、PostgreSQL、BH、APIS
     * @param AssumerName 云产品标识，支持枚举：CDS、CWP、CDB、TDSQL-C、MongoDB、TDStore、DCDB、MariaDB、PostgreSQL、BH、APIS
     */
    public void setAssumerName(String AssumerName) {
        this.AssumerName = AssumerName;
    }

    /**
     * Get 日志类型，支持枚举：CDS-AUDIT、CDS-RISK、CDB-AUDIT、TDSQL-C-AUDIT、MongoDB-AUDIT、MongoDB-SlowLog、MongoDB-ErrorLog、TDMYSQL-SLOW、DCDB-AUDIT、DCDB-SLOW、DCDB-ERROR、MariaDB-AUDIT、MariaDB-SLOW、MariaDB-ERROR、PostgreSQL-SLOW、PostgreSQL-ERROR、PostgreSQL-AUDIT、BH-FILELOG、BH-COMMANDLOG、APIS-ACCESS 
     * @return LogType 日志类型，支持枚举：CDS-AUDIT、CDS-RISK、CDB-AUDIT、TDSQL-C-AUDIT、MongoDB-AUDIT、MongoDB-SlowLog、MongoDB-ErrorLog、TDMYSQL-SLOW、DCDB-AUDIT、DCDB-SLOW、DCDB-ERROR、MariaDB-AUDIT、MariaDB-SLOW、MariaDB-ERROR、PostgreSQL-SLOW、PostgreSQL-ERROR、PostgreSQL-AUDIT、BH-FILELOG、BH-COMMANDLOG、APIS-ACCESS
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set 日志类型，支持枚举：CDS-AUDIT、CDS-RISK、CDB-AUDIT、TDSQL-C-AUDIT、MongoDB-AUDIT、MongoDB-SlowLog、MongoDB-ErrorLog、TDMYSQL-SLOW、DCDB-AUDIT、DCDB-SLOW、DCDB-ERROR、MariaDB-AUDIT、MariaDB-SLOW、MariaDB-ERROR、PostgreSQL-SLOW、PostgreSQL-ERROR、PostgreSQL-AUDIT、BH-FILELOG、BH-COMMANDLOG、APIS-ACCESS
     * @param LogType 日志类型，支持枚举：CDS-AUDIT、CDS-RISK、CDB-AUDIT、TDSQL-C-AUDIT、MongoDB-AUDIT、MongoDB-SlowLog、MongoDB-ErrorLog、TDMYSQL-SLOW、DCDB-AUDIT、DCDB-SLOW、DCDB-ERROR、MariaDB-AUDIT、MariaDB-SLOW、MariaDB-ERROR、PostgreSQL-SLOW、PostgreSQL-ERROR、PostgreSQL-AUDIT、BH-FILELOG、BH-COMMANDLOG、APIS-ACCESS
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get 云产品地域。 不同日志类型(LogType)地域入参格式存在差异， 请参考如下示例：
- CDS所有日志类型：ap-guangzhou
- CDB-AUDIT: gz
- TDSQL-C-AUDIT: gz
- MongoDB-AUDIT: gz
- MongoDB-SlowLog：ap-guangzhou
- MongoDB-ErrorLog：ap-guangzhou
- TDMYSQL-SLOW：gz
- DCDB所有日志类型：gz
- MariaDB所有日志类型：gz
- PostgreSQL所有日志类型：gz
- BH所有日志类型：overseas-polaris(中国香港地区和其他)/fsi-polaris(金融区)/general-polaris(普通区)/intl-sg-prod(国际站)
- APIS所有日志类型：gz 
     * @return CloudProductRegion 云产品地域。 不同日志类型(LogType)地域入参格式存在差异， 请参考如下示例：
- CDS所有日志类型：ap-guangzhou
- CDB-AUDIT: gz
- TDSQL-C-AUDIT: gz
- MongoDB-AUDIT: gz
- MongoDB-SlowLog：ap-guangzhou
- MongoDB-ErrorLog：ap-guangzhou
- TDMYSQL-SLOW：gz
- DCDB所有日志类型：gz
- MariaDB所有日志类型：gz
- PostgreSQL所有日志类型：gz
- BH所有日志类型：overseas-polaris(中国香港地区和其他)/fsi-polaris(金融区)/general-polaris(普通区)/intl-sg-prod(国际站)
- APIS所有日志类型：gz
     */
    public String getCloudProductRegion() {
        return this.CloudProductRegion;
    }

    /**
     * Set 云产品地域。 不同日志类型(LogType)地域入参格式存在差异， 请参考如下示例：
- CDS所有日志类型：ap-guangzhou
- CDB-AUDIT: gz
- TDSQL-C-AUDIT: gz
- MongoDB-AUDIT: gz
- MongoDB-SlowLog：ap-guangzhou
- MongoDB-ErrorLog：ap-guangzhou
- TDMYSQL-SLOW：gz
- DCDB所有日志类型：gz
- MariaDB所有日志类型：gz
- PostgreSQL所有日志类型：gz
- BH所有日志类型：overseas-polaris(中国香港地区和其他)/fsi-polaris(金融区)/general-polaris(普通区)/intl-sg-prod(国际站)
- APIS所有日志类型：gz
     * @param CloudProductRegion 云产品地域。 不同日志类型(LogType)地域入参格式存在差异， 请参考如下示例：
- CDS所有日志类型：ap-guangzhou
- CDB-AUDIT: gz
- TDSQL-C-AUDIT: gz
- MongoDB-AUDIT: gz
- MongoDB-SlowLog：ap-guangzhou
- MongoDB-ErrorLog：ap-guangzhou
- TDMYSQL-SLOW：gz
- DCDB所有日志类型：gz
- MariaDB所有日志类型：gz
- PostgreSQL所有日志类型：gz
- BH所有日志类型：overseas-polaris(中国香港地区和其他)/fsi-polaris(金融区)/general-polaris(普通区)/intl-sg-prod(国际站)
- APIS所有日志类型：gz
     */
    public void setCloudProductRegion(String CloudProductRegion) {
        this.CloudProductRegion = CloudProductRegion;
    }

    public DeleteCloudProductLogCollectionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteCloudProductLogCollectionRequest(DeleteCloudProductLogCollectionRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AssumerName != null) {
            this.AssumerName = new String(source.AssumerName);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.CloudProductRegion != null) {
            this.CloudProductRegion = new String(source.CloudProductRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AssumerName", this.AssumerName);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "CloudProductRegion", this.CloudProductRegion);

    }
}

