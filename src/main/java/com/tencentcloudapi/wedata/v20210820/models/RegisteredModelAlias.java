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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegisteredModelAlias extends AbstractModel {

    /**
    * 别名的名称
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * 别名指向的模型版本号
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
     * Get 别名的名称 
     * @return Alias 别名的名称
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 别名的名称
     * @param Alias 别名的名称
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get 别名指向的模型版本号 
     * @return Version 别名指向的模型版本号
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 别名指向的模型版本号
     * @param Version 别名指向的模型版本号
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    public RegisteredModelAlias() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegisteredModelAlias(RegisteredModelAlias source) {
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "Version", this.Version);

    }
}

