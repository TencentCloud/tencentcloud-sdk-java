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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAIWorkbenchArtifactRequest extends AbstractModel {

    /**
    * <p>产物 ID</p>
    */
    @SerializedName("ArtifactId")
    @Expose
    private String ArtifactId;

    /**
    * <p>是否需要下载 URL</p><p><code>1</code> = 需要，<code>0</code> 或不传 = 不需要</p>
    */
    @SerializedName("NeedDownloadURL")
    @Expose
    private Long NeedDownloadURL;

    /**
     * Get <p>产物 ID</p> 
     * @return ArtifactId <p>产物 ID</p>
     */
    public String getArtifactId() {
        return this.ArtifactId;
    }

    /**
     * Set <p>产物 ID</p>
     * @param ArtifactId <p>产物 ID</p>
     */
    public void setArtifactId(String ArtifactId) {
        this.ArtifactId = ArtifactId;
    }

    /**
     * Get <p>是否需要下载 URL</p><p><code>1</code> = 需要，<code>0</code> 或不传 = 不需要</p> 
     * @return NeedDownloadURL <p>是否需要下载 URL</p><p><code>1</code> = 需要，<code>0</code> 或不传 = 不需要</p>
     */
    public Long getNeedDownloadURL() {
        return this.NeedDownloadURL;
    }

    /**
     * Set <p>是否需要下载 URL</p><p><code>1</code> = 需要，<code>0</code> 或不传 = 不需要</p>
     * @param NeedDownloadURL <p>是否需要下载 URL</p><p><code>1</code> = 需要，<code>0</code> 或不传 = 不需要</p>
     */
    public void setNeedDownloadURL(Long NeedDownloadURL) {
        this.NeedDownloadURL = NeedDownloadURL;
    }

    public DescribeAIWorkbenchArtifactRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAIWorkbenchArtifactRequest(DescribeAIWorkbenchArtifactRequest source) {
        if (source.ArtifactId != null) {
            this.ArtifactId = new String(source.ArtifactId);
        }
        if (source.NeedDownloadURL != null) {
            this.NeedDownloadURL = new Long(source.NeedDownloadURL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ArtifactId", this.ArtifactId);
        this.setParamSimple(map, prefix + "NeedDownloadURL", this.NeedDownloadURL);

    }
}

