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

public class CreateTaskExRequest extends AbstractModel{

    /**
    * http, https, ping, tcp, ftp, smtp, udp, dns 之一
    */
    @SerializedName("CatTypeName")
    @Expose
    private String CatTypeName;

    /**
    * 拨测的url  例如：www.qq.com (url域名解析需要能解析出具体的ip)
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 拨测周期。取值可为1,5,15,30之一, 单位：分钟。精度不能低于用户等级规定的最小精度
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 拨测任务名称不能超过32个字符。同一个用户创建的任务名不可重复
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 拨测分组id，体现本拨测任务要采用那些运营商作为拨测源。一般可直接填写本用户的默认拨测分组。参见：DescribeAgentGroups 接口，本参数使用返回结果里的GroupId的值。注意： Type为0时，AgentGroupId为必填
    */
    @SerializedName("AgentGroupId")
    @Expose
    private Long AgentGroupId;

    /**
    * 指定域名(如需要)
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 是否为Header请求（非0 发起Header 请求。为0，且PostData 非空，发起POST请求。为0，PostData 为空，发起GET请求）
    */
    @SerializedName("IsHeader")
    @Expose
    private Long IsHeader;

    /**
    * url中含有https时有用。缺省为SSLv23。需要为 TLSv1_2, TLSv1_1, TLSv1, SSLv2, SSLv23, SSLv3 之一
    */
    @SerializedName("SslVer")
    @Expose
    private String SslVer;

    /**
    * POST 请求数据。空字符串表示非POST请求
    */
    @SerializedName("PostData")
    @Expose
    private String PostData;

    /**
    * 用户agent 信息
    */
    @SerializedName("UserAgent")
    @Expose
    private String UserAgent;

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
    * 需要设置的cookie信息
    */
    @SerializedName("Cookie")
    @Expose
    private String Cookie;

    /**
    * 任务号。用于验证且修改任务时传入原任务号
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 登陆服务器的账号。如果为空字符串，表示不用校验用户密码。只做简单连接服务器的拨测。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 登陆服务器的密码
    */
    @SerializedName("PassWord")
    @Expose
    private String PassWord;

    /**
    * 缺省为0。0 表示请求为字符串类型。1表示为二进制类型
    */
    @SerializedName("ReqDataType")
    @Expose
    private Long ReqDataType;

    /**
    * 发起tcp, udp请求的协议请求数据
    */
    @SerializedName("ReqData")
    @Expose
    private String ReqData;

    /**
    * 缺省为0。0 表示响应为字符串类型。1表示为二进制类型
    */
    @SerializedName("RespDataType")
    @Expose
    private Long RespDataType;

    /**
    * 预期的udp请求的回应数据。字符串型，只需要返回的结果里包含本字符串算校验通过。二进制型，则需要严格等于才算通过
    */
    @SerializedName("RespData")
    @Expose
    private String RespData;

    /**
    * 目的dns服务器  可以为空字符串
    */
    @SerializedName("DnsSvr")
    @Expose
    private String DnsSvr;

    /**
    * 需要检验是否在dns ip列表的ip。可以为空字符串，表示不校验
    */
    @SerializedName("DnsCheckIp")
    @Expose
    private String DnsCheckIp;

    /**
    * 需要为下列值之一。缺省为A。A, MX, NS, CNAME, TXT, ANY
    */
    @SerializedName("DnsQueryType")
    @Expose
    private String DnsQueryType;

    /**
    * 是否使用安全链接ssl  0 不使用，1 使用
    */
    @SerializedName("UseSecConn")
    @Expose
    private Long UseSecConn;

    /**
    * ftp登陆验证方式  0 不验证  1 匿名登陆  2 需要身份验证
    */
    @SerializedName("NeedAuth")
    @Expose
    private Long NeedAuth;

