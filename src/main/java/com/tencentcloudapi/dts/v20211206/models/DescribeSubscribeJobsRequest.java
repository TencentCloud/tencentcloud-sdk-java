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
    * <p>订阅 ID 筛选，精确匹配</p>
    */
    @SerializedName("SubscribeId")
    @Expose
    private String SubscribeId;

    /**
    * <p>订阅 ID 筛选，精确匹配</p>
    */
    @SerializedName("SubscribeIds")
    @Expose
    private String [] SubscribeIds;

    /**
    * <p>订阅名称，前缀模糊匹配</p>
    */
    @SerializedName("SubscribeName")
    @Expose
    private String SubscribeName;

    /**
    * <p>订阅的云上数据库实例的 ID，精确匹配</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>订阅的topicName</p>
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * <p>计费模式筛选，可能的值：0-包年包月，1-按量计费</p>
    */
    @SerializedName("PayType")
    @Expose
    private Long PayType;

    /**
    * <p>订阅的数据库产品，目前支持 cynosdbmysql,mariadb,mongodb,mysql,percona,tdpg,tdsqlpercona(tdsqlmysql)</p>
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * <p>数据订阅生命周期状态，可能的值为：正常 normal, 隔离中 isolating, 已隔离 isolated, 下线中 offlining，按量转包年包月中 post2PrePayIng</p>
    */
    @SerializedName("Status")
    @Expose
    private String [] Status;

    /**
    * <p>数据订阅状态，可能的值为：未启动 notStarted, 校验中 checking, 校验不通过 checkNotPass, 校验通过 checkPass, 启动中 starting, 运行中 running, 异常出错 error</p>
    */
    @SerializedName("SubsStatus")
    @Expose
    private String [] SubsStatus;

    /**
    * <p>返回记录的起始偏移量。默认0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>单次返回的记录数量。默认20，最大100</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>排序方向，可选的值为&quot;DESC&quot;和&quot;ASC&quot;，默认为&quot;DESC&quot;，按创建时间逆序排序</p>
    */
    @SerializedName("OrderDirection")
    @Expose
    private String OrderDirection;

    /**
    * <p>tag 过滤条件，多个 TagFilter 之间关系为且</p>
    */
    @SerializedName("TagFilters")
    @Expose
    private TagFilter [] TagFilters;

    /**
     * Get <p>订阅 ID 筛选，精确匹配</p> 
     * @return SubscribeId <p>订阅 ID 筛选，精确匹配</p>
     */
    public String getSubscribeId() {
        return this.SubscribeId;
    }

    /**
     * Set <p>订阅 ID 筛选，精确匹配</p>
     * @param SubscribeId <p>订阅 ID 筛选，精确匹配</p>
     */
    public void setSubscribeId(String SubscribeId) {
        this.SubscribeId = SubscribeId;
    }

    /**
     * Get <p>订阅 ID 筛选，精确匹配</p> 
     * @return SubscribeIds <p>订阅 ID 筛选，精确匹配</p>
     */
    public String [] getSubscribeIds() {
        return this.SubscribeIds;
    }

    /**
     * Set <p>订阅 ID 筛选，精确匹配</p>
     * @param SubscribeIds <p>订阅 ID 筛选，精确匹配</p>
     */
    public void setSubscribeIds(String [] SubscribeIds) {
        this.SubscribeIds = SubscribeIds;
    }

    /**
     * Get <p>订阅名称，前缀模糊匹配</p> 
     * @return SubscribeName <p>订阅名称，前缀模糊匹配</p>
     */
    public String getSubscribeName() {
        return this.SubscribeName;
    }

    /**
     * Set <p>订阅名称，前缀模糊匹配</p>
     * @param SubscribeName <p>订阅名称，前缀模糊匹配</p>
     */
    public void setSubscribeName(String SubscribeName) {
        this.SubscribeName = SubscribeName;
    }

    /**
     * Get <p>订阅的云上数据库实例的 ID，精确匹配</p> 
     * @return InstanceId <p>订阅的云上数据库实例的 ID，精确匹配</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>订阅的云上数据库实例的 ID，精确匹配</p>
     * @param InstanceId <p>订阅的云上数据库实例的 ID，精确匹配</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>订阅的topicName</p> 
     * @return Topic <p>订阅的topicName</p>
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set <p>订阅的topicName</p>
     * @param Topic <p>订阅的topicName</p>
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get <p>计费模式筛选，可能的值：0-包年包月，1-按量计费</p> 
     * @return PayType <p>计费模式筛选，可能的值：0-包年包月，1-按量计费</p>
     */
    public Long getPayType() {
        return this.PayType;
    }

    /**
     * Set <p>计费模式筛选，可能的值：0-包年包月，1-按量计费</p>
     * @param PayType <p>计费模式筛选，可能的值：0-包年包月，1-按量计费</p>
     */
    public void setPayType(Long PayType) {
        this.PayType = PayType;
    }

    /**
     * Get <p>订阅的数据库产品，目前支持 cynosdbmysql,mariadb,mongodb,mysql,percona,tdpg,tdsqlpercona(tdsqlmysql)</p> 
     * @return Product <p>订阅的数据库产品，目前支持 cynosdbmysql,mariadb,mongodb,mysql,percona,tdpg,tdsqlpercona(tdsqlmysql)</p>
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set <p>订阅的数据库产品，目前支持 cynosdbmysql,mariadb,mongodb,mysql,percona,tdpg,tdsqlpercona(tdsqlmysql)</p>
     * @param Product <p>订阅的数据库产品，目前支持 cynosdbmysql,mariadb,mongodb,mysql,percona,tdpg,tdsqlpercona(tdsqlmysql)</p>
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get <p>数据订阅生命周期状态，可能的值为：正常 normal, 隔离中 isolating, 已隔离 isolated, 下线中 offlining，按量转包年包月中 post2PrePayIng</p> 
     * @return Status <p>数据订阅生命周期状态，可能的值为：正常 normal, 隔离中 isolating, 已隔离 isolated, 下线中 offlining，按量转包年包月中 post2PrePayIng</p>
     */
    public String [] getStatus() {
        return this.Status;
    }

    /**
     * Set <p>数据订阅生命周期状态，可能的值为：正常 normal, 隔离中 isolating, 已隔离 isolated, 下线中 offlining，按量转包年包月中 post2PrePayIng</p>
     * @param Status <p>数据订阅生命周期状态，可能的值为：正常 normal, 隔离中 isolating, 已隔离 isolated, 下线中 offlining，按量转包年包月中 post2PrePayIng</p>
     */
    public void setStatus(String [] Status) {
        this.Status = Status;
    }

    /**
     * Get <p>数据订阅状态，可能的值为：未启动 notStarted, 校验中 checking, 校验不通过 checkNotPass, 校验通过 checkPass, 启动中 starting, 运行中 running, 异常出错 error</p> 
     * @return SubsStatus <p>数据订阅状态，可能的值为：未启动 notStarted, 校验中 checking, 校验不通过 checkNotPass, 校验通过 checkPass, 启动中 starting, 运行中 running, 异常出错 error</p>
     */
    public String [] getSubsStatus() {
        return this.SubsStatus;
    }

    /**
     * Set <p>数据订阅状态，可能的值为：未启动 notStarted, 校验中 checking, 校验不通过 checkNotPass, 校验通过 checkPass, 启动中 starting, 运行中 running, 异常出错 error</p>
     * @param SubsStatus <p>数据订阅状态，可能的值为：未启动 notStarted, 校验中 checking, 校验不通过 checkNotPass, 校验通过 checkPass, 启动中 starting, 运行中 running, 异常出错 error</p>
     */
    public void setSubsStatus(String [] SubsStatus) {
        this.SubsStatus = SubsStatus;
    }

    /**
     * Get <p>返回记录的起始偏移量。默认0</p> 
     * @return Offset <p>返回记录的起始偏移量。默认0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>返回记录的起始偏移量。默认0</p>
     * @param Offset <p>返回记录的起始偏移量。默认0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>单次返回的记录数量。默认20，最大100</p> 
     * @return Limit <p>单次返回的记录数量。默认20，最大100</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>单次返回的记录数量。默认20，最大100</p>
     * @param Limit <p>单次返回的记录数量。默认20，最大100</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>排序方向，可选的值为&quot;DESC&quot;和&quot;ASC&quot;，默认为&quot;DESC&quot;，按创建时间逆序排序</p> 
     * @return OrderDirection <p>排序方向，可选的值为&quot;DESC&quot;和&quot;ASC&quot;，默认为&quot;DESC&quot;，按创建时间逆序排序</p>
     */
    public String getOrderDirection() {
        return this.OrderDirection;
    }

    /**
     * Set <p>排序方向，可选的值为&quot;DESC&quot;和&quot;ASC&quot;，默认为&quot;DESC&quot;，按创建时间逆序排序</p>
     * @param OrderDirection <p>排序方向，可选的值为&quot;DESC&quot;和&quot;ASC&quot;，默认为&quot;DESC&quot;，按创建时间逆序排序</p>
     */
    public void setOrderDirection(String OrderDirection) {
        this.OrderDirection = OrderDirection;
    }

    /**
     * Get <p>tag 过滤条件，多个 TagFilter 之间关系为且</p> 
     * @return TagFilters <p>tag 过滤条件，多个 TagFilter 之间关系为且</p>
     */
    public TagFilter [] getTagFilters() {
        return this.TagFilters;
    }

    /**
     * Set <p>tag 过滤条件，多个 TagFilter 之间关系为且</p>
     * @param TagFilters <p>tag 过滤条件，多个 TagFilter 之间关系为且</p>
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

