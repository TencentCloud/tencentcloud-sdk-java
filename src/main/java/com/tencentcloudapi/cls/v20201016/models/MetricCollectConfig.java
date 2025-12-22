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

public class MetricCollectConfig extends AbstractModel {

    /**
    * 采集配置id
    */
    @SerializedName("ConfigId")
    @Expose
    private String ConfigId;

    /**
    * 日志主题id。
    */
    @SerializedName("TopicIds")
    @Expose
    private String [] TopicIds;

    /**
    * 采集配置来源。支持 ：`0`、`1`
- 0:自建k8s
- 1:TKE
    */
    @SerializedName("Source")
    @Expose
    private Long Source;

    /**
    * 机器组id。
    */
    @SerializedName("GroupIds")
    @Expose
    private String [] GroupIds;

    /**
    * 监控类型。支持 ：`0`、`1`，不支持修改

- 0:基础监控
- 1:自定义监控, 
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 采集配置方式。支持 ：`0`、`1`，不支持修改
- 0:普通配置方式，Type字段只能为：`1`
- 1:YAML导入方式，Type 可以是：`0`或者`1`
    */
    @SerializedName("Flag")
    @Expose
    private Long Flag;

    /**
    * 名称：长度不超过253字符，校验格式  ` [a-z0-9]([-a-z0-9]*[a-z0-9])?(\.[a-z0-9]([-a-z0-9]*[a-z0-9])?)*`。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 采集对象, Flag=0时生效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Spec")
    @Expose
    private MetricSpec Spec;

    /**
    * 标签处理, Flag=0时生效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetricRelabels")
    @Expose
    private Relabeling [] MetricRelabels;

    /**
    * 自定义元数据, Flag=0时生效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetricLabel")
    @Expose
    private MetricConfigLabel MetricLabel;

    /**
    * 通信协议 `http`、`https`；Flag=0时生效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Scheme")
    @Expose
    private String Scheme;

    /**
    * 采集频率,  Flag=0时生效
- 校验格式：`^(((\d+)y)?((\d+)w)?((\d+)d)?((\d+)h)?((\d+)m)?((\d+)s)?((\d+)ms)?|0)$`
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScrapeInterval")
    @Expose
    private String ScrapeInterval;

    /**
    * 采集超时时间。  Flag=0 && Type=1时生效
- format:`^(((\d+)y)?((\d+)w)?((\d+)d)?((\d+)h)?((\d+)m)?((\d+)s)?((\d+)ms)?|0)$`

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScrapeTimeout")
    @Expose
    private String ScrapeTimeout;

    /**
    * Prometheus如何处理标签之间的冲突。当Flag=0生效，支持`true`,`false`

- `false`:配置数据中冲突的标签重命名
- `true`:忽略冲突的服务器端标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HonorLabels")
    @Expose
    private Boolean HonorLabels;

    /**
    * 采集配置yaml格式字符串, Flag=1时必填
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("YamlSpec")
    @Expose
    private MetricYamlSpec YamlSpec;

    /**
    * 操作状态,0:应用,1:暂停
    */
    @SerializedName("Operate")
    @Expose
    private Long Operate;

    /**
    * 创建时间戳 秒级
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 更新时间戳 秒级
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
     * Get 采集配置id 
     * @return ConfigId 采集配置id
     */
    public String getConfigId() {
        return this.ConfigId;
    }

    /**
     * Set 采集配置id
     * @param ConfigId 采集配置id
     */
    public void setConfigId(String ConfigId) {
        this.ConfigId = ConfigId;
    }

    /**
     * Get 日志主题id。 
     * @return TopicIds 日志主题id。
     */
    public String [] getTopicIds() {
        return this.TopicIds;
    }

    /**
     * Set 日志主题id。
     * @param TopicIds 日志主题id。
     */
    public void setTopicIds(String [] TopicIds) {
        this.TopicIds = TopicIds;
    }

