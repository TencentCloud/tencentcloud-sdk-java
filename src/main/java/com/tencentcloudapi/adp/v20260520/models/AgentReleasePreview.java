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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AgentReleasePreview extends AbstractModel {

    /**
    * <p>AgentID</p>
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * <p>Agent名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>更新时间, unix 秒时间戳 (s)</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>状态, 状态值：1:新增, 2:修改, 3:删除</p>
    */
    @SerializedName("Action")
    @Expose
    private Long Action;

    /**
    * <p>动作描述</p>
    */
    @SerializedName("ActionDescription")
    @Expose
    private String ActionDescription;

    /**
    * <p>发布消息</p>
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * <p>发布详情</p>
    */
    @SerializedName("ReleaseList")
    @Expose
    private AgentRelease [] ReleaseList;

    /**
     * Get <p>AgentID</p> 
     * @return AgentId <p>AgentID</p>
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set <p>AgentID</p>
     * @param AgentId <p>AgentID</p>
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    /**
     * Get <p>Agent名称</p> 
     * @return Name <p>Agent名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Agent名称</p>
     * @param Name <p>Agent名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>更新时间, unix 秒时间戳 (s)</p> 
     * @return UpdateTime <p>更新时间, unix 秒时间戳 (s)</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间, unix 秒时间戳 (s)</p>
     * @param UpdateTime <p>更新时间, unix 秒时间戳 (s)</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>状态, 状态值：1:新增, 2:修改, 3:删除</p> 
     * @return Action <p>状态, 状态值：1:新增, 2:修改, 3:删除</p>
     */
    public Long getAction() {
        return this.Action;
    }

    /**
     * Set <p>状态, 状态值：1:新增, 2:修改, 3:删除</p>
     * @param Action <p>状态, 状态值：1:新增, 2:修改, 3:删除</p>
     */
    public void setAction(Long Action) {
        this.Action = Action;
    }

    /**
     * Get <p>动作描述</p> 
     * @return ActionDescription <p>动作描述</p>
     */
    public String getActionDescription() {
        return this.ActionDescription;
    }

    /**
     * Set <p>动作描述</p>
     * @param ActionDescription <p>动作描述</p>
     */
    public void setActionDescription(String ActionDescription) {
        this.ActionDescription = ActionDescription;
    }

    /**
     * Get <p>发布消息</p> 
     * @return Message <p>发布消息</p>
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set <p>发布消息</p>
     * @param Message <p>发布消息</p>
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get <p>发布详情</p> 
     * @return ReleaseList <p>发布详情</p>
     */
    public AgentRelease [] getReleaseList() {
        return this.ReleaseList;
    }

    /**
     * Set <p>发布详情</p>
     * @param ReleaseList <p>发布详情</p>
     */
    public void setReleaseList(AgentRelease [] ReleaseList) {
        this.ReleaseList = ReleaseList;
    }

    public AgentReleasePreview() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentReleasePreview(AgentReleasePreview source) {
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Action != null) {
            this.Action = new Long(source.Action);
        }
        if (source.ActionDescription != null) {
            this.ActionDescription = new String(source.ActionDescription);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.ReleaseList != null) {
            this.ReleaseList = new AgentRelease[source.ReleaseList.length];
            for (int i = 0; i < source.ReleaseList.length; i++) {
                this.ReleaseList[i] = new AgentRelease(source.ReleaseList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "ActionDescription", this.ActionDescription);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamArrayObj(map, prefix + "ReleaseList.", this.ReleaseList);

    }
}

