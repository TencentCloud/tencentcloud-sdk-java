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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDSPAClusterInfoRequest extends AbstractModel {

    /**
    * DSPA实例ID。
    */
    @SerializedName("DspaId")
    @Expose
    private String DspaId;

    /**
    * DSPA实例名。1-60个字符，仅允许输入中文、英文字母、数字、'_'、'-'，并且开头和结尾需为中文、英文字母或者数字。
    */
    @SerializedName("DspaName")
    @Expose
    private String DspaName;

    /**
    * DSPA实例描述信息。最长1024个字符。
    */
    @SerializedName("DspaDescription")
    @Expose
    private String DspaDescription;

    /**
     * Get DSPA实例ID。 
     * @return DspaId DSPA实例ID。
     */
    public String getDspaId() {
        return this.DspaId;
    }

    /**
     * Set DSPA实例ID。
     * @param DspaId DSPA实例ID。
     */
    public void setDspaId(String DspaId) {
        this.DspaId = DspaId;
    }

    /**
     * Get DSPA实例名。1-60个字符，仅允许输入中文、英文字母、数字、'_'、'-'，并且开头和结尾需为中文、英文字母或者数字。 
     * @return DspaName DSPA实例名。1-60个字符，仅允许输入中文、英文字母、数字、'_'、'-'，并且开头和结尾需为中文、英文字母或者数字。
     */
    public String getDspaName() {
        return this.DspaName;
    }

    /**
     * Set DSPA实例名。1-60个字符，仅允许输入中文、英文字母、数字、'_'、'-'，并且开头和结尾需为中文、英文字母或者数字。
     * @param DspaName DSPA实例名。1-60个字符，仅允许输入中文、英文字母、数字、'_'、'-'，并且开头和结尾需为中文、英文字母或者数字。
     */
    public void setDspaName(String DspaName) {
        this.DspaName = DspaName;
    }

    /**
     * Get DSPA实例描述信息。最长1024个字符。 
     * @return DspaDescription DSPA实例描述信息。最长1024个字符。
     */
    public String getDspaDescription() {
        return this.DspaDescription;
    }

    /**
     * Set DSPA实例描述信息。最长1024个字符。
     * @param DspaDescription DSPA实例描述信息。最长1024个字符。
     */
    public void setDspaDescription(String DspaDescription) {
        this.DspaDescription = DspaDescription;
    }

    public ModifyDSPAClusterInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDSPAClusterInfoRequest(ModifyDSPAClusterInfoRequest source) {
        if (source.DspaId != null) {
            this.DspaId = new String(source.DspaId);
        }
        if (source.DspaName != null) {
            this.DspaName = new String(source.DspaName);
        }
        if (source.DspaDescription != null) {
            this.DspaDescription = new String(source.DspaDescription);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DspaId", this.DspaId);
        this.setParamSimple(map, prefix + "DspaName", this.DspaName);
        this.setParamSimple(map, prefix + "DspaDescription", this.DspaDescription);

    }
}

