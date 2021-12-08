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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCheckComponentResponse extends AbstractModel{

    /**
    * "InstallSucc"表示安装成功，"InstallFailed"表示安装失败
    */
    @SerializedName("InstallResult")
    @Expose
    private String InstallResult;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get "InstallSucc"表示安装成功，"InstallFailed"表示安装失败 
     * @return InstallResult "InstallSucc"表示安装成功，"InstallFailed"表示安装失败
     */
    public String getInstallResult() {
        return this.InstallResult;
    }

    /**
     * Set "InstallSucc"表示安装成功，"InstallFailed"表示安装失败
     * @param InstallResult "InstallSucc"表示安装成功，"InstallFailed"表示安装失败
     */
    public void setInstallResult(String InstallResult) {
        this.InstallResult = InstallResult;
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

    public CreateCheckComponentResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCheckComponentResponse(CreateCheckComponentResponse source) {
        if (source.InstallResult != null) {
            this.InstallResult = new String(source.InstallResult);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstallResult", this.InstallResult);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

