/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DtsModifyConnectParam extends AbstractModel{

    /**
    * Dts实例Id【不支持修改】
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * Dts的连接port【不支持修改】
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Dts消费分组的Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Dts消费分组的账号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Dts消费分组的密码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 是否更新到关联的Datahub任务，默认为true
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsUpdate")
    @Expose
    private Boolean IsUpdate;

    /**
    * Dts订阅的topic【不支持修改】
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
     * Get Dts实例Id【不支持修改】
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Resource Dts实例Id【不支持修改】
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set Dts实例Id【不支持修改】
注意：此字段可能返回 null，表示取不到有效值。
     * @param Resource Dts实例Id【不支持修改】
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get Dts的连接port【不支持修改】
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Port Dts的连接port【不支持修改】
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Dts的连接port【不支持修改】
注意：此字段可能返回 null，表示取不到有效值。
     * @param Port Dts的连接port【不支持修改】
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Dts消费分组的Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupId Dts消费分组的Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Dts消费分组的Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupId Dts消费分组的Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Dts消费分组的账号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserName Dts消费分组的账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Dts消费分组的账号
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserName Dts消费分组的账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Dts消费分组的密码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Password Dts消费分组的密码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Dts消费分组的密码
注意：此字段可能返回 null，表示取不到有效值。
     * @param Password Dts消费分组的密码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 是否更新到关联的Datahub任务，默认为true
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsUpdate 是否更新到关联的Datahub任务，默认为true
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsUpdate() {
        return this.IsUpdate;
    }

    /**
     * Set 是否更新到关联的Datahub任务，默认为true
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsUpdate 是否更新到关联的Datahub任务，默认为true
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsUpdate(Boolean IsUpdate) {
        this.IsUpdate = IsUpdate;
    }

    /**
     * Get Dts订阅的topic【不支持修改】
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Topic Dts订阅的topic【不支持修改】
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set Dts订阅的topic【不支持修改】
注意：此字段可能返回 null，表示取不到有效值。
     * @param Topic Dts订阅的topic【不支持修改】
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    public DtsModifyConnectParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DtsModifyConnectParam(DtsModifyConnectParam source) {
        if (source.Resource != null) {
            this.Resource = new String(source.Resource);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.IsUpdate != null) {
            this.IsUpdate = new Boolean(source.IsUpdate);
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Resource", this.Resource);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "IsUpdate", this.IsUpdate);
        this.setParamSimple(map, prefix + "Topic", this.Topic);

    }
}

