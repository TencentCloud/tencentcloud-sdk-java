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
package com.tencentcloudapi.tcbr.v20220217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteCloudRunVersionsResponse extends AbstractModel {

    /**
    * succ | fail | partial
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * 删除失败的版本列表
    */
    @SerializedName("FailVersions")
    @Expose
    private FailDeleteVersions [] FailVersions;

    /**
    * 删除成功的版本列表
    */
    @SerializedName("SuccessVersions")
    @Expose
    private SuccessDeleteVersions [] SuccessVersions;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get succ | fail | partial 
     * @return Result succ | fail | partial
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set succ | fail | partial
     * @param Result succ | fail | partial
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get 删除失败的版本列表 
     * @return FailVersions 删除失败的版本列表
     */
    public FailDeleteVersions [] getFailVersions() {
        return this.FailVersions;
    }

    /**
     * Set 删除失败的版本列表
     * @param FailVersions 删除失败的版本列表
     */
    public void setFailVersions(FailDeleteVersions [] FailVersions) {
        this.FailVersions = FailVersions;
    }

    /**
     * Get 删除成功的版本列表 
     * @return SuccessVersions 删除成功的版本列表
     */
    public SuccessDeleteVersions [] getSuccessVersions() {
        return this.SuccessVersions;
    }

    /**
     * Set 删除成功的版本列表
     * @param SuccessVersions 删除成功的版本列表
     */
    public void setSuccessVersions(SuccessDeleteVersions [] SuccessVersions) {
        this.SuccessVersions = SuccessVersions;
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

    public DeleteCloudRunVersionsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteCloudRunVersionsResponse(DeleteCloudRunVersionsResponse source) {
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.FailVersions != null) {
            this.FailVersions = new FailDeleteVersions[source.FailVersions.length];
            for (int i = 0; i < source.FailVersions.length; i++) {
                this.FailVersions[i] = new FailDeleteVersions(source.FailVersions[i]);
            }
        }
        if (source.SuccessVersions != null) {
            this.SuccessVersions = new SuccessDeleteVersions[source.SuccessVersions.length];
            for (int i = 0; i < source.SuccessVersions.length; i++) {
                this.SuccessVersions[i] = new SuccessDeleteVersions(source.SuccessVersions[i]);
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
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamArrayObj(map, prefix + "FailVersions.", this.FailVersions);
        this.setParamArrayObj(map, prefix + "SuccessVersions.", this.SuccessVersions);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

