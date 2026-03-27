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

public class CreateRocketMQRoleRequest extends AbstractModel {

    /**
    * <p>角色名称，不支持中字以及除了短线和下划线外的特殊字符且长度必须大于0且小等于32。</p>
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * <p>必填字段，集群Id</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>备注说明，长度必须大等于0且小等于128。</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>角色授权类型（集群：Cluster; 主题或消费组：TopicAndGroup）</p>
    */
    @SerializedName("PermType")
    @Expose
    private String PermType;

    /**
    * <p>AK、SK的生成方式，AUTO：后端自动生成，MANUAL：用户手动输入</p>
    */
    @SerializedName("RoleGenerateMode")
    @Expose
    private String RoleGenerateMode;

    /**
    * <p>选择MANUAL模式下，需要手动输入AK值</p>
    */
    @SerializedName("AccessKey")
    @Expose
    private String AccessKey;

    /**
    * <p>选择MANUAL模式下，需要手动输入SK值</p>
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
     * Get <p>角色名称，不支持中字以及除了短线和下划线外的特殊字符且长度必须大于0且小等于32。</p> 
     * @return RoleName <p>角色名称，不支持中字以及除了短线和下划线外的特殊字符且长度必须大于0且小等于32。</p>
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set <p>角色名称，不支持中字以及除了短线和下划线外的特殊字符且长度必须大于0且小等于32。</p>
     * @param RoleName <p>角色名称，不支持中字以及除了短线和下划线外的特殊字符且长度必须大于0且小等于32。</p>
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get <p>必填字段，集群Id</p> 
     * @return ClusterId <p>必填字段，集群Id</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>必填字段，集群Id</p>
     * @param ClusterId <p>必填字段，集群Id</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>备注说明，长度必须大等于0且小等于128。</p> 
     * @return Remark <p>备注说明，长度必须大等于0且小等于128。</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>备注说明，长度必须大等于0且小等于128。</p>
     * @param Remark <p>备注说明，长度必须大等于0且小等于128。</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>角色授权类型（集群：Cluster; 主题或消费组：TopicAndGroup）</p> 
     * @return PermType <p>角色授权类型（集群：Cluster; 主题或消费组：TopicAndGroup）</p>
     */
    public String getPermType() {
        return this.PermType;
    }

    /**
     * Set <p>角色授权类型（集群：Cluster; 主题或消费组：TopicAndGroup）</p>
     * @param PermType <p>角色授权类型（集群：Cluster; 主题或消费组：TopicAndGroup）</p>
     */
    public void setPermType(String PermType) {
        this.PermType = PermType;
    }

    /**
     * Get <p>AK、SK的生成方式，AUTO：后端自动生成，MANUAL：用户手动输入</p> 
     * @return RoleGenerateMode <p>AK、SK的生成方式，AUTO：后端自动生成，MANUAL：用户手动输入</p>
     */
    public String getRoleGenerateMode() {
        return this.RoleGenerateMode;
    }

    /**
     * Set <p>AK、SK的生成方式，AUTO：后端自动生成，MANUAL：用户手动输入</p>
     * @param RoleGenerateMode <p>AK、SK的生成方式，AUTO：后端自动生成，MANUAL：用户手动输入</p>
     */
    public void setRoleGenerateMode(String RoleGenerateMode) {
        this.RoleGenerateMode = RoleGenerateMode;
    }

    /**
     * Get <p>选择MANUAL模式下，需要手动输入AK值</p> 
     * @return AccessKey <p>选择MANUAL模式下，需要手动输入AK值</p>
     */
    public String getAccessKey() {
        return this.AccessKey;
    }

    /**
     * Set <p>选择MANUAL模式下，需要手动输入AK值</p>
     * @param AccessKey <p>选择MANUAL模式下，需要手动输入AK值</p>
     */
    public void setAccessKey(String AccessKey) {
        this.AccessKey = AccessKey;
    }

    /**
     * Get <p>选择MANUAL模式下，需要手动输入SK值</p> 
     * @return SecretKey <p>选择MANUAL模式下，需要手动输入SK值</p>
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set <p>选择MANUAL模式下，需要手动输入SK值</p>
     * @param SecretKey <p>选择MANUAL模式下，需要手动输入SK值</p>
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    public CreateRocketMQRoleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRocketMQRoleRequest(CreateRocketMQRoleRequest source) {
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.PermType != null) {
            this.PermType = new String(source.PermType);
        }
        if (source.RoleGenerateMode != null) {
            this.RoleGenerateMode = new String(source.RoleGenerateMode);
        }
        if (source.AccessKey != null) {
            this.AccessKey = new String(source.AccessKey);
        }
        if (source.SecretKey != null) {
            this.SecretKey = new String(source.SecretKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "PermType", this.PermType);
        this.setParamSimple(map, prefix + "RoleGenerateMode", this.RoleGenerateMode);
        this.setParamSimple(map, prefix + "AccessKey", this.AccessKey);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);

    }
}

