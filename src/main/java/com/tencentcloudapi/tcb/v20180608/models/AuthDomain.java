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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuthDomain extends AbstractModel{

    /**
    * 域名ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 域名类型。包含以下取值：
<li>SYSTEM</li>
<li>USER</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 状态。包含以下取值：
<li>ENABLE</li>
<li>DISABLE</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

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
     * Get 域名ID 
     * @return Id 域名ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 域名ID
     * @param Id 域名ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 域名类型。包含以下取值：
<li>SYSTEM</li>
<li>USER</li> 
     * @return Type 域名类型。包含以下取值：
<li>SYSTEM</li>
<li>USER</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 域名类型。包含以下取值：
<li>SYSTEM</li>
<li>USER</li>
     * @param Type 域名类型。包含以下取值：
<li>SYSTEM</li>
<li>USER</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 状态。包含以下取值：
<li>ENABLE</li>
<li>DISABLE</li> 
     * @return Status 状态。包含以下取值：
<li>ENABLE</li>
<li>DISABLE</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态。包含以下取值：
<li>ENABLE</li>
<li>DISABLE</li>
     * @param Status 状态。包含以下取值：
<li>ENABLE</li>
<li>DISABLE</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

