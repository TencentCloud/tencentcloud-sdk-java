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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckInstanceNameResponse extends AbstractModel {

    /**
    * 检查结果，true为合法，false为非法
    */
    @SerializedName("IsValidated")
    @Expose
    private Boolean IsValidated;

    /**
    * 1: Illegal（名称非法）, 2:Reserved（名字保留）, 3:Existed（名字已存在）
    */
    @SerializedName("DetailCode")
    @Expose
    private Long DetailCode;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 检查结果，true为合法，false为非法 
     * @return IsValidated 检查结果，true为合法，false为非法
     */
    public Boolean getIsValidated() {
        return this.IsValidated;
    }

    /**
     * Set 检查结果，true为合法，false为非法
     * @param IsValidated 检查结果，true为合法，false为非法
     */
    public void setIsValidated(Boolean IsValidated) {
        this.IsValidated = IsValidated;
    }

    /**
     * Get 1: Illegal（名称非法）, 2:Reserved（名字保留）, 3:Existed（名字已存在） 
     * @return DetailCode 1: Illegal（名称非法）, 2:Reserved（名字保留）, 3:Existed（名字已存在）
     */
    public Long getDetailCode() {
        return this.DetailCode;
    }

    /**
     * Set 1: Illegal（名称非法）, 2:Reserved（名字保留）, 3:Existed（名字已存在）
     * @param DetailCode 1: Illegal（名称非法）, 2:Reserved（名字保留）, 3:Existed（名字已存在）
     */
    public void setDetailCode(Long DetailCode) {
        this.DetailCode = DetailCode;
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

    public CheckInstanceNameResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckInstanceNameResponse(CheckInstanceNameResponse source) {
        if (source.IsValidated != null) {
            this.IsValidated = new Boolean(source.IsValidated);
        }
        if (source.DetailCode != null) {
            this.DetailCode = new Long(source.DetailCode);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsValidated", this.IsValidated);
        this.setParamSimple(map, prefix + "DetailCode", this.DetailCode);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

