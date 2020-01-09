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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstancesRequest extends AbstractModel{

    /**
    * （过滤条件）按照实例ID过滤
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * （过滤条件）按照实例名称过滤，支持模糊查询
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * （过滤条件）实例的状态。0：创建中，1：运行中，2：删除中，不填默认返回全部
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
    * 返回数量，不填则默认10，最大值20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 匹配标签key值。
    */
    @SerializedName("TagKey")
    @Expose
    private String TagKey;

    /**
     * Get （过滤条件）按照实例ID过滤 
     * @return InstanceId （过滤条件）按照实例ID过滤
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set （过滤条件）按照实例ID过滤
     * @param InstanceId （过滤条件）按照实例ID过滤
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get （过滤条件）按照实例名称过滤，支持模糊查询 
     * @return SearchWord （过滤条件）按照实例名称过滤，支持模糊查询
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set （过滤条件）按照实例名称过滤，支持模糊查询
     * @param SearchWord （过滤条件）按照实例名称过滤，支持模糊查询
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Get （过滤条件）实例的状态。0：创建中，1：运行中，2：删除中，不填默认返回全部 
     * @return Status （过滤条件）实例的状态。0：创建中，1：运行中，2：删除中，不填默认返回全部
     */
    public Long [] getStatus() {
        return this.Status;
    }

    /**
     * Set （过滤条件）实例的状态。0：创建中，1：运行中，2：删除中，不填默认返回全部
     * @param Status （过滤条件）实例的状态。0：创建中，1：运行中，2：删除中，不填默认返回全部
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
     * Get 返回数量，不填则默认10，最大值20 
     * @return Limit 返回数量，不填则默认10，最大值20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，不填则默认10，最大值20
     * @param Limit 返回数量，不填则默认10，最大值20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 匹配标签key值。 
     * @return TagKey 匹配标签key值。
     */
    public String getTagKey() {
        return this.TagKey;
    }

    /**
     * Set 匹配标签key值。
     * @param TagKey 匹配标签key值。
     */
    public void setTagKey(String TagKey) {
        this.TagKey = TagKey;
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

    }
}

