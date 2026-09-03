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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterEventLogSwitchResponse extends AbstractModel {

    /**
    * <p>TKE 集群 ID（回显）</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>事件日志是否已开启</p>
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * <p>关联的 CLS 日志集 ID（Enable=true 时返回）</p>
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * <p>关联的 CLS 日志主题 ID（Enable=true 时返回）</p>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>关联的 CLS 日志主题所在地域（Enable=true 时返回）</p>
    */
    @SerializedName("TopicRegion")
    @Expose
    private String TopicRegion;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>TKE 集群 ID（回显）</p> 
     * @return ClusterId <p>TKE 集群 ID（回显）</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>TKE 集群 ID（回显）</p>
     * @param ClusterId <p>TKE 集群 ID（回显）</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>事件日志是否已开启</p> 
     * @return Enable <p>事件日志是否已开启</p>
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>事件日志是否已开启</p>
     * @param Enable <p>事件日志是否已开启</p>
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get <p>关联的 CLS 日志集 ID（Enable=true 时返回）</p> 
     * @return LogsetId <p>关联的 CLS 日志集 ID（Enable=true 时返回）</p>
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set <p>关联的 CLS 日志集 ID（Enable=true 时返回）</p>
     * @param LogsetId <p>关联的 CLS 日志集 ID（Enable=true 时返回）</p>
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get <p>关联的 CLS 日志主题 ID（Enable=true 时返回）</p> 
     * @return TopicId <p>关联的 CLS 日志主题 ID（Enable=true 时返回）</p>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>关联的 CLS 日志主题 ID（Enable=true 时返回）</p>
     * @param TopicId <p>关联的 CLS 日志主题 ID（Enable=true 时返回）</p>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>关联的 CLS 日志主题所在地域（Enable=true 时返回）</p> 
     * @return TopicRegion <p>关联的 CLS 日志主题所在地域（Enable=true 时返回）</p>
     */
    public String getTopicRegion() {
        return this.TopicRegion;
    }

    /**
     * Set <p>关联的 CLS 日志主题所在地域（Enable=true 时返回）</p>
     * @param TopicRegion <p>关联的 CLS 日志主题所在地域（Enable=true 时返回）</p>
     */
    public void setTopicRegion(String TopicRegion) {
        this.TopicRegion = TopicRegion;
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

    public DescribeClusterEventLogSwitchResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterEventLogSwitchResponse(DescribeClusterEventLogSwitchResponse source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.TopicRegion != null) {
            this.TopicRegion = new String(source.TopicRegion);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "TopicRegion", this.TopicRegion);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

