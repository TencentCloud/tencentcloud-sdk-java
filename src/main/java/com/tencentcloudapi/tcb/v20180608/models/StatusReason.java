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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StatusReason extends AbstractModel {

    /**
    * <p>错误码</p>
    */
    @SerializedName("ErrorCode")
    @Expose
    private String ErrorCode;

    /**
    * <p>错误描述</p>
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
     * Get <p>错误码</p> 
     * @return ErrorCode <p>错误码</p>
     */
    public String getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set <p>错误码</p>
     * @param ErrorCode <p>错误码</p>
     */
    public void setErrorCode(String ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get <p>错误描述</p> 
     * @return ErrorMessage <p>错误描述</p>
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set <p>错误描述</p>
     * @param ErrorMessage <p>错误描述</p>
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    public StatusReason() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StatusReason(StatusReason source) {
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
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);

    }
}

