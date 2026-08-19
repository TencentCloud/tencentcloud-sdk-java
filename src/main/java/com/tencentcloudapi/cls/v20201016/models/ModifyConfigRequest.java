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

public class ModifyConfigRequest extends AbstractModel {

    /**
    * <p>采集规则配置ID，通过<a href="https://cloud.tencent.com/document/product/614/58616">获取采集规则配置</a>返回信息获取。</p>
    */
    @SerializedName("ConfigId")
    @Expose
    private String ConfigId;

    /**
    * <p>采集规则配置名称</p><ul><li>不能包含特殊字符｜</li><li>长度不能超过255字符，超过会被截断</li></ul>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>日志采集路径，包含文件名</p>
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * <p>采集的日志类型。支持以下类型：</p><ul><li>json_log代表：JSON-文件日志（详见<a href="https://cloud.tencent.com/document/product/614/17419">使用 JSON 提取模式采集日志</a>）；</li><li>delimiter_log代表：分隔符-文件日志（详见<a href="https://cloud.tencent.com/document/product/614/17420">使用分隔符提取模式采集日志</a>）；</li><li>minimalist_log代表：单行全文-文件日志（详见<a href="https://cloud.tencent.com/document/product/614/17421">使用单行全文提取模式采集日志</a>）；</li><li>fullregex_log代表：单行完全正则-文件日志（详见<a href="https://cloud.tencent.com/document/product/614/52365">使用单行-完全正则提取模式采集日志</a>）；</li><li>multiline_log代表：多行全文-文件日志（详见<a href="https://cloud.tencent.com/document/product/614/17422">使用多行全文提取模式采集日志</a>）；</li><li>multiline_fullregex_log代表：多行完全正则-文件日志（详见<a href="https://cloud.tencent.com/document/product/614/52366">使用多行-完全正则提取模式采集日志</a>）；</li><li>user_define_log代表：组合解析（适用于多格式嵌套的日志，详见<a href="https://cloud.tencent.com/document/product/614/61310">使用组合解析提取模式采集日志</a>）；</li><li>service_syslog代表：syslog 采集（详见<a href="https://cloud.tencent.com/document/product/614/81454">采集 Syslog</a>）；</li><li>windows_event_log代表：Windows事件日志（详见<a href="https://cloud.tencent.com/document/product/614/96678">采集 Windows 事件日志</a>）。</li><li>journal_log代表：journal日志采集</li></ul>
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * <p>提取规则，如果设置了ExtractRule，则必须设置LogType</p>
    */
    @SerializedName("ExtractRule")
    @Expose
    private ExtractRuleInfo ExtractRule;

    /**
    * <p>采集黑名单路径列表</p>
    */
    @SerializedName("ExcludePaths")
    @Expose
    private ExcludePathInfo [] ExcludePaths;

    /**
    * <p>采集配置关联的日志主题（TopicId）</p><ul><li>通过<a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a>获取日志主题Id。</li></ul>
    */
    @SerializedName("Output")
    @Expose
    private String Output;

    /**
    * <p>用户自定义解析字符串，Json格式序列化的字符串。</p>
    */
    @SerializedName("UserDefineRule")
    @Expose
    private String UserDefineRule;

    /**
    * <p>高级采集配置。 Json字符串， Key/Value定义为如下：</p><ul><li>ClsAgentFileTimeout(超时属性), 取值范围: 大于等于0的整数， 0为不超时</li><li>ClsAgentMaxDepth(最大目录深度)，取值范围: 大于等于0的整数</li><li>ClsAgentParseFailMerge(合并解析失败日志)，取值范围: true或false<br>样例：<br><code>{\&quot;ClsAgentFileTimeout\&quot;:0,\&quot;ClsAgentMaxDepth\&quot;:10,\&quot;ClsAgentParseFailMerge\&quot;:true}</code></li></ul>
    */
    @SerializedName("AdvancedConfig")
    @Expose
    private String AdvancedConfig;

    /**
    * <p>日志输入类型（<span style="color:red; font-weight:bold">注：windows场景必填且仅支持file和windows_event类型</span>）</p><ul><li>file: 文件类型采集</li><li>windows_event：windows事件采集</li><li>syslog：系统日志采集</li></ul>
    */
    @SerializedName("InputType")
    @Expose
    private String InputType;

