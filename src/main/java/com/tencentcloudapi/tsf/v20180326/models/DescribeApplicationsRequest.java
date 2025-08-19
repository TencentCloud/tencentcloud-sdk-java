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

public class DescribeApplicationsRequest extends AbstractModel {

    /**
    * 搜索字段
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * 排序字段
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 指定排序类型，目前支持：
`0`：降序
`1`：升序
    */
    @SerializedName("OrderType")
    @Expose
    private Long OrderType;

    /**
    * 偏移量，默认为0。关于Offset详见[API简介](https://cloud.tencent.com/document/api/213/568#.E8.BE.93.E5.85.A5.E5.8F.82.E6.95.B0.E4.B8.8E.E8.BF.94.E5.9B.9E.E5.8F.82.E6.95.B0.E9.87.8A.E4.B9.89)
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 数量限制，默认为20，最大值为100。关于Limit详见[API简介](https://cloud.tencent.com/document/api/213/568#.E8.BE.93.E5.85.A5.E5.8F.82.E6.95.B0.E4.B8.8E.E8.BF.94.E5.9B.9E.E5.8F.82.E6.95.B0.E9.87.8A.E4.B9.89)
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 指定应用类型，目前支持：
- `V`：普通应用/CVM应用
- `C`：容器应用
- `S`：serverless 应用
    */
    @SerializedName("ApplicationType")
    @Expose
    private String ApplicationType;

    /**
    * 应用的微服务类型
    */
    @SerializedName("MicroserviceType")
    @Expose
    private String MicroserviceType;

    /**
    * 应用资源类型列表；DEF 表示默认资源类型；GW 表示网关资源类型
    */
    @SerializedName("ApplicationResourceTypeList")
    @Expose
    private String [] ApplicationResourceTypeList;

    /**
    * IdList
    */
    @SerializedName("ApplicationIdList")
    @Expose
    private String [] ApplicationIdList;

    /**
    * 查询多种微服务类型的应用
    */
    @SerializedName("MicroserviceTypeList")
    @Expose
    private String [] MicroserviceTypeList;

    /**
     * Get 搜索字段 
     * @return SearchWord 搜索字段
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set 搜索字段
     * @param SearchWord 搜索字段
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Get 排序字段 
     * @return OrderBy 排序字段
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序字段
     * @param OrderBy 排序字段
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 指定排序类型，目前支持：
`0`：降序
`1`：升序 
     * @return OrderType 指定排序类型，目前支持：
`0`：降序
`1`：升序
     */
    public Long getOrderType() {
        return this.OrderType;
    }

