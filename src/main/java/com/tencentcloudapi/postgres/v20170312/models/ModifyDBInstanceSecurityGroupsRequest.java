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

public class ModifyDBInstanceSecurityGroupsRequest extends AbstractModel{

    /**
    * 实例或只读组要绑定的安全组列表。
安全组信息可以通过调用 [DescribeSecurityGroups](https://cloud.tencent.com/document/api/215/15808) 的返回值中的sgId字段来查询。

    */
    @SerializedName("SecurityGroupIdSet")
    @Expose
    private String [] SecurityGroupIdSet;

    /**
    * 实例ID，DBInstanceId和ReadOnlyGroupId至少传一个；如果都传，忽略ReadOnlyGroupId
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * 只读组ID，DBInstanceId和ReadOnlyGroupId至少传一个；如果要修改只读组关联的安全组，只传ReadOnlyGroupId
    */
    @SerializedName("ReadOnlyGroupId")
    @Expose
    private String ReadOnlyGroupId;

    /**
     * Get 实例或只读组要绑定的安全组列表。
安全组信息可以通过调用 [DescribeSecurityGroups](https://cloud.tencent.com/document/api/215/15808) 的返回值中的sgId字段来查询。
 
     * @return SecurityGroupIdSet 实例或只读组要绑定的安全组列表。
安全组信息可以通过调用 [DescribeSecurityGroups](https://cloud.tencent.com/document/api/215/15808) 的返回值中的sgId字段来查询。

     */
    public String [] getSecurityGroupIdSet() {
        return this.SecurityGroupIdSet;
    }

    /**
     * Set 实例或只读组要绑定的安全组列表。
安全组信息可以通过调用 [DescribeSecurityGroups](https://cloud.tencent.com/document/api/215/15808) 的返回值中的sgId字段来查询。

     * @param SecurityGroupIdSet 实例或只读组要绑定的安全组列表。
安全组信息可以通过调用 [DescribeSecurityGroups](https://cloud.tencent.com/document/api/215/15808) 的返回值中的sgId字段来查询。

     */
    public void setSecurityGroupIdSet(String [] SecurityGroupIdSet) {
        this.SecurityGroupIdSet = SecurityGroupIdSet;
    }

    /**
     * Get 实例ID，DBInstanceId和ReadOnlyGroupId至少传一个；如果都传，忽略ReadOnlyGroupId 
     * @return DBInstanceId 实例ID，DBInstanceId和ReadOnlyGroupId至少传一个；如果都传，忽略ReadOnlyGroupId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set 实例ID，DBInstanceId和ReadOnlyGroupId至少传一个；如果都传，忽略ReadOnlyGroupId
     * @param DBInstanceId 实例ID，DBInstanceId和ReadOnlyGroupId至少传一个；如果都传，忽略ReadOnlyGroupId
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get 只读组ID，DBInstanceId和ReadOnlyGroupId至少传一个；如果要修改只读组关联的安全组，只传ReadOnlyGroupId 
     * @return ReadOnlyGroupId 只读组ID，DBInstanceId和ReadOnlyGroupId至少传一个；如果要修改只读组关联的安全组，只传ReadOnlyGroupId
     */
    public String getReadOnlyGroupId() {
        return this.ReadOnlyGroupId;
    }

    /**
     * Set 只读组ID，DBInstanceId和ReadOnlyGroupId至少传一个；如果要修改只读组关联的安全组，只传ReadOnlyGroupId
     * @param ReadOnlyGroupId 只读组ID，DBInstanceId和ReadOnlyGroupId至少传一个；如果要修改只读组关联的安全组，只传ReadOnlyGroupId
     */
    public void setReadOnlyGroupId(String ReadOnlyGroupId) {
        this.ReadOnlyGroupId = ReadOnlyGroupId;
    }

    public ModifyDBInstanceSecurityGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDBInstanceSecurityGroupsRequest(ModifyDBInstanceSecurityGroupsRequest source) {
        if (source.SecurityGroupIdSet != null) {
            this.SecurityGroupIdSet = new String[source.SecurityGroupIdSet.length];
            for (int i = 0; i < source.SecurityGroupIdSet.length; i++) {
                this.SecurityGroupIdSet[i] = new String(source.SecurityGroupIdSet[i]);
            }
        }
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.ReadOnlyGroupId != null) {
            this.ReadOnlyGroupId = new String(source.ReadOnlyGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SecurityGroupIdSet.", this.SecurityGroupIdSet);
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "ReadOnlyGroupId", this.ReadOnlyGroupId);

    }
}

