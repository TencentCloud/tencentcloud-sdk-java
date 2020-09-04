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

public class RollbackInstanceRequest extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 回档类型，0-回档的数据库覆盖原库；1-回档的数据库以重命名的形式生成，不覆盖原库
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 需要回档的数据库
    */
    @SerializedName("DBs")
    @Expose
    private String [] DBs;

    /**
    * 回档目标时间点
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 备份恢复到的同一个APPID下的实例ID，不填则恢复到原实例ID
    */
    @SerializedName("TargetInstanceId")
    @Expose
    private String TargetInstanceId;

    /**
    * 按照ReNameRestoreDatabase中的库进行重命名，仅在Type = 1重命名回档方式有效；不填则按照默认方式命名库，DBs参数确定要恢复的库
    */
    @SerializedName("RenameRestore")
    @Expose
    private RenameRestoreDatabase [] RenameRestore;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 回档类型，0-回档的数据库覆盖原库；1-回档的数据库以重命名的形式生成，不覆盖原库 
     * @return Type 回档类型，0-回档的数据库覆盖原库；1-回档的数据库以重命名的形式生成，不覆盖原库
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 回档类型，0-回档的数据库覆盖原库；1-回档的数据库以重命名的形式生成，不覆盖原库
     * @param Type 回档类型，0-回档的数据库覆盖原库；1-回档的数据库以重命名的形式生成，不覆盖原库
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 需要回档的数据库 
     * @return DBs 需要回档的数据库
     */
    public String [] getDBs() {
        return this.DBs;
    }

    /**
     * Set 需要回档的数据库
     * @param DBs 需要回档的数据库
     */
    public void setDBs(String [] DBs) {
        this.DBs = DBs;
    }

    /**
     * Get 回档目标时间点 
     * @return Time 回档目标时间点
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 回档目标时间点
     * @param Time 回档目标时间点
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get 备份恢复到的同一个APPID下的实例ID，不填则恢复到原实例ID 
     * @return TargetInstanceId 备份恢复到的同一个APPID下的实例ID，不填则恢复到原实例ID
     */
    public String getTargetInstanceId() {
        return this.TargetInstanceId;
    }

    /**
     * Set 备份恢复到的同一个APPID下的实例ID，不填则恢复到原实例ID
     * @param TargetInstanceId 备份恢复到的同一个APPID下的实例ID，不填则恢复到原实例ID
     */
    public void setTargetInstanceId(String TargetInstanceId) {
        this.TargetInstanceId = TargetInstanceId;
    }

    /**
     * Get 按照ReNameRestoreDatabase中的库进行重命名，仅在Type = 1重命名回档方式有效；不填则按照默认方式命名库，DBs参数确定要恢复的库 
     * @return RenameRestore 按照ReNameRestoreDatabase中的库进行重命名，仅在Type = 1重命名回档方式有效；不填则按照默认方式命名库，DBs参数确定要恢复的库
     */
    public RenameRestoreDatabase [] getRenameRestore() {
        return this.RenameRestore;
    }

    /**
     * Set 按照ReNameRestoreDatabase中的库进行重命名，仅在Type = 1重命名回档方式有效；不填则按照默认方式命名库，DBs参数确定要恢复的库
     * @param RenameRestore 按照ReNameRestoreDatabase中的库进行重命名，仅在Type = 1重命名回档方式有效；不填则按照默认方式命名库，DBs参数确定要恢复的库
     */
    public void setRenameRestore(RenameRestoreDatabase [] RenameRestore) {
        this.RenameRestore = RenameRestore;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "DBs.", this.DBs);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "TargetInstanceId", this.TargetInstanceId);
        this.setParamArrayObj(map, prefix + "RenameRestore.", this.RenameRestore);

    }
}

