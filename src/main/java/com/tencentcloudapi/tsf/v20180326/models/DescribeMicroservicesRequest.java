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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMicroservicesRequest extends AbstractModel {

    /**
    * 命名空间ID。该参数可以通过调用 [DescribeSimpleNamespaces](https://cloud.tencent.com/document/api/649/36096) 的返回值中的 NamespaceId 字段来获取或通过登录[控制台](https://console.cloud.tencent.com/tsf/resource?tab=namespace)查看；也可以调用[CreateNamespace](https://cloud.tencent.com/document/product/649/36098)创建新的命名空间。
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * 搜索字段。
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * 排序字段。
- create_time：创建时间
默认为创建时间，暂不支持其他值。
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 排序类型。
- 1：倒序
默认为倒序，暂不支持其他值。
    */
    @SerializedName("OrderType")
    @Expose
    private Long OrderType;

    /**
    * 偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认为20，最大值为50。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 状态。
- online：在线
- offline：离线
- single_online：单点在线
    */
    @SerializedName("Status")
    @Expose
    private String [] Status;

    /**
    * 微服务ID列表。该参数可以通过调用 [DescribeMicroservices](https://cloud.tencent.com/document/product/649/36084) 的返回值中的 MicroserviceId 字段来获取或通过登录[控制台](https://console.cloud.tencent.com/tse/tsf-consul?tab=service)查看；也可以调用[CreateMicroserviceWithDetailResp](https://cloud.tencent.com/document/product/649/85860)创建新的微服务。
    */
    @SerializedName("MicroserviceIdList")
    @Expose
    private String [] MicroserviceIdList;

    /**
    * 微服务名称列表。该参数可以通过调用 [DescribeMicroservices](https://cloud.tencent.com/document/product/649/36084) 的返回值中的 MicroserviceName 字段来获取或通过登录[控制台](https://console.cloud.tencent.com/tse/tsf-consul?tab=service)查看；也可以调用[CreateMicroserviceWithDetailResp](https://cloud.tencent.com/document/product/649/85860)创建新的微服务。
    */
    @SerializedName("MicroserviceNameList")
    @Expose
    private String [] MicroserviceNameList;

    /**
    * 注册中心实例ID。业务预留参数，忽略传参。
    */
    @SerializedName("ConfigCenterInstanceId")
    @Expose
    private String ConfigCenterInstanceId;

    /**
     * Get 命名空间ID。该参数可以通过调用 [DescribeSimpleNamespaces](https://cloud.tencent.com/document/api/649/36096) 的返回值中的 NamespaceId 字段来获取或通过登录[控制台](https://console.cloud.tencent.com/tsf/resource?tab=namespace)查看；也可以调用[CreateNamespace](https://cloud.tencent.com/document/product/649/36098)创建新的命名空间。 
     * @return NamespaceId 命名空间ID。该参数可以通过调用 [DescribeSimpleNamespaces](https://cloud.tencent.com/document/api/649/36096) 的返回值中的 NamespaceId 字段来获取或通过登录[控制台](https://console.cloud.tencent.com/tsf/resource?tab=namespace)查看；也可以调用[CreateNamespace](https://cloud.tencent.com/document/product/649/36098)创建新的命名空间。
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set 命名空间ID。该参数可以通过调用 [DescribeSimpleNamespaces](https://cloud.tencent.com/document/api/649/36096) 的返回值中的 NamespaceId 字段来获取或通过登录[控制台](https://console.cloud.tencent.com/tsf/resource?tab=namespace)查看；也可以调用[CreateNamespace](https://cloud.tencent.com/document/product/649/36098)创建新的命名空间。
     * @param NamespaceId 命名空间ID。该参数可以通过调用 [DescribeSimpleNamespaces](https://cloud.tencent.com/document/api/649/36096) 的返回值中的 NamespaceId 字段来获取或通过登录[控制台](https://console.cloud.tencent.com/tsf/resource?tab=namespace)查看；也可以调用[CreateNamespace](https://cloud.tencent.com/document/product/649/36098)创建新的命名空间。
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get 搜索字段。 
     * @return SearchWord 搜索字段。
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set 搜索字段。
     * @param SearchWord 搜索字段。
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Get 排序字段。
- create_time：创建时间
默认为创建时间，暂不支持其他值。 
     * @return OrderBy 排序字段。
- create_time：创建时间
默认为创建时间，暂不支持其他值。
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序字段。
- create_time：创建时间
默认为创建时间，暂不支持其他值。
     * @param OrderBy 排序字段。
- create_time：创建时间
默认为创建时间，暂不支持其他值。
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 排序类型。
- 1：倒序
默认为倒序，暂不支持其他值。 
     * @return OrderType 排序类型。
- 1：倒序
默认为倒序，暂不支持其他值。
     */
    public Long getOrderType() {
        return this.OrderType;
    }

    /**
     * Set 排序类型。
- 1：倒序
默认为倒序，暂不支持其他值。
     * @param OrderType 排序类型。
- 1：倒序
默认为倒序，暂不支持其他值。
     */
    public void setOrderType(Long OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get 偏移量，默认为0。 
     * @return Offset 偏移量，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。
     * @param Offset 偏移量，默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认为20，最大值为50。 
     * @return Limit 返回数量，默认为20，最大值为50。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为20，最大值为50。
     * @param Limit 返回数量，默认为20，最大值为50。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 状态。
- online：在线
- offline：离线
- single_online：单点在线 
     * @return Status 状态。
- online：在线
- offline：离线
- single_online：单点在线
     */
    public String [] getStatus() {
        return this.Status;
    }

    /**
     * Set 状态。
- online：在线
- offline：离线
- single_online：单点在线
     * @param Status 状态。
- online：在线
- offline：离线
- single_online：单点在线
     */
    public void setStatus(String [] Status) {
        this.Status = Status;
    }

    /**
     * Get 微服务ID列表。该参数可以通过调用 [DescribeMicroservices](https://cloud.tencent.com/document/product/649/36084) 的返回值中的 MicroserviceId 字段来获取或通过登录[控制台](https://console.cloud.tencent.com/tse/tsf-consul?tab=service)查看；也可以调用[CreateMicroserviceWithDetailResp](https://cloud.tencent.com/document/product/649/85860)创建新的微服务。 
     * @return MicroserviceIdList 微服务ID列表。该参数可以通过调用 [DescribeMicroservices](https://cloud.tencent.com/document/product/649/36084) 的返回值中的 MicroserviceId 字段来获取或通过登录[控制台](https://console.cloud.tencent.com/tse/tsf-consul?tab=service)查看；也可以调用[CreateMicroserviceWithDetailResp](https://cloud.tencent.com/document/product/649/85860)创建新的微服务。
     */
    public String [] getMicroserviceIdList() {
        return this.MicroserviceIdList;
    }

    /**
     * Set 微服务ID列表。该参数可以通过调用 [DescribeMicroservices](https://cloud.tencent.com/document/product/649/36084) 的返回值中的 MicroserviceId 字段来获取或通过登录[控制台](https://console.cloud.tencent.com/tse/tsf-consul?tab=service)查看；也可以调用[CreateMicroserviceWithDetailResp](https://cloud.tencent.com/document/product/649/85860)创建新的微服务。
     * @param MicroserviceIdList 微服务ID列表。该参数可以通过调用 [DescribeMicroservices](https://cloud.tencent.com/document/product/649/36084) 的返回值中的 MicroserviceId 字段来获取或通过登录[控制台](https://console.cloud.tencent.com/tse/tsf-consul?tab=service)查看；也可以调用[CreateMicroserviceWithDetailResp](https://cloud.tencent.com/document/product/649/85860)创建新的微服务。
     */
    public void setMicroserviceIdList(String [] MicroserviceIdList) {
        this.MicroserviceIdList = MicroserviceIdList;
    }

    /**
     * Get 微服务名称列表。该参数可以通过调用 [DescribeMicroservices](https://cloud.tencent.com/document/product/649/36084) 的返回值中的 MicroserviceName 字段来获取或通过登录[控制台](https://console.cloud.tencent.com/tse/tsf-consul?tab=service)查看；也可以调用[CreateMicroserviceWithDetailResp](https://cloud.tencent.com/document/product/649/85860)创建新的微服务。 
     * @return MicroserviceNameList 微服务名称列表。该参数可以通过调用 [DescribeMicroservices](https://cloud.tencent.com/document/product/649/36084) 的返回值中的 MicroserviceName 字段来获取或通过登录[控制台](https://console.cloud.tencent.com/tse/tsf-consul?tab=service)查看；也可以调用[CreateMicroserviceWithDetailResp](https://cloud.tencent.com/document/product/649/85860)创建新的微服务。
     */
    public String [] getMicroserviceNameList() {
        return this.MicroserviceNameList;
    }

    /**
     * Set 微服务名称列表。该参数可以通过调用 [DescribeMicroservices](https://cloud.tencent.com/document/product/649/36084) 的返回值中的 MicroserviceName 字段来获取或通过登录[控制台](https://console.cloud.tencent.com/tse/tsf-consul?tab=service)查看；也可以调用[CreateMicroserviceWithDetailResp](https://cloud.tencent.com/document/product/649/85860)创建新的微服务。
     * @param MicroserviceNameList 微服务名称列表。该参数可以通过调用 [DescribeMicroservices](https://cloud.tencent.com/document/product/649/36084) 的返回值中的 MicroserviceName 字段来获取或通过登录[控制台](https://console.cloud.tencent.com/tse/tsf-consul?tab=service)查看；也可以调用[CreateMicroserviceWithDetailResp](https://cloud.tencent.com/document/product/649/85860)创建新的微服务。
     */
    public void setMicroserviceNameList(String [] MicroserviceNameList) {
        this.MicroserviceNameList = MicroserviceNameList;
    }

    /**
     * Get 注册中心实例ID。业务预留参数，忽略传参。 
     * @return ConfigCenterInstanceId 注册中心实例ID。业务预留参数，忽略传参。
     */
    public String getConfigCenterInstanceId() {
        return this.ConfigCenterInstanceId;
    }

    /**
     * Set 注册中心实例ID。业务预留参数，忽略传参。
     * @param ConfigCenterInstanceId 注册中心实例ID。业务预留参数，忽略传参。
     */
    public void setConfigCenterInstanceId(String ConfigCenterInstanceId) {
        this.ConfigCenterInstanceId = ConfigCenterInstanceId;
    }

    public DescribeMicroservicesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMicroservicesRequest(DescribeMicroservicesRequest source) {
        if (source.NamespaceId != null) {
            this.NamespaceId = new String(source.NamespaceId);
        }
        if (source.SearchWord != null) {
            this.SearchWord = new String(source.SearchWord);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderType != null) {
            this.OrderType = new Long(source.OrderType);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Status != null) {
            this.Status = new String[source.Status.length];
            for (int i = 0; i < source.Status.length; i++) {
                this.Status[i] = new String(source.Status[i]);
            }
        }
        if (source.MicroserviceIdList != null) {
            this.MicroserviceIdList = new String[source.MicroserviceIdList.length];
            for (int i = 0; i < source.MicroserviceIdList.length; i++) {
                this.MicroserviceIdList[i] = new String(source.MicroserviceIdList[i]);
            }
        }
        if (source.MicroserviceNameList != null) {
            this.MicroserviceNameList = new String[source.MicroserviceNameList.length];
            for (int i = 0; i < source.MicroserviceNameList.length; i++) {
                this.MicroserviceNameList[i] = new String(source.MicroserviceNameList[i]);
            }
        }
        if (source.ConfigCenterInstanceId != null) {
            this.ConfigCenterInstanceId = new String(source.ConfigCenterInstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);
        this.setParamArraySimple(map, prefix + "MicroserviceIdList.", this.MicroserviceIdList);
        this.setParamArraySimple(map, prefix + "MicroserviceNameList.", this.MicroserviceNameList);
        this.setParamSimple(map, prefix + "ConfigCenterInstanceId", this.ConfigCenterInstanceId);

    }
}

