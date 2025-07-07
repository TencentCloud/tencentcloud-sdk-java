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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EngineRegionInfo extends AbstractModel {

    /**
    * 引擎节点所在地域
    */
    @SerializedName("EngineRegion")
    @Expose
    private String EngineRegion;

    /**
    * 此地域节点分配数量
    */
    @SerializedName("Replica")
    @Expose
    private Long Replica;

    /**
    * 集群网络信息
    */
    @SerializedName("VpcInfos")
    @Expose
    private VpcInfo [] VpcInfos;

    /**
    * Polaris: 是否为主地域
Zookeeper: 是否为Leader固定地域
    */
    @SerializedName("MainRegion")
    @Expose
    private Boolean MainRegion;

    /**
    * 引擎规格ID
    */
    @SerializedName("SpecId")
    @Expose
    private String SpecId;

    /**
     * Get 引擎节点所在地域 
     * @return EngineRegion 引擎节点所在地域
     */
    public String getEngineRegion() {
        return this.EngineRegion;
    }

    /**
     * Set 引擎节点所在地域
     * @param EngineRegion 引擎节点所在地域
     */
    public void setEngineRegion(String EngineRegion) {
        this.EngineRegion = EngineRegion;
    }

    /**
     * Get 此地域节点分配数量 
     * @return Replica 此地域节点分配数量
     */
    public Long getReplica() {
        return this.Replica;
    }

    /**
     * Set 此地域节点分配数量
     * @param Replica 此地域节点分配数量
     */
    public void setReplica(Long Replica) {
        this.Replica = Replica;
    }

    /**
     * Get 集群网络信息 
     * @return VpcInfos 集群网络信息
     */
    public VpcInfo [] getVpcInfos() {
        return this.VpcInfos;
    }

    /**
     * Set 集群网络信息
     * @param VpcInfos 集群网络信息
     */
    public void setVpcInfos(VpcInfo [] VpcInfos) {
        this.VpcInfos = VpcInfos;
    }

    /**
     * Get Polaris: 是否为主地域
Zookeeper: 是否为Leader固定地域 
     * @return MainRegion Polaris: 是否为主地域
Zookeeper: 是否为Leader固定地域
     */
    public Boolean getMainRegion() {
        return this.MainRegion;
    }

    /**
     * Set Polaris: 是否为主地域
Zookeeper: 是否为Leader固定地域
     * @param MainRegion Polaris: 是否为主地域
Zookeeper: 是否为Leader固定地域
     */
    public void setMainRegion(Boolean MainRegion) {
        this.MainRegion = MainRegion;
    }

    /**
     * Get 引擎规格ID 
     * @return SpecId 引擎规格ID
     */
    public String getSpecId() {
        return this.SpecId;
    }

    /**
     * Set 引擎规格ID
     * @param SpecId 引擎规格ID
     */
    public void setSpecId(String SpecId) {
        this.SpecId = SpecId;
    }

    public EngineRegionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EngineRegionInfo(EngineRegionInfo source) {
        if (source.EngineRegion != null) {
            this.EngineRegion = new String(source.EngineRegion);
        }
        if (source.Replica != null) {
            this.Replica = new Long(source.Replica);
        }
        if (source.VpcInfos != null) {
            this.VpcInfos = new VpcInfo[source.VpcInfos.length];
            for (int i = 0; i < source.VpcInfos.length; i++) {
                this.VpcInfos[i] = new VpcInfo(source.VpcInfos[i]);
            }
        }
        if (source.MainRegion != null) {
            this.MainRegion = new Boolean(source.MainRegion);
        }
        if (source.SpecId != null) {
            this.SpecId = new String(source.SpecId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EngineRegion", this.EngineRegion);
        this.setParamSimple(map, prefix + "Replica", this.Replica);
        this.setParamArrayObj(map, prefix + "VpcInfos.", this.VpcInfos);
        this.setParamSimple(map, prefix + "MainRegion", this.MainRegion);
        this.setParamSimple(map, prefix + "SpecId", this.SpecId);

    }
}

