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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRabbitMQPermissionRequest extends AbstractModel {

    /**
    * 集群实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 用户名，用于查询过滤，不传则查询全部
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * vhost名，用于查询过滤，不传则查询全部
    */
    @SerializedName("VirtualHost")
    @Expose
    private String VirtualHost;

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
     * Get 集群实例id 
     * @return InstanceId 集群实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群实例id
     * @param InstanceId 集群实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 用户名，用于查询过滤，不传则查询全部 
     * @return User 用户名，用于查询过滤，不传则查询全部
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set 用户名，用于查询过滤，不传则查询全部
     * @param User 用户名，用于查询过滤，不传则查询全部
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get vhost名，用于查询过滤，不传则查询全部 
     * @return VirtualHost vhost名，用于查询过滤，不传则查询全部
     */
    public String getVirtualHost() {
        return this.VirtualHost;
    }

    /**
     * Set vhost名，用于查询过滤，不传则查询全部
     * @param VirtualHost vhost名，用于查询过滤，不传则查询全部
     */
    public void setVirtualHost(String VirtualHost) {
        this.VirtualHost = VirtualHost;
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

    public DescribeRabbitMQPermissionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRabbitMQPermissionRequest(DescribeRabbitMQPermissionRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.VirtualHost != null) {
            this.VirtualHost = new String(source.VirtualHost);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "VirtualHost", this.VirtualHost);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

