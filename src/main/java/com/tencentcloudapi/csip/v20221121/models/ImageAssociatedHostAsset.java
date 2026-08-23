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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageAssociatedHostAsset extends AbstractModel {

    /**
    * <p>主机uuid</p>
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * <p>主机quuid</p>
    */
    @SerializedName("QUuid")
    @Expose
    private String QUuid;

    /**
    * <p>主机名</p>
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * <p>主机所属账号名</p>
    */
    @SerializedName("OwnerAccountName")
    @Expose
    private String OwnerAccountName;

    /**
    * <p>主机所属账号appid</p>
    */
    @SerializedName("OwnerAppId")
    @Expose
    private Long OwnerAppId;

    /**
    * <p>主机所属账号uin</p>
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * <p>主机内网地址</p>
    */
    @SerializedName("InnerIp")
    @Expose
    private String InnerIp;

    /**
    * <p>主机公网地址</p>
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * <p>主机上agent状态</p><p>枚举值：</p><ul><li>ONLINE： 在线</li><li>OFFLINE： 离线</li><li>UNINSTALL： 已卸载</li></ul>
    */
    @SerializedName("AgentStatus")
    @Expose
    private String AgentStatus;

    /**
    * <p>主机实例id</p>
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * <p>主机状态</p>
    */
    @SerializedName("InstanceState")
    @Expose
    private String InstanceState;

    /**
     * Get <p>主机uuid</p> 
     * @return Uuid <p>主机uuid</p>
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set <p>主机uuid</p>
     * @param Uuid <p>主机uuid</p>
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get <p>主机quuid</p> 
     * @return QUuid <p>主机quuid</p>
     */
    public String getQUuid() {
        return this.QUuid;
    }

    /**
     * Set <p>主机quuid</p>
     * @param QUuid <p>主机quuid</p>
     */
    public void setQUuid(String QUuid) {
        this.QUuid = QUuid;
    }

    /**
     * Get <p>主机名</p> 
     * @return HostName <p>主机名</p>
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set <p>主机名</p>
     * @param HostName <p>主机名</p>
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get <p>主机所属账号名</p> 
     * @return OwnerAccountName <p>主机所属账号名</p>
     */
    public String getOwnerAccountName() {
        return this.OwnerAccountName;
    }

    /**
     * Set <p>主机所属账号名</p>
     * @param OwnerAccountName <p>主机所属账号名</p>
     */
    public void setOwnerAccountName(String OwnerAccountName) {
        this.OwnerAccountName = OwnerAccountName;
    }

    /**
     * Get <p>主机所属账号appid</p> 
     * @return OwnerAppId <p>主机所属账号appid</p>
     */
    public Long getOwnerAppId() {
        return this.OwnerAppId;
    }

    /**
     * Set <p>主机所属账号appid</p>
     * @param OwnerAppId <p>主机所属账号appid</p>
     */
    public void setOwnerAppId(Long OwnerAppId) {
        this.OwnerAppId = OwnerAppId;
    }

    /**
     * Get <p>主机所属账号uin</p> 
     * @return OwnerUin <p>主机所属账号uin</p>
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set <p>主机所属账号uin</p>
     * @param OwnerUin <p>主机所属账号uin</p>
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get <p>主机内网地址</p> 
     * @return InnerIp <p>主机内网地址</p>
     */
    public String getInnerIp() {
        return this.InnerIp;
    }

    /**
     * Set <p>主机内网地址</p>
     * @param InnerIp <p>主机内网地址</p>
     */
    public void setInnerIp(String InnerIp) {
        this.InnerIp = InnerIp;
    }

    /**
     * Get <p>主机公网地址</p> 
     * @return PublicIp <p>主机公网地址</p>
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set <p>主机公网地址</p>
     * @param PublicIp <p>主机公网地址</p>
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get <p>主机上agent状态</p><p>枚举值：</p><ul><li>ONLINE： 在线</li><li>OFFLINE： 离线</li><li>UNINSTALL： 已卸载</li></ul> 
     * @return AgentStatus <p>主机上agent状态</p><p>枚举值：</p><ul><li>ONLINE： 在线</li><li>OFFLINE： 离线</li><li>UNINSTALL： 已卸载</li></ul>
     */
    public String getAgentStatus() {
        return this.AgentStatus;
    }

    /**
     * Set <p>主机上agent状态</p><p>枚举值：</p><ul><li>ONLINE： 在线</li><li>OFFLINE： 离线</li><li>UNINSTALL： 已卸载</li></ul>
     * @param AgentStatus <p>主机上agent状态</p><p>枚举值：</p><ul><li>ONLINE： 在线</li><li>OFFLINE： 离线</li><li>UNINSTALL： 已卸载</li></ul>
     */
    public void setAgentStatus(String AgentStatus) {
        this.AgentStatus = AgentStatus;
    }

    /**
     * Get <p>主机实例id</p> 
     * @return InstanceID <p>主机实例id</p>
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set <p>主机实例id</p>
     * @param InstanceID <p>主机实例id</p>
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get <p>主机状态</p> 
     * @return InstanceState <p>主机状态</p>
     */
    public String getInstanceState() {
        return this.InstanceState;
    }

    /**
     * Set <p>主机状态</p>
     * @param InstanceState <p>主机状态</p>
     */
    public void setInstanceState(String InstanceState) {
        this.InstanceState = InstanceState;
    }

    public ImageAssociatedHostAsset() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageAssociatedHostAsset(ImageAssociatedHostAsset source) {
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.QUuid != null) {
            this.QUuid = new String(source.QUuid);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.OwnerAccountName != null) {
            this.OwnerAccountName = new String(source.OwnerAccountName);
        }
        if (source.OwnerAppId != null) {
            this.OwnerAppId = new Long(source.OwnerAppId);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.InnerIp != null) {
            this.InnerIp = new String(source.InnerIp);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.AgentStatus != null) {
            this.AgentStatus = new String(source.AgentStatus);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.InstanceState != null) {
            this.InstanceState = new String(source.InstanceState);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "QUuid", this.QUuid);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "OwnerAccountName", this.OwnerAccountName);
        this.setParamSimple(map, prefix + "OwnerAppId", this.OwnerAppId);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "InnerIp", this.InnerIp);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "AgentStatus", this.AgentStatus);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "InstanceState", this.InstanceState);

    }
}

