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

public class ModifyConfigExtraRequest extends AbstractModel {

    /**
    * 采集配置扩展信息id
    */
    @SerializedName("ConfigExtraId")
    @Expose
    private String ConfigExtraId;

    /**
    * 采集配置规程名称，最长63个字符，只能包含小写字符、数字及分隔符（“-”），且必须以小写字符开头，数字或小写字符结尾
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 日志主题id
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 节点文件配置信息
    */
    @SerializedName("HostFile")
    @Expose
    private HostFileInfo HostFile;

    /**
    * 采集配置标记。
- 目前只支持label_k8s，用于标记自建k8s集群使用的采集配置
    */
    @SerializedName("ContainerFile")
    @Expose
    private ContainerFileInfo ContainerFile;

    /**
    * 容器标准输出信息
    */
    @SerializedName("ContainerStdout")
    @Expose
    private ContainerStdoutInfo ContainerStdout;

    /**
    * 采集的日志类型，默认为minimalist_log。支持以下类型：
- json_log代表：JSON-文件日志（详见[使用 JSON 提取模式采集日志](https://cloud.tencent.com/document/product/614/17419)）；
- delimiter_log代表：分隔符-文件日志（详见[使用分隔符提取模式采集日志](https://cloud.tencent.com/document/product/614/17420)）；
- minimalist_log代表：单行全文-文件日志（详见[使用单行全文提取模式采集日志](https://cloud.tencent.com/document/product/614/17421)）；
- fullregex_log代表：单行完全正则-文件日志（详见[使用单行-完全正则提取模式采集日志](https://cloud.tencent.com/document/product/614/52365)）；
- multiline_log代表：多行全文-文件日志（详见[使用多行全文提取模式采集日志](https://cloud.tencent.com/document/product/614/17422)）；
- multiline_fullregex_log代表：多行完全正则-文件日志（详见[使用多行-完全正则提取模式采集日志](https://cloud.tencent.com/document/product/614/52366)）；
- user_define_log代表：组合解析（适用于多格式嵌套的日志，详见[使用组合解析提取模式采集日志](https://cloud.tencent.com/document/product/614/61310)）。
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * 日志格式化方式，用于容器采集场景。
- stdout-docker-json：用于docker容器采集场景
- stdout-containerd：用于containerd容器采集场景
    */
    @SerializedName("LogFormat")
    @Expose
    private String LogFormat;

    /**
    * 提取规则，如果设置了ExtractRule，则必须设置LogType
    */
    @SerializedName("ExtractRule")
    @Expose
    private ExtractRuleInfo ExtractRule;

    /**
    * 采集黑名单路径列表
    */
    @SerializedName("ExcludePaths")
    @Expose
    private ExcludePathInfo [] ExcludePaths;

    /**
    * 组合解析采集规则，用于复杂场景下的日志采集。
- 取值参考：[使用组合解析提取模式采集日志
](https://cloud.tencent.com/document/product/614/61310)
    */
    @SerializedName("UserDefineRule")
    @Expose
    private String UserDefineRule;

    /**
    * 类型：container_stdout、container_file、host_file
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 机器组ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 自建采集配置标
    */
    @SerializedName("ConfigFlag")
    @Expose
    private String ConfigFlag;

    /**
    * 日志集ID
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * 日志集name
    */
    @SerializedName("LogsetName")
    @Expose
    private String LogsetName;

    /**
    * 日志主题name
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 高级采集配置。 Json字符串， Key/Value定义为如下：
- ClsAgentFileTimeout(超时属性), 取值范围: 大于等于0的整数， 0为不超时
- ClsAgentMaxDepth(最大目录深度)，取值范围: 大于等于0的整数
- ClsAgentParseFailMerge(合并解析失败日志)，取值范围: true或false
- ClsAgentDefault(自定义默认值，无特殊含义，用于清空其他选项)，建议取值0

    */
    @SerializedName("AdvancedConfig")
    @Expose
    private String AdvancedConfig;

    /**
     * Get 采集配置扩展信息id 
     * @return ConfigExtraId 采集配置扩展信息id
     */
    public String getConfigExtraId() {
        return this.ConfigExtraId;
    }

