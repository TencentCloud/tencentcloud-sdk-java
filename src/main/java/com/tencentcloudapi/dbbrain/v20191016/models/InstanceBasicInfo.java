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
package com.tencentcloudapi.dbbrain.v20191016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceBasicInfo extends AbstractModel {

    /**
    * 实例ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 实例内网IP。
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 实例内网Port。
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * 实例产品。
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * 实例引擎版本。
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
    * CPU数量，对于Redis为0。
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 实例部署模式，取值包括"CUSTOM", "EXCLUSIVE", "CUSTOMER_AGENT", "CUSTOMER_DIRECT",
"CLOUD_NATIVE_CLUSTER_EXCLUSIVE", "CLOUD_NATIVE_CLUSTER"。
    */
    @SerializedName("DeployMode")
    @Expose
    private String DeployMode;

    /**
    * 实例内存配置。
    */
    @SerializedName("InstanceConf")
    @Expose
    private RedisInstanceConf InstanceConf;

    /**
    * DBbrain是否支持该实例。
    */
    @SerializedName("IsSupported")
    @Expose
    private Boolean IsSupported;

    /**
    * 实例内存，单位MB。
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 实例地域。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 实例子网统一ID，对于redis为空字符串。	
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * 实例私有网络统一ID，对于redis为空字符串。
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * 实例磁盘容量，对于Redis为0。
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
     * Get 实例ID。 
     * @return InstanceId 实例ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID。
     * @param InstanceId 实例ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名称。 
     * @return InstanceName 实例名称。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称。
     * @param InstanceName 实例名称。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 实例内网IP。 
     * @return Vip 实例内网IP。
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 实例内网IP。
     * @param Vip 实例内网IP。
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 实例内网Port。 
     * @return Vport 实例内网Port。
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set 实例内网Port。
     * @param Vport 实例内网Port。
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get 实例产品。 
     * @return Product 实例产品。
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 实例产品。
     * @param Product 实例产品。
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get 实例引擎版本。 
     * @return EngineVersion 实例引擎版本。
     */
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set 实例引擎版本。
     * @param EngineVersion 实例引擎版本。
     */
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Get CPU数量，对于Redis为0。 
     * @return Cpu CPU数量，对于Redis为0。
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set CPU数量，对于Redis为0。
     * @param Cpu CPU数量，对于Redis为0。
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 实例部署模式，取值包括"CUSTOM", "EXCLUSIVE", "CUSTOMER_AGENT", "CUSTOMER_DIRECT",
"CLOUD_NATIVE_CLUSTER_EXCLUSIVE", "CLOUD_NATIVE_CLUSTER"。 
     * @return DeployMode 实例部署模式，取值包括"CUSTOM", "EXCLUSIVE", "CUSTOMER_AGENT", "CUSTOMER_DIRECT",
"CLOUD_NATIVE_CLUSTER_EXCLUSIVE", "CLOUD_NATIVE_CLUSTER"。
     */
    public String getDeployMode() {
        return this.DeployMode;
    }

    /**
     * Set 实例部署模式，取值包括"CUSTOM", "EXCLUSIVE", "CUSTOMER_AGENT", "CUSTOMER_DIRECT",
"CLOUD_NATIVE_CLUSTER_EXCLUSIVE", "CLOUD_NATIVE_CLUSTER"。
     * @param DeployMode 实例部署模式，取值包括"CUSTOM", "EXCLUSIVE", "CUSTOMER_AGENT", "CUSTOMER_DIRECT",
"CLOUD_NATIVE_CLUSTER_EXCLUSIVE", "CLOUD_NATIVE_CLUSTER"。
     */
    public void setDeployMode(String DeployMode) {
        this.DeployMode = DeployMode;
    }

    /**
     * Get 实例内存配置。 
     * @return InstanceConf 实例内存配置。
     */
    public RedisInstanceConf getInstanceConf() {
        return this.InstanceConf;
    }

    /**
     * Set 实例内存配置。
     * @param InstanceConf 实例内存配置。
     */
    public void setInstanceConf(RedisInstanceConf InstanceConf) {
        this.InstanceConf = InstanceConf;
    }

    /**
     * Get DBbrain是否支持该实例。 
     * @return IsSupported DBbrain是否支持该实例。
     */
    public Boolean getIsSupported() {
        return this.IsSupported;
    }

    /**
     * Set DBbrain是否支持该实例。
     * @param IsSupported DBbrain是否支持该实例。
     */
    public void setIsSupported(Boolean IsSupported) {
        this.IsSupported = IsSupported;
    }

    /**
     * Get 实例内存，单位MB。 
     * @return Memory 实例内存，单位MB。
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 实例内存，单位MB。
     * @param Memory 实例内存，单位MB。
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 实例地域。 
     * @return Region 实例地域。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 实例地域。
     * @param Region 实例地域。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 实例子网统一ID，对于redis为空字符串。	 
     * @return UniqSubnetId 实例子网统一ID，对于redis为空字符串。	
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set 实例子网统一ID，对于redis为空字符串。	
     * @param UniqSubnetId 实例子网统一ID，对于redis为空字符串。	
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get 实例私有网络统一ID，对于redis为空字符串。 
     * @return UniqVpcId 实例私有网络统一ID，对于redis为空字符串。
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set 实例私有网络统一ID，对于redis为空字符串。
     * @param UniqVpcId 实例私有网络统一ID，对于redis为空字符串。
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get 实例磁盘容量，对于Redis为0。 
     * @return Volume 实例磁盘容量，对于Redis为0。
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set 实例磁盘容量，对于Redis为0。
     * @param Volume 实例磁盘容量，对于Redis为0。
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    public InstanceBasicInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceBasicInfo(InstanceBasicInfo source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.EngineVersion != null) {
            this.EngineVersion = new String(source.EngineVersion);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.DeployMode != null) {
            this.DeployMode = new String(source.DeployMode);
        }
        if (source.InstanceConf != null) {
            this.InstanceConf = new RedisInstanceConf(source.InstanceConf);
        }
        if (source.IsSupported != null) {
            this.IsSupported = new Boolean(source.IsSupported);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.UniqSubnetId != null) {
            this.UniqSubnetId = new String(source.UniqSubnetId);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.Volume != null) {
            this.Volume = new Long(source.Volume);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "EngineVersion", this.EngineVersion);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "DeployMode", this.DeployMode);
        this.setParamObj(map, prefix + "InstanceConf.", this.InstanceConf);
        this.setParamSimple(map, prefix + "IsSupported", this.IsSupported);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "Volume", this.Volume);

    }
}

