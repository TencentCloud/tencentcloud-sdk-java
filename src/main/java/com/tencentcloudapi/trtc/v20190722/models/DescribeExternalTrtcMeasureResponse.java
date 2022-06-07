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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeExternalTrtcMeasureResponse extends AbstractModel{

    /**
    * 每个SdkAppId的时长使用信息
    */
    @SerializedName("SdkAppIdTrtrTimeUsages")
    @Expose
    private SdkAppIdNewTrtcTimeUsage [] SdkAppIdTrtrTimeUsages;

    /**
    * 主播的用量统计方式。取值"InRoomTime":房间时长,"SubscribeTime":"订阅时长","Bandwidth":带宽
    */
    @SerializedName("AnchorUsageMode")
    @Expose
    private String AnchorUsageMode;

    /**
    * 观众的用量统计方式。取值"InRoomTime":在房间时长,"SubscribeTime":"订阅时长","Bandwidth":带宽,"MergeWithAnchor":"不区分麦上麦下"
    */
    @SerializedName("AudienceUsageMode")
    @Expose
    private String AudienceUsageMode;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 每个SdkAppId的时长使用信息 
     * @return SdkAppIdTrtrTimeUsages 每个SdkAppId的时长使用信息
     */
    public SdkAppIdNewTrtcTimeUsage [] getSdkAppIdTrtrTimeUsages() {
        return this.SdkAppIdTrtrTimeUsages;
    }

    /**
     * Set 每个SdkAppId的时长使用信息
     * @param SdkAppIdTrtrTimeUsages 每个SdkAppId的时长使用信息
     */
    public void setSdkAppIdTrtrTimeUsages(SdkAppIdNewTrtcTimeUsage [] SdkAppIdTrtrTimeUsages) {
        this.SdkAppIdTrtrTimeUsages = SdkAppIdTrtrTimeUsages;
    }

    /**
     * Get 主播的用量统计方式。取值"InRoomTime":房间时长,"SubscribeTime":"订阅时长","Bandwidth":带宽 
     * @return AnchorUsageMode 主播的用量统计方式。取值"InRoomTime":房间时长,"SubscribeTime":"订阅时长","Bandwidth":带宽
     */
    public String getAnchorUsageMode() {
        return this.AnchorUsageMode;
    }

    /**
     * Set 主播的用量统计方式。取值"InRoomTime":房间时长,"SubscribeTime":"订阅时长","Bandwidth":带宽
     * @param AnchorUsageMode 主播的用量统计方式。取值"InRoomTime":房间时长,"SubscribeTime":"订阅时长","Bandwidth":带宽
     */
    public void setAnchorUsageMode(String AnchorUsageMode) {
        this.AnchorUsageMode = AnchorUsageMode;
    }

    /**
     * Get 观众的用量统计方式。取值"InRoomTime":在房间时长,"SubscribeTime":"订阅时长","Bandwidth":带宽,"MergeWithAnchor":"不区分麦上麦下" 
     * @return AudienceUsageMode 观众的用量统计方式。取值"InRoomTime":在房间时长,"SubscribeTime":"订阅时长","Bandwidth":带宽,"MergeWithAnchor":"不区分麦上麦下"
     */
    public String getAudienceUsageMode() {
        return this.AudienceUsageMode;
    }

    /**
     * Set 观众的用量统计方式。取值"InRoomTime":在房间时长,"SubscribeTime":"订阅时长","Bandwidth":带宽,"MergeWithAnchor":"不区分麦上麦下"
     * @param AudienceUsageMode 观众的用量统计方式。取值"InRoomTime":在房间时长,"SubscribeTime":"订阅时长","Bandwidth":带宽,"MergeWithAnchor":"不区分麦上麦下"
     */
    public void setAudienceUsageMode(String AudienceUsageMode) {
        this.AudienceUsageMode = AudienceUsageMode;
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

    public DescribeExternalTrtcMeasureResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeExternalTrtcMeasureResponse(DescribeExternalTrtcMeasureResponse source) {
        if (source.SdkAppIdTrtrTimeUsages != null) {
            this.SdkAppIdTrtrTimeUsages = new SdkAppIdNewTrtcTimeUsage[source.SdkAppIdTrtrTimeUsages.length];
            for (int i = 0; i < source.SdkAppIdTrtrTimeUsages.length; i++) {
                this.SdkAppIdTrtrTimeUsages[i] = new SdkAppIdNewTrtcTimeUsage(source.SdkAppIdTrtrTimeUsages[i]);
            }
        }
        if (source.AnchorUsageMode != null) {
            this.AnchorUsageMode = new String(source.AnchorUsageMode);
        }
        if (source.AudienceUsageMode != null) {
            this.AudienceUsageMode = new String(source.AudienceUsageMode);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SdkAppIdTrtrTimeUsages.", this.SdkAppIdTrtrTimeUsages);
        this.setParamSimple(map, prefix + "AnchorUsageMode", this.AnchorUsageMode);
        this.setParamSimple(map, prefix + "AudienceUsageMode", this.AudienceUsageMode);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

