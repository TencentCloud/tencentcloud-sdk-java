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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SceneStoreCosParam extends AbstractModel {

    /**
    * <p>Cos桶名称。</p>
    */
    @SerializedName("CosBucketName")
    @Expose
    private String CosBucketName;

    /**
    * <p>Cos桶地域。</p>
    */
    @SerializedName("CosBucketRegion")
    @Expose
    private String CosBucketRegion;

    /**
    * <p>存储路径。</p>
    */
    @SerializedName("CosBucketPath")
    @Expose
    private String CosBucketPath;

    /**
     * Get <p>Cos桶名称。</p> 
     * @return CosBucketName <p>Cos桶名称。</p>
     */
    public String getCosBucketName() {
        return this.CosBucketName;
    }

    /**
     * Set <p>Cos桶名称。</p>
     * @param CosBucketName <p>Cos桶名称。</p>
     */
    public void setCosBucketName(String CosBucketName) {
        this.CosBucketName = CosBucketName;
    }

    /**
     * Get <p>Cos桶地域。</p> 
     * @return CosBucketRegion <p>Cos桶地域。</p>
     */
    public String getCosBucketRegion() {
        return this.CosBucketRegion;
    }

    /**
     * Set <p>Cos桶地域。</p>
     * @param CosBucketRegion <p>Cos桶地域。</p>
     */
    public void setCosBucketRegion(String CosBucketRegion) {
        this.CosBucketRegion = CosBucketRegion;
    }

    /**
     * Get <p>存储路径。</p> 
     * @return CosBucketPath <p>存储路径。</p>
     */
    public String getCosBucketPath() {
        return this.CosBucketPath;
    }

    /**
     * Set <p>存储路径。</p>
     * @param CosBucketPath <p>存储路径。</p>
     */
    public void setCosBucketPath(String CosBucketPath) {
        this.CosBucketPath = CosBucketPath;
    }

    public SceneStoreCosParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SceneStoreCosParam(SceneStoreCosParam source) {
        if (source.CosBucketName != null) {
            this.CosBucketName = new String(source.CosBucketName);
        }
        if (source.CosBucketRegion != null) {
            this.CosBucketRegion = new String(source.CosBucketRegion);
        }
        if (source.CosBucketPath != null) {
            this.CosBucketPath = new String(source.CosBucketPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CosBucketName", this.CosBucketName);
        this.setParamSimple(map, prefix + "CosBucketRegion", this.CosBucketRegion);
        this.setParamSimple(map, prefix + "CosBucketPath", this.CosBucketPath);

    }
}

