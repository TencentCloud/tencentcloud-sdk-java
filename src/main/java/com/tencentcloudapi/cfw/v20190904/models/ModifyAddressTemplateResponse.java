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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAddressTemplateResponse extends AbstractModel {

    /**
    * 创建结果,0成功
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 唯一Id
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 规则数上限配置
    */
    @SerializedName("RuleLimitNum")
    @Expose
    private Long RuleLimitNum;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 创建结果,0成功 
     * @return Status 创建结果,0成功
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 创建结果,0成功
     * @param Status 创建结果,0成功
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 唯一Id 
     * @return Uuid 唯一Id
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 唯一Id
     * @param Uuid 唯一Id
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 规则数上限配置 
     * @return RuleLimitNum 规则数上限配置
     */
    public Long getRuleLimitNum() {
        return this.RuleLimitNum;
    }

    /**
     * Set 规则数上限配置
     * @param RuleLimitNum 规则数上限配置
     */
    public void setRuleLimitNum(Long RuleLimitNum) {
        this.RuleLimitNum = RuleLimitNum;
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

    public ModifyAddressTemplateResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAddressTemplateResponse(ModifyAddressTemplateResponse source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.RuleLimitNum != null) {
            this.RuleLimitNum = new Long(source.RuleLimitNum);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "RuleLimitNum", this.RuleLimitNum);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

