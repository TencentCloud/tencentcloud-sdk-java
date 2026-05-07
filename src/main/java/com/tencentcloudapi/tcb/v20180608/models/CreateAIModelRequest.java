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

public class CreateAIModelRequest extends AbstractModel {

    /**
    * <p>环境id</p>
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * <p>分组名</p><p>入参限制：不允许以 cloudbase 为前缀</p>
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * <p>模型服务地址</p>
    */
    @SerializedName("BaseUrl")
    @Expose
    private String BaseUrl;

    /**
    * <p>模型名列表</p>
    */
    @SerializedName("Models")
    @Expose
    private AIModel [] Models;

    /**
    * <p>分组备注</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>模型状态,  1: 开启, 2: 关闭</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>模型密钥</p>
    */
    @SerializedName("Secret")
    @Expose
    private AIModelSecret Secret;

    /**
     * Get <p>环境id</p> 
     * @return EnvId <p>环境id</p>
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set <p>环境id</p>
     * @param EnvId <p>环境id</p>
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get <p>分组名</p><p>入参限制：不允许以 cloudbase 为前缀</p> 
     * @return GroupName <p>分组名</p><p>入参限制：不允许以 cloudbase 为前缀</p>
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set <p>分组名</p><p>入参限制：不允许以 cloudbase 为前缀</p>
     * @param GroupName <p>分组名</p><p>入参限制：不允许以 cloudbase 为前缀</p>
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get <p>模型服务地址</p> 
     * @return BaseUrl <p>模型服务地址</p>
     */
    public String getBaseUrl() {
        return this.BaseUrl;
    }

    /**
     * Set <p>模型服务地址</p>
     * @param BaseUrl <p>模型服务地址</p>
     */
    public void setBaseUrl(String BaseUrl) {
        this.BaseUrl = BaseUrl;
    }

    /**
     * Get <p>模型名列表</p> 
     * @return Models <p>模型名列表</p>
     */
    public AIModel [] getModels() {
        return this.Models;
    }

    /**
     * Set <p>模型名列表</p>
     * @param Models <p>模型名列表</p>
     */
    public void setModels(AIModel [] Models) {
        this.Models = Models;
    }

    /**
     * Get <p>分组备注</p> 
     * @return Remark <p>分组备注</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>分组备注</p>
     * @param Remark <p>分组备注</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>模型状态,  1: 开启, 2: 关闭</p> 
     * @return Status <p>模型状态,  1: 开启, 2: 关闭</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>模型状态,  1: 开启, 2: 关闭</p>
     * @param Status <p>模型状态,  1: 开启, 2: 关闭</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>模型密钥</p> 
     * @return Secret <p>模型密钥</p>
     */
    public AIModelSecret getSecret() {
        return this.Secret;
    }

    /**
     * Set <p>模型密钥</p>
     * @param Secret <p>模型密钥</p>
     */
    public void setSecret(AIModelSecret Secret) {
        this.Secret = Secret;
    }

    public CreateAIModelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAIModelRequest(CreateAIModelRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.BaseUrl != null) {
            this.BaseUrl = new String(source.BaseUrl);
        }
        if (source.Models != null) {
            this.Models = new AIModel[source.Models.length];
            for (int i = 0; i < source.Models.length; i++) {
                this.Models[i] = new AIModel(source.Models[i]);
            }
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Secret != null) {
            this.Secret = new AIModelSecret(source.Secret);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "BaseUrl", this.BaseUrl);
        this.setParamArrayObj(map, prefix + "Models.", this.Models);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "Secret.", this.Secret);

    }
}

