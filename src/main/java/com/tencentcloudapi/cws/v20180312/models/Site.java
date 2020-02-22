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
package com.tencentcloudapi.cws.v20180312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Site extends AbstractModel{

    /**
    * 站点ID。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 监控任务ID，为0时表示未加入监控任务。
    */
    @SerializedName("MonitorId")
    @Expose
    private Long MonitorId;

    /**
    * 站点url。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 站点名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 验证状态：0-未验证；1-已验证；2-验证失效，待重新验证。
    */
    @SerializedName("VerifyStatus")
    @Expose
    private Long VerifyStatus;

    /**
    * 监测状态：0-未监测；1-监测中；2-暂停监测。
    */
    @SerializedName("MonitorStatus")
    @Expose
    private Long MonitorStatus;

    /**
    * 扫描状态：0-待扫描（无任何扫描结果）；1-扫描中（正在进行扫描）；2-已扫描（有扫描结果且不正在扫描）；3-扫描完成待同步结果。
    */
    @SerializedName("ScanStatus")
    @Expose
    private Long ScanStatus;

    /**
    * 最近一次的AIScanner的扫描任务id，注意取消的情况。
    */
    @SerializedName("LastScanTaskId")
    @Expose
    private Long LastScanTaskId;

    /**
    * 最近一次扫描开始时间。
    */
    @SerializedName("LastScanStartTime")
    @Expose
    private String LastScanStartTime;

    /**
    * 最近一次扫描完成时间。
    */
    @SerializedName("LastScanFinishTime")
    @Expose
    private String LastScanFinishTime;

    /**
    * 最近一次取消时间，取消即使用上一次扫描结果。
    */
    @SerializedName("LastScanCancelTime")
    @Expose
    private String LastScanCancelTime;

    /**
    * 最近一次扫描扫描的页面数。
    */
    @SerializedName("LastScanPageCount")
    @Expose
    private Long LastScanPageCount;

    /**
    * normal-正常扫描；deep-深度扫描。
    */
    @SerializedName("LastScanScannerType")
    @Expose
    private String LastScanScannerType;

    /**
    * 最近一次扫描高风险漏洞数量。
    */
    @SerializedName("LastScanVulsHighNum")
    @Expose
    private Long LastScanVulsHighNum;

    /**
    * 最近一次扫描中风险漏洞数量。
    */
    @SerializedName("LastScanVulsMiddleNum")
    @Expose
    private Long LastScanVulsMiddleNum;

    /**
    * 最近一次扫描低风险漏洞数量。
    */
    @SerializedName("LastScanVulsLowNum")
    @Expose
    private Long LastScanVulsLowNum;

    /**
    * 最近一次扫描提示信息数量。
    */
    @SerializedName("LastScanVulsNoticeNum")
    @Expose
    private Long LastScanVulsNoticeNum;

    /**
    * 记录添加时间。
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 记录最近修改时间。
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * 速率限制，每秒发送X个HTTP请求。
    */
    @SerializedName("LastScanRateLimit")
    @Expose
    private Long LastScanRateLimit;

    /**
    * 最近一次扫描漏洞总数量。
    */
    @SerializedName("LastScanVulsNum")
    @Expose
    private Long LastScanVulsNum;

    /**
    * 最近一次扫描提示总数量
    */
    @SerializedName("LastScanNoticeNum")
    @Expose
    private Long LastScanNoticeNum;

    /**
    * 扫描进度，百分比整数
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * 云用户appid。
    */
    @SerializedName("Appid")
    @Expose
    private Long Appid;

    /**
    * 云用户标识。
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 网站是否需要登录扫描：0-未知；-1-不需要；1-需要。
    */
    @SerializedName("NeedLogin")
    @Expose
    private Long NeedLogin;

    /**
    * 登录后的cookie。
    */
    @SerializedName("LoginCookie")
    @Expose
    private String LoginCookie;

    /**
    * 登录后的cookie是否有效：0-无效；1-有效。
    */
    @SerializedName("LoginCookieValid")
    @Expose
    private Long LoginCookieValid;

    /**
    * 用于测试cookie是否有效的URL。
    */
    @SerializedName("LoginCheckUrl")
    @Expose
    private String LoginCheckUrl;

    /**
    * 用于测试cookie是否有效的关键字。
    */
    @SerializedName("LoginCheckKw")
    @Expose
    private String LoginCheckKw;

    /**
    * 禁止扫描器扫描的目录关键字。
    */
    @SerializedName("ScanDisallow")
    @Expose
    private String ScanDisallow;

    /**
    * 访问网站的客户端标识。
    */
    @SerializedName("UserAgent")
    @Expose
    private String UserAgent;

    /**
    * 内容检测状态：0-未检测；1-已检测；
    */
    @SerializedName("ContentStatus")
    @Expose
    private Long ContentStatus;

    /**
    * 最近一次扫描内容检测数量
    */
    @SerializedName("LastScanContentNum")
    @Expose
    private Long LastScanContentNum;

    /**
     * Get 站点ID。 
     * @return Id 站点ID。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 站点ID。
     * @param Id 站点ID。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 监控任务ID，为0时表示未加入监控任务。 
     * @return MonitorId 监控任务ID，为0时表示未加入监控任务。
     */
    public Long getMonitorId() {
        return this.MonitorId;
    }

    /**
     * Set 监控任务ID，为0时表示未加入监控任务。
     * @param MonitorId 监控任务ID，为0时表示未加入监控任务。
     */
    public void setMonitorId(Long MonitorId) {
        this.MonitorId = MonitorId;
    }

    /**
     * Get 站点url。 
     * @return Url 站点url。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 站点url。
     * @param Url 站点url。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 站点名称。 
     * @return Name 站点名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 站点名称。
     * @param Name 站点名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 验证状态：0-未验证；1-已验证；2-验证失效，待重新验证。 
     * @return VerifyStatus 验证状态：0-未验证；1-已验证；2-验证失效，待重新验证。
     */
    public Long getVerifyStatus() {
        return this.VerifyStatus;
    }

    /**
     * Set 验证状态：0-未验证；1-已验证；2-验证失效，待重新验证。
     * @param VerifyStatus 验证状态：0-未验证；1-已验证；2-验证失效，待重新验证。
     */
    public void setVerifyStatus(Long VerifyStatus) {
        this.VerifyStatus = VerifyStatus;
    }

    /**
     * Get 监测状态：0-未监测；1-监测中；2-暂停监测。 
     * @return MonitorStatus 监测状态：0-未监测；1-监测中；2-暂停监测。
     */
    public Long getMonitorStatus() {
        return this.MonitorStatus;
    }

    /**
     * Set 监测状态：0-未监测；1-监测中；2-暂停监测。
     * @param MonitorStatus 监测状态：0-未监测；1-监测中；2-暂停监测。
     */
    public void setMonitorStatus(Long MonitorStatus) {
        this.MonitorStatus = MonitorStatus;
    }

    /**
     * Get 扫描状态：0-待扫描（无任何扫描结果）；1-扫描中（正在进行扫描）；2-已扫描（有扫描结果且不正在扫描）；3-扫描完成待同步结果。 
     * @return ScanStatus 扫描状态：0-待扫描（无任何扫描结果）；1-扫描中（正在进行扫描）；2-已扫描（有扫描结果且不正在扫描）；3-扫描完成待同步结果。
     */
    public Long getScanStatus() {
        return this.ScanStatus;
    }

    /**
     * Set 扫描状态：0-待扫描（无任何扫描结果）；1-扫描中（正在进行扫描）；2-已扫描（有扫描结果且不正在扫描）；3-扫描完成待同步结果。
     * @param ScanStatus 扫描状态：0-待扫描（无任何扫描结果）；1-扫描中（正在进行扫描）；2-已扫描（有扫描结果且不正在扫描）；3-扫描完成待同步结果。
     */
    public void setScanStatus(Long ScanStatus) {
        this.ScanStatus = ScanStatus;
    }

    /**
     * Get 最近一次的AIScanner的扫描任务id，注意取消的情况。 
     * @return LastScanTaskId 最近一次的AIScanner的扫描任务id，注意取消的情况。
     */
    public Long getLastScanTaskId() {
        return this.LastScanTaskId;
    }

    /**
     * Set 最近一次的AIScanner的扫描任务id，注意取消的情况。
     * @param LastScanTaskId 最近一次的AIScanner的扫描任务id，注意取消的情况。
     */
    public void setLastScanTaskId(Long LastScanTaskId) {
        this.LastScanTaskId = LastScanTaskId;
    }

    /**
     * Get 最近一次扫描开始时间。 
     * @return LastScanStartTime 最近一次扫描开始时间。
     */
    public String getLastScanStartTime() {
        return this.LastScanStartTime;
    }

    /**
     * Set 最近一次扫描开始时间。
     * @param LastScanStartTime 最近一次扫描开始时间。
     */
    public void setLastScanStartTime(String LastScanStartTime) {
        this.LastScanStartTime = LastScanStartTime;
    }

    /**
     * Get 最近一次扫描完成时间。 
     * @return LastScanFinishTime 最近一次扫描完成时间。
     */
    public String getLastScanFinishTime() {
        return this.LastScanFinishTime;
    }

    /**
     * Set 最近一次扫描完成时间。
     * @param LastScanFinishTime 最近一次扫描完成时间。
     */
    public void setLastScanFinishTime(String LastScanFinishTime) {
        this.LastScanFinishTime = LastScanFinishTime;
    }

    /**
     * Get 最近一次取消时间，取消即使用上一次扫描结果。 
     * @return LastScanCancelTime 最近一次取消时间，取消即使用上一次扫描结果。
     */
    public String getLastScanCancelTime() {
        return this.LastScanCancelTime;
    }

    /**
     * Set 最近一次取消时间，取消即使用上一次扫描结果。
     * @param LastScanCancelTime 最近一次取消时间，取消即使用上一次扫描结果。
     */
    public void setLastScanCancelTime(String LastScanCancelTime) {
        this.LastScanCancelTime = LastScanCancelTime;
    }

    /**
     * Get 最近一次扫描扫描的页面数。 
     * @return LastScanPageCount 最近一次扫描扫描的页面数。
     */
    public Long getLastScanPageCount() {
        return this.LastScanPageCount;
    }

    /**
     * Set 最近一次扫描扫描的页面数。
     * @param LastScanPageCount 最近一次扫描扫描的页面数。
     */
    public void setLastScanPageCount(Long LastScanPageCount) {
        this.LastScanPageCount = LastScanPageCount;
    }

    /**
     * Get normal-正常扫描；deep-深度扫描。 
     * @return LastScanScannerType normal-正常扫描；deep-深度扫描。
     */
    public String getLastScanScannerType() {
        return this.LastScanScannerType;
    }

    /**
     * Set normal-正常扫描；deep-深度扫描。
     * @param LastScanScannerType normal-正常扫描；deep-深度扫描。
     */
    public void setLastScanScannerType(String LastScanScannerType) {
        this.LastScanScannerType = LastScanScannerType;
    }

    /**
     * Get 最近一次扫描高风险漏洞数量。 
     * @return LastScanVulsHighNum 最近一次扫描高风险漏洞数量。
     */
    public Long getLastScanVulsHighNum() {
        return this.LastScanVulsHighNum;
    }

    /**
     * Set 最近一次扫描高风险漏洞数量。
     * @param LastScanVulsHighNum 最近一次扫描高风险漏洞数量。
     */
    public void setLastScanVulsHighNum(Long LastScanVulsHighNum) {
        this.LastScanVulsHighNum = LastScanVulsHighNum;
    }

    /**
     * Get 最近一次扫描中风险漏洞数量。 
     * @return LastScanVulsMiddleNum 最近一次扫描中风险漏洞数量。
     */
    public Long getLastScanVulsMiddleNum() {
        return this.LastScanVulsMiddleNum;
    }

    /**
     * Set 最近一次扫描中风险漏洞数量。
     * @param LastScanVulsMiddleNum 最近一次扫描中风险漏洞数量。
     */
    public void setLastScanVulsMiddleNum(Long LastScanVulsMiddleNum) {
        this.LastScanVulsMiddleNum = LastScanVulsMiddleNum;
    }

    /**
     * Get 最近一次扫描低风险漏洞数量。 
     * @return LastScanVulsLowNum 最近一次扫描低风险漏洞数量。
     */
    public Long getLastScanVulsLowNum() {
        return this.LastScanVulsLowNum;
    }

    /**
     * Set 最近一次扫描低风险漏洞数量。
     * @param LastScanVulsLowNum 最近一次扫描低风险漏洞数量。
     */
    public void setLastScanVulsLowNum(Long LastScanVulsLowNum) {
        this.LastScanVulsLowNum = LastScanVulsLowNum;
    }

    /**
     * Get 最近一次扫描提示信息数量。 
     * @return LastScanVulsNoticeNum 最近一次扫描提示信息数量。
     */
    public Long getLastScanVulsNoticeNum() {
        return this.LastScanVulsNoticeNum;
    }

    /**
     * Set 最近一次扫描提示信息数量。
     * @param LastScanVulsNoticeNum 最近一次扫描提示信息数量。
     */
    public void setLastScanVulsNoticeNum(Long LastScanVulsNoticeNum) {
        this.LastScanVulsNoticeNum = LastScanVulsNoticeNum;
    }

    /**
     * Get 记录添加时间。 
     * @return CreatedAt 记录添加时间。
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 记录添加时间。
     * @param CreatedAt 记录添加时间。
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 记录最近修改时间。 
     * @return UpdatedAt 记录最近修改时间。
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set 记录最近修改时间。
     * @param UpdatedAt 记录最近修改时间。
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get 速率限制，每秒发送X个HTTP请求。 
     * @return LastScanRateLimit 速率限制，每秒发送X个HTTP请求。
     */
    public Long getLastScanRateLimit() {
        return this.LastScanRateLimit;
    }

    /**
     * Set 速率限制，每秒发送X个HTTP请求。
     * @param LastScanRateLimit 速率限制，每秒发送X个HTTP请求。
     */
    public void setLastScanRateLimit(Long LastScanRateLimit) {
        this.LastScanRateLimit = LastScanRateLimit;
    }

    /**
     * Get 最近一次扫描漏洞总数量。 
     * @return LastScanVulsNum 最近一次扫描漏洞总数量。
     */
    public Long getLastScanVulsNum() {
        return this.LastScanVulsNum;
    }

    /**
     * Set 最近一次扫描漏洞总数量。
     * @param LastScanVulsNum 最近一次扫描漏洞总数量。
     */
    public void setLastScanVulsNum(Long LastScanVulsNum) {
        this.LastScanVulsNum = LastScanVulsNum;
    }

    /**
     * Get 最近一次扫描提示总数量 
     * @return LastScanNoticeNum 最近一次扫描提示总数量
     */
    public Long getLastScanNoticeNum() {
        return this.LastScanNoticeNum;
    }

    /**
     * Set 最近一次扫描提示总数量
     * @param LastScanNoticeNum 最近一次扫描提示总数量
     */
    public void setLastScanNoticeNum(Long LastScanNoticeNum) {
        this.LastScanNoticeNum = LastScanNoticeNum;
    }

    /**
     * Get 扫描进度，百分比整数 
     * @return Progress 扫描进度，百分比整数
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set 扫描进度，百分比整数
     * @param Progress 扫描进度，百分比整数
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 云用户appid。 
     * @return Appid 云用户appid。
     */
    public Long getAppid() {
        return this.Appid;
    }

    /**
     * Set 云用户appid。
     * @param Appid 云用户appid。
     */
    public void setAppid(Long Appid) {
        this.Appid = Appid;
    }

    /**
     * Get 云用户标识。 
     * @return Uin 云用户标识。
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 云用户标识。
     * @param Uin 云用户标识。
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 网站是否需要登录扫描：0-未知；-1-不需要；1-需要。 
     * @return NeedLogin 网站是否需要登录扫描：0-未知；-1-不需要；1-需要。
     */
    public Long getNeedLogin() {
        return this.NeedLogin;
    }

    /**
     * Set 网站是否需要登录扫描：0-未知；-1-不需要；1-需要。
     * @param NeedLogin 网站是否需要登录扫描：0-未知；-1-不需要；1-需要。
     */
    public void setNeedLogin(Long NeedLogin) {
        this.NeedLogin = NeedLogin;
    }

    /**
     * Get 登录后的cookie。 
     * @return LoginCookie 登录后的cookie。
     */
    public String getLoginCookie() {
        return this.LoginCookie;
    }

    /**
     * Set 登录后的cookie。
     * @param LoginCookie 登录后的cookie。
     */
    public void setLoginCookie(String LoginCookie) {
        this.LoginCookie = LoginCookie;
    }

    /**
     * Get 登录后的cookie是否有效：0-无效；1-有效。 
     * @return LoginCookieValid 登录后的cookie是否有效：0-无效；1-有效。
     */
    public Long getLoginCookieValid() {
        return this.LoginCookieValid;
    }

    /**
     * Set 登录后的cookie是否有效：0-无效；1-有效。
     * @param LoginCookieValid 登录后的cookie是否有效：0-无效；1-有效。
     */
    public void setLoginCookieValid(Long LoginCookieValid) {
        this.LoginCookieValid = LoginCookieValid;
    }

    /**
     * Get 用于测试cookie是否有效的URL。 
     * @return LoginCheckUrl 用于测试cookie是否有效的URL。
     */
    public String getLoginCheckUrl() {
        return this.LoginCheckUrl;
    }

    /**
     * Set 用于测试cookie是否有效的URL。
     * @param LoginCheckUrl 用于测试cookie是否有效的URL。
     */
    public void setLoginCheckUrl(String LoginCheckUrl) {
        this.LoginCheckUrl = LoginCheckUrl;
    }

    /**
     * Get 用于测试cookie是否有效的关键字。 
     * @return LoginCheckKw 用于测试cookie是否有效的关键字。
     */
    public String getLoginCheckKw() {
        return this.LoginCheckKw;
    }

    /**
     * Set 用于测试cookie是否有效的关键字。
     * @param LoginCheckKw 用于测试cookie是否有效的关键字。
     */
    public void setLoginCheckKw(String LoginCheckKw) {
        this.LoginCheckKw = LoginCheckKw;
    }

    /**
     * Get 禁止扫描器扫描的目录关键字。 
     * @return ScanDisallow 禁止扫描器扫描的目录关键字。
     */
    public String getScanDisallow() {
        return this.ScanDisallow;
    }

    /**
     * Set 禁止扫描器扫描的目录关键字。
     * @param ScanDisallow 禁止扫描器扫描的目录关键字。
     */
    public void setScanDisallow(String ScanDisallow) {
        this.ScanDisallow = ScanDisallow;
    }

    /**
     * Get 访问网站的客户端标识。 
     * @return UserAgent 访问网站的客户端标识。
     */
    public String getUserAgent() {
        return this.UserAgent;
    }

    /**
     * Set 访问网站的客户端标识。
     * @param UserAgent 访问网站的客户端标识。
     */
    public void setUserAgent(String UserAgent) {
        this.UserAgent = UserAgent;
    }

    /**
     * Get 内容检测状态：0-未检测；1-已检测； 
     * @return ContentStatus 内容检测状态：0-未检测；1-已检测；
     */
    public Long getContentStatus() {
        return this.ContentStatus;
    }

    /**
     * Set 内容检测状态：0-未检测；1-已检测；
     * @param ContentStatus 内容检测状态：0-未检测；1-已检测；
     */
    public void setContentStatus(Long ContentStatus) {
        this.ContentStatus = ContentStatus;
    }

    /**
     * Get 最近一次扫描内容检测数量 
     * @return LastScanContentNum 最近一次扫描内容检测数量
     */
    public Long getLastScanContentNum() {
        return this.LastScanContentNum;
    }

    /**
     * Set 最近一次扫描内容检测数量
     * @param LastScanContentNum 最近一次扫描内容检测数量
     */
    public void setLastScanContentNum(Long LastScanContentNum) {
        this.LastScanContentNum = LastScanContentNum;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "MonitorId", this.MonitorId);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "VerifyStatus", this.VerifyStatus);
        this.setParamSimple(map, prefix + "MonitorStatus", this.MonitorStatus);
        this.setParamSimple(map, prefix + "ScanStatus", this.ScanStatus);
        this.setParamSimple(map, prefix + "LastScanTaskId", this.LastScanTaskId);
        this.setParamSimple(map, prefix + "LastScanStartTime", this.LastScanStartTime);
        this.setParamSimple(map, prefix + "LastScanFinishTime", this.LastScanFinishTime);
        this.setParamSimple(map, prefix + "LastScanCancelTime", this.LastScanCancelTime);
        this.setParamSimple(map, prefix + "LastScanPageCount", this.LastScanPageCount);
        this.setParamSimple(map, prefix + "LastScanScannerType", this.LastScanScannerType);
        this.setParamSimple(map, prefix + "LastScanVulsHighNum", this.LastScanVulsHighNum);
        this.setParamSimple(map, prefix + "LastScanVulsMiddleNum", this.LastScanVulsMiddleNum);
        this.setParamSimple(map, prefix + "LastScanVulsLowNum", this.LastScanVulsLowNum);
        this.setParamSimple(map, prefix + "LastScanVulsNoticeNum", this.LastScanVulsNoticeNum);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "LastScanRateLimit", this.LastScanRateLimit);
        this.setParamSimple(map, prefix + "LastScanVulsNum", this.LastScanVulsNum);
        this.setParamSimple(map, prefix + "LastScanNoticeNum", this.LastScanNoticeNum);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "Appid", this.Appid);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "NeedLogin", this.NeedLogin);
        this.setParamSimple(map, prefix + "LoginCookie", this.LoginCookie);
        this.setParamSimple(map, prefix + "LoginCookieValid", this.LoginCookieValid);
        this.setParamSimple(map, prefix + "LoginCheckUrl", this.LoginCheckUrl);
        this.setParamSimple(map, prefix + "LoginCheckKw", this.LoginCheckKw);
        this.setParamSimple(map, prefix + "ScanDisallow", this.ScanDisallow);
        this.setParamSimple(map, prefix + "UserAgent", this.UserAgent);
        this.setParamSimple(map, prefix + "ContentStatus", this.ContentStatus);
        this.setParamSimple(map, prefix + "LastScanContentNum", this.LastScanContentNum);

    }
}

