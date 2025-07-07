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
package com.tencentcloudapi.cis.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeContainerLogResponse extends AbstractModel {

    /**
    * 容器日志数组
    */
    @SerializedName("ContainerLogList")
    @Expose
    private ContainerLog [] ContainerLogList;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 容器日志数组 
     * @return ContainerLogList 容器日志数组
     */
    public ContainerLog [] getContainerLogList() {
        return this.ContainerLogList;
    }

    /**
     * Set 容器日志数组
     * @param ContainerLogList 容器日志数组
     */
    public void setContainerLogList(ContainerLog [] ContainerLogList) {
        this.ContainerLogList = ContainerLogList;
    }

    /**
     * Get 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。 
     * @return RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @param RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeContainerLogResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeContainerLogResponse(DescribeContainerLogResponse source) {
        if (source.ContainerLogList != null) {
            this.ContainerLogList = new ContainerLog[source.ContainerLogList.length];
            for (int i = 0; i < source.ContainerLogList.length; i++) {
                this.ContainerLogList[i] = new ContainerLog(source.ContainerLogList[i]);
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
        this.setParamArrayObj(map, prefix + "ContainerLogList.", this.ContainerLogList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

