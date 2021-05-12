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
package com.tencentcloudapi.tic.v20201117.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateStackResponse extends AbstractModel{

    /**
    * 创建得到的资源栈ID
    */
    @SerializedName("StackId")
    @Expose
    private String StackId;

    /**
    * 资源栈版本ID
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 创建得到的资源栈ID 
     * @return StackId 创建得到的资源栈ID
     */
    public String getStackId() {
        return this.StackId;
    }

    /**
     * Set 创建得到的资源栈ID
     * @param StackId 创建得到的资源栈ID
     */
    public void setStackId(String StackId) {
        this.StackId = StackId;
    }

    /**
     * Get 资源栈版本ID 
     * @return VersionId 资源栈版本ID
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set 资源栈版本ID
     * @param VersionId 资源栈版本ID
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
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

    public CreateStackResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateStackResponse(CreateStackResponse source) {
        if (source.StackId != null) {
            this.StackId = new String(source.StackId);
        }
        if (source.VersionId != null) {
            this.VersionId = new String(source.VersionId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StackId", this.StackId);
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

