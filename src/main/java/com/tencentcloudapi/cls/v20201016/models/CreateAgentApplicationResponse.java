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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAgentApplicationResponse extends AbstractModel {

    /**
    * <p>应用id</p>
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * <p>日志主题列表</p>
    */
    @SerializedName("LogTopics")
    @Expose
    private AgentTopicInfo [] LogTopics;

    /**
    * <p>指标主题列表</p>
    */
    @SerializedName("MetricsTopics")
    @Expose
    private AgentTopicInfo [] MetricsTopics;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>应用id</p> 
     * @return ApplicationId <p>应用id</p>
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set <p>应用id</p>
     * @param ApplicationId <p>应用id</p>
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get <p>日志主题列表</p> 
     * @return LogTopics <p>日志主题列表</p>
     */
    public AgentTopicInfo [] getLogTopics() {
        return this.LogTopics;
    }

    /**
     * Set <p>日志主题列表</p>
     * @param LogTopics <p>日志主题列表</p>
     */
    public void setLogTopics(AgentTopicInfo [] LogTopics) {
        this.LogTopics = LogTopics;
    }

    /**
     * Get <p>指标主题列表</p> 
     * @return MetricsTopics <p>指标主题列表</p>
     */
    public AgentTopicInfo [] getMetricsTopics() {
        return this.MetricsTopics;
    }

    /**
     * Set <p>指标主题列表</p>
     * @param MetricsTopics <p>指标主题列表</p>
     */
    public void setMetricsTopics(AgentTopicInfo [] MetricsTopics) {
        this.MetricsTopics = MetricsTopics;
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

    public CreateAgentApplicationResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAgentApplicationResponse(CreateAgentApplicationResponse source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.LogTopics != null) {
            this.LogTopics = new AgentTopicInfo[source.LogTopics.length];
            for (int i = 0; i < source.LogTopics.length; i++) {
                this.LogTopics[i] = new AgentTopicInfo(source.LogTopics[i]);
            }
        }
        if (source.MetricsTopics != null) {
            this.MetricsTopics = new AgentTopicInfo[source.MetricsTopics.length];
            for (int i = 0; i < source.MetricsTopics.length; i++) {
                this.MetricsTopics[i] = new AgentTopicInfo(source.MetricsTopics[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamArrayObj(map, prefix + "LogTopics.", this.LogTopics);
        this.setParamArrayObj(map, prefix + "MetricsTopics.", this.MetricsTopics);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

