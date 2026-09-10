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

public class DeleteFunctionRequest extends AbstractModel {

    /**
    * <p>环境 ID。可通过 DescribeEnvs 接口获取。</p>
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * <p>函数名称。最大 60 字符，以字母开头，支持字母、数字、下划线和连字符。可通过 ListFunctions 或 GetFunction 获取。</p>
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * <p>函数版本。取值：$LATEST（最新版本）。不填默认 $LATEST。当前仅支持 $LATEST。</p>
    */
    @SerializedName("Qualifier")
    @Expose
    private String Qualifier;

    /**
     * Get <p>环境 ID。可通过 DescribeEnvs 接口获取。</p> 
     * @return EnvId <p>环境 ID。可通过 DescribeEnvs 接口获取。</p>
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set <p>环境 ID。可通过 DescribeEnvs 接口获取。</p>
     * @param EnvId <p>环境 ID。可通过 DescribeEnvs 接口获取。</p>
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get <p>函数名称。最大 60 字符，以字母开头，支持字母、数字、下划线和连字符。可通过 ListFunctions 或 GetFunction 获取。</p> 
     * @return FunctionName <p>函数名称。最大 60 字符，以字母开头，支持字母、数字、下划线和连字符。可通过 ListFunctions 或 GetFunction 获取。</p>
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set <p>函数名称。最大 60 字符，以字母开头，支持字母、数字、下划线和连字符。可通过 ListFunctions 或 GetFunction 获取。</p>
     * @param FunctionName <p>函数名称。最大 60 字符，以字母开头，支持字母、数字、下划线和连字符。可通过 ListFunctions 或 GetFunction 获取。</p>
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get <p>函数版本。取值：$LATEST（最新版本）。不填默认 $LATEST。当前仅支持 $LATEST。</p> 
     * @return Qualifier <p>函数版本。取值：$LATEST（最新版本）。不填默认 $LATEST。当前仅支持 $LATEST。</p>
     */
    public String getQualifier() {
        return this.Qualifier;
    }

    /**
     * Set <p>函数版本。取值：$LATEST（最新版本）。不填默认 $LATEST。当前仅支持 $LATEST。</p>
     * @param Qualifier <p>函数版本。取值：$LATEST（最新版本）。不填默认 $LATEST。当前仅支持 $LATEST。</p>
     */
    public void setQualifier(String Qualifier) {
        this.Qualifier = Qualifier;
    }

    public DeleteFunctionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteFunctionRequest(DeleteFunctionRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.FunctionName != null) {
            this.FunctionName = new String(source.FunctionName);
        }
        if (source.Qualifier != null) {
            this.Qualifier = new String(source.Qualifier);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "Qualifier", this.Qualifier);

    }
}

