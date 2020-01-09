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

public class ModifyTaskRequest extends AbstractModel{

    /**
    * 拨测分组id，体现本拨测任务要采用那些运营商作为拨测源。一般可直接填写本用户的默认拨测分组。参见：DescribeAgentGroupList 接口，本参数使用返回结果里的groupId的值。
    */
    @SerializedName("AgentGroupId")
    @Expose
    private Long AgentGroupId;

    /**
    * http, https, ping, tcp 之一
    */
    @SerializedName("CatTypeName")
    @Expose
    private String CatTypeName;

    /**
    * 拨测的url  例如：www.baidu.com (url域名解析需要能解析出具体的ip)
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
    * 验证成功的拨测任务id
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 需要满足ip 的格式
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 服务端监听或接收数据的端口
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

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
    * 1 表示通过检查结果是否包含checkStr 进行校验
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
     * Get 拨测分组id，体现本拨测任务要采用那些运营商作为拨测源。一般可直接填写本用户的默认拨测分组。参见：DescribeAgentGroupList 接口，本参数使用返回结果里的groupId的值。 
     * @return AgentGroupId 拨测分组id，体现本拨测任务要采用那些运营商作为拨测源。一般可直接填写本用户的默认拨测分组。参见：DescribeAgentGroupList 接口，本参数使用返回结果里的groupId的值。
     */
    public Long getAgentGroupId() {
        return this.AgentGroupId;
    }

    /**
     * Set 拨测分组id，体现本拨测任务要采用那些运营商作为拨测源。一般可直接填写本用户的默认拨测分组。参见：DescribeAgentGroupList 接口，本参数使用返回结果里的groupId的值。
     * @param AgentGroupId 拨测分组id，体现本拨测任务要采用那些运营商作为拨测源。一般可直接填写本用户的默认拨测分组。参见：DescribeAgentGroupList 接口，本参数使用返回结果里的groupId的值。
     */
    public void setAgentGroupId(Long AgentGroupId) {
        this.AgentGroupId = AgentGroupId;
    }

    /**
     * Get http, https, ping, tcp 之一 
     * @return CatTypeName http, https, ping, tcp 之一
     */
    public String getCatTypeName() {
        return this.CatTypeName;
    }

    /**
     * Set http, https, ping, tcp 之一
     * @param CatTypeName http, https, ping, tcp 之一
     */
    public void setCatTypeName(String CatTypeName) {
        this.CatTypeName = CatTypeName;
    }

    /**
     * Get 拨测的url  例如：www.baidu.com (url域名解析需要能解析出具体的ip) 
     * @return Url 拨测的url  例如：www.baidu.com (url域名解析需要能解析出具体的ip)
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 拨测的url  例如：www.baidu.com (url域名解析需要能解析出具体的ip)
     * @param Url 拨测的url  例如：www.baidu.com (url域名解析需要能解析出具体的ip)
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
     * Get 验证成功的拨测任务id 
     * @return TaskId 验证成功的拨测任务id
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 验证成功的拨测任务id
     * @param TaskId 验证成功的拨测任务id
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 需要满足ip 的格式 
     * @return Host 需要满足ip 的格式
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 需要满足ip 的格式
     * @param Host 需要满足ip 的格式
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get 服务端监听或接收数据的端口 
     * @return Port 服务端监听或接收数据的端口
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 服务端监听或接收数据的端口
     * @param Port 服务端监听或接收数据的端口
     */
    public void setPort(Long Port) {
        this.Port = Port;
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
     * Get 1 表示通过检查结果是否包含checkStr 进行校验 
     * @return CheckType 1 表示通过检查结果是否包含checkStr 进行校验
     */
    public Long getCheckType() {
        return this.CheckType;
    }

    /**
     * Set 1 表示通过检查结果是否包含checkStr 进行校验
     * @param CheckType 1 表示通过检查结果是否包含checkStr 进行校验
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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AgentGroupId", this.AgentGroupId);
        this.setParamSimple(map, prefix + "CatTypeName", this.CatTypeName);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "IsHeader", this.IsHeader);
        this.setParamSimple(map, prefix + "SslVer", this.SslVer);
        this.setParamSimple(map, prefix + "PostData", this.PostData);
        this.setParamSimple(map, prefix + "UserAgent", this.UserAgent);
        this.setParamSimple(map, prefix + "CheckStr", this.CheckStr);
        this.setParamSimple(map, prefix + "CheckType", this.CheckType);
        this.setParamSimple(map, prefix + "Cookie", this.Cookie);

    }
}

