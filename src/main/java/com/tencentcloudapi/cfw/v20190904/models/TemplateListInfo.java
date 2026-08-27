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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TemplateListInfo extends AbstractModel {

    /**
    * <p>模板ID</p>
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * <p>模板名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>描述</p>
    */
    @SerializedName("Detail")
    @Expose
    private String Detail;

    /**
    * <p>IP模板</p>
    */
    @SerializedName("IpString")
    @Expose
    private String IpString;

    /**
    * <p>插入时间</p>
    */
    @SerializedName("InsertTime")
    @Expose
    private String InsertTime;

    /**
    * <p>修改时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>模板类型</p>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>关联规则条数</p>
    */
    @SerializedName("RulesNum")
    @Expose
    private Long RulesNum;

    /**
    * <p>模板Id</p>
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * <p>协议端口模板，协议类型，4:4层协议，7:7层协议</p>
    */
    @SerializedName("ProtocolType")
    @Expose
    private String ProtocolType;

    /**
    * <p>模板包含地址数量</p>
    */
    @SerializedName("IPNum")
    @Expose
    private Long IPNum;

    /**
    * <p>IP版本,0,IPv4;1,IPv6</p>
    */
    @SerializedName("IpVersion")
    @Expose
    private Long IpVersion;

    /**
     * Get <p>模板ID</p> 
     * @return Uuid <p>模板ID</p>
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set <p>模板ID</p>
     * @param Uuid <p>模板ID</p>
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get <p>模板名称</p> 
     * @return Name <p>模板名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>模板名称</p>
     * @param Name <p>模板名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>描述</p> 
     * @return Detail <p>描述</p>
     */
    public String getDetail() {
        return this.Detail;
    }

    /**
     * Set <p>描述</p>
     * @param Detail <p>描述</p>
     */
    public void setDetail(String Detail) {
        this.Detail = Detail;
    }

    /**
     * Get <p>IP模板</p> 
     * @return IpString <p>IP模板</p>
     */
    public String getIpString() {
        return this.IpString;
    }

    /**
     * Set <p>IP模板</p>
     * @param IpString <p>IP模板</p>
     */
    public void setIpString(String IpString) {
        this.IpString = IpString;
    }

    /**
     * Get <p>插入时间</p> 
     * @return InsertTime <p>插入时间</p>
     */
    public String getInsertTime() {
        return this.InsertTime;
    }

    /**
     * Set <p>插入时间</p>
     * @param InsertTime <p>插入时间</p>
     */
    public void setInsertTime(String InsertTime) {
        this.InsertTime = InsertTime;
    }

    /**
     * Get <p>修改时间</p> 
     * @return UpdateTime <p>修改时间</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>修改时间</p>
     * @param UpdateTime <p>修改时间</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>模板类型</p> 
     * @return Type <p>模板类型</p>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>模板类型</p>
     * @param Type <p>模板类型</p>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>关联规则条数</p> 
     * @return RulesNum <p>关联规则条数</p>
     */
    public Long getRulesNum() {
        return this.RulesNum;
    }

    /**
     * Set <p>关联规则条数</p>
     * @param RulesNum <p>关联规则条数</p>
     */
    public void setRulesNum(Long RulesNum) {
        this.RulesNum = RulesNum;
    }

    /**
     * Get <p>模板Id</p> 
     * @return TemplateId <p>模板Id</p>
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set <p>模板Id</p>
     * @param TemplateId <p>模板Id</p>
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get <p>协议端口模板，协议类型，4:4层协议，7:7层协议</p> 
     * @return ProtocolType <p>协议端口模板，协议类型，4:4层协议，7:7层协议</p>
     */
    public String getProtocolType() {
        return this.ProtocolType;
    }

    /**
     * Set <p>协议端口模板，协议类型，4:4层协议，7:7层协议</p>
     * @param ProtocolType <p>协议端口模板，协议类型，4:4层协议，7:7层协议</p>
     */
    public void setProtocolType(String ProtocolType) {
        this.ProtocolType = ProtocolType;
    }

    /**
     * Get <p>模板包含地址数量</p> 
     * @return IPNum <p>模板包含地址数量</p>
     */
    public Long getIPNum() {
        return this.IPNum;
    }

    /**
     * Set <p>模板包含地址数量</p>
     * @param IPNum <p>模板包含地址数量</p>
     */
    public void setIPNum(Long IPNum) {
        this.IPNum = IPNum;
    }

    /**
     * Get <p>IP版本,0,IPv4;1,IPv6</p> 
     * @return IpVersion <p>IP版本,0,IPv4;1,IPv6</p>
     */
    public Long getIpVersion() {
        return this.IpVersion;
    }

    /**
     * Set <p>IP版本,0,IPv4;1,IPv6</p>
     * @param IpVersion <p>IP版本,0,IPv4;1,IPv6</p>
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

