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

public class LogConfigInfo extends AbstractModel {

    /**
    * 日志主题ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 日志集ID
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * 采集日志路径列表
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 日志类型
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * 提取规则
    */
    @SerializedName("ExtractRule")
    @Expose
    private ExtractRuleInfo ExtractRule;

    /**
    * 日志格式化格式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogFormat")
    @Expose
    private String LogFormat;

    /**
    * 黑名单path列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExcludePaths")
    @Expose
    private ExcludePathInfo [] ExcludePaths;

    /**
    * 用户自定义解析字符串
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserDefineRule")
    @Expose
    private String UserDefineRule;

    /**
    * 采集配置ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigId")
    @Expose
    private String ConfigId;

    /**
    * 使用了元数据的机器组ID列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupIds")
    @Expose
    private String [] GroupIds;

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
     * Get 采集日志路径列表 
     * @return Path 采集日志路径列表
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 采集日志路径列表
     * @param Path 采集日志路径列表
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 日志类型 
     * @return LogType 日志类型
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set 日志类型
     * @param LogType 日志类型
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get 提取规则 
     * @return ExtractRule 提取规则
     */
    public ExtractRuleInfo getExtractRule() {
        return this.ExtractRule;
    }

    /**
     * Set 提取规则
     * @param ExtractRule 提取规则
     */
    public void setExtractRule(ExtractRuleInfo ExtractRule) {
        this.ExtractRule = ExtractRule;
    }

    /**
     * Get 日志格式化格式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogFormat 日志格式化格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogFormat() {
        return this.LogFormat;
    }

    /**
     * Set 日志格式化格式
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogFormat 日志格式化格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogFormat(String LogFormat) {
        this.LogFormat = LogFormat;
    }

    /**
     * Get 黑名单path列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExcludePaths 黑名单path列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ExcludePathInfo [] getExcludePaths() {
        return this.ExcludePaths;
    }

    /**
     * Set 黑名单path列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExcludePaths 黑名单path列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExcludePaths(ExcludePathInfo [] ExcludePaths) {
        this.ExcludePaths = ExcludePaths;
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
     * Get 采集配置ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigId 采集配置ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfigId() {
        return this.ConfigId;
    }

    /**
     * Set 采集配置ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigId 采集配置ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigId(String ConfigId) {
        this.ConfigId = ConfigId;
    }

    /**
     * Get 使用了元数据的机器组ID列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupIds 使用了元数据的机器组ID列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getGroupIds() {
        return this.GroupIds;
    }

    /**
     * Set 使用了元数据的机器组ID列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupIds 使用了元数据的机器组ID列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupIds(String [] GroupIds) {
        this.GroupIds = GroupIds;
    }

    public LogConfigInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogConfigInfo(LogConfigInfo source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
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
        if (source.LogFormat != null) {
            this.LogFormat = new String(source.LogFormat);
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
        if (source.ConfigId != null) {
            this.ConfigId = new String(source.ConfigId);
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
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamObj(map, prefix + "ExtractRule.", this.ExtractRule);
        this.setParamSimple(map, prefix + "LogFormat", this.LogFormat);
        this.setParamArrayObj(map, prefix + "ExcludePaths.", this.ExcludePaths);
        this.setParamSimple(map, prefix + "UserDefineRule", this.UserDefineRule);
        this.setParamSimple(map, prefix + "ConfigId", this.ConfigId);
        this.setParamArraySimple(map, prefix + "GroupIds.", this.GroupIds);

    }
}

