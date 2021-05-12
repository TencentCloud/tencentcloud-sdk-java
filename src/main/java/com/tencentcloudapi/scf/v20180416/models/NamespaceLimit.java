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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NamespaceLimit extends AbstractModel{

    /**
    * 函数总数
    */
    @SerializedName("FunctionsCount")
    @Expose
    private Long FunctionsCount;

    /**
    * Trigger信息
    */
    @SerializedName("Trigger")
    @Expose
    private TriggerCount Trigger;

    /**
    * Namespace名称
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 并发量
    */
    @SerializedName("ConcurrentExecutions")
    @Expose
    private Long ConcurrentExecutions;

    /**
    * Timeout限制
    */
    @SerializedName("TimeoutLimit")
    @Expose
    private Long TimeoutLimit;

    /**
    * 测试事件限制
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TestModelLimit")
    @Expose
    private Long TestModelLimit;

    /**
    * 初始化超时限制
    */
    @SerializedName("InitTimeoutLimit")
    @Expose
    private Long InitTimeoutLimit;

    /**
    * 异步重试次数限制
    */
    @SerializedName("RetryNumLimit")
    @Expose
    private Long RetryNumLimit;

    /**
    * 异步重试消息保留时间下限
    */
    @SerializedName("MinMsgTTL")
    @Expose
    private Long MinMsgTTL;

    /**
    * 异步重试消息保留时间上限
    */
    @SerializedName("MaxMsgTTL")
    @Expose
    private Long MaxMsgTTL;

    /**
     * Get 函数总数 
     * @return FunctionsCount 函数总数
     */
    public Long getFunctionsCount() {
        return this.FunctionsCount;
    }

    /**
     * Set 函数总数
     * @param FunctionsCount 函数总数
     */
    public void setFunctionsCount(Long FunctionsCount) {
        this.FunctionsCount = FunctionsCount;
    }

    /**
     * Get Trigger信息 
     * @return Trigger Trigger信息
     */
    public TriggerCount getTrigger() {
        return this.Trigger;
    }

    /**
     * Set Trigger信息
     * @param Trigger Trigger信息
     */
    public void setTrigger(TriggerCount Trigger) {
        this.Trigger = Trigger;
    }

    /**
     * Get Namespace名称 
     * @return Namespace Namespace名称
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Namespace名称
     * @param Namespace Namespace名称
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 并发量 
     * @return ConcurrentExecutions 并发量
     */
    public Long getConcurrentExecutions() {
        return this.ConcurrentExecutions;
    }

    /**
     * Set 并发量
     * @param ConcurrentExecutions 并发量
     */
    public void setConcurrentExecutions(Long ConcurrentExecutions) {
        this.ConcurrentExecutions = ConcurrentExecutions;
    }

    /**
     * Get Timeout限制 
     * @return TimeoutLimit Timeout限制
     */
    public Long getTimeoutLimit() {
        return this.TimeoutLimit;
    }

    /**
     * Set Timeout限制
     * @param TimeoutLimit Timeout限制
     */
    public void setTimeoutLimit(Long TimeoutLimit) {
        this.TimeoutLimit = TimeoutLimit;
    }

    /**
     * Get 测试事件限制
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TestModelLimit 测试事件限制
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTestModelLimit() {
        return this.TestModelLimit;
    }

    /**
     * Set 测试事件限制
注意：此字段可能返回 null，表示取不到有效值。
     * @param TestModelLimit 测试事件限制
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTestModelLimit(Long TestModelLimit) {
        this.TestModelLimit = TestModelLimit;
    }

    /**
     * Get 初始化超时限制 
     * @return InitTimeoutLimit 初始化超时限制
     */
    public Long getInitTimeoutLimit() {
        return this.InitTimeoutLimit;
    }

    /**
     * Set 初始化超时限制
     * @param InitTimeoutLimit 初始化超时限制
     */
    public void setInitTimeoutLimit(Long InitTimeoutLimit) {
        this.InitTimeoutLimit = InitTimeoutLimit;
    }

    /**
     * Get 异步重试次数限制 
     * @return RetryNumLimit 异步重试次数限制
     */
    public Long getRetryNumLimit() {
        return this.RetryNumLimit;
    }

    /**
     * Set 异步重试次数限制
     * @param RetryNumLimit 异步重试次数限制
     */
    public void setRetryNumLimit(Long RetryNumLimit) {
        this.RetryNumLimit = RetryNumLimit;
    }

    /**
     * Get 异步重试消息保留时间下限 
     * @return MinMsgTTL 异步重试消息保留时间下限
     */
    public Long getMinMsgTTL() {
        return this.MinMsgTTL;
    }

    /**
     * Set 异步重试消息保留时间下限
     * @param MinMsgTTL 异步重试消息保留时间下限
     */
    public void setMinMsgTTL(Long MinMsgTTL) {
        this.MinMsgTTL = MinMsgTTL;
    }

    /**
     * Get 异步重试消息保留时间上限 
     * @return MaxMsgTTL 异步重试消息保留时间上限
     */
    public Long getMaxMsgTTL() {
        return this.MaxMsgTTL;
    }

    /**
     * Set 异步重试消息保留时间上限
     * @param MaxMsgTTL 异步重试消息保留时间上限
     */
    public void setMaxMsgTTL(Long MaxMsgTTL) {
        this.MaxMsgTTL = MaxMsgTTL;
    }

    public NamespaceLimit() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NamespaceLimit(NamespaceLimit source) {
        if (source.FunctionsCount != null) {
            this.FunctionsCount = new Long(source.FunctionsCount);
        }
        if (source.Trigger != null) {
            this.Trigger = new TriggerCount(source.Trigger);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.ConcurrentExecutions != null) {
            this.ConcurrentExecutions = new Long(source.ConcurrentExecutions);
        }
        if (source.TimeoutLimit != null) {
            this.TimeoutLimit = new Long(source.TimeoutLimit);
        }
        if (source.TestModelLimit != null) {
            this.TestModelLimit = new Long(source.TestModelLimit);
        }
        if (source.InitTimeoutLimit != null) {
            this.InitTimeoutLimit = new Long(source.InitTimeoutLimit);
        }
        if (source.RetryNumLimit != null) {
            this.RetryNumLimit = new Long(source.RetryNumLimit);
        }
        if (source.MinMsgTTL != null) {
            this.MinMsgTTL = new Long(source.MinMsgTTL);
        }
        if (source.MaxMsgTTL != null) {
            this.MaxMsgTTL = new Long(source.MaxMsgTTL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionsCount", this.FunctionsCount);
        this.setParamObj(map, prefix + "Trigger.", this.Trigger);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "ConcurrentExecutions", this.ConcurrentExecutions);
        this.setParamSimple(map, prefix + "TimeoutLimit", this.TimeoutLimit);
        this.setParamSimple(map, prefix + "TestModelLimit", this.TestModelLimit);
        this.setParamSimple(map, prefix + "InitTimeoutLimit", this.InitTimeoutLimit);
        this.setParamSimple(map, prefix + "RetryNumLimit", this.RetryNumLimit);
        this.setParamSimple(map, prefix + "MinMsgTTL", this.MinMsgTTL);
        this.setParamSimple(map, prefix + "MaxMsgTTL", this.MaxMsgTTL);

    }
}

