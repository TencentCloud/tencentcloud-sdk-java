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
package com.tencentcloudapi.chdfs.v20201112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccessGroup extends AbstractModel{

    /**
    * 权限组ID
    */
    @SerializedName("AccessGroupId")
    @Expose
    private String AccessGroupId;

    /**
    * 权限组名称
    */
    @SerializedName("AccessGroupName")
    @Expose
    private String AccessGroupName;

    /**
    * 权限组描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * VPC网络类型（1：CVM；2：黑石1.0）
    */
    @SerializedName("VpcType")
    @Expose
    private Long VpcType;

    /**
    * VPC网络ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
     * Get 权限组ID 
     * @return AccessGroupId 权限组ID
     */
    public String getAccessGroupId() {
        return this.AccessGroupId;
    }

    /**
     * Set 权限组ID
     * @param AccessGroupId 权限组ID
     */
    public void setAccessGroupId(String AccessGroupId) {
        this.AccessGroupId = AccessGroupId;
    }

    /**
     * Get 权限组名称 
     * @return AccessGroupName 权限组名称
     */
    public String getAccessGroupName() {
        return this.AccessGroupName;
    }

    /**
     * Set 权限组名称
     * @param AccessGroupName 权限组名称
     */
    public void setAccessGroupName(String AccessGroupName) {
        this.AccessGroupName = AccessGroupName;
    }

    /**
     * Get 权限组描述 
     * @return Description 权限组描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 权限组描述
     * @param Description 权限组描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
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
     * Get VPC网络类型（1：CVM；2：黑石1.0） 
     * @return VpcType VPC网络类型（1：CVM；2：黑石1.0）
     */
    public Long getVpcType() {
        return this.VpcType;
    }

    /**
     * Set VPC网络类型（1：CVM；2：黑石1.0）
     * @param VpcType VPC网络类型（1：CVM；2：黑石1.0）
     */
    public void setVpcType(Long VpcType) {
        this.VpcType = VpcType;
    }

    /**
     * Get VPC网络ID 
     * @return VpcId VPC网络ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC网络ID
     * @param VpcId VPC网络ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    public AccessGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccessGroup(AccessGroup source) {
        if (source.AccessGroupId != null) {
            this.AccessGroupId = new String(source.AccessGroupId);
        }
        if (source.AccessGroupName != null) {
            this.AccessGroupName = new String(source.AccessGroupName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.VpcType != null) {
            this.VpcType = new Long(source.VpcType);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessGroupId", this.AccessGroupId);
        this.setParamSimple(map, prefix + "AccessGroupName", this.AccessGroupName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "VpcType", this.VpcType);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);

    }
}