    /**
    * 拨测目标的端口号
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Type=0 默认 （站点监控）Type=2 可用率监控
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * IsVerify=0 非验证任务 IsVerify=1 验证任务，不传则默认为0
    */
    @SerializedName("IsVerify")
    @Expose
    private Long IsVerify;

    /**
    * 跟随跳转次数，取值范围0-5，不传则表示不跟随
    */
    @SerializedName("RedirectFollowNum")
    @Expose
    private Long RedirectFollowNum;

    /**
     * Get http, https, ping, tcp, ftp, smtp, udp, dns 之一 
     * @return CatTypeName http, https, ping, tcp, ftp, smtp, udp, dns 之一
     */
    public String getCatTypeName() {
        return this.CatTypeName;
    }

    /**
     * Set http, https, ping, tcp, ftp, smtp, udp, dns 之一
     * @param CatTypeName http, https, ping, tcp, ftp, smtp, udp, dns 之一
     */
    public void setCatTypeName(String CatTypeName) {
        this.CatTypeName = CatTypeName;
    }

    /**
     * Get 拨测的url  例如：www.qq.com (url域名解析需要能解析出具体的ip) 
     * @return Url 拨测的url  例如：www.qq.com (url域名解析需要能解析出具体的ip)
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 拨测的url  例如：www.qq.com (url域名解析需要能解析出具体的ip)
     * @param Url 拨测的url  例如：www.qq.com (url域名解析需要能解析出具体的ip)
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 拨测周期。取值可为1,5,15,30之一, 单位：分钟。精度不能低于用户等级规定的最小精度 
     * @return Period 拨测周期。取值可为1,5,15,30之一, 单位：分钟。精度不能低于用户等级规定的最小精度
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 拨测周期。取值可为1,5,15,30之一, 单位：分钟。精度不能低于用户等级规定的最小精度
     * @param Period 拨测周期。取值可为1,5,15,30之一, 单位：分钟。精度不能低于用户等级规定的最小精度
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 拨测任务名称不能超过32个字符。同一个用户创建的任务名不可重复 
     * @return TaskName 拨测任务名称不能超过32个字符。同一个用户创建的任务名不可重复
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 拨测任务名称不能超过32个字符。同一个用户创建的任务名不可重复
     * @param TaskName 拨测任务名称不能超过32个字符。同一个用户创建的任务名不可重复
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 拨测分组id，体现本拨测任务要采用那些运营商作为拨测源。一般可直接填写本用户的默认拨测分组。参见：DescribeAgentGroups 接口，本参数使用返回结果里的GroupId的值。注意： Type为0时，AgentGroupId为必填 
     * @return AgentGroupId 拨测分组id，体现本拨测任务要采用那些运营商作为拨测源。一般可直接填写本用户的默认拨测分组。参见：DescribeAgentGroups 接口，本参数使用返回结果里的GroupId的值。注意： Type为0时，AgentGroupId为必填
     */
    public Long getAgentGroupId() {
        return this.AgentGroupId;
    }

    /**
     * Set 拨测分组id，体现本拨测任务要采用那些运营商作为拨测源。一般可直接填写本用户的默认拨测分组。参见：DescribeAgentGroups 接口，本参数使用返回结果里的GroupId的值。注意： Type为0时，AgentGroupId为必填
     * @param AgentGroupId 拨测分组id，体现本拨测任务要采用那些运营商作为拨测源。一般可直接填写本用户的默认拨测分组。参见：DescribeAgentGroups 接口，本参数使用返回结果里的GroupId的值。注意： Type为0时，AgentGroupId为必填
     */
    public void setAgentGroupId(Long AgentGroupId) {
        this.AgentGroupId = AgentGroupId;
    }

    /**
     * Get 指定域名(如需要) 
     * @return Host 指定域名(如需要)
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 指定域名(如需要)
     * @param Host 指定域名(如需要)
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get 是否为Header请求（非0 发起Header 请求。为0，且PostData 非空，发起POST请求。为0，PostData 为空，发起GET请求） 
     * @return IsHeader 是否为Header请求（非0 发起Header 请求。为0，且PostData 非空，发起POST请求。为0，PostData 为空，发起GET请求）
     */
    public Long getIsHeader() {
        return this.IsHeader;
    }

