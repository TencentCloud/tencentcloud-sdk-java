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

public class ContractReviewChecklistWebUrlOption extends AbstractModel {

    /**
    * 禁用新建清单功能。默认 false，设置为 true 会隐藏界面的新建按钮。
    */
    @SerializedName("DisableCreateChecklist")
    @Expose
    private Boolean DisableCreateChecklist;

    /**
     * Get 禁用新建清单功能。默认 false，设置为 true 会隐藏界面的新建按钮。 
     * @return DisableCreateChecklist 禁用新建清单功能。默认 false，设置为 true 会隐藏界面的新建按钮。
     */
    public Boolean getDisableCreateChecklist() {
        return this.DisableCreateChecklist;
    }

    /**
     * Set 禁用新建清单功能。默认 false，设置为 true 会隐藏界面的新建按钮。
     * @param DisableCreateChecklist 禁用新建清单功能。默认 false，设置为 true 会隐藏界面的新建按钮。
     */
    public void setDisableCreateChecklist(Boolean DisableCreateChecklist) {
        this.DisableCreateChecklist = DisableCreateChecklist;
    }

    public ContractReviewChecklistWebUrlOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContractReviewChecklistWebUrlOption(ContractReviewChecklistWebUrlOption source) {
        if (source.DisableCreateChecklist != null) {
            this.DisableCreateChecklist = new Boolean(source.DisableCreateChecklist);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DisableCreateChecklist", this.DisableCreateChecklist);

    }
}

