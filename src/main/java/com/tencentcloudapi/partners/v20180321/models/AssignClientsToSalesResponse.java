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
package com.tencentcloudapi.partners.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssignClientsToSalesResponse extends AbstractModel {

    /**
    * 处理成功的代客uin列表
    */
    @SerializedName("SucceedUins")
    @Expose
    private String [] SucceedUins;

    /**
    * 处理失败的代客uin列表
    */
    @SerializedName("FailedUins")
    @Expose
    private String [] FailedUins;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 处理成功的代客uin列表 
     * @return SucceedUins 处理成功的代客uin列表
     */
    public String [] getSucceedUins() {
        return this.SucceedUins;
    }

    /**
     * Set 处理成功的代客uin列表
     * @param SucceedUins 处理成功的代客uin列表
     */
    public void setSucceedUins(String [] SucceedUins) {
        this.SucceedUins = SucceedUins;
    }

    /**
     * Get 处理失败的代客uin列表 
     * @return FailedUins 处理失败的代客uin列表
     */
    public String [] getFailedUins() {
        return this.FailedUins;
    }

    /**
     * Set 处理失败的代客uin列表
     * @param FailedUins 处理失败的代客uin列表
     */
    public void setFailedUins(String [] FailedUins) {
        this.FailedUins = FailedUins;
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

    public AssignClientsToSalesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssignClientsToSalesResponse(AssignClientsToSalesResponse source) {
        if (source.SucceedUins != null) {
            this.SucceedUins = new String[source.SucceedUins.length];
            for (int i = 0; i < source.SucceedUins.length; i++) {
                this.SucceedUins[i] = new String(source.SucceedUins[i]);
            }
        }
        if (source.FailedUins != null) {
            this.FailedUins = new String[source.FailedUins.length];
            for (int i = 0; i < source.FailedUins.length; i++) {
                this.FailedUins[i] = new String(source.FailedUins[i]);
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
        this.setParamArraySimple(map, prefix + "SucceedUins.", this.SucceedUins);
        this.setParamArraySimple(map, prefix + "FailedUins.", this.FailedUins);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

