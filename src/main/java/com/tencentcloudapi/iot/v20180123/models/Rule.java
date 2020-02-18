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
package com.tencentcloudapi.iot.v20180123.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Rule extends AbstractModel{

    /**
    * 规则Id
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * AppId
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 查询
    */
    @SerializedName("Query")
    @Expose
    private RuleQuery Query;

    /**
    * 转发
    */
    @SerializedName("Actions")
    @Expose
    private Action [] Actions;

    /**
    * 已启动
    */
    @SerializedName("Active")
    @Expose
    private Long Active;

    /**
    * 已删除
    */
    @SerializedName("Deleted")
    @Expose
    private Long Deleted;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 消息顺序
    */
    @SerializedName("MsgOrder")
    @Expose
    private Long MsgOrder;

    /**
    * 数据类型（0：文本，1：二进制）
    */
    @SerializedName("DataType")
    @Expose
    private Long DataType;

    /**
     * Get 规则Id 
     * @return RuleId 规则Id
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则Id
     * @param RuleId 规则Id
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get AppId 
     * @return AppId AppId
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set AppId
     * @param AppId AppId
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 名称 
     * @return Name 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
     * @param Name 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 描述 
     * @return Description 描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
     * @param Description 描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 查询 
     * @return Query 查询
     */
    public RuleQuery getQuery() {
        return this.Query;
    }

    /**
     * Set 查询
     * @param Query 查询
     */
    public void setQuery(RuleQuery Query) {
        this.Query = Query;
    }

    /**
     * Get 转发 
     * @return Actions 转发
     */
    public Action [] getActions() {
        return this.Actions;
    }

    /**
     * Set 转发
     * @param Actions 转发
     */
    public void setActions(Action [] Actions) {
        this.Actions = Actions;
    }

    /**
     * Get 已启动 
     * @return Active 已启动
     */
    public Long getActive() {
        return this.Active;
    }

    /**
     * Set 已启动
     * @param Active 已启动
     */
    public void setActive(Long Active) {
        this.Active = Active;
    }

    /**
     * Get 已删除 
     * @return Deleted 已删除
     */
    public Long getDeleted() {
        return this.Deleted;
    }

    /**
     * Set 已删除
     * @param Deleted 已删除
     */
    public void setDeleted(Long Deleted) {
        this.Deleted = Deleted;
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
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 消息顺序 
     * @return MsgOrder 消息顺序
     */
    public Long getMsgOrder() {
        return this.MsgOrder;
    }

    /**
     * Set 消息顺序
     * @param MsgOrder 消息顺序
     */
    public void setMsgOrder(Long MsgOrder) {
        this.MsgOrder = MsgOrder;
    }

    /**
     * Get 数据类型（0：文本，1：二进制） 
     * @return DataType 数据类型（0：文本，1：二进制）
     */
    public Long getDataType() {
        return this.DataType;
    }

    /**
     * Set 数据类型（0：文本，1：二进制）
     * @param DataType 数据类型（0：文本，1：二进制）
     */
    public void setDataType(Long DataType) {
        this.DataType = DataType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamObj(map, prefix + "Query.", this.Query);
        this.setParamArrayObj(map, prefix + "Actions.", this.Actions);
        this.setParamSimple(map, prefix + "Active", this.Active);
        this.setParamSimple(map, prefix + "Deleted", this.Deleted);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "MsgOrder", this.MsgOrder);
        this.setParamSimple(map, prefix + "DataType", this.DataType);

    }
}

