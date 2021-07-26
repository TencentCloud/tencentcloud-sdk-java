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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBindingPolicyObjectListRequest extends AbstractModel{

    /**
    * 固定值，为"monitor"
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 策略组id，如果有形如 policy-xxxx 的 id，请填到 PolicyId 字段中，本字段填 0
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * 告警策略id，形如 policy-xxxx，如果填入，则GroupId可以填0
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * 每次返回的数量，取值1~100，默认20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量，从0开始计数，默认0。举例来说，参数 Offset=0&Limit=20 返回第 0 到 19 项，Offset=20&Limit=20 返回第 20 到 39 项，以此类推
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 筛选对象的维度信息
    */
    @SerializedName("Dimensions")
    @Expose
    private DescribeBindingPolicyObjectListDimension [] Dimensions;

    /**
     * Get 固定值，为"monitor" 
     * @return Module 固定值，为"monitor"
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 固定值，为"monitor"
     * @param Module 固定值，为"monitor"
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 策略组id，如果有形如 policy-xxxx 的 id，请填到 PolicyId 字段中，本字段填 0 
     * @return GroupId 策略组id，如果有形如 policy-xxxx 的 id，请填到 PolicyId 字段中，本字段填 0
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 策略组id，如果有形如 policy-xxxx 的 id，请填到 PolicyId 字段中，本字段填 0
     * @param GroupId 策略组id，如果有形如 policy-xxxx 的 id，请填到 PolicyId 字段中，本字段填 0
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 告警策略id，形如 policy-xxxx，如果填入，则GroupId可以填0 
     * @return PolicyId 告警策略id，形如 policy-xxxx，如果填入，则GroupId可以填0
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set 告警策略id，形如 policy-xxxx，如果填入，则GroupId可以填0
     * @param PolicyId 告警策略id，形如 policy-xxxx，如果填入，则GroupId可以填0
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get 每次返回的数量，取值1~100，默认20 
     * @return Limit 每次返回的数量，取值1~100，默认20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每次返回的数量，取值1~100，默认20
     * @param Limit 每次返回的数量，取值1~100，默认20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量，从0开始计数，默认0。举例来说，参数 Offset=0&Limit=20 返回第 0 到 19 项，Offset=20&Limit=20 返回第 20 到 39 项，以此类推 
     * @return Offset 偏移量，从0开始计数，默认0。举例来说，参数 Offset=0&Limit=20 返回第 0 到 19 项，Offset=20&Limit=20 返回第 20 到 39 项，以此类推
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，从0开始计数，默认0。举例来说，参数 Offset=0&Limit=20 返回第 0 到 19 项，Offset=20&Limit=20 返回第 20 到 39 项，以此类推
     * @param Offset 偏移量，从0开始计数，默认0。举例来说，参数 Offset=0&Limit=20 返回第 0 到 19 项，Offset=20&Limit=20 返回第 20 到 39 项，以此类推
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 筛选对象的维度信息 
     * @return Dimensions 筛选对象的维度信息
     */
    public DescribeBindingPolicyObjectListDimension [] getDimensions() {
        return this.Dimensions;
    }

    /**
     * Set 筛选对象的维度信息
     * @param Dimensions 筛选对象的维度信息
     */
    public void setDimensions(DescribeBindingPolicyObjectListDimension [] Dimensions) {
        this.Dimensions = Dimensions;
    }

    public DescribeBindingPolicyObjectListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBindingPolicyObjectListRequest(DescribeBindingPolicyObjectListRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Dimensions != null) {
            this.Dimensions = new DescribeBindingPolicyObjectListDimension[source.Dimensions.length];
            for (int i = 0; i < source.Dimensions.length; i++) {
                this.Dimensions[i] = new DescribeBindingPolicyObjectListDimension(source.Dimensions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Dimensions.", this.Dimensions);

    }
}

