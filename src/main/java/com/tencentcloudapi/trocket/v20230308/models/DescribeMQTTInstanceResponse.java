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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMQTTInstanceResponse extends AbstractModel {

    /**
    * 实例类型，
EXPERIMENT 体验版
BASIC 基础版
PRO  专业版
PLATINUM 铂金版
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 主题数量
    */
    @SerializedName("TopicNum")
    @Expose
    private Long TopicNum;

    /**
    * 实例最大主题数量
    */
    @SerializedName("TopicNumLimit")
    @Expose
    private Long TopicNumLimit;

    /**
    * TPS限流值
    */
    @SerializedName("TpsLimit")
    @Expose
    private Long TpsLimit;

    /**
    * 创建时间，秒为单位
    */
    @SerializedName("CreatedTime")
    @Expose
    private Long CreatedTime;

    /**
    * 备注信息
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 实例状态
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * 实例规格
    */
    @SerializedName("SkuCode")
    @Expose
    private String SkuCode;

    /**
    * 订阅数上限
    */
    @SerializedName("SubscriptionNumLimit")
    @Expose
    private Long SubscriptionNumLimit;

    /**
    * 客户端数量上限
    */
    @SerializedName("ClientNumLimit")
    @Expose
    private Long ClientNumLimit;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 实例类型，
EXPERIMENT 体验版
BASIC 基础版
PRO  专业版
PLATINUM 铂金版 
     * @return InstanceType 实例类型，
EXPERIMENT 体验版
BASIC 基础版
PRO  专业版
PLATINUM 铂金版
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例类型，
EXPERIMENT 体验版
BASIC 基础版
PRO  专业版
PLATINUM 铂金版
     * @param InstanceType 实例类型，
EXPERIMENT 体验版
BASIC 基础版
PRO  专业版
PLATINUM 铂金版
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名称 
     * @return InstanceName 实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
     * @param InstanceName 实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 主题数量 
     * @return TopicNum 主题数量
     */
    public Long getTopicNum() {
        return this.TopicNum;
    }

    /**
     * Set 主题数量
     * @param TopicNum 主题数量
     */
    public void setTopicNum(Long TopicNum) {
        this.TopicNum = TopicNum;
    }

    /**
     * Get 实例最大主题数量 
     * @return TopicNumLimit 实例最大主题数量
     */
    public Long getTopicNumLimit() {
        return this.TopicNumLimit;
    }

    /**
     * Set 实例最大主题数量
     * @param TopicNumLimit 实例最大主题数量
     */
    public void setTopicNumLimit(Long TopicNumLimit) {
        this.TopicNumLimit = TopicNumLimit;
    }

    /**
     * Get TPS限流值 
     * @return TpsLimit TPS限流值
     */
    public Long getTpsLimit() {
        return this.TpsLimit;
    }

    /**
     * Set TPS限流值
     * @param TpsLimit TPS限流值
     */
    public void setTpsLimit(Long TpsLimit) {
        this.TpsLimit = TpsLimit;
    }

    /**
     * Get 创建时间，秒为单位 
     * @return CreatedTime 创建时间，秒为单位
     */
    public Long getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间，秒为单位
     * @param CreatedTime 创建时间，秒为单位
     */
    public void setCreatedTime(Long CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 备注信息 
     * @return Remark 备注信息
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注信息
     * @param Remark 备注信息
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 实例状态 
     * @return InstanceStatus 实例状态
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set 实例状态
     * @param InstanceStatus 实例状态
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get 实例规格 
     * @return SkuCode 实例规格
     */
    public String getSkuCode() {
        return this.SkuCode;
    }

    /**
     * Set 实例规格
     * @param SkuCode 实例规格
     */
    public void setSkuCode(String SkuCode) {
        this.SkuCode = SkuCode;
    }

    /**
     * Get 订阅数上限 
     * @return SubscriptionNumLimit 订阅数上限
     */
    public Long getSubscriptionNumLimit() {
        return this.SubscriptionNumLimit;
    }

    /**
     * Set 订阅数上限
     * @param SubscriptionNumLimit 订阅数上限
     */
    public void setSubscriptionNumLimit(Long SubscriptionNumLimit) {
        this.SubscriptionNumLimit = SubscriptionNumLimit;
    }

    /**
     * Get 客户端数量上限 
     * @return ClientNumLimit 客户端数量上限
     */
    public Long getClientNumLimit() {
        return this.ClientNumLimit;
    }

    /**
     * Set 客户端数量上限
     * @param ClientNumLimit 客户端数量上限
     */
    public void setClientNumLimit(Long ClientNumLimit) {
        this.ClientNumLimit = ClientNumLimit;
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

    public DescribeMQTTInstanceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMQTTInstanceResponse(DescribeMQTTInstanceResponse source) {
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.TopicNum != null) {
            this.TopicNum = new Long(source.TopicNum);
        }
        if (source.TopicNumLimit != null) {
            this.TopicNumLimit = new Long(source.TopicNumLimit);
        }
        if (source.TpsLimit != null) {
            this.TpsLimit = new Long(source.TpsLimit);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new Long(source.CreatedTime);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new String(source.InstanceStatus);
        }
        if (source.SkuCode != null) {
            this.SkuCode = new String(source.SkuCode);
        }
        if (source.SubscriptionNumLimit != null) {
            this.SubscriptionNumLimit = new Long(source.SubscriptionNumLimit);
        }
        if (source.ClientNumLimit != null) {
            this.ClientNumLimit = new Long(source.ClientNumLimit);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "TopicNum", this.TopicNum);
        this.setParamSimple(map, prefix + "TopicNumLimit", this.TopicNumLimit);
        this.setParamSimple(map, prefix + "TpsLimit", this.TpsLimit);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "SkuCode", this.SkuCode);
        this.setParamSimple(map, prefix + "SubscriptionNumLimit", this.SubscriptionNumLimit);
        this.setParamSimple(map, prefix + "ClientNumLimit", this.ClientNumLimit);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