    /**
     * Set 指定排序类型，目前支持：
`0`：降序
`1`：升序
     * @param OrderType 指定排序类型，目前支持：
`0`：降序
`1`：升序
     */
    public void setOrderType(Long OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get 偏移量，默认为0。关于Offset详见[API简介](https://cloud.tencent.com/document/api/213/568#.E8.BE.93.E5.85.A5.E5.8F.82.E6.95.B0.E4.B8.8E.E8.BF.94.E5.9B.9E.E5.8F.82.E6.95.B0.E9.87.8A.E4.B9.89) 
     * @return Offset 偏移量，默认为0。关于Offset详见[API简介](https://cloud.tencent.com/document/api/213/568#.E8.BE.93.E5.85.A5.E5.8F.82.E6.95.B0.E4.B8.8E.E8.BF.94.E5.9B.9E.E5.8F.82.E6.95.B0.E9.87.8A.E4.B9.89)
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。关于Offset详见[API简介](https://cloud.tencent.com/document/api/213/568#.E8.BE.93.E5.85.A5.E5.8F.82.E6.95.B0.E4.B8.8E.E8.BF.94.E5.9B.9E.E5.8F.82.E6.95.B0.E9.87.8A.E4.B9.89)
     * @param Offset 偏移量，默认为0。关于Offset详见[API简介](https://cloud.tencent.com/document/api/213/568#.E8.BE.93.E5.85.A5.E5.8F.82.E6.95.B0.E4.B8.8E.E8.BF.94.E5.9B.9E.E5.8F.82.E6.95.B0.E9.87.8A.E4.B9.89)
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 数量限制，默认为20，最大值为100。关于Limit详见[API简介](https://cloud.tencent.com/document/api/213/568#.E8.BE.93.E5.85.A5.E5.8F.82.E6.95.B0.E4.B8.8E.E8.BF.94.E5.9B.9E.E5.8F.82.E6.95.B0.E9.87.8A.E4.B9.89) 
     * @return Limit 数量限制，默认为20，最大值为100。关于Limit详见[API简介](https://cloud.tencent.com/document/api/213/568#.E8.BE.93.E5.85.A5.E5.8F.82.E6.95.B0.E4.B8.8E.E8.BF.94.E5.9B.9E.E5.8F.82.E6.95.B0.E9.87.8A.E4.B9.89)
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 数量限制，默认为20，最大值为100。关于Limit详见[API简介](https://cloud.tencent.com/document/api/213/568#.E8.BE.93.E5.85.A5.E5.8F.82.E6.95.B0.E4.B8.8E.E8.BF.94.E5.9B.9E.E5.8F.82.E6.95.B0.E9.87.8A.E4.B9.89)
     * @param Limit 数量限制，默认为20，最大值为100。关于Limit详见[API简介](https://cloud.tencent.com/document/api/213/568#.E8.BE.93.E5.85.A5.E5.8F.82.E6.95.B0.E4.B8.8E.E8.BF.94.E5.9B.9E.E5.8F.82.E6.95.B0.E9.87.8A.E4.B9.89)
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 指定应用类型，目前支持：
- `V`：普通应用/CVM应用
- `C`：容器应用
- `S`：serverless 应用 
     * @return ApplicationType 指定应用类型，目前支持：
- `V`：普通应用/CVM应用
- `C`：容器应用
- `S`：serverless 应用
     */
    public String getApplicationType() {
        return this.ApplicationType;
    }

    /**
     * Set 指定应用类型，目前支持：
- `V`：普通应用/CVM应用
- `C`：容器应用
- `S`：serverless 应用
     * @param ApplicationType 指定应用类型，目前支持：
- `V`：普通应用/CVM应用
- `C`：容器应用
- `S`：serverless 应用
     */
    public void setApplicationType(String ApplicationType) {
        this.ApplicationType = ApplicationType;
    }

    /**
     * Get 应用的微服务类型 
     * @return MicroserviceType 应用的微服务类型
     */
    public String getMicroserviceType() {
        return this.MicroserviceType;
    }

    /**
     * Set 应用的微服务类型
     * @param MicroserviceType 应用的微服务类型
     */
    public void setMicroserviceType(String MicroserviceType) {
        this.MicroserviceType = MicroserviceType;
    }

    /**
     * Get 应用资源类型列表；DEF 表示默认资源类型；GW 表示网关资源类型 
     * @return ApplicationResourceTypeList 应用资源类型列表；DEF 表示默认资源类型；GW 表示网关资源类型
     */
    public String [] getApplicationResourceTypeList() {
        return this.ApplicationResourceTypeList;
    }

    /**
     * Set 应用资源类型列表；DEF 表示默认资源类型；GW 表示网关资源类型
     * @param ApplicationResourceTypeList 应用资源类型列表；DEF 表示默认资源类型；GW 表示网关资源类型
     */
    public void setApplicationResourceTypeList(String [] ApplicationResourceTypeList) {
        this.ApplicationResourceTypeList = ApplicationResourceTypeList;
    }

    /**
     * Get IdList 
     * @return ApplicationIdList IdList
     */
    public String [] getApplicationIdList() {
        return this.ApplicationIdList;
    }

    /**
     * Set IdList
     * @param ApplicationIdList IdList
     */
    public void setApplicationIdList(String [] ApplicationIdList) {
        this.ApplicationIdList = ApplicationIdList;
    }

    /**
     * Get 查询多种微服务类型的应用 
     * @return MicroserviceTypeList 查询多种微服务类型的应用
     */
    public String [] getMicroserviceTypeList() {
        return this.MicroserviceTypeList;
    }

    /**
     * Set 查询多种微服务类型的应用
     * @param MicroserviceTypeList 查询多种微服务类型的应用
     */
    public void setMicroserviceTypeList(String [] MicroserviceTypeList) {
        this.MicroserviceTypeList = MicroserviceTypeList;
    }

    public DescribeApplicationsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApplicationsRequest(DescribeApplicationsRequest source) {
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
        if (source.ApplicationType != null) {
            this.ApplicationType = new String(source.ApplicationType);
        }
        if (source.MicroserviceType != null) {
            this.MicroserviceType = new String(source.MicroserviceType);
        }
        if (source.ApplicationResourceTypeList != null) {
            this.ApplicationResourceTypeList = new String[source.ApplicationResourceTypeList.length];
            for (int i = 0; i < source.ApplicationResourceTypeList.length; i++) {
                this.ApplicationResourceTypeList[i] = new String(source.ApplicationResourceTypeList[i]);
            }
        }
        if (source.ApplicationIdList != null) {
            this.ApplicationIdList = new String[source.ApplicationIdList.length];
            for (int i = 0; i < source.ApplicationIdList.length; i++) {
                this.ApplicationIdList[i] = new String(source.ApplicationIdList[i]);
            }
        }
        if (source.MicroserviceTypeList != null) {
            this.MicroserviceTypeList = new String[source.MicroserviceTypeList.length];
            for (int i = 0; i < source.MicroserviceTypeList.length; i++) {
                this.MicroserviceTypeList[i] = new String(source.MicroserviceTypeList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ApplicationType", this.ApplicationType);
        this.setParamSimple(map, prefix + "MicroserviceType", this.MicroserviceType);
        this.setParamArraySimple(map, prefix + "ApplicationResourceTypeList.", this.ApplicationResourceTypeList);
        this.setParamArraySimple(map, prefix + "ApplicationIdList.", this.ApplicationIdList);
        this.setParamArraySimple(map, prefix + "MicroserviceTypeList.", this.MicroserviceTypeList);

    }
}

