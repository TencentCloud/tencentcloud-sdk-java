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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEdrAlertListRequest extends AbstractModel {

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>过滤条件，支持的 Name 如下：<br/>【资源属性过滤】（前缀模糊，后端自动反查资产后按实例过滤）<br/>InstanceName - string - 是否必填：否 - 资产名称（前缀匹配）<br/>InstanceID - string - 是否必填：否 - 实例ID（前缀匹配）<br/>IP - string - 是否必填：否 - IP地址，支持内网/外网IP（前缀匹配）<br/>Tags - string - 是否必填：否 - 腾讯云标签，格式 tagKey$tagValue（仅单账号场景生效）<br/>CSIPTag - string - 是否必填：否 - 安全中心标签名称（前缀匹配，按语言环境匹配中/英文字段）<br/>AssetTagIds - string - 是否必填：否 - 安全中心资产标签ID（精确匹配，多个标签ID之间为或关系；标签ID可通过资产中心标签树接口 DescribeAssetTagTree 获取）<br/>【容器维度过滤】（前缀模糊，命中后仅返回容器告警）<br/>ClusterName - string - 是否必填：否 - 集群名称（前缀匹配）<br/>ContainerName - string - 是否必填：否 - 容器名称（前缀匹配）<br/>【告警字段过滤】（精确匹配，支持多值）<br/>Status - int - 是否必填：否 - 处理状态<br/>Level - int - 是否必填：否 - 威胁等级<br/>AlertCategory - string - 是否必填：否 - 告警大类<br/>AlertSubType - string - 是否必填：否 - 告警子类型<br/>AttackStage - string - 是否必填：否 - 攻击阶段<br/>DetectMode - string - 是否必填：否 - 检测模式<br/>AlertSource - string - 是否必填：否 - 告警来源（HOST/CONTAINER）<br/>AlertId - string - 是否必填：否 - 告警ID<br/>InstanceId - string - 是否必填：否 - 实例ID（精确匹配）<br/>ContainerId - string - 是否必填：否 - 容器ID（精确匹配）<br/>ClusterId - string - 是否必填：否 - 集群ID（精确匹配）<br/>【时间范围】<br/>StartTime - string - 是否必填：否 - 开始时间，格式 2006-01-02 15:04:05（默认近180天）<br/>EndTime - string - 是否必填：否 - 结束时间，格式 2006-01-02 15:04:05（默认当前时间）</p>
    */
    @SerializedName("Filters")
    @Expose
    private EDRFilter [] Filters;

    /**
    * <p>限制条数,默认10,最大100</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>偏移量,默认0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>排序方式: [ASC:升序|DESC:降序]</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>可选排序列: [LatestDetectTime]</p>
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>过滤条件，支持的 Name 如下：<br/>【资源属性过滤】（前缀模糊，后端自动反查资产后按实例过滤）<br/>InstanceName - string - 是否必填：否 - 资产名称（前缀匹配）<br/>InstanceID - string - 是否必填：否 - 实例ID（前缀匹配）<br/>IP - string - 是否必填：否 - IP地址，支持内网/外网IP（前缀匹配）<br/>Tags - string - 是否必填：否 - 腾讯云标签，格式 tagKey$tagValue（仅单账号场景生效）<br/>CSIPTag - string - 是否必填：否 - 安全中心标签名称（前缀匹配，按语言环境匹配中/英文字段）<br/>AssetTagIds - string - 是否必填：否 - 安全中心资产标签ID（精确匹配，多个标签ID之间为或关系；标签ID可通过资产中心标签树接口 DescribeAssetTagTree 获取）<br/>【容器维度过滤】（前缀模糊，命中后仅返回容器告警）<br/>ClusterName - string - 是否必填：否 - 集群名称（前缀匹配）<br/>ContainerName - string - 是否必填：否 - 容器名称（前缀匹配）<br/>【告警字段过滤】（精确匹配，支持多值）<br/>Status - int - 是否必填：否 - 处理状态<br/>Level - int - 是否必填：否 - 威胁等级<br/>AlertCategory - string - 是否必填：否 - 告警大类<br/>AlertSubType - string - 是否必填：否 - 告警子类型<br/>AttackStage - string - 是否必填：否 - 攻击阶段<br/>DetectMode - string - 是否必填：否 - 检测模式<br/>AlertSource - string - 是否必填：否 - 告警来源（HOST/CONTAINER）<br/>AlertId - string - 是否必填：否 - 告警ID<br/>InstanceId - string - 是否必填：否 - 实例ID（精确匹配）<br/>ContainerId - string - 是否必填：否 - 容器ID（精确匹配）<br/>ClusterId - string - 是否必填：否 - 集群ID（精确匹配）<br/>【时间范围】<br/>StartTime - string - 是否必填：否 - 开始时间，格式 2006-01-02 15:04:05（默认近180天）<br/>EndTime - string - 是否必填：否 - 结束时间，格式 2006-01-02 15:04:05（默认当前时间）</p> 
     * @return Filters <p>过滤条件，支持的 Name 如下：<br/>【资源属性过滤】（前缀模糊，后端自动反查资产后按实例过滤）<br/>InstanceName - string - 是否必填：否 - 资产名称（前缀匹配）<br/>InstanceID - string - 是否必填：否 - 实例ID（前缀匹配）<br/>IP - string - 是否必填：否 - IP地址，支持内网/外网IP（前缀匹配）<br/>Tags - string - 是否必填：否 - 腾讯云标签，格式 tagKey$tagValue（仅单账号场景生效）<br/>CSIPTag - string - 是否必填：否 - 安全中心标签名称（前缀匹配，按语言环境匹配中/英文字段）<br/>AssetTagIds - string - 是否必填：否 - 安全中心资产标签ID（精确匹配，多个标签ID之间为或关系；标签ID可通过资产中心标签树接口 DescribeAssetTagTree 获取）<br/>【容器维度过滤】（前缀模糊，命中后仅返回容器告警）<br/>ClusterName - string - 是否必填：否 - 集群名称（前缀匹配）<br/>ContainerName - string - 是否必填：否 - 容器名称（前缀匹配）<br/>【告警字段过滤】（精确匹配，支持多值）<br/>Status - int - 是否必填：否 - 处理状态<br/>Level - int - 是否必填：否 - 威胁等级<br/>AlertCategory - string - 是否必填：否 - 告警大类<br/>AlertSubType - string - 是否必填：否 - 告警子类型<br/>AttackStage - string - 是否必填：否 - 攻击阶段<br/>DetectMode - string - 是否必填：否 - 检测模式<br/>AlertSource - string - 是否必填：否 - 告警来源（HOST/CONTAINER）<br/>AlertId - string - 是否必填：否 - 告警ID<br/>InstanceId - string - 是否必填：否 - 实例ID（精确匹配）<br/>ContainerId - string - 是否必填：否 - 容器ID（精确匹配）<br/>ClusterId - string - 是否必填：否 - 集群ID（精确匹配）<br/>【时间范围】<br/>StartTime - string - 是否必填：否 - 开始时间，格式 2006-01-02 15:04:05（默认近180天）<br/>EndTime - string - 是否必填：否 - 结束时间，格式 2006-01-02 15:04:05（默认当前时间）</p>
     */
    public EDRFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件，支持的 Name 如下：<br/>【资源属性过滤】（前缀模糊，后端自动反查资产后按实例过滤）<br/>InstanceName - string - 是否必填：否 - 资产名称（前缀匹配）<br/>InstanceID - string - 是否必填：否 - 实例ID（前缀匹配）<br/>IP - string - 是否必填：否 - IP地址，支持内网/外网IP（前缀匹配）<br/>Tags - string - 是否必填：否 - 腾讯云标签，格式 tagKey$tagValue（仅单账号场景生效）<br/>CSIPTag - string - 是否必填：否 - 安全中心标签名称（前缀匹配，按语言环境匹配中/英文字段）<br/>AssetTagIds - string - 是否必填：否 - 安全中心资产标签ID（精确匹配，多个标签ID之间为或关系；标签ID可通过资产中心标签树接口 DescribeAssetTagTree 获取）<br/>【容器维度过滤】（前缀模糊，命中后仅返回容器告警）<br/>ClusterName - string - 是否必填：否 - 集群名称（前缀匹配）<br/>ContainerName - string - 是否必填：否 - 容器名称（前缀匹配）<br/>【告警字段过滤】（精确匹配，支持多值）<br/>Status - int - 是否必填：否 - 处理状态<br/>Level - int - 是否必填：否 - 威胁等级<br/>AlertCategory - string - 是否必填：否 - 告警大类<br/>AlertSubType - string - 是否必填：否 - 告警子类型<br/>AttackStage - string - 是否必填：否 - 攻击阶段<br/>DetectMode - string - 是否必填：否 - 检测模式<br/>AlertSource - string - 是否必填：否 - 告警来源（HOST/CONTAINER）<br/>AlertId - string - 是否必填：否 - 告警ID<br/>InstanceId - string - 是否必填：否 - 实例ID（精确匹配）<br/>ContainerId - string - 是否必填：否 - 容器ID（精确匹配）<br/>ClusterId - string - 是否必填：否 - 集群ID（精确匹配）<br/>【时间范围】<br/>StartTime - string - 是否必填：否 - 开始时间，格式 2006-01-02 15:04:05（默认近180天）<br/>EndTime - string - 是否必填：否 - 结束时间，格式 2006-01-02 15:04:05（默认当前时间）</p>
     * @param Filters <p>过滤条件，支持的 Name 如下：<br/>【资源属性过滤】（前缀模糊，后端自动反查资产后按实例过滤）<br/>InstanceName - string - 是否必填：否 - 资产名称（前缀匹配）<br/>InstanceID - string - 是否必填：否 - 实例ID（前缀匹配）<br/>IP - string - 是否必填：否 - IP地址，支持内网/外网IP（前缀匹配）<br/>Tags - string - 是否必填：否 - 腾讯云标签，格式 tagKey$tagValue（仅单账号场景生效）<br/>CSIPTag - string - 是否必填：否 - 安全中心标签名称（前缀匹配，按语言环境匹配中/英文字段）<br/>AssetTagIds - string - 是否必填：否 - 安全中心资产标签ID（精确匹配，多个标签ID之间为或关系；标签ID可通过资产中心标签树接口 DescribeAssetTagTree 获取）<br/>【容器维度过滤】（前缀模糊，命中后仅返回容器告警）<br/>ClusterName - string - 是否必填：否 - 集群名称（前缀匹配）<br/>ContainerName - string - 是否必填：否 - 容器名称（前缀匹配）<br/>【告警字段过滤】（精确匹配，支持多值）<br/>Status - int - 是否必填：否 - 处理状态<br/>Level - int - 是否必填：否 - 威胁等级<br/>AlertCategory - string - 是否必填：否 - 告警大类<br/>AlertSubType - string - 是否必填：否 - 告警子类型<br/>AttackStage - string - 是否必填：否 - 攻击阶段<br/>DetectMode - string - 是否必填：否 - 检测模式<br/>AlertSource - string - 是否必填：否 - 告警来源（HOST/CONTAINER）<br/>AlertId - string - 是否必填：否 - 告警ID<br/>InstanceId - string - 是否必填：否 - 实例ID（精确匹配）<br/>ContainerId - string - 是否必填：否 - 容器ID（精确匹配）<br/>ClusterId - string - 是否必填：否 - 集群ID（精确匹配）<br/>【时间范围】<br/>StartTime - string - 是否必填：否 - 开始时间，格式 2006-01-02 15:04:05（默认近180天）<br/>EndTime - string - 是否必填：否 - 结束时间，格式 2006-01-02 15:04:05（默认当前时间）</p>
     */
    public void setFilters(EDRFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>限制条数,默认10,最大100</p> 
     * @return Limit <p>限制条数,默认10,最大100</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>限制条数,默认10,最大100</p>
     * @param Limit <p>限制条数,默认10,最大100</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>偏移量,默认0</p> 
     * @return Offset <p>偏移量,默认0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量,默认0</p>
     * @param Offset <p>偏移量,默认0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>排序方式: [ASC:升序|DESC:降序]</p> 
     * @return Order <p>排序方式: [ASC:升序|DESC:降序]</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>排序方式: [ASC:升序|DESC:降序]</p>
     * @param Order <p>排序方式: [ASC:升序|DESC:降序]</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>可选排序列: [LatestDetectTime]</p> 
     * @return By <p>可选排序列: [LatestDetectTime]</p>
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set <p>可选排序列: [LatestDetectTime]</p>
     * @param By <p>可选排序列: [LatestDetectTime]</p>
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeEdrAlertListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEdrAlertListRequest(DescribeEdrAlertListRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new EDRFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new EDRFilter(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

