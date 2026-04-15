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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Role extends AbstractModel {

    /**
    * <p>角色名称。</p>
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * <p>角色token值。</p>
    */
    @SerializedName("Token")
    @Expose
    private String Token;

    /**
    * <p>备注说明。</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>创建时间。</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>更新时间。</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>授权类型（Cluster：集群；TopicAndGroup：主题或消费组）</p>
    */
    @SerializedName("PermType")
    @Expose
    private String PermType;

    /**
    * <p>角色类型</p><p>枚举值：</p><ul><li>Temporary： 轮转密钥</li><li>Permanent： 永久密钥</li></ul>
    */
    @SerializedName("TokenType")
    @Expose
    private String TokenType;

    /**
    * <p>SSM 唯一 ID</p>
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
    * <p>轮转周期</p><p>单位：天</p>
    */
    @SerializedName("RotateFreq")
    @Expose
    private Long RotateFreq;

    /**
     * Get <p>角色名称。</p> 
     * @return RoleName <p>角色名称。</p>
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set <p>角色名称。</p>
     * @param RoleName <p>角色名称。</p>
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get <p>角色token值。</p> 
     * @return Token <p>角色token值。</p>
     */
    public String getToken() {
        return this.Token;
    }

    /**
     * Set <p>角色token值。</p>
     * @param Token <p>角色token值。</p>
     */
    public void setToken(String Token) {
        this.Token = Token;
    }

    /**
     * Get <p>备注说明。</p> 
     * @return Remark <p>备注说明。</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>备注说明。</p>
     * @param Remark <p>备注说明。</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>创建时间。</p> 
     * @return CreateTime <p>创建时间。</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间。</p>
     * @param CreateTime <p>创建时间。</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间。</p> 
     * @return UpdateTime <p>更新时间。</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间。</p>
     * @param UpdateTime <p>更新时间。</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>授权类型（Cluster：集群；TopicAndGroup：主题或消费组）</p> 
     * @return PermType <p>授权类型（Cluster：集群；TopicAndGroup：主题或消费组）</p>
     */
    public String getPermType() {
        return this.PermType;
    }

    /**
     * Set <p>授权类型（Cluster：集群；TopicAndGroup：主题或消费组）</p>
     * @param PermType <p>授权类型（Cluster：集群；TopicAndGroup：主题或消费组）</p>
     */
    public void setPermType(String PermType) {
        this.PermType = PermType;
    }

    /**
     * Get <p>角色类型</p><p>枚举值：</p><ul><li>Temporary： 轮转密钥</li><li>Permanent： 永久密钥</li></ul> 
     * @return TokenType <p>角色类型</p><p>枚举值：</p><ul><li>Temporary： 轮转密钥</li><li>Permanent： 永久密钥</li></ul>
     */
    public String getTokenType() {
        return this.TokenType;
    }

    /**
     * Set <p>角色类型</p><p>枚举值：</p><ul><li>Temporary： 轮转密钥</li><li>Permanent： 永久密钥</li></ul>
     * @param TokenType <p>角色类型</p><p>枚举值：</p><ul><li>Temporary： 轮转密钥</li><li>Permanent： 永久密钥</li></ul>
     */
    public void setTokenType(String TokenType) {
        this.TokenType = TokenType;
    }

    /**
     * Get <p>SSM 唯一 ID</p> 
     * @return SecretName <p>SSM 唯一 ID</p>
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set <p>SSM 唯一 ID</p>
     * @param SecretName <p>SSM 唯一 ID</p>
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    /**
     * Get <p>轮转周期</p><p>单位：天</p> 
     * @return RotateFreq <p>轮转周期</p><p>单位：天</p>
     */
    public Long getRotateFreq() {
        return this.RotateFreq;
    }

    /**
     * Set <p>轮转周期</p><p>单位：天</p>
     * @param RotateFreq <p>轮转周期</p><p>单位：天</p>
     */
    public void setRotateFreq(Long RotateFreq) {
        this.RotateFreq = RotateFreq;
    }

    public Role() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Role(Role source) {
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
        if (source.Token != null) {
            this.Token = new String(source.Token);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.PermType != null) {
            this.PermType = new String(source.PermType);
        }
        if (source.TokenType != null) {
            this.TokenType = new String(source.TokenType);
        }
        if (source.SecretName != null) {
            this.SecretName = new String(source.SecretName);
        }
        if (source.RotateFreq != null) {
            this.RotateFreq = new Long(source.RotateFreq);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamSimple(map, prefix + "Token", this.Token);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "PermType", this.PermType);
        this.setParamSimple(map, prefix + "TokenType", this.TokenType);
        this.setParamSimple(map, prefix + "SecretName", this.SecretName);
        this.setParamSimple(map, prefix + "RotateFreq", this.RotateFreq);

    }
}

