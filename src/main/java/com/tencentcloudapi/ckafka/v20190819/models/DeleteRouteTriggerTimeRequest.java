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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteRouteTriggerTimeRequest extends AbstractModel {

    /**
    * ckafka集群实例Id,可通过DescribeInstances接口获取
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 修改删除路由的定时时间
    */
    @SerializedName("DelayTime")
    @Expose
    private String DelayTime;

    /**
     * Get ckafka集群实例Id,可通过DescribeInstances接口获取 
     * @return InstanceId ckafka集群实例Id,可通过DescribeInstances接口获取
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ckafka集群实例Id,可通过DescribeInstances接口获取
     * @param InstanceId ckafka集群实例Id,可通过DescribeInstances接口获取
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 修改删除路由的定时时间 
     * @return DelayTime 修改删除路由的定时时间
     */
    public String getDelayTime() {
        return this.DelayTime;
    }

    /**
     * Set 修改删除路由的定时时间
     * @param DelayTime 修改删除路由的定时时间
     */
    public void setDelayTime(String DelayTime) {
        this.DelayTime = DelayTime;
    }

    public DeleteRouteTriggerTimeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteRouteTriggerTimeRequest(DeleteRouteTriggerTimeRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DelayTime != null) {
            this.DelayTime = new String(source.DelayTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DelayTime", this.DelayTime);

    }
}

