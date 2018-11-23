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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInstanceRequest  extends AbstractModel{

    /**
    * 可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 节点数量
    */
    @SerializedName("NodeNum")
    @Expose
    private Integer NodeNum;

    /**
    * 实例版本,当前只支持5.6.4
    */
    @SerializedName("EsVersion")
    @Expose
    private String EsVersion;

    /**
    * 节点规格： 
ES.S1.SMALL2: 1核2G
ES.S1.MEDIUM4: 2核4G
ES.S1.MEDIUM8: 2核8G
ES.S1.LARGE16: 4核16G
ES.S1.2XLARGE32: 8核32G
ES.S1.4XLARGE64: 16核64G
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * 节点存储容量，单位GB
    */
    @SerializedName("DiskSize")
    @Expose
    private Integer DiskSize;

    /**
    * 私有网络ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 访问密码，密码需8到16位，至少包括两项（[a-z,A-Z],[0-9]和[()`~!@#$%^&*-+=_|{}:;' <>,.?/]的特殊符号
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 实例名称，1-50 个英文、汉字、数字、连接线-或下划线_
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 计费类型: 
PREPAID：预付费，即包年包月 
POSTPAID_BY_HOUR：按小时后付费，默认值
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * 包年包月购买时长，单位由TimeUint决定，默认为月
    */
    @SerializedName("ChargePeriod")
    @Expose
    private Integer ChargePeriod;

    /**
    * 自动续费标识，取值范围： 
RENEW_FLAG_AUTO：自动续费
RENEW_FLAG_MANUAL：不自动续费，用户手动续费
如不传递该参数，普通用于默认不自动续费，SVIP用户自动续费
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * 节点存储类型,取值范围:  
LOCAL_BASIC: 本地硬盘  
LOCAL_SSD: 本地SSD硬盘，默认值  
CLOUD_BASIC: 普通云硬盘  
CLOUD_PREMIUM: 高硬能云硬盘  
CLOUD_SSD: SSD云硬盘
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 计费时长单位，当前只支持“m”，表示月
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * 是否自动使用代金券，1是，0否，默认不使用
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Integer AutoVoucher;

    /**
    * 代金券ID列表，目前仅支持指定一张代金券
    */
    @SerializedName("VoucherIds")
    @Expose
    private String [] VoucherIds;

    /**
     * 获取可用区
     * @return Zone 可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * 设置可用区
     * @param Zone 可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * 获取节点数量
     * @return NodeNum 节点数量
     */
    public Integer getNodeNum() {
        return this.NodeNum;
    }

    /**
     * 设置节点数量
     * @param NodeNum 节点数量
     */
    public void setNodeNum(Integer NodeNum) {
        this.NodeNum = NodeNum;
    }

    /**
     * 获取实例版本,当前只支持5.6.4
     * @return EsVersion 实例版本,当前只支持5.6.4
     */
    public String getEsVersion() {
        return this.EsVersion;
    }

    /**
     * 设置实例版本,当前只支持5.6.4
     * @param EsVersion 实例版本,当前只支持5.6.4
     */
    public void setEsVersion(String EsVersion) {
        this.EsVersion = EsVersion;
    }

    /**
     * 获取节点规格： 
ES.S1.SMALL2: 1核2G
ES.S1.MEDIUM4: 2核4G
ES.S1.MEDIUM8: 2核8G
ES.S1.LARGE16: 4核16G
ES.S1.2XLARGE32: 8核32G
ES.S1.4XLARGE64: 16核64G
     * @return NodeType 节点规格： 
ES.S1.SMALL2: 1核2G
ES.S1.MEDIUM4: 2核4G
ES.S1.MEDIUM8: 2核8G
ES.S1.LARGE16: 4核16G
ES.S1.2XLARGE32: 8核32G
ES.S1.4XLARGE64: 16核64G
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * 设置节点规格： 
ES.S1.SMALL2: 1核2G
ES.S1.MEDIUM4: 2核4G
ES.S1.MEDIUM8: 2核8G
ES.S1.LARGE16: 4核16G
ES.S1.2XLARGE32: 8核32G
ES.S1.4XLARGE64: 16核64G
     * @param NodeType 节点规格： 
ES.S1.SMALL2: 1核2G
ES.S1.MEDIUM4: 2核4G
ES.S1.MEDIUM8: 2核8G
ES.S1.LARGE16: 4核16G
ES.S1.2XLARGE32: 8核32G
ES.S1.4XLARGE64: 16核64G
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * 获取节点存储容量，单位GB
     * @return DiskSize 节点存储容量，单位GB
     */
    public Integer getDiskSize() {
        return this.DiskSize;
    }

    /**
     * 设置节点存储容量，单位GB
     * @param DiskSize 节点存储容量，单位GB
     */
    public void setDiskSize(Integer DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * 获取私有网络ID
     * @return VpcId 私有网络ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置私有网络ID
     * @param VpcId 私有网络ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取子网ID
     * @return SubnetId 子网ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * 设置子网ID
     * @param SubnetId 子网ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * 获取访问密码，密码需8到16位，至少包括两项（[a-z,A-Z],[0-9]和[()`~!@#$%^&*-+=_|{}:;' <>,.?/]的特殊符号
     * @return Password 访问密码，密码需8到16位，至少包括两项（[a-z,A-Z],[0-9]和[()`~!@#$%^&*-+=_|{}:;' <>,.?/]的特殊符号
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * 设置访问密码，密码需8到16位，至少包括两项（[a-z,A-Z],[0-9]和[()`~!@#$%^&*-+=_|{}:;' <>,.?/]的特殊符号
     * @param Password 访问密码，密码需8到16位，至少包括两项（[a-z,A-Z],[0-9]和[()`~!@#$%^&*-+=_|{}:;' <>,.?/]的特殊符号
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * 获取实例名称，1-50 个英文、汉字、数字、连接线-或下划线_
     * @return InstanceName 实例名称，1-50 个英文、汉字、数字、连接线-或下划线_
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * 设置实例名称，1-50 个英文、汉字、数字、连接线-或下划线_
     * @param InstanceName 实例名称，1-50 个英文、汉字、数字、连接线-或下划线_
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * 获取计费类型: 
PREPAID：预付费，即包年包月 
POSTPAID_BY_HOUR：按小时后付费，默认值
     * @return ChargeType 计费类型: 
PREPAID：预付费，即包年包月 
POSTPAID_BY_HOUR：按小时后付费，默认值
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * 设置计费类型: 
PREPAID：预付费，即包年包月 
POSTPAID_BY_HOUR：按小时后付费，默认值
     * @param ChargeType 计费类型: 
PREPAID：预付费，即包年包月 
POSTPAID_BY_HOUR：按小时后付费，默认值
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * 获取包年包月购买时长，单位由TimeUint决定，默认为月
     * @return ChargePeriod 包年包月购买时长，单位由TimeUint决定，默认为月
     */
    public Integer getChargePeriod() {
        return this.ChargePeriod;
    }

    /**
     * 设置包年包月购买时长，单位由TimeUint决定，默认为月
     * @param ChargePeriod 包年包月购买时长，单位由TimeUint决定，默认为月
     */
    public void setChargePeriod(Integer ChargePeriod) {
        this.ChargePeriod = ChargePeriod;
    }

    /**
     * 获取自动续费标识，取值范围： 
RENEW_FLAG_AUTO：自动续费
RENEW_FLAG_MANUAL：不自动续费，用户手动续费
如不传递该参数，普通用于默认不自动续费，SVIP用户自动续费
     * @return RenewFlag 自动续费标识，取值范围： 
RENEW_FLAG_AUTO：自动续费
RENEW_FLAG_MANUAL：不自动续费，用户手动续费
如不传递该参数，普通用于默认不自动续费，SVIP用户自动续费
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * 设置自动续费标识，取值范围： 
RENEW_FLAG_AUTO：自动续费
RENEW_FLAG_MANUAL：不自动续费，用户手动续费
如不传递该参数，普通用于默认不自动续费，SVIP用户自动续费
     * @param RenewFlag 自动续费标识，取值范围： 
RENEW_FLAG_AUTO：自动续费
RENEW_FLAG_MANUAL：不自动续费，用户手动续费
如不传递该参数，普通用于默认不自动续费，SVIP用户自动续费
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * 获取节点存储类型,取值范围:  
LOCAL_BASIC: 本地硬盘  
LOCAL_SSD: 本地SSD硬盘，默认值  
CLOUD_BASIC: 普通云硬盘  
CLOUD_PREMIUM: 高硬能云硬盘  
CLOUD_SSD: SSD云硬盘
     * @return DiskType 节点存储类型,取值范围:  
LOCAL_BASIC: 本地硬盘  
LOCAL_SSD: 本地SSD硬盘，默认值  
CLOUD_BASIC: 普通云硬盘  
CLOUD_PREMIUM: 高硬能云硬盘  
CLOUD_SSD: SSD云硬盘
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * 设置节点存储类型,取值范围:  
LOCAL_BASIC: 本地硬盘  
LOCAL_SSD: 本地SSD硬盘，默认值  
CLOUD_BASIC: 普通云硬盘  
CLOUD_PREMIUM: 高硬能云硬盘  
CLOUD_SSD: SSD云硬盘
     * @param DiskType 节点存储类型,取值范围:  
LOCAL_BASIC: 本地硬盘  
LOCAL_SSD: 本地SSD硬盘，默认值  
CLOUD_BASIC: 普通云硬盘  
CLOUD_PREMIUM: 高硬能云硬盘  
CLOUD_SSD: SSD云硬盘
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * 获取计费时长单位，当前只支持“m”，表示月
     * @return TimeUnit 计费时长单位，当前只支持“m”，表示月
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * 设置计费时长单位，当前只支持“m”，表示月
     * @param TimeUnit 计费时长单位，当前只支持“m”，表示月
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * 获取是否自动使用代金券，1是，0否，默认不使用
     * @return AutoVoucher 是否自动使用代金券，1是，0否，默认不使用
     */
    public Integer getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * 设置是否自动使用代金券，1是，0否，默认不使用
     * @param AutoVoucher 是否自动使用代金券，1是，0否，默认不使用
     */
    public void setAutoVoucher(Integer AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * 获取代金券ID列表，目前仅支持指定一张代金券
     * @return VoucherIds 代金券ID列表，目前仅支持指定一张代金券
     */
    public String [] getVoucherIds() {
        return this.VoucherIds;
    }

    /**
     * 设置代金券ID列表，目前仅支持指定一张代金券
     * @param VoucherIds 代金券ID列表，目前仅支持指定一张代金券
     */
    public void setVoucherIds(String [] VoucherIds) {
        this.VoucherIds = VoucherIds;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "NodeNum", this.NodeNum);
        this.setParamSimple(map, prefix + "EsVersion", this.EsVersion);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "ChargePeriod", this.ChargePeriod);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamArraySimple(map, prefix + "VoucherIds.", this.VoucherIds);

    }
}

