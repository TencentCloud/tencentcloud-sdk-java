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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SnapshotRecord extends AbstractModel{

    /**
    * 子域名
    */
    @SerializedName("SubDomain")
    @Expose
    private String SubDomain;

    /**
    * 记录类型
    */
    @SerializedName("RecordType")
    @Expose
    private String RecordType;

    /**
    * 解析线路
    */
    @SerializedName("RecordLine")
    @Expose
    private String RecordLine;

    /**
    * 解析值
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * TTL(秒)
    */
    @SerializedName("TTL")
    @Expose
    private String TTL;

    /**
    * 解析记录 ID
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * MX优先级
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MX")
    @Expose
    private String MX;

    /**
     * Get 子域名 
     * @return SubDomain 子域名
     */
    public String getSubDomain() {
        return this.SubDomain;
    }

    /**
     * Set 子域名
     * @param SubDomain 子域名
     */
    public void setSubDomain(String SubDomain) {
        this.SubDomain = SubDomain;
    }

    /**
     * Get 记录类型 
     * @return RecordType 记录类型
     */
    public String getRecordType() {
        return this.RecordType;
    }

    /**
     * Set 记录类型
     * @param RecordType 记录类型
     */
    public void setRecordType(String RecordType) {
        this.RecordType = RecordType;
    }

    /**
     * Get 解析线路 
     * @return RecordLine 解析线路
     */
    public String getRecordLine() {
        return this.RecordLine;
    }

    /**
     * Set 解析线路
     * @param RecordLine 解析线路
     */
    public void setRecordLine(String RecordLine) {
        this.RecordLine = RecordLine;
    }

    /**
     * Get 解析值 
     * @return Value 解析值
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 解析值
     * @param Value 解析值
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get TTL(秒) 
     * @return TTL TTL(秒)
     */
    public String getTTL() {
        return this.TTL;
    }

    /**
     * Set TTL(秒)
     * @param TTL TTL(秒)
     */
    public void setTTL(String TTL) {
        this.TTL = TTL;
    }

    /**
     * Get 解析记录 ID 
     * @return RecordId 解析记录 ID
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set 解析记录 ID
     * @param RecordId 解析记录 ID
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get MX优先级
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MX MX优先级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMX() {
        return this.MX;
    }

    /**
     * Set MX优先级
注意：此字段可能返回 null，表示取不到有效值。
     * @param MX MX优先级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMX(String MX) {
        this.MX = MX;
    }

    public SnapshotRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SnapshotRecord(SnapshotRecord source) {
        if (source.SubDomain != null) {
            this.SubDomain = new String(source.SubDomain);
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
        if (source.TTL != null) {
            this.TTL = new String(source.TTL);
        }
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.MX != null) {
            this.MX = new String(source.MX);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubDomain", this.SubDomain);
        this.setParamSimple(map, prefix + "RecordType", this.RecordType);
        this.setParamSimple(map, prefix + "RecordLine", this.RecordLine);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "TTL", this.TTL);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "MX", this.MX);

    }
}

