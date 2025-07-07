/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReportAppMessage extends AbstractModel {

    /**
    * 工作空间Id
    */
    @SerializedName("WorkspaceId")
    @Expose
    private Long WorkspaceId;

    /**
    * 消息定义
    */
    @SerializedName("Profile")
    @Expose
    private MessageProfile Profile;

    /**
    * 数据上报时间
    */
    @SerializedName("ReportTs")
    @Expose
    private Long ReportTs;

    /**
    * 属性定义 - KV，若为json格式，需在前加上x-json:，有效字段为x-json:后的字段
    */
    @SerializedName("Properties")
    @Expose
    private String Properties;

    /**
    * 事件定义 - KKV，若为json格式，需在前加上x-json:，有效字段为x-json:后的字段
    */
    @SerializedName("EventSet")
    @Expose
    private String EventSet;

    /**
    * 服务定义 - KKV,若为json格式，需在前加上x-json:，有效字段为x-json:后的字段
    */
    @SerializedName("ServiceSet")
    @Expose
    private String ServiceSet;

    /**
    * 扩展字段2，如：算法上报id，若为json格式，需在前加上x-json:
    */
    @SerializedName("ExtendTwo")
    @Expose
    private String ExtendTwo;

    /**
    * 透传信息，若为json格式，需在前加上x-json:，有效字段为x-json:后的字段
    */
    @SerializedName("Echo")
    @Expose
    private String Echo;

    /**
     * Get 工作空间Id 
     * @return WorkspaceId 工作空间Id
     */
    public Long getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set 工作空间Id
     * @param WorkspaceId 工作空间Id
     */
    public void setWorkspaceId(Long WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get 消息定义 
     * @return Profile 消息定义
     */
    public MessageProfile getProfile() {
        return this.Profile;
    }

    /**
     * Set 消息定义
     * @param Profile 消息定义
     */
    public void setProfile(MessageProfile Profile) {
        this.Profile = Profile;
    }

    /**
     * Get 数据上报时间 
     * @return ReportTs 数据上报时间
     */
    public Long getReportTs() {
        return this.ReportTs;
    }

    /**
     * Set 数据上报时间
     * @param ReportTs 数据上报时间
     */
    public void setReportTs(Long ReportTs) {
        this.ReportTs = ReportTs;
    }

    /**
     * Get 属性定义 - KV，若为json格式，需在前加上x-json:，有效字段为x-json:后的字段 
     * @return Properties 属性定义 - KV，若为json格式，需在前加上x-json:，有效字段为x-json:后的字段
     */
    public String getProperties() {
        return this.Properties;
    }

    /**
     * Set 属性定义 - KV，若为json格式，需在前加上x-json:，有效字段为x-json:后的字段
     * @param Properties 属性定义 - KV，若为json格式，需在前加上x-json:，有效字段为x-json:后的字段
     */
    public void setProperties(String Properties) {
        this.Properties = Properties;
    }

    /**
     * Get 事件定义 - KKV，若为json格式，需在前加上x-json:，有效字段为x-json:后的字段 
     * @return EventSet 事件定义 - KKV，若为json格式，需在前加上x-json:，有效字段为x-json:后的字段
     */
    public String getEventSet() {
        return this.EventSet;
    }

    /**
     * Set 事件定义 - KKV，若为json格式，需在前加上x-json:，有效字段为x-json:后的字段
     * @param EventSet 事件定义 - KKV，若为json格式，需在前加上x-json:，有效字段为x-json:后的字段
     */
    public void setEventSet(String EventSet) {
        this.EventSet = EventSet;
    }

    /**
     * Get 服务定义 - KKV,若为json格式，需在前加上x-json:，有效字段为x-json:后的字段 
     * @return ServiceSet 服务定义 - KKV,若为json格式，需在前加上x-json:，有效字段为x-json:后的字段
     */
    public String getServiceSet() {
        return this.ServiceSet;
    }

    /**
     * Set 服务定义 - KKV,若为json格式，需在前加上x-json:，有效字段为x-json:后的字段
     * @param ServiceSet 服务定义 - KKV,若为json格式，需在前加上x-json:，有效字段为x-json:后的字段
     */
    public void setServiceSet(String ServiceSet) {
        this.ServiceSet = ServiceSet;
    }

    /**
     * Get 扩展字段2，如：算法上报id，若为json格式，需在前加上x-json: 
     * @return ExtendTwo 扩展字段2，如：算法上报id，若为json格式，需在前加上x-json:
     */
    public String getExtendTwo() {
        return this.ExtendTwo;
    }

    /**
     * Set 扩展字段2，如：算法上报id，若为json格式，需在前加上x-json:
     * @param ExtendTwo 扩展字段2，如：算法上报id，若为json格式，需在前加上x-json:
     */
    public void setExtendTwo(String ExtendTwo) {
        this.ExtendTwo = ExtendTwo;
    }

    /**
     * Get 透传信息，若为json格式，需在前加上x-json:，有效字段为x-json:后的字段 
     * @return Echo 透传信息，若为json格式，需在前加上x-json:，有效字段为x-json:后的字段
     */
    public String getEcho() {
        return this.Echo;
    }

    /**
     * Set 透传信息，若为json格式，需在前加上x-json:，有效字段为x-json:后的字段
     * @param Echo 透传信息，若为json格式，需在前加上x-json:，有效字段为x-json:后的字段
     */
    public void setEcho(String Echo) {
        this.Echo = Echo;
    }

    public ReportAppMessage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReportAppMessage(ReportAppMessage source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new Long(source.WorkspaceId);
        }
        if (source.Profile != null) {
            this.Profile = new MessageProfile(source.Profile);
        }
        if (source.ReportTs != null) {
            this.ReportTs = new Long(source.ReportTs);
        }
        if (source.Properties != null) {
            this.Properties = new String(source.Properties);
        }
        if (source.EventSet != null) {
            this.EventSet = new String(source.EventSet);
        }
        if (source.ServiceSet != null) {
            this.ServiceSet = new String(source.ServiceSet);
        }
        if (source.ExtendTwo != null) {
            this.ExtendTwo = new String(source.ExtendTwo);
        }
        if (source.Echo != null) {
            this.Echo = new String(source.Echo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamObj(map, prefix + "Profile.", this.Profile);
        this.setParamSimple(map, prefix + "ReportTs", this.ReportTs);
        this.setParamSimple(map, prefix + "Properties", this.Properties);
        this.setParamSimple(map, prefix + "EventSet", this.EventSet);
        this.setParamSimple(map, prefix + "ServiceSet", this.ServiceSet);
        this.setParamSimple(map, prefix + "ExtendTwo", this.ExtendTwo);
        this.setParamSimple(map, prefix + "Echo", this.Echo);

    }
}

