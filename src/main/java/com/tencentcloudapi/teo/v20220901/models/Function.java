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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Function extends AbstractModel {

    /**
    * <p>函数 ID。</p>
    */
    @SerializedName("FunctionId")
    @Expose
    private String FunctionId;

    /**
    * <p>站点 ID。</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>函数名字。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>函数描述。</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>函数内容。</p>
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * <p>函数默认域名。</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>边缘函数默认域名因合规问题产生的地区访问限制列表。</p>
    */
    @SerializedName("DomainComplianceRestrictions")
    @Expose
    private ComplianceRestriction [] DomainComplianceRestrictions;

    /**
    * <p>创建时间。时间为世界标准时间（UTC）， 遵循 ISO 8601 标准的日期和时间格式。</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>修改时间。时间为世界标准时间（UTC）， 遵循 ISO 8601 标准的日期和时间格式。</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get <p>函数 ID。</p> 
     * @return FunctionId <p>函数 ID。</p>
     */
    public String getFunctionId() {
        return this.FunctionId;
    }

    /**
     * Set <p>函数 ID。</p>
     * @param FunctionId <p>函数 ID。</p>
     */
    public void setFunctionId(String FunctionId) {
        this.FunctionId = FunctionId;
    }

    /**
     * Get <p>站点 ID。</p> 
     * @return ZoneId <p>站点 ID。</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>站点 ID。</p>
     * @param ZoneId <p>站点 ID。</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>函数名字。</p> 
     * @return Name <p>函数名字。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>函数名字。</p>
     * @param Name <p>函数名字。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>函数描述。</p> 
     * @return Remark <p>函数描述。</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>函数描述。</p>
     * @param Remark <p>函数描述。</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>函数内容。</p> 
     * @return Content <p>函数内容。</p>
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>函数内容。</p>
     * @param Content <p>函数内容。</p>
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get <p>函数默认域名。</p> 
     * @return Domain <p>函数默认域名。</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>函数默认域名。</p>
     * @param Domain <p>函数默认域名。</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>边缘函数默认域名因合规问题产生的地区访问限制列表。</p> 
     * @return DomainComplianceRestrictions <p>边缘函数默认域名因合规问题产生的地区访问限制列表。</p>
     */
    public ComplianceRestriction [] getDomainComplianceRestrictions() {
        return this.DomainComplianceRestrictions;
    }

    /**
     * Set <p>边缘函数默认域名因合规问题产生的地区访问限制列表。</p>
     * @param DomainComplianceRestrictions <p>边缘函数默认域名因合规问题产生的地区访问限制列表。</p>
     */
    public void setDomainComplianceRestrictions(ComplianceRestriction [] DomainComplianceRestrictions) {
        this.DomainComplianceRestrictions = DomainComplianceRestrictions;
    }

    /**
     * Get <p>创建时间。时间为世界标准时间（UTC）， 遵循 ISO 8601 标准的日期和时间格式。</p> 
     * @return CreateTime <p>创建时间。时间为世界标准时间（UTC）， 遵循 ISO 8601 标准的日期和时间格式。</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间。时间为世界标准时间（UTC）， 遵循 ISO 8601 标准的日期和时间格式。</p>
     * @param CreateTime <p>创建时间。时间为世界标准时间（UTC）， 遵循 ISO 8601 标准的日期和时间格式。</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>修改时间。时间为世界标准时间（UTC）， 遵循 ISO 8601 标准的日期和时间格式。</p> 
     * @return UpdateTime <p>修改时间。时间为世界标准时间（UTC）， 遵循 ISO 8601 标准的日期和时间格式。</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>修改时间。时间为世界标准时间（UTC）， 遵循 ISO 8601 标准的日期和时间格式。</p>
     * @param UpdateTime <p>修改时间。时间为世界标准时间（UTC）， 遵循 ISO 8601 标准的日期和时间格式。</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public Function() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Function(Function source) {
        if (source.FunctionId != null) {
            this.FunctionId = new String(source.FunctionId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.DomainComplianceRestrictions != null) {
            this.DomainComplianceRestrictions = new ComplianceRestriction[source.DomainComplianceRestrictions.length];
            for (int i = 0; i < source.DomainComplianceRestrictions.length; i++) {
                this.DomainComplianceRestrictions[i] = new ComplianceRestriction(source.DomainComplianceRestrictions[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionId", this.FunctionId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamArrayObj(map, prefix + "DomainComplianceRestrictions.", this.DomainComplianceRestrictions);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