    /**
     * Get <p>采集规则配置ID，通过<a href="https://cloud.tencent.com/document/product/614/58616">获取采集规则配置</a>返回信息获取。</p> 
     * @return ConfigId <p>采集规则配置ID，通过<a href="https://cloud.tencent.com/document/product/614/58616">获取采集规则配置</a>返回信息获取。</p>
     */
    public String getConfigId() {
        return this.ConfigId;
    }

    /**
     * Set <p>采集规则配置ID，通过<a href="https://cloud.tencent.com/document/product/614/58616">获取采集规则配置</a>返回信息获取。</p>
     * @param ConfigId <p>采集规则配置ID，通过<a href="https://cloud.tencent.com/document/product/614/58616">获取采集规则配置</a>返回信息获取。</p>
     */
    public void setConfigId(String ConfigId) {
        this.ConfigId = ConfigId;
    }

    /**
     * Get <p>采集规则配置名称</p><ul><li>不能包含特殊字符｜</li><li>长度不能超过255字符，超过会被截断</li></ul> 
     * @return Name <p>采集规则配置名称</p><ul><li>不能包含特殊字符｜</li><li>长度不能超过255字符，超过会被截断</li></ul>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>采集规则配置名称</p><ul><li>不能包含特殊字符｜</li><li>长度不能超过255字符，超过会被截断</li></ul>
     * @param Name <p>采集规则配置名称</p><ul><li>不能包含特殊字符｜</li><li>长度不能超过255字符，超过会被截断</li></ul>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>日志采集路径，包含文件名</p> 
     * @return Path <p>日志采集路径，包含文件名</p>
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set <p>日志采集路径，包含文件名</p>
     * @param Path <p>日志采集路径，包含文件名</p>
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get <p>采集的日志类型。支持以下类型：</p><ul><li>json_log代表：JSON-文件日志（详见<a href="https://cloud.tencent.com/document/product/614/17419">使用 JSON 提取模式采集日志</a>）；</li><li>delimiter_log代表：分隔符-文件日志（详见<a href="https://cloud.tencent.com/document/product/614/17420">使用分隔符提取模式采集日志</a>）；</li><li>minimalist_log代表：单行全文-文件日志（详见<a href="https://cloud.tencent.com/document/product/614/17421">使用单行全文提取模式采集日志</a>）；</li><li>fullregex_log代表：单行完全正则-文件日志（详见<a href="https://cloud.tencent.com/document/product/614/52365">使用单行-完全正则提取模式采集日志</a>）；</li><li>multiline_log代表：多行全文-文件日志（详见<a href="https://cloud.tencent.com/document/product/614/17422">使用多行全文提取模式采集日志</a>）；</li><li>multiline_fullregex_log代表：多行完全正则-文件日志（详见<a href="https://cloud.tencent.com/document/product/614/52366">使用多行-完全正则提取模式采集日志</a>）；</li><li>user_define_log代表：组合解析（适用于多格式嵌套的日志，详见<a href="https://cloud.tencent.com/document/product/614/61310">使用组合解析提取模式采集日志</a>）；</li><li>service_syslog代表：syslog 采集（详见<a href="https://cloud.tencent.com/document/product/614/81454">采集 Syslog</a>）；</li><li>windows_event_log代表：Windows事件日志（详见<a href="https://cloud.tencent.com/document/product/614/96678">采集 Windows 事件日志</a>）。</li><li>journal_log代表：journal日志采集</li></ul> 
     * @return LogType <p>采集的日志类型。支持以下类型：</p><ul><li>json_log代表：JSON-文件日志（详见<a href="https://cloud.tencent.com/document/product/614/17419">使用 JSON 提取模式采集日志</a>）；</li><li>delimiter_log代表：分隔符-文件日志（详见<a href="https://cloud.tencent.com/document/product/614/17420">使用分隔符提取模式采集日志</a>）；</li><li>minimalist_log代表：单行全文-文件日志（详见<a href="https://cloud.tencent.com/document/product/614/17421">使用单行全文提取模式采集日志</a>）；</li><li>fullregex_log代表：单行完全正则-文件日志（详见<a href="https://cloud.tencent.com/document/product/614/52365">使用单行-完全正则提取模式采集日志</a>）；</li><li>multiline_log代表：多行全文-文件日志（详见<a href="https://cloud.tencent.com/document/product/614/17422">使用多行全文提取模式采集日志</a>）；</li><li>multiline_fullregex_log代表：多行完全正则-文件日志（详见<a href="https://cloud.tencent.com/document/product/614/52366">使用多行-完全正则提取模式采集日志</a>）；</li><li>user_define_log代表：组合解析（适用于多格式嵌套的日志，详见<a href="https://cloud.tencent.com/document/product/614/61310">使用组合解析提取模式采集日志</a>）；</li><li>service_syslog代表：syslog 采集（详见<a href="https://cloud.tencent.com/document/product/614/81454">采集 Syslog</a>）；</li><li>windows_event_log代表：Windows事件日志（详见<a href="https://cloud.tencent.com/document/product/614/96678">采集 Windows 事件日志</a>）。</li><li>journal_log代表：journal日志采集</li></ul>
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set <p>采集的日志类型。支持以下类型：</p><ul><li>json_log代表：JSON-文件日志（详见<a href="https://cloud.tencent.com/document/product/614/17419">使用 JSON 提取模式采集日志</a>）；</li><li>delimiter_log代表：分隔符-文件日志（详见<a href="https://cloud.tencent.com/document/product/614/17420">使用分隔符提取模式采集日志</a>）；</li><li>minimalist_log代表：单行全文-文件日志（详见<a href="https://cloud.tencent.com/document/product/614/17421">使用单行全文提取模式采集日志</a>）；</li><li>fullregex_log代表：单行完全正则-文件日志（详见<a href="https://cloud.tencent.com/document/product/614/52365">使用单行-完全正则提取模式采集日志</a>）；</li><li>multiline_log代表：多行全文-文件日志（详见<a href="https://cloud.tencent.com/document/product/614/17422">使用多行全文提取模式采集日志</a>）；</li><li>multiline_fullregex_log代表：多行完全正则-文件日志（详见<a href="https://cloud.tencent.com/document/product/614/52366">使用多行-完全正则提取模式采集日志</a>）；</li><li>user_define_log代表：组合解析（适用于多格式嵌套的日志，详见<a href="https://cloud.tencent.com/document/product/614/61310">使用组合解析提取模式采集日志</a>）；</li><li>service_syslog代表：syslog 采集（详见<a href="https://cloud.tencent.com/document/product/614/81454">采集 Syslog</a>）；</li><li>windows_event_log代表：Windows事件日志（详见<a href="https://cloud.tencent.com/document/product/614/96678">采集 Windows 事件日志</a>）。</li><li>journal_log代表：journal日志采集</li></ul>
     * @param LogType <p>采集的日志类型。支持以下类型：</p><ul><li>json_log代表：JSON-文件日志（详见<a href="https://cloud.tencent.com/document/product/614/17419">使用 JSON 提取模式采集日志</a>）；</li><li>delimiter_log代表：分隔符-文件日志（详见<a href="https://cloud.tencent.com/document/product/614/17420">使用分隔符提取模式采集日志</a>）；</li><li>minimalist_log代表：单行全文-文件日志（详见<a href="https://cloud.tencent.com/document/product/614/17421">使用单行全文提取模式采集日志</a>）；</li><li>fullregex_log代表：单行完全正则-文件日志（详见<a href="https://cloud.tencent.com/document/product/614/52365">使用单行-完全正则提取模式采集日志</a>）；</li><li>multiline_log代表：多行全文-文件日志（详见<a href="https://cloud.tencent.com/document/product/614/17422">使用多行全文提取模式采集日志</a>）；</li><li>multiline_fullregex_log代表：多行完全正则-文件日志（详见<a href="https://cloud.tencent.com/document/product/614/52366">使用多行-完全正则提取模式采集日志</a>）；</li><li>user_define_log代表：组合解析（适用于多格式嵌套的日志，详见<a href="https://cloud.tencent.com/document/product/614/61310">使用组合解析提取模式采集日志</a>）；</li><li>service_syslog代表：syslog 采集（详见<a href="https://cloud.tencent.com/document/product/614/81454">采集 Syslog</a>）；</li><li>windows_event_log代表：Windows事件日志（详见<a href="https://cloud.tencent.com/document/product/614/96678">采集 Windows 事件日志</a>）。</li><li>journal_log代表：journal日志采集</li></ul>
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get <p>提取规则，如果设置了ExtractRule，则必须设置LogType</p> 
     * @return ExtractRule <p>提取规则，如果设置了ExtractRule，则必须设置LogType</p>
     */
    public ExtractRuleInfo getExtractRule() {
        return this.ExtractRule;
    }

