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
package com.tencentcloudapi.gpm.v20200820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MatchInfo extends AbstractModel{

    /**
    * 匹配code
    */
    @SerializedName("MatchCode")
    @Expose
    private String MatchCode;

    /**
    * 匹配名称
    */
    @SerializedName("MatchName")
    @Expose
    private String MatchName;

    /**
    * 匹配描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MatchDesc")
    @Expose
    private String MatchDesc;

    /**
    * 规则code
    */
    @SerializedName("RuleCode")
    @Expose
    private String RuleCode;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 超时时间
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * 接收通知地址
    */
    @SerializedName("NotifyUrl")
    @Expose
    private String NotifyUrl;

    /**
    * 是否为匹配结果请求服务器资源，0否，1请求GSE资源
    */
    @SerializedName("ServerType")
    @Expose
    private Long ServerType;

    /**
    * 服务器队列所在地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServerRegion")
    @Expose
    private String ServerRegion;

    /**
    * 服务器队列
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServerQueue")
    @Expose
    private String ServerQueue;

    /**
    * 自定义推送数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomPushData")
    @Expose
    private String CustomPushData;

    /**
    * 游戏服务器会话数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServerSessionData")
    @Expose
    private String ServerSessionData;

    /**
    * 游戏属性
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GameProperties")
    @Expose
    private StringKV [] GameProperties;

    /**
    * 日志开关，0表示关，1表示开
    */
    @SerializedName("LogSwitch")
    @Expose
    private Long LogSwitch;

    /**
    * 日志集id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * 日志集名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogsetName")
    @Expose
    private String LogsetName;

    /**
    * 日志主题id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogTopicId")
    @Expose
    private String LogTopicId;

    /**
    * 日志主题名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogTopicName")
    @Expose
    private String LogTopicName;

    /**
    * 标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private StringKV [] Tags;

    /**
    * 地区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 用户AppId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 用户主账号Uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 用户创建账号Uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateUin")
    @Expose
    private String CreateUin;

    /**
    * 规则名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 日志状态，0表示正常，1表示日志集不存在，2表示日志主题不存在，3表示日志集和日志主题都不存在。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogStatus")
    @Expose
    private Long LogStatus;

    /**
     * Get 匹配code 
     * @return MatchCode 匹配code
     */
    public String getMatchCode() {
        return this.MatchCode;
    }

    /**
     * Set 匹配code
     * @param MatchCode 匹配code
     */
    public void setMatchCode(String MatchCode) {
        this.MatchCode = MatchCode;
    }

    /**
     * Get 匹配名称 
     * @return MatchName 匹配名称
     */
    public String getMatchName() {
        return this.MatchName;
    }

    /**
     * Set 匹配名称
     * @param MatchName 匹配名称
     */
    public void setMatchName(String MatchName) {
        this.MatchName = MatchName;
    }

    /**
     * Get 匹配描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MatchDesc 匹配描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMatchDesc() {
        return this.MatchDesc;
    }

    /**
     * Set 匹配描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param MatchDesc 匹配描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMatchDesc(String MatchDesc) {
        this.MatchDesc = MatchDesc;
    }

    /**
     * Get 规则code 
     * @return RuleCode 规则code
     */
    public String getRuleCode() {
        return this.RuleCode;
    }

    /**
     * Set 规则code
     * @param RuleCode 规则code
     */
    public void setRuleCode(String RuleCode) {
        this.RuleCode = RuleCode;
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
     * Get 超时时间 
     * @return Timeout 超时时间
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set 超时时间
     * @param Timeout 超时时间
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get 接收通知地址 
     * @return NotifyUrl 接收通知地址
     */
    public String getNotifyUrl() {
        return this.NotifyUrl;
    }

    /**
     * Set 接收通知地址
     * @param NotifyUrl 接收通知地址
     */
    public void setNotifyUrl(String NotifyUrl) {
        this.NotifyUrl = NotifyUrl;
    }

    /**
     * Get 是否为匹配结果请求服务器资源，0否，1请求GSE资源 
     * @return ServerType 是否为匹配结果请求服务器资源，0否，1请求GSE资源
     */
    public Long getServerType() {
        return this.ServerType;
    }

    /**
     * Set 是否为匹配结果请求服务器资源，0否，1请求GSE资源
     * @param ServerType 是否为匹配结果请求服务器资源，0否，1请求GSE资源
     */
    public void setServerType(Long ServerType) {
        this.ServerType = ServerType;
    }

    /**
     * Get 服务器队列所在地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServerRegion 服务器队列所在地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServerRegion() {
        return this.ServerRegion;
    }

    /**
     * Set 服务器队列所在地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServerRegion 服务器队列所在地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServerRegion(String ServerRegion) {
        this.ServerRegion = ServerRegion;
    }

    /**
     * Get 服务器队列
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServerQueue 服务器队列
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServerQueue() {
        return this.ServerQueue;
    }

    /**
     * Set 服务器队列
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServerQueue 服务器队列
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServerQueue(String ServerQueue) {
        this.ServerQueue = ServerQueue;
    }

    /**
     * Get 自定义推送数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomPushData 自定义推送数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCustomPushData() {
        return this.CustomPushData;
    }

    /**
     * Set 自定义推送数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomPushData 自定义推送数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomPushData(String CustomPushData) {
        this.CustomPushData = CustomPushData;
    }

    /**
     * Get 游戏服务器会话数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServerSessionData 游戏服务器会话数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServerSessionData() {
        return this.ServerSessionData;
    }

    /**
     * Set 游戏服务器会话数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServerSessionData 游戏服务器会话数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServerSessionData(String ServerSessionData) {
        this.ServerSessionData = ServerSessionData;
    }

    /**
     * Get 游戏属性
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GameProperties 游戏属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StringKV [] getGameProperties() {
        return this.GameProperties;
    }

    /**
     * Set 游戏属性
注意：此字段可能返回 null，表示取不到有效值。
     * @param GameProperties 游戏属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGameProperties(StringKV [] GameProperties) {
        this.GameProperties = GameProperties;
    }

    /**
     * Get 日志开关，0表示关，1表示开 
     * @return LogSwitch 日志开关，0表示关，1表示开
     */
    public Long getLogSwitch() {
        return this.LogSwitch;
    }

    /**
     * Set 日志开关，0表示关，1表示开
     * @param LogSwitch 日志开关，0表示关，1表示开
     */
    public void setLogSwitch(Long LogSwitch) {
        this.LogSwitch = LogSwitch;
    }

    /**
     * Get 日志集id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogsetId 日志集id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set 日志集id
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogsetId 日志集id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get 日志集名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogsetName 日志集名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogsetName() {
        return this.LogsetName;
    }

    /**
     * Set 日志集名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogsetName 日志集名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogsetName(String LogsetName) {
        this.LogsetName = LogsetName;
    }

    /**
     * Get 日志主题id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogTopicId 日志主题id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogTopicId() {
        return this.LogTopicId;
    }

    /**
     * Set 日志主题id
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogTopicId 日志主题id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogTopicId(String LogTopicId) {
        this.LogTopicId = LogTopicId;
    }

    /**
     * Get 日志主题名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogTopicName 日志主题名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogTopicName() {
        return this.LogTopicName;
    }

    /**
     * Set 日志主题名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogTopicName 日志主题名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogTopicName(String LogTopicName) {
        this.LogTopicName = LogTopicName;
    }

    /**
     * Get 标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StringKV [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(StringKV [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 地区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 地区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地区
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 地区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 用户AppId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId 用户AppId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户AppId
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId 用户AppId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 用户主账号Uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uin 用户主账号Uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 用户主账号Uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uin 用户主账号Uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 用户创建账号Uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateUin 用户创建账号Uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateUin() {
        return this.CreateUin;
    }

    /**
     * Set 用户创建账号Uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateUin 用户创建账号Uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateUin(String CreateUin) {
        this.CreateUin = CreateUin;
    }

    /**
     * Get 规则名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleName 规则名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 规则名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleName 规则名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 日志状态，0表示正常，1表示日志集不存在，2表示日志主题不存在，3表示日志集和日志主题都不存在。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogStatus 日志状态，0表示正常，1表示日志集不存在，2表示日志主题不存在，3表示日志集和日志主题都不存在。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLogStatus() {
        return this.LogStatus;
    }

    /**
     * Set 日志状态，0表示正常，1表示日志集不存在，2表示日志主题不存在，3表示日志集和日志主题都不存在。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogStatus 日志状态，0表示正常，1表示日志集不存在，2表示日志主题不存在，3表示日志集和日志主题都不存在。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogStatus(Long LogStatus) {
        this.LogStatus = LogStatus;
    }

    public MatchInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MatchInfo(MatchInfo source) {
        if (source.MatchCode != null) {
            this.MatchCode = new String(source.MatchCode);
        }
        if (source.MatchName != null) {
            this.MatchName = new String(source.MatchName);
        }
        if (source.MatchDesc != null) {
            this.MatchDesc = new String(source.MatchDesc);
        }
        if (source.RuleCode != null) {
            this.RuleCode = new String(source.RuleCode);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.NotifyUrl != null) {
            this.NotifyUrl = new String(source.NotifyUrl);
        }
        if (source.ServerType != null) {
            this.ServerType = new Long(source.ServerType);
        }
        if (source.ServerRegion != null) {
            this.ServerRegion = new String(source.ServerRegion);
        }
        if (source.ServerQueue != null) {
            this.ServerQueue = new String(source.ServerQueue);
        }
        if (source.CustomPushData != null) {
            this.CustomPushData = new String(source.CustomPushData);
        }
        if (source.ServerSessionData != null) {
            this.ServerSessionData = new String(source.ServerSessionData);
        }
        if (source.GameProperties != null) {
            this.GameProperties = new StringKV[source.GameProperties.length];
            for (int i = 0; i < source.GameProperties.length; i++) {
                this.GameProperties[i] = new StringKV(source.GameProperties[i]);
            }
        }
        if (source.LogSwitch != null) {
            this.LogSwitch = new Long(source.LogSwitch);
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.LogsetName != null) {
            this.LogsetName = new String(source.LogsetName);
        }
        if (source.LogTopicId != null) {
            this.LogTopicId = new String(source.LogTopicId);
        }
        if (source.LogTopicName != null) {
            this.LogTopicName = new String(source.LogTopicName);
        }
        if (source.Tags != null) {
            this.Tags = new StringKV[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new StringKV(source.Tags[i]);
            }
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.CreateUin != null) {
            this.CreateUin = new String(source.CreateUin);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.LogStatus != null) {
            this.LogStatus = new Long(source.LogStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MatchCode", this.MatchCode);
        this.setParamSimple(map, prefix + "MatchName", this.MatchName);
        this.setParamSimple(map, prefix + "MatchDesc", this.MatchDesc);
        this.setParamSimple(map, prefix + "RuleCode", this.RuleCode);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "NotifyUrl", this.NotifyUrl);
        this.setParamSimple(map, prefix + "ServerType", this.ServerType);
        this.setParamSimple(map, prefix + "ServerRegion", this.ServerRegion);
        this.setParamSimple(map, prefix + "ServerQueue", this.ServerQueue);
        this.setParamSimple(map, prefix + "CustomPushData", this.CustomPushData);
        this.setParamSimple(map, prefix + "ServerSessionData", this.ServerSessionData);
        this.setParamArrayObj(map, prefix + "GameProperties.", this.GameProperties);
        this.setParamSimple(map, prefix + "LogSwitch", this.LogSwitch);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "LogsetName", this.LogsetName);
        this.setParamSimple(map, prefix + "LogTopicId", this.LogTopicId);
        this.setParamSimple(map, prefix + "LogTopicName", this.LogTopicName);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "CreateUin", this.CreateUin);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "LogStatus", this.LogStatus);

    }
}

