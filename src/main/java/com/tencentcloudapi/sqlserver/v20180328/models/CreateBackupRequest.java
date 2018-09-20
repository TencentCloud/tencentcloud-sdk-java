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

public class CreateBackupRequest  extends AbstractModel{

    /**
    * 备份策略(0-实例备份 1-多库备份)
    */
    @SerializedName("Strategy")
    @Expose
    private Integer Strategy;

    /**
    * 需要备份库名的列表(多库备份才填写)
    */
    @SerializedName("DBNames")
    @Expose
    private String [] DBNames;

    /**
    * 实例ID，形如mssql-i1z41iwd
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * 获取备份策略(0-实例备份 1-多库备份)
     * @return Strategy 备份策略(0-实例备份 1-多库备份)
     */
    public Integer getStrategy() {
        return this.Strategy;
    }

    /**
     * 设置备份策略(0-实例备份 1-多库备份)
     * @param Strategy 备份策略(0-实例备份 1-多库备份)
     */
    public void setStrategy(Integer Strategy) {
        this.Strategy = Strategy;
    }

    /**
     * 获取需要备份库名的列表(多库备份才填写)
     * @return DBNames 需要备份库名的列表(多库备份才填写)
     */
    public String [] getDBNames() {
        return this.DBNames;
    }

    /**
     * 设置需要备份库名的列表(多库备份才填写)
     * @param DBNames 需要备份库名的列表(多库备份才填写)
     */
    public void setDBNames(String [] DBNames) {
        this.DBNames = DBNames;
    }

    /**
     * 获取实例ID，形如mssql-i1z41iwd
     * @return InstanceId 实例ID，形如mssql-i1z41iwd
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置实例ID，形如mssql-i1z41iwd
     * @param InstanceId 实例ID，形如mssql-i1z41iwd
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Strategy", this.Strategy);
        this.setParamArraySimple(map, prefix + "DBNames.", this.DBNames);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

