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

public class AddressTemplateGroup extends AbstractModel{

    /**
    * IP地址模板集合名称。
    */
    @SerializedName("AddressTemplateGroupName")
    @Expose
    private String AddressTemplateGroupName;

    /**
    * IP地址模板集合实例ID，例如：ipmg-dih8xdbq。
    */
    @SerializedName("AddressTemplateGroupId")
    @Expose
    private String AddressTemplateGroupId;

    /**
    * IP地址模板ID。
    */
    @SerializedName("AddressTemplateIdSet")
    @Expose
    private String [] AddressTemplateIdSet;

    /**
    * 创建时间。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * IP地址模板实例。
    */
    @SerializedName("AddressTemplateSet")
    @Expose
    private AddressTemplateItem [] AddressTemplateSet;

    /**
     * Get IP地址模板集合名称。 
     * @return AddressTemplateGroupName IP地址模板集合名称。
     */
    public String getAddressTemplateGroupName() {
        return this.AddressTemplateGroupName;
    }

    /**
     * Set IP地址模板集合名称。
     * @param AddressTemplateGroupName IP地址模板集合名称。
     */
    public void setAddressTemplateGroupName(String AddressTemplateGroupName) {
        this.AddressTemplateGroupName = AddressTemplateGroupName;
    }

    /**
     * Get IP地址模板集合实例ID，例如：ipmg-dih8xdbq。 
     * @return AddressTemplateGroupId IP地址模板集合实例ID，例如：ipmg-dih8xdbq。
     */
    public String getAddressTemplateGroupId() {
        return this.AddressTemplateGroupId;
    }

    /**
     * Set IP地址模板集合实例ID，例如：ipmg-dih8xdbq。
     * @param AddressTemplateGroupId IP地址模板集合实例ID，例如：ipmg-dih8xdbq。
     */
    public void setAddressTemplateGroupId(String AddressTemplateGroupId) {
        this.AddressTemplateGroupId = AddressTemplateGroupId;
    }

    /**
     * Get IP地址模板ID。 
     * @return AddressTemplateIdSet IP地址模板ID。
     */
    public String [] getAddressTemplateIdSet() {
        return this.AddressTemplateIdSet;
    }

    /**
     * Set IP地址模板ID。
     * @param AddressTemplateIdSet IP地址模板ID。
     */
    public void setAddressTemplateIdSet(String [] AddressTemplateIdSet) {
        this.AddressTemplateIdSet = AddressTemplateIdSet;
    }

    /**
     * Get 创建时间。 
     * @return CreatedTime 创建时间。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间。
     * @param CreatedTime 创建时间。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get IP地址模板实例。 
     * @return AddressTemplateSet IP地址模板实例。
     */
    public AddressTemplateItem [] getAddressTemplateSet() {
        return this.AddressTemplateSet;
    }

    /**
     * Set IP地址模板实例。
     * @param AddressTemplateSet IP地址模板实例。
     */
    public void setAddressTemplateSet(AddressTemplateItem [] AddressTemplateSet) {
        this.AddressTemplateSet = AddressTemplateSet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AddressTemplateGroupName", this.AddressTemplateGroupName);
        this.setParamSimple(map, prefix + "AddressTemplateGroupId", this.AddressTemplateGroupId);
        this.setParamArraySimple(map, prefix + "AddressTemplateIdSet.", this.AddressTemplateIdSet);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamArrayObj(map, prefix + "AddressTemplateSet.", this.AddressTemplateSet);

    }
}

