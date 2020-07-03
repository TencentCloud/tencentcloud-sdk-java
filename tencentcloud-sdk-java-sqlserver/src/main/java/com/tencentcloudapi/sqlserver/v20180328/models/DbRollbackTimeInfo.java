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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DbRollbackTimeInfo extends AbstractModel{

    /**
    * 数据库名称
    */
    @SerializedName("DBName")
    @Expose
    private String DBName;

    /**
    * 可回档开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 可回档结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 数据库名称 
     * @return DBName 数据库名称
     */
    public String getDBName() {
        return this.DBName;
    }

    /**
     * Set 数据库名称
     * @param DBName 数据库名称
     */
    public void setDBName(String DBName) {
        this.DBName = DBName;
    }

    /**
     * Get 可回档开始时间 
     * @return StartTime 可回档开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 可回档开始时间
     * @param StartTime 可回档开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 可回档结束时间 
     * @return EndTime 可回档结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 可回档结束时间
     * @param EndTime 可回档结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBName", this.DBName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

