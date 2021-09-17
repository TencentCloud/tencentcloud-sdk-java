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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteEKSContainerInstancesRequest extends AbstractModel{

    /**
    * 需要删除的EksCi的Id。 最大数量不超过20
    */
    @SerializedName("EksCiIds")
    @Expose
    private String [] EksCiIds;

    /**
    * 是否释放为EksCi自动创建的Eip
    */
    @SerializedName("ReleaseAutoCreatedEip")
    @Expose
    private Boolean ReleaseAutoCreatedEip;

    /**
     * Get 需要删除的EksCi的Id。 最大数量不超过20 
     * @return EksCiIds 需要删除的EksCi的Id。 最大数量不超过20
     */
    public String [] getEksCiIds() {
        return this.EksCiIds;
    }

    /**
     * Set 需要删除的EksCi的Id。 最大数量不超过20
     * @param EksCiIds 需要删除的EksCi的Id。 最大数量不超过20
     */
    public void setEksCiIds(String [] EksCiIds) {
        this.EksCiIds = EksCiIds;
    }

    /**
     * Get 是否释放为EksCi自动创建的Eip 
     * @return ReleaseAutoCreatedEip 是否释放为EksCi自动创建的Eip
     */
    public Boolean getReleaseAutoCreatedEip() {
        return this.ReleaseAutoCreatedEip;
    }

    /**
     * Set 是否释放为EksCi自动创建的Eip
     * @param ReleaseAutoCreatedEip 是否释放为EksCi自动创建的Eip
     */
    public void setReleaseAutoCreatedEip(Boolean ReleaseAutoCreatedEip) {
        this.ReleaseAutoCreatedEip = ReleaseAutoCreatedEip;
    }

    public DeleteEKSContainerInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteEKSContainerInstancesRequest(DeleteEKSContainerInstancesRequest source) {
        if (source.EksCiIds != null) {
            this.EksCiIds = new String[source.EksCiIds.length];
            for (int i = 0; i < source.EksCiIds.length; i++) {
                this.EksCiIds[i] = new String(source.EksCiIds[i]);
            }
        }
        if (source.ReleaseAutoCreatedEip != null) {
            this.ReleaseAutoCreatedEip = new Boolean(source.ReleaseAutoCreatedEip);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "EksCiIds.", this.EksCiIds);
        this.setParamSimple(map, prefix + "ReleaseAutoCreatedEip", this.ReleaseAutoCreatedEip);

    }
}

