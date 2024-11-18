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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstancesRequest extends AbstractModel {

    /**
    * （查询条件）按照ckafka集群实例Id过滤
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 搜索词   ex:（查询条件）按照实例名称过滤，支持模糊查询
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * （查询条件）实例的状态  0：创建中，1：运行中，2：删除中，5: 隔离中,  7:升级中 不填默认返回全部
    */
    @SerializedName("Status")
    @Expose
    private Long [] Status;

    /**
    * 偏移量，不填默认为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，不填则默认10，最大值100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 已废弃。匹配标签key值。
    */
    @SerializedName("TagKey")
    @Expose
    private String TagKey;

    /**
    * （查询条件）私有网络Id
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
     * Get （查询条件）按照ckafka集群实例Id过滤 
     * @return InstanceId （查询条件）按照ckafka集群实例Id过滤
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set （查询条件）按照ckafka集群实例Id过滤
     * @param InstanceId （查询条件）按照ckafka集群实例Id过滤
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 搜索词   ex:（查询条件）按照实例名称过滤，支持模糊查询 
     * @return SearchWord 搜索词   ex:（查询条件）按照实例名称过滤，支持模糊查询
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set 搜索词   ex:（查询条件）按照实例名称过滤，支持模糊查询
     * @param SearchWord 搜索词   ex:（查询条件）按照实例名称过滤，支持模糊查询
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Get （查询条件）实例的状态  0：创建中，1：运行中，2：删除中，5: 隔离中,  7:升级中 不填默认返回全部 
     * @return Status （查询条件）实例的状态  0：创建中，1：运行中，2：删除中，5: 隔离中,  7:升级中 不填默认返回全部
     */
    public Long [] getStatus() {
        return this.Status;
    }

    /**
     * Set （查询条件）实例的状态  0：创建中，1：运行中，2：删除中，5: 隔离中,  7:升级中 不填默认返回全部
     * @param Status （查询条件）实例的状态  0：创建中，1：运行中，2：删除中，5: 隔离中,  7:升级中 不填默认返回全部
     */
    public void setStatus(Long [] Status) {
        this.Status = Status;
    }

    /**
     * Get 偏移量，不填默认为0 
     * @return Offset 偏移量，不填默认为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，不填默认为0
     * @param Offset 偏移量，不填默认为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，不填则默认10，最大值100 
     * @return Limit 返回数量，不填则默认10，最大值100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，不填则默认10，最大值100
     * @param Limit 返回数量，不填则默认10，最大值100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 已废弃。匹配标签key值。 
     * @return TagKey 已废弃。匹配标签key值。
     */
    public String getTagKey() {
        return this.TagKey;
    }

    /**
     * Set 已废弃。匹配标签key值。
     * @param TagKey 已废弃。匹配标签key值。
     */
    public void setTagKey(String TagKey) {
        this.TagKey = TagKey;
    }

    /**
     * Get （查询条件）私有网络Id 
     * @return VpcId （查询条件）私有网络Id
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set （查询条件）私有网络Id
     * @param VpcId （查询条件）私有网络Id
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    public DescribeInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstancesRequest(DescribeInstancesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SearchWord != null) {
            this.SearchWord = new String(source.SearchWord);
        }
        if (source.Status != null) {
            this.Status = new Long[source.Status.length];
            for (int i = 0; i < source.Status.length; i++) {
                this.Status[i] = new Long(source.Status[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.TagKey != null) {
            this.TagKey = new String(source.TagKey);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "TagKey", this.TagKey);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);

    }
}

