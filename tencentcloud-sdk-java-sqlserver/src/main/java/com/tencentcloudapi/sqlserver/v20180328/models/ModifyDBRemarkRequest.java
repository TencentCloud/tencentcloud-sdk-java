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

public class ModifyDBRemarkRequest extends AbstractModel{

    /**
    * 实例ID，形如mssql-rljoi3bf
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 数据库名称及备注数组，每个元素包含数据库名和对应的备注
    */
    @SerializedName("DBRemarks")
    @Expose
    private DBRemark [] DBRemarks;

    /**
     * Get 实例ID，形如mssql-rljoi3bf 
     * @return InstanceId 实例ID，形如mssql-rljoi3bf
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID，形如mssql-rljoi3bf
     * @param InstanceId 实例ID，形如mssql-rljoi3bf
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 数据库名称及备注数组，每个元素包含数据库名和对应的备注 
     * @return DBRemarks 数据库名称及备注数组，每个元素包含数据库名和对应的备注
     */
    public DBRemark [] getDBRemarks() {
        return this.DBRemarks;
    }

    /**
     * Set 数据库名称及备注数组，每个元素包含数据库名和对应的备注
     * @param DBRemarks 数据库名称及备注数组，每个元素包含数据库名和对应的备注
     */
    public void setDBRemarks(DBRemark [] DBRemarks) {
        this.DBRemarks = DBRemarks;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "DBRemarks.", this.DBRemarks);

    }
}