    /**
     * Set <p>提取规则，如果设置了ExtractRule，则必须设置LogType</p>
     * @param ExtractRule <p>提取规则，如果设置了ExtractRule，则必须设置LogType</p>
     */
    public void setExtractRule(ExtractRuleInfo ExtractRule) {
        this.ExtractRule = ExtractRule;
    }

    /**
     * Get <p>采集黑名单路径列表</p> 
     * @return ExcludePaths <p>采集黑名单路径列表</p>
     */
    public ExcludePathInfo [] getExcludePaths() {
        return this.ExcludePaths;
    }

    /**
     * Set <p>采集黑名单路径列表</p>
     * @param ExcludePaths <p>采集黑名单路径列表</p>
     */
    public void setExcludePaths(ExcludePathInfo [] ExcludePaths) {
        this.ExcludePaths = ExcludePaths;
    }

    /**
     * Get <p>采集配置关联的日志主题（TopicId）</p><ul><li>通过<a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a>获取日志主题Id。</li></ul> 
     * @return Output <p>采集配置关联的日志主题（TopicId）</p><ul><li>通过<a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a>获取日志主题Id。</li></ul>
     */
    public String getOutput() {
        return this.Output;
    }

    /**
     * Set <p>采集配置关联的日志主题（TopicId）</p><ul><li>通过<a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a>获取日志主题Id。</li></ul>
     * @param Output <p>采集配置关联的日志主题（TopicId）</p><ul><li>通过<a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a>获取日志主题Id。</li></ul>
     */
    public void setOutput(String Output) {
        this.Output = Output;
    }

