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

public class ConnectLimitRelation extends AbstractModel{

    /**
    * 连接抑制配置
    */
    @SerializedName("ConnectLimitConfig")
    @Expose
    private ConnectLimitConfig ConnectLimitConfig;

    /**
    * 连接抑制关联的实例信息
    */
    @SerializedName("InstanceDetailList")
    @Expose
    private InstanceRelation [] InstanceDetailList;

    /**
     * Get 连接抑制配置 
     * @return ConnectLimitConfig 连接抑制配置
     */
    public ConnectLimitConfig getConnectLimitConfig() {
        return this.ConnectLimitConfig;
    }

    /**
     * Set 连接抑制配置
     * @param ConnectLimitConfig 连接抑制配置
     */
    public void setConnectLimitConfig(ConnectLimitConfig ConnectLimitConfig) {
        this.ConnectLimitConfig = ConnectLimitConfig;
    }

    /**
     * Get 连接抑制关联的实例信息 
     * @return InstanceDetailList 连接抑制关联的实例信息
     */
    public InstanceRelation [] getInstanceDetailList() {
        return this.InstanceDetailList;
    }

    /**
     * Set 连接抑制关联的实例信息
     * @param InstanceDetailList 连接抑制关联的实例信息
     */
    public void setInstanceDetailList(InstanceRelation [] InstanceDetailList) {
        this.InstanceDetailList = InstanceDetailList;
    }

    public ConnectLimitRelation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConnectLimitRelation(ConnectLimitRelation source) {
        if (source.ConnectLimitConfig != null) {
            this.ConnectLimitConfig = new ConnectLimitConfig(source.ConnectLimitConfig);
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
        this.setParamObj(map, prefix + "ConnectLimitConfig.", this.ConnectLimitConfig);
        this.setParamArrayObj(map, prefix + "InstanceDetailList.", this.InstanceDetailList);

    }
}

