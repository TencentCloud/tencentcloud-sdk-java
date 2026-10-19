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
    * <p>采集配置名称</p>
    */
    @SerializedName("TargetName")
    @Expose
    private String TargetName;

    /**
    * <p>命名空间列表，包括Include包含和Exclude不包含选项，两者都为空时等同于全部命名空间(包含当前所有的以及未来创建的)。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Namespaces")
    @Expose
    private Namespaces Namespaces;

    /**
    * <p>Pod标签列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PodLabels")
    @Expose
    private PodLabel [] PodLabels;

    /**
    * <p>容器名称，支持小写字母、数字、连接符-、下划线_，最多支持63个字符</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;

    /**
    * <p>ES索引名称前缀，如果当前采集配置下的容器日志输出到ES集群，则使用该字段作为ES索引名称的前缀，支持大小写字母、数字、连接符-、下划线_，最多支持50个字符</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexPrefix")
    @Expose
    private String IndexPrefix;

    /**
    * <p>日志内容过滤，以逗号分隔，支持大小写字母、数字、连接符-、下划线_以及逗号，最多支持50个字符</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogFilters")
    @Expose
    private String LogFilters;

    /**
    * <p>高级配置，可自定义采集规则，最多支持2048个字符</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigContent")
    @Expose
    private String ConfigContent;

    /**
    * <p>Ckafka实例的Topic</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KafkaTopic")
    @Expose
    private String KafkaTopic;

    /**
    * <p>ES索引名称，如果当前采集配置下的容器日志输出到ES集群，则使用该字段作为ES索引名称，支持大小写字母、数字、连接符-、下划线_，最多支持50个字符</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexAlias")
    @Expose
    private String IndexAlias;

    /**
    * <p>/</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InputType")
    @Expose
    private String InputType;

    /**
    * <p>日志采集host路径</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InputPath")
    @Expose
    private String InputPath;

    /**
    * <p>inputs.tail_files</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InputsTailFiles")
    @Expose
    private Boolean InputsTailFiles;

    /**
    * <p>开关inputs.multitline</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InputsMultiLineEnabled")
    @Expose
    private Boolean InputsMultiLineEnabled;

    /**
    * <p>inputs.multiline.type</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InputsMultiLineType")
    @Expose
    private String InputsMultiLineType;

    /**
    * <p>inputs.multiline.pattern</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InputsMultiLinePattern")
    @Expose
    private String InputsMultiLinePattern;

    /**
    * <p>inputs.multiline.negate</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InputsMultiLineNegate")
    @Expose
    private Boolean InputsMultiLineNegate;

    /**
    * <p>inputs.multiline.match</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InputsMultiLineMatch")
    @Expose
    private String InputsMultiLineMatch;

    /**
    * <p>按空间采集时 tke 的采集类型，默认为 container，支持 container、filestream</p>
    */
    @SerializedName("TkeCollectType")
    @Expose
    private String TkeCollectType;

    /**
     * Get <p>采集配置名称</p> 
     * @return TargetName <p>采集配置名称</p>
     */
    public String getTargetName() {
        return this.TargetName;
    }

    /**
     * Set <p>采集配置名称</p>
     * @param TargetName <p>采集配置名称</p>
     */
    public void setTargetName(String TargetName) {
        this.TargetName = TargetName;
    }

    /**
     * Get <p>命名空间列表，包括Include包含和Exclude不包含选项，两者都为空时等同于全部命名空间(包含当前所有的以及未来创建的)。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Namespaces <p>命名空间列表，包括Include包含和Exclude不包含选项，两者都为空时等同于全部命名空间(包含当前所有的以及未来创建的)。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Namespaces getNamespaces() {
        return this.Namespaces;
    }

    /**
     * Set <p>命名空间列表，包括Include包含和Exclude不包含选项，两者都为空时等同于全部命名空间(包含当前所有的以及未来创建的)。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Namespaces <p>命名空间列表，包括Include包含和Exclude不包含选项，两者都为空时等同于全部命名空间(包含当前所有的以及未来创建的)。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespaces(Namespaces Namespaces) {
        this.Namespaces = Namespaces;
    }

    /**
     * Get <p>Pod标签列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PodLabels <p>Pod标签列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PodLabel [] getPodLabels() {
        return this.PodLabels;
    }

    /**
     * Set <p>Pod标签列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PodLabels <p>Pod标签列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPodLabels(PodLabel [] PodLabels) {
        this.PodLabels = PodLabels;
    }

    /**
     * Get <p>容器名称，支持小写字母、数字、连接符-、下划线_，最多支持63个字符</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContainerName <p>容器名称，支持小写字母、数字、连接符-、下划线_，最多支持63个字符</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContainerName() {
        return this.ContainerName;
    }

    /**
     * Set <p>容器名称，支持小写字母、数字、连接符-、下划线_，最多支持63个字符</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContainerName <p>容器名称，支持小写字母、数字、连接符-、下划线_，最多支持63个字符</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContainerName(String ContainerName) {
        this.ContainerName = ContainerName;
    }

    /**
     * Get <p>ES索引名称前缀，如果当前采集配置下的容器日志输出到ES集群，则使用该字段作为ES索引名称的前缀，支持大小写字母、数字、连接符-、下划线_，最多支持50个字符</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexPrefix <p>ES索引名称前缀，如果当前采集配置下的容器日志输出到ES集群，则使用该字段作为ES索引名称的前缀，支持大小写字母、数字、连接符-、下划线_，最多支持50个字符</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIndexPrefix() {
        return this.IndexPrefix;
    }

    /**
     * Set <p>ES索引名称前缀，如果当前采集配置下的容器日志输出到ES集群，则使用该字段作为ES索引名称的前缀，支持大小写字母、数字、连接符-、下划线_，最多支持50个字符</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexPrefix <p>ES索引名称前缀，如果当前采集配置下的容器日志输出到ES集群，则使用该字段作为ES索引名称的前缀，支持大小写字母、数字、连接符-、下划线_，最多支持50个字符</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexPrefix(String IndexPrefix) {
        this.IndexPrefix = IndexPrefix;
    }

    /**
     * Get <p>日志内容过滤，以逗号分隔，支持大小写字母、数字、连接符-、下划线_以及逗号，最多支持50个字符</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogFilters <p>日志内容过滤，以逗号分隔，支持大小写字母、数字、连接符-、下划线_以及逗号，最多支持50个字符</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogFilters() {
        return this.LogFilters;
    }

    /**
     * Set <p>日志内容过滤，以逗号分隔，支持大小写字母、数字、连接符-、下划线_以及逗号，最多支持50个字符</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogFilters <p>日志内容过滤，以逗号分隔，支持大小写字母、数字、连接符-、下划线_以及逗号，最多支持50个字符</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogFilters(String LogFilters) {
        this.LogFilters = LogFilters;
    }

    /**
     * Get <p>高级配置，可自定义采集规则，最多支持2048个字符</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigContent <p>高级配置，可自定义采集规则，最多支持2048个字符</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfigContent() {
        return this.ConfigContent;
    }

    /**
     * Set <p>高级配置，可自定义采集规则，最多支持2048个字符</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigContent <p>高级配置，可自定义采集规则，最多支持2048个字符</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigContent(String ConfigContent) {
        this.ConfigContent = ConfigContent;
    }

    /**
     * Get <p>Ckafka实例的Topic</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KafkaTopic <p>Ckafka实例的Topic</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKafkaTopic() {
        return this.KafkaTopic;
    }

    /**
     * Set <p>Ckafka实例的Topic</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param KafkaTopic <p>Ckafka实例的Topic</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKafkaTopic(String KafkaTopic) {
        this.KafkaTopic = KafkaTopic;
    }

    /**
     * Get <p>ES索引名称，如果当前采集配置下的容器日志输出到ES集群，则使用该字段作为ES索引名称，支持大小写字母、数字、连接符-、下划线_，最多支持50个字符</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexAlias <p>ES索引名称，如果当前采集配置下的容器日志输出到ES集群，则使用该字段作为ES索引名称，支持大小写字母、数字、连接符-、下划线_，最多支持50个字符</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIndexAlias() {
        return this.IndexAlias;
    }

    /**
     * Set <p>ES索引名称，如果当前采集配置下的容器日志输出到ES集群，则使用该字段作为ES索引名称，支持大小写字母、数字、连接符-、下划线_，最多支持50个字符</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexAlias <p>ES索引名称，如果当前采集配置下的容器日志输出到ES集群，则使用该字段作为ES索引名称，支持大小写字母、数字、连接符-、下划线_，最多支持50个字符</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexAlias(String IndexAlias) {
        this.IndexAlias = IndexAlias;
    }

    /**
     * Get <p>/</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InputType <p>/</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInputType() {
        return this.InputType;
    }

    /**
     * Set <p>/</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InputType <p>/</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInputType(String InputType) {
        this.InputType = InputType;
    }

    /**
     * Get <p>日志采集host路径</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InputPath <p>日志采集host路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInputPath() {
        return this.InputPath;
    }

    /**
     * Set <p>日志采集host路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InputPath <p>日志采集host路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInputPath(String InputPath) {
        this.InputPath = InputPath;
    }

    /**
     * Get <p>inputs.tail_files</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InputsTailFiles <p>inputs.tail_files</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getInputsTailFiles() {
        return this.InputsTailFiles;
    }

    /**
     * Set <p>inputs.tail_files</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InputsTailFiles <p>inputs.tail_files</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInputsTailFiles(Boolean InputsTailFiles) {
        this.InputsTailFiles = InputsTailFiles;
    }

    /**
     * Get <p>开关inputs.multitline</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InputsMultiLineEnabled <p>开关inputs.multitline</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getInputsMultiLineEnabled() {
        return this.InputsMultiLineEnabled;
    }

    /**
     * Set <p>开关inputs.multitline</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InputsMultiLineEnabled <p>开关inputs.multitline</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInputsMultiLineEnabled(Boolean InputsMultiLineEnabled) {
        this.InputsMultiLineEnabled = InputsMultiLineEnabled;
    }

    /**
     * Get <p>inputs.multiline.type</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InputsMultiLineType <p>inputs.multiline.type</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInputsMultiLineType() {
        return this.InputsMultiLineType;
    }

    /**
     * Set <p>inputs.multiline.type</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InputsMultiLineType <p>inputs.multiline.type</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInputsMultiLineType(String InputsMultiLineType) {
        this.InputsMultiLineType = InputsMultiLineType;
    }

    /**
     * Get <p>inputs.multiline.pattern</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InputsMultiLinePattern <p>inputs.multiline.pattern</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInputsMultiLinePattern() {
        return this.InputsMultiLinePattern;
    }

    /**
     * Set <p>inputs.multiline.pattern</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InputsMultiLinePattern <p>inputs.multiline.pattern</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInputsMultiLinePattern(String InputsMultiLinePattern) {
        this.InputsMultiLinePattern = InputsMultiLinePattern;
    }

    /**
     * Get <p>inputs.multiline.negate</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InputsMultiLineNegate <p>inputs.multiline.negate</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getInputsMultiLineNegate() {
        return this.InputsMultiLineNegate;
    }

    /**
     * Set <p>inputs.multiline.negate</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InputsMultiLineNegate <p>inputs.multiline.negate</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInputsMultiLineNegate(Boolean InputsMultiLineNegate) {
        this.InputsMultiLineNegate = InputsMultiLineNegate;
    }

    /**
     * Get <p>inputs.multiline.match</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InputsMultiLineMatch <p>inputs.multiline.match</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInputsMultiLineMatch() {
        return this.InputsMultiLineMatch;
    }

    /**
     * Set <p>inputs.multiline.match</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InputsMultiLineMatch <p>inputs.multiline.match</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInputsMultiLineMatch(String InputsMultiLineMatch) {
        this.InputsMultiLineMatch = InputsMultiLineMatch;
    }

    /**
     * Get <p>按空间采集时 tke 的采集类型，默认为 container，支持 container、filestream</p> 
     * @return TkeCollectType <p>按空间采集时 tke 的采集类型，默认为 container，支持 container、filestream</p>
     */
    public String getTkeCollectType() {
        return this.TkeCollectType;
    }

    /**
     * Set <p>按空间采集时 tke 的采集类型，默认为 container，支持 container、filestream</p>
     * @param TkeCollectType <p>按空间采集时 tke 的采集类型，默认为 container，支持 container、filestream</p>
     */
    public void setTkeCollectType(String TkeCollectType) {
        this.TkeCollectType = TkeCollectType;
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
        if (source.InputsMultiLineEnabled != null) {
            this.InputsMultiLineEnabled = new Boolean(source.InputsMultiLineEnabled);
        }
        if (source.InputsMultiLineType != null) {
            this.InputsMultiLineType = new String(source.InputsMultiLineType);
        }
        if (source.InputsMultiLinePattern != null) {
            this.InputsMultiLinePattern = new String(source.InputsMultiLinePattern);
        }
        if (source.InputsMultiLineNegate != null) {
            this.InputsMultiLineNegate = new Boolean(source.InputsMultiLineNegate);
        }
        if (source.InputsMultiLineMatch != null) {
            this.InputsMultiLineMatch = new String(source.InputsMultiLineMatch);
        }
        if (source.TkeCollectType != null) {
            this.TkeCollectType = new String(source.TkeCollectType);
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
        this.setParamSimple(map, prefix + "InputsMultiLineEnabled", this.InputsMultiLineEnabled);
        this.setParamSimple(map, prefix + "InputsMultiLineType", this.InputsMultiLineType);
        this.setParamSimple(map, prefix + "InputsMultiLinePattern", this.InputsMultiLinePattern);
        this.setParamSimple(map, prefix + "InputsMultiLineNegate", this.InputsMultiLineNegate);
        this.setParamSimple(map, prefix + "InputsMultiLineMatch", this.InputsMultiLineMatch);
        this.setParamSimple(map, prefix + "TkeCollectType", this.TkeCollectType);

    }
}

