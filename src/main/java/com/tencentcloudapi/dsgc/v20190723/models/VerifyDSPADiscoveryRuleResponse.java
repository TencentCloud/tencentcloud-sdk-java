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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VerifyDSPADiscoveryRuleResponse extends AbstractModel {

    /**
    * 验证结果
Success 验证成功
Failed 验证失败
    */
    @SerializedName("VerifyResult")
    @Expose
    private String VerifyResult;

    /**
    * 验证结果详情
    */
    @SerializedName("DetailInfo")
    @Expose
    private String DetailInfo;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 验证结果
Success 验证成功
Failed 验证失败 
     * @return VerifyResult 验证结果
Success 验证成功
Failed 验证失败
     */
    public String getVerifyResult() {
        return this.VerifyResult;
    }

    /**
     * Set 验证结果
Success 验证成功
Failed 验证失败
     * @param VerifyResult 验证结果
Success 验证成功
Failed 验证失败
     */
    public void setVerifyResult(String VerifyResult) {
        this.VerifyResult = VerifyResult;
    }

    /**
     * Get 验证结果详情 
     * @return DetailInfo 验证结果详情
     */
    public String getDetailInfo() {
        return this.DetailInfo;
    }

    /**
     * Set 验证结果详情
     * @param DetailInfo 验证结果详情
     */
    public void setDetailInfo(String DetailInfo) {
        this.DetailInfo = DetailInfo;
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

    public VerifyDSPADiscoveryRuleResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VerifyDSPADiscoveryRuleResponse(VerifyDSPADiscoveryRuleResponse source) {
        if (source.VerifyResult != null) {
            this.VerifyResult = new String(source.VerifyResult);
        }
        if (source.DetailInfo != null) {
            this.DetailInfo = new String(source.DetailInfo);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VerifyResult", this.VerifyResult);
        this.setParamSimple(map, prefix + "DetailInfo", this.DetailInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

