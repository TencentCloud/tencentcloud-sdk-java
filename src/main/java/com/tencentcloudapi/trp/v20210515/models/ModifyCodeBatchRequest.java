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

public class ModifyCodeBatchRequest extends AbstractModel{

    /**
    * 批次ID
    */
    @SerializedName("BatchId")
    @Expose
    private String BatchId;

    /**
    * 企业ID
    */
    @SerializedName("CorpId")
    @Expose
    private Long CorpId;

    /**
    * 状态 0: 未激活 1: 已激活 -1: 已冻结
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 模板ID
    */
    @SerializedName("MpTpl")
    @Expose
    private String MpTpl;

    /**
     * Get 批次ID 
     * @return BatchId 批次ID
     */
    public String getBatchId() {
        return this.BatchId;
    }

    /**
     * Set 批次ID
     * @param BatchId 批次ID
     */
    public void setBatchId(String BatchId) {
        this.BatchId = BatchId;
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
     * Get 状态 0: 未激活 1: 已激活 -1: 已冻结 
     * @return Status 状态 0: 未激活 1: 已激活 -1: 已冻结
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态 0: 未激活 1: 已激活 -1: 已冻结
     * @param Status 状态 0: 未激活 1: 已激活 -1: 已冻结
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 模板ID 
     * @return MpTpl 模板ID
     */
    public String getMpTpl() {
        return this.MpTpl;
    }

    /**
     * Set 模板ID
     * @param MpTpl 模板ID
     */
    public void setMpTpl(String MpTpl) {
        this.MpTpl = MpTpl;
    }

    public ModifyCodeBatchRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCodeBatchRequest(ModifyCodeBatchRequest source) {
        if (source.BatchId != null) {
            this.BatchId = new String(source.BatchId);
        }
        if (source.CorpId != null) {
            this.CorpId = new Long(source.CorpId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.MpTpl != null) {
            this.MpTpl = new String(source.MpTpl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BatchId", this.BatchId);
        this.setParamSimple(map, prefix + "CorpId", this.CorpId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "MpTpl", this.MpTpl);

    }
}

