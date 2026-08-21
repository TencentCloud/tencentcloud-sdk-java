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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SCFAliasInfo extends AbstractModel {

    /**
    * 别名名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 别名指向的主版本号
    */
    @SerializedName("FunctionVersion")
    @Expose
    private String FunctionVersion;

    /**
     * Get 别名名称 
     * @return Name 别名名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 别名名称
     * @param Name 别名名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 别名指向的主版本号 
     * @return FunctionVersion 别名指向的主版本号
     */
    public String getFunctionVersion() {
        return this.FunctionVersion;
    }

    /**
     * Set 别名指向的主版本号
     * @param FunctionVersion 别名指向的主版本号
     */
    public void setFunctionVersion(String FunctionVersion) {
        this.FunctionVersion = FunctionVersion;
    }

    public SCFAliasInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SCFAliasInfo(SCFAliasInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.FunctionVersion != null) {
            this.FunctionVersion = new String(source.FunctionVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "FunctionVersion", this.FunctionVersion);

    }
}

