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
package com.tencentcloudapi.bmlb.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyL7LocationRule  extends AbstractModel{

    /**
    * 转发域名实例ID，可通过接口DescribeL7Rules查询。
    */
    @SerializedName("DomainId")
    @Expose
    private String DomainId;

    /**
    * 转发路径实例ID，可通过接口DescribeL7Rules查询。
    */
    @SerializedName("LocationId")
    @Expose
    private String LocationId;

    /**
    * 转发路径。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 会话保持时间，单位：秒。可选值：30~3600。默认值0，表示不开启会话保持。
    */
    @SerializedName("SessionExpire")
    @Expose
    private Integer SessionExpire;

    /**
    * 健康检查开关：1（开启）、0（关闭）。默认值0，表示关闭。
    */
    @SerializedName("HealthSwitch")
    @Expose
    private Integer HealthSwitch;

    /**
    * 健康检查检查间隔时间，默认值：5，可选值：5-300，单位：秒。
    */
    @SerializedName("IntervalTime")
    @Expose
    private Integer IntervalTime;

    /**
    * 健康检查健康阈值，默认值：3，表示当连续探测三次健康则表示该转发正常，可选值：2-10，单位：次。
    */
    @SerializedName("HealthNum")
    @Expose
    private Integer HealthNum;

    /**
    * 健康检查不健康阈值，默认值：5，表示当连续探测五次不健康则表示该转发不正常，可选值：2-10，单位：次。
    */
    @SerializedName("UnhealthNum")
    @Expose
    private Integer UnhealthNum;

    /**
    * 健康检查中认为健康的HTTP返回码的组合。可选值为1~5的集合，1表示HTTP返回码为1xx认为健康。2表示HTTP返回码为2xx认为健康。3表示HTTP返回码为3xx认为健康。4表示HTTP返回码为4xx认为健康。5表示HTTP返回码为5xx认为健康。
    */
    @SerializedName("HttpCodes")
    @Expose
    private Integer [] HttpCodes;

    /**
    * 健康检查检查路径。
    */
    @SerializedName("HttpCheckPath")
    @Expose
    private String HttpCheckPath;

    /**
    * 健康检查检查域名。如果规则的域名使用通配符或正则表达式，则健康检查检查域名可自定义，否则必须跟健康检查检查域名一样。不填表示不修改。
    */
    @SerializedName("HttpCheckDomain")
    @Expose
    private String HttpCheckDomain;

    /**
    * 均衡方式：ip_hash、wrr。默认值wrr。
    */
    @SerializedName("BalanceMode")
    @Expose
    private String BalanceMode;

    /**
    * 转发域名。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
     * 获取转发域名实例ID，可通过接口DescribeL7Rules查询。
     * @return DomainId 转发域名实例ID，可通过接口DescribeL7Rules查询。
     */
    public String getDomainId() {
        return this.DomainId;
    }

    /**
     * 设置转发域名实例ID，可通过接口DescribeL7Rules查询。
     * @param DomainId 转发域名实例ID，可通过接口DescribeL7Rules查询。
     */
    public void setDomainId(String DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * 获取转发路径实例ID，可通过接口DescribeL7Rules查询。
     * @return LocationId 转发路径实例ID，可通过接口DescribeL7Rules查询。
     */
    public String getLocationId() {
        return this.LocationId;
    }

    /**
     * 设置转发路径实例ID，可通过接口DescribeL7Rules查询。
     * @param LocationId 转发路径实例ID，可通过接口DescribeL7Rules查询。
     */
    public void setLocationId(String LocationId) {
        this.LocationId = LocationId;
    }

    /**
     * 获取转发路径。
     * @return Url 转发路径。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * 设置转发路径。
     * @param Url 转发路径。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * 获取会话保持时间，单位：秒。可选值：30~3600。默认值0，表示不开启会话保持。
     * @return SessionExpire 会话保持时间，单位：秒。可选值：30~3600。默认值0，表示不开启会话保持。
     */
    public Integer getSessionExpire() {
        return this.SessionExpire;
    }

    /**
     * 设置会话保持时间，单位：秒。可选值：30~3600。默认值0，表示不开启会话保持。
     * @param SessionExpire 会话保持时间，单位：秒。可选值：30~3600。默认值0，表示不开启会话保持。
     */
    public void setSessionExpire(Integer SessionExpire) {
        this.SessionExpire = SessionExpire;
    }

    /**
     * 获取健康检查开关：1（开启）、0（关闭）。默认值0，表示关闭。
     * @return HealthSwitch 健康检查开关：1（开启）、0（关闭）。默认值0，表示关闭。
     */
    public Integer getHealthSwitch() {
        return this.HealthSwitch;
    }

    /**
     * 设置健康检查开关：1（开启）、0（关闭）。默认值0，表示关闭。
     * @param HealthSwitch 健康检查开关：1（开启）、0（关闭）。默认值0，表示关闭。
     */
    public void setHealthSwitch(Integer HealthSwitch) {
        this.HealthSwitch = HealthSwitch;
    }

    /**
     * 获取健康检查检查间隔时间，默认值：5，可选值：5-300，单位：秒。
     * @return IntervalTime 健康检查检查间隔时间，默认值：5，可选值：5-300，单位：秒。
     */
    public Integer getIntervalTime() {
        return this.IntervalTime;
    }

    /**
     * 设置健康检查检查间隔时间，默认值：5，可选值：5-300，单位：秒。
     * @param IntervalTime 健康检查检查间隔时间，默认值：5，可选值：5-300，单位：秒。
     */
    public void setIntervalTime(Integer IntervalTime) {
        this.IntervalTime = IntervalTime;
    }

    /**
     * 获取健康检查健康阈值，默认值：3，表示当连续探测三次健康则表示该转发正常，可选值：2-10，单位：次。
     * @return HealthNum 健康检查健康阈值，默认值：3，表示当连续探测三次健康则表示该转发正常，可选值：2-10，单位：次。
     */
    public Integer getHealthNum() {
        return this.HealthNum;
    }

    /**
     * 设置健康检查健康阈值，默认值：3，表示当连续探测三次健康则表示该转发正常，可选值：2-10，单位：次。
     * @param HealthNum 健康检查健康阈值，默认值：3，表示当连续探测三次健康则表示该转发正常，可选值：2-10，单位：次。
     */
    public void setHealthNum(Integer HealthNum) {
        this.HealthNum = HealthNum;
    }

    /**
     * 获取健康检查不健康阈值，默认值：5，表示当连续探测五次不健康则表示该转发不正常，可选值：2-10，单位：次。
     * @return UnhealthNum 健康检查不健康阈值，默认值：5，表示当连续探测五次不健康则表示该转发不正常，可选值：2-10，单位：次。
     */
    public Integer getUnhealthNum() {
        return this.UnhealthNum;
    }

    /**
     * 设置健康检查不健康阈值，默认值：5，表示当连续探测五次不健康则表示该转发不正常，可选值：2-10，单位：次。
     * @param UnhealthNum 健康检查不健康阈值，默认值：5，表示当连续探测五次不健康则表示该转发不正常，可选值：2-10，单位：次。
     */
    public void setUnhealthNum(Integer UnhealthNum) {
        this.UnhealthNum = UnhealthNum;
    }

    /**
     * 获取健康检查中认为健康的HTTP返回码的组合。可选值为1~5的集合，1表示HTTP返回码为1xx认为健康。2表示HTTP返回码为2xx认为健康。3表示HTTP返回码为3xx认为健康。4表示HTTP返回码为4xx认为健康。5表示HTTP返回码为5xx认为健康。
     * @return HttpCodes 健康检查中认为健康的HTTP返回码的组合。可选值为1~5的集合，1表示HTTP返回码为1xx认为健康。2表示HTTP返回码为2xx认为健康。3表示HTTP返回码为3xx认为健康。4表示HTTP返回码为4xx认为健康。5表示HTTP返回码为5xx认为健康。
     */
    public Integer [] getHttpCodes() {
        return this.HttpCodes;
    }

    /**
     * 设置健康检查中认为健康的HTTP返回码的组合。可选值为1~5的集合，1表示HTTP返回码为1xx认为健康。2表示HTTP返回码为2xx认为健康。3表示HTTP返回码为3xx认为健康。4表示HTTP返回码为4xx认为健康。5表示HTTP返回码为5xx认为健康。
     * @param HttpCodes 健康检查中认为健康的HTTP返回码的组合。可选值为1~5的集合，1表示HTTP返回码为1xx认为健康。2表示HTTP返回码为2xx认为健康。3表示HTTP返回码为3xx认为健康。4表示HTTP返回码为4xx认为健康。5表示HTTP返回码为5xx认为健康。
     */
    public void setHttpCodes(Integer [] HttpCodes) {
        this.HttpCodes = HttpCodes;
    }

    /**
     * 获取健康检查检查路径。
     * @return HttpCheckPath 健康检查检查路径。
     */
    public String getHttpCheckPath() {
        return this.HttpCheckPath;
    }

    /**
     * 设置健康检查检查路径。
     * @param HttpCheckPath 健康检查检查路径。
     */
    public void setHttpCheckPath(String HttpCheckPath) {
        this.HttpCheckPath = HttpCheckPath;
    }

    /**
     * 获取健康检查检查域名。如果规则的域名使用通配符或正则表达式，则健康检查检查域名可自定义，否则必须跟健康检查检查域名一样。不填表示不修改。
     * @return HttpCheckDomain 健康检查检查域名。如果规则的域名使用通配符或正则表达式，则健康检查检查域名可自定义，否则必须跟健康检查检查域名一样。不填表示不修改。
     */
    public String getHttpCheckDomain() {
        return this.HttpCheckDomain;
    }

    /**
     * 设置健康检查检查域名。如果规则的域名使用通配符或正则表达式，则健康检查检查域名可自定义，否则必须跟健康检查检查域名一样。不填表示不修改。
     * @param HttpCheckDomain 健康检查检查域名。如果规则的域名使用通配符或正则表达式，则健康检查检查域名可自定义，否则必须跟健康检查检查域名一样。不填表示不修改。
     */
    public void setHttpCheckDomain(String HttpCheckDomain) {
        this.HttpCheckDomain = HttpCheckDomain;
    }

    /**
     * 获取均衡方式：ip_hash、wrr。默认值wrr。
     * @return BalanceMode 均衡方式：ip_hash、wrr。默认值wrr。
     */
    public String getBalanceMode() {
        return this.BalanceMode;
    }

    /**
     * 设置均衡方式：ip_hash、wrr。默认值wrr。
     * @param BalanceMode 均衡方式：ip_hash、wrr。默认值wrr。
     */
    public void setBalanceMode(String BalanceMode) {
        this.BalanceMode = BalanceMode;
    }

    /**
     * 获取转发域名。
     * @return Domain 转发域名。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * 设置转发域名。
     * @param Domain 转发域名。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "LocationId", this.LocationId);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "SessionExpire", this.SessionExpire);
        this.setParamSimple(map, prefix + "HealthSwitch", this.HealthSwitch);
        this.setParamSimple(map, prefix + "IntervalTime", this.IntervalTime);
        this.setParamSimple(map, prefix + "HealthNum", this.HealthNum);
        this.setParamSimple(map, prefix + "UnhealthNum", this.UnhealthNum);
        this.setParamArraySimple(map, prefix + "HttpCodes.", this.HttpCodes);
        this.setParamSimple(map, prefix + "HttpCheckPath", this.HttpCheckPath);
        this.setParamSimple(map, prefix + "HttpCheckDomain", this.HttpCheckDomain);
        this.setParamSimple(map, prefix + "BalanceMode", this.BalanceMode);
        this.setParamSimple(map, prefix + "Domain", this.Domain);

    }
}

