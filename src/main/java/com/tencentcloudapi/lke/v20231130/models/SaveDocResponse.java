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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SaveDocResponse extends AbstractModel {

    /**
    * <p>文档ID</p>
    */
    @SerializedName("DocBizId")
    @Expose
    private String DocBizId;

    /**
    * <p>导入错误信息</p>
    */
    @SerializedName("ErrorMsg")
    @Expose
    private String ErrorMsg;

    /**
    * <p>错误链接</p>
    */
    @SerializedName("ErrorLink")
    @Expose
    private String ErrorLink;

    /**
    * <p>错误链接文本</p>
    */
    @SerializedName("ErrorLinkText")
    @Expose
    private String ErrorLinkText;

    /**
    * <p>重复类型，0：未重复，其他取值请参考入参DuplicateFileHandle结构体的CheckType字段</p>
    */
    @SerializedName("DuplicateFileCheckType")
    @Expose
    private Long DuplicateFileCheckType;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>文档ID</p> 
     * @return DocBizId <p>文档ID</p>
     */
    public String getDocBizId() {
        return this.DocBizId;
    }

    /**
     * Set <p>文档ID</p>
     * @param DocBizId <p>文档ID</p>
     */
    public void setDocBizId(String DocBizId) {
        this.DocBizId = DocBizId;
    }

    /**
     * Get <p>导入错误信息</p> 
     * @return ErrorMsg <p>导入错误信息</p>
     */
    public String getErrorMsg() {
        return this.ErrorMsg;
    }

    /**
     * Set <p>导入错误信息</p>
     * @param ErrorMsg <p>导入错误信息</p>
     */
    public void setErrorMsg(String ErrorMsg) {
        this.ErrorMsg = ErrorMsg;
    }

    /**
     * Get <p>错误链接</p> 
     * @return ErrorLink <p>错误链接</p>
     */
    public String getErrorLink() {
        return this.ErrorLink;
    }

    /**
     * Set <p>错误链接</p>
     * @param ErrorLink <p>错误链接</p>
     */
    public void setErrorLink(String ErrorLink) {
        this.ErrorLink = ErrorLink;
    }

    /**
     * Get <p>错误链接文本</p> 
     * @return ErrorLinkText <p>错误链接文本</p>
     */
    public String getErrorLinkText() {
        return this.ErrorLinkText;
    }

    /**
     * Set <p>错误链接文本</p>
     * @param ErrorLinkText <p>错误链接文本</p>
     */
    public void setErrorLinkText(String ErrorLinkText) {
        this.ErrorLinkText = ErrorLinkText;
    }

    /**
     * Get <p>重复类型，0：未重复，其他取值请参考入参DuplicateFileHandle结构体的CheckType字段</p> 
     * @return DuplicateFileCheckType <p>重复类型，0：未重复，其他取值请参考入参DuplicateFileHandle结构体的CheckType字段</p>
     */
    public Long getDuplicateFileCheckType() {
        return this.DuplicateFileCheckType;
    }

    /**
     * Set <p>重复类型，0：未重复，其他取值请参考入参DuplicateFileHandle结构体的CheckType字段</p>
     * @param DuplicateFileCheckType <p>重复类型，0：未重复，其他取值请参考入参DuplicateFileHandle结构体的CheckType字段</p>
     */
    public void setDuplicateFileCheckType(Long DuplicateFileCheckType) {
        this.DuplicateFileCheckType = DuplicateFileCheckType;
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

    public SaveDocResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SaveDocResponse(SaveDocResponse source) {
        if (source.DocBizId != null) {
            this.DocBizId = new String(source.DocBizId);
        }
        if (source.ErrorMsg != null) {
            this.ErrorMsg = new String(source.ErrorMsg);
        }
        if (source.ErrorLink != null) {
            this.ErrorLink = new String(source.ErrorLink);
        }
        if (source.ErrorLinkText != null) {
            this.ErrorLinkText = new String(source.ErrorLinkText);
        }
        if (source.DuplicateFileCheckType != null) {
            this.DuplicateFileCheckType = new Long(source.DuplicateFileCheckType);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DocBizId", this.DocBizId);
        this.setParamSimple(map, prefix + "ErrorMsg", this.ErrorMsg);
        this.setParamSimple(map, prefix + "ErrorLink", this.ErrorLink);
        this.setParamSimple(map, prefix + "ErrorLinkText", this.ErrorLinkText);
        this.setParamSimple(map, prefix + "DuplicateFileCheckType", this.DuplicateFileCheckType);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

