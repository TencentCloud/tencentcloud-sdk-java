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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LockMetaDataRequest extends AbstractModel{

    /**
    * 加锁内容
    */
    @SerializedName("LockComponentList")
    @Expose
    private LockComponentInfo [] LockComponentList;

    /**
    * 数据源名称
    */
    @SerializedName("DatasourceConnectionName")
    @Expose
    private String DatasourceConnectionName;

    /**
    * 事务id
    */
    @SerializedName("TxnId")
    @Expose
    private Long TxnId;

    /**
    * 客户端信息
    */
    @SerializedName("AgentInfo")
    @Expose
    private String AgentInfo;

    /**
    * 主机名
    */
    @SerializedName("Hostname")
    @Expose
    private String Hostname;

    /**
     * Get 加锁内容 
     * @return LockComponentList 加锁内容
     */
    public LockComponentInfo [] getLockComponentList() {
        return this.LockComponentList;
    }

    /**
     * Set 加锁内容
     * @param LockComponentList 加锁内容
     */
    public void setLockComponentList(LockComponentInfo [] LockComponentList) {
        this.LockComponentList = LockComponentList;
    }

    /**
     * Get 数据源名称 
     * @return DatasourceConnectionName 数据源名称
     */
    public String getDatasourceConnectionName() {
        return this.DatasourceConnectionName;
    }

    /**
     * Set 数据源名称
     * @param DatasourceConnectionName 数据源名称
     */
    public void setDatasourceConnectionName(String DatasourceConnectionName) {
        this.DatasourceConnectionName = DatasourceConnectionName;
    }

    /**
     * Get 事务id 
     * @return TxnId 事务id
     */
    public Long getTxnId() {
        return this.TxnId;
    }

    /**
     * Set 事务id
     * @param TxnId 事务id
     */
    public void setTxnId(Long TxnId) {
        this.TxnId = TxnId;
    }

    /**
     * Get 客户端信息 
     * @return AgentInfo 客户端信息
     */
    public String getAgentInfo() {
        return this.AgentInfo;
    }

    /**
     * Set 客户端信息
     * @param AgentInfo 客户端信息
     */
    public void setAgentInfo(String AgentInfo) {
        this.AgentInfo = AgentInfo;
    }

    /**
     * Get 主机名 
     * @return Hostname 主机名
     */
    public String getHostname() {
        return this.Hostname;
    }

    /**
     * Set 主机名
     * @param Hostname 主机名
     */
    public void setHostname(String Hostname) {
        this.Hostname = Hostname;
    }

    public LockMetaDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LockMetaDataRequest(LockMetaDataRequest source) {
        if (source.LockComponentList != null) {
            this.LockComponentList = new LockComponentInfo[source.LockComponentList.length];
            for (int i = 0; i < source.LockComponentList.length; i++) {
                this.LockComponentList[i] = new LockComponentInfo(source.LockComponentList[i]);
            }
        }
        if (source.DatasourceConnectionName != null) {
            this.DatasourceConnectionName = new String(source.DatasourceConnectionName);
        }
        if (source.TxnId != null) {
            this.TxnId = new Long(source.TxnId);
        }
        if (source.AgentInfo != null) {
            this.AgentInfo = new String(source.AgentInfo);
        }
        if (source.Hostname != null) {
            this.Hostname = new String(source.Hostname);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "LockComponentList.", this.LockComponentList);
        this.setParamSimple(map, prefix + "DatasourceConnectionName", this.DatasourceConnectionName);
        this.setParamSimple(map, prefix + "TxnId", this.TxnId);
        this.setParamSimple(map, prefix + "AgentInfo", this.AgentInfo);
        this.setParamSimple(map, prefix + "Hostname", this.Hostname);

    }
}

