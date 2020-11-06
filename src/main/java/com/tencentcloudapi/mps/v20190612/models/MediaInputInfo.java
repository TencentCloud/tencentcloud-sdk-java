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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaInputInfo extends AbstractModel{

    /**
    * 输入来源对象的类型，支持 COS 和 URL 两种。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 当 Type 为 COS 时有效，则该项为必填，表示视频处理 COS 对象信息。
    */
    @SerializedName("CosInputInfo")
    @Expose
    private CosInputInfo CosInputInfo;

    /**
    * 当 Type 为 URL 时有效，则该项为必填，表示视频处理 URL 对象信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UrlInputInfo")
    @Expose
    private UrlInputInfo UrlInputInfo;

    /**
     * Get 输入来源对象的类型，支持 COS 和 URL 两种。 
     * @return Type 输入来源对象的类型，支持 COS 和 URL 两种。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 输入来源对象的类型，支持 COS 和 URL 两种。
     * @param Type 输入来源对象的类型，支持 COS 和 URL 两种。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 当 Type 为 COS 时有效，则该项为必填，表示视频处理 COS 对象信息。 
     * @return CosInputInfo 当 Type 为 COS 时有效，则该项为必填，表示视频处理 COS 对象信息。
     */
    public CosInputInfo getCosInputInfo() {
        return this.CosInputInfo;
    }

    /**
     * Set 当 Type 为 COS 时有效，则该项为必填，表示视频处理 COS 对象信息。
     * @param CosInputInfo 当 Type 为 COS 时有效，则该项为必填，表示视频处理 COS 对象信息。
     */
    public void setCosInputInfo(CosInputInfo CosInputInfo) {
        this.CosInputInfo = CosInputInfo;
    }

    /**
     * Get 当 Type 为 URL 时有效，则该项为必填，表示视频处理 URL 对象信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UrlInputInfo 当 Type 为 URL 时有效，则该项为必填，表示视频处理 URL 对象信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UrlInputInfo getUrlInputInfo() {
        return this.UrlInputInfo;
    }

    /**
     * Set 当 Type 为 URL 时有效，则该项为必填，表示视频处理 URL 对象信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UrlInputInfo 当 Type 为 URL 时有效，则该项为必填，表示视频处理 URL 对象信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUrlInputInfo(UrlInputInfo UrlInputInfo) {
        this.UrlInputInfo = UrlInputInfo;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "CosInputInfo.", this.CosInputInfo);
        this.setParamObj(map, prefix + "UrlInputInfo.", this.UrlInputInfo);

    }
}

