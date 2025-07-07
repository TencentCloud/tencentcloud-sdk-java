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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRoleRequest extends AbstractModel {

    /**
    * 腾讯云 RocketMQ 实例 ID，从 [DescribeFusionInstanceList](https://cloud.tencent.com/document/api/1493/106745) 接口或控制台获得。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 角色名称，不能为空，只支持数字 大小写字母 分隔符("_","-")，不能超过 32 个字符
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * 是否开启生产权限
    */
    @SerializedName("PermWrite")
    @Expose
    private Boolean PermWrite;

    /**
    * 是否开启消费权限
    */
    @SerializedName("PermRead")
    @Expose
    private Boolean PermRead;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 权限类型，默认按集群授权（Cluster：集群级别；TopicAndGroup：主题&消费组级别）
    */
    @SerializedName("PermType")
    @Expose
    private String PermType;

    /**
    * Topic&Group维度权限配置，权限类型为 TopicAndGroup 时必填
    */
    @SerializedName("DetailedPerms")
    @Expose
    private DetailedRolePerm [] DetailedPerms;

    /**
     * Get 腾讯云 RocketMQ 实例 ID，从 [DescribeFusionInstanceList](https://cloud.tencent.com/document/api/1493/106745) 接口或控制台获得。 
     * @return InstanceId 腾讯云 RocketMQ 实例 ID，从 [DescribeFusionInstanceList](https://cloud.tencent.com/document/api/1493/106745) 接口或控制台获得。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 腾讯云 RocketMQ 实例 ID，从 [DescribeFusionInstanceList](https://cloud.tencent.com/document/api/1493/106745) 接口或控制台获得。
     * @param InstanceId 腾讯云 RocketMQ 实例 ID，从 [DescribeFusionInstanceList](https://cloud.tencent.com/document/api/1493/106745) 接口或控制台获得。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 角色名称，不能为空，只支持数字 大小写字母 分隔符("_","-")，不能超过 32 个字符 
     * @return Role 角色名称，不能为空，只支持数字 大小写字母 分隔符("_","-")，不能超过 32 个字符
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set 角色名称，不能为空，只支持数字 大小写字母 分隔符("_","-")，不能超过 32 个字符
     * @param Role 角色名称，不能为空，只支持数字 大小写字母 分隔符("_","-")，不能超过 32 个字符
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get 是否开启生产权限 
     * @return PermWrite 是否开启生产权限
     */
    public Boolean getPermWrite() {
        return this.PermWrite;
    }

    /**
     * Set 是否开启生产权限
     * @param PermWrite 是否开启生产权限
     */
    public void setPermWrite(Boolean PermWrite) {
        this.PermWrite = PermWrite;
    }

    /**
     * Get 是否开启消费权限 
     * @return PermRead 是否开启消费权限
     */
    public Boolean getPermRead() {
        return this.PermRead;
    }

    /**
     * Set 是否开启消费权限
     * @param PermRead 是否开启消费权限
     */
    public void setPermRead(Boolean PermRead) {
        this.PermRead = PermRead;
    }

    /**
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 权限类型，默认按集群授权（Cluster：集群级别；TopicAndGroup：主题&消费组级别） 
     * @return PermType 权限类型，默认按集群授权（Cluster：集群级别；TopicAndGroup：主题&消费组级别）
     */
    public String getPermType() {
        return this.PermType;
    }

    /**
     * Set 权限类型，默认按集群授权（Cluster：集群级别；TopicAndGroup：主题&消费组级别）
     * @param PermType 权限类型，默认按集群授权（Cluster：集群级别；TopicAndGroup：主题&消费组级别）
     */
    public void setPermType(String PermType) {
        this.PermType = PermType;
    }

    /**
     * Get Topic&Group维度权限配置，权限类型为 TopicAndGroup 时必填 
     * @return DetailedPerms Topic&Group维度权限配置，权限类型为 TopicAndGroup 时必填
     */
    public DetailedRolePerm [] getDetailedPerms() {
        return this.DetailedPerms;
    }

    /**
     * Set Topic&Group维度权限配置，权限类型为 TopicAndGroup 时必填
     * @param DetailedPerms Topic&Group维度权限配置，权限类型为 TopicAndGroup 时必填
     */
    public void setDetailedPerms(DetailedRolePerm [] DetailedPerms) {
        this.DetailedPerms = DetailedPerms;
    }

    public CreateRoleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRoleRequest(CreateRoleRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.PermWrite != null) {
            this.PermWrite = new Boolean(source.PermWrite);
        }
        if (source.PermRead != null) {
            this.PermRead = new Boolean(source.PermRead);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.PermType != null) {
            this.PermType = new String(source.PermType);
        }
        if (source.DetailedPerms != null) {
            this.DetailedPerms = new DetailedRolePerm[source.DetailedPerms.length];
            for (int i = 0; i < source.DetailedPerms.length; i++) {
                this.DetailedPerms[i] = new DetailedRolePerm(source.DetailedPerms[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "PermWrite", this.PermWrite);
        this.setParamSimple(map, prefix + "PermRead", this.PermRead);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "PermType", this.PermType);
        this.setParamArrayObj(map, prefix + "DetailedPerms.", this.DetailedPerms);

    }
}

