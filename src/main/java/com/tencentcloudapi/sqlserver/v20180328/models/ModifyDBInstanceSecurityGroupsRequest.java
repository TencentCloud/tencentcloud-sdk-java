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

public class ModifyDBInstanceSecurityGroupsRequest extends AbstractModel{

    /**
    * 实例 ID，格式如：mssql-c1nl9rpv 或者 mssqlro-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 要修改的安全组 ID 列表，一个或者多个安全组 ID 组成的数组。
    */
    @SerializedName("SecurityGroupIdSet")
    @Expose
    private String [] SecurityGroupIdSet;

    /**
     * Get 实例 ID，格式如：mssql-c1nl9rpv 或者 mssqlro-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。 
     * @return InstanceId 实例 ID，格式如：mssql-c1nl9rpv 或者 mssqlro-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID，格式如：mssql-c1nl9rpv 或者 mssqlro-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
     * @param InstanceId 实例 ID，格式如：mssql-c1nl9rpv 或者 mssqlro-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 要修改的安全组 ID 列表，一个或者多个安全组 ID 组成的数组。 
     * @return SecurityGroupIdSet 要修改的安全组 ID 列表，一个或者多个安全组 ID 组成的数组。
     */
    public String [] getSecurityGroupIdSet() {
        return this.SecurityGroupIdSet;
    }

    /**
     * Set 要修改的安全组 ID 列表，一个或者多个安全组 ID 组成的数组。
     * @param SecurityGroupIdSet 要修改的安全组 ID 列表，一个或者多个安全组 ID 组成的数组。
     */
    public void setSecurityGroupIdSet(String [] SecurityGroupIdSet) {
        this.SecurityGroupIdSet = SecurityGroupIdSet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "SecurityGroupIdSet.", this.SecurityGroupIdSet);

    }
}

