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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HandleMediaCastProjectResponse extends AbstractModel{

    /**
    * 播放信息，Operation 为 DescribePlayInfo 时返回。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PlayInfo")
    @Expose
    private MediaCastPlayInfo PlayInfo;

    /**
    * 输入源信息， Operation 为 AddSource 时返回添加成功的输入源信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceInfoSet")
    @Expose
    private MediaCastSourceInfo [] SourceInfoSet;

    /**
    * 输出源信息， Operation 为 AddDestination 时返回添加成功的输出源信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DestinationInfoSet")
    @Expose
    private MediaCastDestinationInfo [] DestinationInfoSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 播放信息，Operation 为 DescribePlayInfo 时返回。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PlayInfo 播放信息，Operation 为 DescribePlayInfo 时返回。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaCastPlayInfo getPlayInfo() {
        return this.PlayInfo;
    }

    /**
     * Set 播放信息，Operation 为 DescribePlayInfo 时返回。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PlayInfo 播放信息，Operation 为 DescribePlayInfo 时返回。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPlayInfo(MediaCastPlayInfo PlayInfo) {
        this.PlayInfo = PlayInfo;
    }

    /**
     * Get 输入源信息， Operation 为 AddSource 时返回添加成功的输入源信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceInfoSet 输入源信息， Operation 为 AddSource 时返回添加成功的输入源信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaCastSourceInfo [] getSourceInfoSet() {
        return this.SourceInfoSet;
    }

    /**
     * Set 输入源信息， Operation 为 AddSource 时返回添加成功的输入源信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceInfoSet 输入源信息， Operation 为 AddSource 时返回添加成功的输入源信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceInfoSet(MediaCastSourceInfo [] SourceInfoSet) {
        this.SourceInfoSet = SourceInfoSet;
    }

    /**
     * Get 输出源信息， Operation 为 AddDestination 时返回添加成功的输出源信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DestinationInfoSet 输出源信息， Operation 为 AddDestination 时返回添加成功的输出源信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaCastDestinationInfo [] getDestinationInfoSet() {
        return this.DestinationInfoSet;
    }

    /**
     * Set 输出源信息， Operation 为 AddDestination 时返回添加成功的输出源信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DestinationInfoSet 输出源信息， Operation 为 AddDestination 时返回添加成功的输出源信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDestinationInfoSet(MediaCastDestinationInfo [] DestinationInfoSet) {
        this.DestinationInfoSet = DestinationInfoSet;
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

    public HandleMediaCastProjectResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HandleMediaCastProjectResponse(HandleMediaCastProjectResponse source) {
        if (source.PlayInfo != null) {
            this.PlayInfo = new MediaCastPlayInfo(source.PlayInfo);
        }
        if (source.SourceInfoSet != null) {
            this.SourceInfoSet = new MediaCastSourceInfo[source.SourceInfoSet.length];
            for (int i = 0; i < source.SourceInfoSet.length; i++) {
                this.SourceInfoSet[i] = new MediaCastSourceInfo(source.SourceInfoSet[i]);
            }
        }
        if (source.DestinationInfoSet != null) {
            this.DestinationInfoSet = new MediaCastDestinationInfo[source.DestinationInfoSet.length];
            for (int i = 0; i < source.DestinationInfoSet.length; i++) {
                this.DestinationInfoSet[i] = new MediaCastDestinationInfo(source.DestinationInfoSet[i]);
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
        this.setParamObj(map, prefix + "PlayInfo.", this.PlayInfo);
        this.setParamArrayObj(map, prefix + "SourceInfoSet.", this.SourceInfoSet);
        this.setParamArrayObj(map, prefix + "DestinationInfoSet.", this.DestinationInfoSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

