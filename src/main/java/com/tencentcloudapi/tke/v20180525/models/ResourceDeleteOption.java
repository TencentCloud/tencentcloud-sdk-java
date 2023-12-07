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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceDeleteOption extends AbstractModel {

    /**
    * 资源类型，例如CBS、CLB、CVM
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 集群删除时CBS资源的删除模式：terminate（销毁），retain （保留）。其他资源默认为销毁。
    */
    @SerializedName("DeleteMode")
    @Expose
    private String DeleteMode;

    /**
    * 是否跳过开启删除保护的资源，默认false，设置为true时不清理开启了删除保护的资源，clb有终端节点的情况也属于开了删除保护。
    */
    @SerializedName("SkipDeletionProtection")
    @Expose
    private Boolean SkipDeletionProtection;

    /**
     * Get 资源类型，例如CBS、CLB、CVM 
     * @return ResourceType 资源类型，例如CBS、CLB、CVM
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 资源类型，例如CBS、CLB、CVM
     * @param ResourceType 资源类型，例如CBS、CLB、CVM
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 集群删除时CBS资源的删除模式：terminate（销毁），retain （保留）。其他资源默认为销毁。 
     * @return DeleteMode 集群删除时CBS资源的删除模式：terminate（销毁），retain （保留）。其他资源默认为销毁。
     */
    public String getDeleteMode() {
        return this.DeleteMode;
    }

    /**
     * Set 集群删除时CBS资源的删除模式：terminate（销毁），retain （保留）。其他资源默认为销毁。
     * @param DeleteMode 集群删除时CBS资源的删除模式：terminate（销毁），retain （保留）。其他资源默认为销毁。
     */
    public void setDeleteMode(String DeleteMode) {
        this.DeleteMode = DeleteMode;
    }

    /**
     * Get 是否跳过开启删除保护的资源，默认false，设置为true时不清理开启了删除保护的资源，clb有终端节点的情况也属于开了删除保护。 
     * @return SkipDeletionProtection 是否跳过开启删除保护的资源，默认false，设置为true时不清理开启了删除保护的资源，clb有终端节点的情况也属于开了删除保护。
     */
    public Boolean getSkipDeletionProtection() {
        return this.SkipDeletionProtection;
    }

    /**
     * Set 是否跳过开启删除保护的资源，默认false，设置为true时不清理开启了删除保护的资源，clb有终端节点的情况也属于开了删除保护。
     * @param SkipDeletionProtection 是否跳过开启删除保护的资源，默认false，设置为true时不清理开启了删除保护的资源，clb有终端节点的情况也属于开了删除保护。
     */
    public void setSkipDeletionProtection(Boolean SkipDeletionProtection) {
        this.SkipDeletionProtection = SkipDeletionProtection;
    }

    public ResourceDeleteOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceDeleteOption(ResourceDeleteOption source) {
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.DeleteMode != null) {
            this.DeleteMode = new String(source.DeleteMode);
        }
        if (source.SkipDeletionProtection != null) {
            this.SkipDeletionProtection = new Boolean(source.SkipDeletionProtection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "DeleteMode", this.DeleteMode);
        this.setParamSimple(map, prefix + "SkipDeletionProtection", this.SkipDeletionProtection);

    }
}

