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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePullStreamConfigsRequest extends AbstractModel{

    /**
    * 配置 ID。
获取途径：从 CreatePullStreamConfig 接口返回值获取。
    */
    @SerializedName("ConfigId")
    @Expose
    private String ConfigId;

    /**
     * Get 配置 ID。
获取途径：从 CreatePullStreamConfig 接口返回值获取。 
     * @return ConfigId 配置 ID。
获取途径：从 CreatePullStreamConfig 接口返回值获取。
     */
    public String getConfigId() {
        return this.ConfigId;
    }

    /**
     * Set 配置 ID。
获取途径：从 CreatePullStreamConfig 接口返回值获取。
     * @param ConfigId 配置 ID。
获取途径：从 CreatePullStreamConfig 接口返回值获取。
     */
    public void setConfigId(String ConfigId) {
        this.ConfigId = ConfigId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfigId", this.ConfigId);

    }
}

