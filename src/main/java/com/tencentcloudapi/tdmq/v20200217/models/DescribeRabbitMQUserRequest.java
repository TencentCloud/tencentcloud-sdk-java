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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRabbitMQUserRequest extends AbstractModel{

    /**
    * 集群实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 用户名检索，支持前缀匹配，后缀匹配
    */
    @SerializedName("SearchUser")
    @Expose
    private String SearchUser;

    /**
    * 分页Offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页Limit
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 用户名，精确查询
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * 用户标签，根据标签过滤列表
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
     * Get 集群实例Id 
     * @return InstanceId 集群实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群实例Id
     * @param InstanceId 集群实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 用户名检索，支持前缀匹配，后缀匹配 
     * @return SearchUser 用户名检索，支持前缀匹配，后缀匹配
     */
    public String getSearchUser() {
        return this.SearchUser;
    }

    /**
     * Set 用户名检索，支持前缀匹配，后缀匹配
     * @param SearchUser 用户名检索，支持前缀匹配，后缀匹配
     */
    public void setSearchUser(String SearchUser) {
        this.SearchUser = SearchUser;
    }

    /**
     * Get 分页Offset 
     * @return Offset 分页Offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页Offset
     * @param Offset 分页Offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页Limit 
     * @return Limit 分页Limit
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页Limit
     * @param Limit 分页Limit
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 用户名，精确查询 
     * @return User 用户名，精确查询
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set 用户名，精确查询
     * @param User 用户名，精确查询
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get 用户标签，根据标签过滤列表 
     * @return Tags 用户标签，根据标签过滤列表
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set 用户标签，根据标签过滤列表
     * @param Tags 用户标签，根据标签过滤列表
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    public DescribeRabbitMQUserRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRabbitMQUserRequest(DescribeRabbitMQUserRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SearchUser != null) {
            this.SearchUser = new String(source.SearchUser);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SearchUser", this.SearchUser);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);

    }
}

