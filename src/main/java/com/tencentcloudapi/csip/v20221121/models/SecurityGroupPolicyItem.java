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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityGroupPolicyItem extends AbstractModel {

    /**
    * <p>端口</p>
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * <p>策略</p>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * <p>协议</p>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>访问源</p>
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * <p>描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>优先级</p><p>单位：1</p>
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
     * Get <p>端口</p> 
     * @return Port <p>端口</p>
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set <p>端口</p>
     * @param Port <p>端口</p>
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get <p>策略</p> 
     * @return Action <p>策略</p>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set <p>策略</p>
     * @param Action <p>策略</p>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get <p>协议</p> 
     * @return Protocol <p>协议</p>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>协议</p>
     * @param Protocol <p>协议</p>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>访问源</p> 
     * @return CidrBlock <p>访问源</p>
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set <p>访问源</p>
     * @param CidrBlock <p>访问源</p>
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * Get <p>描述</p> 
     * @return Description <p>描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述</p>
     * @param Description <p>描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>优先级</p><p>单位：1</p> 
     * @return Priority <p>优先级</p><p>单位：1</p>
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set <p>优先级</p><p>单位：1</p>
     * @param Priority <p>优先级</p><p>单位：1</p>
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    public SecurityGroupPolicyItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityGroupPolicyItem(SecurityGroupPolicyItem source) {
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.CidrBlock != null) {
            this.CidrBlock = new String(source.CidrBlock);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "CidrBlock", this.CidrBlock);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Priority", this.Priority);

    }
}

