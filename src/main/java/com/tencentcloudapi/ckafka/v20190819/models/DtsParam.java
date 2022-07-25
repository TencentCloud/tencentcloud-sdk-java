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

public class DtsParam extends AbstractModel{

    /**
    * Dts实例Id
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * Dts的连接ip
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * Dts的连接port
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Dts订阅的topic
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * Dts消费分组的Id
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Dts消费分组的账号
    */
    @SerializedName("GroupUser")
    @Expose
    private String GroupUser;

    /**
    * Dts消费分组的密码
    */
    @SerializedName("GroupPassword")
    @Expose
    private String GroupPassword;

    /**
    * false同步原始数据，true同步解析后的json格式数据,默认true
    */
    @SerializedName("TranSql")
    @Expose
    private Boolean TranSql;

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
     * Get Dts的连接ip 
     * @return Ip Dts的连接ip
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set Dts的连接ip
     * @param Ip Dts的连接ip
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

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
     * @return GroupUser Dts消费分组的账号
     */
    public String getGroupUser() {
        return this.GroupUser;
    }

    /**
     * Set Dts消费分组的账号
     * @param GroupUser Dts消费分组的账号
     */
    public void setGroupUser(String GroupUser) {
        this.GroupUser = GroupUser;
    }

    /**
     * Get Dts消费分组的密码 
     * @return GroupPassword Dts消费分组的密码
     */
    public String getGroupPassword() {
        return this.GroupPassword;
    }

    /**
     * Set Dts消费分组的密码
     * @param GroupPassword Dts消费分组的密码
     */
    public void setGroupPassword(String GroupPassword) {
        this.GroupPassword = GroupPassword;
    }

    /**
     * Get false同步原始数据，true同步解析后的json格式数据,默认true 
     * @return TranSql false同步原始数据，true同步解析后的json格式数据,默认true
     */
    public Boolean getTranSql() {
        return this.TranSql;
    }

    /**
     * Set false同步原始数据，true同步解析后的json格式数据,默认true
     * @param TranSql false同步原始数据，true同步解析后的json格式数据,默认true
     */
    public void setTranSql(Boolean TranSql) {
        this.TranSql = TranSql;
    }

    public DtsParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DtsParam(DtsParam source) {
        if (source.Resource != null) {
            this.Resource = new String(source.Resource);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupUser != null) {
            this.GroupUser = new String(source.GroupUser);
        }
        if (source.GroupPassword != null) {
            this.GroupPassword = new String(source.GroupPassword);
        }
        if (source.TranSql != null) {
            this.TranSql = new Boolean(source.TranSql);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Resource", this.Resource);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupUser", this.GroupUser);
        this.setParamSimple(map, prefix + "GroupPassword", this.GroupPassword);
        this.setParamSimple(map, prefix + "TranSql", this.TranSql);

    }
}

