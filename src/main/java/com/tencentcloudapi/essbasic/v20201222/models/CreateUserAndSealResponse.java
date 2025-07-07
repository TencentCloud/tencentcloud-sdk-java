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
package com.tencentcloudapi.essbasic.v20201222.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateUserAndSealResponse extends AbstractModel {

    /**
    * 用户唯一标识，按应用号隔离
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 默认印章ID
    */
    @SerializedName("SealId")
    @Expose
    private String SealId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 用户唯一标识，按应用号隔离 
     * @return UserId 用户唯一标识，按应用号隔离
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户唯一标识，按应用号隔离
     * @param UserId 用户唯一标识，按应用号隔离
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 默认印章ID 
     * @return SealId 默认印章ID
     */
    public String getSealId() {
        return this.SealId;
    }

    /**
     * Set 默认印章ID
     * @param SealId 默认印章ID
     */
    public void setSealId(String SealId) {
        this.SealId = SealId;
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

    public CreateUserAndSealResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateUserAndSealResponse(CreateUserAndSealResponse source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.SealId != null) {
            this.SealId = new String(source.SealId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "SealId", this.SealId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

