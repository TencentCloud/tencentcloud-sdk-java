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

public class CreateFacePictureResponse extends AbstractModel{

    /**
    * 人物ID
    */
    @SerializedName("PersonId")
    @Expose
    private Long PersonId;

    /**
    * 0.正常建档 1.重复身份 2.未检测到人脸 3.检测到多个人脸 4.人脸大小过小 5.人脸质量不达标 6.其他错误
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 图片url
    */
    @SerializedName("PictureUrl")
    @Expose
    private String PictureUrl;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 人物ID 
     * @return PersonId 人物ID
     */
    public Long getPersonId() {
        return this.PersonId;
    }

    /**
     * Set 人物ID
     * @param PersonId 人物ID
     */
    public void setPersonId(Long PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * Get 0.正常建档 1.重复身份 2.未检测到人脸 3.检测到多个人脸 4.人脸大小过小 5.人脸质量不达标 6.其他错误 
     * @return Status 0.正常建档 1.重复身份 2.未检测到人脸 3.检测到多个人脸 4.人脸大小过小 5.人脸质量不达标 6.其他错误
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 0.正常建档 1.重复身份 2.未检测到人脸 3.检测到多个人脸 4.人脸大小过小 5.人脸质量不达标 6.其他错误
     * @param Status 0.正常建档 1.重复身份 2.未检测到人脸 3.检测到多个人脸 4.人脸大小过小 5.人脸质量不达标 6.其他错误
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 图片url 
     * @return PictureUrl 图片url
     */
    public String getPictureUrl() {
        return this.PictureUrl;
    }

    /**
     * Set 图片url
     * @param PictureUrl 图片url
     */
    public void setPictureUrl(String PictureUrl) {
        this.PictureUrl = PictureUrl;
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
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "PictureUrl", this.PictureUrl);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

