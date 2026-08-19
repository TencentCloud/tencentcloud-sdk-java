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

public class ModifyExposureAutoTagRuleResponse extends AbstractModel {

    /**
    * <p>操作结果</p>
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * <p>当前是否有正在运行的打标任务</p>
    */
    @SerializedName("HasRunningApply")
    @Expose
    private Boolean HasRunningApply;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>操作结果</p> 
     * @return Message <p>操作结果</p>
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set <p>操作结果</p>
     * @param Message <p>操作结果</p>
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get <p>当前是否有正在运行的打标任务</p> 
     * @return HasRunningApply <p>当前是否有正在运行的打标任务</p>
     */
    public Boolean getHasRunningApply() {
        return this.HasRunningApply;
    }

    /**
     * Set <p>当前是否有正在运行的打标任务</p>
     * @param HasRunningApply <p>当前是否有正在运行的打标任务</p>
     */
    public void setHasRunningApply(Boolean HasRunningApply) {
        this.HasRunningApply = HasRunningApply;
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

    public ModifyExposureAutoTagRuleResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyExposureAutoTagRuleResponse(ModifyExposureAutoTagRuleResponse source) {
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.HasRunningApply != null) {
            this.HasRunningApply = new Boolean(source.HasRunningApply);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "HasRunningApply", this.HasRunningApply);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

