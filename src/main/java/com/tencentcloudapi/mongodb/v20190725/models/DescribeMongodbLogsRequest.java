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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMongodbLogsRequest extends AbstractModel {

    /**
    * 实例 ID。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb#/)在实例列表复制实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 查询日志的开启时间。
- 格式：yyyy-mm-dd hh:mm:ss，如：2019-06-01 10:00:00。
- 查询时间范围：仅支持查询最近 7 天内的日志数据。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 查询日志的结束时间。
- 格式：yyyy-mm-dd hh:mm:ss，如：2019-06-01 10:00:00。
- 查询时间范围：仅支持查询最近 7 天内的日志数据。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 节点 ID。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)的**节点管理**页面获取查询的节点 ID。
    */
    @SerializedName("NodeNames")
    @Expose
    private String [] NodeNames;

    /**
    * 日志类别。
- 日志类别包括但不限于 COMMAND、ACCESS、CONTROL、FTDC、INDEX、NETWORK、QUERY、REPL、SHARDING、STORAGE、RECOVERY、JOURNAL 和 WRITE 等。具体支持的类别可能会因 MongoDB 的版本而存在差异。具体信息，请参见[日志消息](https://www.mongodb.com/zh-cn/docs/v5.0/reference/log-messages/#log-message-examples)。
- 登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)，在**日志管理**页面的**错误日志**页签，也可查看**日志类别**。
    */
    @SerializedName("LogComponents")
    @Expose
    private String [] LogComponents;

    /**
    * 日志级别。
- 日志级别按严重性从高到低依次为：FATAL、ERROR、WARNING。
- 登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)，在**日志管理**页面的**错误日志**页签，可查看**日志级别**。
    */
    @SerializedName("LogLevels")
    @Expose
    private String [] LogLevels;

    /**
    * 日志 ID。登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)，在**日志管理**页面的**错误日志**页签，可查看**日志 ID**。
    */
    @SerializedName("LogIds")
    @Expose
    private String [] LogIds;

    /**
    * 日志连接信息。登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)，在**日志管理**页面的**错误日志**页签，可查看**日志连接信息**。
    */
    @SerializedName("LogConnections")
    @Expose
    private String [] LogConnections;

    /**
    * 指定日志筛选的字段。
    */
    @SerializedName("LogDetailParams")
    @Expose
    private String [] LogDetailParams;

    /**
    * 偏移量，最小值为0，最大值为10000，默认值为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页大小，最小值为1，最大值为100，默认值为20。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 实例 ID。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb#/)在实例列表复制实例 ID。 
     * @return InstanceId 实例 ID。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb#/)在实例列表复制实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb#/)在实例列表复制实例 ID。
     * @param InstanceId 实例 ID。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb#/)在实例列表复制实例 ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 查询日志的开启时间。
- 格式：yyyy-mm-dd hh:mm:ss，如：2019-06-01 10:00:00。
- 查询时间范围：仅支持查询最近 7 天内的日志数据。 
     * @return StartTime 查询日志的开启时间。
- 格式：yyyy-mm-dd hh:mm:ss，如：2019-06-01 10:00:00。
- 查询时间范围：仅支持查询最近 7 天内的日志数据。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询日志的开启时间。
- 格式：yyyy-mm-dd hh:mm:ss，如：2019-06-01 10:00:00。
- 查询时间范围：仅支持查询最近 7 天内的日志数据。
     * @param StartTime 查询日志的开启时间。
- 格式：yyyy-mm-dd hh:mm:ss，如：2019-06-01 10:00:00。
- 查询时间范围：仅支持查询最近 7 天内的日志数据。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查询日志的结束时间。
- 格式：yyyy-mm-dd hh:mm:ss，如：2019-06-01 10:00:00。
- 查询时间范围：仅支持查询最近 7 天内的日志数据。 
     * @return EndTime 查询日志的结束时间。
- 格式：yyyy-mm-dd hh:mm:ss，如：2019-06-01 10:00:00。
- 查询时间范围：仅支持查询最近 7 天内的日志数据。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询日志的结束时间。
- 格式：yyyy-mm-dd hh:mm:ss，如：2019-06-01 10:00:00。
- 查询时间范围：仅支持查询最近 7 天内的日志数据。
     * @param EndTime 查询日志的结束时间。
- 格式：yyyy-mm-dd hh:mm:ss，如：2019-06-01 10:00:00。
- 查询时间范围：仅支持查询最近 7 天内的日志数据。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 节点 ID。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)的**节点管理**页面获取查询的节点 ID。 
     * @return NodeNames 节点 ID。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)的**节点管理**页面获取查询的节点 ID。
     */
    public String [] getNodeNames() {
        return this.NodeNames;
    }

    /**
     * Set 节点 ID。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)的**节点管理**页面获取查询的节点 ID。
     * @param NodeNames 节点 ID。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)的**节点管理**页面获取查询的节点 ID。
     */
    public void setNodeNames(String [] NodeNames) {
        this.NodeNames = NodeNames;
    }

    /**
     * Get 日志类别。
- 日志类别包括但不限于 COMMAND、ACCESS、CONTROL、FTDC、INDEX、NETWORK、QUERY、REPL、SHARDING、STORAGE、RECOVERY、JOURNAL 和 WRITE 等。具体支持的类别可能会因 MongoDB 的版本而存在差异。具体信息，请参见[日志消息](https://www.mongodb.com/zh-cn/docs/v5.0/reference/log-messages/#log-message-examples)。
- 登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)，在**日志管理**页面的**错误日志**页签，也可查看**日志类别**。 
     * @return LogComponents 日志类别。
- 日志类别包括但不限于 COMMAND、ACCESS、CONTROL、FTDC、INDEX、NETWORK、QUERY、REPL、SHARDING、STORAGE、RECOVERY、JOURNAL 和 WRITE 等。具体支持的类别可能会因 MongoDB 的版本而存在差异。具体信息，请参见[日志消息](https://www.mongodb.com/zh-cn/docs/v5.0/reference/log-messages/#log-message-examples)。
- 登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)，在**日志管理**页面的**错误日志**页签，也可查看**日志类别**。
     */
    public String [] getLogComponents() {
        return this.LogComponents;
    }

    /**
     * Set 日志类别。
- 日志类别包括但不限于 COMMAND、ACCESS、CONTROL、FTDC、INDEX、NETWORK、QUERY、REPL、SHARDING、STORAGE、RECOVERY、JOURNAL 和 WRITE 等。具体支持的类别可能会因 MongoDB 的版本而存在差异。具体信息，请参见[日志消息](https://www.mongodb.com/zh-cn/docs/v5.0/reference/log-messages/#log-message-examples)。
- 登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)，在**日志管理**页面的**错误日志**页签，也可查看**日志类别**。
     * @param LogComponents 日志类别。
- 日志类别包括但不限于 COMMAND、ACCESS、CONTROL、FTDC、INDEX、NETWORK、QUERY、REPL、SHARDING、STORAGE、RECOVERY、JOURNAL 和 WRITE 等。具体支持的类别可能会因 MongoDB 的版本而存在差异。具体信息，请参见[日志消息](https://www.mongodb.com/zh-cn/docs/v5.0/reference/log-messages/#log-message-examples)。
- 登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)，在**日志管理**页面的**错误日志**页签，也可查看**日志类别**。
     */
    public void setLogComponents(String [] LogComponents) {
        this.LogComponents = LogComponents;
    }

    /**
     * Get 日志级别。
- 日志级别按严重性从高到低依次为：FATAL、ERROR、WARNING。
- 登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)，在**日志管理**页面的**错误日志**页签，可查看**日志级别**。 
     * @return LogLevels 日志级别。
- 日志级别按严重性从高到低依次为：FATAL、ERROR、WARNING。
- 登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)，在**日志管理**页面的**错误日志**页签，可查看**日志级别**。
     */
    public String [] getLogLevels() {
        return this.LogLevels;
    }

    /**
     * Set 日志级别。
- 日志级别按严重性从高到低依次为：FATAL、ERROR、WARNING。
- 登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)，在**日志管理**页面的**错误日志**页签，可查看**日志级别**。
     * @param LogLevels 日志级别。
- 日志级别按严重性从高到低依次为：FATAL、ERROR、WARNING。
- 登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)，在**日志管理**页面的**错误日志**页签，可查看**日志级别**。
     */
    public void setLogLevels(String [] LogLevels) {
        this.LogLevels = LogLevels;
    }

    /**
     * Get 日志 ID。登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)，在**日志管理**页面的**错误日志**页签，可查看**日志 ID**。 
     * @return LogIds 日志 ID。登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)，在**日志管理**页面的**错误日志**页签，可查看**日志 ID**。
     */
    public String [] getLogIds() {
        return this.LogIds;
    }

    /**
     * Set 日志 ID。登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)，在**日志管理**页面的**错误日志**页签，可查看**日志 ID**。
     * @param LogIds 日志 ID。登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)，在**日志管理**页面的**错误日志**页签，可查看**日志 ID**。
     */
    public void setLogIds(String [] LogIds) {
        this.LogIds = LogIds;
    }

    /**
     * Get 日志连接信息。登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)，在**日志管理**页面的**错误日志**页签，可查看**日志连接信息**。 
     * @return LogConnections 日志连接信息。登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)，在**日志管理**页面的**错误日志**页签，可查看**日志连接信息**。
     */
    public String [] getLogConnections() {
        return this.LogConnections;
    }

    /**
     * Set 日志连接信息。登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)，在**日志管理**页面的**错误日志**页签，可查看**日志连接信息**。
     * @param LogConnections 日志连接信息。登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)，在**日志管理**页面的**错误日志**页签，可查看**日志连接信息**。
     */
    public void setLogConnections(String [] LogConnections) {
        this.LogConnections = LogConnections;
    }

    /**
     * Get 指定日志筛选的字段。 
     * @return LogDetailParams 指定日志筛选的字段。
     */
    public String [] getLogDetailParams() {
        return this.LogDetailParams;
    }

    /**
     * Set 指定日志筛选的字段。
     * @param LogDetailParams 指定日志筛选的字段。
     */
    public void setLogDetailParams(String [] LogDetailParams) {
        this.LogDetailParams = LogDetailParams;
    }

    /**
     * Get 偏移量，最小值为0，最大值为10000，默认值为0。 
     * @return Offset 偏移量，最小值为0，最大值为10000，默认值为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，最小值为0，最大值为10000，默认值为0。
     * @param Offset 偏移量，最小值为0，最大值为10000，默认值为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页大小，最小值为1，最大值为100，默认值为20。 
     * @return Limit 分页大小，最小值为1，最大值为100，默认值为20。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页大小，最小值为1，最大值为100，默认值为20。
     * @param Limit 分页大小，最小值为1，最大值为100，默认值为20。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeMongodbLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMongodbLogsRequest(DescribeMongodbLogsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.NodeNames != null) {
            this.NodeNames = new String[source.NodeNames.length];
            for (int i = 0; i < source.NodeNames.length; i++) {
                this.NodeNames[i] = new String(source.NodeNames[i]);
            }
        }
        if (source.LogComponents != null) {
            this.LogComponents = new String[source.LogComponents.length];
            for (int i = 0; i < source.LogComponents.length; i++) {
                this.LogComponents[i] = new String(source.LogComponents[i]);
            }
        }
        if (source.LogLevels != null) {
            this.LogLevels = new String[source.LogLevels.length];
            for (int i = 0; i < source.LogLevels.length; i++) {
                this.LogLevels[i] = new String(source.LogLevels[i]);
            }
        }
        if (source.LogIds != null) {
            this.LogIds = new String[source.LogIds.length];
            for (int i = 0; i < source.LogIds.length; i++) {
                this.LogIds[i] = new String(source.LogIds[i]);
            }
        }
        if (source.LogConnections != null) {
            this.LogConnections = new String[source.LogConnections.length];
            for (int i = 0; i < source.LogConnections.length; i++) {
                this.LogConnections[i] = new String(source.LogConnections[i]);
            }
        }
        if (source.LogDetailParams != null) {
            this.LogDetailParams = new String[source.LogDetailParams.length];
            for (int i = 0; i < source.LogDetailParams.length; i++) {
                this.LogDetailParams[i] = new String(source.LogDetailParams[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
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
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "NodeNames.", this.NodeNames);
        this.setParamArraySimple(map, prefix + "LogComponents.", this.LogComponents);
        this.setParamArraySimple(map, prefix + "LogLevels.", this.LogLevels);
        this.setParamArraySimple(map, prefix + "LogIds.", this.LogIds);
        this.setParamArraySimple(map, prefix + "LogConnections.", this.LogConnections);
        this.setParamArraySimple(map, prefix + "LogDetailParams.", this.LogDetailParams);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

