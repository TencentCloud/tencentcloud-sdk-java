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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ActionDetail extends AbstractModel {

    /**
    * 动作id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 动作名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 动作类型
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
    * 动作说明
    */
    @SerializedName("ActionDesc")
    @Expose
    private String ActionDesc;

    /**
    * 消息类型，orgin/custom/model
    */
    @SerializedName("MsgType")
    @Expose
    private String MsgType;

    /**
    * 消息内容,有效值为x-json:后的字段
    */
    @SerializedName("MsgContent")
    @Expose
    private String MsgContent;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 设备唯一标识
    */
    @SerializedName("WID")
    @Expose
    private String WID;

    /**
    * 关联故障列表
    */
    @SerializedName("LinkRuleSet")
    @Expose
    private LinkRule [] LinkRuleSet;

    /**
    * 动作下沉配置,有效值为x-json:后的字段
    */
    @SerializedName("SinkConfig")
    @Expose
    private String SinkConfig;

    /**
     * Get 动作id 
     * @return Id 动作id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 动作id
     * @param Id 动作id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 动作名称 
     * @return Name 动作名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 动作名称
     * @param Name 动作名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 动作类型 
     * @return ActionType 动作类型
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set 动作类型
     * @param ActionType 动作类型
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get 动作说明 
     * @return ActionDesc 动作说明
     */
    public String getActionDesc() {
        return this.ActionDesc;
    }

    /**
     * Set 动作说明
     * @param ActionDesc 动作说明
     */
    public void setActionDesc(String ActionDesc) {
        this.ActionDesc = ActionDesc;
    }

    /**
     * Get 消息类型，orgin/custom/model 
     * @return MsgType 消息类型，orgin/custom/model
     */
    public String getMsgType() {
        return this.MsgType;
    }

    /**
     * Set 消息类型，orgin/custom/model
     * @param MsgType 消息类型，orgin/custom/model
     */
    public void setMsgType(String MsgType) {
        this.MsgType = MsgType;
    }

    /**
     * Get 消息内容,有效值为x-json:后的字段 
     * @return MsgContent 消息内容,有效值为x-json:后的字段
     */
    public String getMsgContent() {
        return this.MsgContent;
    }

    /**
     * Set 消息内容,有效值为x-json:后的字段
     * @param MsgContent 消息内容,有效值为x-json:后的字段
     */
    public void setMsgContent(String MsgContent) {
        this.MsgContent = MsgContent;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 设备唯一标识 
     * @return WID 设备唯一标识
     */
    public String getWID() {
        return this.WID;
    }

    /**
     * Set 设备唯一标识
     * @param WID 设备唯一标识
     */
    public void setWID(String WID) {
        this.WID = WID;
    }

    /**
     * Get 关联故障列表 
     * @return LinkRuleSet 关联故障列表
     */
    public LinkRule [] getLinkRuleSet() {
        return this.LinkRuleSet;
    }

    /**
     * Set 关联故障列表
     * @param LinkRuleSet 关联故障列表
     */
    public void setLinkRuleSet(LinkRule [] LinkRuleSet) {
        this.LinkRuleSet = LinkRuleSet;
    }

    /**
     * Get 动作下沉配置,有效值为x-json:后的字段 
     * @return SinkConfig 动作下沉配置,有效值为x-json:后的字段
     */
    public String getSinkConfig() {
        return this.SinkConfig;
    }

    /**
     * Set 动作下沉配置,有效值为x-json:后的字段
     * @param SinkConfig 动作下沉配置,有效值为x-json:后的字段
     */
    public void setSinkConfig(String SinkConfig) {
        this.SinkConfig = SinkConfig;
    }

    public ActionDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ActionDetail(ActionDetail source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ActionType != null) {
            this.ActionType = new String(source.ActionType);
        }
        if (source.ActionDesc != null) {
            this.ActionDesc = new String(source.ActionDesc);
        }
        if (source.MsgType != null) {
            this.MsgType = new String(source.MsgType);
        }
        if (source.MsgContent != null) {
            this.MsgContent = new String(source.MsgContent);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.WID != null) {
            this.WID = new String(source.WID);
        }
        if (source.LinkRuleSet != null) {
            this.LinkRuleSet = new LinkRule[source.LinkRuleSet.length];
            for (int i = 0; i < source.LinkRuleSet.length; i++) {
                this.LinkRuleSet[i] = new LinkRule(source.LinkRuleSet[i]);
            }
        }
        if (source.SinkConfig != null) {
            this.SinkConfig = new String(source.SinkConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "ActionDesc", this.ActionDesc);
        this.setParamSimple(map, prefix + "MsgType", this.MsgType);
        this.setParamSimple(map, prefix + "MsgContent", this.MsgContent);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "WID", this.WID);
        this.setParamArrayObj(map, prefix + "LinkRuleSet.", this.LinkRuleSet);
        this.setParamSimple(map, prefix + "SinkConfig", this.SinkConfig);

    }
}

