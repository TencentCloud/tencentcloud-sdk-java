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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceCLSDeliveryInfo extends AbstractModel {

    /**
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例name

    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 日志主题id

    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 日志主题name
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 日志集id

    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 日志集name

    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 日志投递地域

    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 投递状态creating,running,offlining,offlined

    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 日志类型
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

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
     * Get 实例name
 
     * @return InstanceName 实例name

     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例name

     * @param InstanceName 实例name

     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 日志主题id
 
     * @return TopicId 日志主题id

     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 日志主题id

     * @param TopicId 日志主题id

     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 日志主题name 
     * @return TopicName 日志主题name
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 日志主题name
     * @param TopicName 日志主题name
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get 日志集id
 
     * @return GroupId 日志集id

     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 日志集id

     * @param GroupId 日志集id

     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 日志集name
 
     * @return GroupName 日志集name

     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 日志集name

     * @param GroupName 日志集name

     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 日志投递地域
 
     * @return Region 日志投递地域

     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 日志投递地域

     * @param Region 日志投递地域

     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 投递状态creating,running,offlining,offlined
 
     * @return Status 投递状态creating,running,offlining,offlined

     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 投递状态creating,running,offlining,offlined

     * @param Status 投递状态creating,running,offlining,offlined

     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 日志类型 
     * @return LogType 日志类型
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set 日志类型
     * @param LogType 日志类型
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    public InstanceCLSDeliveryInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceCLSDeliveryInfo(InstanceCLSDeliveryInfo source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "LogType", this.LogType);

    }
}

