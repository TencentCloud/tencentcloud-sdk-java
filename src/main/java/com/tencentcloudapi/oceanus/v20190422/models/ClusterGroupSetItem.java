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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterGroupSetItem extends AbstractModel{

    /**
    * clusterGroup 的 SerialId
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 集群名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 账号 APPID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 主账号 UIN
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * 创建账号 UIN
    */
    @SerializedName("CreatorUin")
    @Expose
    private String CreatorUin;

    /**
    * CU 数量
    */
    @SerializedName("CuNum")
    @Expose
    private Long CuNum;

    /**
    * CU 内存规格
    */
    @SerializedName("CuMem")
    @Expose
    private Long CuMem;

    /**
    * 集群状态, 1 未初始化,，3 初始化中，2 运行中
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 状态描述
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * 集群创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 最后一次操作集群的时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 描述
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 网络
    */
    @SerializedName("NetEnvironmentType")
    @Expose
    private Long NetEnvironmentType;

    /**
    * 空闲 CU
    */
    @SerializedName("FreeCuNum")
    @Expose
    private Long FreeCuNum;

    /**
    * 细粒度资源下的空闲CU
    */
    @SerializedName("FreeCu")
    @Expose
    private Float FreeCu;

    /**
    * 运行中CU
    */
    @SerializedName("RunningCu")
    @Expose
    private Float RunningCu;

    /**
    * 付费模式
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
     * Get clusterGroup 的 SerialId 
     * @return ClusterId clusterGroup 的 SerialId
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set clusterGroup 的 SerialId
     * @param ClusterId clusterGroup 的 SerialId
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 集群名称 
     * @return Name 集群名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 集群名称
     * @param Name 集群名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 地域 
     * @return Region 地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
     * @param Region 地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 区 
     * @return Zone 区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 区
     * @param Zone 区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 账号 APPID 
     * @return AppId 账号 APPID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 账号 APPID
     * @param AppId 账号 APPID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 主账号 UIN 
     * @return OwnerUin 主账号 UIN
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 主账号 UIN
     * @param OwnerUin 主账号 UIN
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get 创建账号 UIN 
     * @return CreatorUin 创建账号 UIN
     */
    public String getCreatorUin() {
        return this.CreatorUin;
    }

    /**
     * Set 创建账号 UIN
     * @param CreatorUin 创建账号 UIN
     */
    public void setCreatorUin(String CreatorUin) {
        this.CreatorUin = CreatorUin;
    }

    /**
     * Get CU 数量 
     * @return CuNum CU 数量
     */
    public Long getCuNum() {
        return this.CuNum;
    }

    /**
     * Set CU 数量
     * @param CuNum CU 数量
     */
    public void setCuNum(Long CuNum) {
        this.CuNum = CuNum;
    }

    /**
     * Get CU 内存规格 
     * @return CuMem CU 内存规格
     */
    public Long getCuMem() {
        return this.CuMem;
    }

    /**
     * Set CU 内存规格
     * @param CuMem CU 内存规格
     */
    public void setCuMem(Long CuMem) {
        this.CuMem = CuMem;
    }

    /**
     * Get 集群状态, 1 未初始化,，3 初始化中，2 运行中 
     * @return Status 集群状态, 1 未初始化,，3 初始化中，2 运行中
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 集群状态, 1 未初始化,，3 初始化中，2 运行中
     * @param Status 集群状态, 1 未初始化,，3 初始化中，2 运行中
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 状态描述 
     * @return StatusDesc 状态描述
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set 状态描述
     * @param StatusDesc 状态描述
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get 集群创建时间 
     * @return CreateTime 集群创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 集群创建时间
     * @param CreateTime 集群创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 最后一次操作集群的时间 
     * @return UpdateTime 最后一次操作集群的时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 最后一次操作集群的时间
     * @param UpdateTime 最后一次操作集群的时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 描述 
     * @return Remark 描述
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 描述
     * @param Remark 描述
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 网络 
     * @return NetEnvironmentType 网络
     */
    public Long getNetEnvironmentType() {
        return this.NetEnvironmentType;
    }

    /**
     * Set 网络
     * @param NetEnvironmentType 网络
     */
    public void setNetEnvironmentType(Long NetEnvironmentType) {
        this.NetEnvironmentType = NetEnvironmentType;
    }

    /**
     * Get 空闲 CU 
     * @return FreeCuNum 空闲 CU
     */
    public Long getFreeCuNum() {
        return this.FreeCuNum;
    }

    /**
     * Set 空闲 CU
     * @param FreeCuNum 空闲 CU
     */
    public void setFreeCuNum(Long FreeCuNum) {
        this.FreeCuNum = FreeCuNum;
    }

    /**
     * Get 细粒度资源下的空闲CU 
     * @return FreeCu 细粒度资源下的空闲CU
     */
    public Float getFreeCu() {
        return this.FreeCu;
    }

    /**
     * Set 细粒度资源下的空闲CU
     * @param FreeCu 细粒度资源下的空闲CU
     */
    public void setFreeCu(Float FreeCu) {
        this.FreeCu = FreeCu;
    }

    /**
     * Get 运行中CU 
     * @return RunningCu 运行中CU
     */
    public Float getRunningCu() {
        return this.RunningCu;
    }

    /**
     * Set 运行中CU
     * @param RunningCu 运行中CU
     */
    public void setRunningCu(Float RunningCu) {
        this.RunningCu = RunningCu;
    }

    /**
     * Get 付费模式 
     * @return PayMode 付费模式
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 付费模式
     * @param PayMode 付费模式
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    public ClusterGroupSetItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterGroupSetItem(ClusterGroupSetItem source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.CreatorUin != null) {
            this.CreatorUin = new String(source.CreatorUin);
        }
        if (source.CuNum != null) {
            this.CuNum = new Long(source.CuNum);
        }
        if (source.CuMem != null) {
            this.CuMem = new Long(source.CuMem);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.NetEnvironmentType != null) {
            this.NetEnvironmentType = new Long(source.NetEnvironmentType);
        }
        if (source.FreeCuNum != null) {
            this.FreeCuNum = new Long(source.FreeCuNum);
        }
        if (source.FreeCu != null) {
            this.FreeCu = new Float(source.FreeCu);
        }
        if (source.RunningCu != null) {
            this.RunningCu = new Float(source.RunningCu);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "CreatorUin", this.CreatorUin);
        this.setParamSimple(map, prefix + "CuNum", this.CuNum);
        this.setParamSimple(map, prefix + "CuMem", this.CuMem);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "NetEnvironmentType", this.NetEnvironmentType);
        this.setParamSimple(map, prefix + "FreeCuNum", this.FreeCuNum);
        this.setParamSimple(map, prefix + "FreeCu", this.FreeCu);
        this.setParamSimple(map, prefix + "RunningCu", this.RunningCu);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);

    }
}

