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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VoicePrintBatchDeleteResult extends AbstractModel {

    /**
    * <p>本项对应的声纹 ID。成功项与失败项均会返回。<br>示例值：59d83c76-8f4e-4a1b-9c2d-0e7f8a6b5c4d</p>
    */
    @SerializedName("VoicePrintId")
    @Expose
    private String VoicePrintId;

    /**
    * <p>本项失败时的错误码，成功项为空。常见值：FailedOperation.VoicePrintNotFound（声纹不存在或已删除）、InvalidParameterValue.InvalidVoicePrintId（ID 格式非法）。<br>示例值：FailedOperation.VoicePrintNotFound</p>
    */
    @SerializedName("ErrorCode")
    @Expose
    private String ErrorCode;

    /**
    * <p>本项失败时的错误描述，成功项为空。<br>示例值：voiceprint not found</p>
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
     * Get <p>本项对应的声纹 ID。成功项与失败项均会返回。<br>示例值：59d83c76-8f4e-4a1b-9c2d-0e7f8a6b5c4d</p> 
     * @return VoicePrintId <p>本项对应的声纹 ID。成功项与失败项均会返回。<br>示例值：59d83c76-8f4e-4a1b-9c2d-0e7f8a6b5c4d</p>
     */
    public String getVoicePrintId() {
        return this.VoicePrintId;
    }

    /**
     * Set <p>本项对应的声纹 ID。成功项与失败项均会返回。<br>示例值：59d83c76-8f4e-4a1b-9c2d-0e7f8a6b5c4d</p>
     * @param VoicePrintId <p>本项对应的声纹 ID。成功项与失败项均会返回。<br>示例值：59d83c76-8f4e-4a1b-9c2d-0e7f8a6b5c4d</p>
     */
    public void setVoicePrintId(String VoicePrintId) {
        this.VoicePrintId = VoicePrintId;
    }

    /**
     * Get <p>本项失败时的错误码，成功项为空。常见值：FailedOperation.VoicePrintNotFound（声纹不存在或已删除）、InvalidParameterValue.InvalidVoicePrintId（ID 格式非法）。<br>示例值：FailedOperation.VoicePrintNotFound</p> 
     * @return ErrorCode <p>本项失败时的错误码，成功项为空。常见值：FailedOperation.VoicePrintNotFound（声纹不存在或已删除）、InvalidParameterValue.InvalidVoicePrintId（ID 格式非法）。<br>示例值：FailedOperation.VoicePrintNotFound</p>
     */
    public String getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set <p>本项失败时的错误码，成功项为空。常见值：FailedOperation.VoicePrintNotFound（声纹不存在或已删除）、InvalidParameterValue.InvalidVoicePrintId（ID 格式非法）。<br>示例值：FailedOperation.VoicePrintNotFound</p>
     * @param ErrorCode <p>本项失败时的错误码，成功项为空。常见值：FailedOperation.VoicePrintNotFound（声纹不存在或已删除）、InvalidParameterValue.InvalidVoicePrintId（ID 格式非法）。<br>示例值：FailedOperation.VoicePrintNotFound</p>
     */
    public void setErrorCode(String ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get <p>本项失败时的错误描述，成功项为空。<br>示例值：voiceprint not found</p> 
     * @return ErrorMessage <p>本项失败时的错误描述，成功项为空。<br>示例值：voiceprint not found</p>
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set <p>本项失败时的错误描述，成功项为空。<br>示例值：voiceprint not found</p>
     * @param ErrorMessage <p>本项失败时的错误描述，成功项为空。<br>示例值：voiceprint not found</p>
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    public VoicePrintBatchDeleteResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VoicePrintBatchDeleteResult(VoicePrintBatchDeleteResult source) {
        if (source.VoicePrintId != null) {
            this.VoicePrintId = new String(source.VoicePrintId);
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
        this.setParamSimple(map, prefix + "VoicePrintId", this.VoicePrintId);
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);

    }
}

