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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBPriceRequest extends AbstractModel {

    /**
    * <p>实例时长，单位：月，最小值 1，最大值为 36；查询按量计费价格时，该字段无效。</p>
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * <p>可用区信息，格式如 &quot;ap-guangzhou-2&quot;。具体能设置的值请通过 <a href="https://cloud.tencent.com/document/api/236/17229">DescribeDBZoneConfig</a> 接口查询。InstanceId为空时该参数为必填项。</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>实例数量，默认值为 1，最小值 1，最大值为 100。InstanceId为空时该参数为必填项。</p>
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * <p>实例内存大小，单位：MB。InstanceId 为空时该参数为必填项。为保证传入值有效，请使用 <a href="https://cloud.tencent.com/document/product/236/17229">获取云数据库可售卖规格</a> 接口获取可售卖的实例内存大小范围。</p>
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>实例硬盘大小，单位：GB。InstanceId 为空时该参数为必填项。为保证传入值有效，请使用 <a href="https://cloud.tencent.com/document/product/236/17229">获取云数据库可售卖规格</a> 接口获取可售卖的硬盘大小范围。</p>
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
    * <p>实例类型，默认为 master，支持值包括：master - 表示主实例，ro - 表示只读实例，dr - 表示灾备实例。InstanceId为空时该参数为必填项。</p>
    */
    @SerializedName("InstanceRole")
    @Expose
    private String InstanceRole;

    /**
    * <p>付费类型，支持值包括：PRE_PAID - 包年包月，HOUR_PAID - 按量计费。InstanceId为空时该参数为必填项。</p>
    */
    @SerializedName("PayType")
    @Expose
    private String PayType;

    /**
    * <p>数据复制方式，默认为 0，支持值包括：0 - 表示异步复制，1 - 表示半同步复制，2 - 表示强同步复制。</p>
    */
    @SerializedName("ProtectMode")
    @Expose
    private Long ProtectMode;

    /**
    * <p>实例隔离类型。</p><p>枚举值：</p><ul><li>UNIVERSAL： 通用型实例</li><li>EXCLUSIVE： 独享型实例</li><li>CLOUD_NATIVE_CLUSTER： 云盘版标准型</li><li>CLOUD_NATIVE_CLUSTER_EXCLUSIVE： 云盘版加强型</li><li>CLOUD_NATIVE_CLUSTER_ULTRA： 云盘版旗舰型</li></ul><p>默认值：UNIVERSAL</p><p>如需查询单节点云盘版实例的价格，请设置此参数为 CLOUD_NATIVE_CLUSTER，并且指定参数 InstanceNodes 为1。</p>
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * <p>实例节点数。<br>1.查询 RO 实例或者单节点实例价格时，此字段值为1。<br>2.查询双节点实例价格时，此字段值为2。<br>3.查询三节点实例价格时，此字段值为3。<br>4.查询云盘版实例价格时，此字段值范围可输入2 - 6，取值为2表示云盘版实例下对应有1个读写节点 + 1个只读节点；取值为6表示云盘版实例下对应有1个读写节点 + 5个只读节点；其余取值（3 - 5）按1个读写节点 +（取值数 - 1）个只读节点规则类推。</p>
    */
    @SerializedName("InstanceNodes")
    @Expose
    private Long InstanceNodes;

    /**
    * <p>询价实例的CPU核心数目，单位：核，为保证传入 CPU 值有效，请使用 <a href="https://cloud.tencent.com/document/product/236/17229">获取云数据库可售卖规格</a> 接口获取可售卖的核心数目，当未指定该值时，将按照 Memory 大小补全一个默认值。</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>询价续费实例ID。如需查询实例续费价格，填写InstanceId和Period即可。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>按量计费阶梯。仅PayType=HOUR_PAID有效，支持值包括：1，2，3。阶梯时长见https://cloud.tencent.com/document/product/236/18335。</p>
    */
    @SerializedName("Ladder")
    @Expose
    private Long Ladder;

    /**
    * <p>磁盘类型，查询云盘版、单节点云盘版实例价格可以指定该参数。默认值为 SSD 云硬盘。<br>支持值包括：<br>&quot;CLOUD_SSD&quot; - SSD 云硬盘。<br>&quot;CLOUD_HSSD&quot; - 增强型 SSD 云硬盘。<br>&quot;CLOUD_PREMIUM&quot; - 高性能云硬盘。</p>
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
     * Get <p>实例时长，单位：月，最小值 1，最大值为 36；查询按量计费价格时，该字段无效。</p> 
     * @return Period <p>实例时长，单位：月，最小值 1，最大值为 36；查询按量计费价格时，该字段无效。</p>
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>实例时长，单位：月，最小值 1，最大值为 36；查询按量计费价格时，该字段无效。</p>
     * @param Period <p>实例时长，单位：月，最小值 1，最大值为 36；查询按量计费价格时，该字段无效。</p>
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get <p>可用区信息，格式如 &quot;ap-guangzhou-2&quot;。具体能设置的值请通过 <a href="https://cloud.tencent.com/document/api/236/17229">DescribeDBZoneConfig</a> 接口查询。InstanceId为空时该参数为必填项。</p> 
     * @return Zone <p>可用区信息，格式如 &quot;ap-guangzhou-2&quot;。具体能设置的值请通过 <a href="https://cloud.tencent.com/document/api/236/17229">DescribeDBZoneConfig</a> 接口查询。InstanceId为空时该参数为必填项。</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>可用区信息，格式如 &quot;ap-guangzhou-2&quot;。具体能设置的值请通过 <a href="https://cloud.tencent.com/document/api/236/17229">DescribeDBZoneConfig</a> 接口查询。InstanceId为空时该参数为必填项。</p>
     * @param Zone <p>可用区信息，格式如 &quot;ap-guangzhou-2&quot;。具体能设置的值请通过 <a href="https://cloud.tencent.com/document/api/236/17229">DescribeDBZoneConfig</a> 接口查询。InstanceId为空时该参数为必填项。</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>实例数量，默认值为 1，最小值 1，最大值为 100。InstanceId为空时该参数为必填项。</p> 
     * @return GoodsNum <p>实例数量，默认值为 1，最小值 1，最大值为 100。InstanceId为空时该参数为必填项。</p>
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set <p>实例数量，默认值为 1，最小值 1，最大值为 100。InstanceId为空时该参数为必填项。</p>
     * @param GoodsNum <p>实例数量，默认值为 1，最小值 1，最大值为 100。InstanceId为空时该参数为必填项。</p>
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get <p>实例内存大小，单位：MB。InstanceId 为空时该参数为必填项。为保证传入值有效，请使用 <a href="https://cloud.tencent.com/document/product/236/17229">获取云数据库可售卖规格</a> 接口获取可售卖的实例内存大小范围。</p> 
     * @return Memory <p>实例内存大小，单位：MB。InstanceId 为空时该参数为必填项。为保证传入值有效，请使用 <a href="https://cloud.tencent.com/document/product/236/17229">获取云数据库可售卖规格</a> 接口获取可售卖的实例内存大小范围。</p>
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>实例内存大小，单位：MB。InstanceId 为空时该参数为必填项。为保证传入值有效，请使用 <a href="https://cloud.tencent.com/document/product/236/17229">获取云数据库可售卖规格</a> 接口获取可售卖的实例内存大小范围。</p>
     * @param Memory <p>实例内存大小，单位：MB。InstanceId 为空时该参数为必填项。为保证传入值有效，请使用 <a href="https://cloud.tencent.com/document/product/236/17229">获取云数据库可售卖规格</a> 接口获取可售卖的实例内存大小范围。</p>
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>实例硬盘大小，单位：GB。InstanceId 为空时该参数为必填项。为保证传入值有效，请使用 <a href="https://cloud.tencent.com/document/product/236/17229">获取云数据库可售卖规格</a> 接口获取可售卖的硬盘大小范围。</p> 
     * @return Volume <p>实例硬盘大小，单位：GB。InstanceId 为空时该参数为必填项。为保证传入值有效，请使用 <a href="https://cloud.tencent.com/document/product/236/17229">获取云数据库可售卖规格</a> 接口获取可售卖的硬盘大小范围。</p>
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set <p>实例硬盘大小，单位：GB。InstanceId 为空时该参数为必填项。为保证传入值有效，请使用 <a href="https://cloud.tencent.com/document/product/236/17229">获取云数据库可售卖规格</a> 接口获取可售卖的硬盘大小范围。</p>
     * @param Volume <p>实例硬盘大小，单位：GB。InstanceId 为空时该参数为必填项。为保证传入值有效，请使用 <a href="https://cloud.tencent.com/document/product/236/17229">获取云数据库可售卖规格</a> 接口获取可售卖的硬盘大小范围。</p>
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    /**
     * Get <p>实例类型，默认为 master，支持值包括：master - 表示主实例，ro - 表示只读实例，dr - 表示灾备实例。InstanceId为空时该参数为必填项。</p> 
     * @return InstanceRole <p>实例类型，默认为 master，支持值包括：master - 表示主实例，ro - 表示只读实例，dr - 表示灾备实例。InstanceId为空时该参数为必填项。</p>
     */
    public String getInstanceRole() {
        return this.InstanceRole;
    }

    /**
     * Set <p>实例类型，默认为 master，支持值包括：master - 表示主实例，ro - 表示只读实例，dr - 表示灾备实例。InstanceId为空时该参数为必填项。</p>
     * @param InstanceRole <p>实例类型，默认为 master，支持值包括：master - 表示主实例，ro - 表示只读实例，dr - 表示灾备实例。InstanceId为空时该参数为必填项。</p>
     */
    public void setInstanceRole(String InstanceRole) {
        this.InstanceRole = InstanceRole;
    }

    /**
     * Get <p>付费类型，支持值包括：PRE_PAID - 包年包月，HOUR_PAID - 按量计费。InstanceId为空时该参数为必填项。</p> 
     * @return PayType <p>付费类型，支持值包括：PRE_PAID - 包年包月，HOUR_PAID - 按量计费。InstanceId为空时该参数为必填项。</p>
     */
    public String getPayType() {
        return this.PayType;
    }

    /**
     * Set <p>付费类型，支持值包括：PRE_PAID - 包年包月，HOUR_PAID - 按量计费。InstanceId为空时该参数为必填项。</p>
     * @param PayType <p>付费类型，支持值包括：PRE_PAID - 包年包月，HOUR_PAID - 按量计费。InstanceId为空时该参数为必填项。</p>
     */
    public void setPayType(String PayType) {
        this.PayType = PayType;
    }

    /**
     * Get <p>数据复制方式，默认为 0，支持值包括：0 - 表示异步复制，1 - 表示半同步复制，2 - 表示强同步复制。</p> 
     * @return ProtectMode <p>数据复制方式，默认为 0，支持值包括：0 - 表示异步复制，1 - 表示半同步复制，2 - 表示强同步复制。</p>
     */
    public Long getProtectMode() {
        return this.ProtectMode;
    }

    /**
     * Set <p>数据复制方式，默认为 0，支持值包括：0 - 表示异步复制，1 - 表示半同步复制，2 - 表示强同步复制。</p>
     * @param ProtectMode <p>数据复制方式，默认为 0，支持值包括：0 - 表示异步复制，1 - 表示半同步复制，2 - 表示强同步复制。</p>
     */
    public void setProtectMode(Long ProtectMode) {
        this.ProtectMode = ProtectMode;
    }

    /**
     * Get <p>实例隔离类型。</p><p>枚举值：</p><ul><li>UNIVERSAL： 通用型实例</li><li>EXCLUSIVE： 独享型实例</li><li>CLOUD_NATIVE_CLUSTER： 云盘版标准型</li><li>CLOUD_NATIVE_CLUSTER_EXCLUSIVE： 云盘版加强型</li><li>CLOUD_NATIVE_CLUSTER_ULTRA： 云盘版旗舰型</li></ul><p>默认值：UNIVERSAL</p><p>如需查询单节点云盘版实例的价格，请设置此参数为 CLOUD_NATIVE_CLUSTER，并且指定参数 InstanceNodes 为1。</p> 
     * @return DeviceType <p>实例隔离类型。</p><p>枚举值：</p><ul><li>UNIVERSAL： 通用型实例</li><li>EXCLUSIVE： 独享型实例</li><li>CLOUD_NATIVE_CLUSTER： 云盘版标准型</li><li>CLOUD_NATIVE_CLUSTER_EXCLUSIVE： 云盘版加强型</li><li>CLOUD_NATIVE_CLUSTER_ULTRA： 云盘版旗舰型</li></ul><p>默认值：UNIVERSAL</p><p>如需查询单节点云盘版实例的价格，请设置此参数为 CLOUD_NATIVE_CLUSTER，并且指定参数 InstanceNodes 为1。</p>
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set <p>实例隔离类型。</p><p>枚举值：</p><ul><li>UNIVERSAL： 通用型实例</li><li>EXCLUSIVE： 独享型实例</li><li>CLOUD_NATIVE_CLUSTER： 云盘版标准型</li><li>CLOUD_NATIVE_CLUSTER_EXCLUSIVE： 云盘版加强型</li><li>CLOUD_NATIVE_CLUSTER_ULTRA： 云盘版旗舰型</li></ul><p>默认值：UNIVERSAL</p><p>如需查询单节点云盘版实例的价格，请设置此参数为 CLOUD_NATIVE_CLUSTER，并且指定参数 InstanceNodes 为1。</p>
     * @param DeviceType <p>实例隔离类型。</p><p>枚举值：</p><ul><li>UNIVERSAL： 通用型实例</li><li>EXCLUSIVE： 独享型实例</li><li>CLOUD_NATIVE_CLUSTER： 云盘版标准型</li><li>CLOUD_NATIVE_CLUSTER_EXCLUSIVE： 云盘版加强型</li><li>CLOUD_NATIVE_CLUSTER_ULTRA： 云盘版旗舰型</li></ul><p>默认值：UNIVERSAL</p><p>如需查询单节点云盘版实例的价格，请设置此参数为 CLOUD_NATIVE_CLUSTER，并且指定参数 InstanceNodes 为1。</p>
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get <p>实例节点数。<br>1.查询 RO 实例或者单节点实例价格时，此字段值为1。<br>2.查询双节点实例价格时，此字段值为2。<br>3.查询三节点实例价格时，此字段值为3。<br>4.查询云盘版实例价格时，此字段值范围可输入2 - 6，取值为2表示云盘版实例下对应有1个读写节点 + 1个只读节点；取值为6表示云盘版实例下对应有1个读写节点 + 5个只读节点；其余取值（3 - 5）按1个读写节点 +（取值数 - 1）个只读节点规则类推。</p> 
     * @return InstanceNodes <p>实例节点数。<br>1.查询 RO 实例或者单节点实例价格时，此字段值为1。<br>2.查询双节点实例价格时，此字段值为2。<br>3.查询三节点实例价格时，此字段值为3。<br>4.查询云盘版实例价格时，此字段值范围可输入2 - 6，取值为2表示云盘版实例下对应有1个读写节点 + 1个只读节点；取值为6表示云盘版实例下对应有1个读写节点 + 5个只读节点；其余取值（3 - 5）按1个读写节点 +（取值数 - 1）个只读节点规则类推。</p>
     */
    public Long getInstanceNodes() {
        return this.InstanceNodes;
    }

    /**
     * Set <p>实例节点数。<br>1.查询 RO 实例或者单节点实例价格时，此字段值为1。<br>2.查询双节点实例价格时，此字段值为2。<br>3.查询三节点实例价格时，此字段值为3。<br>4.查询云盘版实例价格时，此字段值范围可输入2 - 6，取值为2表示云盘版实例下对应有1个读写节点 + 1个只读节点；取值为6表示云盘版实例下对应有1个读写节点 + 5个只读节点；其余取值（3 - 5）按1个读写节点 +（取值数 - 1）个只读节点规则类推。</p>
     * @param InstanceNodes <p>实例节点数。<br>1.查询 RO 实例或者单节点实例价格时，此字段值为1。<br>2.查询双节点实例价格时，此字段值为2。<br>3.查询三节点实例价格时，此字段值为3。<br>4.查询云盘版实例价格时，此字段值范围可输入2 - 6，取值为2表示云盘版实例下对应有1个读写节点 + 1个只读节点；取值为6表示云盘版实例下对应有1个读写节点 + 5个只读节点；其余取值（3 - 5）按1个读写节点 +（取值数 - 1）个只读节点规则类推。</p>
     */
    public void setInstanceNodes(Long InstanceNodes) {
        this.InstanceNodes = InstanceNodes;
    }

    /**
     * Get <p>询价实例的CPU核心数目，单位：核，为保证传入 CPU 值有效，请使用 <a href="https://cloud.tencent.com/document/product/236/17229">获取云数据库可售卖规格</a> 接口获取可售卖的核心数目，当未指定该值时，将按照 Memory 大小补全一个默认值。</p> 
     * @return Cpu <p>询价实例的CPU核心数目，单位：核，为保证传入 CPU 值有效，请使用 <a href="https://cloud.tencent.com/document/product/236/17229">获取云数据库可售卖规格</a> 接口获取可售卖的核心数目，当未指定该值时，将按照 Memory 大小补全一个默认值。</p>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>询价实例的CPU核心数目，单位：核，为保证传入 CPU 值有效，请使用 <a href="https://cloud.tencent.com/document/product/236/17229">获取云数据库可售卖规格</a> 接口获取可售卖的核心数目，当未指定该值时，将按照 Memory 大小补全一个默认值。</p>
     * @param Cpu <p>询价实例的CPU核心数目，单位：核，为保证传入 CPU 值有效，请使用 <a href="https://cloud.tencent.com/document/product/236/17229">获取云数据库可售卖规格</a> 接口获取可售卖的核心数目，当未指定该值时，将按照 Memory 大小补全一个默认值。</p>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>询价续费实例ID。如需查询实例续费价格，填写InstanceId和Period即可。</p> 
     * @return InstanceId <p>询价续费实例ID。如需查询实例续费价格，填写InstanceId和Period即可。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>询价续费实例ID。如需查询实例续费价格，填写InstanceId和Period即可。</p>
     * @param InstanceId <p>询价续费实例ID。如需查询实例续费价格，填写InstanceId和Period即可。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>按量计费阶梯。仅PayType=HOUR_PAID有效，支持值包括：1，2，3。阶梯时长见https://cloud.tencent.com/document/product/236/18335。</p> 
     * @return Ladder <p>按量计费阶梯。仅PayType=HOUR_PAID有效，支持值包括：1，2，3。阶梯时长见https://cloud.tencent.com/document/product/236/18335。</p>
     */
    public Long getLadder() {
        return this.Ladder;
    }

    /**
     * Set <p>按量计费阶梯。仅PayType=HOUR_PAID有效，支持值包括：1，2，3。阶梯时长见https://cloud.tencent.com/document/product/236/18335。</p>
     * @param Ladder <p>按量计费阶梯。仅PayType=HOUR_PAID有效，支持值包括：1，2，3。阶梯时长见https://cloud.tencent.com/document/product/236/18335。</p>
     */
    public void setLadder(Long Ladder) {
        this.Ladder = Ladder;
    }

    /**
     * Get <p>磁盘类型，查询云盘版、单节点云盘版实例价格可以指定该参数。默认值为 SSD 云硬盘。<br>支持值包括：<br>&quot;CLOUD_SSD&quot; - SSD 云硬盘。<br>&quot;CLOUD_HSSD&quot; - 增强型 SSD 云硬盘。<br>&quot;CLOUD_PREMIUM&quot; - 高性能云硬盘。</p> 
     * @return DiskType <p>磁盘类型，查询云盘版、单节点云盘版实例价格可以指定该参数。默认值为 SSD 云硬盘。<br>支持值包括：<br>&quot;CLOUD_SSD&quot; - SSD 云硬盘。<br>&quot;CLOUD_HSSD&quot; - 增强型 SSD 云硬盘。<br>&quot;CLOUD_PREMIUM&quot; - 高性能云硬盘。</p>
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set <p>磁盘类型，查询云盘版、单节点云盘版实例价格可以指定该参数。默认值为 SSD 云硬盘。<br>支持值包括：<br>&quot;CLOUD_SSD&quot; - SSD 云硬盘。<br>&quot;CLOUD_HSSD&quot; - 增强型 SSD 云硬盘。<br>&quot;CLOUD_PREMIUM&quot; - 高性能云硬盘。</p>
     * @param DiskType <p>磁盘类型，查询云盘版、单节点云盘版实例价格可以指定该参数。默认值为 SSD 云硬盘。<br>支持值包括：<br>&quot;CLOUD_SSD&quot; - SSD 云硬盘。<br>&quot;CLOUD_HSSD&quot; - 增强型 SSD 云硬盘。<br>&quot;CLOUD_PREMIUM&quot; - 高性能云硬盘。</p>
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    public DescribeDBPriceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBPriceRequest(DescribeDBPriceRequest source) {
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.GoodsNum != null) {
            this.GoodsNum = new Long(source.GoodsNum);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Volume != null) {
            this.Volume = new Long(source.Volume);
        }
        if (source.InstanceRole != null) {
            this.InstanceRole = new String(source.InstanceRole);
        }
        if (source.PayType != null) {
            this.PayType = new String(source.PayType);
        }
        if (source.ProtectMode != null) {
            this.ProtectMode = new Long(source.ProtectMode);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.InstanceNodes != null) {
            this.InstanceNodes = new Long(source.InstanceNodes);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Ladder != null) {
            this.Ladder = new Long(source.Ladder);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "InstanceRole", this.InstanceRole);
        this.setParamSimple(map, prefix + "PayType", this.PayType);
        this.setParamSimple(map, prefix + "ProtectMode", this.ProtectMode);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "InstanceNodes", this.InstanceNodes);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Ladder", this.Ladder);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);

    }
}

