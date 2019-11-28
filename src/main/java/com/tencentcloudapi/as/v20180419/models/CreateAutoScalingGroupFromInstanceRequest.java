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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAutoScalingGroupFromInstanceRequest  extends AbstractModel{

    /**
    * 伸缩组名称，在您账号中必须唯一。名称仅支持中文、英文、数字、下划线、分隔符"-"、小数点，最大长度不能超55个字节。
    */
    @SerializedName("AutoScalingGroupName")
    @Expose
    private String AutoScalingGroupName;

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 最大实例数，取值范围为0-2000。
    */
    @SerializedName("MinSize")
    @Expose
    private Integer MinSize;

    /**
    * 最小实例数，取值范围为0-2000。
    */
    @SerializedName("MaxSize")
    @Expose
    private Integer MaxSize;

    /**
    * 期望实例数，大小介于最小实例数和最大实例数之间。
    */
    @SerializedName("DesiredCapacity")
    @Expose
    private Integer DesiredCapacity;

    /**
    * 是否继承实例标签，默认值为False
    */
    @SerializedName("InheritInstanceTag")
    @Expose
    private Boolean InheritInstanceTag;

    /**
     * 获取伸缩组名称，在您账号中必须唯一。名称仅支持中文、英文、数字、下划线、分隔符"-"、小数点，最大长度不能超55个字节。
     * @return AutoScalingGroupName 伸缩组名称，在您账号中必须唯一。名称仅支持中文、英文、数字、下划线、分隔符"-"、小数点，最大长度不能超55个字节。
     */
    public String getAutoScalingGroupName() {
        return this.AutoScalingGroupName;
    }

    /**
     * 设置伸缩组名称，在您账号中必须唯一。名称仅支持中文、英文、数字、下划线、分隔符"-"、小数点，最大长度不能超55个字节。
     * @param AutoScalingGroupName 伸缩组名称，在您账号中必须唯一。名称仅支持中文、英文、数字、下划线、分隔符"-"、小数点，最大长度不能超55个字节。
     */
    public void setAutoScalingGroupName(String AutoScalingGroupName) {
        this.AutoScalingGroupName = AutoScalingGroupName;
    }

    /**
     * 获取实例ID
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取最大实例数，取值范围为0-2000。
     * @return MinSize 最大实例数，取值范围为0-2000。
     */
    public Integer getMinSize() {
        return this.MinSize;
    }

    /**
     * 设置最大实例数，取值范围为0-2000。
     * @param MinSize 最大实例数，取值范围为0-2000。
     */
    public void setMinSize(Integer MinSize) {
        this.MinSize = MinSize;
    }

    /**
     * 获取最小实例数，取值范围为0-2000。
     * @return MaxSize 最小实例数，取值范围为0-2000。
     */
    public Integer getMaxSize() {
        return this.MaxSize;
    }

    /**
     * 设置最小实例数，取值范围为0-2000。
     * @param MaxSize 最小实例数，取值范围为0-2000。
     */
    public void setMaxSize(Integer MaxSize) {
        this.MaxSize = MaxSize;
    }

    /**
     * 获取期望实例数，大小介于最小实例数和最大实例数之间。
     * @return DesiredCapacity 期望实例数，大小介于最小实例数和最大实例数之间。
     */
    public Integer getDesiredCapacity() {
        return this.DesiredCapacity;
    }

    /**
     * 设置期望实例数，大小介于最小实例数和最大实例数之间。
     * @param DesiredCapacity 期望实例数，大小介于最小实例数和最大实例数之间。
     */
    public void setDesiredCapacity(Integer DesiredCapacity) {
        this.DesiredCapacity = DesiredCapacity;
    }

    /**
     * 获取是否继承实例标签，默认值为False
     * @return InheritInstanceTag 是否继承实例标签，默认值为False
     */
    public Boolean getInheritInstanceTag() {
        return this.InheritInstanceTag;
    }

    /**
     * 设置是否继承实例标签，默认值为False
     * @param InheritInstanceTag 是否继承实例标签，默认值为False
     */
    public void setInheritInstanceTag(Boolean InheritInstanceTag) {
        this.InheritInstanceTag = InheritInstanceTag;
    }

    /**
     * 内部实现，用户禁止调用
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

