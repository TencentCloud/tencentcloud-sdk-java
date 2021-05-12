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

public class DescribeTopicsRequest extends AbstractModel{

    /**
    * 环境（命名空间）名称。
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * 主题名模糊匹配。
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

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
    * topic类型描述：
0：普通消息；
1：全局顺序消息；
2：局部顺序消息；
3：重试队列；
4：死信队列；
5：事务消息。
    */
    @SerializedName("TopicType")
    @Expose
    private Long TopicType;

    /**
    * Pulsar 集群的ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * * TopicName
按照主题名字查询，精确查询。
类型：String
必选：否
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 环境（命名空间）名称。 
     * @return EnvironmentId 环境（命名空间）名称。
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set 环境（命名空间）名称。
     * @param EnvironmentId 环境（命名空间）名称。
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get 主题名模糊匹配。 
     * @return TopicName 主题名模糊匹配。
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 主题名模糊匹配。
     * @param TopicName 主题名模糊匹配。
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
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
     * Get topic类型描述：
0：普通消息；
1：全局顺序消息；
2：局部顺序消息；
3：重试队列；
4：死信队列；
5：事务消息。 
     * @return TopicType topic类型描述：
0：普通消息；
1：全局顺序消息；
2：局部顺序消息；
3：重试队列；
4：死信队列；
5：事务消息。
     */
    public Long getTopicType() {
        return this.TopicType;
    }

    /**
     * Set topic类型描述：
0：普通消息；
1：全局顺序消息；
2：局部顺序消息；
3：重试队列；
4：死信队列；
5：事务消息。
     * @param TopicType topic类型描述：
0：普通消息；
1：全局顺序消息；
2：局部顺序消息；
3：重试队列；
4：死信队列；
5：事务消息。
     */
    public void setTopicType(Long TopicType) {
        this.TopicType = TopicType;
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
     * Get * TopicName
按照主题名字查询，精确查询。
类型：String
必选：否 
     * @return Filters * TopicName
按照主题名字查询，精确查询。
类型：String
必选：否
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set * TopicName
按照主题名字查询，精确查询。
类型：String
必选：否
     * @param Filters * TopicName
按照主题名字查询，精确查询。
类型：String
必选：否
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeTopicsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTopicsRequest(DescribeTopicsRequest source) {
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.TopicType != null) {
            this.TopicType = new Long(source.TopicType);
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
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "TopicType", this.TopicType);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

