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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceStatistic extends AbstractModel{

    /**
    * 实例的类型
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 实例的个数
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
     * Get 实例的类型 
     * @return InstanceType 实例的类型
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例的类型
     * @param InstanceType 实例的类型
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 实例的个数 
     * @return InstanceCount 实例的个数
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set 实例的个数
     * @param InstanceCount 实例的个数
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);

    }
}

