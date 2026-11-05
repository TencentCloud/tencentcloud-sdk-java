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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HarnessVersionReference extends AbstractModel {

    /**
    * <p>Harness 引擎标识，原样使用 DescribeHarnessEngineList 返回的 HarnessEngine，例如 pi。</p><p>参数格式：必填，1 至 128 字符，区分大小写，不含空白、通配符或范围表达式。与同一对象的 HarnessEngineVersion 共同标识支持的版本。</p>
    */
    @SerializedName("HarnessEngine")
    @Expose
    private String HarnessEngine;

    /**
    * <p>Harness 引擎的具体版本，原样使用 DescribeHarnessEngineList 返回的 HarnessEngineVersion，例如 1.3.0。</p><p>参数格式：必填，1 至 128 字符，区分大小写，不含空白、通配符或版本范围。必须与同一个对象的 HarnessEngine 精确匹配；不能只比较版本号，也不自行拼接标识。</p>
    */
    @SerializedName("HarnessEngineVersion")
    @Expose
    private String HarnessEngineVersion;

    /**
     * Get <p>Harness 引擎标识，原样使用 DescribeHarnessEngineList 返回的 HarnessEngine，例如 pi。</p><p>参数格式：必填，1 至 128 字符，区分大小写，不含空白、通配符或范围表达式。与同一对象的 HarnessEngineVersion 共同标识支持的版本。</p> 
     * @return HarnessEngine <p>Harness 引擎标识，原样使用 DescribeHarnessEngineList 返回的 HarnessEngine，例如 pi。</p><p>参数格式：必填，1 至 128 字符，区分大小写，不含空白、通配符或范围表达式。与同一对象的 HarnessEngineVersion 共同标识支持的版本。</p>
     */
    public String getHarnessEngine() {
        return this.HarnessEngine;
    }

    /**
     * Set <p>Harness 引擎标识，原样使用 DescribeHarnessEngineList 返回的 HarnessEngine，例如 pi。</p><p>参数格式：必填，1 至 128 字符，区分大小写，不含空白、通配符或范围表达式。与同一对象的 HarnessEngineVersion 共同标识支持的版本。</p>
     * @param HarnessEngine <p>Harness 引擎标识，原样使用 DescribeHarnessEngineList 返回的 HarnessEngine，例如 pi。</p><p>参数格式：必填，1 至 128 字符，区分大小写，不含空白、通配符或范围表达式。与同一对象的 HarnessEngineVersion 共同标识支持的版本。</p>
     */
    public void setHarnessEngine(String HarnessEngine) {
        this.HarnessEngine = HarnessEngine;
    }

    /**
     * Get <p>Harness 引擎的具体版本，原样使用 DescribeHarnessEngineList 返回的 HarnessEngineVersion，例如 1.3.0。</p><p>参数格式：必填，1 至 128 字符，区分大小写，不含空白、通配符或版本范围。必须与同一个对象的 HarnessEngine 精确匹配；不能只比较版本号，也不自行拼接标识。</p> 
     * @return HarnessEngineVersion <p>Harness 引擎的具体版本，原样使用 DescribeHarnessEngineList 返回的 HarnessEngineVersion，例如 1.3.0。</p><p>参数格式：必填，1 至 128 字符，区分大小写，不含空白、通配符或版本范围。必须与同一个对象的 HarnessEngine 精确匹配；不能只比较版本号，也不自行拼接标识。</p>
     */
    public String getHarnessEngineVersion() {
        return this.HarnessEngineVersion;
    }

    /**
     * Set <p>Harness 引擎的具体版本，原样使用 DescribeHarnessEngineList 返回的 HarnessEngineVersion，例如 1.3.0。</p><p>参数格式：必填，1 至 128 字符，区分大小写，不含空白、通配符或版本范围。必须与同一个对象的 HarnessEngine 精确匹配；不能只比较版本号，也不自行拼接标识。</p>
     * @param HarnessEngineVersion <p>Harness 引擎的具体版本，原样使用 DescribeHarnessEngineList 返回的 HarnessEngineVersion，例如 1.3.0。</p><p>参数格式：必填，1 至 128 字符，区分大小写，不含空白、通配符或版本范围。必须与同一个对象的 HarnessEngine 精确匹配；不能只比较版本号，也不自行拼接标识。</p>
     */
    public void setHarnessEngineVersion(String HarnessEngineVersion) {
        this.HarnessEngineVersion = HarnessEngineVersion;
    }

    public HarnessVersionReference() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HarnessVersionReference(HarnessVersionReference source) {
        if (source.HarnessEngine != null) {
            this.HarnessEngine = new String(source.HarnessEngine);
        }
        if (source.HarnessEngineVersion != null) {
            this.HarnessEngineVersion = new String(source.HarnessEngineVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HarnessEngine", this.HarnessEngine);
        this.setParamSimple(map, prefix + "HarnessEngineVersion", this.HarnessEngineVersion);

    }
}