    /**
     * Get 采集配置来源。支持 ：`0`、`1`
- 0:自建k8s
- 1:TKE 
     * @return Source 采集配置来源。支持 ：`0`、`1`
- 0:自建k8s
- 1:TKE
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set 采集配置来源。支持 ：`0`、`1`
- 0:自建k8s
- 1:TKE
     * @param Source 采集配置来源。支持 ：`0`、`1`
- 0:自建k8s
- 1:TKE
     */
    public void setSource(Long Source) {
        this.Source = Source;
    }

    /**
     * Get 机器组id。 
     * @return GroupIds 机器组id。
     */
    public String [] getGroupIds() {
        return this.GroupIds;
    }

    /**
     * Set 机器组id。
     * @param GroupIds 机器组id。
     */
    public void setGroupIds(String [] GroupIds) {
        this.GroupIds = GroupIds;
    }

    /**
     * Get 监控类型。支持 ：`0`、`1`，不支持修改

- 0:基础监控
- 1:自定义监控,  
     * @return Type 监控类型。支持 ：`0`、`1`，不支持修改

- 0:基础监控
- 1:自定义监控, 
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 监控类型。支持 ：`0`、`1`，不支持修改

- 0:基础监控
- 1:自定义监控, 
     * @param Type 监控类型。支持 ：`0`、`1`，不支持修改

- 0:基础监控
- 1:自定义监控, 
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 采集配置方式。支持 ：`0`、`1`，不支持修改
- 0:普通配置方式，Type字段只能为：`1`
- 1:YAML导入方式，Type 可以是：`0`或者`1` 
     * @return Flag 采集配置方式。支持 ：`0`、`1`，不支持修改
- 0:普通配置方式，Type字段只能为：`1`
- 1:YAML导入方式，Type 可以是：`0`或者`1`
     */
    public Long getFlag() {
        return this.Flag;
    }

    /**
     * Set 采集配置方式。支持 ：`0`、`1`，不支持修改
- 0:普通配置方式，Type字段只能为：`1`
- 1:YAML导入方式，Type 可以是：`0`或者`1`
     * @param Flag 采集配置方式。支持 ：`0`、`1`，不支持修改
- 0:普通配置方式，Type字段只能为：`1`
- 1:YAML导入方式，Type 可以是：`0`或者`1`
     */
    public void setFlag(Long Flag) {
        this.Flag = Flag;
    }

