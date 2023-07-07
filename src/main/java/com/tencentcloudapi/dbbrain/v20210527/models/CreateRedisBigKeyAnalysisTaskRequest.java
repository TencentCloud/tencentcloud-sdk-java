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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRedisBigKeyAnalysisTaskRequest extends AbstractModel{

    /**
    * 实例ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 服务产品类型，支持值包括 "redis" - 云数据库 Redis。
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * 分片节点序号列表。当列表为空时，选择所有分片节点。
    */
    @SerializedName("ShardIds")
    @Expose
    private Long [] ShardIds;

    /**
    * Top Key前缀的分隔符列表。
目前仅支持以下分割符：[",", ";", ":", "_", "-", "+", "@", "=", "|", "#", "."]，当列表为空时，默认选择所有分隔符。
    */
    @SerializedName("KeyDelimiterList")
    @Expose
    private String [] KeyDelimiterList;

    /**
     * Get 实例ID。 
     * @return InstanceId 实例ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID。
     * @param InstanceId 实例ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 服务产品类型，支持值包括 "redis" - 云数据库 Redis。 
     * @return Product 服务产品类型，支持值包括 "redis" - 云数据库 Redis。
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 服务产品类型，支持值包括 "redis" - 云数据库 Redis。
     * @param Product 服务产品类型，支持值包括 "redis" - 云数据库 Redis。
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get 分片节点序号列表。当列表为空时，选择所有分片节点。 
     * @return ShardIds 分片节点序号列表。当列表为空时，选择所有分片节点。
     */
    public Long [] getShardIds() {
        return this.ShardIds;
    }

    /**
     * Set 分片节点序号列表。当列表为空时，选择所有分片节点。
     * @param ShardIds 分片节点序号列表。当列表为空时，选择所有分片节点。
     */
    public void setShardIds(Long [] ShardIds) {
        this.ShardIds = ShardIds;
    }

    /**
     * Get Top Key前缀的分隔符列表。
目前仅支持以下分割符：[",", ";", ":", "_", "-", "+", "@", "=", "|", "#", "."]，当列表为空时，默认选择所有分隔符。 
     * @return KeyDelimiterList Top Key前缀的分隔符列表。
目前仅支持以下分割符：[",", ";", ":", "_", "-", "+", "@", "=", "|", "#", "."]，当列表为空时，默认选择所有分隔符。
     */
    public String [] getKeyDelimiterList() {
        return this.KeyDelimiterList;
    }

    /**
     * Set Top Key前缀的分隔符列表。
目前仅支持以下分割符：[",", ";", ":", "_", "-", "+", "@", "=", "|", "#", "."]，当列表为空时，默认选择所有分隔符。
     * @param KeyDelimiterList Top Key前缀的分隔符列表。
目前仅支持以下分割符：[",", ";", ":", "_", "-", "+", "@", "=", "|", "#", "."]，当列表为空时，默认选择所有分隔符。
     */
    public void setKeyDelimiterList(String [] KeyDelimiterList) {
        this.KeyDelimiterList = KeyDelimiterList;
    }

    public CreateRedisBigKeyAnalysisTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRedisBigKeyAnalysisTaskRequest(CreateRedisBigKeyAnalysisTaskRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.ShardIds != null) {
            this.ShardIds = new Long[source.ShardIds.length];
            for (int i = 0; i < source.ShardIds.length; i++) {
                this.ShardIds[i] = new Long(source.ShardIds[i]);
            }
        }
        if (source.KeyDelimiterList != null) {
            this.KeyDelimiterList = new String[source.KeyDelimiterList.length];
            for (int i = 0; i < source.KeyDelimiterList.length; i++) {
                this.KeyDelimiterList[i] = new String(source.KeyDelimiterList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamArraySimple(map, prefix + "ShardIds.", this.ShardIds);
        this.setParamArraySimple(map, prefix + "KeyDelimiterList.", this.KeyDelimiterList);

    }
}

