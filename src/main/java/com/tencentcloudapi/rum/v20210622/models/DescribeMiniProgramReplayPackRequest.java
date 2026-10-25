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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMiniProgramReplayPackRequest extends AbstractModel {

    /**
    * <p>应用id</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>回放包hash（sha256前16位hex）</p>
    */
    @SerializedName("BundleHash")
    @Expose
    private String BundleHash;

    /**
     * Get <p>应用id</p> 
     * @return AppId <p>应用id</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用id</p>
     * @param AppId <p>应用id</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>回放包hash（sha256前16位hex）</p> 
     * @return BundleHash <p>回放包hash（sha256前16位hex）</p>
     */
    public String getBundleHash() {
        return this.BundleHash;
    }

    /**
     * Set <p>回放包hash（sha256前16位hex）</p>
     * @param BundleHash <p>回放包hash（sha256前16位hex）</p>
     */
    public void setBundleHash(String BundleHash) {
        this.BundleHash = BundleHash;
    }

    public DescribeMiniProgramReplayPackRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMiniProgramReplayPackRequest(DescribeMiniProgramReplayPackRequest source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.BundleHash != null) {
            this.BundleHash = new String(source.BundleHash);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "BundleHash", this.BundleHash);

    }
}

