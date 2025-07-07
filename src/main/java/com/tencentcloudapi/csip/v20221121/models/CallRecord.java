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

public class CallRecord extends AbstractModel {

    /**
    * 调用记录ID
    */
    @SerializedName("CallID")
    @Expose
    private String CallID;

    /**
    * 访问密钥
    */
    @SerializedName("AccessKey")
    @Expose
    private String AccessKey;

    /**
    * 访问密钥备注
    */
    @SerializedName("AccessKeyRemark")
    @Expose
    private String AccessKeyRemark;

    /**
    * 访问密钥ID
    */
    @SerializedName("AccessKeyID")
    @Expose
    private Long AccessKeyID;

    /**
    * 调用源IP
    */
    @SerializedName("SourceIP")
    @Expose
    private String SourceIP;

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
    * IP类型 0:账号内（未备注） 1:账号外（未备注） 2:账号内 (已备注) 3:账号外 (已备注)
    */
    @SerializedName("IPType")
    @Expose
    private Long IPType;

    /**
    * 调用接口名称
    */
    @SerializedName("EventName")
    @Expose
    private String EventName;

    /**
    * 调用产品名称
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 调用类型
0:控制台调用
1:API
    */
    @SerializedName("EventType")
    @Expose
    private Long EventType;

    /**
    * 用户类型
CAMUser/root/AssumedRole

    */
    @SerializedName("UserType")
    @Expose
    private String UserType;

    /**
    * 用户/角色名称
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 策略列表
    */
    @SerializedName("PolicySet")
    @Expose
    private String [] PolicySet;

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
    * IP关联资产ID，如果为空字符串，表示没有关联
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * IP关联资产名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

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
    * 展示状态
    */
    @SerializedName("ShowStatus")
    @Expose
    private Boolean ShowStatus;

    /**
    * 运营商
    */
    @SerializedName("ISP")
    @Expose
    private String ISP;

    /**
     * Get 调用记录ID 
     * @return CallID 调用记录ID
     */
    public String getCallID() {
        return this.CallID;
    }

    /**
     * Set 调用记录ID
     * @param CallID 调用记录ID
     */
    public void setCallID(String CallID) {
        this.CallID = CallID;
    }

    /**
     * Get 访问密钥 
     * @return AccessKey 访问密钥
     */
    public String getAccessKey() {
        return this.AccessKey;
    }

    /**
     * Set 访问密钥
     * @param AccessKey 访问密钥
     */
    public void setAccessKey(String AccessKey) {
        this.AccessKey = AccessKey;
    }

    /**
     * Get 访问密钥备注 
     * @return AccessKeyRemark 访问密钥备注
     */
    public String getAccessKeyRemark() {
        return this.AccessKeyRemark;
    }

    /**
     * Set 访问密钥备注
     * @param AccessKeyRemark 访问密钥备注
     */
    public void setAccessKeyRemark(String AccessKeyRemark) {
        this.AccessKeyRemark = AccessKeyRemark;
    }

    /**
     * Get 访问密钥ID 
     * @return AccessKeyID 访问密钥ID
     */
    public Long getAccessKeyID() {
        return this.AccessKeyID;
    }

    /**
     * Set 访问密钥ID
     * @param AccessKeyID 访问密钥ID
     */
    public void setAccessKeyID(Long AccessKeyID) {
        this.AccessKeyID = AccessKeyID;
    }

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
     * Get IP类型 0:账号内（未备注） 1:账号外（未备注） 2:账号内 (已备注) 3:账号外 (已备注) 
     * @return IPType IP类型 0:账号内（未备注） 1:账号外（未备注） 2:账号内 (已备注) 3:账号外 (已备注)
     */
    public Long getIPType() {
        return this.IPType;
    }

    /**
     * Set IP类型 0:账号内（未备注） 1:账号外（未备注） 2:账号内 (已备注) 3:账号外 (已备注)
     * @param IPType IP类型 0:账号内（未备注） 1:账号外（未备注） 2:账号内 (已备注) 3:账号外 (已备注)
     */
    public void setIPType(Long IPType) {
        this.IPType = IPType;
    }

    /**
     * Get 调用接口名称 
     * @return EventName 调用接口名称
     */
    public String getEventName() {
        return this.EventName;
    }

