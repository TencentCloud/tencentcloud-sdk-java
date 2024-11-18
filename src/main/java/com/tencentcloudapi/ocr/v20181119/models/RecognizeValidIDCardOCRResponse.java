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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecognizeValidIDCardOCRResponse extends AbstractModel {

    /**
    * 卡证类型
身份证人像面
身份证国徽面

临时身份证人像面
临时身份证人像面

港澳台居住证人像面
港澳台居住证国徽面

外国人永久居留证人像面
外国人永久居留证国徽面
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 身份证信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IDCardInfo")
    @Expose
    private IDCardInfo IDCardInfo;

    /**
    * 临时身份证信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TemporaryIDCardInfo")
    @Expose
    private TemporaryIDCardInfo TemporaryIDCardInfo;

    /**
    * 港澳台居住证信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResidencePermitInfo")
    @Expose
    private ResidencePermitInfo ResidencePermitInfo;

    /**
    * 外国人永久居留证信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PermanentResidencePermitInfo")
    @Expose
    private PermanentResidencePermitInfo PermanentResidencePermitInfo;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 卡证类型
身份证人像面
身份证国徽面

临时身份证人像面
临时身份证人像面

港澳台居住证人像面
港澳台居住证国徽面

外国人永久居留证人像面
外国人永久居留证国徽面 
     * @return Type 卡证类型
身份证人像面
身份证国徽面

临时身份证人像面
临时身份证人像面

港澳台居住证人像面
港澳台居住证国徽面

外国人永久居留证人像面
外国人永久居留证国徽面
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 卡证类型
身份证人像面
身份证国徽面

临时身份证人像面
临时身份证人像面

港澳台居住证人像面
港澳台居住证国徽面

外国人永久居留证人像面
外国人永久居留证国徽面
     * @param Type 卡证类型
身份证人像面
身份证国徽面

临时身份证人像面
临时身份证人像面

港澳台居住证人像面
港澳台居住证国徽面

外国人永久居留证人像面
外国人永久居留证国徽面
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 身份证信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IDCardInfo 身份证信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IDCardInfo getIDCardInfo() {
        return this.IDCardInfo;
    }

    /**
     * Set 身份证信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param IDCardInfo 身份证信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIDCardInfo(IDCardInfo IDCardInfo) {
        this.IDCardInfo = IDCardInfo;
    }

    /**
     * Get 临时身份证信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TemporaryIDCardInfo 临时身份证信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TemporaryIDCardInfo getTemporaryIDCardInfo() {
        return this.TemporaryIDCardInfo;
    }

    /**
     * Set 临时身份证信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param TemporaryIDCardInfo 临时身份证信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTemporaryIDCardInfo(TemporaryIDCardInfo TemporaryIDCardInfo) {
        this.TemporaryIDCardInfo = TemporaryIDCardInfo;
    }

    /**
     * Get 港澳台居住证信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResidencePermitInfo 港澳台居住证信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResidencePermitInfo getResidencePermitInfo() {
        return this.ResidencePermitInfo;
    }

    /**
     * Set 港澳台居住证信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResidencePermitInfo 港澳台居住证信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResidencePermitInfo(ResidencePermitInfo ResidencePermitInfo) {
        this.ResidencePermitInfo = ResidencePermitInfo;
    }

    /**
     * Get 外国人永久居留证信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PermanentResidencePermitInfo 外国人永久居留证信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PermanentResidencePermitInfo getPermanentResidencePermitInfo() {
        return this.PermanentResidencePermitInfo;
    }

    /**
     * Set 外国人永久居留证信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param PermanentResidencePermitInfo 外国人永久居留证信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPermanentResidencePermitInfo(PermanentResidencePermitInfo PermanentResidencePermitInfo) {
        this.PermanentResidencePermitInfo = PermanentResidencePermitInfo;
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

    public RecognizeValidIDCardOCRResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecognizeValidIDCardOCRResponse(RecognizeValidIDCardOCRResponse source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.IDCardInfo != null) {
            this.IDCardInfo = new IDCardInfo(source.IDCardInfo);
        }
        if (source.TemporaryIDCardInfo != null) {
            this.TemporaryIDCardInfo = new TemporaryIDCardInfo(source.TemporaryIDCardInfo);
        }
        if (source.ResidencePermitInfo != null) {
            this.ResidencePermitInfo = new ResidencePermitInfo(source.ResidencePermitInfo);
        }
        if (source.PermanentResidencePermitInfo != null) {
            this.PermanentResidencePermitInfo = new PermanentResidencePermitInfo(source.PermanentResidencePermitInfo);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "IDCardInfo.", this.IDCardInfo);
        this.setParamObj(map, prefix + "TemporaryIDCardInfo.", this.TemporaryIDCardInfo);
        this.setParamObj(map, prefix + "ResidencePermitInfo.", this.ResidencePermitInfo);
        this.setParamObj(map, prefix + "PermanentResidencePermitInfo.", this.PermanentResidencePermitInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

