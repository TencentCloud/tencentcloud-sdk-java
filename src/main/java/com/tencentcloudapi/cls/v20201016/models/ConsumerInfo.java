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

public class ConsumerInfo extends AbstractModel {

    /**
    * <p>投递规则ID</p>
    */
    @SerializedName("ConsumerId")
    @Expose
    private String ConsumerId;

    /**
    * <p>日志主题ID</p>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>投递任务是否生效</p>
    */
    @SerializedName("Effective")
    @Expose
    private Boolean Effective;

    /**
    * <p>CKafka的描述</p>
    */
    @SerializedName("Ckafka")
    @Expose
    private Ckafka Ckafka;

    /**
    * <p>是否投递日志的元数据信息</p>
    */
    @SerializedName("NeedContent")
    @Expose
    private Boolean NeedContent;

    /**
    * <p>如果需要投递元数据信息，元数据信息的描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Content")
    @Expose
    private ConsumerContent Content;

    /**
    * <p>压缩方式[0:NONE；2:SNAPPY；3:LZ4]</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Compression")
    @Expose
    private Long Compression;

    /**
    * <p>投递任务创建毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>角色访问描述名 <a href="https://cloud.tencent.com/document/product/598/19381">创建角色</a></p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoleArn")
    @Expose
    private String RoleArn;

    /**
    * <p>外部ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExternalId")
    @Expose
    private String ExternalId;

    /**
    * <p>任务运行状态。支持<code>0</code>,<code>1</code>,<code>2</code> - <code>0</code>: 停止 - <code>1</code>: 运行中 - <code>2</code>: 异常</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskStatus")
    @Expose
    private Long TaskStatus;

    /**
    * <p>高级配置</p>
    */
    @SerializedName("AdvancedConfig")
    @Expose
    private AdvancedConsumerConfiguration AdvancedConfig;

    /**
    * <p>日志预过滤-数据写入 ckafka 的原始数据进行预过滤处理</p>
    */
    @SerializedName("DSLFilter")
    @Expose
    private String DSLFilter;

    /**
     * Get <p>投递规则ID</p> 
     * @return ConsumerId <p>投递规则ID</p>
     */
    public String getConsumerId() {
        return this.ConsumerId;
    }

    /**
     * Set <p>投递规则ID</p>
     * @param ConsumerId <p>投递规则ID</p>
     */
    public void setConsumerId(String ConsumerId) {
        this.ConsumerId = ConsumerId;
    }

    /**
     * Get <p>日志主题ID</p> 
     * @return TopicId <p>日志主题ID</p>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>日志主题ID</p>
     * @param TopicId <p>日志主题ID</p>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>投递任务是否生效</p> 
     * @return Effective <p>投递任务是否生效</p>
     */
    public Boolean getEffective() {
        return this.Effective;
    }

    /**
     * Set <p>投递任务是否生效</p>
     * @param Effective <p>投递任务是否生效</p>
     */
    public void setEffective(Boolean Effective) {
        this.Effective = Effective;
    }

    /**
     * Get <p>CKafka的描述</p> 
     * @return Ckafka <p>CKafka的描述</p>
     */
    public Ckafka getCkafka() {
        return this.Ckafka;
    }

    /**
     * Set <p>CKafka的描述</p>
     * @param Ckafka <p>CKafka的描述</p>
     */
    public void setCkafka(Ckafka Ckafka) {
        this.Ckafka = Ckafka;
    }

    /**
     * Get <p>是否投递日志的元数据信息</p> 
     * @return NeedContent <p>是否投递日志的元数据信息</p>
     */
    public Boolean getNeedContent() {
        return this.NeedContent;
    }

    /**
     * Set <p>是否投递日志的元数据信息</p>
     * @param NeedContent <p>是否投递日志的元数据信息</p>
     */
    public void setNeedContent(Boolean NeedContent) {
        this.NeedContent = NeedContent;
    }

