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

public class DescribeTrafficMirrorFilterRulesResponse extends AbstractModel {

    /**
    * 流量镜像实例唯一ID。
    */
    @SerializedName("TrafficMirrorId")
    @Expose
    private String TrafficMirrorId;

    /**
    * 流量镜像入站过滤规则。
    */
    @SerializedName("IngressFilterRules")
    @Expose
    private TrafficMirrorFilter [] IngressFilterRules;

    /**
    * 流量镜像出站过滤规则。
    */
    @SerializedName("EgressFilterRules")
    @Expose
    private TrafficMirrorFilter [] EgressFilterRules;

    /**
    * 符合条件的实例数量。分页查询的时候，如果IngressFilterRules的长度加上IngressFilterRules的长度，小于limit的时候表示已经查询完毕。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 流量镜像实例唯一ID。 
     * @return TrafficMirrorId 流量镜像实例唯一ID。
     */
    public String getTrafficMirrorId() {
        return this.TrafficMirrorId;
    }

    /**
     * Set 流量镜像实例唯一ID。
     * @param TrafficMirrorId 流量镜像实例唯一ID。
     */
    public void setTrafficMirrorId(String TrafficMirrorId) {
        this.TrafficMirrorId = TrafficMirrorId;
    }

    /**
     * Get 流量镜像入站过滤规则。 
     * @return IngressFilterRules 流量镜像入站过滤规则。
     */
    public TrafficMirrorFilter [] getIngressFilterRules() {
        return this.IngressFilterRules;
    }

    /**
     * Set 流量镜像入站过滤规则。
     * @param IngressFilterRules 流量镜像入站过滤规则。
     */
    public void setIngressFilterRules(TrafficMirrorFilter [] IngressFilterRules) {
        this.IngressFilterRules = IngressFilterRules;
    }

    /**
     * Get 流量镜像出站过滤规则。 
     * @return EgressFilterRules 流量镜像出站过滤规则。
     */
    public TrafficMirrorFilter [] getEgressFilterRules() {
        return this.EgressFilterRules;
    }

    /**
     * Set 流量镜像出站过滤规则。
     * @param EgressFilterRules 流量镜像出站过滤规则。
     */
    public void setEgressFilterRules(TrafficMirrorFilter [] EgressFilterRules) {
        this.EgressFilterRules = EgressFilterRules;
    }

    /**
     * Get 符合条件的实例数量。分页查询的时候，如果IngressFilterRules的长度加上IngressFilterRules的长度，小于limit的时候表示已经查询完毕。 
     * @return TotalCount 符合条件的实例数量。分页查询的时候，如果IngressFilterRules的长度加上IngressFilterRules的长度，小于limit的时候表示已经查询完毕。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 符合条件的实例数量。分页查询的时候，如果IngressFilterRules的长度加上IngressFilterRules的长度，小于limit的时候表示已经查询完毕。
     * @param TotalCount 符合条件的实例数量。分页查询的时候，如果IngressFilterRules的长度加上IngressFilterRules的长度，小于limit的时候表示已经查询完毕。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeTrafficMirrorFilterRulesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTrafficMirrorFilterRulesResponse(DescribeTrafficMirrorFilterRulesResponse source) {
        if (source.TrafficMirrorId != null) {
            this.TrafficMirrorId = new String(source.TrafficMirrorId);
        }
        if (source.IngressFilterRules != null) {
            this.IngressFilterRules = new TrafficMirrorFilter[source.IngressFilterRules.length];
            for (int i = 0; i < source.IngressFilterRules.length; i++) {
                this.IngressFilterRules[i] = new TrafficMirrorFilter(source.IngressFilterRules[i]);
            }
        }
        if (source.EgressFilterRules != null) {
            this.EgressFilterRules = new TrafficMirrorFilter[source.EgressFilterRules.length];
            for (int i = 0; i < source.EgressFilterRules.length; i++) {
                this.EgressFilterRules[i] = new TrafficMirrorFilter(source.EgressFilterRules[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TrafficMirrorId", this.TrafficMirrorId);
        this.setParamArrayObj(map, prefix + "IngressFilterRules.", this.IngressFilterRules);
        this.setParamArrayObj(map, prefix + "EgressFilterRules.", this.EgressFilterRules);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

