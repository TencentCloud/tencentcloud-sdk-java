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

public class CreateCLSDeliverTaskRequest extends AbstractModel {

    /**
    * <p>任务名称</p><p>参数格式：<code>^[a-zA-Z0-9_-]{1,64}$</code></p>
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * <p>源主题信息</p>
    */
    @SerializedName("SourceTopicConfig")
    @Expose
    private SourceTopicConfig SourceTopicConfig;

    /**
    * <p>目标主题信息</p>
    */
    @SerializedName("TargetTopicConfig")
    @Expose
    private TargetTopicConfig TargetTopicConfig;

    /**
    * <p>投递规则</p>
    */
    @SerializedName("DeliverRule")
    @Expose
    private DeliverRule DeliverRule;

    /**
    * <p>合规承诺。</p><p>枚举值：</p><ul><li>1： 同意数据跨域传输条款</li></ul>
    */
    @SerializedName("Compliance")
    @Expose
    private Long Compliance;

    /**
    * <p>是否开启投递服务日志。</p><p>枚举值：</p><ul><li>1： 关闭</li><li>2： 开启</li></ul><p>默认值：2</p>
    */
    @SerializedName("HasServicesLog")
    @Expose
    private Long HasServicesLog;

    /**
     * Get <p>任务名称</p><p>参数格式：<code>^[a-zA-Z0-9_-]{1,64}$</code></p> 
     * @return TaskName <p>任务名称</p><p>参数格式：<code>^[a-zA-Z0-9_-]{1,64}$</code></p>
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set <p>任务名称</p><p>参数格式：<code>^[a-zA-Z0-9_-]{1,64}$</code></p>
     * @param TaskName <p>任务名称</p><p>参数格式：<code>^[a-zA-Z0-9_-]{1,64}$</code></p>
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get <p>源主题信息</p> 
     * @return SourceTopicConfig <p>源主题信息</p>
     */
    public SourceTopicConfig getSourceTopicConfig() {
        return this.SourceTopicConfig;
    }

    /**
     * Set <p>源主题信息</p>
     * @param SourceTopicConfig <p>源主题信息</p>
     */
    public void setSourceTopicConfig(SourceTopicConfig SourceTopicConfig) {
        this.SourceTopicConfig = SourceTopicConfig;
    }

    /**
     * Get <p>目标主题信息</p> 
     * @return TargetTopicConfig <p>目标主题信息</p>
     */
    public TargetTopicConfig getTargetTopicConfig() {
        return this.TargetTopicConfig;
    }

    /**
     * Set <p>目标主题信息</p>
     * @param TargetTopicConfig <p>目标主题信息</p>
     */
    public void setTargetTopicConfig(TargetTopicConfig TargetTopicConfig) {
        this.TargetTopicConfig = TargetTopicConfig;
    }

    /**
     * Get <p>投递规则</p> 
     * @return DeliverRule <p>投递规则</p>
     */
    public DeliverRule getDeliverRule() {
        return this.DeliverRule;
    }

    /**
     * Set <p>投递规则</p>
     * @param DeliverRule <p>投递规则</p>
     */
    public void setDeliverRule(DeliverRule DeliverRule) {
        this.DeliverRule = DeliverRule;
    }

    /**
     * Get <p>合规承诺。</p><p>枚举值：</p><ul><li>1： 同意数据跨域传输条款</li></ul> 
     * @return Compliance <p>合规承诺。</p><p>枚举值：</p><ul><li>1： 同意数据跨域传输条款</li></ul>
     */
    public Long getCompliance() {
        return this.Compliance;
    }

    /**
     * Set <p>合规承诺。</p><p>枚举值：</p><ul><li>1： 同意数据跨域传输条款</li></ul>
     * @param Compliance <p>合规承诺。</p><p>枚举值：</p><ul><li>1： 同意数据跨域传输条款</li></ul>
     */
    public void setCompliance(Long Compliance) {
        this.Compliance = Compliance;
    }

    /**
     * Get <p>是否开启投递服务日志。</p><p>枚举值：</p><ul><li>1： 关闭</li><li>2： 开启</li></ul><p>默认值：2</p> 
     * @return HasServicesLog <p>是否开启投递服务日志。</p><p>枚举值：</p><ul><li>1： 关闭</li><li>2： 开启</li></ul><p>默认值：2</p>
     */
    public Long getHasServicesLog() {
        return this.HasServicesLog;
    }

    /**
     * Set <p>是否开启投递服务日志。</p><p>枚举值：</p><ul><li>1： 关闭</li><li>2： 开启</li></ul><p>默认值：2</p>
     * @param HasServicesLog <p>是否开启投递服务日志。</p><p>枚举值：</p><ul><li>1： 关闭</li><li>2： 开启</li></ul><p>默认值：2</p>
     */
    public void setHasServicesLog(Long HasServicesLog) {
        this.HasServicesLog = HasServicesLog;
    }

    public CreateCLSDeliverTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCLSDeliverTaskRequest(CreateCLSDeliverTaskRequest source) {
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.SourceTopicConfig != null) {
            this.SourceTopicConfig = new SourceTopicConfig(source.SourceTopicConfig);
        }
        if (source.TargetTopicConfig != null) {
            this.TargetTopicConfig = new TargetTopicConfig(source.TargetTopicConfig);
        }
        if (source.DeliverRule != null) {
            this.DeliverRule = new DeliverRule(source.DeliverRule);
        }
        if (source.Compliance != null) {
            this.Compliance = new Long(source.Compliance);
        }
        if (source.HasServicesLog != null) {
            this.HasServicesLog = new Long(source.HasServicesLog);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamObj(map, prefix + "SourceTopicConfig.", this.SourceTopicConfig);
        this.setParamObj(map, prefix + "TargetTopicConfig.", this.TargetTopicConfig);
        this.setParamObj(map, prefix + "DeliverRule.", this.DeliverRule);
        this.setParamSimple(map, prefix + "Compliance", this.Compliance);
        this.setParamSimple(map, prefix + "HasServicesLog", this.HasServicesLog);

    }
}

