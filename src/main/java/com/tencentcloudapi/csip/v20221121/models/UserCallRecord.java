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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserCallRecord extends AbstractModel {

    /**
    * 调用源IP
    */
    @SerializedName("SourceIP")
    @Expose
    private String SourceIP;

    /**
    * 调用类型
0:控制台调用
1:API
    */
    @SerializedName("EventType")
    @Expose
    private Long EventType;

    /**
    * 调用次数
    */
    @SerializedName("CallCount")
    @Expose
    private Long CallCount;

    /**
    * 调用错误码
0表示成功
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
    * 首次调用时间
    */
    @SerializedName("FirstCallTime")
    @Expose
    private String FirstCallTime;

    /**
    * 最后调用时间
    */
    @SerializedName("LastCallTime")
    @Expose
    private String LastCallTime;

    /**
    * 调用源IP备注
    */
    @SerializedName("SourceIPRemark")
    @Expose
    private String SourceIPRemark;

    /**
    * 调用源IP地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 用户/角色名称
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 聚合日期
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * appid
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * 运营商
    */
    @SerializedName("ISP")
    @Expose
    private String ISP;

    /**
     * Get 调用源IP 
     * @return SourceIP 调用源IP
     */
    public String getSourceIP() {
        return this.SourceIP;
    }

    /**
     * Set 调用源IP
     * @param SourceIP 调用源IP
     */
    public void setSourceIP(String SourceIP) {
        this.SourceIP = SourceIP;
    }

    /**
     * Get 调用类型
0:控制台调用
1:API 
     * @return EventType 调用类型
0:控制台调用
1:API
     */
    public Long getEventType() {
        return this.EventType;
    }

    /**
     * Set 调用类型
0:控制台调用
1:API
     * @param EventType 调用类型
0:控制台调用
1:API
     */
    public void setEventType(Long EventType) {
        this.EventType = EventType;
    }

    /**
     * Get 调用次数 
     * @return CallCount 调用次数
     */
    public Long getCallCount() {
        return this.CallCount;
    }

    /**
     * Set 调用次数
     * @param CallCount 调用次数
     */
    public void setCallCount(Long CallCount) {
        this.CallCount = CallCount;
    }

    /**
     * Get 调用错误码
0表示成功 
     * @return Code 调用错误码
0表示成功
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set 调用错误码
0表示成功
     * @param Code 调用错误码
0表示成功
     */
    public void setCode(Long Code) {
        this.Code = Code;
    }

    /**
     * Get 首次调用时间 
     * @return FirstCallTime 首次调用时间
     */
    public String getFirstCallTime() {
        return this.FirstCallTime;
    }

    /**
     * Set 首次调用时间
     * @param FirstCallTime 首次调用时间
     */
    public void setFirstCallTime(String FirstCallTime) {
        this.FirstCallTime = FirstCallTime;
    }

    /**
     * Get 最后调用时间 
     * @return LastCallTime 最后调用时间
     */
    public String getLastCallTime() {
        return this.LastCallTime;
    }

    /**
     * Set 最后调用时间
     * @param LastCallTime 最后调用时间
     */
    public void setLastCallTime(String LastCallTime) {
        this.LastCallTime = LastCallTime;
    }

    /**
     * Get 调用源IP备注 
     * @return SourceIPRemark 调用源IP备注
     */
    public String getSourceIPRemark() {
        return this.SourceIPRemark;
    }

    /**
     * Set 调用源IP备注
     * @param SourceIPRemark 调用源IP备注
     */
    public void setSourceIPRemark(String SourceIPRemark) {
        this.SourceIPRemark = SourceIPRemark;
    }

    /**
     * Get 调用源IP地域 
     * @return Region 调用源IP地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 调用源IP地域
     * @param Region 调用源IP地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 用户/角色名称 
     * @return UserName 用户/角色名称
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户/角色名称
     * @param UserName 用户/角色名称
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 聚合日期 
     * @return Date 聚合日期
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 聚合日期
     * @param Date 聚合日期
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get appid 
     * @return AppID appid
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set appid
     * @param AppID appid
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get 运营商 
     * @return ISP 运营商
     */
    public String getISP() {
        return this.ISP;
    }

    /**
     * Set 运营商
     * @param ISP 运营商
     */
    public void setISP(String ISP) {
        this.ISP = ISP;
    }

    public UserCallRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserCallRecord(UserCallRecord source) {
        if (source.SourceIP != null) {
            this.SourceIP = new String(source.SourceIP);
        }
        if (source.EventType != null) {
            this.EventType = new Long(source.EventType);
        }
        if (source.CallCount != null) {
            this.CallCount = new Long(source.CallCount);
        }
        if (source.Code != null) {
            this.Code = new Long(source.Code);
        }
        if (source.FirstCallTime != null) {
            this.FirstCallTime = new String(source.FirstCallTime);
        }
        if (source.LastCallTime != null) {
            this.LastCallTime = new String(source.LastCallTime);
        }
        if (source.SourceIPRemark != null) {
            this.SourceIPRemark = new String(source.SourceIPRemark);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.ISP != null) {
            this.ISP = new String(source.ISP);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceIP", this.SourceIP);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "CallCount", this.CallCount);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "FirstCallTime", this.FirstCallTime);
        this.setParamSimple(map, prefix + "LastCallTime", this.LastCallTime);
        this.setParamSimple(map, prefix + "SourceIPRemark", this.SourceIPRemark);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "ISP", this.ISP);

    }
}

