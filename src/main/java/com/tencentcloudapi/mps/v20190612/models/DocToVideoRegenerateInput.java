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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DocToVideoRegenerateInput extends AbstractModel {

    /**
    * <p>重新生成的范围。</p><p>枚举值：</p><ul><li>full： 该阶段全量重新生成（例如：修改整体的场景数量）</li><li>scenes： 按场景局部重新生成（例如：修改某场景的具体内容）</li></ul>
    */
    @SerializedName("Scope")
    @Expose
    private String Scope;

    /**
    * <p>重新生成时的提示词。</p>
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * <p>按页局部重新生成时的目标页 ID 数组。仅 Scope=scenes 时必填。不可重复，单次重新生成最多 5 页。</p>
    */
    @SerializedName("SceneIds")
    @Expose
    private String [] SceneIds;

    /**
     * Get <p>重新生成的范围。</p><p>枚举值：</p><ul><li>full： 该阶段全量重新生成（例如：修改整体的场景数量）</li><li>scenes： 按场景局部重新生成（例如：修改某场景的具体内容）</li></ul> 
     * @return Scope <p>重新生成的范围。</p><p>枚举值：</p><ul><li>full： 该阶段全量重新生成（例如：修改整体的场景数量）</li><li>scenes： 按场景局部重新生成（例如：修改某场景的具体内容）</li></ul>
     */
    public String getScope() {
        return this.Scope;
    }

    /**
     * Set <p>重新生成的范围。</p><p>枚举值：</p><ul><li>full： 该阶段全量重新生成（例如：修改整体的场景数量）</li><li>scenes： 按场景局部重新生成（例如：修改某场景的具体内容）</li></ul>
     * @param Scope <p>重新生成的范围。</p><p>枚举值：</p><ul><li>full： 该阶段全量重新生成（例如：修改整体的场景数量）</li><li>scenes： 按场景局部重新生成（例如：修改某场景的具体内容）</li></ul>
     */
    public void setScope(String Scope) {
        this.Scope = Scope;
    }

    /**
     * Get <p>重新生成时的提示词。</p> 
     * @return Prompt <p>重新生成时的提示词。</p>
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set <p>重新生成时的提示词。</p>
     * @param Prompt <p>重新生成时的提示词。</p>
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get <p>按页局部重新生成时的目标页 ID 数组。仅 Scope=scenes 时必填。不可重复，单次重新生成最多 5 页。</p> 
     * @return SceneIds <p>按页局部重新生成时的目标页 ID 数组。仅 Scope=scenes 时必填。不可重复，单次重新生成最多 5 页。</p>
     */
    public String [] getSceneIds() {
        return this.SceneIds;
    }

    /**
     * Set <p>按页局部重新生成时的目标页 ID 数组。仅 Scope=scenes 时必填。不可重复，单次重新生成最多 5 页。</p>
     * @param SceneIds <p>按页局部重新生成时的目标页 ID 数组。仅 Scope=scenes 时必填。不可重复，单次重新生成最多 5 页。</p>
     */
    public void setSceneIds(String [] SceneIds) {
        this.SceneIds = SceneIds;
    }

    public DocToVideoRegenerateInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DocToVideoRegenerateInput(DocToVideoRegenerateInput source) {
        if (source.Scope != null) {
            this.Scope = new String(source.Scope);
        }
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.SceneIds != null) {
            this.SceneIds = new String[source.SceneIds.length];
            for (int i = 0; i < source.SceneIds.length; i++) {
                this.SceneIds[i] = new String(source.SceneIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamArraySimple(map, prefix + "SceneIds.", this.SceneIds);

    }
}

