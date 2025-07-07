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

public class MediaInputInfo extends AbstractModel {

    /**
    * 输入来源对象的类型，支持：
<li> COS：COS源</li>
<li> URL：URL源</li>
<li> AWS-S3：AWS 源，目前只支持转码任务 </li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 当 Type 为 COS 时有效，则该项为必填，表示媒体处理 COS 对象信息。
    */
    @SerializedName("CosInputInfo")
    @Expose
    private CosInputInfo CosInputInfo;

    /**
    * 当 Type 为 URL 时有效，则该项为必填，表示媒体处理 URL 对象信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UrlInputInfo")
    @Expose
    private UrlInputInfo UrlInputInfo;

    /**
    * 当 Type 为 AWS-S3 时有效，则该项为必填，表示媒体处理 AWS S3 对象信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("S3InputInfo")
    @Expose
    private S3InputInfo S3InputInfo;

    /**
     * Get 输入来源对象的类型，支持：
<li> COS：COS源</li>
<li> URL：URL源</li>
<li> AWS-S3：AWS 源，目前只支持转码任务 </li> 
     * @return Type 输入来源对象的类型，支持：
<li> COS：COS源</li>
<li> URL：URL源</li>
<li> AWS-S3：AWS 源，目前只支持转码任务 </li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 输入来源对象的类型，支持：
<li> COS：COS源</li>
<li> URL：URL源</li>
<li> AWS-S3：AWS 源，目前只支持转码任务 </li>
     * @param Type 输入来源对象的类型，支持：
<li> COS：COS源</li>
<li> URL：URL源</li>
<li> AWS-S3：AWS 源，目前只支持转码任务 </li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 当 Type 为 COS 时有效，则该项为必填，表示媒体处理 COS 对象信息。 
     * @return CosInputInfo 当 Type 为 COS 时有效，则该项为必填，表示媒体处理 COS 对象信息。
     */
    public CosInputInfo getCosInputInfo() {
        return this.CosInputInfo;
    }

    /**
     * Set 当 Type 为 COS 时有效，则该项为必填，表示媒体处理 COS 对象信息。
     * @param CosInputInfo 当 Type 为 COS 时有效，则该项为必填，表示媒体处理 COS 对象信息。
     */
    public void setCosInputInfo(CosInputInfo CosInputInfo) {
        this.CosInputInfo = CosInputInfo;
    }

    /**
     * Get 当 Type 为 URL 时有效，则该项为必填，表示媒体处理 URL 对象信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UrlInputInfo 当 Type 为 URL 时有效，则该项为必填，表示媒体处理 URL 对象信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UrlInputInfo getUrlInputInfo() {
        return this.UrlInputInfo;
    }

    /**
     * Set 当 Type 为 URL 时有效，则该项为必填，表示媒体处理 URL 对象信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UrlInputInfo 当 Type 为 URL 时有效，则该项为必填，表示媒体处理 URL 对象信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUrlInputInfo(UrlInputInfo UrlInputInfo) {
        this.UrlInputInfo = UrlInputInfo;
    }

    /**
     * Get 当 Type 为 AWS-S3 时有效，则该项为必填，表示媒体处理 AWS S3 对象信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return S3InputInfo 当 Type 为 AWS-S3 时有效，则该项为必填，表示媒体处理 AWS S3 对象信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public S3InputInfo getS3InputInfo() {
        return this.S3InputInfo;
    }

    /**
     * Set 当 Type 为 AWS-S3 时有效，则该项为必填，表示媒体处理 AWS S3 对象信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param S3InputInfo 当 Type 为 AWS-S3 时有效，则该项为必填，表示媒体处理 AWS S3 对象信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setS3InputInfo(S3InputInfo S3InputInfo) {
        this.S3InputInfo = S3InputInfo;
    }

    public MediaInputInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaInputInfo(MediaInputInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.CosInputInfo != null) {
            this.CosInputInfo = new CosInputInfo(source.CosInputInfo);
        }
        if (source.UrlInputInfo != null) {
            this.UrlInputInfo = new UrlInputInfo(source.UrlInputInfo);
        }
        if (source.S3InputInfo != null) {
            this.S3InputInfo = new S3InputInfo(source.S3InputInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "CosInputInfo.", this.CosInputInfo);
        this.setParamObj(map, prefix + "UrlInputInfo.", this.UrlInputInfo);
        this.setParamObj(map, prefix + "S3InputInfo.", this.S3InputInfo);

    }
}

