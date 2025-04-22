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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OriginGroup extends AbstractModel {

    /**
    * 源站组ID。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 源站组名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 源站组类型，取值有：
<li>GENERAL：通用型源站组；</li>
<li>HTTP： HTTP专用型源站组。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 源站记录信息。
    */
    @SerializedName("Records")
    @Expose
    private OriginRecord [] Records;

    /**
    * 源站组被引用实例列表。	
    */
    @SerializedName("References")
    @Expose
    private OriginGroupReference [] References;

    /**
    * 源站组创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 源站组更新时间。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 回源Host Header。
    */
    @SerializedName("HostHeader")
    @Expose
    private String HostHeader;

    /**
     * Get 源站组ID。 
     * @return GroupId 源站组ID。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 源站组ID。
     * @param GroupId 源站组ID。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 源站组名称。 
     * @return Name 源站组名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 源站组名称。
     * @param Name 源站组名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 源站组类型，取值有：
<li>GENERAL：通用型源站组；</li>
<li>HTTP： HTTP专用型源站组。</li> 
     * @return Type 源站组类型，取值有：
<li>GENERAL：通用型源站组；</li>
<li>HTTP： HTTP专用型源站组。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 源站组类型，取值有：
<li>GENERAL：通用型源站组；</li>
<li>HTTP： HTTP专用型源站组。</li>
     * @param Type 源站组类型，取值有：
<li>GENERAL：通用型源站组；</li>
<li>HTTP： HTTP专用型源站组。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 源站记录信息。 
     * @return Records 源站记录信息。
     */
    public OriginRecord [] getRecords() {
        return this.Records;
    }

    /**
     * Set 源站记录信息。
     * @param Records 源站记录信息。
     */
    public void setRecords(OriginRecord [] Records) {
        this.Records = Records;
    }

    /**
     * Get 源站组被引用实例列表。	 
     * @return References 源站组被引用实例列表。	
     */
    public OriginGroupReference [] getReferences() {
        return this.References;
    }

    /**
     * Set 源站组被引用实例列表。	
     * @param References 源站组被引用实例列表。	
     */
    public void setReferences(OriginGroupReference [] References) {
        this.References = References;
    }

    /**
     * Get 源站组创建时间。 
     * @return CreateTime 源站组创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 源站组创建时间。
     * @param CreateTime 源站组创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 源站组更新时间。 
     * @return UpdateTime 源站组更新时间。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 源站组更新时间。
     * @param UpdateTime 源站组更新时间。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 回源Host Header。 
     * @return HostHeader 回源Host Header。
     */
    public String getHostHeader() {
        return this.HostHeader;
    }

    /**
     * Set 回源Host Header。
     * @param HostHeader 回源Host Header。
     */
    public void setHostHeader(String HostHeader) {
        this.HostHeader = HostHeader;
    }

    public OriginGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OriginGroup(OriginGroup source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Records != null) {
            this.Records = new OriginRecord[source.Records.length];
            for (int i = 0; i < source.Records.length; i++) {
                this.Records[i] = new OriginRecord(source.Records[i]);
            }
        }
        if (source.References != null) {
            this.References = new OriginGroupReference[source.References.length];
            for (int i = 0; i < source.References.length; i++) {
                this.References[i] = new OriginGroupReference(source.References[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.HostHeader != null) {
            this.HostHeader = new String(source.HostHeader);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "Records.", this.Records);
        this.setParamArrayObj(map, prefix + "References.", this.References);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "HostHeader", this.HostHeader);

    }
}

