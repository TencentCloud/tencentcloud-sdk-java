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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSparkSessionBatchSQLRequest extends AbstractModel{

    /**
    * DLC Spark作业引擎名称
    */
    @SerializedName("DataEngineName")
    @Expose
    private String DataEngineName;

    /**
    * 运行sql
    */
    @SerializedName("ExecuteSQL")
    @Expose
    private String ExecuteSQL;

    /**
    * 指定的Driver规格，当前支持：small（默认，1cu）、medium（2cu）、large（4cu）、xlarge（8cu）
    */
    @SerializedName("DriverSize")
    @Expose
    private String DriverSize;

    /**
    * 指定的Executor规格，当前支持：small（默认，1cu）、medium（2cu）、large（4cu）、xlarge（8cu）
    */
    @SerializedName("ExecutorSize")
    @Expose
    private String ExecutorSize;

    /**
    * 指定的Executor数量，默认为1
    */
    @SerializedName("ExecutorNumbers")
    @Expose
    private Long ExecutorNumbers;

    /**
    * 指定的Executor数量（最大值），默认为1，当开启动态分配有效，若未开启，则该值等于ExecutorNumbers
    */
    @SerializedName("ExecutorMaxNumbers")
    @Expose
    private Long ExecutorMaxNumbers;

    /**
    * 指定的Session超时时间，单位秒，默认3600秒
    */
    @SerializedName("TimeoutInSecond")
    @Expose
    private Long TimeoutInSecond;

    /**
    * Session唯一标识，当指定sessionid，则使用该session运行任务。
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 指定要创建的session名称
    */
    @SerializedName("SessionName")
    @Expose
    private String SessionName;

    /**
    * Session相关配置，当前支持：1.dlc.eni：用户配置的eni网关信息，可以用过该字段设置；
2.dlc.role.arn：用户配置的roleArn鉴权策略配置信息，可以用过该字段设置；
3.dlc.sql.set.config：用户配置的集群配置信息，可以用过该字段设置；
    */
    @SerializedName("Arguments")
    @Expose
    private KVPair [] Arguments;

    /**
    * 是否继承集群的资源类配置：0：自定义（默认），1：继承集群；
    */
    @SerializedName("IsInherit")
    @Expose
    private Long IsInherit;

    /**
     * Get DLC Spark作业引擎名称 
     * @return DataEngineName DLC Spark作业引擎名称
     */
    public String getDataEngineName() {
        return this.DataEngineName;
    }

    /**
     * Set DLC Spark作业引擎名称
     * @param DataEngineName DLC Spark作业引擎名称
     */
    public void setDataEngineName(String DataEngineName) {
        this.DataEngineName = DataEngineName;
    }

    /**
     * Get 运行sql 
     * @return ExecuteSQL 运行sql
     */
    public String getExecuteSQL() {
        return this.ExecuteSQL;
    }

    /**
     * Set 运行sql
     * @param ExecuteSQL 运行sql
     */
    public void setExecuteSQL(String ExecuteSQL) {
        this.ExecuteSQL = ExecuteSQL;
    }

    /**
     * Get 指定的Driver规格，当前支持：small（默认，1cu）、medium（2cu）、large（4cu）、xlarge（8cu） 
     * @return DriverSize 指定的Driver规格，当前支持：small（默认，1cu）、medium（2cu）、large（4cu）、xlarge（8cu）
     */
    public String getDriverSize() {
        return this.DriverSize;
    }

    /**
     * Set 指定的Driver规格，当前支持：small（默认，1cu）、medium（2cu）、large（4cu）、xlarge（8cu）
     * @param DriverSize 指定的Driver规格，当前支持：small（默认，1cu）、medium（2cu）、large（4cu）、xlarge（8cu）
     */
    public void setDriverSize(String DriverSize) {
        this.DriverSize = DriverSize;
    }

    /**
     * Get 指定的Executor规格，当前支持：small（默认，1cu）、medium（2cu）、large（4cu）、xlarge（8cu） 
     * @return ExecutorSize 指定的Executor规格，当前支持：small（默认，1cu）、medium（2cu）、large（4cu）、xlarge（8cu）
     */
    public String getExecutorSize() {
        return this.ExecutorSize;
    }

    /**
     * Set 指定的Executor规格，当前支持：small（默认，1cu）、medium（2cu）、large（4cu）、xlarge（8cu）
     * @param ExecutorSize 指定的Executor规格，当前支持：small（默认，1cu）、medium（2cu）、large（4cu）、xlarge（8cu）
     */
    public void setExecutorSize(String ExecutorSize) {
        this.ExecutorSize = ExecutorSize;
    }

    /**
     * Get 指定的Executor数量，默认为1 
     * @return ExecutorNumbers 指定的Executor数量，默认为1
     */
    public Long getExecutorNumbers() {
        return this.ExecutorNumbers;
    }

    /**
     * Set 指定的Executor数量，默认为1
     * @param ExecutorNumbers 指定的Executor数量，默认为1
     */
    public void setExecutorNumbers(Long ExecutorNumbers) {
        this.ExecutorNumbers = ExecutorNumbers;
    }

    /**
     * Get 指定的Executor数量（最大值），默认为1，当开启动态分配有效，若未开启，则该值等于ExecutorNumbers 
     * @return ExecutorMaxNumbers 指定的Executor数量（最大值），默认为1，当开启动态分配有效，若未开启，则该值等于ExecutorNumbers
     */
    public Long getExecutorMaxNumbers() {
        return this.ExecutorMaxNumbers;
    }

    /**
     * Set 指定的Executor数量（最大值），默认为1，当开启动态分配有效，若未开启，则该值等于ExecutorNumbers
     * @param ExecutorMaxNumbers 指定的Executor数量（最大值），默认为1，当开启动态分配有效，若未开启，则该值等于ExecutorNumbers
     */
    public void setExecutorMaxNumbers(Long ExecutorMaxNumbers) {
        this.ExecutorMaxNumbers = ExecutorMaxNumbers;
    }

    /**
     * Get 指定的Session超时时间，单位秒，默认3600秒 
     * @return TimeoutInSecond 指定的Session超时时间，单位秒，默认3600秒
     */
    public Long getTimeoutInSecond() {
        return this.TimeoutInSecond;
    }

    /**
     * Set 指定的Session超时时间，单位秒，默认3600秒
     * @param TimeoutInSecond 指定的Session超时时间，单位秒，默认3600秒
     */
    public void setTimeoutInSecond(Long TimeoutInSecond) {
        this.TimeoutInSecond = TimeoutInSecond;
    }

    /**
     * Get Session唯一标识，当指定sessionid，则使用该session运行任务。 
     * @return SessionId Session唯一标识，当指定sessionid，则使用该session运行任务。
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set Session唯一标识，当指定sessionid，则使用该session运行任务。
     * @param SessionId Session唯一标识，当指定sessionid，则使用该session运行任务。
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get 指定要创建的session名称 
     * @return SessionName 指定要创建的session名称
     */
    public String getSessionName() {
        return this.SessionName;
    }

    /**
     * Set 指定要创建的session名称
     * @param SessionName 指定要创建的session名称
     */
    public void setSessionName(String SessionName) {
        this.SessionName = SessionName;
    }

    /**
     * Get Session相关配置，当前支持：1.dlc.eni：用户配置的eni网关信息，可以用过该字段设置；
2.dlc.role.arn：用户配置的roleArn鉴权策略配置信息，可以用过该字段设置；
3.dlc.sql.set.config：用户配置的集群配置信息，可以用过该字段设置； 
     * @return Arguments Session相关配置，当前支持：1.dlc.eni：用户配置的eni网关信息，可以用过该字段设置；
2.dlc.role.arn：用户配置的roleArn鉴权策略配置信息，可以用过该字段设置；
3.dlc.sql.set.config：用户配置的集群配置信息，可以用过该字段设置；
     */
    public KVPair [] getArguments() {
        return this.Arguments;
    }

    /**
     * Set Session相关配置，当前支持：1.dlc.eni：用户配置的eni网关信息，可以用过该字段设置；
2.dlc.role.arn：用户配置的roleArn鉴权策略配置信息，可以用过该字段设置；
3.dlc.sql.set.config：用户配置的集群配置信息，可以用过该字段设置；
     * @param Arguments Session相关配置，当前支持：1.dlc.eni：用户配置的eni网关信息，可以用过该字段设置；
2.dlc.role.arn：用户配置的roleArn鉴权策略配置信息，可以用过该字段设置；
3.dlc.sql.set.config：用户配置的集群配置信息，可以用过该字段设置；
     */
    public void setArguments(KVPair [] Arguments) {
        this.Arguments = Arguments;
    }

    /**
     * Get 是否继承集群的资源类配置：0：自定义（默认），1：继承集群； 
     * @return IsInherit 是否继承集群的资源类配置：0：自定义（默认），1：继承集群；
     */
    public Long getIsInherit() {
        return this.IsInherit;
    }

    /**
     * Set 是否继承集群的资源类配置：0：自定义（默认），1：继承集群；
     * @param IsInherit 是否继承集群的资源类配置：0：自定义（默认），1：继承集群；
     */
    public void setIsInherit(Long IsInherit) {
        this.IsInherit = IsInherit;
    }

    public CreateSparkSessionBatchSQLRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSparkSessionBatchSQLRequest(CreateSparkSessionBatchSQLRequest source) {
        if (source.DataEngineName != null) {
            this.DataEngineName = new String(source.DataEngineName);
        }
        if (source.ExecuteSQL != null) {
            this.ExecuteSQL = new String(source.ExecuteSQL);
        }
        if (source.DriverSize != null) {
            this.DriverSize = new String(source.DriverSize);
        }
        if (source.ExecutorSize != null) {
            this.ExecutorSize = new String(source.ExecutorSize);
        }
        if (source.ExecutorNumbers != null) {
            this.ExecutorNumbers = new Long(source.ExecutorNumbers);
        }
        if (source.ExecutorMaxNumbers != null) {
            this.ExecutorMaxNumbers = new Long(source.ExecutorMaxNumbers);
        }
        if (source.TimeoutInSecond != null) {
            this.TimeoutInSecond = new Long(source.TimeoutInSecond);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.SessionName != null) {
            this.SessionName = new String(source.SessionName);
        }
        if (source.Arguments != null) {
            this.Arguments = new KVPair[source.Arguments.length];
            for (int i = 0; i < source.Arguments.length; i++) {
                this.Arguments[i] = new KVPair(source.Arguments[i]);
            }
        }
        if (source.IsInherit != null) {
            this.IsInherit = new Long(source.IsInherit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataEngineName", this.DataEngineName);
        this.setParamSimple(map, prefix + "ExecuteSQL", this.ExecuteSQL);
        this.setParamSimple(map, prefix + "DriverSize", this.DriverSize);
        this.setParamSimple(map, prefix + "ExecutorSize", this.ExecutorSize);
        this.setParamSimple(map, prefix + "ExecutorNumbers", this.ExecutorNumbers);
        this.setParamSimple(map, prefix + "ExecutorMaxNumbers", this.ExecutorMaxNumbers);
        this.setParamSimple(map, prefix + "TimeoutInSecond", this.TimeoutInSecond);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionName", this.SessionName);
        this.setParamArrayObj(map, prefix + "Arguments.", this.Arguments);
        this.setParamSimple(map, prefix + "IsInherit", this.IsInherit);

    }
}

