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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuntimeLib extends AbstractModel {

    /**
    * <p>运行库名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>运行库版本号</p>
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
     * Get <p>运行库名称</p> 
     * @return Name <p>运行库名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>运行库名称</p>
     * @param Name <p>运行库名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>运行库版本号</p> 
     * @return Version <p>运行库版本号</p>
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set <p>运行库版本号</p>
     * @param Version <p>运行库版本号</p>
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    public RuntimeLib() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuntimeLib(RuntimeLib source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Version", this.Version);

    }
}

