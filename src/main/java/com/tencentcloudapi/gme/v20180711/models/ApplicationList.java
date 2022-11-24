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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplicationList extends AbstractModel{

    /**
    * 服务开关状态
    */
    @SerializedName("ServiceConf")
    @Expose
    private ServiceStatus ServiceConf;

    /**
    * 应用ID(AppID)
    */
    @SerializedName("BizId")
    @Expose
    private Long BizId;

    /**
    * 应用名称
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 项目ID，默认为0
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 应用状态，返回0表示正常，1表示关闭，2表示欠费停服，3表示欠费回收
    */
    @SerializedName("AppStatus")
    @Expose
    private Long AppStatus;

    /**
    * 创建时间，Unix时间戳格式
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 应用类型，无需关注此数值
    */
    @SerializedName("AppType")
    @Expose
    private Long AppType;

    /**
     * Get 服务开关状态 
     * @return ServiceConf 服务开关状态
     */
    public ServiceStatus getServiceConf() {
        return this.ServiceConf;
    }

    /**
     * Set 服务开关状态
     * @param ServiceConf 服务开关状态
     */
    public void setServiceConf(ServiceStatus ServiceConf) {
        this.ServiceConf = ServiceConf;
    }

    /**
     * Get 应用ID(AppID) 
     * @return BizId 应用ID(AppID)
     */
    public Long getBizId() {
        return this.BizId;
    }

    /**
     * Set 应用ID(AppID)
     * @param BizId 应用ID(AppID)
     */
    public void setBizId(Long BizId) {
        this.BizId = BizId;
    }

    /**
     * Get 应用名称 
     * @return AppName 应用名称
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 应用名称
     * @param AppName 应用名称
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get 项目ID，默认为0 
     * @return ProjectId 项目ID，默认为0
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID，默认为0
     * @param ProjectId 项目ID，默认为0
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 应用状态，返回0表示正常，1表示关闭，2表示欠费停服，3表示欠费回收 
     * @return AppStatus 应用状态，返回0表示正常，1表示关闭，2表示欠费停服，3表示欠费回收
     */
    public Long getAppStatus() {
        return this.AppStatus;
    }

    /**
     * Set 应用状态，返回0表示正常，1表示关闭，2表示欠费停服，3表示欠费回收
     * @param AppStatus 应用状态，返回0表示正常，1表示关闭，2表示欠费停服，3表示欠费回收
     */
    public void setAppStatus(Long AppStatus) {
        this.AppStatus = AppStatus;
    }

    /**
     * Get 创建时间，Unix时间戳格式 
     * @return CreateTime 创建时间，Unix时间戳格式
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间，Unix时间戳格式
     * @param CreateTime 创建时间，Unix时间戳格式
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 应用类型，无需关注此数值 
     * @return AppType 应用类型，无需关注此数值
     */
    public Long getAppType() {
        return this.AppType;
    }

    /**
     * Set 应用类型，无需关注此数值
     * @param AppType 应用类型，无需关注此数值
     */
    public void setAppType(Long AppType) {
        this.AppType = AppType;
    }

    public ApplicationList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplicationList(ApplicationList source) {
        if (source.ServiceConf != null) {
            this.ServiceConf = new ServiceStatus(source.ServiceConf);
        }
        if (source.BizId != null) {
            this.BizId = new Long(source.BizId);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.AppStatus != null) {
            this.AppStatus = new Long(source.AppStatus);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.AppType != null) {
            this.AppType = new Long(source.AppType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ServiceConf.", this.ServiceConf);
        this.setParamSimple(map, prefix + "BizId", this.BizId);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "AppStatus", this.AppStatus);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "AppType", this.AppType);

    }
}

