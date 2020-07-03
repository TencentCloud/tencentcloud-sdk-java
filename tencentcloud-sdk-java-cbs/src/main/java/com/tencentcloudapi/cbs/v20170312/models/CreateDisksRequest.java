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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDisksRequest extends AbstractModel{

    /**
    * 硬盘介质类型。取值范围：<br><li>CLOUD_BASIC：表示普通云硬盘<br><li>CLOUD_PREMIUM：表示高性能云硬盘<br><li>CLOUD_SSD：表示SSD云硬盘。
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 云硬盘计费类型。<br><li>PREPAID：预付费，即包年包月<br><li>POSTPAID_BY_HOUR：按小时后付费<br><li>CDCPAID：独享集群付费<br>各类型价格请参考云硬盘[价格总览](/document/product/362/2413)。
    */
    @SerializedName("DiskChargeType")
    @Expose
    private String DiskChargeType;

    /**
    * 实例所在的位置。通过该参数可以指定实例所属可用区，所属项目。若不指定项目，将在默认项目下进行创建。
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * 云盘显示名称。不传则默认为“未命名”。最大长度不能超60个字节。
    */
    @SerializedName("DiskName")
    @Expose
    private String DiskName;

    /**
    * 创建云硬盘数量，不传则默认为1。单次请求最多可创建的云盘数有限制，具体参见[云硬盘使用限制](https://cloud.tencent.com/doc/product/362/5145)。
    */
    @SerializedName("DiskCount")
    @Expose
    private Long DiskCount;

    /**
    * 预付费模式，即包年包月相关参数设置。通过该参数指定包年包月云盘的购买时长、是否设置自动续费等属性。<br>创建预付费云盘该参数必传，创建按小时后付费云盘无需传该参数。
    */
    @SerializedName("DiskChargePrepaid")
    @Expose
    private DiskChargePrepaid DiskChargePrepaid;

    /**
    * 云硬盘大小，单位为GB。<br><li>如果传入`SnapshotId`则可不传`DiskSize`，此时新建云盘的大小为快照大小<br><li>如果传入`SnapshotId`同时传入`DiskSize`，则云盘大小必须大于或等于快照大小<br><li>云盘大小取值范围参见云硬盘[产品分类](/document/product/362/2353)的说明。
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * 快照ID，如果传入则根据此快照创建云硬盘，快照类型必须为数据盘快照，可通过[DescribeSnapshots](/document/product/362/15647)接口查询快照，见输出参数DiskUsage解释。
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
    * 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * 传入该参数用于创建加密云盘，取值固定为ENCRYPT。
    */
    @SerializedName("Encrypt")
    @Expose
    private String Encrypt;

    /**
    * 云盘绑定的标签。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 可选参数，默认为False。传入True时，云盘将创建为共享型云盘。
    */
    @SerializedName("Shareable")
    @Expose
    private Boolean Shareable;

    /**
     * Get 硬盘介质类型。取值范围：<br><li>CLOUD_BASIC：表示普通云硬盘<br><li>CLOUD_PREMIUM：表示高性能云硬盘<br><li>CLOUD_SSD：表示SSD云硬盘。 
     * @return DiskType 硬盘介质类型。取值范围：<br><li>CLOUD_BASIC：表示普通云硬盘<br><li>CLOUD_PREMIUM：表示高性能云硬盘<br><li>CLOUD_SSD：表示SSD云硬盘。
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 硬盘介质类型。取值范围：<br><li>CLOUD_BASIC：表示普通云硬盘<br><li>CLOUD_PREMIUM：表示高性能云硬盘<br><li>CLOUD_SSD：表示SSD云硬盘。
     * @param DiskType 硬盘介质类型。取值范围：<br><li>CLOUD_BASIC：表示普通云硬盘<br><li>CLOUD_PREMIUM：表示高性能云硬盘<br><li>CLOUD_SSD：表示SSD云硬盘。
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get 云硬盘计费类型。<br><li>PREPAID：预付费，即包年包月<br><li>POSTPAID_BY_HOUR：按小时后付费<br><li>CDCPAID：独享集群付费<br>各类型价格请参考云硬盘[价格总览](/document/product/362/2413)。 
     * @return DiskChargeType 云硬盘计费类型。<br><li>PREPAID：预付费，即包年包月<br><li>POSTPAID_BY_HOUR：按小时后付费<br><li>CDCPAID：独享集群付费<br>各类型价格请参考云硬盘[价格总览](/document/product/362/2413)。
     */
    public String getDiskChargeType() {
        return this.DiskChargeType;
    }

    /**
     * Set 云硬盘计费类型。<br><li>PREPAID：预付费，即包年包月<br><li>POSTPAID_BY_HOUR：按小时后付费<br><li>CDCPAID：独享集群付费<br>各类型价格请参考云硬盘[价格总览](/document/product/362/2413)。
     * @param DiskChargeType 云硬盘计费类型。<br><li>PREPAID：预付费，即包年包月<br><li>POSTPAID_BY_HOUR：按小时后付费<br><li>CDCPAID：独享集群付费<br>各类型价格请参考云硬盘[价格总览](/document/product/362/2413)。
     */
    public void setDiskChargeType(String DiskChargeType) {
        this.DiskChargeType = DiskChargeType;
    }

    /**
     * Get 实例所在的位置。通过该参数可以指定实例所属可用区，所属项目。若不指定项目，将在默认项目下进行创建。 
     * @return Placement 实例所在的位置。通过该参数可以指定实例所属可用区，所属项目。若不指定项目，将在默认项目下进行创建。
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * Set 实例所在的位置。通过该参数可以指定实例所属可用区，所属项目。若不指定项目，将在默认项目下进行创建。
     * @param Placement 实例所在的位置。通过该参数可以指定实例所属可用区，所属项目。若不指定项目，将在默认项目下进行创建。
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * Get 云盘显示名称。不传则默认为“未命名”。最大长度不能超60个字节。 
     * @return DiskName 云盘显示名称。不传则默认为“未命名”。最大长度不能超60个字节。
     */
    public String getDiskName() {
        return this.DiskName;
    }

    /**
     * Set 云盘显示名称。不传则默认为“未命名”。最大长度不能超60个字节。
     * @param DiskName 云盘显示名称。不传则默认为“未命名”。最大长度不能超60个字节。
     */
    public void setDiskName(String DiskName) {
        this.DiskName = DiskName;
    }

    /**
     * Get 创建云硬盘数量，不传则默认为1。单次请求最多可创建的云盘数有限制，具体参见[云硬盘使用限制](https://cloud.tencent.com/doc/product/362/5145)。 
     * @return DiskCount 创建云硬盘数量，不传则默认为1。单次请求最多可创建的云盘数有限制，具体参见[云硬盘使用限制](https://cloud.tencent.com/doc/product/362/5145)。
     */
    public Long getDiskCount() {
        return this.DiskCount;
    }

    /**
     * Set 创建云硬盘数量，不传则默认为1。单次请求最多可创建的云盘数有限制，具体参见[云硬盘使用限制](https://cloud.tencent.com/doc/product/362/5145)。
     * @param DiskCount 创建云硬盘数量，不传则默认为1。单次请求最多可创建的云盘数有限制，具体参见[云硬盘使用限制](https://cloud.tencent.com/doc/product/362/5145)。
     */
    public void setDiskCount(Long DiskCount) {
        this.DiskCount = DiskCount;
    }

    /**
     * Get 预付费模式，即包年包月相关参数设置。通过该参数指定包年包月云盘的购买时长、是否设置自动续费等属性。<br>创建预付费云盘该参数必传，创建按小时后付费云盘无需传该参数。 
     * @return DiskChargePrepaid 预付费模式，即包年包月相关参数设置。通过该参数指定包年包月云盘的购买时长、是否设置自动续费等属性。<br>创建预付费云盘该参数必传，创建按小时后付费云盘无需传该参数。
     */
    public DiskChargePrepaid getDiskChargePrepaid() {
        return this.DiskChargePrepaid;
    }

    /**
     * Set 预付费模式，即包年包月相关参数设置。通过该参数指定包年包月云盘的购买时长、是否设置自动续费等属性。<br>创建预付费云盘该参数必传，创建按小时后付费云盘无需传该参数。
     * @param DiskChargePrepaid 预付费模式，即包年包月相关参数设置。通过该参数指定包年包月云盘的购买时长、是否设置自动续费等属性。<br>创建预付费云盘该参数必传，创建按小时后付费云盘无需传该参数。
     */
    public void setDiskChargePrepaid(DiskChargePrepaid DiskChargePrepaid) {
        this.DiskChargePrepaid = DiskChargePrepaid;
    }

    /**
     * Get 云硬盘大小，单位为GB。<br><li>如果传入`SnapshotId`则可不传`DiskSize`，此时新建云盘的大小为快照大小<br><li>如果传入`SnapshotId`同时传入`DiskSize`，则云盘大小必须大于或等于快照大小<br><li>云盘大小取值范围参见云硬盘[产品分类](/document/product/362/2353)的说明。 
     * @return DiskSize 云硬盘大小，单位为GB。<br><li>如果传入`SnapshotId`则可不传`DiskSize`，此时新建云盘的大小为快照大小<br><li>如果传入`SnapshotId`同时传入`DiskSize`，则云盘大小必须大于或等于快照大小<br><li>云盘大小取值范围参见云硬盘[产品分类](/document/product/362/2353)的说明。
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 云硬盘大小，单位为GB。<br><li>如果传入`SnapshotId`则可不传`DiskSize`，此时新建云盘的大小为快照大小<br><li>如果传入`SnapshotId`同时传入`DiskSize`，则云盘大小必须大于或等于快照大小<br><li>云盘大小取值范围参见云硬盘[产品分类](/document/product/362/2353)的说明。
     * @param DiskSize 云硬盘大小，单位为GB。<br><li>如果传入`SnapshotId`则可不传`DiskSize`，此时新建云盘的大小为快照大小<br><li>如果传入`SnapshotId`同时传入`DiskSize`，则云盘大小必须大于或等于快照大小<br><li>云盘大小取值范围参见云硬盘[产品分类](/document/product/362/2353)的说明。
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get 快照ID，如果传入则根据此快照创建云硬盘，快照类型必须为数据盘快照，可通过[DescribeSnapshots](/document/product/362/15647)接口查询快照，见输出参数DiskUsage解释。 
     * @return SnapshotId 快照ID，如果传入则根据此快照创建云硬盘，快照类型必须为数据盘快照，可通过[DescribeSnapshots](/document/product/362/15647)接口查询快照，见输出参数DiskUsage解释。
     */
    public String getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set 快照ID，如果传入则根据此快照创建云硬盘，快照类型必须为数据盘快照，可通过[DescribeSnapshots](/document/product/362/15647)接口查询快照，见输出参数DiskUsage解释。
     * @param SnapshotId 快照ID，如果传入则根据此快照创建云硬盘，快照类型必须为数据盘快照，可通过[DescribeSnapshots](/document/product/362/15647)接口查询快照，见输出参数DiskUsage解释。
     */
    public void setSnapshotId(String SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * Get 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。 
     * @return ClientToken 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
     * @param ClientToken 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get 传入该参数用于创建加密云盘，取值固定为ENCRYPT。 
     * @return Encrypt 传入该参数用于创建加密云盘，取值固定为ENCRYPT。
     */
    public String getEncrypt() {
        return this.Encrypt;
    }

    /**
     * Set 传入该参数用于创建加密云盘，取值固定为ENCRYPT。
     * @param Encrypt 传入该参数用于创建加密云盘，取值固定为ENCRYPT。
     */
    public void setEncrypt(String Encrypt) {
        this.Encrypt = Encrypt;
    }

    /**
     * Get 云盘绑定的标签。 
     * @return Tags 云盘绑定的标签。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 云盘绑定的标签。
     * @param Tags 云盘绑定的标签。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 可选参数，默认为False。传入True时，云盘将创建为共享型云盘。 
     * @return Shareable 可选参数，默认为False。传入True时，云盘将创建为共享型云盘。
     */
    public Boolean getShareable() {
        return this.Shareable;
    }

    /**
     * Set 可选参数，默认为False。传入True时，云盘将创建为共享型云盘。
     * @param Shareable 可选参数，默认为False。传入True时，云盘将创建为共享型云盘。
     */
    public void setShareable(Boolean Shareable) {
        this.Shareable = Shareable;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskChargeType", this.DiskChargeType);
        this.setParamObj(map, prefix + "Placement.", this.Placement);
        this.setParamSimple(map, prefix + "DiskName", this.DiskName);
        this.setParamSimple(map, prefix + "DiskCount", this.DiskCount);
        this.setParamObj(map, prefix + "DiskChargePrepaid.", this.DiskChargePrepaid);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "SnapshotId", this.SnapshotId);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamSimple(map, prefix + "Encrypt", this.Encrypt);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Shareable", this.Shareable);

    }
}

