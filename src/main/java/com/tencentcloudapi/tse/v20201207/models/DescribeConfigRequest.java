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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeConfigRequest extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 配置中心类型（consul、zookeeper、apollo等）
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 配置项的节点路径key
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 配置中心类型（consul、zookeeper、apollo等） 
     * @return Type 配置中心类型（consul、zookeeper、apollo等）
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 配置中心类型（consul、zookeeper、apollo等）
     * @param Type 配置中心类型（consul、zookeeper、apollo等）
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 配置项的节点路径key 
     * @return Key 配置项的节点路径key
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 配置项的节点路径key
     * @param Key 配置项的节点路径key
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    public DescribeConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConfigRequest(DescribeConfigRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
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
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Key", this.Key);

    }
}

