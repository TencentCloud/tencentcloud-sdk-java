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

public class ModifyMetricConfigRequest extends AbstractModel {

    /**
    * 指标日志主题id。
- 通过 [获取日志主题列表](https://cloud.tencent.com/document/product/614/56454) 获取日志主题Id。注意BizType 0:日志主题（默认值）， 1:指标主题
- 通过 [创建日志主题](https://cloud.tencent.com/document/product/614/56456) 获取日志主题Id。注意BizType 0:日志主题（默认值）， 1:指标主题
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 指标采集配置id
    */
    @SerializedName("ConfigId")
    @Expose
    private String ConfigId;

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
    * 操作状态,0:应用,1:暂停
    */
    @SerializedName("Operate")
    @Expose
    private Long Operate;

    /**
    * 采集对象, Flag=0时生效
    */
    @SerializedName("Spec")
    @Expose
    private MetricSpec Spec;

    /**
    * 标签处理, Flag=0时生效
    */
    @SerializedName("MetricRelabels")
    @Expose
    private Relabeling [] MetricRelabels;

    /**
    * 自定义元数据, Flag=0时生效
    */
    @SerializedName("MetricLabel")
    @Expose
    private MetricConfigLabel MetricLabel;

    /**
    * 通信协议 `http`、`https`；Flag=0时生效
    */
    @SerializedName("Scheme")
    @Expose
    private String Scheme;

    /**
    * 采集频率,  Flag=0时生效
- 校验格式：`^(((\d+)y)?((\d+)w)?((\d+)d)?((\d+)h)?((\d+)m)?((\d+)s)?((\d+)ms)?|0)$`
- 默认：60s
    */
    @SerializedName("ScrapeInterval")
    @Expose
    private String ScrapeInterval;

    /**
    * 采集超时时间。   Flag=0时生效
- 校验格式：`^(((\d+)y)?((\d+)w)?((\d+)d)?((\d+)h)?((\d+)m)?((\d+)s)?((\d+)ms)?|0)$`
    */
    @SerializedName("ScrapeTimeout")
    @Expose
    private String ScrapeTimeout;

    /**
    * Prometheus如何处理标签之间的冲突。当Flag=0 && Type=1时生效，支持`true`,`false`
- `false`:配置数据中冲突的标签重命名
- `true`:忽略冲突的服务器端标签
    */
    @SerializedName("HonorLabels")
    @Expose
    private Boolean HonorLabels;

    /**
    * 采集配置yaml格式字符串, Flag=1时必填
    */
    @SerializedName("YamlSpec")
    @Expose
    private MetricYamlSpec YamlSpec;

    /**
     * Get 指标日志主题id。
- 通过 [获取日志主题列表](https://cloud.tencent.com/document/product/614/56454) 获取日志主题Id。注意BizType 0:日志主题（默认值）， 1:指标主题
- 通过 [创建日志主题](https://cloud.tencent.com/document/product/614/56456) 获取日志主题Id。注意BizType 0:日志主题（默认值）， 1:指标主题 
     * @return TopicId 指标日志主题id。
- 通过 [获取日志主题列表](https://cloud.tencent.com/document/product/614/56454) 获取日志主题Id。注意BizType 0:日志主题（默认值）， 1:指标主题
- 通过 [创建日志主题](https://cloud.tencent.com/document/product/614/56456) 获取日志主题Id。注意BizType 0:日志主题（默认值）， 1:指标主题
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 指标日志主题id。
- 通过 [获取日志主题列表](https://cloud.tencent.com/document/product/614/56454) 获取日志主题Id。注意BizType 0:日志主题（默认值）， 1:指标主题
- 通过 [创建日志主题](https://cloud.tencent.com/document/product/614/56456) 获取日志主题Id。注意BizType 0:日志主题（默认值）， 1:指标主题
     * @param TopicId 指标日志主题id。
- 通过 [获取日志主题列表](https://cloud.tencent.com/document/product/614/56454) 获取日志主题Id。注意BizType 0:日志主题（默认值）， 1:指标主题
- 通过 [创建日志主题](https://cloud.tencent.com/document/product/614/56456) 获取日志主题Id。注意BizType 0:日志主题（默认值）， 1:指标主题
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 指标采集配置id 
     * @return ConfigId 指标采集配置id
     */
    public String getConfigId() {
        return this.ConfigId;
    }

