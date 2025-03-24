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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DtsConnectParam extends AbstractModel {

    /**
    * Dts的连接port
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Dts消费分组的Id
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Dts消费分组的账号
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Dts消费分组的密码
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * Dts实例Id
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * Dts订阅的topic
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * 是否更新到关联的Datahub任务
    */
    @SerializedName("IsUpdate")
    @Expose
    private Boolean IsUpdate;

    /**
     * Get Dts的连接port 
     * @return Port Dts的连接port
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Dts的连接port
     * @param Port Dts的连接port
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Dts消费分组的Id 
     * @return GroupId Dts消费分组的Id
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Dts消费分组的Id
     * @param GroupId Dts消费分组的Id
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Dts消费分组的账号 
     * @return UserName Dts消费分组的账号
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Dts消费分组的账号
     * @param UserName Dts消费分组的账号
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Dts消费分组的密码 
     * @return Password Dts消费分组的密码
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Dts消费分组的密码
     * @param Password Dts消费分组的密码
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get Dts实例Id 
     * @return Resource Dts实例Id
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set Dts实例Id
     * @param Resource Dts实例Id
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get Dts订阅的topic 
     * @return Topic Dts订阅的topic
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set Dts订阅的topic
     * @param Topic Dts订阅的topic
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get 是否更新到关联的Datahub任务 
     * @return IsUpdate 是否更新到关联的Datahub任务
     */
    public Boolean getIsUpdate() {
        return this.IsUpdate;
    }

    /**
     * Set 是否更新到关联的Datahub任务
     * @param IsUpdate 是否更新到关联的Datahub任务
     */
    public void setIsUpdate(Boolean IsUpdate) {
        this.IsUpdate = IsUpdate;
    }

    public DtsConnectParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DtsConnectParam(DtsConnectParam source) {
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
        if (source.Resource != null) {
            this.Resource = new String(source.Resource);
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.IsUpdate != null) {
            this.IsUpdate = new Boolean(source.IsUpdate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "Resource", this.Resource);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "IsUpdate", this.IsUpdate);

    }
}

