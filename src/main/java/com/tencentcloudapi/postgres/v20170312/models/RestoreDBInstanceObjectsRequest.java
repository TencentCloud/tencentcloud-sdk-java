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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RestoreDBInstanceObjectsRequest extends AbstractModel {

    /**
    * 实例ID。可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/409/16773)接口获取
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * 需要恢复的对象列表。假设需要恢复的对象名为user，则恢复后的名称为user_bak_${LinuxTime}。${LinuxTime}无法指定，由系统根据任务发起的linux时间设定。
    */
    @SerializedName("RestoreObjects")
    @Expose
    private String [] RestoreObjects;

    /**
    * 恢复所用备份集。BackupSetId与RestoreTargetTime有且只能传一个。可通过[DescribeBaseBackups](https://cloud.tencent.com/document/api/409/89022)接口获取
    */
    @SerializedName("BackupSetId")
    @Expose
    private String BackupSetId;

    /**
    * 恢复目标时间，北京时间。BackupSetId与RestoreTargetTime有且只能传一个。
    */
    @SerializedName("RestoreTargetTime")
    @Expose
    private String RestoreTargetTime;

    /**
     * Get 实例ID。可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/409/16773)接口获取 
     * @return DBInstanceId 实例ID。可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/409/16773)接口获取
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set 实例ID。可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/409/16773)接口获取
     * @param DBInstanceId 实例ID。可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/409/16773)接口获取
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get 需要恢复的对象列表。假设需要恢复的对象名为user，则恢复后的名称为user_bak_${LinuxTime}。${LinuxTime}无法指定，由系统根据任务发起的linux时间设定。 
     * @return RestoreObjects 需要恢复的对象列表。假设需要恢复的对象名为user，则恢复后的名称为user_bak_${LinuxTime}。${LinuxTime}无法指定，由系统根据任务发起的linux时间设定。
     */
    public String [] getRestoreObjects() {
        return this.RestoreObjects;
    }

    /**
     * Set 需要恢复的对象列表。假设需要恢复的对象名为user，则恢复后的名称为user_bak_${LinuxTime}。${LinuxTime}无法指定，由系统根据任务发起的linux时间设定。
     * @param RestoreObjects 需要恢复的对象列表。假设需要恢复的对象名为user，则恢复后的名称为user_bak_${LinuxTime}。${LinuxTime}无法指定，由系统根据任务发起的linux时间设定。
     */
    public void setRestoreObjects(String [] RestoreObjects) {
        this.RestoreObjects = RestoreObjects;
    }

    /**
     * Get 恢复所用备份集。BackupSetId与RestoreTargetTime有且只能传一个。可通过[DescribeBaseBackups](https://cloud.tencent.com/document/api/409/89022)接口获取 
     * @return BackupSetId 恢复所用备份集。BackupSetId与RestoreTargetTime有且只能传一个。可通过[DescribeBaseBackups](https://cloud.tencent.com/document/api/409/89022)接口获取
     */
    public String getBackupSetId() {
        return this.BackupSetId;
    }

    /**
     * Set 恢复所用备份集。BackupSetId与RestoreTargetTime有且只能传一个。可通过[DescribeBaseBackups](https://cloud.tencent.com/document/api/409/89022)接口获取
     * @param BackupSetId 恢复所用备份集。BackupSetId与RestoreTargetTime有且只能传一个。可通过[DescribeBaseBackups](https://cloud.tencent.com/document/api/409/89022)接口获取
     */
    public void setBackupSetId(String BackupSetId) {
        this.BackupSetId = BackupSetId;
    }

    /**
     * Get 恢复目标时间，北京时间。BackupSetId与RestoreTargetTime有且只能传一个。 
     * @return RestoreTargetTime 恢复目标时间，北京时间。BackupSetId与RestoreTargetTime有且只能传一个。
     */
    public String getRestoreTargetTime() {
        return this.RestoreTargetTime;
    }

    /**
     * Set 恢复目标时间，北京时间。BackupSetId与RestoreTargetTime有且只能传一个。
     * @param RestoreTargetTime 恢复目标时间，北京时间。BackupSetId与RestoreTargetTime有且只能传一个。
     */
    public void setRestoreTargetTime(String RestoreTargetTime) {
        this.RestoreTargetTime = RestoreTargetTime;
    }

    public RestoreDBInstanceObjectsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RestoreDBInstanceObjectsRequest(RestoreDBInstanceObjectsRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.RestoreObjects != null) {
            this.RestoreObjects = new String[source.RestoreObjects.length];
            for (int i = 0; i < source.RestoreObjects.length; i++) {
                this.RestoreObjects[i] = new String(source.RestoreObjects[i]);
            }
        }
        if (source.BackupSetId != null) {
            this.BackupSetId = new String(source.BackupSetId);
        }
        if (source.RestoreTargetTime != null) {
            this.RestoreTargetTime = new String(source.RestoreTargetTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamArraySimple(map, prefix + "RestoreObjects.", this.RestoreObjects);
        this.setParamSimple(map, prefix + "BackupSetId", this.BackupSetId);
        this.setParamSimple(map, prefix + "RestoreTargetTime", this.RestoreTargetTime);

    }
}

