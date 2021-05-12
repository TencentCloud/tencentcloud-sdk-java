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

public class StackInfo extends AbstractModel{

    /**
    * 资源栈ID
    */
    @SerializedName("StackId")
    @Expose
    private String StackId;

    /**
    * 资源栈名称
    */
    @SerializedName("StackName")
    @Expose
    private String StackName;

    /**
    * 资源栈描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 所处地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 资源栈状态
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
     * Get 资源栈名称 
     * @return StackName 资源栈名称
     */
    public String getStackName() {
        return this.StackName;
    }

    /**
     * Set 资源栈名称
     * @param StackName 资源栈名称
     */
    public void setStackName(String StackName) {
        this.StackName = StackName;
    }

    /**
     * Get 资源栈描述 
     * @return Description 资源栈描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 资源栈描述
     * @param Description 资源栈描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 所处地域 
     * @return Region 所处地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 所处地域
     * @param Region 所处地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 资源栈状态 
     * @return Status 资源栈状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 资源栈状态
     * @param Status 资源栈状态
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

    public StackInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StackInfo(StackInfo source) {
        if (source.StackId != null) {
            this.StackId = new String(source.StackId);
        }
        if (source.StackName != null) {
            this.StackName = new String(source.StackName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
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
        this.setParamSimple(map, prefix + "StackId", this.StackId);
        this.setParamSimple(map, prefix + "StackName", this.StackName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

