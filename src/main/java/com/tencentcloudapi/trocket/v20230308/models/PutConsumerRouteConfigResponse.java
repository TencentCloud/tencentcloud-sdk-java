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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PutConsumerRouteConfigResponse extends AbstractModel {

    /**
    * <p>实例 ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>主题</p>
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * <p>消费组</p>
    */
    @SerializedName("Group")
    @Expose
    private String Group;

    /**
    * <p>版本号</p>
    */
    @SerializedName("Version")
    @Expose
    private Long Version;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>实例 ID</p> 
     * @return InstanceId <p>实例 ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID</p>
     * @param InstanceId <p>实例 ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>主题</p> 
     * @return Topic <p>主题</p>
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set <p>主题</p>
     * @param Topic <p>主题</p>
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get <p>消费组</p> 
     * @return Group <p>消费组</p>
     */
    public String getGroup() {
        return this.Group;
    }

    /**
     * Set <p>消费组</p>
     * @param Group <p>消费组</p>
     */
    public void setGroup(String Group) {
        this.Group = Group;
    }

    /**
     * Get <p>版本号</p> 
     * @return Version <p>版本号</p>
     */
    public Long getVersion() {
        return this.Version;
    }

    /**
     * Set <p>版本号</p>
     * @param Version <p>版本号</p>
     */
    public void setVersion(Long Version) {
        this.Version = Version;
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

    public PutConsumerRouteConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PutConsumerRouteConfigResponse(PutConsumerRouteConfigResponse source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.Group != null) {
            this.Group = new String(source.Group);
        }
        if (source.Version != null) {
            this.Version = new Long(source.Version);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "Group", this.Group);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

