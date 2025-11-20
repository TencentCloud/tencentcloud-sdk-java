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

public class ContractReviewWebUrlOption extends AbstractModel {

    /**
    * 禁用暂存。 默认 false，设置为 true 会隐藏界面上的临时保存按钮
    */
    @SerializedName("DisableTemporaryStore")
    @Expose
    private Boolean DisableTemporaryStore;

    /**
    * 禁用导出。默认 false，设置为 true 会隐藏界面上的导出按钮
    */
    @SerializedName("DisableExport")
    @Expose
    private Boolean DisableExport;

    /**
    * 禁用重新审查。默认 false，设置为 true 会隐藏界面上的重新审查按钮
    */
    @SerializedName("DisableReviewAgain")
    @Expose
    private Boolean DisableReviewAgain;

    /**
    * 禁用二维码分享。默认 false，设置为 true 会隐藏界面上的分享二维码
    */
    @SerializedName("DisableWxQrcode")
    @Expose
    private Boolean DisableWxQrcode;

    /**
     * Get 禁用暂存。 默认 false，设置为 true 会隐藏界面上的临时保存按钮 
     * @return DisableTemporaryStore 禁用暂存。 默认 false，设置为 true 会隐藏界面上的临时保存按钮
     */
    public Boolean getDisableTemporaryStore() {
        return this.DisableTemporaryStore;
    }

    /**
     * Set 禁用暂存。 默认 false，设置为 true 会隐藏界面上的临时保存按钮
     * @param DisableTemporaryStore 禁用暂存。 默认 false，设置为 true 会隐藏界面上的临时保存按钮
     */
    public void setDisableTemporaryStore(Boolean DisableTemporaryStore) {
        this.DisableTemporaryStore = DisableTemporaryStore;
    }

    /**
     * Get 禁用导出。默认 false，设置为 true 会隐藏界面上的导出按钮 
     * @return DisableExport 禁用导出。默认 false，设置为 true 会隐藏界面上的导出按钮
     */
    public Boolean getDisableExport() {
        return this.DisableExport;
    }

    /**
     * Set 禁用导出。默认 false，设置为 true 会隐藏界面上的导出按钮
     * @param DisableExport 禁用导出。默认 false，设置为 true 会隐藏界面上的导出按钮
     */
    public void setDisableExport(Boolean DisableExport) {
        this.DisableExport = DisableExport;
    }

    /**
     * Get 禁用重新审查。默认 false，设置为 true 会隐藏界面上的重新审查按钮 
     * @return DisableReviewAgain 禁用重新审查。默认 false，设置为 true 会隐藏界面上的重新审查按钮
     */
    public Boolean getDisableReviewAgain() {
        return this.DisableReviewAgain;
    }

    /**
     * Set 禁用重新审查。默认 false，设置为 true 会隐藏界面上的重新审查按钮
     * @param DisableReviewAgain 禁用重新审查。默认 false，设置为 true 会隐藏界面上的重新审查按钮
     */
    public void setDisableReviewAgain(Boolean DisableReviewAgain) {
        this.DisableReviewAgain = DisableReviewAgain;
    }

    /**
     * Get 禁用二维码分享。默认 false，设置为 true 会隐藏界面上的分享二维码 
     * @return DisableWxQrcode 禁用二维码分享。默认 false，设置为 true 会隐藏界面上的分享二维码
     */
    public Boolean getDisableWxQrcode() {
        return this.DisableWxQrcode;
    }

    /**
     * Set 禁用二维码分享。默认 false，设置为 true 会隐藏界面上的分享二维码
     * @param DisableWxQrcode 禁用二维码分享。默认 false，设置为 true 会隐藏界面上的分享二维码
     */
    public void setDisableWxQrcode(Boolean DisableWxQrcode) {
        this.DisableWxQrcode = DisableWxQrcode;
    }

    public ContractReviewWebUrlOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContractReviewWebUrlOption(ContractReviewWebUrlOption source) {
        if (source.DisableTemporaryStore != null) {
            this.DisableTemporaryStore = new Boolean(source.DisableTemporaryStore);
        }
        if (source.DisableExport != null) {
            this.DisableExport = new Boolean(source.DisableExport);
        }
        if (source.DisableReviewAgain != null) {
            this.DisableReviewAgain = new Boolean(source.DisableReviewAgain);
        }
        if (source.DisableWxQrcode != null) {
            this.DisableWxQrcode = new Boolean(source.DisableWxQrcode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DisableTemporaryStore", this.DisableTemporaryStore);
        this.setParamSimple(map, prefix + "DisableExport", this.DisableExport);
        this.setParamSimple(map, prefix + "DisableReviewAgain", this.DisableReviewAgain);
        this.setParamSimple(map, prefix + "DisableWxQrcode", this.DisableWxQrcode);

    }
}

