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

public class CreateDBInstancesRequest extends AbstractModel{

    /**
    * 售卖规格ID。该参数可以通过调用DescribeProductConfig的返回值中的SpecCode字段来获取。
    */
    @SerializedName("SpecCode")
    @Expose
    private String SpecCode;

    /**
    * PostgreSQL内核版本，目前支持：9.3.5、9.5.4、10.4三种版本。
    */
    @SerializedName("DBVersion")
    @Expose
    private String DBVersion;

    /**
    * 实例容量大小，单位：GB。
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * 一次性购买的实例数量。取值1-100
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * 购买时长，单位：月。目前只支持1,2,3,4,5,6,7,8,9,10,11,12,24,36这些值，按量计费模式下该参数传1。
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

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
    private Long ProjectId;

    /**
    * 实例计费类型。目前支持：PREPAID（预付费，即包年包月），POSTPAID_BY_HOUR（后付费，即按量计费）。
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * 是否自动使用代金券。1（是），0（否），默认不使用。
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

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
    * 续费标记：0-正常续费（默认）；1-自动续费；
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * 活动ID
    */
    @SerializedName("ActivityId")
    @Expose
    private Long ActivityId;

    /**
    * 实例名(后续支持)
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 是否需要支持Ipv6，1：是，0：否
    */
    @SerializedName("NeedSupportIpv6")
    @Expose
    private Long NeedSupportIpv6;

    /**
    * 实例需要绑定的Tag信息，默认为空
    */
    @SerializedName("TagList")
    @Expose
    private Tag [] TagList;

    /**
     * Get 售卖规格ID。该参数可以通过调用DescribeProductConfig的返回值中的SpecCode字段来获取。 
     * @return SpecCode 售卖规格ID。该参数可以通过调用DescribeProductConfig的返回值中的SpecCode字段来获取。
     */
    public String getSpecCode() {
        return this.SpecCode;
    }

    /**
     * Set 售卖规格ID。该参数可以通过调用DescribeProductConfig的返回值中的SpecCode字段来获取。
     * @param SpecCode 售卖规格ID。该参数可以通过调用DescribeProductConfig的返回值中的SpecCode字段来获取。
     */
    public void setSpecCode(String SpecCode) {
        this.SpecCode = SpecCode;
    }

    /**
     * Get PostgreSQL内核版本，目前支持：9.3.5、9.5.4、10.4三种版本。 
     * @return DBVersion PostgreSQL内核版本，目前支持：9.3.5、9.5.4、10.4三种版本。
     */
    public String getDBVersion() {
        return this.DBVersion;
    }

