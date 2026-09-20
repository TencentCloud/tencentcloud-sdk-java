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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AgentApplicationInfo extends AbstractModel {

    /**
    * <p>应用id</p>
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * <p>应用名称</p>
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * <p>接入类型</p><p>枚举值：</p><ul><li>Langfuse：  Langfuse 是一款开源的 LLM（大语言模型）工程与可观测性平台（LLMOps Tool）</li></ul>
    */
    @SerializedName("AccessType")
    @Expose
    private String AccessType;

    /**
    * <p>应用下资源所属地域</p><p>例如：ap-guangzhou</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>日志主题列表</p>
    */
    @SerializedName("LogTopics")
    @Expose
    private AgentTopicInfo [] LogTopics;

    /**
    * <p>指标主题列表</p>
    */
    @SerializedName("MetricsTopics")
    @Expose
    private AgentTopicInfo [] MetricsTopics;

    /**
    * <p>创建时间</p><p>单位：秒</p><p>秒级时间戳</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>更新时间</p><p>单位：秒</p><p>秒级时间戳</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * <p>日志集id</p>
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * <p>服务方名称</p>
    */
    @SerializedName("AssumerName")
    @Expose
    private String AssumerName;

    /**
    * <p>服务方子名称</p>
    */
    @SerializedName("SubAssumerName")
    @Expose
    private String SubAssumerName;

    /**
    * <p>服务方Uin</p>
    */
    @SerializedName("AssumerUin")
    @Expose
    private Long AssumerUin;

    /**
    * <p>服务方使用的角色</p>
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
     * Get <p>应用id</p> 
     * @return ApplicationId <p>应用id</p>
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set <p>应用id</p>
     * @param ApplicationId <p>应用id</p>
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get <p>应用名称</p> 
     * @return ApplicationName <p>应用名称</p>
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set <p>应用名称</p>
     * @param ApplicationName <p>应用名称</p>
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get <p>接入类型</p><p>枚举值：</p><ul><li>Langfuse：  Langfuse 是一款开源的 LLM（大语言模型）工程与可观测性平台（LLMOps Tool）</li></ul> 
     * @return AccessType <p>接入类型</p><p>枚举值：</p><ul><li>Langfuse：  Langfuse 是一款开源的 LLM（大语言模型）工程与可观测性平台（LLMOps Tool）</li></ul>
     */
    public String getAccessType() {
        return this.AccessType;
    }

    /**
     * Set <p>接入类型</p><p>枚举值：</p><ul><li>Langfuse：  Langfuse 是一款开源的 LLM（大语言模型）工程与可观测性平台（LLMOps Tool）</li></ul>
     * @param AccessType <p>接入类型</p><p>枚举值：</p><ul><li>Langfuse：  Langfuse 是一款开源的 LLM（大语言模型）工程与可观测性平台（LLMOps Tool）</li></ul>
     */
    public void setAccessType(String AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get <p>应用下资源所属地域</p><p>例如：ap-guangzhou</p> 
     * @return Region <p>应用下资源所属地域</p><p>例如：ap-guangzhou</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>应用下资源所属地域</p><p>例如：ap-guangzhou</p>
     * @param Region <p>应用下资源所属地域</p><p>例如：ap-guangzhou</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>日志主题列表</p> 
     * @return LogTopics <p>日志主题列表</p>
     */
    public AgentTopicInfo [] getLogTopics() {
        return this.LogTopics;
    }

    /**
     * Set <p>日志主题列表</p>
     * @param LogTopics <p>日志主题列表</p>
     */
    public void setLogTopics(AgentTopicInfo [] LogTopics) {
        this.LogTopics = LogTopics;
    }

    /**
     * Get <p>指标主题列表</p> 
     * @return MetricsTopics <p>指标主题列表</p>
     */
    public AgentTopicInfo [] getMetricsTopics() {
        return this.MetricsTopics;
    }

    /**
     * Set <p>指标主题列表</p>
     * @param MetricsTopics <p>指标主题列表</p>
     */
    public void setMetricsTopics(AgentTopicInfo [] MetricsTopics) {
        this.MetricsTopics = MetricsTopics;
    }

    /**
     * Get <p>创建时间</p><p>单位：秒</p><p>秒级时间戳</p> 
     * @return CreateTime <p>创建时间</p><p>单位：秒</p><p>秒级时间戳</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p><p>单位：秒</p><p>秒级时间戳</p>
     * @param CreateTime <p>创建时间</p><p>单位：秒</p><p>秒级时间戳</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间</p><p>单位：秒</p><p>秒级时间戳</p> 
     * @return UpdateTime <p>更新时间</p><p>单位：秒</p><p>秒级时间戳</p>
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p><p>单位：秒</p><p>秒级时间戳</p>
     * @param UpdateTime <p>更新时间</p><p>单位：秒</p><p>秒级时间戳</p>
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>日志集id</p> 
     * @return LogsetId <p>日志集id</p>
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set <p>日志集id</p>
     * @param LogsetId <p>日志集id</p>
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get <p>服务方名称</p> 
     * @return AssumerName <p>服务方名称</p>
     */
    public String getAssumerName() {
        return this.AssumerName;
    }

    /**
     * Set <p>服务方名称</p>
     * @param AssumerName <p>服务方名称</p>
     */
    public void setAssumerName(String AssumerName) {
        this.AssumerName = AssumerName;
    }

    /**
     * Get <p>服务方子名称</p> 
     * @return SubAssumerName <p>服务方子名称</p>
     */
    public String getSubAssumerName() {
        return this.SubAssumerName;
    }

    /**
     * Set <p>服务方子名称</p>
     * @param SubAssumerName <p>服务方子名称</p>
     */
    public void setSubAssumerName(String SubAssumerName) {
        this.SubAssumerName = SubAssumerName;
    }

    /**
     * Get <p>服务方Uin</p> 
     * @return AssumerUin <p>服务方Uin</p>
     */
    public Long getAssumerUin() {
        return this.AssumerUin;
    }

    /**
     * Set <p>服务方Uin</p>
     * @param AssumerUin <p>服务方Uin</p>
     */
    public void setAssumerUin(Long AssumerUin) {
        this.AssumerUin = AssumerUin;
    }

    /**
     * Get <p>服务方使用的角色</p> 
     * @return RoleName <p>服务方使用的角色</p>
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set <p>服务方使用的角色</p>
     * @param RoleName <p>服务方使用的角色</p>
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    public AgentApplicationInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentApplicationInfo(AgentApplicationInfo source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.ApplicationName != null) {
            this.ApplicationName = new String(source.ApplicationName);
        }
        if (source.AccessType != null) {
            this.AccessType = new String(source.AccessType);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.LogTopics != null) {
            this.LogTopics = new AgentTopicInfo[source.LogTopics.length];
            for (int i = 0; i < source.LogTopics.length; i++) {
                this.LogTopics[i] = new AgentTopicInfo(source.LogTopics[i]);
            }
        }
        if (source.MetricsTopics != null) {
            this.MetricsTopics = new AgentTopicInfo[source.MetricsTopics.length];
            for (int i = 0; i < source.MetricsTopics.length; i++) {
                this.MetricsTopics[i] = new AgentTopicInfo(source.MetricsTopics[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.AssumerName != null) {
            this.AssumerName = new String(source.AssumerName);
        }
        if (source.SubAssumerName != null) {
            this.SubAssumerName = new String(source.SubAssumerName);
        }
        if (source.AssumerUin != null) {
            this.AssumerUin = new Long(source.AssumerUin);
        }
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamArrayObj(map, prefix + "LogTopics.", this.LogTopics);
        this.setParamArrayObj(map, prefix + "MetricsTopics.", this.MetricsTopics);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "AssumerName", this.AssumerName);
        this.setParamSimple(map, prefix + "SubAssumerName", this.SubAssumerName);
        this.setParamSimple(map, prefix + "AssumerUin", this.AssumerUin);
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);

    }
}

