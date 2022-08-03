/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTKEEdgeScriptResponse extends AbstractModel{

    /**
    * 下载链接
    */
    @SerializedName("Link")
    @Expose
    private String Link;

    /**
    * 下载需要的token
    */
    @SerializedName("Token")
    @Expose
    private String Token;

    /**
    * 下载命令
    */
    @SerializedName("Command")
    @Expose
    private String Command;

    /**
    * edgectl脚本版本，默认拉取最新版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScriptVersion")
    @Expose
    private String ScriptVersion;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 下载链接 
     * @return Link 下载链接
     */
    public String getLink() {
        return this.Link;
    }

    /**
     * Set 下载链接
     * @param Link 下载链接
     */
    public void setLink(String Link) {
        this.Link = Link;
    }

    /**
     * Get 下载需要的token 
     * @return Token 下载需要的token
     */
    public String getToken() {
        return this.Token;
    }

    /**
     * Set 下载需要的token
     * @param Token 下载需要的token
     */
    public void setToken(String Token) {
        this.Token = Token;
    }

    /**
     * Get 下载命令 
     * @return Command 下载命令
     */
    public String getCommand() {
        return this.Command;
    }

    /**
     * Set 下载命令
     * @param Command 下载命令
     */
    public void setCommand(String Command) {
        this.Command = Command;
    }

    /**
     * Get edgectl脚本版本，默认拉取最新版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScriptVersion edgectl脚本版本，默认拉取最新版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScriptVersion() {
        return this.ScriptVersion;
    }

    /**
     * Set edgectl脚本版本，默认拉取最新版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScriptVersion edgectl脚本版本，默认拉取最新版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScriptVersion(String ScriptVersion) {
        this.ScriptVersion = ScriptVersion;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeTKEEdgeScriptResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTKEEdgeScriptResponse(DescribeTKEEdgeScriptResponse source) {
        if (source.Link != null) {
            this.Link = new String(source.Link);
        }
        if (source.Token != null) {
            this.Token = new String(source.Token);
        }
        if (source.Command != null) {
            this.Command = new String(source.Command);
        }
        if (source.ScriptVersion != null) {
            this.ScriptVersion = new String(source.ScriptVersion);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Link", this.Link);
        this.setParamSimple(map, prefix + "Token", this.Token);
        this.setParamSimple(map, prefix + "Command", this.Command);
        this.setParamSimple(map, prefix + "ScriptVersion", this.ScriptVersion);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

