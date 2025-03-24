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
package com.tencentcloudapi.gs.v20191118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CopyAndroidInstanceRequest extends AbstractModel {

    /**
    * 源安卓实例 ID
    */
    @SerializedName("SourceAndroidInstanceId")
    @Expose
    private String SourceAndroidInstanceId;

    /**
    * 目的安卓实例 ID
    */
    @SerializedName("TargetAndroidInstanceId")
    @Expose
    private String TargetAndroidInstanceId;

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
     * Get 源安卓实例 ID 
     * @return SourceAndroidInstanceId 源安卓实例 ID
     */
    public String getSourceAndroidInstanceId() {
        return this.SourceAndroidInstanceId;
    }

    /**
     * Set 源安卓实例 ID
     * @param SourceAndroidInstanceId 源安卓实例 ID
     */
    public void setSourceAndroidInstanceId(String SourceAndroidInstanceId) {
        this.SourceAndroidInstanceId = SourceAndroidInstanceId;
    }

    /**
     * Get 目的安卓实例 ID 
     * @return TargetAndroidInstanceId 目的安卓实例 ID
     */
    public String getTargetAndroidInstanceId() {
        return this.TargetAndroidInstanceId;
    }

    /**
     * Set 目的安卓实例 ID
     * @param TargetAndroidInstanceId 目的安卓实例 ID
     */
    public void setTargetAndroidInstanceId(String TargetAndroidInstanceId) {
        this.TargetAndroidInstanceId = TargetAndroidInstanceId;
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

    public CopyAndroidInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CopyAndroidInstanceRequest(CopyAndroidInstanceRequest source) {
        if (source.SourceAndroidInstanceId != null) {
            this.SourceAndroidInstanceId = new String(source.SourceAndroidInstanceId);
        }
        if (source.TargetAndroidInstanceId != null) {
            this.TargetAndroidInstanceId = new String(source.TargetAndroidInstanceId);
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
        this.setParamSimple(map, prefix + "SourceAndroidInstanceId", this.SourceAndroidInstanceId);
        this.setParamSimple(map, prefix + "TargetAndroidInstanceId", this.TargetAndroidInstanceId);
        this.setParamArraySimple(map, prefix + "Includes.", this.Includes);
        this.setParamArraySimple(map, prefix + "Excludes.", this.Excludes);

    }
}

