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
package com.tencentcloudapi.cws.v20180312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VerifySitesResponse extends AbstractModel{

    /**
    * 验证成功的根域名数量。
    */
    @SerializedName("SuccessNumber")
    @Expose
    private Long SuccessNumber;

    /**
    * 验证失败的根域名数量。
    */
    @SerializedName("FailNumber")
    @Expose
    private Long FailNumber;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 验证成功的根域名数量。 
     * @return SuccessNumber 验证成功的根域名数量。
     */
    public Long getSuccessNumber() {
        return this.SuccessNumber;
    }

    /**
     * Set 验证成功的根域名数量。
     * @param SuccessNumber 验证成功的根域名数量。
     */
    public void setSuccessNumber(Long SuccessNumber) {
        this.SuccessNumber = SuccessNumber;
    }

    /**
     * Get 验证失败的根域名数量。 
     * @return FailNumber 验证失败的根域名数量。
     */
    public Long getFailNumber() {
        return this.FailNumber;
    }

    /**
     * Set 验证失败的根域名数量。
     * @param FailNumber 验证失败的根域名数量。
     */
    public void setFailNumber(Long FailNumber) {
        this.FailNumber = FailNumber;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SuccessNumber", this.SuccessNumber);
        this.setParamSimple(map, prefix + "FailNumber", this.FailNumber);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

