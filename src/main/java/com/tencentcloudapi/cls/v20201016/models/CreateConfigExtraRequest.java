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

public class CreateConfigExtraRequest extends AbstractModel{

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
    * 类型：container_stdout、container_file、host_file
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 采集的日志类型，json_log代表json格式日志，delimiter_log代表分隔符格式日志，minimalist_log代表极简日志，multiline_log代表多行日志，fullregex_log代表完整正则，默认为minimalist_log
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * 采集配置标
    */
    @SerializedName("ConfigFlag")
    @Expose
    private String ConfigFlag;

    /**
    * 日志集id
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
    * 日志主题名称
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 节点文件配置信息
    */
    @SerializedName("HostFile")
    @Expose
    private HostFileInfo HostFile;

    /**
    * 容器文件路径信息
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
    * 日志格式化方式
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
    * 用户自定义采集规则，Json格式序列化的字符串
    */
    @SerializedName("UserDefineRule")
    @Expose
    private String UserDefineRule;

    /**
    * 绑定的机器组id
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 绑定的机器组id列表
    */
    @SerializedName("GroupIds")
    @Expose
    private String [] GroupIds;

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
     * Get 采集的日志类型，json_log代表json格式日志，delimiter_log代表分隔符格式日志，minimalist_log代表极简日志，multiline_log代表多行日志，fullregex_log代表完整正则，默认为minimalist_log 
     * @return LogType 采集的日志类型，json_log代表json格式日志，delimiter_log代表分隔符格式日志，minimalist_log代表极简日志，multiline_log代表多行日志，fullregex_log代表完整正则，默认为minimalist_log
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set 采集的日志类型，json_log代表json格式日志，delimiter_log代表分隔符格式日志，minimalist_log代表极简日志，multiline_log代表多行日志，fullregex_log代表完整正则，默认为minimalist_log
     * @param LogType 采集的日志类型，json_log代表json格式日志，delimiter_log代表分隔符格式日志，minimalist_log代表极简日志，multiline_log代表多行日志，fullregex_log代表完整正则，默认为minimalist_log
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get 采集配置标 
     * @return ConfigFlag 采集配置标
     */
    public String getConfigFlag() {
        return this.ConfigFlag;
    }

    /**
     * Set 采集配置标
     * @param ConfigFlag 采集配置标
     */
    public void setConfigFlag(String ConfigFlag) {
        this.ConfigFlag = ConfigFlag;
    }

    /**
     * Get 日志集id 
     * @return LogsetId 日志集id
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set 日志集id
     * @param LogsetId 日志集id
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
     * Get 日志主题名称 
     * @return TopicName 日志主题名称
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 日志主题名称
     * @param TopicName 日志主题名称
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
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
     * Get 容器文件路径信息 
     * @return ContainerFile 容器文件路径信息
     */
    public ContainerFileInfo getContainerFile() {
        return this.ContainerFile;
    }

    /**
     * Set 容器文件路径信息
     * @param ContainerFile 容器文件路径信息
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
     * Get 日志格式化方式 
     * @return LogFormat 日志格式化方式
     */
    public String getLogFormat() {
        return this.LogFormat;
    }

    /**
     * Set 日志格式化方式
     * @param LogFormat 日志格式化方式
     */
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
     * Get 用户自定义采集规则，Json格式序列化的字符串 
     * @return UserDefineRule 用户自定义采集规则，Json格式序列化的字符串
     */
    public String getUserDefineRule() {
        return this.UserDefineRule;
    }

    /**
     * Set 用户自定义采集规则，Json格式序列化的字符串
     * @param UserDefineRule 用户自定义采集规则，Json格式序列化的字符串
     */
    public void setUserDefineRule(String UserDefineRule) {
        this.UserDefineRule = UserDefineRule;
    }

    /**
     * Get 绑定的机器组id 
     * @return GroupId 绑定的机器组id
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 绑定的机器组id
     * @param GroupId 绑定的机器组id
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 绑定的机器组id列表 
     * @return GroupIds 绑定的机器组id列表
     */
    public String [] getGroupIds() {
        return this.GroupIds;
    }

    /**
     * Set 绑定的机器组id列表
     * @param GroupIds 绑定的机器组id列表
     */
    public void setGroupIds(String [] GroupIds) {
        this.GroupIds = GroupIds;
    }

    public CreateConfigExtraRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateConfigExtraRequest(CreateConfigExtraRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
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
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupIds != null) {
            this.GroupIds = new String[source.GroupIds.length];
            for (int i = 0; i < source.GroupIds.length; i++) {
                this.GroupIds[i] = new String(source.GroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "ConfigFlag", this.ConfigFlag);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "LogsetName", this.LogsetName);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamObj(map, prefix + "HostFile.", this.HostFile);
        this.setParamObj(map, prefix + "ContainerFile.", this.ContainerFile);
        this.setParamObj(map, prefix + "ContainerStdout.", this.ContainerStdout);
        this.setParamSimple(map, prefix + "LogFormat", this.LogFormat);
        this.setParamObj(map, prefix + "ExtractRule.", this.ExtractRule);
        this.setParamArrayObj(map, prefix + "ExcludePaths.", this.ExcludePaths);
        this.setParamSimple(map, prefix + "UserDefineRule", this.UserDefineRule);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamArraySimple(map, prefix + "GroupIds.", this.GroupIds);

    }
}

