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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceStatusRequest extends AbstractModel{

    /**
    * 实例ID的数组
    */
    @SerializedName("RegistryIds")
    @Expose
    private String [] RegistryIds;

    /**
     * Get 实例ID的数组 
     * @return RegistryIds 实例ID的数组
     */
    public String [] getRegistryIds() {
        return this.RegistryIds;
    }

    /**
     * Set 实例ID的数组
     * @param RegistryIds 实例ID的数组
     */
    public void setRegistryIds(String [] RegistryIds) {
        this.RegistryIds = RegistryIds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "RegistryIds.", this.RegistryIds);

    }
}

