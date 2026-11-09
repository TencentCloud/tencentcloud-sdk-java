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
    * <p>禁用暂存。 默认 false，设置为 true 会隐藏界面上的临时保存按钮</p>
    */
    @SerializedName("DisableTemporaryStore")
    @Expose
    private Boolean DisableTemporaryStore;

    /**
    * <p>禁用导出。默认 false，设置为 true 会隐藏界面上的导出按钮</p>
    */
    @SerializedName("DisableExport")
    @Expose
    private Boolean DisableExport;

    /**
    * <p>禁用重新审查。默认 false，设置为 true 会隐藏界面上的重新审查按钮</p>
    */
    @SerializedName("DisableReviewAgain")
    @Expose
    private Boolean DisableReviewAgain;

    /**
    * <p>禁用二维码分享。默认 false，设置为 true 会隐藏界面上的分享二维码</p>
    */
    @SerializedName("DisableWxQrcode")
    @Expose
    private Boolean DisableWxQrcode;

    /**
    * <p>禁用忽略风险。默认false，设置为true，会根据用户合同审查忽略风险权限点决定是否禁用忽略选项。</p>
    */
    @SerializedName("DisableIgnoreRisk")
    @Expose
    private Boolean DisableIgnoreRisk;

    /**
    * <p>关闭原文修改。默认false，设置为true，根据用户合同审查修订操作权限点决定能否修改、一键修订原文。</p>
    */
    @SerializedName("DisableRevisedRisk")
    @Expose
    private Boolean DisableRevisedRisk;

    /**
     * Get <p>禁用暂存。 默认 false，设置为 true 会隐藏界面上的临时保存按钮</p> 
     * @return DisableTemporaryStore <p>禁用暂存。 默认 false，设置为 true 会隐藏界面上的临时保存按钮</p>
     */
    public Boolean getDisableTemporaryStore() {
        return this.DisableTemporaryStore;
    }

    /**
     * Set <p>禁用暂存。 默认 false，设置为 true 会隐藏界面上的临时保存按钮</p>
     * @param DisableTemporaryStore <p>禁用暂存。 默认 false，设置为 true 会隐藏界面上的临时保存按钮</p>
     */
    public void setDisableTemporaryStore(Boolean DisableTemporaryStore) {
        this.DisableTemporaryStore = DisableTemporaryStore;
    }

    /**
     * Get <p>禁用导出。默认 false，设置为 true 会隐藏界面上的导出按钮</p> 
     * @return DisableExport <p>禁用导出。默认 false，设置为 true 会隐藏界面上的导出按钮</p>
     */
    public Boolean getDisableExport() {
        return this.DisableExport;
    }

    /**
     * Set <p>禁用导出。默认 false，设置为 true 会隐藏界面上的导出按钮</p>
     * @param DisableExport <p>禁用导出。默认 false，设置为 true 会隐藏界面上的导出按钮</p>
     */
    public void setDisableExport(Boolean DisableExport) {
        this.DisableExport = DisableExport;
    }

    /**
     * Get <p>禁用重新审查。默认 false，设置为 true 会隐藏界面上的重新审查按钮</p> 
     * @return DisableReviewAgain <p>禁用重新审查。默认 false，设置为 true 会隐藏界面上的重新审查按钮</p>
     */
    public Boolean getDisableReviewAgain() {
        return this.DisableReviewAgain;
    }

    /**
     * Set <p>禁用重新审查。默认 false，设置为 true 会隐藏界面上的重新审查按钮</p>
     * @param DisableReviewAgain <p>禁用重新审查。默认 false，设置为 true 会隐藏界面上的重新审查按钮</p>
     */
    public void setDisableReviewAgain(Boolean DisableReviewAgain) {
        this.DisableReviewAgain = DisableReviewAgain;
    }

    /**
     * Get <p>禁用二维码分享。默认 false，设置为 true 会隐藏界面上的分享二维码</p> 
     * @return DisableWxQrcode <p>禁用二维码分享。默认 false，设置为 true 会隐藏界面上的分享二维码</p>
     */
    public Boolean getDisableWxQrcode() {
        return this.DisableWxQrcode;
    }

    /**
     * Set <p>禁用二维码分享。默认 false，设置为 true 会隐藏界面上的分享二维码</p>
     * @param DisableWxQrcode <p>禁用二维码分享。默认 false，设置为 true 会隐藏界面上的分享二维码</p>
     */
    public void setDisableWxQrcode(Boolean DisableWxQrcode) {
        this.DisableWxQrcode = DisableWxQrcode;
    }

    /**
     * Get <p>禁用忽略风险。默认false，设置为true，会根据用户合同审查忽略风险权限点决定是否禁用忽略选项。</p> 
     * @return DisableIgnoreRisk <p>禁用忽略风险。默认false，设置为true，会根据用户合同审查忽略风险权限点决定是否禁用忽略选项。</p>
     */
    public Boolean getDisableIgnoreRisk() {
        return this.DisableIgnoreRisk;
    }

    /**
     * Set <p>禁用忽略风险。默认false，设置为true，会根据用户合同审查忽略风险权限点决定是否禁用忽略选项。</p>
     * @param DisableIgnoreRisk <p>禁用忽略风险。默认false，设置为true，会根据用户合同审查忽略风险权限点决定是否禁用忽略选项。</p>
     */
    public void setDisableIgnoreRisk(Boolean DisableIgnoreRisk) {
        this.DisableIgnoreRisk = DisableIgnoreRisk;
    }

    /**
     * Get <p>关闭原文修改。默认false，设置为true，根据用户合同审查修订操作权限点决定能否修改、一键修订原文。</p> 
     * @return DisableRevisedRisk <p>关闭原文修改。默认false，设置为true，根据用户合同审查修订操作权限点决定能否修改、一键修订原文。</p>
     */
    public Boolean getDisableRevisedRisk() {
        return this.DisableRevisedRisk;
    }

    /**
     * Set <p>关闭原文修改。默认false，设置为true，根据用户合同审查修订操作权限点决定能否修改、一键修订原文。</p>
     * @param DisableRevisedRisk <p>关闭原文修改。默认false，设置为true，根据用户合同审查修订操作权限点决定能否修改、一键修订原文。</p>
     */
    public void setDisableRevisedRisk(Boolean DisableRevisedRisk) {
        this.DisableRevisedRisk = DisableRevisedRisk;
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
        if (source.DisableIgnoreRisk != null) {
            this.DisableIgnoreRisk = new Boolean(source.DisableIgnoreRisk);
        }
        if (source.DisableRevisedRisk != null) {
            this.DisableRevisedRisk = new Boolean(source.DisableRevisedRisk);
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
        this.setParamSimple(map, prefix + "DisableIgnoreRisk", this.DisableIgnoreRisk);
        this.setParamSimple(map, prefix + "DisableRevisedRisk", this.DisableRevisedRisk);

    }
}

