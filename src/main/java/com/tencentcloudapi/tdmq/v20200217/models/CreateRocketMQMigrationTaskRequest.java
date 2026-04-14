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

public class CreateRocketMQMigrationTaskRequest extends AbstractModel {

    /**
    * <p>集群ID</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>任务类型：<br>0，集群迁移<br>1，导入到指定命名空间</p>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>待导入的主题列表</p>
    */
    @SerializedName("Topics")
    @Expose
    private RocketMQTopicConfig [] Topics;

    /**
    * <p>待导入的消费组列表</p>
    */
    @SerializedName("Groups")
    @Expose
    private RocketMQGroupConfig [] Groups;

    /**
    * <p>待导入的角色列表</p>
    */
    @SerializedName("Roles")
    @Expose
    private RocketMQRoleConfig [] Roles;

    /**
    * <p>指定导入的命名空间</p>
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
     * Get <p>集群ID</p> 
     * @return ClusterId <p>集群ID</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群ID</p>
     * @param ClusterId <p>集群ID</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>任务类型：<br>0，集群迁移<br>1，导入到指定命名空间</p> 
     * @return Type <p>任务类型：<br>0，集群迁移<br>1，导入到指定命名空间</p>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>任务类型：<br>0，集群迁移<br>1，导入到指定命名空间</p>
     * @param Type <p>任务类型：<br>0，集群迁移<br>1，导入到指定命名空间</p>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>待导入的主题列表</p> 
     * @return Topics <p>待导入的主题列表</p>
     */
    public RocketMQTopicConfig [] getTopics() {
        return this.Topics;
    }

    /**
     * Set <p>待导入的主题列表</p>
     * @param Topics <p>待导入的主题列表</p>
     */
    public void setTopics(RocketMQTopicConfig [] Topics) {
        this.Topics = Topics;
    }

    /**
     * Get <p>待导入的消费组列表</p> 
     * @return Groups <p>待导入的消费组列表</p>
     */
    public RocketMQGroupConfig [] getGroups() {
        return this.Groups;
    }

    /**
     * Set <p>待导入的消费组列表</p>
     * @param Groups <p>待导入的消费组列表</p>
     */
    public void setGroups(RocketMQGroupConfig [] Groups) {
        this.Groups = Groups;
    }

    /**
     * Get <p>待导入的角色列表</p> 
     * @return Roles <p>待导入的角色列表</p>
     */
    public RocketMQRoleConfig [] getRoles() {
        return this.Roles;
    }

    /**
     * Set <p>待导入的角色列表</p>
     * @param Roles <p>待导入的角色列表</p>
     */
    public void setRoles(RocketMQRoleConfig [] Roles) {
        this.Roles = Roles;
    }

    /**
     * Get <p>指定导入的命名空间</p> 
     * @return Namespace <p>指定导入的命名空间</p>
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set <p>指定导入的命名空间</p>
     * @param Namespace <p>指定导入的命名空间</p>
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    public CreateRocketMQMigrationTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRocketMQMigrationTaskRequest(CreateRocketMQMigrationTaskRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Topics != null) {
            this.Topics = new RocketMQTopicConfig[source.Topics.length];
            for (int i = 0; i < source.Topics.length; i++) {
                this.Topics[i] = new RocketMQTopicConfig(source.Topics[i]);
            }
        }
        if (source.Groups != null) {
            this.Groups = new RocketMQGroupConfig[source.Groups.length];
            for (int i = 0; i < source.Groups.length; i++) {
                this.Groups[i] = new RocketMQGroupConfig(source.Groups[i]);
            }
        }
        if (source.Roles != null) {
            this.Roles = new RocketMQRoleConfig[source.Roles.length];
            for (int i = 0; i < source.Roles.length; i++) {
                this.Roles[i] = new RocketMQRoleConfig(source.Roles[i]);
            }
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "Topics.", this.Topics);
        this.setParamArrayObj(map, prefix + "Groups.", this.Groups);
        this.setParamArrayObj(map, prefix + "Roles.", this.Roles);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);

    }
}

