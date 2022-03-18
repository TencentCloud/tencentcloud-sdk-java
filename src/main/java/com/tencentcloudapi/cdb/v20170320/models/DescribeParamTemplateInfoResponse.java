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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeParamTemplateInfoResponse extends AbstractModel{

    /**
    * 参数模板 ID。
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * 参数模板名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 参数模板对应实例版本
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
    * 参数模板中的参数数量
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 参数详情
    */
    @SerializedName("Items")
    @Expose
    private ParameterDetail [] Items;

    /**
    * 参数模板描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 参数模板类型。支持值包括："HIGH_STABILITY" - 高稳定模板，"HIGH_PERFORMANCE" - 高性能模板。
    */
    @SerializedName("TemplateType")
    @Expose
    private String TemplateType;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 参数模板 ID。 
     * @return TemplateId 参数模板 ID。
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 参数模板 ID。
     * @param TemplateId 参数模板 ID。
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 参数模板名称。 
     * @return Name 参数模板名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 参数模板名称。
     * @param Name 参数模板名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 参数模板对应实例版本 
     * @return EngineVersion 参数模板对应实例版本
     */
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set 参数模板对应实例版本
     * @param EngineVersion 参数模板对应实例版本
     */
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Get 参数模板中的参数数量 
     * @return TotalCount 参数模板中的参数数量
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 参数模板中的参数数量
     * @param TotalCount 参数模板中的参数数量
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 参数详情 
     * @return Items 参数详情
     */
    public ParameterDetail [] getItems() {
        return this.Items;
    }

    /**
     * Set 参数详情
     * @param Items 参数详情
     */
    public void setItems(ParameterDetail [] Items) {
        this.Items = Items;
    }

    /**
     * Get 参数模板描述 
     * @return Description 参数模板描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 参数模板描述
     * @param Description 参数模板描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 参数模板类型。支持值包括："HIGH_STABILITY" - 高稳定模板，"HIGH_PERFORMANCE" - 高性能模板。 
     * @return TemplateType 参数模板类型。支持值包括："HIGH_STABILITY" - 高稳定模板，"HIGH_PERFORMANCE" - 高性能模板。
     */
    public String getTemplateType() {
        return this.TemplateType;
    }

    /**
     * Set 参数模板类型。支持值包括："HIGH_STABILITY" - 高稳定模板，"HIGH_PERFORMANCE" - 高性能模板。
     * @param TemplateType 参数模板类型。支持值包括："HIGH_STABILITY" - 高稳定模板，"HIGH_PERFORMANCE" - 高性能模板。
     */
    public void setTemplateType(String TemplateType) {
        this.TemplateType = TemplateType;
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

    public DescribeParamTemplateInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeParamTemplateInfoResponse(DescribeParamTemplateInfoResponse source) {
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.EngineVersion != null) {
            this.EngineVersion = new String(source.EngineVersion);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Items != null) {
            this.Items = new ParameterDetail[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new ParameterDetail(source.Items[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.TemplateType != null) {
            this.TemplateType = new String(source.TemplateType);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "EngineVersion", this.EngineVersion);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "TemplateType", this.TemplateType);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

