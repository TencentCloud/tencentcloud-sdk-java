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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReconstructDocumentResponse extends AbstractModel {

    /**
    * 识别生成的Markdown文件base64编码的字符串
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MarkdownBase64")
    @Expose
    private String MarkdownBase64;

    /**
    * 输入文件中嵌入的图片放在一个文件夹中打包为.zip压缩文件，识别生成的Markdown文件通过路径关联插入本文件夹中的图片。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InsetImagePackage")
    @Expose
    private String InsetImagePackage;

    /**
    * 输入文件中嵌入的图片中文字内容的识别结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DocumentRecognizeInfo")
    @Expose
    private DocumentRecognizeInfo [] DocumentRecognizeInfo;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 识别生成的Markdown文件base64编码的字符串
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MarkdownBase64 识别生成的Markdown文件base64编码的字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMarkdownBase64() {
        return this.MarkdownBase64;
    }

    /**
     * Set 识别生成的Markdown文件base64编码的字符串
注意：此字段可能返回 null，表示取不到有效值。
     * @param MarkdownBase64 识别生成的Markdown文件base64编码的字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMarkdownBase64(String MarkdownBase64) {
        this.MarkdownBase64 = MarkdownBase64;
    }

    /**
     * Get 输入文件中嵌入的图片放在一个文件夹中打包为.zip压缩文件，识别生成的Markdown文件通过路径关联插入本文件夹中的图片。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InsetImagePackage 输入文件中嵌入的图片放在一个文件夹中打包为.zip压缩文件，识别生成的Markdown文件通过路径关联插入本文件夹中的图片。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInsetImagePackage() {
        return this.InsetImagePackage;
    }

    /**
     * Set 输入文件中嵌入的图片放在一个文件夹中打包为.zip压缩文件，识别生成的Markdown文件通过路径关联插入本文件夹中的图片。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InsetImagePackage 输入文件中嵌入的图片放在一个文件夹中打包为.zip压缩文件，识别生成的Markdown文件通过路径关联插入本文件夹中的图片。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInsetImagePackage(String InsetImagePackage) {
        this.InsetImagePackage = InsetImagePackage;
    }

    /**
     * Get 输入文件中嵌入的图片中文字内容的识别结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DocumentRecognizeInfo 输入文件中嵌入的图片中文字内容的识别结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DocumentRecognizeInfo [] getDocumentRecognizeInfo() {
        return this.DocumentRecognizeInfo;
    }

    /**
     * Set 输入文件中嵌入的图片中文字内容的识别结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param DocumentRecognizeInfo 输入文件中嵌入的图片中文字内容的识别结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDocumentRecognizeInfo(DocumentRecognizeInfo [] DocumentRecognizeInfo) {
        this.DocumentRecognizeInfo = DocumentRecognizeInfo;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public ReconstructDocumentResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReconstructDocumentResponse(ReconstructDocumentResponse source) {
        if (source.MarkdownBase64 != null) {
            this.MarkdownBase64 = new String(source.MarkdownBase64);
        }
        if (source.InsetImagePackage != null) {
            this.InsetImagePackage = new String(source.InsetImagePackage);
        }
        if (source.DocumentRecognizeInfo != null) {
            this.DocumentRecognizeInfo = new DocumentRecognizeInfo[source.DocumentRecognizeInfo.length];
            for (int i = 0; i < source.DocumentRecognizeInfo.length; i++) {
                this.DocumentRecognizeInfo[i] = new DocumentRecognizeInfo(source.DocumentRecognizeInfo[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MarkdownBase64", this.MarkdownBase64);
        this.setParamSimple(map, prefix + "InsetImagePackage", this.InsetImagePackage);
        this.setParamArrayObj(map, prefix + "DocumentRecognizeInfo.", this.DocumentRecognizeInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

