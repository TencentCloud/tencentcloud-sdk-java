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
package com.tencentcloudapi.essbasic.v20201222.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFlowFilesResponse extends AbstractModel{

    /**
    * 流程编号
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * 流程文件列表
    */
    @SerializedName("FlowFileInfos")
    @Expose
    private FlowFileInfo [] FlowFileInfos;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 流程编号 
     * @return FlowId 流程编号
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 流程编号
     * @param FlowId 流程编号
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get 流程文件列表 
     * @return FlowFileInfos 流程文件列表
     */
    public FlowFileInfo [] getFlowFileInfos() {
        return this.FlowFileInfos;
    }

    /**
     * Set 流程文件列表
     * @param FlowFileInfos 流程文件列表
     */
    public void setFlowFileInfos(FlowFileInfo [] FlowFileInfos) {
        this.FlowFileInfos = FlowFileInfos;
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

    public DescribeFlowFilesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFlowFilesResponse(DescribeFlowFilesResponse source) {
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.FlowFileInfos != null) {
            this.FlowFileInfos = new FlowFileInfo[source.FlowFileInfos.length];
            for (int i = 0; i < source.FlowFileInfos.length; i++) {
                this.FlowFileInfos[i] = new FlowFileInfo(source.FlowFileInfos[i]);
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
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamArrayObj(map, prefix + "FlowFileInfos.", this.FlowFileInfos);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

