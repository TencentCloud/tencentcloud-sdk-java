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

public class DescribeInovcationIndicatorsRequest extends AbstractModel{

    /**
    * 维度
    */
    @SerializedName("Dimension")
    @Expose
    private String Dimension;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 命名空间ID
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * 微服务ID
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * 调用方服务名
    */
    @SerializedName("CallerServiceName")
    @Expose
    private String CallerServiceName;

    /**
    * 被调方服务名
    */
    @SerializedName("CalleeServiceName")
    @Expose
    private String CalleeServiceName;

    /**
    * 调用方接口名
    */
    @SerializedName("CallerInterfaceName")
    @Expose
    private String CallerInterfaceName;

    /**
    * 被调方接口名
    */
    @SerializedName("CalleeInterfaceName")
    @Expose
    private String CalleeInterfaceName;

    /**
    * 应用ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 部署组ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get 维度 
     * @return Dimension 维度
     */
    public String getDimension() {
        return this.Dimension;
    }

    /**
     * Set 维度
     * @param Dimension 维度
     */
    public void setDimension(String Dimension) {
        this.Dimension = Dimension;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 命名空间ID 
     * @return NamespaceId 命名空间ID
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set 命名空间ID
     * @param NamespaceId 命名空间ID
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get 微服务ID 
     * @return ServiceId 微服务ID
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 微服务ID
     * @param ServiceId 微服务ID
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get 调用方服务名 
     * @return CallerServiceName 调用方服务名
     */
    public String getCallerServiceName() {
        return this.CallerServiceName;
    }

    /**
     * Set 调用方服务名
     * @param CallerServiceName 调用方服务名
     */
    public void setCallerServiceName(String CallerServiceName) {
        this.CallerServiceName = CallerServiceName;
    }

    /**
     * Get 被调方服务名 
     * @return CalleeServiceName 被调方服务名
     */
    public String getCalleeServiceName() {
        return this.CalleeServiceName;
    }

    /**
     * Set 被调方服务名
     * @param CalleeServiceName 被调方服务名
     */
    public void setCalleeServiceName(String CalleeServiceName) {
        this.CalleeServiceName = CalleeServiceName;
    }

    /**
     * Get 调用方接口名 
     * @return CallerInterfaceName 调用方接口名
     */
    public String getCallerInterfaceName() {
        return this.CallerInterfaceName;
    }

    /**
     * Set 调用方接口名
     * @param CallerInterfaceName 调用方接口名
     */
    public void setCallerInterfaceName(String CallerInterfaceName) {
        this.CallerInterfaceName = CallerInterfaceName;
    }

    /**
     * Get 被调方接口名 
     * @return CalleeInterfaceName 被调方接口名
     */
    public String getCalleeInterfaceName() {
        return this.CalleeInterfaceName;
    }

    /**
     * Set 被调方接口名
     * @param CalleeInterfaceName 被调方接口名
     */
    public void setCalleeInterfaceName(String CalleeInterfaceName) {
        this.CalleeInterfaceName = CalleeInterfaceName;
    }

    /**
     * Get 应用ID 
     * @return ApplicationId 应用ID
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 应用ID
     * @param ApplicationId 应用ID
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 部署组ID 
     * @return GroupId 部署组ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 部署组ID
     * @param GroupId 部署组ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public DescribeInovcationIndicatorsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInovcationIndicatorsRequest(DescribeInovcationIndicatorsRequest source) {
        if (source.Dimension != null) {
            this.Dimension = new String(source.Dimension);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.NamespaceId != null) {
            this.NamespaceId = new String(source.NamespaceId);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.CallerServiceName != null) {
            this.CallerServiceName = new String(source.CallerServiceName);
        }
        if (source.CalleeServiceName != null) {
            this.CalleeServiceName = new String(source.CalleeServiceName);
        }
        if (source.CallerInterfaceName != null) {
            this.CallerInterfaceName = new String(source.CallerInterfaceName);
        }
        if (source.CalleeInterfaceName != null) {
            this.CalleeInterfaceName = new String(source.CalleeInterfaceName);
        }
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Dimension", this.Dimension);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "CallerServiceName", this.CallerServiceName);
        this.setParamSimple(map, prefix + "CalleeServiceName", this.CalleeServiceName);
        this.setParamSimple(map, prefix + "CallerInterfaceName", this.CallerInterfaceName);
        this.setParamSimple(map, prefix + "CalleeInterfaceName", this.CalleeInterfaceName);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