    /**
     * Get <p>如果需要投递元数据信息，元数据信息的描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Content <p>如果需要投递元数据信息，元数据信息的描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ConsumerContent getContent() {
        return this.Content;
    }

    /**
     * Set <p>如果需要投递元数据信息，元数据信息的描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Content <p>如果需要投递元数据信息，元数据信息的描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContent(ConsumerContent Content) {
        this.Content = Content;
    }

    /**
     * Get <p>压缩方式[0:NONE；2:SNAPPY；3:LZ4]</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Compression <p>压缩方式[0:NONE；2:SNAPPY；3:LZ4]</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCompression() {
        return this.Compression;
    }

    /**
     * Set <p>压缩方式[0:NONE；2:SNAPPY；3:LZ4]</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Compression <p>压缩方式[0:NONE；2:SNAPPY；3:LZ4]</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompression(Long Compression) {
        this.Compression = Compression;
    }

    /**
     * Get <p>投递任务创建毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime <p>投递任务创建毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>投递任务创建毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime <p>投递任务创建毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>角色访问描述名 <a href="https://cloud.tencent.com/document/product/598/19381">创建角色</a></p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoleArn <p>角色访问描述名 <a href="https://cloud.tencent.com/document/product/598/19381">创建角色</a></p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRoleArn() {
        return this.RoleArn;
    }

    /**
     * Set <p>角色访问描述名 <a href="https://cloud.tencent.com/document/product/598/19381">创建角色</a></p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoleArn <p>角色访问描述名 <a href="https://cloud.tencent.com/document/product/598/19381">创建角色</a></p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoleArn(String RoleArn) {
        this.RoleArn = RoleArn;
    }

    /**
     * Get <p>外部ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExternalId <p>外部ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExternalId() {
        return this.ExternalId;
    }

    /**
     * Set <p>外部ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExternalId <p>外部ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExternalId(String ExternalId) {
        this.ExternalId = ExternalId;
    }

    /**
     * Get <p>任务运行状态。支持<code>0</code>,<code>1</code>,<code>2</code> - <code>0</code>: 停止 - <code>1</code>: 运行中 - <code>2</code>: 异常</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskStatus <p>任务运行状态。支持<code>0</code>,<code>1</code>,<code>2</code> - <code>0</code>: 停止 - <code>1</code>: 运行中 - <code>2</code>: 异常</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set <p>任务运行状态。支持<code>0</code>,<code>1</code>,<code>2</code> - <code>0</code>: 停止 - <code>1</code>: 运行中 - <code>2</code>: 异常</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskStatus <p>任务运行状态。支持<code>0</code>,<code>1</code>,<code>2</code> - <code>0</code>: 停止 - <code>1</code>: 运行中 - <code>2</code>: 异常</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskStatus(Long TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get <p>高级配置</p> 
     * @return AdvancedConfig <p>高级配置</p>
     */
    public AdvancedConsumerConfiguration getAdvancedConfig() {
        return this.AdvancedConfig;
    }

    /**
     * Set <p>高级配置</p>
     * @param AdvancedConfig <p>高级配置</p>
     */
    public void setAdvancedConfig(AdvancedConsumerConfiguration AdvancedConfig) {
        this.AdvancedConfig = AdvancedConfig;
    }

    /**
     * Get <p>日志预过滤-数据写入 ckafka 的原始数据进行预过滤处理</p> 
     * @return DSLFilter <p>日志预过滤-数据写入 ckafka 的原始数据进行预过滤处理</p>
     */
    public String getDSLFilter() {
        return this.DSLFilter;
    }

    /**
     * Set <p>日志预过滤-数据写入 ckafka 的原始数据进行预过滤处理</p>
     * @param DSLFilter <p>日志预过滤-数据写入 ckafka 的原始数据进行预过滤处理</p>
     */
    public void setDSLFilter(String DSLFilter) {
        this.DSLFilter = DSLFilter;
    }

    public ConsumerInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConsumerInfo(ConsumerInfo source) {
        if (source.ConsumerId != null) {
            this.ConsumerId = new String(source.ConsumerId);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Effective != null) {
            this.Effective = new Boolean(source.Effective);
        }
        if (source.Ckafka != null) {
            this.Ckafka = new Ckafka(source.Ckafka);
        }
        if (source.NeedContent != null) {
            this.NeedContent = new Boolean(source.NeedContent);
        }
        if (source.Content != null) {
            this.Content = new ConsumerContent(source.Content);
        }
        if (source.Compression != null) {
            this.Compression = new Long(source.Compression);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.RoleArn != null) {
            this.RoleArn = new String(source.RoleArn);
        }
        if (source.ExternalId != null) {
            this.ExternalId = new String(source.ExternalId);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new Long(source.TaskStatus);
        }
        if (source.AdvancedConfig != null) {
            this.AdvancedConfig = new AdvancedConsumerConfiguration(source.AdvancedConfig);
        }
        if (source.DSLFilter != null) {
            this.DSLFilter = new String(source.DSLFilter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConsumerId", this.ConsumerId);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Effective", this.Effective);
        this.setParamObj(map, prefix + "Ckafka.", this.Ckafka);
        this.setParamSimple(map, prefix + "NeedContent", this.NeedContent);
        this.setParamObj(map, prefix + "Content.", this.Content);
        this.setParamSimple(map, prefix + "Compression", this.Compression);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "RoleArn", this.RoleArn);
        this.setParamSimple(map, prefix + "ExternalId", this.ExternalId);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamObj(map, prefix + "AdvancedConfig.", this.AdvancedConfig);
        this.setParamSimple(map, prefix + "DSLFilter", this.DSLFilter);

    }
}

