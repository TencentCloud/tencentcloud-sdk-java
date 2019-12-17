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
    * cdh实例所在的位置。通过该参数可以指定实例所属可用区，所属项目等属性。
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * cdh实例id
    */
    @SerializedName("HostId")
    @Expose
    private String HostId;

    /**
    * cdh实例类型
    */
    @SerializedName("HostType")
    @Expose
    private String HostType;

    /**
    * cdh实例名称
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * cdh实例付费模式
    */
    @SerializedName("HostChargeType")
    @Expose
    private String HostChargeType;

    /**
    * cdh实例自动续费标记
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * cdh实例创建时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * cdh实例过期时间
    */
    @SerializedName("ExpiredTime")
    @Expose
    private String ExpiredTime;

    /**
    * cdh实例上已创建云子机的实例id列表
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * cdh实例状态
    */
    @SerializedName("HostState")
    @Expose
    private String HostState;

    /**
    * cdh实例ip
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * cdh实例资源信息
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
     * Get cdh实例所在的位置。通过该参数可以指定实例所属可用区，所属项目等属性。 
     * @return Placement cdh实例所在的位置。通过该参数可以指定实例所属可用区，所属项目等属性。
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * Set cdh实例所在的位置。通过该参数可以指定实例所属可用区，所属项目等属性。
     * @param Placement cdh实例所在的位置。通过该参数可以指定实例所属可用区，所属项目等属性。
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * Get cdh实例id 
     * @return HostId cdh实例id
     */
    public String getHostId() {
        return this.HostId;
    }

    /**
     * Set cdh实例id
     * @param HostId cdh实例id
     */
    public void setHostId(String HostId) {
        this.HostId = HostId;
    }

    /**
     * Get cdh实例类型 
     * @return HostType cdh实例类型
     */
    public String getHostType() {
        return this.HostType;
    }

    /**
     * Set cdh实例类型
     * @param HostType cdh实例类型
     */
    public void setHostType(String HostType) {
        this.HostType = HostType;
    }

    /**
     * Get cdh实例名称 
     * @return HostName cdh实例名称
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set cdh实例名称
     * @param HostName cdh实例名称
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get cdh实例付费模式 
     * @return HostChargeType cdh实例付费模式
     */
    public String getHostChargeType() {
        return this.HostChargeType;
    }

    /**
     * Set cdh实例付费模式
     * @param HostChargeType cdh实例付费模式
     */
    public void setHostChargeType(String HostChargeType) {
        this.HostChargeType = HostChargeType;
    }

    /**
     * Get cdh实例自动续费标记 
     * @return RenewFlag cdh实例自动续费标记
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set cdh实例自动续费标记
     * @param RenewFlag cdh实例自动续费标记
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get cdh实例创建时间 
     * @return CreatedTime cdh实例创建时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set cdh实例创建时间
     * @param CreatedTime cdh实例创建时间
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get cdh实例过期时间 
     * @return ExpiredTime cdh实例过期时间
     */
    public String getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set cdh实例过期时间
     * @param ExpiredTime cdh实例过期时间
     */
    public void setExpiredTime(String ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Get cdh实例上已创建云子机的实例id列表 
     * @return InstanceIds cdh实例上已创建云子机的实例id列表
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set cdh实例上已创建云子机的实例id列表
     * @param InstanceIds cdh实例上已创建云子机的实例id列表
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get cdh实例状态 
     * @return HostState cdh实例状态
     */
    public String getHostState() {
        return this.HostState;
    }

    /**
     * Set cdh实例状态
     * @param HostState cdh实例状态
     */
    public void setHostState(String HostState) {
        this.HostState = HostState;
    }

    /**
     * Get cdh实例ip 
     * @return HostIp cdh实例ip
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set cdh实例ip
     * @param HostIp cdh实例ip
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get cdh实例资源信息 
     * @return HostResource cdh实例资源信息
     */
    public HostResource getHostResource() {
        return this.HostResource;
    }

    /**
     * Set cdh实例资源信息
     * @param HostResource cdh实例资源信息
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

