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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplyStatus extends AbstractModel{

    /**
    * 集群id-申请单id
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 处理状态-1-撤回 1-通过 2-驳回，非0状态的申请单不可改变状态。
    */
    @SerializedName("ApplicationStatus")
    @Expose
    private Long ApplicationStatus;

    /**
    * 申请单类型
    */
    @SerializedName("ApplicationType")
    @Expose
    private Long ApplicationType;

    /**
    * 集群Id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
     * Get 集群id-申请单id 
     * @return ApplicationId 集群id-申请单id
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 集群id-申请单id
     * @param ApplicationId 集群id-申请单id
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 处理状态-1-撤回 1-通过 2-驳回，非0状态的申请单不可改变状态。 
     * @return ApplicationStatus 处理状态-1-撤回 1-通过 2-驳回，非0状态的申请单不可改变状态。
     */
    public Long getApplicationStatus() {
        return this.ApplicationStatus;
    }

    /**
     * Set 处理状态-1-撤回 1-通过 2-驳回，非0状态的申请单不可改变状态。
     * @param ApplicationStatus 处理状态-1-撤回 1-通过 2-驳回，非0状态的申请单不可改变状态。
     */
    public void setApplicationStatus(Long ApplicationStatus) {
        this.ApplicationStatus = ApplicationStatus;
    }

    /**
     * Get 申请单类型 
     * @return ApplicationType 申请单类型
     */
    public Long getApplicationType() {
        return this.ApplicationType;
    }

    /**
     * Set 申请单类型
     * @param ApplicationType 申请单类型
     */
    public void setApplicationType(Long ApplicationType) {
        this.ApplicationType = ApplicationType;
    }

    /**
     * Get 集群Id 
     * @return ClusterId 集群Id
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群Id
     * @param ClusterId 集群Id
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    public ApplyStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplyStatus(ApplyStatus source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.ApplicationStatus != null) {
            this.ApplicationStatus = new Long(source.ApplicationStatus);
        }
        if (source.ApplicationType != null) {
            this.ApplicationType = new Long(source.ApplicationType);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "ApplicationStatus", this.ApplicationStatus);
        this.setParamSimple(map, prefix + "ApplicationType", this.ApplicationType);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);

    }
}

