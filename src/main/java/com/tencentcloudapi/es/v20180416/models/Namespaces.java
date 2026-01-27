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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Namespaces extends AbstractModel {

    /**
    * 包含的命名空间的列表，单个命名空间支持小写字母、数字、连接符-、下划线_，最多支持63个字符
    */
    @SerializedName("Include")
    @Expose
    private String [] Include;

    /**
    * 不包含的命名空间列表，单个命名空间支持小写字母、数字、连接符-、下划线_，最多支持63个字符
    */
    @SerializedName("Exclude")
    @Expose
    private String [] Exclude;

    /**
     * Get 包含的命名空间的列表，单个命名空间支持小写字母、数字、连接符-、下划线_，最多支持63个字符 
     * @return Include 包含的命名空间的列表，单个命名空间支持小写字母、数字、连接符-、下划线_，最多支持63个字符
     */
    public String [] getInclude() {
        return this.Include;
    }

    /**
     * Set 包含的命名空间的列表，单个命名空间支持小写字母、数字、连接符-、下划线_，最多支持63个字符
     * @param Include 包含的命名空间的列表，单个命名空间支持小写字母、数字、连接符-、下划线_，最多支持63个字符
     */
    public void setInclude(String [] Include) {
        this.Include = Include;
    }

    /**
     * Get 不包含的命名空间列表，单个命名空间支持小写字母、数字、连接符-、下划线_，最多支持63个字符 
     * @return Exclude 不包含的命名空间列表，单个命名空间支持小写字母、数字、连接符-、下划线_，最多支持63个字符
     */
    public String [] getExclude() {
        return this.Exclude;
    }

    /**
     * Set 不包含的命名空间列表，单个命名空间支持小写字母、数字、连接符-、下划线_，最多支持63个字符
     * @param Exclude 不包含的命名空间列表，单个命名空间支持小写字母、数字、连接符-、下划线_，最多支持63个字符
     */
    public void setExclude(String [] Exclude) {
        this.Exclude = Exclude;
    }

    public Namespaces() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Namespaces(Namespaces source) {
        if (source.Include != null) {
            this.Include = new String[source.Include.length];
            for (int i = 0; i < source.Include.length; i++) {
                this.Include[i] = new String(source.Include[i]);
            }
        }
        if (source.Exclude != null) {
            this.Exclude = new String[source.Exclude.length];
            for (int i = 0; i < source.Exclude.length; i++) {
                this.Exclude[i] = new String(source.Exclude[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Include.", this.Include);
        this.setParamArraySimple(map, prefix + "Exclude.", this.Exclude);

    }
}

