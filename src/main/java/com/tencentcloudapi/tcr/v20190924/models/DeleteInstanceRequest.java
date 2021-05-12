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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteInstanceRequest extends AbstractModel{

    /**
    * 实例id
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * 是否删除存储桶，默认为false
    */
    @SerializedName("DeleteBucket")
    @Expose
    private Boolean DeleteBucket;

    /**
     * Get 实例id 
     * @return RegistryId 实例id
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set 实例id
     * @param RegistryId 实例id
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get 是否删除存储桶，默认为false 
     * @return DeleteBucket 是否删除存储桶，默认为false
     */
    public Boolean getDeleteBucket() {
        return this.DeleteBucket;
    }

    /**
     * Set 是否删除存储桶，默认为false
     * @param DeleteBucket 是否删除存储桶，默认为false
     */
    public void setDeleteBucket(Boolean DeleteBucket) {
        this.DeleteBucket = DeleteBucket;
    }

    public DeleteInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteInstanceRequest(DeleteInstanceRequest source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.DeleteBucket != null) {
            this.DeleteBucket = new Boolean(source.DeleteBucket);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "DeleteBucket", this.DeleteBucket);

    }
}

