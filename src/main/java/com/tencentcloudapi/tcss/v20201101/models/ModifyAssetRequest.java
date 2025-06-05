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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAssetRequest extends AbstractModel {

    /**
    * 同步全部普通节点
    */
    @SerializedName("All")
    @Expose
    private Boolean All;

    /**
    * 要同步的主机列表uuid 
    */
    @SerializedName("Hosts")
    @Expose
    private String [] Hosts;

    /**
    * 同步全部超级节点
    */
    @SerializedName("AllSuperHost")
    @Expose
    private Boolean AllSuperHost;

    /**
    * 要同步的超级节点唯一id
    */
    @SerializedName("NodeUniqueIds")
    @Expose
    private String [] NodeUniqueIds;

    /**
    * 超时时间(秒) 最低3600s
    */
    @SerializedName("TimeoutSec")
    @Expose
    private Long TimeoutSec;

    /**
     * Get 同步全部普通节点 
     * @return All 同步全部普通节点
     */
    public Boolean getAll() {
        return this.All;
    }

    /**
     * Set 同步全部普通节点
     * @param All 同步全部普通节点
     */
    public void setAll(Boolean All) {
        this.All = All;
    }

    /**
     * Get 要同步的主机列表uuid  
     * @return Hosts 要同步的主机列表uuid 
     */
    public String [] getHosts() {
        return this.Hosts;
    }

    /**
     * Set 要同步的主机列表uuid 
     * @param Hosts 要同步的主机列表uuid 
     */
    public void setHosts(String [] Hosts) {
        this.Hosts = Hosts;
    }

    /**
     * Get 同步全部超级节点 
     * @return AllSuperHost 同步全部超级节点
     */
    public Boolean getAllSuperHost() {
        return this.AllSuperHost;
    }

    /**
     * Set 同步全部超级节点
     * @param AllSuperHost 同步全部超级节点
     */
    public void setAllSuperHost(Boolean AllSuperHost) {
        this.AllSuperHost = AllSuperHost;
    }

    /**
     * Get 要同步的超级节点唯一id 
     * @return NodeUniqueIds 要同步的超级节点唯一id
     */
    public String [] getNodeUniqueIds() {
        return this.NodeUniqueIds;
    }

    /**
     * Set 要同步的超级节点唯一id
     * @param NodeUniqueIds 要同步的超级节点唯一id
     */
    public void setNodeUniqueIds(String [] NodeUniqueIds) {
        this.NodeUniqueIds = NodeUniqueIds;
    }

    /**
     * Get 超时时间(秒) 最低3600s 
     * @return TimeoutSec 超时时间(秒) 最低3600s
     */
    public Long getTimeoutSec() {
        return this.TimeoutSec;
    }

    /**
     * Set 超时时间(秒) 最低3600s
     * @param TimeoutSec 超时时间(秒) 最低3600s
     */
    public void setTimeoutSec(Long TimeoutSec) {
        this.TimeoutSec = TimeoutSec;
    }

    public ModifyAssetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAssetRequest(ModifyAssetRequest source) {
        if (source.All != null) {
            this.All = new Boolean(source.All);
        }
        if (source.Hosts != null) {
            this.Hosts = new String[source.Hosts.length];
            for (int i = 0; i < source.Hosts.length; i++) {
                this.Hosts[i] = new String(source.Hosts[i]);
            }
        }
        if (source.AllSuperHost != null) {
            this.AllSuperHost = new Boolean(source.AllSuperHost);
        }
        if (source.NodeUniqueIds != null) {
            this.NodeUniqueIds = new String[source.NodeUniqueIds.length];
            for (int i = 0; i < source.NodeUniqueIds.length; i++) {
                this.NodeUniqueIds[i] = new String(source.NodeUniqueIds[i]);
            }
        }
        if (source.TimeoutSec != null) {
            this.TimeoutSec = new Long(source.TimeoutSec);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "All", this.All);
        this.setParamArraySimple(map, prefix + "Hosts.", this.Hosts);
        this.setParamSimple(map, prefix + "AllSuperHost", this.AllSuperHost);
        this.setParamArraySimple(map, prefix + "NodeUniqueIds.", this.NodeUniqueIds);
        this.setParamSimple(map, prefix + "TimeoutSec", this.TimeoutSec);

    }
}

