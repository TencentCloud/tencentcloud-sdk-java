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

public class FlowRemarkItem extends AbstractModel {

    /**
    * <p>合同备注下标，对应最多5个备注位</p><p>取值范围：[0, 4]</p>
    */
    @SerializedName("RemarkId")
    @Expose
    private Long RemarkId;

    /**
    * <p>合同备注内容，不超过 50 个字符，DELETE 时无需传入</p>
    */
    @SerializedName("RemarkValue")
    @Expose
    private String RemarkValue;

    /**
     * Get <p>合同备注下标，对应最多5个备注位</p><p>取值范围：[0, 4]</p> 
     * @return RemarkId <p>合同备注下标，对应最多5个备注位</p><p>取值范围：[0, 4]</p>
     */
    public Long getRemarkId() {
        return this.RemarkId;
    }

    /**
     * Set <p>合同备注下标，对应最多5个备注位</p><p>取值范围：[0, 4]</p>
     * @param RemarkId <p>合同备注下标，对应最多5个备注位</p><p>取值范围：[0, 4]</p>
     */
    public void setRemarkId(Long RemarkId) {
        this.RemarkId = RemarkId;
    }

    /**
     * Get <p>合同备注内容，不超过 50 个字符，DELETE 时无需传入</p> 
     * @return RemarkValue <p>合同备注内容，不超过 50 个字符，DELETE 时无需传入</p>
     */
    public String getRemarkValue() {
        return this.RemarkValue;
    }

    /**
     * Set <p>合同备注内容，不超过 50 个字符，DELETE 时无需传入</p>
     * @param RemarkValue <p>合同备注内容，不超过 50 个字符，DELETE 时无需传入</p>
     */
    public void setRemarkValue(String RemarkValue) {
        this.RemarkValue = RemarkValue;
    }

    public FlowRemarkItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowRemarkItem(FlowRemarkItem source) {
        if (source.RemarkId != null) {
            this.RemarkId = new Long(source.RemarkId);
        }
        if (source.RemarkValue != null) {
            this.RemarkValue = new String(source.RemarkValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RemarkId", this.RemarkId);
        this.setParamSimple(map, prefix + "RemarkValue", this.RemarkValue);

    }
}

