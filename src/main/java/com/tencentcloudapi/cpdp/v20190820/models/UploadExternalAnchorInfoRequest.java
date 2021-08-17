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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UploadExternalAnchorInfoRequest extends AbstractModel{

    /**
    * 主播Id
    */
    @SerializedName("AnchorId")
    @Expose
    private String AnchorId;

    /**
    * 身份证正面图片下载链接
    */
    @SerializedName("IdCardFront")
    @Expose
    private String IdCardFront;

    /**
    * 身份证反面图片下载链接
    */
    @SerializedName("IdCardReverse")
    @Expose
    private String IdCardReverse;

    /**
     * Get 主播Id 
     * @return AnchorId 主播Id
     */
    public String getAnchorId() {
        return this.AnchorId;
    }

    /**
     * Set 主播Id
     * @param AnchorId 主播Id
     */
    public void setAnchorId(String AnchorId) {
        this.AnchorId = AnchorId;
    }

    /**
     * Get 身份证正面图片下载链接 
     * @return IdCardFront 身份证正面图片下载链接
     */
    public String getIdCardFront() {
        return this.IdCardFront;
    }

    /**
     * Set 身份证正面图片下载链接
     * @param IdCardFront 身份证正面图片下载链接
     */
    public void setIdCardFront(String IdCardFront) {
        this.IdCardFront = IdCardFront;
    }

    /**
     * Get 身份证反面图片下载链接 
     * @return IdCardReverse 身份证反面图片下载链接
     */
    public String getIdCardReverse() {
        return this.IdCardReverse;
    }

    /**
     * Set 身份证反面图片下载链接
     * @param IdCardReverse 身份证反面图片下载链接
     */
    public void setIdCardReverse(String IdCardReverse) {
        this.IdCardReverse = IdCardReverse;
    }

    public UploadExternalAnchorInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UploadExternalAnchorInfoRequest(UploadExternalAnchorInfoRequest source) {
        if (source.AnchorId != null) {
            this.AnchorId = new String(source.AnchorId);
        }
        if (source.IdCardFront != null) {
            this.IdCardFront = new String(source.IdCardFront);
        }
        if (source.IdCardReverse != null) {
            this.IdCardReverse = new String(source.IdCardReverse);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AnchorId", this.AnchorId);
        this.setParamSimple(map, prefix + "IdCardFront", this.IdCardFront);
        this.setParamSimple(map, prefix + "IdCardReverse", this.IdCardReverse);

    }
}

