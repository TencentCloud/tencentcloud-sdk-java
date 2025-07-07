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
package com.tencentcloudapi.mqtt.v20240516.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuthorizationPolicyPriority extends AbstractModel {

    /**
    * 授权策略规则id，可以从 [DescribeAuthorizationPolicies](https://cloud.tencent.com/document/api/1778/111074)接口获得。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 优先级
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
     * Get 授权策略规则id，可以从 [DescribeAuthorizationPolicies](https://cloud.tencent.com/document/api/1778/111074)接口获得。 
     * @return Id 授权策略规则id，可以从 [DescribeAuthorizationPolicies](https://cloud.tencent.com/document/api/1778/111074)接口获得。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 授权策略规则id，可以从 [DescribeAuthorizationPolicies](https://cloud.tencent.com/document/api/1778/111074)接口获得。
     * @param Id 授权策略规则id，可以从 [DescribeAuthorizationPolicies](https://cloud.tencent.com/document/api/1778/111074)接口获得。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 优先级 
     * @return Priority 优先级
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set 优先级
     * @param Priority 优先级
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    public AuthorizationPolicyPriority() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuthorizationPolicyPriority(AuthorizationPolicyPriority source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Priority", this.Priority);

    }
}

