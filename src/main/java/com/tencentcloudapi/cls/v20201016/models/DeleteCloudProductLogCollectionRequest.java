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
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>云产品标识，支持枚举：CDS、CWP、CDB、TDSQL-C、MongoDB、TDStore、DCDB、MariaDB、PostgreSQL、BH、APIS</p>
    */
    @SerializedName("AssumerName")
    @Expose
    private String AssumerName;

    /**
    * <p>日志类型，支持枚举：CDS-AUDIT、CDS-RISK、CDB-AUDIT、TDSQL-C-AUDIT、MongoDB-AUDIT、MongoDB-SlowLog、MongoDB-ErrorLog、TDMYSQL-SLOW、DCDB-AUDIT、DCDB-SLOW、DCDB-ERROR、MariaDB-AUDIT、MariaDB-SLOW、MariaDB-ERROR、PostgreSQL-SLOW、PostgreSQL-ERROR、PostgreSQL-AUDIT、BH-FILELOG、BH-COMMANDLOG、APIS-ACCESS</p>
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * <p>云产品地域。 不同日志类型(LogType)地域入参格式存在差异， 请参考如下示例：</p><ul><li>CDS所有日志类型：ap-guangzhou</li><li>CDB-AUDIT: gz</li><li>TDSQL-C-AUDIT: gz</li><li>MongoDB-AUDIT: gz</li><li>MongoDB-SlowLog：ap-guangzhou</li><li>MongoDB-ErrorLog：ap-guangzhou</li><li>TDMYSQL-SLOW：gz</li><li>DCDB所有日志类型：gz</li><li>MariaDB所有日志类型：gz</li><li>PostgreSQL所有日志类型：gz</li><li>BH所有日志类型：overseas-polaris(中国香港地区和其他)/fsi-polaris(金融区)/general-polaris(普通区)/intl-sg-prod(国际站)</li><li>APIS所有日志类型：gz</li></ul>
    */
    @SerializedName("CloudProductRegion")
    @Expose
    private String CloudProductRegion;

    /**
    * <p>是否删除关联的topic</p>
    */
    @SerializedName("IsDeleteTopic")
    @Expose
    private Boolean IsDeleteTopic;

    /**
    * <p>是否删除关联的logset。如果logset下还有topic的话，不会进行删除</p>
    */
    @SerializedName("IsDeleteLogset")
    @Expose
    private Boolean IsDeleteLogset;

    /**
     * Get <p>实例ID</p> 
     * @return InstanceId <p>实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceId <p>实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>云产品标识，支持枚举：CDS、CWP、CDB、TDSQL-C、MongoDB、TDStore、DCDB、MariaDB、PostgreSQL、BH、APIS</p> 
     * @return AssumerName <p>云产品标识，支持枚举：CDS、CWP、CDB、TDSQL-C、MongoDB、TDStore、DCDB、MariaDB、PostgreSQL、BH、APIS</p>
     */
    public String getAssumerName() {
        return this.AssumerName;
    }

    /**
     * Set <p>云产品标识，支持枚举：CDS、CWP、CDB、TDSQL-C、MongoDB、TDStore、DCDB、MariaDB、PostgreSQL、BH、APIS</p>
     * @param AssumerName <p>云产品标识，支持枚举：CDS、CWP、CDB、TDSQL-C、MongoDB、TDStore、DCDB、MariaDB、PostgreSQL、BH、APIS</p>
     */
    public void setAssumerName(String AssumerName) {
        this.AssumerName = AssumerName;
    }

    /**
     * Get <p>日志类型，支持枚举：CDS-AUDIT、CDS-RISK、CDB-AUDIT、TDSQL-C-AUDIT、MongoDB-AUDIT、MongoDB-SlowLog、MongoDB-ErrorLog、TDMYSQL-SLOW、DCDB-AUDIT、DCDB-SLOW、DCDB-ERROR、MariaDB-AUDIT、MariaDB-SLOW、MariaDB-ERROR、PostgreSQL-SLOW、PostgreSQL-ERROR、PostgreSQL-AUDIT、BH-FILELOG、BH-COMMANDLOG、APIS-ACCESS</p> 
     * @return LogType <p>日志类型，支持枚举：CDS-AUDIT、CDS-RISK、CDB-AUDIT、TDSQL-C-AUDIT、MongoDB-AUDIT、MongoDB-SlowLog、MongoDB-ErrorLog、TDMYSQL-SLOW、DCDB-AUDIT、DCDB-SLOW、DCDB-ERROR、MariaDB-AUDIT、MariaDB-SLOW、MariaDB-ERROR、PostgreSQL-SLOW、PostgreSQL-ERROR、PostgreSQL-AUDIT、BH-FILELOG、BH-COMMANDLOG、APIS-ACCESS</p>
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set <p>日志类型，支持枚举：CDS-AUDIT、CDS-RISK、CDB-AUDIT、TDSQL-C-AUDIT、MongoDB-AUDIT、MongoDB-SlowLog、MongoDB-ErrorLog、TDMYSQL-SLOW、DCDB-AUDIT、DCDB-SLOW、DCDB-ERROR、MariaDB-AUDIT、MariaDB-SLOW、MariaDB-ERROR、PostgreSQL-SLOW、PostgreSQL-ERROR、PostgreSQL-AUDIT、BH-FILELOG、BH-COMMANDLOG、APIS-ACCESS</p>
     * @param LogType <p>日志类型，支持枚举：CDS-AUDIT、CDS-RISK、CDB-AUDIT、TDSQL-C-AUDIT、MongoDB-AUDIT、MongoDB-SlowLog、MongoDB-ErrorLog、TDMYSQL-SLOW、DCDB-AUDIT、DCDB-SLOW、DCDB-ERROR、MariaDB-AUDIT、MariaDB-SLOW、MariaDB-ERROR、PostgreSQL-SLOW、PostgreSQL-ERROR、PostgreSQL-AUDIT、BH-FILELOG、BH-COMMANDLOG、APIS-ACCESS</p>
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get <p>云产品地域。 不同日志类型(LogType)地域入参格式存在差异， 请参考如下示例：</p><ul><li>CDS所有日志类型：ap-guangzhou</li><li>CDB-AUDIT: gz</li><li>TDSQL-C-AUDIT: gz</li><li>MongoDB-AUDIT: gz</li><li>MongoDB-SlowLog：ap-guangzhou</li><li>MongoDB-ErrorLog：ap-guangzhou</li><li>TDMYSQL-SLOW：gz</li><li>DCDB所有日志类型：gz</li><li>MariaDB所有日志类型：gz</li><li>PostgreSQL所有日志类型：gz</li><li>BH所有日志类型：overseas-polaris(中国香港地区和其他)/fsi-polaris(金融区)/general-polaris(普通区)/intl-sg-prod(国际站)</li><li>APIS所有日志类型：gz</li></ul> 
     * @return CloudProductRegion <p>云产品地域。 不同日志类型(LogType)地域入参格式存在差异， 请参考如下示例：</p><ul><li>CDS所有日志类型：ap-guangzhou</li><li>CDB-AUDIT: gz</li><li>TDSQL-C-AUDIT: gz</li><li>MongoDB-AUDIT: gz</li><li>MongoDB-SlowLog：ap-guangzhou</li><li>MongoDB-ErrorLog：ap-guangzhou</li><li>TDMYSQL-SLOW：gz</li><li>DCDB所有日志类型：gz</li><li>MariaDB所有日志类型：gz</li><li>PostgreSQL所有日志类型：gz</li><li>BH所有日志类型：overseas-polaris(中国香港地区和其他)/fsi-polaris(金融区)/general-polaris(普通区)/intl-sg-prod(国际站)</li><li>APIS所有日志类型：gz</li></ul>
     */
    public String getCloudProductRegion() {
        return this.CloudProductRegion;
    }

    /**
     * Set <p>云产品地域。 不同日志类型(LogType)地域入参格式存在差异， 请参考如下示例：</p><ul><li>CDS所有日志类型：ap-guangzhou</li><li>CDB-AUDIT: gz</li><li>TDSQL-C-AUDIT: gz</li><li>MongoDB-AUDIT: gz</li><li>MongoDB-SlowLog：ap-guangzhou</li><li>MongoDB-ErrorLog：ap-guangzhou</li><li>TDMYSQL-SLOW：gz</li><li>DCDB所有日志类型：gz</li><li>MariaDB所有日志类型：gz</li><li>PostgreSQL所有日志类型：gz</li><li>BH所有日志类型：overseas-polaris(中国香港地区和其他)/fsi-polaris(金融区)/general-polaris(普通区)/intl-sg-prod(国际站)</li><li>APIS所有日志类型：gz</li></ul>
     * @param CloudProductRegion <p>云产品地域。 不同日志类型(LogType)地域入参格式存在差异， 请参考如下示例：</p><ul><li>CDS所有日志类型：ap-guangzhou</li><li>CDB-AUDIT: gz</li><li>TDSQL-C-AUDIT: gz</li><li>MongoDB-AUDIT: gz</li><li>MongoDB-SlowLog：ap-guangzhou</li><li>MongoDB-ErrorLog：ap-guangzhou</li><li>TDMYSQL-SLOW：gz</li><li>DCDB所有日志类型：gz</li><li>MariaDB所有日志类型：gz</li><li>PostgreSQL所有日志类型：gz</li><li>BH所有日志类型：overseas-polaris(中国香港地区和其他)/fsi-polaris(金融区)/general-polaris(普通区)/intl-sg-prod(国际站)</li><li>APIS所有日志类型：gz</li></ul>
     */
    public void setCloudProductRegion(String CloudProductRegion) {
        this.CloudProductRegion = CloudProductRegion;
    }

    /**
     * Get <p>是否删除关联的topic</p> 
     * @return IsDeleteTopic <p>是否删除关联的topic</p>
     */
    public Boolean getIsDeleteTopic() {
        return this.IsDeleteTopic;
    }

    /**
     * Set <p>是否删除关联的topic</p>
     * @param IsDeleteTopic <p>是否删除关联的topic</p>
     */
    public void setIsDeleteTopic(Boolean IsDeleteTopic) {
        this.IsDeleteTopic = IsDeleteTopic;
    }

    /**
     * Get <p>是否删除关联的logset。如果logset下还有topic的话，不会进行删除</p> 
     * @return IsDeleteLogset <p>是否删除关联的logset。如果logset下还有topic的话，不会进行删除</p>
     */
    public Boolean getIsDeleteLogset() {
        return this.IsDeleteLogset;
    }

    /**
     * Set <p>是否删除关联的logset。如果logset下还有topic的话，不会进行删除</p>
     * @param IsDeleteLogset <p>是否删除关联的logset。如果logset下还有topic的话，不会进行删除</p>
     */
    public void setIsDeleteLogset(Boolean IsDeleteLogset) {
        this.IsDeleteLogset = IsDeleteLogset;
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
        if (source.IsDeleteTopic != null) {
            this.IsDeleteTopic = new Boolean(source.IsDeleteTopic);
        }
        if (source.IsDeleteLogset != null) {
            this.IsDeleteLogset = new Boolean(source.IsDeleteLogset);
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
        this.setParamSimple(map, prefix + "IsDeleteTopic", this.IsDeleteTopic);
        this.setParamSimple(map, prefix + "IsDeleteLogset", this.IsDeleteLogset);

    }
}