    /**
     * Set 采集配置扩展信息id
     * @param ConfigExtraId 采集配置扩展信息id
     */
    public void setConfigExtraId(String ConfigExtraId) {
        this.ConfigExtraId = ConfigExtraId;
    }

    /**
     * Get 采集配置规程名称，最长63个字符，只能包含小写字符、数字及分隔符（“-”），且必须以小写字符开头，数字或小写字符结尾 
     * @return Name 采集配置规程名称，最长63个字符，只能包含小写字符、数字及分隔符（“-”），且必须以小写字符开头，数字或小写字符结尾
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 采集配置规程名称，最长63个字符，只能包含小写字符、数字及分隔符（“-”），且必须以小写字符开头，数字或小写字符结尾
     * @param Name 采集配置规程名称，最长63个字符，只能包含小写字符、数字及分隔符（“-”），且必须以小写字符开头，数字或小写字符结尾
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 日志主题id 
     * @return TopicId 日志主题id
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 日志主题id
     * @param TopicId 日志主题id
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 节点文件配置信息 
     * @return HostFile 节点文件配置信息
     */
    public HostFileInfo getHostFile() {
        return this.HostFile;
    }

    /**
     * Set 节点文件配置信息
     * @param HostFile 节点文件配置信息
     */
    public void setHostFile(HostFileInfo HostFile) {
        this.HostFile = HostFile;
    }

    /**
     * Get 采集配置标记。
- 目前只支持label_k8s，用于标记自建k8s集群使用的采集配置 
     * @return ContainerFile 采集配置标记。
- 目前只支持label_k8s，用于标记自建k8s集群使用的采集配置
     */
    public ContainerFileInfo getContainerFile() {
        return this.ContainerFile;
    }

    /**
     * Set 采集配置标记。
- 目前只支持label_k8s，用于标记自建k8s集群使用的采集配置
     * @param ContainerFile 采集配置标记。
- 目前只支持label_k8s，用于标记自建k8s集群使用的采集配置
     */
    public void setContainerFile(ContainerFileInfo ContainerFile) {
        this.ContainerFile = ContainerFile;
    }

    /**
     * Get 容器标准输出信息 
     * @return ContainerStdout 容器标准输出信息
     */
    public ContainerStdoutInfo getContainerStdout() {
        return this.ContainerStdout;
    }

    /**
     * Set 容器标准输出信息
     * @param ContainerStdout 容器标准输出信息
     */
    public void setContainerStdout(ContainerStdoutInfo ContainerStdout) {
        this.ContainerStdout = ContainerStdout;
    }

