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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSubscribeJobsRequest extends AbstractModel {

    /**
    * 订阅 ID 筛选，精确匹配
    */
    @SerializedName("SubscribeId")
    @Expose
    private String SubscribeId;

    /**
    * 订阅 ID 筛选，精确匹配
    */
    @SerializedName("SubscribeIds")
    @Expose
    private String [] SubscribeIds;

    /**
    * 订阅名称，前缀模糊匹配
    */
    @SerializedName("SubscribeName")
    @Expose
    private String SubscribeName;

    /**
    * 订阅的云上数据库实例的 ID，精确匹配
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 订阅的topicName
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * 计费模式筛选，可能的值：0-包年包月，1-按量计费
    */
    @SerializedName("PayType")
    @Expose
    private Long PayType;

    /**
    * 订阅的数据库产品，目前支持 cynosdbmysql,mariadb,mongodb,mysql,percona,tdpg,tdsqlpercona(tdsqlmysql)
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * 数据订阅生命周期状态，可能的值为：正常 normal, 隔离中 isolating, 已隔离 isolated, 下线中 offlining，按量转包年包月中 post2PrePayIng
    */
    @SerializedName("Status")
    @Expose
    private String [] Status;

    /**
    * 数据订阅状态，可能的值为：未启动 notStarted, 校验中 checking, 校验不通过 checkNotPass, 校验通过 checkPass, 启动中 starting, 运行中 running, 异常出错 error
    */
    @SerializedName("SubsStatus")
    @Expose
    private String [] SubsStatus;

    /**
    * 返回记录的起始偏移量。默认0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 单次返回的记录数量。默认20，最大100
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
    * tag 过滤条件，多个 TagFilter 之间关系为且
    */
    @SerializedName("TagFilters")
    @Expose
    private TagFilter [] TagFilters;

    /**
     * Get 订阅 ID 筛选，精确匹配 
     * @return SubscribeId 订阅 ID 筛选，精确匹配
     */
    public String getSubscribeId() {
        return this.SubscribeId;
    }

    /**
     * Set 订阅 ID 筛选，精确匹配
     * @param SubscribeId 订阅 ID 筛选，精确匹配
     */
    public void setSubscribeId(String SubscribeId) {
        this.SubscribeId = SubscribeId;
    }

    /**
     * Get 订阅 ID 筛选，精确匹配 
     * @return SubscribeIds 订阅 ID 筛选，精确匹配
     */
    public String [] getSubscribeIds() {
        return this.SubscribeIds;
    }

    /**
     * Set 订阅 ID 筛选，精确匹配
     * @param SubscribeIds 订阅 ID 筛选，精确匹配
     */
    public void setSubscribeIds(String [] SubscribeIds) {
        this.SubscribeIds = SubscribeIds;
    }

    /**
     * Get 订阅名称，前缀模糊匹配 
     * @return SubscribeName 订阅名称，前缀模糊匹配
     */
    public String getSubscribeName() {
        return this.SubscribeName;
    }

    /**
     * Set 订阅名称，前缀模糊匹配
     * @param SubscribeName 订阅名称，前缀模糊匹配
     */
    public void setSubscribeName(String SubscribeName) {
        this.SubscribeName = SubscribeName;
    }

    /**
     * Get 订阅的云上数据库实例的 ID，精确匹配 
     * @return InstanceId 订阅的云上数据库实例的 ID，精确匹配
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 订阅的云上数据库实例的 ID，精确匹配
     * @param InstanceId 订阅的云上数据库实例的 ID，精确匹配
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 订阅的topicName 
     * @return Topic 订阅的topicName
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set 订阅的topicName
     * @param Topic 订阅的topicName
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get 计费模式筛选，可能的值：0-包年包月，1-按量计费 
     * @return PayType 计费模式筛选，可能的值：0-包年包月，1-按量计费
     */
    public Long getPayType() {
        return this.PayType;
    }

    /**
     * Set 计费模式筛选，可能的值：0-包年包月，1-按量计费
     * @param PayType 计费模式筛选，可能的值：0-包年包月，1-按量计费
     */
    public void setPayType(Long PayType) {
        this.PayType = PayType;
    }

    /**
     * Get 订阅的数据库产品，目前支持 cynosdbmysql,mariadb,mongodb,mysql,percona,tdpg,tdsqlpercona(tdsqlmysql) 
     * @return Product 订阅的数据库产品，目前支持 cynosdbmysql,mariadb,mongodb,mysql,percona,tdpg,tdsqlpercona(tdsqlmysql)
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 订阅的数据库产品，目前支持 cynosdbmysql,mariadb,mongodb,mysql,percona,tdpg,tdsqlpercona(tdsqlmysql)
     * @param Product 订阅的数据库产品，目前支持 cynosdbmysql,mariadb,mongodb,mysql,percona,tdpg,tdsqlpercona(tdsqlmysql)
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get 数据订阅生命周期状态，可能的值为：正常 normal, 隔离中 isolating, 已隔离 isolated, 下线中 offlining，按量转包年包月中 post2PrePayIng 
     * @return Status 数据订阅生命周期状态，可能的值为：正常 normal, 隔离中 isolating, 已隔离 isolated, 下线中 offlining，按量转包年包月中 post2PrePayIng
     */
    public String [] getStatus() {
        return this.Status;
    }

    /**
     * Set 数据订阅生命周期状态，可能的值为：正常 normal, 隔离中 isolating, 已隔离 isolated, 下线中 offlining，按量转包年包月中 post2PrePayIng
     * @param Status 数据订阅生命周期状态，可能的值为：正常 normal, 隔离中 isolating, 已隔离 isolated, 下线中 offlining，按量转包年包月中 post2PrePayIng
     */
    public void setStatus(String [] Status) {
        this.Status = Status;
    }

    /**
     * Get 数据订阅状态，可能的值为：未启动 notStarted, 校验中 checking, 校验不通过 checkNotPass, 校验通过 checkPass, 启动中 starting, 运行中 running, 异常出错 error 
     * @return SubsStatus 数据订阅状态，可能的值为：未启动 notStarted, 校验中 checking, 校验不通过 checkNotPass, 校验通过 checkPass, 启动中 starting, 运行中 running, 异常出错 error
     */
    public String [] getSubsStatus() {
        return this.SubsStatus;
    }

    /**
     * Set 数据订阅状态，可能的值为：未启动 notStarted, 校验中 checking, 校验不通过 checkNotPass, 校验通过 checkPass, 启动中 starting, 运行中 running, 异常出错 error
     * @param SubsStatus 数据订阅状态，可能的值为：未启动 notStarted, 校验中 checking, 校验不通过 checkNotPass, 校验通过 checkPass, 启动中 starting, 运行中 running, 异常出错 error
     */
    public void setSubsStatus(String [] SubsStatus) {
        this.SubsStatus = SubsStatus;
    }

    /**
     * Get 返回记录的起始偏移量。默认0 
     * @return Offset 返回记录的起始偏移量。默认0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 返回记录的起始偏移量。默认0
     * @param Offset 返回记录的起始偏移量。默认0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 单次返回的记录数量。默认20，最大100 
     * @return Limit 单次返回的记录数量。默认20，最大100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 单次返回的记录数量。默认20，最大100
     * @param Limit 单次返回的记录数量。默认20，最大100
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
     * Get tag 过滤条件，多个 TagFilter 之间关系为且 
     * @return TagFilters tag 过滤条件，多个 TagFilter 之间关系为且
     */
    public TagFilter [] getTagFilters() {
        return this.TagFilters;
    }

    /**
     * Set tag 过滤条件，多个 TagFilter 之间关系为且
     * @param TagFilters tag 过滤条件，多个 TagFilter 之间关系为且
     */
    public void setTagFilters(TagFilter [] TagFilters) {
        this.TagFilters = TagFilters;
    }

    public DescribeSubscribeJobsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSubscribeJobsRequest(DescribeSubscribeJobsRequest source) {
        if (source.SubscribeId != null) {
            this.SubscribeId = new String(source.SubscribeId);
        }
        if (source.SubscribeIds != null) {
            this.SubscribeIds = new String[source.SubscribeIds.length];
            for (int i = 0; i < source.SubscribeIds.length; i++) {
                this.SubscribeIds[i] = new String(source.SubscribeIds[i]);
            }
        }
        if (source.SubscribeName != null) {
            this.SubscribeName = new String(source.SubscribeName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.PayType != null) {
            this.PayType = new Long(source.PayType);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubscribeId", this.SubscribeId);
        this.setParamArraySimple(map, prefix + "SubscribeIds.", this.SubscribeIds);
        this.setParamSimple(map, prefix + "SubscribeName", this.SubscribeName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "PayType", this.PayType);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);
        this.setParamArraySimple(map, prefix + "SubsStatus.", this.SubsStatus);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderDirection", this.OrderDirection);
        this.setParamArrayObj(map, prefix + "TagFilters.", this.TagFilters);

    }
}

