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
package com.tencentcloudapi.igtm.v20231024.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDetectPackageDetailResponse extends AbstractModel {

    /**
    * 资源id
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 资源类型 TASK 探测任务
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 额度
    */
    @SerializedName("Quota")
    @Expose
    private Long Quota;

    /**
    * 过期时间
    */
    @SerializedName("CurrentDeadline")
    @Expose
    private String CurrentDeadline;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 是否过期
    */
    @SerializedName("IsExpire")
    @Expose
    private Long IsExpire;

    /**
    * 状态 ENABLED: 正常 ISOLATED: 隔离 DESTROYED：销毁 REFUNDED：已退款
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 是否自动续费0不1是
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 计费项
    */
    @SerializedName("CostItemList")
    @Expose
    private CostItem [] CostItemList;

    /**
    * 使用数量
    */
    @SerializedName("UsedNum")
    @Expose
    private Long UsedNum;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 资源id 
     * @return ResourceId 资源id
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源id
     * @param ResourceId 资源id
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 资源类型 TASK 探测任务 
     * @return ResourceType 资源类型 TASK 探测任务
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 资源类型 TASK 探测任务
     * @param ResourceType 资源类型 TASK 探测任务
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 额度 
     * @return Quota 额度
     */
    public Long getQuota() {
        return this.Quota;
    }

    /**
     * Set 额度
     * @param Quota 额度
     */
    public void setQuota(Long Quota) {
        this.Quota = Quota;
    }

    /**
     * Get 过期时间 
     * @return CurrentDeadline 过期时间
     */
    public String getCurrentDeadline() {
        return this.CurrentDeadline;
    }

    /**
     * Set 过期时间
     * @param CurrentDeadline 过期时间
     */
    public void setCurrentDeadline(String CurrentDeadline) {
        this.CurrentDeadline = CurrentDeadline;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 是否过期 
     * @return IsExpire 是否过期
     */
    public Long getIsExpire() {
        return this.IsExpire;
    }

    /**
     * Set 是否过期
     * @param IsExpire 是否过期
     */
    public void setIsExpire(Long IsExpire) {
        this.IsExpire = IsExpire;
    }

    /**
     * Get 状态 ENABLED: 正常 ISOLATED: 隔离 DESTROYED：销毁 REFUNDED：已退款 
     * @return Status 状态 ENABLED: 正常 ISOLATED: 隔离 DESTROYED：销毁 REFUNDED：已退款
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态 ENABLED: 正常 ISOLATED: 隔离 DESTROYED：销毁 REFUNDED：已退款
     * @param Status 状态 ENABLED: 正常 ISOLATED: 隔离 DESTROYED：销毁 REFUNDED：已退款
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 是否自动续费0不1是 
     * @return AutoRenewFlag 是否自动续费0不1是
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 是否自动续费0不1是
     * @param AutoRenewFlag 是否自动续费0不1是
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 计费项 
     * @return CostItemList 计费项
     */
    public CostItem [] getCostItemList() {
        return this.CostItemList;
    }

    /**
     * Set 计费项
     * @param CostItemList 计费项
     */
    public void setCostItemList(CostItem [] CostItemList) {
        this.CostItemList = CostItemList;
    }

    /**
     * Get 使用数量 
     * @return UsedNum 使用数量
     */
    public Long getUsedNum() {
        return this.UsedNum;
    }

    /**
     * Set 使用数量
     * @param UsedNum 使用数量
     */
    public void setUsedNum(Long UsedNum) {
        this.UsedNum = UsedNum;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeDetectPackageDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDetectPackageDetailResponse(DescribeDetectPackageDetailResponse source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.Quota != null) {
            this.Quota = new Long(source.Quota);
        }
        if (source.CurrentDeadline != null) {
            this.CurrentDeadline = new String(source.CurrentDeadline);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.IsExpire != null) {
            this.IsExpire = new Long(source.IsExpire);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.CostItemList != null) {
            this.CostItemList = new CostItem[source.CostItemList.length];
            for (int i = 0; i < source.CostItemList.length; i++) {
                this.CostItemList[i] = new CostItem(source.CostItemList[i]);
            }
        }
        if (source.UsedNum != null) {
            this.UsedNum = new Long(source.UsedNum);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "Quota", this.Quota);
        this.setParamSimple(map, prefix + "CurrentDeadline", this.CurrentDeadline);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "IsExpire", this.IsExpire);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamArrayObj(map, prefix + "CostItemList.", this.CostItemList);
        this.setParamSimple(map, prefix + "UsedNum", this.UsedNum);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

