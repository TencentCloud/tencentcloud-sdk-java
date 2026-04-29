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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeContractReviewChecklistResponse extends AbstractModel {

    /**
    * <p>获取的合同风险审查清单ID</p>
    */
    @SerializedName("ChecklistId")
    @Expose
    private String ChecklistId;

    /**
    * <p>获取的合同风险审查清单名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>获取的合同风险审查清单是否启用</p>
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * <p>获取的合同风险审查清单审查点列表</p>
    */
    @SerializedName("Categories")
    @Expose
    private ChecklistCategory [] Categories;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>获取的合同风险审查清单ID</p> 
     * @return ChecklistId <p>获取的合同风险审查清单ID</p>
     */
    public String getChecklistId() {
        return this.ChecklistId;
    }

    /**
     * Set <p>获取的合同风险审查清单ID</p>
     * @param ChecklistId <p>获取的合同风险审查清单ID</p>
     */
    public void setChecklistId(String ChecklistId) {
        this.ChecklistId = ChecklistId;
    }

    /**
     * Get <p>获取的合同风险审查清单名称</p> 
     * @return Name <p>获取的合同风险审查清单名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>获取的合同风险审查清单名称</p>
     * @param Name <p>获取的合同风险审查清单名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>获取的合同风险审查清单是否启用</p> 
     * @return Enabled <p>获取的合同风险审查清单是否启用</p>
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>获取的合同风险审查清单是否启用</p>
     * @param Enabled <p>获取的合同风险审查清单是否启用</p>
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get <p>获取的合同风险审查清单审查点列表</p> 
     * @return Categories <p>获取的合同风险审查清单审查点列表</p>
     */
    public ChecklistCategory [] getCategories() {
        return this.Categories;
    }

    /**
     * Set <p>获取的合同风险审查清单审查点列表</p>
     * @param Categories <p>获取的合同风险审查清单审查点列表</p>
     */
    public void setCategories(ChecklistCategory [] Categories) {
        this.Categories = Categories;
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

    public DescribeContractReviewChecklistResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeContractReviewChecklistResponse(DescribeContractReviewChecklistResponse source) {
        if (source.ChecklistId != null) {
            this.ChecklistId = new String(source.ChecklistId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.Categories != null) {
            this.Categories = new ChecklistCategory[source.Categories.length];
            for (int i = 0; i < source.Categories.length; i++) {
                this.Categories[i] = new ChecklistCategory(source.Categories[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChecklistId", this.ChecklistId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamArrayObj(map, prefix + "Categories.", this.Categories);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