    /**
     * Get 采集的日志类型，默认为minimalist_log。支持以下类型：
- json_log代表：JSON-文件日志（详见[使用 JSON 提取模式采集日志](https://cloud.tencent.com/document/product/614/17419)）；
- delimiter_log代表：分隔符-文件日志（详见[使用分隔符提取模式采集日志](https://cloud.tencent.com/document/product/614/17420)）；
- minimalist_log代表：单行全文-文件日志（详见[使用单行全文提取模式采集日志](https://cloud.tencent.com/document/product/614/17421)）；
- fullregex_log代表：单行完全正则-文件日志（详见[使用单行-完全正则提取模式采集日志](https://cloud.tencent.com/document/product/614/52365)）；
- multiline_log代表：多行全文-文件日志（详见[使用多行全文提取模式采集日志](https://cloud.tencent.com/document/product/614/17422)）；
- multiline_fullregex_log代表：多行完全正则-文件日志（详见[使用多行-完全正则提取模式采集日志](https://cloud.tencent.com/document/product/614/52366)）；
- user_define_log代表：组合解析（适用于多格式嵌套的日志，详见[使用组合解析提取模式采集日志](https://cloud.tencent.com/document/product/614/61310)）。 
     * @return LogType 采集的日志类型，默认为minimalist_log。支持以下类型：
- json_log代表：JSON-文件日志（详见[使用 JSON 提取模式采集日志](https://cloud.tencent.com/document/product/614/17419)）；
- delimiter_log代表：分隔符-文件日志（详见[使用分隔符提取模式采集日志](https://cloud.tencent.com/document/product/614/17420)）；
- minimalist_log代表：单行全文-文件日志（详见[使用单行全文提取模式采集日志](https://cloud.tencent.com/document/product/614/17421)）；
- fullregex_log代表：单行完全正则-文件日志（详见[使用单行-完全正则提取模式采集日志](https://cloud.tencent.com/document/product/614/52365)）；
- multiline_log代表：多行全文-文件日志（详见[使用多行全文提取模式采集日志](https://cloud.tencent.com/document/product/614/17422)）；
- multiline_fullregex_log代表：多行完全正则-文件日志（详见[使用多行-完全正则提取模式采集日志](https://cloud.tencent.com/document/product/614/52366)）；
- user_define_log代表：组合解析（适用于多格式嵌套的日志，详见[使用组合解析提取模式采集日志](https://cloud.tencent.com/document/product/614/61310)）。
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set 采集的日志类型，默认为minimalist_log。支持以下类型：
- json_log代表：JSON-文件日志（详见[使用 JSON 提取模式采集日志](https://cloud.tencent.com/document/product/614/17419)）；
- delimiter_log代表：分隔符-文件日志（详见[使用分隔符提取模式采集日志](https://cloud.tencent.com/document/product/614/17420)）；
- minimalist_log代表：单行全文-文件日志（详见[使用单行全文提取模式采集日志](https://cloud.tencent.com/document/product/614/17421)）；
- fullregex_log代表：单行完全正则-文件日志（详见[使用单行-完全正则提取模式采集日志](https://cloud.tencent.com/document/product/614/52365)）；
- multiline_log代表：多行全文-文件日志（详见[使用多行全文提取模式采集日志](https://cloud.tencent.com/document/product/614/17422)）；
- multiline_fullregex_log代表：多行完全正则-文件日志（详见[使用多行-完全正则提取模式采集日志](https://cloud.tencent.com/document/product/614/52366)）；
- user_define_log代表：组合解析（适用于多格式嵌套的日志，详见[使用组合解析提取模式采集日志](https://cloud.tencent.com/document/product/614/61310)）。
     * @param LogType 采集的日志类型，默认为minimalist_log。支持以下类型：
- json_log代表：JSON-文件日志（详见[使用 JSON 提取模式采集日志](https://cloud.tencent.com/document/product/614/17419)）；
- delimiter_log代表：分隔符-文件日志（详见[使用分隔符提取模式采集日志](https://cloud.tencent.com/document/product/614/17420)）；
- minimalist_log代表：单行全文-文件日志（详见[使用单行全文提取模式采集日志](https://cloud.tencent.com/document/product/614/17421)）；
- fullregex_log代表：单行完全正则-文件日志（详见[使用单行-完全正则提取模式采集日志](https://cloud.tencent.com/document/product/614/52365)）；
- multiline_log代表：多行全文-文件日志（详见[使用多行全文提取模式采集日志](https://cloud.tencent.com/document/product/614/17422)）；
- multiline_fullregex_log代表：多行完全正则-文件日志（详见[使用多行-完全正则提取模式采集日志](https://cloud.tencent.com/document/product/614/52366)）；
- user_define_log代表：组合解析（适用于多格式嵌套的日志，详见[使用组合解析提取模式采集日志](https://cloud.tencent.com/document/product/614/61310)）。
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get 日志格式化方式，用于容器采集场景。
- stdout-docker-json：用于docker容器采集场景
- stdout-containerd：用于containerd容器采集场景 
     * @return LogFormat 日志格式化方式，用于容器采集场景。
- stdout-docker-json：用于docker容器采集场景
- stdout-containerd：用于containerd容器采集场景
     * @deprecated
     */
    @Deprecated
    public String getLogFormat() {
        return this.LogFormat;
    }

