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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeResourceUrlsByFlowsResponse extends AbstractModel {

    /**
    * 合同流程PDF下载链接
    */
    @SerializedName("FlowResourceUrlInfos")
    @Expose
    private FlowResourceUrlInfo [] FlowResourceUrlInfos;

    /**
    * 如果某个序号的合同流程生成PDF下载链接成功, 对应序号的值为空
如果某个序号的合同流程生成PDF下载链接失败, 对应序号的值为错误的原因
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
     * Get 合同流程PDF下载链接 
     * @return FlowResourceUrlInfos 合同流程PDF下载链接
     */
    public FlowResourceUrlInfo [] getFlowResourceUrlInfos() {
        return this.FlowResourceUrlInfos;
    }

    /**
     * Set 合同流程PDF下载链接
     * @param FlowResourceUrlInfos 合同流程PDF下载链接
     */
    public void setFlowResourceUrlInfos(FlowResourceUrlInfo [] FlowResourceUrlInfos) {
        this.FlowResourceUrlInfos = FlowResourceUrlInfos;
    }

    /**
     * Get 如果某个序号的合同流程生成PDF下载链接成功, 对应序号的值为空
如果某个序号的合同流程生成PDF下载链接失败, 对应序号的值为错误的原因 
     * @return ErrorMessages 如果某个序号的合同流程生成PDF下载链接成功, 对应序号的值为空
如果某个序号的合同流程生成PDF下载链接失败, 对应序号的值为错误的原因
     */
    public String [] getErrorMessages() {
        return this.ErrorMessages;
    }

    /**
     * Set 如果某个序号的合同流程生成PDF下载链接成功, 对应序号的值为空
如果某个序号的合同流程生成PDF下载链接失败, 对应序号的值为错误的原因
     * @param ErrorMessages 如果某个序号的合同流程生成PDF下载链接成功, 对应序号的值为空
如果某个序号的合同流程生成PDF下载链接失败, 对应序号的值为错误的原因
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

