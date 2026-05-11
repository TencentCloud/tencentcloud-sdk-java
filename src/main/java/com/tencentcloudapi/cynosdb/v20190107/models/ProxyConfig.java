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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProxyConfig extends AbstractModel {

    /**
    * <p>数据库代理组节点个数。该参数不再建议使用,建议使用ProxyZones</p>
    */
    @SerializedName("ProxyCount")
    @Expose
    private Long ProxyCount;

    /**
    * <p>cpu核数</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>内存</p>
    */
    @SerializedName("Mem")
    @Expose
    private Long Mem;

    /**
    * <p>连接池类型:SessionConnectionPool(会话级别连接池 )</p>
    */
    @SerializedName("ConnectionPoolType")
    @Expose
    private String ConnectionPoolType;

    /**
    * <p>是否开启连接池,yes-开启，no-不开启</p>
    */
    @SerializedName("OpenConnectionPool")
    @Expose
    private String OpenConnectionPool;

    /**
    * <p>连接池阈值:单位（秒）</p>
    */
    @SerializedName("ConnectionPoolTimeOut")
    @Expose
    private Long ConnectionPoolTimeOut;

    /**
    * <p>描述说明</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>数据库节点信息（该参数与ProxyCount需要任选一个输入）</p>
    */
    @SerializedName("ProxyZones")
    @Expose
    private ProxyZone [] ProxyZones;

    /**
     * Get <p>数据库代理组节点个数。该参数不再建议使用,建议使用ProxyZones</p> 
     * @return ProxyCount <p>数据库代理组节点个数。该参数不再建议使用,建议使用ProxyZones</p>
     * @deprecated
     */
    @Deprecated
    public Long getProxyCount() {
        return this.ProxyCount;
    }

    /**
     * Set <p>数据库代理组节点个数。该参数不再建议使用,建议使用ProxyZones</p>
     * @param ProxyCount <p>数据库代理组节点个数。该参数不再建议使用,建议使用ProxyZones</p>
     * @deprecated
     */
    @Deprecated
    public void setProxyCount(Long ProxyCount) {
        this.ProxyCount = ProxyCount;
    }

    /**
     * Get <p>cpu核数</p> 
     * @return Cpu <p>cpu核数</p>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>cpu核数</p>
     * @param Cpu <p>cpu核数</p>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>内存</p> 
     * @return Mem <p>内存</p>
     */
    public Long getMem() {
        return this.Mem;
    }

    /**
     * Set <p>内存</p>
     * @param Mem <p>内存</p>
     */
    public void setMem(Long Mem) {
        this.Mem = Mem;
    }

    /**
     * Get <p>连接池类型:SessionConnectionPool(会话级别连接池 )</p> 
     * @return ConnectionPoolType <p>连接池类型:SessionConnectionPool(会话级别连接池 )</p>
     */
    public String getConnectionPoolType() {
        return this.ConnectionPoolType;
    }

    /**
     * Set <p>连接池类型:SessionConnectionPool(会话级别连接池 )</p>
     * @param ConnectionPoolType <p>连接池类型:SessionConnectionPool(会话级别连接池 )</p>
     */
    public void setConnectionPoolType(String ConnectionPoolType) {
        this.ConnectionPoolType = ConnectionPoolType;
    }

    /**
     * Get <p>是否开启连接池,yes-开启，no-不开启</p> 
     * @return OpenConnectionPool <p>是否开启连接池,yes-开启，no-不开启</p>
     */
    public String getOpenConnectionPool() {
        return this.OpenConnectionPool;
    }

    /**
     * Set <p>是否开启连接池,yes-开启，no-不开启</p>
     * @param OpenConnectionPool <p>是否开启连接池,yes-开启，no-不开启</p>
     */
    public void setOpenConnectionPool(String OpenConnectionPool) {
        this.OpenConnectionPool = OpenConnectionPool;
    }

    /**
     * Get <p>连接池阈值:单位（秒）</p> 
     * @return ConnectionPoolTimeOut <p>连接池阈值:单位（秒）</p>
     */
    public Long getConnectionPoolTimeOut() {
        return this.ConnectionPoolTimeOut;
    }

    /**
     * Set <p>连接池阈值:单位（秒）</p>
     * @param ConnectionPoolTimeOut <p>连接池阈值:单位（秒）</p>
     */
    public void setConnectionPoolTimeOut(Long ConnectionPoolTimeOut) {
        this.ConnectionPoolTimeOut = ConnectionPoolTimeOut;
    }

    /**
     * Get <p>描述说明</p> 
     * @return Description <p>描述说明</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述说明</p>
     * @param Description <p>描述说明</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>数据库节点信息（该参数与ProxyCount需要任选一个输入）</p> 
     * @return ProxyZones <p>数据库节点信息（该参数与ProxyCount需要任选一个输入）</p>
     */
    public ProxyZone [] getProxyZones() {
        return this.ProxyZones;
    }

    /**
     * Set <p>数据库节点信息（该参数与ProxyCount需要任选一个输入）</p>
     * @param ProxyZones <p>数据库节点信息（该参数与ProxyCount需要任选一个输入）</p>
     */
    public void setProxyZones(ProxyZone [] ProxyZones) {
        this.ProxyZones = ProxyZones;
    }

    public ProxyConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProxyConfig(ProxyConfig source) {
        if (source.ProxyCount != null) {
            this.ProxyCount = new Long(source.ProxyCount);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Mem != null) {
            this.Mem = new Long(source.Mem);
        }
        if (source.ConnectionPoolType != null) {
            this.ConnectionPoolType = new String(source.ConnectionPoolType);
        }
        if (source.OpenConnectionPool != null) {
            this.OpenConnectionPool = new String(source.OpenConnectionPool);
        }
        if (source.ConnectionPoolTimeOut != null) {
            this.ConnectionPoolTimeOut = new Long(source.ConnectionPoolTimeOut);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ProxyZones != null) {
            this.ProxyZones = new ProxyZone[source.ProxyZones.length];
            for (int i = 0; i < source.ProxyZones.length; i++) {
                this.ProxyZones[i] = new ProxyZone(source.ProxyZones[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProxyCount", this.ProxyCount);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Mem", this.Mem);
        this.setParamSimple(map, prefix + "ConnectionPoolType", this.ConnectionPoolType);
        this.setParamSimple(map, prefix + "OpenConnectionPool", this.OpenConnectionPool);
        this.setParamSimple(map, prefix + "ConnectionPoolTimeOut", this.ConnectionPoolTimeOut);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "ProxyZones.", this.ProxyZones);

    }
}

