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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeImageSimpleListResponse extends AbstractModel{

    /**
    * 镜像列表
    */
    @SerializedName("ImageList")
    @Expose
    private ImageSimpleInfo [] ImageList;

    /**
    * 镜像数
    */
    @SerializedName("ImageCnt")
    @Expose
    private Long ImageCnt;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 镜像列表 
     * @return ImageList 镜像列表
     */
    public ImageSimpleInfo [] getImageList() {
        return this.ImageList;
    }

    /**
     * Set 镜像列表
     * @param ImageList 镜像列表
     */
    public void setImageList(ImageSimpleInfo [] ImageList) {
        this.ImageList = ImageList;
    }

    /**
     * Get 镜像数 
     * @return ImageCnt 镜像数
     */
    public Long getImageCnt() {
        return this.ImageCnt;
    }

    /**
     * Set 镜像数
     * @param ImageCnt 镜像数
     */
    public void setImageCnt(Long ImageCnt) {
        this.ImageCnt = ImageCnt;
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

    public DescribeImageSimpleListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeImageSimpleListResponse(DescribeImageSimpleListResponse source) {
        if (source.ImageList != null) {
            this.ImageList = new ImageSimpleInfo[source.ImageList.length];
            for (int i = 0; i < source.ImageList.length; i++) {
                this.ImageList[i] = new ImageSimpleInfo(source.ImageList[i]);
            }
        }
        if (source.ImageCnt != null) {
            this.ImageCnt = new Long(source.ImageCnt);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ImageList.", this.ImageList);
        this.setParamSimple(map, prefix + "ImageCnt", this.ImageCnt);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

