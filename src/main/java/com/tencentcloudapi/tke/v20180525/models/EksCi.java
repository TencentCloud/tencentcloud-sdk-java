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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EksCi extends AbstractModel{

    /**
    * EKS Cotainer Instance Id
    */
    @SerializedName("EksCiId")
    @Expose
    private String EksCiId;

    /**
    * EKS Cotainer Instance Name
    */
    @SerializedName("EksCiName")
    @Expose
    private String EksCiName;

    /**
    * 内存大小
    */
    @SerializedName("Memory")
    @Expose
    private Float Memory;

    /**
    * CPU大小
    */
    @SerializedName("Cpu")
    @Expose
    private Float Cpu;

    /**
    * 安全组ID
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * 容器组的重启策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RestartPolicy")
    @Expose
    private String RestartPolicy;

    /**
    * 返回容器组创建状态：Pending，Running，Succeeded，Failed。其中：
Failed （运行失败）指的容器组退出，RestartPolilcy为Never， 有容器exitCode非0；
Succeeded（运行成功）指的是容器组退出了，RestartPolicy为Never或onFailure，所有容器exitCode都为0；
Failed和Succeeded这两种状态都会停止运行，停止计费。
Pending是创建中，Running是 运行中。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 接到请求后的系统创建时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * 容器全部成功退出后的时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SucceededTime")
    @Expose
    private String SucceededTime;

    /**
    * 容器列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Containers")
    @Expose
    private Container [] Containers;

    /**
    * 数据卷信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EksCiVolume")
    @Expose
    private EksCiVolume EksCiVolume;

    /**
    * 容器组运行的安全上下文
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecurityContext")
    @Expose
    private SecurityContext SecurityContext;

    /**
    * 内网ip地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * 容器实例绑定的Eip地址，注意可能为空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EipAddress")
    @Expose
    private String EipAddress;

    /**
    * GPU类型。如无使用GPU则不返回
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GpuType")
    @Expose
    private String GpuType;

    /**
    * CPU类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CpuType")
    @Expose
    private String CpuType;

    /**
    * GPU卡数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GpuCount")
    @Expose
    private Long GpuCount;

    /**
    * 实例所属VPC的Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 实例所属子网Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 初始化容器列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InitContainers")
    @Expose
    private Container [] InitContainers;

    /**
    * 为容器实例关联 CAM 角色，value 填写 CAM 角色名称，容器实例可获取该 CAM 角色包含的权限策略，方便 容器实例 内的程序进行如购买资源、读写存储等云资源操作。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CamRoleName")
    @Expose
    private String CamRoleName;

    /**
    * 自动为用户创建的EipId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoCreatedEipId")
    @Expose
    private String AutoCreatedEipId;

    /**
    * 容器状态是否持久化
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PersistStatus")
    @Expose
    private Boolean PersistStatus;

    /**
     * Get EKS Cotainer Instance Id 
     * @return EksCiId EKS Cotainer Instance Id
     */
    public String getEksCiId() {
        return this.EksCiId;
    }

    /**
     * Set EKS Cotainer Instance Id
     * @param EksCiId EKS Cotainer Instance Id
     */
    public void setEksCiId(String EksCiId) {
        this.EksCiId = EksCiId;
    }

    /**
     * Get EKS Cotainer Instance Name 
     * @return EksCiName EKS Cotainer Instance Name
     */
    public String getEksCiName() {
        return this.EksCiName;
    }

    /**
     * Set EKS Cotainer Instance Name
     * @param EksCiName EKS Cotainer Instance Name
     */
    public void setEksCiName(String EksCiName) {
        this.EksCiName = EksCiName;
    }

    /**
     * Get 内存大小 
     * @return Memory 内存大小
     */
    public Float getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存大小
     * @param Memory 内存大小
     */
    public void setMemory(Float Memory) {
        this.Memory = Memory;
    }

    /**
     * Get CPU大小 
     * @return Cpu CPU大小
     */
    public Float getCpu() {
        return this.Cpu;
    }

    /**
     * Set CPU大小
     * @param Cpu CPU大小
     */
    public void setCpu(Float Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 安全组ID 
     * @return SecurityGroupIds 安全组ID
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set 安全组ID
     * @param SecurityGroupIds 安全组ID
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get 容器组的重启策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RestartPolicy 容器组的重启策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRestartPolicy() {
        return this.RestartPolicy;
    }

    /**
     * Set 容器组的重启策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param RestartPolicy 容器组的重启策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRestartPolicy(String RestartPolicy) {
        this.RestartPolicy = RestartPolicy;
    }

    /**
     * Get 返回容器组创建状态：Pending，Running，Succeeded，Failed。其中：
Failed （运行失败）指的容器组退出，RestartPolilcy为Never， 有容器exitCode非0；
Succeeded（运行成功）指的是容器组退出了，RestartPolicy为Never或onFailure，所有容器exitCode都为0；
Failed和Succeeded这两种状态都会停止运行，停止计费。
Pending是创建中，Running是 运行中。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 返回容器组创建状态：Pending，Running，Succeeded，Failed。其中：
Failed （运行失败）指的容器组退出，RestartPolilcy为Never， 有容器exitCode非0；
Succeeded（运行成功）指的是容器组退出了，RestartPolicy为Never或onFailure，所有容器exitCode都为0；
Failed和Succeeded这两种状态都会停止运行，停止计费。
Pending是创建中，Running是 运行中。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 返回容器组创建状态：Pending，Running，Succeeded，Failed。其中：
Failed （运行失败）指的容器组退出，RestartPolilcy为Never， 有容器exitCode非0；
Succeeded（运行成功）指的是容器组退出了，RestartPolicy为Never或onFailure，所有容器exitCode都为0；
Failed和Succeeded这两种状态都会停止运行，停止计费。
Pending是创建中，Running是 运行中。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 返回容器组创建状态：Pending，Running，Succeeded，Failed。其中：
Failed （运行失败）指的容器组退出，RestartPolilcy为Never， 有容器exitCode非0；
Succeeded（运行成功）指的是容器组退出了，RestartPolicy为Never或onFailure，所有容器exitCode都为0；
Failed和Succeeded这两种状态都会停止运行，停止计费。
Pending是创建中，Running是 运行中。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 接到请求后的系统创建时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreationTime 接到请求后的系统创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set 接到请求后的系统创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreationTime 接到请求后的系统创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get 容器全部成功退出后的时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SucceededTime 容器全部成功退出后的时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSucceededTime() {
        return this.SucceededTime;
    }

    /**
     * Set 容器全部成功退出后的时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param SucceededTime 容器全部成功退出后的时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSucceededTime(String SucceededTime) {
        this.SucceededTime = SucceededTime;
    }

    /**
     * Get 容器列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Containers 容器列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Container [] getContainers() {
        return this.Containers;
    }

    /**
     * Set 容器列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Containers 容器列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContainers(Container [] Containers) {
        this.Containers = Containers;
    }

    /**
     * Get 数据卷信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EksCiVolume 数据卷信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EksCiVolume getEksCiVolume() {
        return this.EksCiVolume;
    }

    /**
     * Set 数据卷信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param EksCiVolume 数据卷信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEksCiVolume(EksCiVolume EksCiVolume) {
        this.EksCiVolume = EksCiVolume;
    }

    /**
     * Get 容器组运行的安全上下文
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecurityContext 容器组运行的安全上下文
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SecurityContext getSecurityContext() {
        return this.SecurityContext;
    }

    /**
     * Set 容器组运行的安全上下文
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecurityContext 容器组运行的安全上下文
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecurityContext(SecurityContext SecurityContext) {
        this.SecurityContext = SecurityContext;
    }

    /**
     * Get 内网ip地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrivateIp 内网ip地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set 内网ip地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrivateIp 内网ip地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get 容器实例绑定的Eip地址，注意可能为空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EipAddress 容器实例绑定的Eip地址，注意可能为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEipAddress() {
        return this.EipAddress;
    }

    /**
     * Set 容器实例绑定的Eip地址，注意可能为空
注意：此字段可能返回 null，表示取不到有效值。
     * @param EipAddress 容器实例绑定的Eip地址，注意可能为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEipAddress(String EipAddress) {
        this.EipAddress = EipAddress;
    }

    /**
     * Get GPU类型。如无使用GPU则不返回
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GpuType GPU类型。如无使用GPU则不返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGpuType() {
        return this.GpuType;
    }

    /**
     * Set GPU类型。如无使用GPU则不返回
注意：此字段可能返回 null，表示取不到有效值。
     * @param GpuType GPU类型。如无使用GPU则不返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGpuType(String GpuType) {
        this.GpuType = GpuType;
    }

    /**
     * Get CPU类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CpuType CPU类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCpuType() {
        return this.CpuType;
    }

    /**
     * Set CPU类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param CpuType CPU类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpuType(String CpuType) {
        this.CpuType = CpuType;
    }

    /**
     * Get GPU卡数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GpuCount GPU卡数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGpuCount() {
        return this.GpuCount;
    }

    /**
     * Set GPU卡数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param GpuCount GPU卡数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGpuCount(Long GpuCount) {
        this.GpuCount = GpuCount;
    }

    /**
     * Get 实例所属VPC的Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId 实例所属VPC的Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 实例所属VPC的Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId 实例所属VPC的Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 实例所属子网Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetId 实例所属子网Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 实例所属子网Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetId 实例所属子网Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 初始化容器列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InitContainers 初始化容器列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Container [] getInitContainers() {
        return this.InitContainers;
    }

    /**
     * Set 初始化容器列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param InitContainers 初始化容器列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInitContainers(Container [] InitContainers) {
        this.InitContainers = InitContainers;
    }

    /**
     * Get 为容器实例关联 CAM 角色，value 填写 CAM 角色名称，容器实例可获取该 CAM 角色包含的权限策略，方便 容器实例 内的程序进行如购买资源、读写存储等云资源操作。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CamRoleName 为容器实例关联 CAM 角色，value 填写 CAM 角色名称，容器实例可获取该 CAM 角色包含的权限策略，方便 容器实例 内的程序进行如购买资源、读写存储等云资源操作。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCamRoleName() {
        return this.CamRoleName;
    }

    /**
     * Set 为容器实例关联 CAM 角色，value 填写 CAM 角色名称，容器实例可获取该 CAM 角色包含的权限策略，方便 容器实例 内的程序进行如购买资源、读写存储等云资源操作。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CamRoleName 为容器实例关联 CAM 角色，value 填写 CAM 角色名称，容器实例可获取该 CAM 角色包含的权限策略，方便 容器实例 内的程序进行如购买资源、读写存储等云资源操作。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCamRoleName(String CamRoleName) {
        this.CamRoleName = CamRoleName;
    }

    /**
     * Get 自动为用户创建的EipId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoCreatedEipId 自动为用户创建的EipId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAutoCreatedEipId() {
        return this.AutoCreatedEipId;
    }

    /**
     * Set 自动为用户创建的EipId
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoCreatedEipId 自动为用户创建的EipId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoCreatedEipId(String AutoCreatedEipId) {
        this.AutoCreatedEipId = AutoCreatedEipId;
    }

    /**
     * Get 容器状态是否持久化
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PersistStatus 容器状态是否持久化
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getPersistStatus() {
        return this.PersistStatus;
    }

    /**
     * Set 容器状态是否持久化
注意：此字段可能返回 null，表示取不到有效值。
     * @param PersistStatus 容器状态是否持久化
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPersistStatus(Boolean PersistStatus) {
        this.PersistStatus = PersistStatus;
    }

    public EksCi() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EksCi(EksCi source) {
        if (source.EksCiId != null) {
            this.EksCiId = new String(source.EksCiId);
        }
        if (source.EksCiName != null) {
            this.EksCiName = new String(source.EksCiName);
        }
        if (source.Memory != null) {
            this.Memory = new Float(source.Memory);
        }
        if (source.Cpu != null) {
            this.Cpu = new Float(source.Cpu);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.RestartPolicy != null) {
            this.RestartPolicy = new String(source.RestartPolicy);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreationTime != null) {
            this.CreationTime = new String(source.CreationTime);
        }
        if (source.SucceededTime != null) {
            this.SucceededTime = new String(source.SucceededTime);
        }
        if (source.Containers != null) {
            this.Containers = new Container[source.Containers.length];
            for (int i = 0; i < source.Containers.length; i++) {
                this.Containers[i] = new Container(source.Containers[i]);
            }
        }
        if (source.EksCiVolume != null) {
            this.EksCiVolume = new EksCiVolume(source.EksCiVolume);
        }
        if (source.SecurityContext != null) {
            this.SecurityContext = new SecurityContext(source.SecurityContext);
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String(source.PrivateIp);
        }
        if (source.EipAddress != null) {
            this.EipAddress = new String(source.EipAddress);
        }
        if (source.GpuType != null) {
            this.GpuType = new String(source.GpuType);
        }
        if (source.CpuType != null) {
            this.CpuType = new String(source.CpuType);
        }
        if (source.GpuCount != null) {
            this.GpuCount = new Long(source.GpuCount);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.InitContainers != null) {
            this.InitContainers = new Container[source.InitContainers.length];
            for (int i = 0; i < source.InitContainers.length; i++) {
                this.InitContainers[i] = new Container(source.InitContainers[i]);
            }
        }
        if (source.CamRoleName != null) {
            this.CamRoleName = new String(source.CamRoleName);
        }
        if (source.AutoCreatedEipId != null) {
            this.AutoCreatedEipId = new String(source.AutoCreatedEipId);
        }
        if (source.PersistStatus != null) {
            this.PersistStatus = new Boolean(source.PersistStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EksCiId", this.EksCiId);
        this.setParamSimple(map, prefix + "EksCiName", this.EksCiName);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamSimple(map, prefix + "RestartPolicy", this.RestartPolicy);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);
        this.setParamSimple(map, prefix + "SucceededTime", this.SucceededTime);
        this.setParamArrayObj(map, prefix + "Containers.", this.Containers);
        this.setParamObj(map, prefix + "EksCiVolume.", this.EksCiVolume);
        this.setParamObj(map, prefix + "SecurityContext.", this.SecurityContext);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "EipAddress", this.EipAddress);
        this.setParamSimple(map, prefix + "GpuType", this.GpuType);
        this.setParamSimple(map, prefix + "CpuType", this.CpuType);
        this.setParamSimple(map, prefix + "GpuCount", this.GpuCount);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamArrayObj(map, prefix + "InitContainers.", this.InitContainers);
        this.setParamSimple(map, prefix + "CamRoleName", this.CamRoleName);
        this.setParamSimple(map, prefix + "AutoCreatedEipId", this.AutoCreatedEipId);
        this.setParamSimple(map, prefix + "PersistStatus", this.PersistStatus);

    }
}

