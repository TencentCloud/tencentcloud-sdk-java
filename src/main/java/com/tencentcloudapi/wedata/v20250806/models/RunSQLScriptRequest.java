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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RunSQLScriptRequest extends AbstractModel {

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 脚本id。如果不填则需要传入 ScriptConfig、ScriptContent，此时为免脚本临时运行模式，服务端不保存脚本
    */
    @SerializedName("ScriptId")
    @Expose
    private String ScriptId;

    /**
    * 脚本配置。免脚本临时运行模式（未传 ScriptId）下必填，其中 DatasourceId 必填、ExecutorGroupId 选填（缺省时使用项目管理-数据分析配置中的执行资源组）；传入 ScriptId 时本字段被忽略，配置取自已保存的脚本
    */
    @SerializedName("ScriptConfig")
    @Expose
    private SQLScriptConfig ScriptConfig;

    /**
    * 脚本内容，支持传递代码原文或者 Base64 编码，服务端自动识别。传 ScriptId 时不传则执行已保存的全量脚本内容；免脚本临时运行模式下必填。注意：若原文恰好由 Base64 字符集组成且长度为 4 的倍数（如 descTBLS），会被识别为已编码，此类内容请显式 Base64 编码后传入
    */
    @SerializedName("ScriptContent")
    @Expose
    private String ScriptContent;

    /**
    * 高级运行参数，支持传递 JSON 格式原文或者 Base64 编码，服务端自动识别。示例：{"executorNum":1} 或 eyJleGVjdXRvck51bSI6MX0=
    */
    @SerializedName("Params")
    @Expose
    private String Params;

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 脚本id。如果不填则需要传入 ScriptConfig、ScriptContent，此时为免脚本临时运行模式，服务端不保存脚本 
     * @return ScriptId 脚本id。如果不填则需要传入 ScriptConfig、ScriptContent，此时为免脚本临时运行模式，服务端不保存脚本
     */
    public String getScriptId() {
        return this.ScriptId;
    }

    /**
     * Set 脚本id。如果不填则需要传入 ScriptConfig、ScriptContent，此时为免脚本临时运行模式，服务端不保存脚本
     * @param ScriptId 脚本id。如果不填则需要传入 ScriptConfig、ScriptContent，此时为免脚本临时运行模式，服务端不保存脚本
     */
    public void setScriptId(String ScriptId) {
        this.ScriptId = ScriptId;
    }

    /**
     * Get 脚本配置。免脚本临时运行模式（未传 ScriptId）下必填，其中 DatasourceId 必填、ExecutorGroupId 选填（缺省时使用项目管理-数据分析配置中的执行资源组）；传入 ScriptId 时本字段被忽略，配置取自已保存的脚本 
     * @return ScriptConfig 脚本配置。免脚本临时运行模式（未传 ScriptId）下必填，其中 DatasourceId 必填、ExecutorGroupId 选填（缺省时使用项目管理-数据分析配置中的执行资源组）；传入 ScriptId 时本字段被忽略，配置取自已保存的脚本
     */
    public SQLScriptConfig getScriptConfig() {
        return this.ScriptConfig;
    }

    /**
     * Set 脚本配置。免脚本临时运行模式（未传 ScriptId）下必填，其中 DatasourceId 必填、ExecutorGroupId 选填（缺省时使用项目管理-数据分析配置中的执行资源组）；传入 ScriptId 时本字段被忽略，配置取自已保存的脚本
     * @param ScriptConfig 脚本配置。免脚本临时运行模式（未传 ScriptId）下必填，其中 DatasourceId 必填、ExecutorGroupId 选填（缺省时使用项目管理-数据分析配置中的执行资源组）；传入 ScriptId 时本字段被忽略，配置取自已保存的脚本
     */
    public void setScriptConfig(SQLScriptConfig ScriptConfig) {
        this.ScriptConfig = ScriptConfig;
    }

    /**
     * Get 脚本内容，支持传递代码原文或者 Base64 编码，服务端自动识别。传 ScriptId 时不传则执行已保存的全量脚本内容；免脚本临时运行模式下必填。注意：若原文恰好由 Base64 字符集组成且长度为 4 的倍数（如 descTBLS），会被识别为已编码，此类内容请显式 Base64 编码后传入 
     * @return ScriptContent 脚本内容，支持传递代码原文或者 Base64 编码，服务端自动识别。传 ScriptId 时不传则执行已保存的全量脚本内容；免脚本临时运行模式下必填。注意：若原文恰好由 Base64 字符集组成且长度为 4 的倍数（如 descTBLS），会被识别为已编码，此类内容请显式 Base64 编码后传入
     */
    public String getScriptContent() {
        return this.ScriptContent;
    }

    /**
     * Set 脚本内容，支持传递代码原文或者 Base64 编码，服务端自动识别。传 ScriptId 时不传则执行已保存的全量脚本内容；免脚本临时运行模式下必填。注意：若原文恰好由 Base64 字符集组成且长度为 4 的倍数（如 descTBLS），会被识别为已编码，此类内容请显式 Base64 编码后传入
     * @param ScriptContent 脚本内容，支持传递代码原文或者 Base64 编码，服务端自动识别。传 ScriptId 时不传则执行已保存的全量脚本内容；免脚本临时运行模式下必填。注意：若原文恰好由 Base64 字符集组成且长度为 4 的倍数（如 descTBLS），会被识别为已编码，此类内容请显式 Base64 编码后传入
     */
    public void setScriptContent(String ScriptContent) {
        this.ScriptContent = ScriptContent;
    }

    /**
     * Get 高级运行参数，支持传递 JSON 格式原文或者 Base64 编码，服务端自动识别。示例：{"executorNum":1} 或 eyJleGVjdXRvck51bSI6MX0= 
     * @return Params 高级运行参数，支持传递 JSON 格式原文或者 Base64 编码，服务端自动识别。示例：{"executorNum":1} 或 eyJleGVjdXRvck51bSI6MX0=
     */
    public String getParams() {
        return this.Params;
    }

    /**
     * Set 高级运行参数，支持传递 JSON 格式原文或者 Base64 编码，服务端自动识别。示例：{"executorNum":1} 或 eyJleGVjdXRvck51bSI6MX0=
     * @param Params 高级运行参数，支持传递 JSON 格式原文或者 Base64 编码，服务端自动识别。示例：{"executorNum":1} 或 eyJleGVjdXRvck51bSI6MX0=
     */
    public void setParams(String Params) {
        this.Params = Params;
    }

    public RunSQLScriptRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RunSQLScriptRequest(RunSQLScriptRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ScriptId != null) {
            this.ScriptId = new String(source.ScriptId);
        }
        if (source.ScriptConfig != null) {
            this.ScriptConfig = new SQLScriptConfig(source.ScriptConfig);
        }
        if (source.ScriptContent != null) {
            this.ScriptContent = new String(source.ScriptContent);
        }
        if (source.Params != null) {
            this.Params = new String(source.Params);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ScriptId", this.ScriptId);
        this.setParamObj(map, prefix + "ScriptConfig.", this.ScriptConfig);
        this.setParamSimple(map, prefix + "ScriptContent", this.ScriptContent);
        this.setParamSimple(map, prefix + "Params", this.Params);

    }
}

