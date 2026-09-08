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

public class DescribeJobDetailRequest extends AbstractModel {

    /**
    * flink rest api 路径
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 作业id
    */
    @SerializedName("JobSerialId")
    @Expose
    private String JobSerialId;

    /**
    * 请求rest api 方法
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
     * Get flink rest api 路径 
     * @return Path flink rest api 路径
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set flink rest api 路径
     * @param Path flink rest api 路径
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 作业id 
     * @return JobSerialId 作业id
     */
    public String getJobSerialId() {
        return this.JobSerialId;
    }

    /**
     * Set 作业id
     * @param JobSerialId 作业id
     */
    public void setJobSerialId(String JobSerialId) {
        this.JobSerialId = JobSerialId;
    }

    /**
     * Get 请求rest api 方法 
     * @return Method 请求rest api 方法
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set 请求rest api 方法
     * @param Method 请求rest api 方法
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    public DescribeJobDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeJobDetailRequest(DescribeJobDetailRequest source) {
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.JobSerialId != null) {
            this.JobSerialId = new String(source.JobSerialId);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "JobSerialId", this.JobSerialId);
        this.setParamSimple(map, prefix + "Method", this.Method);

    }
}

