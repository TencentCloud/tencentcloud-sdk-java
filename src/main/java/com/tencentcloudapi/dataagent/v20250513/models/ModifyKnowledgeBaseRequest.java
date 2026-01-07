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
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 操作类型：Create，Update，Delete
    */
    @SerializedName("OperateType")
    @Expose
    private String OperateType;

    /**
    * 知识库id，update和delete时必填
    */
    @SerializedName("KnowledgeBaseId")
    @Expose
    private String KnowledgeBaseId;

    /**
    * 知识库名称，create和update时必填。只允许字母、数字、汉字、下划线
    */
    @SerializedName("KnowledgeBaseName")
    @Expose
    private String KnowledgeBaseName;

    /**
    * 知识库描述，create和update时必填
    */
    @SerializedName("KnowledgeBaseDesc")
    @Expose
    private String KnowledgeBaseDesc;

    /**
    * 1仅自己使用，2指定用户，0全员
    */
    @SerializedName("UseScope")
    @Expose
    private Long UseScope;

    /**
    * 可使用用户列表
    */
    @SerializedName("AuthorityUins")
    @Expose
    private String [] AuthorityUins;

    /**
     * Get 实例id 
     * @return InstanceId 实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
     * @param InstanceId 实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 操作类型：Create，Update，Delete 
     * @return OperateType 操作类型：Create，Update，Delete
     */
    public String getOperateType() {
        return this.OperateType;
    }

    /**
     * Set 操作类型：Create，Update，Delete
     * @param OperateType 操作类型：Create，Update，Delete
     */
    public void setOperateType(String OperateType) {
        this.OperateType = OperateType;
    }

    /**
     * Get 知识库id，update和delete时必填 
     * @return KnowledgeBaseId 知识库id，update和delete时必填
     */
    public String getKnowledgeBaseId() {
        return this.KnowledgeBaseId;
    }

    /**
     * Set 知识库id，update和delete时必填
     * @param KnowledgeBaseId 知识库id，update和delete时必填
     */
    public void setKnowledgeBaseId(String KnowledgeBaseId) {
        this.KnowledgeBaseId = KnowledgeBaseId;
    }

    /**
     * Get 知识库名称，create和update时必填。只允许字母、数字、汉字、下划线 
     * @return KnowledgeBaseName 知识库名称，create和update时必填。只允许字母、数字、汉字、下划线
     */
    public String getKnowledgeBaseName() {
        return this.KnowledgeBaseName;
    }

    /**
     * Set 知识库名称，create和update时必填。只允许字母、数字、汉字、下划线
     * @param KnowledgeBaseName 知识库名称，create和update时必填。只允许字母、数字、汉字、下划线
     */
    public void setKnowledgeBaseName(String KnowledgeBaseName) {
        this.KnowledgeBaseName = KnowledgeBaseName;
    }

    /**
     * Get 知识库描述，create和update时必填 
     * @return KnowledgeBaseDesc 知识库描述，create和update时必填
     */
    public String getKnowledgeBaseDesc() {
        return this.KnowledgeBaseDesc;
    }

    /**
     * Set 知识库描述，create和update时必填
     * @param KnowledgeBaseDesc 知识库描述，create和update时必填
     */
    public void setKnowledgeBaseDesc(String KnowledgeBaseDesc) {
        this.KnowledgeBaseDesc = KnowledgeBaseDesc;
    }

    /**
     * Get 1仅自己使用，2指定用户，0全员 
     * @return UseScope 1仅自己使用，2指定用户，0全员
     */
    public Long getUseScope() {
        return this.UseScope;
    }

    /**
     * Set 1仅自己使用，2指定用户，0全员
     * @param UseScope 1仅自己使用，2指定用户，0全员
     */
    public void setUseScope(Long UseScope) {
        this.UseScope = UseScope;
    }

    /**
     * Get 可使用用户列表 
     * @return AuthorityUins 可使用用户列表
     */
    public String [] getAuthorityUins() {
        return this.AuthorityUins;
    }

    /**
     * Set 可使用用户列表
     * @param AuthorityUins 可使用用户列表
     */
    public void setAuthorityUins(String [] AuthorityUins) {
        this.AuthorityUins = AuthorityUins;
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

    }
}

