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
package com.tencentcloudapi.cat.v20180409.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlarmGroupInfo extends AbstractModel{

    /**
    * 告警接受组Id
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * 告警接受组名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 告警接受通道数(一个邮件或短信接收人为一个通道)
    */
    @SerializedName("Channel")
    @Expose
    private Long Channel;

    /**
    * 备注信息
    */
    @SerializedName("Remarks")
    @Expose
    private String Remarks;

    /**
    * 接受组创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get 告警接受组Id 
     * @return GroupId 告警接受组Id
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 告警接受组Id
     * @param GroupId 告警接受组Id
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 告警接受组名称 
     * @return GroupName 告警接受组名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 告警接受组名称
     * @param GroupName 告警接受组名称
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 告警接受通道数(一个邮件或短信接收人为一个通道) 
     * @return Channel 告警接受通道数(一个邮件或短信接收人为一个通道)
     */
    public Long getChannel() {
        return this.Channel;
    }

    /**
     * Set 告警接受通道数(一个邮件或短信接收人为一个通道)
     * @param Channel 告警接受通道数(一个邮件或短信接收人为一个通道)
     */
    public void setChannel(Long Channel) {
        this.Channel = Channel;
    }

    /**
     * Get 备注信息 
     * @return Remarks 备注信息
     */
    public String getRemarks() {
        return this.Remarks;
    }

    /**
     * Set 备注信息
     * @param Remarks 备注信息
     */
    public void setRemarks(String Remarks) {
        this.Remarks = Remarks;
    }

    /**
     * Get 接受组创建时间 
     * @return CreateTime 接受组创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 接受组创建时间
     * @param CreateTime 接受组创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "Channel", this.Channel);
        this.setParamSimple(map, prefix + "Remarks", this.Remarks);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

