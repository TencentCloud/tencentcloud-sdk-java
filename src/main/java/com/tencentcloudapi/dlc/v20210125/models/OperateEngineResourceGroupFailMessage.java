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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OperateEngineResourceGroupFailMessage extends AbstractModel {

    /**
    * 引擎资源组名称
    */
    @SerializedName("EngineResourceGroupName")
    @Expose
    private String EngineResourceGroupName;

    /**
    * 操作失败的提示信息
    */
    @SerializedName("FailMessage")
    @Expose
    private String FailMessage;

    /**
     * Get 引擎资源组名称 
     * @return EngineResourceGroupName 引擎资源组名称
     */
    public String getEngineResourceGroupName() {
        return this.EngineResourceGroupName;
    }

    /**
     * Set 引擎资源组名称
     * @param EngineResourceGroupName 引擎资源组名称
     */
    public void setEngineResourceGroupName(String EngineResourceGroupName) {
        this.EngineResourceGroupName = EngineResourceGroupName;
    }

    /**
     * Get 操作失败的提示信息 
     * @return FailMessage 操作失败的提示信息
     */
    public String getFailMessage() {
        return this.FailMessage;
    }

    /**
     * Set 操作失败的提示信息
     * @param FailMessage 操作失败的提示信息
     */
    public void setFailMessage(String FailMessage) {
        this.FailMessage = FailMessage;
    }

    public OperateEngineResourceGroupFailMessage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OperateEngineResourceGroupFailMessage(OperateEngineResourceGroupFailMessage source) {
        if (source.EngineResourceGroupName != null) {
            this.EngineResourceGroupName = new String(source.EngineResourceGroupName);
        }
        if (source.FailMessage != null) {
            this.FailMessage = new String(source.FailMessage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EngineResourceGroupName", this.EngineResourceGroupName);
        this.setParamSimple(map, prefix + "FailMessage", this.FailMessage);

    }
}

