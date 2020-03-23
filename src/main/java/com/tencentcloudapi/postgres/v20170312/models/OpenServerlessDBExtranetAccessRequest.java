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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OpenServerlessDBExtranetAccessRequest extends AbstractModel{

    /**
    * 实例的唯一标识符
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * 实例名称
    */
    @SerializedName("DBInstanceName")
    @Expose
    private String DBInstanceName;

    /**
     * Get 实例的唯一标识符 
     * @return DBInstanceId 实例的唯一标识符
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set 实例的唯一标识符
     * @param DBInstanceId 实例的唯一标识符
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get 实例名称 
     * @return DBInstanceName 实例名称
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * Set 实例名称
     * @param DBInstanceName 实例名称
     */
    public void setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "DBInstanceName", this.DBInstanceName);

    }
}

