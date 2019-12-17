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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyPersonSampleResponse extends AbstractModel{

    /**
    * 人物信息。
    */
    @SerializedName("Person")
    @Expose
    private AiSamplePerson Person;

    /**
    * 处理失败的人脸信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailFaceInfoSet")
    @Expose
    private AiSampleFailFaceInfo [] FailFaceInfoSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 人物信息。 
     * @return Person 人物信息。
     */
    public AiSamplePerson getPerson() {
        return this.Person;
    }

    /**
     * Set 人物信息。
     * @param Person 人物信息。
     */
    public void setPerson(AiSamplePerson Person) {
        this.Person = Person;
    }

    /**
     * Get 处理失败的人脸信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailFaceInfoSet 处理失败的人脸信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AiSampleFailFaceInfo [] getFailFaceInfoSet() {
        return this.FailFaceInfoSet;
    }

    /**
     * Set 处理失败的人脸信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailFaceInfoSet 处理失败的人脸信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailFaceInfoSet(AiSampleFailFaceInfo [] FailFaceInfoSet) {
        this.FailFaceInfoSet = FailFaceInfoSet;
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
        this.setParamObj(map, prefix + "Person.", this.Person);
        this.setParamArrayObj(map, prefix + "FailFaceInfoSet.", this.FailFaceInfoSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

