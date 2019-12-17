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

public class DescribeSimpleClustersRequest extends AbstractModel{

    /**
    * 需要查询的集群ID列表，不填或不传入时查询所有内容
    */
    @SerializedName("ClusterIdList")
    @Expose
    private String [] ClusterIdList;

    /**
    * 需要查询的集群类型，不填或不传入时查询所有内容
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * 查询偏移量，默认为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页个数，默认为20， 取值应为1~50
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 对id和name进行关键词过滤
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
     * Get 需要查询的集群ID列表，不填或不传入时查询所有内容 
     * @return ClusterIdList 需要查询的集群ID列表，不填或不传入时查询所有内容
     */
    public String [] getClusterIdList() {
        return this.ClusterIdList;
    }

    /**
     * Set 需要查询的集群ID列表，不填或不传入时查询所有内容
     * @param ClusterIdList 需要查询的集群ID列表，不填或不传入时查询所有内容
     */
    public void setClusterIdList(String [] ClusterIdList) {
        this.ClusterIdList = ClusterIdList;
    }

    /**
     * Get 需要查询的集群类型，不填或不传入时查询所有内容 
     * @return ClusterType 需要查询的集群类型，不填或不传入时查询所有内容
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set 需要查询的集群类型，不填或不传入时查询所有内容
     * @param ClusterType 需要查询的集群类型，不填或不传入时查询所有内容
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get 查询偏移量，默认为0 
     * @return Offset 查询偏移量，默认为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 查询偏移量，默认为0
     * @param Offset 查询偏移量，默认为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页个数，默认为20， 取值应为1~50 
     * @return Limit 分页个数，默认为20， 取值应为1~50
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页个数，默认为20， 取值应为1~50
     * @param Limit 分页个数，默认为20， 取值应为1~50
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 对id和name进行关键词过滤 
     * @return SearchWord 对id和name进行关键词过滤
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set 对id和name进行关键词过滤
     * @param SearchWord 对id和name进行关键词过滤
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ClusterIdList.", this.ClusterIdList);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);

    }
}

