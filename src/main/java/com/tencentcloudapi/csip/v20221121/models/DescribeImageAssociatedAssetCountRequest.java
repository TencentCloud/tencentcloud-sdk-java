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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeImageAssociatedAssetCountRequest extends AbstractModel {

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>镜像id</p>
    */
    @SerializedName("Id")
    @Expose
    private Long [] Id;

    /**
    * <p>预览数据镜像Id</p>
    */
    @SerializedName("PreviewId")
    @Expose
    private Long [] PreviewId;

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>镜像id</p> 
     * @return Id <p>镜像id</p>
     */
    public Long [] getId() {
        return this.Id;
    }

    /**
     * Set <p>镜像id</p>
     * @param Id <p>镜像id</p>
     */
    public void setId(Long [] Id) {
        this.Id = Id;
    }

    /**
     * Get <p>预览数据镜像Id</p> 
     * @return PreviewId <p>预览数据镜像Id</p>
     */
    public Long [] getPreviewId() {
        return this.PreviewId;
    }

    /**
     * Set <p>预览数据镜像Id</p>
     * @param PreviewId <p>预览数据镜像Id</p>
     */
    public void setPreviewId(Long [] PreviewId) {
        this.PreviewId = PreviewId;
    }

    public DescribeImageAssociatedAssetCountRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeImageAssociatedAssetCountRequest(DescribeImageAssociatedAssetCountRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Id != null) {
            this.Id = new Long[source.Id.length];
            for (int i = 0; i < source.Id.length; i++) {
                this.Id[i] = new Long(source.Id[i]);
            }
        }
        if (source.PreviewId != null) {
            this.PreviewId = new Long[source.PreviewId.length];
            for (int i = 0; i < source.PreviewId.length; i++) {
                this.PreviewId[i] = new Long(source.PreviewId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArraySimple(map, prefix + "Id.", this.Id);
        this.setParamArraySimple(map, prefix + "PreviewId.", this.PreviewId);

    }
}

