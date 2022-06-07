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
package com.tencentcloudapi.trp.v20210515.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyTraceCodeRequest extends AbstractModel{

    /**
    * 二维码
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * 企业ID
    */
    @SerializedName("CorpId")
    @Expose
    private Long CorpId;

    /**
    * 状态 0: 冻结 1: 激活
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 二维码 
     * @return Code 二维码
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 二维码
     * @param Code 二维码
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get 企业ID 
     * @return CorpId 企业ID
     */
    public Long getCorpId() {
        return this.CorpId;
    }

    /**
     * Set 企业ID
     * @param CorpId 企业ID
     */
    public void setCorpId(Long CorpId) {
        this.CorpId = CorpId;
    }

    /**
     * Get 状态 0: 冻结 1: 激活 
     * @return Status 状态 0: 冻结 1: 激活
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态 0: 冻结 1: 激活
     * @param Status 状态 0: 冻结 1: 激活
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public ModifyTraceCodeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTraceCodeRequest(ModifyTraceCodeRequest source) {
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.CorpId != null) {
            this.CorpId = new Long(source.CorpId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "CorpId", this.CorpId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

