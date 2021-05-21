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

public class CreateDomainBatchRecord extends AbstractModel{

    /**
    * 子域名(主机记录)。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubDomain")
    @Expose
    private String SubDomain;

    /**
    * 记录类型, 详见 DescribeRecordType 接口
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecordType")
    @Expose
    private String RecordType;

    /**
    * 解析记录的线路，详见 DescribeRecordLineList 接口
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecordLine")
    @Expose
    private String RecordLine;

    /**
    * 记录值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 记录的 TTL 值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TTL")
    @Expose
    private Long TTL;

    /**
    * 记录添加状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 操作类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 错误信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
    * 此条记录在列表中的ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
     * Get 子域名(主机记录)。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubDomain 子域名(主机记录)。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubDomain() {
        return this.SubDomain;
    }

    /**
     * Set 子域名(主机记录)。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubDomain 子域名(主机记录)。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubDomain(String SubDomain) {
        this.SubDomain = SubDomain;
    }

    /**
     * Get 记录类型, 详见 DescribeRecordType 接口
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecordType 记录类型, 详见 DescribeRecordType 接口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRecordType() {
        return this.RecordType;
    }

    /**
     * Set 记录类型, 详见 DescribeRecordType 接口
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecordType 记录类型, 详见 DescribeRecordType 接口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecordType(String RecordType) {
        this.RecordType = RecordType;
    }

    /**
     * Get 解析记录的线路，详见 DescribeRecordLineList 接口
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecordLine 解析记录的线路，详见 DescribeRecordLineList 接口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRecordLine() {
        return this.RecordLine;
    }

    /**
     * Set 解析记录的线路，详见 DescribeRecordLineList 接口
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecordLine 解析记录的线路，详见 DescribeRecordLineList 接口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecordLine(String RecordLine) {
        this.RecordLine = RecordLine;
    }

    /**
     * Get 记录值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Value 记录值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 记录值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Value 记录值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 记录的 TTL 值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TTL 记录的 TTL 值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTTL() {
        return this.TTL;
    }

    /**
     * Set 记录的 TTL 值
注意：此字段可能返回 null，表示取不到有效值。
     * @param TTL 记录的 TTL 值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTTL(Long TTL) {
        this.TTL = TTL;
    }

    /**
     * Get 记录添加状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 记录添加状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 记录添加状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 记录添加状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 操作类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Operation 操作类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 操作类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Operation 操作类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 错误信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrMsg 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrMsg 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    /**
     * Get 此条记录在列表中的ID 
     * @return Id 此条记录在列表中的ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 此条记录在列表中的ID
     * @param Id 此条记录在列表中的ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    public CreateDomainBatchRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDomainBatchRecord(CreateDomainBatchRecord source) {
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
            this.TTL = new Long(source.TTL);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.ErrMsg != null) {
            this.ErrMsg = new String(source.ErrMsg);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
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
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

