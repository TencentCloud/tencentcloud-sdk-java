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

public class CreateTraceCodesResponse extends AbstractModel{

    /**
    * 批次ID
    */
    @SerializedName("BatchId")
    @Expose
    private String BatchId;

    /**
    * 导入成功码数量
    */
    @SerializedName("ActiveCnt")
    @Expose
    private Long ActiveCnt;

    /**
    * 批次码数量
    */
    @SerializedName("CodeCnt")
    @Expose
    private Long CodeCnt;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

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
     * Get 导入成功码数量 
     * @return ActiveCnt 导入成功码数量
     */
    public Long getActiveCnt() {
        return this.ActiveCnt;
    }

    /**
     * Set 导入成功码数量
     * @param ActiveCnt 导入成功码数量
     */
    public void setActiveCnt(Long ActiveCnt) {
        this.ActiveCnt = ActiveCnt;
    }

    /**
     * Get 批次码数量 
     * @return CodeCnt 批次码数量
     */
    public Long getCodeCnt() {
        return this.CodeCnt;
    }

    /**
     * Set 批次码数量
     * @param CodeCnt 批次码数量
     */
    public void setCodeCnt(Long CodeCnt) {
        this.CodeCnt = CodeCnt;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public CreateTraceCodesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTraceCodesResponse(CreateTraceCodesResponse source) {
        if (source.BatchId != null) {
            this.BatchId = new String(source.BatchId);
        }
        if (source.ActiveCnt != null) {
            this.ActiveCnt = new Long(source.ActiveCnt);
        }
        if (source.CodeCnt != null) {
            this.CodeCnt = new Long(source.CodeCnt);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BatchId", this.BatchId);
        this.setParamSimple(map, prefix + "ActiveCnt", this.ActiveCnt);
        this.setParamSimple(map, prefix + "CodeCnt", this.CodeCnt);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

