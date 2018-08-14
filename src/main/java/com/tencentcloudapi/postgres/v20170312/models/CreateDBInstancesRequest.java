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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDBInstancesRequest  extends AbstractModel{

    /**
    * 售卖规格ID。该参数可以通过调用DescribeProductConfig的返回值中的SpecCode字段来获取。
    */
    @SerializedName("SpecCode")
    @Expose
    private String SpecCode;

    /**
    * PostgreSQL内核版本，目前只支持：9.3.5、9.5.4两种版本。
    */
    @SerializedName("DBVersion")
    @Expose
    private String DBVersion;

    /**
    * 实例容量大小，单位：GB。
    */
    @SerializedName("Storage")
    @Expose
    private Integer Storage;

    /**
    * 一次性购买的实例数量。取值1-100
    */
    @SerializedName("InstanceCount")
    @Expose
    private Integer InstanceCount;

    /**
    * 购买时长，单位：月。目前只支持1,2,3,4,5,6,7,8,9,10,11,12,24,36这些值。
    */
    @SerializedName("Period")
    @Expose
    private Integer Period;

    /**
    * 可用区ID。该参数可以通过调用 DescribeZones 接口的返回值中的Zone字段来获取。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 项目ID。
    */
    @SerializedName("ProjectId")
    @Expose
    private Integer ProjectId;

    /**
    * 实例计费类型。目前只支持：PREPAID（预付费，即包年包月）。
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * 是否自动使用代金券。1（是），0（否），默认不使用。
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Integer AutoVoucher;

    /**
    * 代金券ID列表，目前仅支持指定一张代金券。
    */
    @SerializedName("VoucherIds")
    @Expose
    private String [] VoucherIds;

    /**
    * 私有网络ID。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 私有网络子网ID。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
     * 获取售卖规格ID。该参数可以通过调用DescribeProductConfig的返回值中的SpecCode字段来获取。
     * @return SpecCode 售卖规格ID。该参数可以通过调用DescribeProductConfig的返回值中的SpecCode字段来获取。
     */
    public String getSpecCode() {
        return this.SpecCode;
    }

    /**
     * 设置售卖规格ID。该参数可以通过调用DescribeProductConfig的返回值中的SpecCode字段来获取。
     * @param SpecCode 售卖规格ID。该参数可以通过调用DescribeProductConfig的返回值中的SpecCode字段来获取。
     */
    public void setSpecCode(String SpecCode) {
        this.SpecCode = SpecCode;
    }

    /**
     * 获取PostgreSQL内核版本，目前只支持：9.3.5、9.5.4两种版本。
     * @return DBVersion PostgreSQL内核版本，目前只支持：9.3.5、9.5.4两种版本。
     */
    public String getDBVersion() {
        return this.DBVersion;
    }

    /**
     * 设置PostgreSQL内核版本，目前只支持：9.3.5、9.5.4两种版本。
     * @param DBVersion PostgreSQL内核版本，目前只支持：9.3.5、9.5.4两种版本。
     */
    public void setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
    }

    /**
     * 获取实例容量大小，单位：GB。
     * @return Storage 实例容量大小，单位：GB。
     */
    public Integer getStorage() {
        return this.Storage;
    }

    /**
     * 设置实例容量大小，单位：GB。
     * @param Storage 实例容量大小，单位：GB。
     */
    public void setStorage(Integer Storage) {
        this.Storage = Storage;
    }

    /**
     * 获取一次性购买的实例数量。取值1-100
     * @return InstanceCount 一次性购买的实例数量。取值1-100
     */
    public Integer getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * 设置一次性购买的实例数量。取值1-100
     * @param InstanceCount 一次性购买的实例数量。取值1-100
     */
    public void setInstanceCount(Integer InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * 获取购买时长，单位：月。目前只支持1,2,3,4,5,6,7,8,9,10,11,12,24,36这些值。
     * @return Period 购买时长，单位：月。目前只支持1,2,3,4,5,6,7,8,9,10,11,12,24,36这些值。
     */
    public Integer getPeriod() {
        return this.Period;
    }

    /**
     * 设置购买时长，单位：月。目前只支持1,2,3,4,5,6,7,8,9,10,11,12,24,36这些值。
     * @param Period 购买时长，单位：月。目前只支持1,2,3,4,5,6,7,8,9,10,11,12,24,36这些值。
     */
    public void setPeriod(Integer Period) {
        this.Period = Period;
    }

    /**
     * 获取可用区ID。该参数可以通过调用 DescribeZones 接口的返回值中的Zone字段来获取。
     * @return Zone 可用区ID。该参数可以通过调用 DescribeZones 接口的返回值中的Zone字段来获取。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * 设置可用区ID。该参数可以通过调用 DescribeZones 接口的返回值中的Zone字段来获取。
     * @param Zone 可用区ID。该参数可以通过调用 DescribeZones 接口的返回值中的Zone字段来获取。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * 获取项目ID。
     * @return ProjectId 项目ID。
     */
    public Integer getProjectId() {
        return this.ProjectId;
    }

    /**
     * 设置项目ID。
     * @param ProjectId 项目ID。
     */
    public void setProjectId(Integer ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * 获取实例计费类型。目前只支持：PREPAID（预付费，即包年包月）。
     * @return InstanceChargeType 实例计费类型。目前只支持：PREPAID（预付费，即包年包月）。
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * 设置实例计费类型。目前只支持：PREPAID（预付费，即包年包月）。
     * @param InstanceChargeType 实例计费类型。目前只支持：PREPAID（预付费，即包年包月）。
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * 获取是否自动使用代金券。1（是），0（否），默认不使用。
     * @return AutoVoucher 是否自动使用代金券。1（是），0（否），默认不使用。
     */
    public Integer getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * 设置是否自动使用代金券。1（是），0（否），默认不使用。
     * @param AutoVoucher 是否自动使用代金券。1（是），0（否），默认不使用。
     */
    public void setAutoVoucher(Integer AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * 获取代金券ID列表，目前仅支持指定一张代金券。
     * @return VoucherIds 代金券ID列表，目前仅支持指定一张代金券。
     */
    public String [] getVoucherIds() {
        return this.VoucherIds;
    }

    /**
     * 设置代金券ID列表，目前仅支持指定一张代金券。
     * @param VoucherIds 代金券ID列表，目前仅支持指定一张代金券。
     */
    public void setVoucherIds(String [] VoucherIds) {
        this.VoucherIds = VoucherIds;
    }

    /**
     * 获取私有网络ID。
     * @return VpcId 私有网络ID。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置私有网络ID。
     * @param VpcId 私有网络ID。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取私有网络子网ID。
     * @return SubnetId 私有网络子网ID。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * 设置私有网络子网ID。
     * @param SubnetId 私有网络子网ID。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpecCode", this.SpecCode);
        this.setParamSimple(map, prefix + "DBVersion", this.DBVersion);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamArraySimple(map, prefix + "VoucherIds.", this.VoucherIds);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);

    }
}

