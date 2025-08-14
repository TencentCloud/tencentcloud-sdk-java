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
package com.tencentcloudapi.trabbit.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RabbitMQServerlessAccessInfo extends AbstractModel {

    /**
    * 公网域名
    */
    @SerializedName("PublicAccessEndpoint")
    @Expose
    private String PublicAccessEndpoint;

    /**
    * 公网状态
    */
    @SerializedName("PublicDataStreamStatus")
    @Expose
    private String PublicDataStreamStatus;

    /**
    * 公网CLB实例ID
    */
    @SerializedName("PublicClbId")
    @Expose
    private String PublicClbId;

    /**
     * Get 公网域名 
     * @return PublicAccessEndpoint 公网域名
     */
    public String getPublicAccessEndpoint() {
        return this.PublicAccessEndpoint;
    }

    /**
     * Set 公网域名
     * @param PublicAccessEndpoint 公网域名
     */
    public void setPublicAccessEndpoint(String PublicAccessEndpoint) {
        this.PublicAccessEndpoint = PublicAccessEndpoint;
    }

    /**
     * Get 公网状态 
     * @return PublicDataStreamStatus 公网状态
     */
    public String getPublicDataStreamStatus() {
        return this.PublicDataStreamStatus;
    }

    /**
     * Set 公网状态
     * @param PublicDataStreamStatus 公网状态
     */
    public void setPublicDataStreamStatus(String PublicDataStreamStatus) {
        this.PublicDataStreamStatus = PublicDataStreamStatus;
    }

    /**
     * Get 公网CLB实例ID 
     * @return PublicClbId 公网CLB实例ID
     */
    public String getPublicClbId() {
        return this.PublicClbId;
    }

    /**
     * Set 公网CLB实例ID
     * @param PublicClbId 公网CLB实例ID
     */
    public void setPublicClbId(String PublicClbId) {
        this.PublicClbId = PublicClbId;
    }

    public RabbitMQServerlessAccessInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RabbitMQServerlessAccessInfo(RabbitMQServerlessAccessInfo source) {
        if (source.PublicAccessEndpoint != null) {
            this.PublicAccessEndpoint = new String(source.PublicAccessEndpoint);
        }
        if (source.PublicDataStreamStatus != null) {
            this.PublicDataStreamStatus = new String(source.PublicDataStreamStatus);
        }
        if (source.PublicClbId != null) {
            this.PublicClbId = new String(source.PublicClbId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PublicAccessEndpoint", this.PublicAccessEndpoint);
        this.setParamSimple(map, prefix + "PublicDataStreamStatus", this.PublicDataStreamStatus);
        this.setParamSimple(map, prefix + "PublicClbId", this.PublicClbId);

    }
}

