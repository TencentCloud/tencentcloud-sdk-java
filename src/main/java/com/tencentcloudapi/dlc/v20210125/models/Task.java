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

public class Task extends AbstractModel{

    /**
    * SQL查询任务
    */
    @SerializedName("SQLTask")
    @Expose
    private SQLTask SQLTask;

    /**
    * Spark SQL查询任务
    */
    @SerializedName("SparkSQLTask")
    @Expose
    private SQLTask SparkSQLTask;

    /**
     * Get SQL查询任务 
     * @return SQLTask SQL查询任务
     */
    public SQLTask getSQLTask() {
        return this.SQLTask;
    }

    /**
     * Set SQL查询任务
     * @param SQLTask SQL查询任务
     */
    public void setSQLTask(SQLTask SQLTask) {
        this.SQLTask = SQLTask;
    }

    /**
     * Get Spark SQL查询任务 
     * @return SparkSQLTask Spark SQL查询任务
     */
    public SQLTask getSparkSQLTask() {
        return this.SparkSQLTask;
    }

    /**
     * Set Spark SQL查询任务
     * @param SparkSQLTask Spark SQL查询任务
     */
    public void setSparkSQLTask(SQLTask SparkSQLTask) {
        this.SparkSQLTask = SparkSQLTask;
    }

    public Task() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Task(Task source) {
        if (source.SQLTask != null) {
            this.SQLTask = new SQLTask(source.SQLTask);
        }
        if (source.SparkSQLTask != null) {
            this.SparkSQLTask = new SQLTask(source.SparkSQLTask);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "SQLTask.", this.SQLTask);
        this.setParamObj(map, prefix + "SparkSQLTask.", this.SparkSQLTask);

    }
}

