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

public class DescribePostgRESTServiceRequest extends AbstractModel {

    /**
    * <p>实例ID</p><p>参数格式：postgres-19nmz2xb</p>
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
     * Get <p>实例ID</p><p>参数格式：postgres-19nmz2xb</p> 
     * @return DBInstanceId <p>实例ID</p><p>参数格式：postgres-19nmz2xb</p>
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set <p>实例ID</p><p>参数格式：postgres-19nmz2xb</p>
     * @param DBInstanceId <p>实例ID</p><p>参数格式：postgres-19nmz2xb</p>
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    public DescribePostgRESTServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePostgRESTServiceRequest(DescribePostgRESTServiceRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);

    }
}

