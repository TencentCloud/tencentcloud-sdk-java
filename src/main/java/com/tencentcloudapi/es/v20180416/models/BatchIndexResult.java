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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchIndexResult extends AbstractModel {

    /**
    * <p>索引名</p>
    */
    @SerializedName("IndexName")
    @Expose
    private String IndexName;

    /**
    * <p>该项是否成功</p>
    */
    @SerializedName("Success")
    @Expose
    private Boolean Success;

    /**
    * <p>失败时的错误码，成功时不返回</p>
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * <p>失败时的错误信息，成功时不返回</p>
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
     * Get <p>索引名</p> 
     * @return IndexName <p>索引名</p>
     */
    public String getIndexName() {
        return this.IndexName;
    }

    /**
     * Set <p>索引名</p>
     * @param IndexName <p>索引名</p>
     */
    public void setIndexName(String IndexName) {
        this.IndexName = IndexName;
    }

    /**
     * Get <p>该项是否成功</p> 
     * @return Success <p>该项是否成功</p>
     */
    public Boolean getSuccess() {
        return this.Success;
    }

    /**
     * Set <p>该项是否成功</p>
     * @param Success <p>该项是否成功</p>
     */
    public void setSuccess(Boolean Success) {
        this.Success = Success;
    }

    /**
     * Get <p>失败时的错误码，成功时不返回</p> 
     * @return ErrCode <p>失败时的错误码，成功时不返回</p>
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set <p>失败时的错误码，成功时不返回</p>
     * @param ErrCode <p>失败时的错误码，成功时不返回</p>
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get <p>失败时的错误信息，成功时不返回</p> 
     * @return ErrMsg <p>失败时的错误信息，成功时不返回</p>
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set <p>失败时的错误信息，成功时不返回</p>
     * @param ErrMsg <p>失败时的错误信息，成功时不返回</p>
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    public BatchIndexResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchIndexResult(BatchIndexResult source) {
        if (source.IndexName != null) {
            this.IndexName = new String(source.IndexName);
        }
        if (source.Success != null) {
            this.Success = new Boolean(source.Success);
        }
        if (source.ErrCode != null) {
            this.ErrCode = new Long(source.ErrCode);
        }
        if (source.ErrMsg != null) {
            this.ErrMsg = new String(source.ErrMsg);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IndexName", this.IndexName);
        this.setParamSimple(map, prefix + "Success", this.Success);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);

    }
}

