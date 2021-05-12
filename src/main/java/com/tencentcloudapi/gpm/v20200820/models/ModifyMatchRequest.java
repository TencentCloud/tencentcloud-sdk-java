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

public class ModifyMatchRequest extends AbstractModel{

    /**
    * 匹配名称，[a-zA-Z0-9-\.]* 长度128
    */
    @SerializedName("MatchName")
    @Expose
    private String MatchName;

    /**
    * 规则code
    */
    @SerializedName("RuleCode")
    @Expose
    private String RuleCode;

    /**
    * 超时时间，1-600秒
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * 是否为匹配结果请求服务器资源，0表示否，1表示请求GSE资源
    */
    @SerializedName("ServerType")
    @Expose
    private Long ServerType;

    /**
    * 匹配code
    */
    @SerializedName("MatchCode")
    @Expose
    private String MatchCode;

    /**
    * 匹配描述，最长1024
    */
    @SerializedName("MatchDesc")
    @Expose
    private String MatchDesc;

    /**
    * 只支持 http 和 https 协议
    */
    @SerializedName("NotifyUrl")
    @Expose
    private String NotifyUrl;

    /**
    * 游戏服务器队列地域
    */
    @SerializedName("ServerRegion")
    @Expose
    private String ServerRegion;

    /**
    * 游戏服务器队列
    */
    @SerializedName("ServerQueue")
    @Expose
    private String ServerQueue;

    /**
    * 自定义推送数据
    */
    @SerializedName("CustomPushData")
    @Expose
    private String CustomPushData;

    /**
    * 游戏服务器会话数据
    */
    @SerializedName("ServerSessionData")
    @Expose
    private String ServerSessionData;

    /**
    * 游戏属性，key-value结构的数组
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
    * 标签，key-value结构的数组
    */
    @SerializedName("Tags")
    @Expose
    private StringKV [] Tags;

    /**
     * Get 匹配名称，[a-zA-Z0-9-\.]* 长度128 
     * @return MatchName 匹配名称，[a-zA-Z0-9-\.]* 长度128
     */
    public String getMatchName() {
        return this.MatchName;
    }

