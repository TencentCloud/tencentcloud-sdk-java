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

public class DescribeDBInstanceSecurityGroupsRequest extends AbstractModel {

    /**
    * <p>实例ID，可通过<a href="https://cloud.tencent.com/document/api/409/16773">DescribeDBInstances</a>接口获取。DBInstanceId、ReadOnlyGroupId、ProxyAddressId至少传一个；如果要查询实例关联的安全组，只传DBInstanceId字段。</p>
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * <p>只读组ID，可通过<a href="https://cloud.tencent.com/document/api/409/52599">DescribeReadOnlyGroups</a>接口获取。DBInstanceId、ReadOnlyGroupId、ProxyAddressId至少传一个；如果要查询只读组关联的安全组，只传ReadOnlyGroupId。</p>
    */
    @SerializedName("ReadOnlyGroupId")
    @Expose
    private String ReadOnlyGroupId;

    /**
     * Get <p>实例ID，可通过<a href="https://cloud.tencent.com/document/api/409/16773">DescribeDBInstances</a>接口获取。DBInstanceId、ReadOnlyGroupId、ProxyAddressId至少传一个；如果要查询实例关联的安全组，只传DBInstanceId字段。</p> 
     * @return DBInstanceId <p>实例ID，可通过<a href="https://cloud.tencent.com/document/api/409/16773">DescribeDBInstances</a>接口获取。DBInstanceId、ReadOnlyGroupId、ProxyAddressId至少传一个；如果要查询实例关联的安全组，只传DBInstanceId字段。</p>
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set <p>实例ID，可通过<a href="https://cloud.tencent.com/document/api/409/16773">DescribeDBInstances</a>接口获取。DBInstanceId、ReadOnlyGroupId、ProxyAddressId至少传一个；如果要查询实例关联的安全组，只传DBInstanceId字段。</p>
     * @param DBInstanceId <p>实例ID，可通过<a href="https://cloud.tencent.com/document/api/409/16773">DescribeDBInstances</a>接口获取。DBInstanceId、ReadOnlyGroupId、ProxyAddressId至少传一个；如果要查询实例关联的安全组，只传DBInstanceId字段。</p>
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get <p>只读组ID，可通过<a href="https://cloud.tencent.com/document/api/409/52599">DescribeReadOnlyGroups</a>接口获取。DBInstanceId、ReadOnlyGroupId、ProxyAddressId至少传一个；如果要查询只读组关联的安全组，只传ReadOnlyGroupId。</p> 
     * @return ReadOnlyGroupId <p>只读组ID，可通过<a href="https://cloud.tencent.com/document/api/409/52599">DescribeReadOnlyGroups</a>接口获取。DBInstanceId、ReadOnlyGroupId、ProxyAddressId至少传一个；如果要查询只读组关联的安全组，只传ReadOnlyGroupId。</p>
     */
    public String getReadOnlyGroupId() {
        return this.ReadOnlyGroupId;
    }

    /**
     * Set <p>只读组ID，可通过<a href="https://cloud.tencent.com/document/api/409/52599">DescribeReadOnlyGroups</a>接口获取。DBInstanceId、ReadOnlyGroupId、ProxyAddressId至少传一个；如果要查询只读组关联的安全组，只传ReadOnlyGroupId。</p>
     * @param ReadOnlyGroupId <p>只读组ID，可通过<a href="https://cloud.tencent.com/document/api/409/52599">DescribeReadOnlyGroups</a>接口获取。DBInstanceId、ReadOnlyGroupId、ProxyAddressId至少传一个；如果要查询只读组关联的安全组，只传ReadOnlyGroupId。</p>
     */
    public void setReadOnlyGroupId(String ReadOnlyGroupId) {
        this.ReadOnlyGroupId = ReadOnlyGroupId;
    }

    public DescribeDBInstanceSecurityGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBInstanceSecurityGroupsRequest(DescribeDBInstanceSecurityGroupsRequest source) {
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
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "ReadOnlyGroupId", this.ReadOnlyGroupId);

    }
}

