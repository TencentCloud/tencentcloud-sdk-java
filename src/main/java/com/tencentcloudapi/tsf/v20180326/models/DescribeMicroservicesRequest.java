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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMicroservicesRequest extends AbstractModel{

    /**
    * 命名空间ID
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

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
    * 排序类型
    */
    @SerializedName("OrderType")
    @Expose
    private Long OrderType;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页个数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 状态过滤，online、offline、single_online
    */
    @SerializedName("Status")
    @Expose
    private String [] Status;

    /**
    * IdList
    */
    @SerializedName("MicroserviceIdList")
    @Expose
    private String [] MicroserviceIdList;

    /**
    * 搜索的服务名列表
    */
    @SerializedName("MicroserviceNameList")
    @Expose
    private String [] MicroserviceNameList;

    /**
     * Get 命名空间ID 
     * @return NamespaceId 命名空间ID
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set 命名空间ID
     * @param NamespaceId 命名空间ID
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

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
     * Get 排序类型 
     * @return OrderType 排序类型
     */
    public Long getOrderType() {
        return this.OrderType;
    }

    /**
     * Set 排序类型
     * @param OrderType 排序类型
     */
    public void setOrderType(Long OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页个数 
     * @return Limit 分页个数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页个数
     * @param Limit 分页个数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 状态过滤，online、offline、single_online 
     * @return Status 状态过滤，online、offline、single_online
     */
    public String [] getStatus() {
        return this.Status;
    }

    /**
     * Set 状态过滤，online、offline、single_online
     * @param Status 状态过滤，online、offline、single_online
     */
    public void setStatus(String [] Status) {
        this.Status = Status;
    }

    /**
     * Get IdList 
     * @return MicroserviceIdList IdList
     */
    public String [] getMicroserviceIdList() {
        return this.MicroserviceIdList;
    }

    /**
     * Set IdList
     * @param MicroserviceIdList IdList
     */
    public void setMicroserviceIdList(String [] MicroserviceIdList) {
        this.MicroserviceIdList = MicroserviceIdList;
    }

    /**
     * Get 搜索的服务名列表 
     * @return MicroserviceNameList 搜索的服务名列表
     */
    public String [] getMicroserviceNameList() {
        return this.MicroserviceNameList;
    }

    /**
     * Set 搜索的服务名列表
     * @param MicroserviceNameList 搜索的服务名列表
     */
    public void setMicroserviceNameList(String [] MicroserviceNameList) {
        this.MicroserviceNameList = MicroserviceNameList;
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

    }
}

