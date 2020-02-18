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
package com.tencentcloudapi.youmall.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CameraPersonInfo extends AbstractModel{

    /**
    * 临时id，还未生成face id时返回
    */
    @SerializedName("TempId")
    @Expose
    private String TempId;

    /**
    * 人脸face id
    */
    @SerializedName("FaceId")
    @Expose
    private Long FaceId;

    /**
    * 确定当次返回的哪个id有效，1-FaceId，2-TempId
    */
    @SerializedName("IdType")
    @Expose
    private Long IdType;

    /**
    * 当次抓拍到的人脸图片base编码
    */
    @SerializedName("FacePic")
    @Expose
    private String FacePic;

    /**
    * 当次抓拍时间戳
    */
    @SerializedName("Time")
    @Expose
    private Long Time;

    /**
    * 当前的person基本信息，图片以FacePic为准，结构体内未填
    */
    @SerializedName("PersonInfo")
    @Expose
    private PersonInfo PersonInfo;

    /**
     * Get 临时id，还未生成face id时返回 
     * @return TempId 临时id，还未生成face id时返回
     */
    public String getTempId() {
        return this.TempId;
    }

    /**
     * Set 临时id，还未生成face id时返回
     * @param TempId 临时id，还未生成face id时返回
     */
    public void setTempId(String TempId) {
        this.TempId = TempId;
    }

    /**
     * Get 人脸face id 
     * @return FaceId 人脸face id
     */
    public Long getFaceId() {
        return this.FaceId;
    }

    /**
     * Set 人脸face id
     * @param FaceId 人脸face id
     */
    public void setFaceId(Long FaceId) {
        this.FaceId = FaceId;
    }

    /**
     * Get 确定当次返回的哪个id有效，1-FaceId，2-TempId 
     * @return IdType 确定当次返回的哪个id有效，1-FaceId，2-TempId
     */
    public Long getIdType() {
        return this.IdType;
    }

    /**
     * Set 确定当次返回的哪个id有效，1-FaceId，2-TempId
     * @param IdType 确定当次返回的哪个id有效，1-FaceId，2-TempId
     */
    public void setIdType(Long IdType) {
        this.IdType = IdType;
    }

    /**
     * Get 当次抓拍到的人脸图片base编码 
     * @return FacePic 当次抓拍到的人脸图片base编码
     */
    public String getFacePic() {
        return this.FacePic;
    }

    /**
     * Set 当次抓拍到的人脸图片base编码
     * @param FacePic 当次抓拍到的人脸图片base编码
     */
    public void setFacePic(String FacePic) {
        this.FacePic = FacePic;
    }

    /**
     * Get 当次抓拍时间戳 
     * @return Time 当次抓拍时间戳
     */
    public Long getTime() {
        return this.Time;
    }

    /**
     * Set 当次抓拍时间戳
     * @param Time 当次抓拍时间戳
     */
    public void setTime(Long Time) {
        this.Time = Time;
    }

    /**
     * Get 当前的person基本信息，图片以FacePic为准，结构体内未填 
     * @return PersonInfo 当前的person基本信息，图片以FacePic为准，结构体内未填
     */
    public PersonInfo getPersonInfo() {
        return this.PersonInfo;
    }

    /**
     * Set 当前的person基本信息，图片以FacePic为准，结构体内未填
     * @param PersonInfo 当前的person基本信息，图片以FacePic为准，结构体内未填
     */
    public void setPersonInfo(PersonInfo PersonInfo) {
        this.PersonInfo = PersonInfo;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TempId", this.TempId);
        this.setParamSimple(map, prefix + "FaceId", this.FaceId);
        this.setParamSimple(map, prefix + "IdType", this.IdType);
        this.setParamSimple(map, prefix + "FacePic", this.FacePic);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamObj(map, prefix + "PersonInfo.", this.PersonInfo);

    }
}

