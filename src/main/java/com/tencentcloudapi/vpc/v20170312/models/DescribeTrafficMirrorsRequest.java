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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTrafficMirrorsRequest extends AbstractModel {

    /**
    * 流量镜像实例ID集合
    */
    @SerializedName("TrafficMirrorIds")
    @Expose
    private String [] TrafficMirrorIds;

    /**
    * 流量镜像查询过滤调节。
vpc-id ：VPC实例ID，例如：vpc-f49l6u0z。
traffic-mirror-id：流量镜像实例ID。
traffic-mirror-name：流量镜像名称。
tag-key ：按照标签键进行过滤。
    */
    @SerializedName("Filters")
    @Expose
    private Filter Filters;

    /**
    * 偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认为20，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 流量镜像实例ID集合 
     * @return TrafficMirrorIds 流量镜像实例ID集合
     */
    public String [] getTrafficMirrorIds() {
        return this.TrafficMirrorIds;
    }

    /**
     * Set 流量镜像实例ID集合
     * @param TrafficMirrorIds 流量镜像实例ID集合
     */
    public void setTrafficMirrorIds(String [] TrafficMirrorIds) {
        this.TrafficMirrorIds = TrafficMirrorIds;
    }

    /**
     * Get 流量镜像查询过滤调节。
vpc-id ：VPC实例ID，例如：vpc-f49l6u0z。
traffic-mirror-id：流量镜像实例ID。
traffic-mirror-name：流量镜像名称。
tag-key ：按照标签键进行过滤。 
     * @return Filters 流量镜像查询过滤调节。
vpc-id ：VPC实例ID，例如：vpc-f49l6u0z。
traffic-mirror-id：流量镜像实例ID。
traffic-mirror-name：流量镜像名称。
tag-key ：按照标签键进行过滤。
     */
    public Filter getFilters() {
        return this.Filters;
    }

    /**
     * Set 流量镜像查询过滤调节。
vpc-id ：VPC实例ID，例如：vpc-f49l6u0z。
traffic-mirror-id：流量镜像实例ID。
traffic-mirror-name：流量镜像名称。
tag-key ：按照标签键进行过滤。
     * @param Filters 流量镜像查询过滤调节。
vpc-id ：VPC实例ID，例如：vpc-f49l6u0z。
traffic-mirror-id：流量镜像实例ID。
traffic-mirror-name：流量镜像名称。
tag-key ：按照标签键进行过滤。
     */
    public void setFilters(Filter Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 偏移量，默认为0。 
     * @return Offset 偏移量，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。
     * @param Offset 偏移量，默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认为20，最大值为100。 
     * @return Limit 返回数量，默认为20，最大值为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为20，最大值为100。
     * @param Limit 返回数量，默认为20，最大值为100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeTrafficMirrorsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTrafficMirrorsRequest(DescribeTrafficMirrorsRequest source) {
        if (source.TrafficMirrorIds != null) {
            this.TrafficMirrorIds = new String[source.TrafficMirrorIds.length];
            for (int i = 0; i < source.TrafficMirrorIds.length; i++) {
                this.TrafficMirrorIds[i] = new String(source.TrafficMirrorIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filter(source.Filters);
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
        this.setParamArraySimple(map, prefix + "TrafficMirrorIds.", this.TrafficMirrorIds);
        this.setParamObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