    /**
     * Set 日志格式化方式，用于容器采集场景。
- stdout-docker-json：用于docker容器采集场景
- stdout-containerd：用于containerd容器采集场景
     * @param LogFormat 日志格式化方式，用于容器采集场景。
- stdout-docker-json：用于docker容器采集场景
- stdout-containerd：用于containerd容器采集场景
     * @deprecated
     */
    @Deprecated
    public void setLogFormat(String LogFormat) {
        this.LogFormat = LogFormat;
    }

    /**
     * Get 提取规则，如果设置了ExtractRule，则必须设置LogType 
     * @return ExtractRule 提取规则，如果设置了ExtractRule，则必须设置LogType
     */
    public ExtractRuleInfo getExtractRule() {
        return this.ExtractRule;
    }

    /**
     * Set 提取规则，如果设置了ExtractRule，则必须设置LogType
     * @param ExtractRule 提取规则，如果设置了ExtractRule，则必须设置LogType
     */
    public void setExtractRule(ExtractRuleInfo ExtractRule) {
        this.ExtractRule = ExtractRule;
    }

    /**
     * Get 采集黑名单路径列表 
     * @return ExcludePaths 采集黑名单路径列表
     */
    public ExcludePathInfo [] getExcludePaths() {
        return this.ExcludePaths;
    }

    /**
     * Set 采集黑名单路径列表
     * @param ExcludePaths 采集黑名单路径列表
     */
    public void setExcludePaths(ExcludePathInfo [] ExcludePaths) {
        this.ExcludePaths = ExcludePaths;
    }

    /**
     * Get 组合解析采集规则，用于复杂场景下的日志采集。
- 取值参考：[使用组合解析提取模式采集日志
](https://cloud.tencent.com/document/product/614/61310) 
     * @return UserDefineRule 组合解析采集规则，用于复杂场景下的日志采集。
- 取值参考：[使用组合解析提取模式采集日志
](https://cloud.tencent.com/document/product/614/61310)
     */
    public String getUserDefineRule() {
        return this.UserDefineRule;
    }

    /**
     * Set 组合解析采集规则，用于复杂场景下的日志采集。
- 取值参考：[使用组合解析提取模式采集日志
](https://cloud.tencent.com/document/product/614/61310)
     * @param UserDefineRule 组合解析采集规则，用于复杂场景下的日志采集。
- 取值参考：[使用组合解析提取模式采集日志
](https://cloud.tencent.com/document/product/614/61310)
     */
    public void setUserDefineRule(String UserDefineRule) {
        this.UserDefineRule = UserDefineRule;
    }

    /**
     * Get 类型：container_stdout、container_file、host_file 
     * @return Type 类型：container_stdout、container_file、host_file
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型：container_stdout、container_file、host_file
     * @param Type 类型：container_stdout、container_file、host_file
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 机器组ID 
     * @return GroupId 机器组ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 机器组ID
     * @param GroupId 机器组ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 自建采集配置标 
     * @return ConfigFlag 自建采集配置标
     */
    public String getConfigFlag() {
        return this.ConfigFlag;
    }

    /**
     * Set 自建采集配置标
     * @param ConfigFlag 自建采集配置标
     */
    public void setConfigFlag(String ConfigFlag) {
        this.ConfigFlag = ConfigFlag;
    }

    /**
     * Get 日志集ID 
     * @return LogsetId 日志集ID
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set 日志集ID
     * @param LogsetId 日志集ID
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get 日志集name 
     * @return LogsetName 日志集name
     */
    public String getLogsetName() {
        return this.LogsetName;
    }

    /**
     * Set 日志集name
     * @param LogsetName 日志集name
     */
    public void setLogsetName(String LogsetName) {
        this.LogsetName = LogsetName;
    }

