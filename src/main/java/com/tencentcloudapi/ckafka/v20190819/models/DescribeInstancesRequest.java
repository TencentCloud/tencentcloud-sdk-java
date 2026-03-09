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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstancesRequest extends AbstractModel {

    /**
    * <p>（查询条件）按照ckafka集群实例Id过滤</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>搜索词   ex:（查询条件）按照实例名称过滤，支持模糊查询</p>
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * <p>（查询条件）实例的状态 不填默认返回全部</p><p>枚举值：</p><ul><li>-1： 创建失败</li><li>0： 创建中</li><li>1： 运行中</li><li>2： 删除中</li><li>3： 已删除</li><li>4： 删除失败</li><li>5： 隔离中</li><li>7： 升级中</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long [] Status;

    /**
    * <p>偏移量，不填默认为0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>返回数量，不填则默认10，最大值100</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>已废弃。匹配标签key值。</p>
    */
    @SerializedName("TagKey")
    @Expose
    private String TagKey;

    /**
    * <p>（查询条件）私有网络Id</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
     * Get <p>（查询条件）按照ckafka集群实例Id过滤</p> 
     * @return InstanceId <p>（查询条件）按照ckafka集群实例Id过滤</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>（查询条件）按照ckafka集群实例Id过滤</p>
     * @param InstanceId <p>（查询条件）按照ckafka集群实例Id过滤</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>搜索词   ex:（查询条件）按照实例名称过滤，支持模糊查询</p> 
     * @return SearchWord <p>搜索词   ex:（查询条件）按照实例名称过滤，支持模糊查询</p>
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set <p>搜索词   ex:（查询条件）按照实例名称过滤，支持模糊查询</p>
     * @param SearchWord <p>搜索词   ex:（查询条件）按照实例名称过滤，支持模糊查询</p>
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Get <p>（查询条件）实例的状态 不填默认返回全部</p><p>枚举值：</p><ul><li>-1： 创建失败</li><li>0： 创建中</li><li>1： 运行中</li><li>2： 删除中</li><li>3： 已删除</li><li>4： 删除失败</li><li>5： 隔离中</li><li>7： 升级中</li></ul> 
     * @return Status <p>（查询条件）实例的状态 不填默认返回全部</p><p>枚举值：</p><ul><li>-1： 创建失败</li><li>0： 创建中</li><li>1： 运行中</li><li>2： 删除中</li><li>3： 已删除</li><li>4： 删除失败</li><li>5： 隔离中</li><li>7： 升级中</li></ul>
     */
    public Long [] getStatus() {
        return this.Status;
    }

    /**
     * Set <p>（查询条件）实例的状态 不填默认返回全部</p><p>枚举值：</p><ul><li>-1： 创建失败</li><li>0： 创建中</li><li>1： 运行中</li><li>2： 删除中</li><li>3： 已删除</li><li>4： 删除失败</li><li>5： 隔离中</li><li>7： 升级中</li></ul>
     * @param Status <p>（查询条件）实例的状态 不填默认返回全部</p><p>枚举值：</p><ul><li>-1： 创建失败</li><li>0： 创建中</li><li>1： 运行中</li><li>2： 删除中</li><li>3： 已删除</li><li>4： 删除失败</li><li>5： 隔离中</li><li>7： 升级中</li></ul>
     */
    public void setStatus(Long [] Status) {
        this.Status = Status;
    }

    /**
     * Get <p>偏移量，不填默认为0</p> 
     * @return Offset <p>偏移量，不填默认为0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量，不填默认为0</p>
     * @param Offset <p>偏移量，不填默认为0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>返回数量，不填则默认10，最大值100</p> 
     * @return Limit <p>返回数量，不填则默认10，最大值100</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>返回数量，不填则默认10，最大值100</p>
     * @param Limit <p>返回数量，不填则默认10，最大值100</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>已废弃。匹配标签key值。</p> 
     * @return TagKey <p>已废弃。匹配标签key值。</p>
     * @deprecated
     */
    @Deprecated
    public String getTagKey() {
        return this.TagKey;
    }

    /**
     * Set <p>已废弃。匹配标签key值。</p>
     * @param TagKey <p>已废弃。匹配标签key值。</p>
     * @deprecated
     */
    @Deprecated
    public void setTagKey(String TagKey) {
        this.TagKey = TagKey;
    }

    /**
     * Get <p>（查询条件）私有网络Id</p> 
     * @return VpcId <p>（查询条件）私有网络Id</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>（查询条件）私有网络Id</p>
     * @param VpcId <p>（查询条件）私有网络Id</p>
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

