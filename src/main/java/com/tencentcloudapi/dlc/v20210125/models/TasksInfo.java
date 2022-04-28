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

public class TasksInfo extends AbstractModel{

    /**
    * 任务类型，SQLTask：SQL查询任务。SparkSQLTask：Spark SQL查询任务
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 容错策略。Proceed：前面任务出错/取消后继续执行后面的任务。Terminate：前面的任务出错/取消之后终止后面任务的执行，后面的任务全部标记为已取消。
    */
    @SerializedName("FailureTolerance")
    @Expose
    private String FailureTolerance;

    /**
    * base64加密后的SQL语句，用";"号分隔每个SQL语句，一次最多提交50个任务。严格按照前后顺序执行
    */
    @SerializedName("SQL")
    @Expose
    private String SQL;

    /**
    * 任务的配置信息，当前仅支持SparkSQLTask任务。
    */
    @SerializedName("Config")
    @Expose
    private KVPair [] Config;

    /**
    * 任务的用户自定义参数信息
    */
    @SerializedName("Params")
    @Expose
    private KVPair [] Params;

    /**
     * Get 任务类型，SQLTask：SQL查询任务。SparkSQLTask：Spark SQL查询任务 
     * @return TaskType 任务类型，SQLTask：SQL查询任务。SparkSQLTask：Spark SQL查询任务
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型，SQLTask：SQL查询任务。SparkSQLTask：Spark SQL查询任务
     * @param TaskType 任务类型，SQLTask：SQL查询任务。SparkSQLTask：Spark SQL查询任务
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 容错策略。Proceed：前面任务出错/取消后继续执行后面的任务。Terminate：前面的任务出错/取消之后终止后面任务的执行，后面的任务全部标记为已取消。 
     * @return FailureTolerance 容错策略。Proceed：前面任务出错/取消后继续执行后面的任务。Terminate：前面的任务出错/取消之后终止后面任务的执行，后面的任务全部标记为已取消。
     */
    public String getFailureTolerance() {
        return this.FailureTolerance;
    }

    /**
     * Set 容错策略。Proceed：前面任务出错/取消后继续执行后面的任务。Terminate：前面的任务出错/取消之后终止后面任务的执行，后面的任务全部标记为已取消。
     * @param FailureTolerance 容错策略。Proceed：前面任务出错/取消后继续执行后面的任务。Terminate：前面的任务出错/取消之后终止后面任务的执行，后面的任务全部标记为已取消。
     */
    public void setFailureTolerance(String FailureTolerance) {
        this.FailureTolerance = FailureTolerance;
    }

    /**
     * Get base64加密后的SQL语句，用";"号分隔每个SQL语句，一次最多提交50个任务。严格按照前后顺序执行 
     * @return SQL base64加密后的SQL语句，用";"号分隔每个SQL语句，一次最多提交50个任务。严格按照前后顺序执行
     */
    public String getSQL() {
        return this.SQL;
    }

    /**
     * Set base64加密后的SQL语句，用";"号分隔每个SQL语句，一次最多提交50个任务。严格按照前后顺序执行
     * @param SQL base64加密后的SQL语句，用";"号分隔每个SQL语句，一次最多提交50个任务。严格按照前后顺序执行
     */
    public void setSQL(String SQL) {
        this.SQL = SQL;
    }

    /**
     * Get 任务的配置信息，当前仅支持SparkSQLTask任务。 
     * @return Config 任务的配置信息，当前仅支持SparkSQLTask任务。
     */
    public KVPair [] getConfig() {
        return this.Config;
    }

    /**
     * Set 任务的配置信息，当前仅支持SparkSQLTask任务。
     * @param Config 任务的配置信息，当前仅支持SparkSQLTask任务。
     */
    public void setConfig(KVPair [] Config) {
        this.Config = Config;
    }

    /**
     * Get 任务的用户自定义参数信息 
     * @return Params 任务的用户自定义参数信息
     */
    public KVPair [] getParams() {
        return this.Params;
    }

    /**
     * Set 任务的用户自定义参数信息
     * @param Params 任务的用户自定义参数信息
     */
    public void setParams(KVPair [] Params) {
        this.Params = Params;
    }

    public TasksInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TasksInfo(TasksInfo source) {
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.FailureTolerance != null) {
            this.FailureTolerance = new String(source.FailureTolerance);
        }
        if (source.SQL != null) {
            this.SQL = new String(source.SQL);
        }
        if (source.Config != null) {
            this.Config = new KVPair[source.Config.length];
            for (int i = 0; i < source.Config.length; i++) {
                this.Config[i] = new KVPair(source.Config[i]);
            }
        }
        if (source.Params != null) {
            this.Params = new KVPair[source.Params.length];
            for (int i = 0; i < source.Params.length; i++) {
                this.Params[i] = new KVPair(source.Params[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "FailureTolerance", this.FailureTolerance);
        this.setParamSimple(map, prefix + "SQL", this.SQL);
        this.setParamArrayObj(map, prefix + "Config.", this.Config);
        this.setParamArrayObj(map, prefix + "Params.", this.Params);

    }
}

