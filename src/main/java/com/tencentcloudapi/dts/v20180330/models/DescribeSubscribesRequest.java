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
package com.tencentcloudapi.dts.v20180330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSubscribesRequest extends AbstractModel {

    /**
    * 数据订阅的实例ID
    */
    @SerializedName("SubscribeId")
    @Expose
    private String SubscribeId;

    /**
    * 数据订阅的实例名称
    */
    @SerializedName("SubscribeName")
    @Expose
    private String SubscribeName;

    /**
    * 绑定数据库实例的ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 数据订阅实例的通道ID
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * 计费模式筛选，可能的值：0-包年包月，1-按量计费
    */
    @SerializedName("PayType")
    @Expose
    private String PayType;

    /**
    * 订阅的数据库产品，如mysql
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * 数据订阅实例的状态，creating - 创建中，normal - 正常运行，isolating - 隔离中，isolated - 已隔离，offlining - 下线中
    */
    @SerializedName("Status")
    @Expose
    private String [] Status;

    /**
    * 数据订阅实例的配置状态，unconfigure - 未配置， configuring - 配置中，configured - 已配置
    */
    @SerializedName("SubsStatus")
    @Expose
    private String [] SubsStatus;

    /**
    * 返回记录的起始偏移量，默认为0。请输入非负整数
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 单次返回的记录数量，默认20。请输入1到100的整数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 排序方向，可选的值为"DESC"和"ASC"，默认为"DESC"，按创建时间逆序排序
    */
    @SerializedName("OrderDirection")
    @Expose
    private String OrderDirection;

    /**
    * 标签过滤条件
    */
    @SerializedName("TagFilters")
    @Expose
    private TagFilter [] TagFilters;

    /**
    * 订阅实例版本;txdts-旧版数据订阅，kafka-kafka版本数据订阅
    */
    @SerializedName("SubscribeVersion")
    @Expose
    private String SubscribeVersion;

    /**
     * Get 数据订阅的实例ID 
     * @return SubscribeId 数据订阅的实例ID
     */
    public String getSubscribeId() {
        return this.SubscribeId;
    }

    /**
     * Set 数据订阅的实例ID
     * @param SubscribeId 数据订阅的实例ID
     */
    public void setSubscribeId(String SubscribeId) {
        this.SubscribeId = SubscribeId;
    }

    /**
     * Get 数据订阅的实例名称 
     * @return SubscribeName 数据订阅的实例名称
     */
    public String getSubscribeName() {
        return this.SubscribeName;
    }

    /**
     * Set 数据订阅的实例名称
     * @param SubscribeName 数据订阅的实例名称
     */
    public void setSubscribeName(String SubscribeName) {
        this.SubscribeName = SubscribeName;
    }

    /**
     * Get 绑定数据库实例的ID 
     * @return InstanceId 绑定数据库实例的ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 绑定数据库实例的ID
     * @param InstanceId 绑定数据库实例的ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 数据订阅实例的通道ID 
     * @return ChannelId 数据订阅实例的通道ID
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set 数据订阅实例的通道ID
     * @param ChannelId 数据订阅实例的通道ID
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get 计费模式筛选，可能的值：0-包年包月，1-按量计费 
     * @return PayType 计费模式筛选，可能的值：0-包年包月，1-按量计费
     */
    public String getPayType() {
        return this.PayType;
    }

    /**
     * Set 计费模式筛选，可能的值：0-包年包月，1-按量计费
     * @param PayType 计费模式筛选，可能的值：0-包年包月，1-按量计费
     */
    public void setPayType(String PayType) {
        this.PayType = PayType;
    }

    /**
     * Get 订阅的数据库产品，如mysql 
     * @return Product 订阅的数据库产品，如mysql
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 订阅的数据库产品，如mysql
     * @param Product 订阅的数据库产品，如mysql
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get 数据订阅实例的状态，creating - 创建中，normal - 正常运行，isolating - 隔离中，isolated - 已隔离，offlining - 下线中 
     * @return Status 数据订阅实例的状态，creating - 创建中，normal - 正常运行，isolating - 隔离中，isolated - 已隔离，offlining - 下线中
     */
    public String [] getStatus() {
        return this.Status;
    }

    /**
     * Set 数据订阅实例的状态，creating - 创建中，normal - 正常运行，isolating - 隔离中，isolated - 已隔离，offlining - 下线中
     * @param Status 数据订阅实例的状态，creating - 创建中，normal - 正常运行，isolating - 隔离中，isolated - 已隔离，offlining - 下线中
     */
    public void setStatus(String [] Status) {
        this.Status = Status;
    }

    /**
     * Get 数据订阅实例的配置状态，unconfigure - 未配置， configuring - 配置中，configured - 已配置 
     * @return SubsStatus 数据订阅实例的配置状态，unconfigure - 未配置， configuring - 配置中，configured - 已配置
     */
    public String [] getSubsStatus() {
        return this.SubsStatus;
    }

    /**
     * Set 数据订阅实例的配置状态，unconfigure - 未配置， configuring - 配置中，configured - 已配置
     * @param SubsStatus 数据订阅实例的配置状态，unconfigure - 未配置， configuring - 配置中，configured - 已配置
     */
    public void setSubsStatus(String [] SubsStatus) {
        this.SubsStatus = SubsStatus;
    }

    /**
     * Get 返回记录的起始偏移量，默认为0。请输入非负整数 
     * @return Offset 返回记录的起始偏移量，默认为0。请输入非负整数
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 返回记录的起始偏移量，默认为0。请输入非负整数
     * @param Offset 返回记录的起始偏移量，默认为0。请输入非负整数
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 单次返回的记录数量，默认20。请输入1到100的整数 
     * @return Limit 单次返回的记录数量，默认20。请输入1到100的整数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 单次返回的记录数量，默认20。请输入1到100的整数
     * @param Limit 单次返回的记录数量，默认20。请输入1到100的整数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 排序方向，可选的值为"DESC"和"ASC"，默认为"DESC"，按创建时间逆序排序 
     * @return OrderDirection 排序方向，可选的值为"DESC"和"ASC"，默认为"DESC"，按创建时间逆序排序
     */
    public String getOrderDirection() {
        return this.OrderDirection;
    }

    /**
     * Set 排序方向，可选的值为"DESC"和"ASC"，默认为"DESC"，按创建时间逆序排序
     * @param OrderDirection 排序方向，可选的值为"DESC"和"ASC"，默认为"DESC"，按创建时间逆序排序
     */
    public void setOrderDirection(String OrderDirection) {
        this.OrderDirection = OrderDirection;
    }

    /**
     * Get 标签过滤条件 
     * @return TagFilters 标签过滤条件
     */
    public TagFilter [] getTagFilters() {
        return this.TagFilters;
    }

    /**
     * Set 标签过滤条件
     * @param TagFilters 标签过滤条件
     */
    public void setTagFilters(TagFilter [] TagFilters) {
        this.TagFilters = TagFilters;
    }

    /**
     * Get 订阅实例版本;txdts-旧版数据订阅，kafka-kafka版本数据订阅 
     * @return SubscribeVersion 订阅实例版本;txdts-旧版数据订阅，kafka-kafka版本数据订阅
     */
    public String getSubscribeVersion() {
        return this.SubscribeVersion;
    }

    /**
     * Set 订阅实例版本;txdts-旧版数据订阅，kafka-kafka版本数据订阅
     * @param SubscribeVersion 订阅实例版本;txdts-旧版数据订阅，kafka-kafka版本数据订阅
     */
    public void setSubscribeVersion(String SubscribeVersion) {
        this.SubscribeVersion = SubscribeVersion;
    }

    public DescribeSubscribesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSubscribesRequest(DescribeSubscribesRequest source) {
        if (source.SubscribeId != null) {
            this.SubscribeId = new String(source.SubscribeId);
        }
        if (source.SubscribeName != null) {
            this.SubscribeName = new String(source.SubscribeName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.PayType != null) {
            this.PayType = new String(source.PayType);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.Status != null) {
            this.Status = new String[source.Status.length];
            for (int i = 0; i < source.Status.length; i++) {
                this.Status[i] = new String(source.Status[i]);
            }
        }
        if (source.SubsStatus != null) {
            this.SubsStatus = new String[source.SubsStatus.length];
            for (int i = 0; i < source.SubsStatus.length; i++) {
                this.SubsStatus[i] = new String(source.SubsStatus[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.OrderDirection != null) {
            this.OrderDirection = new String(source.OrderDirection);
        }
        if (source.TagFilters != null) {
            this.TagFilters = new TagFilter[source.TagFilters.length];
            for (int i = 0; i < source.TagFilters.length; i++) {
                this.TagFilters[i] = new TagFilter(source.TagFilters[i]);
            }
        }
        if (source.SubscribeVersion != null) {
            this.SubscribeVersion = new String(source.SubscribeVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubscribeId", this.SubscribeId);
        this.setParamSimple(map, prefix + "SubscribeName", this.SubscribeName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "PayType", this.PayType);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);
        this.setParamArraySimple(map, prefix + "SubsStatus.", this.SubsStatus);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderDirection", this.OrderDirection);
        this.setParamArrayObj(map, prefix + "TagFilters.", this.TagFilters);
        this.setParamSimple(map, prefix + "SubscribeVersion", this.SubscribeVersion);

    }
}

