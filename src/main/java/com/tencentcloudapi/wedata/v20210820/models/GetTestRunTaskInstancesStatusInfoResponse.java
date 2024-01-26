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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetTestRunTaskInstancesStatusInfoResponse extends AbstractModel {

    /**
    * 实例列表
    */
    @SerializedName("Instances")
    @Expose
    private ParamGetTaskInstancesStatusInfoResponseInstance [] Instances;

    /**
    * 消息
    */
    @SerializedName("Messages")
    @Expose
    private String Messages;

    /**
    * 是否异常
    */
    @SerializedName("IsException")
    @Expose
    private Boolean IsException;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 实例列表 
     * @return Instances 实例列表
     */
    public ParamGetTaskInstancesStatusInfoResponseInstance [] getInstances() {
        return this.Instances;
    }

    /**
     * Set 实例列表
     * @param Instances 实例列表
     */
    public void setInstances(ParamGetTaskInstancesStatusInfoResponseInstance [] Instances) {
        this.Instances = Instances;
    }

    /**
     * Get 消息 
     * @return Messages 消息
     */
    public String getMessages() {
        return this.Messages;
    }

    /**
     * Set 消息
     * @param Messages 消息
     */
    public void setMessages(String Messages) {
        this.Messages = Messages;
    }

    /**
     * Get 是否异常 
     * @return IsException 是否异常
     */
    public Boolean getIsException() {
        return this.IsException;
    }

    /**
     * Set 是否异常
     * @param IsException 是否异常
     */
    public void setIsException(Boolean IsException) {
        this.IsException = IsException;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public GetTestRunTaskInstancesStatusInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetTestRunTaskInstancesStatusInfoResponse(GetTestRunTaskInstancesStatusInfoResponse source) {
        if (source.Instances != null) {
            this.Instances = new ParamGetTaskInstancesStatusInfoResponseInstance[source.Instances.length];
            for (int i = 0; i < source.Instances.length; i++) {
                this.Instances[i] = new ParamGetTaskInstancesStatusInfoResponseInstance(source.Instances[i]);
            }
        }
        if (source.Messages != null) {
            this.Messages = new String(source.Messages);
        }
        if (source.IsException != null) {
            this.IsException = new Boolean(source.IsException);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Instances.", this.Instances);
        this.setParamSimple(map, prefix + "Messages", this.Messages);
        this.setParamSimple(map, prefix + "IsException", this.IsException);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

