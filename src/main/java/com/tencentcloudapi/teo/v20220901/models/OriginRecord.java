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

public class OriginRecord extends AbstractModel {

    /**
    * 源站记录值，不包含端口信息，可以为：IPv4，IPv6，域名格式。
    */
    @SerializedName("Record")
    @Expose
    private String Record;

    /**
    * 源站类型，取值有：
<li>IP_DOMAIN：IPV4、IPV6、域名类型源站；</li>
<li>COS：COS源。</li>
<li>AWS_S3：AWS S3对象存储源站。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 源站记录ID。
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * 【源站权重】：用于控制流量分配优先级的参数，取值范围：0-100（整数）：<li>空值：不设置权重，系统按默认策略调度；</li><li>0 值：明确设置权重为0，流量将不会分配到该源站，注意事项：必须确保至少有一个源站的权重值大于0；</li><li>正常值：数值越大分配流量越多 ；</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * 是否私有鉴权，当源站类型 RecordType=COS/AWS_S3 时生效，取值有：
<li>true：使用私有鉴权；</li>
<li>false：不使用私有鉴权。</li>不填写，默认值为：false。

    */
    @SerializedName("Private")
    @Expose
    private Boolean Private;

    /**
    * 私有鉴权参数，当源站类型Private=true时有效。
    */
    @SerializedName("PrivateParameters")
    @Expose
    private PrivateParameter [] PrivateParameters;

    /**
     * Get 源站记录值，不包含端口信息，可以为：IPv4，IPv6，域名格式。 
     * @return Record 源站记录值，不包含端口信息，可以为：IPv4，IPv6，域名格式。
     */
    public String getRecord() {
        return this.Record;
    }

    /**
     * Set 源站记录值，不包含端口信息，可以为：IPv4，IPv6，域名格式。
     * @param Record 源站记录值，不包含端口信息，可以为：IPv4，IPv6，域名格式。
     */
    public void setRecord(String Record) {
        this.Record = Record;
    }

    /**
     * Get 源站类型，取值有：
<li>IP_DOMAIN：IPV4、IPV6、域名类型源站；</li>
<li>COS：COS源。</li>
<li>AWS_S3：AWS S3对象存储源站。</li> 
     * @return Type 源站类型，取值有：
<li>IP_DOMAIN：IPV4、IPV6、域名类型源站；</li>
<li>COS：COS源。</li>
<li>AWS_S3：AWS S3对象存储源站。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 源站类型，取值有：
<li>IP_DOMAIN：IPV4、IPV6、域名类型源站；</li>
<li>COS：COS源。</li>
<li>AWS_S3：AWS S3对象存储源站。</li>
     * @param Type 源站类型，取值有：
<li>IP_DOMAIN：IPV4、IPV6、域名类型源站；</li>
<li>COS：COS源。</li>
<li>AWS_S3：AWS S3对象存储源站。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 源站记录ID。 
     * @return RecordId 源站记录ID。
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set 源站记录ID。
     * @param RecordId 源站记录ID。
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get 【源站权重】：用于控制流量分配优先级的参数，取值范围：0-100（整数）：<li>空值：不设置权重，系统按默认策略调度；</li><li>0 值：明确设置权重为0，流量将不会分配到该源站，注意事项：必须确保至少有一个源站的权重值大于0；</li><li>正常值：数值越大分配流量越多 ；</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Weight 【源站权重】：用于控制流量分配优先级的参数，取值范围：0-100（整数）：<li>空值：不设置权重，系统按默认策略调度；</li><li>0 值：明确设置权重为0，流量将不会分配到该源站，注意事项：必须确保至少有一个源站的权重值大于0；</li><li>正常值：数值越大分配流量越多 ；</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set 【源站权重】：用于控制流量分配优先级的参数，取值范围：0-100（整数）：<li>空值：不设置权重，系统按默认策略调度；</li><li>0 值：明确设置权重为0，流量将不会分配到该源站，注意事项：必须确保至少有一个源站的权重值大于0；</li><li>正常值：数值越大分配流量越多 ；</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Weight 【源站权重】：用于控制流量分配优先级的参数，取值范围：0-100（整数）：<li>空值：不设置权重，系统按默认策略调度；</li><li>0 值：明确设置权重为0，流量将不会分配到该源站，注意事项：必须确保至少有一个源站的权重值大于0；</li><li>正常值：数值越大分配流量越多 ；</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get 是否私有鉴权，当源站类型 RecordType=COS/AWS_S3 时生效，取值有：
<li>true：使用私有鉴权；</li>
<li>false：不使用私有鉴权。</li>不填写，默认值为：false。
 
     * @return Private 是否私有鉴权，当源站类型 RecordType=COS/AWS_S3 时生效，取值有：
<li>true：使用私有鉴权；</li>
<li>false：不使用私有鉴权。</li>不填写，默认值为：false。

     */
    public Boolean getPrivate() {
        return this.Private;
    }

    /**
     * Set 是否私有鉴权，当源站类型 RecordType=COS/AWS_S3 时生效，取值有：
<li>true：使用私有鉴权；</li>
<li>false：不使用私有鉴权。</li>不填写，默认值为：false。

     * @param Private 是否私有鉴权，当源站类型 RecordType=COS/AWS_S3 时生效，取值有：
<li>true：使用私有鉴权；</li>
<li>false：不使用私有鉴权。</li>不填写，默认值为：false。

     */
    public void setPrivate(Boolean Private) {
        this.Private = Private;
    }

    /**
     * Get 私有鉴权参数，当源站类型Private=true时有效。 
     * @return PrivateParameters 私有鉴权参数，当源站类型Private=true时有效。
     */
    public PrivateParameter [] getPrivateParameters() {
        return this.PrivateParameters;
    }

    /**
     * Set 私有鉴权参数，当源站类型Private=true时有效。
     * @param PrivateParameters 私有鉴权参数，当源站类型Private=true时有效。
     */
    public void setPrivateParameters(PrivateParameter [] PrivateParameters) {
        this.PrivateParameters = PrivateParameters;
    }

    public OriginRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OriginRecord(OriginRecord source) {
        if (source.Record != null) {
            this.Record = new String(source.Record);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.Private != null) {
            this.Private = new Boolean(source.Private);
        }
        if (source.PrivateParameters != null) {
            this.PrivateParameters = new PrivateParameter[source.PrivateParameters.length];
            for (int i = 0; i < source.PrivateParameters.length; i++) {
                this.PrivateParameters[i] = new PrivateParameter(source.PrivateParameters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Record", this.Record);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "Private", this.Private);
        this.setParamArrayObj(map, prefix + "PrivateParameters.", this.PrivateParameters);

    }
}

