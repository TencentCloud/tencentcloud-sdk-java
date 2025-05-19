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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProxyConfig extends AbstractModel {

    /**
    * 数据库代理组节点个数（该参数不再建议使用，建议使用ProxyZones)
    */
    @SerializedName("ProxyCount")
    @Expose
    private Long ProxyCount;

    /**
    * cpu核数
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 内存
    */
    @SerializedName("Mem")
    @Expose
    private Long Mem;

    /**
    * 连接池类型：SessionConnectionPool(会话级别连接池 )
    */
    @SerializedName("ConnectionPoolType")
    @Expose
    private String ConnectionPoolType;

    /**
    * 是否开启连接池,yes-开启，no-不开启
    */
    @SerializedName("OpenConnectionPool")
    @Expose
    private String OpenConnectionPool;

    /**
    * 连接池阈值：单位（秒）
    */
    @SerializedName("ConnectionPoolTimeOut")
    @Expose
    private Long ConnectionPoolTimeOut;

    /**
    * 描述说明
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 数据库节点信息（该参数与ProxyCount需要任选一个输入）
    */
    @SerializedName("ProxyZones")
    @Expose
    private ProxyZone [] ProxyZones;

    /**
     * Get 数据库代理组节点个数（该参数不再建议使用，建议使用ProxyZones) 
     * @return ProxyCount 数据库代理组节点个数（该参数不再建议使用，建议使用ProxyZones)
     */
    public Long getProxyCount() {
        return this.ProxyCount;
    }

    /**
     * Set 数据库代理组节点个数（该参数不再建议使用，建议使用ProxyZones)
     * @param ProxyCount 数据库代理组节点个数（该参数不再建议使用，建议使用ProxyZones)
     */
    public void setProxyCount(Long ProxyCount) {
        this.ProxyCount = ProxyCount;
    }

    /**
     * Get cpu核数 
     * @return Cpu cpu核数
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set cpu核数
     * @param Cpu cpu核数
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 内存 
     * @return Mem 内存
     */
    public Long getMem() {
        return this.Mem;
    }

    /**
     * Set 内存
     * @param Mem 内存
     */
    public void setMem(Long Mem) {
        this.Mem = Mem;
    }

    /**
     * Get 连接池类型：SessionConnectionPool(会话级别连接池 ) 
     * @return ConnectionPoolType 连接池类型：SessionConnectionPool(会话级别连接池 )
     */
    public String getConnectionPoolType() {
        return this.ConnectionPoolType;
    }

    /**
     * Set 连接池类型：SessionConnectionPool(会话级别连接池 )
     * @param ConnectionPoolType 连接池类型：SessionConnectionPool(会话级别连接池 )
     */
    public void setConnectionPoolType(String ConnectionPoolType) {
        this.ConnectionPoolType = ConnectionPoolType;
    }

    /**
     * Get 是否开启连接池,yes-开启，no-不开启 
     * @return OpenConnectionPool 是否开启连接池,yes-开启，no-不开启
     */
    public String getOpenConnectionPool() {
        return this.OpenConnectionPool;
    }

    /**
     * Set 是否开启连接池,yes-开启，no-不开启
     * @param OpenConnectionPool 是否开启连接池,yes-开启，no-不开启
     */
    public void setOpenConnectionPool(String OpenConnectionPool) {
        this.OpenConnectionPool = OpenConnectionPool;
    }

    /**
     * Get 连接池阈值：单位（秒） 
     * @return ConnectionPoolTimeOut 连接池阈值：单位（秒）
     */
    public Long getConnectionPoolTimeOut() {
        return this.ConnectionPoolTimeOut;
    }

    /**
     * Set 连接池阈值：单位（秒）
     * @param ConnectionPoolTimeOut 连接池阈值：单位（秒）
     */
    public void setConnectionPoolTimeOut(Long ConnectionPoolTimeOut) {
        this.ConnectionPoolTimeOut = ConnectionPoolTimeOut;
    }

    /**
     * Get 描述说明 
     * @return Description 描述说明
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述说明
     * @param Description 描述说明
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 数据库节点信息（该参数与ProxyCount需要任选一个输入） 
     * @return ProxyZones 数据库节点信息（该参数与ProxyCount需要任选一个输入）
     */
    public ProxyZone [] getProxyZones() {
        return this.ProxyZones;
    }

    /**
     * Set 数据库节点信息（该参数与ProxyCount需要任选一个输入）
     * @param ProxyZones 数据库节点信息（该参数与ProxyCount需要任选一个输入）
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

