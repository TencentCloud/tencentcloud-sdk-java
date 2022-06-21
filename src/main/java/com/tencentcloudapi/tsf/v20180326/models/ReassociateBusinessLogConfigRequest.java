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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReassociateBusinessLogConfigRequest extends AbstractModel{

    /**
    * 原关联日志配置ID
    */
    @SerializedName("ConfigId")
    @Expose
    private String ConfigId;

    /**
    * 新关联日志配置ID
    */
    @SerializedName("NewConfigId")
    @Expose
    private String NewConfigId;

    /**
    * TSF应用ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * TSF部署组ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
     * Get 原关联日志配置ID 
     * @return ConfigId 原关联日志配置ID
     */
    public String getConfigId() {
        return this.ConfigId;
    }

    /**
     * Set 原关联日志配置ID
     * @param ConfigId 原关联日志配置ID
     */
    public void setConfigId(String ConfigId) {
        this.ConfigId = ConfigId;
    }

    /**
     * Get 新关联日志配置ID 
     * @return NewConfigId 新关联日志配置ID
     */
    public String getNewConfigId() {
        return this.NewConfigId;
    }

    /**
     * Set 新关联日志配置ID
     * @param NewConfigId 新关联日志配置ID
     */
    public void setNewConfigId(String NewConfigId) {
        this.NewConfigId = NewConfigId;
    }

    /**
     * Get TSF应用ID 
     * @return ApplicationId TSF应用ID
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set TSF应用ID
     * @param ApplicationId TSF应用ID
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get TSF部署组ID 
     * @return GroupId TSF部署组ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set TSF部署组ID
     * @param GroupId TSF部署组ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    public ReassociateBusinessLogConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReassociateBusinessLogConfigRequest(ReassociateBusinessLogConfigRequest source) {
        if (source.ConfigId != null) {
            this.ConfigId = new String(source.ConfigId);
        }
        if (source.NewConfigId != null) {
            this.NewConfigId = new String(source.NewConfigId);
        }
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfigId", this.ConfigId);
        this.setParamSimple(map, prefix + "NewConfigId", this.NewConfigId);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);

    }
}

