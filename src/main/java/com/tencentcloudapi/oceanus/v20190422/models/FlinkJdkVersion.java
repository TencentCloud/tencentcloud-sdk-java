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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlinkJdkVersion extends AbstractModel {

    /**
    * flink版本
    */
    @SerializedName("FlinkVersion")
    @Expose
    private String FlinkVersion;

    /**
    * jdk版本
    */
    @SerializedName("JdkVersions")
    @Expose
    private String [] JdkVersions;

    /**
     * Get flink版本 
     * @return FlinkVersion flink版本
     */
    public String getFlinkVersion() {
        return this.FlinkVersion;
    }

    /**
     * Set flink版本
     * @param FlinkVersion flink版本
     */
    public void setFlinkVersion(String FlinkVersion) {
        this.FlinkVersion = FlinkVersion;
    }

    /**
     * Get jdk版本 
     * @return JdkVersions jdk版本
     */
    public String [] getJdkVersions() {
        return this.JdkVersions;
    }

    /**
     * Set jdk版本
     * @param JdkVersions jdk版本
     */
    public void setJdkVersions(String [] JdkVersions) {
        this.JdkVersions = JdkVersions;
    }

    public FlinkJdkVersion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlinkJdkVersion(FlinkJdkVersion source) {
        if (source.FlinkVersion != null) {
            this.FlinkVersion = new String(source.FlinkVersion);
        }
        if (source.JdkVersions != null) {
            this.JdkVersions = new String[source.JdkVersions.length];
            for (int i = 0; i < source.JdkVersions.length; i++) {
                this.JdkVersions[i] = new String(source.JdkVersions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlinkVersion", this.FlinkVersion);
        this.setParamArraySimple(map, prefix + "JdkVersions.", this.JdkVersions);

    }
}

