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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LifeCycleData extends AbstractModel{

    /**
    * 云文件热存储时长，单位天，最小1天，最大3650天
    */
    @SerializedName("Transition")
    @Expose
    private Long Transition;

    /**
    * 云文件冷存储时长， 单位天，0表示不设置，设置时最小60天，Expiration字段加Transition字段不超过3650天
    */
    @SerializedName("Expiration")
    @Expose
    private Long Expiration;

    /**
     * Get 云文件热存储时长，单位天，最小1天，最大3650天 
     * @return Transition 云文件热存储时长，单位天，最小1天，最大3650天
     */
    public Long getTransition() {
        return this.Transition;
    }

    /**
     * Set 云文件热存储时长，单位天，最小1天，最大3650天
     * @param Transition 云文件热存储时长，单位天，最小1天，最大3650天
     */
    public void setTransition(Long Transition) {
        this.Transition = Transition;
    }

    /**
     * Get 云文件冷存储时长， 单位天，0表示不设置，设置时最小60天，Expiration字段加Transition字段不超过3650天 
     * @return Expiration 云文件冷存储时长， 单位天，0表示不设置，设置时最小60天，Expiration字段加Transition字段不超过3650天
     */
    public Long getExpiration() {
        return this.Expiration;
    }

    /**
     * Set 云文件冷存储时长， 单位天，0表示不设置，设置时最小60天，Expiration字段加Transition字段不超过3650天
     * @param Expiration 云文件冷存储时长， 单位天，0表示不设置，设置时最小60天，Expiration字段加Transition字段不超过3650天
     */
    public void setExpiration(Long Expiration) {
        this.Expiration = Expiration;
    }

    public LifeCycleData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LifeCycleData(LifeCycleData source) {
        if (source.Transition != null) {
            this.Transition = new Long(source.Transition);
        }
        if (source.Expiration != null) {
            this.Expiration = new Long(source.Expiration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Transition", this.Transition);
        this.setParamSimple(map, prefix + "Expiration", this.Expiration);

    }
}

