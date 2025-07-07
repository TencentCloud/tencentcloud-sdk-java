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
package com.tencentcloudapi.mqtt.v20240516.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDeviceCertificatesRequest extends AbstractModel {

    /**
    * 腾讯云MQTT实例ID，从 [DescribeInstanceList](https://cloud.tencent.com/document/api/1778/111029)接口或控制台获得。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 支持搜索参数
ClientId：客户端id，根据实际业务使用获取
CaSn：所属的CA证书SN序列号 可以从 [查询集群CA证书列表](https://cloud.tencent.com/document/api/1778/116206) 或者实际业务使用获取
DeviceCertificateSn：设备证书SN序列号 可从[查询设备证书详情](https://cloud.tencent.com/document/api/1778/113748) 获取
DeviceCertificateCn：设备证书CN 可从[查询设备证书详情](https://cloud.tencent.com/document/api/1778/113748) 获取
OrganizationalUnit：证书OU
NotAfterEnd：过期时间小于等于指定时间的证书
NotAfterStart：过期时间大于等于指定时间的证书
Status：设备证书状态     ACTIVE（激活）； INACTIVE（未激活）REVOKED（吊销）；PENDING_ACTIVATION（注册待激活）

    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 分页limit，默认20，最大100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页偏移量，默认0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 排序规则
    CREATE_TIME_DESC, 创建时间降序
    CREATE_TIME_ASC,创建时间升序
    UPDATE_TIME_DESC,更新时间降序
    UPDATE_TIME_ASC,更新时间升序
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
     * Get 腾讯云MQTT实例ID，从 [DescribeInstanceList](https://cloud.tencent.com/document/api/1778/111029)接口或控制台获得。 
     * @return InstanceId 腾讯云MQTT实例ID，从 [DescribeInstanceList](https://cloud.tencent.com/document/api/1778/111029)接口或控制台获得。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 腾讯云MQTT实例ID，从 [DescribeInstanceList](https://cloud.tencent.com/document/api/1778/111029)接口或控制台获得。
     * @param InstanceId 腾讯云MQTT实例ID，从 [DescribeInstanceList](https://cloud.tencent.com/document/api/1778/111029)接口或控制台获得。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 支持搜索参数
ClientId：客户端id，根据实际业务使用获取
CaSn：所属的CA证书SN序列号 可以从 [查询集群CA证书列表](https://cloud.tencent.com/document/api/1778/116206) 或者实际业务使用获取
DeviceCertificateSn：设备证书SN序列号 可从[查询设备证书详情](https://cloud.tencent.com/document/api/1778/113748) 获取
DeviceCertificateCn：设备证书CN 可从[查询设备证书详情](https://cloud.tencent.com/document/api/1778/113748) 获取
OrganizationalUnit：证书OU
NotAfterEnd：过期时间小于等于指定时间的证书
NotAfterStart：过期时间大于等于指定时间的证书
Status：设备证书状态     ACTIVE（激活）； INACTIVE（未激活）REVOKED（吊销）；PENDING_ACTIVATION（注册待激活）
 
     * @return Filters 支持搜索参数
ClientId：客户端id，根据实际业务使用获取
CaSn：所属的CA证书SN序列号 可以从 [查询集群CA证书列表](https://cloud.tencent.com/document/api/1778/116206) 或者实际业务使用获取
DeviceCertificateSn：设备证书SN序列号 可从[查询设备证书详情](https://cloud.tencent.com/document/api/1778/113748) 获取
DeviceCertificateCn：设备证书CN 可从[查询设备证书详情](https://cloud.tencent.com/document/api/1778/113748) 获取
OrganizationalUnit：证书OU
NotAfterEnd：过期时间小于等于指定时间的证书
NotAfterStart：过期时间大于等于指定时间的证书
Status：设备证书状态     ACTIVE（激活）； INACTIVE（未激活）REVOKED（吊销）；PENDING_ACTIVATION（注册待激活）

     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 支持搜索参数
ClientId：客户端id，根据实际业务使用获取
CaSn：所属的CA证书SN序列号 可以从 [查询集群CA证书列表](https://cloud.tencent.com/document/api/1778/116206) 或者实际业务使用获取
DeviceCertificateSn：设备证书SN序列号 可从[查询设备证书详情](https://cloud.tencent.com/document/api/1778/113748) 获取
DeviceCertificateCn：设备证书CN 可从[查询设备证书详情](https://cloud.tencent.com/document/api/1778/113748) 获取
OrganizationalUnit：证书OU
NotAfterEnd：过期时间小于等于指定时间的证书
NotAfterStart：过期时间大于等于指定时间的证书
Status：设备证书状态     ACTIVE（激活）； INACTIVE（未激活）REVOKED（吊销）；PENDING_ACTIVATION（注册待激活）

     * @param Filters 支持搜索参数
ClientId：客户端id，根据实际业务使用获取
CaSn：所属的CA证书SN序列号 可以从 [查询集群CA证书列表](https://cloud.tencent.com/document/api/1778/116206) 或者实际业务使用获取
DeviceCertificateSn：设备证书SN序列号 可从[查询设备证书详情](https://cloud.tencent.com/document/api/1778/113748) 获取
DeviceCertificateCn：设备证书CN 可从[查询设备证书详情](https://cloud.tencent.com/document/api/1778/113748) 获取
OrganizationalUnit：证书OU
NotAfterEnd：过期时间小于等于指定时间的证书
NotAfterStart：过期时间大于等于指定时间的证书
Status：设备证书状态     ACTIVE（激活）； INACTIVE（未激活）REVOKED（吊销）；PENDING_ACTIVATION（注册待激活）

     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 分页limit，默认20，最大100 
     * @return Limit 分页limit，默认20，最大100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页limit，默认20，最大100
     * @param Limit 分页limit，默认20，最大100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页偏移量，默认0 
     * @return Offset 分页偏移量，默认0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量，默认0
     * @param Offset 分页偏移量，默认0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 排序规则
    CREATE_TIME_DESC, 创建时间降序
    CREATE_TIME_ASC,创建时间升序
    UPDATE_TIME_DESC,更新时间降序
    UPDATE_TIME_ASC,更新时间升序 
     * @return OrderBy 排序规则
    CREATE_TIME_DESC, 创建时间降序
    CREATE_TIME_ASC,创建时间升序
    UPDATE_TIME_DESC,更新时间降序
    UPDATE_TIME_ASC,更新时间升序
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序规则
    CREATE_TIME_DESC, 创建时间降序
    CREATE_TIME_ASC,创建时间升序
    UPDATE_TIME_DESC,更新时间降序
    UPDATE_TIME_ASC,更新时间升序
     * @param OrderBy 排序规则
    CREATE_TIME_DESC, 创建时间降序
    CREATE_TIME_ASC,创建时间升序
    UPDATE_TIME_DESC,更新时间降序
    UPDATE_TIME_ASC,更新时间升序
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    public DescribeDeviceCertificatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDeviceCertificatesRequest(DescribeDeviceCertificatesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);

    }
}

