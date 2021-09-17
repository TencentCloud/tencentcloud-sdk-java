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

public class CreateEKSContainerInstancesRequest extends AbstractModel{

    /**
    * 容器组
    */
    @SerializedName("Containers")
    @Expose
    private Container [] Containers;

    /**
    * EKS Container Instance容器实例名称
    */
    @SerializedName("EksCiName")
    @Expose
    private String EksCiName;

    /**
    * 指定新创建实例所属于的安全组Id
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * 实例所属子网Id
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 实例所属VPC的Id
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 内存，单位：GiB。可参考[资源规格](https://cloud.tencent.com/document/product/457/39808)文档
    */
    @SerializedName("Memory")
    @Expose
    private Float Memory;

    /**
    * CPU，单位：核。可参考[资源规格](https://cloud.tencent.com/document/product/457/39808)文档
    */
    @SerializedName("Cpu")
    @Expose
    private Float Cpu;

    /**
    * 实例重启策略： Always(总是重启)、Never(从不重启)、OnFailure(失败时重启)，默认：Always。
    */
    @SerializedName("RestartPolicy")
    @Expose
    private String RestartPolicy;

    /**
    * 镜像仓库凭证数组
    */
    @SerializedName("ImageRegistryCredentials")
    @Expose
    private ImageRegistryCredential [] ImageRegistryCredentials;

    /**
    * 数据卷，包含NfsVolume数组和CbsVolume数组
    */
    @SerializedName("EksCiVolume")
    @Expose
    private EksCiVolume EksCiVolume;

    /**
    * 实例副本数，默认为1
    */
    @SerializedName("Replicas")
    @Expose
    private Long Replicas;

    /**
    * Init 容器
    */
    @SerializedName("InitContainers")
    @Expose
    private Container [] InitContainers;

    /**
    * 自定义DNS配置
    */
    @SerializedName("DnsConfig")
    @Expose
    private DNSConfig DnsConfig;

    /**
    * 用来绑定容器实例的已有EIP的列表。如传值，需要保证数值和Replicas相等。
另外此参数和AutoCreateEipAttribute互斥。
    */
    @SerializedName("ExistedEipIds")
    @Expose
    private String [] ExistedEipIds;

    /**
    * 自动创建EIP的可选参数。若传此参数，则会自动创建EIP。
另外此参数和ExistedEipIds互斥
    */
    @SerializedName("AutoCreateEipAttribute")
    @Expose
    private EipAttribute AutoCreateEipAttribute;

    /**
    * 是否为容器实例自动创建EIP，默认为false。若传true，则此参数和ExistedEipIds互斥
    */
    @SerializedName("AutoCreateEip")
    @Expose
    private Boolean AutoCreateEip;

    /**
    * Pod 所需的 CPU 资源型号，如果不填写则默认不强制指定 CPU 类型。目前支持型号如下：
intel
amd
- 支持优先级顺序写法，如 “amd,intel” 表示优先创建 amd 资源 Pod，如果所选地域可用区 amd 资源不足，则会创建 intel 资源 Pod。
    */
    @SerializedName("CpuType")
    @Expose
    private String CpuType;

    /**
    * 容器实例所需的 GPU 资源型号，目前支持型号如下：
1/4\*V100
1/2\*V100
V100
1/4\*T4
1/2\*T4
T4
    */
    @SerializedName("GpuType")
    @Expose
    private String GpuType;

    /**
    * Pod 所需的 GPU 数量，如填写，请确保为支持的规格。默认单位为卡，无需再次注明。
    */
    @SerializedName("GpuCount")
    @Expose
    private Long GpuCount;

    /**
    * 为容器实例关联 CAM 角色，value 填写 CAM 角色名称，容器实例可获取该 CAM 角色包含的权限策略，方便 容器实例 内的程序进行如购买资源、读写存储等云资源操作。
    */
    @SerializedName("CamRoleName")
    @Expose
    private String CamRoleName;

    /**
     * Get 容器组 
     * @return Containers 容器组
     */
    public Container [] getContainers() {
        return this.Containers;
    }

