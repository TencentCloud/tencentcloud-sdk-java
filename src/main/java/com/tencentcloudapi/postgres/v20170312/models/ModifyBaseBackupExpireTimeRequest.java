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

public class ModifyBaseBackupExpireTimeRequest extends AbstractModel {

    /**
    * 实例ID。可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/409/16773)接口获取
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * 数据备份ID。可通过[DescribeBaseBackups](https://cloud.tencent.com/document/api/409/89022)接口获取
    */
    @SerializedName("BaseBackupId")
    @Expose
    private String BaseBackupId;

    /**
    * 新过期时间。
    */
    @SerializedName("NewExpireTime")
    @Expose
    private String NewExpireTime;

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
     * Get 数据备份ID。可通过[DescribeBaseBackups](https://cloud.tencent.com/document/api/409/89022)接口获取 
     * @return BaseBackupId 数据备份ID。可通过[DescribeBaseBackups](https://cloud.tencent.com/document/api/409/89022)接口获取
     */
    public String getBaseBackupId() {
        return this.BaseBackupId;
    }

    /**
     * Set 数据备份ID。可通过[DescribeBaseBackups](https://cloud.tencent.com/document/api/409/89022)接口获取
     * @param BaseBackupId 数据备份ID。可通过[DescribeBaseBackups](https://cloud.tencent.com/document/api/409/89022)接口获取
     */
    public void setBaseBackupId(String BaseBackupId) {
        this.BaseBackupId = BaseBackupId;
    }

    /**
     * Get 新过期时间。 
     * @return NewExpireTime 新过期时间。
     */
    public String getNewExpireTime() {
        return this.NewExpireTime;
    }

    /**
     * Set 新过期时间。
     * @param NewExpireTime 新过期时间。
     */
    public void setNewExpireTime(String NewExpireTime) {
        this.NewExpireTime = NewExpireTime;
    }

    public ModifyBaseBackupExpireTimeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBaseBackupExpireTimeRequest(ModifyBaseBackupExpireTimeRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.BaseBackupId != null) {
            this.BaseBackupId = new String(source.BaseBackupId);
        }
        if (source.NewExpireTime != null) {
            this.NewExpireTime = new String(source.NewExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "BaseBackupId", this.BaseBackupId);
        this.setParamSimple(map, prefix + "NewExpireTime", this.NewExpireTime);

    }
}

