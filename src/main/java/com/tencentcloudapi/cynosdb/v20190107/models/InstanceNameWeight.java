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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceNameWeight extends AbstractModel {

    /**
    * 实例名称，创建集群中InstanceInitInfo.InstanceName所指定名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 权重
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
     * Get 实例名称，创建集群中InstanceInitInfo.InstanceName所指定名称 
     * @return InstanceName 实例名称，创建集群中InstanceInitInfo.InstanceName所指定名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称，创建集群中InstanceInitInfo.InstanceName所指定名称
     * @param InstanceName 实例名称，创建集群中InstanceInitInfo.InstanceName所指定名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 权重 
     * @return Weight 权重
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set 权重
     * @param Weight 权重
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    public InstanceNameWeight() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceNameWeight(InstanceNameWeight source) {
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Weight", this.Weight);

    }
}

