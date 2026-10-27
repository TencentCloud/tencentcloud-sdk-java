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
package com.tencentcloudapi.cvd.v20201104.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TerminateInstancesRequest extends AbstractModel {

    /**
    * <p>一个或多个待操作的实例ID。每次请求批量实例的上限为10。</p>
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * <p>是否立即销毁实例。默认false。 立即销毁的实例不会进入隔离期。</p>
    */
    @SerializedName("DestroyImmediately")
    @Expose
    private Boolean DestroyImmediately;

    /**
     * Get <p>一个或多个待操作的实例ID。每次请求批量实例的上限为10。</p> 
     * @return InstanceIds <p>一个或多个待操作的实例ID。每次请求批量实例的上限为10。</p>
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set <p>一个或多个待操作的实例ID。每次请求批量实例的上限为10。</p>
     * @param InstanceIds <p>一个或多个待操作的实例ID。每次请求批量实例的上限为10。</p>
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get <p>是否立即销毁实例。默认false。 立即销毁的实例不会进入隔离期。</p> 
     * @return DestroyImmediately <p>是否立即销毁实例。默认false。 立即销毁的实例不会进入隔离期。</p>
     */
    public Boolean getDestroyImmediately() {
        return this.DestroyImmediately;
    }

    /**
     * Set <p>是否立即销毁实例。默认false。 立即销毁的实例不会进入隔离期。</p>
     * @param DestroyImmediately <p>是否立即销毁实例。默认false。 立即销毁的实例不会进入隔离期。</p>
     */
    public void setDestroyImmediately(Boolean DestroyImmediately) {
        this.DestroyImmediately = DestroyImmediately;
    }

    public TerminateInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TerminateInstancesRequest(TerminateInstancesRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.DestroyImmediately != null) {
            this.DestroyImmediately = new Boolean(source.DestroyImmediately);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "DestroyImmediately", this.DestroyImmediately);

    }
}

