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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CollectorTarget extends AbstractModel {

    /**
    * 采集配置名称
    */
    @SerializedName("TargetName")
    @Expose
    private String TargetName;

    /**
    * 命名空间列表，包括Include包含和Exclude不包含选项，两者都为空时等同于全部命名空间(包含当前所有的以及未来创建的)。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Namespaces")
    @Expose
    private Namespaces Namespaces;

    /**
    * Pod标签列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PodLabels")
    @Expose
    private PodLabel [] PodLabels;

    /**
    * 容器名称，支持小写字母、数字、连接符-、下划线_，最多支持63个字符
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;

    /**
    * ES索引名称前缀，如果当前采集配置下的容器日志输出到ES集群，则使用该字段作为ES索引名称的前缀，支持大小写字母、数字、连接符-、下划线_，最多支持50个字符
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexPrefix")
    @Expose
    private String IndexPrefix;

    /**
    * 日志内容过滤，以逗号分隔，支持大小写字母、数字、连接符-、下划线_以及逗号，最多支持50个字符
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogFilters")
    @Expose
    private String LogFilters;

    /**
    * 高级配置，可自定义采集规则，最多支持2048个字符
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigContent")
    @Expose
    private String ConfigContent;

    /**
    * Ckafka实例的Topic
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KafkaTopic")
    @Expose
    private String KafkaTopic;

    /**
    * ES索引名称，如果当前采集配置下的容器日志输出到ES集群，则使用该字段作为ES索引名称，支持大小写字母、数字、连接符-、下划线_，最多支持50个字符
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexAlias")
    @Expose
    private String IndexAlias;

    /**
    * /
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InputType")
    @Expose
    private String InputType;

    /**
    * 日志采集host路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InputPath")
    @Expose
    private String InputPath;

    /**
    * inputs.tail_files
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InputsTailFiles")
    @Expose
    private Boolean InputsTailFiles;

    /**
     * Get 采集配置名称 
     * @return TargetName 采集配置名称
     */
    public String getTargetName() {
        return this.TargetName;
    }

    /**
     * Set 采集配置名称
     * @param TargetName 采集配置名称
     */
    public void setTargetName(String TargetName) {
        this.TargetName = TargetName;
    }

    /**
     * Get 命名空间列表，包括Include包含和Exclude不包含选项，两者都为空时等同于全部命名空间(包含当前所有的以及未来创建的)。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Namespaces 命名空间列表，包括Include包含和Exclude不包含选项，两者都为空时等同于全部命名空间(包含当前所有的以及未来创建的)。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Namespaces getNamespaces() {
        return this.Namespaces;
    }

    /**
     * Set 命名空间列表，包括Include包含和Exclude不包含选项，两者都为空时等同于全部命名空间(包含当前所有的以及未来创建的)。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Namespaces 命名空间列表，包括Include包含和Exclude不包含选项，两者都为空时等同于全部命名空间(包含当前所有的以及未来创建的)。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespaces(Namespaces Namespaces) {
        this.Namespaces = Namespaces;
    }

    /**
     * Get Pod标签列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PodLabels Pod标签列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PodLabel [] getPodLabels() {
        return this.PodLabels;
    }

    /**
     * Set Pod标签列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param PodLabels Pod标签列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPodLabels(PodLabel [] PodLabels) {
        this.PodLabels = PodLabels;
    }

    /**
     * Get 容器名称，支持小写字母、数字、连接符-、下划线_，最多支持63个字符
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContainerName 容器名称，支持小写字母、数字、连接符-、下划线_，最多支持63个字符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContainerName() {
        return this.ContainerName;
    }

    /**
     * Set 容器名称，支持小写字母、数字、连接符-、下划线_，最多支持63个字符
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContainerName 容器名称，支持小写字母、数字、连接符-、下划线_，最多支持63个字符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContainerName(String ContainerName) {
        this.ContainerName = ContainerName;
    }

    /**
     * Get ES索引名称前缀，如果当前采集配置下的容器日志输出到ES集群，则使用该字段作为ES索引名称的前缀，支持大小写字母、数字、连接符-、下划线_，最多支持50个字符
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexPrefix ES索引名称前缀，如果当前采集配置下的容器日志输出到ES集群，则使用该字段作为ES索引名称的前缀，支持大小写字母、数字、连接符-、下划线_，最多支持50个字符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIndexPrefix() {
        return this.IndexPrefix;
    }

    /**
     * Set ES索引名称前缀，如果当前采集配置下的容器日志输出到ES集群，则使用该字段作为ES索引名称的前缀，支持大小写字母、数字、连接符-、下划线_，最多支持50个字符
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexPrefix ES索引名称前缀，如果当前采集配置下的容器日志输出到ES集群，则使用该字段作为ES索引名称的前缀，支持大小写字母、数字、连接符-、下划线_，最多支持50个字符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexPrefix(String IndexPrefix) {
        this.IndexPrefix = IndexPrefix;
    }

    /**
     * Get 日志内容过滤，以逗号分隔，支持大小写字母、数字、连接符-、下划线_以及逗号，最多支持50个字符
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogFilters 日志内容过滤，以逗号分隔，支持大小写字母、数字、连接符-、下划线_以及逗号，最多支持50个字符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogFilters() {
        return this.LogFilters;
    }

    /**
     * Set 日志内容过滤，以逗号分隔，支持大小写字母、数字、连接符-、下划线_以及逗号，最多支持50个字符
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogFilters 日志内容过滤，以逗号分隔，支持大小写字母、数字、连接符-、下划线_以及逗号，最多支持50个字符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogFilters(String LogFilters) {
        this.LogFilters = LogFilters;
    }

    /**
     * Get 高级配置，可自定义采集规则，最多支持2048个字符
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigContent 高级配置，可自定义采集规则，最多支持2048个字符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfigContent() {
        return this.ConfigContent;
    }

    /**
     * Set 高级配置，可自定义采集规则，最多支持2048个字符
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigContent 高级配置，可自定义采集规则，最多支持2048个字符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigContent(String ConfigContent) {
        this.ConfigContent = ConfigContent;
    }

    /**
     * Get Ckafka实例的Topic
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KafkaTopic Ckafka实例的Topic
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKafkaTopic() {
        return this.KafkaTopic;
    }

    /**
     * Set Ckafka实例的Topic
注意：此字段可能返回 null，表示取不到有效值。
     * @param KafkaTopic Ckafka实例的Topic
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKafkaTopic(String KafkaTopic) {
        this.KafkaTopic = KafkaTopic;
    }

    /**
     * Get ES索引名称，如果当前采集配置下的容器日志输出到ES集群，则使用该字段作为ES索引名称，支持大小写字母、数字、连接符-、下划线_，最多支持50个字符
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexAlias ES索引名称，如果当前采集配置下的容器日志输出到ES集群，则使用该字段作为ES索引名称，支持大小写字母、数字、连接符-、下划线_，最多支持50个字符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIndexAlias() {
        return this.IndexAlias;
    }

    /**
     * Set ES索引名称，如果当前采集配置下的容器日志输出到ES集群，则使用该字段作为ES索引名称，支持大小写字母、数字、连接符-、下划线_，最多支持50个字符
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexAlias ES索引名称，如果当前采集配置下的容器日志输出到ES集群，则使用该字段作为ES索引名称，支持大小写字母、数字、连接符-、下划线_，最多支持50个字符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexAlias(String IndexAlias) {
        this.IndexAlias = IndexAlias;
    }

    /**
     * Get /
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InputType /
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInputType() {
        return this.InputType;
    }

    /**
     * Set /
注意：此字段可能返回 null，表示取不到有效值。
     * @param InputType /
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInputType(String InputType) {
        this.InputType = InputType;
    }

    /**
     * Get 日志采集host路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InputPath 日志采集host路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInputPath() {
        return this.InputPath;
    }

    /**
     * Set 日志采集host路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param InputPath 日志采集host路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInputPath(String InputPath) {
        this.InputPath = InputPath;
    }

    /**
     * Get inputs.tail_files
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InputsTailFiles inputs.tail_files
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getInputsTailFiles() {
        return this.InputsTailFiles;
    }

    /**
     * Set inputs.tail_files
注意：此字段可能返回 null，表示取不到有效值。
     * @param InputsTailFiles inputs.tail_files
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInputsTailFiles(Boolean InputsTailFiles) {
        this.InputsTailFiles = InputsTailFiles;
    }

    public CollectorTarget() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CollectorTarget(CollectorTarget source) {
        if (source.TargetName != null) {
            this.TargetName = new String(source.TargetName);
        }
        if (source.Namespaces != null) {
            this.Namespaces = new Namespaces(source.Namespaces);
        }
        if (source.PodLabels != null) {
            this.PodLabels = new PodLabel[source.PodLabels.length];
            for (int i = 0; i < source.PodLabels.length; i++) {
                this.PodLabels[i] = new PodLabel(source.PodLabels[i]);
            }
        }
        if (source.ContainerName != null) {
            this.ContainerName = new String(source.ContainerName);
        }
        if (source.IndexPrefix != null) {
            this.IndexPrefix = new String(source.IndexPrefix);
        }
        if (source.LogFilters != null) {
            this.LogFilters = new String(source.LogFilters);
        }
        if (source.ConfigContent != null) {
            this.ConfigContent = new String(source.ConfigContent);
        }
        if (source.KafkaTopic != null) {
            this.KafkaTopic = new String(source.KafkaTopic);
        }
        if (source.IndexAlias != null) {
            this.IndexAlias = new String(source.IndexAlias);
        }
        if (source.InputType != null) {
            this.InputType = new String(source.InputType);
        }
        if (source.InputPath != null) {
            this.InputPath = new String(source.InputPath);
        }
        if (source.InputsTailFiles != null) {
            this.InputsTailFiles = new Boolean(source.InputsTailFiles);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetName", this.TargetName);
        this.setParamObj(map, prefix + "Namespaces.", this.Namespaces);
        this.setParamArrayObj(map, prefix + "PodLabels.", this.PodLabels);
        this.setParamSimple(map, prefix + "ContainerName", this.ContainerName);
        this.setParamSimple(map, prefix + "IndexPrefix", this.IndexPrefix);
        this.setParamSimple(map, prefix + "LogFilters", this.LogFilters);
        this.setParamSimple(map, prefix + "ConfigContent", this.ConfigContent);
        this.setParamSimple(map, prefix + "KafkaTopic", this.KafkaTopic);
        this.setParamSimple(map, prefix + "IndexAlias", this.IndexAlias);
        this.setParamSimple(map, prefix + "InputType", this.InputType);
        this.setParamSimple(map, prefix + "InputPath", this.InputPath);
        this.setParamSimple(map, prefix + "InputsTailFiles", this.InputsTailFiles);

    }
}

