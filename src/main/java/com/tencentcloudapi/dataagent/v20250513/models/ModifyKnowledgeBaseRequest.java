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
package com.tencentcloudapi.dataagent.v20250513.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyKnowledgeBaseRequest extends AbstractModel {

    /**
    * <p>实例id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>操作类型：Create，Update，Delete</p>
    */
    @SerializedName("OperateType")
    @Expose
    private String OperateType;

    /**
    * <p>知识库id，update和delete时必填</p>
    */
    @SerializedName("KnowledgeBaseId")
    @Expose
    private String KnowledgeBaseId;

    /**
    * <p>知识库名称，create和update时必填。只允许字母、数字、汉字、下划线</p>
    */
    @SerializedName("KnowledgeBaseName")
    @Expose
    private String KnowledgeBaseName;

    /**
    * <p>知识库描述，create和update时必填</p>
    */
    @SerializedName("KnowledgeBaseDesc")
    @Expose
    private String KnowledgeBaseDesc;

    /**
    * <p>1仅自己使用，2指定用户，0全员</p>
    */
    @SerializedName("UseScope")
    @Expose
    private Long UseScope;

    /**
    * <p>可使用用户列表</p>
    */
    @SerializedName("AuthorityUins")
    @Expose
    private String [] AuthorityUins;

    /**
    * <p>知识库任务配置</p>
    */
    @SerializedName("Config")
    @Expose
    private KnowledgeTaskConfig Config;

    /**
     * Get <p>实例id</p> 
     * @return InstanceId <p>实例id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例id</p>
     * @param InstanceId <p>实例id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>操作类型：Create，Update，Delete</p> 
     * @return OperateType <p>操作类型：Create，Update，Delete</p>
     */
    public String getOperateType() {
        return this.OperateType;
    }

    /**
     * Set <p>操作类型：Create，Update，Delete</p>
     * @param OperateType <p>操作类型：Create，Update，Delete</p>
     */
    public void setOperateType(String OperateType) {
        this.OperateType = OperateType;
    }

    /**
     * Get <p>知识库id，update和delete时必填</p> 
     * @return KnowledgeBaseId <p>知识库id，update和delete时必填</p>
     */
    public String getKnowledgeBaseId() {
        return this.KnowledgeBaseId;
    }

    /**
     * Set <p>知识库id，update和delete时必填</p>
     * @param KnowledgeBaseId <p>知识库id，update和delete时必填</p>
     */
    public void setKnowledgeBaseId(String KnowledgeBaseId) {
        this.KnowledgeBaseId = KnowledgeBaseId;
    }

    /**
     * Get <p>知识库名称，create和update时必填。只允许字母、数字、汉字、下划线</p> 
     * @return KnowledgeBaseName <p>知识库名称，create和update时必填。只允许字母、数字、汉字、下划线</p>
     */
    public String getKnowledgeBaseName() {
        return this.KnowledgeBaseName;
    }

    /**
     * Set <p>知识库名称，create和update时必填。只允许字母、数字、汉字、下划线</p>
     * @param KnowledgeBaseName <p>知识库名称，create和update时必填。只允许字母、数字、汉字、下划线</p>
     */
    public void setKnowledgeBaseName(String KnowledgeBaseName) {
        this.KnowledgeBaseName = KnowledgeBaseName;
    }

    /**
     * Get <p>知识库描述，create和update时必填</p> 
     * @return KnowledgeBaseDesc <p>知识库描述，create和update时必填</p>
     */
    public String getKnowledgeBaseDesc() {
        return this.KnowledgeBaseDesc;
    }

    /**
     * Set <p>知识库描述，create和update时必填</p>
     * @param KnowledgeBaseDesc <p>知识库描述，create和update时必填</p>
     */
    public void setKnowledgeBaseDesc(String KnowledgeBaseDesc) {
        this.KnowledgeBaseDesc = KnowledgeBaseDesc;
    }

    /**
     * Get <p>1仅自己使用，2指定用户，0全员</p> 
     * @return UseScope <p>1仅自己使用，2指定用户，0全员</p>
     */
    public Long getUseScope() {
        return this.UseScope;
    }

    /**
     * Set <p>1仅自己使用，2指定用户，0全员</p>
     * @param UseScope <p>1仅自己使用，2指定用户，0全员</p>
     */
    public void setUseScope(Long UseScope) {
        this.UseScope = UseScope;
    }

    /**
     * Get <p>可使用用户列表</p> 
     * @return AuthorityUins <p>可使用用户列表</p>
     */
    public String [] getAuthorityUins() {
        return this.AuthorityUins;
    }

    /**
     * Set <p>可使用用户列表</p>
     * @param AuthorityUins <p>可使用用户列表</p>
     */
    public void setAuthorityUins(String [] AuthorityUins) {
        this.AuthorityUins = AuthorityUins;
    }

    /**
     * Get <p>知识库任务配置</p> 
     * @return Config <p>知识库任务配置</p>
     */
    public KnowledgeTaskConfig getConfig() {
        return this.Config;
    }

    /**
     * Set <p>知识库任务配置</p>
     * @param Config <p>知识库任务配置</p>
     */
    public void setConfig(KnowledgeTaskConfig Config) {
        this.Config = Config;
    }

    public ModifyKnowledgeBaseRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyKnowledgeBaseRequest(ModifyKnowledgeBaseRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.OperateType != null) {
            this.OperateType = new String(source.OperateType);
        }
        if (source.KnowledgeBaseId != null) {
            this.KnowledgeBaseId = new String(source.KnowledgeBaseId);
        }
        if (source.KnowledgeBaseName != null) {
            this.KnowledgeBaseName = new String(source.KnowledgeBaseName);
        }
        if (source.KnowledgeBaseDesc != null) {
            this.KnowledgeBaseDesc = new String(source.KnowledgeBaseDesc);
        }
        if (source.UseScope != null) {
            this.UseScope = new Long(source.UseScope);
        }
        if (source.AuthorityUins != null) {
            this.AuthorityUins = new String[source.AuthorityUins.length];
            for (int i = 0; i < source.AuthorityUins.length; i++) {
                this.AuthorityUins[i] = new String(source.AuthorityUins[i]);
            }
        }
        if (source.Config != null) {
            this.Config = new KnowledgeTaskConfig(source.Config);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "OperateType", this.OperateType);
        this.setParamSimple(map, prefix + "KnowledgeBaseId", this.KnowledgeBaseId);
        this.setParamSimple(map, prefix + "KnowledgeBaseName", this.KnowledgeBaseName);
        this.setParamSimple(map, prefix + "KnowledgeBaseDesc", this.KnowledgeBaseDesc);
        this.setParamSimple(map, prefix + "UseScope", this.UseScope);
        this.setParamArraySimple(map, prefix + "AuthorityUins.", this.AuthorityUins);
        this.setParamObj(map, prefix + "Config.", this.Config);

    }
}

