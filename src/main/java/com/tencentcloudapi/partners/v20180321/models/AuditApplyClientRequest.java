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
package com.tencentcloudapi.partners.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuditApplyClientRequest extends AbstractModel{

    /**
    * 待审核客户账号ID
    */
    @SerializedName("ClientUin")
    @Expose
    private String ClientUin;

    /**
    * 审核结果，可能的取值：accept/reject
    */
    @SerializedName("AuditResult")
    @Expose
    private String AuditResult;

    /**
    * 申请理由，B类客户审核通过时必须填写申请理由
    */
    @SerializedName("Note")
    @Expose
    private String Note;

    /**
     * Get 待审核客户账号ID 
     * @return ClientUin 待审核客户账号ID
     */
    public String getClientUin() {
        return this.ClientUin;
    }

    /**
     * Set 待审核客户账号ID
     * @param ClientUin 待审核客户账号ID
     */
    public void setClientUin(String ClientUin) {
        this.ClientUin = ClientUin;
    }

    /**
     * Get 审核结果，可能的取值：accept/reject 
     * @return AuditResult 审核结果，可能的取值：accept/reject
     */
    public String getAuditResult() {
        return this.AuditResult;
    }

    /**
     * Set 审核结果，可能的取值：accept/reject
     * @param AuditResult 审核结果，可能的取值：accept/reject
     */
    public void setAuditResult(String AuditResult) {
        this.AuditResult = AuditResult;
    }

    /**
     * Get 申请理由，B类客户审核通过时必须填写申请理由 
     * @return Note 申请理由，B类客户审核通过时必须填写申请理由
     */
    public String getNote() {
        return this.Note;
    }

    /**
     * Set 申请理由，B类客户审核通过时必须填写申请理由
     * @param Note 申请理由，B类客户审核通过时必须填写申请理由
     */
    public void setNote(String Note) {
        this.Note = Note;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientUin", this.ClientUin);
        this.setParamSimple(map, prefix + "AuditResult", this.AuditResult);
        this.setParamSimple(map, prefix + "Note", this.Note);

    }
}

