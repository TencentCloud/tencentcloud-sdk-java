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

public class DescribePictureRequest extends AbstractModel{

    /**
    * 应用ID
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 图片ID，不填时返回该应用下所有图片
    */
    @SerializedName("PictureId")
    @Expose
    private Long PictureId;

    /**
    * 每页数量，不填时默认为10
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 页码，不填时默认为1
    */
    @SerializedName("PageNo")
    @Expose
    private Long PageNo;

    /**
     * Get 应用ID 
     * @return SdkAppId 应用ID
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 应用ID
     * @param SdkAppId 应用ID
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 图片ID，不填时返回该应用下所有图片 
     * @return PictureId 图片ID，不填时返回该应用下所有图片
     */
    public Long getPictureId() {
        return this.PictureId;
    }

    /**
     * Set 图片ID，不填时返回该应用下所有图片
     * @param PictureId 图片ID，不填时返回该应用下所有图片
     */
    public void setPictureId(Long PictureId) {
        this.PictureId = PictureId;
    }

    /**
     * Get 每页数量，不填时默认为10 
     * @return PageSize 每页数量，不填时默认为10
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页数量，不填时默认为10
     * @param PageSize 每页数量，不填时默认为10
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 页码，不填时默认为1 
     * @return PageNo 页码，不填时默认为1
     */
    public Long getPageNo() {
        return this.PageNo;
    }

    /**
     * Set 页码，不填时默认为1
     * @param PageNo 页码，不填时默认为1
     */
    public void setPageNo(Long PageNo) {
        this.PageNo = PageNo;
    }

    public DescribePictureRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePictureRequest(DescribePictureRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.PictureId != null) {
            this.PictureId = new Long(source.PictureId);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNo != null) {
            this.PageNo = new Long(source.PageNo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "PictureId", this.PictureId);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNo", this.PageNo);

    }
}

