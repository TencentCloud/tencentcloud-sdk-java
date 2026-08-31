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

public class CloseDBProxyAddressRequest extends AbstractModel {

    /**
    * <p>实例 ID，指定要关闭代理地址的目标实例</p>
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * <p>代理地址 ID，指定要关闭（删除）的代理地址</p>
    */
    @SerializedName("AddressId")
    @Expose
    private String AddressId;

    /**
    * <p>代理组 ID。不传则按实例自动查找其默认代理组</p>
    */
    @SerializedName("ProxyGroupId")
    @Expose
    private String ProxyGroupId;

    /**
     * Get <p>实例 ID，指定要关闭代理地址的目标实例</p> 
     * @return DBInstanceId <p>实例 ID，指定要关闭代理地址的目标实例</p>
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set <p>实例 ID，指定要关闭代理地址的目标实例</p>
     * @param DBInstanceId <p>实例 ID，指定要关闭代理地址的目标实例</p>
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get <p>代理地址 ID，指定要关闭（删除）的代理地址</p> 
     * @return AddressId <p>代理地址 ID，指定要关闭（删除）的代理地址</p>
     */
    public String getAddressId() {
        return this.AddressId;
    }

    /**
     * Set <p>代理地址 ID，指定要关闭（删除）的代理地址</p>
     * @param AddressId <p>代理地址 ID，指定要关闭（删除）的代理地址</p>
     */
    public void setAddressId(String AddressId) {
        this.AddressId = AddressId;
    }

    /**
     * Get <p>代理组 ID。不传则按实例自动查找其默认代理组</p> 
     * @return ProxyGroupId <p>代理组 ID。不传则按实例自动查找其默认代理组</p>
     */
    public String getProxyGroupId() {
        return this.ProxyGroupId;
    }

    /**
     * Set <p>代理组 ID。不传则按实例自动查找其默认代理组</p>
     * @param ProxyGroupId <p>代理组 ID。不传则按实例自动查找其默认代理组</p>
     */
    public void setProxyGroupId(String ProxyGroupId) {
        this.ProxyGroupId = ProxyGroupId;
    }

    public CloseDBProxyAddressRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloseDBProxyAddressRequest(CloseDBProxyAddressRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.AddressId != null) {
            this.AddressId = new String(source.AddressId);
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
        this.setParamSimple(map, prefix + "AddressId", this.AddressId);
        this.setParamSimple(map, prefix + "ProxyGroupId", this.ProxyGroupId);

    }
}

