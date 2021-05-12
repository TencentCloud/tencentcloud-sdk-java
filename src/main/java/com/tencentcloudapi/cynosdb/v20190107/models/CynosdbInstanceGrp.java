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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CynosdbInstanceGrp extends AbstractModel{

    /**
    * appId
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 创建时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 删除时间
    */
    @SerializedName("DeletedTime")
    @Expose
    private String DeletedTime;

    /**
    * 实例组ID
    */
    @SerializedName("InstanceGrpId")
    @Expose
    private String InstanceGrpId;

    /**
    * 状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 实例组类型。ha-ha组；ro-只读组
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 更新时间
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
    * 内网IP
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 内网端口
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * 外网域名
    */
    @SerializedName("WanDomain")
    @Expose
    private String WanDomain;

    /**
    * 外网ip
    */
    @SerializedName("WanIP")
    @Expose
    private String WanIP;

    /**
    * 外网端口
    */
    @SerializedName("WanPort")
    @Expose
    private Long WanPort;

    /**
    * 外网状态
    */
    @SerializedName("WanStatus")
    @Expose
    private String WanStatus;

    /**
    * 实例组包含实例信息
    */
    @SerializedName("InstanceSet")
    @Expose
    private CynosdbInstance [] InstanceSet;

    /**
     * Get appId 
     * @return AppId appId
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set appId
     * @param AppId appId
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 创建时间 
     * @return CreatedTime 创建时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间
     * @param CreatedTime 创建时间
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 删除时间 
     * @return DeletedTime 删除时间
     */
    public String getDeletedTime() {
        return this.DeletedTime;
    }

    /**
     * Set 删除时间
     * @param DeletedTime 删除时间
     */
    public void setDeletedTime(String DeletedTime) {
        this.DeletedTime = DeletedTime;
    }

    /**
     * Get 实例组ID 
     * @return InstanceGrpId 实例组ID
     */
    public String getInstanceGrpId() {
        return this.InstanceGrpId;
    }

    /**
     * Set 实例组ID
     * @param InstanceGrpId 实例组ID
     */
    public void setInstanceGrpId(String InstanceGrpId) {
        this.InstanceGrpId = InstanceGrpId;
    }

    /**
     * Get 状态 
     * @return Status 状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
     * @param Status 状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 实例组类型。ha-ha组；ro-只读组 
     * @return Type 实例组类型。ha-ha组；ro-只读组
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 实例组类型。ha-ha组；ro-只读组
     * @param Type 实例组类型。ha-ha组；ro-只读组
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 更新时间 
     * @return UpdatedTime 更新时间
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set 更新时间
     * @param UpdatedTime 更新时间
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    /**
     * Get 内网IP 
     * @return Vip 内网IP
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 内网IP
     * @param Vip 内网IP
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 内网端口 
     * @return Vport 内网端口
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set 内网端口
     * @param Vport 内网端口
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get 外网域名 
     * @return WanDomain 外网域名
     */
    public String getWanDomain() {
        return this.WanDomain;
    }

    /**
     * Set 外网域名
     * @param WanDomain 外网域名
     */
    public void setWanDomain(String WanDomain) {
        this.WanDomain = WanDomain;
    }

    /**
     * Get 外网ip 
     * @return WanIP 外网ip
     */
    public String getWanIP() {
        return this.WanIP;
    }

    /**
     * Set 外网ip
     * @param WanIP 外网ip
     */
    public void setWanIP(String WanIP) {
        this.WanIP = WanIP;
    }

    /**
     * Get 外网端口 
     * @return WanPort 外网端口
     */
    public Long getWanPort() {
        return this.WanPort;
    }

    /**
     * Set 外网端口
     * @param WanPort 外网端口
     */
    public void setWanPort(Long WanPort) {
        this.WanPort = WanPort;
    }

    /**
     * Get 外网状态 
     * @return WanStatus 外网状态
     */
    public String getWanStatus() {
        return this.WanStatus;
    }

    /**
     * Set 外网状态
     * @param WanStatus 外网状态
     */
    public void setWanStatus(String WanStatus) {
        this.WanStatus = WanStatus;
    }

    /**
     * Get 实例组包含实例信息 
     * @return InstanceSet 实例组包含实例信息
     */
    public CynosdbInstance [] getInstanceSet() {
        return this.InstanceSet;
    }

    /**
     * Set 实例组包含实例信息
     * @param InstanceSet 实例组包含实例信息
     */
    public void setInstanceSet(CynosdbInstance [] InstanceSet) {
        this.InstanceSet = InstanceSet;
    }

    public CynosdbInstanceGrp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CynosdbInstanceGrp(CynosdbInstanceGrp source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.DeletedTime != null) {
            this.DeletedTime = new String(source.DeletedTime);
        }
        if (source.InstanceGrpId != null) {
            this.InstanceGrpId = new String(source.InstanceGrpId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.UpdatedTime != null) {
            this.UpdatedTime = new String(source.UpdatedTime);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.WanDomain != null) {
            this.WanDomain = new String(source.WanDomain);
        }
        if (source.WanIP != null) {
            this.WanIP = new String(source.WanIP);
        }
        if (source.WanPort != null) {
            this.WanPort = new Long(source.WanPort);
        }
        if (source.WanStatus != null) {
            this.WanStatus = new String(source.WanStatus);
        }
        if (source.InstanceSet != null) {
            this.InstanceSet = new CynosdbInstance[source.InstanceSet.length];
            for (int i = 0; i < source.InstanceSet.length; i++) {
                this.InstanceSet[i] = new CynosdbInstance(source.InstanceSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "DeletedTime", this.DeletedTime);
        this.setParamSimple(map, prefix + "InstanceGrpId", this.InstanceGrpId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "UpdatedTime", this.UpdatedTime);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "WanDomain", this.WanDomain);
        this.setParamSimple(map, prefix + "WanIP", this.WanIP);
        this.setParamSimple(map, prefix + "WanPort", this.WanPort);
        this.setParamSimple(map, prefix + "WanStatus", this.WanStatus);
        this.setParamArrayObj(map, prefix + "InstanceSet.", this.InstanceSet);

    }
}

