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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AigcFaceInfo extends AbstractModel {

    /**
    * 主体 ID。需自行记录下返回的主体 ID。
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 人脸信息列表。
    */
    @SerializedName("FaceInfoList")
    @Expose
    private AigcFaceIdentityInfo [] FaceInfoList;

    /**
     * Get 主体 ID。需自行记录下返回的主体 ID。 
     * @return SessionId 主体 ID。需自行记录下返回的主体 ID。
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 主体 ID。需自行记录下返回的主体 ID。
     * @param SessionId 主体 ID。需自行记录下返回的主体 ID。
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get 人脸信息列表。 
     * @return FaceInfoList 人脸信息列表。
     */
    public AigcFaceIdentityInfo [] getFaceInfoList() {
        return this.FaceInfoList;
    }

    /**
     * Set 人脸信息列表。
     * @param FaceInfoList 人脸信息列表。
     */
    public void setFaceInfoList(AigcFaceIdentityInfo [] FaceInfoList) {
        this.FaceInfoList = FaceInfoList;
    }

    public AigcFaceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcFaceInfo(AigcFaceInfo source) {
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.FaceInfoList != null) {
            this.FaceInfoList = new AigcFaceIdentityInfo[source.FaceInfoList.length];
            for (int i = 0; i < source.FaceInfoList.length; i++) {
                this.FaceInfoList[i] = new AigcFaceIdentityInfo(source.FaceInfoList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamArrayObj(map, prefix + "FaceInfoList.", this.FaceInfoList);

    }
}