    /**
     * Get 名称：长度不超过253字符，校验格式  ` [a-z0-9]([-a-z0-9]*[a-z0-9])?(\.[a-z0-9]([-a-z0-9]*[a-z0-9])?)*`。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 名称：长度不超过253字符，校验格式  ` [a-z0-9]([-a-z0-9]*[a-z0-9])?(\.[a-z0-9]([-a-z0-9]*[a-z0-9])?)*`。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称：长度不超过253字符，校验格式  ` [a-z0-9]([-a-z0-9]*[a-z0-9])?(\.[a-z0-9]([-a-z0-9]*[a-z0-9])?)*`。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 名称：长度不超过253字符，校验格式  ` [a-z0-9]([-a-z0-9]*[a-z0-9])?(\.[a-z0-9]([-a-z0-9]*[a-z0-9])?)*`。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 采集对象, Flag=0时生效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Spec 采集对象, Flag=0时生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MetricSpec getSpec() {
        return this.Spec;
    }

    /**
     * Set 采集对象, Flag=0时生效
注意：此字段可能返回 null，表示取不到有效值。
     * @param Spec 采集对象, Flag=0时生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpec(MetricSpec Spec) {
        this.Spec = Spec;
    }

    /**
     * Get 标签处理, Flag=0时生效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetricRelabels 标签处理, Flag=0时生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Relabeling [] getMetricRelabels() {
        return this.MetricRelabels;
    }

    /**
     * Set 标签处理, Flag=0时生效
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetricRelabels 标签处理, Flag=0时生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetricRelabels(Relabeling [] MetricRelabels) {
        this.MetricRelabels = MetricRelabels;
    }

    /**
     * Get 自定义元数据, Flag=0时生效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetricLabel 自定义元数据, Flag=0时生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MetricConfigLabel getMetricLabel() {
        return this.MetricLabel;
    }

    /**
     * Set 自定义元数据, Flag=0时生效
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetricLabel 自定义元数据, Flag=0时生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetricLabel(MetricConfigLabel MetricLabel) {
        this.MetricLabel = MetricLabel;
    }

    /**
     * Get 通信协议 `http`、`https`；Flag=0时生效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Scheme 通信协议 `http`、`https`；Flag=0时生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScheme() {
        return this.Scheme;
    }

    /**
     * Set 通信协议 `http`、`https`；Flag=0时生效
注意：此字段可能返回 null，表示取不到有效值。
     * @param Scheme 通信协议 `http`、`https`；Flag=0时生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScheme(String Scheme) {
        this.Scheme = Scheme;
    }

    /**
     * Get 采集频率,  Flag=0时生效
- 校验格式：`^(((\d+)y)?((\d+)w)?((\d+)d)?((\d+)h)?((\d+)m)?((\d+)s)?((\d+)ms)?|0)$`
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScrapeInterval 采集频率,  Flag=0时生效
- 校验格式：`^(((\d+)y)?((\d+)w)?((\d+)d)?((\d+)h)?((\d+)m)?((\d+)s)?((\d+)ms)?|0)$`
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScrapeInterval() {
        return this.ScrapeInterval;
    }

    /**
     * Set 采集频率,  Flag=0时生效
- 校验格式：`^(((\d+)y)?((\d+)w)?((\d+)d)?((\d+)h)?((\d+)m)?((\d+)s)?((\d+)ms)?|0)$`
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScrapeInterval 采集频率,  Flag=0时生效
- 校验格式：`^(((\d+)y)?((\d+)w)?((\d+)d)?((\d+)h)?((\d+)m)?((\d+)s)?((\d+)ms)?|0)$`
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScrapeInterval(String ScrapeInterval) {
        this.ScrapeInterval = ScrapeInterval;
    }

    /**
     * Get 采集超时时间。  Flag=0 && Type=1时生效
- format:`^(((\d+)y)?((\d+)w)?((\d+)d)?((\d+)h)?((\d+)m)?((\d+)s)?((\d+)ms)?|0)$`

注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScrapeTimeout 采集超时时间。  Flag=0 && Type=1时生效
- format:`^(((\d+)y)?((\d+)w)?((\d+)d)?((\d+)h)?((\d+)m)?((\d+)s)?((\d+)ms)?|0)$`

注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScrapeTimeout() {
        return this.ScrapeTimeout;
    }

    /**
     * Set 采集超时时间。  Flag=0 && Type=1时生效
- format:`^(((\d+)y)?((\d+)w)?((\d+)d)?((\d+)h)?((\d+)m)?((\d+)s)?((\d+)ms)?|0)$`

注意：此字段可能返回 null，表示取不到有效值。
     * @param ScrapeTimeout 采集超时时间。  Flag=0 && Type=1时生效
- format:`^(((\d+)y)?((\d+)w)?((\d+)d)?((\d+)h)?((\d+)m)?((\d+)s)?((\d+)ms)?|0)$`

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScrapeTimeout(String ScrapeTimeout) {
        this.ScrapeTimeout = ScrapeTimeout;
    }

    /**
     * Get Prometheus如何处理标签之间的冲突。当Flag=0生效，支持`true`,`false`

- `false`:配置数据中冲突的标签重命名
- `true`:忽略冲突的服务器端标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HonorLabels Prometheus如何处理标签之间的冲突。当Flag=0生效，支持`true`,`false`

- `false`:配置数据中冲突的标签重命名
- `true`:忽略冲突的服务器端标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getHonorLabels() {
        return this.HonorLabels;
    }

    /**
     * Set Prometheus如何处理标签之间的冲突。当Flag=0生效，支持`true`,`false`

- `false`:配置数据中冲突的标签重命名
- `true`:忽略冲突的服务器端标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param HonorLabels Prometheus如何处理标签之间的冲突。当Flag=0生效，支持`true`,`false`

- `false`:配置数据中冲突的标签重命名
- `true`:忽略冲突的服务器端标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHonorLabels(Boolean HonorLabels) {
        this.HonorLabels = HonorLabels;
    }

    /**
     * Get 采集配置yaml格式字符串, Flag=1时必填
注意：此字段可能返回 null，表示取不到有效值。 
     * @return YamlSpec 采集配置yaml格式字符串, Flag=1时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MetricYamlSpec getYamlSpec() {
        return this.YamlSpec;
    }

    /**
     * Set 采集配置yaml格式字符串, Flag=1时必填
注意：此字段可能返回 null，表示取不到有效值。
     * @param YamlSpec 采集配置yaml格式字符串, Flag=1时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setYamlSpec(MetricYamlSpec YamlSpec) {
        this.YamlSpec = YamlSpec;
    }

    /**
     * Get 操作状态,0:应用,1:暂停 
     * @return Operate 操作状态,0:应用,1:暂停
     */
    public Long getOperate() {
        return this.Operate;
    }

