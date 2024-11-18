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
package com.tencentcloudapi.iai.v20200303.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetPersonGroupInfoResponse extends AbstractModel {

    /**
    * 包含此人员的人员库及描述字段内容列表。
    */
    @SerializedName("PersonGroupInfos")
    @Expose
    private PersonGroupInfo [] PersonGroupInfos;

    /**
    * 人员库总数量。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupNum")
    @Expose
    private Long GroupNum;

    /**
    * 人脸识别服务所用的算法模型版本。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FaceModelVersion")
    @Expose
    private String FaceModelVersion;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 包含此人员的人员库及描述字段内容列表。 
     * @return PersonGroupInfos 包含此人员的人员库及描述字段内容列表。
     */
    public PersonGroupInfo [] getPersonGroupInfos() {
        return this.PersonGroupInfos;
    }

    /**
     * Set 包含此人员的人员库及描述字段内容列表。
     * @param PersonGroupInfos 包含此人员的人员库及描述字段内容列表。
     */
    public void setPersonGroupInfos(PersonGroupInfo [] PersonGroupInfos) {
        this.PersonGroupInfos = PersonGroupInfos;
    }

    /**
     * Get 人员库总数量。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupNum 人员库总数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGroupNum() {
        return this.GroupNum;
    }

    /**
     * Set 人员库总数量。
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupNum 人员库总数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupNum(Long GroupNum) {
        this.GroupNum = GroupNum;
    }

    /**
     * Get 人脸识别服务所用的算法模型版本。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FaceModelVersion 人脸识别服务所用的算法模型版本。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFaceModelVersion() {
        return this.FaceModelVersion;
    }

    /**
     * Set 人脸识别服务所用的算法模型版本。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FaceModelVersion 人脸识别服务所用的算法模型版本。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFaceModelVersion(String FaceModelVersion) {
        this.FaceModelVersion = FaceModelVersion;
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

    public GetPersonGroupInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetPersonGroupInfoResponse(GetPersonGroupInfoResponse source) {
        if (source.PersonGroupInfos != null) {
            this.PersonGroupInfos = new PersonGroupInfo[source.PersonGroupInfos.length];
            for (int i = 0; i < source.PersonGroupInfos.length; i++) {
                this.PersonGroupInfos[i] = new PersonGroupInfo(source.PersonGroupInfos[i]);
            }
        }
        if (source.GroupNum != null) {
            this.GroupNum = new Long(source.GroupNum);
        }
        if (source.FaceModelVersion != null) {
            this.FaceModelVersion = new String(source.FaceModelVersion);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "PersonGroupInfos.", this.PersonGroupInfos);
        this.setParamSimple(map, prefix + "GroupNum", this.GroupNum);
        this.setParamSimple(map, prefix + "FaceModelVersion", this.FaceModelVersion);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

