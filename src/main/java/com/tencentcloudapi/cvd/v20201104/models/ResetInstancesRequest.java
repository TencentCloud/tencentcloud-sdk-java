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
package com.tencentcloudapi.cvd.v20201104.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResetInstancesRequest extends AbstractModel {

    /**
    * 需要重置的实例id列表
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 重置的目标镜像id
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * 重置实例的区域
    */
    @SerializedName("InstanceRegion")
    @Expose
    private String InstanceRegion;

    /**
    * 是否解绑机器原有绑定关系
    */
    @SerializedName("IsUnbind")
    @Expose
    private Boolean IsUnbind;

    /**
     * Get 需要重置的实例id列表 
     * @return InstanceIds 需要重置的实例id列表
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 需要重置的实例id列表
     * @param InstanceIds 需要重置的实例id列表
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 重置的目标镜像id 
     * @return ImageId 重置的目标镜像id
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set 重置的目标镜像id
     * @param ImageId 重置的目标镜像id
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get 重置实例的区域 
     * @return InstanceRegion 重置实例的区域
     */
    public String getInstanceRegion() {
        return this.InstanceRegion;
    }

    /**
     * Set 重置实例的区域
     * @param InstanceRegion 重置实例的区域
     */
    public void setInstanceRegion(String InstanceRegion) {
        this.InstanceRegion = InstanceRegion;
    }

    /**
     * Get 是否解绑机器原有绑定关系 
     * @return IsUnbind 是否解绑机器原有绑定关系
     */
    public Boolean getIsUnbind() {
        return this.IsUnbind;
    }

    /**
     * Set 是否解绑机器原有绑定关系
     * @param IsUnbind 是否解绑机器原有绑定关系
     */
    public void setIsUnbind(Boolean IsUnbind) {
        this.IsUnbind = IsUnbind;
    }

    public ResetInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResetInstancesRequest(ResetInstancesRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.InstanceRegion != null) {
            this.InstanceRegion = new String(source.InstanceRegion);
        }
        if (source.IsUnbind != null) {
            this.IsUnbind = new Boolean(source.IsUnbind);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "InstanceRegion", this.InstanceRegion);
        this.setParamSimple(map, prefix + "IsUnbind", this.IsUnbind);

    }
}

