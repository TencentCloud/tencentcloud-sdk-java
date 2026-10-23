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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class APIsUserKeyInfo extends AbstractModel {

    /**
    * <p>用户创建的集成的名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>用户对创建的集成的描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>集成ID，用户创建的集成的标识id，前半部分用户填写，后半部分平台按照一定规则生成</p>
    */
    @SerializedName("KeyID")
    @Expose
    private String KeyID;

    /**
    * <p>额外信息,根据集成类型不同，ext会有不同的子结构</p>
    */
    @SerializedName("Ext")
    @Expose
    private String Ext;

    /**
    * <p>集成类型Code</p>
    */
    @SerializedName("AuthTypeCode")
    @Expose
    private String AuthTypeCode;

    /**
    * <p>状态</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>引用该集成的服务列表</p>
    */
    @SerializedName("BindServiceList")
    @Expose
    private BindServiceList BindServiceList;

    /**
    * <p>AuthTypeName 和AuthType 分别1-1对应</p>
    */
    @SerializedName("AuthTypeName")
    @Expose
    private String AuthTypeName;

    /**
    * <p>github、gitlab、gitee、腾讯会议等oauth类型的，需要传这个ticket_id，创建的密钥对跟auth_ticket_token(对于github、gitlab、gitee)、weda_ticket_token(对于腾讯会议)关联起来</p>
    */
    @SerializedName("TicketID")
    @Expose
    private String TicketID;

    /**
    * <p>用户在创建(weixinmp、wxvirtualpay、weixin-store、channels、weixinpaydc)这五种之一时创建的关联的示例代码云函数的函数名</p>
    */
    @SerializedName("DemoCodeFunctionName")
    @Expose
    private String DemoCodeFunctionName;

    /**
    * <p>创建时间</p><p>参数格式：2026-05-25T11:18:28+08:00</p>
    */
    @SerializedName("CreateAt")
    @Expose
    private String CreateAt;

    /**
    * <p>更新时间</p><p>参数格式：2026-05-25T11:18:28+08:00</p>
    */
    @SerializedName("UpdateAt")
    @Expose
    private String UpdateAt;

    /**
     * Get <p>用户创建的集成的名称</p> 
     * @return Name <p>用户创建的集成的名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>用户创建的集成的名称</p>
     * @param Name <p>用户创建的集成的名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>用户对创建的集成的描述</p> 
     * @return Description <p>用户对创建的集成的描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>用户对创建的集成的描述</p>
     * @param Description <p>用户对创建的集成的描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>集成ID，用户创建的集成的标识id，前半部分用户填写，后半部分平台按照一定规则生成</p> 
     * @return KeyID <p>集成ID，用户创建的集成的标识id，前半部分用户填写，后半部分平台按照一定规则生成</p>
     */
    public String getKeyID() {
        return this.KeyID;
    }

    /**
     * Set <p>集成ID，用户创建的集成的标识id，前半部分用户填写，后半部分平台按照一定规则生成</p>
     * @param KeyID <p>集成ID，用户创建的集成的标识id，前半部分用户填写，后半部分平台按照一定规则生成</p>
     */
    public void setKeyID(String KeyID) {
        this.KeyID = KeyID;
    }

    /**
     * Get <p>额外信息,根据集成类型不同，ext会有不同的子结构</p> 
     * @return Ext <p>额外信息,根据集成类型不同，ext会有不同的子结构</p>
     */
    public String getExt() {
        return this.Ext;
    }

    /**
     * Set <p>额外信息,根据集成类型不同，ext会有不同的子结构</p>
     * @param Ext <p>额外信息,根据集成类型不同，ext会有不同的子结构</p>
     */
    public void setExt(String Ext) {
        this.Ext = Ext;
    }

    /**
     * Get <p>集成类型Code</p> 
     * @return AuthTypeCode <p>集成类型Code</p>
     */
    public String getAuthTypeCode() {
        return this.AuthTypeCode;
    }

    /**
     * Set <p>集成类型Code</p>
     * @param AuthTypeCode <p>集成类型Code</p>
     */
    public void setAuthTypeCode(String AuthTypeCode) {
        this.AuthTypeCode = AuthTypeCode;
    }

    /**
     * Get <p>状态</p> 
     * @return Status <p>状态</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态</p>
     * @param Status <p>状态</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>引用该集成的服务列表</p> 
     * @return BindServiceList <p>引用该集成的服务列表</p>
     */
    public BindServiceList getBindServiceList() {
        return this.BindServiceList;
    }

    /**
     * Set <p>引用该集成的服务列表</p>
     * @param BindServiceList <p>引用该集成的服务列表</p>
     */
    public void setBindServiceList(BindServiceList BindServiceList) {
        this.BindServiceList = BindServiceList;
    }

    /**
     * Get <p>AuthTypeName 和AuthType 分别1-1对应</p> 
     * @return AuthTypeName <p>AuthTypeName 和AuthType 分别1-1对应</p>
     */
    public String getAuthTypeName() {
        return this.AuthTypeName;
    }

    /**
     * Set <p>AuthTypeName 和AuthType 分别1-1对应</p>
     * @param AuthTypeName <p>AuthTypeName 和AuthType 分别1-1对应</p>
     */
    public void setAuthTypeName(String AuthTypeName) {
        this.AuthTypeName = AuthTypeName;
    }

    /**
     * Get <p>github、gitlab、gitee、腾讯会议等oauth类型的，需要传这个ticket_id，创建的密钥对跟auth_ticket_token(对于github、gitlab、gitee)、weda_ticket_token(对于腾讯会议)关联起来</p> 
     * @return TicketID <p>github、gitlab、gitee、腾讯会议等oauth类型的，需要传这个ticket_id，创建的密钥对跟auth_ticket_token(对于github、gitlab、gitee)、weda_ticket_token(对于腾讯会议)关联起来</p>
     */
    public String getTicketID() {
        return this.TicketID;
    }

    /**
     * Set <p>github、gitlab、gitee、腾讯会议等oauth类型的，需要传这个ticket_id，创建的密钥对跟auth_ticket_token(对于github、gitlab、gitee)、weda_ticket_token(对于腾讯会议)关联起来</p>
     * @param TicketID <p>github、gitlab、gitee、腾讯会议等oauth类型的，需要传这个ticket_id，创建的密钥对跟auth_ticket_token(对于github、gitlab、gitee)、weda_ticket_token(对于腾讯会议)关联起来</p>
     */
    public void setTicketID(String TicketID) {
        this.TicketID = TicketID;
    }

    /**
     * Get <p>用户在创建(weixinmp、wxvirtualpay、weixin-store、channels、weixinpaydc)这五种之一时创建的关联的示例代码云函数的函数名</p> 
     * @return DemoCodeFunctionName <p>用户在创建(weixinmp、wxvirtualpay、weixin-store、channels、weixinpaydc)这五种之一时创建的关联的示例代码云函数的函数名</p>
     */
    public String getDemoCodeFunctionName() {
        return this.DemoCodeFunctionName;
    }

    /**
     * Set <p>用户在创建(weixinmp、wxvirtualpay、weixin-store、channels、weixinpaydc)这五种之一时创建的关联的示例代码云函数的函数名</p>
     * @param DemoCodeFunctionName <p>用户在创建(weixinmp、wxvirtualpay、weixin-store、channels、weixinpaydc)这五种之一时创建的关联的示例代码云函数的函数名</p>
     */
    public void setDemoCodeFunctionName(String DemoCodeFunctionName) {
        this.DemoCodeFunctionName = DemoCodeFunctionName;
    }

    /**
     * Get <p>创建时间</p><p>参数格式：2026-05-25T11:18:28+08:00</p> 
     * @return CreateAt <p>创建时间</p><p>参数格式：2026-05-25T11:18:28+08:00</p>
     */
    public String getCreateAt() {
        return this.CreateAt;
    }

    /**
     * Set <p>创建时间</p><p>参数格式：2026-05-25T11:18:28+08:00</p>
     * @param CreateAt <p>创建时间</p><p>参数格式：2026-05-25T11:18:28+08:00</p>
     */
    public void setCreateAt(String CreateAt) {
        this.CreateAt = CreateAt;
    }

    /**
     * Get <p>更新时间</p><p>参数格式：2026-05-25T11:18:28+08:00</p> 
     * @return UpdateAt <p>更新时间</p><p>参数格式：2026-05-25T11:18:28+08:00</p>
     */
    public String getUpdateAt() {
        return this.UpdateAt;
    }

    /**
     * Set <p>更新时间</p><p>参数格式：2026-05-25T11:18:28+08:00</p>
     * @param UpdateAt <p>更新时间</p><p>参数格式：2026-05-25T11:18:28+08:00</p>
     */
    public void setUpdateAt(String UpdateAt) {
        this.UpdateAt = UpdateAt;
    }

    public APIsUserKeyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public APIsUserKeyInfo(APIsUserKeyInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.KeyID != null) {
            this.KeyID = new String(source.KeyID);
        }
        if (source.Ext != null) {
            this.Ext = new String(source.Ext);
        }
        if (source.AuthTypeCode != null) {
            this.AuthTypeCode = new String(source.AuthTypeCode);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.BindServiceList != null) {
            this.BindServiceList = new BindServiceList(source.BindServiceList);
        }
        if (source.AuthTypeName != null) {
            this.AuthTypeName = new String(source.AuthTypeName);
        }
        if (source.TicketID != null) {
            this.TicketID = new String(source.TicketID);
        }
        if (source.DemoCodeFunctionName != null) {
            this.DemoCodeFunctionName = new String(source.DemoCodeFunctionName);
        }
        if (source.CreateAt != null) {
            this.CreateAt = new String(source.CreateAt);
        }
        if (source.UpdateAt != null) {
            this.UpdateAt = new String(source.UpdateAt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "KeyID", this.KeyID);
        this.setParamSimple(map, prefix + "Ext", this.Ext);
        this.setParamSimple(map, prefix + "AuthTypeCode", this.AuthTypeCode);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "BindServiceList.", this.BindServiceList);
        this.setParamSimple(map, prefix + "AuthTypeName", this.AuthTypeName);
        this.setParamSimple(map, prefix + "TicketID", this.TicketID);
        this.setParamSimple(map, prefix + "DemoCodeFunctionName", this.DemoCodeFunctionName);
        this.setParamSimple(map, prefix + "CreateAt", this.CreateAt);
        this.setParamSimple(map, prefix + "UpdateAt", this.UpdateAt);

    }
}

