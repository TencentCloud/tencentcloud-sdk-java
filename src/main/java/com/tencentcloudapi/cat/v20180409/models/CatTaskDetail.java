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
package com.tencentcloudapi.cat.v20180409.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CatTaskDetail extends AbstractModel{

    /**
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 任务名称
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 任务周期，单位为分钟。目前支持1，5，15，30几种取值
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 拨测类型。http, https, ping, tcp 之一
    */
    @SerializedName("CatTypeName")
    @Expose
    private String CatTypeName;

    /**
    * 拨测任务的URL
    */
    @SerializedName("CgiUrl")
    @Expose
    private String CgiUrl;

    /**
    * 拨测分组ID
    */
    @SerializedName("AgentGroupId")
    @Expose
    private Long AgentGroupId;

    /**
    * 告警策略组ID
    */
    @SerializedName("PolicyGroupId")
    @Expose
    private Long PolicyGroupId;

    /**
    * 任务状态。1表示暂停，2表示运行中，0为初始态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 任务创建时间
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * 任务类型。0 站点监控，2 可用性监控
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 绑定的统一告警主题ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 告警状态。0 未启用，1, 启用
    */
    @SerializedName("AlarmStatus")
    @Expose
    private Long AlarmStatus;

    /**
    * 指定的域名
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 拨测目标的端口号
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 要在结果中进行匹配的字符串
    */
    @SerializedName("CheckStr")
    @Expose
    private String CheckStr;

    /**
    * 1 表示通过检查结果是否包含CheckStr 进行校验
    */
    @SerializedName("CheckType")
    @Expose
    private Long CheckType;

    /**
    * 用户Agent信息
    */
    @SerializedName("UserAgent")
    @Expose
    private String UserAgent;

    /**
    * 设置的Cookie信息
    */
    @SerializedName("Cookie")
    @Expose
    private String Cookie;

    /**
    * POST 请求数据。空字符串表示非POST请求
    */
    @SerializedName("PostData")
    @Expose
    private String PostData;

    /**
    * SSL协议版本
    */
    @SerializedName("SslVer")
    @Expose
    private String SslVer;

    /**
    * 是否为Header请求。非0 Header 请求
    */
    @SerializedName("IsHeader")
    @Expose
    private Long IsHeader;

    /**
    * 目的DNS服务器
    */
    @SerializedName("DnsSvr")
    @Expose
    private String DnsSvr;

    /**
    * 需要检验是否在DNS IP列表的IP
    */
    @SerializedName("DnsCheckIp")
    @Expose
    private String DnsCheckIp;

    /**
    * DNS查询类型
    */
    @SerializedName("DnsQueryType")
    @Expose
    private String DnsQueryType;

    /**
    * 登录服务器的账号
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 登录服务器的密码
    */
    @SerializedName("PassWord")
    @Expose
    private String PassWord;

    /**
    * 是否使用安全链接SSL， 0 不使用，1 使用
    */
    @SerializedName("UseSecConn")
    @Expose
    private Long UseSecConn;

    /**
    * FTP登录验证方式  0 不验证  1 匿名登录  2 需要身份验证
    */
    @SerializedName("NeedAuth")
    @Expose
    private Long NeedAuth;

    /**
    * 请求数据类型。0 表示请求为字符串类型。1表示为二进制类型
    */
    @SerializedName("ReqDataType")
    @Expose
    private Long ReqDataType;

    /**
    * 发起TCP, UDP请求的协议请求数据
    */
    @SerializedName("ReqData")
    @Expose
    private String ReqData;

    /**
    * 响应数据类型。0 表示响应为字符串类型。1表示为二进制类型
    */
    @SerializedName("RespDataType")
    @Expose
    private Long RespDataType;

    /**
    * 预期的UDP请求的回应数据
    */
    @SerializedName("RespData")
    @Expose
    private String RespData;

    /**
    * 跟随跳转次数
    */
    @SerializedName("RedirectFollowNum")
    @Expose
    private Long RedirectFollowNum;

    /**
     * Get 任务ID 
     * @return TaskId 任务ID
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
     * @param TaskId 任务ID
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务名称 
     * @return TaskName 任务名称
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名称
     * @param TaskName 任务名称
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 任务周期，单位为分钟。目前支持1，5，15，30几种取值 
     * @return Period 任务周期，单位为分钟。目前支持1，5，15，30几种取值
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 任务周期，单位为分钟。目前支持1，5，15，30几种取值
     * @param Period 任务周期，单位为分钟。目前支持1，5，15，30几种取值
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 拨测类型。http, https, ping, tcp 之一 
     * @return CatTypeName 拨测类型。http, https, ping, tcp 之一
     */
    public String getCatTypeName() {
        return this.CatTypeName;
    }

    /**
     * Set 拨测类型。http, https, ping, tcp 之一
     * @param CatTypeName 拨测类型。http, https, ping, tcp 之一
     */
    public void setCatTypeName(String CatTypeName) {
        this.CatTypeName = CatTypeName;
    }

    /**
     * Get 拨测任务的URL 
     * @return CgiUrl 拨测任务的URL
     */
    public String getCgiUrl() {
        return this.CgiUrl;
    }

    /**
     * Set 拨测任务的URL
     * @param CgiUrl 拨测任务的URL
     */
    public void setCgiUrl(String CgiUrl) {
        this.CgiUrl = CgiUrl;
    }

    /**
     * Get 拨测分组ID 
     * @return AgentGroupId 拨测分组ID
     */
    public Long getAgentGroupId() {
        return this.AgentGroupId;
    }

    /**
     * Set 拨测分组ID
     * @param AgentGroupId 拨测分组ID
     */
    public void setAgentGroupId(Long AgentGroupId) {
        this.AgentGroupId = AgentGroupId;
    }

    /**
     * Get 告警策略组ID 
     * @return PolicyGroupId 告警策略组ID
     */
    public Long getPolicyGroupId() {
        return this.PolicyGroupId;
    }

    /**
     * Set 告警策略组ID
     * @param PolicyGroupId 告警策略组ID
     */
    public void setPolicyGroupId(Long PolicyGroupId) {
        this.PolicyGroupId = PolicyGroupId;
    }

    /**
     * Get 任务状态。1表示暂停，2表示运行中，0为初始态 
     * @return Status 任务状态。1表示暂停，2表示运行中，0为初始态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态。1表示暂停，2表示运行中，0为初始态
     * @param Status 任务状态。1表示暂停，2表示运行中，0为初始态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 任务创建时间 
     * @return AddTime 任务创建时间
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set 任务创建时间
     * @param AddTime 任务创建时间
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get 任务类型。0 站点监控，2 可用性监控 
     * @return Type 任务类型。0 站点监控，2 可用性监控
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 任务类型。0 站点监控，2 可用性监控
     * @param Type 任务类型。0 站点监控，2 可用性监控
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 绑定的统一告警主题ID 
     * @return TopicId 绑定的统一告警主题ID
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 绑定的统一告警主题ID
     * @param TopicId 绑定的统一告警主题ID
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 告警状态。0 未启用，1, 启用 
     * @return AlarmStatus 告警状态。0 未启用，1, 启用
     */
    public Long getAlarmStatus() {
        return this.AlarmStatus;
    }

    /**
     * Set 告警状态。0 未启用，1, 启用
     * @param AlarmStatus 告警状态。0 未启用，1, 启用
     */
    public void setAlarmStatus(Long AlarmStatus) {
        this.AlarmStatus = AlarmStatus;
    }

    /**
     * Get 指定的域名 
     * @return Host 指定的域名
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 指定的域名
     * @param Host 指定的域名
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get 拨测目标的端口号 
     * @return Port 拨测目标的端口号
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 拨测目标的端口号
     * @param Port 拨测目标的端口号
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 要在结果中进行匹配的字符串 
     * @return CheckStr 要在结果中进行匹配的字符串
     */
    public String getCheckStr() {
        return this.CheckStr;
    }

    /**
     * Set 要在结果中进行匹配的字符串
     * @param CheckStr 要在结果中进行匹配的字符串
     */
    public void setCheckStr(String CheckStr) {
        this.CheckStr = CheckStr;
    }

    /**
     * Get 1 表示通过检查结果是否包含CheckStr 进行校验 
     * @return CheckType 1 表示通过检查结果是否包含CheckStr 进行校验
     */
    public Long getCheckType() {
        return this.CheckType;
    }

    /**
     * Set 1 表示通过检查结果是否包含CheckStr 进行校验
     * @param CheckType 1 表示通过检查结果是否包含CheckStr 进行校验
     */
    public void setCheckType(Long CheckType) {
        this.CheckType = CheckType;
    }

    /**
     * Get 用户Agent信息 
     * @return UserAgent 用户Agent信息
     */
    public String getUserAgent() {
        return this.UserAgent;
    }

    /**
     * Set 用户Agent信息
     * @param UserAgent 用户Agent信息
     */
    public void setUserAgent(String UserAgent) {
        this.UserAgent = UserAgent;
    }

    /**
     * Get 设置的Cookie信息 
     * @return Cookie 设置的Cookie信息
     */
    public String getCookie() {
        return this.Cookie;
    }

    /**
     * Set 设置的Cookie信息
     * @param Cookie 设置的Cookie信息
     */
    public void setCookie(String Cookie) {
        this.Cookie = Cookie;
    }

    /**
     * Get POST 请求数据。空字符串表示非POST请求 
     * @return PostData POST 请求数据。空字符串表示非POST请求
     */
    public String getPostData() {
        return this.PostData;
    }

    /**
     * Set POST 请求数据。空字符串表示非POST请求
     * @param PostData POST 请求数据。空字符串表示非POST请求
     */
    public void setPostData(String PostData) {
        this.PostData = PostData;
    }

    /**
     * Get SSL协议版本 
     * @return SslVer SSL协议版本
     */
    public String getSslVer() {
        return this.SslVer;
    }

    /**
     * Set SSL协议版本
     * @param SslVer SSL协议版本
     */
    public void setSslVer(String SslVer) {
        this.SslVer = SslVer;
    }

    /**
     * Get 是否为Header请求。非0 Header 请求 
     * @return IsHeader 是否为Header请求。非0 Header 请求
     */
    public Long getIsHeader() {
        return this.IsHeader;
    }

    /**
     * Set 是否为Header请求。非0 Header 请求
     * @param IsHeader 是否为Header请求。非0 Header 请求
     */
    public void setIsHeader(Long IsHeader) {
        this.IsHeader = IsHeader;
    }

    /**
     * Get 目的DNS服务器 
     * @return DnsSvr 目的DNS服务器
     */
    public String getDnsSvr() {
        return this.DnsSvr;
    }

    /**
     * Set 目的DNS服务器
     * @param DnsSvr 目的DNS服务器
     */
    public void setDnsSvr(String DnsSvr) {
        this.DnsSvr = DnsSvr;
    }

    /**
     * Get 需要检验是否在DNS IP列表的IP 
     * @return DnsCheckIp 需要检验是否在DNS IP列表的IP
     */
    public String getDnsCheckIp() {
        return this.DnsCheckIp;
    }

    /**
     * Set 需要检验是否在DNS IP列表的IP
     * @param DnsCheckIp 需要检验是否在DNS IP列表的IP
     */
    public void setDnsCheckIp(String DnsCheckIp) {
        this.DnsCheckIp = DnsCheckIp;
    }

    /**
     * Get DNS查询类型 
     * @return DnsQueryType DNS查询类型
     */
    public String getDnsQueryType() {
        return this.DnsQueryType;
    }

    /**
     * Set DNS查询类型
     * @param DnsQueryType DNS查询类型
     */
    public void setDnsQueryType(String DnsQueryType) {
        this.DnsQueryType = DnsQueryType;
    }

    /**
     * Get 登录服务器的账号 
     * @return UserName 登录服务器的账号
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 登录服务器的账号
     * @param UserName 登录服务器的账号
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 登录服务器的密码 
     * @return PassWord 登录服务器的密码
     */
    public String getPassWord() {
        return this.PassWord;
    }

    /**
     * Set 登录服务器的密码
     * @param PassWord 登录服务器的密码
     */
    public void setPassWord(String PassWord) {
        this.PassWord = PassWord;
    }

    /**
     * Get 是否使用安全链接SSL， 0 不使用，1 使用 
     * @return UseSecConn 是否使用安全链接SSL， 0 不使用，1 使用
     */
    public Long getUseSecConn() {
        return this.UseSecConn;
    }

    /**
     * Set 是否使用安全链接SSL， 0 不使用，1 使用
     * @param UseSecConn 是否使用安全链接SSL， 0 不使用，1 使用
     */
    public void setUseSecConn(Long UseSecConn) {
        this.UseSecConn = UseSecConn;
    }

    /**
     * Get FTP登录验证方式  0 不验证  1 匿名登录  2 需要身份验证 
     * @return NeedAuth FTP登录验证方式  0 不验证  1 匿名登录  2 需要身份验证
     */
    public Long getNeedAuth() {
        return this.NeedAuth;
    }

    /**
     * Set FTP登录验证方式  0 不验证  1 匿名登录  2 需要身份验证
     * @param NeedAuth FTP登录验证方式  0 不验证  1 匿名登录  2 需要身份验证
     */
    public void setNeedAuth(Long NeedAuth) {
        this.NeedAuth = NeedAuth;
    }

    /**
     * Get 请求数据类型。0 表示请求为字符串类型。1表示为二进制类型 
     * @return ReqDataType 请求数据类型。0 表示请求为字符串类型。1表示为二进制类型
     */
    public Long getReqDataType() {
        return this.ReqDataType;
    }

    /**
     * Set 请求数据类型。0 表示请求为字符串类型。1表示为二进制类型
     * @param ReqDataType 请求数据类型。0 表示请求为字符串类型。1表示为二进制类型
     */
    public void setReqDataType(Long ReqDataType) {
        this.ReqDataType = ReqDataType;
    }

    /**
     * Get 发起TCP, UDP请求的协议请求数据 
     * @return ReqData 发起TCP, UDP请求的协议请求数据
     */
    public String getReqData() {
        return this.ReqData;
    }

    /**
     * Set 发起TCP, UDP请求的协议请求数据
     * @param ReqData 发起TCP, UDP请求的协议请求数据
     */
    public void setReqData(String ReqData) {
        this.ReqData = ReqData;
    }

    /**
     * Get 响应数据类型。0 表示响应为字符串类型。1表示为二进制类型 
     * @return RespDataType 响应数据类型。0 表示响应为字符串类型。1表示为二进制类型
     */
    public Long getRespDataType() {
        return this.RespDataType;
    }

    /**
     * Set 响应数据类型。0 表示响应为字符串类型。1表示为二进制类型
     * @param RespDataType 响应数据类型。0 表示响应为字符串类型。1表示为二进制类型
     */
    public void setRespDataType(Long RespDataType) {
        this.RespDataType = RespDataType;
    }

    /**
     * Get 预期的UDP请求的回应数据 
     * @return RespData 预期的UDP请求的回应数据
     */
    public String getRespData() {
        return this.RespData;
    }

    /**
     * Set 预期的UDP请求的回应数据
     * @param RespData 预期的UDP请求的回应数据
     */
    public void setRespData(String RespData) {
        this.RespData = RespData;
    }

    /**
     * Get 跟随跳转次数 
     * @return RedirectFollowNum 跟随跳转次数
     */
    public Long getRedirectFollowNum() {
        return this.RedirectFollowNum;
    }

    /**
     * Set 跟随跳转次数
     * @param RedirectFollowNum 跟随跳转次数
     */
    public void setRedirectFollowNum(Long RedirectFollowNum) {
        this.RedirectFollowNum = RedirectFollowNum;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "CatTypeName", this.CatTypeName);
        this.setParamSimple(map, prefix + "CgiUrl", this.CgiUrl);
        this.setParamSimple(map, prefix + "AgentGroupId", this.AgentGroupId);
        this.setParamSimple(map, prefix + "PolicyGroupId", this.PolicyGroupId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "AlarmStatus", this.AlarmStatus);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "CheckStr", this.CheckStr);
        this.setParamSimple(map, prefix + "CheckType", this.CheckType);
        this.setParamSimple(map, prefix + "UserAgent", this.UserAgent);
        this.setParamSimple(map, prefix + "Cookie", this.Cookie);
        this.setParamSimple(map, prefix + "PostData", this.PostData);
        this.setParamSimple(map, prefix + "SslVer", this.SslVer);
        this.setParamSimple(map, prefix + "IsHeader", this.IsHeader);
        this.setParamSimple(map, prefix + "DnsSvr", this.DnsSvr);
        this.setParamSimple(map, prefix + "DnsCheckIp", this.DnsCheckIp);
        this.setParamSimple(map, prefix + "DnsQueryType", this.DnsQueryType);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "PassWord", this.PassWord);
        this.setParamSimple(map, prefix + "UseSecConn", this.UseSecConn);
        this.setParamSimple(map, prefix + "NeedAuth", this.NeedAuth);
        this.setParamSimple(map, prefix + "ReqDataType", this.ReqDataType);
        this.setParamSimple(map, prefix + "ReqData", this.ReqData);
        this.setParamSimple(map, prefix + "RespDataType", this.RespDataType);
        this.setParamSimple(map, prefix + "RespData", this.RespData);
        this.setParamSimple(map, prefix + "RedirectFollowNum", this.RedirectFollowNum);

    }
}

