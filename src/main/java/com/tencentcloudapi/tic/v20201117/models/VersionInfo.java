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
package com.tencentcloudapi.tic.v20201117.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VersionInfo extends AbstractModel{

    /**
    * 版本ID
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
    * 版本名称
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
    * 版本描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 资源栈ID
    */
    @SerializedName("StackId")
    @Expose
    private String StackId;

    /**
    * 版本状态
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
     * Get 版本ID 
     * @return VersionId 版本ID
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set 版本ID
     * @param VersionId 版本ID
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    /**
     * Get 版本名称 
     * @return VersionName 版本名称
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set 版本名称
     * @param VersionName 版本名称
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    /**
     * Get 版本描述 
     * @return Description 版本描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 版本描述
     * @param Description 版本描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 资源栈ID 
     * @return StackId 资源栈ID
     */
    public String getStackId() {
        return this.StackId;
    }

    /**
     * Set 资源栈ID
     * @param StackId 资源栈ID
     */
    public void setStackId(String StackId) {
        this.StackId = StackId;
    }

    /**
     * Get 版本状态 
     * @return Status 版本状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 版本状态
     * @param Status 版本状态
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

    public VersionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VersionInfo(VersionInfo source) {
        if (source.VersionId != null) {
            this.VersionId = new String(source.VersionId);
        }
        if (source.VersionName != null) {
            this.VersionName = new String(source.VersionName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.StackId != null) {
            this.StackId = new String(source.StackId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);
        this.setParamSimple(map, prefix + "VersionName", this.VersionName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "StackId", this.StackId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

