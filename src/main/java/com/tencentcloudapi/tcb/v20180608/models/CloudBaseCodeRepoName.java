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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudBaseCodeRepoName extends AbstractModel {

    /**
    * repo的名字
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * repo的完整全名
    */
    @SerializedName("FullName")
    @Expose
    private String FullName;

    /**
     * Get repo的名字 
     * @return Name repo的名字
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set repo的名字
     * @param Name repo的名字
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get repo的完整全名 
     * @return FullName repo的完整全名
     */
    public String getFullName() {
        return this.FullName;
    }

    /**
     * Set repo的完整全名
     * @param FullName repo的完整全名
     */
    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public CloudBaseCodeRepoName() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudBaseCodeRepoName(CloudBaseCodeRepoName source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.FullName != null) {
            this.FullName = new String(source.FullName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "FullName", this.FullName);

    }
}

