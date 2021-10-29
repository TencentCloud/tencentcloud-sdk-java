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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetEidResultResponse extends AbstractModel{

    /**
    * 文本类信息。（基于对敏感信息的保护，验证使用的姓名和身份证号统一通过加密后从Eidinfo参数中返回，如需获取请在控制台申请返回身份信息，详见[E证通获取实名信息指引](https://cloud.tencent.com/document/product/1007/63370)）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Text")
    @Expose
    private DetectInfoText Text;

    /**
    * 身份证照片信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IdCardData")
    @Expose
    private DetectInfoIdCardData IdCardData;

    /**
    * 最佳帧信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BestFrame")
    @Expose
    private DetectInfoBestFrame BestFrame;

    /**
    * Eid信息。（包括商户下用户唯一标识以及加密后的姓名、身份证号信息。解密方式详见[E证通获取实名信息指引](https://cloud.tencent.com/document/product/1007/63370)）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EidInfo")
    @Expose
    private EidInfo EidInfo;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 文本类信息。（基于对敏感信息的保护，验证使用的姓名和身份证号统一通过加密后从Eidinfo参数中返回，如需获取请在控制台申请返回身份信息，详见[E证通获取实名信息指引](https://cloud.tencent.com/document/product/1007/63370)）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Text 文本类信息。（基于对敏感信息的保护，验证使用的姓名和身份证号统一通过加密后从Eidinfo参数中返回，如需获取请在控制台申请返回身份信息，详见[E证通获取实名信息指引](https://cloud.tencent.com/document/product/1007/63370)）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DetectInfoText getText() {
        return this.Text;
    }

    /**
     * Set 文本类信息。（基于对敏感信息的保护，验证使用的姓名和身份证号统一通过加密后从Eidinfo参数中返回，如需获取请在控制台申请返回身份信息，详见[E证通获取实名信息指引](https://cloud.tencent.com/document/product/1007/63370)）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Text 文本类信息。（基于对敏感信息的保护，验证使用的姓名和身份证号统一通过加密后从Eidinfo参数中返回，如需获取请在控制台申请返回身份信息，详见[E证通获取实名信息指引](https://cloud.tencent.com/document/product/1007/63370)）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setText(DetectInfoText Text) {
        this.Text = Text;
    }

    /**
     * Get 身份证照片信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IdCardData 身份证照片信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DetectInfoIdCardData getIdCardData() {
        return this.IdCardData;
    }

    /**
     * Set 身份证照片信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IdCardData 身份证照片信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdCardData(DetectInfoIdCardData IdCardData) {
        this.IdCardData = IdCardData;
    }

    /**
     * Get 最佳帧信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BestFrame 最佳帧信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DetectInfoBestFrame getBestFrame() {
        return this.BestFrame;
    }

    /**
     * Set 最佳帧信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BestFrame 最佳帧信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBestFrame(DetectInfoBestFrame BestFrame) {
        this.BestFrame = BestFrame;
    }

    /**
     * Get Eid信息。（包括商户下用户唯一标识以及加密后的姓名、身份证号信息。解密方式详见[E证通获取实名信息指引](https://cloud.tencent.com/document/product/1007/63370)）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EidInfo Eid信息。（包括商户下用户唯一标识以及加密后的姓名、身份证号信息。解密方式详见[E证通获取实名信息指引](https://cloud.tencent.com/document/product/1007/63370)）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EidInfo getEidInfo() {
        return this.EidInfo;
    }

    /**
     * Set Eid信息。（包括商户下用户唯一标识以及加密后的姓名、身份证号信息。解密方式详见[E证通获取实名信息指引](https://cloud.tencent.com/document/product/1007/63370)）
注意：此字段可能返回 null，表示取不到有效值。
     * @param EidInfo Eid信息。（包括商户下用户唯一标识以及加密后的姓名、身份证号信息。解密方式详见[E证通获取实名信息指引](https://cloud.tencent.com/document/product/1007/63370)）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEidInfo(EidInfo EidInfo) {
        this.EidInfo = EidInfo;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public GetEidResultResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetEidResultResponse(GetEidResultResponse source) {
        if (source.Text != null) {
            this.Text = new DetectInfoText(source.Text);
        }
        if (source.IdCardData != null) {
            this.IdCardData = new DetectInfoIdCardData(source.IdCardData);
        }
        if (source.BestFrame != null) {
            this.BestFrame = new DetectInfoBestFrame(source.BestFrame);
        }
        if (source.EidInfo != null) {
            this.EidInfo = new EidInfo(source.EidInfo);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Text.", this.Text);
        this.setParamObj(map, prefix + "IdCardData.", this.IdCardData);
        this.setParamObj(map, prefix + "BestFrame.", this.BestFrame);
        this.setParamObj(map, prefix + "EidInfo.", this.EidInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