    /**
     * Set 匹配名称，[a-zA-Z0-9-\.]* 长度128
     * @param MatchName 匹配名称，[a-zA-Z0-9-\.]* 长度128
     */
    public void setMatchName(String MatchName) {
        this.MatchName = MatchName;
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
     * Get 超时时间，1-600秒 
     * @return Timeout 超时时间，1-600秒
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set 超时时间，1-600秒
     * @param Timeout 超时时间，1-600秒
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get 是否为匹配结果请求服务器资源，0表示否，1表示请求GSE资源 
     * @return ServerType 是否为匹配结果请求服务器资源，0表示否，1表示请求GSE资源
     */
    public Long getServerType() {
        return this.ServerType;
    }

    /**
     * Set 是否为匹配结果请求服务器资源，0表示否，1表示请求GSE资源
     * @param ServerType 是否为匹配结果请求服务器资源，0表示否，1表示请求GSE资源
     */
    public void setServerType(Long ServerType) {
        this.ServerType = ServerType;
    }

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
     * Get 匹配描述，最长1024 
     * @return MatchDesc 匹配描述，最长1024
     */
    public String getMatchDesc() {
        return this.MatchDesc;
    }

    /**
     * Set 匹配描述，最长1024
     * @param MatchDesc 匹配描述，最长1024
     */
    public void setMatchDesc(String MatchDesc) {
        this.MatchDesc = MatchDesc;
    }

    /**
     * Get 只支持 http 和 https 协议 
     * @return NotifyUrl 只支持 http 和 https 协议
     */
    public String getNotifyUrl() {
        return this.NotifyUrl;
    }

    /**
     * Set 只支持 http 和 https 协议
     * @param NotifyUrl 只支持 http 和 https 协议
     */
    public void setNotifyUrl(String NotifyUrl) {
        this.NotifyUrl = NotifyUrl;
    }

    /**
     * Get 游戏服务器队列地域 
     * @return ServerRegion 游戏服务器队列地域
     */
    public String getServerRegion() {
        return this.ServerRegion;
    }

    /**
     * Set 游戏服务器队列地域
     * @param ServerRegion 游戏服务器队列地域
     */
    public void setServerRegion(String ServerRegion) {
        this.ServerRegion = ServerRegion;
    }

    /**
     * Get 游戏服务器队列 
     * @return ServerQueue 游戏服务器队列
     */
    public String getServerQueue() {
        return this.ServerQueue;
    }

    /**
     * Set 游戏服务器队列
     * @param ServerQueue 游戏服务器队列
     */
    public void setServerQueue(String ServerQueue) {
        this.ServerQueue = ServerQueue;
    }

    /**
     * Get 自定义推送数据 
     * @return CustomPushData 自定义推送数据
     */
    public String getCustomPushData() {
        return this.CustomPushData;
    }

    /**
     * Set 自定义推送数据
     * @param CustomPushData 自定义推送数据
     */
    public void setCustomPushData(String CustomPushData) {
        this.CustomPushData = CustomPushData;
    }

    /**
     * Get 游戏服务器会话数据 
     * @return ServerSessionData 游戏服务器会话数据
     */
    public String getServerSessionData() {
        return this.ServerSessionData;
    }

    /**
     * Set 游戏服务器会话数据
     * @param ServerSessionData 游戏服务器会话数据
     */
    public void setServerSessionData(String ServerSessionData) {
        this.ServerSessionData = ServerSessionData;
    }

    /**
     * Get 游戏属性，key-value结构的数组 
     * @return GameProperties 游戏属性，key-value结构的数组
     */
    public StringKV [] getGameProperties() {
        return this.GameProperties;
    }

    /**
     * Set 游戏属性，key-value结构的数组
     * @param GameProperties 游戏属性，key-value结构的数组
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
     * Get 标签，key-value结构的数组 
     * @return Tags 标签，key-value结构的数组
     */
    public StringKV [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签，key-value结构的数组
     * @param Tags 标签，key-value结构的数组
     */
    public void setTags(StringKV [] Tags) {
        this.Tags = Tags;
    }

    public ModifyMatchRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyMatchRequest(ModifyMatchRequest source) {
        if (source.MatchName != null) {
            this.MatchName = new String(source.MatchName);
        }
        if (source.RuleCode != null) {
            this.RuleCode = new String(source.RuleCode);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.ServerType != null) {
            this.ServerType = new Long(source.ServerType);
        }
        if (source.MatchCode != null) {
            this.MatchCode = new String(source.MatchCode);
        }
        if (source.MatchDesc != null) {
            this.MatchDesc = new String(source.MatchDesc);
        }
        if (source.NotifyUrl != null) {
            this.NotifyUrl = new String(source.NotifyUrl);
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
        if (source.Tags != null) {
            this.Tags = new StringKV[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new StringKV(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MatchName", this.MatchName);
        this.setParamSimple(map, prefix + "RuleCode", this.RuleCode);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "ServerType", this.ServerType);
        this.setParamSimple(map, prefix + "MatchCode", this.MatchCode);
        this.setParamSimple(map, prefix + "MatchDesc", this.MatchDesc);
        this.setParamSimple(map, prefix + "NotifyUrl", this.NotifyUrl);
        this.setParamSimple(map, prefix + "ServerRegion", this.ServerRegion);
        this.setParamSimple(map, prefix + "ServerQueue", this.ServerQueue);
        this.setParamSimple(map, prefix + "CustomPushData", this.CustomPushData);
        this.setParamSimple(map, prefix + "ServerSessionData", this.ServerSessionData);
        this.setParamArrayObj(map, prefix + "GameProperties.", this.GameProperties);
        this.setParamSimple(map, prefix + "LogSwitch", this.LogSwitch);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

