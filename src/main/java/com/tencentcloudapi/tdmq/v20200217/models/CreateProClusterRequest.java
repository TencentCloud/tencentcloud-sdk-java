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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateProClusterRequest extends AbstractModel {

    /**
    * <p>多可用区部署选择三个可用区，示例[200002,200003,200004]<br>单可用区部署选择一个可用区，示例[200002]</p><p>当选择PULSAR.P2.MINI1 时只支持两个可用区，其他支持三个可用区</p>
    */
    @SerializedName("ZoneIds")
    @Expose
    private Long [] ZoneIds;

    /**
    * <p>集群规格代号<br>参考 <a href="https://cloud.tencent.com/document/product/1179/83705">专业集群规格</a></p>
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * <p>1: true，开启自动按月续费</p><p>0: false，关闭自动按月续费</p>
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * <p>购买时长，取值范围：1～50</p>
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * <p>集群名称不能为空，支持数字、字母、中文以及符号 “-_=:.”，长度不超过64个字符</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * <p>是否自动选择代金券 1是 0否 默认为0</p>
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

    /**
    * <p>存储规格<br>参考 <a href="https://cloud.tencent.com/document/product/1179/83705">专业集群规格</a></p>
    */
    @SerializedName("StorageSize")
    @Expose
    private Long StorageSize;

    /**
    * <p>vpc网络标签</p>
    */
    @SerializedName("Vpc")
    @Expose
    private VpcInfo Vpc;

    /**
    * <p>集群的标签列表(已废弃)</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>集群版本信息</p>
    */
    @SerializedName("InstanceVersion")
    @Expose
    private String InstanceVersion;

    /**
     * Get <p>多可用区部署选择三个可用区，示例[200002,200003,200004]<br>单可用区部署选择一个可用区，示例[200002]</p><p>当选择PULSAR.P2.MINI1 时只支持两个可用区，其他支持三个可用区</p> 
     * @return ZoneIds <p>多可用区部署选择三个可用区，示例[200002,200003,200004]<br>单可用区部署选择一个可用区，示例[200002]</p><p>当选择PULSAR.P2.MINI1 时只支持两个可用区，其他支持三个可用区</p>
     */
    public Long [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set <p>多可用区部署选择三个可用区，示例[200002,200003,200004]<br>单可用区部署选择一个可用区，示例[200002]</p><p>当选择PULSAR.P2.MINI1 时只支持两个可用区，其他支持三个可用区</p>
     * @param ZoneIds <p>多可用区部署选择三个可用区，示例[200002,200003,200004]<br>单可用区部署选择一个可用区，示例[200002]</p><p>当选择PULSAR.P2.MINI1 时只支持两个可用区，其他支持三个可用区</p>
     */
    public void setZoneIds(Long [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get <p>集群规格代号<br>参考 <a href="https://cloud.tencent.com/document/product/1179/83705">专业集群规格</a></p> 
     * @return ProductName <p>集群规格代号<br>参考 <a href="https://cloud.tencent.com/document/product/1179/83705">专业集群规格</a></p>
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set <p>集群规格代号<br>参考 <a href="https://cloud.tencent.com/document/product/1179/83705">专业集群规格</a></p>
     * @param ProductName <p>集群规格代号<br>参考 <a href="https://cloud.tencent.com/document/product/1179/83705">专业集群规格</a></p>
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get <p>1: true，开启自动按月续费</p><p>0: false，关闭自动按月续费</p> 
     * @return AutoRenewFlag <p>1: true，开启自动按月续费</p><p>0: false，关闭自动按月续费</p>
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set <p>1: true，开启自动按月续费</p><p>0: false，关闭自动按月续费</p>
     * @param AutoRenewFlag <p>1: true，开启自动按月续费</p><p>0: false，关闭自动按月续费</p>
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get <p>购买时长，取值范围：1～50</p> 
     * @return TimeSpan <p>购买时长，取值范围：1～50</p>
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set <p>购买时长，取值范围：1～50</p>
     * @param TimeSpan <p>购买时长，取值范围：1～50</p>
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get <p>集群名称不能为空，支持数字、字母、中文以及符号 “-_=:.”，长度不超过64个字符</p> 
     * @return ClusterName <p>集群名称不能为空，支持数字、字母、中文以及符号 “-_=:.”，长度不超过64个字符</p>
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>集群名称不能为空，支持数字、字母、中文以及符号 “-_=:.”，长度不超过64个字符</p>
     * @param ClusterName <p>集群名称不能为空，支持数字、字母、中文以及符号 “-_=:.”，长度不超过64个字符</p>
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get <p>是否自动选择代金券 1是 0否 默认为0</p> 
     * @return AutoVoucher <p>是否自动选择代金券 1是 0否 默认为0</p>
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set <p>是否自动选择代金券 1是 0否 默认为0</p>
     * @param AutoVoucher <p>是否自动选择代金券 1是 0否 默认为0</p>
     */
    public void setAutoVoucher(Long AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get <p>存储规格<br>参考 <a href="https://cloud.tencent.com/document/product/1179/83705">专业集群规格</a></p> 
     * @return StorageSize <p>存储规格<br>参考 <a href="https://cloud.tencent.com/document/product/1179/83705">专业集群规格</a></p>
     */
    public Long getStorageSize() {
        return this.StorageSize;
    }

    /**
     * Set <p>存储规格<br>参考 <a href="https://cloud.tencent.com/document/product/1179/83705">专业集群规格</a></p>
     * @param StorageSize <p>存储规格<br>参考 <a href="https://cloud.tencent.com/document/product/1179/83705">专业集群规格</a></p>
     */
    public void setStorageSize(Long StorageSize) {
        this.StorageSize = StorageSize;
    }

    /**
     * Get <p>vpc网络标签</p> 
     * @return Vpc <p>vpc网络标签</p>
     */
    public VpcInfo getVpc() {
        return this.Vpc;
    }

    /**
     * Set <p>vpc网络标签</p>
     * @param Vpc <p>vpc网络标签</p>
     */
    public void setVpc(VpcInfo Vpc) {
        this.Vpc = Vpc;
    }

    /**
     * Get <p>集群的标签列表(已废弃)</p> 
     * @return Tags <p>集群的标签列表(已废弃)</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>集群的标签列表(已废弃)</p>
     * @param Tags <p>集群的标签列表(已废弃)</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>集群版本信息</p> 
     * @return InstanceVersion <p>集群版本信息</p>
     */
    public String getInstanceVersion() {
        return this.InstanceVersion;
    }

    /**
     * Set <p>集群版本信息</p>
     * @param InstanceVersion <p>集群版本信息</p>
     */
    public void setInstanceVersion(String InstanceVersion) {
        this.InstanceVersion = InstanceVersion;
    }

    public CreateProClusterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateProClusterRequest(CreateProClusterRequest source) {
        if (source.ZoneIds != null) {
            this.ZoneIds = new Long[source.ZoneIds.length];
            for (int i = 0; i < source.ZoneIds.length; i++) {
                this.ZoneIds[i] = new Long(source.ZoneIds[i]);
            }
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Long(source.AutoVoucher);
        }
        if (source.StorageSize != null) {
            this.StorageSize = new Long(source.StorageSize);
        }
        if (source.Vpc != null) {
            this.Vpc = new VpcInfo(source.Vpc);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.InstanceVersion != null) {
            this.InstanceVersion = new String(source.InstanceVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamSimple(map, prefix + "StorageSize", this.StorageSize);
        this.setParamObj(map, prefix + "Vpc.", this.Vpc);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "InstanceVersion", this.InstanceVersion);

    }
}

