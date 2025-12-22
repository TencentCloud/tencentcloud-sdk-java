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

public class SuccessDeleteVersions extends AbstractModel {

    /**
    * 版本简化信息
    */
    @SerializedName("Version")
    @Expose
    private SimpleVersion Version;

    /**
    * 删除版本的 RequestId
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
    * 删除版本结果
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
     * Get 版本简化信息 
     * @return Version 版本简化信息
     */
    public SimpleVersion getVersion() {
        return this.Version;
    }

    /**
     * Set 版本简化信息
     * @param Version 版本简化信息
     */
    public void setVersion(SimpleVersion Version) {
        this.Version = Version;
    }

    /**
     * Get 删除版本的 RequestId 
     * @return RequestId 删除版本的 RequestId
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 删除版本的 RequestId
     * @param RequestId 删除版本的 RequestId
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Get 删除版本结果 
     * @return Result 删除版本结果
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set 删除版本结果
     * @param Result 删除版本结果
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    public SuccessDeleteVersions() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SuccessDeleteVersions(SuccessDeleteVersions source) {
        if (source.Version != null) {
            this.Version = new SimpleVersion(source.Version);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Version.", this.Version);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);
        this.setParamSimple(map, prefix + "Result", this.Result);

    }
}