    /**
     * Set 调用接口名称
     * @param EventName 调用接口名称
     */
    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    /**
     * Get 调用产品名称 
     * @return ProductName 调用产品名称
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set 调用产品名称
     * @param ProductName 调用产品名称
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
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
     * Get 用户类型
CAMUser/root/AssumedRole
 
     * @return UserType 用户类型
CAMUser/root/AssumedRole

     */
    public String getUserType() {
        return this.UserType;
    }

    /**
     * Set 用户类型
CAMUser/root/AssumedRole

     * @param UserType 用户类型
CAMUser/root/AssumedRole

     */
    public void setUserType(String UserType) {
        this.UserType = UserType;
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
     * Get 策略列表 
     * @return PolicySet 策略列表
     */
    public String [] getPolicySet() {
        return this.PolicySet;
    }

    /**
     * Set 策略列表
     * @param PolicySet 策略列表
     */
    public void setPolicySet(String [] PolicySet) {
        this.PolicySet = PolicySet;
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
     * Get IP关联资产ID，如果为空字符串，表示没有关联 
     * @return InstanceID IP关联资产ID，如果为空字符串，表示没有关联
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set IP关联资产ID，如果为空字符串，表示没有关联
     * @param InstanceID IP关联资产ID，如果为空字符串，表示没有关联
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get IP关联资产名称 
     * @return InstanceName IP关联资产名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set IP关联资产名称
     * @param InstanceName IP关联资产名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
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
     * Get 展示状态 
     * @return ShowStatus 展示状态
     */
    public Boolean getShowStatus() {
        return this.ShowStatus;
    }

    /**
     * Set 展示状态
     * @param ShowStatus 展示状态
     */
    public void setShowStatus(Boolean ShowStatus) {
        this.ShowStatus = ShowStatus;
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

    public CallRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CallRecord(CallRecord source) {
        if (source.CallID != null) {
            this.CallID = new String(source.CallID);
        }
        if (source.AccessKey != null) {
            this.AccessKey = new String(source.AccessKey);
        }
        if (source.AccessKeyRemark != null) {
            this.AccessKeyRemark = new String(source.AccessKeyRemark);
        }
        if (source.AccessKeyID != null) {
            this.AccessKeyID = new Long(source.AccessKeyID);
        }
        if (source.SourceIP != null) {
            this.SourceIP = new String(source.SourceIP);
        }
        if (source.SourceIPRemark != null) {
            this.SourceIPRemark = new String(source.SourceIPRemark);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.IPType != null) {
            this.IPType = new Long(source.IPType);
        }
        if (source.EventName != null) {
            this.EventName = new String(source.EventName);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.EventType != null) {
            this.EventType = new Long(source.EventType);
        }
        if (source.UserType != null) {
            this.UserType = new String(source.UserType);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.PolicySet != null) {
            this.PolicySet = new String[source.PolicySet.length];
            for (int i = 0; i < source.PolicySet.length; i++) {
                this.PolicySet[i] = new String(source.PolicySet[i]);
            }
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
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.ShowStatus != null) {
            this.ShowStatus = new Boolean(source.ShowStatus);
        }
        if (source.ISP != null) {
            this.ISP = new String(source.ISP);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CallID", this.CallID);
        this.setParamSimple(map, prefix + "AccessKey", this.AccessKey);
        this.setParamSimple(map, prefix + "AccessKeyRemark", this.AccessKeyRemark);
        this.setParamSimple(map, prefix + "AccessKeyID", this.AccessKeyID);
        this.setParamSimple(map, prefix + "SourceIP", this.SourceIP);
        this.setParamSimple(map, prefix + "SourceIPRemark", this.SourceIPRemark);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "IPType", this.IPType);
        this.setParamSimple(map, prefix + "EventName", this.EventName);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "UserType", this.UserType);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamArraySimple(map, prefix + "PolicySet.", this.PolicySet);
        this.setParamSimple(map, prefix + "CallCount", this.CallCount);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "FirstCallTime", this.FirstCallTime);
        this.setParamSimple(map, prefix + "LastCallTime", this.LastCallTime);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "ShowStatus", this.ShowStatus);
        this.setParamSimple(map, prefix + "ISP", this.ISP);

    }
}

