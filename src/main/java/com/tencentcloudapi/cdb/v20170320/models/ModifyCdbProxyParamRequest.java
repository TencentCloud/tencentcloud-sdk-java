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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCdbProxyParamRequest extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 代理组ID
    */
    @SerializedName("ProxyGroupId")
    @Expose
    private String ProxyGroupId;

    /**
    * 连接池阈值
    */
    @SerializedName("ConnectionPoolLimit")
    @Expose
    private Long ConnectionPoolLimit;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 代理组ID 
     * @return ProxyGroupId 代理组ID
     */
    public String getProxyGroupId() {
        return this.ProxyGroupId;
    }

    /**
     * Set 代理组ID
     * @param ProxyGroupId 代理组ID
     */
    public void setProxyGroupId(String ProxyGroupId) {
        this.ProxyGroupId = ProxyGroupId;
    }

    /**
     * Get 连接池阈值 
     * @return ConnectionPoolLimit 连接池阈值
     */
    public Long getConnectionPoolLimit() {
        return this.ConnectionPoolLimit;
    }

    /**
     * Set 连接池阈值
     * @param ConnectionPoolLimit 连接池阈值
     */
    public void setConnectionPoolLimit(Long ConnectionPoolLimit) {
        this.ConnectionPoolLimit = ConnectionPoolLimit;
    }

    public ModifyCdbProxyParamRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCdbProxyParamRequest(ModifyCdbProxyParamRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ProxyGroupId != null) {
            this.ProxyGroupId = new String(source.ProxyGroupId);
        }
        if (source.ConnectionPoolLimit != null) {
            this.ConnectionPoolLimit = new Long(source.ConnectionPoolLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ProxyGroupId", this.ProxyGroupId);
        this.setParamSimple(map, prefix + "ConnectionPoolLimit", this.ConnectionPoolLimit);

    }
}

