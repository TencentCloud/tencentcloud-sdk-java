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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBindingPolicyObjectListRequest extends AbstractModel {

    /**
    * <p>固定值，为&quot;monitor&quot;</p>
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * <p>策略组id，如果有形如 policy-xxxx 的 id，请填到 PolicyId 字段中，本字段填 0</p>
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * <p>告警策略id，形如 policy-xxxx，如果填入，则GroupId可以填0</p>
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * <p>每次返回的数量，取值1~100，默认20</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>偏移量，从0开始计数，默认0。举例来说，参数 Offset=0&amp;Limit=20 返回第 0 到 19 项，Offset=20&amp;Limit=20 返回第 20 到 39 项，以此类推</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>筛选对象的维度信息</p>
    */
    @SerializedName("Dimensions")
    @Expose
    private DescribeBindingPolicyObjectListDimension [] Dimensions;

    /**
     * Get <p>固定值，为&quot;monitor&quot;</p> 
     * @return Module <p>固定值，为&quot;monitor&quot;</p>
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set <p>固定值，为&quot;monitor&quot;</p>
     * @param Module <p>固定值，为&quot;monitor&quot;</p>
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get <p>策略组id，如果有形如 policy-xxxx 的 id，请填到 PolicyId 字段中，本字段填 0</p> 
     * @return GroupId <p>策略组id，如果有形如 policy-xxxx 的 id，请填到 PolicyId 字段中，本字段填 0</p>
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>策略组id，如果有形如 policy-xxxx 的 id，请填到 PolicyId 字段中，本字段填 0</p>
     * @param GroupId <p>策略组id，如果有形如 policy-xxxx 的 id，请填到 PolicyId 字段中，本字段填 0</p>
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get <p>告警策略id，形如 policy-xxxx，如果填入，则GroupId可以填0</p> 
     * @return PolicyId <p>告警策略id，形如 policy-xxxx，如果填入，则GroupId可以填0</p>
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set <p>告警策略id，形如 policy-xxxx，如果填入，则GroupId可以填0</p>
     * @param PolicyId <p>告警策略id，形如 policy-xxxx，如果填入，则GroupId可以填0</p>
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get <p>每次返回的数量，取值1~100，默认20</p> 
     * @return Limit <p>每次返回的数量，取值1~100，默认20</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>每次返回的数量，取值1~100，默认20</p>
     * @param Limit <p>每次返回的数量，取值1~100，默认20</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>偏移量，从0开始计数，默认0。举例来说，参数 Offset=0&amp;Limit=20 返回第 0 到 19 项，Offset=20&amp;Limit=20 返回第 20 到 39 项，以此类推</p> 
     * @return Offset <p>偏移量，从0开始计数，默认0。举例来说，参数 Offset=0&amp;Limit=20 返回第 0 到 19 项，Offset=20&amp;Limit=20 返回第 20 到 39 项，以此类推</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量，从0开始计数，默认0。举例来说，参数 Offset=0&amp;Limit=20 返回第 0 到 19 项，Offset=20&amp;Limit=20 返回第 20 到 39 项，以此类推</p>
     * @param Offset <p>偏移量，从0开始计数，默认0。举例来说，参数 Offset=0&amp;Limit=20 返回第 0 到 19 项，Offset=20&amp;Limit=20 返回第 20 到 39 项，以此类推</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>筛选对象的维度信息</p> 
     * @return Dimensions <p>筛选对象的维度信息</p>
     */
    public DescribeBindingPolicyObjectListDimension [] getDimensions() {
        return this.Dimensions;
    }

    /**
     * Set <p>筛选对象的维度信息</p>
     * @param Dimensions <p>筛选对象的维度信息</p>
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

