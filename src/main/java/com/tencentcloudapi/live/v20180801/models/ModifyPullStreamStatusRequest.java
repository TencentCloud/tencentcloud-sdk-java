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

public class ModifyPullStreamStatusRequest extends AbstractModel{

    /**
    * 配置 ID 列表。
    */
    @SerializedName("ConfigIds")
    @Expose
    private String [] ConfigIds;

    /**
    * 目标状态。0无效，2正在运行，4暂停。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 配置 ID 列表。 
     * @return ConfigIds 配置 ID 列表。
     */
    public String [] getConfigIds() {
        return this.ConfigIds;
    }

    /**
     * Set 配置 ID 列表。
     * @param ConfigIds 配置 ID 列表。
     */
    public void setConfigIds(String [] ConfigIds) {
        this.ConfigIds = ConfigIds;
    }

    /**
     * Get 目标状态。0无效，2正在运行，4暂停。 
     * @return Status 目标状态。0无效，2正在运行，4暂停。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 目标状态。0无效，2正在运行，4暂停。
     * @param Status 目标状态。0无效，2正在运行，4暂停。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ConfigIds.", this.ConfigIds);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

