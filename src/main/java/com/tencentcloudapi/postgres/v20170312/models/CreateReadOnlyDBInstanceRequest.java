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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateReadOnlyDBInstanceRequest extends AbstractModel {

    /**
    * <p>实例所属主可用区， 如：ap-guangzhou-3；<br>可用区信息可以通过调用 <a href="https://cloud.tencent.com/document/api/409/16769">DescribeZones</a> 接口的返回值中的Zone字段来获取。</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>只读实例的主实例ID。可通过<a href="https://cloud.tencent.com/document/api/409/16773">DescribeDBInstances</a>接口获取</p>
    */
    @SerializedName("MasterDBInstanceId")
    @Expose
    private String MasterDBInstanceId;

    /**
    * <p>售卖规格码。该参数可以通过调用<a href="https://cloud.tencent.com/document/api/409/89019">DescribeClasses</a>的返回值中的SpecCode字段来获取。</p>
    */
    @SerializedName("SpecCode")
    @Expose
    private String SpecCode;

    /**
    * <p>实例硬盘容量大小，单位：GB。该参数的设置步长为10。</p>
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * <p>购买实例数量，取值范围：[1-6]。购买支持最大数量6个。</p>
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * <p>购买时长，单位：月。</p><li>预付费：支持1,2,3,4,5,6,7,8,9,10,11,12,24,36</li><li>后付费：只支持1</li>
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * <p>私有网络ID，形如vpc-xxxxxxxx（该参数当前必传）。有效的VpcId可通过登录控制台查询；也可以调用接口 <a href="https://cloud.tencent.com/document/api/215/1372">DescribeVpcEx</a> ，从接口返回中的unVpcId字段获取。</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>私有网络子网ID，形如subnet-xxxxxxxx（该参数当前必传）。有效的私有网络子网ID可通过登录控制台查询；也可以调用接口 <a href="https://cloud.tencent.com/document/api/215/15784">DescribeSubnets </a>，从接口返回中的unSubnetId字段获取。</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>实例计费类型，目前支持：</p><li>PREPAID：预付费，即包年包月。</li><li>POSTPAID_BY_HOUR：后付费，即按量计费。</li>默认值：PREPAID。如果主实例为后付费，只读实例必须也为后付费。
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * <p>是否自动使用代金券：</p><li>0：否</li><li>1：是</li>默认值：0
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

    /**
    * <p>代金券ID列表，目前仅支持指定一张代金券。</p>
    */
    @SerializedName("VoucherIds")
    @Expose
    private String [] VoucherIds;

    /**
    * <p>续费标记：</p><li>0：手动续费</li><li>1：自动续费</li>默认值：0
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * <p>项目ID。默认值为0，表示归属默认项目。</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>优惠活动ID</p>
    */
    @SerializedName("ActivityId")
    @Expose
    private Long ActivityId;

    /**
    * <p>只读组ID。</p>
    */
    @SerializedName("ReadOnlyGroupId")
    @Expose
    private String ReadOnlyGroupId;

    /**
    * <p>实例需要绑定的Tag信息，默认为空；可以通过调用 <a href="https://cloud.tencent.com/document/api/651/35316">DescribeTags</a> 返回值中的 Tags 字段来获取。</p>
    */
    @SerializedName("TagList")
    @Expose
    private Tag TagList;

    /**
    * <p>实例所属安全组，该参数可以通过调用 <a href="https://cloud.tencent.com/document/api/215/15808">DescribeSecurityGroups</a> 的返回值中的sgId字段来获取。若不指定该参数，则绑定默认安全组。</p>
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * <p>是否需要支持Ipv6：</p><li>0：否</li><li>1：是</li>默认值：0
    */
    @SerializedName("NeedSupportIpv6")
    @Expose
    private Long NeedSupportIpv6;

    /**
    * <p>实例名。仅支持长度小于60的中文/英文/数字/&quot;_&quot;/&quot;-&quot;</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>不再需要指定，内核版本号与主实例保持一致</p>
    */
    @SerializedName("DBVersion")
    @Expose
    private String DBVersion;

    /**
    * <p>专属集群ID</p>
    */
    @SerializedName("DedicatedClusterId")
    @Expose
    private String DedicatedClusterId;

    /**
    * <p>实例是否开启删除保护: true-开启删除保护；false-关闭删除保护。</p>
    */
    @SerializedName("DeletionProtection")
    @Expose
    private Boolean DeletionProtection;

    /**
     * Get <p>实例所属主可用区， 如：ap-guangzhou-3；<br>可用区信息可以通过调用 <a href="https://cloud.tencent.com/document/api/409/16769">DescribeZones</a> 接口的返回值中的Zone字段来获取。</p> 
     * @return Zone <p>实例所属主可用区， 如：ap-guangzhou-3；<br>可用区信息可以通过调用 <a href="https://cloud.tencent.com/document/api/409/16769">DescribeZones</a> 接口的返回值中的Zone字段来获取。</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>实例所属主可用区， 如：ap-guangzhou-3；<br>可用区信息可以通过调用 <a href="https://cloud.tencent.com/document/api/409/16769">DescribeZones</a> 接口的返回值中的Zone字段来获取。</p>
     * @param Zone <p>实例所属主可用区， 如：ap-guangzhou-3；<br>可用区信息可以通过调用 <a href="https://cloud.tencent.com/document/api/409/16769">DescribeZones</a> 接口的返回值中的Zone字段来获取。</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>只读实例的主实例ID。可通过<a href="https://cloud.tencent.com/document/api/409/16773">DescribeDBInstances</a>接口获取</p> 
     * @return MasterDBInstanceId <p>只读实例的主实例ID。可通过<a href="https://cloud.tencent.com/document/api/409/16773">DescribeDBInstances</a>接口获取</p>
     */
    public String getMasterDBInstanceId() {
        return this.MasterDBInstanceId;
    }

    /**
     * Set <p>只读实例的主实例ID。可通过<a href="https://cloud.tencent.com/document/api/409/16773">DescribeDBInstances</a>接口获取</p>
     * @param MasterDBInstanceId <p>只读实例的主实例ID。可通过<a href="https://cloud.tencent.com/document/api/409/16773">DescribeDBInstances</a>接口获取</p>
     */
    public void setMasterDBInstanceId(String MasterDBInstanceId) {
        this.MasterDBInstanceId = MasterDBInstanceId;
    }

    /**
     * Get <p>售卖规格码。该参数可以通过调用<a href="https://cloud.tencent.com/document/api/409/89019">DescribeClasses</a>的返回值中的SpecCode字段来获取。</p> 
     * @return SpecCode <p>售卖规格码。该参数可以通过调用<a href="https://cloud.tencent.com/document/api/409/89019">DescribeClasses</a>的返回值中的SpecCode字段来获取。</p>
     */
    public String getSpecCode() {
        return this.SpecCode;
    }

    /**
     * Set <p>售卖规格码。该参数可以通过调用<a href="https://cloud.tencent.com/document/api/409/89019">DescribeClasses</a>的返回值中的SpecCode字段来获取。</p>
     * @param SpecCode <p>售卖规格码。该参数可以通过调用<a href="https://cloud.tencent.com/document/api/409/89019">DescribeClasses</a>的返回值中的SpecCode字段来获取。</p>
     */
    public void setSpecCode(String SpecCode) {
        this.SpecCode = SpecCode;
    }

    /**
     * Get <p>实例硬盘容量大小，单位：GB。该参数的设置步长为10。</p> 
     * @return Storage <p>实例硬盘容量大小，单位：GB。该参数的设置步长为10。</p>
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set <p>实例硬盘容量大小，单位：GB。该参数的设置步长为10。</p>
     * @param Storage <p>实例硬盘容量大小，单位：GB。该参数的设置步长为10。</p>
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get <p>购买实例数量，取值范围：[1-6]。购买支持最大数量6个。</p> 
     * @return InstanceCount <p>购买实例数量，取值范围：[1-6]。购买支持最大数量6个。</p>
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set <p>购买实例数量，取值范围：[1-6]。购买支持最大数量6个。</p>
     * @param InstanceCount <p>购买实例数量，取值范围：[1-6]。购买支持最大数量6个。</p>
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get <p>购买时长，单位：月。</p><li>预付费：支持1,2,3,4,5,6,7,8,9,10,11,12,24,36</li><li>后付费：只支持1</li> 
     * @return Period <p>购买时长，单位：月。</p><li>预付费：支持1,2,3,4,5,6,7,8,9,10,11,12,24,36</li><li>后付费：只支持1</li>
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>购买时长，单位：月。</p><li>预付费：支持1,2,3,4,5,6,7,8,9,10,11,12,24,36</li><li>后付费：只支持1</li>
     * @param Period <p>购买时长，单位：月。</p><li>预付费：支持1,2,3,4,5,6,7,8,9,10,11,12,24,36</li><li>后付费：只支持1</li>
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get <p>私有网络ID，形如vpc-xxxxxxxx（该参数当前必传）。有效的VpcId可通过登录控制台查询；也可以调用接口 <a href="https://cloud.tencent.com/document/api/215/1372">DescribeVpcEx</a> ，从接口返回中的unVpcId字段获取。</p> 
     * @return VpcId <p>私有网络ID，形如vpc-xxxxxxxx（该参数当前必传）。有效的VpcId可通过登录控制台查询；也可以调用接口 <a href="https://cloud.tencent.com/document/api/215/1372">DescribeVpcEx</a> ，从接口返回中的unVpcId字段获取。</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>私有网络ID，形如vpc-xxxxxxxx（该参数当前必传）。有效的VpcId可通过登录控制台查询；也可以调用接口 <a href="https://cloud.tencent.com/document/api/215/1372">DescribeVpcEx</a> ，从接口返回中的unVpcId字段获取。</p>
     * @param VpcId <p>私有网络ID，形如vpc-xxxxxxxx（该参数当前必传）。有效的VpcId可通过登录控制台查询；也可以调用接口 <a href="https://cloud.tencent.com/document/api/215/1372">DescribeVpcEx</a> ，从接口返回中的unVpcId字段获取。</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>私有网络子网ID，形如subnet-xxxxxxxx（该参数当前必传）。有效的私有网络子网ID可通过登录控制台查询；也可以调用接口 <a href="https://cloud.tencent.com/document/api/215/15784">DescribeSubnets </a>，从接口返回中的unSubnetId字段获取。</p> 
     * @return SubnetId <p>私有网络子网ID，形如subnet-xxxxxxxx（该参数当前必传）。有效的私有网络子网ID可通过登录控制台查询；也可以调用接口 <a href="https://cloud.tencent.com/document/api/215/15784">DescribeSubnets </a>，从接口返回中的unSubnetId字段获取。</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>私有网络子网ID，形如subnet-xxxxxxxx（该参数当前必传）。有效的私有网络子网ID可通过登录控制台查询；也可以调用接口 <a href="https://cloud.tencent.com/document/api/215/15784">DescribeSubnets </a>，从接口返回中的unSubnetId字段获取。</p>
     * @param SubnetId <p>私有网络子网ID，形如subnet-xxxxxxxx（该参数当前必传）。有效的私有网络子网ID可通过登录控制台查询；也可以调用接口 <a href="https://cloud.tencent.com/document/api/215/15784">DescribeSubnets </a>，从接口返回中的unSubnetId字段获取。</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>实例计费类型，目前支持：</p><li>PREPAID：预付费，即包年包月。</li><li>POSTPAID_BY_HOUR：后付费，即按量计费。</li>默认值：PREPAID。如果主实例为后付费，只读实例必须也为后付费。 
     * @return InstanceChargeType <p>实例计费类型，目前支持：</p><li>PREPAID：预付费，即包年包月。</li><li>POSTPAID_BY_HOUR：后付费，即按量计费。</li>默认值：PREPAID。如果主实例为后付费，只读实例必须也为后付费。
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set <p>实例计费类型，目前支持：</p><li>PREPAID：预付费，即包年包月。</li><li>POSTPAID_BY_HOUR：后付费，即按量计费。</li>默认值：PREPAID。如果主实例为后付费，只读实例必须也为后付费。
     * @param InstanceChargeType <p>实例计费类型，目前支持：</p><li>PREPAID：预付费，即包年包月。</li><li>POSTPAID_BY_HOUR：后付费，即按量计费。</li>默认值：PREPAID。如果主实例为后付费，只读实例必须也为后付费。
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get <p>是否自动使用代金券：</p><li>0：否</li><li>1：是</li>默认值：0 
     * @return AutoVoucher <p>是否自动使用代金券：</p><li>0：否</li><li>1：是</li>默认值：0
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set <p>是否自动使用代金券：</p><li>0：否</li><li>1：是</li>默认值：0
     * @param AutoVoucher <p>是否自动使用代金券：</p><li>0：否</li><li>1：是</li>默认值：0
     */
    public void setAutoVoucher(Long AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get <p>代金券ID列表，目前仅支持指定一张代金券。</p> 
     * @return VoucherIds <p>代金券ID列表，目前仅支持指定一张代金券。</p>
     */
    public String [] getVoucherIds() {
        return this.VoucherIds;
    }

    /**
     * Set <p>代金券ID列表，目前仅支持指定一张代金券。</p>
     * @param VoucherIds <p>代金券ID列表，目前仅支持指定一张代金券。</p>
     */
    public void setVoucherIds(String [] VoucherIds) {
        this.VoucherIds = VoucherIds;
    }

    /**
     * Get <p>续费标记：</p><li>0：手动续费</li><li>1：自动续费</li>默认值：0 
     * @return AutoRenewFlag <p>续费标记：</p><li>0：手动续费</li><li>1：自动续费</li>默认值：0
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set <p>续费标记：</p><li>0：手动续费</li><li>1：自动续费</li>默认值：0
     * @param AutoRenewFlag <p>续费标记：</p><li>0：手动续费</li><li>1：自动续费</li>默认值：0
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get <p>项目ID。默认值为0，表示归属默认项目。</p> 
     * @return ProjectId <p>项目ID。默认值为0，表示归属默认项目。</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目ID。默认值为0，表示归属默认项目。</p>
     * @param ProjectId <p>项目ID。默认值为0，表示归属默认项目。</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>优惠活动ID</p> 
     * @return ActivityId <p>优惠活动ID</p>
     */
    public Long getActivityId() {
        return this.ActivityId;
    }

    /**
     * Set <p>优惠活动ID</p>
     * @param ActivityId <p>优惠活动ID</p>
     */
    public void setActivityId(Long ActivityId) {
        this.ActivityId = ActivityId;
    }

    /**
     * Get <p>只读组ID。</p> 
     * @return ReadOnlyGroupId <p>只读组ID。</p>
     */
    public String getReadOnlyGroupId() {
        return this.ReadOnlyGroupId;
    }

    /**
     * Set <p>只读组ID。</p>
     * @param ReadOnlyGroupId <p>只读组ID。</p>
     */
    public void setReadOnlyGroupId(String ReadOnlyGroupId) {
        this.ReadOnlyGroupId = ReadOnlyGroupId;
    }

    /**
     * Get <p>实例需要绑定的Tag信息，默认为空；可以通过调用 <a href="https://cloud.tencent.com/document/api/651/35316">DescribeTags</a> 返回值中的 Tags 字段来获取。</p> 
     * @return TagList <p>实例需要绑定的Tag信息，默认为空；可以通过调用 <a href="https://cloud.tencent.com/document/api/651/35316">DescribeTags</a> 返回值中的 Tags 字段来获取。</p>
     */
    public Tag getTagList() {
        return this.TagList;
    }

    /**
     * Set <p>实例需要绑定的Tag信息，默认为空；可以通过调用 <a href="https://cloud.tencent.com/document/api/651/35316">DescribeTags</a> 返回值中的 Tags 字段来获取。</p>
     * @param TagList <p>实例需要绑定的Tag信息，默认为空；可以通过调用 <a href="https://cloud.tencent.com/document/api/651/35316">DescribeTags</a> 返回值中的 Tags 字段来获取。</p>
     */
    public void setTagList(Tag TagList) {
        this.TagList = TagList;
    }

    /**
     * Get <p>实例所属安全组，该参数可以通过调用 <a href="https://cloud.tencent.com/document/api/215/15808">DescribeSecurityGroups</a> 的返回值中的sgId字段来获取。若不指定该参数，则绑定默认安全组。</p> 
     * @return SecurityGroupIds <p>实例所属安全组，该参数可以通过调用 <a href="https://cloud.tencent.com/document/api/215/15808">DescribeSecurityGroups</a> 的返回值中的sgId字段来获取。若不指定该参数，则绑定默认安全组。</p>
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set <p>实例所属安全组，该参数可以通过调用 <a href="https://cloud.tencent.com/document/api/215/15808">DescribeSecurityGroups</a> 的返回值中的sgId字段来获取。若不指定该参数，则绑定默认安全组。</p>
     * @param SecurityGroupIds <p>实例所属安全组，该参数可以通过调用 <a href="https://cloud.tencent.com/document/api/215/15808">DescribeSecurityGroups</a> 的返回值中的sgId字段来获取。若不指定该参数，则绑定默认安全组。</p>
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get <p>是否需要支持Ipv6：</p><li>0：否</li><li>1：是</li>默认值：0 
     * @return NeedSupportIpv6 <p>是否需要支持Ipv6：</p><li>0：否</li><li>1：是</li>默认值：0
     */
    public Long getNeedSupportIpv6() {
        return this.NeedSupportIpv6;
    }

    /**
     * Set <p>是否需要支持Ipv6：</p><li>0：否</li><li>1：是</li>默认值：0
     * @param NeedSupportIpv6 <p>是否需要支持Ipv6：</p><li>0：否</li><li>1：是</li>默认值：0
     */
    public void setNeedSupportIpv6(Long NeedSupportIpv6) {
        this.NeedSupportIpv6 = NeedSupportIpv6;
    }

    /**
     * Get <p>实例名。仅支持长度小于60的中文/英文/数字/&quot;_&quot;/&quot;-&quot;</p> 
     * @return Name <p>实例名。仅支持长度小于60的中文/英文/数字/&quot;_&quot;/&quot;-&quot;</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>实例名。仅支持长度小于60的中文/英文/数字/&quot;_&quot;/&quot;-&quot;</p>
     * @param Name <p>实例名。仅支持长度小于60的中文/英文/数字/&quot;_&quot;/&quot;-&quot;</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>不再需要指定，内核版本号与主实例保持一致</p> 
     * @return DBVersion <p>不再需要指定，内核版本号与主实例保持一致</p>
     * @deprecated
     */
    @Deprecated
    public String getDBVersion() {
        return this.DBVersion;
    }

    /**
     * Set <p>不再需要指定，内核版本号与主实例保持一致</p>
     * @param DBVersion <p>不再需要指定，内核版本号与主实例保持一致</p>
     * @deprecated
     */
    @Deprecated
    public void setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
    }

    /**
     * Get <p>专属集群ID</p> 
     * @return DedicatedClusterId <p>专属集群ID</p>
     */
    public String getDedicatedClusterId() {
        return this.DedicatedClusterId;
    }

    /**
     * Set <p>专属集群ID</p>
     * @param DedicatedClusterId <p>专属集群ID</p>
     */
    public void setDedicatedClusterId(String DedicatedClusterId) {
        this.DedicatedClusterId = DedicatedClusterId;
    }

    /**
     * Get <p>实例是否开启删除保护: true-开启删除保护；false-关闭删除保护。</p> 
     * @return DeletionProtection <p>实例是否开启删除保护: true-开启删除保护；false-关闭删除保护。</p>
     */
    public Boolean getDeletionProtection() {
        return this.DeletionProtection;
    }

    /**
     * Set <p>实例是否开启删除保护: true-开启删除保护；false-关闭删除保护。</p>
     * @param DeletionProtection <p>实例是否开启删除保护: true-开启删除保护；false-关闭删除保护。</p>
     */
    public void setDeletionProtection(Boolean DeletionProtection) {
        this.DeletionProtection = DeletionProtection;
    }

    public CreateReadOnlyDBInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateReadOnlyDBInstanceRequest(CreateReadOnlyDBInstanceRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.MasterDBInstanceId != null) {
            this.MasterDBInstanceId = new String(source.MasterDBInstanceId);
        }
        if (source.SpecCode != null) {
            this.SpecCode = new String(source.SpecCode);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Long(source.AutoVoucher);
        }
        if (source.VoucherIds != null) {
            this.VoucherIds = new String[source.VoucherIds.length];
            for (int i = 0; i < source.VoucherIds.length; i++) {
                this.VoucherIds[i] = new String(source.VoucherIds[i]);
            }
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.ActivityId != null) {
            this.ActivityId = new Long(source.ActivityId);
        }
        if (source.ReadOnlyGroupId != null) {
            this.ReadOnlyGroupId = new String(source.ReadOnlyGroupId);
        }
        if (source.TagList != null) {
            this.TagList = new Tag(source.TagList);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.NeedSupportIpv6 != null) {
            this.NeedSupportIpv6 = new Long(source.NeedSupportIpv6);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DBVersion != null) {
            this.DBVersion = new String(source.DBVersion);
        }
        if (source.DedicatedClusterId != null) {
            this.DedicatedClusterId = new String(source.DedicatedClusterId);
        }
        if (source.DeletionProtection != null) {
            this.DeletionProtection = new Boolean(source.DeletionProtection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "MasterDBInstanceId", this.MasterDBInstanceId);
        this.setParamSimple(map, prefix + "SpecCode", this.SpecCode);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamArraySimple(map, prefix + "VoucherIds.", this.VoucherIds);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ActivityId", this.ActivityId);
        this.setParamSimple(map, prefix + "ReadOnlyGroupId", this.ReadOnlyGroupId);
        this.setParamObj(map, prefix + "TagList.", this.TagList);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamSimple(map, prefix + "NeedSupportIpv6", this.NeedSupportIpv6);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DBVersion", this.DBVersion);
        this.setParamSimple(map, prefix + "DedicatedClusterId", this.DedicatedClusterId);
        this.setParamSimple(map, prefix + "DeletionProtection", this.DeletionProtection);

    }
}