    /**
     * Get <p>用户自定义解析字符串，Json格式序列化的字符串。</p> 
     * @return UserDefineRule <p>用户自定义解析字符串，Json格式序列化的字符串。</p>
     */
    public String getUserDefineRule() {
        return this.UserDefineRule;
    }

    /**
     * Set <p>用户自定义解析字符串，Json格式序列化的字符串。</p>
     * @param UserDefineRule <p>用户自定义解析字符串，Json格式序列化的字符串。</p>
     */
    public void setUserDefineRule(String UserDefineRule) {
        this.UserDefineRule = UserDefineRule;
    }

    /**
     * Get <p>高级采集配置。 Json字符串， Key/Value定义为如下：</p><ul><li>ClsAgentFileTimeout(超时属性), 取值范围: 大于等于0的整数， 0为不超时</li><li>ClsAgentMaxDepth(最大目录深度)，取值范围: 大于等于0的整数</li><li>ClsAgentParseFailMerge(合并解析失败日志)，取值范围: true或false<br>样例：<br><code>{\&quot;ClsAgentFileTimeout\&quot;:0,\&quot;ClsAgentMaxDepth\&quot;:10,\&quot;ClsAgentParseFailMerge\&quot;:true}</code></li></ul> 
     * @return AdvancedConfig <p>高级采集配置。 Json字符串， Key/Value定义为如下：</p><ul><li>ClsAgentFileTimeout(超时属性), 取值范围: 大于等于0的整数， 0为不超时</li><li>ClsAgentMaxDepth(最大目录深度)，取值范围: 大于等于0的整数</li><li>ClsAgentParseFailMerge(合并解析失败日志)，取值范围: true或false<br>样例：<br><code>{\&quot;ClsAgentFileTimeout\&quot;:0,\&quot;ClsAgentMaxDepth\&quot;:10,\&quot;ClsAgentParseFailMerge\&quot;:true}</code></li></ul>
     */
    public String getAdvancedConfig() {
        return this.AdvancedConfig;
    }

