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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindApiKeyResponse extends AbstractModel {

    /**
    * <p>ApiKey成功返回</p>
    */
    @SerializedName("SuccessList")
    @Expose
    private ApiKeyResponseInfo [] SuccessList;

    /**
    * <p>失败列表</p>
    */
    @SerializedName("FailedList")
    @Expose
    private FailedItem [] FailedList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>ApiKey成功返回</p> 
     * @return SuccessList <p>ApiKey成功返回</p>
     */
    public ApiKeyResponseInfo [] getSuccessList() {
        return this.SuccessList;
    }

    /**
     * Set <p>ApiKey成功返回</p>
     * @param SuccessList <p>ApiKey成功返回</p>
     */
    public void setSuccessList(ApiKeyResponseInfo [] SuccessList) {
        this.SuccessList = SuccessList;
    }

    /**
     * Get <p>失败列表</p> 
     * @return FailedList <p>失败列表</p>
     */
    public FailedItem [] getFailedList() {
        return this.FailedList;
    }

    /**
     * Set <p>失败列表</p>
     * @param FailedList <p>失败列表</p>
     */
    public void setFailedList(FailedItem [] FailedList) {
        this.FailedList = FailedList;
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

    public BindApiKeyResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindApiKeyResponse(BindApiKeyResponse source) {
        if (source.SuccessList != null) {
            this.SuccessList = new ApiKeyResponseInfo[source.SuccessList.length];
            for (int i = 0; i < source.SuccessList.length; i++) {
                this.SuccessList[i] = new ApiKeyResponseInfo(source.SuccessList[i]);
            }
        }
        if (source.FailedList != null) {
            this.FailedList = new FailedItem[source.FailedList.length];
            for (int i = 0; i < source.FailedList.length; i++) {
                this.FailedList[i] = new FailedItem(source.FailedList[i]);
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
        this.setParamArrayObj(map, prefix + "SuccessList.", this.SuccessList);
        this.setParamArrayObj(map, prefix + "FailedList.", this.FailedList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