    /**
     * Set 容器组
     * @param Containers 容器组
     */
    public void setContainers(Container [] Containers) {
        this.Containers = Containers;
    }

    /**
     * Get EKS Container Instance容器实例名称 
     * @return EksCiName EKS Container Instance容器实例名称
     */
    public String getEksCiName() {
        return this.EksCiName;
    }

    /**
     * Set EKS Container Instance容器实例名称
     * @param EksCiName EKS Container Instance容器实例名称
     */
    public void setEksCiName(String EksCiName) {
        this.EksCiName = EksCiName;
    }

    /**
     * Get 指定新创建实例所属于的安全组Id 
     * @return SecurityGroupIds 指定新创建实例所属于的安全组Id
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set 指定新创建实例所属于的安全组Id
     * @param SecurityGroupIds 指定新创建实例所属于的安全组Id
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get 实例所属子网Id 
     * @return SubnetId 实例所属子网Id
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 实例所属子网Id
     * @param SubnetId 实例所属子网Id
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 实例所属VPC的Id 
     * @return VpcId 实例所属VPC的Id
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 实例所属VPC的Id
     * @param VpcId 实例所属VPC的Id
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 内存，单位：GiB。可参考[资源规格](https://cloud.tencent.com/document/product/457/39808)文档 
     * @return Memory 内存，单位：GiB。可参考[资源规格](https://cloud.tencent.com/document/product/457/39808)文档
     */
    public Float getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存，单位：GiB。可参考[资源规格](https://cloud.tencent.com/document/product/457/39808)文档
     * @param Memory 内存，单位：GiB。可参考[资源规格](https://cloud.tencent.com/document/product/457/39808)文档
     */
    public void setMemory(Float Memory) {
        this.Memory = Memory;
    }

    /**
     * Get CPU，单位：核。可参考[资源规格](https://cloud.tencent.com/document/product/457/39808)文档 
     * @return Cpu CPU，单位：核。可参考[资源规格](https://cloud.tencent.com/document/product/457/39808)文档
     */
    public Float getCpu() {
        return this.Cpu;
    }

    /**
     * Set CPU，单位：核。可参考[资源规格](https://cloud.tencent.com/document/product/457/39808)文档
     * @param Cpu CPU，单位：核。可参考[资源规格](https://cloud.tencent.com/document/product/457/39808)文档
     */
    public void setCpu(Float Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 实例重启策略： Always(总是重启)、Never(从不重启)、OnFailure(失败时重启)，默认：Always。 
     * @return RestartPolicy 实例重启策略： Always(总是重启)、Never(从不重启)、OnFailure(失败时重启)，默认：Always。
     */
    public String getRestartPolicy() {
        return this.RestartPolicy;
    }

    /**
     * Set 实例重启策略： Always(总是重启)、Never(从不重启)、OnFailure(失败时重启)，默认：Always。
     * @param RestartPolicy 实例重启策略： Always(总是重启)、Never(从不重启)、OnFailure(失败时重启)，默认：Always。
     */
    public void setRestartPolicy(String RestartPolicy) {
        this.RestartPolicy = RestartPolicy;
    }

    /**
     * Get 镜像仓库凭证数组 
     * @return ImageRegistryCredentials 镜像仓库凭证数组
     */
    public ImageRegistryCredential [] getImageRegistryCredentials() {
        return this.ImageRegistryCredentials;
    }

    /**
     * Set 镜像仓库凭证数组
     * @param ImageRegistryCredentials 镜像仓库凭证数组
     */
    public void setImageRegistryCredentials(ImageRegistryCredential [] ImageRegistryCredentials) {
        this.ImageRegistryCredentials = ImageRegistryCredentials;
    }

    /**
     * Get 数据卷，包含NfsVolume数组和CbsVolume数组 
     * @return EksCiVolume 数据卷，包含NfsVolume数组和CbsVolume数组
     */
    public EksCiVolume getEksCiVolume() {
        return this.EksCiVolume;
    }

    /**
     * Set 数据卷，包含NfsVolume数组和CbsVolume数组
     * @param EksCiVolume 数据卷，包含NfsVolume数组和CbsVolume数组
     */
    public void setEksCiVolume(EksCiVolume EksCiVolume) {
        this.EksCiVolume = EksCiVolume;
    }

    /**
     * Get 实例副本数，默认为1 
     * @return Replicas 实例副本数，默认为1
     */
    public Long getReplicas() {
        return this.Replicas;
    }

    /**
     * Set 实例副本数，默认为1
     * @param Replicas 实例副本数，默认为1
     */
    public void setReplicas(Long Replicas) {
        this.Replicas = Replicas;
    }

    /**
     * Get Init 容器 
     * @return InitContainers Init 容器
     */
    public Container [] getInitContainers() {
        return this.InitContainers;
    }

    /**
     * Set Init 容器
     * @param InitContainers Init 容器
     */
    public void setInitContainers(Container [] InitContainers) {
        this.InitContainers = InitContainers;
    }

    /**
     * Get 自定义DNS配置 
     * @return DnsConfig 自定义DNS配置
     */
    public DNSConfig getDnsConfig() {
        return this.DnsConfig;
    }

    /**
     * Set 自定义DNS配置
     * @param DnsConfig 自定义DNS配置
     */
    public void setDnsConfig(DNSConfig DnsConfig) {
        this.DnsConfig = DnsConfig;
    }

    /**
     * Get 用来绑定容器实例的已有EIP的列表。如传值，需要保证数值和Replicas相等。
另外此参数和AutoCreateEipAttribute互斥。 
     * @return ExistedEipIds 用来绑定容器实例的已有EIP的列表。如传值，需要保证数值和Replicas相等。
另外此参数和AutoCreateEipAttribute互斥。
     */
    public String [] getExistedEipIds() {
        return this.ExistedEipIds;
    }

    /**
     * Set 用来绑定容器实例的已有EIP的列表。如传值，需要保证数值和Replicas相等。
另外此参数和AutoCreateEipAttribute互斥。
     * @param ExistedEipIds 用来绑定容器实例的已有EIP的列表。如传值，需要保证数值和Replicas相等。
另外此参数和AutoCreateEipAttribute互斥。
     */
    public void setExistedEipIds(String [] ExistedEipIds) {
        this.ExistedEipIds = ExistedEipIds;
    }

    /**
     * Get 自动创建EIP的可选参数。若传此参数，则会自动创建EIP。
另外此参数和ExistedEipIds互斥 
     * @return AutoCreateEipAttribute 自动创建EIP的可选参数。若传此参数，则会自动创建EIP。
另外此参数和ExistedEipIds互斥
     */
    public EipAttribute getAutoCreateEipAttribute() {
        return this.AutoCreateEipAttribute;
    }

    /**
     * Set 自动创建EIP的可选参数。若传此参数，则会自动创建EIP。
另外此参数和ExistedEipIds互斥
     * @param AutoCreateEipAttribute 自动创建EIP的可选参数。若传此参数，则会自动创建EIP。
另外此参数和ExistedEipIds互斥
     */
    public void setAutoCreateEipAttribute(EipAttribute AutoCreateEipAttribute) {
        this.AutoCreateEipAttribute = AutoCreateEipAttribute;
    }

    /**
     * Get 是否为容器实例自动创建EIP，默认为false。若传true，则此参数和ExistedEipIds互斥 
     * @return AutoCreateEip 是否为容器实例自动创建EIP，默认为false。若传true，则此参数和ExistedEipIds互斥
     */
    public Boolean getAutoCreateEip() {
        return this.AutoCreateEip;
    }

    /**
     * Set 是否为容器实例自动创建EIP，默认为false。若传true，则此参数和ExistedEipIds互斥
     * @param AutoCreateEip 是否为容器实例自动创建EIP，默认为false。若传true，则此参数和ExistedEipIds互斥
     */
    public void setAutoCreateEip(Boolean AutoCreateEip) {
        this.AutoCreateEip = AutoCreateEip;
    }

    /**
     * Get Pod 所需的 CPU 资源型号，如果不填写则默认不强制指定 CPU 类型。目前支持型号如下：
intel
amd
- 支持优先级顺序写法，如 “amd,intel” 表示优先创建 amd 资源 Pod，如果所选地域可用区 amd 资源不足，则会创建 intel 资源 Pod。 
     * @return CpuType Pod 所需的 CPU 资源型号，如果不填写则默认不强制指定 CPU 类型。目前支持型号如下：
intel
amd
- 支持优先级顺序写法，如 “amd,intel” 表示优先创建 amd 资源 Pod，如果所选地域可用区 amd 资源不足，则会创建 intel 资源 Pod。
     */
    public String getCpuType() {
        return this.CpuType;
    }

    /**
     * Set Pod 所需的 CPU 资源型号，如果不填写则默认不强制指定 CPU 类型。目前支持型号如下：
intel
amd
- 支持优先级顺序写法，如 “amd,intel” 表示优先创建 amd 资源 Pod，如果所选地域可用区 amd 资源不足，则会创建 intel 资源 Pod。
     * @param CpuType Pod 所需的 CPU 资源型号，如果不填写则默认不强制指定 CPU 类型。目前支持型号如下：
intel
amd
- 支持优先级顺序写法，如 “amd,intel” 表示优先创建 amd 资源 Pod，如果所选地域可用区 amd 资源不足，则会创建 intel 资源 Pod。
     */
    public void setCpuType(String CpuType) {
        this.CpuType = CpuType;
    }

    /**
     * Get 容器实例所需的 GPU 资源型号，目前支持型号如下：
1/4\*V100
1/2\*V100
V100
1/4\*T4
1/2\*T4
T4 
     * @return GpuType 容器实例所需的 GPU 资源型号，目前支持型号如下：
1/4\*V100
1/2\*V100
V100
1/4\*T4
1/2\*T4
T4
     */
    public String getGpuType() {
        return this.GpuType;
    }

    /**
     * Set 容器实例所需的 GPU 资源型号，目前支持型号如下：
1/4\*V100
1/2\*V100
V100
1/4\*T4
1/2\*T4
T4
     * @param GpuType 容器实例所需的 GPU 资源型号，目前支持型号如下：
1/4\*V100
1/2\*V100
V100
1/4\*T4
1/2\*T4
T4
     */
    public void setGpuType(String GpuType) {
        this.GpuType = GpuType;
    }

    /**
     * Get Pod 所需的 GPU 数量，如填写，请确保为支持的规格。默认单位为卡，无需再次注明。 
     * @return GpuCount Pod 所需的 GPU 数量，如填写，请确保为支持的规格。默认单位为卡，无需再次注明。
     */
    public Long getGpuCount() {
        return this.GpuCount;
    }

    /**
     * Set Pod 所需的 GPU 数量，如填写，请确保为支持的规格。默认单位为卡，无需再次注明。
     * @param GpuCount Pod 所需的 GPU 数量，如填写，请确保为支持的规格。默认单位为卡，无需再次注明。
     */
    public void setGpuCount(Long GpuCount) {
        this.GpuCount = GpuCount;
    }

    /**
     * Get 为容器实例关联 CAM 角色，value 填写 CAM 角色名称，容器实例可获取该 CAM 角色包含的权限策略，方便 容器实例 内的程序进行如购买资源、读写存储等云资源操作。 
     * @return CamRoleName 为容器实例关联 CAM 角色，value 填写 CAM 角色名称，容器实例可获取该 CAM 角色包含的权限策略，方便 容器实例 内的程序进行如购买资源、读写存储等云资源操作。
     */
    public String getCamRoleName() {
        return this.CamRoleName;
    }

    /**
     * Set 为容器实例关联 CAM 角色，value 填写 CAM 角色名称，容器实例可获取该 CAM 角色包含的权限策略，方便 容器实例 内的程序进行如购买资源、读写存储等云资源操作。
     * @param CamRoleName 为容器实例关联 CAM 角色，value 填写 CAM 角色名称，容器实例可获取该 CAM 角色包含的权限策略，方便 容器实例 内的程序进行如购买资源、读写存储等云资源操作。
     */
    public void setCamRoleName(String CamRoleName) {
        this.CamRoleName = CamRoleName;
    }

    public CreateEKSContainerInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateEKSContainerInstancesRequest(CreateEKSContainerInstancesRequest source) {
        if (source.Containers != null) {
            this.Containers = new Container[source.Containers.length];
            for (int i = 0; i < source.Containers.length; i++) {
                this.Containers[i] = new Container(source.Containers[i]);
            }
        }
        if (source.EksCiName != null) {
            this.EksCiName = new String(source.EksCiName);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.Memory != null) {
            this.Memory = new Float(source.Memory);
        }
        if (source.Cpu != null) {
            this.Cpu = new Float(source.Cpu);
        }
        if (source.RestartPolicy != null) {
            this.RestartPolicy = new String(source.RestartPolicy);
        }
        if (source.ImageRegistryCredentials != null) {
            this.ImageRegistryCredentials = new ImageRegistryCredential[source.ImageRegistryCredentials.length];
            for (int i = 0; i < source.ImageRegistryCredentials.length; i++) {
                this.ImageRegistryCredentials[i] = new ImageRegistryCredential(source.ImageRegistryCredentials[i]);
            }
        }
        if (source.EksCiVolume != null) {
            this.EksCiVolume = new EksCiVolume(source.EksCiVolume);
        }
        if (source.Replicas != null) {
            this.Replicas = new Long(source.Replicas);
        }
        if (source.InitContainers != null) {
            this.InitContainers = new Container[source.InitContainers.length];
            for (int i = 0; i < source.InitContainers.length; i++) {
                this.InitContainers[i] = new Container(source.InitContainers[i]);
            }
        }
        if (source.DnsConfig != null) {
            this.DnsConfig = new DNSConfig(source.DnsConfig);
        }
        if (source.ExistedEipIds != null) {
            this.ExistedEipIds = new String[source.ExistedEipIds.length];
            for (int i = 0; i < source.ExistedEipIds.length; i++) {
                this.ExistedEipIds[i] = new String(source.ExistedEipIds[i]);
            }
        }
        if (source.AutoCreateEipAttribute != null) {
            this.AutoCreateEipAttribute = new EipAttribute(source.AutoCreateEipAttribute);
        }
        if (source.AutoCreateEip != null) {
            this.AutoCreateEip = new Boolean(source.AutoCreateEip);
        }
        if (source.CpuType != null) {
            this.CpuType = new String(source.CpuType);
        }
        if (source.GpuType != null) {
            this.GpuType = new String(source.GpuType);
        }
        if (source.GpuCount != null) {
            this.GpuCount = new Long(source.GpuCount);
        }
        if (source.CamRoleName != null) {
            this.CamRoleName = new String(source.CamRoleName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Containers.", this.Containers);
        this.setParamSimple(map, prefix + "EksCiName", this.EksCiName);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "RestartPolicy", this.RestartPolicy);
        this.setParamArrayObj(map, prefix + "ImageRegistryCredentials.", this.ImageRegistryCredentials);
        this.setParamObj(map, prefix + "EksCiVolume.", this.EksCiVolume);
        this.setParamSimple(map, prefix + "Replicas", this.Replicas);
        this.setParamArrayObj(map, prefix + "InitContainers.", this.InitContainers);
        this.setParamObj(map, prefix + "DnsConfig.", this.DnsConfig);
        this.setParamArraySimple(map, prefix + "ExistedEipIds.", this.ExistedEipIds);
        this.setParamObj(map, prefix + "AutoCreateEipAttribute.", this.AutoCreateEipAttribute);
        this.setParamSimple(map, prefix + "AutoCreateEip", this.AutoCreateEip);
        this.setParamSimple(map, prefix + "CpuType", this.CpuType);
        this.setParamSimple(map, prefix + "GpuType", this.GpuType);
        this.setParamSimple(map, prefix + "GpuCount", this.GpuCount);
        this.setParamSimple(map, prefix + "CamRoleName", this.CamRoleName);

    }
}

