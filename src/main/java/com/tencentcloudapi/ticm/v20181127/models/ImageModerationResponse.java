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
package com.tencentcloudapi.ticm.v20181127.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageModerationResponse extends AbstractModel{

    /**
    * 识别场景的审核结论：
PASS：正常
REVIEW：疑似
BLOCK：违规
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * 色情识别结果。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PornResult")
    @Expose
    private PornResult PornResult;

    /**
    * 暴恐识别结果。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TerrorismResult")
    @Expose
    private TerrorismResult TerrorismResult;

    /**
    * 政治敏感识别结果。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PoliticsResult")
    @Expose
    private PoliticsResult PoliticsResult;

    /**
    * 透传字段，透传简单信息。
    */
    @SerializedName("Extra")
    @Expose
    private String Extra;

    /**
    * 恶心内容识别结果。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DisgustResult")
    @Expose
    private DisgustResult DisgustResult;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 识别场景的审核结论：
PASS：正常
REVIEW：疑似
BLOCK：违规 
     * @return Suggestion 识别场景的审核结论：
PASS：正常
REVIEW：疑似
BLOCK：违规
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set 识别场景的审核结论：
PASS：正常
REVIEW：疑似
BLOCK：违规
     * @param Suggestion 识别场景的审核结论：
PASS：正常
REVIEW：疑似
BLOCK：违规
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get 色情识别结果。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PornResult 色情识别结果。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PornResult getPornResult() {
        return this.PornResult;
    }

    /**
     * Set 色情识别结果。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PornResult 色情识别结果。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPornResult(PornResult PornResult) {
        this.PornResult = PornResult;
    }

    /**
     * Get 暴恐识别结果。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TerrorismResult 暴恐识别结果。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TerrorismResult getTerrorismResult() {
        return this.TerrorismResult;
    }

    /**
     * Set 暴恐识别结果。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TerrorismResult 暴恐识别结果。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTerrorismResult(TerrorismResult TerrorismResult) {
        this.TerrorismResult = TerrorismResult;
    }

    /**
     * Get 政治敏感识别结果。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PoliticsResult 政治敏感识别结果。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PoliticsResult getPoliticsResult() {
        return this.PoliticsResult;
    }

    /**
     * Set 政治敏感识别结果。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PoliticsResult 政治敏感识别结果。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPoliticsResult(PoliticsResult PoliticsResult) {
        this.PoliticsResult = PoliticsResult;
    }

    /**
     * Get 透传字段，透传简单信息。 
     * @return Extra 透传字段，透传简单信息。
     */
    public String getExtra() {
        return this.Extra;
    }

    /**
     * Set 透传字段，透传简单信息。
     * @param Extra 透传字段，透传简单信息。
     */
    public void setExtra(String Extra) {
        this.Extra = Extra;
    }

    /**
     * Get 恶心内容识别结果。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DisgustResult 恶心内容识别结果。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DisgustResult getDisgustResult() {
        return this.DisgustResult;
    }

    /**
     * Set 恶心内容识别结果。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DisgustResult 恶心内容识别结果。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDisgustResult(DisgustResult DisgustResult) {
        this.DisgustResult = DisgustResult;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamObj(map, prefix + "PornResult.", this.PornResult);
        this.setParamObj(map, prefix + "TerrorismResult.", this.TerrorismResult);
        this.setParamObj(map, prefix + "PoliticsResult.", this.PoliticsResult);
        this.setParamSimple(map, prefix + "Extra", this.Extra);
        this.setParamObj(map, prefix + "DisgustResult.", this.DisgustResult);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

