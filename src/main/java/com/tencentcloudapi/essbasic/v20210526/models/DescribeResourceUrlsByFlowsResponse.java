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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeResourceUrlsByFlowsResponse extends AbstractModel{

    /**
    * 流程资源对应链接信息
    */
    @SerializedName("FlowResourceUrlInfos")
    @Expose
    private FlowResourceUrlInfo [] FlowResourceUrlInfos;

    /**
    * 创建消息，对应多个合同ID，
成功为“”,创建失败则对应失败消息
    */
    @SerializedName("ErrorMessages")
    @Expose
    private String [] ErrorMessages;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 流程资源对应链接信息 
     * @return FlowResourceUrlInfos 流程资源对应链接信息
     */
    public FlowResourceUrlInfo [] getFlowResourceUrlInfos() {
        return this.FlowResourceUrlInfos;
    }

    /**
     * Set 流程资源对应链接信息
     * @param FlowResourceUrlInfos 流程资源对应链接信息
     */
    public void setFlowResourceUrlInfos(FlowResourceUrlInfo [] FlowResourceUrlInfos) {
        this.FlowResourceUrlInfos = FlowResourceUrlInfos;
    }

    /**
     * Get 创建消息，对应多个合同ID，
成功为“”,创建失败则对应失败消息 
     * @return ErrorMessages 创建消息，对应多个合同ID，
成功为“”,创建失败则对应失败消息
     */
    public String [] getErrorMessages() {
        return this.ErrorMessages;
    }

    /**
     * Set 创建消息，对应多个合同ID，
成功为“”,创建失败则对应失败消息
     * @param ErrorMessages 创建消息，对应多个合同ID，
成功为“”,创建失败则对应失败消息
     */
    public void setErrorMessages(String [] ErrorMessages) {
        this.ErrorMessages = ErrorMessages;
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

    public DescribeResourceUrlsByFlowsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeResourceUrlsByFlowsResponse(DescribeResourceUrlsByFlowsResponse source) {
        if (source.FlowResourceUrlInfos != null) {
            this.FlowResourceUrlInfos = new FlowResourceUrlInfo[source.FlowResourceUrlInfos.length];
            for (int i = 0; i < source.FlowResourceUrlInfos.length; i++) {
                this.FlowResourceUrlInfos[i] = new FlowResourceUrlInfo(source.FlowResourceUrlInfos[i]);
            }
        }
        if (source.ErrorMessages != null) {
            this.ErrorMessages = new String[source.ErrorMessages.length];
            for (int i = 0; i < source.ErrorMessages.length; i++) {
                this.ErrorMessages[i] = new String(source.ErrorMessages[i]);
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
        this.setParamArrayObj(map, prefix + "FlowResourceUrlInfos.", this.FlowResourceUrlInfos);
        this.setParamArraySimple(map, prefix + "ErrorMessages.", this.ErrorMessages);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

