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

public class CreateThrottleRuleRequest extends AbstractModel {

    /**
    * <p>实例Id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>限流类型:</p><p>枚举值：</p><ul><li>1： 用户/客户端限流</li><li>2： 消费组维度限流</li><li>3： Topic限流</li></ul>
    */
    @SerializedName("ThrottleType")
    @Expose
    private Long ThrottleType;

    /**
    * <p>消费组名</p>
    */
    @SerializedName("GroupNameList")
    @Expose
    private String [] GroupNameList;

    /**
    * <p>消费限流值,生产消费限流值,必填一个单位MB/s</p>
    */
    @SerializedName("ConsumeThrottle")
    @Expose
    private Long ConsumeThrottle;

    /**
    * <p>生产限流值,生产消费限流值,单位MB/s</p>
    */
    @SerializedName("ProduceThrottle")
    @Expose
    private Long ProduceThrottle;

    /**
    * <p>用户客户端id</p>
    */
    @SerializedName("ClientIdList")
    @Expose
    private String [] ClientIdList;

    /**
    * <p>用户名</p>
    */
    @SerializedName("UserNameList")
    @Expose
    private String [] UserNameList;

    /**
    * <p>topic名称</p>
    */
    @SerializedName("TopicNameList")
    @Expose
    private String [] TopicNameList;

    /**
     * Get <p>实例Id</p> 
     * @return InstanceId <p>实例Id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例Id</p>
     * @param InstanceId <p>实例Id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>限流类型:</p><p>枚举值：</p><ul><li>1： 用户/客户端限流</li><li>2： 消费组维度限流</li><li>3： Topic限流</li></ul> 
     * @return ThrottleType <p>限流类型:</p><p>枚举值：</p><ul><li>1： 用户/客户端限流</li><li>2： 消费组维度限流</li><li>3： Topic限流</li></ul>
     */
    public Long getThrottleType() {
        return this.ThrottleType;
    }

    /**
     * Set <p>限流类型:</p><p>枚举值：</p><ul><li>1： 用户/客户端限流</li><li>2： 消费组维度限流</li><li>3： Topic限流</li></ul>
     * @param ThrottleType <p>限流类型:</p><p>枚举值：</p><ul><li>1： 用户/客户端限流</li><li>2： 消费组维度限流</li><li>3： Topic限流</li></ul>
     */
    public void setThrottleType(Long ThrottleType) {
        this.ThrottleType = ThrottleType;
    }

    /**
     * Get <p>消费组名</p> 
     * @return GroupNameList <p>消费组名</p>
     */
    public String [] getGroupNameList() {
        return this.GroupNameList;
    }

    /**
     * Set <p>消费组名</p>
     * @param GroupNameList <p>消费组名</p>
     */
    public void setGroupNameList(String [] GroupNameList) {
        this.GroupNameList = GroupNameList;
    }

    /**
     * Get <p>消费限流值,生产消费限流值,必填一个单位MB/s</p> 
     * @return ConsumeThrottle <p>消费限流值,生产消费限流值,必填一个单位MB/s</p>
     */
    public Long getConsumeThrottle() {
        return this.ConsumeThrottle;
    }

    /**
     * Set <p>消费限流值,生产消费限流值,必填一个单位MB/s</p>
     * @param ConsumeThrottle <p>消费限流值,生产消费限流值,必填一个单位MB/s</p>
     */
    public void setConsumeThrottle(Long ConsumeThrottle) {
        this.ConsumeThrottle = ConsumeThrottle;
    }

    /**
     * Get <p>生产限流值,生产消费限流值,单位MB/s</p> 
     * @return ProduceThrottle <p>生产限流值,生产消费限流值,单位MB/s</p>
     */
    public Long getProduceThrottle() {
        return this.ProduceThrottle;
    }

    /**
     * Set <p>生产限流值,生产消费限流值,单位MB/s</p>
     * @param ProduceThrottle <p>生产限流值,生产消费限流值,单位MB/s</p>
     */
    public void setProduceThrottle(Long ProduceThrottle) {
        this.ProduceThrottle = ProduceThrottle;
    }

    /**
     * Get <p>用户客户端id</p> 
     * @return ClientIdList <p>用户客户端id</p>
     */
    public String [] getClientIdList() {
        return this.ClientIdList;
    }

    /**
     * Set <p>用户客户端id</p>
     * @param ClientIdList <p>用户客户端id</p>
     */
    public void setClientIdList(String [] ClientIdList) {
        this.ClientIdList = ClientIdList;
    }

    /**
     * Get <p>用户名</p> 
     * @return UserNameList <p>用户名</p>
     */
    public String [] getUserNameList() {
        return this.UserNameList;
    }

    /**
     * Set <p>用户名</p>
     * @param UserNameList <p>用户名</p>
     */
    public void setUserNameList(String [] UserNameList) {
        this.UserNameList = UserNameList;
    }

    /**
     * Get <p>topic名称</p> 
     * @return TopicNameList <p>topic名称</p>
     */
    public String [] getTopicNameList() {
        return this.TopicNameList;
    }

    /**
     * Set <p>topic名称</p>
     * @param TopicNameList <p>topic名称</p>
     */
    public void setTopicNameList(String [] TopicNameList) {
        this.TopicNameList = TopicNameList;
    }

    public CreateThrottleRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateThrottleRuleRequest(CreateThrottleRuleRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ThrottleType != null) {
            this.ThrottleType = new Long(source.ThrottleType);
        }
        if (source.GroupNameList != null) {
            this.GroupNameList = new String[source.GroupNameList.length];
            for (int i = 0; i < source.GroupNameList.length; i++) {
                this.GroupNameList[i] = new String(source.GroupNameList[i]);
            }
        }
        if (source.ConsumeThrottle != null) {
            this.ConsumeThrottle = new Long(source.ConsumeThrottle);
        }
        if (source.ProduceThrottle != null) {
            this.ProduceThrottle = new Long(source.ProduceThrottle);
        }
        if (source.ClientIdList != null) {
            this.ClientIdList = new String[source.ClientIdList.length];
            for (int i = 0; i < source.ClientIdList.length; i++) {
                this.ClientIdList[i] = new String(source.ClientIdList[i]);
            }
        }
        if (source.UserNameList != null) {
            this.UserNameList = new String[source.UserNameList.length];
            for (int i = 0; i < source.UserNameList.length; i++) {
                this.UserNameList[i] = new String(source.UserNameList[i]);
            }
        }
        if (source.TopicNameList != null) {
            this.TopicNameList = new String[source.TopicNameList.length];
            for (int i = 0; i < source.TopicNameList.length; i++) {
                this.TopicNameList[i] = new String(source.TopicNameList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ThrottleType", this.ThrottleType);
        this.setParamArraySimple(map, prefix + "GroupNameList.", this.GroupNameList);
        this.setParamSimple(map, prefix + "ConsumeThrottle", this.ConsumeThrottle);
        this.setParamSimple(map, prefix + "ProduceThrottle", this.ProduceThrottle);
        this.setParamArraySimple(map, prefix + "ClientIdList.", this.ClientIdList);
        this.setParamArraySimple(map, prefix + "UserNameList.", this.UserNameList);
        this.setParamArraySimple(map, prefix + "TopicNameList.", this.TopicNameList);

    }
}

