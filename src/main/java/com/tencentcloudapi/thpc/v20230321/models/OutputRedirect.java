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
package com.tencentcloudapi.thpc.v20230321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OutputRedirect extends AbstractModel {

    /**
    * <p>输出driver类型</p><p>枚举值：</p><ul><li>local： 宿主机本地目录</li><li>cos： 远端cos存储</li></ul><p>默认值：local</p>
    */
    @SerializedName("Driver")
    @Expose
    private String Driver;

    /**
    * <p>重定向配置参数</p><p>日志重定向路径，用于指定任务日志的输出目标。取值格式与 Driver 类型关联：<br>当 Driver 为 local 时，格式为本地文件路径，如 stdout=/tmp/train_out.log；<br>当 Driver 为 cos 时，格式为 COS 存储桶路径，如 stdout=cos://test-123456.cos.ap-shanghai.myqcloud.com/test/.</p>
    */
    @SerializedName("Options")
    @Expose
    private String [] Options;

    /**
     * Get <p>输出driver类型</p><p>枚举值：</p><ul><li>local： 宿主机本地目录</li><li>cos： 远端cos存储</li></ul><p>默认值：local</p> 
     * @return Driver <p>输出driver类型</p><p>枚举值：</p><ul><li>local： 宿主机本地目录</li><li>cos： 远端cos存储</li></ul><p>默认值：local</p>
     */
    public String getDriver() {
        return this.Driver;
    }

    /**
     * Set <p>输出driver类型</p><p>枚举值：</p><ul><li>local： 宿主机本地目录</li><li>cos： 远端cos存储</li></ul><p>默认值：local</p>
     * @param Driver <p>输出driver类型</p><p>枚举值：</p><ul><li>local： 宿主机本地目录</li><li>cos： 远端cos存储</li></ul><p>默认值：local</p>
     */
    public void setDriver(String Driver) {
        this.Driver = Driver;
    }

    /**
     * Get <p>重定向配置参数</p><p>日志重定向路径，用于指定任务日志的输出目标。取值格式与 Driver 类型关联：<br>当 Driver 为 local 时，格式为本地文件路径，如 stdout=/tmp/train_out.log；<br>当 Driver 为 cos 时，格式为 COS 存储桶路径，如 stdout=cos://test-123456.cos.ap-shanghai.myqcloud.com/test/.</p> 
     * @return Options <p>重定向配置参数</p><p>日志重定向路径，用于指定任务日志的输出目标。取值格式与 Driver 类型关联：<br>当 Driver 为 local 时，格式为本地文件路径，如 stdout=/tmp/train_out.log；<br>当 Driver 为 cos 时，格式为 COS 存储桶路径，如 stdout=cos://test-123456.cos.ap-shanghai.myqcloud.com/test/.</p>
     */
    public String [] getOptions() {
        return this.Options;
    }

    /**
     * Set <p>重定向配置参数</p><p>日志重定向路径，用于指定任务日志的输出目标。取值格式与 Driver 类型关联：<br>当 Driver 为 local 时，格式为本地文件路径，如 stdout=/tmp/train_out.log；<br>当 Driver 为 cos 时，格式为 COS 存储桶路径，如 stdout=cos://test-123456.cos.ap-shanghai.myqcloud.com/test/.</p>
     * @param Options <p>重定向配置参数</p><p>日志重定向路径，用于指定任务日志的输出目标。取值格式与 Driver 类型关联：<br>当 Driver 为 local 时，格式为本地文件路径，如 stdout=/tmp/train_out.log；<br>当 Driver 为 cos 时，格式为 COS 存储桶路径，如 stdout=cos://test-123456.cos.ap-shanghai.myqcloud.com/test/.</p>
     */
    public void setOptions(String [] Options) {
        this.Options = Options;
    }

    public OutputRedirect() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OutputRedirect(OutputRedirect source) {
        if (source.Driver != null) {
            this.Driver = new String(source.Driver);
        }
        if (source.Options != null) {
            this.Options = new String[source.Options.length];
            for (int i = 0; i < source.Options.length; i++) {
                this.Options[i] = new String(source.Options[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Driver", this.Driver);
        this.setParamArraySimple(map, prefix + "Options.", this.Options);

    }
}

