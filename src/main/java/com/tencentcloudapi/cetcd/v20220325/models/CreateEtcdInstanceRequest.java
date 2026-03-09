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
package com.tencentcloudapi.cetcd.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateEtcdInstanceRequest extends AbstractModel {

    /**
    * etcd实例名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * etcd所属vpc
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * etcd对外提供访问ip地址所在子网
    */
    @SerializedName("ServiceSubnetId")
    @Expose
    private String ServiceSubnetId;

    /**
    * etcd部署子网
    */
    @SerializedName("SubnetIds")
    @Expose
    private String [] SubnetIds;

    /**
    * etcd版本
    */
    @SerializedName("EtcdVersion")
    @Expose
    private String EtcdVersion;

    /**
    * etcd节点个数，可选范围: 1, 3, 5, 7, 9
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * etcd集群描述信息
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 高级设置
    */
    @SerializedName("AdvancedSettings")
    @Expose
    private EtcdAdvancedSettings AdvancedSettings;

    /**
    * 付费类型：
PREPAID 预付费
POSTPAID_BY_HOUR 后付费按小时付费
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * 预付费相关配置
    */
    @SerializedName("ChargePrepaid")
    @Expose
    private ChargePrepaidConfig ChargePrepaid;

    /**
    * 存储大小GB
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * 删除保护，true 删除保护开启；false删除保护关闭
    */
    @SerializedName("DeletionProtection")
    @Expose
    private Boolean DeletionProtection;

    /**
     * Get etcd实例名称 
     * @return Name etcd实例名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set etcd实例名称
     * @param Name etcd实例名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get etcd所属vpc 
     * @return VpcId etcd所属vpc
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set etcd所属vpc
     * @param VpcId etcd所属vpc
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get etcd对外提供访问ip地址所在子网 
     * @return ServiceSubnetId etcd对外提供访问ip地址所在子网
     */
    public String getServiceSubnetId() {
        return this.ServiceSubnetId;
    }

    /**
     * Set etcd对外提供访问ip地址所在子网
     * @param ServiceSubnetId etcd对外提供访问ip地址所在子网
     */
    public void setServiceSubnetId(String ServiceSubnetId) {
        this.ServiceSubnetId = ServiceSubnetId;
    }

    /**
     * Get etcd部署子网 
     * @return SubnetIds etcd部署子网
     */
    public String [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Set etcd部署子网
     * @param SubnetIds etcd部署子网
     */
    public void setSubnetIds(String [] SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    /**
     * Get etcd版本 
     * @return EtcdVersion etcd版本
     */
    public String getEtcdVersion() {
        return this.EtcdVersion;
    }

    /**
     * Set etcd版本
     * @param EtcdVersion etcd版本
     */
    public void setEtcdVersion(String EtcdVersion) {
        this.EtcdVersion = EtcdVersion;
    }

    /**
     * Get etcd节点个数，可选范围: 1, 3, 5, 7, 9 
     * @return Size etcd节点个数，可选范围: 1, 3, 5, 7, 9
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set etcd节点个数，可选范围: 1, 3, 5, 7, 9
     * @param Size etcd节点个数，可选范围: 1, 3, 5, 7, 9
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get etcd集群描述信息 
     * @return Description etcd集群描述信息
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set etcd集群描述信息
     * @param Description etcd集群描述信息
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 高级设置 
     * @return AdvancedSettings 高级设置
     */
    public EtcdAdvancedSettings getAdvancedSettings() {
        return this.AdvancedSettings;
    }

    /**
     * Set 高级设置
     * @param AdvancedSettings 高级设置
     */
    public void setAdvancedSettings(EtcdAdvancedSettings AdvancedSettings) {
        this.AdvancedSettings = AdvancedSettings;
    }

    /**
     * Get 付费类型：
PREPAID 预付费
POSTPAID_BY_HOUR 后付费按小时付费 
     * @return ChargeType 付费类型：
PREPAID 预付费
POSTPAID_BY_HOUR 后付费按小时付费
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set 付费类型：
PREPAID 预付费
POSTPAID_BY_HOUR 后付费按小时付费
     * @param ChargeType 付费类型：
PREPAID 预付费
POSTPAID_BY_HOUR 后付费按小时付费
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get 预付费相关配置 
     * @return ChargePrepaid 预付费相关配置
     */
    public ChargePrepaidConfig getChargePrepaid() {
        return this.ChargePrepaid;
    }

    /**
     * Set 预付费相关配置
     * @param ChargePrepaid 预付费相关配置
     */
    public void setChargePrepaid(ChargePrepaidConfig ChargePrepaid) {
        this.ChargePrepaid = ChargePrepaid;
    }

    /**
     * Get 存储大小GB 
     * @return DiskSize 存储大小GB
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 存储大小GB
     * @param DiskSize 存储大小GB
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get 删除保护，true 删除保护开启；false删除保护关闭 
     * @return DeletionProtection 删除保护，true 删除保护开启；false删除保护关闭
     */
    public Boolean getDeletionProtection() {
        return this.DeletionProtection;
    }

    /**
     * Set 删除保护，true 删除保护开启；false删除保护关闭
     * @param DeletionProtection 删除保护，true 删除保护开启；false删除保护关闭
     */
    public void setDeletionProtection(Boolean DeletionProtection) {
        this.DeletionProtection = DeletionProtection;
    }

    public CreateEtcdInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateEtcdInstanceRequest(CreateEtcdInstanceRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.ServiceSubnetId != null) {
            this.ServiceSubnetId = new String(source.ServiceSubnetId);
        }
        if (source.SubnetIds != null) {
            this.SubnetIds = new String[source.SubnetIds.length];
            for (int i = 0; i < source.SubnetIds.length; i++) {
                this.SubnetIds[i] = new String(source.SubnetIds[i]);
            }
        }
        if (source.EtcdVersion != null) {
            this.EtcdVersion = new String(source.EtcdVersion);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.AdvancedSettings != null) {
            this.AdvancedSettings = new EtcdAdvancedSettings(source.AdvancedSettings);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
        if (source.ChargePrepaid != null) {
            this.ChargePrepaid = new ChargePrepaidConfig(source.ChargePrepaid);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.DeletionProtection != null) {
            this.DeletionProtection = new Boolean(source.DeletionProtection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "ServiceSubnetId", this.ServiceSubnetId);
        this.setParamArraySimple(map, prefix + "SubnetIds.", this.SubnetIds);
        this.setParamSimple(map, prefix + "EtcdVersion", this.EtcdVersion);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamObj(map, prefix + "AdvancedSettings.", this.AdvancedSettings);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamObj(map, prefix + "ChargePrepaid.", this.ChargePrepaid);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "DeletionProtection", this.DeletionProtection);

    }
}

