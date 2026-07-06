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

public class CloudProductLogTaskInfo extends AbstractModel {

    /**
    * <p>日志服务地域</p>
    */
    @SerializedName("ClsRegion")
    @Expose
    private String ClsRegion;

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>日志集ID</p>
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * <p>日志主题ID</p>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>日志配置拓展信息， 一般用于存储额外的日志投递配置</p>
    */
    @SerializedName("Extend")
    @Expose
    private String Extend;

    /**
    * <p>日志类型，支持枚举：CDS-AUDIT、CDS-RISK、CDB-AUDIT、TDSQL-C-AUDIT、MongoDB-AUDIT、MongoDB-SlowLog、MongoDB-ErrorLog、TDMYSQL-SLOW、DCDB-AUDIT、DCDB-SLOW、DCDB-ERROR、MariaDB-AUDIT、MariaDB-SLOW、MariaDB-ERROR、PostgreSQL-SLOW、PostgreSQL-ERROR、PostgreSQL-AUDIT、BH-FILELOG、BH-COMMANDLOG、APIS-ACCESS</p>
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * <p>任务状态， 0创建中 1创建完成 2 删除中</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>投递任务关联topic的标签信息</p>
    */
    @SerializedName("TopicTags")
    @Expose
    private Tag [] TopicTags;

    /**
    * <p>投递任务关联logset的标签信息</p>
    */
    @SerializedName("LogsetTags")
    @Expose
    private Tag [] LogsetTags;

    /**
     * Get <p>日志服务地域</p> 
     * @return ClsRegion <p>日志服务地域</p>
     */
    public String getClsRegion() {
        return this.ClsRegion;
    }

    /**
     * Set <p>日志服务地域</p>
     * @param ClsRegion <p>日志服务地域</p>
     */
    public void setClsRegion(String ClsRegion) {
        this.ClsRegion = ClsRegion;
    }

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
     * Get <p>日志集ID</p> 
     * @return LogsetId <p>日志集ID</p>
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set <p>日志集ID</p>
     * @param LogsetId <p>日志集ID</p>
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get <p>日志主题ID</p> 
     * @return TopicId <p>日志主题ID</p>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>日志主题ID</p>
     * @param TopicId <p>日志主题ID</p>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>日志配置拓展信息， 一般用于存储额外的日志投递配置</p> 
     * @return Extend <p>日志配置拓展信息， 一般用于存储额外的日志投递配置</p>
     */
    public String getExtend() {
        return this.Extend;
    }

    /**
     * Set <p>日志配置拓展信息， 一般用于存储额外的日志投递配置</p>
     * @param Extend <p>日志配置拓展信息， 一般用于存储额外的日志投递配置</p>
     */
    public void setExtend(String Extend) {
        this.Extend = Extend;
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
     * Get <p>任务状态， 0创建中 1创建完成 2 删除中</p> 
     * @return Status <p>任务状态， 0创建中 1创建完成 2 删除中</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态， 0创建中 1创建完成 2 删除中</p>
     * @param Status <p>任务状态， 0创建中 1创建完成 2 删除中</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>投递任务关联topic的标签信息</p> 
     * @return TopicTags <p>投递任务关联topic的标签信息</p>
     */
    public Tag [] getTopicTags() {
        return this.TopicTags;
    }

    /**
     * Set <p>投递任务关联topic的标签信息</p>
     * @param TopicTags <p>投递任务关联topic的标签信息</p>
     */
    public void setTopicTags(Tag [] TopicTags) {
        this.TopicTags = TopicTags;
    }

    /**
     * Get <p>投递任务关联logset的标签信息</p> 
     * @return LogsetTags <p>投递任务关联logset的标签信息</p>
     */
    public Tag [] getLogsetTags() {
        return this.LogsetTags;
    }

    /**
     * Set <p>投递任务关联logset的标签信息</p>
     * @param LogsetTags <p>投递任务关联logset的标签信息</p>
     */
    public void setLogsetTags(Tag [] LogsetTags) {
        this.LogsetTags = LogsetTags;
    }

    public CloudProductLogTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudProductLogTaskInfo(CloudProductLogTaskInfo source) {
        if (source.ClsRegion != null) {
            this.ClsRegion = new String(source.ClsRegion);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Extend != null) {
            this.Extend = new String(source.Extend);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.TopicTags != null) {
            this.TopicTags = new Tag[source.TopicTags.length];
            for (int i = 0; i < source.TopicTags.length; i++) {
                this.TopicTags[i] = new Tag(source.TopicTags[i]);
            }
        }
        if (source.LogsetTags != null) {
            this.LogsetTags = new Tag[source.LogsetTags.length];
            for (int i = 0; i < source.LogsetTags.length; i++) {
                this.LogsetTags[i] = new Tag(source.LogsetTags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClsRegion", this.ClsRegion);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Extend", this.Extend);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "TopicTags.", this.TopicTags);
        this.setParamArrayObj(map, prefix + "LogsetTags.", this.LogsetTags);

    }
}

