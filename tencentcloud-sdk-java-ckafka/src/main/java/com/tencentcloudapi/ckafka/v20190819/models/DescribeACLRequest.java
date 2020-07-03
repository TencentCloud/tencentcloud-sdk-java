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

public class DescribeACLRequest extends AbstractModel{

    /**
    * 实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Acl资源类型，(0:UNKNOWN，1:ANY，2:TOPIC，3:GROUP，4:CLUSTER，5:TRANSACTIONAL_ID)，当前只有TOPIC，其它字段用于后续兼容开源kafka的acl时使用
    */
    @SerializedName("ResourceType")
    @Expose
    private Long ResourceType;

    /**
    * 资源名称，和resourceType相关，如当resourceType为TOPIC时，则该字段表示topic名称，当resourceType为GROUP时，该字段表示group名称
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * 偏移位置
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 个数限制
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 关键字匹配
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
     * Get 实例Id 
     * @return InstanceId 实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例Id
     * @param InstanceId 实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Acl资源类型，(0:UNKNOWN，1:ANY，2:TOPIC，3:GROUP，4:CLUSTER，5:TRANSACTIONAL_ID)，当前只有TOPIC，其它字段用于后续兼容开源kafka的acl时使用 
     * @return ResourceType Acl资源类型，(0:UNKNOWN，1:ANY，2:TOPIC，3:GROUP，4:CLUSTER，5:TRANSACTIONAL_ID)，当前只有TOPIC，其它字段用于后续兼容开源kafka的acl时使用
     */
    public Long getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set Acl资源类型，(0:UNKNOWN，1:ANY，2:TOPIC，3:GROUP，4:CLUSTER，5:TRANSACTIONAL_ID)，当前只有TOPIC，其它字段用于后续兼容开源kafka的acl时使用
     * @param ResourceType Acl资源类型，(0:UNKNOWN，1:ANY，2:TOPIC，3:GROUP，4:CLUSTER，5:TRANSACTIONAL_ID)，当前只有TOPIC，其它字段用于后续兼容开源kafka的acl时使用
     */
    public void setResourceType(Long ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 资源名称，和resourceType相关，如当resourceType为TOPIC时，则该字段表示topic名称，当resourceType为GROUP时，该字段表示group名称 
     * @return ResourceName 资源名称，和resourceType相关，如当resourceType为TOPIC时，则该字段表示topic名称，当resourceType为GROUP时，该字段表示group名称
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set 资源名称，和resourceType相关，如当resourceType为TOPIC时，则该字段表示topic名称，当resourceType为GROUP时，该字段表示group名称
     * @param ResourceName 资源名称，和resourceType相关，如当resourceType为TOPIC时，则该字段表示topic名称，当resourceType为GROUP时，该字段表示group名称
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get 偏移位置 
     * @return Offset 偏移位置
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移位置
     * @param Offset 偏移位置
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 个数限制 
     * @return Limit 个数限制
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 个数限制
     * @param Limit 个数限制
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 关键字匹配 
     * @return SearchWord 关键字匹配
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set 关键字匹配
     * @param SearchWord 关键字匹配
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);

    }
}

