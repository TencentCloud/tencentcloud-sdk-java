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
package com.tencentcloudapi.ba.v20200720.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGetAuthInfoResponse extends AbstractModel{

    /**
    * 实名认证状态：0未实名，1已实名
    */
    @SerializedName("IsTenPayMasked")
    @Expose
    private String IsTenPayMasked;

    /**
    * 实名认证类型：0个人，1企业
    */
    @SerializedName("IsAuthenticated")
    @Expose
    private String IsAuthenticated;

    /**
    * 认证类型，个人0，企业1
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 实名认证状态：0未实名，1已实名 
     * @return IsTenPayMasked 实名认证状态：0未实名，1已实名
     */
    public String getIsTenPayMasked() {
        return this.IsTenPayMasked;
    }

    /**
     * Set 实名认证状态：0未实名，1已实名
     * @param IsTenPayMasked 实名认证状态：0未实名，1已实名
     */
    public void setIsTenPayMasked(String IsTenPayMasked) {
        this.IsTenPayMasked = IsTenPayMasked;
    }

    /**
     * Get 实名认证类型：0个人，1企业 
     * @return IsAuthenticated 实名认证类型：0个人，1企业
     */
    public String getIsAuthenticated() {
        return this.IsAuthenticated;
    }

    /**
     * Set 实名认证类型：0个人，1企业
     * @param IsAuthenticated 实名认证类型：0个人，1企业
     */
    public void setIsAuthenticated(String IsAuthenticated) {
        this.IsAuthenticated = IsAuthenticated;
    }

    /**
     * Get 认证类型，个人0，企业1 
     * @return Type 认证类型，个人0，企业1
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 认证类型，个人0，企业1
     * @param Type 认证类型，个人0，企业1
     */
    public void setType(String Type) {
        this.Type = Type;
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

    public DescribeGetAuthInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGetAuthInfoResponse(DescribeGetAuthInfoResponse source) {
        if (source.IsTenPayMasked != null) {
            this.IsTenPayMasked = new String(source.IsTenPayMasked);
        }
        if (source.IsAuthenticated != null) {
            this.IsAuthenticated = new String(source.IsAuthenticated);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsTenPayMasked", this.IsTenPayMasked);
        this.setParamSimple(map, prefix + "IsAuthenticated", this.IsAuthenticated);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

