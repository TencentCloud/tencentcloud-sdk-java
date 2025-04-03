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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateOrUpdateConfigFileAndReleaseResponse extends AbstractModel {

    /**
    * 操作是否成功
    */
    @SerializedName("Result")
    @Expose
    private Boolean Result;

    /**
    * 配置发布Id
    */
    @SerializedName("ConfigFileReleaseId")
    @Expose
    private String ConfigFileReleaseId;

    /**
    * 配置文件Id
    */
    @SerializedName("ConfigFileId")
    @Expose
    private String ConfigFileId;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 操作是否成功 
     * @return Result 操作是否成功
     */
    public Boolean getResult() {
        return this.Result;
    }

    /**
     * Set 操作是否成功
     * @param Result 操作是否成功
     */
    public void setResult(Boolean Result) {
        this.Result = Result;
    }

    /**
     * Get 配置发布Id 
     * @return ConfigFileReleaseId 配置发布Id
     */
    public String getConfigFileReleaseId() {
        return this.ConfigFileReleaseId;
    }

    /**
     * Set 配置发布Id
     * @param ConfigFileReleaseId 配置发布Id
     */
    public void setConfigFileReleaseId(String ConfigFileReleaseId) {
        this.ConfigFileReleaseId = ConfigFileReleaseId;
    }

    /**
     * Get 配置文件Id 
     * @return ConfigFileId 配置文件Id
     */
    public String getConfigFileId() {
        return this.ConfigFileId;
    }

    /**
     * Set 配置文件Id
     * @param ConfigFileId 配置文件Id
     */
    public void setConfigFileId(String ConfigFileId) {
        this.ConfigFileId = ConfigFileId;
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

    public CreateOrUpdateConfigFileAndReleaseResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOrUpdateConfigFileAndReleaseResponse(CreateOrUpdateConfigFileAndReleaseResponse source) {
        if (source.Result != null) {
            this.Result = new Boolean(source.Result);
        }
        if (source.ConfigFileReleaseId != null) {
            this.ConfigFileReleaseId = new String(source.ConfigFileReleaseId);
        }
        if (source.ConfigFileId != null) {
            this.ConfigFileId = new String(source.ConfigFileId);
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
        this.setParamSimple(map, prefix + "ConfigFileReleaseId", this.ConfigFileReleaseId);
        this.setParamSimple(map, prefix + "ConfigFileId", this.ConfigFileId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

