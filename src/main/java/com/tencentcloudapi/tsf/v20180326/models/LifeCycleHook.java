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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LifeCycleHook extends AbstractModel {

    /**
    * 生命周期函数类型：PostStart|PreStop
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HookType")
    @Expose
    private String HookType;

    /**
    * 函数执行方式：execCommand|httpGet|none
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecMode")
    @Expose
    private String ExecMode;

    /**
    * execCommand函数执行内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecCommandContent")
    @Expose
    private String ExecCommandContent;

    /**
    * HttpGet执行内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HttpGetOption")
    @Expose
    private HttpGetOption HttpGetOption;

    /**
     * Get 生命周期函数类型：PostStart|PreStop
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HookType 生命周期函数类型：PostStart|PreStop
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHookType() {
        return this.HookType;
    }

    /**
     * Set 生命周期函数类型：PostStart|PreStop
注意：此字段可能返回 null，表示取不到有效值。
     * @param HookType 生命周期函数类型：PostStart|PreStop
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHookType(String HookType) {
        this.HookType = HookType;
    }

    /**
     * Get 函数执行方式：execCommand|httpGet|none
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecMode 函数执行方式：execCommand|httpGet|none
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecMode() {
        return this.ExecMode;
    }

    /**
     * Set 函数执行方式：execCommand|httpGet|none
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecMode 函数执行方式：execCommand|httpGet|none
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecMode(String ExecMode) {
        this.ExecMode = ExecMode;
    }

    /**
     * Get execCommand函数执行内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecCommandContent execCommand函数执行内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecCommandContent() {
        return this.ExecCommandContent;
    }

    /**
     * Set execCommand函数执行内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecCommandContent execCommand函数执行内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecCommandContent(String ExecCommandContent) {
        this.ExecCommandContent = ExecCommandContent;
    }

    /**
     * Get HttpGet执行内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HttpGetOption HttpGet执行内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HttpGetOption getHttpGetOption() {
        return this.HttpGetOption;
    }

    /**
     * Set HttpGet执行内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param HttpGetOption HttpGet执行内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHttpGetOption(HttpGetOption HttpGetOption) {
        this.HttpGetOption = HttpGetOption;
    }

    public LifeCycleHook() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LifeCycleHook(LifeCycleHook source) {
        if (source.HookType != null) {
            this.HookType = new String(source.HookType);
        }
        if (source.ExecMode != null) {
            this.ExecMode = new String(source.ExecMode);
        }
        if (source.ExecCommandContent != null) {
            this.ExecCommandContent = new String(source.ExecCommandContent);
        }
        if (source.HttpGetOption != null) {
            this.HttpGetOption = new HttpGetOption(source.HttpGetOption);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HookType", this.HookType);
        this.setParamSimple(map, prefix + "ExecMode", this.ExecMode);
        this.setParamSimple(map, prefix + "ExecCommandContent", this.ExecCommandContent);
        this.setParamObj(map, prefix + "HttpGetOption.", this.HttpGetOption);

    }
}

