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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindUserDeviceResponse extends AbstractModel {

    /**
    * <p>用户 UserID（已存在则复用）</p>
    */
    @SerializedName("UserID")
    @Expose
    private String UserID;

    /**
    * <p>家庭 ID（已存在则复用）</p>
    */
    @SerializedName("FamilyId")
    @Expose
    private String FamilyId;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>用户 UserID（已存在则复用）</p> 
     * @return UserID <p>用户 UserID（已存在则复用）</p>
     */
    public String getUserID() {
        return this.UserID;
    }

    /**
     * Set <p>用户 UserID（已存在则复用）</p>
     * @param UserID <p>用户 UserID（已存在则复用）</p>
     */
    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    /**
     * Get <p>家庭 ID（已存在则复用）</p> 
     * @return FamilyId <p>家庭 ID（已存在则复用）</p>
     */
    public String getFamilyId() {
        return this.FamilyId;
    }

    /**
     * Set <p>家庭 ID（已存在则复用）</p>
     * @param FamilyId <p>家庭 ID（已存在则复用）</p>
     */
    public void setFamilyId(String FamilyId) {
        this.FamilyId = FamilyId;
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

    public BindUserDeviceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindUserDeviceResponse(BindUserDeviceResponse source) {
        if (source.UserID != null) {
            this.UserID = new String(source.UserID);
        }
        if (source.FamilyId != null) {
            this.FamilyId = new String(source.FamilyId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserID", this.UserID);
        this.setParamSimple(map, prefix + "FamilyId", this.FamilyId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

