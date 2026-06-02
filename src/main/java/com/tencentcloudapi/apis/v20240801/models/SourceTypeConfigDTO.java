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
package com.tencentcloudapi.apis.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SourceTypeConfigDTO extends AbstractModel {

    /**
    * json xml urlencoded amf0 amf3 hessian1 hessian2

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReqSourceType")
    @Expose
    private String ReqSourceType;

    /**
    * json xml urlencoded amf0 amf3 hessian1 hessian2

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReqTargetType")
    @Expose
    private String ReqTargetType;

    /**
    * json xml urlencoded amf0 amf3 hessian1 hessian2

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResSourceType")
    @Expose
    private String ResSourceType;

    /**
    * json xml urlencoded amf0 amf3 hessian1 hessian2

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResTargetType")
    @Expose
    private String ResTargetType;

    /**
     * Get json xml urlencoded amf0 amf3 hessian1 hessian2

注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReqSourceType json xml urlencoded amf0 amf3 hessian1 hessian2

注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReqSourceType() {
        return this.ReqSourceType;
    }

    /**
     * Set json xml urlencoded amf0 amf3 hessian1 hessian2

注意：此字段可能返回 null，表示取不到有效值。
     * @param ReqSourceType json xml urlencoded amf0 amf3 hessian1 hessian2

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReqSourceType(String ReqSourceType) {
        this.ReqSourceType = ReqSourceType;
    }

    /**
     * Get json xml urlencoded amf0 amf3 hessian1 hessian2

注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReqTargetType json xml urlencoded amf0 amf3 hessian1 hessian2

注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReqTargetType() {
        return this.ReqTargetType;
    }

    /**
     * Set json xml urlencoded amf0 amf3 hessian1 hessian2

注意：此字段可能返回 null，表示取不到有效值。
     * @param ReqTargetType json xml urlencoded amf0 amf3 hessian1 hessian2

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReqTargetType(String ReqTargetType) {
        this.ReqTargetType = ReqTargetType;
    }

    /**
     * Get json xml urlencoded amf0 amf3 hessian1 hessian2

注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResSourceType json xml urlencoded amf0 amf3 hessian1 hessian2

注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResSourceType() {
        return this.ResSourceType;
    }

    /**
     * Set json xml urlencoded amf0 amf3 hessian1 hessian2

注意：此字段可能返回 null，表示取不到有效值。
     * @param ResSourceType json xml urlencoded amf0 amf3 hessian1 hessian2

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResSourceType(String ResSourceType) {
        this.ResSourceType = ResSourceType;
    }

    /**
     * Get json xml urlencoded amf0 amf3 hessian1 hessian2

注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResTargetType json xml urlencoded amf0 amf3 hessian1 hessian2

注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResTargetType() {
        return this.ResTargetType;
    }

    /**
     * Set json xml urlencoded amf0 amf3 hessian1 hessian2

注意：此字段可能返回 null，表示取不到有效值。
     * @param ResTargetType json xml urlencoded amf0 amf3 hessian1 hessian2

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResTargetType(String ResTargetType) {
        this.ResTargetType = ResTargetType;
    }

    public SourceTypeConfigDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SourceTypeConfigDTO(SourceTypeConfigDTO source) {
        if (source.ReqSourceType != null) {
            this.ReqSourceType = new String(source.ReqSourceType);
        }
        if (source.ReqTargetType != null) {
            this.ReqTargetType = new String(source.ReqTargetType);
        }
        if (source.ResSourceType != null) {
            this.ResSourceType = new String(source.ResSourceType);
        }
        if (source.ResTargetType != null) {
            this.ResTargetType = new String(source.ResTargetType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReqSourceType", this.ReqSourceType);
        this.setParamSimple(map, prefix + "ReqTargetType", this.ReqTargetType);
        this.setParamSimple(map, prefix + "ResSourceType", this.ResSourceType);
        this.setParamSimple(map, prefix + "ResTargetType", this.ResTargetType);

    }
}

