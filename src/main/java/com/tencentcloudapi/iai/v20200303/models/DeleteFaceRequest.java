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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteFaceRequest extends AbstractModel{

    /**
    * 人员ID，取值为创建人员接口中的PersonId
    */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
    * 待删除的人脸ID列表，数组元素取值为增加人脸接口返回的FaceId
    */
    @SerializedName("FaceIds")
    @Expose
    private String [] FaceIds;

    /**
     * Get 人员ID，取值为创建人员接口中的PersonId 
     * @return PersonId 人员ID，取值为创建人员接口中的PersonId
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * Set 人员ID，取值为创建人员接口中的PersonId
     * @param PersonId 人员ID，取值为创建人员接口中的PersonId
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * Get 待删除的人脸ID列表，数组元素取值为增加人脸接口返回的FaceId 
     * @return FaceIds 待删除的人脸ID列表，数组元素取值为增加人脸接口返回的FaceId
     */
    public String [] getFaceIds() {
        return this.FaceIds;
    }

    /**
     * Set 待删除的人脸ID列表，数组元素取值为增加人脸接口返回的FaceId
     * @param FaceIds 待删除的人脸ID列表，数组元素取值为增加人脸接口返回的FaceId
     */
    public void setFaceIds(String [] FaceIds) {
        this.FaceIds = FaceIds;
    }

    public DeleteFaceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteFaceRequest(DeleteFaceRequest source) {
        if (source.PersonId != null) {
            this.PersonId = new String(source.PersonId);
        }
        if (source.FaceIds != null) {
            this.FaceIds = new String[source.FaceIds.length];
            for (int i = 0; i < source.FaceIds.length; i++) {
                this.FaceIds[i] = new String(source.FaceIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);
        this.setParamArraySimple(map, prefix + "FaceIds.", this.FaceIds);

    }
}

