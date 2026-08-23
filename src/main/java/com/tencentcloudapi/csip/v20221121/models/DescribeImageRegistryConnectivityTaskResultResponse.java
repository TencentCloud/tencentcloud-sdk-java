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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeImageRegistryConnectivityTaskResultResponse extends AbstractModel {

    /**
    * <p>链接检查结果</p>
    */
    @SerializedName("ConnDetectResult")
    @Expose
    private ImageRegistryConnectivityTaskResult [] ConnDetectResult;

    /**
    * <p>任务是否结束</p><p>枚举值：</p><ul><li>1： 任务已结束</li><li>0： 任务未结束</li></ul>
    */
    @SerializedName("Finished")
    @Expose
    private Long Finished;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>链接检查结果</p> 
     * @return ConnDetectResult <p>链接检查结果</p>
     */
    public ImageRegistryConnectivityTaskResult [] getConnDetectResult() {
        return this.ConnDetectResult;
    }

    /**
     * Set <p>链接检查结果</p>
     * @param ConnDetectResult <p>链接检查结果</p>
     */
    public void setConnDetectResult(ImageRegistryConnectivityTaskResult [] ConnDetectResult) {
        this.ConnDetectResult = ConnDetectResult;
    }

    /**
     * Get <p>任务是否结束</p><p>枚举值：</p><ul><li>1： 任务已结束</li><li>0： 任务未结束</li></ul> 
     * @return Finished <p>任务是否结束</p><p>枚举值：</p><ul><li>1： 任务已结束</li><li>0： 任务未结束</li></ul>
     */
    public Long getFinished() {
        return this.Finished;
    }

    /**
     * Set <p>任务是否结束</p><p>枚举值：</p><ul><li>1： 任务已结束</li><li>0： 任务未结束</li></ul>
     * @param Finished <p>任务是否结束</p><p>枚举值：</p><ul><li>1： 任务已结束</li><li>0： 任务未结束</li></ul>
     */
    public void setFinished(Long Finished) {
        this.Finished = Finished;
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

    public DescribeImageRegistryConnectivityTaskResultResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeImageRegistryConnectivityTaskResultResponse(DescribeImageRegistryConnectivityTaskResultResponse source) {
        if (source.ConnDetectResult != null) {
            this.ConnDetectResult = new ImageRegistryConnectivityTaskResult[source.ConnDetectResult.length];
            for (int i = 0; i < source.ConnDetectResult.length; i++) {
                this.ConnDetectResult[i] = new ImageRegistryConnectivityTaskResult(source.ConnDetectResult[i]);
            }
        }
        if (source.Finished != null) {
            this.Finished = new Long(source.Finished);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ConnDetectResult.", this.ConnDetectResult);
        this.setParamSimple(map, prefix + "Finished", this.Finished);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

