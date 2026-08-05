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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ThrottleRuleDetail extends AbstractModel {

    /**
    * <p>限流规则标识</p>
    */
    @SerializedName("ThrottleRuleId")
    @Expose
    private Long ThrottleRuleId;

    /**
    * <p>限流类型</p><p>枚举值：</p><ul><li>1： 用户/客户端限流</li><li>2： 消费组限流</li><li>3： topic限流</li></ul>
    */
    @SerializedName("ThrottleType")
    @Expose
    private Long ThrottleType;

    /**
    * <p>客户端id</p>
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
    * <p>用户名</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>消费限流值,单位MB/s</p>
    */
    @SerializedName("ConsumeThrottle")
    @Expose
    private Long ConsumeThrottle;

    /**
    * <p>更新时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>topic名称</p>
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * <p>topicId</p>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
     * Get <p>限流规则标识</p> 
     * @return ThrottleRuleId <p>限流规则标识</p>
     */
    public Long getThrottleRuleId() {
        return this.ThrottleRuleId;
    }

    /**
     * Set <p>限流规则标识</p>
     * @param ThrottleRuleId <p>限流规则标识</p>
     */
    public void setThrottleRuleId(Long ThrottleRuleId) {
        this.ThrottleRuleId = ThrottleRuleId;
    }

    /**
     * Get <p>限流类型</p><p>枚举值：</p><ul><li>1： 用户/客户端限流</li><li>2： 消费组限流</li><li>3： topic限流</li></ul> 
     * @return ThrottleType <p>限流类型</p><p>枚举值：</p><ul><li>1： 用户/客户端限流</li><li>2： 消费组限流</li><li>3： topic限流</li></ul>
     */
    public Long getThrottleType() {
        return this.ThrottleType;
    }

    /**
     * Set <p>限流类型</p><p>枚举值：</p><ul><li>1： 用户/客户端限流</li><li>2： 消费组限流</li><li>3： topic限流</li></ul>
     * @param ThrottleType <p>限流类型</p><p>枚举值：</p><ul><li>1： 用户/客户端限流</li><li>2： 消费组限流</li><li>3： topic限流</li></ul>
     */
    public void setThrottleType(Long ThrottleType) {
        this.ThrottleType = ThrottleType;
    }

    /**
     * Get <p>客户端id</p> 
     * @return ClientId <p>客户端id</p>
     */
    public String getClientId() {
        return this.ClientId;
    }

    /**
     * Set <p>客户端id</p>
     * @param ClientId <p>客户端id</p>
     */
    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    /**
     * Get <p>用户名</p> 
     * @return UserName <p>用户名</p>
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>用户名</p>
     * @param UserName <p>用户名</p>
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get <p>消费限流值,单位MB/s</p> 
     * @return ConsumeThrottle <p>消费限流值,单位MB/s</p>
     */
    public Long getConsumeThrottle() {
        return this.ConsumeThrottle;
    }

    /**
     * Set <p>消费限流值,单位MB/s</p>
     * @param ConsumeThrottle <p>消费限流值,单位MB/s</p>
     */
    public void setConsumeThrottle(Long ConsumeThrottle) {
        this.ConsumeThrottle = ConsumeThrottle;
    }

    /**
     * Get <p>更新时间</p> 
     * @return UpdateTime <p>更新时间</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p>
     * @param UpdateTime <p>更新时间</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>topic名称</p> 
     * @return TopicName <p>topic名称</p>
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set <p>topic名称</p>
     * @param TopicName <p>topic名称</p>
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get <p>topicId</p> 
     * @return TopicId <p>topicId</p>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>topicId</p>
     * @param TopicId <p>topicId</p>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    public ThrottleRuleDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ThrottleRuleDetail(ThrottleRuleDetail source) {
        if (source.ThrottleRuleId != null) {
            this.ThrottleRuleId = new Long(source.ThrottleRuleId);
        }
        if (source.ThrottleType != null) {
            this.ThrottleType = new Long(source.ThrottleType);
        }
        if (source.ClientId != null) {
            this.ClientId = new String(source.ClientId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.ConsumeThrottle != null) {
            this.ConsumeThrottle = new Long(source.ConsumeThrottle);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ThrottleRuleId", this.ThrottleRuleId);
        this.setParamSimple(map, prefix + "ThrottleType", this.ThrottleType);
        this.setParamSimple(map, prefix + "ClientId", this.ClientId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "ConsumeThrottle", this.ConsumeThrottle);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);

    }
}

