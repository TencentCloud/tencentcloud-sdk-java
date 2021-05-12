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
package com.tencentcloudapi.btoe.v20210303.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetDepositFileResponse extends AbstractModel{

    /**
    * 存证编号
    */
    @SerializedName("EvidenceId")
    @Expose
    private String EvidenceId;

    /**
    * 存证文件临时链接
    */
    @SerializedName("EvidenceFile")
    @Expose
    private String EvidenceFile;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 存证编号 
     * @return EvidenceId 存证编号
     */
    public String getEvidenceId() {
        return this.EvidenceId;
    }

    /**
     * Set 存证编号
     * @param EvidenceId 存证编号
     */
    public void setEvidenceId(String EvidenceId) {
        this.EvidenceId = EvidenceId;
    }

    /**
     * Get 存证文件临时链接 
     * @return EvidenceFile 存证文件临时链接
     */
    public String getEvidenceFile() {
        return this.EvidenceFile;
    }

    /**
     * Set 存证文件临时链接
     * @param EvidenceFile 存证文件临时链接
     */
    public void setEvidenceFile(String EvidenceFile) {
        this.EvidenceFile = EvidenceFile;
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

    public GetDepositFileResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetDepositFileResponse(GetDepositFileResponse source) {
        if (source.EvidenceId != null) {
            this.EvidenceId = new String(source.EvidenceId);
        }
        if (source.EvidenceFile != null) {
            this.EvidenceFile = new String(source.EvidenceFile);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EvidenceId", this.EvidenceId);
        this.setParamSimple(map, prefix + "EvidenceFile", this.EvidenceFile);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

