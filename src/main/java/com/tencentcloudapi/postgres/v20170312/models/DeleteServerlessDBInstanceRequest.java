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

public class DeleteServerlessDBInstanceRequest extends AbstractModel{

    /**
    * DB实例名称，实例名和实例ID必须至少传一个，如果同时存在，将只以实例ID为准。
    */
    @SerializedName("DBInstanceName")
    @Expose
    private String DBInstanceName;

    /**
    * DB实例ID，实例名和实例ID必须至少传一个，如果同时存在，将只以实例ID为准。
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
     * Get DB实例名称，实例名和实例ID必须至少传一个，如果同时存在，将只以实例ID为准。 
     * @return DBInstanceName DB实例名称，实例名和实例ID必须至少传一个，如果同时存在，将只以实例ID为准。
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * Set DB实例名称，实例名和实例ID必须至少传一个，如果同时存在，将只以实例ID为准。
     * @param DBInstanceName DB实例名称，实例名和实例ID必须至少传一个，如果同时存在，将只以实例ID为准。
     */
    public void setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
    }

    /**
     * Get DB实例ID，实例名和实例ID必须至少传一个，如果同时存在，将只以实例ID为准。 
     * @return DBInstanceId DB实例ID，实例名和实例ID必须至少传一个，如果同时存在，将只以实例ID为准。
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set DB实例ID，实例名和实例ID必须至少传一个，如果同时存在，将只以实例ID为准。
     * @param DBInstanceId DB实例ID，实例名和实例ID必须至少传一个，如果同时存在，将只以实例ID为准。
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceName", this.DBInstanceName);
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);

    }
}

