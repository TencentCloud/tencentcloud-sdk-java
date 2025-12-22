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
package com.tencentcloudapi.tcbr.v20220217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FailDeleteVersions extends AbstractModel {

    /**
    * 删除失败版本信息
    */
    @SerializedName("Version")
    @Expose
    private SimpleVersion Version;

    /**
    * 删除失败错误码
    */
    @SerializedName("ErrorCode")
    @Expose
    private Long ErrorCode;

    /**
    * 删除失败错误信息
    */
    @SerializedName("ErrorMsg")
    @Expose
    private String ErrorMsg;

    /**
    * 删除操作 RequestId
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 删除失败版本信息 
     * @return Version 删除失败版本信息
     */
    public SimpleVersion getVersion() {
        return this.Version;
    }

    /**
     * Set 删除失败版本信息
     * @param Version 删除失败版本信息
     */
    public void setVersion(SimpleVersion Version) {
        this.Version = Version;
    }

    /**
     * Get 删除失败错误码 
     * @return ErrorCode 删除失败错误码
     */
    public Long getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set 删除失败错误码
     * @param ErrorCode 删除失败错误码
     */
    public void setErrorCode(Long ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get 删除失败错误信息 
     * @return ErrorMsg 删除失败错误信息
     */
    public String getErrorMsg() {
        return this.ErrorMsg;
    }

    /**
     * Set 删除失败错误信息
     * @param ErrorMsg 删除失败错误信息
     */
    public void setErrorMsg(String ErrorMsg) {
        this.ErrorMsg = ErrorMsg;
    }

    /**
     * Get 删除操作 RequestId 
     * @return RequestId 删除操作 RequestId
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 删除操作 RequestId
     * @param RequestId 删除操作 RequestId
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public FailDeleteVersions() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FailDeleteVersions(FailDeleteVersions source) {
        if (source.Version != null) {
            this.Version = new SimpleVersion(source.Version);
        }
        if (source.ErrorCode != null) {
            this.ErrorCode = new Long(source.ErrorCode);
        }
        if (source.ErrorMsg != null) {
            this.ErrorMsg = new String(source.ErrorMsg);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Version.", this.Version);
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "ErrorMsg", this.ErrorMsg);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

