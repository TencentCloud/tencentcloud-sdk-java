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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckInstanceResponse extends AbstractModel{

    /**
    * 检查结果，true为合法，false为非法
    */
    @SerializedName("IsValidated")
    @Expose
    private Boolean IsValidated;

    /**
    * 实例所在的RegionId
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
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
     * Get 实例所在的RegionId 
     * @return RegionId 实例所在的RegionId
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 实例所在的RegionId
     * @param RegionId 实例所在的RegionId
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
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

    public CheckInstanceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckInstanceResponse(CheckInstanceResponse source) {
        if (source.IsValidated != null) {
            this.IsValidated = new Boolean(source.IsValidated);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
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
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

