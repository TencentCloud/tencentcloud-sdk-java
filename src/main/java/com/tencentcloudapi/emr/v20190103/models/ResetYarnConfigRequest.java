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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResetYarnConfigRequest extends AbstractModel {

    /**
    * emr集群的英文id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 要重置的配置别名，可选值：

- capacityLabel：重置标签管理的配置
- fair：重置公平调度的配置
- capacity：重置容量调度的配置
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
     * Get emr集群的英文id 
     * @return InstanceId emr集群的英文id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set emr集群的英文id
     * @param InstanceId emr集群的英文id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 要重置的配置别名，可选值：

- capacityLabel：重置标签管理的配置
- fair：重置公平调度的配置
- capacity：重置容量调度的配置 
     * @return Key 要重置的配置别名，可选值：

- capacityLabel：重置标签管理的配置
- fair：重置公平调度的配置
- capacity：重置容量调度的配置
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 要重置的配置别名，可选值：

- capacityLabel：重置标签管理的配置
- fair：重置公平调度的配置
- capacity：重置容量调度的配置
     * @param Key 要重置的配置别名，可选值：

- capacityLabel：重置标签管理的配置
- fair：重置公平调度的配置
- capacity：重置容量调度的配置
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    public ResetYarnConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResetYarnConfigRequest(ResetYarnConfigRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Key", this.Key);

    }
}

