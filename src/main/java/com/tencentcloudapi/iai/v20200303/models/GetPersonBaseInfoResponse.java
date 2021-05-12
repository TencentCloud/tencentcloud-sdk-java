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

public class GetPersonBaseInfoResponse extends AbstractModel{

    /**
    * 人员名称
    */
    @SerializedName("PersonName")
    @Expose
    private String PersonName;

    /**
    * 人员性别，0代表未填写，1代表男性，2代表女性
    */
    @SerializedName("Gender")
    @Expose
    private Long Gender;

    /**
    * 包含的人脸 ID 列表
    */
    @SerializedName("FaceIds")
    @Expose
    private String [] FaceIds;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 人员名称 
     * @return PersonName 人员名称
     */
    public String getPersonName() {
        return this.PersonName;
    }

    /**
     * Set 人员名称
     * @param PersonName 人员名称
     */
    public void setPersonName(String PersonName) {
        this.PersonName = PersonName;
    }

    /**
     * Get 人员性别，0代表未填写，1代表男性，2代表女性 
     * @return Gender 人员性别，0代表未填写，1代表男性，2代表女性
     */
    public Long getGender() {
        return this.Gender;
    }

    /**
     * Set 人员性别，0代表未填写，1代表男性，2代表女性
     * @param Gender 人员性别，0代表未填写，1代表男性，2代表女性
     */
    public void setGender(Long Gender) {
        this.Gender = Gender;
    }

    /**
     * Get 包含的人脸 ID 列表 
     * @return FaceIds 包含的人脸 ID 列表
     */
    public String [] getFaceIds() {
        return this.FaceIds;
    }

    /**
     * Set 包含的人脸 ID 列表
     * @param FaceIds 包含的人脸 ID 列表
     */
    public void setFaceIds(String [] FaceIds) {
        this.FaceIds = FaceIds;
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

    public GetPersonBaseInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetPersonBaseInfoResponse(GetPersonBaseInfoResponse source) {
        if (source.PersonName != null) {
            this.PersonName = new String(source.PersonName);
        }
        if (source.Gender != null) {
            this.Gender = new Long(source.Gender);
        }
        if (source.FaceIds != null) {
            this.FaceIds = new String[source.FaceIds.length];
            for (int i = 0; i < source.FaceIds.length; i++) {
                this.FaceIds[i] = new String(source.FaceIds[i]);
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
        this.setParamSimple(map, prefix + "PersonName", this.PersonName);
        this.setParamSimple(map, prefix + "Gender", this.Gender);
        this.setParamArraySimple(map, prefix + "FaceIds.", this.FaceIds);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

