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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VpcEndPointServiceUser extends AbstractModel{

    /**
    * AppId。
    */
    @SerializedName("Owner")
    @Expose
    private Long Owner;

    /**
    * Uin。
    */
    @SerializedName("UserUin")
    @Expose
    private String UserUin;

    /**
    * 描述信息。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 终端节点服务ID。
    */
    @SerializedName("EndPointServiceId")
    @Expose
    private String EndPointServiceId;

    /**
     * Get AppId。 
     * @return Owner AppId。
     */
    public Long getOwner() {
        return this.Owner;
    }

    /**
     * Set AppId。
     * @param Owner AppId。
     */
    public void setOwner(Long Owner) {
        this.Owner = Owner;
    }

    /**
     * Get Uin。 
     * @return UserUin Uin。
     */
    public String getUserUin() {
        return this.UserUin;
    }

    /**
     * Set Uin。
     * @param UserUin Uin。
     */
    public void setUserUin(String UserUin) {
        this.UserUin = UserUin;
    }

    /**
     * Get 描述信息。 
     * @return Description 描述信息。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述信息。
     * @param Description 描述信息。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 创建时间。 
     * @return CreateTime 创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间。
     * @param CreateTime 创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 终端节点服务ID。 
     * @return EndPointServiceId 终端节点服务ID。
     */
    public String getEndPointServiceId() {
        return this.EndPointServiceId;
    }

    /**
     * Set 终端节点服务ID。
     * @param EndPointServiceId 终端节点服务ID。
     */
    public void setEndPointServiceId(String EndPointServiceId) {
        this.EndPointServiceId = EndPointServiceId;
    }

    public VpcEndPointServiceUser() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VpcEndPointServiceUser(VpcEndPointServiceUser source) {
        if (source.Owner != null) {
            this.Owner = new Long(source.Owner);
        }
        if (source.UserUin != null) {
            this.UserUin = new String(source.UserUin);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.EndPointServiceId != null) {
            this.EndPointServiceId = new String(source.EndPointServiceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "UserUin", this.UserUin);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "EndPointServiceId", this.EndPointServiceId);

    }
}

