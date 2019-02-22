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

public class L7ListenerInfoLocation  extends AbstractModel{

    /**
    * 转发路径。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 转发路径实例ID。
    */
    @SerializedName("LocationId")
    @Expose
    private String LocationId;

    /**
    * 会话保持时间。
    */
    @SerializedName("SessionExpire")
    @Expose
    private Integer SessionExpire;

    /**
    * 是否开启健康检查。
    */
    @SerializedName("HealthSwitch")
    @Expose
    private Integer HealthSwitch;

    /**
    * 健康检查检查路径。
    */
    @SerializedName("HttpCheckPath")
    @Expose
    private String HttpCheckPath;

    /**
    * 健康检查检查域名。
    */
    @SerializedName("HttpCheckDomain")
    @Expose
    private String HttpCheckDomain;

    /**
    * 健康检查检查间隔时间。
    */
    @SerializedName("IntervalTime")
    @Expose
    private Integer IntervalTime;

    /**
    * 健康检查健康阈值。
    */
    @SerializedName("HealthNum")
    @Expose
    private Integer HealthNum;

    /**
    * 健康检查不健康阈值。
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
    * 均衡方式。
    */
    @SerializedName("BalanceMode")
    @Expose
    private String BalanceMode;

    /**
    * 当前绑定关系的健康检查状态（Dead代表不健康，Alive代表健康）。
    */
    @SerializedName("Status")
    @Expose
    private Integer Status;

    /**
    * 创建时间戳。
    */
    @SerializedName("AddTimestamp")
    @Expose
    private String AddTimestamp;

    /**
    * 该转发路径所绑定的主机列表。
    */
    @SerializedName("BackendSet")
    @Expose
    private L7ListenerInfoBackend [] BackendSet;

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
     * 获取转发路径实例ID。
     * @return LocationId 转发路径实例ID。
     */
    public String getLocationId() {
        return this.LocationId;
    }

    /**
     * 设置转发路径实例ID。
     * @param LocationId 转发路径实例ID。
     */
    public void setLocationId(String LocationId) {
        this.LocationId = LocationId;
    }

    /**
     * 获取会话保持时间。
     * @return SessionExpire 会话保持时间。
     */
    public Integer getSessionExpire() {
        return this.SessionExpire;
    }

    /**
     * 设置会话保持时间。
     * @param SessionExpire 会话保持时间。
     */
    public void setSessionExpire(Integer SessionExpire) {
        this.SessionExpire = SessionExpire;
    }

    /**
     * 获取是否开启健康检查。
     * @return HealthSwitch 是否开启健康检查。
     */
    public Integer getHealthSwitch() {
        return this.HealthSwitch;
    }

    /**
     * 设置是否开启健康检查。
     * @param HealthSwitch 是否开启健康检查。
     */
    public void setHealthSwitch(Integer HealthSwitch) {
        this.HealthSwitch = HealthSwitch;
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
     * 获取健康检查检查域名。
     * @return HttpCheckDomain 健康检查检查域名。
     */
    public String getHttpCheckDomain() {
        return this.HttpCheckDomain;
    }

    /**
     * 设置健康检查检查域名。
     * @param HttpCheckDomain 健康检查检查域名。
     */
    public void setHttpCheckDomain(String HttpCheckDomain) {
        this.HttpCheckDomain = HttpCheckDomain;
    }

    /**
     * 获取健康检查检查间隔时间。
     * @return IntervalTime 健康检查检查间隔时间。
     */
    public Integer getIntervalTime() {
        return this.IntervalTime;
    }

    /**
     * 设置健康检查检查间隔时间。
     * @param IntervalTime 健康检查检查间隔时间。
     */
    public void setIntervalTime(Integer IntervalTime) {
        this.IntervalTime = IntervalTime;
    }

    /**
     * 获取健康检查健康阈值。
     * @return HealthNum 健康检查健康阈值。
     */
    public Integer getHealthNum() {
        return this.HealthNum;
    }

    /**
     * 设置健康检查健康阈值。
     * @param HealthNum 健康检查健康阈值。
     */
    public void setHealthNum(Integer HealthNum) {
        this.HealthNum = HealthNum;
    }

    /**
     * 获取健康检查不健康阈值。
     * @return UnhealthNum 健康检查不健康阈值。
     */
    public Integer getUnhealthNum() {
        return this.UnhealthNum;
    }

    /**
     * 设置健康检查不健康阈值。
     * @param UnhealthNum 健康检查不健康阈值。
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
     * 获取均衡方式。
     * @return BalanceMode 均衡方式。
     */
    public String getBalanceMode() {
        return this.BalanceMode;
    }

    /**
     * 设置均衡方式。
     * @param BalanceMode 均衡方式。
     */
    public void setBalanceMode(String BalanceMode) {
        this.BalanceMode = BalanceMode;
    }

    /**
     * 获取当前绑定关系的健康检查状态（Dead代表不健康，Alive代表健康）。
     * @return Status 当前绑定关系的健康检查状态（Dead代表不健康，Alive代表健康）。
     */
    public Integer getStatus() {
        return this.Status;
    }

    /**
     * 设置当前绑定关系的健康检查状态（Dead代表不健康，Alive代表健康）。
     * @param Status 当前绑定关系的健康检查状态（Dead代表不健康，Alive代表健康）。
     */
    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    /**
     * 获取创建时间戳。
     * @return AddTimestamp 创建时间戳。
     */
    public String getAddTimestamp() {
        return this.AddTimestamp;
    }

    /**
     * 设置创建时间戳。
     * @param AddTimestamp 创建时间戳。
     */
    public void setAddTimestamp(String AddTimestamp) {
        this.AddTimestamp = AddTimestamp;
    }

    /**
     * 获取该转发路径所绑定的主机列表。
     * @return BackendSet 该转发路径所绑定的主机列表。
     */
    public L7ListenerInfoBackend [] getBackendSet() {
        return this.BackendSet;
    }

    /**
     * 设置该转发路径所绑定的主机列表。
     * @param BackendSet 该转发路径所绑定的主机列表。
     */
    public void setBackendSet(L7ListenerInfoBackend [] BackendSet) {
        this.BackendSet = BackendSet;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "LocationId", this.LocationId);
        this.setParamSimple(map, prefix + "SessionExpire", this.SessionExpire);
        this.setParamSimple(map, prefix + "HealthSwitch", this.HealthSwitch);
        this.setParamSimple(map, prefix + "HttpCheckPath", this.HttpCheckPath);
        this.setParamSimple(map, prefix + "HttpCheckDomain", this.HttpCheckDomain);
        this.setParamSimple(map, prefix + "IntervalTime", this.IntervalTime);
        this.setParamSimple(map, prefix + "HealthNum", this.HealthNum);
        this.setParamSimple(map, prefix + "UnhealthNum", this.UnhealthNum);
        this.setParamArraySimple(map, prefix + "HttpCodes.", this.HttpCodes);
        this.setParamSimple(map, prefix + "BalanceMode", this.BalanceMode);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "AddTimestamp", this.AddTimestamp);
        this.setParamArrayObj(map, prefix + "BackendSet.", this.BackendSet);

    }
}

