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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RebootInstancesRequest extends AbstractModel {

    /**
    * 实例 ID 列表。每次请求批量实例的上限为 100。可通过[DescribeInstances](https://cloud.tencent.com/document/api/1207/47573)接口返回值中的InstanceId获取。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 关机类型。
取值范围：
- SOFT：表示软关机 
- HARD：表示硬关机 
- SOFT_FIRST：表示优先软关机，失败再执行硬关机  

默认取值：SOFT_FIRST。
    */
    @SerializedName("StopType")
    @Expose
    private String StopType;

    /**
     * Get 实例 ID 列表。每次请求批量实例的上限为 100。可通过[DescribeInstances](https://cloud.tencent.com/document/api/1207/47573)接口返回值中的InstanceId获取。 
     * @return InstanceIds 实例 ID 列表。每次请求批量实例的上限为 100。可通过[DescribeInstances](https://cloud.tencent.com/document/api/1207/47573)接口返回值中的InstanceId获取。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 实例 ID 列表。每次请求批量实例的上限为 100。可通过[DescribeInstances](https://cloud.tencent.com/document/api/1207/47573)接口返回值中的InstanceId获取。
     * @param InstanceIds 实例 ID 列表。每次请求批量实例的上限为 100。可通过[DescribeInstances](https://cloud.tencent.com/document/api/1207/47573)接口返回值中的InstanceId获取。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 关机类型。
取值范围：
- SOFT：表示软关机 
- HARD：表示硬关机 
- SOFT_FIRST：表示优先软关机，失败再执行硬关机  

默认取值：SOFT_FIRST。 
     * @return StopType 关机类型。
取值范围：
- SOFT：表示软关机 
- HARD：表示硬关机 
- SOFT_FIRST：表示优先软关机，失败再执行硬关机  

默认取值：SOFT_FIRST。
     */
    public String getStopType() {
        return this.StopType;
    }

    /**
     * Set 关机类型。
取值范围：
- SOFT：表示软关机 
- HARD：表示硬关机 
- SOFT_FIRST：表示优先软关机，失败再执行硬关机  

默认取值：SOFT_FIRST。
     * @param StopType 关机类型。
取值范围：
- SOFT：表示软关机 
- HARD：表示硬关机 
- SOFT_FIRST：表示优先软关机，失败再执行硬关机  

默认取值：SOFT_FIRST。
     */
    public void setStopType(String StopType) {
        this.StopType = StopType;
    }

    public RebootInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RebootInstancesRequest(RebootInstancesRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.StopType != null) {
            this.StopType = new String(source.StopType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "StopType", this.StopType);

    }
}

