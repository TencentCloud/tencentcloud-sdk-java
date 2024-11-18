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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TemplateListInfo extends AbstractModel {

    /**
    * 模板ID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 模板名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 描述
    */
    @SerializedName("Detail")
    @Expose
    private String Detail;

    /**
    * IP模板
    */
    @SerializedName("IpString")
    @Expose
    private String IpString;

    /**
    * 插入时间
    */
    @SerializedName("InsertTime")
    @Expose
    private String InsertTime;

    /**
    * 修改时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 模板类型
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 关联规则条数
    */
    @SerializedName("RulesNum")
    @Expose
    private Long RulesNum;

    /**
    * 模板Id
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 协议端口模板，协议类型，4:4层协议，7:7层协议
    */
    @SerializedName("ProtocolType")
    @Expose
    private String ProtocolType;

    /**
    * 模板包含地址数量
    */
    @SerializedName("IPNum")
    @Expose
    private Long IPNum;

    /**
    * IP版本,0,IPv4;1,IPv6
    */
    @SerializedName("IpVersion")
    @Expose
    private Long IpVersion;

    /**
     * Get 模板ID 
     * @return Uuid 模板ID
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 模板ID
     * @param Uuid 模板ID
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 模板名称 
     * @return Name 模板名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 模板名称
     * @param Name 模板名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 描述 
     * @return Detail 描述
     */
    public String getDetail() {
        return this.Detail;
    }

    /**
     * Set 描述
     * @param Detail 描述
     */
    public void setDetail(String Detail) {
        this.Detail = Detail;
    }

    /**
     * Get IP模板 
     * @return IpString IP模板
     */
    public String getIpString() {
        return this.IpString;
    }

    /**
     * Set IP模板
     * @param IpString IP模板
     */
    public void setIpString(String IpString) {
        this.IpString = IpString;
    }

    /**
     * Get 插入时间 
     * @return InsertTime 插入时间
     */
    public String getInsertTime() {
        return this.InsertTime;
    }

    /**
     * Set 插入时间
     * @param InsertTime 插入时间
     */
    public void setInsertTime(String InsertTime) {
        this.InsertTime = InsertTime;
    }

    /**
     * Get 修改时间 
     * @return UpdateTime 修改时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 修改时间
     * @param UpdateTime 修改时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 模板类型 
     * @return Type 模板类型
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 模板类型
     * @param Type 模板类型
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 关联规则条数 
     * @return RulesNum 关联规则条数
     */
    public Long getRulesNum() {
        return this.RulesNum;
    }

    /**
     * Set 关联规则条数
     * @param RulesNum 关联规则条数
     */
    public void setRulesNum(Long RulesNum) {
        this.RulesNum = RulesNum;
    }

    /**
     * Get 模板Id 
     * @return TemplateId 模板Id
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模板Id
     * @param TemplateId 模板Id
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 协议端口模板，协议类型，4:4层协议，7:7层协议 
     * @return ProtocolType 协议端口模板，协议类型，4:4层协议，7:7层协议
     */
    public String getProtocolType() {
        return this.ProtocolType;
    }

    /**
     * Set 协议端口模板，协议类型，4:4层协议，7:7层协议
     * @param ProtocolType 协议端口模板，协议类型，4:4层协议，7:7层协议
     */
    public void setProtocolType(String ProtocolType) {
        this.ProtocolType = ProtocolType;
    }

    /**
     * Get 模板包含地址数量 
     * @return IPNum 模板包含地址数量
     */
    public Long getIPNum() {
        return this.IPNum;
    }

    /**
     * Set 模板包含地址数量
     * @param IPNum 模板包含地址数量
     */
    public void setIPNum(Long IPNum) {
        this.IPNum = IPNum;
    }

    /**
     * Get IP版本,0,IPv4;1,IPv6 
     * @return IpVersion IP版本,0,IPv4;1,IPv6
     */
    public Long getIpVersion() {
        return this.IpVersion;
    }

    /**
     * Set IP版本,0,IPv4;1,IPv6
     * @param IpVersion IP版本,0,IPv4;1,IPv6
     */
    public void setIpVersion(Long IpVersion) {
        this.IpVersion = IpVersion;
    }

    public TemplateListInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TemplateListInfo(TemplateListInfo source) {
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Detail != null) {
            this.Detail = new String(source.Detail);
        }
        if (source.IpString != null) {
            this.IpString = new String(source.IpString);
        }
        if (source.InsertTime != null) {
            this.InsertTime = new String(source.InsertTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.RulesNum != null) {
            this.RulesNum = new Long(source.RulesNum);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.ProtocolType != null) {
            this.ProtocolType = new String(source.ProtocolType);
        }
        if (source.IPNum != null) {
            this.IPNum = new Long(source.IPNum);
        }
        if (source.IpVersion != null) {
            this.IpVersion = new Long(source.IpVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Detail", this.Detail);
        this.setParamSimple(map, prefix + "IpString", this.IpString);
        this.setParamSimple(map, prefix + "InsertTime", this.InsertTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "RulesNum", this.RulesNum);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "ProtocolType", this.ProtocolType);
        this.setParamSimple(map, prefix + "IPNum", this.IPNum);
        this.setParamSimple(map, prefix + "IpVersion", this.IpVersion);

    }
}

