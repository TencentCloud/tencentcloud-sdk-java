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
package com.tencentcloudapi.gs.v20191118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackUpAndroidInstanceRequest extends AbstractModel {

    /**
    * 安卓实例ID
    */
    @SerializedName("AndroidInstanceId")
    @Expose
    private String AndroidInstanceId;

    /**
    * 包含的路径，支持仅含一个通配符*，通配符不能出现在路径开始
    */
    @SerializedName("Includes")
    @Expose
    private String [] Includes;

    /**
    * 需要排除路径，支持仅含一个通配符*，通配符不能出现在路径开始
    */
    @SerializedName("Excludes")
    @Expose
    private String [] Excludes;

    /**
     * Get 安卓实例ID 
     * @return AndroidInstanceId 安卓实例ID
     */
    public String getAndroidInstanceId() {
        return this.AndroidInstanceId;
    }

    /**
     * Set 安卓实例ID
     * @param AndroidInstanceId 安卓实例ID
     */
    public void setAndroidInstanceId(String AndroidInstanceId) {
        this.AndroidInstanceId = AndroidInstanceId;
    }

    /**
     * Get 包含的路径，支持仅含一个通配符*，通配符不能出现在路径开始 
     * @return Includes 包含的路径，支持仅含一个通配符*，通配符不能出现在路径开始
     */
    public String [] getIncludes() {
        return this.Includes;
    }

    /**
     * Set 包含的路径，支持仅含一个通配符*，通配符不能出现在路径开始
     * @param Includes 包含的路径，支持仅含一个通配符*，通配符不能出现在路径开始
     */
    public void setIncludes(String [] Includes) {
        this.Includes = Includes;
    }

    /**
     * Get 需要排除路径，支持仅含一个通配符*，通配符不能出现在路径开始 
     * @return Excludes 需要排除路径，支持仅含一个通配符*，通配符不能出现在路径开始
     */
    public String [] getExcludes() {
        return this.Excludes;
    }

    /**
     * Set 需要排除路径，支持仅含一个通配符*，通配符不能出现在路径开始
     * @param Excludes 需要排除路径，支持仅含一个通配符*，通配符不能出现在路径开始
     */
    public void setExcludes(String [] Excludes) {
        this.Excludes = Excludes;
    }

    public BackUpAndroidInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackUpAndroidInstanceRequest(BackUpAndroidInstanceRequest source) {
        if (source.AndroidInstanceId != null) {
            this.AndroidInstanceId = new String(source.AndroidInstanceId);
        }
        if (source.Includes != null) {
            this.Includes = new String[source.Includes.length];
            for (int i = 0; i < source.Includes.length; i++) {
                this.Includes[i] = new String(source.Includes[i]);
            }
        }
        if (source.Excludes != null) {
            this.Excludes = new String[source.Excludes.length];
            for (int i = 0; i < source.Excludes.length; i++) {
                this.Excludes[i] = new String(source.Excludes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AndroidInstanceId", this.AndroidInstanceId);
        this.setParamArraySimple(map, prefix + "Includes.", this.Includes);
        this.setParamArraySimple(map, prefix + "Excludes.", this.Excludes);

    }
}

