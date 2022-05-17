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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeHistoryServiceResponse extends AbstractModel{

    /**
    * 1 可购买 2 只能升降配 3 只能跳到续费管理页
    */
    @SerializedName("BuyStatus")
    @Expose
    private Long BuyStatus;

    /**
    * 用户已购容量 单位 G
    */
    @SerializedName("InquireNum")
    @Expose
    private Long InquireNum;

    /**
    * 到期时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 是否自动续费,0 初始值, 1 开通 2 没开通
    */
    @SerializedName("IsAutoOpenRenew")
    @Expose
    private Long IsAutoOpenRenew;

    /**
    * 资源ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 0 没开通 1 正常 2隔离 3销毁
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 1 可购买 2 只能升降配 3 只能跳到续费管理页 
     * @return BuyStatus 1 可购买 2 只能升降配 3 只能跳到续费管理页
     */
    public Long getBuyStatus() {
        return this.BuyStatus;
    }

    /**
     * Set 1 可购买 2 只能升降配 3 只能跳到续费管理页
     * @param BuyStatus 1 可购买 2 只能升降配 3 只能跳到续费管理页
     */
    public void setBuyStatus(Long BuyStatus) {
        this.BuyStatus = BuyStatus;
    }

    /**
     * Get 用户已购容量 单位 G 
     * @return InquireNum 用户已购容量 单位 G
     */
    public Long getInquireNum() {
        return this.InquireNum;
    }

    /**
     * Set 用户已购容量 单位 G
     * @param InquireNum 用户已购容量 单位 G
     */
    public void setInquireNum(Long InquireNum) {
        this.InquireNum = InquireNum;
    }

    /**
     * Get 到期时间 
     * @return EndTime 到期时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 到期时间
     * @param EndTime 到期时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 是否自动续费,0 初始值, 1 开通 2 没开通 
     * @return IsAutoOpenRenew 是否自动续费,0 初始值, 1 开通 2 没开通
     */
    public Long getIsAutoOpenRenew() {
        return this.IsAutoOpenRenew;
    }

    /**
     * Set 是否自动续费,0 初始值, 1 开通 2 没开通
     * @param IsAutoOpenRenew 是否自动续费,0 初始值, 1 开通 2 没开通
     */
    public void setIsAutoOpenRenew(Long IsAutoOpenRenew) {
        this.IsAutoOpenRenew = IsAutoOpenRenew;
    }

    /**
     * Get 资源ID 
     * @return ResourceId 资源ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源ID
     * @param ResourceId 资源ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 0 没开通 1 正常 2隔离 3销毁 
     * @return Status 0 没开通 1 正常 2隔离 3销毁
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 0 没开通 1 正常 2隔离 3销毁
     * @param Status 0 没开通 1 正常 2隔离 3销毁
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeHistoryServiceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHistoryServiceResponse(DescribeHistoryServiceResponse source) {
        if (source.BuyStatus != null) {
            this.BuyStatus = new Long(source.BuyStatus);
        }
        if (source.InquireNum != null) {
            this.InquireNum = new Long(source.InquireNum);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.IsAutoOpenRenew != null) {
            this.IsAutoOpenRenew = new Long(source.IsAutoOpenRenew);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BuyStatus", this.BuyStatus);
        this.setParamSimple(map, prefix + "InquireNum", this.InquireNum);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "IsAutoOpenRenew", this.IsAutoOpenRenew);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

