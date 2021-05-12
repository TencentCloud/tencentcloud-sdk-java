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

public class DescribeEnvironmentsRequest extends AbstractModel{

    /**
    * 命名空间名称，模糊搜索。
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * 起始下标，不填默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，不填则默认为10，最大值为20。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Pulsar 集群的ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * * EnvironmentId
按照名称空间进行过滤，精确查询。
类型：String
必选：否
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 命名空间名称，模糊搜索。 
     * @return EnvironmentId 命名空间名称，模糊搜索。
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set 命名空间名称，模糊搜索。
     * @param EnvironmentId 命名空间名称，模糊搜索。
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get 起始下标，不填默认为0。 
     * @return Offset 起始下标，不填默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 起始下标，不填默认为0。
     * @param Offset 起始下标，不填默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，不填则默认为10，最大值为20。 
     * @return Limit 返回数量，不填则默认为10，最大值为20。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，不填则默认为10，最大值为20。
     * @param Limit 返回数量，不填则默认为10，最大值为20。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Pulsar 集群的ID 
     * @return ClusterId Pulsar 集群的ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Pulsar 集群的ID
     * @param ClusterId Pulsar 集群的ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get * EnvironmentId
按照名称空间进行过滤，精确查询。
类型：String
必选：否 
     * @return Filters * EnvironmentId
按照名称空间进行过滤，精确查询。
类型：String
必选：否
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set * EnvironmentId
按照名称空间进行过滤，精确查询。
类型：String
必选：否
     * @param Filters * EnvironmentId
按照名称空间进行过滤，精确查询。
类型：String
必选：否
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeEnvironmentsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEnvironmentsRequest(DescribeEnvironmentsRequest source) {
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

