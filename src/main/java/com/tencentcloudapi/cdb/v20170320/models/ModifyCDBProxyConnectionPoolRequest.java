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

public class ModifyCDBProxyConnectionPoolRequest extends AbstractModel{

    /**
    * 数据库代理ID
    */
    @SerializedName("ProxyGroupId")
    @Expose
    private String ProxyGroupId;

    /**
    * 是否开启连接池，true：开启连接池；
                             false：关闭连接池。
    */
    @SerializedName("OpenConnectionPool")
    @Expose
    private Boolean OpenConnectionPool;

    /**
    * 连接池类型，
通过DescribeProxyConnectionPoolConf获取连接池类型值
    */
    @SerializedName("ConnectionPoolType")
    @Expose
    private String ConnectionPoolType;

    /**
    * 连接保留阈值：单位（秒）
    */
    @SerializedName("PoolConnectionTimeOut")
    @Expose
    private Long PoolConnectionTimeOut;

    /**
     * Get 数据库代理ID 
     * @return ProxyGroupId 数据库代理ID
     */
    public String getProxyGroupId() {
        return this.ProxyGroupId;
    }

    /**
     * Set 数据库代理ID
     * @param ProxyGroupId 数据库代理ID
     */
    public void setProxyGroupId(String ProxyGroupId) {
        this.ProxyGroupId = ProxyGroupId;
    }

    /**
     * Get 是否开启连接池，true：开启连接池；
                             false：关闭连接池。 
     * @return OpenConnectionPool 是否开启连接池，true：开启连接池；
                             false：关闭连接池。
     */
    public Boolean getOpenConnectionPool() {
        return this.OpenConnectionPool;
    }

    /**
     * Set 是否开启连接池，true：开启连接池；
                             false：关闭连接池。
     * @param OpenConnectionPool 是否开启连接池，true：开启连接池；
                             false：关闭连接池。
     */
    public void setOpenConnectionPool(Boolean OpenConnectionPool) {
        this.OpenConnectionPool = OpenConnectionPool;
    }

    /**
     * Get 连接池类型，
通过DescribeProxyConnectionPoolConf获取连接池类型值 
     * @return ConnectionPoolType 连接池类型，
通过DescribeProxyConnectionPoolConf获取连接池类型值
     */
    public String getConnectionPoolType() {
        return this.ConnectionPoolType;
    }

    /**
     * Set 连接池类型，
通过DescribeProxyConnectionPoolConf获取连接池类型值
     * @param ConnectionPoolType 连接池类型，
通过DescribeProxyConnectionPoolConf获取连接池类型值
     */
    public void setConnectionPoolType(String ConnectionPoolType) {
        this.ConnectionPoolType = ConnectionPoolType;
    }

    /**
     * Get 连接保留阈值：单位（秒） 
     * @return PoolConnectionTimeOut 连接保留阈值：单位（秒）
     */
    public Long getPoolConnectionTimeOut() {
        return this.PoolConnectionTimeOut;
    }

    /**
     * Set 连接保留阈值：单位（秒）
     * @param PoolConnectionTimeOut 连接保留阈值：单位（秒）
     */
    public void setPoolConnectionTimeOut(Long PoolConnectionTimeOut) {
        this.PoolConnectionTimeOut = PoolConnectionTimeOut;
    }

    public ModifyCDBProxyConnectionPoolRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCDBProxyConnectionPoolRequest(ModifyCDBProxyConnectionPoolRequest source) {
        if (source.ProxyGroupId != null) {
            this.ProxyGroupId = new String(source.ProxyGroupId);
        }
        if (source.OpenConnectionPool != null) {
            this.OpenConnectionPool = new Boolean(source.OpenConnectionPool);
        }
        if (source.ConnectionPoolType != null) {
            this.ConnectionPoolType = new String(source.ConnectionPoolType);
        }
        if (source.PoolConnectionTimeOut != null) {
            this.PoolConnectionTimeOut = new Long(source.PoolConnectionTimeOut);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProxyGroupId", this.ProxyGroupId);
        this.setParamSimple(map, prefix + "OpenConnectionPool", this.OpenConnectionPool);
        this.setParamSimple(map, prefix + "ConnectionPoolType", this.ConnectionPoolType);
        this.setParamSimple(map, prefix + "PoolConnectionTimeOut", this.PoolConnectionTimeOut);

    }
}

