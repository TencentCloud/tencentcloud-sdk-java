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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WebUrlOption extends AbstractModel {

    /**
    * 禁用链接预览
    */
    @SerializedName("DisableLinkPreview")
    @Expose
    private Boolean DisableLinkPreview;

    /**
    * 禁用任务编辑
    */
    @SerializedName("DisableTaskEditing")
    @Expose
    private Boolean DisableTaskEditing;

    /**
    * 禁用任务结果编辑
    */
    @SerializedName("DisableTaskResultEditing")
    @Expose
    private Boolean DisableTaskResultEditing;

    /**
     * Get 禁用链接预览 
     * @return DisableLinkPreview 禁用链接预览
     */
    public Boolean getDisableLinkPreview() {
        return this.DisableLinkPreview;
    }

    /**
     * Set 禁用链接预览
     * @param DisableLinkPreview 禁用链接预览
     */
    public void setDisableLinkPreview(Boolean DisableLinkPreview) {
        this.DisableLinkPreview = DisableLinkPreview;
    }

    /**
     * Get 禁用任务编辑 
     * @return DisableTaskEditing 禁用任务编辑
     */
    public Boolean getDisableTaskEditing() {
        return this.DisableTaskEditing;
    }

    /**
     * Set 禁用任务编辑
     * @param DisableTaskEditing 禁用任务编辑
     */
    public void setDisableTaskEditing(Boolean DisableTaskEditing) {
        this.DisableTaskEditing = DisableTaskEditing;
    }

    /**
     * Get 禁用任务结果编辑 
     * @return DisableTaskResultEditing 禁用任务结果编辑
     */
    public Boolean getDisableTaskResultEditing() {
        return this.DisableTaskResultEditing;
    }

    /**
     * Set 禁用任务结果编辑
     * @param DisableTaskResultEditing 禁用任务结果编辑
     */
    public void setDisableTaskResultEditing(Boolean DisableTaskResultEditing) {
        this.DisableTaskResultEditing = DisableTaskResultEditing;
    }

    public WebUrlOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WebUrlOption(WebUrlOption source) {
        if (source.DisableLinkPreview != null) {
            this.DisableLinkPreview = new Boolean(source.DisableLinkPreview);
        }
        if (source.DisableTaskEditing != null) {
            this.DisableTaskEditing = new Boolean(source.DisableTaskEditing);
        }
        if (source.DisableTaskResultEditing != null) {
            this.DisableTaskResultEditing = new Boolean(source.DisableTaskResultEditing);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DisableLinkPreview", this.DisableLinkPreview);
        this.setParamSimple(map, prefix + "DisableTaskEditing", this.DisableTaskEditing);
        this.setParamSimple(map, prefix + "DisableTaskResultEditing", this.DisableTaskResultEditing);

    }
}

