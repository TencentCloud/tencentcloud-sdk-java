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

public class ModifyTraceCodeUnlinkResponse extends AbstractModel{

    /**
    * 成功解绑溯源码的数量
    */
    @SerializedName("UnlinkCnt")
    @Expose
    private Long UnlinkCnt;

    /**
    * 当前批次的码数量
    */
    @SerializedName("CodeCnt")
    @Expose
    private Long CodeCnt;

    /**
    * 批次ID
    */
    @SerializedName("BatchId")
    @Expose
    private String BatchId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 成功解绑溯源码的数量 
     * @return UnlinkCnt 成功解绑溯源码的数量
     */
    public Long getUnlinkCnt() {
        return this.UnlinkCnt;
    }

    /**
     * Set 成功解绑溯源码的数量
     * @param UnlinkCnt 成功解绑溯源码的数量
     */
    public void setUnlinkCnt(Long UnlinkCnt) {
        this.UnlinkCnt = UnlinkCnt;
    }

    /**
     * Get 当前批次的码数量 
     * @return CodeCnt 当前批次的码数量
     */
    public Long getCodeCnt() {
        return this.CodeCnt;
    }

    /**
     * Set 当前批次的码数量
     * @param CodeCnt 当前批次的码数量
     */
    public void setCodeCnt(Long CodeCnt) {
        this.CodeCnt = CodeCnt;
    }

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

    public ModifyTraceCodeUnlinkResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTraceCodeUnlinkResponse(ModifyTraceCodeUnlinkResponse source) {
        if (source.UnlinkCnt != null) {
            this.UnlinkCnt = new Long(source.UnlinkCnt);
        }
        if (source.CodeCnt != null) {
            this.CodeCnt = new Long(source.CodeCnt);
        }
        if (source.BatchId != null) {
            this.BatchId = new String(source.BatchId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UnlinkCnt", this.UnlinkCnt);
        this.setParamSimple(map, prefix + "CodeCnt", this.CodeCnt);
        this.setParamSimple(map, prefix + "BatchId", this.BatchId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

