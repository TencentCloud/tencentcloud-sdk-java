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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEndUsersRequest extends AbstractModel{

    /**
    * 开发者的环境ID
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 按照 uuid 列表过滤，最大个数为100
    */
    @SerializedName("UUIds")
    @Expose
    private String [] UUIds;

    /**
     * Get 开发者的环境ID 
     * @return EnvId 开发者的环境ID
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 开发者的环境ID
     * @param EnvId 开发者的环境ID
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 按照 uuid 列表过滤，最大个数为100 
     * @return UUIds 按照 uuid 列表过滤，最大个数为100
     */
    public String [] getUUIds() {
        return this.UUIds;
    }

    /**
     * Set 按照 uuid 列表过滤，最大个数为100
     * @param UUIds 按照 uuid 列表过滤，最大个数为100
     */
    public void setUUIds(String [] UUIds) {
        this.UUIds = UUIds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamArraySimple(map, prefix + "UUIds.", this.UUIds);

    }
}

