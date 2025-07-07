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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyClusterImageRequest extends AbstractModel {

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 指定有效的镜像ID，格式形如img-e55paxnt。可通过登录控制台查询，也可调用接口 [DescribeImages](https://cloud.tencent.com/document/api/213/15715)，取返回信息中的ImageId字段。
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 指定有效的镜像ID，格式形如img-e55paxnt。可通过登录控制台查询，也可调用接口 [DescribeImages](https://cloud.tencent.com/document/api/213/15715)，取返回信息中的ImageId字段。 
     * @return ImageId 指定有效的镜像ID，格式形如img-e55paxnt。可通过登录控制台查询，也可调用接口 [DescribeImages](https://cloud.tencent.com/document/api/213/15715)，取返回信息中的ImageId字段。
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set 指定有效的镜像ID，格式形如img-e55paxnt。可通过登录控制台查询，也可调用接口 [DescribeImages](https://cloud.tencent.com/document/api/213/15715)，取返回信息中的ImageId字段。
     * @param ImageId 指定有效的镜像ID，格式形如img-e55paxnt。可通过登录控制台查询，也可调用接口 [DescribeImages](https://cloud.tencent.com/document/api/213/15715)，取返回信息中的ImageId字段。
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    public ModifyClusterImageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyClusterImageRequest(ModifyClusterImageRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);

    }
}

