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
package com.tencentcloudapi.mqtt.v20240516.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTopicResponse extends AbstractModel {

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>主题名称</p>
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * <p>备注</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>创建时间，秒为单位</p>
    */
    @SerializedName("CreatedTime")
    @Expose
    private Long CreatedTime;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>实例ID</p> 
     * @return InstanceId <p>实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceId <p>实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>主题名称</p> 
     * @return Topic <p>主题名称</p>
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set <p>主题名称</p>
     * @param Topic <p>主题名称</p>
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get <p>备注</p> 
     * @return Remark <p>备注</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>备注</p>
     * @param Remark <p>备注</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>创建时间，秒为单位</p> 
     * @return CreatedTime <p>创建时间，秒为单位</p>
     */
    public Long getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set <p>创建时间，秒为单位</p>
     * @param CreatedTime <p>创建时间，秒为单位</p>
     */
    public void setCreatedTime(Long CreatedTime) {
        this.CreatedTime = CreatedTime;
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

    public DescribeTopicResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTopicResponse(DescribeTopicResponse source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new Long(source.CreatedTime);
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
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

