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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterFwPreAccessCheckStage extends AbstractModel {

    /**
    * 检查项 key，与发起检查接口返回的 CheckItems[].Stage 一一对应
    */
    @SerializedName("Stage")
    @Expose
    private String Stage;

    /**
    * 该检查项状态，0：进行中，1：通过，2：失败
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 失败时的错误码（仅 Status=2 时有值）
    */
    @SerializedName("ErrorCode")
    @Expose
    private String ErrorCode;

    /**
    * 失败时的具体错误信息（仅 Status=2 时有值）
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
     * Get 检查项 key，与发起检查接口返回的 CheckItems[].Stage 一一对应 
     * @return Stage 检查项 key，与发起检查接口返回的 CheckItems[].Stage 一一对应
     */
    public String getStage() {
        return this.Stage;
    }

    /**
     * Set 检查项 key，与发起检查接口返回的 CheckItems[].Stage 一一对应
     * @param Stage 检查项 key，与发起检查接口返回的 CheckItems[].Stage 一一对应
     */
    public void setStage(String Stage) {
        this.Stage = Stage;
    }

    /**
     * Get 该检查项状态，0：进行中，1：通过，2：失败 
     * @return Status 该检查项状态，0：进行中，1：通过，2：失败
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 该检查项状态，0：进行中，1：通过，2：失败
     * @param Status 该检查项状态，0：进行中，1：通过，2：失败
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 失败时的错误码（仅 Status=2 时有值） 
     * @return ErrorCode 失败时的错误码（仅 Status=2 时有值）
     */
    public String getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set 失败时的错误码（仅 Status=2 时有值）
     * @param ErrorCode 失败时的错误码（仅 Status=2 时有值）
     */
    public void setErrorCode(String ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get 失败时的具体错误信息（仅 Status=2 时有值） 
     * @return ErrorMessage 失败时的具体错误信息（仅 Status=2 时有值）
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set 失败时的具体错误信息（仅 Status=2 时有值）
     * @param ErrorMessage 失败时的具体错误信息（仅 Status=2 时有值）
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    public ClusterFwPreAccessCheckStage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterFwPreAccessCheckStage(ClusterFwPreAccessCheckStage source) {
        if (source.Stage != null) {
            this.Stage = new String(source.Stage);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ErrorCode != null) {
            this.ErrorCode = new String(source.ErrorCode);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Stage", this.Stage);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);

    }
}

