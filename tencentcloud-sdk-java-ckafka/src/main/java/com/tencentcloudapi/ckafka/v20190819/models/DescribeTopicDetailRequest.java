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

public class DescribeTopicDetailRequest extends AbstractModel{

    /**
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * （过滤条件）按照topicName过滤，支持模糊查询
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * 偏移量，不填默认为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，不填则默认 10，最大值20，取值要大于0
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 实例id 
     * @return InstanceId 实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
     * @param InstanceId 实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get （过滤条件）按照topicName过滤，支持模糊查询 
     * @return SearchWord （过滤条件）按照topicName过滤，支持模糊查询
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set （过滤条件）按照topicName过滤，支持模糊查询
     * @param SearchWord （过滤条件）按照topicName过滤，支持模糊查询
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
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
     * Get 返回数量，不填则默认 10，最大值20，取值要大于0 
     * @return Limit 返回数量，不填则默认 10，最大值20，取值要大于0
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，不填则默认 10，最大值20，取值要大于0
     * @param Limit 返回数量，不填则默认 10，最大值20，取值要大于0
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

