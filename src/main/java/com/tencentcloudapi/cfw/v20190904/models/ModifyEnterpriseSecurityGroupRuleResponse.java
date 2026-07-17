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

public class ModifyEnterpriseSecurityGroupRuleResponse extends AbstractModel {

    /**
    * <p>状态值，0：编辑成功，非0：编辑失败</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>编辑后新生成规则的Id</p>
    */
    @SerializedName("NewRuleUuid")
    @Expose
    private Long NewRuleUuid;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>状态值，0：编辑成功，非0：编辑失败</p> 
     * @return Status <p>状态值，0：编辑成功，非0：编辑失败</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态值，0：编辑成功，非0：编辑失败</p>
     * @param Status <p>状态值，0：编辑成功，非0：编辑失败</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>编辑后新生成规则的Id</p> 
     * @return NewRuleUuid <p>编辑后新生成规则的Id</p>
     */
    public Long getNewRuleUuid() {
        return this.NewRuleUuid;
    }

    /**
     * Set <p>编辑后新生成规则的Id</p>
     * @param NewRuleUuid <p>编辑后新生成规则的Id</p>
     */
    public void setNewRuleUuid(Long NewRuleUuid) {
        this.NewRuleUuid = NewRuleUuid;
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

    public ModifyEnterpriseSecurityGroupRuleResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyEnterpriseSecurityGroupRuleResponse(ModifyEnterpriseSecurityGroupRuleResponse source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.NewRuleUuid != null) {
            this.NewRuleUuid = new Long(source.NewRuleUuid);
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
        this.setParamSimple(map, prefix + "NewRuleUuid", this.NewRuleUuid);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

