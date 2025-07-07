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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAccountPrivilegesRequest extends AbstractModel {

    /**
    * 实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 数据库的账号名称。可通过 [DescribeAccounts](https://cloud.tencent.com/document/api/236/17499) 接口获取。
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * 数据库的账号域名。可通过 [DescribeAccounts](https://cloud.tencent.com/document/api/236/17499) 接口获取。
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
     * Get 实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。 
     * @return InstanceId 实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
     * @param InstanceId 实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 数据库的账号名称。可通过 [DescribeAccounts](https://cloud.tencent.com/document/api/236/17499) 接口获取。 
     * @return User 数据库的账号名称。可通过 [DescribeAccounts](https://cloud.tencent.com/document/api/236/17499) 接口获取。
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set 数据库的账号名称。可通过 [DescribeAccounts](https://cloud.tencent.com/document/api/236/17499) 接口获取。
     * @param User 数据库的账号名称。可通过 [DescribeAccounts](https://cloud.tencent.com/document/api/236/17499) 接口获取。
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get 数据库的账号域名。可通过 [DescribeAccounts](https://cloud.tencent.com/document/api/236/17499) 接口获取。 
     * @return Host 数据库的账号域名。可通过 [DescribeAccounts](https://cloud.tencent.com/document/api/236/17499) 接口获取。
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 数据库的账号域名。可通过 [DescribeAccounts](https://cloud.tencent.com/document/api/236/17499) 接口获取。
     * @param Host 数据库的账号域名。可通过 [DescribeAccounts](https://cloud.tencent.com/document/api/236/17499) 接口获取。
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    public DescribeAccountPrivilegesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAccountPrivilegesRequest(DescribeAccountPrivilegesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Host", this.Host);

    }
}

