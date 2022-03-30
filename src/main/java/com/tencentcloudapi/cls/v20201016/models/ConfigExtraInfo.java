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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConfigExtraInfo extends AbstractModel{

    /**
    * 采集规则扩展配置ID
    */
    @SerializedName("ConfigExtraId")
    @Expose
    private String ConfigExtraId;

    /**
    * 采集规则名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 日志主题ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 类型：container_stdout、container_file、host_file
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 节点文件配置信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostFile")
    @Expose
    private HostFileInfo HostFile;

    /**
    * 容器文件路径信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContainerFile")
    @Expose
    private ContainerFileInfo ContainerFile;

    /**
    * 容器标准输出信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContainerStdout")
    @Expose
    private ContainerStdoutInfo ContainerStdout;

    /**
    * 日志格式化方式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogFormat")
    @Expose
    private String LogFormat;

    /**
    * 采集的日志类型，json_log代表json格式日志，delimiter_log代表分隔符格式日志，minimalist_log代表极简日志，multiline_log代表多行日志，fullregex_log代表完整正则，默认为minimalist_log
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * 提取规则，如果设置了ExtractRule，则必须设置LogType
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtractRule")
    @Expose
    private ExtractRuleInfo ExtractRule;

    /**
    * 采集黑名单路径列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExcludePaths")
    @Expose
    private ExcludePathInfo [] ExcludePaths;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 用户自定义解析字符串
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserDefineRule")
    @Expose
    private String UserDefineRule;

    /**
    * 机器组ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 自建采集配置标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigFlag")
    @Expose
    private String ConfigFlag;

    /**
    * 日志集ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * 日志集name
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogsetName")
    @Expose
    private String LogsetName;

    /**
    * 日志主题name
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
     * Get 采集规则扩展配置ID 
     * @return ConfigExtraId 采集规则扩展配置ID
     */
    public String getConfigExtraId() {
        return this.ConfigExtraId;
    }

    /**
     * Set 采集规则扩展配置ID
     * @param ConfigExtraId 采集规则扩展配置ID
     */
    public void setConfigExtraId(String ConfigExtraId) {
        this.ConfigExtraId = ConfigExtraId;
    }

    /**
     * Get 采集规则名称 
     * @return Name 采集规则名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 采集规则名称
     * @param Name 采集规则名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 日志主题ID 
     * @return TopicId 日志主题ID
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 日志主题ID
     * @param TopicId 日志主题ID
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
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
     * Get 节点文件配置信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostFile 节点文件配置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HostFileInfo getHostFile() {
        return this.HostFile;
    }

    /**
     * Set 节点文件配置信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostFile 节点文件配置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostFile(HostFileInfo HostFile) {
        this.HostFile = HostFile;
    }

    /**
     * Get 容器文件路径信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContainerFile 容器文件路径信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ContainerFileInfo getContainerFile() {
        return this.ContainerFile;
    }

    /**
     * Set 容器文件路径信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContainerFile 容器文件路径信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContainerFile(ContainerFileInfo ContainerFile) {
        this.ContainerFile = ContainerFile;
    }

    /**
     * Get 容器标准输出信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContainerStdout 容器标准输出信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ContainerStdoutInfo getContainerStdout() {
        return this.ContainerStdout;
    }

    /**
     * Set 容器标准输出信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContainerStdout 容器标准输出信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContainerStdout(ContainerStdoutInfo ContainerStdout) {
        this.ContainerStdout = ContainerStdout;
    }

    /**
     * Get 日志格式化方式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogFormat 日志格式化方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogFormat() {
        return this.LogFormat;
    }

    /**
     * Set 日志格式化方式
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogFormat 日志格式化方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogFormat(String LogFormat) {
        this.LogFormat = LogFormat;
    }

    /**
     * Get 采集的日志类型，json_log代表json格式日志，delimiter_log代表分隔符格式日志，minimalist_log代表极简日志，multiline_log代表多行日志，fullregex_log代表完整正则，默认为minimalist_log
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogType 采集的日志类型，json_log代表json格式日志，delimiter_log代表分隔符格式日志，minimalist_log代表极简日志，multiline_log代表多行日志，fullregex_log代表完整正则，默认为minimalist_log
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set 采集的日志类型，json_log代表json格式日志，delimiter_log代表分隔符格式日志，minimalist_log代表极简日志，multiline_log代表多行日志，fullregex_log代表完整正则，默认为minimalist_log
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogType 采集的日志类型，json_log代表json格式日志，delimiter_log代表分隔符格式日志，minimalist_log代表极简日志，multiline_log代表多行日志，fullregex_log代表完整正则，默认为minimalist_log
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get 提取规则，如果设置了ExtractRule，则必须设置LogType
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtractRule 提取规则，如果设置了ExtractRule，则必须设置LogType
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ExtractRuleInfo getExtractRule() {
        return this.ExtractRule;
    }

    /**
     * Set 提取规则，如果设置了ExtractRule，则必须设置LogType
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtractRule 提取规则，如果设置了ExtractRule，则必须设置LogType
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtractRule(ExtractRuleInfo ExtractRule) {
        this.ExtractRule = ExtractRule;
    }

    /**
     * Get 采集黑名单路径列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExcludePaths 采集黑名单路径列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ExcludePathInfo [] getExcludePaths() {
        return this.ExcludePaths;
    }

    /**
     * Set 采集黑名单路径列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExcludePaths 采集黑名单路径列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExcludePaths(ExcludePathInfo [] ExcludePaths) {
        this.ExcludePaths = ExcludePaths;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 用户自定义解析字符串
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserDefineRule 用户自定义解析字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserDefineRule() {
        return this.UserDefineRule;
    }

    /**
     * Set 用户自定义解析字符串
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserDefineRule 用户自定义解析字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserDefineRule(String UserDefineRule) {
        this.UserDefineRule = UserDefineRule;
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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigFlag 自建采集配置标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfigFlag() {
        return this.ConfigFlag;
    }

    /**
     * Set 自建采集配置标
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigFlag 自建采集配置标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigFlag(String ConfigFlag) {
        this.ConfigFlag = ConfigFlag;
    }

    /**
     * Get 日志集ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogsetId 日志集ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set 日志集ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogsetId 日志集ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get 日志集name
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogsetName 日志集name
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogsetName() {
        return this.LogsetName;
    }

    /**
     * Set 日志集name
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogsetName 日志集name
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogsetName(String LogsetName) {
        this.LogsetName = LogsetName;
    }

    /**
     * Get 日志主题name
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopicName 日志主题name
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 日志主题name
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopicName 日志主题name
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    public ConfigExtraInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConfigExtraInfo(ConfigExtraInfo source) {
        if (source.ConfigExtraId != null) {
            this.ConfigExtraId = new String(source.ConfigExtraId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
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
        if (source.LogFormat != null) {
            this.LogFormat = new String(source.LogFormat);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
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
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UserDefineRule != null) {
            this.UserDefineRule = new String(source.UserDefineRule);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfigExtraId", this.ConfigExtraId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "HostFile.", this.HostFile);
        this.setParamObj(map, prefix + "ContainerFile.", this.ContainerFile);
        this.setParamObj(map, prefix + "ContainerStdout.", this.ContainerStdout);
        this.setParamSimple(map, prefix + "LogFormat", this.LogFormat);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamObj(map, prefix + "ExtractRule.", this.ExtractRule);
        this.setParamArrayObj(map, prefix + "ExcludePaths.", this.ExcludePaths);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UserDefineRule", this.UserDefineRule);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "ConfigFlag", this.ConfigFlag);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "LogsetName", this.LogsetName);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);

    }
}

