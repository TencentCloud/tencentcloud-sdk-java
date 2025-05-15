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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAutoScalingGroupFromInstanceRequest extends AbstractModel {

    /**
    * 伸缩组名称，在您账号中必须唯一。名称仅支持中文、英文、数字、下划线、分隔符"-"、小数点，最大长度不能超55个字节。
    */
    @SerializedName("AutoScalingGroupName")
    @Expose
    private String AutoScalingGroupName;

    /**
    * 实例ID。可通过登录[控制台](https://console.cloud.tencent.com/cvm/index)或调用接口 [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) ，取返回信息中的 `InstanceId` 获取实例ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 最小实例数，取值范围为0-2000。需满足最大值大于等于期望值，期望值大于等于最小值。
    */
    @SerializedName("MinSize")
    @Expose
    private Long MinSize;

    /**
    * 最大实例数，取值范围为0-2000。需满足最大值大于等于期望值，期望值大于等于最小值。
    */
    @SerializedName("MaxSize")
    @Expose
    private Long MaxSize;

    /**
    * 期望实例数，大小介于最小实例数和最大实例数之间。不传入时默认值等于最小值。
    */
    @SerializedName("DesiredCapacity")
    @Expose
    private Long DesiredCapacity;

    /**
    * 是否继承实例标签，默认值为False
    */
    @SerializedName("InheritInstanceTag")
    @Expose
    private Boolean InheritInstanceTag;

    /**
     * Get 伸缩组名称，在您账号中必须唯一。名称仅支持中文、英文、数字、下划线、分隔符"-"、小数点，最大长度不能超55个字节。 
     * @return AutoScalingGroupName 伸缩组名称，在您账号中必须唯一。名称仅支持中文、英文、数字、下划线、分隔符"-"、小数点，最大长度不能超55个字节。
     */
    public String getAutoScalingGroupName() {
        return this.AutoScalingGroupName;
    }

    /**
     * Set 伸缩组名称，在您账号中必须唯一。名称仅支持中文、英文、数字、下划线、分隔符"-"、小数点，最大长度不能超55个字节。
     * @param AutoScalingGroupName 伸缩组名称，在您账号中必须唯一。名称仅支持中文、英文、数字、下划线、分隔符"-"、小数点，最大长度不能超55个字节。
     */
    public void setAutoScalingGroupName(String AutoScalingGroupName) {
        this.AutoScalingGroupName = AutoScalingGroupName;
    }

    /**
     * Get 实例ID。可通过登录[控制台](https://console.cloud.tencent.com/cvm/index)或调用接口 [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) ，取返回信息中的 `InstanceId` 获取实例ID。 
     * @return InstanceId 实例ID。可通过登录[控制台](https://console.cloud.tencent.com/cvm/index)或调用接口 [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) ，取返回信息中的 `InstanceId` 获取实例ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID。可通过登录[控制台](https://console.cloud.tencent.com/cvm/index)或调用接口 [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) ，取返回信息中的 `InstanceId` 获取实例ID。
     * @param InstanceId 实例ID。可通过登录[控制台](https://console.cloud.tencent.com/cvm/index)或调用接口 [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) ，取返回信息中的 `InstanceId` 获取实例ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 最小实例数，取值范围为0-2000。需满足最大值大于等于期望值，期望值大于等于最小值。 
     * @return MinSize 最小实例数，取值范围为0-2000。需满足最大值大于等于期望值，期望值大于等于最小值。
     */
    public Long getMinSize() {
        return this.MinSize;
    }

    /**
     * Set 最小实例数，取值范围为0-2000。需满足最大值大于等于期望值，期望值大于等于最小值。
     * @param MinSize 最小实例数，取值范围为0-2000。需满足最大值大于等于期望值，期望值大于等于最小值。
     */
    public void setMinSize(Long MinSize) {
        this.MinSize = MinSize;
    }

    /**
     * Get 最大实例数，取值范围为0-2000。需满足最大值大于等于期望值，期望值大于等于最小值。 
     * @return MaxSize 最大实例数，取值范围为0-2000。需满足最大值大于等于期望值，期望值大于等于最小值。
     */
    public Long getMaxSize() {
        return this.MaxSize;
    }

    /**
     * Set 最大实例数，取值范围为0-2000。需满足最大值大于等于期望值，期望值大于等于最小值。
     * @param MaxSize 最大实例数，取值范围为0-2000。需满足最大值大于等于期望值，期望值大于等于最小值。
     */
    public void setMaxSize(Long MaxSize) {
        this.MaxSize = MaxSize;
    }

    /**
     * Get 期望实例数，大小介于最小实例数和最大实例数之间。不传入时默认值等于最小值。 
     * @return DesiredCapacity 期望实例数，大小介于最小实例数和最大实例数之间。不传入时默认值等于最小值。
     */
    public Long getDesiredCapacity() {
        return this.DesiredCapacity;
    }

    /**
     * Set 期望实例数，大小介于最小实例数和最大实例数之间。不传入时默认值等于最小值。
     * @param DesiredCapacity 期望实例数，大小介于最小实例数和最大实例数之间。不传入时默认值等于最小值。
     */
    public void setDesiredCapacity(Long DesiredCapacity) {
        this.DesiredCapacity = DesiredCapacity;
    }

    /**
     * Get 是否继承实例标签，默认值为False 
     * @return InheritInstanceTag 是否继承实例标签，默认值为False
     */
    public Boolean getInheritInstanceTag() {
        return this.InheritInstanceTag;
    }

    /**
     * Set 是否继承实例标签，默认值为False
     * @param InheritInstanceTag 是否继承实例标签，默认值为False
     */
    public void setInheritInstanceTag(Boolean InheritInstanceTag) {
        this.InheritInstanceTag = InheritInstanceTag;
    }

    public CreateAutoScalingGroupFromInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAutoScalingGroupFromInstanceRequest(CreateAutoScalingGroupFromInstanceRequest source) {
        if (source.AutoScalingGroupName != null) {
            this.AutoScalingGroupName = new String(source.AutoScalingGroupName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.MinSize != null) {
            this.MinSize = new Long(source.MinSize);
        }
        if (source.MaxSize != null) {
            this.MaxSize = new Long(source.MaxSize);
        }
        if (source.DesiredCapacity != null) {
            this.DesiredCapacity = new Long(source.DesiredCapacity);
        }
        if (source.InheritInstanceTag != null) {
            this.InheritInstanceTag = new Boolean(source.InheritInstanceTag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoScalingGroupName", this.AutoScalingGroupName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "MinSize", this.MinSize);
        this.setParamSimple(map, prefix + "MaxSize", this.MaxSize);
        this.setParamSimple(map, prefix + "DesiredCapacity", this.DesiredCapacity);
        this.setParamSimple(map, prefix + "InheritInstanceTag", this.InheritInstanceTag);

    }
}