    /**
     * Set PostgreSQL内核版本，目前支持：9.3.5、9.5.4、10.4三种版本。
     * @param DBVersion PostgreSQL内核版本，目前支持：9.3.5、9.5.4、10.4三种版本。
     */
    public void setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
    }

    /**
     * Get 实例容量大小，单位：GB。 
     * @return Storage 实例容量大小，单位：GB。
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set 实例容量大小，单位：GB。
     * @param Storage 实例容量大小，单位：GB。
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get 一次性购买的实例数量。取值1-100 
     * @return InstanceCount 一次性购买的实例数量。取值1-100
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set 一次性购买的实例数量。取值1-100
     * @param InstanceCount 一次性购买的实例数量。取值1-100
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get 购买时长，单位：月。目前只支持1,2,3,4,5,6,7,8,9,10,11,12,24,36这些值，按量计费模式下该参数传1。 
     * @return Period 购买时长，单位：月。目前只支持1,2,3,4,5,6,7,8,9,10,11,12,24,36这些值，按量计费模式下该参数传1。
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 购买时长，单位：月。目前只支持1,2,3,4,5,6,7,8,9,10,11,12,24,36这些值，按量计费模式下该参数传1。
     * @param Period 购买时长，单位：月。目前只支持1,2,3,4,5,6,7,8,9,10,11,12,24,36这些值，按量计费模式下该参数传1。
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 可用区ID。该参数可以通过调用 DescribeZones 接口的返回值中的Zone字段来获取。 
     * @return Zone 可用区ID。该参数可以通过调用 DescribeZones 接口的返回值中的Zone字段来获取。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区ID。该参数可以通过调用 DescribeZones 接口的返回值中的Zone字段来获取。
     * @param Zone 可用区ID。该参数可以通过调用 DescribeZones 接口的返回值中的Zone字段来获取。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 项目ID。 
     * @return ProjectId 项目ID。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID。
     * @param ProjectId 项目ID。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 实例计费类型。目前支持：PREPAID（预付费，即包年包月），POSTPAID_BY_HOUR（后付费，即按量计费）。 
     * @return InstanceChargeType 实例计费类型。目前支持：PREPAID（预付费，即包年包月），POSTPAID_BY_HOUR（后付费，即按量计费）。
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set 实例计费类型。目前支持：PREPAID（预付费，即包年包月），POSTPAID_BY_HOUR（后付费，即按量计费）。
     * @param InstanceChargeType 实例计费类型。目前支持：PREPAID（预付费，即包年包月），POSTPAID_BY_HOUR（后付费，即按量计费）。
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get 是否自动使用代金券。1（是），0（否），默认不使用。 
     * @return AutoVoucher 是否自动使用代金券。1（是），0（否），默认不使用。
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set 是否自动使用代金券。1（是），0（否），默认不使用。
     * @param AutoVoucher 是否自动使用代金券。1（是），0（否），默认不使用。
     */
    public void setAutoVoucher(Long AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get 代金券ID列表，目前仅支持指定一张代金券。 
     * @return VoucherIds 代金券ID列表，目前仅支持指定一张代金券。
     */
    public String [] getVoucherIds() {
        return this.VoucherIds;
    }

    /**
     * Set 代金券ID列表，目前仅支持指定一张代金券。
     * @param VoucherIds 代金券ID列表，目前仅支持指定一张代金券。
     */
    public void setVoucherIds(String [] VoucherIds) {
        this.VoucherIds = VoucherIds;
    }

    /**
     * Get 私有网络ID。 
     * @return VpcId 私有网络ID。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络ID。
     * @param VpcId 私有网络ID。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 私有网络子网ID。 
     * @return SubnetId 私有网络子网ID。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 私有网络子网ID。
     * @param SubnetId 私有网络子网ID。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 续费标记：0-正常续费（默认）；1-自动续费； 
     * @return AutoRenewFlag 续费标记：0-正常续费（默认）；1-自动续费；
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 续费标记：0-正常续费（默认）；1-自动续费；
     * @param AutoRenewFlag 续费标记：0-正常续费（默认）；1-自动续费；
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get 活动ID 
     * @return ActivityId 活动ID
     */
    public Long getActivityId() {
        return this.ActivityId;
    }

    /**
     * Set 活动ID
     * @param ActivityId 活动ID
     */
    public void setActivityId(Long ActivityId) {
        this.ActivityId = ActivityId;
    }

    /**
     * Get 实例名(后续支持) 
     * @return Name 实例名(后续支持)
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 实例名(后续支持)
     * @param Name 实例名(后续支持)
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 是否需要支持Ipv6，1：是，0：否 
     * @return NeedSupportIpv6 是否需要支持Ipv6，1：是，0：否
     */
    public Long getNeedSupportIpv6() {
        return this.NeedSupportIpv6;
    }

    /**
     * Set 是否需要支持Ipv6，1：是，0：否
     * @param NeedSupportIpv6 是否需要支持Ipv6，1：是，0：否
     */
    public void setNeedSupportIpv6(Long NeedSupportIpv6) {
        this.NeedSupportIpv6 = NeedSupportIpv6;
    }

    /**
     * Get 实例需要绑定的Tag信息，默认为空 
     * @return TagList 实例需要绑定的Tag信息，默认为空
     */
    public Tag [] getTagList() {
        return this.TagList;
    }

    /**
     * Set 实例需要绑定的Tag信息，默认为空
     * @param TagList 实例需要绑定的Tag信息，默认为空
     */
    public void setTagList(Tag [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Internal implementation, normal users should not use it.
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
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "ActivityId", this.ActivityId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "NeedSupportIpv6", this.NeedSupportIpv6);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);

    }
}

