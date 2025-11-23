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
package com.tencentcloudapi.privatedns.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecordsInfoStatus extends AbstractModel {

    /**
    * 记录类型，可选的记录类型为："A", "AAAA", "CNAME", "MX", "TXT", "PTR"
    */
    @SerializedName("RecordType")
    @Expose
    private String RecordType;

    /**
    * 子域名，例如 "www", "m", "@"
    */
    @SerializedName("SubDomain")
    @Expose
    private String SubDomain;

    /**
    * 记录值，例如 IP：192.168.10.2，CNAME：cname.qcloud.com.，MX：mail.qcloud.com.
    */
    @SerializedName("RecordValue")
    @Expose
    private String RecordValue;

    /**
    * 记录权重，值为1-100
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * 记录缓存时间，数值越小生效越快，取值1-86400s, 默认 600
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TTL")
    @Expose
    private Long TTL;

    /**
    * MX优先级：记录类型为MX时必填。取值范围：5,10,15,20,30,40,50
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MX")
    @Expose
    private Long MX;

    /**
    * 是否添加成功：0是失败，1是成功
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 若status为0，则此处为失败原因描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get 记录类型，可选的记录类型为："A", "AAAA", "CNAME", "MX", "TXT", "PTR" 
     * @return RecordType 记录类型，可选的记录类型为："A", "AAAA", "CNAME", "MX", "TXT", "PTR"
     */
    public String getRecordType() {
        return this.RecordType;
    }

    /**
     * Set 记录类型，可选的记录类型为："A", "AAAA", "CNAME", "MX", "TXT", "PTR"
     * @param RecordType 记录类型，可选的记录类型为："A", "AAAA", "CNAME", "MX", "TXT", "PTR"
     */
    public void setRecordType(String RecordType) {
        this.RecordType = RecordType;
    }

    /**
     * Get 子域名，例如 "www", "m", "@" 
     * @return SubDomain 子域名，例如 "www", "m", "@"
     */
    public String getSubDomain() {
        return this.SubDomain;
    }

    /**
     * Set 子域名，例如 "www", "m", "@"
     * @param SubDomain 子域名，例如 "www", "m", "@"
     */
    public void setSubDomain(String SubDomain) {
        this.SubDomain = SubDomain;
    }

    /**
     * Get 记录值，例如 IP：192.168.10.2，CNAME：cname.qcloud.com.，MX：mail.qcloud.com. 
     * @return RecordValue 记录值，例如 IP：192.168.10.2，CNAME：cname.qcloud.com.，MX：mail.qcloud.com.
     */
    public String getRecordValue() {
        return this.RecordValue;
    }

    /**
     * Set 记录值，例如 IP：192.168.10.2，CNAME：cname.qcloud.com.，MX：mail.qcloud.com.
     * @param RecordValue 记录值，例如 IP：192.168.10.2，CNAME：cname.qcloud.com.，MX：mail.qcloud.com.
     */
    public void setRecordValue(String RecordValue) {
        this.RecordValue = RecordValue;
    }

    /**
     * Get 记录权重，值为1-100
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Weight 记录权重，值为1-100
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set 记录权重，值为1-100
注意：此字段可能返回 null，表示取不到有效值。
     * @param Weight 记录权重，值为1-100
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get 记录缓存时间，数值越小生效越快，取值1-86400s, 默认 600
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TTL 记录缓存时间，数值越小生效越快，取值1-86400s, 默认 600
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTTL() {
        return this.TTL;
    }

    /**
     * Set 记录缓存时间，数值越小生效越快，取值1-86400s, 默认 600
注意：此字段可能返回 null，表示取不到有效值。
     * @param TTL 记录缓存时间，数值越小生效越快，取值1-86400s, 默认 600
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTTL(Long TTL) {
        this.TTL = TTL;
    }

    /**
     * Get MX优先级：记录类型为MX时必填。取值范围：5,10,15,20,30,40,50
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MX MX优先级：记录类型为MX时必填。取值范围：5,10,15,20,30,40,50
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMX() {
        return this.MX;
    }

    /**
     * Set MX优先级：记录类型为MX时必填。取值范围：5,10,15,20,30,40,50
注意：此字段可能返回 null，表示取不到有效值。
     * @param MX MX优先级：记录类型为MX时必填。取值范围：5,10,15,20,30,40,50
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMX(Long MX) {
        this.MX = MX;
    }

    /**
     * Get 是否添加成功：0是失败，1是成功
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 是否添加成功：0是失败，1是成功
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 是否添加成功：0是失败，1是成功
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 是否添加成功：0是失败，1是成功
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 若status为0，则此处为失败原因描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Message 若status为0，则此处为失败原因描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 若status为0，则此处为失败原因描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Message 若status为0，则此处为失败原因描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public RecordsInfoStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecordsInfoStatus(RecordsInfoStatus source) {
        if (source.RecordType != null) {
            this.RecordType = new String(source.RecordType);
        }
        if (source.SubDomain != null) {
            this.SubDomain = new String(source.SubDomain);
        }
        if (source.RecordValue != null) {
            this.RecordValue = new String(source.RecordValue);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.TTL != null) {
            this.TTL = new Long(source.TTL);
        }
        if (source.MX != null) {
            this.MX = new Long(source.MX);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RecordType", this.RecordType);
        this.setParamSimple(map, prefix + "SubDomain", this.SubDomain);
        this.setParamSimple(map, prefix + "RecordValue", this.RecordValue);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "TTL", this.TTL);
        this.setParamSimple(map, prefix + "MX", this.MX);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

