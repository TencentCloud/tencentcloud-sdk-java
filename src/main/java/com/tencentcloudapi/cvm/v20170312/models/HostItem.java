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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HostItem extends AbstractModel{

    /**
    * 专用宿主机实例所在的位置。通过该参数可以指定实例所属可用区，所属项目等属性。
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * 专用宿主机实例ID
    */
    @SerializedName("HostId")
    @Expose
    private String HostId;

    /**
    * 专用宿主机实例类型
    */
    @SerializedName("HostType")
    @Expose
    private String HostType;

    /**
    * 专用宿主机实例名称
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * 专用宿主机实例付费模式
    */
    @SerializedName("HostChargeType")
    @Expose
    private String HostChargeType;

    /**
    * 专用宿主机实例自动续费标记
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * 专用宿主机实例创建时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 专用宿主机实例过期时间
    */
    @SerializedName("ExpiredTime")
    @Expose
    private String ExpiredTime;

    /**
    * 专用宿主机实例上已创建云子机的实例id列表
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 专用宿主机实例状态
    */
    @SerializedName("HostState")
    @Expose
    private String HostState;

    /**
    * 专用宿主机实例IP
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * 专用宿主机实例资源信息
    */
    @SerializedName("HostResource")
    @Expose
    private HostResource HostResource;

    /**
    * 专用宿主机所属的围笼ID。该字段仅对金融专区围笼内的专用宿主机有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CageId")
    @Expose
    private String CageId;

    /**
     * Get 专用宿主机实例所在的位置。通过该参数可以指定实例所属可用区，所属项目等属性。 
     * @return Placement 专用宿主机实例所在的位置。通过该参数可以指定实例所属可用区，所属项目等属性。
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * Set 专用宿主机实例所在的位置。通过该参数可以指定实例所属可用区，所属项目等属性。
     * @param Placement 专用宿主机实例所在的位置。通过该参数可以指定实例所属可用区，所属项目等属性。
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * Get 专用宿主机实例ID 
     * @return HostId 专用宿主机实例ID
     */
    public String getHostId() {
        return this.HostId;
    }

    /**
     * Set 专用宿主机实例ID
     * @param HostId 专用宿主机实例ID
     */
    public void setHostId(String HostId) {
        this.HostId = HostId;
    }

    /**
     * Get 专用宿主机实例类型 
     * @return HostType 专用宿主机实例类型
     */
    public String getHostType() {
        return this.HostType;
    }

    /**
     * Set 专用宿主机实例类型
     * @param HostType 专用宿主机实例类型
     */
    public void setHostType(String HostType) {
        this.HostType = HostType;
    }

    /**
     * Get 专用宿主机实例名称 
     * @return HostName 专用宿主机实例名称
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set 专用宿主机实例名称
     * @param HostName 专用宿主机实例名称
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get 专用宿主机实例付费模式 
     * @return HostChargeType 专用宿主机实例付费模式
     */
    public String getHostChargeType() {
        return this.HostChargeType;
    }

    /**
     * Set 专用宿主机实例付费模式
     * @param HostChargeType 专用宿主机实例付费模式
     */
    public void setHostChargeType(String HostChargeType) {
        this.HostChargeType = HostChargeType;
    }

    /**
     * Get 专用宿主机实例自动续费标记 
     * @return RenewFlag 专用宿主机实例自动续费标记
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 专用宿主机实例自动续费标记
     * @param RenewFlag 专用宿主机实例自动续费标记
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get 专用宿主机实例创建时间 
     * @return CreatedTime 专用宿主机实例创建时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 专用宿主机实例创建时间
     * @param CreatedTime 专用宿主机实例创建时间
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 专用宿主机实例过期时间 
     * @return ExpiredTime 专用宿主机实例过期时间
     */
    public String getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set 专用宿主机实例过期时间
     * @param ExpiredTime 专用宿主机实例过期时间
     */
    public void setExpiredTime(String ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Get 专用宿主机实例上已创建云子机的实例id列表 
     * @return InstanceIds 专用宿主机实例上已创建云子机的实例id列表
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 专用宿主机实例上已创建云子机的实例id列表
     * @param InstanceIds 专用宿主机实例上已创建云子机的实例id列表
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 专用宿主机实例状态 
     * @return HostState 专用宿主机实例状态
     */
    public String getHostState() {
        return this.HostState;
    }

    /**
     * Set 专用宿主机实例状态
     * @param HostState 专用宿主机实例状态
     */
    public void setHostState(String HostState) {
        this.HostState = HostState;
    }

    /**
     * Get 专用宿主机实例IP 
     * @return HostIp 专用宿主机实例IP
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set 专用宿主机实例IP
     * @param HostIp 专用宿主机实例IP
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get 专用宿主机实例资源信息 
     * @return HostResource 专用宿主机实例资源信息
     */
    public HostResource getHostResource() {
        return this.HostResource;
    }

    /**
     * Set 专用宿主机实例资源信息
     * @param HostResource 专用宿主机实例资源信息
     */
    public void setHostResource(HostResource HostResource) {
        this.HostResource = HostResource;
    }

    /**
     * Get 专用宿主机所属的围笼ID。该字段仅对金融专区围笼内的专用宿主机有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CageId 专用宿主机所属的围笼ID。该字段仅对金融专区围笼内的专用宿主机有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCageId() {
        return this.CageId;
    }

    /**
     * Set 专用宿主机所属的围笼ID。该字段仅对金融专区围笼内的专用宿主机有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CageId 专用宿主机所属的围笼ID。该字段仅对金融专区围笼内的专用宿主机有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCageId(String CageId) {
        this.CageId = CageId;
    }

    public HostItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostItem(HostItem source) {
        if (source.Placement != null) {
            this.Placement = new Placement(source.Placement);
        }
        if (source.HostId != null) {
            this.HostId = new String(source.HostId);
        }
        if (source.HostType != null) {
            this.HostType = new String(source.HostType);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.HostChargeType != null) {
            this.HostChargeType = new String(source.HostChargeType);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new String(source.RenewFlag);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new String(source.ExpiredTime);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.HostState != null) {
            this.HostState = new String(source.HostState);
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.HostResource != null) {
            this.HostResource = new HostResource(source.HostResource);
        }
        if (source.CageId != null) {
            this.CageId = new String(source.CageId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Placement.", this.Placement);
        this.setParamSimple(map, prefix + "HostId", this.HostId);
        this.setParamSimple(map, prefix + "HostType", this.HostType);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "HostChargeType", this.HostChargeType);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "HostState", this.HostState);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamObj(map, prefix + "HostResource.", this.HostResource);
        this.setParamSimple(map, prefix + "CageId", this.CageId);

    }
}

