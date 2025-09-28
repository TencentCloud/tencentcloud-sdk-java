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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBInstancesRequest extends AbstractModel {

    /**
    * 实例 ID 列表。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 指定查询的实例类型。取值范围如下：
- 0：所有实例。
- 1：正式实例。
- 2：临时实例
- 3：只读实例。
- -1：查询同时包括正式实例、只读实例与灾备实例。
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * 指定所查询实例的集群类型，取值范围如下：
- 0：副本集实例。
- 1：分片实例。
- -1：副本集与分片实例。
    */
    @SerializedName("ClusterType")
    @Expose
    private Long ClusterType;

    /**
    * 指定所查询实例的当前状态，取值范围如下所示：
- 0：待初始化。
- 1：流程处理中，例如：变更规格、参数修改等。
- 2：实例正常运行中。
- -2：已隔离（包年包月）。
- -3：已隔离（按量计费）。
    */
    @SerializedName("Status")
    @Expose
    private Long [] Status;

    /**
    * 私有网络的 ID。
- 基础网络则无需配置该参数。
- 请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表中，单击私有网络名称，在**私有网络**页面获取其 ID。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 私有网络的子网ID。
- 基础网络则无需配置该参数。
- 请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表中，单击私有网络名称，在**私有网络**页面获取其子网 ID。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 指定所查询实例的付费类型。
- 0：查询按量计费实例。
- 1：查询包年包月实例。
- -1：查询按量计费与包年包月实例。
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 单次请求返回的数量。默认值为20，取值范围为(1,100]。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量，默认值为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 配置返回结果排序依据的字段。目前支持依据"ProjectId"、"InstanceName"、"CreateTime"排序。
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 配置返回结果的排序方式。
- ASC：升序。
- DESC：降序。
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
    * 项目 ID。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)，在右上角的账户信息下拉菜单中，选择项目管理查询项目。
    */
    @SerializedName("ProjectIds")
    @Expose
    private Long [] ProjectIds;

    /**
    * 指定查询搜索的关键词。支持设置为具体的实例ID、实例名称或者内网 IP 地址。
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
    * 标签信息，包含标签键与标签值。
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
     * Get 实例 ID 列表。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。 
     * @return InstanceIds 实例 ID 列表。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 实例 ID 列表。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。
     * @param InstanceIds 实例 ID 列表。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 指定查询的实例类型。取值范围如下：
- 0：所有实例。
- 1：正式实例。
- 2：临时实例
- 3：只读实例。
- -1：查询同时包括正式实例、只读实例与灾备实例。 
     * @return InstanceType 指定查询的实例类型。取值范围如下：
- 0：所有实例。
- 1：正式实例。
- 2：临时实例
- 3：只读实例。
- -1：查询同时包括正式实例、只读实例与灾备实例。
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 指定查询的实例类型。取值范围如下：
- 0：所有实例。
- 1：正式实例。
- 2：临时实例
- 3：只读实例。
- -1：查询同时包括正式实例、只读实例与灾备实例。
     * @param InstanceType 指定查询的实例类型。取值范围如下：
- 0：所有实例。
- 1：正式实例。
- 2：临时实例
- 3：只读实例。
- -1：查询同时包括正式实例、只读实例与灾备实例。
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 指定所查询实例的集群类型，取值范围如下：
- 0：副本集实例。
- 1：分片实例。
- -1：副本集与分片实例。 
     * @return ClusterType 指定所查询实例的集群类型，取值范围如下：
- 0：副本集实例。
- 1：分片实例。
- -1：副本集与分片实例。
     */
    public Long getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set 指定所查询实例的集群类型，取值范围如下：
- 0：副本集实例。
- 1：分片实例。
- -1：副本集与分片实例。
     * @param ClusterType 指定所查询实例的集群类型，取值范围如下：
- 0：副本集实例。
- 1：分片实例。
- -1：副本集与分片实例。
     */
    public void setClusterType(Long ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get 指定所查询实例的当前状态，取值范围如下所示：
- 0：待初始化。
- 1：流程处理中，例如：变更规格、参数修改等。
- 2：实例正常运行中。
- -2：已隔离（包年包月）。
- -3：已隔离（按量计费）。 
     * @return Status 指定所查询实例的当前状态，取值范围如下所示：
- 0：待初始化。
- 1：流程处理中，例如：变更规格、参数修改等。
- 2：实例正常运行中。
- -2：已隔离（包年包月）。
- -3：已隔离（按量计费）。
     */
    public Long [] getStatus() {
        return this.Status;
    }

    /**
     * Set 指定所查询实例的当前状态，取值范围如下所示：
- 0：待初始化。
- 1：流程处理中，例如：变更规格、参数修改等。
- 2：实例正常运行中。
- -2：已隔离（包年包月）。
- -3：已隔离（按量计费）。
     * @param Status 指定所查询实例的当前状态，取值范围如下所示：
- 0：待初始化。
- 1：流程处理中，例如：变更规格、参数修改等。
- 2：实例正常运行中。
- -2：已隔离（包年包月）。
- -3：已隔离（按量计费）。
     */
    public void setStatus(Long [] Status) {
        this.Status = Status;
    }

    /**
     * Get 私有网络的 ID。
- 基础网络则无需配置该参数。
- 请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表中，单击私有网络名称，在**私有网络**页面获取其 ID。 
     * @return VpcId 私有网络的 ID。
- 基础网络则无需配置该参数。
- 请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表中，单击私有网络名称，在**私有网络**页面获取其 ID。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络的 ID。
- 基础网络则无需配置该参数。
- 请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表中，单击私有网络名称，在**私有网络**页面获取其 ID。
     * @param VpcId 私有网络的 ID。
- 基础网络则无需配置该参数。
- 请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表中，单击私有网络名称，在**私有网络**页面获取其 ID。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 私有网络的子网ID。
- 基础网络则无需配置该参数。
- 请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表中，单击私有网络名称，在**私有网络**页面获取其子网 ID。 
     * @return SubnetId 私有网络的子网ID。
- 基础网络则无需配置该参数。
- 请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表中，单击私有网络名称，在**私有网络**页面获取其子网 ID。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 私有网络的子网ID。
- 基础网络则无需配置该参数。
- 请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表中，单击私有网络名称，在**私有网络**页面获取其子网 ID。
     * @param SubnetId 私有网络的子网ID。
- 基础网络则无需配置该参数。
- 请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表中，单击私有网络名称，在**私有网络**页面获取其子网 ID。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 指定所查询实例的付费类型。
- 0：查询按量计费实例。
- 1：查询包年包月实例。
- -1：查询按量计费与包年包月实例。 
     * @return PayMode 指定所查询实例的付费类型。
- 0：查询按量计费实例。
- 1：查询包年包月实例。
- -1：查询按量计费与包年包月实例。
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 指定所查询实例的付费类型。
- 0：查询按量计费实例。
- 1：查询包年包月实例。
- -1：查询按量计费与包年包月实例。
     * @param PayMode 指定所查询实例的付费类型。
- 0：查询按量计费实例。
- 1：查询包年包月实例。
- -1：查询按量计费与包年包月实例。
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 单次请求返回的数量。默认值为20，取值范围为(1,100]。 
     * @return Limit 单次请求返回的数量。默认值为20，取值范围为(1,100]。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 单次请求返回的数量。默认值为20，取值范围为(1,100]。
     * @param Limit 单次请求返回的数量。默认值为20，取值范围为(1,100]。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量，默认值为0。 
     * @return Offset 偏移量，默认值为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认值为0。
     * @param Offset 偏移量，默认值为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 配置返回结果排序依据的字段。目前支持依据"ProjectId"、"InstanceName"、"CreateTime"排序。 
     * @return OrderBy 配置返回结果排序依据的字段。目前支持依据"ProjectId"、"InstanceName"、"CreateTime"排序。
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 配置返回结果排序依据的字段。目前支持依据"ProjectId"、"InstanceName"、"CreateTime"排序。
     * @param OrderBy 配置返回结果排序依据的字段。目前支持依据"ProjectId"、"InstanceName"、"CreateTime"排序。
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 配置返回结果的排序方式。
- ASC：升序。
- DESC：降序。 
     * @return OrderByType 配置返回结果的排序方式。
- ASC：升序。
- DESC：降序。
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set 配置返回结果的排序方式。
- ASC：升序。
- DESC：降序。
     * @param OrderByType 配置返回结果的排序方式。
- ASC：升序。
- DESC：降序。
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    /**
     * Get 项目 ID。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)，在右上角的账户信息下拉菜单中，选择项目管理查询项目。 
     * @return ProjectIds 项目 ID。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)，在右上角的账户信息下拉菜单中，选择项目管理查询项目。
     */
    public Long [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set 项目 ID。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)，在右上角的账户信息下拉菜单中，选择项目管理查询项目。
     * @param ProjectIds 项目 ID。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)，在右上角的账户信息下拉菜单中，选择项目管理查询项目。
     */
    public void setProjectIds(Long [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get 指定查询搜索的关键词。支持设置为具体的实例ID、实例名称或者内网 IP 地址。 
     * @return SearchKey 指定查询搜索的关键词。支持设置为具体的实例ID、实例名称或者内网 IP 地址。
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set 指定查询搜索的关键词。支持设置为具体的实例ID、实例名称或者内网 IP 地址。
     * @param SearchKey 指定查询搜索的关键词。支持设置为具体的实例ID、实例名称或者内网 IP 地址。
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    /**
     * Get 标签信息，包含标签键与标签值。 
     * @return Tags 标签信息，包含标签键与标签值。
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签信息，包含标签键与标签值。
     * @param Tags 标签信息，包含标签键与标签值。
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    public DescribeDBInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBInstancesRequest(DescribeDBInstancesRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.InstanceType != null) {
            this.InstanceType = new Long(source.InstanceType);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new Long(source.ClusterType);
        }
        if (source.Status != null) {
            this.Status = new Long[source.Status.length];
            for (int i = 0; i < source.Status.length; i++) {
                this.Status[i] = new Long(source.Status[i]);
            }
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderByType != null) {
            this.OrderByType = new String(source.OrderByType);
        }
        if (source.ProjectIds != null) {
            this.ProjectIds = new Long[source.ProjectIds.length];
            for (int i = 0; i < source.ProjectIds.length; i++) {
                this.ProjectIds[i] = new Long(source.ProjectIds[i]);
            }
        }
        if (source.SearchKey != null) {
            this.SearchKey = new String(source.SearchKey);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

