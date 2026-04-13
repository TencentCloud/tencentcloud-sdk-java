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

public class CreateMigrationTaskRequest extends AbstractModel {

    /**
    * 腾讯云 RocketMQ 实例 ID，从 [DescribeFusionInstanceList](https://cloud.tencent.com/document/api/1493/106745) 接口或控制台获得。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 0 - 未指定（存量）
1 - 元数据导入
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 待导入的消费组列表
    */
    @SerializedName("Topics")
    @Expose
    private TopicItem [] Topics;

    /**
    * 待导入的消费组列表
    */
    @SerializedName("Groups")
    @Expose
    private ConsumeGroupItem [] Groups;

    /**
    * 待导入的角色列表
    */
    @SerializedName("Roles")
    @Expose
    private RoleItem [] Roles;

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
     * Get 0 - 未指定（存量）
1 - 元数据导入 
     * @return Type 0 - 未指定（存量）
1 - 元数据导入
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 0 - 未指定（存量）
1 - 元数据导入
     * @param Type 0 - 未指定（存量）
1 - 元数据导入
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 待导入的消费组列表 
     * @return Topics 待导入的消费组列表
     */
    public TopicItem [] getTopics() {
        return this.Topics;
    }

    /**
     * Set 待导入的消费组列表
     * @param Topics 待导入的消费组列表
     */
    public void setTopics(TopicItem [] Topics) {
        this.Topics = Topics;
    }

    /**
     * Get 待导入的消费组列表 
     * @return Groups 待导入的消费组列表
     */
    public ConsumeGroupItem [] getGroups() {
        return this.Groups;
    }

    /**
     * Set 待导入的消费组列表
     * @param Groups 待导入的消费组列表
     */
    public void setGroups(ConsumeGroupItem [] Groups) {
        this.Groups = Groups;
    }

    /**
     * Get 待导入的角色列表 
     * @return Roles 待导入的角色列表
     */
    public RoleItem [] getRoles() {
        return this.Roles;
    }

    /**
     * Set 待导入的角色列表
     * @param Roles 待导入的角色列表
     */
    public void setRoles(RoleItem [] Roles) {
        this.Roles = Roles;
    }

    public CreateMigrationTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateMigrationTaskRequest(CreateMigrationTaskRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Topics != null) {
            this.Topics = new TopicItem[source.Topics.length];
            for (int i = 0; i < source.Topics.length; i++) {
                this.Topics[i] = new TopicItem(source.Topics[i]);
            }
        }
        if (source.Groups != null) {
            this.Groups = new ConsumeGroupItem[source.Groups.length];
            for (int i = 0; i < source.Groups.length; i++) {
                this.Groups[i] = new ConsumeGroupItem(source.Groups[i]);
            }
        }
        if (source.Roles != null) {
            this.Roles = new RoleItem[source.Roles.length];
            for (int i = 0; i < source.Roles.length; i++) {
                this.Roles[i] = new RoleItem(source.Roles[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "Topics.", this.Topics);
        this.setParamArrayObj(map, prefix + "Groups.", this.Groups);
        this.setParamArrayObj(map, prefix + "Roles.", this.Roles);

    }
}

