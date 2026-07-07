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

public class DescribeDspmIdentifyRuleDetailResponse extends AbstractModel {

    /**
    * <p>数据项id</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>数据项名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>数据项描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>数据项是否启用</p><p>枚举值：</p><ul><li>0： 否</li><li>1： 是</li></ul><p>默认值：0</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>数据项类型</p><p>枚举值：</p><ul><li>0： 内置</li><li>1： 自定义</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>结构化规则</p>
    */
    @SerializedName("StructuredRule")
    @Expose
    private String StructuredRule;

    /**
    * <p>非结构化规则</p>
    */
    @SerializedName("UnStructuredRule")
    @Expose
    private String UnStructuredRule;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>数据项id</p> 
     * @return Id <p>数据项id</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>数据项id</p>
     * @param Id <p>数据项id</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>数据项名称</p> 
     * @return Name <p>数据项名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>数据项名称</p>
     * @param Name <p>数据项名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>数据项描述</p> 
     * @return Description <p>数据项描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>数据项描述</p>
     * @param Description <p>数据项描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>数据项是否启用</p><p>枚举值：</p><ul><li>0： 否</li><li>1： 是</li></ul><p>默认值：0</p> 
     * @return Status <p>数据项是否启用</p><p>枚举值：</p><ul><li>0： 否</li><li>1： 是</li></ul><p>默认值：0</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>数据项是否启用</p><p>枚举值：</p><ul><li>0： 否</li><li>1： 是</li></ul><p>默认值：0</p>
     * @param Status <p>数据项是否启用</p><p>枚举值：</p><ul><li>0： 否</li><li>1： 是</li></ul><p>默认值：0</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>数据项类型</p><p>枚举值：</p><ul><li>0： 内置</li><li>1： 自定义</li></ul> 
     * @return Type <p>数据项类型</p><p>枚举值：</p><ul><li>0： 内置</li><li>1： 自定义</li></ul>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>数据项类型</p><p>枚举值：</p><ul><li>0： 内置</li><li>1： 自定义</li></ul>
     * @param Type <p>数据项类型</p><p>枚举值：</p><ul><li>0： 内置</li><li>1： 自定义</li></ul>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>结构化规则</p> 
     * @return StructuredRule <p>结构化规则</p>
     */
    public String getStructuredRule() {
        return this.StructuredRule;
    }

    /**
     * Set <p>结构化规则</p>
     * @param StructuredRule <p>结构化规则</p>
     */
    public void setStructuredRule(String StructuredRule) {
        this.StructuredRule = StructuredRule;
    }

    /**
     * Get <p>非结构化规则</p> 
     * @return UnStructuredRule <p>非结构化规则</p>
     */
    public String getUnStructuredRule() {
        return this.UnStructuredRule;
    }

    /**
     * Set <p>非结构化规则</p>
     * @param UnStructuredRule <p>非结构化规则</p>
     */
    public void setUnStructuredRule(String UnStructuredRule) {
        this.UnStructuredRule = UnStructuredRule;
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

    public DescribeDspmIdentifyRuleDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDspmIdentifyRuleDetailResponse(DescribeDspmIdentifyRuleDetailResponse source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.StructuredRule != null) {
            this.StructuredRule = new String(source.StructuredRule);
        }
        if (source.UnStructuredRule != null) {
            this.UnStructuredRule = new String(source.UnStructuredRule);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "StructuredRule", this.StructuredRule);
        this.setParamSimple(map, prefix + "UnStructuredRule", this.UnStructuredRule);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

