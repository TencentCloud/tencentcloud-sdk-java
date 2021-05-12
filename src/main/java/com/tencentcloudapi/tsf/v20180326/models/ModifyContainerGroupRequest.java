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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyContainerGroupRequest extends AbstractModel{

    /**
    * 部署组ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 0:公网 1:集群内访问 2：NodePort
    */
    @SerializedName("AccessType")
    @Expose
    private Long AccessType;

    /**
    * ProtocolPorts数组
    */
    @SerializedName("ProtocolPorts")
    @Expose
    private ProtocolPort [] ProtocolPorts;

    /**
    * 更新方式：0:快速更新 1:滚动更新
    */
    @SerializedName("UpdateType")
    @Expose
    private Long UpdateType;

    /**
    * 更新间隔,单位秒
    */
    @SerializedName("UpdateIvl")
    @Expose
    private Long UpdateIvl;

    /**
    * 子网ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 部署组备注
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
     * Get 部署组ID 
     * @return GroupId 部署组ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 部署组ID
     * @param GroupId 部署组ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 0:公网 1:集群内访问 2：NodePort 
     * @return AccessType 0:公网 1:集群内访问 2：NodePort
     */
    public Long getAccessType() {
        return this.AccessType;
    }

    /**
     * Set 0:公网 1:集群内访问 2：NodePort
     * @param AccessType 0:公网 1:集群内访问 2：NodePort
     */
    public void setAccessType(Long AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get ProtocolPorts数组 
     * @return ProtocolPorts ProtocolPorts数组
     */
    public ProtocolPort [] getProtocolPorts() {
        return this.ProtocolPorts;
    }

    /**
     * Set ProtocolPorts数组
     * @param ProtocolPorts ProtocolPorts数组
     */
    public void setProtocolPorts(ProtocolPort [] ProtocolPorts) {
        this.ProtocolPorts = ProtocolPorts;
    }

    /**
     * Get 更新方式：0:快速更新 1:滚动更新 
     * @return UpdateType 更新方式：0:快速更新 1:滚动更新
     */
    public Long getUpdateType() {
        return this.UpdateType;
    }

    /**
     * Set 更新方式：0:快速更新 1:滚动更新
     * @param UpdateType 更新方式：0:快速更新 1:滚动更新
     */
    public void setUpdateType(Long UpdateType) {
        this.UpdateType = UpdateType;
    }

    /**
     * Get 更新间隔,单位秒 
     * @return UpdateIvl 更新间隔,单位秒
     */
    public Long getUpdateIvl() {
        return this.UpdateIvl;
    }

    /**
     * Set 更新间隔,单位秒
     * @param UpdateIvl 更新间隔,单位秒
     */
    public void setUpdateIvl(Long UpdateIvl) {
        this.UpdateIvl = UpdateIvl;
    }

    /**
     * Get 子网ID 
     * @return SubnetId 子网ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网ID
     * @param SubnetId 子网ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 部署组备注 
     * @return Alias 部署组备注
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 部署组备注
     * @param Alias 部署组备注
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    public ModifyContainerGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyContainerGroupRequest(ModifyContainerGroupRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.AccessType != null) {
            this.AccessType = new Long(source.AccessType);
        }
        if (source.ProtocolPorts != null) {
            this.ProtocolPorts = new ProtocolPort[source.ProtocolPorts.length];
            for (int i = 0; i < source.ProtocolPorts.length; i++) {
                this.ProtocolPorts[i] = new ProtocolPort(source.ProtocolPorts[i]);
            }
        }
        if (source.UpdateType != null) {
            this.UpdateType = new Long(source.UpdateType);
        }
        if (source.UpdateIvl != null) {
            this.UpdateIvl = new Long(source.UpdateIvl);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);
        this.setParamArrayObj(map, prefix + "ProtocolPorts.", this.ProtocolPorts);
        this.setParamSimple(map, prefix + "UpdateType", this.UpdateType);
        this.setParamSimple(map, prefix + "UpdateIvl", this.UpdateIvl);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Alias", this.Alias);

    }
}

