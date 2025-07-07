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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteComputeEnvRequest extends AbstractModel {

    /**
    * 计算环境ID，环境ID通过调用接口 [DescribeComputeEnvs](https://cloud.tencent.com/document/api/599/15893)获取，不能对状态处于删除中或者存在计算实例未销毁的环境发起删除动作。
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
     * Get 计算环境ID，环境ID通过调用接口 [DescribeComputeEnvs](https://cloud.tencent.com/document/api/599/15893)获取，不能对状态处于删除中或者存在计算实例未销毁的环境发起删除动作。 
     * @return EnvId 计算环境ID，环境ID通过调用接口 [DescribeComputeEnvs](https://cloud.tencent.com/document/api/599/15893)获取，不能对状态处于删除中或者存在计算实例未销毁的环境发起删除动作。
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 计算环境ID，环境ID通过调用接口 [DescribeComputeEnvs](https://cloud.tencent.com/document/api/599/15893)获取，不能对状态处于删除中或者存在计算实例未销毁的环境发起删除动作。
     * @param EnvId 计算环境ID，环境ID通过调用接口 [DescribeComputeEnvs](https://cloud.tencent.com/document/api/599/15893)获取，不能对状态处于删除中或者存在计算实例未销毁的环境发起删除动作。
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    public DeleteComputeEnvRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteComputeEnvRequest(DeleteComputeEnvRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);

    }
}