    /**
     * Set 操作状态,0:应用,1:暂停
     * @param Operate 操作状态,0:应用,1:暂停
     */
    public void setOperate(Long Operate) {
        this.Operate = Operate;
    }

    /**
     * Get 创建时间戳 秒级 
     * @return CreateTime 创建时间戳 秒级
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间戳 秒级
     * @param CreateTime 创建时间戳 秒级
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间戳 秒级 
     * @return UpdateTime 更新时间戳 秒级
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间戳 秒级
     * @param UpdateTime 更新时间戳 秒级
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public MetricCollectConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MetricCollectConfig(MetricCollectConfig source) {
        if (source.ConfigId != null) {
            this.ConfigId = new String(source.ConfigId);
        }
        if (source.TopicIds != null) {
            this.TopicIds = new String[source.TopicIds.length];
            for (int i = 0; i < source.TopicIds.length; i++) {
                this.TopicIds[i] = new String(source.TopicIds[i]);
            }
        }
        if (source.Source != null) {
            this.Source = new Long(source.Source);
        }
        if (source.GroupIds != null) {
            this.GroupIds = new String[source.GroupIds.length];
            for (int i = 0; i < source.GroupIds.length; i++) {
                this.GroupIds[i] = new String(source.GroupIds[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Flag != null) {
            this.Flag = new Long(source.Flag);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Spec != null) {
            this.Spec = new MetricSpec(source.Spec);
        }
        if (source.MetricRelabels != null) {
            this.MetricRelabels = new Relabeling[source.MetricRelabels.length];
            for (int i = 0; i < source.MetricRelabels.length; i++) {
                this.MetricRelabels[i] = new Relabeling(source.MetricRelabels[i]);
            }
        }
        if (source.MetricLabel != null) {
            this.MetricLabel = new MetricConfigLabel(source.MetricLabel);
        }
        if (source.Scheme != null) {
            this.Scheme = new String(source.Scheme);
        }
        if (source.ScrapeInterval != null) {
            this.ScrapeInterval = new String(source.ScrapeInterval);
        }
        if (source.ScrapeTimeout != null) {
            this.ScrapeTimeout = new String(source.ScrapeTimeout);
        }
        if (source.HonorLabels != null) {
            this.HonorLabels = new Boolean(source.HonorLabels);
        }
        if (source.YamlSpec != null) {
            this.YamlSpec = new MetricYamlSpec(source.YamlSpec);
        }
        if (source.Operate != null) {
            this.Operate = new Long(source.Operate);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfigId", this.ConfigId);
        this.setParamArraySimple(map, prefix + "TopicIds.", this.TopicIds);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamArraySimple(map, prefix + "GroupIds.", this.GroupIds);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Flag", this.Flag);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "Spec.", this.Spec);
        this.setParamArrayObj(map, prefix + "MetricRelabels.", this.MetricRelabels);
        this.setParamObj(map, prefix + "MetricLabel.", this.MetricLabel);
        this.setParamSimple(map, prefix + "Scheme", this.Scheme);
        this.setParamSimple(map, prefix + "ScrapeInterval", this.ScrapeInterval);
        this.setParamSimple(map, prefix + "ScrapeTimeout", this.ScrapeTimeout);
        this.setParamSimple(map, prefix + "HonorLabels", this.HonorLabels);
        this.setParamObj(map, prefix + "YamlSpec.", this.YamlSpec);
        this.setParamSimple(map, prefix + "Operate", this.Operate);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

