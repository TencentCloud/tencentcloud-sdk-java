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
package com.tencentcloudapi.facefusion.v20181201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMaterialListResponse extends AbstractModel{

    /**
    * 素材列表数据
    */
    @SerializedName("MaterialInfos")
    @Expose
    private PublicMaterialInfos [] MaterialInfos;

    /**
    * 素材条数
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 素材列表数据 
     * @return MaterialInfos 素材列表数据
     */
    public PublicMaterialInfos [] getMaterialInfos() {
        return this.MaterialInfos;
    }

    /**
     * Set 素材列表数据
     * @param MaterialInfos 素材列表数据
     */
    public void setMaterialInfos(PublicMaterialInfos [] MaterialInfos) {
        this.MaterialInfos = MaterialInfos;
    }

    /**
     * Get 素材条数 
     * @return Count 素材条数
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 素材条数
     * @param Count 素材条数
     */
    public void setCount(Long Count) {
        this.Count = Count;
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

    public DescribeMaterialListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMaterialListResponse(DescribeMaterialListResponse source) {
        if (source.MaterialInfos != null) {
            this.MaterialInfos = new PublicMaterialInfos[source.MaterialInfos.length];
            for (int i = 0; i < source.MaterialInfos.length; i++) {
                this.MaterialInfos[i] = new PublicMaterialInfos(source.MaterialInfos[i]);
            }
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "MaterialInfos.", this.MaterialInfos);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

