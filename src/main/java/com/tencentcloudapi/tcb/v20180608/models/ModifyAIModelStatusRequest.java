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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAIModelStatusRequest extends AbstractModel {

    /**
    * <p>环境ID</p>
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * <p>分组名</p><p>枚举值：</p><ul><li>cloudbase： 生文系列内置模型</li><li>hunyuan-image： 生图系列内置模型</li></ul><p>系统内置分组固定标识</p>
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * <p>模型设置</p><p>空数组表示无操作</p>
    */
    @SerializedName("Models")
    @Expose
    private AIModelStatus [] Models;

    /**
     * Get <p>环境ID</p> 
     * @return EnvId <p>环境ID</p>
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set <p>环境ID</p>
     * @param EnvId <p>环境ID</p>
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get <p>分组名</p><p>枚举值：</p><ul><li>cloudbase： 生文系列内置模型</li><li>hunyuan-image： 生图系列内置模型</li></ul><p>系统内置分组固定标识</p> 
     * @return GroupName <p>分组名</p><p>枚举值：</p><ul><li>cloudbase： 生文系列内置模型</li><li>hunyuan-image： 生图系列内置模型</li></ul><p>系统内置分组固定标识</p>
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set <p>分组名</p><p>枚举值：</p><ul><li>cloudbase： 生文系列内置模型</li><li>hunyuan-image： 生图系列内置模型</li></ul><p>系统内置分组固定标识</p>
     * @param GroupName <p>分组名</p><p>枚举值：</p><ul><li>cloudbase： 生文系列内置模型</li><li>hunyuan-image： 生图系列内置模型</li></ul><p>系统内置分组固定标识</p>
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get <p>模型设置</p><p>空数组表示无操作</p> 
     * @return Models <p>模型设置</p><p>空数组表示无操作</p>
     */
    public AIModelStatus [] getModels() {
        return this.Models;
    }

    /**
     * Set <p>模型设置</p><p>空数组表示无操作</p>
     * @param Models <p>模型设置</p><p>空数组表示无操作</p>
     */
    public void setModels(AIModelStatus [] Models) {
        this.Models = Models;
    }

    public ModifyAIModelStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAIModelStatusRequest(ModifyAIModelStatusRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.Models != null) {
            this.Models = new AIModelStatus[source.Models.length];
            for (int i = 0; i < source.Models.length; i++) {
                this.Models[i] = new AIModelStatus(source.Models[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamArrayObj(map, prefix + "Models.", this.Models);

    }
}

