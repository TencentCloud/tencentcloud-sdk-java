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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RollbackInstancesInfo  extends AbstractModel{

    /**
    * 云数据库实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 回档策略。可选值为：table、db、full；默认值为full。table - 急速回档模式，仅导入所选中表级别的备份和binlog，如有跨表操作，且关联表未被同时选中，将会导致回档失败，该模式下参数Databases必须为空；db - 快速模式，仅导入所选中库级别的备份和binlog，如有跨库操作，且关联库未被同时选中，将会导致回档失败；full - 普通回档模式，将导入整个实例的备份和binlog，速度较慢。
    */
    @SerializedName("Strategy")
    @Expose
    private String Strategy;

    /**
    * 数据库回档时间，时间格式为：yyyy-mm-dd hh:mm:ss
    */
    @SerializedName("RollbackTime")
    @Expose
    private String RollbackTime;

    /**
    * 待回档的数据库信息，表示整库回档
    */
    @SerializedName("Databases")
    @Expose
    private RollbackDBName [] Databases;

    /**
    * 待回档的数据库表信息，表示按表回档
    */
    @SerializedName("Tables")
    @Expose
    private RollbackTables [] Tables;

    /**
     * 获取云数据库实例ID
     * @return InstanceId 云数据库实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置云数据库实例ID
     * @param InstanceId 云数据库实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取回档策略。可选值为：table、db、full；默认值为full。table - 急速回档模式，仅导入所选中表级别的备份和binlog，如有跨表操作，且关联表未被同时选中，将会导致回档失败，该模式下参数Databases必须为空；db - 快速模式，仅导入所选中库级别的备份和binlog，如有跨库操作，且关联库未被同时选中，将会导致回档失败；full - 普通回档模式，将导入整个实例的备份和binlog，速度较慢。
     * @return Strategy 回档策略。可选值为：table、db、full；默认值为full。table - 急速回档模式，仅导入所选中表级别的备份和binlog，如有跨表操作，且关联表未被同时选中，将会导致回档失败，该模式下参数Databases必须为空；db - 快速模式，仅导入所选中库级别的备份和binlog，如有跨库操作，且关联库未被同时选中，将会导致回档失败；full - 普通回档模式，将导入整个实例的备份和binlog，速度较慢。
     */
    public String getStrategy() {
        return this.Strategy;
    }

    /**
     * 设置回档策略。可选值为：table、db、full；默认值为full。table - 急速回档模式，仅导入所选中表级别的备份和binlog，如有跨表操作，且关联表未被同时选中，将会导致回档失败，该模式下参数Databases必须为空；db - 快速模式，仅导入所选中库级别的备份和binlog，如有跨库操作，且关联库未被同时选中，将会导致回档失败；full - 普通回档模式，将导入整个实例的备份和binlog，速度较慢。
     * @param Strategy 回档策略。可选值为：table、db、full；默认值为full。table - 急速回档模式，仅导入所选中表级别的备份和binlog，如有跨表操作，且关联表未被同时选中，将会导致回档失败，该模式下参数Databases必须为空；db - 快速模式，仅导入所选中库级别的备份和binlog，如有跨库操作，且关联库未被同时选中，将会导致回档失败；full - 普通回档模式，将导入整个实例的备份和binlog，速度较慢。
     */
    public void setStrategy(String Strategy) {
        this.Strategy = Strategy;
    }

    /**
     * 获取数据库回档时间，时间格式为：yyyy-mm-dd hh:mm:ss
     * @return RollbackTime 数据库回档时间，时间格式为：yyyy-mm-dd hh:mm:ss
     */
    public String getRollbackTime() {
        return this.RollbackTime;
    }

    /**
     * 设置数据库回档时间，时间格式为：yyyy-mm-dd hh:mm:ss
     * @param RollbackTime 数据库回档时间，时间格式为：yyyy-mm-dd hh:mm:ss
     */
    public void setRollbackTime(String RollbackTime) {
        this.RollbackTime = RollbackTime;
    }

    /**
     * 获取待回档的数据库信息，表示整库回档
     * @return Databases 待回档的数据库信息，表示整库回档
     */
    public RollbackDBName [] getDatabases() {
        return this.Databases;
    }

    /**
     * 设置待回档的数据库信息，表示整库回档
     * @param Databases 待回档的数据库信息，表示整库回档
     */
    public void setDatabases(RollbackDBName [] Databases) {
        this.Databases = Databases;
    }

    /**
     * 获取待回档的数据库表信息，表示按表回档
     * @return Tables 待回档的数据库表信息，表示按表回档
     */
    public RollbackTables [] getTables() {
        return this.Tables;
    }

    /**
     * 设置待回档的数据库表信息，表示按表回档
     * @param Tables 待回档的数据库表信息，表示按表回档
     */
    public void setTables(RollbackTables [] Tables) {
        this.Tables = Tables;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Strategy", this.Strategy);
        this.setParamSimple(map, prefix + "RollbackTime", this.RollbackTime);
        this.setParamArrayObj(map, prefix + "Databases.", this.Databases);
        this.setParamArrayObj(map, prefix + "Tables.", this.Tables);

    }
}

