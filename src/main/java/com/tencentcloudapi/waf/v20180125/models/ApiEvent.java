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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApiEvent extends AbstractModel {

    /**
    * 事件id
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
    * 事件类型
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * 事件等级，100,200,300对应低中高
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 处置状态，1:新发现，2，确认中，3，已确认，4，已下线，5，已忽略
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 发现时间
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * 关联的api
    */
    @SerializedName("ApiName")
    @Expose
    private String ApiName;

    /**
    * 请求方式
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * 事件来源，custom标识自定义
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
     * Get 事件id 
     * @return EventId 事件id
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set 事件id
     * @param EventId 事件id
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    /**
     * Get 事件类型 
     * @return EventType 事件类型
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set 事件类型
     * @param EventType 事件类型
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get 事件等级，100,200,300对应低中高 
     * @return Level 事件等级，100,200,300对应低中高
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set 事件等级，100,200,300对应低中高
     * @param Level 事件等级，100,200,300对应低中高
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 处置状态，1:新发现，2，确认中，3，已确认，4，已下线，5，已忽略 
     * @return Mode 处置状态，1:新发现，2，确认中，3，已确认，4，已下线，5，已忽略
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 处置状态，1:新发现，2，确认中，3，已确认，4，已下线，5，已忽略
     * @param Mode 处置状态，1:新发现，2，确认中，3，已确认，4，已下线，5，已忽略
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 发现时间 
     * @return StartTime 发现时间
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 发现时间
     * @param StartTime 发现时间
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 关联的api 
     * @return ApiName 关联的api
     */
    public String getApiName() {
        return this.ApiName;
    }

    /**
     * Set 关联的api
     * @param ApiName 关联的api
     */
    public void setApiName(String ApiName) {
        this.ApiName = ApiName;
    }

    /**
     * Get 请求方式 
     * @return Method 请求方式
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set 请求方式
     * @param Method 请求方式
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get 事件来源，custom标识自定义 
     * @return Source 事件来源，custom标识自定义
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 事件来源，custom标识自定义
     * @param Source 事件来源，custom标识自定义
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    public ApiEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiEvent(ApiEvent source) {
        if (source.EventId != null) {
            this.EventId = new String(source.EventId);
        }
        if (source.EventType != null) {
            this.EventType = new String(source.EventType);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.ApiName != null) {
            this.ApiName = new String(source.ApiName);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "ApiName", this.ApiName);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "Source", this.Source);

    }
}

