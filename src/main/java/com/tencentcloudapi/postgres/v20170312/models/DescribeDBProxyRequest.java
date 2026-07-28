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

public class DescribeDBProxyRequest extends AbstractModel {

    /**
    * <p>实例 ID，格式形如：postgres-xxxxxxxx</p>
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * <p>Proxy 实例 ID，格式形如：proxy-xxxxxxxx；不传则查询该实例下全部 Proxy</p>
    */
    @SerializedName("ProxyGroupId")
    @Expose
    private String ProxyGroupId;

    /**
     * Get <p>实例 ID，格式形如：postgres-xxxxxxxx</p> 
     * @return DBInstanceId <p>实例 ID，格式形如：postgres-xxxxxxxx</p>
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set <p>实例 ID，格式形如：postgres-xxxxxxxx</p>
     * @param DBInstanceId <p>实例 ID，格式形如：postgres-xxxxxxxx</p>
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get <p>Proxy 实例 ID，格式形如：proxy-xxxxxxxx；不传则查询该实例下全部 Proxy</p> 
     * @return ProxyGroupId <p>Proxy 实例 ID，格式形如：proxy-xxxxxxxx；不传则查询该实例下全部 Proxy</p>
     */
    public String getProxyGroupId() {
        return this.ProxyGroupId;
    }

    /**
     * Set <p>Proxy 实例 ID，格式形如：proxy-xxxxxxxx；不传则查询该实例下全部 Proxy</p>
     * @param ProxyGroupId <p>Proxy 实例 ID，格式形如：proxy-xxxxxxxx；不传则查询该实例下全部 Proxy</p>
     */
    public void setProxyGroupId(String ProxyGroupId) {
        this.ProxyGroupId = ProxyGroupId;
    }

    public DescribeDBProxyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBProxyRequest(DescribeDBProxyRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.ProxyGroupId != null) {
            this.ProxyGroupId = new String(source.ProxyGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "ProxyGroupId", this.ProxyGroupId);

    }
}

