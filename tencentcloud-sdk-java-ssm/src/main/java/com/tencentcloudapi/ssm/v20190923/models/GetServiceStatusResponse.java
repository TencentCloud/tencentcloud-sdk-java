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
package com.tencentcloudapi.ssm.v20190923.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetServiceStatusResponse extends AbstractModel{

    /**
    * true表示服务已开通，false 表示服务尚未开通。
    */
    @SerializedName("ServiceEnabled")
    @Expose
    private Boolean ServiceEnabled;

    /**
    * 服务不可用类型： 0-未购买，1-正常， 2-欠费停服， 3-资源释放。
    */
    @SerializedName("InvalidType")
    @Expose
    private Long InvalidType;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get true表示服务已开通，false 表示服务尚未开通。 
     * @return ServiceEnabled true表示服务已开通，false 表示服务尚未开通。
     */
    public Boolean getServiceEnabled() {
        return this.ServiceEnabled;
    }

    /**
     * Set true表示服务已开通，false 表示服务尚未开通。
     * @param ServiceEnabled true表示服务已开通，false 表示服务尚未开通。
     */
    public void setServiceEnabled(Boolean ServiceEnabled) {
        this.ServiceEnabled = ServiceEnabled;
    }

    /**
     * Get 服务不可用类型： 0-未购买，1-正常， 2-欠费停服， 3-资源释放。 
     * @return InvalidType 服务不可用类型： 0-未购买，1-正常， 2-欠费停服， 3-资源释放。
     */
    public Long getInvalidType() {
        return this.InvalidType;
    }

    /**
     * Set 服务不可用类型： 0-未购买，1-正常， 2-欠费停服， 3-资源释放。
     * @param InvalidType 服务不可用类型： 0-未购买，1-正常， 2-欠费停服， 3-资源释放。
     */
    public void setInvalidType(Long InvalidType) {
        this.InvalidType = InvalidType;
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
        this.setParamSimple(map, prefix + "ServiceEnabled", this.ServiceEnabled);
        this.setParamSimple(map, prefix + "InvalidType", this.InvalidType);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