    /**
     * Get 日志主题name 
     * @return TopicName 日志主题name
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 日志主题name
     * @param TopicName 日志主题name
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get 高级采集配置。 Json字符串， Key/Value定义为如下：
- ClsAgentFileTimeout(超时属性), 取值范围: 大于等于0的整数， 0为不超时
- ClsAgentMaxDepth(最大目录深度)，取值范围: 大于等于0的整数
- ClsAgentParseFailMerge(合并解析失败日志)，取值范围: true或false
- ClsAgentDefault(自定义默认值，无特殊含义，用于清空其他选项)，建议取值0
 
     * @return AdvancedConfig 高级采集配置。 Json字符串， Key/Value定义为如下：
- ClsAgentFileTimeout(超时属性), 取值范围: 大于等于0的整数， 0为不超时
- ClsAgentMaxDepth(最大目录深度)，取值范围: 大于等于0的整数
- ClsAgentParseFailMerge(合并解析失败日志)，取值范围: true或false
- ClsAgentDefault(自定义默认值，无特殊含义，用于清空其他选项)，建议取值0

     */
    public String getAdvancedConfig() {
        return this.AdvancedConfig;
    }

    /**
     * Set 高级采集配置。 Json字符串， Key/Value定义为如下：
- ClsAgentFileTimeout(超时属性), 取值范围: 大于等于0的整数， 0为不超时
- ClsAgentMaxDepth(最大目录深度)，取值范围: 大于等于0的整数
- ClsAgentParseFailMerge(合并解析失败日志)，取值范围: true或false
- ClsAgentDefault(自定义默认值，无特殊含义，用于清空其他选项)，建议取值0

     * @param AdvancedConfig 高级采集配置。 Json字符串， Key/Value定义为如下：
- ClsAgentFileTimeout(超时属性), 取值范围: 大于等于0的整数， 0为不超时
- ClsAgentMaxDepth(最大目录深度)，取值范围: 大于等于0的整数
- ClsAgentParseFailMerge(合并解析失败日志)，取值范围: true或false
- ClsAgentDefault(自定义默认值，无特殊含义，用于清空其他选项)，建议取值0

     */
    public void setAdvancedConfig(String AdvancedConfig) {
        this.AdvancedConfig = AdvancedConfig;
    }

    public ModifyConfigExtraRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyConfigExtraRequest(ModifyConfigExtraRequest source) {
        if (source.ConfigExtraId != null) {
            this.ConfigExtraId = new String(source.ConfigExtraId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.HostFile != null) {
            this.HostFile = new HostFileInfo(source.HostFile);
        }
        if (source.ContainerFile != null) {
            this.ContainerFile = new ContainerFileInfo(source.ContainerFile);
        }
        if (source.ContainerStdout != null) {
            this.ContainerStdout = new ContainerStdoutInfo(source.ContainerStdout);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.LogFormat != null) {
            this.LogFormat = new String(source.LogFormat);
        }
        if (source.ExtractRule != null) {
            this.ExtractRule = new ExtractRuleInfo(source.ExtractRule);
        }
        if (source.ExcludePaths != null) {
            this.ExcludePaths = new ExcludePathInfo[source.ExcludePaths.length];
            for (int i = 0; i < source.ExcludePaths.length; i++) {
                this.ExcludePaths[i] = new ExcludePathInfo(source.ExcludePaths[i]);
            }
        }
        if (source.UserDefineRule != null) {
            this.UserDefineRule = new String(source.UserDefineRule);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.ConfigFlag != null) {
            this.ConfigFlag = new String(source.ConfigFlag);
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.LogsetName != null) {
            this.LogsetName = new String(source.LogsetName);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.AdvancedConfig != null) {
            this.AdvancedConfig = new String(source.AdvancedConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfigExtraId", this.ConfigExtraId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamObj(map, prefix + "HostFile.", this.HostFile);
        this.setParamObj(map, prefix + "ContainerFile.", this.ContainerFile);
        this.setParamObj(map, prefix + "ContainerStdout.", this.ContainerStdout);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "LogFormat", this.LogFormat);
        this.setParamObj(map, prefix + "ExtractRule.", this.ExtractRule);
        this.setParamArrayObj(map, prefix + "ExcludePaths.", this.ExcludePaths);
        this.setParamSimple(map, prefix + "UserDefineRule", this.UserDefineRule);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "ConfigFlag", this.ConfigFlag);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "LogsetName", this.LogsetName);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "AdvancedConfig", this.AdvancedConfig);

    }
}

