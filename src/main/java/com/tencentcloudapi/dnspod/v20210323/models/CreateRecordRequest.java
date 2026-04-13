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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRecordRequest extends AbstractModel {

    /**
    * <p>域名</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>记录类型，可通过接口DescribeRecordType获得，大写英文，比如：A 。</p>
    */
    @SerializedName("RecordType")
    @Expose
    private String RecordType;

    /**
    * <p>记录线路，可以通过接口DescribeRecordLineList查看当前域名允许的线路信息，中文，比如：默认。</p>
    */
    @SerializedName("RecordLine")
    @Expose
    private String RecordLine;

    /**
    * <p>记录值，如 IP : 200.200.200.200， CNAME : cname.dnspod.com.， MX : mail.dnspod.com.。</p>
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * <p>域名 ID 。参数 DomainId 优先级比参数 Domain 高，如果传递参数 DomainId 将忽略参数 Domain 。</p>
    */
    @SerializedName("DomainId")
    @Expose
    private Long DomainId;

    /**
    * <p>主机记录，如 www，如果不传，默认为 @。</p>
    */
    @SerializedName("SubDomain")
    @Expose
    private String SubDomain;

    /**
    * <p>线路的 ID，可以通过接口DescribeRecordLineList查看当前域名允许的线路信息，英文字符串，比如：10=1。参数RecordLineId优先级高于RecordLine，如果同时传递二者，优先使用RecordLineId参数。</p>
    */
    @SerializedName("RecordLineId")
    @Expose
    private String RecordLineId;

    /**
    * <p>MX 优先级，当记录类型是 MX、HTTPS、SVCB 时必填，范围0-65535。</p><p>取值范围：[0, 65535]</p>
    */
    @SerializedName("MX")
    @Expose
    private Long MX;

    /**
    * <p>TTL，范围1-604800，不同套餐域名最小值不同。</p>
    */
    @SerializedName("TTL")
    @Expose
    private Long TTL;

    /**
    * <p>权重信息，0到100的整数。0 表示关闭，不传该参数，表示不设置权重信息。</p>
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * <p>记录初始状态，取值范围为 ENABLE 和 DISABLE 。默认为 ENABLE ，如果传入 DISABLE，解析不会生效，也不会验证负载均衡的限制。</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>备注</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>开启DNSSEC时，强制添加CNAME/URL记录</p>
    */
    @SerializedName("DnssecConflictMode")
    @Expose
    private String DnssecConflictMode;

    /**
    * <p>记录分组 Id。可以通过接口 DescribeRecordGroupList 接口 GroupId 字段获取。</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/1427/83225">DescribeRecordGroupList</a></p>
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
     * Get <p>域名</p> 
     * @return Domain <p>域名</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>域名</p>
     * @param Domain <p>域名</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>记录类型，可通过接口DescribeRecordType获得，大写英文，比如：A 。</p> 
     * @return RecordType <p>记录类型，可通过接口DescribeRecordType获得，大写英文，比如：A 。</p>
     */
    public String getRecordType() {
        return this.RecordType;
    }

    /**
     * Set <p>记录类型，可通过接口DescribeRecordType获得，大写英文，比如：A 。</p>
     * @param RecordType <p>记录类型，可通过接口DescribeRecordType获得，大写英文，比如：A 。</p>
     */
    public void setRecordType(String RecordType) {
        this.RecordType = RecordType;
    }

    /**
     * Get <p>记录线路，可以通过接口DescribeRecordLineList查看当前域名允许的线路信息，中文，比如：默认。</p> 
     * @return RecordLine <p>记录线路，可以通过接口DescribeRecordLineList查看当前域名允许的线路信息，中文，比如：默认。</p>
     */
    public String getRecordLine() {
        return this.RecordLine;
    }

    /**
     * Set <p>记录线路，可以通过接口DescribeRecordLineList查看当前域名允许的线路信息，中文，比如：默认。</p>
     * @param RecordLine <p>记录线路，可以通过接口DescribeRecordLineList查看当前域名允许的线路信息，中文，比如：默认。</p>
     */
    public void setRecordLine(String RecordLine) {
        this.RecordLine = RecordLine;
    }

    /**
     * Get <p>记录值，如 IP : 200.200.200.200， CNAME : cname.dnspod.com.， MX : mail.dnspod.com.。</p> 
     * @return Value <p>记录值，如 IP : 200.200.200.200， CNAME : cname.dnspod.com.， MX : mail.dnspod.com.。</p>
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set <p>记录值，如 IP : 200.200.200.200， CNAME : cname.dnspod.com.， MX : mail.dnspod.com.。</p>
     * @param Value <p>记录值，如 IP : 200.200.200.200， CNAME : cname.dnspod.com.， MX : mail.dnspod.com.。</p>
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get <p>域名 ID 。参数 DomainId 优先级比参数 Domain 高，如果传递参数 DomainId 将忽略参数 Domain 。</p> 
     * @return DomainId <p>域名 ID 。参数 DomainId 优先级比参数 Domain 高，如果传递参数 DomainId 将忽略参数 Domain 。</p>
     */
    public Long getDomainId() {
        return this.DomainId;
    }

    /**
     * Set <p>域名 ID 。参数 DomainId 优先级比参数 Domain 高，如果传递参数 DomainId 将忽略参数 Domain 。</p>
     * @param DomainId <p>域名 ID 。参数 DomainId 优先级比参数 Domain 高，如果传递参数 DomainId 将忽略参数 Domain 。</p>
     */
    public void setDomainId(Long DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get <p>主机记录，如 www，如果不传，默认为 @。</p> 
     * @return SubDomain <p>主机记录，如 www，如果不传，默认为 @。</p>
     */
    public String getSubDomain() {
        return this.SubDomain;
    }

    /**
     * Set <p>主机记录，如 www，如果不传，默认为 @。</p>
     * @param SubDomain <p>主机记录，如 www，如果不传，默认为 @。</p>
     */
    public void setSubDomain(String SubDomain) {
        this.SubDomain = SubDomain;
    }

    /**
     * Get <p>线路的 ID，可以通过接口DescribeRecordLineList查看当前域名允许的线路信息，英文字符串，比如：10=1。参数RecordLineId优先级高于RecordLine，如果同时传递二者，优先使用RecordLineId参数。</p> 
     * @return RecordLineId <p>线路的 ID，可以通过接口DescribeRecordLineList查看当前域名允许的线路信息，英文字符串，比如：10=1。参数RecordLineId优先级高于RecordLine，如果同时传递二者，优先使用RecordLineId参数。</p>
     */
    public String getRecordLineId() {
        return this.RecordLineId;
    }

    /**
     * Set <p>线路的 ID，可以通过接口DescribeRecordLineList查看当前域名允许的线路信息，英文字符串，比如：10=1。参数RecordLineId优先级高于RecordLine，如果同时传递二者，优先使用RecordLineId参数。</p>
     * @param RecordLineId <p>线路的 ID，可以通过接口DescribeRecordLineList查看当前域名允许的线路信息，英文字符串，比如：10=1。参数RecordLineId优先级高于RecordLine，如果同时传递二者，优先使用RecordLineId参数。</p>
     */
    public void setRecordLineId(String RecordLineId) {
        this.RecordLineId = RecordLineId;
    }

    /**
     * Get <p>MX 优先级，当记录类型是 MX、HTTPS、SVCB 时必填，范围0-65535。</p><p>取值范围：[0, 65535]</p> 
     * @return MX <p>MX 优先级，当记录类型是 MX、HTTPS、SVCB 时必填，范围0-65535。</p><p>取值范围：[0, 65535]</p>
     */
    public Long getMX() {
        return this.MX;
    }

    /**
     * Set <p>MX 优先级，当记录类型是 MX、HTTPS、SVCB 时必填，范围0-65535。</p><p>取值范围：[0, 65535]</p>
     * @param MX <p>MX 优先级，当记录类型是 MX、HTTPS、SVCB 时必填，范围0-65535。</p><p>取值范围：[0, 65535]</p>
     */
    public void setMX(Long MX) {
        this.MX = MX;
    }

    /**
     * Get <p>TTL，范围1-604800，不同套餐域名最小值不同。</p> 
     * @return TTL <p>TTL，范围1-604800，不同套餐域名最小值不同。</p>
     */
    public Long getTTL() {
        return this.TTL;
    }

    /**
     * Set <p>TTL，范围1-604800，不同套餐域名最小值不同。</p>
     * @param TTL <p>TTL，范围1-604800，不同套餐域名最小值不同。</p>
     */
    public void setTTL(Long TTL) {
        this.TTL = TTL;
    }

    /**
     * Get <p>权重信息，0到100的整数。0 表示关闭，不传该参数，表示不设置权重信息。</p> 
     * @return Weight <p>权重信息，0到100的整数。0 表示关闭，不传该参数，表示不设置权重信息。</p>
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set <p>权重信息，0到100的整数。0 表示关闭，不传该参数，表示不设置权重信息。</p>
     * @param Weight <p>权重信息，0到100的整数。0 表示关闭，不传该参数，表示不设置权重信息。</p>
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get <p>记录初始状态，取值范围为 ENABLE 和 DISABLE 。默认为 ENABLE ，如果传入 DISABLE，解析不会生效，也不会验证负载均衡的限制。</p> 
     * @return Status <p>记录初始状态，取值范围为 ENABLE 和 DISABLE 。默认为 ENABLE ，如果传入 DISABLE，解析不会生效，也不会验证负载均衡的限制。</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>记录初始状态，取值范围为 ENABLE 和 DISABLE 。默认为 ENABLE ，如果传入 DISABLE，解析不会生效，也不会验证负载均衡的限制。</p>
     * @param Status <p>记录初始状态，取值范围为 ENABLE 和 DISABLE 。默认为 ENABLE ，如果传入 DISABLE，解析不会生效，也不会验证负载均衡的限制。</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>备注</p> 
     * @return Remark <p>备注</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>备注</p>
     * @param Remark <p>备注</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>开启DNSSEC时，强制添加CNAME/URL记录</p> 
     * @return DnssecConflictMode <p>开启DNSSEC时，强制添加CNAME/URL记录</p>
     */
    public String getDnssecConflictMode() {
        return this.DnssecConflictMode;
    }

    /**
     * Set <p>开启DNSSEC时，强制添加CNAME/URL记录</p>
     * @param DnssecConflictMode <p>开启DNSSEC时，强制添加CNAME/URL记录</p>
     */
    public void setDnssecConflictMode(String DnssecConflictMode) {
        this.DnssecConflictMode = DnssecConflictMode;
    }

    /**
     * Get <p>记录分组 Id。可以通过接口 DescribeRecordGroupList 接口 GroupId 字段获取。</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/1427/83225">DescribeRecordGroupList</a></p> 
     * @return GroupId <p>记录分组 Id。可以通过接口 DescribeRecordGroupList 接口 GroupId 字段获取。</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/1427/83225">DescribeRecordGroupList</a></p>
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>记录分组 Id。可以通过接口 DescribeRecordGroupList 接口 GroupId 字段获取。</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/1427/83225">DescribeRecordGroupList</a></p>
     * @param GroupId <p>记录分组 Id。可以通过接口 DescribeRecordGroupList 接口 GroupId 字段获取。</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/1427/83225">DescribeRecordGroupList</a></p>
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    public CreateRecordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRecordRequest(CreateRecordRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.RecordType != null) {
            this.RecordType = new String(source.RecordType);
        }
        if (source.RecordLine != null) {
            this.RecordLine = new String(source.RecordLine);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.DomainId != null) {
            this.DomainId = new Long(source.DomainId);
        }
        if (source.SubDomain != null) {
            this.SubDomain = new String(source.SubDomain);
        }
        if (source.RecordLineId != null) {
            this.RecordLineId = new String(source.RecordLineId);
        }
        if (source.MX != null) {
            this.MX = new Long(source.MX);
        }
        if (source.TTL != null) {
            this.TTL = new Long(source.TTL);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.DnssecConflictMode != null) {
            this.DnssecConflictMode = new String(source.DnssecConflictMode);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "RecordType", this.RecordType);
        this.setParamSimple(map, prefix + "RecordLine", this.RecordLine);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "SubDomain", this.SubDomain);
        this.setParamSimple(map, prefix + "RecordLineId", this.RecordLineId);
        this.setParamSimple(map, prefix + "MX", this.MX);
        this.setParamSimple(map, prefix + "TTL", this.TTL);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "DnssecConflictMode", this.DnssecConflictMode);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);

    }
}