    /**
     * Set <p>高级采集配置。 Json字符串， Key/Value定义为如下：</p><ul><li>ClsAgentFileTimeout(超时属性), 取值范围: 大于等于0的整数， 0为不超时</li><li>ClsAgentMaxDepth(最大目录深度)，取值范围: 大于等于0的整数</li><li>ClsAgentParseFailMerge(合并解析失败日志)，取值范围: true或false<br>样例：<br><code>{\&quot;ClsAgentFileTimeout\&quot;:0,\&quot;ClsAgentMaxDepth\&quot;:10,\&quot;ClsAgentParseFailMerge\&quot;:true}</code></li></ul>
     * @param AdvancedConfig <p>高级采集配置。 Json字符串， Key/Value定义为如下：</p><ul><li>ClsAgentFileTimeout(超时属性), 取值范围: 大于等于0的整数， 0为不超时</li><li>ClsAgentMaxDepth(最大目录深度)，取值范围: 大于等于0的整数</li><li>ClsAgentParseFailMerge(合并解析失败日志)，取值范围: true或false<br>样例：<br><code>{\&quot;ClsAgentFileTimeout\&quot;:0,\&quot;ClsAgentMaxDepth\&quot;:10,\&quot;ClsAgentParseFailMerge\&quot;:true}</code></li></ul>
     */
    public void setAdvancedConfig(String AdvancedConfig) {
        this.AdvancedConfig = AdvancedConfig;
    }

    /**
     * Get <p>日志输入类型（<span style="color:red; font-weight:bold">注：windows场景必填且仅支持file和windows_event类型</span>）</p><ul><li>file: 文件类型采集</li><li>windows_event：windows事件采集</li><li>syslog：系统日志采集</li></ul> 
     * @return InputType <p>日志输入类型（<span style="color:red; font-weight:bold">注：windows场景必填且仅支持file和windows_event类型</span>）</p><ul><li>file: 文件类型采集</li><li>windows_event：windows事件采集</li><li>syslog：系统日志采集</li></ul>
     */
    public String getInputType() {
        return this.InputType;
    }

    /**
     * Set <p>日志输入类型（<span style="color:red; font-weight:bold">注：windows场景必填且仅支持file和windows_event类型</span>）</p><ul><li>file: 文件类型采集</li><li>windows_event：windows事件采集</li><li>syslog：系统日志采集</li></ul>
     * @param InputType <p>日志输入类型（<span style="color:red; font-weight:bold">注：windows场景必填且仅支持file和windows_event类型</span>）</p><ul><li>file: 文件类型采集</li><li>windows_event：windows事件采集</li><li>syslog：系统日志采集</li></ul>
     */
    public void setInputType(String InputType) {
        this.InputType = InputType;
    }

    public ModifyConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyConfigRequest(ModifyConfigRequest source) {
        if (source.ConfigId != null) {
            this.ConfigId = new String(source.ConfigId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
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
        if (source.Output != null) {
            this.Output = new String(source.Output);
        }
        if (source.UserDefineRule != null) {
            this.UserDefineRule = new String(source.UserDefineRule);
        }
        if (source.AdvancedConfig != null) {
            this.AdvancedConfig = new String(source.AdvancedConfig);
        }
        if (source.InputType != null) {
            this.InputType = new String(source.InputType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfigId", this.ConfigId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamObj(map, prefix + "ExtractRule.", this.ExtractRule);
        this.setParamArrayObj(map, prefix + "ExcludePaths.", this.ExcludePaths);
        this.setParamSimple(map, prefix + "Output", this.Output);
        this.setParamSimple(map, prefix + "UserDefineRule", this.UserDefineRule);
        this.setParamSimple(map, prefix + "AdvancedConfig", this.AdvancedConfig);
        this.setParamSimple(map, prefix + "InputType", this.InputType);

    }
}

