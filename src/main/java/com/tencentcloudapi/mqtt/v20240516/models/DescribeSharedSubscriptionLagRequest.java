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

public class DescribeSharedSubscriptionLagRequest extends AbstractModel {

    /**
    * 集群id	
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 共享订阅表达式
    */
    @SerializedName("SharedSubscription")
    @Expose
    private String SharedSubscription;

    /**
     * Get 集群id	 
     * @return InstanceId 集群id	
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群id	
     * @param InstanceId 集群id	
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 共享订阅表达式 
     * @return SharedSubscription 共享订阅表达式
     */
    public String getSharedSubscription() {
        return this.SharedSubscription;
    }

    /**
     * Set 共享订阅表达式
     * @param SharedSubscription 共享订阅表达式
     */
    public void setSharedSubscription(String SharedSubscription) {
        this.SharedSubscription = SharedSubscription;
    }

    public DescribeSharedSubscriptionLagRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSharedSubscriptionLagRequest(DescribeSharedSubscriptionLagRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SharedSubscription != null) {
            this.SharedSubscription = new String(source.SharedSubscription);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SharedSubscription", this.SharedSubscription);

    }
}

