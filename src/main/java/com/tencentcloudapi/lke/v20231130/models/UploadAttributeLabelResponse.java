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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UploadAttributeLabelResponse extends AbstractModel {

    /**
    * 导入错误
    */
    @SerializedName("ErrorMsg")
    @Expose
    private String ErrorMsg;

    /**
    * 错误链接
    */
    @SerializedName("ErrorLink")
    @Expose
    private String ErrorLink;

    /**
    * 错误链接文本
    */
    @SerializedName("ErrorLinkText")
    @Expose
    private String ErrorLinkText;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 导入错误 
     * @return ErrorMsg 导入错误
     */
    public String getErrorMsg() {
        return this.ErrorMsg;
    }

    /**
     * Set 导入错误
     * @param ErrorMsg 导入错误
     */
    public void setErrorMsg(String ErrorMsg) {
        this.ErrorMsg = ErrorMsg;
    }

    /**
     * Get 错误链接 
     * @return ErrorLink 错误链接
     */
    public String getErrorLink() {
        return this.ErrorLink;
    }

    /**
     * Set 错误链接
     * @param ErrorLink 错误链接
     */
    public void setErrorLink(String ErrorLink) {
        this.ErrorLink = ErrorLink;
    }

    /**
     * Get 错误链接文本 
     * @return ErrorLinkText 错误链接文本
     */
    public String getErrorLinkText() {
        return this.ErrorLinkText;
    }

    /**
     * Set 错误链接文本
     * @param ErrorLinkText 错误链接文本
     */
    public void setErrorLinkText(String ErrorLinkText) {
        this.ErrorLinkText = ErrorLinkText;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public UploadAttributeLabelResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UploadAttributeLabelResponse(UploadAttributeLabelResponse source) {
        if (source.ErrorMsg != null) {
            this.ErrorMsg = new String(source.ErrorMsg);
        }
        if (source.ErrorLink != null) {
            this.ErrorLink = new String(source.ErrorLink);
        }
        if (source.ErrorLinkText != null) {
            this.ErrorLinkText = new String(source.ErrorLinkText);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ErrorMsg", this.ErrorMsg);
        this.setParamSimple(map, prefix + "ErrorLink", this.ErrorLink);
        this.setParamSimple(map, prefix + "ErrorLinkText", this.ErrorLinkText);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

