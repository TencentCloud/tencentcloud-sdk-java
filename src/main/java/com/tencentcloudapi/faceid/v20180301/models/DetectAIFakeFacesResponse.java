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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetectAIFakeFacesResponse extends AbstractModel {

    /**
    * 检测到的图片是否存在攻击。
- Low：无攻击风险。
- Mid：中度疑似攻击。
- High：高度疑似攻击。
    */
    @SerializedName("AttackRiskLevel")
    @Expose
    private String AttackRiskLevel;

    /**
    * 检测到疑似的攻击痕迹列表。
- 说明：未检测到攻击痕迹时，返回空数组。
- 此出参仅作为结果判断的参考，实际应用仍建议使用AttackRiskLevel的结果。
    */
    @SerializedName("AttackRiskDetailList")
    @Expose
    private AttackRiskDetail [] AttackRiskDetailList;

    /**
    * 额外信息。
    */
    @SerializedName("ExtraInfo")
    @Expose
    private ExtraInfo ExtraInfo;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 检测到的图片是否存在攻击。
- Low：无攻击风险。
- Mid：中度疑似攻击。
- High：高度疑似攻击。 
     * @return AttackRiskLevel 检测到的图片是否存在攻击。
- Low：无攻击风险。
- Mid：中度疑似攻击。
- High：高度疑似攻击。
     */
    public String getAttackRiskLevel() {
        return this.AttackRiskLevel;
    }

    /**
     * Set 检测到的图片是否存在攻击。
- Low：无攻击风险。
- Mid：中度疑似攻击。
- High：高度疑似攻击。
     * @param AttackRiskLevel 检测到的图片是否存在攻击。
- Low：无攻击风险。
- Mid：中度疑似攻击。
- High：高度疑似攻击。
     */
    public void setAttackRiskLevel(String AttackRiskLevel) {
        this.AttackRiskLevel = AttackRiskLevel;
    }

    /**
     * Get 检测到疑似的攻击痕迹列表。
- 说明：未检测到攻击痕迹时，返回空数组。
- 此出参仅作为结果判断的参考，实际应用仍建议使用AttackRiskLevel的结果。 
     * @return AttackRiskDetailList 检测到疑似的攻击痕迹列表。
- 说明：未检测到攻击痕迹时，返回空数组。
- 此出参仅作为结果判断的参考，实际应用仍建议使用AttackRiskLevel的结果。
     */
    public AttackRiskDetail [] getAttackRiskDetailList() {
        return this.AttackRiskDetailList;
    }

    /**
     * Set 检测到疑似的攻击痕迹列表。
- 说明：未检测到攻击痕迹时，返回空数组。
- 此出参仅作为结果判断的参考，实际应用仍建议使用AttackRiskLevel的结果。
     * @param AttackRiskDetailList 检测到疑似的攻击痕迹列表。
- 说明：未检测到攻击痕迹时，返回空数组。
- 此出参仅作为结果判断的参考，实际应用仍建议使用AttackRiskLevel的结果。
     */
    public void setAttackRiskDetailList(AttackRiskDetail [] AttackRiskDetailList) {
        this.AttackRiskDetailList = AttackRiskDetailList;
    }

    /**
     * Get 额外信息。 
     * @return ExtraInfo 额外信息。
     */
    public ExtraInfo getExtraInfo() {
        return this.ExtraInfo;
    }

    /**
     * Set 额外信息。
     * @param ExtraInfo 额外信息。
     */
    public void setExtraInfo(ExtraInfo ExtraInfo) {
        this.ExtraInfo = ExtraInfo;
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

    public DetectAIFakeFacesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetectAIFakeFacesResponse(DetectAIFakeFacesResponse source) {
        if (source.AttackRiskLevel != null) {
            this.AttackRiskLevel = new String(source.AttackRiskLevel);
        }
        if (source.AttackRiskDetailList != null) {
            this.AttackRiskDetailList = new AttackRiskDetail[source.AttackRiskDetailList.length];
            for (int i = 0; i < source.AttackRiskDetailList.length; i++) {
                this.AttackRiskDetailList[i] = new AttackRiskDetail(source.AttackRiskDetailList[i]);
            }
        }
        if (source.ExtraInfo != null) {
            this.ExtraInfo = new ExtraInfo(source.ExtraInfo);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AttackRiskLevel", this.AttackRiskLevel);
        this.setParamArrayObj(map, prefix + "AttackRiskDetailList.", this.AttackRiskDetailList);
        this.setParamObj(map, prefix + "ExtraInfo.", this.ExtraInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

