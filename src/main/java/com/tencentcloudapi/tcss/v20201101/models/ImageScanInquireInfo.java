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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageScanInquireInfo extends AbstractModel {

    /**
    * 计费项
    */
    @SerializedName("InquireKey")
    @Expose
    private String InquireKey;

    /**
    * 总容量
    */
    @SerializedName("Capcity")
    @Expose
    private Long Capcity;

    /**
    * 已使用量
    */
    @SerializedName("Useage")
    @Expose
    private Long Useage;

    /**
    * 起始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 截止时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 计费状态
(Pending:待购)
(Normal:正常)
(Isolate:隔离)
    */
    @SerializedName("PurchaseStatus")
    @Expose
    private String PurchaseStatus;

    /**
    * 资源ID
    */
    @SerializedName("ResourceID")
    @Expose
    private String ResourceID;

    /**
    * 购买扫描数
    */
    @SerializedName("PayNum")
    @Expose
    private Long PayNum;

    /**
    * 试用扫描数
    */
    @SerializedName("TrialNum")
    @Expose
    private Long TrialNum;

    /**
    * 购买已使用量
    */
    @SerializedName("PayUsage")
    @Expose
    private Long PayUsage;

    /**
     * Get 计费项 
     * @return InquireKey 计费项
     */
    public String getInquireKey() {
        return this.InquireKey;
    }

    /**
     * Set 计费项
     * @param InquireKey 计费项
     */
    public void setInquireKey(String InquireKey) {
        this.InquireKey = InquireKey;
    }

    /**
     * Get 总容量 
     * @return Capcity 总容量
     */
    public Long getCapcity() {
        return this.Capcity;
    }

    /**
     * Set 总容量
     * @param Capcity 总容量
     */
    public void setCapcity(Long Capcity) {
        this.Capcity = Capcity;
    }

    /**
     * Get 已使用量 
     * @return Useage 已使用量
     */
    public Long getUseage() {
        return this.Useage;
    }

    /**
     * Set 已使用量
     * @param Useage 已使用量
     */
    public void setUseage(Long Useage) {
        this.Useage = Useage;
    }

    /**
     * Get 起始时间 
     * @return StartTime 起始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始时间
     * @param StartTime 起始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 截止时间 
     * @return EndTime 截止时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 截止时间
     * @param EndTime 截止时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 计费状态
(Pending:待购)
(Normal:正常)
(Isolate:隔离) 
     * @return PurchaseStatus 计费状态
(Pending:待购)
(Normal:正常)
(Isolate:隔离)
     */
    public String getPurchaseStatus() {
        return this.PurchaseStatus;
    }

    /**
     * Set 计费状态
(Pending:待购)
(Normal:正常)
(Isolate:隔离)
     * @param PurchaseStatus 计费状态
(Pending:待购)
(Normal:正常)
(Isolate:隔离)
     */
    public void setPurchaseStatus(String PurchaseStatus) {
        this.PurchaseStatus = PurchaseStatus;
    }

    /**
     * Get 资源ID 
     * @return ResourceID 资源ID
     */
    public String getResourceID() {
        return this.ResourceID;
    }

    /**
     * Set 资源ID
     * @param ResourceID 资源ID
     */
    public void setResourceID(String ResourceID) {
        this.ResourceID = ResourceID;
    }

    /**
     * Get 购买扫描数 
     * @return PayNum 购买扫描数
     */
    public Long getPayNum() {
        return this.PayNum;
    }

    /**
     * Set 购买扫描数
     * @param PayNum 购买扫描数
     */
    public void setPayNum(Long PayNum) {
        this.PayNum = PayNum;
    }

    /**
     * Get 试用扫描数 
     * @return TrialNum 试用扫描数
     */
    public Long getTrialNum() {
        return this.TrialNum;
    }

    /**
     * Set 试用扫描数
     * @param TrialNum 试用扫描数
     */
    public void setTrialNum(Long TrialNum) {
        this.TrialNum = TrialNum;
    }

    /**
     * Get 购买已使用量 
     * @return PayUsage 购买已使用量
     */
    public Long getPayUsage() {
        return this.PayUsage;
    }

    /**
     * Set 购买已使用量
     * @param PayUsage 购买已使用量
     */
    public void setPayUsage(Long PayUsage) {
        this.PayUsage = PayUsage;
    }

    public ImageScanInquireInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageScanInquireInfo(ImageScanInquireInfo source) {
        if (source.InquireKey != null) {
            this.InquireKey = new String(source.InquireKey);
        }
        if (source.Capcity != null) {
            this.Capcity = new Long(source.Capcity);
        }
        if (source.Useage != null) {
            this.Useage = new Long(source.Useage);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.PurchaseStatus != null) {
            this.PurchaseStatus = new String(source.PurchaseStatus);
        }
        if (source.ResourceID != null) {
            this.ResourceID = new String(source.ResourceID);
        }
        if (source.PayNum != null) {
            this.PayNum = new Long(source.PayNum);
        }
        if (source.TrialNum != null) {
            this.TrialNum = new Long(source.TrialNum);
        }
        if (source.PayUsage != null) {
            this.PayUsage = new Long(source.PayUsage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InquireKey", this.InquireKey);
        this.setParamSimple(map, prefix + "Capcity", this.Capcity);
        this.setParamSimple(map, prefix + "Useage", this.Useage);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "PurchaseStatus", this.PurchaseStatus);
        this.setParamSimple(map, prefix + "ResourceID", this.ResourceID);
        this.setParamSimple(map, prefix + "PayNum", this.PayNum);
        this.setParamSimple(map, prefix + "TrialNum", this.TrialNum);
        this.setParamSimple(map, prefix + "PayUsage", this.PayUsage);

    }
}

