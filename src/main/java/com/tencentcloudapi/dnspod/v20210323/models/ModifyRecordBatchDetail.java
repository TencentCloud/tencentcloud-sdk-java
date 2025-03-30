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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRecordBatchDetail extends AbstractModel {

    /**
    * 见RecordInfoBatchModify
    */
    @SerializedName("RecordList")
    @Expose
    private BatchRecordInfo [] RecordList;

    /**
    * 任务编号
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 域名等级
    */
    @SerializedName("DomainGrade")
    @Expose
    private String DomainGrade;

    /**
    * 错误信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
    * 该条任务运行状态
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
    * 域名ID
    */
    @SerializedName("DomainId")
    @Expose
    private Long DomainId;

    /**
     * Get 见RecordInfoBatchModify 
     * @return RecordList 见RecordInfoBatchModify
     */
    public BatchRecordInfo [] getRecordList() {
        return this.RecordList;
    }

    /**
     * Set 见RecordInfoBatchModify
     * @param RecordList 见RecordInfoBatchModify
     */
    public void setRecordList(BatchRecordInfo [] RecordList) {
        this.RecordList = RecordList;
    }

    /**
     * Get 任务编号 
     * @return Id 任务编号
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 任务编号
     * @param Id 任务编号
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 域名等级 
     * @return DomainGrade 域名等级
     */
    public String getDomainGrade() {
        return this.DomainGrade;
    }

    /**
     * Set 域名等级
     * @param DomainGrade 域名等级
     */
    public void setDomainGrade(String DomainGrade) {
        this.DomainGrade = DomainGrade;
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
     * Get 该条任务运行状态 
     * @return Status 该条任务运行状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 该条任务运行状态
     * @param Status 该条任务运行状态
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
     * Get 域名ID 
     * @return DomainId 域名ID
     */
    public Long getDomainId() {
        return this.DomainId;
    }

    /**
     * Set 域名ID
     * @param DomainId 域名ID
     */
    public void setDomainId(Long DomainId) {
        this.DomainId = DomainId;
    }

    public ModifyRecordBatchDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRecordBatchDetail(ModifyRecordBatchDetail source) {
        if (source.RecordList != null) {
            this.RecordList = new BatchRecordInfo[source.RecordList.length];
            for (int i = 0; i < source.RecordList.length; i++) {
                this.RecordList[i] = new BatchRecordInfo(source.RecordList[i]);
            }
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.DomainGrade != null) {
            this.DomainGrade = new String(source.DomainGrade);
        }
        if (source.ErrMsg != null) {
            this.ErrMsg = new String(source.ErrMsg);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.DomainId != null) {
            this.DomainId = new Long(source.DomainId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "RecordList.", this.RecordList);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "DomainGrade", this.DomainGrade);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);

    }
}