    /**
     * Set 是否为Header请求（非0 发起Header 请求。为0，且PostData 非空，发起POST请求。为0，PostData 为空，发起GET请求）
     * @param IsHeader 是否为Header请求（非0 发起Header 请求。为0，且PostData 非空，发起POST请求。为0，PostData 为空，发起GET请求）
     */
    public void setIsHeader(Long IsHeader) {
        this.IsHeader = IsHeader;
    }

    /**
     * Get url中含有https时有用。缺省为SSLv23。需要为 TLSv1_2, TLSv1_1, TLSv1, SSLv2, SSLv23, SSLv3 之一 
     * @return SslVer url中含有https时有用。缺省为SSLv23。需要为 TLSv1_2, TLSv1_1, TLSv1, SSLv2, SSLv23, SSLv3 之一
     */
    public String getSslVer() {
        return this.SslVer;
    }

    /**
     * Set url中含有https时有用。缺省为SSLv23。需要为 TLSv1_2, TLSv1_1, TLSv1, SSLv2, SSLv23, SSLv3 之一
     * @param SslVer url中含有https时有用。缺省为SSLv23。需要为 TLSv1_2, TLSv1_1, TLSv1, SSLv2, SSLv23, SSLv3 之一
     */
    public void setSslVer(String SslVer) {
        this.SslVer = SslVer;
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
     * Get 用户agent 信息 
     * @return UserAgent 用户agent 信息
     */
    public String getUserAgent() {
        return this.UserAgent;
    }

    /**
     * Set 用户agent 信息
     * @param UserAgent 用户agent 信息
     */
    public void setUserAgent(String UserAgent) {
        this.UserAgent = UserAgent;
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
     * Get 需要设置的cookie信息 
     * @return Cookie 需要设置的cookie信息
     */
    public String getCookie() {
        return this.Cookie;
    }

    /**
     * Set 需要设置的cookie信息
     * @param Cookie 需要设置的cookie信息
     */
    public void setCookie(String Cookie) {
        this.Cookie = Cookie;
    }

    /**
     * Get 任务号。用于验证且修改任务时传入原任务号 
     * @return TaskId 任务号。用于验证且修改任务时传入原任务号
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务号。用于验证且修改任务时传入原任务号
     * @param TaskId 任务号。用于验证且修改任务时传入原任务号
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 登陆服务器的账号。如果为空字符串，表示不用校验用户密码。只做简单连接服务器的拨测。 
     * @return UserName 登陆服务器的账号。如果为空字符串，表示不用校验用户密码。只做简单连接服务器的拨测。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 登陆服务器的账号。如果为空字符串，表示不用校验用户密码。只做简单连接服务器的拨测。
     * @param UserName 登陆服务器的账号。如果为空字符串，表示不用校验用户密码。只做简单连接服务器的拨测。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 登陆服务器的密码 
     * @return PassWord 登陆服务器的密码
     */
    public String getPassWord() {
        return this.PassWord;
    }

    /**
     * Set 登陆服务器的密码
     * @param PassWord 登陆服务器的密码
     */
    public void setPassWord(String PassWord) {
        this.PassWord = PassWord;
    }

    /**
     * Get 缺省为0。0 表示请求为字符串类型。1表示为二进制类型 
     * @return ReqDataType 缺省为0。0 表示请求为字符串类型。1表示为二进制类型
     */
    public Long getReqDataType() {
        return this.ReqDataType;
    }

    /**
     * Set 缺省为0。0 表示请求为字符串类型。1表示为二进制类型
     * @param ReqDataType 缺省为0。0 表示请求为字符串类型。1表示为二进制类型
     */
    public void setReqDataType(Long ReqDataType) {
        this.ReqDataType = ReqDataType;
    }

    /**
     * Get 发起tcp, udp请求的协议请求数据 
     * @return ReqData 发起tcp, udp请求的协议请求数据
     */
    public String getReqData() {
        return this.ReqData;
    }

    /**
     * Set 发起tcp, udp请求的协议请求数据
     * @param ReqData 发起tcp, udp请求的协议请求数据
     */
    public void setReqData(String ReqData) {
        this.ReqData = ReqData;
    }

    /**
     * Get 缺省为0。0 表示响应为字符串类型。1表示为二进制类型 
     * @return RespDataType 缺省为0。0 表示响应为字符串类型。1表示为二进制类型
     */
    public Long getRespDataType() {
        return this.RespDataType;
    }

    /**
     * Set 缺省为0。0 表示响应为字符串类型。1表示为二进制类型
     * @param RespDataType 缺省为0。0 表示响应为字符串类型。1表示为二进制类型
     */
    public void setRespDataType(Long RespDataType) {
        this.RespDataType = RespDataType;
    }

    /**
     * Get 预期的udp请求的回应数据。字符串型，只需要返回的结果里包含本字符串算校验通过。二进制型，则需要严格等于才算通过 
     * @return RespData 预期的udp请求的回应数据。字符串型，只需要返回的结果里包含本字符串算校验通过。二进制型，则需要严格等于才算通过
     */
    public String getRespData() {
        return this.RespData;
    }

    /**
     * Set 预期的udp请求的回应数据。字符串型，只需要返回的结果里包含本字符串算校验通过。二进制型，则需要严格等于才算通过
     * @param RespData 预期的udp请求的回应数据。字符串型，只需要返回的结果里包含本字符串算校验通过。二进制型，则需要严格等于才算通过
     */
    public void setRespData(String RespData) {
        this.RespData = RespData;
    }

    /**
     * Get 目的dns服务器  可以为空字符串 
     * @return DnsSvr 目的dns服务器  可以为空字符串
     */
    public String getDnsSvr() {
        return this.DnsSvr;
    }

    /**
     * Set 目的dns服务器  可以为空字符串
     * @param DnsSvr 目的dns服务器  可以为空字符串
     */
    public void setDnsSvr(String DnsSvr) {
        this.DnsSvr = DnsSvr;
    }

    /**
     * Get 需要检验是否在dns ip列表的ip。可以为空字符串，表示不校验 
     * @return DnsCheckIp 需要检验是否在dns ip列表的ip。可以为空字符串，表示不校验
     */
    public String getDnsCheckIp() {
        return this.DnsCheckIp;
    }

    /**
     * Set 需要检验是否在dns ip列表的ip。可以为空字符串，表示不校验
     * @param DnsCheckIp 需要检验是否在dns ip列表的ip。可以为空字符串，表示不校验
     */
    public void setDnsCheckIp(String DnsCheckIp) {
        this.DnsCheckIp = DnsCheckIp;
    }

    /**
     * Get 需要为下列值之一。缺省为A。A, MX, NS, CNAME, TXT, ANY 
     * @return DnsQueryType 需要为下列值之一。缺省为A。A, MX, NS, CNAME, TXT, ANY
     */
    public String getDnsQueryType() {
        return this.DnsQueryType;
    }

    /**
     * Set 需要为下列值之一。缺省为A。A, MX, NS, CNAME, TXT, ANY
     * @param DnsQueryType 需要为下列值之一。缺省为A。A, MX, NS, CNAME, TXT, ANY
     */
    public void setDnsQueryType(String DnsQueryType) {
        this.DnsQueryType = DnsQueryType;
    }

    /**
     * Get 是否使用安全链接ssl  0 不使用，1 使用 
     * @return UseSecConn 是否使用安全链接ssl  0 不使用，1 使用
     */
    public Long getUseSecConn() {
        return this.UseSecConn;
    }

    /**
     * Set 是否使用安全链接ssl  0 不使用，1 使用
     * @param UseSecConn 是否使用安全链接ssl  0 不使用，1 使用
     */
    public void setUseSecConn(Long UseSecConn) {
        this.UseSecConn = UseSecConn;
    }

    /**
     * Get ftp登陆验证方式  0 不验证  1 匿名登陆  2 需要身份验证 
     * @return NeedAuth ftp登陆验证方式  0 不验证  1 匿名登陆  2 需要身份验证
     */
    public Long getNeedAuth() {
        return this.NeedAuth;
    }

    /**
     * Set ftp登陆验证方式  0 不验证  1 匿名登陆  2 需要身份验证
     * @param NeedAuth ftp登陆验证方式  0 不验证  1 匿名登陆  2 需要身份验证
     */
    public void setNeedAuth(Long NeedAuth) {
        this.NeedAuth = NeedAuth;
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
     * Get Type=0 默认 （站点监控）Type=2 可用率监控 
     * @return Type Type=0 默认 （站点监控）Type=2 可用率监控
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Type=0 默认 （站点监控）Type=2 可用率监控
     * @param Type Type=0 默认 （站点监控）Type=2 可用率监控
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get IsVerify=0 非验证任务 IsVerify=1 验证任务，不传则默认为0 
     * @return IsVerify IsVerify=0 非验证任务 IsVerify=1 验证任务，不传则默认为0
     */
    public Long getIsVerify() {
        return this.IsVerify;
    }

    /**
     * Set IsVerify=0 非验证任务 IsVerify=1 验证任务，不传则默认为0
     * @param IsVerify IsVerify=0 非验证任务 IsVerify=1 验证任务，不传则默认为0
     */
    public void setIsVerify(Long IsVerify) {
        this.IsVerify = IsVerify;
    }

    /**
     * Get 跟随跳转次数，取值范围0-5，不传则表示不跟随 
     * @return RedirectFollowNum 跟随跳转次数，取值范围0-5，不传则表示不跟随
     */
    public Long getRedirectFollowNum() {
        return this.RedirectFollowNum;
    }

    /**
     * Set 跟随跳转次数，取值范围0-5，不传则表示不跟随
     * @param RedirectFollowNum 跟随跳转次数，取值范围0-5，不传则表示不跟随
     */
    public void setRedirectFollowNum(Long RedirectFollowNum) {
        this.RedirectFollowNum = RedirectFollowNum;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CatTypeName", this.CatTypeName);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "AgentGroupId", this.AgentGroupId);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "IsHeader", this.IsHeader);
        this.setParamSimple(map, prefix + "SslVer", this.SslVer);
        this.setParamSimple(map, prefix + "PostData", this.PostData);
        this.setParamSimple(map, prefix + "UserAgent", this.UserAgent);
        this.setParamSimple(map, prefix + "CheckStr", this.CheckStr);
        this.setParamSimple(map, prefix + "CheckType", this.CheckType);
        this.setParamSimple(map, prefix + "Cookie", this.Cookie);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "PassWord", this.PassWord);
        this.setParamSimple(map, prefix + "ReqDataType", this.ReqDataType);
        this.setParamSimple(map, prefix + "ReqData", this.ReqData);
        this.setParamSimple(map, prefix + "RespDataType", this.RespDataType);
        this.setParamSimple(map, prefix + "RespData", this.RespData);
        this.setParamSimple(map, prefix + "DnsSvr", this.DnsSvr);
        this.setParamSimple(map, prefix + "DnsCheckIp", this.DnsCheckIp);
        this.setParamSimple(map, prefix + "DnsQueryType", this.DnsQueryType);
        this.setParamSimple(map, prefix + "UseSecConn", this.UseSecConn);
        this.setParamSimple(map, prefix + "NeedAuth", this.NeedAuth);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "IsVerify", this.IsVerify);
        this.setParamSimple(map, prefix + "RedirectFollowNum", this.RedirectFollowNum);

    }
}

