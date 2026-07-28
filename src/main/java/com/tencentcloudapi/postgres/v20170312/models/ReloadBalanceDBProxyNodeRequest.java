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

public class ReloadBalanceDBProxyNodeRequest extends AbstractModel {

    /**
    * <p>实例ID</p>
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * <p>Proxy代理组ID（不传则默认操作该实例下唯一的代理）</p>
    */
    @SerializedName("ProxyGroupId")
    @Expose
    private String ProxyGroupId;

    /**
    * <p>Proxy地址ID。传入时校验归属，实际重平衡为代理组维度</p>
    */
    @SerializedName("AddressId")
    @Expose
    private String AddressId;

    /**
     * Get <p>实例ID</p> 
     * @return DBInstanceId <p>实例ID</p>
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set <p>实例ID</p>
     * @param DBInstanceId <p>实例ID</p>
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get <p>Proxy代理组ID（不传则默认操作该实例下唯一的代理）</p> 
     * @return ProxyGroupId <p>Proxy代理组ID（不传则默认操作该实例下唯一的代理）</p>
     */
    public String getProxyGroupId() {
        return this.ProxyGroupId;
    }

    /**
     * Set <p>Proxy代理组ID（不传则默认操作该实例下唯一的代理）</p>
     * @param ProxyGroupId <p>Proxy代理组ID（不传则默认操作该实例下唯一的代理）</p>
     */
    public void setProxyGroupId(String ProxyGroupId) {
        this.ProxyGroupId = ProxyGroupId;
    }

    /**
     * Get <p>Proxy地址ID。传入时校验归属，实际重平衡为代理组维度</p> 
     * @return AddressId <p>Proxy地址ID。传入时校验归属，实际重平衡为代理组维度</p>
     */
    public String getAddressId() {
        return this.AddressId;
    }

    /**
     * Set <p>Proxy地址ID。传入时校验归属，实际重平衡为代理组维度</p>
     * @param AddressId <p>Proxy地址ID。传入时校验归属，实际重平衡为代理组维度</p>
     */
    public void setAddressId(String AddressId) {
        this.AddressId = AddressId;
    }

    public ReloadBalanceDBProxyNodeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReloadBalanceDBProxyNodeRequest(ReloadBalanceDBProxyNodeRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.ProxyGroupId != null) {
            this.ProxyGroupId = new String(source.ProxyGroupId);
        }
        if (source.AddressId != null) {
            this.AddressId = new String(source.AddressId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "ProxyGroupId", this.ProxyGroupId);
        this.setParamSimple(map, prefix + "AddressId", this.AddressId);

    }
}

