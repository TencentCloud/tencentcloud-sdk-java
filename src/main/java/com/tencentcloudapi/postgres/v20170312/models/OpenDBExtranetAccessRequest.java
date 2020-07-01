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

public class OpenDBExtranetAccessRequest extends AbstractModel{

    /**
    * 实例ID，形如postgres-hez4fh0v
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * 是否开通Ipv6外网，1：是，0：否
    */
    @SerializedName("IsIpv6")
    @Expose
    private Long IsIpv6;

    /**
     * Get 实例ID，形如postgres-hez4fh0v 
     * @return DBInstanceId 实例ID，形如postgres-hez4fh0v
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set 实例ID，形如postgres-hez4fh0v
     * @param DBInstanceId 实例ID，形如postgres-hez4fh0v
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get 是否开通Ipv6外网，1：是，0：否 
     * @return IsIpv6 是否开通Ipv6外网，1：是，0：否
     */
    public Long getIsIpv6() {
        return this.IsIpv6;
    }

    /**
     * Set 是否开通Ipv6外网，1：是，0：否
     * @param IsIpv6 是否开通Ipv6外网，1：是，0：否
     */
    public void setIsIpv6(Long IsIpv6) {
        this.IsIpv6 = IsIpv6;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "IsIpv6", this.IsIpv6);

    }
}