    /**
     * Set 指标采集配置id
     * @param ConfigId 指标采集配置id
     */
    public void setConfigId(String ConfigId) {
        this.ConfigId = ConfigId;
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
     * Get 采集对象, Flag=0时生效 
     * @return Spec 采集对象, Flag=0时生效
     */
    public MetricSpec getSpec() {
        return this.Spec;
    }

    /**
     * Set 采集对象, Flag=0时生效
     * @param Spec 采集对象, Flag=0时生效
     */
    public void setSpec(MetricSpec Spec) {
        this.Spec = Spec;
    }

    /**
     * Get 标签处理, Flag=0时生效 
     * @return MetricRelabels 标签处理, Flag=0时生效
     */
    public Relabeling [] getMetricRelabels() {
        return this.MetricRelabels;
    }

    /**
     * Set 标签处理, Flag=0时生效
     * @param MetricRelabels 标签处理, Flag=0时生效
     */
    public void setMetricRelabels(Relabeling [] MetricRelabels) {
        this.MetricRelabels = MetricRelabels;
    }

    /**
     * Get 自定义元数据, Flag=0时生效 
     * @return MetricLabel 自定义元数据, Flag=0时生效
     */
    public MetricConfigLabel getMetricLabel() {
        return this.MetricLabel;
    }

    /**
     * Set 自定义元数据, Flag=0时生效
     * @param MetricLabel 自定义元数据, Flag=0时生效
     */
    public void setMetricLabel(MetricConfigLabel MetricLabel) {
        this.MetricLabel = MetricLabel;
    }

    /**
     * Get 通信协议 `http`、`https`；Flag=0时生效 
     * @return Scheme 通信协议 `http`、`https`；Flag=0时生效
     */
    public String getScheme() {
        return this.Scheme;
    }

    /**
     * Set 通信协议 `http`、`https`；Flag=0时生效
     * @param Scheme 通信协议 `http`、`https`；Flag=0时生效
     */
    public void setScheme(String Scheme) {
        this.Scheme = Scheme;
    }

    /**
     * Get 采集频率,  Flag=0时生效
- 校验格式：`^(((\d+)y)?((\d+)w)?((\d+)d)?((\d+)h)?((\d+)m)?((\d+)s)?((\d+)ms)?|0)$`
- 默认：60s 
     * @return ScrapeInterval 采集频率,  Flag=0时生效
- 校验格式：`^(((\d+)y)?((\d+)w)?((\d+)d)?((\d+)h)?((\d+)m)?((\d+)s)?((\d+)ms)?|0)$`
- 默认：60s
     */
    public String getScrapeInterval() {
        return this.ScrapeInterval;
    }

    /**
     * Set 采集频率,  Flag=0时生效
- 校验格式：`^(((\d+)y)?((\d+)w)?((\d+)d)?((\d+)h)?((\d+)m)?((\d+)s)?((\d+)ms)?|0)$`
- 默认：60s
     * @param ScrapeInterval 采集频率,  Flag=0时生效
- 校验格式：`^(((\d+)y)?((\d+)w)?((\d+)d)?((\d+)h)?((\d+)m)?((\d+)s)?((\d+)ms)?|0)$`
- 默认：60s
     */
    public void setScrapeInterval(String ScrapeInterval) {
        this.ScrapeInterval = ScrapeInterval;
    }

    /**
     * Get 采集超时时间。   Flag=0时生效
- 校验格式：`^(((\d+)y)?((\d+)w)?((\d+)d)?((\d+)h)?((\d+)m)?((\d+)s)?((\d+)ms)?|0)$` 
     * @return ScrapeTimeout 采集超时时间。   Flag=0时生效
- 校验格式：`^(((\d+)y)?((\d+)w)?((\d+)d)?((\d+)h)?((\d+)m)?((\d+)s)?((\d+)ms)?|0)$`
     */
    public String getScrapeTimeout() {
        return this.ScrapeTimeout;
    }

    /**
     * Set 采集超时时间。   Flag=0时生效
- 校验格式：`^(((\d+)y)?((\d+)w)?((\d+)d)?((\d+)h)?((\d+)m)?((\d+)s)?((\d+)ms)?|0)$`
     * @param ScrapeTimeout 采集超时时间。   Flag=0时生效
- 校验格式：`^(((\d+)y)?((\d+)w)?((\d+)d)?((\d+)h)?((\d+)m)?((\d+)s)?((\d+)ms)?|0)$`
     */
    public void setScrapeTimeout(String ScrapeTimeout) {
        this.ScrapeTimeout = ScrapeTimeout;
    }

    /**
     * Get Prometheus如何处理标签之间的冲突。当Flag=0 && Type=1时生效，支持`true`,`false`
- `false`:配置数据中冲突的标签重命名
- `true`:忽略冲突的服务器端标签 
     * @return HonorLabels Prometheus如何处理标签之间的冲突。当Flag=0 && Type=1时生效，支持`true`,`false`
- `false`:配置数据中冲突的标签重命名
- `true`:忽略冲突的服务器端标签
     */
    public Boolean getHonorLabels() {
        return this.HonorLabels;
    }

    /**
     * Set Prometheus如何处理标签之间的冲突。当Flag=0 && Type=1时生效，支持`true`,`false`
- `false`:配置数据中冲突的标签重命名
- `true`:忽略冲突的服务器端标签
     * @param HonorLabels Prometheus如何处理标签之间的冲突。当Flag=0 && Type=1时生效，支持`true`,`false`
- `false`:配置数据中冲突的标签重命名
- `true`:忽略冲突的服务器端标签
     */
    public void setHonorLabels(Boolean HonorLabels) {
        this.HonorLabels = HonorLabels;
    }

    /**
     * Get 采集配置yaml格式字符串, Flag=1时必填 
     * @return YamlSpec 采集配置yaml格式字符串, Flag=1时必填
     */
    public MetricYamlSpec getYamlSpec() {
        return this.YamlSpec;
    }

    /**
     * Set 采集配置yaml格式字符串, Flag=1时必填
     * @param YamlSpec 采集配置yaml格式字符串, Flag=1时必填
     */
    public void setYamlSpec(MetricYamlSpec YamlSpec) {
        this.YamlSpec = YamlSpec;
    }

    public ModifyMetricConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyMetricConfigRequest(ModifyMetricConfigRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.ConfigId != null) {
            this.ConfigId = new String(source.ConfigId);
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
        if (source.Operate != null) {
            this.Operate = new Long(source.Operate);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "ConfigId", this.ConfigId);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamArraySimple(map, prefix + "GroupIds.", this.GroupIds);
        this.setParamSimple(map, prefix + "Operate", this.Operate);
        this.setParamObj(map, prefix + "Spec.", this.Spec);
        this.setParamArrayObj(map, prefix + "MetricRelabels.", this.MetricRelabels);
        this.setParamObj(map, prefix + "MetricLabel.", this.MetricLabel);
        this.setParamSimple(map, prefix + "Scheme", this.Scheme);
        this.setParamSimple(map, prefix + "ScrapeInterval", this.ScrapeInterval);
        this.setParamSimple(map, prefix + "ScrapeTimeout", this.ScrapeTimeout);
        this.setParamSimple(map, prefix + "HonorLabels", this.HonorLabels);
        this.setParamObj(map, prefix + "YamlSpec.", this.YamlSpec);

    }
}

