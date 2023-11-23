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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateProClusterRequest extends AbstractModel {

    /**
    * 多可用区部署选择三个可用区，示例"200002","200003","200004"

单可用区部署选择一个可用区，示例"200002"
    */
    @SerializedName("ZoneIds")
    @Expose
    private String ZoneIds;

    /**
    * 集群规格代号
参考 [专业集群规格](https://cloud.tencent.com/document/product/1179/83705)
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 存储规格
参考 [专业集群规格](https://cloud.tencent.com/document/product/1179/83705)
    */
    @SerializedName("StorageSize")
    @Expose
    private Long StorageSize;

    /**
    * 1: true，开启自动按月续费

0: false，关闭自动按月续费
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * 购买时长，取值范围：1～50
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * 集群名称，不支持中字以及除了短线和下划线外的特殊字符且不超过64个字符。
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 是否自动选择代金券 1是 0否 默认为0
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

    /**
    * vpc网络标签
    */
    @SerializedName("Vpc")
    @Expose
    private VpcInfo Vpc;

    /**
    * 集群的标签列表(已废弃)
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get 多可用区部署选择三个可用区，示例"200002","200003","200004"

单可用区部署选择一个可用区，示例"200002" 
     * @return ZoneIds 多可用区部署选择三个可用区，示例"200002","200003","200004"

单可用区部署选择一个可用区，示例"200002"
     */
    public String getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set 多可用区部署选择三个可用区，示例"200002","200003","200004"

单可用区部署选择一个可用区，示例"200002"
     * @param ZoneIds 多可用区部署选择三个可用区，示例"200002","200003","200004"

单可用区部署选择一个可用区，示例"200002"
     */
    public void setZoneIds(String ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get 集群规格代号
参考 [专业集群规格](https://cloud.tencent.com/document/product/1179/83705) 
     * @return ProductName 集群规格代号
参考 [专业集群规格](https://cloud.tencent.com/document/product/1179/83705)
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set 集群规格代号
参考 [专业集群规格](https://cloud.tencent.com/document/product/1179/83705)
     * @param ProductName 集群规格代号
参考 [专业集群规格](https://cloud.tencent.com/document/product/1179/83705)
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get 存储规格
参考 [专业集群规格](https://cloud.tencent.com/document/product/1179/83705) 
     * @return StorageSize 存储规格
参考 [专业集群规格](https://cloud.tencent.com/document/product/1179/83705)
     */
    public Long getStorageSize() {
        return this.StorageSize;
    }

    /**
     * Set 存储规格
参考 [专业集群规格](https://cloud.tencent.com/document/product/1179/83705)
     * @param StorageSize 存储规格
参考 [专业集群规格](https://cloud.tencent.com/document/product/1179/83705)
     */
    public void setStorageSize(Long StorageSize) {
        this.StorageSize = StorageSize;
    }

    /**
     * Get 1: true，开启自动按月续费

0: false，关闭自动按月续费 
     * @return AutoRenewFlag 1: true，开启自动按月续费

0: false，关闭自动按月续费
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 1: true，开启自动按月续费

0: false，关闭自动按月续费
     * @param AutoRenewFlag 1: true，开启自动按月续费

0: false，关闭自动按月续费
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get 购买时长，取值范围：1～50 
     * @return TimeSpan 购买时长，取值范围：1～50
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set 购买时长，取值范围：1～50
     * @param TimeSpan 购买时长，取值范围：1～50
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get 集群名称，不支持中字以及除了短线和下划线外的特殊字符且不超过64个字符。 
     * @return ClusterName 集群名称，不支持中字以及除了短线和下划线外的特殊字符且不超过64个字符。
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群名称，不支持中字以及除了短线和下划线外的特殊字符且不超过64个字符。
     * @param ClusterName 集群名称，不支持中字以及除了短线和下划线外的特殊字符且不超过64个字符。
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 是否自动选择代金券 1是 0否 默认为0 
     * @return AutoVoucher 是否自动选择代金券 1是 0否 默认为0
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set 是否自动选择代金券 1是 0否 默认为0
     * @param AutoVoucher 是否自动选择代金券 1是 0否 默认为0
     */
    public void setAutoVoucher(Long AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get vpc网络标签 
     * @return Vpc vpc网络标签
     */
    public VpcInfo getVpc() {
        return this.Vpc;
    }

    /**
     * Set vpc网络标签
     * @param Vpc vpc网络标签
     */
    public void setVpc(VpcInfo Vpc) {
        this.Vpc = Vpc;
    }

    /**
     * Get 集群的标签列表(已废弃) 
     * @return Tags 集群的标签列表(已废弃)
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 集群的标签列表(已废弃)
     * @param Tags 集群的标签列表(已废弃)
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public CreateProClusterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateProClusterRequest(CreateProClusterRequest source) {
        if (source.ZoneIds != null) {
            this.ZoneIds = new String(source.ZoneIds);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.StorageSize != null) {
            this.StorageSize = new Long(source.StorageSize);
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
        if (source.Vpc != null) {
            this.Vpc = new VpcInfo(source.Vpc);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneIds", this.ZoneIds);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "StorageSize", this.StorageSize);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamObj(map, prefix + "Vpc.", this.Vpc);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

