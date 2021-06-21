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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProtocolBlockRelation extends AbstractModel{

    /**
    * 协议封禁配置
    */
    @SerializedName("ProtocolBlockConfig")
    @Expose
    private ProtocolBlockConfig ProtocolBlockConfig;

    /**
    * 协议封禁配置所属的实例
    */
    @SerializedName("InstanceDetailList")
    @Expose
    private InstanceRelation [] InstanceDetailList;

    /**
     * Get 协议封禁配置 
     * @return ProtocolBlockConfig 协议封禁配置
     */
    public ProtocolBlockConfig getProtocolBlockConfig() {
        return this.ProtocolBlockConfig;
    }

    /**
     * Set 协议封禁配置
     * @param ProtocolBlockConfig 协议封禁配置
     */
    public void setProtocolBlockConfig(ProtocolBlockConfig ProtocolBlockConfig) {
        this.ProtocolBlockConfig = ProtocolBlockConfig;
    }

    /**
     * Get 协议封禁配置所属的实例 
     * @return InstanceDetailList 协议封禁配置所属的实例
     */
    public InstanceRelation [] getInstanceDetailList() {
        return this.InstanceDetailList;
    }

    /**
     * Set 协议封禁配置所属的实例
     * @param InstanceDetailList 协议封禁配置所属的实例
     */
    public void setInstanceDetailList(InstanceRelation [] InstanceDetailList) {
        this.InstanceDetailList = InstanceDetailList;
    }

    public ProtocolBlockRelation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProtocolBlockRelation(ProtocolBlockRelation source) {
        if (source.ProtocolBlockConfig != null) {
            this.ProtocolBlockConfig = new ProtocolBlockConfig(source.ProtocolBlockConfig);
        }
        if (source.InstanceDetailList != null) {
            this.InstanceDetailList = new InstanceRelation[source.InstanceDetailList.length];
            for (int i = 0; i < source.InstanceDetailList.length; i++) {
                this.InstanceDetailList[i] = new InstanceRelation(source.InstanceDetailList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ProtocolBlockConfig.", this.ProtocolBlockConfig);
        this.setParamArrayObj(map, prefix + "InstanceDetailList.", this.InstanceDetailList);

    }
}

