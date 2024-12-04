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
package com.tencentcloudapi.vcube.v20220410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTrialFeatureResponse extends AbstractModel {

    /**
    * 功能列表
    */
    @SerializedName("FeatureList")
    @Expose
    private Feature [] FeatureList;

    /**
    * 可以开通的优图测试功能
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("XMagicTrial")
    @Expose
    private XMagicTrial XMagicTrial;

    /**
    * 可以开通的优图测试功能列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("XMagicTrialList")
    @Expose
    private XMagicTrial [] XMagicTrialList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 功能列表 
     * @return FeatureList 功能列表
     */
    public Feature [] getFeatureList() {
        return this.FeatureList;
    }

    /**
     * Set 功能列表
     * @param FeatureList 功能列表
     */
    public void setFeatureList(Feature [] FeatureList) {
        this.FeatureList = FeatureList;
    }

    /**
     * Get 可以开通的优图测试功能
注意：此字段可能返回 null，表示取不到有效值。 
     * @return XMagicTrial 可以开通的优图测试功能
注意：此字段可能返回 null，表示取不到有效值。
     */
    public XMagicTrial getXMagicTrial() {
        return this.XMagicTrial;
    }

    /**
     * Set 可以开通的优图测试功能
注意：此字段可能返回 null，表示取不到有效值。
     * @param XMagicTrial 可以开通的优图测试功能
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setXMagicTrial(XMagicTrial XMagicTrial) {
        this.XMagicTrial = XMagicTrial;
    }

    /**
     * Get 可以开通的优图测试功能列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return XMagicTrialList 可以开通的优图测试功能列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public XMagicTrial [] getXMagicTrialList() {
        return this.XMagicTrialList;
    }

    /**
     * Set 可以开通的优图测试功能列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param XMagicTrialList 可以开通的优图测试功能列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setXMagicTrialList(XMagicTrial [] XMagicTrialList) {
        this.XMagicTrialList = XMagicTrialList;
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

    public DescribeTrialFeatureResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTrialFeatureResponse(DescribeTrialFeatureResponse source) {
        if (source.FeatureList != null) {
            this.FeatureList = new Feature[source.FeatureList.length];
            for (int i = 0; i < source.FeatureList.length; i++) {
                this.FeatureList[i] = new Feature(source.FeatureList[i]);
            }
        }
        if (source.XMagicTrial != null) {
            this.XMagicTrial = new XMagicTrial(source.XMagicTrial);
        }
        if (source.XMagicTrialList != null) {
            this.XMagicTrialList = new XMagicTrial[source.XMagicTrialList.length];
            for (int i = 0; i < source.XMagicTrialList.length; i++) {
                this.XMagicTrialList[i] = new XMagicTrial(source.XMagicTrialList[i]);
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
        this.setParamArrayObj(map, prefix + "FeatureList.", this.FeatureList);
        this.setParamObj(map, prefix + "XMagicTrial.", this.XMagicTrial);
        this.setParamArrayObj(map, prefix + "XMagicTrialList.", this.XMagicTrialList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

