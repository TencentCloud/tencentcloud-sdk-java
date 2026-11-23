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
package com.tencentcloudapi.workbuddyenterprise.v20260709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSessionArtifactDownloadUrlRequest extends AbstractModel {

    /**
    * <p>物料ID</p>
    */
    @SerializedName("ArtifactId")
    @Expose
    private String ArtifactId;

    /**
    * <p>产物过期时间</p><p>单位：s</p>
    */
    @SerializedName("ExpiredSeconds")
    @Expose
    private Long ExpiredSeconds;

    /**
     * Get <p>物料ID</p> 
     * @return ArtifactId <p>物料ID</p>
     */
    public String getArtifactId() {
        return this.ArtifactId;
    }

    /**
     * Set <p>物料ID</p>
     * @param ArtifactId <p>物料ID</p>
     */
    public void setArtifactId(String ArtifactId) {
        this.ArtifactId = ArtifactId;
    }

    /**
     * Get <p>产物过期时间</p><p>单位：s</p> 
     * @return ExpiredSeconds <p>产物过期时间</p><p>单位：s</p>
     */
    public Long getExpiredSeconds() {
        return this.ExpiredSeconds;
    }

    /**
     * Set <p>产物过期时间</p><p>单位：s</p>
     * @param ExpiredSeconds <p>产物过期时间</p><p>单位：s</p>
     */
    public void setExpiredSeconds(Long ExpiredSeconds) {
        this.ExpiredSeconds = ExpiredSeconds;
    }

    public DescribeSessionArtifactDownloadUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSessionArtifactDownloadUrlRequest(DescribeSessionArtifactDownloadUrlRequest source) {
        if (source.ArtifactId != null) {
            this.ArtifactId = new String(source.ArtifactId);
        }
        if (source.ExpiredSeconds != null) {
            this.ExpiredSeconds = new Long(source.ExpiredSeconds);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ArtifactId", this.ArtifactId);
        this.setParamSimple(map, prefix + "ExpiredSeconds", this.ExpiredSeconds);

    }
}

